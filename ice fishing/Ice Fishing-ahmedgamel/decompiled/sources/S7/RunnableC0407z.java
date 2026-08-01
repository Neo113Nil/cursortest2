package S7;

import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.LockSupport;
import z7.InterfaceC5272i;

/* renamed from: S7.z, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class RunnableC0407z extends O implements Runnable {

    /* renamed from: C, reason: collision with root package name */
    public static final RunnableC0407z f3016C;

    /* renamed from: D, reason: collision with root package name */
    public static final long f3017D;
    private static volatile Thread _thread;
    private static volatile int debugStatus;

    static {
        Long l9;
        RunnableC0407z runnableC0407z = new RunnableC0407z();
        f3016C = runnableC0407z;
        runnableC0407z.D(false);
        TimeUnit timeUnit = TimeUnit.MILLISECONDS;
        try {
            l9 = Long.getLong("kotlinx.coroutines.DefaultExecutor.keepAlive", 1000L);
        } catch (SecurityException unused) {
            l9 = 1000L;
        }
        f3017D = timeUnit.toNanos(l9.longValue());
    }

    @Override // S7.P
    public final Thread C() {
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
                thread.setContextClassLoader(RunnableC0407z.class.getClassLoader());
                thread.setDaemon(true);
                thread.start();
            }
        }
        return thread;
    }

    @Override // S7.P
    public final void G(long j6, M m4) {
        throw new RejectedExecutionException("DefaultExecutor was shut down. This error indicates that Dispatchers.shutdown() was invoked prior to completion of exiting coroutines, leaving coroutines in incomplete state. Please refer to Dispatchers.shutdown documentation for more details");
    }

    @Override // S7.O
    public final void H(Runnable runnable) {
        if (debugStatus == 4) {
            throw new RejectedExecutionException("DefaultExecutor was shut down. This error indicates that Dispatchers.shutdown() was invoked prior to completion of exiting coroutines, leaving coroutines in incomplete state. Please refer to Dispatchers.shutdown documentation for more details");
        }
        super.H(runnable);
    }

    public final synchronized void V() {
        int i = debugStatus;
        if (i == 2 || i == 3) {
            debugStatus = 3;
            O.f2930z.set(this, null);
            O.f2928A.set(this, null);
            notifyAll();
        }
    }

    @Override // S7.O, S7.C
    public final H b(long j6, t0 t0Var, InterfaceC5272i interfaceC5272i) {
        long j9 = j6 > 0 ? j6 >= 9223372036854L ? Long.MAX_VALUE : 1000000 * j6 : 0L;
        if (j9 >= 4611686018427387903L) {
            return l0.f2976n;
        }
        long nanoTime = System.nanoTime();
        L l9 = new L(j9 + nanoTime, t0Var);
        K(nanoTime, l9);
        return l9;
    }

    @Override // java.lang.Runnable
    public final void run() {
        boolean J;
        q0.f2984a.set(this);
        try {
            synchronized (this) {
                int i = debugStatus;
                if (i == 2 || i == 3) {
                    if (J) {
                        return;
                    } else {
                        return;
                    }
                }
                debugStatus = 1;
                notifyAll();
                long j6 = Long.MAX_VALUE;
                while (true) {
                    Thread.interrupted();
                    long E8 = E();
                    if (E8 == Long.MAX_VALUE) {
                        long nanoTime = System.nanoTime();
                        if (j6 == Long.MAX_VALUE) {
                            j6 = f3017D + nanoTime;
                        }
                        long j9 = j6 - nanoTime;
                        if (j9 <= 0) {
                            _thread = null;
                            V();
                            if (J()) {
                                return;
                            }
                            C();
                            return;
                        }
                        if (E8 > j9) {
                            E8 = j9;
                        }
                    } else {
                        j6 = Long.MAX_VALUE;
                    }
                    if (E8 > 0) {
                        int i6 = debugStatus;
                        if (i6 == 2 || i6 == 3) {
                            _thread = null;
                            V();
                            if (J()) {
                                return;
                            }
                            C();
                            return;
                        }
                        LockSupport.parkNanos(this, E8);
                    }
                }
            }
        } finally {
            _thread = null;
            V();
            if (!J()) {
                C();
            }
        }
    }

    @Override // S7.O, S7.P
    public final void shutdown() {
        debugStatus = 4;
        super.shutdown();
    }
}
