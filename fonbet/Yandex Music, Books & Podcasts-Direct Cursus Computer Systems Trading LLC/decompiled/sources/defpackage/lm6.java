package defpackage;

import java.io.Closeable;
import java.lang.Thread;
import java.util.ArrayList;
import java.util.concurrent.Executor;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicLongFieldUpdater;
import java.util.concurrent.locks.LockSupport;

/* loaded from: classes5.dex */
public final class lm6 implements Executor, Closeable {
    public static final /* synthetic */ AtomicLongFieldUpdater h = AtomicLongFieldUpdater.newUpdater(lm6.class, "parkedWorkersStack$volatile");
    public static final /* synthetic */ AtomicLongFieldUpdater i = AtomicLongFieldUpdater.newUpdater(lm6.class, "controlState$volatile");
    public static final /* synthetic */ AtomicIntegerFieldUpdater j = AtomicIntegerFieldUpdater.newUpdater(lm6.class, "_isTerminated$volatile");
    public static final js3 k = new js3("NOT_IN_STACK", 2);
    private volatile /* synthetic */ int _isTerminated$volatile;
    public final int a;
    public final int b;
    public final long c;
    private volatile /* synthetic */ long controlState$volatile;
    public final String d;
    public final bmd e;
    public final bmd f;
    public final b2o g;
    private volatile /* synthetic */ long parkedWorkersStack$volatile;

    public lm6(long j2, String str, int i2, int i3) {
        this.a = i2;
        this.b = i3;
        this.c = j2;
        this.d = str;
        if (i2 < 1) {
            xq0.o(dfi.c(i2, "Core pool size ", " should be at least 1"));
            throw null;
        }
        if (i3 < i2) {
            xq0.o(f1d.e(i3, i2, "Max pool size ", " should be greater than or equals to core pool size "));
            throw null;
        }
        if (i3 > 2097150) {
            xq0.o(dfi.c(i3, "Max pool size ", " should not exceed maximal supported number of threads 2097150"));
            throw null;
        }
        if (j2 <= 0) {
            xq0.o(dfi.e(j2, "Idle worker keep alive time ", " must be positive"));
            throw null;
        }
        this.e = new bmd();
        this.f = new bmd();
        this.g = new b2o((i2 + 1) * 2);
        this.controlState$volatile = i2 << 42;
    }

    public static /* synthetic */ void g(lm6 lm6Var, Runnable runnable, int i2) {
        lm6Var.b(runnable, false, (i2 & 4) == 0);
    }

    public final boolean D() {
        js3 js3Var;
        int i2;
        while (true) {
            long j2 = h.get(this);
            jm6 jm6Var = (jm6) this.g.b((int) (2097151 & j2));
            if (jm6Var == null) {
                jm6Var = null;
            } else {
                long j3 = (2097152 + j2) & (-2097152);
                Object c = jm6Var.c();
                while (true) {
                    js3Var = k;
                    if (c == js3Var) {
                        i2 = -1;
                        break;
                    }
                    if (c == null) {
                        i2 = 0;
                        break;
                    }
                    jm6 jm6Var2 = (jm6) c;
                    i2 = jm6Var2.b();
                    if (i2 != 0) {
                        break;
                    }
                    c = jm6Var2.c();
                }
                if (i2 >= 0) {
                    if (h.compareAndSet(this, j2, i2 | j3)) {
                        jm6Var.g(js3Var);
                    } else {
                        continue;
                    }
                } else {
                    continue;
                }
            }
            if (jm6Var == null) {
                return false;
            }
            if (jm6.i.compareAndSet(jm6Var, -1, 0)) {
                LockSupport.unpark(jm6Var);
                return true;
            }
        }
    }

    public final int a() {
        synchronized (this.g) {
            try {
                if (j.get(this) == 1) {
                    return -1;
                }
                AtomicLongFieldUpdater atomicLongFieldUpdater = i;
                long j2 = atomicLongFieldUpdater.get(this);
                int i2 = (int) (j2 & 2097151);
                int i3 = i2 - ((int) ((j2 & 4398044413952L) >> 21));
                if (i3 < 0) {
                    i3 = 0;
                }
                if (i3 >= this.a) {
                    return 0;
                }
                if (i2 >= this.b) {
                    return 0;
                }
                int i4 = ((int) (atomicLongFieldUpdater.get(this) & 2097151)) + 1;
                if (i4 <= 0 || this.g.b(i4) != null) {
                    throw new IllegalArgumentException("Failed requirement.");
                }
                jm6 jm6Var = new jm6(this, i4);
                this.g.c(i4, jm6Var);
                if (i4 != ((int) (2097151 & atomicLongFieldUpdater.incrementAndGet(this)))) {
                    throw new IllegalArgumentException("Failed requirement.");
                }
                int i5 = i3 + 1;
                jm6Var.start();
                return i5;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void b(Runnable runnable, boolean z, boolean z2) {
        g8s k8sVar;
        km6 km6Var;
        n8s.f.getClass();
        long nanoTime = System.nanoTime();
        if (runnable instanceof g8s) {
            k8sVar = (g8s) runnable;
            k8sVar.a = nanoTime;
            k8sVar.b = z;
        } else {
            k8sVar = new k8s(runnable, nanoTime, z);
        }
        boolean z3 = k8sVar.b;
        AtomicLongFieldUpdater atomicLongFieldUpdater = i;
        long addAndGet = z3 ? atomicLongFieldUpdater.addAndGet(this, 2097152L) : 0L;
        Thread currentThread = Thread.currentThread();
        jm6 jm6Var = currentThread instanceof jm6 ? (jm6) currentThread : null;
        if (jm6Var == null || !jm6Var.h.equals(this)) {
            jm6Var = null;
        }
        if (jm6Var != null && (km6Var = jm6Var.c) != km6.e && (k8sVar.b || km6Var != km6.b)) {
            jm6Var.g = true;
            o4w o4wVar = jm6Var.a;
            if (z2) {
                k8sVar = o4wVar.a(k8sVar);
            } else {
                o4wVar.getClass();
                g8s g8sVar = (g8s) o4w.b.getAndSet(o4wVar, k8sVar);
                k8sVar = g8sVar == null ? null : o4wVar.a(g8sVar);
            }
        }
        if (k8sVar != null) {
            if (!(k8sVar.b ? this.f.a(k8sVar) : this.e.a(k8sVar))) {
                throw new RejectedExecutionException(su4.o(new StringBuilder(), this.d, " was terminated"));
            }
        }
        if (z3) {
            if (D() || z(addAndGet)) {
                return;
            }
            D();
            return;
        }
        if (D() || z(atomicLongFieldUpdater.get(this))) {
            return;
        }
        D();
    }

    /* JADX WARN: Code restructure failed: missing block: B:39:0x0088, code lost:
    
        if (r1 == null) goto L39;
     */
    @Override // java.io.Closeable, java.lang.AutoCloseable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void close() {
        int i2;
        g8s g8sVar;
        if (j.compareAndSet(this, 0, 1)) {
            Thread currentThread = Thread.currentThread();
            jm6 jm6Var = currentThread instanceof jm6 ? (jm6) currentThread : null;
            if (jm6Var == null || !jm6Var.h.equals(this)) {
                jm6Var = null;
            }
            synchronized (this.g) {
                i2 = (int) (i.get(this) & 2097151);
            }
            if (1 <= i2) {
                int i3 = 1;
                while (true) {
                    Object b = this.g.b(i3);
                    b.getClass();
                    jm6 jm6Var2 = (jm6) b;
                    if (jm6Var2 != jm6Var) {
                        while (jm6Var2.getState() != Thread.State.TERMINATED) {
                            LockSupport.unpark(jm6Var2);
                            jm6Var2.join(10000L);
                        }
                        o4w o4wVar = jm6Var2.a;
                        bmd bmdVar = this.f;
                        o4wVar.getClass();
                        g8s g8sVar2 = (g8s) o4w.b.getAndSet(o4wVar, null);
                        if (g8sVar2 != null) {
                            bmdVar.a(g8sVar2);
                        }
                        while (true) {
                            g8s b2 = o4wVar.b();
                            if (b2 == null) {
                                break;
                            } else {
                                bmdVar.a(b2);
                            }
                        }
                    }
                    if (i3 == i2) {
                        break;
                    } else {
                        i3++;
                    }
                }
            }
            this.f.b();
            this.e.b();
            while (true) {
                if (jm6Var != null) {
                    g8sVar = jm6Var.a(true);
                }
                g8sVar = (g8s) this.e.d();
                if (g8sVar == null && (g8sVar = (g8s) this.f.d()) == null) {
                    break;
                }
                try {
                    g8sVar.run();
                } catch (Throwable th) {
                    Thread currentThread2 = Thread.currentThread();
                    currentThread2.getUncaughtExceptionHandler().uncaughtException(currentThread2, th);
                }
            }
            if (jm6Var != null) {
                jm6Var.h(km6.e);
            }
            h.set(this, 0L);
            i.set(this, 0L);
        }
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        g(this, runnable, 6);
    }

    public final void o(jm6 jm6Var, int i2, int i3) {
        while (true) {
            long j2 = h.get(this);
            int i4 = (int) (2097151 & j2);
            long j3 = (2097152 + j2) & (-2097152);
            if (i4 == i2) {
                if (i3 == 0) {
                    Object c = jm6Var.c();
                    while (true) {
                        if (c == k) {
                            i4 = -1;
                            break;
                        }
                        if (c == null) {
                            i4 = 0;
                            break;
                        }
                        jm6 jm6Var2 = (jm6) c;
                        int b = jm6Var2.b();
                        if (b != 0) {
                            i4 = b;
                            break;
                        }
                        c = jm6Var2.c();
                    }
                } else {
                    i4 = i3;
                }
            }
            if (i4 >= 0) {
                if (h.compareAndSet(this, j2, i4 | j3)) {
                    return;
                }
            }
        }
    }

    public final String toString() {
        ArrayList arrayList = new ArrayList();
        b2o b2oVar = this.g;
        int a = b2oVar.a();
        int i2 = 0;
        int i3 = 0;
        int i4 = 0;
        int i5 = 0;
        int i6 = 0;
        for (int i7 = 1; i7 < a; i7++) {
            jm6 jm6Var = (jm6) b2oVar.b(i7);
            if (jm6Var != null) {
                o4w o4wVar = jm6Var.a;
                o4wVar.getClass();
                int i8 = o4w.b.get(o4wVar) != null ? (o4w.c.get(o4wVar) - o4w.d.get(o4wVar)) + 1 : o4w.c.get(o4wVar) - o4w.d.get(o4wVar);
                int ordinal = jm6Var.c.ordinal();
                if (ordinal == 0) {
                    i2++;
                    StringBuilder sb = new StringBuilder();
                    sb.append(i8);
                    sb.append('c');
                    arrayList.add(sb.toString());
                } else if (ordinal == 1) {
                    i3++;
                    StringBuilder sb2 = new StringBuilder();
                    sb2.append(i8);
                    sb2.append('b');
                    arrayList.add(sb2.toString());
                } else if (ordinal == 2) {
                    i4++;
                } else if (ordinal == 3) {
                    i5++;
                    if (i8 > 0) {
                        StringBuilder sb3 = new StringBuilder();
                        sb3.append(i8);
                        sb3.append('d');
                        arrayList.add(sb3.toString());
                    }
                } else {
                    if (ordinal != 4) {
                        b6e.s();
                        return null;
                    }
                    i6++;
                }
            }
        }
        long j2 = i.get(this);
        StringBuilder sb4 = new StringBuilder();
        sb4.append(this.d);
        sb4.append('@');
        sb4.append(ff7.B(this));
        sb4.append("[Pool Size {core = ");
        int i9 = this.a;
        sb4.append(i9);
        sb4.append(", max = ");
        hrg.w(this.b, i2, "}, Worker States {CPU = ", ", blocking = ", sb4);
        hrg.w(i3, i4, ", parked = ", ", dormant = ", sb4);
        hrg.w(i5, i6, ", terminated = ", "}, running workers queues = ", sb4);
        sb4.append(arrayList);
        sb4.append(", global CPU queue size = ");
        sb4.append(this.e.c());
        sb4.append(", global blocking queue size = ");
        sb4.append(this.f.c());
        sb4.append(", Control State {created workers= ");
        sb4.append((int) (2097151 & j2));
        sb4.append(", blocking tasks = ");
        sb4.append((int) ((4398044413952L & j2) >> 21));
        sb4.append(", CPUs acquired = ");
        sb4.append(i9 - ((int) ((j2 & 9223367638808264704L) >> 42)));
        sb4.append("}]");
        return sb4.toString();
    }

    public final boolean z(long j2) {
        int i2 = ((int) (2097151 & j2)) - ((int) ((j2 & 4398044413952L) >> 21));
        if (i2 < 0) {
            i2 = 0;
        }
        int i3 = this.a;
        if (i2 < i3) {
            int a = a();
            if (a == 1 && i3 > 1) {
                a();
            }
            if (a > 0) {
                return true;
            }
        }
        return false;
    }
}
