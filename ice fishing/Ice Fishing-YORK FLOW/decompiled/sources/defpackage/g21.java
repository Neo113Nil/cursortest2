package defpackage;

/* compiled from: r8-map-id-5e15bf382d9e1cc682b2b5d208f848646545054061ee84effb1e415a0540fc32 */
/* loaded from: classes.dex */
public final class g21 {
    public static final java.util.HashMap WDYagTQQm9ns = new java.util.HashMap();
    public java.nio.channels.FileChannel JhCgjQRTAOCT;
    public final boolean ZpBGe2uQfcn8;
    public final java.util.concurrent.locks.Lock fWTAfUmVKrZq;
    public final java.io.File giKS3J6vZuNy;

    public g21(java.lang.String str, java.io.File file, boolean z) {
        java.util.concurrent.locks.Lock lock;
        this.ZpBGe2uQfcn8 = z;
        this.giKS3J6vZuNy = file != null ? new java.io.File(file, str.concat(".lck")) : null;
        java.util.HashMap hashMap = WDYagTQQm9ns;
        synchronized (hashMap) {
            try {
                java.lang.Object obj = hashMap.get(str);
                if (obj == null) {
                    obj = new java.util.concurrent.locks.ReentrantLock();
                    hashMap.put(str, obj);
                }
                lock = (java.util.concurrent.locks.Lock) obj;
            } catch (java.lang.Throwable th) {
                throw th;
            }
        }
        this.fWTAfUmVKrZq = lock;
    }

    public final void ZpBGe2uQfcn8(boolean z) {
        this.fWTAfUmVKrZq.lock();
        if (z) {
            java.io.File file = this.giKS3J6vZuNy;
            try {
                if (file == null) {
                    throw new java.io.IOException("No lock directory was provided.");
                }
                java.io.File parentFile = file.getParentFile();
                if (parentFile != null) {
                    parentFile.mkdirs();
                }
                java.nio.channels.FileChannel channel = new java.io.FileOutputStream(file).getChannel();
                channel.lock();
                this.JhCgjQRTAOCT = channel;
            } catch (java.io.IOException e) {
                this.JhCgjQRTAOCT = null;
                android.util.Log.w("SupportSQLiteLock", "Unable to grab file lock.", e);
            }
        }
    }

    public final void giKS3J6vZuNy() {
        try {
            java.nio.channels.FileChannel fileChannel = this.JhCgjQRTAOCT;
            if (fileChannel != null) {
                fileChannel.close();
            }
        } catch (java.io.IOException unused) {
        }
        this.fWTAfUmVKrZq.unlock();
    }
}
