package yc;

import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.LockSupport;

/* compiled from: r8-map-id-9ca073bbfde00f50be8682633edd5c48170ffeeeebc591f4c22ad3deaafa0d20 */
/* loaded from: classes.dex */
public final class b0 extends r0 implements Runnable {
    private static volatile Thread _thread;
    private static volatile int debugStatus;

    /* renamed from: p, reason: collision with root package name */
    public static final b0 f8832p;

    /* renamed from: q, reason: collision with root package name */
    public static final long f8833q;

    static {
        Long l10;
        b0 b0Var = new b0();
        f8832p = b0Var;
        b0Var.C(false);
        TimeUnit timeUnit = TimeUnit.MILLISECONDS;
        try {
            l10 = Long.getLong("kotlinx.coroutines.DefaultExecutor.keepAlive", 1000L);
        } catch (SecurityException unused) {
            l10 = 1000L;
        }
        f8833q = timeUnit.toNanos(l10.longValue());
    }

    @Override // yc.s0
    public final Thread B() {
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
                thread.setContextClassLoader(b0.class.getClassLoader());
                thread.setDaemon(true);
                thread.start();
            }
        }
        return thread;
    }

    @Override // yc.s0
    public final void F(long j3, p0 p0Var) {
        throw new RejectedExecutionException("DefaultExecutor was shut down. This error indicates that Dispatchers.shutdown() was invoked prior to completion of exiting coroutines, leaving coroutines in incomplete state. Please refer to Dispatchers.shutdown documentation for more details");
    }

    @Override // yc.r0
    public final void G(Runnable runnable) {
        if (debugStatus == 4) {
            throw new RejectedExecutionException("DefaultExecutor was shut down. This error indicates that Dispatchers.shutdown() was invoked prior to completion of exiting coroutines, leaving coroutines in incomplete state. Please refer to Dispatchers.shutdown documentation for more details");
        }
        super.G(runnable);
    }

    public final synchronized void K() {
        int i10 = debugStatus;
        if (i10 == 2 || i10 == 3) {
            debugStatus = 3;
            r0.f8896m.set(this, null);
            r0.f8897n.set(this, null);
            notifyAll();
        }
    }

    @Override // yc.r0, yc.f0
    public final k0 f(long j3, w1 w1Var, fc.i iVar) {
        long j6 = j3 > 0 ? j3 >= 9223372036854L ? Long.MAX_VALUE : 1000000 * j3 : 0L;
        if (j6 >= 4611686018427387903L) {
            return o1.f8887g;
        }
        long nanoTime = System.nanoTime();
        o0 o0Var = new o0(j6 + nanoTime, w1Var);
        J(nanoTime, o0Var);
        return o0Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        boolean I;
        u1.f8908a.set(this);
        try {
            synchronized (this) {
                int i10 = debugStatus;
                if (i10 == 2 || i10 == 3) {
                    if (I) {
                        return;
                    } else {
                        return;
                    }
                }
                debugStatus = 1;
                notifyAll();
                long j3 = Long.MAX_VALUE;
                while (true) {
                    Thread.interrupted();
                    long D = D();
                    if (D == Long.MAX_VALUE) {
                        long nanoTime = System.nanoTime();
                        if (j3 == Long.MAX_VALUE) {
                            j3 = f8833q + nanoTime;
                        }
                        long j6 = j3 - nanoTime;
                        if (j6 <= 0) {
                            _thread = null;
                            K();
                            if (I()) {
                                return;
                            }
                            B();
                            return;
                        }
                        if (D > j6) {
                            D = j6;
                        }
                    } else {
                        j3 = Long.MAX_VALUE;
                    }
                    if (D > 0) {
                        int i11 = debugStatus;
                        if (i11 == 2 || i11 == 3) {
                            _thread = null;
                            K();
                            if (I()) {
                                return;
                            }
                            B();
                            return;
                        }
                        LockSupport.parkNanos(this, D);
                    }
                }
            }
        } finally {
            _thread = null;
            K();
            if (!I()) {
                B();
            }
        }
    }

    @Override // yc.r0, yc.s0
    public final void shutdown() {
        debugStatus = 4;
        super.shutdown();
    }
}
