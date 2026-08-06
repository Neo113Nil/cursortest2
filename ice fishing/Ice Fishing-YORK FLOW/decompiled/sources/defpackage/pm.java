package defpackage;

/* compiled from: r8-map-id-5e15bf382d9e1cc682b2b5d208f848646545054061ee84effb1e415a0540fc32 */
/* loaded from: classes.dex */
public final class pm extends java.lang.Thread {
    public static final /* synthetic */ java.util.concurrent.atomic.AtomicIntegerFieldUpdater h3m55N1URyyK = java.util.concurrent.atomic.AtomicIntegerFieldUpdater.newUpdater(defpackage.pm.class, "workerCtl$volatile");
    public int GE9mJIPrb8gP;
    public boolean Ns0WNyEWdPsk;
    public long P05cfTpS5W5L;
    public defpackage.qm QiMR8OkAhezm;
    public final defpackage.lx1 WDYagTQQm9ns;
    public long e6mdH7fiFuta;
    public final /* synthetic */ defpackage.rm fNwYGHIYeJcR;
    private volatile int indexInArray;
    private volatile java.lang.Object nextParkedWorker;
    public final defpackage.z31 oh71FJcDz6S2;
    private volatile /* synthetic */ int workerCtl$volatile;

    public pm(defpackage.rm rmVar, int i) {
        this.fNwYGHIYeJcR = rmVar;
        setDaemon(true);
        setContextClassLoader(defpackage.rm.class.getClassLoader());
        this.WDYagTQQm9ns = new defpackage.lx1();
        this.oh71FJcDz6S2 = new defpackage.z31();
        this.QiMR8OkAhezm = defpackage.qm.P05cfTpS5W5L;
        this.nextParkedWorker = defpackage.rm.T1fB7bDYiVJQ;
        int nanoTime = (int) java.lang.System.nanoTime();
        this.GE9mJIPrb8gP = nanoTime == 0 ? 42 : nanoTime;
        oh71FJcDz6S2(i);
    }

    public final int JhCgjQRTAOCT(int i) {
        int i2 = this.GE9mJIPrb8gP;
        int i3 = i2 ^ (i2 << 13);
        int i4 = i3 ^ (i3 >> 17);
        int i5 = i4 ^ (i4 << 5);
        this.GE9mJIPrb8gP = i5;
        int i6 = i - 1;
        return (i6 & i) == 0 ? i6 & i5 : (Integer.MAX_VALUE & i5) % i;
    }

    public final boolean P05cfTpS5W5L(defpackage.qm qmVar) {
        defpackage.qm qmVar2 = this.QiMR8OkAhezm;
        boolean z = qmVar2 == defpackage.qm.WDYagTQQm9ns;
        if (z) {
            defpackage.rm.h3m55N1URyyK.addAndGet(this.fNwYGHIYeJcR, 4398046511104L);
        }
        if (qmVar2 != qmVar) {
            this.QiMR8OkAhezm = qmVar;
        }
        return z;
    }

    public final void QiMR8OkAhezm(java.lang.Object obj) {
        this.nextParkedWorker = obj;
    }

    public final defpackage.qj1 WDYagTQQm9ns() {
        int JhCgjQRTAOCT = JhCgjQRTAOCT(2);
        defpackage.rm rmVar = this.fNwYGHIYeJcR;
        defpackage.r30 r30Var = rmVar.GE9mJIPrb8gP;
        defpackage.r30 r30Var2 = rmVar.e6mdH7fiFuta;
        if (JhCgjQRTAOCT == 0) {
            defpackage.qj1 qj1Var = (defpackage.qj1) r30Var2.JhCgjQRTAOCT();
            return qj1Var != null ? qj1Var : (defpackage.qj1) r30Var.JhCgjQRTAOCT();
        }
        defpackage.qj1 qj1Var2 = (defpackage.qj1) r30Var.JhCgjQRTAOCT();
        return qj1Var2 != null ? qj1Var2 : (defpackage.qj1) r30Var2.JhCgjQRTAOCT();
    }

    public final defpackage.qj1 ZpBGe2uQfcn8(boolean z) {
        defpackage.qj1 WDYagTQQm9ns;
        defpackage.qj1 WDYagTQQm9ns2;
        long j;
        defpackage.qm qmVar = this.QiMR8OkAhezm;
        defpackage.rm rmVar = this.fNwYGHIYeJcR;
        defpackage.lx1 lx1Var = this.WDYagTQQm9ns;
        defpackage.qm qmVar2 = defpackage.qm.WDYagTQQm9ns;
        if (qmVar != qmVar2) {
            java.util.concurrent.atomic.AtomicLongFieldUpdater atomicLongFieldUpdater = defpackage.rm.h3m55N1URyyK;
            do {
                j = atomicLongFieldUpdater.get(rmVar);
                if (((int) ((9223367638808264704L & j) >> 42)) == 0) {
                    defpackage.qj1 QiMR8OkAhezm = lx1Var.QiMR8OkAhezm();
                    return (QiMR8OkAhezm == null && (QiMR8OkAhezm = (defpackage.qj1) rmVar.GE9mJIPrb8gP.JhCgjQRTAOCT()) == null) ? e6mdH7fiFuta(1) : QiMR8OkAhezm;
                }
            } while (!defpackage.rm.h3m55N1URyyK.compareAndSet(rmVar, j, j - 4398046511104L));
            this.QiMR8OkAhezm = qmVar2;
        }
        if (z) {
            boolean z2 = JhCgjQRTAOCT(rmVar.WDYagTQQm9ns * 2) == 0;
            if (z2 && (WDYagTQQm9ns2 = WDYagTQQm9ns()) != null) {
                return WDYagTQQm9ns2;
            }
            defpackage.qj1 WDYagTQQm9ns3 = lx1Var.WDYagTQQm9ns();
            if (WDYagTQQm9ns3 != null) {
                return WDYagTQQm9ns3;
            }
            if (!z2 && (WDYagTQQm9ns = WDYagTQQm9ns()) != null) {
                return WDYagTQQm9ns;
            }
        } else {
            defpackage.qj1 WDYagTQQm9ns4 = WDYagTQQm9ns();
            if (WDYagTQQm9ns4 != null) {
                return WDYagTQQm9ns4;
            }
        }
        return e6mdH7fiFuta(3);
    }

    public final defpackage.qj1 e6mdH7fiFuta(int i) {
        defpackage.qj1 qj1Var;
        long e6mdH7fiFuta;
        java.util.concurrent.atomic.AtomicLongFieldUpdater atomicLongFieldUpdater = defpackage.rm.h3m55N1URyyK;
        defpackage.rm rmVar = this.fNwYGHIYeJcR;
        int i2 = (int) (atomicLongFieldUpdater.get(rmVar) & 2097151);
        if (i2 < 2) {
            return null;
        }
        int JhCgjQRTAOCT = JhCgjQRTAOCT(i2);
        long j = Long.MAX_VALUE;
        for (int i3 = 0; i3 < i2; i3++) {
            JhCgjQRTAOCT++;
            if (JhCgjQRTAOCT > i2) {
                JhCgjQRTAOCT = 1;
            }
            defpackage.pm pmVar = (defpackage.pm) rmVar.Ns0WNyEWdPsk.giKS3J6vZuNy(JhCgjQRTAOCT);
            if (pmVar != null && pmVar != this) {
                defpackage.lx1 lx1Var = pmVar.WDYagTQQm9ns;
                if (i == 3) {
                    qj1Var = lx1Var.oh71FJcDz6S2();
                } else {
                    lx1Var.getClass();
                    int i4 = defpackage.lx1.JhCgjQRTAOCT.get(lx1Var);
                    int i5 = defpackage.lx1.fWTAfUmVKrZq.get(lx1Var);
                    boolean z = i == 1;
                    while (i4 != i5 && (!z || defpackage.lx1.WDYagTQQm9ns.get(lx1Var) != 0)) {
                        int i6 = i4 + 1;
                        qj1Var = lx1Var.P05cfTpS5W5L(i4, z);
                        if (qj1Var != null) {
                            break;
                        }
                        i4 = i6;
                    }
                    qj1Var = null;
                }
                defpackage.z31 z31Var = this.oh71FJcDz6S2;
                if (qj1Var != null) {
                    z31Var.WDYagTQQm9ns = qj1Var;
                    e6mdH7fiFuta = -1;
                } else {
                    e6mdH7fiFuta = lx1Var.e6mdH7fiFuta(i, z31Var);
                }
                if (e6mdH7fiFuta == -1) {
                    defpackage.qj1 qj1Var2 = (defpackage.qj1) z31Var.WDYagTQQm9ns;
                    z31Var.WDYagTQQm9ns = null;
                    return qj1Var2;
                }
                if (e6mdH7fiFuta > 0) {
                    j = java.lang.Math.min(j, e6mdH7fiFuta);
                }
            }
        }
        if (j == Long.MAX_VALUE) {
            j = 0;
        }
        this.e6mdH7fiFuta = j;
        return null;
    }

    public final java.lang.Object fWTAfUmVKrZq() {
        return this.nextParkedWorker;
    }

    public final int giKS3J6vZuNy() {
        return this.indexInArray;
    }

    public final void oh71FJcDz6S2(int i) {
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append(this.fNwYGHIYeJcR.P05cfTpS5W5L);
        sb.append("-worker-");
        sb.append(i == 0 ? "TERMINATED" : java.lang.String.valueOf(i));
        setName(sb.toString());
        this.indexInArray = i;
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
            while (defpackage.rm.gUjdnLbkVAaA.get(this.fNwYGHIYeJcR) == 0) {
                defpackage.qm qmVar = this.QiMR8OkAhezm;
                defpackage.qm qmVar2 = defpackage.qm.e6mdH7fiFuta;
                if (qmVar == qmVar2) {
                    break loop0;
                }
                defpackage.qj1 ZpBGe2uQfcn8 = ZpBGe2uQfcn8(this.Ns0WNyEWdPsk);
                if (ZpBGe2uQfcn8 != null) {
                    this.e6mdH7fiFuta = 0L;
                    defpackage.rm rmVar = this.fNwYGHIYeJcR;
                    this.P05cfTpS5W5L = 0L;
                    if (this.QiMR8OkAhezm == defpackage.qm.QiMR8OkAhezm) {
                        this.QiMR8OkAhezm = defpackage.qm.oh71FJcDz6S2;
                    }
                    if (ZpBGe2uQfcn8.oh71FJcDz6S2) {
                        if (P05cfTpS5W5L(defpackage.qm.oh71FJcDz6S2) && !rmVar.fNwYGHIYeJcR() && !rmVar.Ns0WNyEWdPsk(defpackage.rm.h3m55N1URyyK.get(rmVar))) {
                            rmVar.fNwYGHIYeJcR();
                        }
                        try {
                            ZpBGe2uQfcn8.run();
                        } catch (java.lang.Throwable th) {
                            java.lang.Thread currentThread = java.lang.Thread.currentThread();
                            currentThread.getUncaughtExceptionHandler().uncaughtException(currentThread, th);
                        }
                        defpackage.rm.h3m55N1URyyK.addAndGet(rmVar, -2097152L);
                        if (this.QiMR8OkAhezm != qmVar2) {
                            this.QiMR8OkAhezm = defpackage.qm.P05cfTpS5W5L;
                        }
                    } else {
                        try {
                            ZpBGe2uQfcn8.run();
                        } catch (java.lang.Throwable th2) {
                            java.lang.Thread currentThread2 = java.lang.Thread.currentThread();
                            currentThread2.getUncaughtExceptionHandler().uncaughtException(currentThread2, th2);
                        }
                    }
                } else {
                    this.Ns0WNyEWdPsk = false;
                    if (this.e6mdH7fiFuta == 0) {
                        java.lang.Object obj = this.nextParkedWorker;
                        defpackage.ru ruVar = defpackage.rm.T1fB7bDYiVJQ;
                        if (obj != ruVar) {
                            h3m55N1URyyK.set(this, -1);
                            while (this.nextParkedWorker != defpackage.rm.T1fB7bDYiVJQ) {
                                java.util.concurrent.atomic.AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = h3m55N1URyyK;
                                if (atomicIntegerFieldUpdater.get(this) == -1) {
                                    defpackage.rm rmVar2 = this.fNwYGHIYeJcR;
                                    java.util.concurrent.atomic.AtomicIntegerFieldUpdater atomicIntegerFieldUpdater2 = defpackage.rm.gUjdnLbkVAaA;
                                    if (atomicIntegerFieldUpdater2.get(rmVar2) != 0) {
                                        break;
                                    }
                                    defpackage.qm qmVar3 = this.QiMR8OkAhezm;
                                    defpackage.qm qmVar4 = defpackage.qm.e6mdH7fiFuta;
                                    if (qmVar3 == qmVar4) {
                                        break;
                                    }
                                    P05cfTpS5W5L(defpackage.qm.QiMR8OkAhezm);
                                    java.lang.Thread.interrupted();
                                    if (this.P05cfTpS5W5L == 0) {
                                        j = 2097151;
                                        this.P05cfTpS5W5L = java.lang.System.nanoTime() + this.fNwYGHIYeJcR.QiMR8OkAhezm;
                                    } else {
                                        j = 2097151;
                                    }
                                    java.util.concurrent.locks.LockSupport.parkNanos(this.fNwYGHIYeJcR.QiMR8OkAhezm);
                                    if (java.lang.System.nanoTime() - this.P05cfTpS5W5L >= 0) {
                                        this.P05cfTpS5W5L = 0L;
                                        defpackage.rm rmVar3 = this.fNwYGHIYeJcR;
                                        synchronized (rmVar3.Ns0WNyEWdPsk) {
                                            try {
                                                if (!(atomicIntegerFieldUpdater2.get(rmVar3) != 0)) {
                                                    java.util.concurrent.atomic.AtomicLongFieldUpdater atomicLongFieldUpdater = defpackage.rm.h3m55N1URyyK;
                                                    if (((int) (atomicLongFieldUpdater.get(rmVar3) & j)) > rmVar3.WDYagTQQm9ns) {
                                                        if (atomicIntegerFieldUpdater.compareAndSet(this, -1, 1)) {
                                                            int i = this.indexInArray;
                                                            oh71FJcDz6S2(0);
                                                            rmVar3.e6mdH7fiFuta(this, i, 0);
                                                            int andDecrement = (int) (atomicLongFieldUpdater.getAndDecrement(rmVar3) & j);
                                                            if (andDecrement != i) {
                                                                java.lang.Object giKS3J6vZuNy = rmVar3.Ns0WNyEWdPsk.giKS3J6vZuNy(andDecrement);
                                                                giKS3J6vZuNy.getClass();
                                                                defpackage.pm pmVar = (defpackage.pm) giKS3J6vZuNy;
                                                                rmVar3.Ns0WNyEWdPsk.fWTAfUmVKrZq(i, pmVar);
                                                                pmVar.oh71FJcDz6S2(i);
                                                                rmVar3.e6mdH7fiFuta(pmVar, andDecrement, i);
                                                            }
                                                            rmVar3.Ns0WNyEWdPsk.fWTAfUmVKrZq(andDecrement, null);
                                                            this.QiMR8OkAhezm = qmVar4;
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
                            defpackage.rm rmVar4 = this.fNwYGHIYeJcR;
                            if (this.nextParkedWorker == ruVar) {
                                java.util.concurrent.atomic.AtomicLongFieldUpdater atomicLongFieldUpdater2 = defpackage.rm.fNwYGHIYeJcR;
                                while (true) {
                                    long j2 = atomicLongFieldUpdater2.get(rmVar4);
                                    int i2 = this.indexInArray;
                                    this.nextParkedWorker = rmVar4.Ns0WNyEWdPsk.giKS3J6vZuNy((int) (j2 & 2097151));
                                    defpackage.rm rmVar5 = rmVar4;
                                    if (defpackage.rm.fNwYGHIYeJcR.compareAndSet(rmVar5, j2, ((j2 + 2097152) & (-2097152)) | i2)) {
                                        break;
                                    } else {
                                        rmVar4 = rmVar5;
                                    }
                                }
                            }
                        }
                    } else if (z) {
                        P05cfTpS5W5L(defpackage.qm.QiMR8OkAhezm);
                        java.lang.Thread.interrupted();
                        java.util.concurrent.locks.LockSupport.parkNanos(this.e6mdH7fiFuta);
                        this.e6mdH7fiFuta = 0L;
                    } else {
                        z = true;
                    }
                }
            }
            break loop0;
        }
        P05cfTpS5W5L(defpackage.qm.e6mdH7fiFuta);
    }
}
