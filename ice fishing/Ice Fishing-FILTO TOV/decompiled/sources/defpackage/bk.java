package defpackage;

import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.LockSupport;

/* compiled from: r8-map-id-f07502904ffb6c7cfc104556b013e0e48cd078697d1e7ebb5294e50317be4258 */
/* loaded from: classes.dex */
public final class bk extends vq implements Runnable {
    public static final bk WIEu4Ya2g8;
    public static final long YmKjaVtbfp5Z;
    private static volatile Thread _thread;
    private static volatile int debugStatus;

    static {
        Long l;
        bk bkVar = new bk();
        WIEu4Ya2g8 = bkVar;
        bkVar.XnEVoBF0td1l(false);
        try {
            l = Long.getLong("kotlinx.coroutines.DefaultExecutor.keepAlive", 1000L);
        } catch (SecurityException unused) {
            l = 1000L;
        }
        YmKjaVtbfp5Z = TimeUnit.MILLISECONDS.toNanos(l.longValue());
    }

    @Override // defpackage.vq
    public final void AEn1Rrio(long j, tq tqVar) {
        throw new RejectedExecutionException("DefaultExecutor was shut down. This error indicates that Dispatchers.shutdown() was invoked prior to completion of exiting coroutines, leaving coroutines in incomplete state. Please refer to Dispatchers.shutdown documentation for more details");
    }

    @Override // defpackage.vq
    public final Thread EXrPz3p7hFb() {
        Thread thread;
        Thread thread2 = _thread;
        if (thread2 != null) {
            return thread2;
        }
        synchronized (this) {
            thread = _thread;
            if (thread == null) {
                thread = new Thread(this, "kotlinx.coroutines.DefaultExecutor");
                _thread = thread;
                thread.setContextClassLoader(WIEu4Ya2g8.getClass().getClassLoader());
                thread.setDaemon(true);
                thread.start();
            }
        }
        return thread;
    }

    public final synchronized void HFYAaqMd6() {
        int i = debugStatus;
        if (i == 2 || i == 3) {
            debugStatus = 3;
            eUH21U3apd();
            notifyAll();
        }
    }

    @Override // defpackage.vq, defpackage.wk
    public final um X1lG3V04pd(long j, r91 r91Var, gh ghVar) {
        long j2 = j > 0 ? j >= 9223372036854L ? Long.MAX_VALUE : 1000000 * j : 0L;
        if (j2 >= 4611686018427387903L) {
            return ik0.OOA6hdeuvCS;
        }
        long nanoTime = System.nanoTime();
        sq sqVar = new sq(j2 + nanoTime, r91Var);
        A1EKNP6CxJ(nanoTime, sqVar);
        return sqVar;
    }

    @Override // defpackage.vq
    public final void arNh8D4Z5gB(Runnable runnable) {
        if (debugStatus == 4) {
            throw new RejectedExecutionException("DefaultExecutor was shut down. This error indicates that Dispatchers.shutdown() was invoked prior to completion of exiting coroutines, leaving coroutines in incomplete state. Please refer to Dispatchers.shutdown documentation for more details");
        }
        super.arNh8D4Z5gB(runnable);
    }

    @Override // java.lang.Runnable
    public final void run() {
        boolean ozMwhSAI;
        d91.GWasM1elztuh.set(this);
        try {
            synchronized (this) {
                int i = debugStatus;
                if (i == 2 || i == 3) {
                    if (ozMwhSAI) {
                        return;
                    } else {
                        return;
                    }
                }
                debugStatus = 1;
                notifyAll();
                long j = Long.MAX_VALUE;
                while (true) {
                    Thread.interrupted();
                    long YmKjaVtbfp5Z2 = YmKjaVtbfp5Z();
                    if (YmKjaVtbfp5Z2 == Long.MAX_VALUE) {
                        long nanoTime = System.nanoTime();
                        if (j == Long.MAX_VALUE) {
                            j = YmKjaVtbfp5Z + nanoTime;
                        }
                        long j2 = j - nanoTime;
                        if (j2 <= 0) {
                            _thread = null;
                            HFYAaqMd6();
                            if (ozMwhSAI()) {
                                return;
                            }
                            EXrPz3p7hFb();
                            return;
                        }
                        if (YmKjaVtbfp5Z2 > j2) {
                            YmKjaVtbfp5Z2 = j2;
                        }
                    } else {
                        j = Long.MAX_VALUE;
                    }
                    if (YmKjaVtbfp5Z2 > 0) {
                        int i2 = debugStatus;
                        if (i2 == 2 || i2 == 3) {
                            _thread = null;
                            HFYAaqMd6();
                            if (ozMwhSAI()) {
                                return;
                            }
                            EXrPz3p7hFb();
                            return;
                        }
                        LockSupport.parkNanos(this, YmKjaVtbfp5Z2);
                    }
                }
            }
        } finally {
            _thread = null;
            HFYAaqMd6();
            if (!ozMwhSAI()) {
                EXrPz3p7hFb();
            }
        }
    }

    @Override // defpackage.vq, defpackage.qq
    public final void shutdown() {
        debugStatus = 4;
        super.shutdown();
    }

    @Override // defpackage.ih
    public final String toString() {
        return "DefaultExecutor";
    }
}
