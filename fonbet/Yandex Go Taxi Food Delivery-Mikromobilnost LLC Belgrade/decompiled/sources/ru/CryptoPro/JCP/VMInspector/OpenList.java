package ru.CryptoPro.JCP.VMInspector;

import defpackage.ny61;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Vector;

/* loaded from: classes4.dex */
public class OpenList {
    public static final char CHAR_QUOTE = '\"';
    public static final String DEBUG_FILE = "D:\\Job\\IBM\\IBM_Cert\\aix\\6_64\\trace.txt";
    public static final String E_FORMAT = "Error file format:";
    public static final String LIST_EXT = ".OpenList";
    public static final String STR_OPEN = "open";
    public static final String USAGE = "Usage: OpenList <File name>";
    public Vector list = new Vector(8);
    public final String path;

    public OpenList(String str) {
        this.path = str;
    }

    public static String extract(String str) throws IOException {
        int i;
        int indexOf;
        int indexOf2 = str.indexOf(34);
        if (indexOf2 != -1 && indexOf2 < str.length() - 1 && (indexOf = str.indexOf(34, (i = indexOf2 + 1))) != -1 && indexOf < str.length()) {
            return str.substring(i, indexOf);
        }
        ny61.v(E_FORMAT.concat(str));
        return null;
    }

    public static void log(Exception exc) {
        Inspector.print(exc);
    }

    public static void main(String[] strArr) {
        if (strArr == null || strArr.length == 0 || strArr.length > 1) {
            log(USAGE);
            return;
        }
        OpenList openList = new OpenList(strArr[0]);
        try {
            openList.proc();
        } catch (IOException e) {
            log("Eror reading file:" + strArr[0]);
            log(e);
        }
        try {
            openList.save();
        } catch (IOException e2) {
            log("Eror writing file:" + strArr[0] + LIST_EXT);
            log(e2);
        }
    }

    public void proc() throws IOException {
        FileReader fileReader;
        BufferedReader bufferedReader = null;
        try {
            fileReader = new FileReader(this.path);
            try {
                BufferedReader bufferedReader2 = new BufferedReader(fileReader);
                try {
                    proc(bufferedReader2);
                    bufferedReader2.close();
                    fileReader.close();
                } catch (Throwable th) {
                    th = th;
                    bufferedReader = bufferedReader2;
                    if (bufferedReader != null) {
                        bufferedReader.close();
                    }
                    if (fileReader != null) {
                        fileReader.close();
                    }
                    throw th;
                }
            } catch (Throwable th2) {
                th = th2;
            }
        } catch (Throwable th3) {
            th = th3;
            fileReader = null;
        }
    }

    public void save() throws IOException {
        FileWriter fileWriter = null;
        try {
            FileWriter fileWriter2 = new FileWriter(this.path + LIST_EXT);
            for (int i = 0; i < this.list.size(); i++) {
                try {
                    fileWriter2.write((String) this.list.elementAt(i));
                    fileWriter2.write("\n");
                } catch (Throwable th) {
                    th = th;
                    fileWriter = fileWriter2;
                    if (fileWriter != null) {
                        fileWriter.close();
                    }
                    throw th;
                }
            }
            fileWriter2.close();
        } catch (Throwable th2) {
            th = th2;
        }
    }

    public static void log(String str) {
        Inspector.print(str);
    }

    public void proc(BufferedReader bufferedReader) throws IOException {
        while (true) {
            String readLine = bufferedReader.readLine();
            if (readLine == null) {
                return;
            } else {
                proc(readLine);
            }
        }
    }

    public void proc(String str) throws IOException {
        if (str.indexOf(STR_OPEN) != -1) {
            String extract = extract(str);
            if (this.list.contains(extract)) {
                return;
            }
            this.list.add(extract);
        }
    }
}
