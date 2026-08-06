package defpackage;

/* loaded from: classes.dex */
public class c90 implements defpackage.u80 {
    public static final /* synthetic */ long AARZUJiTa;
    public static final /* synthetic */ long EXtogiMhuM;
    public static final /* synthetic */ java.util.concurrent.atomic.AtomicReferenceFieldUpdater adDC3e2L = java.util.concurrent.atomic.AtomicReferenceFieldUpdater.newUpdater(defpackage.c90.class, java.lang.Object.class, "_state$volatile");
    public static final /* synthetic */ java.util.concurrent.atomic.AtomicReferenceFieldUpdater xiZrDbcSW0;
    private volatile /* synthetic */ java.lang.Object _parentHandle$volatile;
    private volatile /* synthetic */ java.lang.Object _state$volatile;

    static {
        sun.misc.Unsafe unsafe = defpackage.cb.IHQe1A4L2xu;
        EXtogiMhuM = unsafe.objectFieldOffset(defpackage.c90.class.getDeclaredField("_state$volatile"));
        xiZrDbcSW0 = java.util.concurrent.atomic.AtomicReferenceFieldUpdater.newUpdater(defpackage.c90.class, java.lang.Object.class, "_parentHandle$volatile");
        AARZUJiTa = unsafe.objectFieldOffset(defpackage.c90.class.getDeclaredField("_parentHandle$volatile"));
    }

    public c90(boolean z) {
        this._state$volatile = z ? defpackage.gq1.ez2rX8ReCYw : defpackage.gq1.SH1y5HwkJhh;
    }

    public static java.lang.String OtkytngK3Mr(java.lang.Object obj) {
        if (!(obj instanceof defpackage.b90)) {
            return obj instanceof defpackage.x40 ? ((defpackage.x40) obj).oh6vYeIP() ? "Active" : "New" : obj instanceof defpackage.bf ? "Cancelled" : "Completed";
        }
        defpackage.b90 b90Var = (defpackage.b90) obj;
        return b90Var.xiZrDbcSW0() ? "Cancelling" : defpackage.b90.xiZrDbcSW0.get(b90Var) != 0 ? "Completing" : "Active";
    }

    public static defpackage.jc QUKZkWRtw6(defpackage.jf0 jf0Var) {
        while (jf0Var.SyNS6RMn()) {
            jf0Var = jf0Var.DFo87pBq1E5();
        }
        while (true) {
            jf0Var = jf0Var.JlrlGoKF();
            if (!jf0Var.SyNS6RMn()) {
                if (jf0Var instanceof defpackage.jc) {
                    return (defpackage.jc) jf0Var;
                }
                if (jf0Var instanceof defpackage.kp0) {
                    return null;
                }
            }
        }
    }

    public final java.lang.Object AsxAYCCkb3Hi(java.lang.Object obj) {
        java.lang.Object NWDBeGGF;
        do {
            NWDBeGGF = NWDBeGGF(hkbnNdmy(), obj);
            if (NWDBeGGF == defpackage.gq1.adDC3e2L) {
                java.lang.String str = "Job " + this + " is already complete or completing, but is being completed with " + obj;
                defpackage.bf bfVar = obj instanceof defpackage.bf ? (defpackage.bf) obj : null;
                throw new java.lang.IllegalStateException(str, bfVar != null ? bfVar.IHQe1A4L2xu : null);
            }
        } while (NWDBeGGF == defpackage.gq1.AARZUJiTa);
        return NWDBeGGF;
    }

    @Override // defpackage.u80
    public final java.lang.Object C0U8sNJm(defpackage.fj fjVar) {
        java.lang.Object hkbnNdmy;
        defpackage.ok1 ok1Var;
        do {
            hkbnNdmy = hkbnNdmy();
            boolean z = hkbnNdmy instanceof defpackage.x40;
            ok1Var = defpackage.ok1.IHQe1A4L2xu;
            if (!z) {
                defpackage.x80.G3OKOH3wZRC(fjVar.xiZrDbcSW0());
                return ok1Var;
            }
        } while (d6FAb9xVJ8GU(hkbnNdmy) < 0);
        defpackage.bb bbVar = new defpackage.bb(1, defpackage.c80.V7bD7b8KA(fjVar));
        bbVar.PAEGRtP0bX();
        bbVar.C0U8sNJm(new defpackage.ya(2, defpackage.x80.UsuH8pd5P(this, true, new defpackage.s11(bbVar))));
        java.lang.Object kNAkVymC = bbVar.kNAkVymC();
        defpackage.vj vjVar = defpackage.vj.adDC3e2L;
        if (kNAkVymC != vjVar) {
            kNAkVymC = ok1Var;
        }
        return kNAkVymC == vjVar ? kNAkVymC : ok1Var;
    }

    public final boolean D2vUnMij(java.lang.Throwable th) {
        if (EoOhNTTfIN7K()) {
            return true;
        }
        boolean z = th instanceof java.util.concurrent.CancellationException;
        defpackage.ic lpprD5VAS = lpprD5VAS();
        return (lpprD5VAS == null || lpprD5VAS == defpackage.pp0.adDC3e2L) ? z : lpprD5VAS.r1MBDhnF(th) || z;
    }

    @Override // defpackage.lj
    public final java.lang.Object EgCjBq0SZwJ(defpackage.k00 k00Var, java.lang.Object obj) {
        return k00Var.adDC3e2L(obj, this);
    }

    public boolean EoOhNTTfIN7K() {
        return this instanceof defpackage.i8;
    }

    @Override // defpackage.u80
    public void F7NU4MC0GW(java.util.concurrent.CancellationException cancellationException) {
        if (cancellationException == null) {
            cancellationException = new defpackage.v80(frpfPPIgqM9O(), null, this);
        }
        v5iciZok(cancellationException);
    }

    public final boolean FyULxpbU8bu(defpackage.b90 b90Var, defpackage.jc jcVar, java.lang.Object obj) {
        while (defpackage.x80.UsuH8pd5P(jcVar.JlrlGoKF, false, new defpackage.a90(this, b90Var, jcVar, obj)) == defpackage.pp0.adDC3e2L) {
            jcVar = QUKZkWRtw6(jcVar);
            if (jcVar == null) {
                return false;
            }
        }
        return true;
    }

    public final void JcqDrWrgMf(defpackage.y80 y80Var) {
        y80Var.AARZUJiTa(new defpackage.kp0());
        defpackage.jf0 JlrlGoKF = y80Var.JlrlGoKF();
        while (true) {
            adDC3e2L.getClass();
            sun.misc.Unsafe unsafe = defpackage.cb.IHQe1A4L2xu;
            long j = EXtogiMhuM;
            defpackage.c90 c90Var = this;
            defpackage.y80 y80Var2 = y80Var;
            if (unsafe.compareAndSwapObject(c90Var, j, y80Var2, JlrlGoKF) || unsafe.getObjectVolatile(c90Var, j) != y80Var2) {
                return;
            }
            this = c90Var;
            y80Var = y80Var2;
        }
    }

    @Override // defpackage.lj
    public final defpackage.lj JlrlGoKF(defpackage.lj ljVar) {
        return defpackage.ci0.hkbnNdmy(this, ljVar);
    }

    public final java.lang.Object NWDBeGGF(java.lang.Object obj, java.lang.Object obj2) {
        if (!(obj instanceof defpackage.x40)) {
            return defpackage.gq1.adDC3e2L;
        }
        if (((obj instanceof defpackage.ht) || (obj instanceof defpackage.y80)) && !(obj instanceof defpackage.jc) && !(obj2 instanceof defpackage.bf)) {
            return qvFH3dnF((defpackage.x40) obj, obj2) ? obj2 : defpackage.gq1.AARZUJiTa;
        }
        defpackage.x40 x40Var = (defpackage.x40) obj;
        defpackage.kp0 Uv8CGu3G = Uv8CGu3G(x40Var);
        if (Uv8CGu3G == null) {
            return defpackage.gq1.AARZUJiTa;
        }
        defpackage.b90 b90Var = x40Var instanceof defpackage.b90 ? (defpackage.b90) x40Var : null;
        if (b90Var == null) {
            b90Var = new defpackage.b90(Uv8CGu3G, null);
        }
        synchronized (b90Var) {
            java.util.concurrent.atomic.AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = defpackage.b90.xiZrDbcSW0;
            if (atomicIntegerFieldUpdater.get(b90Var) != 0) {
                return defpackage.gq1.adDC3e2L;
            }
            atomicIntegerFieldUpdater.set(b90Var, 1);
            if (b90Var != x40Var) {
                java.util.concurrent.atomic.AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = adDC3e2L;
                while (!atomicReferenceFieldUpdater.compareAndSet(this, x40Var, b90Var)) {
                    if (atomicReferenceFieldUpdater.get(this) != x40Var) {
                        return defpackage.gq1.AARZUJiTa;
                    }
                }
            }
            boolean xiZrDbcSW02 = b90Var.xiZrDbcSW0();
            defpackage.bf bfVar = obj2 instanceof defpackage.bf ? (defpackage.bf) obj2 : null;
            if (bfVar != null) {
                b90Var.IHQe1A4L2xu(bfVar.IHQe1A4L2xu);
            }
            java.lang.Throwable adDC3e2L2 = xiZrDbcSW02 ? null : b90Var.adDC3e2L();
            if (adDC3e2L2 != null) {
                nVhUznk1t(Uv8CGu3G, adDC3e2L2);
            }
            defpackage.jc QUKZkWRtw6 = QUKZkWRtw6(Uv8CGu3G);
            if (QUKZkWRtw6 != null && FyULxpbU8bu(b90Var, QUKZkWRtw6, obj2)) {
                return defpackage.gq1.xiZrDbcSW0;
            }
            Uv8CGu3G.adDC3e2L(new defpackage.ue0(2), 2);
            defpackage.jc QUKZkWRtw62 = QUKZkWRtw6(Uv8CGu3G);
            return (QUKZkWRtw62 == null || !FyULxpbU8bu(b90Var, QUKZkWRtw62, obj2)) ? wll2JLbTBC2(b90Var, obj2) : defpackage.gq1.xiZrDbcSW0;
        }
    }

    public final void QPwENk36pDC(defpackage.u80 u80Var) {
        defpackage.pp0 pp0Var = defpackage.pp0.adDC3e2L;
        if (u80Var == null) {
            sJNB7mCer5(pp0Var);
            return;
        }
        u80Var.start();
        defpackage.ic ez2rX8ReCYw = u80Var.ez2rX8ReCYw(this);
        sJNB7mCer5(ez2rX8ReCYw);
        if (hkbnNdmy() instanceof defpackage.x40) {
            return;
        }
        ez2rX8ReCYw.IHQe1A4L2xu();
        sJNB7mCer5(pp0Var);
    }

    public void QQUzIjv3iOC5(java.lang.Object obj) {
        NHJTzaLwkd(obj);
    }

    public java.lang.String RmCzwkUxICV() {
        return getClass().getSimpleName();
    }

    public boolean SiPhmbmu(java.lang.Throwable th) {
        if (th instanceof java.util.concurrent.CancellationException) {
            return true;
        }
        return nBH8hAHy(th) && mAr5m2L7gYDP();
    }

    public boolean TFRaUu83X3E(java.lang.Throwable th) {
        return false;
    }

    @Override // defpackage.u80
    public final defpackage.kq UsuH8pd5P(boolean z, boolean z2, defpackage.xiZrDbcSW0 xizrdbcsw0) {
        return Ye0N2xE9Hc(z2, z ? new defpackage.m80(xizrdbcsw0) : new defpackage.n80(xizrdbcsw0));
    }

    public final defpackage.kp0 Uv8CGu3G(defpackage.x40 x40Var) {
        defpackage.kp0 F7NU4MC0GW = x40Var.F7NU4MC0GW();
        if (F7NU4MC0GW != null) {
            return F7NU4MC0GW;
        }
        if (x40Var instanceof defpackage.ht) {
            return new defpackage.kp0();
        }
        if (x40Var instanceof defpackage.y80) {
            JcqDrWrgMf((defpackage.y80) x40Var);
            return null;
        }
        defpackage.db.xiZrDbcSW0(x40Var, "State should have list: ");
        return null;
    }

    @Override // defpackage.lj
    public final defpackage.lj V7bD7b8KA(defpackage.kj kjVar) {
        return defpackage.ci0.XZx205DYe(this, kjVar);
    }

    public final java.lang.Throwable XZx205DYe(defpackage.b90 b90Var, java.util.ArrayList arrayList) {
        java.lang.Object obj;
        java.lang.Object obj2 = null;
        if (arrayList.isEmpty()) {
            if (b90Var.xiZrDbcSW0()) {
                return new defpackage.v80(frpfPPIgqM9O(), null, this);
            }
            return null;
        }
        int size = arrayList.size();
        int i = 0;
        int i2 = 0;
        while (true) {
            if (i2 >= size) {
                obj = null;
                break;
            }
            obj = arrayList.get(i2);
            i2++;
            if (!(((java.lang.Throwable) obj) instanceof java.util.concurrent.CancellationException)) {
                break;
            }
        }
        java.lang.Throwable th = (java.lang.Throwable) obj;
        if (th != null) {
            return th;
        }
        java.lang.Throwable th2 = (java.lang.Throwable) arrayList.get(0);
        if (th2 instanceof defpackage.yg1) {
            int size2 = arrayList.size();
            while (true) {
                if (i >= size2) {
                    break;
                }
                java.lang.Object obj3 = arrayList.get(i);
                i++;
                java.lang.Throwable th3 = (java.lang.Throwable) obj3;
                if (th3 != th2 && (th3 instanceof defpackage.yg1)) {
                    obj2 = obj3;
                    break;
                }
            }
            java.lang.Throwable th4 = (java.lang.Throwable) obj2;
            if (th4 != null) {
                return th4;
            }
        }
        return th2;
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x0074, code lost:
    
        return r5;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final defpackage.kq Ye0N2xE9Hc(boolean z, defpackage.y80 y80Var) {
        defpackage.c90 c90Var;
        defpackage.y80 y80Var2;
        defpackage.pp0 pp0Var;
        boolean adDC3e2L2;
        y80Var.ez2rX8ReCYw = this;
        loop0: while (true) {
            java.lang.Object hkbnNdmy = this.hkbnNdmy();
            if (hkbnNdmy instanceof defpackage.ht) {
                defpackage.ht htVar = (defpackage.ht) hkbnNdmy;
                if (htVar.adDC3e2L) {
                    while (true) {
                        adDC3e2L.getClass();
                        sun.misc.Unsafe unsafe = defpackage.cb.IHQe1A4L2xu;
                        long j = EXtogiMhuM;
                        c90Var = this;
                        y80Var2 = y80Var;
                        if (unsafe.compareAndSwapObject(c90Var, j, hkbnNdmy, y80Var2)) {
                            break loop0;
                        }
                        if (unsafe.getObjectVolatile(c90Var, j) != hkbnNdmy) {
                            break;
                        }
                        this = c90Var;
                        y80Var = y80Var2;
                    }
                } else {
                    c90Var = this;
                    y80Var2 = y80Var;
                    c90Var.mL9sMlGfef(htVar);
                }
                this = c90Var;
                y80Var = y80Var2;
            } else {
                c90Var = this;
                y80Var2 = y80Var;
                boolean z2 = hkbnNdmy instanceof defpackage.x40;
                pp0Var = defpackage.pp0.adDC3e2L;
                if (z2) {
                    defpackage.x40 x40Var = (defpackage.x40) hkbnNdmy;
                    defpackage.kp0 F7NU4MC0GW = x40Var.F7NU4MC0GW();
                    if (F7NU4MC0GW == null) {
                        c90Var.JcqDrWrgMf((defpackage.y80) hkbnNdmy);
                    } else {
                        if (y80Var2.kd6TUFXn()) {
                            defpackage.b90 b90Var = x40Var instanceof defpackage.b90 ? (defpackage.b90) x40Var : null;
                            java.lang.Throwable adDC3e2L3 = b90Var != null ? b90Var.adDC3e2L() : null;
                            if (adDC3e2L3 == null) {
                                adDC3e2L2 = F7NU4MC0GW.adDC3e2L(y80Var2, 5);
                            } else if (z) {
                                y80Var2.EgCjBq0SZwJ(adDC3e2L3);
                                return pp0Var;
                            }
                        } else {
                            adDC3e2L2 = F7NU4MC0GW.adDC3e2L(y80Var2, 1);
                        }
                        if (adDC3e2L2) {
                            break;
                        }
                    }
                    this = c90Var;
                    y80Var = y80Var2;
                } else if (z) {
                    java.lang.Object hkbnNdmy2 = c90Var.hkbnNdmy();
                    defpackage.bf bfVar = hkbnNdmy2 instanceof defpackage.bf ? (defpackage.bf) hkbnNdmy2 : null;
                    y80Var2.EgCjBq0SZwJ(bfVar != null ? bfVar.IHQe1A4L2xu : null);
                }
            }
        }
        return pp0Var;
    }

    public final boolean cSNyPqwud(defpackage.x40 x40Var, java.lang.Throwable th) {
        defpackage.kp0 Uv8CGu3G = Uv8CGu3G(x40Var);
        if (Uv8CGu3G == null) {
            return false;
        }
        defpackage.b90 b90Var = new defpackage.b90(Uv8CGu3G, th);
        while (true) {
            adDC3e2L.getClass();
            sun.misc.Unsafe unsafe = defpackage.cb.IHQe1A4L2xu;
            long j = EXtogiMhuM;
            defpackage.c90 c90Var = this;
            defpackage.x40 x40Var2 = x40Var;
            if (unsafe.compareAndSwapObject(c90Var, j, x40Var2, b90Var)) {
                c90Var.nVhUznk1t(Uv8CGu3G, th);
                return true;
            }
            if (unsafe.getObjectVolatile(c90Var, j) != x40Var2) {
                return false;
            }
            this = c90Var;
            x40Var = x40Var2;
        }
    }

    @Override // defpackage.lj
    public final defpackage.jj cnag84Bm(defpackage.kj kjVar) {
        return defpackage.ci0.NHJTzaLwkd(this, kjVar);
    }

    public final int d6FAb9xVJ8GU(java.lang.Object obj) {
        sun.misc.Unsafe unsafe;
        sun.misc.Unsafe unsafe2;
        boolean z = obj instanceof defpackage.ht;
        long j = EXtogiMhuM;
        java.util.concurrent.atomic.AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = adDC3e2L;
        if (z) {
            if (((defpackage.ht) obj).adDC3e2L) {
                return 0;
            }
            defpackage.ht htVar = defpackage.gq1.ez2rX8ReCYw;
            do {
                atomicReferenceFieldUpdater.getClass();
                unsafe2 = defpackage.cb.IHQe1A4L2xu;
                if (unsafe2.compareAndSwapObject(this, EXtogiMhuM, obj, htVar)) {
                    CGXpA9s3RjIa();
                    return 1;
                }
            } while (unsafe2.getObjectVolatile(this, j) == obj);
            return -1;
        }
        if (!(obj instanceof defpackage.w40)) {
            return 0;
        }
        defpackage.kp0 kp0Var = ((defpackage.w40) obj).adDC3e2L;
        do {
            atomicReferenceFieldUpdater.getClass();
            unsafe = defpackage.cb.IHQe1A4L2xu;
            if (unsafe.compareAndSwapObject(this, EXtogiMhuM, obj, kp0Var)) {
                CGXpA9s3RjIa();
                return 1;
            }
        } while (unsafe.getObjectVolatile(this, j) == obj);
        return -1;
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x007a, code lost:
    
        return r5;
     */
    @Override // defpackage.u80
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final defpackage.ic ez2rX8ReCYw(defpackage.c90 c90Var) {
        defpackage.c90 c90Var2;
        defpackage.jc jcVar = new defpackage.jc(c90Var);
        jcVar.ez2rX8ReCYw = this;
        loop0: while (true) {
            java.lang.Object hkbnNdmy = this.hkbnNdmy();
            if (hkbnNdmy instanceof defpackage.ht) {
                defpackage.ht htVar = (defpackage.ht) hkbnNdmy;
                if (htVar.adDC3e2L) {
                    while (true) {
                        adDC3e2L.getClass();
                        sun.misc.Unsafe unsafe = defpackage.cb.IHQe1A4L2xu;
                        long j = EXtogiMhuM;
                        c90Var2 = this;
                        if (unsafe.compareAndSwapObject(c90Var2, j, hkbnNdmy, jcVar)) {
                            break loop0;
                        }
                        if (unsafe.getObjectVolatile(c90Var2, j) != hkbnNdmy) {
                            break;
                        }
                        this = c90Var2;
                    }
                } else {
                    c90Var2 = this;
                    c90Var2.mL9sMlGfef(htVar);
                }
                this = c90Var2;
            } else {
                c90Var2 = this;
                boolean z = hkbnNdmy instanceof defpackage.x40;
                defpackage.pp0 pp0Var = defpackage.pp0.adDC3e2L;
                if (!z) {
                    java.lang.Object hkbnNdmy2 = c90Var2.hkbnNdmy();
                    defpackage.bf bfVar = hkbnNdmy2 instanceof defpackage.bf ? (defpackage.bf) hkbnNdmy2 : null;
                    jcVar.EgCjBq0SZwJ(bfVar != null ? bfVar.IHQe1A4L2xu : null);
                    return pp0Var;
                }
                defpackage.kp0 F7NU4MC0GW = ((defpackage.x40) hkbnNdmy).F7NU4MC0GW();
                if (F7NU4MC0GW == null) {
                    c90Var2.JcqDrWrgMf((defpackage.y80) hkbnNdmy);
                    this = c90Var2;
                } else if (!F7NU4MC0GW.adDC3e2L(jcVar, 7)) {
                    boolean adDC3e2L2 = F7NU4MC0GW.adDC3e2L(jcVar, 3);
                    java.lang.Object hkbnNdmy3 = c90Var2.hkbnNdmy();
                    if (hkbnNdmy3 instanceof defpackage.b90) {
                        r0 = ((defpackage.b90) hkbnNdmy3).adDC3e2L();
                    } else {
                        defpackage.bf bfVar2 = hkbnNdmy3 instanceof defpackage.bf ? (defpackage.bf) hkbnNdmy3 : null;
                        if (bfVar2 != null) {
                            r0 = bfVar2.IHQe1A4L2xu;
                        }
                    }
                    jcVar.EgCjBq0SZwJ(r0);
                    if (adDC3e2L2) {
                        break loop0;
                    }
                    return pp0Var;
                }
            }
        }
    }

    public java.lang.String frpfPPIgqM9O() {
        return "Job was cancelled";
    }

    public final void gG5uWf3dqScO(defpackage.y80 y80Var) {
        defpackage.c90 c90Var;
        while (true) {
            java.lang.Object hkbnNdmy = this.hkbnNdmy();
            if (!(hkbnNdmy instanceof defpackage.y80)) {
                if (!(hkbnNdmy instanceof defpackage.x40) || ((defpackage.x40) hkbnNdmy).F7NU4MC0GW() == null) {
                    return;
                }
                y80Var.cnag84Bm();
                return;
            }
            if (hkbnNdmy != y80Var) {
                return;
            }
            defpackage.ht htVar = defpackage.gq1.ez2rX8ReCYw;
            while (true) {
                adDC3e2L.getClass();
                sun.misc.Unsafe unsafe = defpackage.cb.IHQe1A4L2xu;
                long j = EXtogiMhuM;
                c90Var = this;
                if (unsafe.compareAndSwapObject(c90Var, j, hkbnNdmy, htVar)) {
                    return;
                }
                if (unsafe.getObjectVolatile(c90Var, j) != hkbnNdmy) {
                    break;
                } else {
                    this = c90Var;
                }
            }
            this = c90Var;
        }
    }

    @Override // defpackage.jj
    public final defpackage.kj getKey() {
        return defpackage.n.lpprD5VAS;
    }

    public final java.lang.Object hkbnNdmy() {
        adDC3e2L.getClass();
        return defpackage.cb.IHQe1A4L2xu.getObjectVolatile(this, EXtogiMhuM);
    }

    public boolean hyxIchWRW() {
        return this instanceof defpackage.ye;
    }

    @Override // defpackage.u80
    public final boolean isCancelled() {
        java.lang.Object hkbnNdmy = hkbnNdmy();
        if (hkbnNdmy instanceof defpackage.bf) {
            return true;
        }
        return (hkbnNdmy instanceof defpackage.b90) && ((defpackage.b90) hkbnNdmy).xiZrDbcSW0();
    }

    @Override // defpackage.u80
    public final defpackage.kq kNAkVymC(defpackage.g00 g00Var) {
        return Ye0N2xE9Hc(true, new defpackage.n80(g00Var));
    }

    @Override // defpackage.u80
    public final java.util.concurrent.CancellationException kd6TUFXn() {
        java.util.concurrent.CancellationException cancellationException;
        java.lang.Object hkbnNdmy = hkbnNdmy();
        if (hkbnNdmy instanceof defpackage.b90) {
            java.lang.Throwable adDC3e2L2 = ((defpackage.b90) hkbnNdmy).adDC3e2L();
            if (adDC3e2L2 == null) {
                defpackage.db.xiZrDbcSW0(this, "Job is still new or active: ");
                return null;
            }
            java.lang.String concat = getClass().getSimpleName().concat(" is cancelling");
            cancellationException = adDC3e2L2 instanceof java.util.concurrent.CancellationException ? (java.util.concurrent.CancellationException) adDC3e2L2 : null;
            return cancellationException == null ? new defpackage.v80(concat, adDC3e2L2, this) : cancellationException;
        }
        if (hkbnNdmy instanceof defpackage.x40) {
            defpackage.db.xiZrDbcSW0(this, "Job is still new or active: ");
            return null;
        }
        if (!(hkbnNdmy instanceof defpackage.bf)) {
            return new defpackage.v80(getClass().getSimpleName().concat(" has completed normally"), null, this);
        }
        java.lang.Throwable th = ((defpackage.bf) hkbnNdmy).IHQe1A4L2xu;
        cancellationException = th instanceof java.util.concurrent.CancellationException ? (java.util.concurrent.CancellationException) th : null;
        return cancellationException == null ? new defpackage.v80(frpfPPIgqM9O(), th, this) : cancellationException;
    }

    public final defpackage.ic lpprD5VAS() {
        xiZrDbcSW0.getClass();
        return (defpackage.ic) defpackage.cb.IHQe1A4L2xu.getObjectVolatile(this, AARZUJiTa);
    }

    public boolean mAr5m2L7gYDP() {
        return true;
    }

    public final void mL9sMlGfef(defpackage.ht htVar) {
        defpackage.kp0 kp0Var = new defpackage.kp0();
        defpackage.x40 w40Var = htVar.adDC3e2L ? kp0Var : new defpackage.w40(kp0Var);
        while (true) {
            adDC3e2L.getClass();
            sun.misc.Unsafe unsafe = defpackage.cb.IHQe1A4L2xu;
            long j = EXtogiMhuM;
            defpackage.c90 c90Var = this;
            defpackage.ht htVar2 = htVar;
            if (unsafe.compareAndSwapObject(c90Var, j, htVar2, w40Var) || unsafe.getObjectVolatile(c90Var, j) != htVar2) {
                return;
            }
            this = c90Var;
            htVar = htVar2;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x0038, code lost:
    
        if (r0 == defpackage.gq1.xiZrDbcSW0) goto L65;
     */
    /* JADX WARN: Code restructure failed: missing block: B:48:0x0059, code lost:
    
        r0 = r8;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean nBH8hAHy(java.lang.Object obj) {
        defpackage.et etVar;
        java.lang.Object obj2 = defpackage.gq1.adDC3e2L;
        if (hyxIchWRW()) {
            do {
                java.lang.Object hkbnNdmy = hkbnNdmy();
                if (hkbnNdmy instanceof defpackage.x40) {
                    if (hkbnNdmy instanceof defpackage.b90) {
                        if (defpackage.b90.xiZrDbcSW0.get((defpackage.b90) hkbnNdmy) != 0) {
                        }
                    }
                    obj2 = NWDBeGGF(hkbnNdmy, new defpackage.bf(yIx6ChFVk(obj), false));
                }
                obj2 = defpackage.gq1.adDC3e2L;
                break;
            } while (obj2 == defpackage.gq1.AARZUJiTa);
        }
        if (obj2 == defpackage.gq1.adDC3e2L) {
            java.lang.Throwable th = null;
            while (true) {
                java.lang.Object hkbnNdmy2 = hkbnNdmy();
                if (!(hkbnNdmy2 instanceof defpackage.b90)) {
                    if (!(hkbnNdmy2 instanceof defpackage.x40)) {
                        etVar = defpackage.gq1.EXtogiMhuM;
                        break;
                    }
                    if (th == null) {
                        th = yIx6ChFVk(obj);
                    }
                    defpackage.x40 x40Var = (defpackage.x40) hkbnNdmy2;
                    if (!x40Var.oh6vYeIP()) {
                        java.lang.Object NWDBeGGF = NWDBeGGF(hkbnNdmy2, new defpackage.bf(th, false));
                        if (NWDBeGGF == defpackage.gq1.adDC3e2L) {
                            defpackage.db.xiZrDbcSW0(hkbnNdmy2, "Cannot happen in ");
                            return false;
                        }
                        if (NWDBeGGF != defpackage.gq1.AARZUJiTa) {
                            obj2 = NWDBeGGF;
                            break;
                        }
                    } else if (cSNyPqwud(x40Var, th)) {
                        etVar = defpackage.gq1.adDC3e2L;
                        break;
                    }
                } else {
                    synchronized (hkbnNdmy2) {
                        if (((defpackage.b90) hkbnNdmy2).r1MBDhnF() == defpackage.gq1.riuEU0zW4) {
                            etVar = defpackage.gq1.EXtogiMhuM;
                        } else {
                            boolean xiZrDbcSW02 = ((defpackage.b90) hkbnNdmy2).xiZrDbcSW0();
                            if (th == null) {
                                th = yIx6ChFVk(obj);
                            }
                            ((defpackage.b90) hkbnNdmy2).IHQe1A4L2xu(th);
                            java.lang.Throwable adDC3e2L2 = xiZrDbcSW02 ? null : ((defpackage.b90) hkbnNdmy2).adDC3e2L();
                            if (adDC3e2L2 != null) {
                                nVhUznk1t(((defpackage.b90) hkbnNdmy2).adDC3e2L, adDC3e2L2);
                            }
                            etVar = defpackage.gq1.adDC3e2L;
                        }
                    }
                }
            }
        }
        if (obj2 != defpackage.gq1.adDC3e2L && obj2 != defpackage.gq1.xiZrDbcSW0) {
            if (obj2 == defpackage.gq1.EXtogiMhuM) {
                return false;
            }
            NHJTzaLwkd(obj2);
            return true;
        }
        return true;
    }

    public final void nVhUznk1t(defpackage.kp0 kp0Var, java.lang.Throwable th) {
        kp0Var.adDC3e2L(new defpackage.ue0(4), 4);
        java.lang.Object ez2rX8ReCYw = kp0Var.ez2rX8ReCYw();
        ez2rX8ReCYw.getClass();
        defpackage.cf cfVar = null;
        for (defpackage.jf0 jf0Var = (defpackage.jf0) ez2rX8ReCYw; !jf0Var.equals(kp0Var); jf0Var = jf0Var.JlrlGoKF()) {
            if ((jf0Var instanceof defpackage.y80) && ((defpackage.y80) jf0Var).kd6TUFXn()) {
                try {
                    ((defpackage.y80) jf0Var).EgCjBq0SZwJ(th);
                } catch (java.lang.Throwable th2) {
                    if (cfVar != null) {
                        defpackage.x70.cnag84Bm(cfVar, th2);
                    } else {
                        cfVar = new defpackage.cf("Exception in completion handler " + jf0Var + " for " + this, th2);
                    }
                }
            }
        }
        if (cfVar != null) {
            WLpAkxCo(cfVar);
        }
        D2vUnMij(th);
    }

    @Override // defpackage.u80
    public boolean oh6vYeIP() {
        java.lang.Object hkbnNdmy = hkbnNdmy();
        return (hkbnNdmy instanceof defpackage.x40) && ((defpackage.x40) hkbnNdmy).oh6vYeIP();
    }

    public final void p4kuH6PDtgom(defpackage.x40 x40Var, java.lang.Object obj) {
        defpackage.ic lpprD5VAS = lpprD5VAS();
        if (lpprD5VAS != null) {
            lpprD5VAS.IHQe1A4L2xu();
            sJNB7mCer5(defpackage.pp0.adDC3e2L);
        }
        defpackage.cf cfVar = null;
        defpackage.bf bfVar = obj instanceof defpackage.bf ? (defpackage.bf) obj : null;
        java.lang.Throwable th = bfVar != null ? bfVar.IHQe1A4L2xu : null;
        if (x40Var instanceof defpackage.y80) {
            try {
                ((defpackage.y80) x40Var).EgCjBq0SZwJ(th);
                return;
            } catch (java.lang.Throwable th2) {
                WLpAkxCo(new defpackage.cf("Exception in completion handler " + x40Var + " for " + this, th2));
                return;
            }
        }
        defpackage.kp0 F7NU4MC0GW = x40Var.F7NU4MC0GW();
        if (F7NU4MC0GW != null) {
            F7NU4MC0GW.adDC3e2L(new defpackage.ue0(1), 1);
            java.lang.Object ez2rX8ReCYw = F7NU4MC0GW.ez2rX8ReCYw();
            ez2rX8ReCYw.getClass();
            for (defpackage.jf0 jf0Var = (defpackage.jf0) ez2rX8ReCYw; !jf0Var.equals(F7NU4MC0GW); jf0Var = jf0Var.JlrlGoKF()) {
                if (jf0Var instanceof defpackage.y80) {
                    try {
                        ((defpackage.y80) jf0Var).EgCjBq0SZwJ(th);
                    } catch (java.lang.Throwable th3) {
                        if (cfVar != null) {
                            defpackage.x70.cnag84Bm(cfVar, th3);
                        } else {
                            cfVar = new defpackage.cf("Exception in completion handler " + jf0Var + " for " + this, th3);
                        }
                    }
                }
            }
            if (cfVar != null) {
                WLpAkxCo(cfVar);
            }
        }
    }

    public final boolean qvFH3dnF(defpackage.x40 x40Var, java.lang.Object obj) {
        java.lang.Object y40Var = obj instanceof defpackage.x40 ? new defpackage.y40((defpackage.x40) obj) : obj;
        while (true) {
            adDC3e2L.getClass();
            sun.misc.Unsafe unsafe = defpackage.cb.IHQe1A4L2xu;
            long j = EXtogiMhuM;
            defpackage.c90 c90Var = this;
            defpackage.x40 x40Var2 = x40Var;
            if (unsafe.compareAndSwapObject(c90Var, j, x40Var2, y40Var)) {
                c90Var.AQHddgaEX(obj);
                c90Var.p4kuH6PDtgom(x40Var2, obj);
                return true;
            }
            if (unsafe.getObjectVolatile(c90Var, j) != x40Var2) {
                return false;
            }
            this = c90Var;
            x40Var = x40Var2;
        }
    }

    public final void sJNB7mCer5(defpackage.ic icVar) {
        xiZrDbcSW0.getClass();
        defpackage.cb.IHQe1A4L2xu.putObjectVolatile(this, AARZUJiTa, icVar);
    }

    @Override // defpackage.u80
    public final boolean start() {
        int d6FAb9xVJ8GU;
        do {
            d6FAb9xVJ8GU = d6FAb9xVJ8GU(hkbnNdmy());
            if (d6FAb9xVJ8GU == 0) {
                return false;
            }
        } while (d6FAb9xVJ8GU != 1);
        return true;
    }

    public final java.lang.String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append(RmCzwkUxICV() + '{' + OtkytngK3Mr(hkbnNdmy()) + '}');
        sb.append('@');
        sb.append(defpackage.fm.UsuH8pd5P(this));
        return sb.toString();
    }

    public void v5iciZok(java.util.concurrent.CancellationException cancellationException) {
        nBH8hAHy(cancellationException);
    }

    public final boolean wKlPRKlRnfqr(java.lang.Object obj) {
        java.lang.Object NWDBeGGF;
        do {
            NWDBeGGF = NWDBeGGF(hkbnNdmy(), obj);
            if (NWDBeGGF == defpackage.gq1.adDC3e2L) {
                return false;
            }
            if (NWDBeGGF == defpackage.gq1.xiZrDbcSW0) {
                return true;
            }
        } while (NWDBeGGF == defpackage.gq1.AARZUJiTa);
        NHJTzaLwkd(NWDBeGGF);
        return true;
    }

    public final java.lang.Object wll2JLbTBC2(defpackage.b90 b90Var, java.lang.Object obj) {
        defpackage.b90 b90Var2;
        java.lang.Throwable th;
        java.lang.Throwable XZx205DYe;
        defpackage.c90 c90Var;
        defpackage.b90 b90Var3;
        defpackage.bf bfVar = obj instanceof defpackage.bf ? (defpackage.bf) obj : null;
        java.lang.Throwable th2 = bfVar != null ? bfVar.IHQe1A4L2xu : null;
        synchronized (b90Var) {
            try {
                b90Var.xiZrDbcSW0();
                java.util.ArrayList AARZUJiTa2 = b90Var.AARZUJiTa(th2);
                XZx205DYe = XZx205DYe(b90Var, AARZUJiTa2);
                if (XZx205DYe != null) {
                    try {
                        if (AARZUJiTa2.size() > 1) {
                            java.util.Set newSetFromMap = java.util.Collections.newSetFromMap(new java.util.IdentityHashMap(AARZUJiTa2.size()));
                            int size = AARZUJiTa2.size();
                            int i = 0;
                            while (i < size) {
                                java.lang.Object obj2 = AARZUJiTa2.get(i);
                                i++;
                                java.lang.Throwable th3 = (java.lang.Throwable) obj2;
                                if (th3 != XZx205DYe && th3 != XZx205DYe && !(th3 instanceof java.util.concurrent.CancellationException) && newSetFromMap.add(th3)) {
                                    defpackage.x70.cnag84Bm(XZx205DYe, th3);
                                }
                            }
                        }
                    } catch (java.lang.Throwable th4) {
                        th = th4;
                        b90Var2 = b90Var;
                        throw th;
                    }
                }
            } catch (java.lang.Throwable th5) {
                b90Var2 = b90Var;
                th = th5;
            }
        }
        if (XZx205DYe != null && XZx205DYe != th2) {
            obj = new defpackage.bf(XZx205DYe, false);
        }
        if (XZx205DYe != null && (D2vUnMij(XZx205DYe) || TFRaUu83X3E(XZx205DYe))) {
            obj.getClass();
            defpackage.bf.oh6vYeIP.compareAndSet((defpackage.bf) obj, 0, 1);
        }
        AQHddgaEX(obj);
        java.util.concurrent.atomic.AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = adDC3e2L;
        java.lang.Object y40Var = obj instanceof defpackage.x40 ? new defpackage.y40((defpackage.x40) obj) : obj;
        while (true) {
            atomicReferenceFieldUpdater.getClass();
            sun.misc.Unsafe unsafe = defpackage.cb.IHQe1A4L2xu;
            long j = EXtogiMhuM;
            c90Var = this;
            b90Var3 = b90Var;
            if (!unsafe.compareAndSwapObject(c90Var, j, b90Var3, y40Var) && unsafe.getObjectVolatile(c90Var, j) == b90Var3) {
                this = c90Var;
                b90Var = b90Var3;
            }
        }
        c90Var.p4kuH6PDtgom(b90Var3, obj);
        return obj;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v10, types: [java.lang.Throwable] */
    /* JADX WARN: Type inference failed for: r0v6, types: [java.lang.Throwable] */
    public final java.lang.Throwable yIx6ChFVk(java.lang.Object obj) {
        java.util.concurrent.CancellationException cancellationException;
        if (obj instanceof java.lang.Throwable) {
            return (java.lang.Throwable) obj;
        }
        defpackage.c90 c90Var = (defpackage.c90) obj;
        java.lang.Object hkbnNdmy = c90Var.hkbnNdmy();
        if (hkbnNdmy instanceof defpackage.b90) {
            cancellationException = ((defpackage.b90) hkbnNdmy).adDC3e2L();
        } else if (hkbnNdmy instanceof defpackage.bf) {
            cancellationException = ((defpackage.bf) hkbnNdmy).IHQe1A4L2xu;
        } else {
            if (hkbnNdmy instanceof defpackage.x40) {
                defpackage.db.xiZrDbcSW0(hkbnNdmy, "Cannot be cancelling child in this state: ");
                return null;
            }
            cancellationException = null;
        }
        java.util.concurrent.CancellationException cancellationException2 = cancellationException instanceof java.util.concurrent.CancellationException ? cancellationException : null;
        return cancellationException2 == null ? new defpackage.v80("Parent job is ".concat(OtkytngK3Mr(hkbnNdmy)), cancellationException, c90Var) : cancellationException2;
    }

    public void CGXpA9s3RjIa() {
    }

    public void AQHddgaEX(java.lang.Object obj) {
    }

    public void NHJTzaLwkd(java.lang.Object obj) {
    }

    public void WLpAkxCo(defpackage.cf cfVar) {
        throw cfVar;
    }
}
