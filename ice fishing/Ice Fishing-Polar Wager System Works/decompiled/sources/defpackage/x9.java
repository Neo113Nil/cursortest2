package defpackage;

/* loaded from: classes.dex */
public class x9 implements defpackage.sb {
    public static final /* synthetic */ java.util.concurrent.atomic.AtomicReferenceFieldUpdater DFo87pBq1E5;
    public static final /* synthetic */ long EgCjBq0SZwJ;
    public static final /* synthetic */ long G3OKOH3wZRC;
    public static final /* synthetic */ java.util.concurrent.atomic.AtomicReferenceFieldUpdater JlrlGoKF;
    public static final /* synthetic */ long QoRHpC4k;
    public static final /* synthetic */ java.util.concurrent.atomic.AtomicReferenceFieldUpdater SyNS6RMn;
    public static final /* synthetic */ long cnag84Bm;
    public static final /* synthetic */ java.util.concurrent.atomic.AtomicReferenceFieldUpdater ez2rX8ReCYw;
    public static final /* synthetic */ long kd6TUFXn;
    private volatile /* synthetic */ java.lang.Object _closeCause$volatile;
    public final int adDC3e2L;
    private volatile /* synthetic */ long bufferEnd$volatile;
    private volatile /* synthetic */ java.lang.Object bufferEndSegment$volatile;
    private volatile /* synthetic */ java.lang.Object closeHandler$volatile;
    private volatile /* synthetic */ long completedExpandBuffersAndPauseFlag$volatile;
    private volatile /* synthetic */ java.lang.Object receiveSegment$volatile;
    private volatile /* synthetic */ long receivers$volatile;
    private volatile /* synthetic */ java.lang.Object sendSegment$volatile;
    private volatile /* synthetic */ long sendersAndCloseStatus$volatile;
    public static final /* synthetic */ java.util.concurrent.atomic.AtomicLongFieldUpdater xiZrDbcSW0 = java.util.concurrent.atomic.AtomicLongFieldUpdater.newUpdater(defpackage.x9.class, "sendersAndCloseStatus$volatile");
    public static final /* synthetic */ java.util.concurrent.atomic.AtomicLongFieldUpdater AARZUJiTa = java.util.concurrent.atomic.AtomicLongFieldUpdater.newUpdater(defpackage.x9.class, "receivers$volatile");
    public static final /* synthetic */ java.util.concurrent.atomic.AtomicLongFieldUpdater EXtogiMhuM = java.util.concurrent.atomic.AtomicLongFieldUpdater.newUpdater(defpackage.x9.class, "bufferEnd$volatile");
    public static final /* synthetic */ java.util.concurrent.atomic.AtomicLongFieldUpdater riuEU0zW4 = java.util.concurrent.atomic.AtomicLongFieldUpdater.newUpdater(defpackage.x9.class, "completedExpandBuffersAndPauseFlag$volatile");
    public static final /* synthetic */ java.util.concurrent.atomic.AtomicReferenceFieldUpdater SH1y5HwkJhh = java.util.concurrent.atomic.AtomicReferenceFieldUpdater.newUpdater(defpackage.x9.class, java.lang.Object.class, "sendSegment$volatile");

    static {
        sun.misc.Unsafe unsafe = defpackage.cb.IHQe1A4L2xu;
        EgCjBq0SZwJ = unsafe.objectFieldOffset(defpackage.x9.class.getDeclaredField("sendSegment$volatile"));
        ez2rX8ReCYw = java.util.concurrent.atomic.AtomicReferenceFieldUpdater.newUpdater(defpackage.x9.class, java.lang.Object.class, "receiveSegment$volatile");
        kd6TUFXn = unsafe.objectFieldOffset(defpackage.x9.class.getDeclaredField("receiveSegment$volatile"));
        JlrlGoKF = java.util.concurrent.atomic.AtomicReferenceFieldUpdater.newUpdater(defpackage.x9.class, java.lang.Object.class, "bufferEndSegment$volatile");
        QoRHpC4k = unsafe.objectFieldOffset(defpackage.x9.class.getDeclaredField("bufferEndSegment$volatile"));
        DFo87pBq1E5 = java.util.concurrent.atomic.AtomicReferenceFieldUpdater.newUpdater(defpackage.x9.class, java.lang.Object.class, "_closeCause$volatile");
        cnag84Bm = unsafe.objectFieldOffset(defpackage.x9.class.getDeclaredField("_closeCause$volatile"));
        SyNS6RMn = java.util.concurrent.atomic.AtomicReferenceFieldUpdater.newUpdater(defpackage.x9.class, java.lang.Object.class, "closeHandler$volatile");
        G3OKOH3wZRC = unsafe.objectFieldOffset(defpackage.x9.class.getDeclaredField("closeHandler$volatile"));
    }

    public x9(int i) {
        this.adDC3e2L = i;
        if (i < 0) {
            defpackage.db.adDC3e2L(defpackage.fx0.riuEU0zW4(i, "Invalid channel capacity: ", ", should be >=0"));
            throw null;
        }
        defpackage.ec ecVar = defpackage.z9.IHQe1A4L2xu;
        this.bufferEnd$volatile = i != 0 ? i != Integer.MAX_VALUE ? i : Long.MAX_VALUE : 0L;
        this.completedExpandBuffersAndPauseFlag$volatile = EXtogiMhuM.get(this);
        defpackage.ec ecVar2 = new defpackage.ec(0L, null, this, 3);
        this.sendSegment$volatile = ecVar2;
        this.receiveSegment$volatile = ecVar2;
        if (nBH8hAHy()) {
            ecVar2 = defpackage.z9.IHQe1A4L2xu;
            ecVar2.getClass();
        }
        this.bufferEndSegment$volatile = ecVar2;
        this._closeCause$volatile = defpackage.z9.EgCjBq0SZwJ;
    }

    public static void PAEGRtP0bX(defpackage.x9 x9Var) {
        java.util.concurrent.atomic.AtomicLongFieldUpdater atomicLongFieldUpdater = riuEU0zW4;
        if ((atomicLongFieldUpdater.addAndGet(x9Var, 1L) & 4611686018427387904L) != 0) {
            while ((atomicLongFieldUpdater.get(x9Var) & 4611686018427387904L) != 0) {
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0032  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static java.lang.Object SiPhmbmu(defpackage.x9 x9Var, defpackage.fj fjVar) {
        defpackage.v9 v9Var;
        int i;
        defpackage.ec ecVar;
        if (fjVar instanceof defpackage.v9) {
            v9Var = (defpackage.v9) fjVar;
            int i2 = v9Var.SH1y5HwkJhh;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                v9Var.SH1y5HwkJhh = i2 - Integer.MIN_VALUE;
                defpackage.v9 v9Var2 = v9Var;
                java.lang.Object obj = v9Var2.EXtogiMhuM;
                i = v9Var2.SH1y5HwkJhh;
                if (i == 0) {
                    if (i == 1) {
                        defpackage.f70.nBH8hAHy(obj);
                        return ((defpackage.dc) obj).IHQe1A4L2xu;
                    }
                    defpackage.db.AARZUJiTa("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                defpackage.f70.nBH8hAHy(obj);
                ez2rX8ReCYw.getClass();
                defpackage.ec ecVar2 = (defpackage.ec) defpackage.cb.IHQe1A4L2xu.getObjectVolatile(x9Var, kd6TUFXn);
                while (!x9Var.QQUzIjv3iOC5()) {
                    long andIncrement = AARZUJiTa.getAndIncrement(x9Var);
                    long j = defpackage.z9.oh6vYeIP;
                    long j2 = andIncrement / j;
                    int i3 = (int) (andIncrement % j);
                    if (ecVar2.adDC3e2L != j2) {
                        defpackage.ec QoRHpC4k2 = x9Var.QoRHpC4k(j2, ecVar2);
                        if (QoRHpC4k2 == null) {
                            continue;
                        } else {
                            ecVar = QoRHpC4k2;
                        }
                    } else {
                        ecVar = ecVar2;
                    }
                    defpackage.x9 x9Var2 = x9Var;
                    java.lang.Object Uv8CGu3G = x9Var2.Uv8CGu3G(ecVar, i3, andIncrement, null);
                    if (Uv8CGu3G == defpackage.z9.DFo87pBq1E5) {
                        defpackage.db.AARZUJiTa("unexpected");
                        return null;
                    }
                    if (Uv8CGu3G != defpackage.z9.cnag84Bm) {
                        if (Uv8CGu3G != defpackage.z9.SyNS6RMn) {
                            ecVar.IHQe1A4L2xu();
                            return Uv8CGu3G;
                        }
                        v9Var2.SH1y5HwkJhh = 1;
                        java.lang.Object p4kuH6PDtgom = x9Var2.p4kuH6PDtgom(ecVar, i3, andIncrement, v9Var2);
                        defpackage.vj vjVar = defpackage.vj.adDC3e2L;
                        return p4kuH6PDtgom == vjVar ? vjVar : p4kuH6PDtgom;
                    }
                    if (andIncrement < x9Var2.kNAkVymC()) {
                        ecVar.IHQe1A4L2xu();
                    }
                    x9Var = x9Var2;
                    ecVar2 = ecVar;
                }
                return new defpackage.bc(x9Var.kd6TUFXn());
            }
        }
        v9Var = new defpackage.v9(x9Var, fjVar);
        defpackage.v9 v9Var22 = v9Var;
        java.lang.Object obj2 = v9Var22.EXtogiMhuM;
        i = v9Var22.SH1y5HwkJhh;
        if (i == 0) {
        }
    }

    public static java.lang.Object frpfPPIgqM9O(defpackage.x9 x9Var, defpackage.ce1 ce1Var) {
        defpackage.ec ecVar;
        java.lang.Throwable th;
        defpackage.ec ecVar2;
        java.util.concurrent.atomic.AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = ez2rX8ReCYw;
        atomicReferenceFieldUpdater.getClass();
        if (x9Var == null) {
            defpackage.db.kd6TUFXn();
            return null;
        }
        defpackage.ec ecVar3 = (defpackage.ec) defpackage.cb.IHQe1A4L2xu.getObjectVolatile(x9Var, kd6TUFXn);
        while (!x9Var.QQUzIjv3iOC5()) {
            java.util.concurrent.atomic.AtomicLongFieldUpdater atomicLongFieldUpdater = AARZUJiTa;
            long andIncrement = atomicLongFieldUpdater.getAndIncrement(x9Var);
            long j = defpackage.z9.oh6vYeIP;
            long j2 = andIncrement / j;
            int i = (int) (andIncrement % j);
            if (ecVar3.adDC3e2L != j2) {
                defpackage.ec QoRHpC4k2 = x9Var.QoRHpC4k(j2, ecVar3);
                if (QoRHpC4k2 == null) {
                    continue;
                } else {
                    ecVar = QoRHpC4k2;
                }
            } else {
                ecVar = ecVar3;
            }
            defpackage.x9 x9Var2 = x9Var;
            java.lang.Object Uv8CGu3G = x9Var2.Uv8CGu3G(ecVar, i, andIncrement, null);
            defpackage.et etVar = defpackage.z9.DFo87pBq1E5;
            if (Uv8CGu3G == etVar) {
                defpackage.db.AARZUJiTa("unexpected");
                return null;
            }
            defpackage.et etVar2 = defpackage.z9.cnag84Bm;
            if (Uv8CGu3G == etVar2) {
                if (andIncrement < x9Var2.kNAkVymC()) {
                    ecVar.IHQe1A4L2xu();
                }
                x9Var = x9Var2;
                ecVar3 = ecVar;
            } else {
                if (Uv8CGu3G != defpackage.z9.SyNS6RMn) {
                    ecVar.IHQe1A4L2xu();
                    return Uv8CGu3G;
                }
                defpackage.bb nBH8hAHy = defpackage.ci0.nBH8hAHy(defpackage.c80.V7bD7b8KA(ce1Var));
                try {
                    java.lang.Object Uv8CGu3G2 = x9Var2.Uv8CGu3G(ecVar, i, andIncrement, nBH8hAHy);
                    if (Uv8CGu3G2 == etVar) {
                        nBH8hAHy.IHQe1A4L2xu(ecVar, i);
                    } else {
                        if (Uv8CGu3G2 == etVar2) {
                            if (andIncrement < x9Var2.kNAkVymC()) {
                                ecVar.IHQe1A4L2xu();
                            }
                            defpackage.ec ecVar4 = (defpackage.ec) atomicReferenceFieldUpdater.get(x9Var2);
                            while (true) {
                                if (x9Var2.QQUzIjv3iOC5()) {
                                    nBH8hAHy.SH1y5HwkJhh(new defpackage.p11(x9Var2.EgCjBq0SZwJ()));
                                    break;
                                }
                                defpackage.bb bbVar = nBH8hAHy;
                                try {
                                    long andIncrement2 = atomicLongFieldUpdater.getAndIncrement(x9Var2);
                                    long j3 = defpackage.z9.oh6vYeIP;
                                    long j4 = andIncrement2 / j3;
                                    int i2 = (int) (andIncrement2 % j3);
                                    if (ecVar4.adDC3e2L != j4) {
                                        try {
                                            defpackage.ec QoRHpC4k3 = x9Var2.QoRHpC4k(j4, ecVar4);
                                            if (QoRHpC4k3 == null) {
                                                nBH8hAHy = bbVar;
                                            } else {
                                                ecVar2 = QoRHpC4k3;
                                            }
                                        } catch (java.lang.Throwable th2) {
                                            th = th2;
                                            nBH8hAHy = bbVar;
                                            nBH8hAHy.D2vUnMij();
                                            throw th;
                                        }
                                    } else {
                                        ecVar2 = ecVar4;
                                    }
                                    defpackage.x9 x9Var3 = x9Var2;
                                    Uv8CGu3G2 = x9Var3.Uv8CGu3G(ecVar2, i2, andIncrement2, bbVar);
                                    x9Var2 = x9Var3;
                                    defpackage.ec ecVar5 = ecVar2;
                                    nBH8hAHy = bbVar;
                                    if (Uv8CGu3G2 == defpackage.z9.DFo87pBq1E5) {
                                        nBH8hAHy.IHQe1A4L2xu(ecVar5, i2);
                                        break;
                                    }
                                    if (Uv8CGu3G2 == defpackage.z9.cnag84Bm) {
                                        if (andIncrement2 < x9Var2.kNAkVymC()) {
                                            ecVar5.IHQe1A4L2xu();
                                        }
                                        ecVar4 = ecVar5;
                                    } else {
                                        if (Uv8CGu3G2 == defpackage.z9.SyNS6RMn) {
                                            throw new java.lang.IllegalStateException("unexpected");
                                        }
                                        ecVar5.IHQe1A4L2xu();
                                    }
                                } catch (java.lang.Throwable th3) {
                                    th = th3;
                                    nBH8hAHy = bbVar;
                                    th = th;
                                    nBH8hAHy.D2vUnMij();
                                    throw th;
                                }
                            }
                        } else {
                            ecVar.IHQe1A4L2xu();
                        }
                        nBH8hAHy.DFo87pBq1E5(Uv8CGu3G2, null);
                    }
                    return nBH8hAHy.kNAkVymC();
                } catch (java.lang.Throwable th4) {
                    th = th4;
                }
            }
        }
        java.lang.Throwable EgCjBq0SZwJ2 = x9Var.EgCjBq0SZwJ();
        int i3 = defpackage.wb1.IHQe1A4L2xu;
        throw EgCjBq0SZwJ2;
    }

    public static boolean mAr5m2L7gYDP(java.lang.Object obj) {
        if (obj instanceof defpackage.ab) {
            return defpackage.z9.IHQe1A4L2xu((defpackage.ab) obj, defpackage.ok1.IHQe1A4L2xu, null);
        }
        defpackage.db.xiZrDbcSW0(obj, "Unexpected waiter: ");
        return false;
    }

    public static final void oh6vYeIP(defpackage.x9 x9Var, java.lang.Object obj, defpackage.bb bbVar) {
        bbVar.SH1y5HwkJhh(new defpackage.p11(x9Var.fnWB2E7cs()));
    }

    public static final int r1MBDhnF(defpackage.x9 x9Var, defpackage.ec ecVar, int i, java.lang.Object obj, long j, java.lang.Object obj2, boolean z) {
        ecVar.kd6TUFXn(i, obj);
        if (z) {
            return x9Var.lpprD5VAS(ecVar, i, obj, j, obj2, z);
        }
        java.lang.Object QoRHpC4k2 = ecVar.QoRHpC4k(i);
        if (QoRHpC4k2 == null) {
            if (x9Var.xiZrDbcSW0(j)) {
                if (ecVar.cnag84Bm(i, null, defpackage.z9.F7NU4MC0GW)) {
                    return 1;
                }
            } else {
                if (obj2 == null) {
                    return 3;
                }
                if (ecVar.cnag84Bm(i, null, obj2)) {
                    return 2;
                }
            }
        } else if (QoRHpC4k2 instanceof defpackage.fn1) {
            ecVar.kd6TUFXn(i, null);
            if (x9Var.XZx205DYe(QoRHpC4k2, obj)) {
                ecVar.EgCjBq0SZwJ(i, defpackage.z9.riuEU0zW4);
                return 0;
            }
            defpackage.et etVar = defpackage.z9.ez2rX8ReCYw;
            if (ecVar.EXtogiMhuM.getAndSet((i * 2) + 1, etVar) == etVar) {
                return 5;
            }
            ecVar.G3OKOH3wZRC(i, true);
            return 5;
        }
        return x9Var.lpprD5VAS(ecVar, i, obj, j, obj2, z);
    }

    /* JADX WARN: Removed duplicated region for block: B:73:0x0155  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x0158 A[RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static java.lang.Object wll2JLbTBC2(defpackage.x9 x9Var, java.lang.Object obj, defpackage.ej ejVar) {
        defpackage.ok1 ok1Var;
        defpackage.vj vjVar;
        java.lang.Object kNAkVymC;
        defpackage.vj vjVar2;
        java.util.concurrent.atomic.AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = SH1y5HwkJhh;
        atomicReferenceFieldUpdater.getClass();
        defpackage.ec ecVar = (defpackage.ec) defpackage.cb.IHQe1A4L2xu.getObjectVolatile(x9Var, EgCjBq0SZwJ);
        while (true) {
            java.util.concurrent.atomic.AtomicLongFieldUpdater atomicLongFieldUpdater = xiZrDbcSW0;
            long andIncrement = atomicLongFieldUpdater.getAndIncrement(x9Var);
            long j = andIncrement & 1152921504606846975L;
            boolean NHJTzaLwkd = x9Var.NHJTzaLwkd(andIncrement, false);
            int i = defpackage.z9.oh6vYeIP;
            long j2 = i;
            long j3 = j / j2;
            int i2 = (int) (j % j2);
            long j4 = ecVar.adDC3e2L;
            defpackage.vj vjVar3 = defpackage.vj.adDC3e2L;
            ok1Var = defpackage.ok1.IHQe1A4L2xu;
            if (j4 != j3) {
                defpackage.ec G3OKOH3wZRC2 = x9Var.G3OKOH3wZRC(j3, ecVar);
                if (G3OKOH3wZRC2 != null) {
                    ecVar = G3OKOH3wZRC2;
                } else if (NHJTzaLwkd) {
                    java.lang.Object D2vUnMij = x9Var.D2vUnMij(ejVar, obj);
                    if (D2vUnMij == vjVar3) {
                        return D2vUnMij;
                    }
                }
            }
            int r1MBDhnF = r1MBDhnF(x9Var, ecVar, i2, obj, j, null, NHJTzaLwkd);
            if (r1MBDhnF == 0) {
                ecVar.IHQe1A4L2xu();
                return ok1Var;
            }
            if (r1MBDhnF == 1) {
                break;
            }
            if (r1MBDhnF != 2) {
                java.util.concurrent.atomic.AtomicLongFieldUpdater atomicLongFieldUpdater2 = AARZUJiTa;
                if (r1MBDhnF == 3) {
                    defpackage.bb nBH8hAHy = defpackage.ci0.nBH8hAHy(defpackage.c80.V7bD7b8KA(ejVar));
                    try {
                        int r1MBDhnF2 = r1MBDhnF(x9Var, ecVar, i2, obj, j, nBH8hAHy, false);
                        if (r1MBDhnF2 != 0) {
                            if (r1MBDhnF2 == 1) {
                                vjVar = vjVar3;
                                nBH8hAHy.SH1y5HwkJhh(ok1Var);
                            } else if (r1MBDhnF2 != 2) {
                                if (r1MBDhnF2 == 4) {
                                    vjVar = vjVar3;
                                    if (j < atomicLongFieldUpdater2.get(x9Var)) {
                                        ecVar.IHQe1A4L2xu();
                                    }
                                } else {
                                    if (r1MBDhnF2 != 5) {
                                        throw new java.lang.IllegalStateException("unexpected");
                                    }
                                    ecVar.IHQe1A4L2xu();
                                    defpackage.ec ecVar2 = (defpackage.ec) atomicReferenceFieldUpdater.get(x9Var);
                                    while (true) {
                                        long andIncrement2 = atomicLongFieldUpdater.getAndIncrement(x9Var);
                                        long j5 = andIncrement2 & 1152921504606846975L;
                                        boolean NHJTzaLwkd2 = x9Var.NHJTzaLwkd(andIncrement2, false);
                                        int i3 = defpackage.z9.oh6vYeIP;
                                        long j6 = i3;
                                        java.util.concurrent.atomic.AtomicLongFieldUpdater atomicLongFieldUpdater3 = atomicLongFieldUpdater;
                                        long j7 = j5 / j6;
                                        int i4 = (int) (j5 % j6);
                                        vjVar = vjVar3;
                                        if (ecVar2.adDC3e2L != j7) {
                                            defpackage.ec G3OKOH3wZRC3 = x9Var.G3OKOH3wZRC(j7, ecVar2);
                                            if (G3OKOH3wZRC3 != null) {
                                                ecVar2 = G3OKOH3wZRC3;
                                            } else {
                                                if (NHJTzaLwkd2) {
                                                    break;
                                                }
                                                atomicLongFieldUpdater = atomicLongFieldUpdater3;
                                                vjVar3 = vjVar;
                                            }
                                        }
                                        int r1MBDhnF3 = r1MBDhnF(x9Var, ecVar2, i4, obj, j5, nBH8hAHy, NHJTzaLwkd2);
                                        if (r1MBDhnF3 == 0) {
                                            ecVar2.IHQe1A4L2xu();
                                            break;
                                        }
                                        if (r1MBDhnF3 == 1) {
                                            break;
                                        }
                                        if (r1MBDhnF3 != 2) {
                                            if (r1MBDhnF3 == 3) {
                                                throw new java.lang.IllegalStateException("unexpected");
                                            }
                                            if (r1MBDhnF3 != 4) {
                                                if (r1MBDhnF3 == 5) {
                                                    ecVar2.IHQe1A4L2xu();
                                                }
                                                atomicLongFieldUpdater = atomicLongFieldUpdater3;
                                                vjVar3 = vjVar;
                                            } else if (j5 < atomicLongFieldUpdater2.get(x9Var)) {
                                                ecVar2.IHQe1A4L2xu();
                                            }
                                        } else if (NHJTzaLwkd2) {
                                            ecVar2.DFo87pBq1E5();
                                        } else {
                                            nBH8hAHy.IHQe1A4L2xu(ecVar2, i4 + i3);
                                        }
                                    }
                                }
                                oh6vYeIP(x9Var, obj, nBH8hAHy);
                            } else {
                                vjVar = vjVar3;
                                nBH8hAHy.IHQe1A4L2xu(ecVar, i2 + i);
                            }
                            kNAkVymC = nBH8hAHy.kNAkVymC();
                            vjVar2 = vjVar;
                            if (kNAkVymC != vjVar2) {
                                kNAkVymC = ok1Var;
                            }
                            if (kNAkVymC != vjVar2) {
                                return kNAkVymC;
                            }
                        } else {
                            vjVar = vjVar3;
                            ecVar.IHQe1A4L2xu();
                        }
                        nBH8hAHy.SH1y5HwkJhh(ok1Var);
                        kNAkVymC = nBH8hAHy.kNAkVymC();
                        vjVar2 = vjVar;
                        if (kNAkVymC != vjVar2) {
                        }
                        if (kNAkVymC != vjVar2) {
                            break;
                        }
                    } catch (java.lang.Throwable th) {
                        nBH8hAHy.D2vUnMij();
                        throw th;
                    }
                } else if (r1MBDhnF == 4) {
                    if (j < atomicLongFieldUpdater2.get(x9Var)) {
                        ecVar.IHQe1A4L2xu();
                    }
                    java.lang.Object D2vUnMij2 = x9Var.D2vUnMij(ejVar, obj);
                    if (D2vUnMij2 == vjVar3) {
                        return D2vUnMij2;
                    }
                } else if (r1MBDhnF == 5) {
                    ecVar.IHQe1A4L2xu();
                }
            } else if (NHJTzaLwkd) {
                ecVar.DFo87pBq1E5();
                java.lang.Object D2vUnMij3 = x9Var.D2vUnMij(ejVar, obj);
                if (D2vUnMij3 == vjVar3) {
                    return D2vUnMij3;
                }
            }
        }
        return ok1Var;
    }

    public final defpackage.ec AARZUJiTa() {
        JlrlGoKF.getClass();
        sun.misc.Unsafe unsafe = defpackage.cb.IHQe1A4L2xu;
        java.lang.Object objectVolatile = unsafe.getObjectVolatile(this, QoRHpC4k);
        SH1y5HwkJhh.getClass();
        defpackage.ec ecVar = (defpackage.ec) unsafe.getObjectVolatile(this, EgCjBq0SZwJ);
        if (ecVar.adDC3e2L > ((defpackage.ec) objectVolatile).adDC3e2L) {
            objectVolatile = ecVar;
        }
        ez2rX8ReCYw.getClass();
        defpackage.ec ecVar2 = (defpackage.ec) unsafe.getObjectVolatile(this, kd6TUFXn);
        if (ecVar2.adDC3e2L > ((defpackage.ec) objectVolatile).adDC3e2L) {
            objectVolatile = ecVar2;
        }
        defpackage.uh uhVar = (defpackage.uh) objectVolatile;
        while (true) {
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = defpackage.uh.IHQe1A4L2xu;
            java.lang.Object F7NU4MC0GW = uhVar.F7NU4MC0GW();
            if (F7NU4MC0GW == defpackage.ci0.oh6vYeIP) {
                break;
            }
            defpackage.uh uhVar2 = (defpackage.uh) F7NU4MC0GW;
            if (uhVar2 != null) {
                uhVar = uhVar2;
            } else if (uhVar.AARZUJiTa()) {
                break;
            }
        }
        return (defpackage.ec) uhVar;
    }

    public final boolean C0U8sNJm() {
        return NHJTzaLwkd(xiZrDbcSW0.get(this), false);
    }

    public final java.lang.Object D2vUnMij(defpackage.ej ejVar, java.lang.Object obj) {
        defpackage.bb bbVar = new defpackage.bb(1, defpackage.c80.V7bD7b8KA(ejVar));
        bbVar.PAEGRtP0bX();
        bbVar.SH1y5HwkJhh(new defpackage.p11(fnWB2E7cs()));
        java.lang.Object kNAkVymC = bbVar.kNAkVymC();
        return kNAkVymC == defpackage.vj.adDC3e2L ? kNAkVymC : defpackage.ok1.IHQe1A4L2xu;
    }

    public final void DFo87pBq1E5() {
        defpackage.x9 x9Var;
        if (nBH8hAHy()) {
            return;
        }
        JlrlGoKF.getClass();
        defpackage.ec ecVar = (defpackage.ec) defpackage.cb.IHQe1A4L2xu.getObjectVolatile(this, QoRHpC4k);
        loop0: while (true) {
            long andIncrement = EXtogiMhuM.getAndIncrement(this);
            long j = defpackage.z9.oh6vYeIP;
            long j2 = andIncrement / j;
            if (this.kNAkVymC() <= andIncrement) {
                if (ecVar.adDC3e2L < j2 && ecVar.r1MBDhnF() != null) {
                    this.v5iciZok(j2, ecVar);
                }
                PAEGRtP0bX(this);
                return;
            }
            x9Var = this;
            if (ecVar.adDC3e2L != j2) {
                defpackage.ec cnag84Bm2 = x9Var.cnag84Bm(j2, ecVar, andIncrement);
                if (cnag84Bm2 == null) {
                    continue;
                    this = x9Var;
                } else {
                    ecVar = cnag84Bm2;
                }
            }
            int i = (int) (andIncrement % j);
            java.lang.Object QoRHpC4k2 = ecVar.QoRHpC4k(i);
            boolean z = QoRHpC4k2 instanceof defpackage.fn1;
            java.util.concurrent.atomic.AtomicLongFieldUpdater atomicLongFieldUpdater = AARZUJiTa;
            if (!z || andIncrement < atomicLongFieldUpdater.get(x9Var) || !ecVar.cnag84Bm(i, QoRHpC4k2, defpackage.z9.AARZUJiTa)) {
                while (true) {
                    java.lang.Object QoRHpC4k3 = ecVar.QoRHpC4k(i);
                    if (!(QoRHpC4k3 instanceof defpackage.fn1)) {
                        if (QoRHpC4k3 != defpackage.z9.SH1y5HwkJhh) {
                            if (QoRHpC4k3 != null) {
                                if (QoRHpC4k3 == defpackage.z9.F7NU4MC0GW || QoRHpC4k3 == defpackage.z9.EXtogiMhuM || QoRHpC4k3 == defpackage.z9.riuEU0zW4 || QoRHpC4k3 == defpackage.z9.ez2rX8ReCYw || QoRHpC4k3 == defpackage.z9.JlrlGoKF) {
                                    break loop0;
                                } else if (QoRHpC4k3 != defpackage.z9.xiZrDbcSW0) {
                                    defpackage.db.xiZrDbcSW0(QoRHpC4k3, "Unexpected cell state: ");
                                    return;
                                }
                            } else if (ecVar.cnag84Bm(i, QoRHpC4k3, defpackage.z9.adDC3e2L)) {
                                break loop0;
                            }
                        } else {
                            break;
                        }
                    } else if (andIncrement < atomicLongFieldUpdater.get(x9Var)) {
                        if (ecVar.cnag84Bm(i, QoRHpC4k3, new defpackage.gn1((defpackage.fn1) QoRHpC4k3))) {
                            break loop0;
                        }
                    } else if (ecVar.cnag84Bm(i, QoRHpC4k3, defpackage.z9.AARZUJiTa)) {
                        if (mAr5m2L7gYDP(QoRHpC4k3)) {
                            ecVar.EgCjBq0SZwJ(i, defpackage.z9.F7NU4MC0GW);
                            break;
                        } else {
                            ecVar.EgCjBq0SZwJ(i, defpackage.z9.SH1y5HwkJhh);
                            ecVar.DFo87pBq1E5();
                        }
                    }
                }
                PAEGRtP0bX(x9Var);
            } else if (mAr5m2L7gYDP(QoRHpC4k2)) {
                ecVar.EgCjBq0SZwJ(i, defpackage.z9.F7NU4MC0GW);
                break;
            } else {
                ecVar.EgCjBq0SZwJ(i, defpackage.z9.SH1y5HwkJhh);
                ecVar.DFo87pBq1E5();
                PAEGRtP0bX(x9Var);
            }
            this = x9Var;
        }
        PAEGRtP0bX(x9Var);
    }

    @Override // defpackage.sb
    public final java.lang.Object EXtogiMhuM() {
        defpackage.ec ecVar;
        java.util.concurrent.atomic.AtomicLongFieldUpdater atomicLongFieldUpdater = AARZUJiTa;
        long j = atomicLongFieldUpdater.get(this);
        long j2 = xiZrDbcSW0.get(this);
        if (NHJTzaLwkd(j2, true)) {
            return new defpackage.bc(kd6TUFXn());
        }
        long j3 = j2 & 1152921504606846975L;
        defpackage.cc ccVar = defpackage.dc.oh6vYeIP;
        if (j >= j3) {
            return ccVar;
        }
        java.lang.Object obj = defpackage.z9.ez2rX8ReCYw;
        ez2rX8ReCYw.getClass();
        defpackage.ec ecVar2 = (defpackage.ec) defpackage.cb.IHQe1A4L2xu.getObjectVolatile(this, kd6TUFXn);
        while (!this.QQUzIjv3iOC5()) {
            long andIncrement = atomicLongFieldUpdater.getAndIncrement(this);
            long j4 = defpackage.z9.oh6vYeIP;
            long j5 = andIncrement / j4;
            int i = (int) (andIncrement % j4);
            if (ecVar2.adDC3e2L != j5) {
                defpackage.ec QoRHpC4k2 = this.QoRHpC4k(j5, ecVar2);
                if (QoRHpC4k2 == null) {
                    continue;
                } else {
                    ecVar = QoRHpC4k2;
                }
            } else {
                ecVar = ecVar2;
            }
            defpackage.x9 x9Var = this;
            java.lang.Object Uv8CGu3G = x9Var.Uv8CGu3G(ecVar, i, andIncrement, obj);
            ecVar2 = ecVar;
            if (Uv8CGu3G == defpackage.z9.DFo87pBq1E5) {
                defpackage.fn1 fn1Var = obj instanceof defpackage.fn1 ? (defpackage.fn1) obj : null;
                if (fn1Var != null) {
                    fn1Var.IHQe1A4L2xu(ecVar2, i);
                }
                x9Var.hkbnNdmy(andIncrement);
                ecVar2.DFo87pBq1E5();
                return ccVar;
            }
            if (Uv8CGu3G != defpackage.z9.cnag84Bm) {
                if (Uv8CGu3G != defpackage.z9.SyNS6RMn) {
                    ecVar2.IHQe1A4L2xu();
                    return Uv8CGu3G;
                }
                defpackage.db.AARZUJiTa("unexpected");
                return null;
            }
            if (andIncrement < x9Var.kNAkVymC()) {
                ecVar2.IHQe1A4L2xu();
            }
            this = x9Var;
        }
        return new defpackage.bc(this.kd6TUFXn());
    }

    public final java.lang.Throwable EgCjBq0SZwJ() {
        java.lang.Throwable kd6TUFXn2 = kd6TUFXn();
        return kd6TUFXn2 == null ? new defpackage.kd("Channel was closed") : kd6TUFXn2;
    }

    @Override // defpackage.sb
    public final void F7NU4MC0GW(java.util.concurrent.CancellationException cancellationException) {
        if (cancellationException == null) {
            cancellationException = new java.util.concurrent.CancellationException("Channel was cancelled");
        }
        SH1y5HwkJhh(cancellationException, true);
    }

    public final defpackage.ec G3OKOH3wZRC(long j, defpackage.ec ecVar) {
        java.lang.Object PAEGRtP0bX;
        long j2;
        long j3;
        sun.misc.Unsafe unsafe;
        defpackage.ec ecVar2 = defpackage.z9.IHQe1A4L2xu;
        defpackage.y9 y9Var = defpackage.y9.JlrlGoKF;
        loop0: while (true) {
            PAEGRtP0bX = defpackage.ci0.PAEGRtP0bX(ecVar, j, y9Var);
            if (!defpackage.s70.SiPhmbmu(PAEGRtP0bX)) {
                defpackage.t61 UsuH8pd5P = defpackage.s70.UsuH8pd5P(PAEGRtP0bX);
                while (true) {
                    SH1y5HwkJhh.getClass();
                    sun.misc.Unsafe unsafe2 = defpackage.cb.IHQe1A4L2xu;
                    long j4 = EgCjBq0SZwJ;
                    defpackage.t61 t61Var = (defpackage.t61) unsafe2.getObjectVolatile(this, j4);
                    if (t61Var.adDC3e2L >= UsuH8pd5P.adDC3e2L) {
                        break loop0;
                    }
                    if (!UsuH8pd5P.SyNS6RMn()) {
                        break;
                    }
                    do {
                        unsafe = defpackage.cb.IHQe1A4L2xu;
                        if (unsafe.compareAndSwapObject(this, EgCjBq0SZwJ, t61Var, UsuH8pd5P)) {
                            if (t61Var.SH1y5HwkJhh()) {
                                t61Var.EXtogiMhuM();
                            }
                        }
                    } while (unsafe.getObjectVolatile(this, j4) == t61Var);
                    if (UsuH8pd5P.SH1y5HwkJhh()) {
                        UsuH8pd5P.EXtogiMhuM();
                    }
                }
            } else {
                break;
            }
        }
        boolean SiPhmbmu = defpackage.s70.SiPhmbmu(PAEGRtP0bX);
        java.util.concurrent.atomic.AtomicLongFieldUpdater atomicLongFieldUpdater = AARZUJiTa;
        if (SiPhmbmu) {
            C0U8sNJm();
            if (ecVar.adDC3e2L * defpackage.z9.oh6vYeIP < atomicLongFieldUpdater.get(this)) {
                ecVar.IHQe1A4L2xu();
                return null;
            }
        } else {
            defpackage.ec ecVar3 = (defpackage.ec) defpackage.s70.UsuH8pd5P(PAEGRtP0bX);
            long j5 = ecVar3.adDC3e2L;
            if (j5 <= j) {
                return ecVar3;
            }
            long j6 = j5 * defpackage.z9.oh6vYeIP;
            do {
                j2 = xiZrDbcSW0.get(this);
                j3 = 1152921504606846975L & j2;
                if (j3 >= j6) {
                    break;
                }
            } while (!xiZrDbcSW0.compareAndSet(this, j2, j3 + (((int) (j2 >> 60)) << 60)));
            if (j5 * defpackage.z9.oh6vYeIP < atomicLongFieldUpdater.get(this)) {
                ecVar3.IHQe1A4L2xu();
            }
        }
        return null;
    }

    @Override // defpackage.w71
    public java.lang.Object IHQe1A4L2xu(defpackage.ej ejVar, java.lang.Object obj) {
        return wll2JLbTBC2(this, obj, ejVar);
    }

    public final void JlrlGoKF(long j) {
        ez2rX8ReCYw.getClass();
        defpackage.ec ecVar = (defpackage.ec) defpackage.cb.IHQe1A4L2xu.getObjectVolatile(this, kd6TUFXn);
        while (true) {
            java.util.concurrent.atomic.AtomicLongFieldUpdater atomicLongFieldUpdater = AARZUJiTa;
            long j2 = atomicLongFieldUpdater.get(this);
            if (j < java.lang.Math.max(this.adDC3e2L + j2, EXtogiMhuM.get(this))) {
                return;
            }
            defpackage.x9 x9Var = this;
            if (atomicLongFieldUpdater.compareAndSet(x9Var, j2, 1 + j2)) {
                long j3 = defpackage.z9.oh6vYeIP;
                long j4 = j2 / j3;
                int i = (int) (j2 % j3);
                if (ecVar.adDC3e2L != j4) {
                    defpackage.ec QoRHpC4k2 = x9Var.QoRHpC4k(j4, ecVar);
                    if (QoRHpC4k2 != null) {
                        ecVar = QoRHpC4k2;
                    }
                }
                defpackage.ec ecVar2 = ecVar;
                if (x9Var.Uv8CGu3G(ecVar2, i, j2, null) != defpackage.z9.cnag84Bm) {
                    ecVar2.IHQe1A4L2xu();
                } else if (j2 < x9Var.kNAkVymC()) {
                    ecVar2.IHQe1A4L2xu();
                }
                this = x9Var;
                ecVar = ecVar2;
            }
            this = x9Var;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:84:0x00a3, code lost:
    
        r10 = (defpackage.ec) r10.adDC3e2L();
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean NHJTzaLwkd(long j, boolean z) {
        int i = (int) (j >> 60);
        if (i != 0 && i != 1) {
            if (i == 2) {
                ez2rX8ReCYw(j & 1152921504606846975L);
                if (!z || !V7bD7b8KA()) {
                }
            } else {
                if (i != 3) {
                    throw new java.lang.IllegalStateException(defpackage.fx0.SH1y5HwkJhh("unexpected close status: ", i).toString());
                }
                defpackage.ec ez2rX8ReCYw2 = ez2rX8ReCYw(j & 1152921504606846975L);
                java.lang.Object obj = null;
                loop0: do {
                    int i2 = defpackage.z9.oh6vYeIP - 1;
                    while (true) {
                        if (-1 >= i2) {
                            break;
                        }
                        long j2 = (ez2rX8ReCYw2.adDC3e2L * defpackage.z9.oh6vYeIP) + i2;
                        while (true) {
                            java.lang.Object QoRHpC4k2 = ez2rX8ReCYw2.QoRHpC4k(i2);
                            if (QoRHpC4k2 == defpackage.z9.riuEU0zW4) {
                                break loop0;
                            }
                            defpackage.et etVar = defpackage.z9.F7NU4MC0GW;
                            java.util.concurrent.atomic.AtomicLongFieldUpdater atomicLongFieldUpdater = AARZUJiTa;
                            if (QoRHpC4k2 == etVar) {
                                if (j2 < atomicLongFieldUpdater.get(this)) {
                                    break loop0;
                                }
                                if (ez2rX8ReCYw2.cnag84Bm(i2, QoRHpC4k2, defpackage.z9.JlrlGoKF)) {
                                    ez2rX8ReCYw2.kd6TUFXn(i2, null);
                                    ez2rX8ReCYw2.DFo87pBq1E5();
                                    break;
                                }
                            } else if (QoRHpC4k2 != defpackage.z9.adDC3e2L && QoRHpC4k2 != null) {
                                if (!(QoRHpC4k2 instanceof defpackage.fn1) && !(QoRHpC4k2 instanceof defpackage.gn1)) {
                                    defpackage.et etVar2 = defpackage.z9.AARZUJiTa;
                                    if (QoRHpC4k2 == etVar2 || QoRHpC4k2 == defpackage.z9.xiZrDbcSW0) {
                                        break loop0;
                                    }
                                    if (QoRHpC4k2 != etVar2) {
                                        break;
                                    }
                                } else {
                                    if (j2 < atomicLongFieldUpdater.get(this)) {
                                        break loop0;
                                    }
                                    defpackage.fn1 fn1Var = QoRHpC4k2 instanceof defpackage.gn1 ? ((defpackage.gn1) QoRHpC4k2).IHQe1A4L2xu : (defpackage.fn1) QoRHpC4k2;
                                    if (ez2rX8ReCYw2.cnag84Bm(i2, QoRHpC4k2, defpackage.z9.JlrlGoKF)) {
                                        obj = defpackage.gq1.NHJTzaLwkd(obj, fn1Var);
                                        ez2rX8ReCYw2.kd6TUFXn(i2, null);
                                        ez2rX8ReCYw2.DFo87pBq1E5();
                                        break;
                                    }
                                }
                            } else if (ez2rX8ReCYw2.cnag84Bm(i2, QoRHpC4k2, defpackage.z9.JlrlGoKF)) {
                                ez2rX8ReCYw2.DFo87pBq1E5();
                                break;
                            }
                        }
                        i2--;
                    }
                } while (ez2rX8ReCYw2 != null);
                if (obj != null) {
                    if (obj instanceof java.util.ArrayList) {
                        java.util.ArrayList arrayList = (java.util.ArrayList) obj;
                        for (int size = arrayList.size() - 1; -1 < size; size--) {
                            yIx6ChFVk((defpackage.fn1) arrayList.get(size), false);
                        }
                    } else {
                        yIx6ChFVk((defpackage.fn1) obj, false);
                    }
                }
            }
            return true;
        }
        return false;
    }

    public final boolean QQUzIjv3iOC5() {
        return NHJTzaLwkd(xiZrDbcSW0.get(this), true);
    }

    /* JADX WARN: Code restructure failed: missing block: B:49:0x00d0, code lost:
    
        if (r8.SH1y5HwkJhh() == false) goto L76;
     */
    /* JADX WARN: Code restructure failed: missing block: B:50:0x00d2, code lost:
    
        r8.EXtogiMhuM();
     */
    /* JADX WARN: Removed duplicated region for block: B:60:0x00de  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x0107 A[RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final defpackage.ec QoRHpC4k(long j, defpackage.ec ecVar) {
        java.lang.Object PAEGRtP0bX;
        defpackage.ec ecVar2;
        long j2;
        sun.misc.Unsafe unsafe;
        defpackage.ec ecVar3 = defpackage.z9.IHQe1A4L2xu;
        defpackage.y9 y9Var = defpackage.y9.JlrlGoKF;
        loop0: while (true) {
            PAEGRtP0bX = defpackage.ci0.PAEGRtP0bX(ecVar, j, y9Var);
            if (!defpackage.s70.SiPhmbmu(PAEGRtP0bX)) {
                defpackage.t61 UsuH8pd5P = defpackage.s70.UsuH8pd5P(PAEGRtP0bX);
                while (true) {
                    ez2rX8ReCYw.getClass();
                    sun.misc.Unsafe unsafe2 = defpackage.cb.IHQe1A4L2xu;
                    long j3 = kd6TUFXn;
                    defpackage.t61 t61Var = (defpackage.t61) unsafe2.getObjectVolatile(this, j3);
                    if (t61Var.adDC3e2L >= UsuH8pd5P.adDC3e2L) {
                        break loop0;
                    }
                    if (!UsuH8pd5P.SyNS6RMn()) {
                        break;
                    }
                    do {
                        unsafe = defpackage.cb.IHQe1A4L2xu;
                        if (unsafe.compareAndSwapObject(this, kd6TUFXn, t61Var, UsuH8pd5P)) {
                            if (t61Var.SH1y5HwkJhh()) {
                                t61Var.EXtogiMhuM();
                            }
                        }
                    } while (unsafe.getObjectVolatile(this, j3) == t61Var);
                    if (UsuH8pd5P.SH1y5HwkJhh()) {
                        UsuH8pd5P.EXtogiMhuM();
                    }
                }
            } else {
                break;
            }
        }
        if (defpackage.s70.SiPhmbmu(PAEGRtP0bX)) {
            C0U8sNJm();
            if (ecVar.adDC3e2L * defpackage.z9.oh6vYeIP < kNAkVymC()) {
                ecVar.IHQe1A4L2xu();
                return null;
            }
        } else {
            defpackage.ec ecVar4 = (defpackage.ec) defpackage.s70.UsuH8pd5P(PAEGRtP0bX);
            long j4 = ecVar4.adDC3e2L;
            if (!nBH8hAHy() && j <= EXtogiMhuM.get(this) / defpackage.z9.oh6vYeIP) {
                while (true) {
                    JlrlGoKF.getClass();
                    sun.misc.Unsafe unsafe3 = defpackage.cb.IHQe1A4L2xu;
                    long j5 = QoRHpC4k;
                    defpackage.t61 t61Var2 = (defpackage.t61) unsafe3.getObjectVolatile(this, j5);
                    if (t61Var2.adDC3e2L >= j4 || !ecVar4.SyNS6RMn()) {
                        break;
                    }
                    while (true) {
                        sun.misc.Unsafe unsafe4 = defpackage.cb.IHQe1A4L2xu;
                        ecVar2 = ecVar4;
                        if (unsafe4.compareAndSwapObject(this, QoRHpC4k, t61Var2, ecVar4)) {
                            if (t61Var2.SH1y5HwkJhh()) {
                                t61Var2.EXtogiMhuM();
                            }
                        } else {
                            if (unsafe4.getObjectVolatile(this, j5) != t61Var2) {
                                break;
                            }
                            ecVar4 = ecVar2;
                        }
                    }
                    ecVar4 = ecVar2;
                }
                if (j4 > j) {
                    return ecVar2;
                }
                long j6 = j4 * defpackage.z9.oh6vYeIP;
                do {
                    j2 = AARZUJiTa.get(this);
                    if (j2 >= j6) {
                        break;
                    }
                } while (!AARZUJiTa.compareAndSet(this, j2, j6));
                if (j4 * defpackage.z9.oh6vYeIP < kNAkVymC()) {
                    ecVar2.IHQe1A4L2xu();
                }
            }
            ecVar2 = ecVar4;
            if (j4 > j) {
            }
        }
        return null;
    }

    public final boolean SH1y5HwkJhh(java.lang.Throwable th, boolean z) {
        defpackage.x9 x9Var;
        boolean z2;
        long j;
        long j2;
        long j3;
        java.util.concurrent.atomic.AtomicLongFieldUpdater atomicLongFieldUpdater = xiZrDbcSW0;
        if (z) {
            while (true) {
                long j4 = atomicLongFieldUpdater.get(this);
                if (((int) (j4 >> 60)) != 0) {
                    break;
                }
                defpackage.ec ecVar = defpackage.z9.IHQe1A4L2xu;
                x9Var = this;
                if (atomicLongFieldUpdater.compareAndSet(x9Var, j4, (j4 & 1152921504606846975L) + 1152921504606846976L)) {
                    break;
                }
                this = x9Var;
            }
        }
        x9Var = this;
        defpackage.et etVar = defpackage.z9.EgCjBq0SZwJ;
        while (true) {
            DFo87pBq1E5.getClass();
            defpackage.x9 x9Var2 = x9Var;
            sun.misc.Unsafe unsafe = defpackage.cb.IHQe1A4L2xu;
            long j5 = cnag84Bm;
            java.lang.Throwable th2 = th;
            boolean compareAndSwapObject = unsafe.compareAndSwapObject(x9Var2, j5, etVar, th2);
            x9Var = x9Var2;
            if (compareAndSwapObject) {
                z2 = true;
                break;
            }
            if (unsafe.getObjectVolatile(x9Var, j5) != etVar) {
                z2 = false;
                break;
            }
            th = th2;
        }
        if (z) {
            do {
                j3 = atomicLongFieldUpdater.get(x9Var);
            } while (!atomicLongFieldUpdater.compareAndSet(x9Var, j3, 3458764513820540928L + (j3 & 1152921504606846975L)));
        } else {
            do {
                j = atomicLongFieldUpdater.get(x9Var);
                int i = (int) (j >> 60);
                if (i == 0) {
                    j2 = (j & 1152921504606846975L) + 2305843009213693952L;
                } else {
                    if (i != 1) {
                        break;
                    }
                    j2 = (j & 1152921504606846975L) + 3458764513820540928L;
                }
            } while (!atomicLongFieldUpdater.compareAndSet(x9Var, j, j2));
        }
        x9Var.C0U8sNJm();
        if (z2) {
            x9Var.abhbClRa();
        }
        return z2;
    }

    @Override // defpackage.sb
    public final java.lang.Object SyNS6RMn(defpackage.ue ueVar) {
        return SiPhmbmu(this, ueVar);
    }

    public boolean UsuH8pd5P() {
        return false;
    }

    public final java.lang.Object Uv8CGu3G(defpackage.ec ecVar, int i, long j, java.lang.Object obj) {
        java.lang.Object QoRHpC4k2 = ecVar.QoRHpC4k(i);
        java.util.concurrent.atomic.AtomicReferenceArray atomicReferenceArray = ecVar.EXtogiMhuM;
        java.util.concurrent.atomic.AtomicLongFieldUpdater atomicLongFieldUpdater = xiZrDbcSW0;
        if (QoRHpC4k2 == null) {
            if (j >= (atomicLongFieldUpdater.get(this) & 1152921504606846975L)) {
                if (obj == null) {
                    return defpackage.z9.SyNS6RMn;
                }
                if (ecVar.cnag84Bm(i, QoRHpC4k2, obj)) {
                    DFo87pBq1E5();
                    return defpackage.z9.DFo87pBq1E5;
                }
            }
        } else if (QoRHpC4k2 == defpackage.z9.F7NU4MC0GW && ecVar.cnag84Bm(i, QoRHpC4k2, defpackage.z9.riuEU0zW4)) {
            DFo87pBq1E5();
            java.lang.Object obj2 = atomicReferenceArray.get(i * 2);
            ecVar.kd6TUFXn(i, null);
            return obj2;
        }
        while (true) {
            java.lang.Object QoRHpC4k3 = ecVar.QoRHpC4k(i);
            if (QoRHpC4k3 == null || QoRHpC4k3 == defpackage.z9.adDC3e2L) {
                if (j < (atomicLongFieldUpdater.get(this) & 1152921504606846975L)) {
                    if (ecVar.cnag84Bm(i, QoRHpC4k3, defpackage.z9.EXtogiMhuM)) {
                        DFo87pBq1E5();
                        return defpackage.z9.cnag84Bm;
                    }
                } else {
                    if (obj == null) {
                        return defpackage.z9.SyNS6RMn;
                    }
                    if (ecVar.cnag84Bm(i, QoRHpC4k3, obj)) {
                        DFo87pBq1E5();
                        return defpackage.z9.DFo87pBq1E5;
                    }
                }
            } else if (QoRHpC4k3 != defpackage.z9.F7NU4MC0GW) {
                defpackage.et etVar = defpackage.z9.SH1y5HwkJhh;
                if (QoRHpC4k3 == etVar) {
                    return defpackage.z9.cnag84Bm;
                }
                if (QoRHpC4k3 == defpackage.z9.EXtogiMhuM) {
                    return defpackage.z9.cnag84Bm;
                }
                if (QoRHpC4k3 == defpackage.z9.JlrlGoKF) {
                    DFo87pBq1E5();
                    return defpackage.z9.cnag84Bm;
                }
                if (QoRHpC4k3 != defpackage.z9.AARZUJiTa && ecVar.cnag84Bm(i, QoRHpC4k3, defpackage.z9.xiZrDbcSW0)) {
                    boolean z = QoRHpC4k3 instanceof defpackage.gn1;
                    if (z) {
                        QoRHpC4k3 = ((defpackage.gn1) QoRHpC4k3).IHQe1A4L2xu;
                    }
                    if (mAr5m2L7gYDP(QoRHpC4k3)) {
                        ecVar.EgCjBq0SZwJ(i, defpackage.z9.riuEU0zW4);
                        DFo87pBq1E5();
                        java.lang.Object obj3 = atomicReferenceArray.get(i * 2);
                        ecVar.kd6TUFXn(i, null);
                        return obj3;
                    }
                    ecVar.EgCjBq0SZwJ(i, etVar);
                    ecVar.DFo87pBq1E5();
                    if (z) {
                        DFo87pBq1E5();
                    }
                    return defpackage.z9.cnag84Bm;
                }
            } else if (ecVar.cnag84Bm(i, QoRHpC4k3, defpackage.z9.riuEU0zW4)) {
                DFo87pBq1E5();
                java.lang.Object obj4 = atomicReferenceArray.get(i * 2);
                ecVar.kd6TUFXn(i, null);
                return obj4;
            }
        }
    }

    public final boolean V7bD7b8KA() {
        while (true) {
            ez2rX8ReCYw.getClass();
            sun.misc.Unsafe unsafe = defpackage.cb.IHQe1A4L2xu;
            long j = kd6TUFXn;
            defpackage.ec ecVar = (defpackage.ec) unsafe.getObjectVolatile(this, j);
            java.util.concurrent.atomic.AtomicLongFieldUpdater atomicLongFieldUpdater = AARZUJiTa;
            long j2 = atomicLongFieldUpdater.get(this);
            if (kNAkVymC() <= j2) {
                return false;
            }
            long j3 = defpackage.z9.oh6vYeIP;
            long j4 = j2 / j3;
            if (ecVar.adDC3e2L == j4 || (ecVar = QoRHpC4k(j4, ecVar)) != null) {
                ecVar.IHQe1A4L2xu();
                int i = (int) (j2 % j3);
                while (true) {
                    java.lang.Object QoRHpC4k2 = ecVar.QoRHpC4k(i);
                    if (QoRHpC4k2 == null || QoRHpC4k2 == defpackage.z9.adDC3e2L) {
                        if (ecVar.cnag84Bm(i, QoRHpC4k2, defpackage.z9.EXtogiMhuM)) {
                            DFo87pBq1E5();
                            break;
                        }
                    } else {
                        if (QoRHpC4k2 == defpackage.z9.F7NU4MC0GW) {
                            return true;
                        }
                        if (QoRHpC4k2 != defpackage.z9.SH1y5HwkJhh && QoRHpC4k2 != defpackage.z9.JlrlGoKF && QoRHpC4k2 != defpackage.z9.riuEU0zW4 && QoRHpC4k2 != defpackage.z9.EXtogiMhuM) {
                            if (QoRHpC4k2 == defpackage.z9.AARZUJiTa) {
                                return true;
                            }
                            if (QoRHpC4k2 != defpackage.z9.xiZrDbcSW0 && j2 == atomicLongFieldUpdater.get(this)) {
                                return true;
                            }
                        }
                    }
                }
                AARZUJiTa.compareAndSet(this, j2, j2 + 1);
            } else if (((defpackage.ec) unsafe.getObjectVolatile(this, j)).adDC3e2L < j4) {
                return false;
            }
        }
    }

    public final boolean XZx205DYe(java.lang.Object obj, java.lang.Object obj2) {
        if (obj instanceof defpackage.yy0) {
            return defpackage.z9.IHQe1A4L2xu(((defpackage.yy0) obj).adDC3e2L, new defpackage.dc(obj2), null);
        }
        if (!(obj instanceof defpackage.u9)) {
            if (obj instanceof defpackage.ab) {
                return defpackage.z9.IHQe1A4L2xu((defpackage.ab) obj, obj2, null);
            }
            defpackage.db.xiZrDbcSW0(obj, "Unexpected receiver type: ");
            return false;
        }
        defpackage.u9 u9Var = (defpackage.u9) obj;
        defpackage.bb bbVar = u9Var.xiZrDbcSW0;
        bbVar.getClass();
        u9Var.xiZrDbcSW0 = null;
        u9Var.adDC3e2L = obj2;
        java.lang.Boolean bool = java.lang.Boolean.TRUE;
        u9Var.AARZUJiTa.getClass();
        return defpackage.z9.IHQe1A4L2xu(bbVar, bool, null);
    }

    public final void abhbClRa() {
        java.lang.Object objectVolatile;
        defpackage.x9 x9Var;
        loop0: while (true) {
            SyNS6RMn.getClass();
            sun.misc.Unsafe unsafe = defpackage.cb.IHQe1A4L2xu;
            long j = G3OKOH3wZRC;
            objectVolatile = unsafe.getObjectVolatile(this, j);
            defpackage.et etVar = objectVolatile == null ? defpackage.z9.G3OKOH3wZRC : defpackage.z9.kd6TUFXn;
            while (true) {
                sun.misc.Unsafe unsafe2 = defpackage.cb.IHQe1A4L2xu;
                x9Var = this;
                if (unsafe2.compareAndSwapObject(x9Var, G3OKOH3wZRC, objectVolatile, etVar)) {
                    break loop0;
                } else if (unsafe2.getObjectVolatile(x9Var, j) != objectVolatile) {
                    break;
                } else {
                    this = x9Var;
                }
            }
            this = x9Var;
        }
        if (objectVolatile == null) {
            return;
        }
        defpackage.mj1.kNAkVymC(1, objectVolatile);
        ((defpackage.g00) objectVolatile).AARZUJiTa(x9Var.kd6TUFXn());
    }

    @Override // defpackage.sb
    public final java.lang.Object adDC3e2L(defpackage.ce1 ce1Var) {
        return frpfPPIgqM9O(this, ce1Var);
    }

    public final defpackage.ec cnag84Bm(long j, defpackage.ec ecVar, long j2) {
        java.lang.Object PAEGRtP0bX;
        sun.misc.Unsafe unsafe;
        defpackage.ec ecVar2 = defpackage.z9.IHQe1A4L2xu;
        defpackage.y9 y9Var = defpackage.y9.JlrlGoKF;
        loop0: while (true) {
            PAEGRtP0bX = defpackage.ci0.PAEGRtP0bX(ecVar, j, y9Var);
            if (!defpackage.s70.SiPhmbmu(PAEGRtP0bX)) {
                defpackage.t61 UsuH8pd5P = defpackage.s70.UsuH8pd5P(PAEGRtP0bX);
                while (true) {
                    JlrlGoKF.getClass();
                    sun.misc.Unsafe unsafe2 = defpackage.cb.IHQe1A4L2xu;
                    long j3 = QoRHpC4k;
                    defpackage.t61 t61Var = (defpackage.t61) unsafe2.getObjectVolatile(this, j3);
                    if (t61Var.adDC3e2L >= UsuH8pd5P.adDC3e2L) {
                        break loop0;
                    }
                    if (!UsuH8pd5P.SyNS6RMn()) {
                        break;
                    }
                    do {
                        unsafe = defpackage.cb.IHQe1A4L2xu;
                        if (unsafe.compareAndSwapObject(this, QoRHpC4k, t61Var, UsuH8pd5P)) {
                            if (t61Var.SH1y5HwkJhh()) {
                                t61Var.EXtogiMhuM();
                            }
                        }
                    } while (unsafe.getObjectVolatile(this, j3) == t61Var);
                    if (UsuH8pd5P.SH1y5HwkJhh()) {
                        UsuH8pd5P.EXtogiMhuM();
                    }
                }
            } else {
                break;
            }
        }
        if (defpackage.s70.SiPhmbmu(PAEGRtP0bX)) {
            C0U8sNJm();
            v5iciZok(j, ecVar);
            PAEGRtP0bX(this);
            return null;
        }
        defpackage.ec ecVar3 = (defpackage.ec) defpackage.s70.UsuH8pd5P(PAEGRtP0bX);
        long j4 = ecVar3.adDC3e2L;
        if (j4 <= j) {
            return ecVar3;
        }
        long j5 = j4 * defpackage.z9.oh6vYeIP;
        if (!EXtogiMhuM.compareAndSet(this, j2 + 1, j5)) {
            PAEGRtP0bX(this);
            return null;
        }
        java.util.concurrent.atomic.AtomicLongFieldUpdater atomicLongFieldUpdater = riuEU0zW4;
        if ((atomicLongFieldUpdater.addAndGet(this, j5 - j2) & 4611686018427387904L) != 0) {
            while ((atomicLongFieldUpdater.get(this) & 4611686018427387904L) != 0) {
            }
        }
        return null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:31:0x0046, code lost:
    
        r1 = (defpackage.ec) r1.adDC3e2L();
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final defpackage.ec ez2rX8ReCYw(long j) {
        long j2;
        defpackage.ec AARZUJiTa2 = AARZUJiTa();
        if (UsuH8pd5P()) {
            defpackage.ec ecVar = AARZUJiTa2;
            loop0: do {
                int i = defpackage.z9.oh6vYeIP - 1;
                while (true) {
                    if (-1 >= i) {
                        break;
                    }
                    j2 = (ecVar.adDC3e2L * defpackage.z9.oh6vYeIP) + i;
                    if (j2 < AARZUJiTa.get(this)) {
                        break loop0;
                    }
                    while (true) {
                        java.lang.Object QoRHpC4k2 = ecVar.QoRHpC4k(i);
                        if (QoRHpC4k2 != null && QoRHpC4k2 != defpackage.z9.adDC3e2L) {
                            if (QoRHpC4k2 == defpackage.z9.F7NU4MC0GW) {
                                break loop0;
                            }
                        } else {
                            if (ecVar.cnag84Bm(i, QoRHpC4k2, defpackage.z9.JlrlGoKF)) {
                                ecVar.DFo87pBq1E5();
                                break;
                            }
                        }
                    }
                    i--;
                }
            } while (ecVar != null);
            j2 = -1;
            if (j2 != -1) {
                JlrlGoKF(j2);
            }
        }
        java.lang.Object obj = null;
        loop3: for (defpackage.ec ecVar2 = AARZUJiTa2; ecVar2 != null; ecVar2 = (defpackage.ec) ecVar2.adDC3e2L()) {
            for (int i2 = defpackage.z9.oh6vYeIP - 1; -1 < i2; i2--) {
                if ((ecVar2.adDC3e2L * defpackage.z9.oh6vYeIP) + i2 < j) {
                    break loop3;
                }
                while (true) {
                    java.lang.Object QoRHpC4k3 = ecVar2.QoRHpC4k(i2);
                    if (QoRHpC4k3 != null && QoRHpC4k3 != defpackage.z9.adDC3e2L) {
                        if (!(QoRHpC4k3 instanceof defpackage.gn1)) {
                            if (!(QoRHpC4k3 instanceof defpackage.fn1)) {
                                break;
                            }
                            if (ecVar2.cnag84Bm(i2, QoRHpC4k3, defpackage.z9.JlrlGoKF)) {
                                obj = defpackage.gq1.NHJTzaLwkd(obj, QoRHpC4k3);
                                ecVar2.G3OKOH3wZRC(i2, true);
                                break;
                            }
                        } else {
                            if (ecVar2.cnag84Bm(i2, QoRHpC4k3, defpackage.z9.JlrlGoKF)) {
                                obj = defpackage.gq1.NHJTzaLwkd(obj, ((defpackage.gn1) QoRHpC4k3).IHQe1A4L2xu);
                                ecVar2.G3OKOH3wZRC(i2, true);
                                break;
                            }
                        }
                    } else {
                        if (ecVar2.cnag84Bm(i2, QoRHpC4k3, defpackage.z9.JlrlGoKF)) {
                            ecVar2.DFo87pBq1E5();
                            break;
                        }
                    }
                }
            }
        }
        if (obj != null) {
            if (!(obj instanceof java.util.ArrayList)) {
                yIx6ChFVk((defpackage.fn1) obj, true);
                return AARZUJiTa2;
            }
            java.util.ArrayList arrayList = (java.util.ArrayList) obj;
            for (int size = arrayList.size() - 1; -1 < size; size--) {
                yIx6ChFVk((defpackage.fn1) arrayList.get(size), true);
            }
        }
        return AARZUJiTa2;
    }

    public final java.lang.Throwable fnWB2E7cs() {
        java.lang.Throwable kd6TUFXn2 = kd6TUFXn();
        return kd6TUFXn2 == null ? new defpackage.ld("Channel was closed") : kd6TUFXn2;
    }

    public final void hkbnNdmy(long j) {
        java.util.concurrent.atomic.AtomicLongFieldUpdater atomicLongFieldUpdater;
        defpackage.x9 x9Var = this;
        if (x9Var.nBH8hAHy()) {
            return;
        }
        while (true) {
            atomicLongFieldUpdater = EXtogiMhuM;
            if (atomicLongFieldUpdater.get(x9Var) > j) {
                break;
            } else {
                x9Var = this;
            }
        }
        int i = defpackage.z9.r1MBDhnF;
        int i2 = 0;
        while (true) {
            java.util.concurrent.atomic.AtomicLongFieldUpdater atomicLongFieldUpdater2 = riuEU0zW4;
            if (i2 < i) {
                long j2 = atomicLongFieldUpdater.get(x9Var);
                if (j2 == (4611686018427387903L & atomicLongFieldUpdater2.get(x9Var)) && j2 == atomicLongFieldUpdater.get(x9Var)) {
                    return;
                } else {
                    i2++;
                }
            } else {
                while (true) {
                    long j3 = atomicLongFieldUpdater2.get(x9Var);
                    if (atomicLongFieldUpdater2.compareAndSet(x9Var, j3, (j3 & 4611686018427387903L) + 4611686018427387904L)) {
                        break;
                    } else {
                        x9Var = this;
                    }
                }
                while (true) {
                    long j4 = atomicLongFieldUpdater.get(x9Var);
                    long j5 = atomicLongFieldUpdater2.get(x9Var);
                    long j6 = j5 & 4611686018427387903L;
                    boolean z = (j5 & 4611686018427387904L) != 0;
                    if (j4 == j6 && j4 == atomicLongFieldUpdater.get(x9Var)) {
                        break;
                    }
                    if (z) {
                        x9Var = this;
                    } else {
                        x9Var = this;
                        atomicLongFieldUpdater2.compareAndSet(x9Var, j5, 4611686018427387904L + j6);
                    }
                }
                while (true) {
                    long j7 = atomicLongFieldUpdater2.get(x9Var);
                    if (atomicLongFieldUpdater2.compareAndSet(x9Var, j7, j7 & 4611686018427387903L)) {
                        return;
                    } else {
                        x9Var = this;
                    }
                }
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:45:0x00ae, code lost:
    
        return r1;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object hyxIchWRW(java.lang.Object obj) {
        defpackage.ec ecVar;
        int i;
        defpackage.x9 x9Var;
        defpackage.dt dtVar = defpackage.z9.F7NU4MC0GW;
        SH1y5HwkJhh.getClass();
        defpackage.ec ecVar2 = (defpackage.ec) defpackage.cb.IHQe1A4L2xu.getObjectVolatile(this, EgCjBq0SZwJ);
        while (true) {
            long andIncrement = xiZrDbcSW0.getAndIncrement(this);
            long j = andIncrement & 1152921504606846975L;
            boolean NHJTzaLwkd = this.NHJTzaLwkd(andIncrement, false);
            int i2 = defpackage.z9.oh6vYeIP;
            long j2 = i2;
            long j3 = j / j2;
            int i3 = (int) (j % j2);
            if (ecVar2.adDC3e2L != j3) {
                ecVar = this.G3OKOH3wZRC(j3, ecVar2);
                if (ecVar != null) {
                    x9Var = this;
                    i = i3;
                } else if (NHJTzaLwkd) {
                    return new defpackage.bc(this.fnWB2E7cs());
                }
            } else {
                ecVar = ecVar2;
                i = i3;
                x9Var = this;
            }
            java.lang.Object obj2 = obj;
            int r1MBDhnF = r1MBDhnF(x9Var, ecVar, i, obj2, j, dtVar, NHJTzaLwkd);
            defpackage.x9 x9Var2 = x9Var;
            ecVar2 = ecVar;
            defpackage.ok1 ok1Var = defpackage.ok1.IHQe1A4L2xu;
            if (r1MBDhnF == 0) {
                ecVar2.IHQe1A4L2xu();
                return ok1Var;
            }
            if (r1MBDhnF == 1) {
                break;
            }
            if (r1MBDhnF != 2) {
                if (r1MBDhnF == 3) {
                    defpackage.db.AARZUJiTa("unexpected");
                    return null;
                }
                if (r1MBDhnF == 4) {
                    if (j < AARZUJiTa.get(x9Var2)) {
                        ecVar2.IHQe1A4L2xu();
                    }
                    return new defpackage.bc(x9Var2.fnWB2E7cs());
                }
                if (r1MBDhnF == 5) {
                    ecVar2.IHQe1A4L2xu();
                }
                this = x9Var2;
                obj = obj2;
            } else {
                if (NHJTzaLwkd) {
                    ecVar2.DFo87pBq1E5();
                    return new defpackage.bc(x9Var2.fnWB2E7cs());
                }
                defpackage.fn1 fn1Var = dtVar instanceof defpackage.fn1 ? (defpackage.fn1) dtVar : null;
                if (fn1Var != null) {
                    fn1Var.IHQe1A4L2xu(ecVar2, i + i2);
                }
                x9Var2.JlrlGoKF((ecVar2.adDC3e2L * j2) + i);
            }
        }
    }

    @Override // defpackage.sb
    public final defpackage.u9 iterator() {
        return new defpackage.u9(this);
    }

    public final long kNAkVymC() {
        return xiZrDbcSW0.get(this) & 1152921504606846975L;
    }

    public final java.lang.Throwable kd6TUFXn() {
        DFo87pBq1E5.getClass();
        return (java.lang.Throwable) defpackage.cb.IHQe1A4L2xu.getObjectVolatile(this, cnag84Bm);
    }

    public final int lpprD5VAS(defpackage.ec ecVar, int i, java.lang.Object obj, long j, java.lang.Object obj2, boolean z) {
        while (true) {
            java.lang.Object QoRHpC4k2 = ecVar.QoRHpC4k(i);
            if (QoRHpC4k2 == null) {
                if (!xiZrDbcSW0(j) || z) {
                    if (z) {
                        if (ecVar.cnag84Bm(i, null, defpackage.z9.SH1y5HwkJhh)) {
                            ecVar.DFo87pBq1E5();
                            return 4;
                        }
                    } else {
                        if (obj2 == null) {
                            return 3;
                        }
                        if (ecVar.cnag84Bm(i, null, obj2)) {
                            return 2;
                        }
                    }
                } else if (ecVar.cnag84Bm(i, null, defpackage.z9.F7NU4MC0GW)) {
                    break;
                }
            } else {
                if (QoRHpC4k2 != defpackage.z9.adDC3e2L) {
                    defpackage.et etVar = defpackage.z9.ez2rX8ReCYw;
                    if (QoRHpC4k2 == etVar) {
                        ecVar.kd6TUFXn(i, null);
                        return 5;
                    }
                    if (QoRHpC4k2 == defpackage.z9.EXtogiMhuM) {
                        ecVar.kd6TUFXn(i, null);
                        return 5;
                    }
                    if (QoRHpC4k2 == defpackage.z9.JlrlGoKF) {
                        ecVar.kd6TUFXn(i, null);
                        C0U8sNJm();
                        return 4;
                    }
                    ecVar.kd6TUFXn(i, null);
                    if (QoRHpC4k2 instanceof defpackage.gn1) {
                        QoRHpC4k2 = ((defpackage.gn1) QoRHpC4k2).IHQe1A4L2xu;
                    }
                    if (XZx205DYe(QoRHpC4k2, obj)) {
                        ecVar.EgCjBq0SZwJ(i, defpackage.z9.riuEU0zW4);
                        return 0;
                    }
                    if (ecVar.EXtogiMhuM.getAndSet((i * 2) + 1, etVar) != etVar) {
                        ecVar.G3OKOH3wZRC(i, true);
                    }
                    return 5;
                }
                if (ecVar.cnag84Bm(i, QoRHpC4k2, defpackage.z9.F7NU4MC0GW)) {
                    break;
                }
            }
        }
        return 1;
    }

    public final boolean nBH8hAHy() {
        long j = EXtogiMhuM.get(this);
        return j == 0 || j == Long.MAX_VALUE;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x002d  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0020  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object p4kuH6PDtgom(defpackage.ec ecVar, int i, long j, defpackage.fj fjVar) {
        defpackage.w9 w9Var;
        int i2;
        defpackage.dc dcVar;
        defpackage.ec ecVar2;
        if (fjVar instanceof defpackage.w9) {
            w9Var = (defpackage.w9) fjVar;
            int i3 = w9Var.SH1y5HwkJhh;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                w9Var.SH1y5HwkJhh = i3 - Integer.MIN_VALUE;
                java.lang.Object obj = w9Var.EXtogiMhuM;
                i2 = w9Var.SH1y5HwkJhh;
                if (i2 != 0) {
                    defpackage.f70.nBH8hAHy(obj);
                    w9Var.SH1y5HwkJhh = 1;
                    defpackage.bb nBH8hAHy = defpackage.ci0.nBH8hAHy(defpackage.c80.V7bD7b8KA(w9Var));
                    try {
                        defpackage.yy0 yy0Var = new defpackage.yy0(nBH8hAHy);
                        java.lang.Object Uv8CGu3G = Uv8CGu3G(ecVar, i, j, yy0Var);
                        if (Uv8CGu3G == defpackage.z9.DFo87pBq1E5) {
                            yy0Var.IHQe1A4L2xu(ecVar, i);
                        } else {
                            if (Uv8CGu3G == defpackage.z9.cnag84Bm) {
                                if (j < kNAkVymC()) {
                                    ecVar.IHQe1A4L2xu();
                                }
                                defpackage.ec ecVar3 = (defpackage.ec) ez2rX8ReCYw.get(this);
                                while (true) {
                                    if (QQUzIjv3iOC5()) {
                                        nBH8hAHy.SH1y5HwkJhh(new defpackage.dc(new defpackage.bc(kd6TUFXn())));
                                        break;
                                    }
                                    long andIncrement = AARZUJiTa.getAndIncrement(this);
                                    long j2 = defpackage.z9.oh6vYeIP;
                                    long j3 = andIncrement / j2;
                                    int i4 = (int) (andIncrement % j2);
                                    if (ecVar3.adDC3e2L != j3) {
                                        defpackage.ec QoRHpC4k2 = QoRHpC4k(j3, ecVar3);
                                        if (QoRHpC4k2 != null) {
                                            ecVar2 = QoRHpC4k2;
                                        }
                                    } else {
                                        ecVar2 = ecVar3;
                                    }
                                    java.lang.Object Uv8CGu3G2 = Uv8CGu3G(ecVar2, i4, andIncrement, yy0Var);
                                    defpackage.ec ecVar4 = ecVar2;
                                    if (Uv8CGu3G2 == defpackage.z9.DFo87pBq1E5) {
                                        yy0Var.IHQe1A4L2xu(ecVar4, i4);
                                        break;
                                    }
                                    if (Uv8CGu3G2 == defpackage.z9.cnag84Bm) {
                                        if (andIncrement < kNAkVymC()) {
                                            ecVar4.IHQe1A4L2xu();
                                        }
                                        ecVar3 = ecVar4;
                                    } else {
                                        if (Uv8CGu3G2 == defpackage.z9.SyNS6RMn) {
                                            throw new java.lang.IllegalStateException("unexpected");
                                        }
                                        ecVar4.IHQe1A4L2xu();
                                        dcVar = new defpackage.dc(Uv8CGu3G2);
                                    }
                                }
                            } else {
                                ecVar.IHQe1A4L2xu();
                                dcVar = new defpackage.dc(Uv8CGu3G);
                            }
                            nBH8hAHy.DFo87pBq1E5(dcVar, null);
                        }
                        obj = nBH8hAHy.kNAkVymC();
                        defpackage.vj vjVar = defpackage.vj.adDC3e2L;
                        if (obj == vjVar) {
                            return vjVar;
                        }
                    } catch (java.lang.Throwable th) {
                        nBH8hAHy.D2vUnMij();
                        throw th;
                    }
                } else {
                    if (i2 != 1) {
                        defpackage.db.AARZUJiTa("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    defpackage.f70.nBH8hAHy(obj);
                }
                return ((defpackage.dc) obj).IHQe1A4L2xu;
            }
        }
        w9Var = new defpackage.w9(this, fjVar);
        java.lang.Object obj2 = w9Var.EXtogiMhuM;
        i2 = w9Var.SH1y5HwkJhh;
        if (i2 != 0) {
        }
        return ((defpackage.dc) obj2).IHQe1A4L2xu;
    }

    @Override // defpackage.w71
    public java.lang.Object riuEU0zW4(java.lang.Object obj) {
        java.util.concurrent.atomic.AtomicLongFieldUpdater atomicLongFieldUpdater = xiZrDbcSW0;
        boolean z = false;
        long j = 1152921504606846975L;
        boolean z2 = NHJTzaLwkd(atomicLongFieldUpdater.get(this), false) ? false : !xiZrDbcSW0(r1 & 1152921504606846975L);
        defpackage.cc ccVar = defpackage.dc.oh6vYeIP;
        if (z2) {
            return ccVar;
        }
        defpackage.dt dtVar = defpackage.z9.SH1y5HwkJhh;
        SH1y5HwkJhh.getClass();
        defpackage.ec ecVar = (defpackage.ec) defpackage.cb.IHQe1A4L2xu.getObjectVolatile(this, EgCjBq0SZwJ);
        while (true) {
            long andIncrement = atomicLongFieldUpdater.getAndIncrement(this);
            long j2 = andIncrement & j;
            boolean NHJTzaLwkd = NHJTzaLwkd(andIncrement, z);
            int i = defpackage.z9.oh6vYeIP;
            long j3 = i;
            long j4 = j2 / j3;
            int i2 = (int) (j2 % j3);
            if (ecVar.adDC3e2L != j4) {
                defpackage.ec G3OKOH3wZRC2 = G3OKOH3wZRC(j4, ecVar);
                if (G3OKOH3wZRC2 != null) {
                    ecVar = G3OKOH3wZRC2;
                } else {
                    if (NHJTzaLwkd) {
                        return new defpackage.bc(fnWB2E7cs());
                    }
                    z = false;
                    j = 1152921504606846975L;
                }
            }
            int r1MBDhnF = r1MBDhnF(this, ecVar, i2, obj, j2, dtVar, NHJTzaLwkd);
            defpackage.ok1 ok1Var = defpackage.ok1.IHQe1A4L2xu;
            if (r1MBDhnF == 0) {
                ecVar.IHQe1A4L2xu();
                return ok1Var;
            }
            if (r1MBDhnF == 1) {
                return ok1Var;
            }
            if (r1MBDhnF == 2) {
                if (NHJTzaLwkd) {
                    ecVar.DFo87pBq1E5();
                    return new defpackage.bc(fnWB2E7cs());
                }
                defpackage.fn1 fn1Var = dtVar instanceof defpackage.fn1 ? (defpackage.fn1) dtVar : null;
                if (fn1Var != null) {
                    fn1Var.IHQe1A4L2xu(ecVar, i2 + i);
                }
                ecVar.DFo87pBq1E5();
                return ccVar;
            }
            if (r1MBDhnF == 3) {
                defpackage.db.AARZUJiTa("unexpected");
                return null;
            }
            if (r1MBDhnF == 4) {
                if (j2 < AARZUJiTa.get(this)) {
                    ecVar.IHQe1A4L2xu();
                }
                return new defpackage.bc(fnWB2E7cs());
            }
            if (r1MBDhnF == 5) {
                ecVar.IHQe1A4L2xu();
            }
            z = false;
            j = 1152921504606846975L;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:95:0x01a7, code lost:
    
        r15 = r8;
        r3 = (defpackage.ec) r3.r1MBDhnF();
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
        int i2 = (int) (xiZrDbcSW0.get(this) >> 60);
        if (i2 == 2) {
            sb.append("closed,");
        } else if (i2 == 3) {
            sb.append("cancelled,");
        }
        sb.append("capacity=" + this.adDC3e2L + ',');
        sb.append("data=[");
        ez2rX8ReCYw.getClass();
        sun.misc.Unsafe unsafe = defpackage.cb.IHQe1A4L2xu;
        int i3 = 0;
        SH1y5HwkJhh.getClass();
        java.lang.Object objectVolatile = unsafe.getObjectVolatile(this, EgCjBq0SZwJ);
        int i4 = 1;
        JlrlGoKF.getClass();
        java.util.List yIx6ChFVk = defpackage.fm.yIx6ChFVk(unsafe.getObjectVolatile(this, kd6TUFXn), objectVolatile, unsafe.getObjectVolatile(this, QoRHpC4k));
        java.util.ArrayList arrayList = new java.util.ArrayList();
        for (java.lang.Object obj : yIx6ChFVk) {
            if (((defpackage.ec) obj) != defpackage.z9.IHQe1A4L2xu) {
                arrayList.add(obj);
            }
        }
        java.util.Iterator it = arrayList.iterator();
        if (!it.hasNext()) {
            defpackage.db.DFo87pBq1E5();
            return null;
        }
        java.lang.Object next = it.next();
        if (it.hasNext()) {
            long j = ((defpackage.ec) next).adDC3e2L;
            do {
                java.lang.Object next2 = it.next();
                long j2 = ((defpackage.ec) next2).adDC3e2L;
                if (j > j2) {
                    next = next2;
                    j = j2;
                }
            } while (it.hasNext());
        }
        defpackage.ec ecVar = (defpackage.ec) next;
        long j3 = AARZUJiTa.get(this);
        long kNAkVymC = kNAkVymC();
        loop2: while (true) {
            int i5 = defpackage.z9.oh6vYeIP;
            int i6 = i3;
            while (true) {
                if (i6 >= i5) {
                    break;
                }
                i = i4;
                long j4 = (ecVar.adDC3e2L * defpackage.z9.oh6vYeIP) + i6;
                if (j4 >= kNAkVymC && j4 >= j3) {
                    break loop2;
                }
                java.lang.Object QoRHpC4k2 = ecVar.QoRHpC4k(i6);
                java.lang.Object obj2 = ecVar.EXtogiMhuM.get(i6 * 2);
                if (QoRHpC4k2 instanceof defpackage.ab) {
                    str = (j4 >= j3 || j4 < kNAkVymC) ? (j4 >= kNAkVymC || j4 < j3) ? "cont" : "send" : "receive";
                } else if (QoRHpC4k2 instanceof defpackage.yy0) {
                    str = "receiveCatching";
                } else if (QoRHpC4k2 instanceof defpackage.gn1) {
                    str = "EB(" + QoRHpC4k2 + ')';
                } else if (defpackage.x70.QoRHpC4k(QoRHpC4k2, defpackage.z9.xiZrDbcSW0) || defpackage.x70.QoRHpC4k(QoRHpC4k2, defpackage.z9.AARZUJiTa)) {
                    str = "resuming_sender";
                } else {
                    if (QoRHpC4k2 != null && !QoRHpC4k2.equals(defpackage.z9.adDC3e2L) && !QoRHpC4k2.equals(defpackage.z9.riuEU0zW4) && !QoRHpC4k2.equals(defpackage.z9.EXtogiMhuM) && !QoRHpC4k2.equals(defpackage.z9.ez2rX8ReCYw) && !QoRHpC4k2.equals(defpackage.z9.SH1y5HwkJhh) && !QoRHpC4k2.equals(defpackage.z9.JlrlGoKF)) {
                        str = QoRHpC4k2.toString();
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

    /* JADX WARN: Code restructure failed: missing block: B:27:0x0063, code lost:
    
        if (r5.SH1y5HwkJhh() == false) goto L43;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x0065, code lost:
    
        r5.EXtogiMhuM();
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void v5iciZok(long j, defpackage.ec ecVar) {
        defpackage.x9 x9Var;
        defpackage.ec ecVar2;
        defpackage.ec ecVar3;
        while (ecVar.adDC3e2L < j && (ecVar3 = (defpackage.ec) ecVar.r1MBDhnF()) != null) {
            ecVar = ecVar3;
        }
        while (true) {
            defpackage.ec ecVar4 = ecVar;
            while (ecVar4.xiZrDbcSW0() && (ecVar2 = (defpackage.ec) ecVar4.r1MBDhnF()) != null) {
                ecVar4 = ecVar2;
            }
            while (true) {
                JlrlGoKF.getClass();
                sun.misc.Unsafe unsafe = defpackage.cb.IHQe1A4L2xu;
                long j2 = QoRHpC4k;
                defpackage.t61 t61Var = (defpackage.t61) unsafe.getObjectVolatile(this, j2);
                if (t61Var.adDC3e2L >= ecVar4.adDC3e2L) {
                    return;
                }
                if (!ecVar4.SyNS6RMn()) {
                    break;
                }
                while (true) {
                    sun.misc.Unsafe unsafe2 = defpackage.cb.IHQe1A4L2xu;
                    x9Var = this;
                    if (unsafe2.compareAndSwapObject(x9Var, QoRHpC4k, t61Var, ecVar4)) {
                        if (t61Var.SH1y5HwkJhh()) {
                            t61Var.EXtogiMhuM();
                            return;
                        }
                        return;
                    } else if (unsafe2.getObjectVolatile(x9Var, j2) != t61Var) {
                        break;
                    } else {
                        this = x9Var;
                    }
                }
                this = x9Var;
            }
            ecVar = ecVar4;
        }
    }

    public final boolean xiZrDbcSW0(long j) {
        return j < EXtogiMhuM.get(this) || j < AARZUJiTa.get(this) + ((long) this.adDC3e2L);
    }

    public final void yIx6ChFVk(defpackage.fn1 fn1Var, boolean z) {
        if (fn1Var instanceof defpackage.ab) {
            ((defpackage.ej) fn1Var).SH1y5HwkJhh(new defpackage.p11(z ? EgCjBq0SZwJ() : fnWB2E7cs()));
            return;
        }
        if (fn1Var instanceof defpackage.yy0) {
            ((defpackage.yy0) fn1Var).adDC3e2L.SH1y5HwkJhh(new defpackage.dc(new defpackage.bc(kd6TUFXn())));
            return;
        }
        if (!(fn1Var instanceof defpackage.u9)) {
            defpackage.db.xiZrDbcSW0(fn1Var, "Unexpected waiter: ");
            return;
        }
        defpackage.u9 u9Var = (defpackage.u9) fn1Var;
        defpackage.bb bbVar = u9Var.xiZrDbcSW0;
        bbVar.getClass();
        u9Var.xiZrDbcSW0 = null;
        u9Var.adDC3e2L = defpackage.z9.JlrlGoKF;
        java.lang.Throwable kd6TUFXn2 = u9Var.AARZUJiTa.kd6TUFXn();
        if (kd6TUFXn2 == null) {
            bbVar.SH1y5HwkJhh(java.lang.Boolean.FALSE);
        } else {
            bbVar.SH1y5HwkJhh(new defpackage.p11(kd6TUFXn2));
        }
    }
}
