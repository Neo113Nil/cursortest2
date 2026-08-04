package com.gamericefishpro.space.n9;

import java.util.concurrent.Callable;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.PriorityBlockingQueue;
import java.util.concurrent.Semaphore;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: compiled from: r8-map-id-020a1517951ead57be77a6b773195444ecc812bf491d4c7c9fe6933b01540740 */
/* JADX INFO: loaded from: classes.dex */
public final class p1 extends z1 {
    public static final AtomicLong D = new AtomicLong(Long.MIN_VALUE);
    public final m1 A;
    public final Object B;
    public final Semaphore C;
    public o1 i;
    public o1 v;
    public final PriorityBlockingQueue w;
    public final LinkedBlockingQueue y;
    public final m1 z;

    public p1(r1 r1Var) {
        super(r1Var);
        this.B = new Object();
        this.C = new Semaphore(2);
        this.w = new PriorityBlockingQueue();
        this.y = new LinkedBlockingQueue();
        this.z = new m1(this, "Thread death: Uncaught exception on worker thread");
        this.A = new m1(this, "Thread death: Uncaught exception on network thread");
    }

    public final void A(Runnable runnable) {
        t();
        com.gamericefishpro.space.v8.c0.g(runnable);
        E(new n1(this, runnable, false, "Task exception on worker thread"));
    }

    public final Object B(AtomicReference atomicReference, long j, String str, Runnable runnable) {
        synchronized (atomicReference) {
            p1 p1Var = ((r1) this.d).z;
            r1.l(p1Var);
            p1Var.A(runnable);
            try {
                atomicReference.wait(j);
            } catch (InterruptedException unused) {
                v0 v0Var = ((r1) this.d).y;
                r1.l(v0Var);
                t0 t0Var = v0Var.B;
                StringBuilder sb = new StringBuilder(str.length() + 24);
                sb.append("Interrupted waiting for ");
                sb.append(str);
                t0Var.a(sb.toString());
                return null;
            }
        }
        Object obj = atomicReference.get();
        if (obj == null) {
            v0 v0Var2 = ((r1) this.d).y;
            r1.l(v0Var2);
            v0Var2.B.a("Timed out waiting for ".concat(str));
        }
        return obj;
    }

    public final void C(Runnable runnable) {
        t();
        E(new n1(this, runnable, true, "Task exception on worker thread"));
    }

    public final void D(Runnable runnable) {
        t();
        n1 n1Var = new n1(this, runnable, false, "Task exception on network thread");
        synchronized (this.B) {
            try {
                LinkedBlockingQueue linkedBlockingQueue = this.y;
                linkedBlockingQueue.add(n1Var);
                o1 o1Var = this.v;
                if (o1Var == null) {
                    o1 o1Var2 = new o1(this, "Measurement Network", linkedBlockingQueue);
                    this.v = o1Var2;
                    o1Var2.setUncaughtExceptionHandler(this.A);
                    this.v.start();
                } else {
                    Object obj = o1Var.d;
                    synchronized (obj) {
                        obj.notifyAll();
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void E(n1 n1Var) {
        synchronized (this.B) {
            try {
                PriorityBlockingQueue priorityBlockingQueue = this.w;
                priorityBlockingQueue.add(n1Var);
                o1 o1Var = this.i;
                if (o1Var == null) {
                    o1 o1Var2 = new o1(this, "Measurement Worker", priorityBlockingQueue);
                    this.i = o1Var2;
                    o1Var2.setUncaughtExceptionHandler(this.z);
                    this.i.start();
                } else {
                    Object obj = o1Var.d;
                    synchronized (obj) {
                        obj.notifyAll();
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // com.gamericefishpro.space.g1.b
    public final void r() {
        if (Thread.currentThread() != this.i) {
            throw new IllegalStateException("Call expected from worker thread");
        }
    }

    @Override // com.gamericefishpro.space.n9.z1
    public final boolean s() {
        return false;
    }

    public final void v() {
        if (Thread.currentThread() != this.v) {
            throw new IllegalStateException("Call expected from network thread");
        }
    }

    public final void w() {
        if (Thread.currentThread() == this.i) {
            throw new IllegalStateException("Call not expected from worker thread");
        }
    }

    public final boolean x() {
        return Thread.currentThread() == this.i;
    }

    public final n1 y(Callable callable) {
        t();
        n1 n1Var = new n1(this, callable, false);
        if (Thread.currentThread() != this.i) {
            E(n1Var);
            return n1Var;
        }
        if (!this.w.isEmpty()) {
            v0 v0Var = ((r1) this.d).y;
            r1.l(v0Var);
            v0Var.B.a("Callable skipped the worker queue.");
        }
        n1Var.run();
        return n1Var;
    }

    public final n1 z(Callable callable) {
        t();
        n1 n1Var = new n1(this, callable, true);
        if (Thread.currentThread() == this.i) {
            n1Var.run();
            return n1Var;
        }
        E(n1Var);
        return n1Var;
    }
}
