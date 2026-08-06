package A1;

import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.LockSupport;

/* renamed from: A1.y, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class RunnableC0023y extends I implements Runnable {
    private static volatile Thread _thread;
    private static volatile int debugStatus;

    /* renamed from: j, reason: collision with root package name */
    public static final RunnableC0023y f83j;

    /* renamed from: k, reason: collision with root package name */
    public static final long f84k;

    static {
        Long l2;
        RunnableC0023y runnableC0023y = new RunnableC0023y();
        f83j = runnableC0023y;
        runnableC0023y.q(false);
        TimeUnit timeUnit = TimeUnit.MILLISECONDS;
        try {
            l2 = Long.getLong("kotlinx.coroutines.DefaultExecutor.keepAlive", 1000L);
        } catch (SecurityException unused) {
            l2 = 1000L;
        }
        f84k = timeUnit.toNanos(l2.longValue());
    }

    @Override // A1.J
    public final Thread p() {
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

    @Override // java.lang.Runnable
    public final void run() {
        boolean v2;
        j0.f52a.set(this);
        try {
            synchronized (this) {
                int i2 = debugStatus;
                if (i2 == 2 || i2 == 3) {
                    if (v2) {
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
                    long r2 = r();
                    if (r2 == Long.MAX_VALUE) {
                        long nanoTime = System.nanoTime();
                        if (j2 == Long.MAX_VALUE) {
                            j2 = f84k + nanoTime;
                        }
                        long j3 = j2 - nanoTime;
                        if (j3 <= 0) {
                            _thread = null;
                            w();
                            if (v()) {
                                return;
                            }
                            p();
                            return;
                        }
                        if (r2 > j3) {
                            r2 = j3;
                        }
                    } else {
                        j2 = Long.MAX_VALUE;
                    }
                    if (r2 > 0) {
                        int i3 = debugStatus;
                        if (i3 == 2 || i3 == 3) {
                            _thread = null;
                            w();
                            if (v()) {
                                return;
                            }
                            p();
                            return;
                        }
                        LockSupport.parkNanos(this, r2);
                    }
                }
            }
        } finally {
            _thread = null;
            w();
            if (!v()) {
                p();
            }
        }
    }

    @Override // A1.I, A1.J
    public final void t() {
        debugStatus = 4;
        super.t();
    }

    @Override // A1.I
    public final void u(Runnable runnable) {
        if (debugStatus == 4) {
            throw new RejectedExecutionException("DefaultExecutor was shut down. This error indicates that Dispatchers.shutdown() was invoked prior to completion of exiting coroutines, leaving coroutines in incomplete state. Please refer to Dispatchers.shutdown documentation for more details");
        }
        super.u(runnable);
    }

    public final synchronized void w() {
        int i2 = debugStatus;
        if (i2 == 2 || i2 == 3) {
            debugStatus = 3;
            I.f6g.set(this, null);
            I.f7h.set(this, null);
            notifyAll();
        }
    }
}
