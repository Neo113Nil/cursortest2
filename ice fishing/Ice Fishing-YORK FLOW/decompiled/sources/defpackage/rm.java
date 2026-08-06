package defpackage;

/* compiled from: r8-map-id-5e15bf382d9e1cc682b2b5d208f848646545054061ee84effb1e415a0540fc32 */
/* loaded from: classes.dex */
public final class rm implements java.util.concurrent.Executor, java.io.Closeable {
    public final defpackage.r30 GE9mJIPrb8gP;
    public final defpackage.y41 Ns0WNyEWdPsk;
    public final java.lang.String P05cfTpS5W5L;
    public final long QiMR8OkAhezm;
    public final int WDYagTQQm9ns;
    private volatile /* synthetic */ int _isTerminated$volatile;
    private volatile /* synthetic */ long controlState$volatile;
    public final defpackage.r30 e6mdH7fiFuta;
    public final int oh71FJcDz6S2;
    private volatile /* synthetic */ long parkedWorkersStack$volatile;
    public static final /* synthetic */ java.util.concurrent.atomic.AtomicLongFieldUpdater fNwYGHIYeJcR = java.util.concurrent.atomic.AtomicLongFieldUpdater.newUpdater(defpackage.rm.class, "parkedWorkersStack$volatile");
    public static final /* synthetic */ java.util.concurrent.atomic.AtomicLongFieldUpdater h3m55N1URyyK = java.util.concurrent.atomic.AtomicLongFieldUpdater.newUpdater(defpackage.rm.class, "controlState$volatile");
    public static final /* synthetic */ java.util.concurrent.atomic.AtomicIntegerFieldUpdater gUjdnLbkVAaA = java.util.concurrent.atomic.AtomicIntegerFieldUpdater.newUpdater(defpackage.rm.class, "_isTerminated$volatile");
    public static final defpackage.ru T1fB7bDYiVJQ = new defpackage.ru("NOT_IN_STACK", 1);

    public rm(int i, int i2, long j, java.lang.String str) {
        this.WDYagTQQm9ns = i;
        this.oh71FJcDz6S2 = i2;
        this.QiMR8OkAhezm = j;
        this.P05cfTpS5W5L = str;
        if (i < 1) {
            defpackage.p81.fWTAfUmVKrZq("Core pool size ", i, " should be at least 1");
            throw null;
        }
        if (i2 < i) {
            defpackage.h7.WDYagTQQm9ns(defpackage.pVQOaWB9QMo4.P05cfTpS5W5L(i2, i, "Max pool size ", " should be greater than or equals to core pool size "));
            throw null;
        }
        if (i2 > 2097150) {
            defpackage.p81.fWTAfUmVKrZq("Max pool size ", i2, " should not exceed maximal supported number of threads 2097150");
            throw null;
        }
        if (j <= 0) {
            throw new java.lang.IllegalArgumentException(("Idle worker keep alive time " + j + " must be positive").toString());
        }
        this.e6mdH7fiFuta = new defpackage.r30();
        this.GE9mJIPrb8gP = new defpackage.r30();
        this.Ns0WNyEWdPsk = new defpackage.y41((i + 1) * 2);
        this.controlState$volatile = i << 42;
        this._isTerminated$volatile = 0;
    }

    public static /* synthetic */ void QiMR8OkAhezm(defpackage.rm rmVar, java.lang.Runnable runnable, int i) {
        rmVar.JhCgjQRTAOCT(runnable, false, (i & 4) == 0);
    }

    public final void JhCgjQRTAOCT(java.lang.Runnable runnable, boolean z, boolean z2) {
        defpackage.qj1 rj1Var;
        defpackage.qm qmVar;
        defpackage.sj1.oh71FJcDz6S2.getClass();
        long nanoTime = java.lang.System.nanoTime();
        if (runnable instanceof defpackage.qj1) {
            rj1Var = (defpackage.qj1) runnable;
            rj1Var.WDYagTQQm9ns = nanoTime;
            rj1Var.oh71FJcDz6S2 = z;
        } else {
            rj1Var = new defpackage.rj1(runnable, nanoTime, z);
        }
        boolean z3 = rj1Var.oh71FJcDz6S2;
        java.util.concurrent.atomic.AtomicLongFieldUpdater atomicLongFieldUpdater = h3m55N1URyyK;
        long addAndGet = z3 ? atomicLongFieldUpdater.addAndGet(this, 2097152L) : 0L;
        java.lang.Thread currentThread = java.lang.Thread.currentThread();
        defpackage.pm pmVar = null;
        defpackage.pm pmVar2 = currentThread instanceof defpackage.pm ? (defpackage.pm) currentThread : null;
        if (pmVar2 != null && pmVar2.fNwYGHIYeJcR == this) {
            pmVar = pmVar2;
        }
        if (pmVar != null && (qmVar = pmVar.QiMR8OkAhezm) != defpackage.qm.e6mdH7fiFuta && (rj1Var.oh71FJcDz6S2 || qmVar != defpackage.qm.oh71FJcDz6S2)) {
            pmVar.Ns0WNyEWdPsk = true;
            rj1Var = pmVar.WDYagTQQm9ns.ZpBGe2uQfcn8(rj1Var, z2);
        }
        if (rj1Var != null) {
            if (!(rj1Var.oh71FJcDz6S2 ? this.GE9mJIPrb8gP.ZpBGe2uQfcn8(rj1Var) : this.e6mdH7fiFuta.ZpBGe2uQfcn8(rj1Var))) {
                throw new java.util.concurrent.RejectedExecutionException(this.P05cfTpS5W5L + " was terminated");
            }
        }
        boolean z4 = z2 && pmVar != null;
        if (z3) {
            if (z4 || fNwYGHIYeJcR() || Ns0WNyEWdPsk(addAndGet)) {
                return;
            }
            fNwYGHIYeJcR();
            return;
        }
        if (z4 || fNwYGHIYeJcR() || Ns0WNyEWdPsk(atomicLongFieldUpdater.get(this))) {
            return;
        }
        fNwYGHIYeJcR();
    }

    public final boolean Ns0WNyEWdPsk(long j) {
        int i = ((int) (2097151 & j)) - ((int) ((j & 4398044413952L) >> 21));
        if (i < 0) {
            i = 0;
        }
        int i2 = this.WDYagTQQm9ns;
        if (i < i2) {
            int giKS3J6vZuNy = giKS3J6vZuNy();
            if (giKS3J6vZuNy == 1 && i2 > 1) {
                giKS3J6vZuNy();
            }
            if (giKS3J6vZuNy > 0) {
                return true;
            }
        }
        return false;
    }

    /* JADX WARN: Code restructure failed: missing block: B:33:0x006c, code lost:
    
        if (r0 == null) goto L33;
     */
    @Override // java.io.Closeable, java.lang.AutoCloseable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void close() {
        int i;
        defpackage.qj1 qj1Var;
        if (gUjdnLbkVAaA.compareAndSet(this, 0, 1)) {
            java.lang.Thread currentThread = java.lang.Thread.currentThread();
            defpackage.pm pmVar = null;
            defpackage.pm pmVar2 = currentThread instanceof defpackage.pm ? (defpackage.pm) currentThread : null;
            if (pmVar2 != null && pmVar2.fNwYGHIYeJcR == this) {
                pmVar = pmVar2;
            }
            synchronized (this.Ns0WNyEWdPsk) {
                i = (int) (h3m55N1URyyK.get(this) & 2097151);
            }
            if (1 <= i) {
                int i2 = 1;
                while (true) {
                    java.lang.Object giKS3J6vZuNy = this.Ns0WNyEWdPsk.giKS3J6vZuNy(i2);
                    giKS3J6vZuNy.getClass();
                    defpackage.pm pmVar3 = (defpackage.pm) giKS3J6vZuNy;
                    if (pmVar3 != pmVar) {
                        while (pmVar3.getState() != java.lang.Thread.State.TERMINATED) {
                            java.util.concurrent.locks.LockSupport.unpark(pmVar3);
                            pmVar3.join(10000L);
                        }
                        pmVar3.WDYagTQQm9ns.JhCgjQRTAOCT(this.GE9mJIPrb8gP);
                    }
                    if (i2 == i) {
                        break;
                    } else {
                        i2++;
                    }
                }
            }
            this.GE9mJIPrb8gP.giKS3J6vZuNy();
            this.e6mdH7fiFuta.giKS3J6vZuNy();
            while (true) {
                if (pmVar != null) {
                    qj1Var = pmVar.ZpBGe2uQfcn8(true);
                }
                qj1Var = (defpackage.qj1) this.e6mdH7fiFuta.JhCgjQRTAOCT();
                if (qj1Var == null && (qj1Var = (defpackage.qj1) this.GE9mJIPrb8gP.JhCgjQRTAOCT()) == null) {
                    break;
                }
                try {
                    qj1Var.run();
                } catch (java.lang.Throwable th) {
                    java.lang.Thread currentThread2 = java.lang.Thread.currentThread();
                    currentThread2.getUncaughtExceptionHandler().uncaughtException(currentThread2, th);
                }
            }
            if (pmVar != null) {
                pmVar.P05cfTpS5W5L(defpackage.qm.e6mdH7fiFuta);
            }
            fNwYGHIYeJcR.set(this, 0L);
            h3m55N1URyyK.set(this, 0L);
        }
    }

    public final void e6mdH7fiFuta(defpackage.pm pmVar, int i, int i2) {
        while (true) {
            long j = fNwYGHIYeJcR.get(this);
            int i3 = (int) (2097151 & j);
            long j2 = (2097152 + j) & (-2097152);
            if (i3 == i) {
                if (i2 == 0) {
                    java.lang.Object fWTAfUmVKrZq = pmVar.fWTAfUmVKrZq();
                    while (true) {
                        if (fWTAfUmVKrZq == T1fB7bDYiVJQ) {
                            i3 = -1;
                            break;
                        }
                        if (fWTAfUmVKrZq == null) {
                            i3 = 0;
                            break;
                        }
                        defpackage.pm pmVar2 = (defpackage.pm) fWTAfUmVKrZq;
                        int giKS3J6vZuNy = pmVar2.giKS3J6vZuNy();
                        if (giKS3J6vZuNy != 0) {
                            i3 = giKS3J6vZuNy;
                            break;
                        }
                        fWTAfUmVKrZq = pmVar2.fWTAfUmVKrZq();
                    }
                } else {
                    i3 = i2;
                }
            }
            if (i3 >= 0) {
                defpackage.rm rmVar = this;
                if (fNwYGHIYeJcR.compareAndSet(rmVar, j, i3 | j2)) {
                    return;
                } else {
                    this = rmVar;
                }
            }
        }
    }

    @Override // java.util.concurrent.Executor
    public final void execute(java.lang.Runnable runnable) {
        QiMR8OkAhezm(this, runnable, 6);
    }

    public final boolean fNwYGHIYeJcR() {
        defpackage.rm rmVar;
        defpackage.ru ruVar;
        int i;
        while (true) {
            long j = fNwYGHIYeJcR.get(this);
            defpackage.pm pmVar = (defpackage.pm) this.Ns0WNyEWdPsk.giKS3J6vZuNy((int) (2097151 & j));
            if (pmVar == null) {
                pmVar = null;
                rmVar = this;
            } else {
                long j2 = (2097152 + j) & (-2097152);
                java.lang.Object fWTAfUmVKrZq = pmVar.fWTAfUmVKrZq();
                while (true) {
                    ruVar = T1fB7bDYiVJQ;
                    if (fWTAfUmVKrZq == ruVar) {
                        i = -1;
                        break;
                    }
                    if (fWTAfUmVKrZq == null) {
                        i = 0;
                        break;
                    }
                    defpackage.pm pmVar2 = (defpackage.pm) fWTAfUmVKrZq;
                    i = pmVar2.giKS3J6vZuNy();
                    if (i != 0) {
                        break;
                    }
                    fWTAfUmVKrZq = pmVar2.fWTAfUmVKrZq();
                    j = j;
                }
                if (i >= 0) {
                    defpackage.rm rmVar2 = this;
                    boolean compareAndSet = fNwYGHIYeJcR.compareAndSet(rmVar2, j, i | j2);
                    rmVar = rmVar2;
                    if (compareAndSet) {
                        pmVar.QiMR8OkAhezm(ruVar);
                    }
                    this = rmVar;
                } else {
                    continue;
                }
            }
            if (pmVar == null) {
                return false;
            }
            if (defpackage.pm.h3m55N1URyyK.compareAndSet(pmVar, -1, 0)) {
                java.util.concurrent.locks.LockSupport.unpark(pmVar);
                return true;
            }
            this = rmVar;
        }
    }

    public final int giKS3J6vZuNy() {
        synchronized (this.Ns0WNyEWdPsk) {
            try {
                if (gUjdnLbkVAaA.get(this) != 0) {
                    return -1;
                }
                java.util.concurrent.atomic.AtomicLongFieldUpdater atomicLongFieldUpdater = h3m55N1URyyK;
                long j = atomicLongFieldUpdater.get(this);
                int i = (int) (j & 2097151);
                int i2 = i - ((int) ((j & 4398044413952L) >> 21));
                if (i2 < 0) {
                    i2 = 0;
                }
                if (i2 >= this.WDYagTQQm9ns) {
                    return 0;
                }
                if (i >= this.oh71FJcDz6S2) {
                    return 0;
                }
                int i3 = ((int) (atomicLongFieldUpdater.get(this) & 2097151)) + 1;
                if (i3 <= 0 || this.Ns0WNyEWdPsk.giKS3J6vZuNy(i3) != null) {
                    throw new java.lang.IllegalArgumentException("Failed requirement.");
                }
                defpackage.pm pmVar = new defpackage.pm(this, i3);
                this.Ns0WNyEWdPsk.fWTAfUmVKrZq(i3, pmVar);
                if (i3 != ((int) (2097151 & atomicLongFieldUpdater.incrementAndGet(this)))) {
                    throw new java.lang.IllegalArgumentException("Failed requirement.");
                }
                int i4 = i2 + 1;
                pmVar.start();
                return i4;
            } catch (java.lang.Throwable th) {
                throw th;
            }
        }
    }

    public final java.lang.String toString() {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        defpackage.y41 y41Var = this.Ns0WNyEWdPsk;
        int ZpBGe2uQfcn8 = y41Var.ZpBGe2uQfcn8();
        int i = 0;
        int i2 = 0;
        int i3 = 0;
        int i4 = 0;
        int i5 = 0;
        for (int i6 = 1; i6 < ZpBGe2uQfcn8; i6++) {
            defpackage.pm pmVar = (defpackage.pm) y41Var.giKS3J6vZuNy(i6);
            if (pmVar != null) {
                int fWTAfUmVKrZq = pmVar.WDYagTQQm9ns.fWTAfUmVKrZq();
                int ordinal = pmVar.QiMR8OkAhezm.ordinal();
                if (ordinal == 0) {
                    i++;
                    java.lang.StringBuilder sb = new java.lang.StringBuilder();
                    sb.append(fWTAfUmVKrZq);
                    sb.append('c');
                    arrayList.add(sb.toString());
                } else if (ordinal == 1) {
                    i2++;
                    java.lang.StringBuilder sb2 = new java.lang.StringBuilder();
                    sb2.append(fWTAfUmVKrZq);
                    sb2.append('b');
                    arrayList.add(sb2.toString());
                } else if (ordinal == 2) {
                    i3++;
                } else if (ordinal == 3) {
                    i4++;
                    if (fWTAfUmVKrZq > 0) {
                        java.lang.StringBuilder sb3 = new java.lang.StringBuilder();
                        sb3.append(fWTAfUmVKrZq);
                        sb3.append('d');
                        arrayList.add(sb3.toString());
                    }
                } else {
                    if (ordinal != 4) {
                        defpackage.h7.T1fB7bDYiVJQ();
                        return null;
                    }
                    i5++;
                }
            }
        }
        long j = h3m55N1URyyK.get(this);
        java.lang.StringBuilder sb4 = new java.lang.StringBuilder();
        sb4.append(this.P05cfTpS5W5L);
        sb4.append('@');
        sb4.append(defpackage.nn.IJ0hOnjhPOri(this));
        sb4.append("[Pool Size {core = ");
        int i7 = this.WDYagTQQm9ns;
        sb4.append(i7);
        sb4.append(", max = ");
        sb4.append(this.oh71FJcDz6S2);
        sb4.append("}, Worker States {CPU = ");
        sb4.append(i);
        sb4.append(", blocking = ");
        sb4.append(i2);
        sb4.append(", parked = ");
        sb4.append(i3);
        sb4.append(", dormant = ");
        sb4.append(i4);
        sb4.append(", terminated = ");
        sb4.append(i5);
        sb4.append("}, running workers queues = ");
        sb4.append(arrayList);
        sb4.append(", global CPU queue size = ");
        sb4.append(this.e6mdH7fiFuta.fWTAfUmVKrZq());
        sb4.append(", global blocking queue size = ");
        sb4.append(this.GE9mJIPrb8gP.fWTAfUmVKrZq());
        sb4.append(", Control State {created workers= ");
        sb4.append((int) (2097151 & j));
        sb4.append(", blocking tasks = ");
        sb4.append((int) ((4398044413952L & j) >> 21));
        sb4.append(", CPUs acquired = ");
        sb4.append(i7 - ((int) ((j & 9223367638808264704L) >> 42)));
        sb4.append("}]");
        return sb4.toString();
    }
}
