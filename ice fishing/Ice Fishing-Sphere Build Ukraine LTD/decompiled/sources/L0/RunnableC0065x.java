package L0;

import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.LockSupport;

/* renamed from: L0.x, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class RunnableC0065x extends H implements Runnable {
    private static volatile Thread _thread;
    private static volatile int debugStatus;

    /* renamed from: n, reason: collision with root package name */
    public static final RunnableC0065x f692n;

    /* renamed from: o, reason: collision with root package name */
    public static final long f693o;

    static {
        Long l2;
        RunnableC0065x runnableC0065x = new RunnableC0065x();
        f692n = runnableC0065x;
        runnableC0065x.j(false);
        TimeUnit timeUnit = TimeUnit.MILLISECONDS;
        try {
            l2 = Long.getLong("kotlinx.coroutines.DefaultExecutor.keepAlive", 1000L);
        } catch (SecurityException unused) {
            l2 = 1000L;
        }
        f693o = timeUnit.toNanos(l2.longValue());
    }

    @Override // L0.I
    public final Thread h() {
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

    @Override // L0.H, L0.I
    public final void n() {
        debugStatus = 4;
        super.n();
    }

    @Override // L0.H
    public final void o(Runnable runnable) {
        if (debugStatus == 4) {
            throw new RejectedExecutionException("DefaultExecutor was shut down. This error indicates that Dispatchers.shutdown() was invoked prior to completion of exiting coroutines, leaving coroutines in incomplete state. Please refer to Dispatchers.shutdown documentation for more details");
        }
        super.o(runnable);
    }

    public final synchronized void q() {
        int i2 = debugStatus;
        if (i2 == 2 || i2 == 3) {
            debugStatus = 3;
            H.f615k.set(this, null);
            H.f616l.set(this, null);
            notifyAll();
        }
    }

    @Override // java.lang.Runnable
    public final void run() {
        boolean p2;
        i0.f660a.set(this);
        try {
            synchronized (this) {
                int i2 = debugStatus;
                if (i2 == 2 || i2 == 3) {
                    if (p2) {
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
                    long k2 = k();
                    if (k2 == Long.MAX_VALUE) {
                        long nanoTime = System.nanoTime();
                        if (j2 == Long.MAX_VALUE) {
                            j2 = f693o + nanoTime;
                        }
                        long j3 = j2 - nanoTime;
                        if (j3 <= 0) {
                            _thread = null;
                            q();
                            if (p()) {
                                return;
                            }
                            h();
                            return;
                        }
                        if (k2 > j3) {
                            k2 = j3;
                        }
                    } else {
                        j2 = Long.MAX_VALUE;
                    }
                    if (k2 > 0) {
                        int i3 = debugStatus;
                        if (i3 == 2 || i3 == 3) {
                            _thread = null;
                            q();
                            if (p()) {
                                return;
                            }
                            h();
                            return;
                        }
                        LockSupport.parkNanos(this, k2);
                    }
                }
            }
        } finally {
            _thread = null;
            q();
            if (!p()) {
                h();
            }
        }
    }
}
