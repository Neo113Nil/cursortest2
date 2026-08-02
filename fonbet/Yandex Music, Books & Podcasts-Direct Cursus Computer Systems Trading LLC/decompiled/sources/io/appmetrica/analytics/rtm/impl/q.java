package io.appmetrica.analytics.rtm.impl;

import java.io.File;
import java.io.FileOutputStream;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;
import java.nio.channels.FileLock;

/* loaded from: classes5.dex */
public abstract class q {
    public static void a(File file, String str) {
        FileOutputStream fileOutputStream;
        FileLock fileLock = null;
        try {
            try {
                fileOutputStream = new FileOutputStream(file);
            } catch (Throwable unused) {
                fileOutputStream = null;
            }
            try {
                FileChannel channel = fileOutputStream.getChannel();
                fileLock = channel.lock();
                byte[] bytes = str.getBytes("UTF-8");
                ByteBuffer allocate = ByteBuffer.allocate(bytes.length);
                allocate.put(bytes);
                allocate.flip();
                channel.write(allocate);
                channel.force(true);
                file.getName();
                if (fileLock != null && fileLock.isValid()) {
                    try {
                        fileLock.release();
                    } catch (Throwable unused2) {
                    }
                }
                fileOutputStream.close();
            } catch (Throwable unused3) {
                file.getName();
                if (fileLock != null && fileLock.isValid()) {
                    try {
                        fileLock.release();
                    } catch (Throwable unused4) {
                    }
                }
                if (fileOutputStream != null) {
                    fileOutputStream.close();
                }
            }
        } catch (Throwable unused5) {
        }
    }
}
