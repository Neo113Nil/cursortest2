package com.anythink.expressad.c;

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
public final class c {

    /* renamed from: a, reason: collision with root package name */
    private static final String f19088a = "UnzipUtility";

    /* renamed from: b, reason: collision with root package name */
    private static final int f19089b = 4096;

    /* JADX WARN: Code restructure failed: missing block: B:103:0x00e6, code lost:
    
        r12.close();
     */
    /* JADX WARN: Code restructure failed: missing block: B:105:0x00ea, code lost:
    
        r12 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:106:0x00eb, code lost:
    
        r12.getMessage();
     */
    /* JADX WARN: Code restructure failed: missing block: B:123:0x00fb, code lost:
    
        r12.close();
     */
    /* JADX WARN: Code restructure failed: missing block: B:125:0x00ff, code lost:
    
        r12 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:126:0x0100, code lost:
    
        r12.getMessage();
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static int a(String str, String str2) {
        FileOutputStream fileOutputStream;
        FileOutputStream fileOutputStream2;
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
            try {
                ZipFile zipFile = new ZipFile(file);
                Enumeration<? extends ZipEntry> entries = zipFile.entries();
                fileOutputStream2 = null;
                while (entries.hasMoreElements()) {
                    try {
                        ZipEntry nextElement = entries.nextElement();
                        if (nextElement == null) {
                            if (inputStream != null) {
                                try {
                                    inputStream.close();
                                } catch (IOException e9) {
                                    e9.getMessage();
                                }
                            }
                            if (fileOutputStream2 != null) {
                                try {
                                    fileOutputStream2.close();
                                } catch (IOException e10) {
                                    e10.getMessage();
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
                            if (TextUtils.isEmpty(str3) || str3.startsWith("..") || str3.startsWith("../") || !str3.startsWith(str2)) {
                                if (fileOutputStream2 != null) {
                                    try {
                                        fileOutputStream2.close();
                                    } catch (IOException e11) {
                                        e11.getMessage();
                                    }
                                }
                                return 2;
                            }
                            if (nextElement.isDirectory()) {
                                file2.mkdirs();
                            } else {
                                if (!file2.getParentFile().exists()) {
                                    file2.getParentFile().mkdirs();
                                }
                                FileOutputStream fileOutputStream3 = new FileOutputStream(file2);
                                try {
                                    inputStream = zipFile.getInputStream(nextElement);
                                    byte[] bArr = new byte[1024];
                                    while (true) {
                                        int read = inputStream.read(bArr, 0, 1024);
                                        if (read == -1) {
                                            break;
                                        }
                                        fileOutputStream3.write(bArr, 0, read);
                                        fileOutputStream3.flush();
                                    }
                                    fileOutputStream2 = fileOutputStream3;
                                } catch (IOException e12) {
                                    e = e12;
                                    fileOutputStream2 = fileOutputStream3;
                                    e.getMessage();
                                    if (inputStream != null) {
                                        try {
                                            inputStream.close();
                                        } catch (IOException e13) {
                                            e13.getMessage();
                                        }
                                    }
                                    if (fileOutputStream2 == null) {
                                        return 3;
                                    }
                                    try {
                                        fileOutputStream2.close();
                                        return 3;
                                    } catch (IOException e14) {
                                        e14.getMessage();
                                        return 3;
                                    }
                                } catch (Throwable th) {
                                    th = th;
                                    fileOutputStream = fileOutputStream3;
                                    if (inputStream != null) {
                                        try {
                                            inputStream.close();
                                        } catch (IOException e15) {
                                            e15.getMessage();
                                        }
                                    }
                                    if (fileOutputStream == null) {
                                        throw th;
                                    }
                                    try {
                                        fileOutputStream.close();
                                        throw th;
                                    } catch (IOException e16) {
                                        e16.getMessage();
                                        throw th;
                                    }
                                }
                            }
                        }
                        if (fileOutputStream2 != null) {
                            try {
                                fileOutputStream2.close();
                            } catch (IOException e17) {
                                e17.getMessage();
                            }
                        }
                        return 2;
                    } catch (IOException e18) {
                        e = e18;
                    }
                }
                zipFile.close();
                if (inputStream != null) {
                    try {
                        inputStream.close();
                    } catch (IOException e19) {
                        e19.getMessage();
                    }
                }
                if (fileOutputStream2 != null) {
                    try {
                        fileOutputStream2.close();
                    } catch (IOException e20) {
                        e20.getMessage();
                    }
                }
                return 0;
            } catch (Throwable th2) {
                th = th2;
            }
        } catch (IOException e21) {
            e = e21;
            fileOutputStream2 = null;
        } catch (Throwable th3) {
            th = th3;
            fileOutputStream = null;
        }
    }

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
            byte[] bArr = new byte[f19089b];
            while (true) {
                int read = zipInputStream.read(bArr);
                if (read != -1) {
                    bufferedOutputStream.write(bArr, 0, read);
                } else {
                    bufferedOutputStream.close();
                    return;
                }
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
}
