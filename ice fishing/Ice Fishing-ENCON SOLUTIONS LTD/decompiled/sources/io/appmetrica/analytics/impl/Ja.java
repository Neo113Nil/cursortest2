package io.appmetrica.analytics.impl;

import java.io.Closeable;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.io.UnsupportedEncodingException;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;
import java.nio.channels.FileLock;

/* loaded from: classes.dex */
public abstract class Ja {
    /* JADX WARN: Removed duplicated region for block: B:13:0x007d A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:21:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static String a(File file) {
        byte[] bArr;
        Throwable th;
        RandomAccessFile randomAccessFile;
        FileLock fileLock;
        if (file != null && file.exists()) {
            try {
                randomAccessFile = new RandomAccessFile(file, "r");
                try {
                    FileChannel channel = randomAccessFile.getChannel();
                    fileLock = channel.lock(0L, Long.MAX_VALUE, true);
                    try {
                        ByteBuffer allocate = ByteBuffer.allocate((int) file.length());
                        channel.read(allocate);
                        allocate.flip();
                        bArr = allocate.array();
                    } catch (IOException | SecurityException unused) {
                        bArr = null;
                        if (bArr != null) {
                        }
                    } catch (Throwable th2) {
                        th = th2;
                        try {
                            Qj qj = AbstractC0645oj.f6689a;
                            qj.getClass();
                            qj.a(new C0671pj("error_during_file_reading", th));
                            bArr = null;
                            if (bArr != null) {
                            }
                        } finally {
                            file.getAbsolutePath();
                            a(fileLock);
                            AbstractC0572lo.a((Closeable) randomAccessFile);
                        }
                    }
                } catch (IOException | SecurityException unused2) {
                    fileLock = null;
                } catch (Throwable th3) {
                    th = th3;
                    fileLock = null;
                }
            } catch (IOException | SecurityException unused3) {
                randomAccessFile = null;
                fileLock = null;
            } catch (Throwable th4) {
                th = th4;
                randomAccessFile = null;
                fileLock = null;
            }
            if (bArr != null) {
                return null;
            }
            try {
                return new String(bArr, "UTF-8");
            } catch (UnsupportedEncodingException e2) {
                String str = new String(bArr);
                Qj qj2 = AbstractC0645oj.f6689a;
                qj2.getClass();
                qj2.a(new C0671pj("read_share_file_with_unsupported_encoding", e2));
                return str;
            }
        }
        bArr = null;
        if (bArr != null) {
        }
    }

    public static void a(FileLock fileLock) {
        if (fileLock == null || !fileLock.isValid()) {
            return;
        }
        try {
            fileLock.release();
        } catch (IOException unused) {
        }
    }

    public static void a(String str, FileOutputStream fileOutputStream) {
        FileLock fileLock = null;
        try {
            FileChannel channel = fileOutputStream.getChannel();
            fileLock = channel.lock();
            byte[] bytes = str.getBytes("UTF-8");
            ByteBuffer allocate = ByteBuffer.allocate(bytes.length);
            allocate.put(bytes);
            allocate.flip();
            channel.write(allocate);
            channel.force(true);
        } catch (IOException unused) {
        } finally {
            a(fileLock);
            AbstractC0572lo.a((Closeable) fileOutputStream);
        }
    }
}
