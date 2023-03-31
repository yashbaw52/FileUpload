package seleniumPkg;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FileUploadPopup {

	public static void main(String[] args) {
		WebDriver driver;

		System.setProperty("webdriver.chrome.driver",
				"C://Users//Yash//Downloads//chromedriver_win32//chromedriver.exe");

		driver = new ChromeDriver();

		driver.navigate().to("https://demoqa.com/upload-download");
		
		
		WebElement btn = driver.findElement(By.id("uploadFile"));
		btn.sendKeys("C:/Users/Yash/Desktop/Testing/Manual/FormulaBooklet.pdf");

	}

}
