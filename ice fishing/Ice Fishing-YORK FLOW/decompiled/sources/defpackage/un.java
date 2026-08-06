package defpackage;

/* compiled from: r8-map-id-5e15bf382d9e1cc682b2b5d208f848646545054061ee84effb1e415a0540fc32 */
/* loaded from: classes.dex */
public final class un extends defpackage.aw implements java.lang.Runnable {
    public static final long WmetiUbpKU9I;
    public static final defpackage.un XntWc4eZSQ8j;
    private static volatile java.lang.Thread _thread;
    private static volatile int debugStatus;

    static {
        java.lang.Long l;
        defpackage.un unVar = new defpackage.un();
        XntWc4eZSQ8j = unVar;
        unVar.hH0RRJrNssvh(false);
        try {
            l = java.lang.Long.getLong("kotlinx.coroutines.DefaultExecutor.keepAlive", 1000L);
        } catch (java.lang.SecurityException unused) {
            l = 1000L;
        }
        WmetiUbpKU9I = java.util.concurrent.TimeUnit.MILLISECONDS.toNanos(l.longValue());
    }

    @Override // defpackage.aw
    public final java.lang.Thread CZa7MwI9IzLd() {
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
                thread.setContextClassLoader(XntWc4eZSQ8j.getClass().getClassLoader());
                thread.setDaemon(true);
                thread.start();
            }
        }
        return thread;
    }

    @Override // defpackage.aw, defpackage.uo
    public final defpackage.cr QiMR8OkAhezm(long j, defpackage.ho1 ho1Var, defpackage.jm jmVar) {
        long j2 = j > 0 ? j >= 9223372036854L ? Long.MAX_VALUE : 1000000 * j : 0L;
        if (j2 >= 4611686018427387903L) {
            return defpackage.zr0.WDYagTQQm9ns;
        }
        long nanoTime = java.lang.System.nanoTime();
        defpackage.xv xvVar = new defpackage.xv(j2 + nanoTime, ho1Var);
        GoIRkIe1iwj6(nanoTime, xvVar);
        return xvVar;
    }

    public final synchronized void Rl68HURFBtL3() {
        int i = debugStatus;
        if (i == 2 || i == 3) {
            debugStatus = 3;
            PS16moFv2oLu();
            notifyAll();
        }
    }

    @Override // defpackage.aw
    public final void Wc0TdmRSwbbi(java.lang.Runnable runnable) {
        if (debugStatus == 4) {
            throw new java.util.concurrent.RejectedExecutionException("DefaultExecutor was shut down. This error indicates that Dispatchers.shutdown() was invoked prior to completion of exiting coroutines, leaving coroutines in incomplete state. Please refer to Dispatchers.shutdown documentation for more details");
        }
        super.Wc0TdmRSwbbi(runnable);
    }

    @Override // java.lang.Runnable
    public final void run() {
        boolean EPEWHACkMcF1;
        defpackage.xn1.ZpBGe2uQfcn8.set(this);
        try {
            synchronized (this) {
                int i = debugStatus;
                if (i == 2 || i == 3) {
                    if (EPEWHACkMcF1) {
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
                    long GcLuU6pT9wO9 = GcLuU6pT9wO9();
                    if (GcLuU6pT9wO9 == Long.MAX_VALUE) {
                        long nanoTime = java.lang.System.nanoTime();
                        if (j == Long.MAX_VALUE) {
                            j = WmetiUbpKU9I + nanoTime;
                        }
                        long j2 = j - nanoTime;
                        if (j2 <= 0) {
                            _thread = null;
                            Rl68HURFBtL3();
                            if (EPEWHACkMcF1()) {
                                return;
                            }
                            CZa7MwI9IzLd();
                            return;
                        }
                        if (GcLuU6pT9wO9 > j2) {
                            GcLuU6pT9wO9 = j2;
                        }
                    } else {
                        j = Long.MAX_VALUE;
                    }
                    if (GcLuU6pT9wO9 > 0) {
                        int i2 = debugStatus;
                        if (i2 == 2 || i2 == 3) {
                            _thread = null;
                            Rl68HURFBtL3();
                            if (EPEWHACkMcF1()) {
                                return;
                            }
                            CZa7MwI9IzLd();
                            return;
                        }
                        java.util.concurrent.locks.LockSupport.parkNanos(this, GcLuU6pT9wO9);
                    }
                }
            }
        } finally {
            _thread = null;
            Rl68HURFBtL3();
            if (!EPEWHACkMcF1()) {
                CZa7MwI9IzLd();
            }
        }
    }

    @Override // defpackage.aw, defpackage.vv
    public final void shutdown() {
        debugStatus = 4;
        super.shutdown();
    }

    @Override // defpackage.lm
    public final java.lang.String toString() {
        return "DefaultExecutor";
    }

    @Override // defpackage.aw
    public final void z16KqenTjq8o(long j, defpackage.yv yvVar) {
        throw new java.util.concurrent.RejectedExecutionException("DefaultExecutor was shut down. This error indicates that Dispatchers.shutdown() was invoked prior to completion of exiting coroutines, leaving coroutines in incomplete state. Please refer to Dispatchers.shutdown documentation for more details");
    }
}
