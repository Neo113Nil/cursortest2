package com.google.android.gms.internal.ads;

import java.util.concurrent.atomic.AtomicReference;
import java.util.concurrent.locks.LockSupport;

/* loaded from: classes2.dex */
public abstract class PD extends AtomicReference implements Runnable {

    /* renamed from: n, reason: collision with root package name */
    public static final Y6 f26747n = new Y6(9);

    /* renamed from: u, reason: collision with root package name */
    public static final Y6 f26748u = new Y6(9);

    public abstract Object a();

    public final void b(Thread thread) {
        Runnable runnable = (Runnable) get();
        OD od = null;
        boolean z3 = false;
        int i = 0;
        while (true) {
            boolean z6 = runnable instanceof OD;
            Y6 y62 = f26748u;
            if (!z6) {
                if (runnable != y62) {
                    break;
                }
            } else {
                od = (OD) runnable;
            }
            i++;
            if (i <= 1000) {
                Thread.yield();
            } else if (runnable == y62 || compareAndSet(runnable, y62)) {
                z3 = Thread.interrupted() || z3;
                LockSupport.park(od);
            }
            runnable = (Runnable) get();
        }
        if (z3) {
            thread.interrupt();
        }
    }

    public abstract String c();

    public abstract boolean d();

    public abstract void e(Object obj);

    public abstract void f(Throwable th);

    public final void g() {
        Y6 y62 = f26748u;
        Y6 y63 = f26747n;
        Runnable runnable = (Runnable) get();
        if (runnable instanceof Thread) {
            OD od = new OD(this);
            od.a(Thread.currentThread());
            if (compareAndSet(runnable, od)) {
                try {
                    Thread thread = (Thread) runnable;
                    thread.interrupt();
                    if (((Runnable) getAndSet(y63)) == y62) {
                        LockSupport.unpark(thread);
                    }
                } catch (Throwable th) {
                    if (((Runnable) getAndSet(y63)) == y62) {
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
            Y6 y62 = f26747n;
            if (!d2) {
                try {
                    obj = a();
                } catch (Throwable th) {
                    try {
                        if (th instanceof InterruptedException) {
                            Thread.currentThread().interrupt();
                        }
                        if (!compareAndSet(currentThread, y62)) {
                            b(currentThread);
                        }
                        f(th);
                        return;
                    } catch (Throwable th2) {
                        if (!compareAndSet(currentThread, y62)) {
                            b(currentThread);
                        }
                        e(null);
                        throw th2;
                    }
                }
            }
            if (!compareAndSet(currentThread, y62)) {
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
        if (runnable == f26747n) {
            str = "running=[DONE]";
        } else if (runnable instanceof OD) {
            str = "running=[INTERRUPTED]";
        } else if (runnable instanceof Thread) {
            String name = ((Thread) runnable).getName();
            str = D.y.s(new StringBuilder(String.valueOf(name).length() + 21), "running=[RUNNING ON ", name, "]");
        } else {
            str = "running=[NOT STARTED YET]";
        }
        String c9 = c();
        return D.y.s(new StringBuilder(str.length() + 2 + String.valueOf(c9).length()), str, ", ", c9);
    }
}
