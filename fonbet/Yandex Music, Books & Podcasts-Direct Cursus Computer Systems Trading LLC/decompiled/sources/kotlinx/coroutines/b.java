package kotlinx.coroutines;

import defpackage.m8j;
import defpackage.oib;
import defpackage.pib;
import defpackage.qa8;
import defpackage.rfs;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.LockSupport;
import kotlin.coroutines.CoroutineContext;

/* loaded from: classes5.dex */
public final class b extends c implements Runnable {
    private static volatile Thread _thread;
    private static volatile int debugStatus;
    public static final b k;
    public static final long l;

    static {
        Long l2;
        b bVar = new b();
        k = bVar;
        bVar.M0(false);
        try {
            l2 = Long.getLong("kotlinx.coroutines.DefaultExecutor.keepAlive", 1000L);
        } catch (SecurityException unused) {
            l2 = 1000L;
        }
        l = TimeUnit.MILLISECONDS.toNanos(l2.longValue());
    }

    @Override // defpackage.rib
    public final Thread L0() {
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
                thread.setContextClassLoader(k.getClass().getClassLoader());
                thread.setDaemon(true);
                thread.start();
            }
        }
        return thread;
    }

    @Override // defpackage.rib
    public final void P0(long j, pib pibVar) {
        throw new RejectedExecutionException("DefaultExecutor was shut down. This error indicates that Dispatchers.shutdown() was invoked prior to completion of exiting coroutines, leaving coroutines in incomplete state. Please refer to Dispatchers.shutdown documentation for more details");
    }

    @Override // kotlinx.coroutines.c
    public final void Q0(Runnable runnable) {
        if (debugStatus == 4) {
            throw new RejectedExecutionException("DefaultExecutor was shut down. This error indicates that Dispatchers.shutdown() was invoked prior to completion of exiting coroutines, leaving coroutines in incomplete state. Please refer to Dispatchers.shutdown documentation for more details");
        }
        super.Q0(runnable);
    }

    @Override // kotlinx.coroutines.c, defpackage.xu7
    public final qa8 S(long j, Runnable runnable, CoroutineContext coroutineContext) {
        long j2 = j > 0 ? j >= 9223372036854L ? Long.MAX_VALUE : 1000000 * j : 0L;
        if (j2 >= 4611686018427387903L) {
            return m8j.a;
        }
        long nanoTime = System.nanoTime();
        oib oibVar = new oib(runnable, j2 + nanoTime);
        U0(nanoTime, oibVar);
        return oibVar;
    }

    public final synchronized void V0() {
        int i = debugStatus;
        if (i == 2 || i == 3) {
            debugStatus = 3;
            c.h.set(this, null);
            c.i.set(this, null);
            notifyAll();
        }
    }

    @Override // java.lang.Runnable
    public final void run() {
        boolean T0;
        rfs.a.set(this);
        try {
            synchronized (this) {
                int i = debugStatus;
                if (i == 2 || i == 3) {
                    if (T0) {
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
                    long N0 = N0();
                    if (N0 == Long.MAX_VALUE) {
                        long nanoTime = System.nanoTime();
                        if (j == Long.MAX_VALUE) {
                            j = l + nanoTime;
                        }
                        long j2 = j - nanoTime;
                        if (j2 <= 0) {
                            _thread = null;
                            V0();
                            if (T0()) {
                                return;
                            }
                            L0();
                            return;
                        }
                        if (N0 > j2) {
                            N0 = j2;
                        }
                    } else {
                        j = Long.MAX_VALUE;
                    }
                    if (N0 > 0) {
                        int i2 = debugStatus;
                        if (i2 == 2 || i2 == 3) {
                            _thread = null;
                            V0();
                            if (T0()) {
                                return;
                            }
                            L0();
                            return;
                        }
                        LockSupport.parkNanos(this, N0);
                    }
                }
            }
        } finally {
            _thread = null;
            V0();
            if (!T0()) {
                L0();
            }
        }
    }

    @Override // kotlinx.coroutines.c, defpackage.rib
    public final void shutdown() {
        debugStatus = 4;
        super.shutdown();
    }

    @Override // kotlinx.coroutines.a
    public final String toString() {
        return "DefaultExecutor";
    }
}
