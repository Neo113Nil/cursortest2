package defpackage;

/* loaded from: classes.dex */
public final class rj extends java.lang.Thread {
    public static final /* synthetic */ java.util.concurrent.atomic.AtomicIntegerFieldUpdater DFo87pBq1E5 = java.util.concurrent.atomic.AtomicIntegerFieldUpdater.newUpdater(defpackage.rj.class, "workerCtl$volatile");
    public defpackage.sj AARZUJiTa;
    public long EXtogiMhuM;
    public final /* synthetic */ defpackage.tj JlrlGoKF;
    public int SH1y5HwkJhh;
    public final defpackage.vp1 adDC3e2L;
    public boolean ez2rX8ReCYw;
    private volatile int indexInArray;
    private volatile java.lang.Object nextParkedWorker;
    public long riuEU0zW4;
    private volatile /* synthetic */ int workerCtl$volatile;
    public final defpackage.rz0 xiZrDbcSW0;

    public rj(defpackage.tj tjVar, int i) {
        this.JlrlGoKF = tjVar;
        setDaemon(true);
        setContextClassLoader(defpackage.tj.class.getClassLoader());
        this.adDC3e2L = new defpackage.vp1();
        this.xiZrDbcSW0 = new defpackage.rz0();
        this.AARZUJiTa = defpackage.sj.EXtogiMhuM;
        this.nextParkedWorker = defpackage.tj.cnag84Bm;
        int nanoTime = (int) java.lang.System.nanoTime();
        this.SH1y5HwkJhh = nanoTime == 0 ? 42 : nanoTime;
        xiZrDbcSW0(i);
    }

    public final void AARZUJiTa(java.lang.Object obj) {
        this.nextParkedWorker = obj;
    }

    public final boolean EXtogiMhuM(defpackage.sj sjVar) {
        defpackage.sj sjVar2 = this.AARZUJiTa;
        boolean z = sjVar2 == defpackage.sj.adDC3e2L;
        if (z) {
            defpackage.tj.DFo87pBq1E5.addAndGet(this.JlrlGoKF, 4398046511104L);
        }
        if (sjVar2 != sjVar) {
            this.AARZUJiTa = sjVar;
        }
        return z;
    }

    public final int F7NU4MC0GW(int i) {
        int i2 = this.SH1y5HwkJhh;
        int i3 = i2 ^ (i2 << 13);
        int i4 = i3 ^ (i3 >> 17);
        int i5 = i4 ^ (i4 << 5);
        this.SH1y5HwkJhh = i5;
        int i6 = i - 1;
        return (i6 & i) == 0 ? i6 & i5 : (Integer.MAX_VALUE & i5) % i;
    }

    public final defpackage.ze1 IHQe1A4L2xu(boolean z) {
        defpackage.ze1 adDC3e2L;
        defpackage.ze1 adDC3e2L2;
        long j;
        defpackage.sj sjVar = this.AARZUJiTa;
        defpackage.tj tjVar = this.JlrlGoKF;
        defpackage.vp1 vp1Var = this.adDC3e2L;
        defpackage.sj sjVar2 = defpackage.sj.adDC3e2L;
        if (sjVar != sjVar2) {
            java.util.concurrent.atomic.AtomicLongFieldUpdater atomicLongFieldUpdater = defpackage.tj.DFo87pBq1E5;
            do {
                j = atomicLongFieldUpdater.get(tjVar);
                if (((int) ((9223367638808264704L & j) >> 42)) == 0) {
                    defpackage.ze1 AARZUJiTa = vp1Var.AARZUJiTa();
                    return (AARZUJiTa == null && (AARZUJiTa = (defpackage.ze1) tjVar.SH1y5HwkJhh.F7NU4MC0GW()) == null) ? riuEU0zW4(1) : AARZUJiTa;
                }
            } while (!defpackage.tj.DFo87pBq1E5.compareAndSet(tjVar, j, j - 4398046511104L));
            this.AARZUJiTa = sjVar2;
        }
        if (z) {
            boolean z2 = F7NU4MC0GW(tjVar.adDC3e2L * 2) == 0;
            if (z2 && (adDC3e2L2 = adDC3e2L()) != null) {
                return adDC3e2L2;
            }
            defpackage.ze1 adDC3e2L3 = vp1Var.adDC3e2L();
            if (adDC3e2L3 != null) {
                return adDC3e2L3;
            }
            if (!z2 && (adDC3e2L = adDC3e2L()) != null) {
                return adDC3e2L;
            }
        } else {
            defpackage.ze1 adDC3e2L4 = adDC3e2L();
            if (adDC3e2L4 != null) {
                return adDC3e2L4;
            }
        }
        return riuEU0zW4(3);
    }

    public final defpackage.ze1 adDC3e2L() {
        int F7NU4MC0GW = F7NU4MC0GW(2);
        defpackage.tj tjVar = this.JlrlGoKF;
        defpackage.i20 i20Var = tjVar.SH1y5HwkJhh;
        defpackage.i20 i20Var2 = tjVar.riuEU0zW4;
        if (F7NU4MC0GW == 0) {
            defpackage.ze1 ze1Var = (defpackage.ze1) i20Var2.F7NU4MC0GW();
            return ze1Var != null ? ze1Var : (defpackage.ze1) i20Var.F7NU4MC0GW();
        }
        defpackage.ze1 ze1Var2 = (defpackage.ze1) i20Var.F7NU4MC0GW();
        return ze1Var2 != null ? ze1Var2 : (defpackage.ze1) i20Var2.F7NU4MC0GW();
    }

    public final int oh6vYeIP() {
        return this.indexInArray;
    }

    public final java.lang.Object r1MBDhnF() {
        return this.nextParkedWorker;
    }

    public final defpackage.ze1 riuEU0zW4(int i) {
        defpackage.ze1 ze1Var;
        long riuEU0zW4;
        java.util.concurrent.atomic.AtomicLongFieldUpdater atomicLongFieldUpdater = defpackage.tj.DFo87pBq1E5;
        defpackage.tj tjVar = this.JlrlGoKF;
        int i2 = (int) (atomicLongFieldUpdater.get(tjVar) & 2097151);
        if (i2 < 2) {
            return null;
        }
        int F7NU4MC0GW = F7NU4MC0GW(i2);
        long j = Long.MAX_VALUE;
        for (int i3 = 0; i3 < i2; i3++) {
            F7NU4MC0GW++;
            if (F7NU4MC0GW > i2) {
                F7NU4MC0GW = 1;
            }
            defpackage.rj rjVar = (defpackage.rj) tjVar.ez2rX8ReCYw.oh6vYeIP(F7NU4MC0GW);
            if (rjVar != null && rjVar != this) {
                defpackage.vp1 vp1Var = rjVar.adDC3e2L;
                if (i == 3) {
                    ze1Var = vp1Var.xiZrDbcSW0();
                } else {
                    vp1Var.getClass();
                    int i4 = defpackage.vp1.F7NU4MC0GW.get(vp1Var);
                    int i5 = defpackage.vp1.r1MBDhnF.get(vp1Var);
                    boolean z = i == 1;
                    while (i4 != i5 && (!z || defpackage.vp1.adDC3e2L.get(vp1Var) != 0)) {
                        int i6 = i4 + 1;
                        ze1Var = vp1Var.EXtogiMhuM(i4, z);
                        if (ze1Var != null) {
                            break;
                        }
                        i4 = i6;
                    }
                    ze1Var = null;
                }
                defpackage.rz0 rz0Var = this.xiZrDbcSW0;
                if (ze1Var != null) {
                    rz0Var.adDC3e2L = ze1Var;
                    riuEU0zW4 = -1;
                } else {
                    riuEU0zW4 = vp1Var.riuEU0zW4(i, rz0Var);
                }
                if (riuEU0zW4 == -1) {
                    defpackage.ze1 ze1Var2 = (defpackage.ze1) rz0Var.adDC3e2L;
                    rz0Var.adDC3e2L = null;
                    return ze1Var2;
                }
                if (riuEU0zW4 > 0) {
                    j = java.lang.Math.min(j, riuEU0zW4);
                }
            }
        }
        if (j == Long.MAX_VALUE) {
            j = 0;
        }
        this.riuEU0zW4 = j;
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
            while (defpackage.tj.SyNS6RMn.get(this.JlrlGoKF) == 0) {
                defpackage.sj sjVar = this.AARZUJiTa;
                defpackage.sj sjVar2 = defpackage.sj.riuEU0zW4;
                if (sjVar == sjVar2) {
                    break loop0;
                }
                defpackage.ze1 IHQe1A4L2xu = IHQe1A4L2xu(this.ez2rX8ReCYw);
                if (IHQe1A4L2xu != null) {
                    this.riuEU0zW4 = 0L;
                    defpackage.tj tjVar = this.JlrlGoKF;
                    this.EXtogiMhuM = 0L;
                    if (this.AARZUJiTa == defpackage.sj.AARZUJiTa) {
                        this.AARZUJiTa = defpackage.sj.xiZrDbcSW0;
                    }
                    if (IHQe1A4L2xu.xiZrDbcSW0) {
                        if (EXtogiMhuM(defpackage.sj.xiZrDbcSW0) && !tjVar.JlrlGoKF() && !tjVar.ez2rX8ReCYw(defpackage.tj.DFo87pBq1E5.get(tjVar))) {
                            tjVar.JlrlGoKF();
                        }
                        try {
                            IHQe1A4L2xu.run();
                        } catch (java.lang.Throwable th) {
                            java.lang.Thread currentThread = java.lang.Thread.currentThread();
                            currentThread.getUncaughtExceptionHandler().uncaughtException(currentThread, th);
                        }
                        defpackage.tj.DFo87pBq1E5.addAndGet(tjVar, -2097152L);
                        if (this.AARZUJiTa != sjVar2) {
                            this.AARZUJiTa = defpackage.sj.EXtogiMhuM;
                        }
                    } else {
                        try {
                            IHQe1A4L2xu.run();
                        } catch (java.lang.Throwable th2) {
                            java.lang.Thread currentThread2 = java.lang.Thread.currentThread();
                            currentThread2.getUncaughtExceptionHandler().uncaughtException(currentThread2, th2);
                        }
                    }
                } else {
                    this.ez2rX8ReCYw = false;
                    if (this.riuEU0zW4 == 0) {
                        java.lang.Object obj = this.nextParkedWorker;
                        defpackage.et etVar = defpackage.tj.cnag84Bm;
                        if (obj != etVar) {
                            DFo87pBq1E5.set(this, -1);
                            while (this.nextParkedWorker != defpackage.tj.cnag84Bm) {
                                java.util.concurrent.atomic.AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = DFo87pBq1E5;
                                if (atomicIntegerFieldUpdater.get(this) == -1) {
                                    defpackage.tj tjVar2 = this.JlrlGoKF;
                                    java.util.concurrent.atomic.AtomicIntegerFieldUpdater atomicIntegerFieldUpdater2 = defpackage.tj.SyNS6RMn;
                                    if (atomicIntegerFieldUpdater2.get(tjVar2) != 0) {
                                        break;
                                    }
                                    defpackage.sj sjVar3 = this.AARZUJiTa;
                                    defpackage.sj sjVar4 = defpackage.sj.riuEU0zW4;
                                    if (sjVar3 == sjVar4) {
                                        break;
                                    }
                                    EXtogiMhuM(defpackage.sj.AARZUJiTa);
                                    java.lang.Thread.interrupted();
                                    if (this.EXtogiMhuM == 0) {
                                        j = 2097151;
                                        this.EXtogiMhuM = java.lang.System.nanoTime() + this.JlrlGoKF.AARZUJiTa;
                                    } else {
                                        j = 2097151;
                                    }
                                    java.util.concurrent.locks.LockSupport.parkNanos(this.JlrlGoKF.AARZUJiTa);
                                    if (java.lang.System.nanoTime() - this.EXtogiMhuM >= 0) {
                                        this.EXtogiMhuM = 0L;
                                        defpackage.tj tjVar3 = this.JlrlGoKF;
                                        synchronized (tjVar3.ez2rX8ReCYw) {
                                            try {
                                                if (!(atomicIntegerFieldUpdater2.get(tjVar3) != 0)) {
                                                    java.util.concurrent.atomic.AtomicLongFieldUpdater atomicLongFieldUpdater = defpackage.tj.DFo87pBq1E5;
                                                    if (((int) (atomicLongFieldUpdater.get(tjVar3) & j)) > tjVar3.adDC3e2L) {
                                                        if (atomicIntegerFieldUpdater.compareAndSet(this, -1, 1)) {
                                                            int i = this.indexInArray;
                                                            xiZrDbcSW0(0);
                                                            tjVar3.riuEU0zW4(this, i, 0);
                                                            int andDecrement = (int) (atomicLongFieldUpdater.getAndDecrement(tjVar3) & j);
                                                            if (andDecrement != i) {
                                                                java.lang.Object oh6vYeIP = tjVar3.ez2rX8ReCYw.oh6vYeIP(andDecrement);
                                                                oh6vYeIP.getClass();
                                                                defpackage.rj rjVar = (defpackage.rj) oh6vYeIP;
                                                                tjVar3.ez2rX8ReCYw.r1MBDhnF(i, rjVar);
                                                                rjVar.xiZrDbcSW0(i);
                                                                tjVar3.riuEU0zW4(rjVar, andDecrement, i);
                                                            }
                                                            tjVar3.ez2rX8ReCYw.r1MBDhnF(andDecrement, null);
                                                            this.AARZUJiTa = sjVar4;
                                                        }
                                                    }
                                                }
                                            } catch (java.lang.Throwable th3) {
                                                throw th3;
                                            }
                                        }
                                    }
                                }
                            }
                        } else {
                            defpackage.tj tjVar4 = this.JlrlGoKF;
                            if (this.nextParkedWorker == etVar) {
                                java.util.concurrent.atomic.AtomicLongFieldUpdater atomicLongFieldUpdater2 = defpackage.tj.JlrlGoKF;
                                while (true) {
                                    long j2 = atomicLongFieldUpdater2.get(tjVar4);
                                    int i2 = this.indexInArray;
                                    this.nextParkedWorker = tjVar4.ez2rX8ReCYw.oh6vYeIP((int) (j2 & 2097151));
                                    defpackage.tj tjVar5 = tjVar4;
                                    if (defpackage.tj.JlrlGoKF.compareAndSet(tjVar5, j2, ((j2 + 2097152) & (-2097152)) | i2)) {
                                        break;
                                    } else {
                                        tjVar4 = tjVar5;
                                    }
                                }
                            }
                        }
                    } else if (z) {
                        EXtogiMhuM(defpackage.sj.AARZUJiTa);
                        java.lang.Thread.interrupted();
                        java.util.concurrent.locks.LockSupport.parkNanos(this.riuEU0zW4);
                        this.riuEU0zW4 = 0L;
                    } else {
                        z = true;
                    }
                }
            }
            break loop0;
        }
        EXtogiMhuM(defpackage.sj.riuEU0zW4);
    }

    public final void xiZrDbcSW0(int i) {
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append(this.JlrlGoKF.EXtogiMhuM);
        sb.append("-worker-");
        sb.append(i == 0 ? "TERMINATED" : java.lang.String.valueOf(i));
        setName(sb.toString());
        this.indexInArray = i;
    }
}
