package defpackage;

/* loaded from: classes.dex */
public final class nm extends defpackage.mu implements java.lang.Runnable {
    public static final long G3OKOH3wZRC;
    public static final defpackage.nm QoRHpC4k;
    private static volatile java.lang.Thread _thread;
    private static volatile int debugStatus;

    static {
        java.lang.Long l;
        defpackage.nm nmVar = new defpackage.nm();
        QoRHpC4k = nmVar;
        nmVar.wll2JLbTBC2(false);
        try {
            l = java.lang.Long.getLong("kotlinx.coroutines.DefaultExecutor.keepAlive", 1000L);
        } catch (java.lang.SecurityException unused) {
            l = 1000L;
        }
        G3OKOH3wZRC = java.util.concurrent.TimeUnit.MILLISECONDS.toNanos(l.longValue());
    }

    @Override // defpackage.mu, defpackage.jn
    public final defpackage.kq AARZUJiTa(long j, defpackage.zg1 zg1Var, defpackage.lj ljVar) {
        long j2 = j > 0 ? j >= 9223372036854L ? Long.MAX_VALUE : 1000000 * j : 0L;
        if (j2 >= 4611686018427387903L) {
            return defpackage.pp0.adDC3e2L;
        }
        long nanoTime = java.lang.System.nanoTime();
        defpackage.ju juVar = new defpackage.ju(j2 + nanoTime, zg1Var);
        RmCzwkUxICV(nanoTime, juVar);
        return juVar;
    }

    public final synchronized void AQHddgaEX() {
        int i = debugStatus;
        if (i == 2 || i == 3) {
            debugStatus = 3;
            AsxAYCCkb3Hi();
            notifyAll();
        }
    }

    @Override // defpackage.mu
    public final void EoOhNTTfIN7K(long j, defpackage.ku kuVar) {
        throw new java.util.concurrent.RejectedExecutionException("DefaultExecutor was shut down. This error indicates that Dispatchers.shutdown() was invoked prior to completion of exiting coroutines, leaving coroutines in incomplete state. Please refer to Dispatchers.shutdown documentation for more details");
    }

    @Override // defpackage.mu
    public final java.lang.Thread QPwENk36pDC() {
        java.lang.Thread thread;
        java.lang.Thread thread2 = _thread;
        if (thread2 != null) {
            return thread2;
        }
        synchronized (this) {
            thread = _thread;
            if (thread == null) {
                thread = new java.lang.Thread(this, "kotlinx.coroutines.DefaultExecutor");
                _thread = thread;
                thread.setContextClassLoader(QoRHpC4k.getClass().getClassLoader());
                thread.setDaemon(true);
                thread.start();
            }
        }
        return thread;
    }

    @Override // defpackage.mu
    public final void lpprD5VAS(java.lang.Runnable runnable) {
        if (debugStatus == 4) {
            throw new java.util.concurrent.RejectedExecutionException("DefaultExecutor was shut down. This error indicates that Dispatchers.shutdown() was invoked prior to completion of exiting coroutines, leaving coroutines in incomplete state. Please refer to Dispatchers.shutdown documentation for more details");
        }
        super.lpprD5VAS(runnable);
    }

    @Override // java.lang.Runnable
    public final void run() {
        boolean Ye0N2xE9Hc;
        defpackage.lg1.IHQe1A4L2xu.set(this);
        try {
            synchronized (this) {
                int i = debugStatus;
                if (i == 2 || i == 3) {
                    if (Ye0N2xE9Hc) {
                        return;
                    } else {
                        return;
                    }
                }
                debugStatus = 1;
                notifyAll();
                long j = Long.MAX_VALUE;
                while (true) {
                    java.lang.Thread.interrupted();
                    long XZx205DYe = XZx205DYe();
                    if (XZx205DYe == Long.MAX_VALUE) {
                        long nanoTime = java.lang.System.nanoTime();
                        if (j == Long.MAX_VALUE) {
                            j = G3OKOH3wZRC + nanoTime;
                        }
                        long j2 = j - nanoTime;
                        if (j2 <= 0) {
                            _thread = null;
                            AQHddgaEX();
                            if (Ye0N2xE9Hc()) {
                                return;
                            }
                            QPwENk36pDC();
                            return;
                        }
                        if (XZx205DYe > j2) {
                            XZx205DYe = j2;
                        }
                    } else {
                        j = Long.MAX_VALUE;
                    }
                    if (XZx205DYe > 0) {
                        int i2 = debugStatus;
                        if (i2 == 2 || i2 == 3) {
                            _thread = null;
                            AQHddgaEX();
                            if (Ye0N2xE9Hc()) {
                                return;
                            }
                            QPwENk36pDC();
                            return;
                        }
                        java.util.concurrent.locks.LockSupport.parkNanos(this, XZx205DYe);
                    }
                }
            }
        } finally {
            _thread = null;
            AQHddgaEX();
            if (!Ye0N2xE9Hc()) {
                QPwENk36pDC();
            }
        }
    }

    @Override // defpackage.mu, defpackage.hu
    public final void shutdown() {
        debugStatus = 4;
        super.shutdown();
    }

    @Override // defpackage.nj
    public final java.lang.String toString() {
        return "DefaultExecutor";
    }
}
