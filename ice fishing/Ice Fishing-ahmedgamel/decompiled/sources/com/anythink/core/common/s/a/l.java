package com.anythink.core.common.s.a;

import java.io.Closeable;
import java.io.File;
import java.io.RandomAccessFile;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.security.SecureRandom;
import java.util.concurrent.atomic.AtomicBoolean;

/* loaded from: classes.dex */
final class l {

    /* renamed from: a, reason: collision with root package name */
    static final int f17158a = 32;

    /* renamed from: b, reason: collision with root package name */
    private static final int f17159b = 16384;

    public static class a {

        /* renamed from: a, reason: collision with root package name */
        static final SecureRandom f17160a = new SecureRandom();

        /* renamed from: b, reason: collision with root package name */
        static final char[] f17161b = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'a', 'b', 'c', 'd', 'e', 'f'};

        private a() {
        }
    }

    public static String a() {
        byte[] bArr = new byte[16];
        a.f17160a.nextBytes(bArr);
        char[] cArr = new char[32];
        for (int i = 0; i < 16; i++) {
            byte b9 = bArr[i];
            int i4 = i << 1;
            char[] cArr2 = a.f17161b;
            cArr[i4] = cArr2[(b9 >> 4) & 15];
            cArr[i4 + 1] = cArr2[b9 & 15];
        }
        return new String(cArr);
    }

    public static int b() {
        try {
            Class<?> cls = Class.forName("sun.misc.Unsafe");
            Field declaredField = cls.getDeclaredField("theUnsafe");
            declaredField.setAccessible(true);
            Method declaredMethod = cls.getDeclaredMethod("pageSize", new Class[0]);
            declaredMethod.setAccessible(true);
            return ((Integer) declaredMethod.invoke(declaredField.get(null), new Object[0])).intValue();
        } catch (Throwable unused) {
            return f17159b;
        }
    }

    public static void c(File file) {
        try {
            if (file.exists()) {
                d(file);
            }
        } catch (Throwable unused) {
        }
    }

    private static void d(File file) {
        File[] listFiles;
        if (file.isDirectory() && (listFiles = file.listFiles()) != null) {
            for (File file2 : listFiles) {
                d(file2);
            }
        }
        file.delete();
    }

    public static byte[] b(File file) {
        if (!file.isFile()) {
            return null;
        }
        long length = file.length();
        if ((length >> 32) == 0) {
            int i = (int) length;
            byte[] bArr = new byte[i];
            a(file, bArr, i);
            return bArr;
        }
        throw new IllegalArgumentException("file too large, path:" + file.getPath());
    }

    public static boolean a(File file) {
        if (file.isFile()) {
            return true;
        }
        File parentFile = file.getParentFile();
        if (parentFile != null) {
            return (parentFile.isDirectory() || parentFile.mkdirs()) && file.createNewFile();
        }
        return false;
    }

    public static void a(File file, byte[] bArr, int i) {
        RandomAccessFile randomAccessFile = new RandomAccessFile(file, "rw");
        int i4 = 0;
        while (i4 < i) {
            try {
                int read = randomAccessFile.read(bArr, i4, i - i4);
                if (read < 0) {
                    break;
                } else {
                    i4 += read;
                }
            } finally {
                a(randomAccessFile);
            }
        }
    }

    private static void b(File file, File file2) {
        if (!file.exists() || file2.exists() || file.renameTo(file2)) {
            return;
        }
        a(file2, b(file), (AtomicBoolean) null);
        c(file);
    }

    public static boolean a(File file, byte[] bArr, AtomicBoolean atomicBoolean) {
        int length;
        File file2;
        File file3 = null;
        try {
            try {
                length = bArr.length;
                file2 = new File(file.getParent(), file.getName() + ".tmp");
            } catch (Exception e9) {
                e = e9;
            }
        } catch (Throwable th) {
            th = th;
        }
        try {
            if (!a(file2)) {
                a(new Exception("create file failed"));
                if (atomicBoolean != null && atomicBoolean.get()) {
                    c(file2);
                    c(file);
                }
                return false;
            }
            if (atomicBoolean != null && atomicBoolean.get()) {
                if (atomicBoolean.get()) {
                    c(file2);
                    c(file);
                }
                return false;
            }
            RandomAccessFile randomAccessFile = new RandomAccessFile(file2, "rw");
            try {
                randomAccessFile.setLength(length);
                randomAccessFile.write(bArr, 0, length);
                if (atomicBoolean != null && atomicBoolean.get()) {
                    randomAccessFile.close();
                    if (atomicBoolean.get()) {
                        c(file2);
                        c(file);
                    }
                    return false;
                }
                randomAccessFile.getFD().sync();
                randomAccessFile.close();
                boolean a9 = a(file2, file);
                if (atomicBoolean != null && atomicBoolean.get()) {
                    c(file2);
                    c(file);
                }
                return a9;
            } finally {
            }
        } catch (Exception e10) {
            e = e10;
            file3 = file2;
            a(new Exception("save bytes failed", e));
            if (atomicBoolean != null && atomicBoolean.get()) {
                c(file3);
                c(file);
            }
            return false;
        } catch (Throwable th2) {
            th = th2;
            file3 = file2;
            if (atomicBoolean != null && atomicBoolean.get()) {
                c(file3);
                c(file);
            }
            throw th;
        }
    }

    public static boolean a(File file, File file2) {
        if (file.renameTo(file2)) {
            return true;
        }
        return (!file2.exists() || file2.delete()) && file.renameTo(file2);
    }

    public static void a(Closeable closeable) {
        if (closeable != null) {
            try {
                closeable.close();
            } catch (Throwable unused) {
            }
        }
    }

    public static void a(File file, String str) {
        File[] listFiles;
        if (!file.isDirectory() || (listFiles = file.listFiles()) == null) {
            return;
        }
        for (File file2 : listFiles) {
            try {
                File file3 = new File(str, file2.getName());
                if (file2.exists() && !file3.exists() && !file2.renameTo(file3)) {
                    a(file3, b(file2), (AtomicBoolean) null);
                    c(file2);
                }
            } catch (Exception e9) {
                a(e9);
            }
        }
    }

    private static int a(int[] iArr, int i) {
        int length = iArr.length - 1;
        int i4 = 0;
        while (i4 <= length) {
            int i6 = (i4 + length) >>> 1;
            int i9 = iArr[i6];
            if (i9 < i) {
                i4 = i6 + 1;
            } else {
                if (i9 <= i) {
                    return i6;
                }
                length = i6 - 1;
            }
        }
        return length;
    }

    private static void a(Exception exc) {
        com.anythink.core.common.s.a.a.c cVar = h.f17137a;
        if (cVar != null) {
            cVar.b("FastKV", exc);
        }
    }
}
