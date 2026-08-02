package defpackage;

import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicLongFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import java.util.concurrent.locks.LockSupport;

/* loaded from: classes5.dex */
public final class jm6 extends Thread {
    public static final /* synthetic */ AtomicIntegerFieldUpdater i = AtomicIntegerFieldUpdater.newUpdater(jm6.class, "workerCtl$volatile");
    public final o4w a;
    public final xqn b;
    public km6 c;
    public long d;
    public long e;
    public int f;
    public boolean g;
    public final /* synthetic */ lm6 h;
    private volatile int indexInArray;
    private volatile Object nextParkedWorker;
    private volatile /* synthetic */ int workerCtl$volatile;

    public jm6(lm6 lm6Var, int i2) {
        this.h = lm6Var;
        setDaemon(true);
        setContextClassLoader(lm6.class.getClassLoader());
        this.a = new o4w();
        this.b = new xqn();
        this.c = km6.d;
        this.nextParkedWorker = lm6.k;
        int nanoTime = (int) System.nanoTime();
        this.f = nanoTime == 0 ? 42 : nanoTime;
        f(i2);
    }

    public final g8s a(boolean z) {
        g8s e;
        g8s e2;
        long j;
        km6 km6Var = this.c;
        km6 km6Var2 = km6.a;
        lm6 lm6Var = this.h;
        g8s g8sVar = null;
        o4w o4wVar = this.a;
        if (km6Var != km6Var2) {
            AtomicLongFieldUpdater atomicLongFieldUpdater = lm6.i;
            do {
                j = atomicLongFieldUpdater.get(lm6Var);
                if (((int) ((9223367638808264704L & j) >> 42)) == 0) {
                    o4wVar.getClass();
                    loop1: while (true) {
                        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = o4w.b;
                        g8s g8sVar2 = (g8s) atomicReferenceFieldUpdater.get(o4wVar);
                        if (g8sVar2 != null && g8sVar2.b) {
                            while (!atomicReferenceFieldUpdater.compareAndSet(o4wVar, g8sVar2, null)) {
                                if (atomicReferenceFieldUpdater.get(o4wVar) != g8sVar2) {
                                    break;
                                }
                            }
                            g8sVar = g8sVar2;
                            break loop1;
                        }
                    }
                    int i2 = o4w.d.get(o4wVar);
                    int i3 = o4w.c.get(o4wVar);
                    while (true) {
                        if (i2 == i3 || o4w.e.get(o4wVar) == 0) {
                            break;
                        }
                        i3--;
                        g8s c = o4wVar.c(i3, true);
                        if (c != null) {
                            g8sVar = c;
                            break;
                        }
                    }
                    if (g8sVar != null) {
                        return g8sVar;
                    }
                    g8s g8sVar3 = (g8s) lm6Var.f.d();
                    return g8sVar3 == null ? i(1) : g8sVar3;
                }
            } while (!lm6.i.compareAndSet(lm6Var, j, j - 4398046511104L));
            this.c = km6.a;
        }
        if (z) {
            boolean z2 = d(lm6Var.a * 2) == 0;
            if (z2 && (e2 = e()) != null) {
                return e2;
            }
            o4wVar.getClass();
            g8s g8sVar4 = (g8s) o4w.b.getAndSet(o4wVar, null);
            if (g8sVar4 == null) {
                g8sVar4 = o4wVar.b();
            }
            if (g8sVar4 != null) {
                return g8sVar4;
            }
            if (!z2 && (e = e()) != null) {
                return e;
            }
        } else {
            g8s e3 = e();
            if (e3 != null) {
                return e3;
            }
        }
        return i(3);
    }

    public final int b() {
        return this.indexInArray;
    }

    public final Object c() {
        return this.nextParkedWorker;
    }

    public final int d(int i2) {
        int i3 = this.f;
        int i4 = i3 ^ (i3 << 13);
        int i5 = i4 ^ (i4 >> 17);
        int i6 = i5 ^ (i5 << 5);
        this.f = i6;
        int i7 = i2 - 1;
        return (i7 & i2) == 0 ? i6 & i7 : (i6 & Integer.MAX_VALUE) % i2;
    }

    public final g8s e() {
        int d = d(2);
        lm6 lm6Var = this.h;
        bmd bmdVar = lm6Var.f;
        bmd bmdVar2 = lm6Var.e;
        if (d == 0) {
            g8s g8sVar = (g8s) bmdVar2.d();
            return g8sVar != null ? g8sVar : (g8s) bmdVar.d();
        }
        g8s g8sVar2 = (g8s) bmdVar.d();
        return g8sVar2 != null ? g8sVar2 : (g8s) bmdVar2.d();
    }

    public final void f(int i2) {
        StringBuilder sb = new StringBuilder();
        sb.append(this.h.d);
        sb.append("-worker-");
        sb.append(i2 == 0 ? "TERMINATED" : String.valueOf(i2));
        setName(sb.toString());
        this.indexInArray = i2;
    }

    public final void g(Object obj) {
        this.nextParkedWorker = obj;
    }

    public final boolean h(km6 km6Var) {
        km6 km6Var2 = this.c;
        boolean z = km6Var2 == km6.a;
        if (z) {
            lm6.i.addAndGet(this.h, 4398046511104L);
        }
        if (km6Var2 != km6Var) {
            this.c = km6Var;
        }
        return z;
    }

    public final g8s i(int i2) {
        long j;
        g8s g8sVar;
        long j2;
        long j3;
        g8s g8sVar2;
        AtomicLongFieldUpdater atomicLongFieldUpdater = lm6.i;
        lm6 lm6Var = this.h;
        int i3 = (int) (atomicLongFieldUpdater.get(lm6Var) & 2097151);
        g8s g8sVar3 = null;
        if (i3 < 2) {
            return null;
        }
        int d = d(i3);
        int i4 = 0;
        long j4 = Long.MAX_VALUE;
        while (i4 < i3) {
            d++;
            if (d > i3) {
                d = 1;
            }
            jm6 jm6Var = (jm6) lm6Var.g.b(d);
            if (jm6Var != null && jm6Var != this) {
                o4w o4wVar = jm6Var.a;
                if (i2 == 3) {
                    g8sVar = o4wVar.b();
                    j = 0;
                } else {
                    o4wVar.getClass();
                    int i5 = o4w.d.get(o4wVar);
                    int i6 = o4w.c.get(o4wVar);
                    boolean z = i2 == 1;
                    while (true) {
                        if (i5 == i6) {
                            j = 0;
                            break;
                        }
                        j = 0;
                        if (!z || o4w.e.get(o4wVar) != 0) {
                            int i7 = i5 + 1;
                            g8sVar = o4wVar.c(i5, z);
                            if (g8sVar != null) {
                                break;
                            }
                            i5 = i7;
                        } else {
                            break;
                        }
                    }
                    g8sVar = g8sVar3;
                }
                xqn xqnVar = this.b;
                if (g8sVar != null) {
                    xqnVar.a = g8sVar;
                    g8sVar2 = g8sVar3;
                    j3 = -1;
                    j2 = -1;
                } else {
                    while (true) {
                        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = o4w.b;
                        g8s g8sVar4 = (g8s) atomicReferenceFieldUpdater.get(o4wVar);
                        if (g8sVar4 == null) {
                            j2 = -1;
                            break;
                        }
                        j2 = -1;
                        if (((g8sVar4.b ? 1 : 2) & i2) == 0) {
                            break;
                        }
                        n8s.f.getClass();
                        o4w o4wVar2 = o4wVar;
                        long nanoTime = System.nanoTime() - g8sVar4.a;
                        long j5 = n8s.b;
                        if (nanoTime < j5) {
                            j3 = j5 - nanoTime;
                            g8sVar2 = null;
                            break;
                        }
                        do {
                            g8sVar2 = null;
                            if (atomicReferenceFieldUpdater.compareAndSet(o4wVar2, g8sVar4, null)) {
                                xqnVar.a = g8sVar4;
                                j3 = -1;
                                break;
                            }
                        } while (atomicReferenceFieldUpdater.get(o4wVar2) == g8sVar4);
                        o4wVar = o4wVar2;
                        g8sVar3 = null;
                    }
                    j3 = -2;
                    g8sVar2 = g8sVar3;
                }
                if (j3 == j2) {
                    g8s g8sVar5 = (g8s) xqnVar.a;
                    xqnVar.a = g8sVar2;
                    return g8sVar5;
                }
                if (j3 > j) {
                    j4 = Math.min(j4, j3);
                }
            }
            i4++;
            g8sVar3 = null;
        }
        if (j4 == Long.MAX_VALUE) {
            j4 = 0;
        }
        this.e = j4;
        return null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:80:0x0004, code lost:
    
        continue;
     */
    /* JADX WARN: Code restructure failed: missing block: B:81:0x0004, code lost:
    
        continue;
     */
    /* JADX WARN: Code restructure failed: missing block: B:82:0x0004, code lost:
    
        continue;
     */
    @Override // java.lang.Thread, java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void run() {
        long j;
        loop0: while (true) {
            boolean z = false;
            while (lm6.j.get(this.h) != 1) {
                km6 km6Var = this.c;
                km6 km6Var2 = km6.e;
                if (km6Var == km6Var2) {
                    break loop0;
                }
                g8s a = a(this.g);
                if (a != null) {
                    this.e = 0L;
                    lm6 lm6Var = this.h;
                    this.d = 0L;
                    if (this.c == km6.c) {
                        this.c = km6.b;
                    }
                    if (a.b) {
                        if (h(km6.b) && !lm6Var.D() && !lm6Var.z(lm6.i.get(lm6Var))) {
                            lm6Var.D();
                        }
                        try {
                            a.run();
                        } catch (Throwable th) {
                            Thread currentThread = Thread.currentThread();
                            currentThread.getUncaughtExceptionHandler().uncaughtException(currentThread, th);
                        }
                        lm6.i.addAndGet(lm6Var, -2097152L);
                        if (this.c != km6Var2) {
                            this.c = km6.d;
                        }
                    } else {
                        try {
                            a.run();
                        } catch (Throwable th2) {
                            Thread currentThread2 = Thread.currentThread();
                            currentThread2.getUncaughtExceptionHandler().uncaughtException(currentThread2, th2);
                        }
                    }
                } else {
                    this.g = false;
                    if (this.e == 0) {
                        Object obj = this.nextParkedWorker;
                        js3 js3Var = lm6.k;
                        if (obj != js3Var) {
                            i.set(this, -1);
                            while (this.nextParkedWorker != lm6.k) {
                                AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = i;
                                if (atomicIntegerFieldUpdater.get(this) == -1) {
                                    lm6 lm6Var2 = this.h;
                                    AtomicIntegerFieldUpdater atomicIntegerFieldUpdater2 = lm6.j;
                                    if (atomicIntegerFieldUpdater2.get(lm6Var2) == 1) {
                                        break;
                                    }
                                    km6 km6Var3 = this.c;
                                    km6 km6Var4 = km6.e;
                                    if (km6Var3 == km6Var4) {
                                        break;
                                    }
                                    h(km6.c);
                                    Thread.interrupted();
                                    if (this.d == 0) {
                                        j = 2097151;
                                        this.d = System.nanoTime() + this.h.c;
                                    } else {
                                        j = 2097151;
                                    }
                                    LockSupport.parkNanos(this.h.c);
                                    if (System.nanoTime() - this.d >= 0) {
                                        this.d = 0L;
                                        lm6 lm6Var3 = this.h;
                                        synchronized (lm6Var3.g) {
                                            try {
                                                if (!(atomicIntegerFieldUpdater2.get(lm6Var3) == 1)) {
                                                    AtomicLongFieldUpdater atomicLongFieldUpdater = lm6.i;
                                                    if (((int) (atomicLongFieldUpdater.get(lm6Var3) & j)) > lm6Var3.a) {
                                                        if (atomicIntegerFieldUpdater.compareAndSet(this, -1, 1)) {
                                                            int i2 = this.indexInArray;
                                                            f(0);
                                                            lm6Var3.o(this, i2, 0);
                                                            int andDecrement = (int) (atomicLongFieldUpdater.getAndDecrement(lm6Var3) & j);
                                                            if (andDecrement != i2) {
                                                                Object b = lm6Var3.g.b(andDecrement);
                                                                b.getClass();
                                                                jm6 jm6Var = (jm6) b;
                                                                lm6Var3.g.c(i2, jm6Var);
                                                                jm6Var.f(i2);
                                                                lm6Var3.o(jm6Var, andDecrement, i2);
                                                            }
                                                            lm6Var3.g.c(andDecrement, null);
                                                            this.c = km6Var4;
                                                        }
                                                    }
                                                }
                                            } catch (Throwable th3) {
                                                throw th3;
                                            }
                                        }
                                    }
                                }
                            }
                        } else {
                            lm6 lm6Var4 = this.h;
                            if (this.nextParkedWorker == js3Var) {
                                AtomicLongFieldUpdater atomicLongFieldUpdater2 = lm6.h;
                                while (true) {
                                    long j2 = atomicLongFieldUpdater2.get(lm6Var4);
                                    int i3 = this.indexInArray;
                                    this.nextParkedWorker = lm6Var4.g.b((int) (j2 & 2097151));
                                    lm6 lm6Var5 = lm6Var4;
                                    if (lm6.h.compareAndSet(lm6Var5, j2, ((j2 + 2097152) & (-2097152)) | i3)) {
                                        break;
                                    } else {
                                        lm6Var4 = lm6Var5;
                                    }
                                }
                            }
                        }
                    } else if (z) {
                        h(km6.c);
                        Thread.interrupted();
                        LockSupport.parkNanos(this.e);
                        this.e = 0L;
                    } else {
                        z = true;
                    }
                }
            }
            break loop0;
        }
        h(km6.e);
    }
}
