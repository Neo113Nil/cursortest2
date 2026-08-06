package defpackage;

import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicLongFieldUpdater;
import java.util.concurrent.locks.LockSupport;

/* compiled from: r8-map-id-f07502904ffb6c7cfc104556b013e0e48cd078697d1e7ebb5294e50317be4258 */
/* loaded from: classes.dex */
public final class mh extends Thread {
    public static final /* synthetic */ AtomicIntegerFieldUpdater XnEVoBF0td1l = AtomicIntegerFieldUpdater.newUpdater(mh.class, "workerCtl$volatile");
    public nh AvO7iQsrTN;
    public final /* synthetic */ oh E7jCp8Ls;
    public final rt0 EljAMC1QTz;
    public int JFJ3QoxA;
    public final ai1 OOA6hdeuvCS;
    public long encWxUiV2;
    private volatile int indexInArray;
    public long mOu10nynGul;
    private volatile Object nextParkedWorker;
    public boolean rQPn8YBR;
    private volatile /* synthetic */ int workerCtl$volatile;

    public mh(oh ohVar, int i) {
        this.E7jCp8Ls = ohVar;
        setDaemon(true);
        setContextClassLoader(oh.class.getClassLoader());
        this.OOA6hdeuvCS = new ai1();
        this.EljAMC1QTz = new rt0();
        this.AvO7iQsrTN = nh.encWxUiV2;
        this.nextParkedWorker = oh.iwATDS1i01k;
        int nanoTime = (int) System.nanoTime();
        this.JFJ3QoxA = nanoTime == 0 ? 42 : nanoTime;
        EljAMC1QTz(i);
    }

    public final void AvO7iQsrTN(Object obj) {
        this.nextParkedWorker = obj;
    }

    public final void EljAMC1QTz(int i) {
        StringBuilder sb = new StringBuilder();
        sb.append(this.E7jCp8Ls.encWxUiV2);
        sb.append("-worker-");
        sb.append(i == 0 ? "TERMINATED" : String.valueOf(i));
        setName(sb.toString());
        this.indexInArray = i;
    }

    public final u71 GWasM1elztuh(boolean z) {
        u71 OOA6hdeuvCS;
        u71 OOA6hdeuvCS2;
        long j;
        nh nhVar = this.AvO7iQsrTN;
        oh ohVar = this.E7jCp8Ls;
        ai1 ai1Var = this.OOA6hdeuvCS;
        nh nhVar2 = nh.OOA6hdeuvCS;
        if (nhVar != nhVar2) {
            AtomicLongFieldUpdater atomicLongFieldUpdater = oh.XnEVoBF0td1l;
            do {
                j = atomicLongFieldUpdater.get(ohVar);
                if (((int) ((9223367638808264704L & j) >> 42)) == 0) {
                    u71 AvO7iQsrTN = ai1Var.AvO7iQsrTN();
                    return (AvO7iQsrTN == null && (AvO7iQsrTN = (u71) ohVar.JFJ3QoxA.xqGvceK5x()) == null) ? mOu10nynGul(1) : AvO7iQsrTN;
                }
            } while (!oh.XnEVoBF0td1l.compareAndSet(ohVar, j, j - 4398046511104L));
            this.AvO7iQsrTN = nhVar2;
        }
        if (z) {
            boolean z2 = xqGvceK5x(ohVar.OOA6hdeuvCS * 2) == 0;
            if (z2 && (OOA6hdeuvCS2 = OOA6hdeuvCS()) != null) {
                return OOA6hdeuvCS2;
            }
            u71 OOA6hdeuvCS3 = ai1Var.OOA6hdeuvCS();
            if (OOA6hdeuvCS3 != null) {
                return OOA6hdeuvCS3;
            }
            if (!z2 && (OOA6hdeuvCS = OOA6hdeuvCS()) != null) {
                return OOA6hdeuvCS;
            }
        } else {
            u71 OOA6hdeuvCS4 = OOA6hdeuvCS();
            if (OOA6hdeuvCS4 != null) {
                return OOA6hdeuvCS4;
            }
        }
        return mOu10nynGul(3);
    }

    public final u71 OOA6hdeuvCS() {
        int xqGvceK5x = xqGvceK5x(2);
        oh ohVar = this.E7jCp8Ls;
        hy hyVar = ohVar.JFJ3QoxA;
        hy hyVar2 = ohVar.mOu10nynGul;
        if (xqGvceK5x == 0) {
            u71 u71Var = (u71) hyVar2.xqGvceK5x();
            return u71Var != null ? u71Var : (u71) hyVar.xqGvceK5x();
        }
        u71 u71Var2 = (u71) hyVar.xqGvceK5x();
        return u71Var2 != null ? u71Var2 : (u71) hyVar2.xqGvceK5x();
    }

    public final Object X1lG3V04pd() {
        return this.nextParkedWorker;
    }

    public final int Yi7zF1RB1() {
        return this.indexInArray;
    }

    public final boolean encWxUiV2(nh nhVar) {
        nh nhVar2 = this.AvO7iQsrTN;
        boolean z = nhVar2 == nh.OOA6hdeuvCS;
        if (z) {
            oh.XnEVoBF0td1l.addAndGet(this.E7jCp8Ls, 4398046511104L);
        }
        if (nhVar2 != nhVar) {
            this.AvO7iQsrTN = nhVar;
        }
        return z;
    }

    public final u71 mOu10nynGul(int i) {
        u71 u71Var;
        long mOu10nynGul;
        AtomicLongFieldUpdater atomicLongFieldUpdater = oh.XnEVoBF0td1l;
        oh ohVar = this.E7jCp8Ls;
        int i2 = (int) (atomicLongFieldUpdater.get(ohVar) & 2097151);
        if (i2 < 2) {
            return null;
        }
        int xqGvceK5x = xqGvceK5x(i2);
        long j = Long.MAX_VALUE;
        for (int i3 = 0; i3 < i2; i3++) {
            xqGvceK5x++;
            if (xqGvceK5x > i2) {
                xqGvceK5x = 1;
            }
            mh mhVar = (mh) ohVar.rQPn8YBR.Yi7zF1RB1(xqGvceK5x);
            if (mhVar != null && mhVar != this) {
                ai1 ai1Var = mhVar.OOA6hdeuvCS;
                if (i == 3) {
                    u71Var = ai1Var.EljAMC1QTz();
                } else {
                    ai1Var.getClass();
                    int i4 = ai1.xqGvceK5x.get(ai1Var);
                    int i5 = ai1.X1lG3V04pd.get(ai1Var);
                    boolean z = i == 1;
                    while (i4 != i5 && (!z || ai1.OOA6hdeuvCS.get(ai1Var) != 0)) {
                        int i6 = i4 + 1;
                        u71Var = ai1Var.encWxUiV2(i4, z);
                        if (u71Var != null) {
                            break;
                        }
                        i4 = i6;
                    }
                    u71Var = null;
                }
                rt0 rt0Var = this.EljAMC1QTz;
                if (u71Var != null) {
                    rt0Var.OOA6hdeuvCS = u71Var;
                    mOu10nynGul = -1;
                } else {
                    mOu10nynGul = ai1Var.mOu10nynGul(i, rt0Var);
                }
                if (mOu10nynGul == -1) {
                    u71 u71Var2 = (u71) rt0Var.OOA6hdeuvCS;
                    rt0Var.OOA6hdeuvCS = null;
                    return u71Var2;
                }
                if (mOu10nynGul > 0) {
                    j = Math.min(j, mOu10nynGul);
                }
            }
        }
        if (j == Long.MAX_VALUE) {
            j = 0;
        }
        this.mOu10nynGul = j;
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
            while (oh.uFEq9NpZ.get(this.E7jCp8Ls) == 0) {
                nh nhVar = this.AvO7iQsrTN;
                nh nhVar2 = nh.mOu10nynGul;
                if (nhVar == nhVar2) {
                    break loop0;
                }
                u71 GWasM1elztuh = GWasM1elztuh(this.rQPn8YBR);
                if (GWasM1elztuh != null) {
                    this.mOu10nynGul = 0L;
                    oh ohVar = this.E7jCp8Ls;
                    this.encWxUiV2 = 0L;
                    if (this.AvO7iQsrTN == nh.AvO7iQsrTN) {
                        this.AvO7iQsrTN = nh.EljAMC1QTz;
                    }
                    if (GWasM1elztuh.EljAMC1QTz) {
                        if (encWxUiV2(nh.EljAMC1QTz) && !ohVar.EljAMC1QTz() && !ohVar.OOA6hdeuvCS(oh.XnEVoBF0td1l.get(ohVar))) {
                            ohVar.EljAMC1QTz();
                        }
                        try {
                            GWasM1elztuh.run();
                        } catch (Throwable th) {
                            Thread currentThread = Thread.currentThread();
                            currentThread.getUncaughtExceptionHandler().uncaughtException(currentThread, th);
                        }
                        oh.XnEVoBF0td1l.addAndGet(ohVar, -2097152L);
                        if (this.AvO7iQsrTN != nhVar2) {
                            this.AvO7iQsrTN = nh.encWxUiV2;
                        }
                    } else {
                        try {
                            GWasM1elztuh.run();
                        } catch (Throwable th2) {
                            Thread currentThread2 = Thread.currentThread();
                            currentThread2.getUncaughtExceptionHandler().uncaughtException(currentThread2, th2);
                        }
                    }
                } else {
                    this.rQPn8YBR = false;
                    if (this.mOu10nynGul == 0) {
                        Object obj = this.nextParkedWorker;
                        pp ppVar = oh.iwATDS1i01k;
                        if (obj != ppVar) {
                            XnEVoBF0td1l.set(this, -1);
                            while (this.nextParkedWorker != oh.iwATDS1i01k) {
                                AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = XnEVoBF0td1l;
                                if (atomicIntegerFieldUpdater.get(this) == -1) {
                                    oh ohVar2 = this.E7jCp8Ls;
                                    AtomicIntegerFieldUpdater atomicIntegerFieldUpdater2 = oh.uFEq9NpZ;
                                    if (atomicIntegerFieldUpdater2.get(ohVar2) != 0) {
                                        break;
                                    }
                                    nh nhVar3 = this.AvO7iQsrTN;
                                    nh nhVar4 = nh.mOu10nynGul;
                                    if (nhVar3 == nhVar4) {
                                        break;
                                    }
                                    encWxUiV2(nh.AvO7iQsrTN);
                                    Thread.interrupted();
                                    if (this.encWxUiV2 == 0) {
                                        j = 2097151;
                                        this.encWxUiV2 = System.nanoTime() + this.E7jCp8Ls.AvO7iQsrTN;
                                    } else {
                                        j = 2097151;
                                    }
                                    LockSupport.parkNanos(this.E7jCp8Ls.AvO7iQsrTN);
                                    if (System.nanoTime() - this.encWxUiV2 >= 0) {
                                        this.encWxUiV2 = 0L;
                                        oh ohVar3 = this.E7jCp8Ls;
                                        synchronized (ohVar3.rQPn8YBR) {
                                            try {
                                                if (!(atomicIntegerFieldUpdater2.get(ohVar3) != 0)) {
                                                    AtomicLongFieldUpdater atomicLongFieldUpdater = oh.XnEVoBF0td1l;
                                                    if (((int) (atomicLongFieldUpdater.get(ohVar3) & j)) > ohVar3.OOA6hdeuvCS) {
                                                        if (atomicIntegerFieldUpdater.compareAndSet(this, -1, 1)) {
                                                            int i = this.indexInArray;
                                                            EljAMC1QTz(0);
                                                            ohVar3.xqGvceK5x(this, i, 0);
                                                            int andDecrement = (int) (atomicLongFieldUpdater.getAndDecrement(ohVar3) & j);
                                                            if (andDecrement != i) {
                                                                Object Yi7zF1RB1 = ohVar3.rQPn8YBR.Yi7zF1RB1(andDecrement);
                                                                Yi7zF1RB1.getClass();
                                                                mh mhVar = (mh) Yi7zF1RB1;
                                                                ohVar3.rQPn8YBR.X1lG3V04pd(i, mhVar);
                                                                mhVar.EljAMC1QTz(i);
                                                                ohVar3.xqGvceK5x(mhVar, andDecrement, i);
                                                            }
                                                            ohVar3.rQPn8YBR.X1lG3V04pd(andDecrement, null);
                                                            this.AvO7iQsrTN = nhVar4;
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
                            oh ohVar4 = this.E7jCp8Ls;
                            if (this.nextParkedWorker == ppVar) {
                                AtomicLongFieldUpdater atomicLongFieldUpdater2 = oh.E7jCp8Ls;
                                while (true) {
                                    long j2 = atomicLongFieldUpdater2.get(ohVar4);
                                    int i2 = this.indexInArray;
                                    this.nextParkedWorker = ohVar4.rQPn8YBR.Yi7zF1RB1((int) (j2 & 2097151));
                                    oh ohVar5 = ohVar4;
                                    if (oh.E7jCp8Ls.compareAndSet(ohVar5, j2, ((j2 + 2097152) & (-2097152)) | i2)) {
                                        break;
                                    } else {
                                        ohVar4 = ohVar5;
                                    }
                                }
                            }
                        }
                    } else if (z) {
                        encWxUiV2(nh.AvO7iQsrTN);
                        Thread.interrupted();
                        LockSupport.parkNanos(this.mOu10nynGul);
                        this.mOu10nynGul = 0L;
                    } else {
                        z = true;
                    }
                }
            }
            break loop0;
        }
        encWxUiV2(nh.mOu10nynGul);
    }

    public final int xqGvceK5x(int i) {
        int i2 = this.JFJ3QoxA;
        int i3 = i2 ^ (i2 << 13);
        int i4 = i3 ^ (i3 >> 17);
        int i5 = i4 ^ (i4 << 5);
        this.JFJ3QoxA = i5;
        int i6 = i - 1;
        return (i6 & i) == 0 ? i6 & i5 : (Integer.MAX_VALUE & i5) % i;
    }
}
