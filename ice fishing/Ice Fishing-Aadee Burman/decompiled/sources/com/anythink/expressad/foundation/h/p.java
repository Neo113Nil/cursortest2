package com.anythink.expressad.foundation.h;

import android.text.TextUtils;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileFilter;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStream;
import java.lang.reflect.InvocationTargetException;
import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Enumeration;
import java.util.Iterator;
import java.util.zip.ZipEntry;
import java.util.zip.ZipFile;

/* loaded from: classes.dex */
public final class p extends e {

    /* renamed from: a, reason: collision with root package name */
    public static final int f19667a = 1;

    /* renamed from: b, reason: collision with root package name */
    public static final int f19668b = 2;

    /* renamed from: c, reason: collision with root package name */
    public static final int f19669c = 3;

    /* renamed from: d, reason: collision with root package name */
    public static final int f19670d = 4;

    /* renamed from: e, reason: collision with root package name */
    public static final String f19671e = "/download/.at";

    /* renamed from: f, reason: collision with root package name */
    public static final String f19672f = "/atdownload";

    /* renamed from: g, reason: collision with root package name */
    public static final String f19673g = "template_config.json";

    /* renamed from: h, reason: collision with root package name */
    private static final String f19674h = "SameFileTool";

    public static class a {

        /* renamed from: a, reason: collision with root package name */
        public static final int f19675a = 448;

        /* renamed from: b, reason: collision with root package name */
        public static final int f19676b = 256;

        /* renamed from: c, reason: collision with root package name */
        public static final int f19677c = 128;

        /* renamed from: d, reason: collision with root package name */
        public static final int f19678d = 64;

        /* renamed from: e, reason: collision with root package name */
        public static final int f19679e = 56;

        /* renamed from: f, reason: collision with root package name */
        public static final int f19680f = 32;

        /* renamed from: g, reason: collision with root package name */
        public static final int f19681g = 16;

        /* renamed from: h, reason: collision with root package name */
        public static final int f19682h = 8;
        public static final int i = 7;

        /* renamed from: j, reason: collision with root package name */
        public static final int f19683j = 4;

        /* renamed from: k, reason: collision with root package name */
        public static final int f19684k = 2;

        /* renamed from: l, reason: collision with root package name */
        public static final int f19685l = 1;
    }

    private static double a(long j6, int i) {
        DecimalFormat decimalFormat = new DecimalFormat("#.00");
        if (i == 1) {
            return Double.valueOf(decimalFormat.format(j6)).doubleValue();
        }
        if (i == 2) {
            return Double.valueOf(decimalFormat.format(j6 / 1024.0d)).doubleValue();
        }
        if (i == 3) {
            return Double.valueOf(decimalFormat.format(j6 / 1048576.0d)).doubleValue();
        }
        if (i != 4) {
            return 0.0d;
        }
        return Double.valueOf(decimalFormat.format(j6 / 1.073741824E9d)).doubleValue();
    }

    private static double b(String str, int i) {
        long j6;
        File file = new File(str);
        try {
            j6 = file.isDirectory() ? d(file) : c(file);
        } catch (Exception e9) {
            e9.printStackTrace();
            j6 = 0;
        }
        DecimalFormat decimalFormat = new DecimalFormat("#.00");
        if (i == 1) {
            return Double.valueOf(decimalFormat.format(j6)).doubleValue();
        }
        if (i == 2) {
            return Double.valueOf(decimalFormat.format(j6 / 1024.0d)).doubleValue();
        }
        if (i == 3) {
            return Double.valueOf(decimalFormat.format(j6 / 1048576.0d)).doubleValue();
        }
        if (i != 4) {
            return 0.0d;
        }
        return Double.valueOf(decimalFormat.format(j6 / 1.073741824E9d)).doubleValue();
    }

    private static long c(File file) {
        long j6 = 0;
        FileInputStream fileInputStream = null;
        try {
        } catch (Exception e9) {
            e9.printStackTrace();
        }
        try {
            try {
                if (file.exists()) {
                    FileInputStream fileInputStream2 = new FileInputStream(file);
                    try {
                        j6 = fileInputStream2.available();
                        fileInputStream = fileInputStream2;
                    } catch (Exception e10) {
                        e = e10;
                        fileInputStream = fileInputStream2;
                        e.printStackTrace();
                        if (fileInputStream != null) {
                            fileInputStream.close();
                        }
                        return j6;
                    } catch (Throwable th) {
                        th = th;
                        fileInputStream = fileInputStream2;
                        if (fileInputStream != null) {
                            try {
                                fileInputStream.close();
                            } catch (Exception e11) {
                                e11.printStackTrace();
                            }
                        }
                        throw th;
                    }
                } else {
                    file.createNewFile();
                }
            } catch (Exception e12) {
                e = e12;
            }
            if (fileInputStream != null) {
                fileInputStream.close();
            }
            return j6;
        } catch (Throwable th2) {
            th = th2;
        }
    }

    private static long d(File file) {
        File[] listFiles = file.listFiles();
        long j6 = 0;
        if (listFiles != null) {
            for (int i = 0; i < listFiles.length; i++) {
                j6 += listFiles[i].isDirectory() ? d(listFiles[i]) : c(listFiles[i]);
            }
        }
        return j6;
    }

    private static String e(String str) {
        long j6;
        File file = new File(str);
        try {
            j6 = file.isDirectory() ? d(file) : c(file);
        } catch (Exception e9) {
            e9.printStackTrace();
            j6 = 0;
        }
        DecimalFormat decimalFormat = new DecimalFormat("#.00");
        if (j6 == 0) {
            return "0B";
        }
        if (j6 < 1024) {
            return decimalFormat.format(j6) + "B";
        }
        if (j6 < 1048576) {
            return decimalFormat.format(j6 / 1024.0d) + "KB";
        }
        if (j6 < 1073741824) {
            return decimalFormat.format(j6 / 1048576.0d) + "AT";
        }
        return decimalFormat.format(j6 / 1.073741824E9d) + "GB";
    }

    private static void f(String str) {
        try {
            ArrayList<File> e9 = e(new File(str));
            Collections.sort(e9, new Comparator<File>() { // from class: com.anythink.expressad.foundation.h.p.4
                private static int a(File file, File file2) {
                    long lastModified = file.lastModified() - file2.lastModified();
                    if (lastModified > 0) {
                        return 1;
                    }
                    return lastModified == 0 ? 0 : -1;
                }

                @Override // java.util.Comparator
                public final /* synthetic */ int compare(File file, File file2) {
                    long lastModified = file.lastModified() - file2.lastModified();
                    if (lastModified > 0) {
                        return 1;
                    }
                    return lastModified == 0 ? 0 : -1;
                }

                @Override // java.util.Comparator
                public final boolean equals(Object obj) {
                    return true;
                }
            });
            int size = (e9.size() - 1) / 2;
            for (int i = 0; i < size; i++) {
                File file = e9.get(i);
                if (file.exists() && file.isFile()) {
                    file.delete();
                }
            }
        } catch (Exception unused) {
        }
    }

    private static void g(String str) {
        try {
            File file = new File(str);
            if (file.exists() && file.isDirectory()) {
                for (File file2 : b(str)) {
                    if (file2.exists() && file2.isFile()) {
                        file2.delete();
                    }
                }
            }
        } catch (Exception e9) {
            e9.printStackTrace();
        }
    }

    public static String d(String str) {
        if (!TextUtils.isEmpty(str)) {
            return s.a(z.b(str.trim()));
        }
        return "";
    }

    /* JADX WARN: Code restructure failed: missing block: B:23:0x003f, code lost:
    
        if (r1 == null) goto L24;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static String a(File file) {
        StringBuffer stringBuffer;
        BufferedReader bufferedReader;
        BufferedReader bufferedReader2 = null;
        try {
            bufferedReader = new BufferedReader(new FileReader(file));
            try {
                try {
                    stringBuffer = new StringBuffer();
                } catch (IOException e9) {
                    e = e9;
                    stringBuffer = null;
                }
            } catch (Throwable th) {
                th = th;
                bufferedReader2 = bufferedReader;
                if (bufferedReader2 != null) {
                    try {
                        bufferedReader2.close();
                    } catch (IOException unused) {
                    }
                }
                throw th;
            }
        } catch (IOException e10) {
            e = e10;
            stringBuffer = null;
            bufferedReader = null;
        } catch (Throwable th2) {
            th = th2;
        }
        while (true) {
            try {
                String readLine = bufferedReader.readLine();
                if (readLine != null) {
                    stringBuffer.append(readLine + "\n");
                }
            } catch (IOException e11) {
                e = e11;
                e.printStackTrace();
            }
            try {
                break;
            } catch (IOException unused2) {
            }
        }
        bufferedReader.close();
        if (stringBuffer != null) {
            return stringBuffer.toString();
        }
        return null;
    }

    private static boolean d(String str, int i) {
        try {
            Class<?> cls = Class.forName("android.os.FileUtils");
            Class cls2 = Integer.TYPE;
            cls.getMethod("setPermissions", String.class, cls2, cls2, cls2).invoke(null, str, Integer.valueOf(i), -1, -1);
            return true;
        } catch (ClassNotFoundException | IllegalAccessException | IllegalArgumentException | NoSuchMethodException | InvocationTargetException unused) {
            return false;
        }
    }

    public static void c(String str) {
        try {
            if (TextUtils.isEmpty(str)) {
                return;
            }
            long currentTimeMillis = System.currentTimeMillis() - 1440000;
            File file = new File(str);
            if (file.exists() && file.isDirectory()) {
                long currentTimeMillis2 = System.currentTimeMillis();
                File[] listFiles = file.listFiles();
                if (listFiles != null) {
                    for (File file2 : listFiles) {
                        if (file2.lastModified() + currentTimeMillis < currentTimeMillis2) {
                            b(file2);
                            try {
                                File file3 = new File(str + ".zip");
                                if (file3.exists() && file3.isFile()) {
                                    b(file3);
                                }
                            } catch (Exception unused) {
                            }
                        }
                    }
                }
            }
        } catch (Exception unused2) {
        }
    }

    private static String b(long j6) {
        DecimalFormat decimalFormat = new DecimalFormat("#.00");
        if (j6 == 0) {
            return "0B";
        }
        if (j6 < 1024) {
            return decimalFormat.format(j6) + "B";
        }
        if (j6 < 1048576) {
            return decimalFormat.format(j6 / 1024.0d) + "KB";
        }
        if (j6 < 1073741824) {
            return decimalFormat.format(j6 / 1048576.0d) + "AT";
        }
        return decimalFormat.format(j6 / 1.073741824E9d) + "GB";
    }

    private static ArrayList<File> e(File file) {
        ArrayList<File> arrayList = new ArrayList<>();
        for (File file2 : file.listFiles(new FileFilter() { // from class: com.anythink.expressad.foundation.h.p.3
            @Override // java.io.FileFilter
            public final boolean accept(File file3) {
                return !file3.isHidden() || file3.isDirectory();
            }
        })) {
            if (!file2.isDirectory()) {
                arrayList.add(file2);
            } else {
                arrayList.addAll(e(file2));
            }
        }
        return arrayList;
    }

    public static boolean a(String str) {
        if (com.anythink.expressad.foundation.g.d.e.a(str)) {
            return false;
        }
        File file = new File(str);
        return file.length() > 0 && file.isFile();
    }

    public static File[] b(String str) {
        try {
            File file = new File(str);
            if (file.exists()) {
                return file.listFiles();
            }
            return null;
        } catch (Exception unused) {
            return null;
        }
    }

    public static void a() {
        new Thread(new Runnable() { // from class: com.anythink.expressad.foundation.h.p.1
            @Override // java.lang.Runnable
            public final void run() {
                try {
                    if (com.anythink.expressad.foundation.b.a.c().e() != null) {
                        String b9 = com.anythink.expressad.foundation.g.c.d.b(com.anythink.expressad.foundation.g.c.a.ANYTHINK_VC);
                        try {
                            File file = new File(b9);
                            if (file.exists() && file.isDirectory()) {
                                for (File file2 : p.b(b9)) {
                                    if (file2.exists() && file2.isFile()) {
                                        file2.delete();
                                    }
                                }
                            }
                        } catch (Exception e9) {
                            e9.printStackTrace();
                        }
                    }
                } catch (Exception e10) {
                    if (com.anythink.expressad.a.f17618a) {
                        e10.printStackTrace();
                    }
                }
            }
        }).start();
    }

    public static void a(long j6) {
        try {
            Iterator<File> it = e(new File(com.anythink.expressad.foundation.g.c.d.b(com.anythink.expressad.foundation.g.c.a.ANYTHINK_RES_MANAGER_DIR))).iterator();
            while (it.hasNext()) {
                File next = it.next();
                if (next.lastModified() < j6 && next.exists() && next.isFile()) {
                    next.delete();
                }
            }
        } catch (Throwable th) {
            th.getMessage();
        }
    }

    public static void b() {
        com.anythink.core.common.v.b.b.a().a(new Runnable() { // from class: com.anythink.expressad.foundation.h.p.2
            @Override // java.lang.Runnable
            public final void run() {
                try {
                    com.anythink.expressad.f.b.a();
                    com.anythink.expressad.foundation.b.a.c().f();
                    com.anythink.expressad.f.a b9 = com.anythink.expressad.f.b.b();
                    if (b9 == null) {
                        com.anythink.expressad.f.b.a();
                        b9 = com.anythink.expressad.f.b.c();
                    }
                    p.a(com.anythink.expressad.foundation.g.c.d.b(com.anythink.expressad.foundation.g.c.a.ANYTHINK_RES_MANAGER_DIR), b9.b());
                    p.a(System.currentTimeMillis() - (b9.n() * 1000));
                } catch (Exception e9) {
                    if (com.anythink.expressad.a.f17618a) {
                        e9.printStackTrace();
                    }
                }
            }
        });
    }

    public static String b(File file) {
        try {
            if (file.isFile()) {
                file.delete();
                return "";
            }
            if (file.isDirectory()) {
                File[] listFiles = file.listFiles();
                if (listFiles != null && listFiles.length != 0) {
                    for (File file2 : listFiles) {
                        b(file2);
                    }
                    file.delete();
                    return "";
                }
                file.delete();
            }
            return "";
        } catch (Exception e9) {
            return e9.getMessage();
        }
    }

    private static void c(String str, int i) {
        try {
            if (d(new File(str)) > i * com.anythink.basead.exoplayer.h.o.f7742d) {
                f(str);
            }
        } catch (Exception e9) {
            e9.printStackTrace();
        } catch (Throwable unused) {
        }
    }

    private static boolean c(String str, String str2) {
        File[] listFiles;
        if (str != null) {
            try {
                if (!TextUtils.isEmpty(str) && str2 != null && !TextUtils.isEmpty(str2)) {
                    File file = new File(str);
                    if (file.isDirectory() && file.listFiles() != null && file.listFiles().length > 0 && (listFiles = file.listFiles()) != null) {
                        for (File file2 : listFiles) {
                            if (file2.isFile()) {
                                if (str2.equals(file2.getName())) {
                                    return true;
                                }
                            } else {
                                c(file2.getAbsolutePath(), str2);
                            }
                        }
                    }
                }
            } catch (Exception e9) {
                e9.printStackTrace();
            }
        }
        return false;
    }

    private static boolean a(String str, String str2, String str3) {
        try {
            if (t.b()) {
                StringBuilder sb = new StringBuilder();
                sb.append(str);
                String str4 = File.separator;
                sb.append(str4);
                sb.append(str3);
                String sb2 = sb.toString();
                File file = new File(sb2);
                if (file.exists() && file.isFile() && t.a(file.length())) {
                    File file2 = new File(str2);
                    if (!file2.exists()) {
                        file2.mkdirs();
                    }
                    int b9 = b(sb2, str2 + str4 + str3);
                    if (file.exists() && b9 == 0) {
                        file.delete();
                        return true;
                    }
                }
            }
        } catch (Exception e9) {
            e9.printStackTrace();
        }
        return false;
    }

    private static int b(String str, String str2) {
        FileOutputStream fileOutputStream;
        FileInputStream fileInputStream = null;
        try {
            if (!t.f19695a) {
                return -1;
            }
            FileInputStream fileInputStream2 = new FileInputStream(str);
            try {
                fileOutputStream = new FileOutputStream(str2);
                try {
                    byte[] bArr = new byte[1024];
                    while (true) {
                        int read = fileInputStream2.read(bArr);
                        if (read <= 0) {
                            break;
                        }
                        fileOutputStream.write(bArr, 0, read);
                    }
                    File file = new File(str2);
                    if (file.exists()) {
                        if (file.isFile()) {
                            try {
                                fileInputStream2.close();
                            } catch (IOException e9) {
                                e9.printStackTrace();
                            }
                            try {
                                fileOutputStream.close();
                            } catch (IOException e10) {
                                e10.printStackTrace();
                            }
                            return 0;
                        }
                    }
                    try {
                        fileInputStream2.close();
                    } catch (IOException e11) {
                        e11.printStackTrace();
                    }
                    try {
                        fileOutputStream.close();
                    } catch (IOException e12) {
                        e12.printStackTrace();
                    }
                    return -1;
                } catch (Exception unused) {
                    fileInputStream = fileInputStream2;
                    if (fileInputStream != null) {
                        try {
                            fileInputStream.close();
                        } catch (IOException e13) {
                            e13.printStackTrace();
                        }
                    }
                    if (fileOutputStream != null) {
                        try {
                            fileOutputStream.close();
                        } catch (IOException e14) {
                            e14.printStackTrace();
                        }
                    }
                    return -1;
                } catch (Throwable th) {
                    th = th;
                    fileInputStream = fileInputStream2;
                    if (fileInputStream != null) {
                        try {
                            fileInputStream.close();
                        } catch (IOException e15) {
                            e15.printStackTrace();
                        }
                    }
                    if (fileOutputStream != null) {
                        try {
                            fileOutputStream.close();
                            throw th;
                        } catch (IOException e16) {
                            e16.printStackTrace();
                            throw th;
                        }
                    }
                    throw th;
                }
            } catch (Exception unused2) {
                fileOutputStream = null;
            } catch (Throwable th2) {
                th = th2;
                fileOutputStream = null;
            }
        } catch (Exception unused3) {
            fileOutputStream = null;
        } catch (Throwable th3) {
            th = th3;
            fileOutputStream = null;
        }
    }

    public static boolean a(byte[] bArr, File file) {
        FileOutputStream fileOutputStream;
        FileOutputStream fileOutputStream2 = null;
        try {
            try {
                if (file.getParentFile() != null && !file.exists()) {
                    file.getParentFile().mkdirs();
                }
                fileOutputStream = new FileOutputStream(file);
            } catch (Throwable th) {
                th = th;
            }
        } catch (Exception e9) {
            e = e9;
        }
        try {
            fileOutputStream.write(bArr);
            try {
                fileOutputStream.close();
                return true;
            } catch (IOException e10) {
                e10.printStackTrace();
                return true;
            }
        } catch (Exception e11) {
            e = e11;
            fileOutputStream2 = fileOutputStream;
            e.printStackTrace();
            if (fileOutputStream2 == null) {
                return false;
            }
            try {
                fileOutputStream2.close();
                return false;
            } catch (IOException e12) {
                e12.printStackTrace();
                return false;
            }
        } catch (Throwable th2) {
            th = th2;
            fileOutputStream2 = fileOutputStream;
            if (fileOutputStream2 != null) {
                try {
                    fileOutputStream2.close();
                } catch (IOException e13) {
                    e13.printStackTrace();
                }
            }
            throw th;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:108:0x00e1, code lost:
    
        r9.close();
     */
    /* JADX WARN: Code restructure failed: missing block: B:110:0x00e5, code lost:
    
        r9 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:111:0x00e6, code lost:
    
        r9.printStackTrace();
     */
    /* JADX WARN: Code restructure failed: missing block: B:120:0x00fb, code lost:
    
        throw new java.lang.Exception("zipEntry's name is unsafe!");
     */
    /* JADX WARN: Code restructure failed: missing block: B:99:0x00df, code lost:
    
        if (r9 == null) goto L73;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static String a(String str, String str2) {
        FileOutputStream fileOutputStream;
        if (str != null && str2 != null) {
            if (!str2.endsWith("/")) {
                str2 = str2.concat("/");
            }
            File file = new File(str);
            if (!file.exists()) {
                return "unzip file not exists";
            }
            InputStream inputStream = null;
            try {
                ZipFile zipFile = new ZipFile(file);
                Enumeration<? extends ZipEntry> entries = zipFile.entries();
                fileOutputStream = null;
                while (true) {
                    try {
                        String str3 = "";
                        if (entries.hasMoreElements()) {
                            ZipEntry nextElement = entries.nextElement();
                            if (nextElement == null) {
                                if (inputStream != null) {
                                    try {
                                        inputStream.close();
                                    } catch (IOException e9) {
                                        e9.printStackTrace();
                                    }
                                }
                                if (fileOutputStream != null) {
                                    try {
                                        fileOutputStream.close();
                                    } catch (IOException e10) {
                                        e10.printStackTrace();
                                    }
                                }
                                return "unzip zipEntry is null";
                            }
                            String name = nextElement.getName();
                            if (!TextUtils.isEmpty(name) && !name.contains("../")) {
                                File file2 = new File(str2 + name);
                                try {
                                    str3 = file2.getCanonicalPath();
                                } catch (IOException unused) {
                                }
                                if (TextUtils.isEmpty(str3) || !str3.startsWith(str2) || str3.startsWith("..") || str3.startsWith("../") || str3.contains("../")) {
                                    break;
                                }
                                if (nextElement.isDirectory()) {
                                    file2.mkdirs();
                                } else {
                                    if (!file2.getParentFile().exists()) {
                                        file2.getParentFile().mkdirs();
                                    }
                                    FileOutputStream fileOutputStream2 = new FileOutputStream(file2);
                                    try {
                                        inputStream = zipFile.getInputStream(nextElement);
                                        byte[] bArr = new byte[1024];
                                        while (true) {
                                            int read = inputStream.read(bArr, 0, 1024);
                                            if (read == -1) {
                                                break;
                                            }
                                            fileOutputStream2.write(bArr, 0, read);
                                            fileOutputStream2.flush();
                                        }
                                        fileOutputStream = fileOutputStream2;
                                    } catch (Throwable th) {
                                        th = th;
                                        fileOutputStream = fileOutputStream2;
                                        try {
                                            if (com.anythink.expressad.a.f17618a) {
                                                th.printStackTrace();
                                            }
                                            String message = th.getMessage();
                                            if (inputStream != null) {
                                                try {
                                                    inputStream.close();
                                                } catch (IOException e11) {
                                                    e11.printStackTrace();
                                                }
                                            }
                                            if (fileOutputStream != null) {
                                                try {
                                                    fileOutputStream.close();
                                                } catch (IOException e12) {
                                                    e12.printStackTrace();
                                                }
                                            }
                                            return message;
                                        } finally {
                                        }
                                    }
                                }
                            } else {
                                break;
                            }
                        } else {
                            zipFile.close();
                            if (inputStream != null) {
                                try {
                                    inputStream.close();
                                } catch (IOException e13) {
                                    e13.printStackTrace();
                                }
                            }
                            if (fileOutputStream != null) {
                                try {
                                    fileOutputStream.close();
                                } catch (IOException e14) {
                                    e14.printStackTrace();
                                }
                            }
                            return "";
                        }
                    } catch (Throwable th2) {
                        th = th2;
                    }
                }
            } catch (Throwable th3) {
                th = th3;
                fileOutputStream = null;
            }
        } else {
            return "unzip srcFile or destDir is null ";
        }
        return "unzip zipEntry canonicalPath is not available";
        if (fileOutputStream != null) {
            try {
                fileOutputStream.close();
            } catch (IOException e15) {
                e15.printStackTrace();
            }
        }
        return "unzip zipEntry canonicalPath is not available";
    }

    public static /* synthetic */ void a(String str, int i) {
        try {
            if (d(new File(str)) > i * com.anythink.basead.exoplayer.h.o.f7742d) {
                f(str);
            }
        } catch (Exception e9) {
            e9.printStackTrace();
        } catch (Throwable unused) {
        }
    }
}
