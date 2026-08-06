package defpackage;

/* loaded from: classes.dex */
public final class tj implements java.util.concurrent.Executor, java.io.Closeable {
    public final long AARZUJiTa;
    public final java.lang.String EXtogiMhuM;
    public final defpackage.i20 SH1y5HwkJhh;
    private volatile /* synthetic */ int _isTerminated$volatile;
    public final int adDC3e2L;
    private volatile /* synthetic */ long controlState$volatile;
    public final defpackage.h11 ez2rX8ReCYw;
    private volatile /* synthetic */ long parkedWorkersStack$volatile;
    public final defpackage.i20 riuEU0zW4;
    public final int xiZrDbcSW0;
    public static final /* synthetic */ java.util.concurrent.atomic.AtomicLongFieldUpdater JlrlGoKF = java.util.concurrent.atomic.AtomicLongFieldUpdater.newUpdater(defpackage.tj.class, "parkedWorkersStack$volatile");
    public static final /* synthetic */ java.util.concurrent.atomic.AtomicLongFieldUpdater DFo87pBq1E5 = java.util.concurrent.atomic.AtomicLongFieldUpdater.newUpdater(defpackage.tj.class, "controlState$volatile");
    public static final /* synthetic */ java.util.concurrent.atomic.AtomicIntegerFieldUpdater SyNS6RMn = java.util.concurrent.atomic.AtomicIntegerFieldUpdater.newUpdater(defpackage.tj.class, "_isTerminated$volatile");
    public static final defpackage.et cnag84Bm = new defpackage.et("NOT_IN_STACK", 1);

    public tj(int i, int i2, long j, java.lang.String str) {
        this.adDC3e2L = i;
        this.xiZrDbcSW0 = i2;
        this.AARZUJiTa = j;
        this.EXtogiMhuM = str;
        if (i < 1) {
            defpackage.db.adDC3e2L(defpackage.fx0.riuEU0zW4(i, "Core pool size ", " should be at least 1"));
            throw null;
        }
        if (i2 < i) {
            defpackage.db.adDC3e2L(defpackage.fx0.EXtogiMhuM(i2, i, "Max pool size ", " should be greater than or equals to core pool size "));
            throw null;
        }
        if (i2 > 2097150) {
            defpackage.db.adDC3e2L(defpackage.fx0.riuEU0zW4(i2, "Max pool size ", " should not exceed maximal supported number of threads 2097150"));
            throw null;
        }
        if (j <= 0) {
            defpackage.db.EXtogiMhuM("Idle worker keep alive time ", j, " must be positive");
            throw null;
        }
        this.riuEU0zW4 = new defpackage.i20();
        this.SH1y5HwkJhh = new defpackage.i20();
        this.ez2rX8ReCYw = new defpackage.h11((i + 1) * 2);
        this.controlState$volatile = i << 42;
        this._isTerminated$volatile = 0;
    }

    public static /* synthetic */ void AARZUJiTa(defpackage.tj tjVar, java.lang.Runnable runnable, int i) {
        tjVar.F7NU4MC0GW(runnable, false, (i & 4) == 0);
    }

    public final void F7NU4MC0GW(java.lang.Runnable runnable, boolean z, boolean z2) {
        defpackage.ze1 af1Var;
        defpackage.sj sjVar;
        defpackage.bf1.xiZrDbcSW0.getClass();
        long nanoTime = java.lang.System.nanoTime();
        if (runnable instanceof defpackage.ze1) {
            af1Var = (defpackage.ze1) runnable;
            af1Var.adDC3e2L = nanoTime;
            af1Var.xiZrDbcSW0 = z;
        } else {
            af1Var = new defpackage.af1(runnable, nanoTime, z);
        }
        boolean z3 = af1Var.xiZrDbcSW0;
        java.util.concurrent.atomic.AtomicLongFieldUpdater atomicLongFieldUpdater = DFo87pBq1E5;
        long addAndGet = z3 ? atomicLongFieldUpdater.addAndGet(this, 2097152L) : 0L;
        java.lang.Thread currentThread = java.lang.Thread.currentThread();
        defpackage.rj rjVar = null;
        defpackage.rj rjVar2 = currentThread instanceof defpackage.rj ? (defpackage.rj) currentThread : null;
        if (rjVar2 != null && rjVar2.JlrlGoKF == this) {
            rjVar = rjVar2;
        }
        if (rjVar != null && (sjVar = rjVar.AARZUJiTa) != defpackage.sj.riuEU0zW4 && (af1Var.xiZrDbcSW0 || sjVar != defpackage.sj.xiZrDbcSW0)) {
            rjVar.ez2rX8ReCYw = true;
            af1Var = rjVar.adDC3e2L.IHQe1A4L2xu(af1Var, z2);
        }
        if (af1Var != null) {
            if (!(af1Var.xiZrDbcSW0 ? this.SH1y5HwkJhh.IHQe1A4L2xu(af1Var) : this.riuEU0zW4.IHQe1A4L2xu(af1Var))) {
                throw new java.util.concurrent.RejectedExecutionException(this.EXtogiMhuM + " was terminated");
            }
        }
        boolean z4 = z2 && rjVar != null;
        if (z3) {
            if (z4 || JlrlGoKF() || ez2rX8ReCYw(addAndGet)) {
                return;
            }
            JlrlGoKF();
            return;
        }
        if (z4 || JlrlGoKF() || ez2rX8ReCYw(atomicLongFieldUpdater.get(this))) {
            return;
        }
        JlrlGoKF();
    }

    public final boolean JlrlGoKF() {
        defpackage.tj tjVar;
        defpackage.et etVar;
        int i;
        while (true) {
            long j = JlrlGoKF.get(this);
            defpackage.rj rjVar = (defpackage.rj) this.ez2rX8ReCYw.oh6vYeIP((int) (2097151 & j));
            if (rjVar == null) {
                rjVar = null;
                tjVar = this;
            } else {
                long j2 = (2097152 + j) & (-2097152);
                java.lang.Object r1MBDhnF = rjVar.r1MBDhnF();
                while (true) {
                    etVar = cnag84Bm;
                    if (r1MBDhnF == etVar) {
                        i = -1;
                        break;
                    }
                    if (r1MBDhnF == null) {
                        i = 0;
                        break;
                    }
                    defpackage.rj rjVar2 = (defpackage.rj) r1MBDhnF;
                    i = rjVar2.oh6vYeIP();
                    if (i != 0) {
                        break;
                    }
                    r1MBDhnF = rjVar2.r1MBDhnF();
                    j = j;
                }
                if (i >= 0) {
                    defpackage.tj tjVar2 = this;
                    boolean compareAndSet = JlrlGoKF.compareAndSet(tjVar2, j, i | j2);
                    tjVar = tjVar2;
                    if (compareAndSet) {
                        rjVar.AARZUJiTa(etVar);
                    }
                    this = tjVar;
                } else {
                    continue;
                }
            }
            if (rjVar == null) {
                return false;
            }
            if (defpackage.rj.DFo87pBq1E5.compareAndSet(rjVar, -1, 0)) {
                java.util.concurrent.locks.LockSupport.unpark(rjVar);
                return true;
            }
            this = tjVar;
        }
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
        defpackage.ze1 ze1Var;
        if (SyNS6RMn.compareAndSet(this, 0, 1)) {
            java.lang.Thread currentThread = java.lang.Thread.currentThread();
            defpackage.rj rjVar = null;
            defpackage.rj rjVar2 = currentThread instanceof defpackage.rj ? (defpackage.rj) currentThread : null;
            if (rjVar2 != null && rjVar2.JlrlGoKF == this) {
                rjVar = rjVar2;
            }
            synchronized (this.ez2rX8ReCYw) {
                i = (int) (DFo87pBq1E5.get(this) & 2097151);
            }
            if (1 <= i) {
                int i2 = 1;
                while (true) {
                    java.lang.Object oh6vYeIP = this.ez2rX8ReCYw.oh6vYeIP(i2);
                    oh6vYeIP.getClass();
                    defpackage.rj rjVar3 = (defpackage.rj) oh6vYeIP;
                    if (rjVar3 != rjVar) {
                        while (rjVar3.getState() != java.lang.Thread.State.TERMINATED) {
                            java.util.concurrent.locks.LockSupport.unpark(rjVar3);
                            rjVar3.join(10000L);
                        }
                        rjVar3.adDC3e2L.F7NU4MC0GW(this.SH1y5HwkJhh);
                    }
                    if (i2 == i) {
                        break;
                    } else {
                        i2++;
                    }
                }
            }
            this.SH1y5HwkJhh.oh6vYeIP();
            this.riuEU0zW4.oh6vYeIP();
            while (true) {
                if (rjVar != null) {
                    ze1Var = rjVar.IHQe1A4L2xu(true);
                }
                ze1Var = (defpackage.ze1) this.riuEU0zW4.F7NU4MC0GW();
                if (ze1Var == null && (ze1Var = (defpackage.ze1) this.SH1y5HwkJhh.F7NU4MC0GW()) == null) {
                    break;
                }
                try {
                    ze1Var.run();
                } catch (java.lang.Throwable th) {
                    java.lang.Thread currentThread2 = java.lang.Thread.currentThread();
                    currentThread2.getUncaughtExceptionHandler().uncaughtException(currentThread2, th);
                }
            }
            if (rjVar != null) {
                rjVar.EXtogiMhuM(defpackage.sj.riuEU0zW4);
            }
            JlrlGoKF.set(this, 0L);
            DFo87pBq1E5.set(this, 0L);
        }
    }

    @Override // java.util.concurrent.Executor
    public final void execute(java.lang.Runnable runnable) {
        AARZUJiTa(this, runnable, 6);
    }

    public final boolean ez2rX8ReCYw(long j) {
        int i = ((int) (2097151 & j)) - ((int) ((j & 4398044413952L) >> 21));
        if (i < 0) {
            i = 0;
        }
        int i2 = this.adDC3e2L;
        if (i < i2) {
            int oh6vYeIP = oh6vYeIP();
            if (oh6vYeIP == 1 && i2 > 1) {
                oh6vYeIP();
            }
            if (oh6vYeIP > 0) {
                return true;
            }
        }
        return false;
    }

    public final int oh6vYeIP() {
        synchronized (this.ez2rX8ReCYw) {
            try {
                if (SyNS6RMn.get(this) != 0) {
                    return -1;
                }
                java.util.concurrent.atomic.AtomicLongFieldUpdater atomicLongFieldUpdater = DFo87pBq1E5;
                long j = atomicLongFieldUpdater.get(this);
                int i = (int) (j & 2097151);
                int i2 = i - ((int) ((j & 4398044413952L) >> 21));
                if (i2 < 0) {
                    i2 = 0;
                }
                if (i2 >= this.adDC3e2L) {
                    return 0;
                }
                if (i >= this.xiZrDbcSW0) {
                    return 0;
                }
                int i3 = ((int) (atomicLongFieldUpdater.get(this) & 2097151)) + 1;
                if (i3 <= 0 || this.ez2rX8ReCYw.oh6vYeIP(i3) != null) {
                    throw new java.lang.IllegalArgumentException("Failed requirement.");
                }
                defpackage.rj rjVar = new defpackage.rj(this, i3);
                this.ez2rX8ReCYw.r1MBDhnF(i3, rjVar);
                if (i3 != ((int) (2097151 & atomicLongFieldUpdater.incrementAndGet(this)))) {
                    throw new java.lang.IllegalArgumentException("Failed requirement.");
                }
                int i4 = i2 + 1;
                rjVar.start();
                return i4;
            } catch (java.lang.Throwable th) {
                throw th;
            }
        }
    }

    public final void riuEU0zW4(defpackage.rj rjVar, int i, int i2) {
        while (true) {
            long j = JlrlGoKF.get(this);
            int i3 = (int) (2097151 & j);
            long j2 = (2097152 + j) & (-2097152);
            if (i3 == i) {
                if (i2 == 0) {
                    java.lang.Object r1MBDhnF = rjVar.r1MBDhnF();
                    while (true) {
                        if (r1MBDhnF == cnag84Bm) {
                            i3 = -1;
                            break;
                        }
                        if (r1MBDhnF == null) {
                            i3 = 0;
                            break;
                        }
                        defpackage.rj rjVar2 = (defpackage.rj) r1MBDhnF;
                        int oh6vYeIP = rjVar2.oh6vYeIP();
                        if (oh6vYeIP != 0) {
                            i3 = oh6vYeIP;
                            break;
                        }
                        r1MBDhnF = rjVar2.r1MBDhnF();
                    }
                } else {
                    i3 = i2;
                }
            }
            if (i3 >= 0) {
                defpackage.tj tjVar = this;
                if (JlrlGoKF.compareAndSet(tjVar, j, i3 | j2)) {
                    return;
                } else {
                    this = tjVar;
                }
            }
        }
    }

    public final java.lang.String toString() {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        defpackage.h11 h11Var = this.ez2rX8ReCYw;
        int IHQe1A4L2xu = h11Var.IHQe1A4L2xu();
        int i = 0;
        int i2 = 0;
        int i3 = 0;
        int i4 = 0;
        int i5 = 0;
        for (int i6 = 1; i6 < IHQe1A4L2xu; i6++) {
            defpackage.rj rjVar = (defpackage.rj) h11Var.oh6vYeIP(i6);
            if (rjVar != null) {
                int r1MBDhnF = rjVar.adDC3e2L.r1MBDhnF();
                int ordinal = rjVar.AARZUJiTa.ordinal();
                if (ordinal == 0) {
                    i++;
                    java.lang.StringBuilder sb = new java.lang.StringBuilder();
                    sb.append(r1MBDhnF);
                    sb.append('c');
                    arrayList.add(sb.toString());
                } else if (ordinal == 1) {
                    i2++;
                    java.lang.StringBuilder sb2 = new java.lang.StringBuilder();
                    sb2.append(r1MBDhnF);
                    sb2.append('b');
                    arrayList.add(sb2.toString());
                } else if (ordinal == 2) {
                    i3++;
                } else if (ordinal == 3) {
                    i4++;
                    if (r1MBDhnF > 0) {
                        java.lang.StringBuilder sb3 = new java.lang.StringBuilder();
                        sb3.append(r1MBDhnF);
                        sb3.append('d');
                        arrayList.add(sb3.toString());
                    }
                } else {
                    if (ordinal != 4) {
                        defpackage.db.F7NU4MC0GW();
                        return null;
                    }
                    i5++;
                }
            }
        }
        long j = DFo87pBq1E5.get(this);
        java.lang.StringBuilder sb4 = new java.lang.StringBuilder();
        sb4.append(this.EXtogiMhuM);
        sb4.append('@');
        sb4.append(defpackage.fm.UsuH8pd5P(this));
        sb4.append("[Pool Size {core = ");
        int i7 = this.adDC3e2L;
        sb4.append(i7);
        sb4.append(", max = ");
        defpackage.fx0.EgCjBq0SZwJ(sb4, this.xiZrDbcSW0, "}, Worker States {CPU = ", i, ", blocking = ");
        defpackage.fx0.EgCjBq0SZwJ(sb4, i2, ", parked = ", i3, ", dormant = ");
        defpackage.fx0.EgCjBq0SZwJ(sb4, i4, ", terminated = ", i5, "}, running workers queues = ");
        sb4.append(arrayList);
        sb4.append(", global CPU queue size = ");
        sb4.append(this.riuEU0zW4.r1MBDhnF());
        sb4.append(", global blocking queue size = ");
        sb4.append(this.SH1y5HwkJhh.r1MBDhnF());
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
