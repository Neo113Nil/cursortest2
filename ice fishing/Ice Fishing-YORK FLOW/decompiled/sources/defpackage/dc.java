package defpackage;

/* compiled from: r8-map-id-5e15bf382d9e1cc682b2b5d208f848646545054061ee84effb1e415a0540fc32 */
/* loaded from: classes.dex */
public class dc implements defpackage.pd {
    public static final /* synthetic */ long BHfvd2J71qpO;
    public static final /* synthetic */ java.util.concurrent.atomic.AtomicReferenceFieldUpdater Ns0WNyEWdPsk;
    public static final /* synthetic */ long T1fB7bDYiVJQ;
    public static final /* synthetic */ long WmetiUbpKU9I;
    public static final /* synthetic */ long XntWc4eZSQ8j;
    public static final /* synthetic */ java.util.concurrent.atomic.AtomicReferenceFieldUpdater fNwYGHIYeJcR;
    public static final /* synthetic */ java.util.concurrent.atomic.AtomicReferenceFieldUpdater gUjdnLbkVAaA;
    public static final /* synthetic */ java.util.concurrent.atomic.AtomicReferenceFieldUpdater h3m55N1URyyK;
    public static final /* synthetic */ long s0TASMVLSWD5;
    public final int WDYagTQQm9ns;
    private volatile /* synthetic */ java.lang.Object _closeCause$volatile;
    private volatile /* synthetic */ long bufferEnd$volatile;
    private volatile /* synthetic */ java.lang.Object bufferEndSegment$volatile;
    private volatile /* synthetic */ java.lang.Object closeHandler$volatile;
    private volatile /* synthetic */ long completedExpandBuffersAndPauseFlag$volatile;
    private volatile /* synthetic */ java.lang.Object receiveSegment$volatile;
    private volatile /* synthetic */ long receivers$volatile;
    private volatile /* synthetic */ java.lang.Object sendSegment$volatile;
    private volatile /* synthetic */ long sendersAndCloseStatus$volatile;
    public static final /* synthetic */ java.util.concurrent.atomic.AtomicLongFieldUpdater oh71FJcDz6S2 = java.util.concurrent.atomic.AtomicLongFieldUpdater.newUpdater(defpackage.dc.class, "sendersAndCloseStatus$volatile");
    public static final /* synthetic */ java.util.concurrent.atomic.AtomicLongFieldUpdater QiMR8OkAhezm = java.util.concurrent.atomic.AtomicLongFieldUpdater.newUpdater(defpackage.dc.class, "receivers$volatile");
    public static final /* synthetic */ java.util.concurrent.atomic.AtomicLongFieldUpdater P05cfTpS5W5L = java.util.concurrent.atomic.AtomicLongFieldUpdater.newUpdater(defpackage.dc.class, "bufferEnd$volatile");
    public static final /* synthetic */ java.util.concurrent.atomic.AtomicLongFieldUpdater e6mdH7fiFuta = java.util.concurrent.atomic.AtomicLongFieldUpdater.newUpdater(defpackage.dc.class, "completedExpandBuffersAndPauseFlag$volatile");
    public static final /* synthetic */ java.util.concurrent.atomic.AtomicReferenceFieldUpdater GE9mJIPrb8gP = java.util.concurrent.atomic.AtomicReferenceFieldUpdater.newUpdater(defpackage.dc.class, java.lang.Object.class, "sendSegment$volatile");

    static {
        sun.misc.Unsafe unsafe = defpackage.ed.ZpBGe2uQfcn8;
        BHfvd2J71qpO = unsafe.objectFieldOffset(defpackage.dc.class.getDeclaredField("sendSegment$volatile"));
        Ns0WNyEWdPsk = java.util.concurrent.atomic.AtomicReferenceFieldUpdater.newUpdater(defpackage.dc.class, java.lang.Object.class, "receiveSegment$volatile");
        s0TASMVLSWD5 = unsafe.objectFieldOffset(defpackage.dc.class.getDeclaredField("receiveSegment$volatile"));
        fNwYGHIYeJcR = java.util.concurrent.atomic.AtomicReferenceFieldUpdater.newUpdater(defpackage.dc.class, java.lang.Object.class, "bufferEndSegment$volatile");
        XntWc4eZSQ8j = unsafe.objectFieldOffset(defpackage.dc.class.getDeclaredField("bufferEndSegment$volatile"));
        h3m55N1URyyK = java.util.concurrent.atomic.AtomicReferenceFieldUpdater.newUpdater(defpackage.dc.class, java.lang.Object.class, "_closeCause$volatile");
        T1fB7bDYiVJQ = unsafe.objectFieldOffset(defpackage.dc.class.getDeclaredField("_closeCause$volatile"));
        gUjdnLbkVAaA = java.util.concurrent.atomic.AtomicReferenceFieldUpdater.newUpdater(defpackage.dc.class, java.lang.Object.class, "closeHandler$volatile");
        WmetiUbpKU9I = unsafe.objectFieldOffset(defpackage.dc.class.getDeclaredField("closeHandler$volatile"));
    }

    public dc(int i) {
        this.WDYagTQQm9ns = i;
        if (i < 0) {
            defpackage.p81.fWTAfUmVKrZq("Invalid channel capacity: ", i, ", should be >=0");
            throw null;
        }
        defpackage.be beVar = defpackage.fc.ZpBGe2uQfcn8;
        this.bufferEnd$volatile = i != 0 ? i != Integer.MAX_VALUE ? i : Long.MAX_VALUE : 0L;
        this.completedExpandBuffersAndPauseFlag$volatile = P05cfTpS5W5L.get(this);
        defpackage.be beVar2 = new defpackage.be(0L, null, this, 3);
        this.sendSegment$volatile = beVar2;
        this.receiveSegment$volatile = beVar2;
        if (UmgHb6n58gfG()) {
            beVar2 = defpackage.fc.ZpBGe2uQfcn8;
            beVar2.getClass();
        }
        this.bufferEndSegment$volatile = beVar2;
        this._closeCause$volatile = defpackage.fc.BHfvd2J71qpO;
    }

    /* JADX WARN: Removed duplicated region for block: B:73:0x0155  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x0158 A[RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static java.lang.Object BXaznwstz2U0(defpackage.dc dcVar, java.lang.Object obj, defpackage.kl klVar) {
        defpackage.gs1 gs1Var;
        defpackage.tm tmVar;
        java.lang.Object w7APNrr0aGRc;
        defpackage.tm tmVar2;
        java.util.concurrent.atomic.AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = GE9mJIPrb8gP;
        atomicReferenceFieldUpdater.getClass();
        defpackage.be beVar = (defpackage.be) defpackage.ed.ZpBGe2uQfcn8.getObjectVolatile(dcVar, BHfvd2J71qpO);
        while (true) {
            java.util.concurrent.atomic.AtomicLongFieldUpdater atomicLongFieldUpdater = oh71FJcDz6S2;
            long andIncrement = atomicLongFieldUpdater.getAndIncrement(dcVar);
            long j = andIncrement & 1152921504606846975L;
            boolean oCu53ZX2v4Ju = dcVar.oCu53ZX2v4Ju(andIncrement, false);
            int i = defpackage.fc.giKS3J6vZuNy;
            long j2 = i;
            long j3 = j / j2;
            int i2 = (int) (j % j2);
            long j4 = beVar.WDYagTQQm9ns;
            defpackage.tm tmVar3 = defpackage.tm.WDYagTQQm9ns;
            gs1Var = defpackage.gs1.ZpBGe2uQfcn8;
            if (j4 != j3) {
                defpackage.be XntWc4eZSQ8j2 = dcVar.XntWc4eZSQ8j(j3, beVar);
                if (XntWc4eZSQ8j2 != null) {
                    beVar = XntWc4eZSQ8j2;
                } else if (oCu53ZX2v4Ju) {
                    java.lang.Object jjTN4uUnoyEn = dcVar.jjTN4uUnoyEn(klVar, obj);
                    if (jjTN4uUnoyEn == tmVar3) {
                        return jjTN4uUnoyEn;
                    }
                }
            }
            int WDYagTQQm9ns = WDYagTQQm9ns(dcVar, beVar, i2, obj, j, null, oCu53ZX2v4Ju);
            if (WDYagTQQm9ns == 0) {
                beVar.ZpBGe2uQfcn8();
                return gs1Var;
            }
            if (WDYagTQQm9ns == 1) {
                break;
            }
            if (WDYagTQQm9ns != 2) {
                java.util.concurrent.atomic.AtomicLongFieldUpdater atomicLongFieldUpdater2 = QiMR8OkAhezm;
                if (WDYagTQQm9ns == 3) {
                    defpackage.dd frSwwKIlbUhK = defpackage.nq1.frSwwKIlbUhK(defpackage.q70.OcTWLQzke1i2(klVar));
                    try {
                        int WDYagTQQm9ns2 = WDYagTQQm9ns(dcVar, beVar, i2, obj, j, frSwwKIlbUhK, false);
                        if (WDYagTQQm9ns2 != 0) {
                            if (WDYagTQQm9ns2 == 1) {
                                tmVar = tmVar3;
                                frSwwKIlbUhK.e6mdH7fiFuta(gs1Var);
                            } else if (WDYagTQQm9ns2 != 2) {
                                if (WDYagTQQm9ns2 == 4) {
                                    tmVar = tmVar3;
                                    if (j < atomicLongFieldUpdater2.get(dcVar)) {
                                        beVar.ZpBGe2uQfcn8();
                                    }
                                } else {
                                    if (WDYagTQQm9ns2 != 5) {
                                        throw new java.lang.IllegalStateException("unexpected");
                                    }
                                    beVar.ZpBGe2uQfcn8();
                                    defpackage.be beVar2 = (defpackage.be) atomicReferenceFieldUpdater.get(dcVar);
                                    while (true) {
                                        long andIncrement2 = atomicLongFieldUpdater.getAndIncrement(dcVar);
                                        long j5 = andIncrement2 & 1152921504606846975L;
                                        boolean oCu53ZX2v4Ju2 = dcVar.oCu53ZX2v4Ju(andIncrement2, false);
                                        int i3 = defpackage.fc.giKS3J6vZuNy;
                                        long j6 = i3;
                                        java.util.concurrent.atomic.AtomicLongFieldUpdater atomicLongFieldUpdater3 = atomicLongFieldUpdater;
                                        long j7 = j5 / j6;
                                        int i4 = (int) (j5 % j6);
                                        tmVar = tmVar3;
                                        if (beVar2.WDYagTQQm9ns != j7) {
                                            defpackage.be XntWc4eZSQ8j3 = dcVar.XntWc4eZSQ8j(j7, beVar2);
                                            if (XntWc4eZSQ8j3 != null) {
                                                beVar2 = XntWc4eZSQ8j3;
                                            } else {
                                                if (oCu53ZX2v4Ju2) {
                                                    break;
                                                }
                                                atomicLongFieldUpdater = atomicLongFieldUpdater3;
                                                tmVar3 = tmVar;
                                            }
                                        }
                                        int WDYagTQQm9ns3 = WDYagTQQm9ns(dcVar, beVar2, i4, obj, j5, frSwwKIlbUhK, oCu53ZX2v4Ju2);
                                        if (WDYagTQQm9ns3 == 0) {
                                            beVar2.ZpBGe2uQfcn8();
                                            break;
                                        }
                                        if (WDYagTQQm9ns3 == 1) {
                                            break;
                                        }
                                        if (WDYagTQQm9ns3 != 2) {
                                            if (WDYagTQQm9ns3 == 3) {
                                                throw new java.lang.IllegalStateException("unexpected");
                                            }
                                            if (WDYagTQQm9ns3 != 4) {
                                                if (WDYagTQQm9ns3 == 5) {
                                                    beVar2.ZpBGe2uQfcn8();
                                                }
                                                atomicLongFieldUpdater = atomicLongFieldUpdater3;
                                                tmVar3 = tmVar;
                                            } else if (j5 < atomicLongFieldUpdater2.get(dcVar)) {
                                                beVar2.ZpBGe2uQfcn8();
                                            }
                                        } else if (oCu53ZX2v4Ju2) {
                                            beVar2.h3m55N1URyyK();
                                        } else {
                                            frSwwKIlbUhK.ZpBGe2uQfcn8(beVar2, i4 + i3);
                                        }
                                    }
                                }
                                giKS3J6vZuNy(dcVar, obj, frSwwKIlbUhK);
                            } else {
                                tmVar = tmVar3;
                                frSwwKIlbUhK.ZpBGe2uQfcn8(beVar, i2 + i);
                            }
                            w7APNrr0aGRc = frSwwKIlbUhK.w7APNrr0aGRc();
                            tmVar2 = tmVar;
                            if (w7APNrr0aGRc != tmVar2) {
                                w7APNrr0aGRc = gs1Var;
                            }
                            if (w7APNrr0aGRc != tmVar2) {
                                return w7APNrr0aGRc;
                            }
                        } else {
                            tmVar = tmVar3;
                            beVar.ZpBGe2uQfcn8();
                        }
                        frSwwKIlbUhK.e6mdH7fiFuta(gs1Var);
                        w7APNrr0aGRc = frSwwKIlbUhK.w7APNrr0aGRc();
                        tmVar2 = tmVar;
                        if (w7APNrr0aGRc != tmVar2) {
                        }
                        if (w7APNrr0aGRc != tmVar2) {
                            break;
                        }
                    } catch (java.lang.Throwable th) {
                        frSwwKIlbUhK.jjTN4uUnoyEn();
                        throw th;
                    }
                } else if (WDYagTQQm9ns == 4) {
                    if (j < atomicLongFieldUpdater2.get(dcVar)) {
                        beVar.ZpBGe2uQfcn8();
                    }
                    java.lang.Object jjTN4uUnoyEn2 = dcVar.jjTN4uUnoyEn(klVar, obj);
                    if (jjTN4uUnoyEn2 == tmVar3) {
                        return jjTN4uUnoyEn2;
                    }
                } else if (WDYagTQQm9ns == 5) {
                    beVar.ZpBGe2uQfcn8();
                }
            } else if (oCu53ZX2v4Ju) {
                beVar.h3m55N1URyyK();
                java.lang.Object jjTN4uUnoyEn3 = dcVar.jjTN4uUnoyEn(klVar, obj);
                if (jjTN4uUnoyEn3 == tmVar3) {
                    return jjTN4uUnoyEn3;
                }
            }
        }
        return gs1Var;
    }

    public static boolean GcLuU6pT9wO9(java.lang.Object obj) {
        if (obj instanceof defpackage.bd) {
            return defpackage.fc.ZpBGe2uQfcn8((defpackage.bd) obj, defpackage.gs1.ZpBGe2uQfcn8, null);
        }
        defpackage.h7.QiMR8OkAhezm(obj, "Unexpected waiter: ");
        return false;
    }

    public static java.lang.Object Mearx7yMn90V(defpackage.dc dcVar, defpackage.mi1 mi1Var) {
        defpackage.be beVar;
        java.lang.Throwable th;
        defpackage.be beVar2;
        java.util.concurrent.atomic.AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = Ns0WNyEWdPsk;
        atomicReferenceFieldUpdater.getClass();
        if (dcVar == null) {
            defpackage.p81.ZpBGe2uQfcn8();
            return null;
        }
        defpackage.be beVar3 = (defpackage.be) defpackage.ed.ZpBGe2uQfcn8.getObjectVolatile(dcVar, s0TASMVLSWD5);
        while (!dcVar.dG7RjM6DqYVL()) {
            java.util.concurrent.atomic.AtomicLongFieldUpdater atomicLongFieldUpdater = QiMR8OkAhezm;
            long andIncrement = atomicLongFieldUpdater.getAndIncrement(dcVar);
            long j = defpackage.fc.giKS3J6vZuNy;
            long j2 = andIncrement / j;
            int i = (int) (andIncrement % j);
            if (beVar3.WDYagTQQm9ns != j2) {
                defpackage.be T1fB7bDYiVJQ2 = dcVar.T1fB7bDYiVJQ(j2, beVar3);
                if (T1fB7bDYiVJQ2 == null) {
                    continue;
                } else {
                    beVar = T1fB7bDYiVJQ2;
                }
            } else {
                beVar = beVar3;
            }
            defpackage.dc dcVar2 = dcVar;
            java.lang.Object w6IV1lieBIux = dcVar2.w6IV1lieBIux(beVar, i, andIncrement, null);
            defpackage.ru ruVar = defpackage.fc.h3m55N1URyyK;
            if (w6IV1lieBIux == ruVar) {
                defpackage.h7.P05cfTpS5W5L("unexpected");
                return null;
            }
            defpackage.ru ruVar2 = defpackage.fc.T1fB7bDYiVJQ;
            if (w6IV1lieBIux == ruVar2) {
                if (andIncrement < dcVar2.ZVVdXbWmyCSK()) {
                    beVar.ZpBGe2uQfcn8();
                }
                dcVar = dcVar2;
                beVar3 = beVar;
            } else {
                if (w6IV1lieBIux != defpackage.fc.gUjdnLbkVAaA) {
                    beVar.ZpBGe2uQfcn8();
                    return w6IV1lieBIux;
                }
                defpackage.dd frSwwKIlbUhK = defpackage.nq1.frSwwKIlbUhK(defpackage.q70.OcTWLQzke1i2(mi1Var));
                try {
                    java.lang.Object w6IV1lieBIux2 = dcVar2.w6IV1lieBIux(beVar, i, andIncrement, frSwwKIlbUhK);
                    if (w6IV1lieBIux2 == ruVar) {
                        frSwwKIlbUhK.ZpBGe2uQfcn8(beVar, i);
                    } else {
                        if (w6IV1lieBIux2 == ruVar2) {
                            if (andIncrement < dcVar2.ZVVdXbWmyCSK()) {
                                beVar.ZpBGe2uQfcn8();
                            }
                            defpackage.be beVar4 = (defpackage.be) atomicReferenceFieldUpdater.get(dcVar2);
                            while (true) {
                                if (dcVar2.dG7RjM6DqYVL()) {
                                    frSwwKIlbUhK.e6mdH7fiFuta(new defpackage.g51(dcVar2.s0TASMVLSWD5()));
                                    break;
                                }
                                defpackage.dd ddVar = frSwwKIlbUhK;
                                try {
                                    long andIncrement2 = atomicLongFieldUpdater.getAndIncrement(dcVar2);
                                    long j3 = defpackage.fc.giKS3J6vZuNy;
                                    long j4 = andIncrement2 / j3;
                                    int i2 = (int) (andIncrement2 % j3);
                                    if (beVar4.WDYagTQQm9ns != j4) {
                                        try {
                                            defpackage.be T1fB7bDYiVJQ3 = dcVar2.T1fB7bDYiVJQ(j4, beVar4);
                                            if (T1fB7bDYiVJQ3 == null) {
                                                frSwwKIlbUhK = ddVar;
                                            } else {
                                                beVar2 = T1fB7bDYiVJQ3;
                                            }
                                        } catch (java.lang.Throwable th2) {
                                            th = th2;
                                            frSwwKIlbUhK = ddVar;
                                            frSwwKIlbUhK.jjTN4uUnoyEn();
                                            throw th;
                                        }
                                    } else {
                                        beVar2 = beVar4;
                                    }
                                    defpackage.dc dcVar3 = dcVar2;
                                    w6IV1lieBIux2 = dcVar3.w6IV1lieBIux(beVar2, i2, andIncrement2, ddVar);
                                    dcVar2 = dcVar3;
                                    defpackage.be beVar5 = beVar2;
                                    frSwwKIlbUhK = ddVar;
                                    if (w6IV1lieBIux2 == defpackage.fc.h3m55N1URyyK) {
                                        frSwwKIlbUhK.ZpBGe2uQfcn8(beVar5, i2);
                                        break;
                                    }
                                    if (w6IV1lieBIux2 == defpackage.fc.T1fB7bDYiVJQ) {
                                        if (andIncrement2 < dcVar2.ZVVdXbWmyCSK()) {
                                            beVar5.ZpBGe2uQfcn8();
                                        }
                                        beVar4 = beVar5;
                                    } else {
                                        if (w6IV1lieBIux2 == defpackage.fc.gUjdnLbkVAaA) {
                                            throw new java.lang.IllegalStateException("unexpected");
                                        }
                                        beVar5.ZpBGe2uQfcn8();
                                    }
                                } catch (java.lang.Throwable th3) {
                                    th = th3;
                                    frSwwKIlbUhK = ddVar;
                                    th = th;
                                    frSwwKIlbUhK.jjTN4uUnoyEn();
                                    throw th;
                                }
                            }
                        } else {
                            beVar.ZpBGe2uQfcn8();
                        }
                        frSwwKIlbUhK.GE9mJIPrb8gP(w6IV1lieBIux2, null);
                    }
                    return frSwwKIlbUhK.w7APNrr0aGRc();
                } catch (java.lang.Throwable th4) {
                    th = th4;
                }
            }
        }
        java.lang.Throwable s0TASMVLSWD52 = dcVar.s0TASMVLSWD5();
        int i3 = defpackage.xf1.ZpBGe2uQfcn8;
        throw s0TASMVLSWD52;
    }

    public static final int WDYagTQQm9ns(defpackage.dc dcVar, defpackage.be beVar, int i, java.lang.Object obj, long j, java.lang.Object obj2, boolean z) {
        beVar.s0TASMVLSWD5(i, obj);
        if (z) {
            return dcVar.zJPqDeoF0Os1(beVar, i, obj, j, obj2, z);
        }
        java.lang.Object XntWc4eZSQ8j2 = beVar.XntWc4eZSQ8j(i);
        if (XntWc4eZSQ8j2 == null) {
            if (dcVar.oh71FJcDz6S2(j)) {
                if (beVar.T1fB7bDYiVJQ(i, null, defpackage.fc.JhCgjQRTAOCT)) {
                    return 1;
                }
            } else {
                if (obj2 == null) {
                    return 3;
                }
                if (beVar.T1fB7bDYiVJQ(i, null, obj2)) {
                    return 2;
                }
            }
        } else if (XntWc4eZSQ8j2 instanceof defpackage.vu1) {
            beVar.s0TASMVLSWD5(i, null);
            if (dcVar.hH0RRJrNssvh(XntWc4eZSQ8j2, obj)) {
                beVar.BHfvd2J71qpO(i, defpackage.fc.e6mdH7fiFuta);
                return 0;
            }
            defpackage.ru ruVar = defpackage.fc.Ns0WNyEWdPsk;
            if (beVar.P05cfTpS5W5L.getAndSet((i * 2) + 1, ruVar) == ruVar) {
                return 5;
            }
            beVar.WmetiUbpKU9I(i, true);
            return 5;
        }
        return dcVar.zJPqDeoF0Os1(beVar, i, obj, j, obj2, z);
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0032  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static java.lang.Object frSwwKIlbUhK(defpackage.dc dcVar, defpackage.ll llVar) {
        defpackage.bc bcVar;
        int i;
        defpackage.be beVar;
        if (llVar instanceof defpackage.bc) {
            bcVar = (defpackage.bc) llVar;
            int i2 = bcVar.GE9mJIPrb8gP;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                bcVar.GE9mJIPrb8gP = i2 - Integer.MIN_VALUE;
                defpackage.bc bcVar2 = bcVar;
                java.lang.Object obj = bcVar2.P05cfTpS5W5L;
                i = bcVar2.GE9mJIPrb8gP;
                if (i == 0) {
                    if (i == 1) {
                        defpackage.b80.KrtOTfE6jiS2(obj);
                        return ((defpackage.ae) obj).ZpBGe2uQfcn8;
                    }
                    defpackage.h7.P05cfTpS5W5L("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                defpackage.b80.KrtOTfE6jiS2(obj);
                Ns0WNyEWdPsk.getClass();
                defpackage.be beVar2 = (defpackage.be) defpackage.ed.ZpBGe2uQfcn8.getObjectVolatile(dcVar, s0TASMVLSWD5);
                while (!dcVar.dG7RjM6DqYVL()) {
                    long andIncrement = QiMR8OkAhezm.getAndIncrement(dcVar);
                    long j = defpackage.fc.giKS3J6vZuNy;
                    long j2 = andIncrement / j;
                    int i3 = (int) (andIncrement % j);
                    if (beVar2.WDYagTQQm9ns != j2) {
                        defpackage.be T1fB7bDYiVJQ2 = dcVar.T1fB7bDYiVJQ(j2, beVar2);
                        if (T1fB7bDYiVJQ2 == null) {
                            continue;
                        } else {
                            beVar = T1fB7bDYiVJQ2;
                        }
                    } else {
                        beVar = beVar2;
                    }
                    defpackage.dc dcVar2 = dcVar;
                    java.lang.Object w6IV1lieBIux = dcVar2.w6IV1lieBIux(beVar, i3, andIncrement, null);
                    if (w6IV1lieBIux == defpackage.fc.h3m55N1URyyK) {
                        defpackage.h7.P05cfTpS5W5L("unexpected");
                        return null;
                    }
                    if (w6IV1lieBIux != defpackage.fc.T1fB7bDYiVJQ) {
                        if (w6IV1lieBIux != defpackage.fc.gUjdnLbkVAaA) {
                            beVar.ZpBGe2uQfcn8();
                            return w6IV1lieBIux;
                        }
                        bcVar2.GE9mJIPrb8gP = 1;
                        java.lang.Object KrtOTfE6jiS2 = dcVar2.KrtOTfE6jiS2(beVar, i3, andIncrement, bcVar2);
                        defpackage.tm tmVar = defpackage.tm.WDYagTQQm9ns;
                        return KrtOTfE6jiS2 == tmVar ? tmVar : KrtOTfE6jiS2;
                    }
                    if (andIncrement < dcVar2.ZVVdXbWmyCSK()) {
                        beVar.ZpBGe2uQfcn8();
                    }
                    dcVar = dcVar2;
                    beVar2 = beVar;
                }
                return new defpackage.yd(dcVar.WmetiUbpKU9I());
            }
        }
        bcVar = new defpackage.bc(dcVar, llVar);
        defpackage.bc bcVar22 = bcVar;
        java.lang.Object obj2 = bcVar22.P05cfTpS5W5L;
        i = bcVar22.GE9mJIPrb8gP;
        if (i == 0) {
        }
    }

    public static final void giKS3J6vZuNy(defpackage.dc dcVar, java.lang.Object obj, defpackage.dd ddVar) {
        ddVar.e6mdH7fiFuta(new defpackage.g51(dcVar.BHfvd2J71qpO()));
    }

    public static void maCixPsq4ml2(defpackage.dc dcVar) {
        java.util.concurrent.atomic.AtomicLongFieldUpdater atomicLongFieldUpdater = e6mdH7fiFuta;
        if ((atomicLongFieldUpdater.addAndGet(dcVar, 1L) & 4611686018427387904L) != 0) {
            while ((atomicLongFieldUpdater.get(dcVar) & 4611686018427387904L) != 0) {
            }
        }
    }

    public final java.lang.Throwable BHfvd2J71qpO() {
        java.lang.Throwable WmetiUbpKU9I2 = WmetiUbpKU9I();
        return WmetiUbpKU9I2 == null ? new defpackage.df("Channel was closed") : WmetiUbpKU9I2;
    }

    /* JADX WARN: Code restructure failed: missing block: B:31:0x0046, code lost:
    
        r1 = (defpackage.be) r1.WDYagTQQm9ns();
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final defpackage.be GE9mJIPrb8gP(long j) {
        long j2;
        defpackage.be QiMR8OkAhezm2 = QiMR8OkAhezm();
        if (blKFvluuDQOf()) {
            defpackage.be beVar = QiMR8OkAhezm2;
            loop0: do {
                int i = defpackage.fc.giKS3J6vZuNy - 1;
                while (true) {
                    if (-1 >= i) {
                        break;
                    }
                    j2 = (beVar.WDYagTQQm9ns * defpackage.fc.giKS3J6vZuNy) + i;
                    if (j2 < QiMR8OkAhezm.get(this)) {
                        break loop0;
                    }
                    while (true) {
                        java.lang.Object XntWc4eZSQ8j2 = beVar.XntWc4eZSQ8j(i);
                        if (XntWc4eZSQ8j2 != null && XntWc4eZSQ8j2 != defpackage.fc.WDYagTQQm9ns) {
                            if (XntWc4eZSQ8j2 == defpackage.fc.JhCgjQRTAOCT) {
                                break loop0;
                            }
                        } else {
                            if (beVar.T1fB7bDYiVJQ(i, XntWc4eZSQ8j2, defpackage.fc.fNwYGHIYeJcR)) {
                                beVar.h3m55N1URyyK();
                                break;
                            }
                        }
                    }
                    i--;
                }
            } while (beVar != null);
            j2 = -1;
            if (j2 != -1) {
                Ns0WNyEWdPsk(j2);
            }
        }
        java.lang.Object obj = null;
        loop3: for (defpackage.be beVar2 = QiMR8OkAhezm2; beVar2 != null; beVar2 = (defpackage.be) beVar2.WDYagTQQm9ns()) {
            for (int i2 = defpackage.fc.giKS3J6vZuNy - 1; -1 < i2; i2--) {
                if ((beVar2.WDYagTQQm9ns * defpackage.fc.giKS3J6vZuNy) + i2 < j) {
                    break loop3;
                }
                while (true) {
                    java.lang.Object XntWc4eZSQ8j3 = beVar2.XntWc4eZSQ8j(i2);
                    if (XntWc4eZSQ8j3 != null && XntWc4eZSQ8j3 != defpackage.fc.WDYagTQQm9ns) {
                        if (!(XntWc4eZSQ8j3 instanceof defpackage.wu1)) {
                            if (!(XntWc4eZSQ8j3 instanceof defpackage.vu1)) {
                                break;
                            }
                            if (beVar2.T1fB7bDYiVJQ(i2, XntWc4eZSQ8j3, defpackage.fc.fNwYGHIYeJcR)) {
                                obj = defpackage.j80.jjTN4uUnoyEn(obj, XntWc4eZSQ8j3);
                                beVar2.WmetiUbpKU9I(i2, true);
                                break;
                            }
                        } else {
                            if (beVar2.T1fB7bDYiVJQ(i2, XntWc4eZSQ8j3, defpackage.fc.fNwYGHIYeJcR)) {
                                obj = defpackage.j80.jjTN4uUnoyEn(obj, ((defpackage.wu1) XntWc4eZSQ8j3).ZpBGe2uQfcn8);
                                beVar2.WmetiUbpKU9I(i2, true);
                                break;
                            }
                        }
                    } else {
                        if (beVar2.T1fB7bDYiVJQ(i2, XntWc4eZSQ8j3, defpackage.fc.fNwYGHIYeJcR)) {
                            beVar2.h3m55N1URyyK();
                            break;
                        }
                    }
                }
            }
        }
        if (obj != null) {
            if (!(obj instanceof java.util.ArrayList)) {
                IBvW5fLsPuHy((defpackage.vu1) obj, true);
                return QiMR8OkAhezm2;
            }
            java.util.ArrayList arrayList = (java.util.ArrayList) obj;
            for (int size = arrayList.size() - 1; -1 < size; size--) {
                IBvW5fLsPuHy((defpackage.vu1) arrayList.get(size), true);
            }
        }
        return QiMR8OkAhezm2;
    }

    public final void IBvW5fLsPuHy(defpackage.vu1 vu1Var, boolean z) {
        if (vu1Var instanceof defpackage.bd) {
            ((defpackage.kl) vu1Var).e6mdH7fiFuta(new defpackage.g51(z ? s0TASMVLSWD5() : BHfvd2J71qpO()));
            return;
        }
        if (vu1Var instanceof defpackage.d31) {
            ((defpackage.d31) vu1Var).WDYagTQQm9ns.e6mdH7fiFuta(new defpackage.ae(new defpackage.yd(WmetiUbpKU9I())));
            return;
        }
        if (!(vu1Var instanceof defpackage.ac)) {
            defpackage.h7.QiMR8OkAhezm(vu1Var, "Unexpected waiter: ");
            return;
        }
        defpackage.ac acVar = (defpackage.ac) vu1Var;
        defpackage.dd ddVar = acVar.oh71FJcDz6S2;
        ddVar.getClass();
        acVar.oh71FJcDz6S2 = null;
        acVar.WDYagTQQm9ns = defpackage.fc.fNwYGHIYeJcR;
        java.lang.Throwable WmetiUbpKU9I2 = acVar.QiMR8OkAhezm.WmetiUbpKU9I();
        if (WmetiUbpKU9I2 == null) {
            ddVar.e6mdH7fiFuta(java.lang.Boolean.FALSE);
        } else {
            ddVar.e6mdH7fiFuta(new defpackage.g51(WmetiUbpKU9I2));
        }
    }

    @Override // defpackage.pd
    public final java.lang.Object IJ0hOnjhPOri(defpackage.lg lgVar) {
        return frSwwKIlbUhK(this, lgVar);
    }

    @Override // defpackage.pd
    public final void JhCgjQRTAOCT(java.util.concurrent.CancellationException cancellationException) {
        if (cancellationException == null) {
            cancellationException = new java.util.concurrent.CancellationException("Channel was cancelled");
        }
        e6mdH7fiFuta(cancellationException, true);
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x002d  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0020  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object KrtOTfE6jiS2(defpackage.be beVar, int i, long j, defpackage.ll llVar) {
        defpackage.cc ccVar;
        int i2;
        defpackage.ae aeVar;
        defpackage.be beVar2;
        if (llVar instanceof defpackage.cc) {
            ccVar = (defpackage.cc) llVar;
            int i3 = ccVar.GE9mJIPrb8gP;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                ccVar.GE9mJIPrb8gP = i3 - Integer.MIN_VALUE;
                java.lang.Object obj = ccVar.P05cfTpS5W5L;
                i2 = ccVar.GE9mJIPrb8gP;
                if (i2 != 0) {
                    defpackage.b80.KrtOTfE6jiS2(obj);
                    ccVar.GE9mJIPrb8gP = 1;
                    defpackage.dd frSwwKIlbUhK = defpackage.nq1.frSwwKIlbUhK(defpackage.q70.OcTWLQzke1i2(ccVar));
                    try {
                        defpackage.d31 d31Var = new defpackage.d31(frSwwKIlbUhK);
                        java.lang.Object w6IV1lieBIux = w6IV1lieBIux(beVar, i, j, d31Var);
                        if (w6IV1lieBIux == defpackage.fc.h3m55N1URyyK) {
                            d31Var.ZpBGe2uQfcn8(beVar, i);
                        } else {
                            if (w6IV1lieBIux == defpackage.fc.T1fB7bDYiVJQ) {
                                if (j < ZVVdXbWmyCSK()) {
                                    beVar.ZpBGe2uQfcn8();
                                }
                                defpackage.be beVar3 = (defpackage.be) Ns0WNyEWdPsk.get(this);
                                while (true) {
                                    if (dG7RjM6DqYVL()) {
                                        frSwwKIlbUhK.e6mdH7fiFuta(new defpackage.ae(new defpackage.yd(WmetiUbpKU9I())));
                                        break;
                                    }
                                    long andIncrement = QiMR8OkAhezm.getAndIncrement(this);
                                    long j2 = defpackage.fc.giKS3J6vZuNy;
                                    long j3 = andIncrement / j2;
                                    int i4 = (int) (andIncrement % j2);
                                    if (beVar3.WDYagTQQm9ns != j3) {
                                        defpackage.be T1fB7bDYiVJQ2 = T1fB7bDYiVJQ(j3, beVar3);
                                        if (T1fB7bDYiVJQ2 != null) {
                                            beVar2 = T1fB7bDYiVJQ2;
                                        }
                                    } else {
                                        beVar2 = beVar3;
                                    }
                                    java.lang.Object w6IV1lieBIux2 = w6IV1lieBIux(beVar2, i4, andIncrement, d31Var);
                                    defpackage.be beVar4 = beVar2;
                                    if (w6IV1lieBIux2 == defpackage.fc.h3m55N1URyyK) {
                                        d31Var.ZpBGe2uQfcn8(beVar4, i4);
                                        break;
                                    }
                                    if (w6IV1lieBIux2 == defpackage.fc.T1fB7bDYiVJQ) {
                                        if (andIncrement < ZVVdXbWmyCSK()) {
                                            beVar4.ZpBGe2uQfcn8();
                                        }
                                        beVar3 = beVar4;
                                    } else {
                                        if (w6IV1lieBIux2 == defpackage.fc.gUjdnLbkVAaA) {
                                            throw new java.lang.IllegalStateException("unexpected");
                                        }
                                        beVar4.ZpBGe2uQfcn8();
                                        aeVar = new defpackage.ae(w6IV1lieBIux2);
                                    }
                                }
                            } else {
                                beVar.ZpBGe2uQfcn8();
                                aeVar = new defpackage.ae(w6IV1lieBIux);
                            }
                            frSwwKIlbUhK.GE9mJIPrb8gP(aeVar, null);
                        }
                        obj = frSwwKIlbUhK.w7APNrr0aGRc();
                        defpackage.tm tmVar = defpackage.tm.WDYagTQQm9ns;
                        if (obj == tmVar) {
                            return tmVar;
                        }
                    } catch (java.lang.Throwable th) {
                        frSwwKIlbUhK.jjTN4uUnoyEn();
                        throw th;
                    }
                } else {
                    if (i2 != 1) {
                        defpackage.h7.P05cfTpS5W5L("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    defpackage.b80.KrtOTfE6jiS2(obj);
                }
                return ((defpackage.ae) obj).ZpBGe2uQfcn8;
            }
        }
        ccVar = new defpackage.cc(this, llVar);
        java.lang.Object obj2 = ccVar.P05cfTpS5W5L;
        i2 = ccVar.GE9mJIPrb8gP;
        if (i2 != 0) {
        }
        return ((defpackage.ae) obj2).ZpBGe2uQfcn8;
    }

    public final void Ns0WNyEWdPsk(long j) {
        Ns0WNyEWdPsk.getClass();
        defpackage.be beVar = (defpackage.be) defpackage.ed.ZpBGe2uQfcn8.getObjectVolatile(this, s0TASMVLSWD5);
        while (true) {
            java.util.concurrent.atomic.AtomicLongFieldUpdater atomicLongFieldUpdater = QiMR8OkAhezm;
            long j2 = atomicLongFieldUpdater.get(this);
            if (j < java.lang.Math.max(this.WDYagTQQm9ns + j2, P05cfTpS5W5L.get(this))) {
                return;
            }
            defpackage.dc dcVar = this;
            if (atomicLongFieldUpdater.compareAndSet(dcVar, j2, 1 + j2)) {
                long j3 = defpackage.fc.giKS3J6vZuNy;
                long j4 = j2 / j3;
                int i = (int) (j2 % j3);
                if (beVar.WDYagTQQm9ns != j4) {
                    defpackage.be T1fB7bDYiVJQ2 = dcVar.T1fB7bDYiVJQ(j4, beVar);
                    if (T1fB7bDYiVJQ2 != null) {
                        beVar = T1fB7bDYiVJQ2;
                    }
                }
                defpackage.be beVar2 = beVar;
                if (dcVar.w6IV1lieBIux(beVar2, i, j2, null) != defpackage.fc.T1fB7bDYiVJQ) {
                    beVar2.ZpBGe2uQfcn8();
                } else if (j2 < dcVar.ZVVdXbWmyCSK()) {
                    beVar2.ZpBGe2uQfcn8();
                }
                this = dcVar;
                beVar = beVar2;
            }
            this = dcVar;
        }
    }

    public final boolean OcTWLQzke1i2() {
        return oCu53ZX2v4Ju(oh71FJcDz6S2.get(this), false);
    }

    @Override // defpackage.pd
    public final java.lang.Object P05cfTpS5W5L(defpackage.mi1 mi1Var) {
        return Mearx7yMn90V(this, mi1Var);
    }

    public final defpackage.be QiMR8OkAhezm() {
        fNwYGHIYeJcR.getClass();
        sun.misc.Unsafe unsafe = defpackage.ed.ZpBGe2uQfcn8;
        java.lang.Object objectVolatile = unsafe.getObjectVolatile(this, XntWc4eZSQ8j);
        GE9mJIPrb8gP.getClass();
        defpackage.be beVar = (defpackage.be) unsafe.getObjectVolatile(this, BHfvd2J71qpO);
        if (beVar.WDYagTQQm9ns > ((defpackage.be) objectVolatile).WDYagTQQm9ns) {
            objectVolatile = beVar;
        }
        Ns0WNyEWdPsk.getClass();
        defpackage.be beVar2 = (defpackage.be) unsafe.getObjectVolatile(this, s0TASMVLSWD5);
        if (beVar2.WDYagTQQm9ns > ((defpackage.be) objectVolatile).WDYagTQQm9ns) {
            objectVolatile = beVar2;
        }
        defpackage.wj wjVar = (defpackage.wj) objectVolatile;
        while (true) {
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = defpackage.wj.ZpBGe2uQfcn8;
            java.lang.Object JhCgjQRTAOCT = wjVar.JhCgjQRTAOCT();
            if (JhCgjQRTAOCT == defpackage.nq1.JhCgjQRTAOCT) {
                break;
            }
            defpackage.wj wjVar2 = (defpackage.wj) JhCgjQRTAOCT;
            if (wjVar2 != null) {
                wjVar = wjVar2;
            } else if (wjVar.QiMR8OkAhezm()) {
                break;
            }
        }
        return (defpackage.be) wjVar;
    }

    /* JADX WARN: Code restructure failed: missing block: B:49:0x00d0, code lost:
    
        if (r8.GE9mJIPrb8gP() == false) goto L76;
     */
    /* JADX WARN: Code restructure failed: missing block: B:50:0x00d2, code lost:
    
        r8.P05cfTpS5W5L();
     */
    /* JADX WARN: Removed duplicated region for block: B:60:0x00de  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x0107 A[RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final defpackage.be T1fB7bDYiVJQ(long j, defpackage.be beVar) {
        java.lang.Object jjTN4uUnoyEn;
        defpackage.be beVar2;
        long j2;
        sun.misc.Unsafe unsafe;
        defpackage.be beVar3 = defpackage.fc.ZpBGe2uQfcn8;
        defpackage.ec ecVar = defpackage.ec.fNwYGHIYeJcR;
        loop0: while (true) {
            jjTN4uUnoyEn = defpackage.nq1.jjTN4uUnoyEn(beVar, j, ecVar);
            if (!defpackage.q70.UmgHb6n58gfG(jjTN4uUnoyEn)) {
                defpackage.ka1 VFeft99leXEK = defpackage.q70.VFeft99leXEK(jjTN4uUnoyEn);
                while (true) {
                    Ns0WNyEWdPsk.getClass();
                    sun.misc.Unsafe unsafe2 = defpackage.ed.ZpBGe2uQfcn8;
                    long j3 = s0TASMVLSWD5;
                    defpackage.ka1 ka1Var = (defpackage.ka1) unsafe2.getObjectVolatile(this, j3);
                    if (ka1Var.WDYagTQQm9ns >= VFeft99leXEK.WDYagTQQm9ns) {
                        break loop0;
                    }
                    if (!VFeft99leXEK.gUjdnLbkVAaA()) {
                        break;
                    }
                    do {
                        unsafe = defpackage.ed.ZpBGe2uQfcn8;
                        if (unsafe.compareAndSwapObject(this, s0TASMVLSWD5, ka1Var, VFeft99leXEK)) {
                            if (ka1Var.GE9mJIPrb8gP()) {
                                ka1Var.P05cfTpS5W5L();
                            }
                        }
                    } while (unsafe.getObjectVolatile(this, j3) == ka1Var);
                    if (VFeft99leXEK.GE9mJIPrb8gP()) {
                        VFeft99leXEK.P05cfTpS5W5L();
                    }
                }
            } else {
                break;
            }
        }
        if (defpackage.q70.UmgHb6n58gfG(jjTN4uUnoyEn)) {
            OcTWLQzke1i2();
            if (beVar.WDYagTQQm9ns * defpackage.fc.giKS3J6vZuNy < ZVVdXbWmyCSK()) {
                beVar.ZpBGe2uQfcn8();
                return null;
            }
        } else {
            defpackage.be beVar4 = (defpackage.be) defpackage.q70.VFeft99leXEK(jjTN4uUnoyEn);
            long j4 = beVar4.WDYagTQQm9ns;
            if (!UmgHb6n58gfG() && j <= P05cfTpS5W5L.get(this) / defpackage.fc.giKS3J6vZuNy) {
                while (true) {
                    fNwYGHIYeJcR.getClass();
                    sun.misc.Unsafe unsafe3 = defpackage.ed.ZpBGe2uQfcn8;
                    long j5 = XntWc4eZSQ8j;
                    defpackage.ka1 ka1Var2 = (defpackage.ka1) unsafe3.getObjectVolatile(this, j5);
                    if (ka1Var2.WDYagTQQm9ns >= j4 || !beVar4.gUjdnLbkVAaA()) {
                        break;
                    }
                    while (true) {
                        sun.misc.Unsafe unsafe4 = defpackage.ed.ZpBGe2uQfcn8;
                        beVar2 = beVar4;
                        if (unsafe4.compareAndSwapObject(this, XntWc4eZSQ8j, ka1Var2, beVar4)) {
                            if (ka1Var2.GE9mJIPrb8gP()) {
                                ka1Var2.P05cfTpS5W5L();
                            }
                        } else {
                            if (unsafe4.getObjectVolatile(this, j5) != ka1Var2) {
                                break;
                            }
                            beVar4 = beVar2;
                        }
                    }
                    beVar4 = beVar2;
                }
                if (j4 > j) {
                    return beVar2;
                }
                long j6 = j4 * defpackage.fc.giKS3J6vZuNy;
                do {
                    j2 = QiMR8OkAhezm.get(this);
                    if (j2 >= j6) {
                        break;
                    }
                } while (!QiMR8OkAhezm.compareAndSet(this, j2, j6));
                if (j4 * defpackage.fc.giKS3J6vZuNy < ZVVdXbWmyCSK()) {
                    beVar2.ZpBGe2uQfcn8();
                }
            }
            beVar2 = beVar4;
            if (j4 > j) {
            }
        }
        return null;
    }

    public final boolean UmgHb6n58gfG() {
        long j = P05cfTpS5W5L.get(this);
        return j == 0 || j == Long.MAX_VALUE;
    }

    public final void VFeft99leXEK() {
        java.lang.Object objectVolatile;
        defpackage.dc dcVar;
        loop0: while (true) {
            gUjdnLbkVAaA.getClass();
            sun.misc.Unsafe unsafe = defpackage.ed.ZpBGe2uQfcn8;
            long j = WmetiUbpKU9I;
            objectVolatile = unsafe.getObjectVolatile(this, j);
            defpackage.ru ruVar = objectVolatile == null ? defpackage.fc.WmetiUbpKU9I : defpackage.fc.s0TASMVLSWD5;
            while (true) {
                sun.misc.Unsafe unsafe2 = defpackage.ed.ZpBGe2uQfcn8;
                dcVar = this;
                if (unsafe2.compareAndSwapObject(dcVar, WmetiUbpKU9I, objectVolatile, ruVar)) {
                    break loop0;
                } else if (unsafe2.getObjectVolatile(dcVar, j) != objectVolatile) {
                    break;
                } else {
                    this = dcVar;
                }
            }
            this = dcVar;
        }
        if (objectVolatile == null) {
            return;
        }
        defpackage.nq1.IJ0hOnjhPOri(1, objectVolatile);
        ((defpackage.y10) objectVolatile).P05cfTpS5W5L(dcVar.WmetiUbpKU9I());
    }

    public final void Wc0TdmRSwbbi(long j) {
        java.util.concurrent.atomic.AtomicLongFieldUpdater atomicLongFieldUpdater;
        defpackage.dc dcVar = this;
        if (dcVar.UmgHb6n58gfG()) {
            return;
        }
        while (true) {
            atomicLongFieldUpdater = P05cfTpS5W5L;
            if (atomicLongFieldUpdater.get(dcVar) > j) {
                break;
            } else {
                dcVar = this;
            }
        }
        int i = defpackage.fc.fWTAfUmVKrZq;
        int i2 = 0;
        while (true) {
            java.util.concurrent.atomic.AtomicLongFieldUpdater atomicLongFieldUpdater2 = e6mdH7fiFuta;
            if (i2 < i) {
                long j2 = atomicLongFieldUpdater.get(dcVar);
                if (j2 == (4611686018427387903L & atomicLongFieldUpdater2.get(dcVar)) && j2 == atomicLongFieldUpdater.get(dcVar)) {
                    return;
                } else {
                    i2++;
                }
            } else {
                while (true) {
                    long j3 = atomicLongFieldUpdater2.get(dcVar);
                    if (atomicLongFieldUpdater2.compareAndSet(dcVar, j3, (j3 & 4611686018427387903L) + 4611686018427387904L)) {
                        break;
                    } else {
                        dcVar = this;
                    }
                }
                while (true) {
                    long j4 = atomicLongFieldUpdater.get(dcVar);
                    long j5 = atomicLongFieldUpdater2.get(dcVar);
                    long j6 = j5 & 4611686018427387903L;
                    boolean z = (j5 & 4611686018427387904L) != 0;
                    if (j4 == j6 && j4 == atomicLongFieldUpdater.get(dcVar)) {
                        break;
                    }
                    if (z) {
                        dcVar = this;
                    } else {
                        dcVar = this;
                        atomicLongFieldUpdater2.compareAndSet(dcVar, j5, 4611686018427387904L + j6);
                    }
                }
                while (true) {
                    long j7 = atomicLongFieldUpdater2.get(dcVar);
                    if (atomicLongFieldUpdater2.compareAndSet(dcVar, j7, j7 & 4611686018427387903L)) {
                        return;
                    } else {
                        dcVar = this;
                    }
                }
            }
        }
    }

    public final java.lang.Throwable WmetiUbpKU9I() {
        h3m55N1URyyK.getClass();
        return (java.lang.Throwable) defpackage.ed.ZpBGe2uQfcn8.getObjectVolatile(this, T1fB7bDYiVJQ);
    }

    public final defpackage.be XntWc4eZSQ8j(long j, defpackage.be beVar) {
        java.lang.Object jjTN4uUnoyEn;
        long j2;
        long j3;
        sun.misc.Unsafe unsafe;
        defpackage.be beVar2 = defpackage.fc.ZpBGe2uQfcn8;
        defpackage.ec ecVar = defpackage.ec.fNwYGHIYeJcR;
        loop0: while (true) {
            jjTN4uUnoyEn = defpackage.nq1.jjTN4uUnoyEn(beVar, j, ecVar);
            if (!defpackage.q70.UmgHb6n58gfG(jjTN4uUnoyEn)) {
                defpackage.ka1 VFeft99leXEK = defpackage.q70.VFeft99leXEK(jjTN4uUnoyEn);
                while (true) {
                    GE9mJIPrb8gP.getClass();
                    sun.misc.Unsafe unsafe2 = defpackage.ed.ZpBGe2uQfcn8;
                    long j4 = BHfvd2J71qpO;
                    defpackage.ka1 ka1Var = (defpackage.ka1) unsafe2.getObjectVolatile(this, j4);
                    if (ka1Var.WDYagTQQm9ns >= VFeft99leXEK.WDYagTQQm9ns) {
                        break loop0;
                    }
                    if (!VFeft99leXEK.gUjdnLbkVAaA()) {
                        break;
                    }
                    do {
                        unsafe = defpackage.ed.ZpBGe2uQfcn8;
                        if (unsafe.compareAndSwapObject(this, BHfvd2J71qpO, ka1Var, VFeft99leXEK)) {
                            if (ka1Var.GE9mJIPrb8gP()) {
                                ka1Var.P05cfTpS5W5L();
                            }
                        }
                    } while (unsafe.getObjectVolatile(this, j4) == ka1Var);
                    if (VFeft99leXEK.GE9mJIPrb8gP()) {
                        VFeft99leXEK.P05cfTpS5W5L();
                    }
                }
            } else {
                break;
            }
        }
        boolean UmgHb6n58gfG = defpackage.q70.UmgHb6n58gfG(jjTN4uUnoyEn);
        java.util.concurrent.atomic.AtomicLongFieldUpdater atomicLongFieldUpdater = QiMR8OkAhezm;
        if (UmgHb6n58gfG) {
            OcTWLQzke1i2();
            if (beVar.WDYagTQQm9ns * defpackage.fc.giKS3J6vZuNy < atomicLongFieldUpdater.get(this)) {
                beVar.ZpBGe2uQfcn8();
                return null;
            }
        } else {
            defpackage.be beVar3 = (defpackage.be) defpackage.q70.VFeft99leXEK(jjTN4uUnoyEn);
            long j5 = beVar3.WDYagTQQm9ns;
            if (j5 <= j) {
                return beVar3;
            }
            long j6 = j5 * defpackage.fc.giKS3J6vZuNy;
            do {
                j2 = oh71FJcDz6S2.get(this);
                j3 = 1152921504606846975L & j2;
                if (j3 >= j6) {
                    break;
                }
            } while (!oh71FJcDz6S2.compareAndSet(this, j2, j3 + (((int) (j2 >> 60)) << 60)));
            if (j5 * defpackage.fc.giKS3J6vZuNy < atomicLongFieldUpdater.get(this)) {
                beVar3.ZpBGe2uQfcn8();
            }
        }
        return null;
    }

    public final long ZVVdXbWmyCSK() {
        return oh71FJcDz6S2.get(this) & 1152921504606846975L;
    }

    @Override // defpackage.bc1
    public java.lang.Object ZpBGe2uQfcn8(defpackage.kl klVar, java.lang.Object obj) {
        return BXaznwstz2U0(this, obj, klVar);
    }

    public boolean blKFvluuDQOf() {
        return false;
    }

    public final boolean dG7RjM6DqYVL() {
        return oCu53ZX2v4Ju(oh71FJcDz6S2.get(this), true);
    }

    public final boolean e6mdH7fiFuta(java.lang.Throwable th, boolean z) {
        defpackage.dc dcVar;
        boolean z2;
        long j;
        long j2;
        long j3;
        java.util.concurrent.atomic.AtomicLongFieldUpdater atomicLongFieldUpdater = oh71FJcDz6S2;
        if (z) {
            while (true) {
                long j4 = atomicLongFieldUpdater.get(this);
                if (((int) (j4 >> 60)) != 0) {
                    break;
                }
                defpackage.be beVar = defpackage.fc.ZpBGe2uQfcn8;
                dcVar = this;
                if (atomicLongFieldUpdater.compareAndSet(dcVar, j4, (j4 & 1152921504606846975L) + 1152921504606846976L)) {
                    break;
                }
                this = dcVar;
            }
        }
        dcVar = this;
        defpackage.ru ruVar = defpackage.fc.BHfvd2J71qpO;
        while (true) {
            h3m55N1URyyK.getClass();
            defpackage.dc dcVar2 = dcVar;
            sun.misc.Unsafe unsafe = defpackage.ed.ZpBGe2uQfcn8;
            long j5 = T1fB7bDYiVJQ;
            java.lang.Throwable th2 = th;
            boolean compareAndSwapObject = unsafe.compareAndSwapObject(dcVar2, j5, ruVar, th2);
            dcVar = dcVar2;
            if (compareAndSwapObject) {
                z2 = true;
                break;
            }
            if (unsafe.getObjectVolatile(dcVar, j5) != ruVar) {
                z2 = false;
                break;
            }
            th = th2;
        }
        if (z) {
            do {
                j3 = atomicLongFieldUpdater.get(dcVar);
            } while (!atomicLongFieldUpdater.compareAndSet(dcVar, j3, 3458764513820540928L + (j3 & 1152921504606846975L)));
        } else {
            do {
                j = atomicLongFieldUpdater.get(dcVar);
                int i = (int) (j >> 60);
                if (i == 0) {
                    j2 = (j & 1152921504606846975L) + 2305843009213693952L;
                } else {
                    if (i != 1) {
                        break;
                    }
                    j2 = (j & 1152921504606846975L) + 3458764513820540928L;
                }
            } while (!atomicLongFieldUpdater.compareAndSet(dcVar, j, j2));
        }
        dcVar.OcTWLQzke1i2();
        if (z2) {
            dcVar.VFeft99leXEK();
        }
        return z2;
    }

    public final void fNwYGHIYeJcR() {
        defpackage.dc dcVar;
        if (UmgHb6n58gfG()) {
            return;
        }
        fNwYGHIYeJcR.getClass();
        defpackage.be beVar = (defpackage.be) defpackage.ed.ZpBGe2uQfcn8.getObjectVolatile(this, XntWc4eZSQ8j);
        loop0: while (true) {
            long andIncrement = P05cfTpS5W5L.getAndIncrement(this);
            long j = defpackage.fc.giKS3J6vZuNy;
            long j2 = andIncrement / j;
            if (this.ZVVdXbWmyCSK() <= andIncrement) {
                if (beVar.WDYagTQQm9ns < j2 && beVar.fWTAfUmVKrZq() != null) {
                    this.qjMheFZ0l9kA(j2, beVar);
                }
                maCixPsq4ml2(this);
                return;
            }
            dcVar = this;
            if (beVar.WDYagTQQm9ns != j2) {
                defpackage.be gUjdnLbkVAaA2 = dcVar.gUjdnLbkVAaA(j2, beVar, andIncrement);
                if (gUjdnLbkVAaA2 == null) {
                    continue;
                    this = dcVar;
                } else {
                    beVar = gUjdnLbkVAaA2;
                }
            }
            int i = (int) (andIncrement % j);
            java.lang.Object XntWc4eZSQ8j2 = beVar.XntWc4eZSQ8j(i);
            boolean z = XntWc4eZSQ8j2 instanceof defpackage.vu1;
            java.util.concurrent.atomic.AtomicLongFieldUpdater atomicLongFieldUpdater = QiMR8OkAhezm;
            if (!z || andIncrement < atomicLongFieldUpdater.get(dcVar) || !beVar.T1fB7bDYiVJQ(i, XntWc4eZSQ8j2, defpackage.fc.QiMR8OkAhezm)) {
                while (true) {
                    java.lang.Object XntWc4eZSQ8j3 = beVar.XntWc4eZSQ8j(i);
                    if (!(XntWc4eZSQ8j3 instanceof defpackage.vu1)) {
                        if (XntWc4eZSQ8j3 != defpackage.fc.GE9mJIPrb8gP) {
                            if (XntWc4eZSQ8j3 != null) {
                                if (XntWc4eZSQ8j3 == defpackage.fc.JhCgjQRTAOCT || XntWc4eZSQ8j3 == defpackage.fc.P05cfTpS5W5L || XntWc4eZSQ8j3 == defpackage.fc.e6mdH7fiFuta || XntWc4eZSQ8j3 == defpackage.fc.Ns0WNyEWdPsk || XntWc4eZSQ8j3 == defpackage.fc.fNwYGHIYeJcR) {
                                    break loop0;
                                } else if (XntWc4eZSQ8j3 != defpackage.fc.oh71FJcDz6S2) {
                                    defpackage.h7.QiMR8OkAhezm(XntWc4eZSQ8j3, "Unexpected cell state: ");
                                    return;
                                }
                            } else if (beVar.T1fB7bDYiVJQ(i, XntWc4eZSQ8j3, defpackage.fc.WDYagTQQm9ns)) {
                                break loop0;
                            }
                        } else {
                            break;
                        }
                    } else if (andIncrement < atomicLongFieldUpdater.get(dcVar)) {
                        if (beVar.T1fB7bDYiVJQ(i, XntWc4eZSQ8j3, new defpackage.wu1((defpackage.vu1) XntWc4eZSQ8j3))) {
                            break loop0;
                        }
                    } else if (beVar.T1fB7bDYiVJQ(i, XntWc4eZSQ8j3, defpackage.fc.QiMR8OkAhezm)) {
                        if (GcLuU6pT9wO9(XntWc4eZSQ8j3)) {
                            beVar.BHfvd2J71qpO(i, defpackage.fc.JhCgjQRTAOCT);
                            break;
                        } else {
                            beVar.BHfvd2J71qpO(i, defpackage.fc.GE9mJIPrb8gP);
                            beVar.h3m55N1URyyK();
                        }
                    }
                }
                maCixPsq4ml2(dcVar);
            } else if (GcLuU6pT9wO9(XntWc4eZSQ8j2)) {
                beVar.BHfvd2J71qpO(i, defpackage.fc.JhCgjQRTAOCT);
                break;
            } else {
                beVar.BHfvd2J71qpO(i, defpackage.fc.GE9mJIPrb8gP);
                beVar.h3m55N1URyyK();
                maCixPsq4ml2(dcVar);
            }
            this = dcVar;
        }
        maCixPsq4ml2(dcVar);
    }

    @Override // defpackage.bc1
    public java.lang.Object fWTAfUmVKrZq(java.lang.Object obj) {
        java.util.concurrent.atomic.AtomicLongFieldUpdater atomicLongFieldUpdater = oh71FJcDz6S2;
        boolean z = false;
        long j = 1152921504606846975L;
        boolean z2 = oCu53ZX2v4Ju(atomicLongFieldUpdater.get(this), false) ? false : !oh71FJcDz6S2(r1 & 1152921504606846975L);
        defpackage.zd zdVar = defpackage.ae.giKS3J6vZuNy;
        if (z2) {
            return zdVar;
        }
        defpackage.pu puVar = defpackage.fc.GE9mJIPrb8gP;
        GE9mJIPrb8gP.getClass();
        defpackage.be beVar = (defpackage.be) defpackage.ed.ZpBGe2uQfcn8.getObjectVolatile(this, BHfvd2J71qpO);
        while (true) {
            long andIncrement = atomicLongFieldUpdater.getAndIncrement(this);
            long j2 = andIncrement & j;
            boolean oCu53ZX2v4Ju = oCu53ZX2v4Ju(andIncrement, z);
            int i = defpackage.fc.giKS3J6vZuNy;
            long j3 = i;
            long j4 = j2 / j3;
            int i2 = (int) (j2 % j3);
            if (beVar.WDYagTQQm9ns != j4) {
                defpackage.be XntWc4eZSQ8j2 = XntWc4eZSQ8j(j4, beVar);
                if (XntWc4eZSQ8j2 != null) {
                    beVar = XntWc4eZSQ8j2;
                } else {
                    if (oCu53ZX2v4Ju) {
                        return new defpackage.yd(BHfvd2J71qpO());
                    }
                    z = false;
                    j = 1152921504606846975L;
                }
            }
            int WDYagTQQm9ns = WDYagTQQm9ns(this, beVar, i2, obj, j2, puVar, oCu53ZX2v4Ju);
            defpackage.gs1 gs1Var = defpackage.gs1.ZpBGe2uQfcn8;
            if (WDYagTQQm9ns == 0) {
                beVar.ZpBGe2uQfcn8();
                return gs1Var;
            }
            if (WDYagTQQm9ns == 1) {
                return gs1Var;
            }
            if (WDYagTQQm9ns == 2) {
                if (oCu53ZX2v4Ju) {
                    beVar.h3m55N1URyyK();
                    return new defpackage.yd(BHfvd2J71qpO());
                }
                defpackage.vu1 vu1Var = puVar instanceof defpackage.vu1 ? (defpackage.vu1) puVar : null;
                if (vu1Var != null) {
                    vu1Var.ZpBGe2uQfcn8(beVar, i2 + i);
                }
                beVar.h3m55N1URyyK();
                return zdVar;
            }
            if (WDYagTQQm9ns == 3) {
                defpackage.h7.P05cfTpS5W5L("unexpected");
                return null;
            }
            if (WDYagTQQm9ns == 4) {
                if (j2 < QiMR8OkAhezm.get(this)) {
                    beVar.ZpBGe2uQfcn8();
                }
                return new defpackage.yd(BHfvd2J71qpO());
            }
            if (WDYagTQQm9ns == 5) {
                beVar.ZpBGe2uQfcn8();
            }
            z = false;
            j = 1152921504606846975L;
        }
    }

    public final defpackage.be gUjdnLbkVAaA(long j, defpackage.be beVar, long j2) {
        java.lang.Object jjTN4uUnoyEn;
        sun.misc.Unsafe unsafe;
        defpackage.be beVar2 = defpackage.fc.ZpBGe2uQfcn8;
        defpackage.ec ecVar = defpackage.ec.fNwYGHIYeJcR;
        loop0: while (true) {
            jjTN4uUnoyEn = defpackage.nq1.jjTN4uUnoyEn(beVar, j, ecVar);
            if (!defpackage.q70.UmgHb6n58gfG(jjTN4uUnoyEn)) {
                defpackage.ka1 VFeft99leXEK = defpackage.q70.VFeft99leXEK(jjTN4uUnoyEn);
                while (true) {
                    fNwYGHIYeJcR.getClass();
                    sun.misc.Unsafe unsafe2 = defpackage.ed.ZpBGe2uQfcn8;
                    long j3 = XntWc4eZSQ8j;
                    defpackage.ka1 ka1Var = (defpackage.ka1) unsafe2.getObjectVolatile(this, j3);
                    if (ka1Var.WDYagTQQm9ns >= VFeft99leXEK.WDYagTQQm9ns) {
                        break loop0;
                    }
                    if (!VFeft99leXEK.gUjdnLbkVAaA()) {
                        break;
                    }
                    do {
                        unsafe = defpackage.ed.ZpBGe2uQfcn8;
                        if (unsafe.compareAndSwapObject(this, XntWc4eZSQ8j, ka1Var, VFeft99leXEK)) {
                            if (ka1Var.GE9mJIPrb8gP()) {
                                ka1Var.P05cfTpS5W5L();
                            }
                        }
                    } while (unsafe.getObjectVolatile(this, j3) == ka1Var);
                    if (VFeft99leXEK.GE9mJIPrb8gP()) {
                        VFeft99leXEK.P05cfTpS5W5L();
                    }
                }
            } else {
                break;
            }
        }
        if (defpackage.q70.UmgHb6n58gfG(jjTN4uUnoyEn)) {
            OcTWLQzke1i2();
            qjMheFZ0l9kA(j, beVar);
            maCixPsq4ml2(this);
            return null;
        }
        defpackage.be beVar3 = (defpackage.be) defpackage.q70.VFeft99leXEK(jjTN4uUnoyEn);
        long j4 = beVar3.WDYagTQQm9ns;
        if (j4 <= j) {
            return beVar3;
        }
        long j5 = j4 * defpackage.fc.giKS3J6vZuNy;
        if (!P05cfTpS5W5L.compareAndSet(this, j2 + 1, j5)) {
            maCixPsq4ml2(this);
            return null;
        }
        java.util.concurrent.atomic.AtomicLongFieldUpdater atomicLongFieldUpdater = e6mdH7fiFuta;
        if ((atomicLongFieldUpdater.addAndGet(this, j5 - j2) & 4611686018427387904L) != 0) {
            while ((atomicLongFieldUpdater.get(this) & 4611686018427387904L) != 0) {
            }
        }
        return null;
    }

    @Override // defpackage.pd
    public final java.lang.Object h3m55N1URyyK() {
        defpackage.be beVar;
        java.util.concurrent.atomic.AtomicLongFieldUpdater atomicLongFieldUpdater = QiMR8OkAhezm;
        long j = atomicLongFieldUpdater.get(this);
        long j2 = oh71FJcDz6S2.get(this);
        if (oCu53ZX2v4Ju(j2, true)) {
            return new defpackage.yd(WmetiUbpKU9I());
        }
        long j3 = j2 & 1152921504606846975L;
        defpackage.zd zdVar = defpackage.ae.giKS3J6vZuNy;
        if (j >= j3) {
            return zdVar;
        }
        java.lang.Object obj = defpackage.fc.Ns0WNyEWdPsk;
        Ns0WNyEWdPsk.getClass();
        defpackage.be beVar2 = (defpackage.be) defpackage.ed.ZpBGe2uQfcn8.getObjectVolatile(this, s0TASMVLSWD5);
        while (!this.dG7RjM6DqYVL()) {
            long andIncrement = atomicLongFieldUpdater.getAndIncrement(this);
            long j4 = defpackage.fc.giKS3J6vZuNy;
            long j5 = andIncrement / j4;
            int i = (int) (andIncrement % j4);
            if (beVar2.WDYagTQQm9ns != j5) {
                defpackage.be T1fB7bDYiVJQ2 = this.T1fB7bDYiVJQ(j5, beVar2);
                if (T1fB7bDYiVJQ2 == null) {
                    continue;
                } else {
                    beVar = T1fB7bDYiVJQ2;
                }
            } else {
                beVar = beVar2;
            }
            defpackage.dc dcVar = this;
            java.lang.Object w6IV1lieBIux = dcVar.w6IV1lieBIux(beVar, i, andIncrement, obj);
            beVar2 = beVar;
            if (w6IV1lieBIux == defpackage.fc.h3m55N1URyyK) {
                defpackage.vu1 vu1Var = obj instanceof defpackage.vu1 ? (defpackage.vu1) obj : null;
                if (vu1Var != null) {
                    vu1Var.ZpBGe2uQfcn8(beVar2, i);
                }
                dcVar.Wc0TdmRSwbbi(andIncrement);
                beVar2.h3m55N1URyyK();
                return zdVar;
            }
            if (w6IV1lieBIux != defpackage.fc.T1fB7bDYiVJQ) {
                if (w6IV1lieBIux != defpackage.fc.gUjdnLbkVAaA) {
                    beVar2.ZpBGe2uQfcn8();
                    return w6IV1lieBIux;
                }
                defpackage.h7.P05cfTpS5W5L("unexpected");
                return null;
            }
            if (andIncrement < dcVar.ZVVdXbWmyCSK()) {
                beVar2.ZpBGe2uQfcn8();
            }
            this = dcVar;
        }
        return new defpackage.yd(this.WmetiUbpKU9I());
    }

    public final boolean hH0RRJrNssvh(java.lang.Object obj, java.lang.Object obj2) {
        if (obj instanceof defpackage.d31) {
            return defpackage.fc.ZpBGe2uQfcn8(((defpackage.d31) obj).WDYagTQQm9ns, new defpackage.ae(obj2), null);
        }
        if (!(obj instanceof defpackage.ac)) {
            if (obj instanceof defpackage.bd) {
                return defpackage.fc.ZpBGe2uQfcn8((defpackage.bd) obj, obj2, null);
            }
            defpackage.h7.QiMR8OkAhezm(obj, "Unexpected receiver type: ");
            return false;
        }
        defpackage.ac acVar = (defpackage.ac) obj;
        defpackage.dd ddVar = acVar.oh71FJcDz6S2;
        ddVar.getClass();
        acVar.oh71FJcDz6S2 = null;
        acVar.WDYagTQQm9ns = obj2;
        java.lang.Boolean bool = java.lang.Boolean.TRUE;
        acVar.QiMR8OkAhezm.getClass();
        return defpackage.fc.ZpBGe2uQfcn8(ddVar, bool, null);
    }

    @Override // defpackage.pd
    public final defpackage.ac iterator() {
        return new defpackage.ac(this);
    }

    public final java.lang.Object jjTN4uUnoyEn(defpackage.kl klVar, java.lang.Object obj) {
        defpackage.dd ddVar = new defpackage.dd(1, defpackage.q70.OcTWLQzke1i2(klVar));
        ddVar.IJ0hOnjhPOri();
        ddVar.e6mdH7fiFuta(new defpackage.g51(BHfvd2J71qpO()));
        java.lang.Object w7APNrr0aGRc = ddVar.w7APNrr0aGRc();
        return w7APNrr0aGRc == defpackage.tm.WDYagTQQm9ns ? w7APNrr0aGRc : defpackage.gs1.ZpBGe2uQfcn8;
    }

    /* JADX WARN: Code restructure failed: missing block: B:84:0x00a3, code lost:
    
        r10 = (defpackage.be) r10.WDYagTQQm9ns();
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean oCu53ZX2v4Ju(long j, boolean z) {
        int i = (int) (j >> 60);
        if (i != 0 && i != 1) {
            if (i == 2) {
                GE9mJIPrb8gP(j & 1152921504606846975L);
                if (!z || !w7APNrr0aGRc()) {
                }
            } else {
                if (i != 3) {
                    throw new java.lang.IllegalStateException(defpackage.pVQOaWB9QMo4.e6mdH7fiFuta("unexpected close status: ", i).toString());
                }
                defpackage.be GE9mJIPrb8gP2 = GE9mJIPrb8gP(j & 1152921504606846975L);
                java.lang.Object obj = null;
                loop0: do {
                    int i2 = defpackage.fc.giKS3J6vZuNy - 1;
                    while (true) {
                        if (-1 >= i2) {
                            break;
                        }
                        long j2 = (GE9mJIPrb8gP2.WDYagTQQm9ns * defpackage.fc.giKS3J6vZuNy) + i2;
                        while (true) {
                            java.lang.Object XntWc4eZSQ8j2 = GE9mJIPrb8gP2.XntWc4eZSQ8j(i2);
                            if (XntWc4eZSQ8j2 == defpackage.fc.e6mdH7fiFuta) {
                                break loop0;
                            }
                            defpackage.ru ruVar = defpackage.fc.JhCgjQRTAOCT;
                            java.util.concurrent.atomic.AtomicLongFieldUpdater atomicLongFieldUpdater = QiMR8OkAhezm;
                            if (XntWc4eZSQ8j2 == ruVar) {
                                if (j2 < atomicLongFieldUpdater.get(this)) {
                                    break loop0;
                                }
                                if (GE9mJIPrb8gP2.T1fB7bDYiVJQ(i2, XntWc4eZSQ8j2, defpackage.fc.fNwYGHIYeJcR)) {
                                    GE9mJIPrb8gP2.s0TASMVLSWD5(i2, null);
                                    GE9mJIPrb8gP2.h3m55N1URyyK();
                                    break;
                                }
                            } else if (XntWc4eZSQ8j2 != defpackage.fc.WDYagTQQm9ns && XntWc4eZSQ8j2 != null) {
                                if (!(XntWc4eZSQ8j2 instanceof defpackage.vu1) && !(XntWc4eZSQ8j2 instanceof defpackage.wu1)) {
                                    defpackage.ru ruVar2 = defpackage.fc.QiMR8OkAhezm;
                                    if (XntWc4eZSQ8j2 == ruVar2 || XntWc4eZSQ8j2 == defpackage.fc.oh71FJcDz6S2) {
                                        break loop0;
                                    }
                                    if (XntWc4eZSQ8j2 != ruVar2) {
                                        break;
                                    }
                                } else {
                                    if (j2 < atomicLongFieldUpdater.get(this)) {
                                        break loop0;
                                    }
                                    defpackage.vu1 vu1Var = XntWc4eZSQ8j2 instanceof defpackage.wu1 ? ((defpackage.wu1) XntWc4eZSQ8j2).ZpBGe2uQfcn8 : (defpackage.vu1) XntWc4eZSQ8j2;
                                    if (GE9mJIPrb8gP2.T1fB7bDYiVJQ(i2, XntWc4eZSQ8j2, defpackage.fc.fNwYGHIYeJcR)) {
                                        obj = defpackage.j80.jjTN4uUnoyEn(obj, vu1Var);
                                        GE9mJIPrb8gP2.s0TASMVLSWD5(i2, null);
                                        GE9mJIPrb8gP2.h3m55N1URyyK();
                                        break;
                                    }
                                }
                            } else if (GE9mJIPrb8gP2.T1fB7bDYiVJQ(i2, XntWc4eZSQ8j2, defpackage.fc.fNwYGHIYeJcR)) {
                                GE9mJIPrb8gP2.h3m55N1URyyK();
                                break;
                            }
                        }
                        i2--;
                    }
                } while (GE9mJIPrb8gP2 != null);
                if (obj != null) {
                    if (obj instanceof java.util.ArrayList) {
                        java.util.ArrayList arrayList = (java.util.ArrayList) obj;
                        for (int size = arrayList.size() - 1; -1 < size; size--) {
                            IBvW5fLsPuHy((defpackage.vu1) arrayList.get(size), false);
                        }
                    } else {
                        IBvW5fLsPuHy((defpackage.vu1) obj, false);
                    }
                }
            }
            return true;
        }
        return false;
    }

    public final boolean oh71FJcDz6S2(long j) {
        return j < P05cfTpS5W5L.get(this) || j < QiMR8OkAhezm.get(this) + ((long) this.WDYagTQQm9ns);
    }

    /* JADX WARN: Code restructure failed: missing block: B:27:0x0063, code lost:
    
        if (r5.GE9mJIPrb8gP() == false) goto L43;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x0065, code lost:
    
        r5.P05cfTpS5W5L();
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void qjMheFZ0l9kA(long j, defpackage.be beVar) {
        defpackage.dc dcVar;
        defpackage.be beVar2;
        defpackage.be beVar3;
        while (beVar.WDYagTQQm9ns < j && (beVar3 = (defpackage.be) beVar.fWTAfUmVKrZq()) != null) {
            beVar = beVar3;
        }
        while (true) {
            defpackage.be beVar4 = beVar;
            while (beVar4.oh71FJcDz6S2() && (beVar2 = (defpackage.be) beVar4.fWTAfUmVKrZq()) != null) {
                beVar4 = beVar2;
            }
            while (true) {
                fNwYGHIYeJcR.getClass();
                sun.misc.Unsafe unsafe = defpackage.ed.ZpBGe2uQfcn8;
                long j2 = XntWc4eZSQ8j;
                defpackage.ka1 ka1Var = (defpackage.ka1) unsafe.getObjectVolatile(this, j2);
                if (ka1Var.WDYagTQQm9ns >= beVar4.WDYagTQQm9ns) {
                    return;
                }
                if (!beVar4.gUjdnLbkVAaA()) {
                    break;
                }
                while (true) {
                    sun.misc.Unsafe unsafe2 = defpackage.ed.ZpBGe2uQfcn8;
                    dcVar = this;
                    if (unsafe2.compareAndSwapObject(dcVar, XntWc4eZSQ8j, ka1Var, beVar4)) {
                        if (ka1Var.GE9mJIPrb8gP()) {
                            ka1Var.P05cfTpS5W5L();
                            return;
                        }
                        return;
                    } else if (unsafe2.getObjectVolatile(dcVar, j2) != ka1Var) {
                        break;
                    } else {
                        this = dcVar;
                    }
                }
                this = dcVar;
            }
            beVar = beVar4;
        }
    }

    public final java.lang.Throwable s0TASMVLSWD5() {
        java.lang.Throwable WmetiUbpKU9I2 = WmetiUbpKU9I();
        return WmetiUbpKU9I2 == null ? new defpackage.cf("Channel was closed") : WmetiUbpKU9I2;
    }

    /* JADX WARN: Code restructure failed: missing block: B:95:0x01a7, code lost:
    
        r15 = r8;
        r3 = (defpackage.be) r3.fWTAfUmVKrZq();
     */
    /* JADX WARN: Code restructure failed: missing block: B:96:0x01af, code lost:
    
        if (r3 != null) goto L84;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.String toString() {
        int i;
        java.lang.String str;
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        int i2 = (int) (oh71FJcDz6S2.get(this) >> 60);
        if (i2 == 2) {
            sb.append("closed,");
        } else if (i2 == 3) {
            sb.append("cancelled,");
        }
        sb.append("capacity=" + this.WDYagTQQm9ns + ',');
        sb.append("data=[");
        Ns0WNyEWdPsk.getClass();
        sun.misc.Unsafe unsafe = defpackage.ed.ZpBGe2uQfcn8;
        int i3 = 0;
        GE9mJIPrb8gP.getClass();
        java.lang.Object objectVolatile = unsafe.getObjectVolatile(this, BHfvd2J71qpO);
        int i4 = 1;
        fNwYGHIYeJcR.getClass();
        java.util.List oCu53ZX2v4Ju = defpackage.ma0.oCu53ZX2v4Ju(unsafe.getObjectVolatile(this, s0TASMVLSWD5), objectVolatile, unsafe.getObjectVolatile(this, XntWc4eZSQ8j));
        java.util.ArrayList arrayList = new java.util.ArrayList();
        for (java.lang.Object obj : oCu53ZX2v4Ju) {
            if (((defpackage.be) obj) != defpackage.fc.ZpBGe2uQfcn8) {
                arrayList.add(obj);
            }
        }
        java.util.Iterator it = arrayList.iterator();
        if (!it.hasNext()) {
            defpackage.h7.BHfvd2J71qpO();
            return null;
        }
        java.lang.Object next = it.next();
        if (it.hasNext()) {
            long j = ((defpackage.be) next).WDYagTQQm9ns;
            do {
                java.lang.Object next2 = it.next();
                long j2 = ((defpackage.be) next2).WDYagTQQm9ns;
                if (j > j2) {
                    next = next2;
                    j = j2;
                }
            } while (it.hasNext());
        }
        defpackage.be beVar = (defpackage.be) next;
        long j3 = QiMR8OkAhezm.get(this);
        long ZVVdXbWmyCSK = ZVVdXbWmyCSK();
        loop2: while (true) {
            int i5 = defpackage.fc.giKS3J6vZuNy;
            int i6 = i3;
            while (true) {
                if (i6 >= i5) {
                    break;
                }
                i = i4;
                long j4 = (beVar.WDYagTQQm9ns * defpackage.fc.giKS3J6vZuNy) + i6;
                if (j4 >= ZVVdXbWmyCSK && j4 >= j3) {
                    break loop2;
                }
                java.lang.Object XntWc4eZSQ8j2 = beVar.XntWc4eZSQ8j(i6);
                java.lang.Object obj2 = beVar.P05cfTpS5W5L.get(i6 * 2);
                if (XntWc4eZSQ8j2 instanceof defpackage.bd) {
                    str = (j4 >= j3 || j4 < ZVVdXbWmyCSK) ? (j4 >= ZVVdXbWmyCSK || j4 < j3) ? "cont" : "send" : "receive";
                } else if (XntWc4eZSQ8j2 instanceof defpackage.d31) {
                    str = "receiveCatching";
                } else if (XntWc4eZSQ8j2 instanceof defpackage.wu1) {
                    str = "EB(" + XntWc4eZSQ8j2 + ')';
                } else if (defpackage.ma0.QiMR8OkAhezm(XntWc4eZSQ8j2, defpackage.fc.oh71FJcDz6S2) || defpackage.ma0.QiMR8OkAhezm(XntWc4eZSQ8j2, defpackage.fc.QiMR8OkAhezm)) {
                    str = "resuming_sender";
                } else {
                    if (XntWc4eZSQ8j2 != null && !XntWc4eZSQ8j2.equals(defpackage.fc.WDYagTQQm9ns) && !XntWc4eZSQ8j2.equals(defpackage.fc.e6mdH7fiFuta) && !XntWc4eZSQ8j2.equals(defpackage.fc.P05cfTpS5W5L) && !XntWc4eZSQ8j2.equals(defpackage.fc.Ns0WNyEWdPsk) && !XntWc4eZSQ8j2.equals(defpackage.fc.GE9mJIPrb8gP) && !XntWc4eZSQ8j2.equals(defpackage.fc.fNwYGHIYeJcR)) {
                        str = XntWc4eZSQ8j2.toString();
                    }
                    i6++;
                    i4 = i;
                }
                if (obj2 != null) {
                    sb.append("(" + str + ',' + obj2 + "),");
                } else {
                    sb.append(str + ',');
                }
                i6++;
                i4 = i;
            }
            i4 = i;
            i3 = 0;
        }
        if (sb.length() == 0) {
            throw new java.util.NoSuchElementException("Char sequence is empty.");
        }
        if (sb.charAt(sb.length() - i) == ',') {
            sb.deleteCharAt(sb.length() - i).getClass();
        }
        sb.append("]");
        return sb.toString();
    }

    public final java.lang.Object w6IV1lieBIux(defpackage.be beVar, int i, long j, java.lang.Object obj) {
        java.lang.Object XntWc4eZSQ8j2 = beVar.XntWc4eZSQ8j(i);
        java.util.concurrent.atomic.AtomicReferenceArray atomicReferenceArray = beVar.P05cfTpS5W5L;
        java.util.concurrent.atomic.AtomicLongFieldUpdater atomicLongFieldUpdater = oh71FJcDz6S2;
        if (XntWc4eZSQ8j2 == null) {
            if (j >= (atomicLongFieldUpdater.get(this) & 1152921504606846975L)) {
                if (obj == null) {
                    return defpackage.fc.gUjdnLbkVAaA;
                }
                if (beVar.T1fB7bDYiVJQ(i, XntWc4eZSQ8j2, obj)) {
                    fNwYGHIYeJcR();
                    return defpackage.fc.h3m55N1URyyK;
                }
            }
        } else if (XntWc4eZSQ8j2 == defpackage.fc.JhCgjQRTAOCT && beVar.T1fB7bDYiVJQ(i, XntWc4eZSQ8j2, defpackage.fc.e6mdH7fiFuta)) {
            fNwYGHIYeJcR();
            java.lang.Object obj2 = atomicReferenceArray.get(i * 2);
            beVar.s0TASMVLSWD5(i, null);
            return obj2;
        }
        while (true) {
            java.lang.Object XntWc4eZSQ8j3 = beVar.XntWc4eZSQ8j(i);
            if (XntWc4eZSQ8j3 == null || XntWc4eZSQ8j3 == defpackage.fc.WDYagTQQm9ns) {
                if (j < (atomicLongFieldUpdater.get(this) & 1152921504606846975L)) {
                    if (beVar.T1fB7bDYiVJQ(i, XntWc4eZSQ8j3, defpackage.fc.P05cfTpS5W5L)) {
                        fNwYGHIYeJcR();
                        return defpackage.fc.T1fB7bDYiVJQ;
                    }
                } else {
                    if (obj == null) {
                        return defpackage.fc.gUjdnLbkVAaA;
                    }
                    if (beVar.T1fB7bDYiVJQ(i, XntWc4eZSQ8j3, obj)) {
                        fNwYGHIYeJcR();
                        return defpackage.fc.h3m55N1URyyK;
                    }
                }
            } else if (XntWc4eZSQ8j3 != defpackage.fc.JhCgjQRTAOCT) {
                defpackage.ru ruVar = defpackage.fc.GE9mJIPrb8gP;
                if (XntWc4eZSQ8j3 == ruVar) {
                    return defpackage.fc.T1fB7bDYiVJQ;
                }
                if (XntWc4eZSQ8j3 == defpackage.fc.P05cfTpS5W5L) {
                    return defpackage.fc.T1fB7bDYiVJQ;
                }
                if (XntWc4eZSQ8j3 == defpackage.fc.fNwYGHIYeJcR) {
                    fNwYGHIYeJcR();
                    return defpackage.fc.T1fB7bDYiVJQ;
                }
                if (XntWc4eZSQ8j3 != defpackage.fc.QiMR8OkAhezm && beVar.T1fB7bDYiVJQ(i, XntWc4eZSQ8j3, defpackage.fc.oh71FJcDz6S2)) {
                    boolean z = XntWc4eZSQ8j3 instanceof defpackage.wu1;
                    if (z) {
                        XntWc4eZSQ8j3 = ((defpackage.wu1) XntWc4eZSQ8j3).ZpBGe2uQfcn8;
                    }
                    if (GcLuU6pT9wO9(XntWc4eZSQ8j3)) {
                        beVar.BHfvd2J71qpO(i, defpackage.fc.e6mdH7fiFuta);
                        fNwYGHIYeJcR();
                        java.lang.Object obj3 = atomicReferenceArray.get(i * 2);
                        beVar.s0TASMVLSWD5(i, null);
                        return obj3;
                    }
                    beVar.BHfvd2J71qpO(i, ruVar);
                    beVar.h3m55N1URyyK();
                    if (z) {
                        fNwYGHIYeJcR();
                    }
                    return defpackage.fc.T1fB7bDYiVJQ;
                }
            } else if (beVar.T1fB7bDYiVJQ(i, XntWc4eZSQ8j3, defpackage.fc.e6mdH7fiFuta)) {
                fNwYGHIYeJcR();
                java.lang.Object obj4 = atomicReferenceArray.get(i * 2);
                beVar.s0TASMVLSWD5(i, null);
                return obj4;
            }
        }
    }

    public final boolean w7APNrr0aGRc() {
        while (true) {
            Ns0WNyEWdPsk.getClass();
            sun.misc.Unsafe unsafe = defpackage.ed.ZpBGe2uQfcn8;
            long j = s0TASMVLSWD5;
            defpackage.be beVar = (defpackage.be) unsafe.getObjectVolatile(this, j);
            java.util.concurrent.atomic.AtomicLongFieldUpdater atomicLongFieldUpdater = QiMR8OkAhezm;
            long j2 = atomicLongFieldUpdater.get(this);
            if (ZVVdXbWmyCSK() <= j2) {
                return false;
            }
            long j3 = defpackage.fc.giKS3J6vZuNy;
            long j4 = j2 / j3;
            if (beVar.WDYagTQQm9ns == j4 || (beVar = T1fB7bDYiVJQ(j4, beVar)) != null) {
                beVar.ZpBGe2uQfcn8();
                int i = (int) (j2 % j3);
                while (true) {
                    java.lang.Object XntWc4eZSQ8j2 = beVar.XntWc4eZSQ8j(i);
                    if (XntWc4eZSQ8j2 == null || XntWc4eZSQ8j2 == defpackage.fc.WDYagTQQm9ns) {
                        if (beVar.T1fB7bDYiVJQ(i, XntWc4eZSQ8j2, defpackage.fc.P05cfTpS5W5L)) {
                            fNwYGHIYeJcR();
                            break;
                        }
                    } else {
                        if (XntWc4eZSQ8j2 == defpackage.fc.JhCgjQRTAOCT) {
                            return true;
                        }
                        if (XntWc4eZSQ8j2 != defpackage.fc.GE9mJIPrb8gP && XntWc4eZSQ8j2 != defpackage.fc.fNwYGHIYeJcR && XntWc4eZSQ8j2 != defpackage.fc.e6mdH7fiFuta && XntWc4eZSQ8j2 != defpackage.fc.P05cfTpS5W5L) {
                            if (XntWc4eZSQ8j2 == defpackage.fc.QiMR8OkAhezm) {
                                return true;
                            }
                            if (XntWc4eZSQ8j2 != defpackage.fc.oh71FJcDz6S2 && j2 == atomicLongFieldUpdater.get(this)) {
                                return true;
                            }
                        }
                    }
                }
                QiMR8OkAhezm.compareAndSet(this, j2, j2 + 1);
            } else if (((defpackage.be) unsafe.getObjectVolatile(this, j)).WDYagTQQm9ns < j4) {
                return false;
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:45:0x00ae, code lost:
    
        return r1;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object xahdJg25P1Bv(java.lang.Object obj) {
        defpackage.be beVar;
        int i;
        defpackage.dc dcVar;
        defpackage.pu puVar = defpackage.fc.JhCgjQRTAOCT;
        GE9mJIPrb8gP.getClass();
        defpackage.be beVar2 = (defpackage.be) defpackage.ed.ZpBGe2uQfcn8.getObjectVolatile(this, BHfvd2J71qpO);
        while (true) {
            long andIncrement = oh71FJcDz6S2.getAndIncrement(this);
            long j = andIncrement & 1152921504606846975L;
            boolean oCu53ZX2v4Ju = this.oCu53ZX2v4Ju(andIncrement, false);
            int i2 = defpackage.fc.giKS3J6vZuNy;
            long j2 = i2;
            long j3 = j / j2;
            int i3 = (int) (j % j2);
            if (beVar2.WDYagTQQm9ns != j3) {
                beVar = this.XntWc4eZSQ8j(j3, beVar2);
                if (beVar != null) {
                    dcVar = this;
                    i = i3;
                } else if (oCu53ZX2v4Ju) {
                    return new defpackage.yd(this.BHfvd2J71qpO());
                }
            } else {
                beVar = beVar2;
                i = i3;
                dcVar = this;
            }
            java.lang.Object obj2 = obj;
            int WDYagTQQm9ns = WDYagTQQm9ns(dcVar, beVar, i, obj2, j, puVar, oCu53ZX2v4Ju);
            defpackage.dc dcVar2 = dcVar;
            beVar2 = beVar;
            defpackage.gs1 gs1Var = defpackage.gs1.ZpBGe2uQfcn8;
            if (WDYagTQQm9ns == 0) {
                beVar2.ZpBGe2uQfcn8();
                return gs1Var;
            }
            if (WDYagTQQm9ns == 1) {
                break;
            }
            if (WDYagTQQm9ns != 2) {
                if (WDYagTQQm9ns == 3) {
                    defpackage.h7.P05cfTpS5W5L("unexpected");
                    return null;
                }
                if (WDYagTQQm9ns == 4) {
                    if (j < QiMR8OkAhezm.get(dcVar2)) {
                        beVar2.ZpBGe2uQfcn8();
                    }
                    return new defpackage.yd(dcVar2.BHfvd2J71qpO());
                }
                if (WDYagTQQm9ns == 5) {
                    beVar2.ZpBGe2uQfcn8();
                }
                this = dcVar2;
                obj = obj2;
            } else {
                if (oCu53ZX2v4Ju) {
                    beVar2.h3m55N1URyyK();
                    return new defpackage.yd(dcVar2.BHfvd2J71qpO());
                }
                defpackage.vu1 vu1Var = puVar instanceof defpackage.vu1 ? (defpackage.vu1) puVar : null;
                if (vu1Var != null) {
                    vu1Var.ZpBGe2uQfcn8(beVar2, i + i2);
                }
                dcVar2.Ns0WNyEWdPsk((beVar2.WDYagTQQm9ns * j2) + i);
            }
        }
    }

    public final int zJPqDeoF0Os1(defpackage.be beVar, int i, java.lang.Object obj, long j, java.lang.Object obj2, boolean z) {
        while (true) {
            java.lang.Object XntWc4eZSQ8j2 = beVar.XntWc4eZSQ8j(i);
            if (XntWc4eZSQ8j2 == null) {
                if (!oh71FJcDz6S2(j) || z) {
                    if (z) {
                        if (beVar.T1fB7bDYiVJQ(i, null, defpackage.fc.GE9mJIPrb8gP)) {
                            beVar.h3m55N1URyyK();
                            return 4;
                        }
                    } else {
                        if (obj2 == null) {
                            return 3;
                        }
                        if (beVar.T1fB7bDYiVJQ(i, null, obj2)) {
                            return 2;
                        }
                    }
                } else if (beVar.T1fB7bDYiVJQ(i, null, defpackage.fc.JhCgjQRTAOCT)) {
                    break;
                }
            } else {
                if (XntWc4eZSQ8j2 != defpackage.fc.WDYagTQQm9ns) {
                    defpackage.ru ruVar = defpackage.fc.Ns0WNyEWdPsk;
                    if (XntWc4eZSQ8j2 == ruVar) {
                        beVar.s0TASMVLSWD5(i, null);
                        return 5;
                    }
                    if (XntWc4eZSQ8j2 == defpackage.fc.P05cfTpS5W5L) {
                        beVar.s0TASMVLSWD5(i, null);
                        return 5;
                    }
                    if (XntWc4eZSQ8j2 == defpackage.fc.fNwYGHIYeJcR) {
                        beVar.s0TASMVLSWD5(i, null);
                        OcTWLQzke1i2();
                        return 4;
                    }
                    beVar.s0TASMVLSWD5(i, null);
                    if (XntWc4eZSQ8j2 instanceof defpackage.wu1) {
                        XntWc4eZSQ8j2 = ((defpackage.wu1) XntWc4eZSQ8j2).ZpBGe2uQfcn8;
                    }
                    if (hH0RRJrNssvh(XntWc4eZSQ8j2, obj)) {
                        beVar.BHfvd2J71qpO(i, defpackage.fc.e6mdH7fiFuta);
                        return 0;
                    }
                    if (beVar.P05cfTpS5W5L.getAndSet((i * 2) + 1, ruVar) != ruVar) {
                        beVar.WmetiUbpKU9I(i, true);
                    }
                    return 5;
                }
                if (beVar.T1fB7bDYiVJQ(i, XntWc4eZSQ8j2, defpackage.fc.JhCgjQRTAOCT)) {
                    break;
                }
            }
        }
        return 1;
    }
}
