package copy;

import java.io.File;
import java.io.IOException;
import java.nio.file.*;

import javax.print.attribute.standard.Destination;
public class CopyingFile {
	
	public static void main(String[] args) throws IOException {
		
		// TODO Auto-generated method stub
		File sourceFile=new File("D:/Sourcefile.txt");
//we are creating an object of source file where we create a file and its path 
		//to know where the file is saved
//creating a path  variable name as from and getting the the source file 
		File destinationFile=new File("assignment.txt");
		//we are creating an object of destination file where we create a file and its path 
				//to know where the file is saved
//creating  another path of declaring a variable name as to and passing the destination file where as the source file content will be copied to the destination file
		Files.copy(sourceFile.toPath(),destinationFile.toPath());
//creating the the Files.copy()method to copy the file using this copy method and replacing the existing file 
		

		System.out.println("success");
		//if the file is copied then it will print success
	}

}