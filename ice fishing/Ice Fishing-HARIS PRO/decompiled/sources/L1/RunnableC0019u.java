package L1;

import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.LockSupport;

/* renamed from: L1.u, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class RunnableC0019u extends D implements Runnable {
    private static volatile Thread _thread;
    private static volatile int debugStatus;
    public static final RunnableC0019u i;
    public static final long j;

    static {
        Long l2;
        RunnableC0019u runnableC0019u = new RunnableC0019u();
        i = runnableC0019u;
        runnableC0019u.j(false);
        TimeUnit timeUnit = TimeUnit.MILLISECONDS;
        try {
            l2 = Long.getLong("kotlinx.coroutines.DefaultExecutor.keepAlive", 1000L);
        } catch (SecurityException unused) {
            l2 = 1000L;
        }
        j = timeUnit.toNanos(l2.longValue());
    }

    @Override // L1.E
    public final Thread i() {
        Thread thread = _thread;
        if (thread == null) {
            synchronized (this) {
                thread = _thread;
                if (thread == null) {
                    thread = new Thread(this, "kotlinx.coroutines.DefaultExecutor");
                    _thread = thread;
                    thread.setDaemon(true);
                    thread.start();
                }
            }
        }
        return thread;
    }

    @Override // L1.D, L1.E
    public final void l() {
        debugStatus = 4;
        super.l();
    }

    @Override // L1.D
    public final void m(Runnable runnable) {
        if (debugStatus == 4) {
            throw new RejectedExecutionException("DefaultExecutor was shut down. This error indicates that Dispatchers.shutdown() was invoked prior to completion of exiting coroutines, leaving coroutines in incomplete state. Please refer to Dispatchers.shutdown documentation for more details");
        }
        super.m(runnable);
    }

    public final synchronized void p() {
        int i2 = debugStatus;
        if (i2 == 2 || i2 == 3) {
            debugStatus = 3;
            D.f526f.set(this, null);
            D.f527g.set(this, null);
            notifyAll();
        }
    }

    @Override // java.lang.Runnable
    public final void run() {
        boolean n2;
        a0.f552a.set(this);
        try {
            synchronized (this) {
                int i2 = debugStatus;
                if (i2 == 2 || i2 == 3) {
                    if (n2) {
                        return;
                    } else {
                        return;
                    }
                }
                debugStatus = 1;
                notifyAll();
                long j2 = Long.MAX_VALUE;
                while (true) {
                    Thread.interrupted();
                    long o2 = o();
                    if (o2 == Long.MAX_VALUE) {
                        long nanoTime = System.nanoTime();
                        if (j2 == Long.MAX_VALUE) {
                            j2 = j + nanoTime;
                        }
                        long j3 = j2 - nanoTime;
                        if (j3 <= 0) {
                            _thread = null;
                            p();
                            if (n()) {
                                return;
                            }
                            i();
                            return;
                        }
                        if (o2 > j3) {
                            o2 = j3;
                        }
                    } else {
                        j2 = Long.MAX_VALUE;
                    }
                    if (o2 > 0) {
                        int i3 = debugStatus;
                        if (i3 == 2 || i3 == 3) {
                            _thread = null;
                            p();
                            if (n()) {
                                return;
                            }
                            i();
                            return;
                        }
                        LockSupport.parkNanos(this, o2);
                    }
                }
            }
        } finally {
            _thread = null;
            p();
            if (!n()) {
                i();
            }
        }
    }
}
