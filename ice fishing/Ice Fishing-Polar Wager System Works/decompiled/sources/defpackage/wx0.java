package defpackage;

/* loaded from: classes.dex */
public final class wx0 {
    public static final java.util.HashMap adDC3e2L = new java.util.HashMap();
    public java.nio.channels.FileChannel F7NU4MC0GW;
    public final boolean IHQe1A4L2xu;
    public final java.io.File oh6vYeIP;
    public final java.util.concurrent.locks.Lock r1MBDhnF;

    public wx0(java.lang.String str, java.io.File file, boolean z) {
        java.util.concurrent.locks.Lock lock;
        this.IHQe1A4L2xu = z;
        this.oh6vYeIP = file != null ? new java.io.File(file, str.concat(".lck")) : null;
        java.util.HashMap hashMap = adDC3e2L;
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
        this.r1MBDhnF = lock;
    }

    public final void IHQe1A4L2xu(boolean z) {
        this.r1MBDhnF.lock();
        if (z) {
            java.io.File file = this.oh6vYeIP;
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
                this.F7NU4MC0GW = channel;
            } catch (java.io.IOException e) {
                this.F7NU4MC0GW = null;
                android.util.Log.w("SupportSQLiteLock", "Unable to grab file lock.", e);
            }
        }
    }

    public final void oh6vYeIP() {
        try {
            java.nio.channels.FileChannel fileChannel = this.F7NU4MC0GW;
            if (fileChannel != null) {
                fileChannel.close();
            }
        } catch (java.io.IOException unused) {
        }
        this.r1MBDhnF.unlock();
    }
}
