package com.anythink.expressad.foundation.h;

import android.text.TextUtils;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.nio.channels.FileChannel;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

/* loaded from: classes.dex */
public class o {

    /* renamed from: a, reason: collision with root package name */
    protected static char[] f19664a = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'a', 'b', 'c', 'd', 'e', 'f'};

    /* renamed from: b, reason: collision with root package name */
    protected static MessageDigest f19665b = null;

    /* renamed from: c, reason: collision with root package name */
    private static String f19666c = "SameFileMD5";

    static {
        f19665b = null;
        try {
            f19665b = MessageDigest.getInstance("MD5");
        } catch (NoSuchAlgorithmException e9) {
            System.err.println(o.class.getName().concat("Init fail,MessageDigest not support MD5Util."));
            e9.printStackTrace();
        }
    }

    private static String a(String str) {
        return b(new File(str));
    }

    private static String b(File file) {
        Throwable th;
        FileInputStream fileInputStream = null;
        try {
            FileInputStream fileInputStream2 = new FileInputStream(file);
            try {
                f19665b.update(fileInputStream2.getChannel().map(FileChannel.MapMode.READ_ONLY, 0L, file.length()));
                String a9 = a(f19665b.digest());
                fileInputStream2.close();
                return a9;
            } catch (Exception unused) {
                fileInputStream = fileInputStream2;
                if (fileInputStream == null) {
                    return "";
                }
                fileInputStream.close();
                return "";
            } catch (Throwable th2) {
                th = th2;
                fileInputStream = fileInputStream2;
                if (fileInputStream == null) {
                    throw th;
                }
                fileInputStream.close();
                throw th;
            }
        } catch (Exception unused2) {
        } catch (Throwable th3) {
            th = th3;
        }
    }

    public static String a(File file) {
        if (!file.exists()) {
            return "";
        }
        RandomAccessFile randomAccessFile = null;
        try {
            MessageDigest messageDigest = MessageDigest.getInstance("MD5");
            RandomAccessFile randomAccessFile2 = new RandomAccessFile(file, com.anythink.expressad.foundation.d.d.bv);
            try {
                byte[] bArr = new byte[10485760];
                while (true) {
                    int read = randomAccessFile2.read(bArr);
                    if (read != -1) {
                        messageDigest.update(bArr, 0, read);
                    } else {
                        String a9 = a(messageDigest.digest());
                        try {
                            randomAccessFile2.close();
                            return a9;
                        } catch (IOException e9) {
                            e9.getMessage();
                            return a9;
                        }
                    }
                }
            } catch (Throwable th) {
                th = th;
                randomAccessFile = randomAccessFile2;
                try {
                    th.getMessage();
                    return "";
                } finally {
                    if (randomAccessFile != null) {
                        try {
                            randomAccessFile.close();
                        } catch (IOException e10) {
                            e10.getMessage();
                        }
                    }
                }
            }
        } catch (Throwable th2) {
            th = th2;
        }
    }

    private static String b(String str) {
        if (TextUtils.isEmpty(str)) {
            return "";
        }
        return a(new File(str));
    }

    private static String a(byte[] bArr) {
        return a(bArr, bArr.length);
    }

    private static String a(byte[] bArr, int i) {
        StringBuffer stringBuffer = new StringBuffer(i * 2);
        for (int i6 = 0; i6 < i; i6++) {
            a(bArr[i6], stringBuffer);
        }
        return stringBuffer.toString();
    }

    private static void a(byte b9, StringBuffer stringBuffer) {
        char[] cArr = f19664a;
        char c9 = cArr[(b9 & 240) >> 4];
        char c10 = cArr[b9 & 15];
        stringBuffer.append(c9);
        stringBuffer.append(c10);
    }
}
