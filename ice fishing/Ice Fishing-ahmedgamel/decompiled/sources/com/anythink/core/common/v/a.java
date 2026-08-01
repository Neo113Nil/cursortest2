package com.anythink.core.common.v;

import android.text.TextUtils;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Enumeration;
import java.util.zip.ZipEntry;
import java.util.zip.ZipFile;
import java.util.zip.ZipInputStream;

/* loaded from: classes.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    private static final int f16560a = 4096;

    /* renamed from: b, reason: collision with root package name */
    private static final String f16561b = "ATUnzipUtility";

    private static void a(ZipInputStream zipInputStream, String str) {
        BufferedOutputStream bufferedOutputStream;
        File file = new File(str);
        if (!file.getParentFile().exists()) {
            file.getParentFile().mkdirs();
        }
        BufferedOutputStream bufferedOutputStream2 = null;
        try {
            try {
                bufferedOutputStream = new BufferedOutputStream(new FileOutputStream(file));
            } catch (Throwable th) {
                th = th;
            }
        } catch (IOException e9) {
            e = e9;
        }
        try {
            byte[] bArr = new byte[f16560a];
            while (true) {
                int read = zipInputStream.read(bArr);
                if (read == -1) {
                    bufferedOutputStream.close();
                    return;
                }
                bufferedOutputStream.write(bArr, 0, read);
            }
        } catch (IOException e10) {
            e = e10;
            throw new IOException(e);
        } catch (Throwable th2) {
            th = th2;
            bufferedOutputStream2 = bufferedOutputStream;
            if (bufferedOutputStream2 != null) {
                bufferedOutputStream2.close();
            }
            throw th;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:105:0x00e0, code lost:
    
        r12.close();
     */
    /* JADX WARN: Code restructure failed: missing block: B:107:0x00e4, code lost:
    
        r12 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:108:0x00e5, code lost:
    
        r12.getMessage();
     */
    /* JADX WARN: Code restructure failed: missing block: B:125:0x00f5, code lost:
    
        r12.close();
     */
    /* JADX WARN: Code restructure failed: missing block: B:127:0x00f9, code lost:
    
        r12 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:128:0x00fa, code lost:
    
        r12.getMessage();
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static int a(String str, String str2) {
        FileOutputStream fileOutputStream;
        String str3;
        if (str == null || str2 == null) {
            return -1;
        }
        if (!str2.endsWith("/")) {
            str2 = str2.concat("/");
        }
        File file = new File(str);
        if (!file.exists()) {
            return 1;
        }
        InputStream inputStream = null;
        try {
            ZipFile zipFile = new ZipFile(file);
            Enumeration<? extends ZipEntry> entries = zipFile.entries();
            fileOutputStream = null;
            while (entries.hasMoreElements()) {
                try {
                    ZipEntry nextElement = entries.nextElement();
                    if (nextElement == null) {
                        if (inputStream != null) {
                            try {
                                inputStream.close();
                            } catch (Throwable th) {
                                th.getMessage();
                            }
                        }
                        if (fileOutputStream != null) {
                            try {
                                fileOutputStream.close();
                            } catch (Throwable th2) {
                                th2.getMessage();
                            }
                        }
                        return 2;
                    }
                    String name = nextElement.getName();
                    if (!TextUtils.isEmpty(name) && !name.startsWith("..") && !name.startsWith("../")) {
                        File file2 = new File(str2 + name);
                        try {
                            str3 = file2.getCanonicalPath();
                        } catch (IOException unused) {
                            str3 = "";
                        }
                        if (!TextUtils.isEmpty(str3) && str3.startsWith(str2) && !str3.startsWith("..") && !str3.startsWith("../")) {
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
                                } catch (Throwable th3) {
                                    th = th3;
                                    fileOutputStream = fileOutputStream2;
                                    try {
                                        th.getMessage();
                                        if (inputStream != null) {
                                            try {
                                                inputStream.close();
                                            } catch (Throwable th4) {
                                                th4.getMessage();
                                            }
                                        }
                                        if (fileOutputStream == null) {
                                            return 3;
                                        }
                                        try {
                                            fileOutputStream.close();
                                            return 3;
                                        } catch (Throwable th5) {
                                            th5.getMessage();
                                            return 3;
                                        }
                                    } finally {
                                    }
                                }
                            }
                        }
                        if (fileOutputStream != null) {
                            try {
                                fileOutputStream.close();
                            } catch (Throwable th6) {
                                th6.getMessage();
                            }
                        }
                        return 2;
                    }
                    if (fileOutputStream != null) {
                        try {
                            fileOutputStream.close();
                        } catch (Throwable th7) {
                            th7.getMessage();
                        }
                    }
                    return 2;
                } catch (Throwable th8) {
                    th = th8;
                }
            }
            zipFile.close();
            if (inputStream != null) {
                try {
                    inputStream.close();
                } catch (Throwable th9) {
                    th9.getMessage();
                }
            }
            if (fileOutputStream != null) {
                try {
                    fileOutputStream.close();
                } catch (Throwable th10) {
                    th10.getMessage();
                }
            }
            return 0;
        } catch (Throwable th11) {
            th = th11;
            fileOutputStream = null;
        }
    }
}
