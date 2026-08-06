package defpackage;

/* loaded from: classes.dex */
public class bb extends defpackage.yp implements defpackage.ab, defpackage.wj, defpackage.fn1 {
    public static final /* synthetic */ long DFo87pBq1E5;
    public static final /* synthetic */ java.util.concurrent.atomic.AtomicReferenceFieldUpdater JlrlGoKF;
    public static final /* synthetic */ long SyNS6RMn;
    public final defpackage.ej EXtogiMhuM;
    private volatile /* synthetic */ int _decisionAndIndex$volatile;
    private volatile /* synthetic */ java.lang.Object _parentHandle$volatile;
    private volatile /* synthetic */ java.lang.Object _state$volatile;
    public final defpackage.lj riuEU0zW4;
    public static final /* synthetic */ java.util.concurrent.atomic.AtomicIntegerFieldUpdater SH1y5HwkJhh = java.util.concurrent.atomic.AtomicIntegerFieldUpdater.newUpdater(defpackage.bb.class, "_decisionAndIndex$volatile");
    public static final /* synthetic */ java.util.concurrent.atomic.AtomicReferenceFieldUpdater ez2rX8ReCYw = java.util.concurrent.atomic.AtomicReferenceFieldUpdater.newUpdater(defpackage.bb.class, java.lang.Object.class, "_state$volatile");

    static {
        sun.misc.Unsafe unsafe = defpackage.cb.IHQe1A4L2xu;
        SyNS6RMn = unsafe.objectFieldOffset(defpackage.bb.class.getDeclaredField("_state$volatile"));
        JlrlGoKF = java.util.concurrent.atomic.AtomicReferenceFieldUpdater.newUpdater(defpackage.bb.class, java.lang.Object.class, "_parentHandle$volatile");
        DFo87pBq1E5 = unsafe.objectFieldOffset(defpackage.bb.class.getDeclaredField("_parentHandle$volatile"));
    }

    public bb(int i, defpackage.ej ejVar) {
        super(i);
        this.EXtogiMhuM = ejVar;
        this.riuEU0zW4 = ejVar.xiZrDbcSW0();
        this._decisionAndIndex$volatile = 536870911;
        this._state$volatile = defpackage.fzubgBFo.IHQe1A4L2xu;
    }

    public static void nBH8hAHy(java.lang.Object obj, java.lang.Object obj2) {
        throw new java.lang.IllegalStateException(("It's prohibited to register multiple handlers, tried to register " + obj + ", already has " + obj2).toString());
    }

    public static java.lang.Object yIx6ChFVk(defpackage.rp0 rp0Var, java.lang.Object obj, int i, defpackage.l00 l00Var) {
        if (obj instanceof defpackage.bf) {
            return obj;
        }
        if (i != 1 && i != 2) {
            return obj;
        }
        if (l00Var != null || (rp0Var instanceof defpackage.ya)) {
            return new defpackage.ze(obj, rp0Var instanceof defpackage.ya ? (defpackage.ya) rp0Var : null, l00Var, (java.lang.Throwable) null, 16);
        }
        return obj;
    }

    @Override // defpackage.yp
    public final java.lang.Object AARZUJiTa(java.lang.Object obj) {
        return obj instanceof defpackage.ze ? ((defpackage.ze) obj).IHQe1A4L2xu : obj;
    }

    /* JADX WARN: Code restructure failed: missing block: B:72:0x00ce, code lost:
    
        nBH8hAHy(r11, r7);
     */
    /* JADX WARN: Code restructure failed: missing block: B:73:0x00d1, code lost:
    
        throw null;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void C0U8sNJm(defpackage.rp0 rp0Var) {
        defpackage.bb bbVar;
        sun.misc.Unsafe unsafe;
        defpackage.bb bbVar2;
        while (true) {
            ez2rX8ReCYw.getClass();
            sun.misc.Unsafe unsafe2 = defpackage.cb.IHQe1A4L2xu;
            long j = SyNS6RMn;
            java.lang.Object objectVolatile = unsafe2.getObjectVolatile(this, j);
            if (objectVolatile instanceof defpackage.fzubgBFo) {
                while (true) {
                    sun.misc.Unsafe unsafe3 = defpackage.cb.IHQe1A4L2xu;
                    bbVar = this;
                    if (unsafe3.compareAndSwapObject(bbVar, SyNS6RMn, objectVolatile, rp0Var)) {
                        return;
                    }
                    if (unsafe3.getObjectVolatile(bbVar, j) != objectVolatile) {
                        break;
                    } else {
                        this = bbVar;
                    }
                }
            } else {
                bbVar = this;
                if ((objectVolatile instanceof defpackage.ya) || (objectVolatile instanceof defpackage.t61)) {
                    break;
                }
                if (objectVolatile instanceof defpackage.bf) {
                    defpackage.bf bfVar = (defpackage.bf) objectVolatile;
                    if (!defpackage.bf.oh6vYeIP.compareAndSet(bfVar, 0, 1)) {
                        nBH8hAHy(rp0Var, objectVolatile);
                        throw null;
                    }
                    if (objectVolatile instanceof defpackage.fb) {
                        java.lang.Throwable th = bfVar.IHQe1A4L2xu;
                        if (rp0Var instanceof defpackage.ya) {
                            bbVar.ez2rX8ReCYw((defpackage.ya) rp0Var, th);
                            return;
                        } else {
                            rp0Var.getClass();
                            bbVar.SyNS6RMn((defpackage.t61) rp0Var, th);
                            return;
                        }
                    }
                    return;
                }
                if (objectVolatile instanceof defpackage.ze) {
                    defpackage.ze zeVar = (defpackage.ze) objectVolatile;
                    if (zeVar.oh6vYeIP != null) {
                        nBH8hAHy(rp0Var, objectVolatile);
                        throw null;
                    }
                    if (rp0Var instanceof defpackage.t61) {
                        return;
                    }
                    rp0Var.getClass();
                    defpackage.ya yaVar = (defpackage.ya) rp0Var;
                    java.lang.Throwable th2 = zeVar.adDC3e2L;
                    if (th2 != null) {
                        bbVar.ez2rX8ReCYw(yaVar, th2);
                        return;
                    }
                    defpackage.ze IHQe1A4L2xu = defpackage.ze.IHQe1A4L2xu(zeVar, yaVar, null, 29);
                    do {
                        unsafe = defpackage.cb.IHQe1A4L2xu;
                        bbVar2 = bbVar;
                        if (unsafe.compareAndSwapObject(bbVar, SyNS6RMn, objectVolatile, IHQe1A4L2xu)) {
                            return;
                        } else {
                            bbVar = bbVar2;
                        }
                    } while (unsafe.getObjectVolatile(bbVar2, j) == objectVolatile);
                } else {
                    defpackage.bb bbVar3 = bbVar;
                    if (rp0Var instanceof defpackage.t61) {
                        return;
                    }
                    rp0Var.getClass();
                    defpackage.ze zeVar2 = new defpackage.ze(objectVolatile, (defpackage.ya) rp0Var, (defpackage.l00) null, (java.lang.Throwable) null, 28);
                    while (true) {
                        defpackage.ze zeVar3 = zeVar2;
                        sun.misc.Unsafe unsafe4 = defpackage.cb.IHQe1A4L2xu;
                        bbVar = bbVar3;
                        boolean compareAndSwapObject = unsafe4.compareAndSwapObject(bbVar, SyNS6RMn, objectVolatile, zeVar3);
                        zeVar2 = zeVar3;
                        if (compareAndSwapObject) {
                            return;
                        }
                        if (unsafe4.getObjectVolatile(bbVar, j) != objectVolatile) {
                            break;
                        } else {
                            bbVar3 = bbVar;
                        }
                    }
                }
            }
            this = bbVar;
        }
    }

    public final void D2vUnMij() {
        java.lang.Throwable kd6TUFXn;
        defpackage.ej ejVar = this.EXtogiMhuM;
        defpackage.wp wpVar = ejVar instanceof defpackage.wp ? (defpackage.wp) ejVar : null;
        if (wpVar == null || (kd6TUFXn = wpVar.kd6TUFXn(this)) == null) {
            return;
        }
        cnag84Bm();
        fnWB2E7cs(kd6TUFXn);
    }

    @Override // defpackage.ab
    public final void DFo87pBq1E5(java.lang.Object obj, defpackage.l00 l00Var) {
        SiPhmbmu(obj, this.AARZUJiTa, l00Var);
    }

    public final defpackage.kq EgCjBq0SZwJ() {
        JlrlGoKF.getClass();
        return (defpackage.kq) defpackage.cb.IHQe1A4L2xu.getObjectVolatile(this, DFo87pBq1E5);
    }

    @Override // defpackage.yp
    public final defpackage.ej F7NU4MC0GW() {
        return this.EXtogiMhuM;
    }

    public final void G3OKOH3wZRC(int i) {
        java.util.concurrent.atomic.AtomicIntegerFieldUpdater atomicIntegerFieldUpdater;
        int i2;
        do {
            atomicIntegerFieldUpdater = SH1y5HwkJhh;
            i2 = atomicIntegerFieldUpdater.get(this);
            int i3 = i2 >> 29;
            if (i3 != 0) {
                if (i3 != 1) {
                    defpackage.db.AARZUJiTa("Already resumed");
                    return;
                }
                boolean z = i == 4;
                defpackage.ej ejVar = this.EXtogiMhuM;
                if (!z && (ejVar instanceof defpackage.wp)) {
                    boolean z2 = i == 1 || i == 2;
                    int i4 = this.AARZUJiTa;
                    if (z2 == (i4 == 1 || i4 == 2)) {
                        defpackage.wp wpVar = (defpackage.wp) ejVar;
                        defpackage.nj njVar = wpVar.EXtogiMhuM;
                        defpackage.lj xiZrDbcSW0 = wpVar.riuEU0zW4.xiZrDbcSW0();
                        if (njVar.frpfPPIgqM9O(xiZrDbcSW0)) {
                            njVar.v5iciZok(xiZrDbcSW0, this);
                            return;
                        }
                        defpackage.hu IHQe1A4L2xu = defpackage.lg1.IHQe1A4L2xu();
                        if (IHQe1A4L2xu.AARZUJiTa >= 4294967296L) {
                            IHQe1A4L2xu.yIx6ChFVk(this);
                            return;
                        }
                        IHQe1A4L2xu.wll2JLbTBC2(true);
                        try {
                            defpackage.fm.mAr5m2L7gYDP(this, ejVar, true);
                            do {
                            } while (IHQe1A4L2xu.mAr5m2L7gYDP());
                        } finally {
                            try {
                                return;
                            } finally {
                            }
                        }
                        return;
                    }
                }
                defpackage.fm.mAr5m2L7gYDP(this, ejVar, z);
                return;
            }
        } while (!atomicIntegerFieldUpdater.compareAndSet(this, i2, 1073741824 + (536870911 & i2)));
    }

    @Override // defpackage.fn1
    public final void IHQe1A4L2xu(defpackage.t61 t61Var, int i) {
        java.util.concurrent.atomic.AtomicIntegerFieldUpdater atomicIntegerFieldUpdater;
        int i2;
        do {
            atomicIntegerFieldUpdater = SH1y5HwkJhh;
            i2 = atomicIntegerFieldUpdater.get(this);
            if ((i2 & 536870911) != 536870911) {
                defpackage.db.AARZUJiTa("invokeOnCancellation should be called at most once");
                return;
            }
        } while (!atomicIntegerFieldUpdater.compareAndSet(this, i2, ((i2 >> 29) << 29) + i));
        C0U8sNJm(t61Var);
    }

    public final void JlrlGoKF(defpackage.l00 l00Var, java.lang.Throwable th, java.lang.Object obj) {
        defpackage.lj ljVar = this.riuEU0zW4;
        try {
            l00Var.F7NU4MC0GW(th, obj, ljVar);
        } catch (java.lang.Throwable th2) {
            defpackage.gq1.kNAkVymC(ljVar, new defpackage.cf("Exception in resume onCancellation handler for " + this, th2));
        }
    }

    public final defpackage.kq NHJTzaLwkd() {
        defpackage.u80 u80Var = (defpackage.u80) this.riuEU0zW4.cnag84Bm(defpackage.n.lpprD5VAS);
        if (u80Var == null) {
            return null;
        }
        defpackage.kq UsuH8pd5P = defpackage.x80.UsuH8pd5P(u80Var, true, new defpackage.hc(this));
        while (true) {
            JlrlGoKF.getClass();
            sun.misc.Unsafe unsafe = defpackage.cb.IHQe1A4L2xu;
            long j = DFo87pBq1E5;
            defpackage.bb bbVar = this;
            if (!unsafe.compareAndSwapObject(bbVar, j, (java.lang.Object) null, UsuH8pd5P) && unsafe.getObjectVolatile(bbVar, j) == null) {
                this = bbVar;
            }
        }
        return UsuH8pd5P;
    }

    public final void PAEGRtP0bX() {
        defpackage.kq NHJTzaLwkd = NHJTzaLwkd();
        if (NHJTzaLwkd == null || (V7bD7b8KA() instanceof defpackage.rp0)) {
            return;
        }
        NHJTzaLwkd.IHQe1A4L2xu();
        JlrlGoKF.getClass();
        defpackage.cb.IHQe1A4L2xu.putObjectVolatile(this, DFo87pBq1E5, defpackage.pp0.adDC3e2L);
    }

    public final void QQUzIjv3iOC5(defpackage.g00 g00Var) {
        C0U8sNJm(new defpackage.ya(1, g00Var));
    }

    @Override // defpackage.ab
    public final defpackage.et QoRHpC4k(java.lang.Object obj, defpackage.l00 l00Var) {
        return wll2JLbTBC2(obj, l00Var);
    }

    @Override // defpackage.ej
    public final void SH1y5HwkJhh(java.lang.Object obj) {
        java.lang.Throwable IHQe1A4L2xu = defpackage.q11.IHQe1A4L2xu(obj);
        if (IHQe1A4L2xu != null) {
            obj = new defpackage.bf(IHQe1A4L2xu, false);
        }
        SiPhmbmu(obj, this.AARZUJiTa, null);
    }

    public final void SiPhmbmu(java.lang.Object obj, int i, defpackage.l00 l00Var) {
        defpackage.bb bbVar;
        while (true) {
            ez2rX8ReCYw.getClass();
            sun.misc.Unsafe unsafe = defpackage.cb.IHQe1A4L2xu;
            long j = SyNS6RMn;
            java.lang.Object objectVolatile = unsafe.getObjectVolatile(this, j);
            if (!(objectVolatile instanceof defpackage.rp0)) {
                defpackage.bb bbVar2 = this;
                if (objectVolatile instanceof defpackage.fb) {
                    defpackage.fb fbVar = (defpackage.fb) objectVolatile;
                    if (defpackage.fb.r1MBDhnF.compareAndSet(fbVar, 0, 1)) {
                        if (l00Var != null) {
                            bbVar2.JlrlGoKF(l00Var, fbVar.IHQe1A4L2xu, obj);
                            return;
                        }
                        return;
                    }
                }
                defpackage.db.xiZrDbcSW0(obj, "Already resumed, but proposed with update ");
                return;
            }
            java.lang.Object yIx6ChFVk = yIx6ChFVk((defpackage.rp0) objectVolatile, obj, i, l00Var);
            while (true) {
                sun.misc.Unsafe unsafe2 = defpackage.cb.IHQe1A4L2xu;
                bbVar = this;
                if (unsafe2.compareAndSwapObject(bbVar, SyNS6RMn, objectVolatile, yIx6ChFVk)) {
                    if (!bbVar.UsuH8pd5P()) {
                        bbVar.cnag84Bm();
                    }
                    bbVar.G3OKOH3wZRC(i);
                    return;
                } else if (unsafe2.getObjectVolatile(bbVar, j) != objectVolatile) {
                    break;
                } else {
                    this = bbVar;
                }
            }
            this = bbVar;
        }
    }

    public final void SyNS6RMn(defpackage.t61 t61Var, java.lang.Throwable th) {
        defpackage.lj ljVar = this.riuEU0zW4;
        int i = SH1y5HwkJhh.get(this) & 536870911;
        if (i == 536870911) {
            defpackage.db.AARZUJiTa("The index for Segment.onCancellation(..) is broken");
            return;
        }
        try {
            t61Var.JlrlGoKF(i, ljVar);
        } catch (java.lang.Throwable th2) {
            defpackage.gq1.kNAkVymC(ljVar, new defpackage.cf("Exception in invokeOnCancellation handler for " + this, th2));
        }
    }

    public final boolean UsuH8pd5P() {
        return this.AARZUJiTa == 2 && ((defpackage.wp) this.EXtogiMhuM).cnag84Bm();
    }

    public final java.lang.Object V7bD7b8KA() {
        ez2rX8ReCYw.getClass();
        return defpackage.cb.IHQe1A4L2xu.getObjectVolatile(this, SyNS6RMn);
    }

    @Override // defpackage.ab
    public final void abhbClRa(java.lang.Object obj) {
        G3OKOH3wZRC(this.AARZUJiTa);
    }

    @Override // defpackage.yp
    public final java.lang.Throwable adDC3e2L(java.lang.Object obj) {
        java.lang.Throwable adDC3e2L = super.adDC3e2L(obj);
        if (adDC3e2L != null) {
            return adDC3e2L;
        }
        return null;
    }

    public final void cnag84Bm() {
        defpackage.kq EgCjBq0SZwJ = EgCjBq0SZwJ();
        if (EgCjBq0SZwJ == null) {
            return;
        }
        EgCjBq0SZwJ.IHQe1A4L2xu();
        JlrlGoKF.getClass();
        defpackage.cb.IHQe1A4L2xu.putObjectVolatile(this, DFo87pBq1E5, defpackage.pp0.adDC3e2L);
    }

    public final void ez2rX8ReCYw(defpackage.ya yaVar, java.lang.Throwable th) {
        try {
            switch (yaVar.IHQe1A4L2xu) {
                case 0:
                    ((java.util.concurrent.ScheduledFuture) yaVar.oh6vYeIP).cancel(false);
                    break;
                case 1:
                    ((defpackage.g00) yaVar.oh6vYeIP).AARZUJiTa(th);
                    break;
                default:
                    ((defpackage.kq) yaVar.oh6vYeIP).IHQe1A4L2xu();
                    break;
            }
        } catch (java.lang.Throwable th2) {
            defpackage.gq1.kNAkVymC(this.riuEU0zW4, new defpackage.cf("Exception in invokeOnCancellation handler for " + this, th2));
        }
    }

    @Override // defpackage.ab
    public final boolean fnWB2E7cs(java.lang.Throwable th) {
        defpackage.bb bbVar;
        while (true) {
            ez2rX8ReCYw.getClass();
            sun.misc.Unsafe unsafe = defpackage.cb.IHQe1A4L2xu;
            long j = SyNS6RMn;
            java.lang.Object objectVolatile = unsafe.getObjectVolatile(this, j);
            if (!(objectVolatile instanceof defpackage.rp0)) {
                return false;
            }
            defpackage.fb fbVar = new defpackage.fb(this, th, (objectVolatile instanceof defpackage.ya) || (objectVolatile instanceof defpackage.t61));
            while (true) {
                sun.misc.Unsafe unsafe2 = defpackage.cb.IHQe1A4L2xu;
                bbVar = this;
                if (unsafe2.compareAndSwapObject(bbVar, SyNS6RMn, objectVolatile, fbVar)) {
                    defpackage.rp0 rp0Var = (defpackage.rp0) objectVolatile;
                    if (rp0Var instanceof defpackage.ya) {
                        bbVar.ez2rX8ReCYw((defpackage.ya) objectVolatile, th);
                    } else if (rp0Var instanceof defpackage.t61) {
                        bbVar.SyNS6RMn((defpackage.t61) objectVolatile, th);
                    }
                    if (!bbVar.UsuH8pd5P()) {
                        bbVar.cnag84Bm();
                    }
                    bbVar.G3OKOH3wZRC(bbVar.AARZUJiTa);
                    return true;
                }
                if (unsafe2.getObjectVolatile(bbVar, j) != objectVolatile) {
                    break;
                }
                this = bbVar;
            }
            this = bbVar;
        }
    }

    public final boolean frpfPPIgqM9O() {
        ez2rX8ReCYw.getClass();
        sun.misc.Unsafe unsafe = defpackage.cb.IHQe1A4L2xu;
        long j = SyNS6RMn;
        java.lang.Object objectVolatile = unsafe.getObjectVolatile(this, j);
        if ((objectVolatile instanceof defpackage.ze) && ((defpackage.ze) objectVolatile).F7NU4MC0GW != null) {
            cnag84Bm();
            return false;
        }
        SH1y5HwkJhh.set(this, 536870911);
        unsafe.putObjectVolatile(this, j, defpackage.fzubgBFo.IHQe1A4L2xu);
        return true;
    }

    public final java.lang.Object kNAkVymC() {
        java.util.concurrent.atomic.AtomicIntegerFieldUpdater atomicIntegerFieldUpdater;
        int i;
        defpackage.u80 u80Var;
        boolean UsuH8pd5P = UsuH8pd5P();
        do {
            atomicIntegerFieldUpdater = SH1y5HwkJhh;
            i = atomicIntegerFieldUpdater.get(this);
            int i2 = i >> 29;
            if (i2 != 0) {
                if (i2 != 2) {
                    defpackage.db.AARZUJiTa("Already suspended");
                    return null;
                }
                if (UsuH8pd5P) {
                    D2vUnMij();
                }
                java.lang.Object V7bD7b8KA = V7bD7b8KA();
                if (V7bD7b8KA instanceof defpackage.bf) {
                    throw ((defpackage.bf) V7bD7b8KA).IHQe1A4L2xu;
                }
                int i3 = this.AARZUJiTa;
                if ((i3 != 1 && i3 != 2) || (u80Var = (defpackage.u80) this.riuEU0zW4.cnag84Bm(defpackage.n.lpprD5VAS)) == null || u80Var.oh6vYeIP()) {
                    return AARZUJiTa(V7bD7b8KA);
                }
                java.util.concurrent.CancellationException kd6TUFXn = u80Var.kd6TUFXn();
                oh6vYeIP(kd6TUFXn);
                throw kd6TUFXn;
            }
        } while (!atomicIntegerFieldUpdater.compareAndSet(this, i, 536870912 + (536870911 & i)));
        if (EgCjBq0SZwJ() == null) {
            NHJTzaLwkd();
        }
        if (UsuH8pd5P) {
            D2vUnMij();
        }
        return defpackage.vj.adDC3e2L;
    }

    public java.lang.Throwable kd6TUFXn(defpackage.c90 c90Var) {
        return c90Var.kd6TUFXn();
    }

    @Override // defpackage.yp
    public final void oh6vYeIP(java.util.concurrent.CancellationException cancellationException) {
        java.util.concurrent.CancellationException cancellationException2;
        defpackage.bb bbVar;
        while (true) {
            ez2rX8ReCYw.getClass();
            sun.misc.Unsafe unsafe = defpackage.cb.IHQe1A4L2xu;
            long j = SyNS6RMn;
            java.lang.Object objectVolatile = unsafe.getObjectVolatile(this, j);
            if (objectVolatile instanceof defpackage.rp0) {
                defpackage.db.AARZUJiTa("Not completed");
                return;
            }
            if (objectVolatile instanceof defpackage.bf) {
                return;
            }
            if (objectVolatile instanceof defpackage.ze) {
                defpackage.ze zeVar = (defpackage.ze) objectVolatile;
                if (zeVar.adDC3e2L != null) {
                    defpackage.db.AARZUJiTa("Must be called at most once");
                    return;
                }
                defpackage.ze IHQe1A4L2xu = defpackage.ze.IHQe1A4L2xu(zeVar, null, cancellationException, 15);
                while (true) {
                    sun.misc.Unsafe unsafe2 = defpackage.cb.IHQe1A4L2xu;
                    defpackage.bb bbVar2 = this;
                    if (unsafe2.compareAndSwapObject(bbVar2, SyNS6RMn, objectVolatile, IHQe1A4L2xu)) {
                        defpackage.ya yaVar = zeVar.oh6vYeIP;
                        if (yaVar != null) {
                            bbVar2.ez2rX8ReCYw(yaVar, cancellationException);
                        }
                        defpackage.l00 l00Var = zeVar.r1MBDhnF;
                        if (l00Var != null) {
                            bbVar2.JlrlGoKF(l00Var, cancellationException, zeVar.IHQe1A4L2xu);
                            return;
                        }
                        return;
                    }
                    if (unsafe2.getObjectVolatile(bbVar2, j) != objectVolatile) {
                        cancellationException2 = cancellationException;
                        bbVar = bbVar2;
                        break;
                    }
                    this = bbVar2;
                }
            } else {
                defpackage.bb bbVar3 = this;
                java.util.concurrent.CancellationException cancellationException3 = cancellationException;
                defpackage.ze zeVar2 = new defpackage.ze(objectVolatile, (defpackage.ya) null, (defpackage.l00) null, cancellationException3, 14);
                cancellationException2 = cancellationException3;
                while (true) {
                    defpackage.ze zeVar3 = zeVar2;
                    sun.misc.Unsafe unsafe3 = defpackage.cb.IHQe1A4L2xu;
                    bbVar = bbVar3;
                    boolean compareAndSwapObject = unsafe3.compareAndSwapObject(bbVar, SyNS6RMn, objectVolatile, zeVar3);
                    zeVar2 = zeVar3;
                    if (compareAndSwapObject) {
                        return;
                    }
                    if (unsafe3.getObjectVolatile(bbVar, j) != objectVolatile) {
                        break;
                    } else {
                        bbVar3 = bbVar;
                    }
                }
            }
            cancellationException = cancellationException2;
            this = bbVar;
        }
    }

    public final void p4kuH6PDtgom(defpackage.nj njVar) {
        defpackage.ej ejVar = this.EXtogiMhuM;
        defpackage.wp wpVar = ejVar instanceof defpackage.wp ? (defpackage.wp) ejVar : null;
        SiPhmbmu(defpackage.ok1.IHQe1A4L2xu, (wpVar != null ? wpVar.EXtogiMhuM : null) == njVar ? 4 : this.AARZUJiTa, null);
    }

    @Override // defpackage.wj
    public final defpackage.wj r1MBDhnF() {
        defpackage.ej ejVar = this.EXtogiMhuM;
        if (ejVar instanceof defpackage.wj) {
            return (defpackage.wj) ejVar;
        }
        return null;
    }

    @Override // defpackage.yp
    public final java.lang.Object riuEU0zW4() {
        return V7bD7b8KA();
    }

    public final java.lang.String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append(v5iciZok());
        sb.append('(');
        sb.append(defpackage.fm.TFRaUu83X3E(this.EXtogiMhuM));
        sb.append("){");
        java.lang.Object V7bD7b8KA = V7bD7b8KA();
        sb.append(V7bD7b8KA instanceof defpackage.rp0 ? "Active" : V7bD7b8KA instanceof defpackage.fb ? "Cancelled" : "Completed");
        sb.append("}@");
        sb.append(defpackage.fm.UsuH8pd5P(this));
        return sb.toString();
    }

    public java.lang.String v5iciZok() {
        return "CancellableContinuation";
    }

    public final defpackage.et wll2JLbTBC2(java.lang.Object obj, defpackage.l00 l00Var) {
        defpackage.bb bbVar;
        defpackage.et etVar = defpackage.w70.riuEU0zW4;
        while (true) {
            ez2rX8ReCYw.getClass();
            sun.misc.Unsafe unsafe = defpackage.cb.IHQe1A4L2xu;
            long j = SyNS6RMn;
            java.lang.Object objectVolatile = unsafe.getObjectVolatile(this, j);
            if (!(objectVolatile instanceof defpackage.rp0)) {
                return null;
            }
            java.lang.Object yIx6ChFVk = yIx6ChFVk((defpackage.rp0) objectVolatile, obj, this.AARZUJiTa, l00Var);
            while (true) {
                sun.misc.Unsafe unsafe2 = defpackage.cb.IHQe1A4L2xu;
                bbVar = this;
                if (unsafe2.compareAndSwapObject(bbVar, SyNS6RMn, objectVolatile, yIx6ChFVk)) {
                    if (!bbVar.UsuH8pd5P()) {
                        bbVar.cnag84Bm();
                    }
                    return etVar;
                }
                if (unsafe2.getObjectVolatile(bbVar, j) != objectVolatile) {
                    break;
                }
                this = bbVar;
            }
            this = bbVar;
        }
    }

    @Override // defpackage.ej
    public final defpackage.lj xiZrDbcSW0() {
        return this.riuEU0zW4;
    }
}
