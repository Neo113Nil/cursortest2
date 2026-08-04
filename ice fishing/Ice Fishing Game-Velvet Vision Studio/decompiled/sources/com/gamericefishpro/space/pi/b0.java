package com.gamericefishpro.space.pi;

import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.LockSupport;
import kotlin.coroutines.CoroutineContext;

/* JADX INFO: compiled from: r8-map-id-020a1517951ead57be77a6b773195444ecc812bf491d4c7c9fe6933b01540740 */
/* JADX INFO: loaded from: classes.dex */
public final class b0 extends t0 implements Runnable {
    public static final b0 C;
    public static final long D;
    private static volatile Thread _thread;
    private static volatile int debugStatus;

    static {
        Long l;
        b0 b0Var = new b0();
        C = b0Var;
        b0Var.W(false);
        TimeUnit timeUnit = TimeUnit.MILLISECONDS;
        try {
            l = Long.getLong("kotlinx.coroutines.DefaultExecutor.keepAlive", 1000L);
        } catch (SecurityException unused) {
            l = 1000L;
        }
        D = timeUnit.toNanos(l.longValue());
    }

    @Override // com.gamericefishpro.space.pi.u0
    public final Thread V() {
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
                thread.setContextClassLoader(C.getClass().getClassLoader());
                thread.setDaemon(true);
                thread.start();
            }
        }
        return thread;
    }

    @Override // com.gamericefishpro.space.pi.u0
    public final void Z(long j, r0 r0Var) {
        throw new RejectedExecutionException("DefaultExecutor was shut down. This error indicates that Dispatchers.shutdown() was invoked prior to completion of exiting coroutines, leaving coroutines in incomplete state. Please refer to Dispatchers.shutdown documentation for more details");
    }

    @Override // com.gamericefishpro.space.pi.t0
    public final void a0(Runnable runnable) {
        if (debugStatus == 4) {
            throw new RejectedExecutionException("DefaultExecutor was shut down. This error indicates that Dispatchers.shutdown() was invoked prior to completion of exiting coroutines, leaving coroutines in incomplete state. Please refer to Dispatchers.shutdown documentation for more details");
        }
        super.a0(runnable);
    }

    public final synchronized void f0() {
        int i = debugStatus;
        if (i == 2 || i == 3) {
            debugStatus = 3;
            t0.z.set(this, null);
            t0.A.set(this, null);
            notifyAll();
        }
    }

    @Override // com.gamericefishpro.space.pi.t0, com.gamericefishpro.space.pi.f0
    public final m0 l(long j, z1 z1Var, CoroutineContext coroutineContext) {
        long j2 = 0;
        if (j > 0) {
            j2 = j >= 9223372036854L ? Long.MAX_VALUE : 1000000 * j;
        }
        if (j2 >= 4611686018427387903L) {
            return p1.d;
        }
        long jNanoTime = System.nanoTime();
        q0 q0Var = new q0(j2 + jNanoTime, z1Var);
        e0(jNanoTime, q0Var);
        return q0Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        w1.a.set(this);
        try {
            synchronized (this) {
                int i = debugStatus;
                if (i == 2 || i == 3) {
                    _thread = null;
                    f0();
                    if (d0()) {
                        return;
                    }
                    V();
                    return;
                }
                debugStatus = 1;
                notifyAll();
                long j = Long.MAX_VALUE;
                while (true) {
                    Thread.interrupted();
                    long jX = X();
                    if (jX == Long.MAX_VALUE) {
                        long jNanoTime = System.nanoTime();
                        if (j == Long.MAX_VALUE) {
                            j = D + jNanoTime;
                        }
                        long j2 = j - jNanoTime;
                        if (j2 <= 0) {
                            _thread = null;
                            f0();
                            if (d0()) {
                                return;
                            }
                            V();
                            return;
                        }
                        if (jX > j2) {
                            jX = j2;
                        }
                    } else {
                        j = Long.MAX_VALUE;
                    }
                    if (jX > 0) {
                        int i2 = debugStatus;
                        if (i2 == 2 || i2 == 3) {
                            _thread = null;
                            f0();
                            if (d0()) {
                                return;
                            }
                            V();
                            return;
                        }
                        LockSupport.parkNanos(this, jX);
                    }
                }
            }
        } catch (Throwable th) {
            _thread = null;
            f0();
            if (!d0()) {
                V();
            }
            throw th;
        }
    }

    @Override // com.gamericefishpro.space.pi.t0, com.gamericefishpro.space.pi.u0
    public final void shutdown() {
        debugStatus = 4;
        super.shutdown();
    }

    @Override // com.gamericefishpro.space.pi.t
    public final String toString() {
        return "DefaultExecutor";
    }
}
