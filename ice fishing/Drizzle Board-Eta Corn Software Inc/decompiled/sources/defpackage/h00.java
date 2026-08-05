package defpackage;

import android.util.Log;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.channels.FileChannel;
import java.util.HashMap;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/* compiled from: r8-map-id-3663cbcef52f1a493ceac7deeb6c50e305d4d0c9f83e91180cb6ce540f71d6b5 */
/* loaded from: classes.dex */
public final class h00 {
    public static final HashMap VgvYg0wo = new HashMap();
    public final Lock MdtA4re8;
    public final File NCTxEWno;
    public final boolean qoPGr6Ce;
    public FileChannel wxUZMvaN;

    public h00(String str, File file, boolean z) {
        Lock lock;
        this.qoPGr6Ce = z;
        this.NCTxEWno = file != null ? new File(file, str.concat(".lck")) : null;
        HashMap hashMap = VgvYg0wo;
        synchronized (hashMap) {
            try {
                Object obj = hashMap.get(str);
                if (obj == null) {
                    obj = new ReentrantLock();
                    hashMap.put(str, obj);
                }
                lock = (Lock) obj;
            } catch (Throwable th) {
                throw th;
            }
        }
        this.MdtA4re8 = lock;
    }

    public final void NCTxEWno() {
        try {
            FileChannel fileChannel = this.wxUZMvaN;
            if (fileChannel != null) {
                fileChannel.close();
            }
        } catch (IOException unused) {
        }
        this.MdtA4re8.unlock();
    }

    public final void qoPGr6Ce(boolean z) {
        this.MdtA4re8.lock();
        if (z) {
            File file = this.NCTxEWno;
            try {
                if (file == null) {
                    throw new IOException("No lock directory was provided.");
                }
                File parentFile = file.getParentFile();
                if (parentFile != null) {
                    parentFile.mkdirs();
                }
                FileChannel channel = new FileOutputStream(file).getChannel();
                channel.lock();
                this.wxUZMvaN = channel;
            } catch (IOException e) {
                this.wxUZMvaN = null;
                Log.w("SupportSQLiteLock", "Unable to grab file lock.", e);
            }
        }
    }
}
