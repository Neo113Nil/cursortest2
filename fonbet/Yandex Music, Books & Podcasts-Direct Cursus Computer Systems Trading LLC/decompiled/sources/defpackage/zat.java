package defpackage;

import java.util.concurrent.Callable;
import java.util.concurrent.RunnableFuture;
import java.util.concurrent.atomic.AtomicReference;
import java.util.concurrent.locks.LockSupport;

/* loaded from: classes3.dex */
public final class zat extends AtomicReference implements Runnable {
    public static final q d;
    public static final q e;
    public static final q f;
    public static final q g;
    public static final q h;
    public static final q i;
    public final /* synthetic */ int a = 0;
    public final Callable b;
    public final /* synthetic */ RunnableFuture c;

    static {
        int i2 = 19;
        d = new q(i2);
        e = new q(i2);
        int i3 = 25;
        f = new q(i3);
        g = new q(i3);
        int i4 = 26;
        h = new q(i4);
        i = new q(i4);
    }

    public zat(w9x w9xVar, Callable callable) {
        this.c = w9xVar;
        callable.getClass();
        this.b = callable;
    }

    public void a(Thread thread) {
        Runnable runnable = (Runnable) get();
        cxe cxeVar = null;
        boolean z = false;
        int i2 = 0;
        while (true) {
            boolean z2 = runnable instanceof cxe;
            q qVar = e;
            if (!z2 && runnable != qVar) {
                break;
            }
            if (z2) {
                cxeVar = (cxe) runnable;
            }
            i2++;
            if (i2 <= 1000) {
                Thread.yield();
            } else if (runnable == qVar || compareAndSet(runnable, qVar)) {
                z = Thread.interrupted() || z;
                LockSupport.park(cxeVar);
            }
            runnable = (Runnable) get();
        }
        if (z) {
            thread.interrupt();
        }
    }

    public void b(Thread thread) {
        switch (this.a) {
            case 1:
                Runnable runnable = (Runnable) get();
                z8x z8xVar = null;
                boolean z = false;
                int i2 = 0;
                while (true) {
                    boolean z2 = runnable instanceof z8x;
                    q qVar = g;
                    if (!z2) {
                        if (runnable != qVar) {
                            if (z) {
                                thread.interrupt();
                                break;
                            }
                        }
                    } else {
                        z8xVar = (z8x) runnable;
                    }
                    i2++;
                    if (i2 <= 1000) {
                        Thread.yield();
                    } else if (runnable == qVar || compareAndSet(runnable, qVar)) {
                        z = Thread.interrupted() || z;
                        LockSupport.park(z8xVar);
                    }
                    runnable = (Runnable) get();
                }
                break;
            default:
                Runnable runnable2 = (Runnable) get();
                mlx mlxVar = null;
                boolean z3 = false;
                int i3 = 0;
                while (true) {
                    boolean z4 = runnable2 instanceof mlx;
                    q qVar2 = i;
                    if (!z4) {
                        if (runnable2 != qVar2) {
                            if (z3) {
                                thread.interrupt();
                                break;
                            }
                        }
                    } else {
                        mlxVar = (mlx) runnable2;
                    }
                    i3++;
                    if (i3 <= 1000) {
                        Thread.yield();
                    } else if (runnable2 == qVar2 || compareAndSet(runnable2, qVar2)) {
                        z3 = Thread.interrupted() || z3;
                        LockSupport.park(mlxVar);
                    }
                    runnable2 = (Runnable) get();
                }
                break;
        }
    }

    @Override // java.lang.Runnable
    public final void run() {
        Object call;
        Object call2;
        switch (this.a) {
            case 0:
                abt abtVar = (abt) this.c;
                Thread currentThread = Thread.currentThread();
                Object obj = null;
                if (compareAndSet(null, currentThread)) {
                    boolean isDone = abtVar.isDone();
                    q qVar = d;
                    if (!isDone) {
                        try {
                            obj = this.b.call();
                        } catch (Throwable th) {
                            try {
                                if (th instanceof InterruptedException) {
                                    Thread.currentThread().interrupt();
                                }
                                if (!compareAndSet(currentThread, qVar)) {
                                    a(currentThread);
                                }
                                if (isDone) {
                                    return;
                                }
                                abtVar.m(th);
                                return;
                            } finally {
                                if (!compareAndSet(currentThread, qVar)) {
                                    a(currentThread);
                                }
                                if (!isDone) {
                                    abtVar.l(null);
                                }
                            }
                        }
                    }
                    if (isDone) {
                        return;
                    } else {
                        return;
                    }
                }
                return;
            case 1:
                w9x w9xVar = (w9x) this.c;
                Thread currentThread2 = Thread.currentThread();
                if (compareAndSet(null, currentThread2)) {
                    boolean isDone2 = w9xVar.isDone();
                    q qVar2 = f;
                    if (isDone2) {
                        call = null;
                    } else {
                        try {
                            call = this.b.call();
                        } catch (Throwable th2) {
                            try {
                                if (th2 instanceof InterruptedException) {
                                    Thread.currentThread().interrupt();
                                }
                                if (!compareAndSet(currentThread2, qVar2)) {
                                    b(currentThread2);
                                }
                                w9xVar.e(th2);
                                return;
                            } catch (Throwable th3) {
                                if (!compareAndSet(currentThread2, qVar2)) {
                                    b(currentThread2);
                                }
                                if (j8x.f.X(w9xVar, null, j8x.g)) {
                                    j8x.h(w9xVar);
                                }
                                throw th3;
                            }
                        }
                    }
                    if (!compareAndSet(currentThread2, qVar2)) {
                        b(currentThread2);
                    }
                    if (isDone2) {
                        return;
                    }
                    if (call == null) {
                        call = j8x.g;
                    }
                    if (j8x.f.X(w9xVar, null, call)) {
                        j8x.h(w9xVar);
                        return;
                    }
                    return;
                }
                return;
            default:
                rlx rlxVar = (rlx) this.c;
                Thread currentThread3 = Thread.currentThread();
                if (compareAndSet(null, currentThread3)) {
                    boolean isDone3 = rlxVar.isDone();
                    q qVar3 = h;
                    if (isDone3) {
                        call2 = null;
                    } else {
                        try {
                            call2 = this.b.call();
                        } catch (Throwable th4) {
                            try {
                                if (th4 instanceof InterruptedException) {
                                    Thread.currentThread().interrupt();
                                }
                                if (!compareAndSet(currentThread3, qVar3)) {
                                    b(currentThread3);
                                }
                                if (flx.f.R(rlxVar, null, new ykx(th4))) {
                                    flx.g(rlxVar);
                                    return;
                                }
                                return;
                            } catch (Throwable th5) {
                                if (!compareAndSet(currentThread3, qVar3)) {
                                    b(currentThread3);
                                }
                                if (flx.f.R(rlxVar, null, flx.g)) {
                                    flx.g(rlxVar);
                                }
                                throw th5;
                            }
                        }
                    }
                    if (!compareAndSet(currentThread3, qVar3)) {
                        b(currentThread3);
                    }
                    if (isDone3) {
                        return;
                    }
                    if (call2 == null) {
                        call2 = flx.g;
                    }
                    if (flx.f.R(rlxVar, null, call2)) {
                        flx.g(rlxVar);
                        return;
                    }
                    return;
                }
                return;
        }
    }

    @Override // java.util.concurrent.atomic.AtomicReference
    public final String toString() {
        String str;
        switch (this.a) {
            case 0:
                Runnable runnable = (Runnable) get();
                if (runnable == d) {
                    str = "running=[DONE]";
                } else if (runnable instanceof cxe) {
                    str = "running=[INTERRUPTED]";
                } else if (runnable instanceof Thread) {
                    str = "running=[RUNNING ON " + ((Thread) runnable).getName() + "]";
                } else {
                    str = "running=[NOT STARTED YET]";
                }
                StringBuilder m = tlm.m(str, ", ");
                m.append(this.b.toString());
                return m.toString();
            case 1:
                Runnable runnable2 = (Runnable) get();
                return ouj.o(runnable2 == f ? "running=[DONE]" : runnable2 instanceof z8x ? "running=[INTERRUPTED]" : runnable2 instanceof Thread ? hrg.q("running=[RUNNING ON ", ((Thread) runnable2).getName(), "]") : "running=[NOT STARTED YET]", ", ", this.b.toString());
            default:
                Runnable runnable3 = (Runnable) get();
                return ouj.o(runnable3 == h ? "running=[DONE]" : runnable3 instanceof mlx ? "running=[INTERRUPTED]" : runnable3 instanceof Thread ? hrg.q("running=[RUNNING ON ", ((Thread) runnable3).getName(), "]") : "running=[NOT STARTED YET]", ", ", this.b.toString());
        }
    }

    public zat(rlx rlxVar, Callable callable) {
        this.c = rlxVar;
        callable.getClass();
        this.b = callable;
    }

    public zat(abt abtVar, Callable callable) {
        this.c = abtVar;
        callable.getClass();
        this.b = callable;
    }
}
