package com.google.android.gms.internal.ads;

import java.util.concurrent.atomic.AtomicReference;
import java.util.concurrent.locks.LockSupport;

/* loaded from: classes2.dex */
public abstract class QD extends AtomicReference implements Runnable {

    /* renamed from: n, reason: collision with root package name */
    public static final U6 f27128n = new U6(9);

    /* renamed from: u, reason: collision with root package name */
    public static final U6 f27129u = new U6(9);

    public abstract Object a();

    public final void b(Thread thread) {
        Runnable runnable = (Runnable) get();
        PD pd = null;
        boolean z8 = false;
        int i = 0;
        while (true) {
            boolean z9 = runnable instanceof PD;
            U6 u62 = f27129u;
            if (!z9) {
                if (runnable != u62) {
                    break;
                }
            } else {
                pd = (PD) runnable;
            }
            i++;
            if (i <= 1000) {
                Thread.yield();
            } else if (runnable == u62 || compareAndSet(runnable, u62)) {
                z8 = Thread.interrupted() || z8;
                LockSupport.park(pd);
            }
            runnable = (Runnable) get();
        }
        if (z8) {
            thread.interrupt();
        }
    }

    public abstract String c();

    public abstract boolean d();

    public abstract void e(Object obj);

    public abstract void f(Throwable th);

    public final void g() {
        U6 u62 = f27129u;
        U6 u63 = f27128n;
        Runnable runnable = (Runnable) get();
        if (runnable instanceof Thread) {
            PD pd = new PD(this);
            pd.a(Thread.currentThread());
            if (compareAndSet(runnable, pd)) {
                try {
                    Thread thread = (Thread) runnable;
                    thread.interrupt();
                    if (((Runnable) getAndSet(u63)) == u62) {
                        LockSupport.unpark(thread);
                    }
                } catch (Throwable th) {
                    if (((Runnable) getAndSet(u63)) == u62) {
                        LockSupport.unpark((Thread) runnable);
                    }
                    throw th;
                }
            }
        }
    }

    @Override // java.lang.Runnable
    public final void run() {
        Thread currentThread = Thread.currentThread();
        Object obj = null;
        if (compareAndSet(null, currentThread)) {
            boolean d2 = d();
            U6 u62 = f27128n;
            if (!d2) {
                try {
                    obj = a();
                } catch (Throwable th) {
                    try {
                        if (th instanceof InterruptedException) {
                            Thread.currentThread().interrupt();
                        }
                        if (!compareAndSet(currentThread, u62)) {
                            b(currentThread);
                        }
                        f(th);
                        return;
                    } catch (Throwable th2) {
                        if (!compareAndSet(currentThread, u62)) {
                            b(currentThread);
                        }
                        e(null);
                        throw th2;
                    }
                }
            }
            if (!compareAndSet(currentThread, u62)) {
                b(currentThread);
            }
            if (d2) {
                return;
            }
            e(obj);
        }
    }

    @Override // java.util.concurrent.atomic.AtomicReference
    public final String toString() {
        String str;
        Runnable runnable = (Runnable) get();
        if (runnable == f27128n) {
            str = "running=[DONE]";
        } else if (runnable instanceof PD) {
            str = "running=[INTERRUPTED]";
        } else if (runnable instanceof Thread) {
            String name = ((Thread) runnable).getName();
            str = D.y.o(new StringBuilder(String.valueOf(name).length() + 21), "running=[RUNNING ON ", name, "]");
        } else {
            str = "running=[NOT STARTED YET]";
        }
        String c4 = c();
        return D.y.o(new StringBuilder(str.length() + 2 + String.valueOf(c4).length()), str, ", ", c4);
    }
}
