package io.appmetrica.analytics.rtm.impl;

import android.os.FileObserver;
import android.text.TextUtils;
import java.io.File;
import java.io.RandomAccessFile;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;
import java.nio.channels.FileLock;

/* loaded from: classes5.dex */
public final class g extends FileObserver {
    public final File a;
    public final File b;
    public final f c;

    public g(File file, File file2, f fVar) {
        super(file2.getAbsolutePath(), 256);
        this.a = file;
        this.b = file2;
        this.c = fVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x0070 A[Catch: all -> 0x0041, TryCatch #1 {, blocks: (B:3:0x0001, B:13:0x0032, B:15:0x0037, B:24:0x006a, B:26:0x0070, B:36:0x004c, B:38:0x0051, B:53:0x0077), top: B:2:0x0001 }] */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0062 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final synchronized void a(File file, File file2) {
        RandomAccessFile randomAccessFile;
        FileLock fileLock;
        byte[] bArr;
        FileChannel channel;
        if (file.exists()) {
            String str = null;
            try {
                randomAccessFile = new RandomAccessFile(file, "r");
                try {
                    channel = randomAccessFile.getChannel();
                    fileLock = channel.lock(0L, Long.MAX_VALUE, true);
                } catch (Throwable unused) {
                    fileLock = null;
                }
            } catch (Throwable unused2) {
                randomAccessFile = null;
                fileLock = null;
            }
            try {
                ByteBuffer allocate = ByteBuffer.allocate((int) file.length());
                channel.read(allocate);
                allocate.flip();
                bArr = allocate.array();
                file.getAbsolutePath();
                if (fileLock != null && fileLock.isValid()) {
                    try {
                        fileLock.release();
                    } catch (Throwable unused3) {
                    }
                }
                try {
                    randomAccessFile.close();
                } catch (Throwable unused4) {
                }
            } catch (Throwable unused5) {
                file.getAbsolutePath();
                if (fileLock != null && fileLock.isValid()) {
                    try {
                        fileLock.release();
                    } catch (Throwable unused6) {
                    }
                }
                if (randomAccessFile != null) {
                    try {
                        randomAccessFile.close();
                    } catch (Throwable unused7) {
                    }
                }
                bArr = null;
                if (bArr != null) {
                }
                if (!TextUtils.isEmpty(str)) {
                }
                file.delete();
                file2.delete();
            }
            if (bArr != null) {
                try {
                    str = new String(bArr, "UTF-8");
                } catch (Throwable unused8) {
                }
            }
            if (!TextUtils.isEmpty(str)) {
                ((s) this.c).c(str);
            }
        }
        file.delete();
        file2.delete();
    }

    @Override // android.os.FileObserver
    public final synchronized void onEvent(int i, String str) {
        if (i == 256) {
            if (!TextUtils.isEmpty(str)) {
                File file = new File(this.b, str);
                a(new File(this.a, file.getName()), file);
            }
        }
    }

    @Override // android.os.FileObserver
    public final synchronized void startWatching() {
        try {
            File file = this.b;
            if (!file.exists()) {
                file.mkdirs();
            } else if (!file.isDirectory() && file.delete()) {
                file.mkdirs();
            }
            File[] listFiles = this.a.listFiles();
            super.startWatching();
            if (listFiles != null) {
                for (File file2 : listFiles) {
                    a(file2, new File(this.b, file2.getName()));
                }
            }
        } catch (Throwable th) {
            throw th;
        }
    }
}
