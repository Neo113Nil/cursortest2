package ru.CryptoPro.JCP.tools.CPVerify;

import defpackage.oyr;
import defpackage.w511;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.io.PrintStream;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import ru.CryptoPro.JCP.Digest.GostDigest2012_256;
import ru.CryptoPro.JCP.tools.HexString;
import ru.CryptoPro.JCSP.KeyStore.CSPStore;

/* loaded from: classes4.dex */
public class CPVerifyUtility {
    public static final String HELP = "Usage: -make [-exclude_file ext1,ext2,ext3...] [-exclude_dir name1,name2,name3...] [-level N] <input_file|directory> <output_file>\n-exclude_file - option for excluding file(s) with extension EXT, separator is ','\n-exclude_dir  - option for excluding folder(s) which name contains a NAME, separator is ','\n-level - maximum level of subfolder hierarchy accepted for hash, default is 999";
    public static final GostDigest2012_256 a = new GostDigest2012_256();
    public static final ArrayList b = new ArrayList();
    public static final ArrayList c = new ArrayList();
    public static final ArrayList d = new ArrayList();

    public static class FileHashEntry {
        public final String a;
        public final String b;

        public FileHashEntry(String str, String str2) {
            this.a = str;
            this.b = str2;
        }
    }

    public static void a(File file, int i, int i2) {
        FileInputStream fileInputStream;
        GostDigest2012_256 gostDigest2012_256;
        String name;
        int lastIndexOf;
        if (i > i2) {
            System.out.getClass();
            return;
        }
        if (!file.isFile()) {
            ArrayList arrayList = d;
            if (!arrayList.isEmpty()) {
                String name2 = file.getName();
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    if (name2.contains((String) it.next())) {
                        PrintStream printStream = System.out;
                        file.getAbsolutePath();
                        printStream.getClass();
                        return;
                    }
                }
            }
            File[] listFiles = file.listFiles();
            if (listFiles == null || listFiles.length <= 0) {
                return;
            }
            for (File file2 : listFiles) {
                a(file2, i + 1, i2);
            }
            return;
        }
        ArrayList arrayList2 = c;
        if (!arrayList2.isEmpty() && (lastIndexOf = (name = file.getName()).lastIndexOf(46)) >= 0 && arrayList2.contains(name.substring(lastIndexOf + 1))) {
            PrintStream printStream2 = System.out;
            file.getAbsolutePath();
            printStream2.getClass();
            return;
        }
        PrintStream printStream3 = System.out;
        file.getAbsolutePath();
        printStream3.getClass();
        FileInputStream fileInputStream2 = null;
        try {
            fileInputStream = new FileInputStream(file);
        } catch (Throwable th) {
            th = th;
        }
        try {
            byte[] bArr = new byte[104857600];
            while (true) {
                int read = fileInputStream.read(bArr, 0, 104857600);
                gostDigest2012_256 = a;
                if (read <= 0) {
                    break;
                } else {
                    gostDigest2012_256.update(bArr, 0, read);
                }
            }
            PrintStream printStream4 = System.out;
            file.getAbsolutePath();
            printStream4.getClass();
            try {
                fileInputStream.close();
            } catch (Exception unused) {
            }
            String hexNoSpaces = HexString.toHexNoSpaces(gostDigest2012_256.digest());
            System.out.getClass();
            b.add(new FileHashEntry(file.getAbsolutePath(), hexNoSpaces));
        } catch (Throwable th2) {
            th = th2;
            fileInputStream2 = fileInputStream;
            if (fileInputStream2 != null) {
                try {
                    fileInputStream2.close();
                } catch (Exception unused2) {
                }
            }
            throw th;
        }
    }

    public static String b(String str, String[] strArr) {
        int i;
        for (int i2 = 0; i2 < strArr.length; i2++) {
            if (strArr[i2].equalsIgnoreCase(str) && (i = i2 + 1) < strArr.length) {
                return strArr[i];
            }
        }
        return null;
    }

    public static void main(String[] strArr) throws Exception {
        boolean z;
        FileOutputStream fileOutputStream;
        OutputStreamWriter outputStreamWriter;
        String substring;
        if (strArr.length < 3) {
            System.out.getClass();
            System.exit(0);
        }
        int length = strArr.length;
        int i = 0;
        while (true) {
            if (i >= length) {
                z = false;
                break;
            } else {
                if (strArr[i].equalsIgnoreCase(Prompt.ACTION_MAKE_STR)) {
                    z = true;
                    break;
                }
                i++;
            }
        }
        String str = strArr[strArr.length - 2];
        String str2 = strArr[strArr.length - 1];
        String b2 = b("-level", strArr);
        String b3 = b("-exclude_file", strArr);
        String b4 = b("-exclude_dir", strArr);
        System.out.getClass();
        System.out.getClass();
        System.out.getClass();
        System.out.getClass();
        System.out.getClass();
        System.out.getClass();
        System.out.getClass();
        if (b3 != null) {
            String[] split = b3.split(",");
            if (split.length > 0) {
                c.addAll(Arrays.asList(split));
            }
        }
        if (b4 != null) {
            String[] split2 = b4.split(",");
            if (split2.length > 0) {
                d.addAll(Arrays.asList(split2));
            }
        }
        if (!z) {
            w511.s("Unknown action!");
            return;
        }
        File file = new File(str);
        if (!file.exists()) {
            throw new Exception(oyr.p("Path ", str, " doesn't exist!"));
        }
        int parseInt = b2 != null ? Integer.parseInt(b2) : 999;
        System.out.getClass();
        a(file, 0, parseInt);
        System.out.getClass();
        boolean isFile = file.isFile();
        BufferedWriter bufferedWriter = null;
        try {
            fileOutputStream = new FileOutputStream(str2 + ".xml");
            try {
                outputStreamWriter = new OutputStreamWriter(fileOutputStream, "UTF-8");
                try {
                    BufferedWriter bufferedWriter2 = new BufferedWriter(outputStreamWriter);
                    try {
                        bufferedWriter2.write("<?xml version=\"1.0\" encoding=\"utf-8\" standalone=\"no\"?>\n<CProIntegrity>\n\t<catalog name=\"[DiskHash]\">");
                        Iterator it = b.iterator();
                        while (it.hasNext()) {
                            FileHashEntry fileHashEntry = (FileHashEntry) it.next();
                            File file2 = new File(fileHashEntry.a);
                            if (isFile) {
                                substring = file2.getName();
                            } else {
                                String substring2 = str.substring(str.length() - 1);
                                String str3 = File.separator;
                                if (!substring2.equals(str3)) {
                                    str = str + str3;
                                }
                                substring = file2.getAbsolutePath().substring(str.length());
                            }
                            String str4 = '.' + File.separator + substring;
                            bufferedWriter2.write("\t\t<entry name=\"" + str4.replace(CSPStore.UNIQUE_SEPARATOR, '_').replace('/', '_') + "\">\n\t\t\t<Algid>00008021</Algid>\n\t\t\t<Path>" + str4 + "</Path>\n\t\t\t<Tag>" + fileHashEntry.b + "</Tag>\n\t\t</entry>\n");
                        }
                        bufferedWriter2.write("\t</catalog>\n</CProIntegrity>");
                        try {
                            bufferedWriter2.close();
                        } catch (IOException unused) {
                        }
                        try {
                            outputStreamWriter.close();
                        } catch (IOException unused2) {
                        }
                        try {
                            fileOutputStream.close();
                        } catch (IOException unused3) {
                        }
                        System.out.getClass();
                    } catch (Throwable th) {
                        th = th;
                        bufferedWriter = bufferedWriter2;
                        if (bufferedWriter != null) {
                            try {
                                bufferedWriter.close();
                            } catch (IOException unused4) {
                            }
                        }
                        if (outputStreamWriter != null) {
                            try {
                                outputStreamWriter.close();
                            } catch (IOException unused5) {
                            }
                        }
                        if (fileOutputStream == null) {
                            throw th;
                        }
                        try {
                            fileOutputStream.close();
                            throw th;
                        } catch (IOException unused6) {
                            throw th;
                        }
                    }
                } catch (Throwable th2) {
                    th = th2;
                }
            } catch (Throwable th3) {
                th = th3;
                outputStreamWriter = null;
            }
        } catch (Throwable th4) {
            th = th4;
            fileOutputStream = null;
            outputStreamWriter = null;
        }
    }
}
