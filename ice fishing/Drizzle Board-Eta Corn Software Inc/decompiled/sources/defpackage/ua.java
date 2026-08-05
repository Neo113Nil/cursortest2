package defpackage;

import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.LockSupport;
import sun.misc.Unsafe;

/* compiled from: r8-map-id-3663cbcef52f1a493ceac7deeb6c50e305d4d0c9f83e91180cb6ce540f71d6b5 */
/* loaded from: classes.dex */
public final class ua extends hg implements Runnable {
    public static final long OnDfzHZD;
    private static volatile Thread _thread;
    private static volatile int debugStatus;
    public static final ua ow5vqvCr;

    static {
        Long l;
        ua uaVar = new ua();
        ow5vqvCr = uaVar;
        uaVar.U0LaHZX7(false);
        try {
            l = Long.getLong("kotlinx.coroutines.DefaultExecutor.keepAlive", 1000L);
        } catch (SecurityException unused) {
            l = 1000L;
        }
        OnDfzHZD = TimeUnit.MILLISECONDS.toNanos(l.longValue());
    }

    @Override // defpackage.hg, defpackage.ub
    public final kd VgvYg0wo(long j, pc0 pc0Var, l9 l9Var) {
        long j2 = j > 0 ? j >= 9223372036854L ? Long.MAX_VALUE : 1000000 * j : 0L;
        if (j2 >= 4611686018427387903L) {
            return hw.NCTxEWno;
        }
        long nanoTime = System.nanoTime();
        eg egVar = new eg(j2 + nanoTime, pc0Var);
        aZz0PFXp(nanoTime, egVar);
        return egVar;
    }

    @Override // defpackage.hg
    public final void VhgXwMj9(long j, fg fgVar) {
        throw new RejectedExecutionException("DefaultExecutor was shut down. This error indicates that Dispatchers.shutdown() was invoked prior to completion of exiting coroutines, leaving coroutines in incomplete state. Please refer to Dispatchers.shutdown documentation for more details");
    }

    public final synchronized void Xkz7p5xa() {
        int i = debugStatus;
        if (i == 2 || i == 3) {
            debugStatus = 3;
            Unsafe unsafe = b1.qoPGr6Ce;
            unsafe.putObjectVolatile(this, hg.eVhOlqcC, (Object) null);
            unsafe.putObjectVolatile(this, hg.Qr9iLBAD, (Object) null);
            notifyAll();
        }
    }

    @Override // defpackage.hg
    public final Thread eIA6dogk() {
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
                thread.setContextClassLoader(ow5vqvCr.getClass().getClassLoader());
                thread.setDaemon(true);
                thread.start();
            }
        }
        return thread;
    }

    @Override // defpackage.hg
    public final void euDDoUNr(Runnable runnable) {
        if (debugStatus == 4) {
            throw new RejectedExecutionException("DefaultExecutor was shut down. This error indicates that Dispatchers.shutdown() was invoked prior to completion of exiting coroutines, leaving coroutines in incomplete state. Please refer to Dispatchers.shutdown documentation for more details");
        }
        super.euDDoUNr(runnable);
    }

    @Override // java.lang.Runnable
    public final void run() {
        boolean pRiPUEwG;
        kc0.qoPGr6Ce.set(this);
        try {
            synchronized (this) {
                int i = debugStatus;
                if (i == 2 || i == 3) {
                    if (pRiPUEwG) {
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
                    long i7xS8jrb = i7xS8jrb();
                    if (i7xS8jrb == Long.MAX_VALUE) {
                        long nanoTime = System.nanoTime();
                        if (j == Long.MAX_VALUE) {
                            j = OnDfzHZD + nanoTime;
                        }
                        long j2 = j - nanoTime;
                        if (j2 <= 0) {
                            _thread = null;
                            Xkz7p5xa();
                            if (pRiPUEwG()) {
                                return;
                            }
                            eIA6dogk();
                            return;
                        }
                        if (i7xS8jrb > j2) {
                            i7xS8jrb = j2;
                        }
                    } else {
                        j = Long.MAX_VALUE;
                    }
                    if (i7xS8jrb > 0) {
                        int i2 = debugStatus;
                        if (i2 == 2 || i2 == 3) {
                            _thread = null;
                            Xkz7p5xa();
                            if (pRiPUEwG()) {
                                return;
                            }
                            eIA6dogk();
                            return;
                        }
                        LockSupport.parkNanos(this, i7xS8jrb);
                    }
                }
            }
        } finally {
            _thread = null;
            Xkz7p5xa();
            if (!pRiPUEwG()) {
                eIA6dogk();
            }
        }
    }

    @Override // defpackage.hg, defpackage.cg
    public final void shutdown() {
        debugStatus = 4;
        super.shutdown();
    }

    @Override // defpackage.n9
    public final String toString() {
        return "DefaultExecutor";
    }
}
