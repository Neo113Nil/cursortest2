package defpackage;

/* loaded from: classes.dex */
public final class ma0 implements defpackage.ig, defpackage.us0, defpackage.vg {
    public boolean AARZUJiTa;
    public defpackage.F7NU4MC0GW C0U8sNJm;
    public defpackage.nh D2vUnMij;
    public int DFo87pBq1E5;
    public long EXtogiMhuM;
    public int EgCjBq0SZwJ;
    public defpackage.ma0 G3OKOH3wZRC;
    public defpackage.ma0 JlrlGoKF;
    public boolean NHJTzaLwkd;
    public boolean PAEGRtP0bX;
    public defpackage.ii0 QQUzIjv3iOC5;
    public boolean QoRHpC4k;
    public boolean SH1y5HwkJhh;
    public defpackage.ka0 SiPhmbmu;
    public final defpackage.F7NU4MC0GW SyNS6RMn;
    public int TFRaUu83X3E;
    public defpackage.qn UsuH8pd5P;
    public defpackage.mj0 Uv8CGu3G;
    public defpackage.b71 V7bD7b8KA;
    public boolean WLpAkxCo;
    public defpackage.ab0 XZx205DYe;
    public final defpackage.xl0 abhbClRa;
    public final boolean adDC3e2L;
    public defpackage.xl0 cnag84Bm;
    public boolean ez2rX8ReCYw;
    public boolean fnWB2E7cs;
    public defpackage.ka0 frpfPPIgqM9O;
    public boolean hkbnNdmy;
    public boolean hyxIchWRW;
    public boolean kNAkVymC;
    public defpackage.ts0 kd6TUFXn;
    public defpackage.mj0 lpprD5VAS;
    public defpackage.ip0 mAr5m2L7gYDP;
    public defpackage.w90 nBH8hAHy;
    public boolean p4kuH6PDtgom;
    public boolean riuEU0zW4;
    public defpackage.pm1 v5iciZok;
    public final defpackage.qa0 wll2JLbTBC2;
    public int xiZrDbcSW0;
    public final defpackage.ep0 yIx6ChFVk;
    public static final defpackage.w21 QPwENk36pDC = new defpackage.w21("Undefined intrinsics block and it is required", 1);
    public static final defpackage.ha0 Ye0N2xE9Hc = new defpackage.ha0();
    public static final defpackage.b3 EoOhNTTfIN7K = new defpackage.b3(4);

    public ma0(int i, boolean z) {
        this.adDC3e2L = z;
        this.xiZrDbcSW0 = i;
        this.EXtogiMhuM = 9223372034707292159L;
        this.riuEU0zW4 = true;
        this.SH1y5HwkJhh = true;
        this.SyNS6RMn = new defpackage.F7NU4MC0GW(15, new defpackage.xl0(new defpackage.ma0[16]), new defpackage.s4(5, this));
        this.abhbClRa = new defpackage.xl0(new defpackage.ma0[16]);
        this.NHJTzaLwkd = true;
        this.QQUzIjv3iOC5 = QPwENk36pDC;
        this.UsuH8pd5P = defpackage.pa0.IHQe1A4L2xu;
        this.nBH8hAHy = defpackage.w90.adDC3e2L;
        this.v5iciZok = Ye0N2xE9Hc;
        defpackage.nh.F7NU4MC0GW.getClass();
        this.D2vUnMij = defpackage.mh.oh6vYeIP;
        defpackage.ka0 ka0Var = defpackage.ka0.AARZUJiTa;
        this.frpfPPIgqM9O = ka0Var;
        this.SiPhmbmu = ka0Var;
        this.yIx6ChFVk = new defpackage.ep0(this);
        this.wll2JLbTBC2 = new defpackage.qa0(this);
        this.hyxIchWRW = true;
        this.Uv8CGu3G = defpackage.jj0.IHQe1A4L2xu;
    }

    public static void AsxAYCCkb3Hi(defpackage.ma0 ma0Var) {
        int i = defpackage.la0.IHQe1A4L2xu[ma0Var.wll2JLbTBC2.F7NU4MC0GW.ordinal()];
        defpackage.qa0 qa0Var = ma0Var.wll2JLbTBC2;
        if (i != 1) {
            defpackage.db.SyNS6RMn(qa0Var.F7NU4MC0GW, "Unexpected state ");
            return;
        }
        if (qa0Var.adDC3e2L) {
            Ye0N2xE9Hc(ma0Var, true, 6);
            return;
        }
        if (qa0Var.xiZrDbcSW0) {
            ma0Var.QPwENk36pDC(true);
        }
        if (ma0Var.G3OKOH3wZRC()) {
            wKlPRKlRnfqr(ma0Var, true, 6);
        } else if (ma0Var.QoRHpC4k()) {
            ma0Var.EoOhNTTfIN7K(true);
        }
    }

    private final java.lang.String SH1y5HwkJhh(defpackage.ma0 ma0Var) {
        java.lang.StringBuilder sb = new java.lang.StringBuilder("Cannot insert ");
        sb.append(ma0Var);
        sb.append(" because it already has a parent or an owner. This tree: ");
        sb.append(AARZUJiTa(0));
        sb.append(" Other tree: ");
        defpackage.ma0 ma0Var2 = ma0Var.G3OKOH3wZRC;
        sb.append(ma0Var2 != null ? ma0Var2.AARZUJiTa(0) : null);
        return sb.toString();
    }

    public static void Ye0N2xE9Hc(defpackage.ma0 ma0Var, boolean z, int i) {
        defpackage.ma0 V7bD7b8KA;
        if ((i & 1) != 0) {
            z = false;
        }
        boolean z2 = (i & 2) != 0;
        boolean z3 = (i & 4) != 0;
        if (ma0Var.JlrlGoKF == null) {
            defpackage.x50.oh6vYeIP("Lookahead measure cannot be requested on a node that is not a part of the LookaheadScope");
        }
        defpackage.ts0 ts0Var = ma0Var.kd6TUFXn;
        if (ts0Var == null || ma0Var.fnWB2E7cs || ma0Var.adDC3e2L) {
            return;
        }
        ((defpackage.v0) ts0Var).NHJTzaLwkd(ma0Var, true, z, z2);
        if (z3) {
            defpackage.fg0 fg0Var = ma0Var.wll2JLbTBC2.G3OKOH3wZRC;
            fg0Var.getClass();
            defpackage.qa0 qa0Var = fg0Var.SH1y5HwkJhh;
            defpackage.ma0 V7bD7b8KA2 = qa0Var.IHQe1A4L2xu.V7bD7b8KA();
            defpackage.ka0 ka0Var = qa0Var.IHQe1A4L2xu.frpfPPIgqM9O;
            if (V7bD7b8KA2 == null || ka0Var == defpackage.ka0.AARZUJiTa) {
                return;
            }
            while (V7bD7b8KA2.frpfPPIgqM9O == ka0Var && (V7bD7b8KA = V7bD7b8KA2.V7bD7b8KA()) != null) {
                V7bD7b8KA2 = V7bD7b8KA;
            }
            int ordinal = ka0Var.ordinal();
            if (ordinal == 0) {
                if (V7bD7b8KA2.JlrlGoKF != null) {
                    Ye0N2xE9Hc(V7bD7b8KA2, z, 6);
                    return;
                } else {
                    wKlPRKlRnfqr(V7bD7b8KA2, z, 6);
                    return;
                }
            }
            if (ordinal != 1) {
                defpackage.db.AARZUJiTa("Intrinsics isn't used by the parent");
            } else if (V7bD7b8KA2.JlrlGoKF != null) {
                V7bD7b8KA2.QPwENk36pDC(z);
            } else {
                V7bD7b8KA2.EoOhNTTfIN7K(z);
            }
        }
    }

    public static void wKlPRKlRnfqr(defpackage.ma0 ma0Var, boolean z, int i) {
        defpackage.ts0 ts0Var;
        defpackage.ma0 V7bD7b8KA;
        if ((i & 1) != 0) {
            z = false;
        }
        boolean z2 = (i & 2) != 0;
        boolean z3 = (i & 4) != 0;
        if (ma0Var.fnWB2E7cs || ma0Var.adDC3e2L || (ts0Var = ma0Var.kd6TUFXn) == null) {
            return;
        }
        ((defpackage.v0) ts0Var).NHJTzaLwkd(ma0Var, false, z, z2);
        if (z3) {
            defpackage.qa0 qa0Var = ma0Var.wll2JLbTBC2.QoRHpC4k.SH1y5HwkJhh;
            defpackage.ma0 V7bD7b8KA2 = qa0Var.IHQe1A4L2xu.V7bD7b8KA();
            defpackage.ka0 ka0Var = qa0Var.IHQe1A4L2xu.frpfPPIgqM9O;
            if (V7bD7b8KA2 == null || ka0Var == defpackage.ka0.AARZUJiTa) {
                return;
            }
            while (V7bD7b8KA2.frpfPPIgqM9O == ka0Var && (V7bD7b8KA = V7bD7b8KA2.V7bD7b8KA()) != null) {
                V7bD7b8KA2 = V7bD7b8KA;
            }
            int ordinal = ka0Var.ordinal();
            if (ordinal == 0) {
                wKlPRKlRnfqr(V7bD7b8KA2, z, 6);
            } else if (ordinal == 1) {
                V7bD7b8KA2.EoOhNTTfIN7K(z);
            } else {
                defpackage.db.AARZUJiTa("Intrinsics isn't used by the parent");
            }
        }
    }

    public final java.lang.String AARZUJiTa(int i) {
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        for (int i2 = 0; i2 < i; i2++) {
            sb.append("  ");
        }
        sb.append("|-");
        sb.append(toString());
        sb.append('\n');
        defpackage.xl0 QQUzIjv3iOC5 = QQUzIjv3iOC5();
        java.lang.Object[] objArr = QQUzIjv3iOC5.adDC3e2L;
        int i3 = QQUzIjv3iOC5.AARZUJiTa;
        for (int i4 = 0; i4 < i3; i4++) {
            sb.append(((defpackage.ma0) objArr[i4]).AARZUJiTa(i + 1));
        }
        java.lang.String sb2 = sb.toString();
        return i == 0 ? sb2.substring(0, sb2.length() - 1) : sb2;
    }

    public final void AQHddgaEX(int i) {
        defpackage.ma0 V7bD7b8KA;
        defpackage.ma0 V7bD7b8KA2;
        int i2 = this.TFRaUu83X3E;
        if (i2 != i) {
            if (i > 0 && i2 == 0 && (V7bD7b8KA2 = V7bD7b8KA()) != null) {
                V7bD7b8KA2.AQHddgaEX(V7bD7b8KA2.TFRaUu83X3E + 1);
            }
            if (i == 0 && this.TFRaUu83X3E > 0 && (V7bD7b8KA = V7bD7b8KA()) != null) {
                V7bD7b8KA.AQHddgaEX(V7bD7b8KA.TFRaUu83X3E - 1);
            }
            this.TFRaUu83X3E = i;
        }
    }

    public final void C0U8sNJm(long j, defpackage.d40 d40Var, int i, boolean z) {
        defpackage.ep0 ep0Var = this.yIx6ChFVk;
        defpackage.ip0 ip0Var = ep0Var.F7NU4MC0GW;
        defpackage.w11 w11Var = defpackage.ip0.TFRaUu83X3E;
        ep0Var.F7NU4MC0GW.rzSERzFHIn(defpackage.ip0.QPwENk36pDC, ip0Var.Q1EpAU06IV(j), d40Var, i, z);
    }

    public final void CGXpA9s3RjIa(defpackage.ma0 ma0Var) {
        if (defpackage.x70.QoRHpC4k(ma0Var, this.JlrlGoKF)) {
            return;
        }
        this.JlrlGoKF = ma0Var;
        defpackage.qa0 qa0Var = this.wll2JLbTBC2;
        if (ma0Var != null) {
            if (qa0Var.G3OKOH3wZRC == null) {
                qa0Var.G3OKOH3wZRC = new defpackage.fg0(qa0Var);
            }
            defpackage.ep0 ep0Var = this.yIx6ChFVk;
            defpackage.ip0 ip0Var = ep0Var.r1MBDhnF.fnWB2E7cs;
            for (defpackage.ip0 ip0Var2 = ep0Var.F7NU4MC0GW; !defpackage.x70.QoRHpC4k(ip0Var2, ip0Var) && ip0Var2 != null; ip0Var2 = ip0Var2.fnWB2E7cs) {
                ip0Var2.LoQIcHWpPq();
            }
        } else {
            qa0Var.G3OKOH3wZRC = null;
            qa0Var.xiZrDbcSW0 = false;
            qa0Var.adDC3e2L = false;
        }
        D2vUnMij();
    }

    public final void D2vUnMij() {
        if (this.adDC3e2L) {
            defpackage.ma0 V7bD7b8KA = V7bD7b8KA();
            if (V7bD7b8KA != null) {
                V7bD7b8KA.D2vUnMij();
                return;
            }
            return;
        }
        if (this.JlrlGoKF != null) {
            Ye0N2xE9Hc(this, false, 7);
        } else {
            wKlPRKlRnfqr(this, false, 7);
        }
    }

    public final java.util.List DFo87pBq1E5() {
        return this.wll2JLbTBC2.QoRHpC4k.OtkytngK3Mr();
    }

    public final void EXtogiMhuM() {
        defpackage.a0 a0Var;
        defpackage.na0 na0Var;
        defpackage.ts0 ts0Var = this.kd6TUFXn;
        if (ts0Var == null) {
            java.lang.StringBuilder sb = new java.lang.StringBuilder("Cannot detach node that is already detached!  Tree: ");
            defpackage.ma0 V7bD7b8KA = V7bD7b8KA();
            sb.append(V7bD7b8KA != null ? V7bD7b8KA.AARZUJiTa(0) : null);
            defpackage.x50.r1MBDhnF(sb.toString());
            throw new defpackage.cf();
        }
        defpackage.ma0 V7bD7b8KA2 = V7bD7b8KA();
        defpackage.qa0 qa0Var = this.wll2JLbTBC2;
        if (V7bD7b8KA2 != null) {
            V7bD7b8KA2.nBH8hAHy();
            V7bD7b8KA2.D2vUnMij();
            defpackage.hi0 hi0Var = qa0Var.QoRHpC4k;
            defpackage.ka0 ka0Var = defpackage.ka0.AARZUJiTa;
            hi0Var.QoRHpC4k = ka0Var;
            defpackage.fg0 fg0Var = qa0Var.G3OKOH3wZRC;
            if (fg0Var != null) {
                fg0Var.SyNS6RMn = ka0Var;
            }
        }
        defpackage.na0 na0Var2 = qa0Var.QoRHpC4k.C0U8sNJm;
        na0Var2.oh6vYeIP = true;
        na0Var2.r1MBDhnF = false;
        na0Var2.F7NU4MC0GW = false;
        na0Var2.adDC3e2L = false;
        na0Var2.xiZrDbcSW0 = null;
        defpackage.fg0 fg0Var2 = qa0Var.G3OKOH3wZRC;
        if (fg0Var2 != null && (na0Var = fg0Var2.kNAkVymC) != null) {
            na0Var.oh6vYeIP = true;
            na0Var.r1MBDhnF = false;
            na0Var.F7NU4MC0GW = false;
            na0Var.adDC3e2L = false;
            na0Var.xiZrDbcSW0 = null;
        }
        defpackage.ep0 ep0Var = this.yIx6ChFVk;
        defpackage.lj0 lj0Var = ep0Var.adDC3e2L;
        defpackage.ip0 ip0Var = ep0Var.r1MBDhnF.fnWB2E7cs;
        for (defpackage.ip0 ip0Var2 = ep0Var.F7NU4MC0GW; !defpackage.x70.QoRHpC4k(ip0Var2, ip0Var) && ip0Var2 != null; ip0Var2 = ip0Var2.fnWB2E7cs) {
            ip0Var2.KaQkzhFJpl();
            if (ip0Var2.EgCjBq0SZwJ.yIx6ChFVk()) {
                ip0Var2.xfLc8P5OcmgB();
            }
        }
        for (defpackage.lj0 lj0Var2 = lj0Var; lj0Var2 != null; lj0Var2 = lj0Var2.riuEU0zW4) {
            if (lj0Var2.kd6TUFXn) {
                lj0Var2.Ay906ovssqgN();
            }
        }
        this.fnWB2E7cs = true;
        defpackage.xl0 xl0Var = (defpackage.xl0) this.SyNS6RMn.xiZrDbcSW0;
        java.lang.Object[] objArr = xl0Var.adDC3e2L;
        int i = xl0Var.AARZUJiTa;
        for (int i2 = 0; i2 < i; i2++) {
            ((defpackage.ma0) objArr[i2]).EXtogiMhuM();
        }
        this.fnWB2E7cs = false;
        while (lj0Var != null) {
            if (lj0Var.kd6TUFXn) {
                lj0Var.k3hcgHS3MP();
            }
            lj0Var = lj0Var.riuEU0zW4;
        }
        defpackage.v0 v0Var = (defpackage.v0) ts0Var;
        v0Var.getLayoutNodes().AARZUJiTa(this.xiZrDbcSW0);
        defpackage.fi0 fi0Var = v0Var.nVhUznk1t;
        defpackage.v5 v5Var = fi0Var.oh6vYeIP;
        ((defpackage.c1NqjJifC7) v5Var.oh6vYeIP).riuEU0zW4(this);
        ((defpackage.c1NqjJifC7) v5Var.r1MBDhnF).riuEU0zW4(this);
        ((defpackage.c1NqjJifC7) v5Var.F7NU4MC0GW).riuEU0zW4(this);
        ((defpackage.xl0) fi0Var.adDC3e2L.xiZrDbcSW0).SH1y5HwkJhh(this);
        v0Var.WLpAkxCo = true;
        if (defpackage.v0.xiZrDbcSW0() && (a0Var = v0Var.TFRaUu83X3E) != null && a0Var.ez2rX8ReCYw.adDC3e2L(this.xiZrDbcSW0)) {
            a0Var.adDC3e2L.AARZUJiTa(a0Var.AARZUJiTa, this.xiZrDbcSW0, false);
        }
        v0Var.getRectManager().AARZUJiTa(this);
        this.kd6TUFXn = null;
        CGXpA9s3RjIa(null);
        this.EgCjBq0SZwJ = 0;
        defpackage.hi0 hi0Var2 = qa0Var.QoRHpC4k;
        hi0Var2.DFo87pBq1E5 = Integer.MAX_VALUE;
        hi0Var2.JlrlGoKF = Integer.MAX_VALUE;
        hi0Var2.V7bD7b8KA = false;
        defpackage.fg0 fg0Var3 = qa0Var.G3OKOH3wZRC;
        if (fg0Var3 != null) {
            fg0Var3.DFo87pBq1E5 = Integer.MAX_VALUE;
            fg0Var3.JlrlGoKF = Integer.MAX_VALUE;
            fg0Var3.fnWB2E7cs = defpackage.dg0.AARZUJiTa;
        }
        if (ep0Var.F7NU4MC0GW(8)) {
            defpackage.b71 b71Var = this.V7bD7b8KA;
            this.V7bD7b8KA = null;
            this.kNAkVymC = false;
            v0Var.getSemanticsOwner().oh6vYeIP(this, b71Var);
            v0Var.C0U8sNJm();
        }
    }

    public final defpackage.ka0 EgCjBq0SZwJ() {
        defpackage.ka0 ka0Var;
        defpackage.fg0 fg0Var = this.wll2JLbTBC2.G3OKOH3wZRC;
        return (fg0Var == null || (ka0Var = fg0Var.SyNS6RMn) == null) ? defpackage.ka0.AARZUJiTa : ka0Var;
    }

    public final void EoOhNTTfIN7K(boolean z) {
        defpackage.ts0 ts0Var;
        if (this.adDC3e2L || (ts0Var = this.kd6TUFXn) == null) {
            return;
        }
        ((defpackage.v0) ts0Var).QQUzIjv3iOC5(this, false, z);
    }

    public final void F7NU4MC0GW(defpackage.ts0 ts0Var) {
        defpackage.ma0 ma0Var;
        defpackage.a0 a0Var;
        defpackage.b71 abhbClRa;
        if (this.kd6TUFXn != null) {
            defpackage.x50.oh6vYeIP("Cannot attach " + this + " as it already is attached.  Tree: " + AARZUJiTa(0));
        }
        defpackage.ma0 ma0Var2 = this.G3OKOH3wZRC;
        if (ma0Var2 != null && !defpackage.x70.QoRHpC4k(ma0Var2.kd6TUFXn, ts0Var)) {
            java.lang.StringBuilder sb = new java.lang.StringBuilder("Attaching to a different owner(");
            sb.append(ts0Var);
            sb.append(") than the parent's owner(");
            defpackage.ma0 V7bD7b8KA = V7bD7b8KA();
            sb.append(V7bD7b8KA != null ? V7bD7b8KA.kd6TUFXn : null);
            sb.append("). This tree: ");
            sb.append(AARZUJiTa(0));
            sb.append(" Parent tree: ");
            defpackage.ma0 ma0Var3 = this.G3OKOH3wZRC;
            sb.append(ma0Var3 != null ? ma0Var3.AARZUJiTa(0) : null);
            defpackage.x50.oh6vYeIP(sb.toString());
        }
        defpackage.ma0 V7bD7b8KA2 = V7bD7b8KA();
        defpackage.qa0 qa0Var = this.wll2JLbTBC2;
        if (V7bD7b8KA2 == null) {
            qa0Var.QoRHpC4k.V7bD7b8KA = true;
            ((defpackage.v0) ts0Var).getRectManager().xiZrDbcSW0(this);
            defpackage.fg0 fg0Var = qa0Var.G3OKOH3wZRC;
            if (fg0Var != null) {
                fg0Var.fnWB2E7cs = defpackage.dg0.adDC3e2L;
            }
        }
        defpackage.ep0 ep0Var = this.yIx6ChFVk;
        ep0Var.F7NU4MC0GW.kNAkVymC = V7bD7b8KA2 != null ? V7bD7b8KA2.yIx6ChFVk.r1MBDhnF : null;
        this.kd6TUFXn = ts0Var;
        this.EgCjBq0SZwJ = (V7bD7b8KA2 != null ? V7bD7b8KA2.EgCjBq0SZwJ : -1) + 1;
        defpackage.mj0 mj0Var = this.lpprD5VAS;
        if (mj0Var != null) {
            r1MBDhnF(mj0Var);
        }
        this.lpprD5VAS = null;
        ((defpackage.v0) ts0Var).getLayoutNodes().EXtogiMhuM(this.xiZrDbcSW0, this);
        defpackage.ma0 ma0Var4 = this.G3OKOH3wZRC;
        if (ma0Var4 == null || (ma0Var = ma0Var4.JlrlGoKF) == null) {
            ma0Var = this.JlrlGoKF;
        }
        CGXpA9s3RjIa(ma0Var);
        if (this.JlrlGoKF == null && ep0Var.F7NU4MC0GW(512)) {
            CGXpA9s3RjIa(this);
        }
        if (!this.WLpAkxCo) {
            for (defpackage.lj0 lj0Var = ep0Var.xiZrDbcSW0; lj0Var != null; lj0Var = lj0Var.SH1y5HwkJhh) {
                lj0Var.flIYPhR0();
            }
        }
        defpackage.xl0 xl0Var = (defpackage.xl0) this.SyNS6RMn.xiZrDbcSW0;
        java.lang.Object[] objArr = xl0Var.adDC3e2L;
        int i = xl0Var.AARZUJiTa;
        for (int i2 = 0; i2 < i; i2++) {
            ((defpackage.ma0) objArr[i2]).F7NU4MC0GW(ts0Var);
        }
        if (!this.WLpAkxCo) {
            ep0Var.adDC3e2L();
        }
        D2vUnMij();
        if (V7bD7b8KA2 != null) {
            V7bD7b8KA2.D2vUnMij();
        }
        qa0Var.SH1y5HwkJhh();
        if (!this.WLpAkxCo && ep0Var.F7NU4MC0GW(8)) {
            frpfPPIgqM9O();
        }
        defpackage.v0 v0Var = (defpackage.v0) ts0Var;
        if (!defpackage.v0.xiZrDbcSW0() || (a0Var = v0Var.TFRaUu83X3E) == null || (abhbClRa = abhbClRa()) == null || !abhbClRa.adDC3e2L.oh6vYeIP(defpackage.j71.kd6TUFXn)) {
            return;
        }
        a0Var.ez2rX8ReCYw.IHQe1A4L2xu(this.xiZrDbcSW0);
        a0Var.adDC3e2L.AARZUJiTa(a0Var.AARZUJiTa, this.xiZrDbcSW0, true);
    }

    public final boolean G3OKOH3wZRC() {
        return this.wll2JLbTBC2.QoRHpC4k.abhbClRa;
    }

    @Override // defpackage.ig
    public final void IHQe1A4L2xu() {
        defpackage.ab0 ab0Var = this.XZx205DYe;
        if (ab0Var != null) {
            ab0Var.IHQe1A4L2xu();
        }
        defpackage.ep0 ep0Var = this.yIx6ChFVk;
        defpackage.ip0 ip0Var = ep0Var.r1MBDhnF.fnWB2E7cs;
        for (defpackage.ip0 ip0Var2 = ep0Var.F7NU4MC0GW; !defpackage.x70.QoRHpC4k(ip0Var2, ip0Var) && ip0Var2 != null; ip0Var2 = ip0Var2.fnWB2E7cs) {
            ip0Var2.eSIfjzq9c3LO();
        }
    }

    public final void JcqDrWrgMf(defpackage.mj0 mj0Var) {
        if (this.adDC3e2L && this.Uv8CGu3G != defpackage.jj0.IHQe1A4L2xu) {
            defpackage.x50.IHQe1A4L2xu("Modifiers are not supported on virtual LayoutNodes");
        }
        if (this.WLpAkxCo) {
            defpackage.x50.IHQe1A4L2xu("modifier is updated when deactivated");
        }
        if (!p4kuH6PDtgom()) {
            this.lpprD5VAS = mj0Var;
            return;
        }
        r1MBDhnF(mj0Var);
        if (this.kNAkVymC) {
            frpfPPIgqM9O();
        }
    }

    public final java.util.List JlrlGoKF() {
        defpackage.fg0 fg0Var = this.wll2JLbTBC2.G3OKOH3wZRC;
        fg0Var.getClass();
        defpackage.xl0 xl0Var = fg0Var.V7bD7b8KA;
        defpackage.qa0 qa0Var = fg0Var.SH1y5HwkJhh;
        qa0Var.IHQe1A4L2xu.SyNS6RMn();
        if (!fg0Var.PAEGRtP0bX) {
            return xl0Var.xiZrDbcSW0();
        }
        defpackage.ma0 ma0Var = qa0Var.IHQe1A4L2xu;
        defpackage.xl0 QQUzIjv3iOC5 = ma0Var.QQUzIjv3iOC5();
        java.lang.Object[] objArr = QQUzIjv3iOC5.adDC3e2L;
        int i = QQUzIjv3iOC5.AARZUJiTa;
        for (int i2 = 0; i2 < i; i2++) {
            defpackage.ma0 ma0Var2 = (defpackage.ma0) objArr[i2];
            if (xl0Var.AARZUJiTa <= i2) {
                defpackage.fg0 fg0Var2 = ma0Var2.wll2JLbTBC2.G3OKOH3wZRC;
                fg0Var2.getClass();
                xl0Var.oh6vYeIP(fg0Var2);
            } else {
                defpackage.fg0 fg0Var3 = ma0Var2.wll2JLbTBC2.G3OKOH3wZRC;
                fg0Var3.getClass();
                java.lang.Object[] objArr2 = xl0Var.adDC3e2L;
                java.lang.Object obj = objArr2[i2];
                objArr2[i2] = fg0Var3;
            }
        }
        xl0Var.JlrlGoKF(((defpackage.ul0) ma0Var.SyNS6RMn()).adDC3e2L.AARZUJiTa, xl0Var.AARZUJiTa);
        fg0Var.PAEGRtP0bX = false;
        return xl0Var.xiZrDbcSW0();
    }

    public final defpackage.xl0 NHJTzaLwkd() {
        boolean z = this.NHJTzaLwkd;
        defpackage.xl0 xl0Var = this.abhbClRa;
        if (z) {
            xl0Var.AARZUJiTa();
            xl0Var.r1MBDhnF(xl0Var.AARZUJiTa, QQUzIjv3iOC5());
            java.util.Arrays.sort(xl0Var.adDC3e2L, 0, xl0Var.AARZUJiTa, EoOhNTTfIN7K);
            this.NHJTzaLwkd = false;
        }
        return xl0Var;
    }

    public final int PAEGRtP0bX() {
        return this.wll2JLbTBC2.QoRHpC4k.DFo87pBq1E5;
    }

    public final void QPwENk36pDC(boolean z) {
        defpackage.ts0 ts0Var;
        if (this.adDC3e2L || (ts0Var = this.kd6TUFXn) == null) {
            return;
        }
        ((defpackage.v0) ts0Var).QQUzIjv3iOC5(this, true, z);
    }

    public final defpackage.xl0 QQUzIjv3iOC5() {
        sJNB7mCer5();
        if (this.DFo87pBq1E5 == 0) {
            return (defpackage.xl0) this.SyNS6RMn.xiZrDbcSW0;
        }
        defpackage.xl0 xl0Var = this.cnag84Bm;
        xl0Var.getClass();
        return xl0Var;
    }

    public final void QUKZkWRtw6(java.lang.Throwable th) {
        defpackage.nh nhVar = this.D2vUnMij;
        defpackage.nc1 nc1Var = defpackage.jh.IHQe1A4L2xu;
        defpackage.gu0 gu0Var = (defpackage.gu0) nhVar;
        gu0Var.getClass();
        defpackage.ih ihVar = (defpackage.ih) defpackage.h1.yIx6ChFVk(gu0Var, nc1Var);
        if (ihVar == null) {
            throw th;
        }
        defpackage.x70.RmCzwkUxICV(th, new defpackage.DSux0S2nxMSk(3, ihVar, this));
        throw th;
    }

    public final boolean QoRHpC4k() {
        return this.wll2JLbTBC2.QoRHpC4k.NHJTzaLwkd;
    }

    public final void RmCzwkUxICV() {
        defpackage.xl0 QQUzIjv3iOC5 = QQUzIjv3iOC5();
        java.lang.Object[] objArr = QQUzIjv3iOC5.adDC3e2L;
        int i = QQUzIjv3iOC5.AARZUJiTa;
        for (int i2 = 0; i2 < i; i2++) {
            defpackage.ma0 ma0Var = (defpackage.ma0) objArr[i2];
            defpackage.ka0 ka0Var = ma0Var.SiPhmbmu;
            ma0Var.frpfPPIgqM9O = ka0Var;
            if (ka0Var != defpackage.ka0.AARZUJiTa) {
                ma0Var.RmCzwkUxICV();
            }
        }
    }

    public final void SiPhmbmu() {
        defpackage.ma0 ma0Var;
        if (this.DFo87pBq1E5 > 0) {
            this.QoRHpC4k = true;
        }
        if (!this.adDC3e2L || (ma0Var = this.G3OKOH3wZRC) == null) {
            return;
        }
        ma0Var.SiPhmbmu();
    }

    public final java.util.List SyNS6RMn() {
        return QQUzIjv3iOC5().xiZrDbcSW0();
    }

    public final void TFRaUu83X3E(int i, int i2) {
        if (i2 < 0) {
            defpackage.x50.IHQe1A4L2xu("count (" + i2 + ") must be greater than 0");
        }
        int i3 = (i2 + i) - 1;
        if (i > i3) {
            return;
        }
        while (true) {
            defpackage.F7NU4MC0GW f7nu4mc0gw = this.SyNS6RMn;
            hyxIchWRW((defpackage.ma0) ((defpackage.xl0) f7nu4mc0gw.xiZrDbcSW0).adDC3e2L[i3]);
            java.lang.Object ez2rX8ReCYw = ((defpackage.xl0) f7nu4mc0gw.xiZrDbcSW0).ez2rX8ReCYw(i3);
            ((defpackage.s4) f7nu4mc0gw.AARZUJiTa).IHQe1A4L2xu();
            if (i3 == i) {
                return;
            } else {
                i3--;
            }
        }
    }

    public final void UsuH8pd5P(int i, defpackage.ma0 ma0Var) {
        if (ma0Var.G3OKOH3wZRC != null && ma0Var.kd6TUFXn != null) {
            defpackage.x50.oh6vYeIP(SH1y5HwkJhh(ma0Var));
        }
        ma0Var.G3OKOH3wZRC = this;
        defpackage.F7NU4MC0GW f7nu4mc0gw = this.SyNS6RMn;
        ((defpackage.xl0) f7nu4mc0gw.xiZrDbcSW0).IHQe1A4L2xu(i, ma0Var);
        ((defpackage.s4) f7nu4mc0gw.AARZUJiTa).IHQe1A4L2xu();
        lpprD5VAS();
        if (ma0Var.adDC3e2L) {
            this.DFo87pBq1E5++;
        }
        SiPhmbmu();
        defpackage.ts0 ts0Var = this.kd6TUFXn;
        if (ts0Var != null) {
            ma0Var.F7NU4MC0GW(ts0Var);
        }
        if (ma0Var.wll2JLbTBC2.JlrlGoKF > 0) {
            defpackage.qa0 qa0Var = this.wll2JLbTBC2;
            qa0Var.F7NU4MC0GW(qa0Var.JlrlGoKF + 1);
        }
        if (ma0Var.TFRaUu83X3E > 0) {
            AQHddgaEX(this.TFRaUu83X3E + 1);
        }
    }

    public final void Uv8CGu3G(defpackage.ip0 ip0Var) {
        defpackage.ts0 ts0Var = this.kd6TUFXn;
        defpackage.mz0 rectManager = ts0Var != null ? ((defpackage.v0) ts0Var).getRectManager() : null;
        defpackage.qa0 qa0Var = this.wll2JLbTBC2;
        int i = 0;
        boolean z = qa0Var.F7NU4MC0GW != defpackage.ia0.riuEU0zW4 || G3OKOH3wZRC() || QoRHpC4k();
        if (this.ez2rX8ReCYw && rectManager != null) {
            if (ip0Var == this.yIx6ChFVk.F7NU4MC0GW) {
                this.SH1y5HwkJhh = true;
                if (!z) {
                    rectManager.xiZrDbcSW0(this);
                }
            } else {
                this.riuEU0zW4 = true;
                defpackage.xl0 QQUzIjv3iOC5 = QQUzIjv3iOC5();
                java.lang.Object[] objArr = QQUzIjv3iOC5.adDC3e2L;
                int i2 = QQUzIjv3iOC5.AARZUJiTa;
                for (int i3 = 0; i3 < i2; i3++) {
                    defpackage.ma0 ma0Var = (defpackage.ma0) objArr[i3];
                    ma0Var.SH1y5HwkJhh = true;
                    if (!z) {
                        rectManager.xiZrDbcSW0(ma0Var);
                    }
                }
                if (this.ez2rX8ReCYw) {
                    rectManager.adDC3e2L = true;
                    defpackage.p2 p2Var = rectManager.oh6vYeIP;
                    int i4 = this.xiZrDbcSW0 & 33554431;
                    long[] jArr = (long[]) p2Var.oh6vYeIP;
                    int i5 = p2Var.IHQe1A4L2xu;
                    while (true) {
                        if (i >= jArr.length - 2 || i >= i5) {
                            break;
                        }
                        int i6 = i + 2;
                        long j = jArr[i6];
                        if ((((int) j) & 33554431) == i4) {
                            jArr[i6] = (((j >> 63) & 1) << 60) | j;
                            break;
                        }
                        i += 3;
                    }
                }
                rectManager.riuEU0zW4();
            }
        }
        qa0Var.QoRHpC4k.juTJww2r();
    }

    public final defpackage.ma0 V7bD7b8KA() {
        defpackage.ma0 ma0Var = this.G3OKOH3wZRC;
        while (ma0Var != null && ma0Var.adDC3e2L) {
            ma0Var = ma0Var.G3OKOH3wZRC;
        }
        return ma0Var;
    }

    public final void WLpAkxCo() {
        defpackage.ma0 V7bD7b8KA;
        if (this.frpfPPIgqM9O == defpackage.ka0.AARZUJiTa) {
            xiZrDbcSW0();
        }
        defpackage.hi0 hi0Var = this.wll2JLbTBC2.QoRHpC4k;
        defpackage.qa0 qa0Var = hi0Var.SH1y5HwkJhh;
        try {
            hi0Var.ez2rX8ReCYw = true;
            if (!hi0Var.cnag84Bm) {
                defpackage.x50.oh6vYeIP("replace called on unplaced item");
            }
            boolean z = hi0Var.V7bD7b8KA;
            hi0Var.JX5fKip1C6(hi0Var.G3OKOH3wZRC, hi0Var.EgCjBq0SZwJ, hi0Var.kd6TUFXn);
            if (z && !hi0Var.yIx6ChFVk && (V7bD7b8KA = qa0Var.IHQe1A4L2xu.V7bD7b8KA()) != null) {
                V7bD7b8KA.EoOhNTTfIN7K(false);
            }
        } finally {
        }
    }

    public final void XZx205DYe() {
        defpackage.ma0 V7bD7b8KA;
        if (this.frpfPPIgqM9O == defpackage.ka0.AARZUJiTa) {
            xiZrDbcSW0();
        }
        defpackage.fg0 fg0Var = this.wll2JLbTBC2.G3OKOH3wZRC;
        fg0Var.getClass();
        boolean z = true;
        try {
            fg0Var.ez2rX8ReCYw = true;
            if (!fg0Var.cnag84Bm) {
                defpackage.x50.oh6vYeIP("replace() called on item that was not placed");
            }
            fg0Var.D2vUnMij = false;
            if (fg0Var.fnWB2E7cs == defpackage.dg0.AARZUJiTa) {
                z = false;
            }
            fg0Var.yUiIS9dG7NYk(fg0Var.kd6TUFXn, fg0Var.EgCjBq0SZwJ);
            if (z && !fg0Var.D2vUnMij && (V7bD7b8KA = fg0Var.SH1y5HwkJhh.IHQe1A4L2xu.V7bD7b8KA()) != null) {
                V7bD7b8KA.QPwENk36pDC(false);
            }
            fg0Var.ez2rX8ReCYw = false;
        } catch (java.lang.Throwable th) {
            fg0Var.ez2rX8ReCYw = false;
            throw th;
        }
    }

    public final defpackage.b71 abhbClRa() {
        if (p4kuH6PDtgom() && !this.WLpAkxCo && this.yIx6ChFVk.F7NU4MC0GW(8)) {
            return this.V7bD7b8KA;
        }
        return null;
    }

    public final void adDC3e2L() {
        this.SiPhmbmu = this.frpfPPIgqM9O;
        defpackage.ka0 ka0Var = defpackage.ka0.AARZUJiTa;
        this.frpfPPIgqM9O = ka0Var;
        defpackage.xl0 QQUzIjv3iOC5 = QQUzIjv3iOC5();
        java.lang.Object[] objArr = QQUzIjv3iOC5.adDC3e2L;
        int i = QQUzIjv3iOC5.AARZUJiTa;
        for (int i2 = 0; i2 < i; i2++) {
            defpackage.ma0 ma0Var = (defpackage.ma0) objArr[i2];
            if (ma0Var.frpfPPIgqM9O != ka0Var) {
                ma0Var.adDC3e2L();
            }
        }
    }

    public final java.util.List cnag84Bm() {
        return ((defpackage.xl0) this.SyNS6RMn.xiZrDbcSW0).xiZrDbcSW0();
    }

    public final void ez2rX8ReCYw() {
        if (this.JlrlGoKF != null) {
            Ye0N2xE9Hc(this, false, 5);
        } else {
            wKlPRKlRnfqr(this, false, 5);
        }
        defpackage.hi0 hi0Var = this.wll2JLbTBC2.QoRHpC4k;
        defpackage.ki kiVar = hi0Var.SyNS6RMn ? new defpackage.ki(hi0Var.EXtogiMhuM) : null;
        defpackage.ts0 ts0Var = this.kd6TUFXn;
        if (kiVar != null) {
            if (ts0Var != null) {
                ((defpackage.v0) ts0Var).V7bD7b8KA(this, kiVar.IHQe1A4L2xu);
            }
        } else if (ts0Var != null) {
            ((defpackage.v0) ts0Var).kNAkVymC(true);
        }
    }

    @Override // defpackage.us0
    public final boolean fnWB2E7cs() {
        return p4kuH6PDtgom();
    }

    public final void frpfPPIgqM9O() {
        if (this.PAEGRtP0bX) {
            return;
        }
        if (this.yIx6ChFVk.oh6vYeIP.SH1y5HwkJhh != null || this.lpprD5VAS != null) {
            this.kNAkVymC = true;
            return;
        }
        defpackage.b71 b71Var = this.V7bD7b8KA;
        this.PAEGRtP0bX = true;
        defpackage.rz0 rz0Var = new defpackage.rz0();
        rz0Var.adDC3e2L = new defpackage.b71();
        defpackage.ws0 snapshotObserver = ((defpackage.v0) defpackage.pa0.IHQe1A4L2xu(this)).getSnapshotObserver();
        defpackage.o0 o0Var = new defpackage.o0(6, this, rz0Var);
        snapshotObserver.IHQe1A4L2xu.oh6vYeIP(this, snapshotObserver.F7NU4MC0GW, o0Var);
        this.PAEGRtP0bX = false;
        this.V7bD7b8KA = (defpackage.b71) rz0Var.adDC3e2L;
        this.kNAkVymC = false;
        defpackage.v0 v0Var = (defpackage.v0) defpackage.pa0.IHQe1A4L2xu(this);
        v0Var.getSemanticsOwner().oh6vYeIP(this, b71Var);
        v0Var.C0U8sNJm();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v0 */
    /* JADX WARN: Type inference failed for: r1v1, types: [lj0] */
    /* JADX WARN: Type inference failed for: r1v10 */
    /* JADX WARN: Type inference failed for: r1v11 */
    /* JADX WARN: Type inference failed for: r1v3 */
    /* JADX WARN: Type inference failed for: r1v4, types: [lj0] */
    /* JADX WARN: Type inference failed for: r1v5, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v6 */
    /* JADX WARN: Type inference failed for: r1v7 */
    /* JADX WARN: Type inference failed for: r1v8 */
    /* JADX WARN: Type inference failed for: r1v9 */
    /* JADX WARN: Type inference failed for: r2v0 */
    /* JADX WARN: Type inference failed for: r2v1 */
    /* JADX WARN: Type inference failed for: r2v10 */
    /* JADX WARN: Type inference failed for: r2v11 */
    /* JADX WARN: Type inference failed for: r2v2 */
    /* JADX WARN: Type inference failed for: r2v3, types: [xl0] */
    /* JADX WARN: Type inference failed for: r2v4 */
    /* JADX WARN: Type inference failed for: r2v5 */
    /* JADX WARN: Type inference failed for: r2v6, types: [xl0] */
    /* JADX WARN: Type inference failed for: r2v8 */
    /* JADX WARN: Type inference failed for: r2v9 */
    public final void gG5uWf3dqScO(defpackage.pm1 pm1Var) {
        if (defpackage.x70.QoRHpC4k(this.v5iciZok, pm1Var)) {
            return;
        }
        this.v5iciZok = pm1Var;
        defpackage.lj0 lj0Var = this.yIx6ChFVk.xiZrDbcSW0;
        if ((lj0Var.EXtogiMhuM & 16) != 0) {
            while (lj0Var != null) {
                if ((lj0Var.AARZUJiTa & 16) != 0) {
                    defpackage.ln lnVar = lj0Var;
                    ?? r2 = 0;
                    while (lnVar != 0) {
                        if (lnVar instanceof defpackage.vv0) {
                            ((defpackage.vv0) lnVar).TFRaUu83X3E();
                        } else if ((lnVar.AARZUJiTa & 16) != 0 && (lnVar instanceof defpackage.ln)) {
                            defpackage.lj0 lj0Var2 = lnVar.fnWB2E7cs;
                            int i = 0;
                            lnVar = lnVar;
                            r2 = r2;
                            while (lj0Var2 != null) {
                                if ((lj0Var2.AARZUJiTa & 16) != 0) {
                                    i++;
                                    r2 = r2;
                                    if (i == 1) {
                                        lnVar = lj0Var2;
                                    } else {
                                        if (r2 == 0) {
                                            r2 = new defpackage.xl0(new defpackage.lj0[16]);
                                        }
                                        if (lnVar != 0) {
                                            r2.oh6vYeIP(lnVar);
                                            lnVar = 0;
                                        }
                                        r2.oh6vYeIP(lj0Var2);
                                    }
                                }
                                lj0Var2 = lj0Var2.SH1y5HwkJhh;
                                lnVar = lnVar;
                                r2 = r2;
                            }
                            if (i == 1) {
                            }
                        }
                        lnVar = defpackage.w70.riuEU0zW4(r2);
                    }
                }
                if ((lj0Var.EXtogiMhuM & 16) == 0) {
                    return;
                } else {
                    lj0Var = lj0Var.SH1y5HwkJhh;
                }
            }
        }
    }

    public final void hkbnNdmy() {
        defpackage.F7NU4MC0GW f7nu4mc0gw = this.SyNS6RMn;
        int i = ((defpackage.xl0) f7nu4mc0gw.xiZrDbcSW0).AARZUJiTa;
        while (true) {
            i--;
            defpackage.xl0 xl0Var = (defpackage.xl0) f7nu4mc0gw.xiZrDbcSW0;
            if (-1 >= i) {
                xl0Var.AARZUJiTa();
                ((defpackage.s4) f7nu4mc0gw.AARZUJiTa).IHQe1A4L2xu();
                return;
            }
            hyxIchWRW((defpackage.ma0) xl0Var.adDC3e2L[i]);
        }
    }

    public final void hyxIchWRW(defpackage.ma0 ma0Var) {
        if (ma0Var.wll2JLbTBC2.JlrlGoKF > 0) {
            this.wll2JLbTBC2.F7NU4MC0GW(r0.JlrlGoKF - 1);
        }
        if (this.kd6TUFXn != null) {
            ma0Var.EXtogiMhuM();
        }
        ma0Var.G3OKOH3wZRC = null;
        if (ma0Var.TFRaUu83X3E > 0) {
            AQHddgaEX(this.TFRaUu83X3E - 1);
        }
        ma0Var.yIx6ChFVk.F7NU4MC0GW.kNAkVymC = null;
        if (ma0Var.adDC3e2L) {
            this.DFo87pBq1E5--;
            defpackage.xl0 xl0Var = (defpackage.xl0) ma0Var.SyNS6RMn.xiZrDbcSW0;
            java.lang.Object[] objArr = xl0Var.adDC3e2L;
            int i = xl0Var.AARZUJiTa;
            for (int i2 = 0; i2 < i; i2++) {
                ((defpackage.ma0) objArr[i2]).yIx6ChFVk.F7NU4MC0GW.kNAkVymC = null;
            }
        }
        SiPhmbmu();
        lpprD5VAS();
    }

    public final defpackage.F7NU4MC0GW kNAkVymC() {
        defpackage.F7NU4MC0GW f7nu4mc0gw = this.C0U8sNJm;
        if (f7nu4mc0gw != null) {
            return f7nu4mc0gw;
        }
        defpackage.F7NU4MC0GW f7nu4mc0gw2 = new defpackage.F7NU4MC0GW(this, this.QQUzIjv3iOC5);
        this.C0U8sNJm = f7nu4mc0gw2;
        return f7nu4mc0gw2;
    }

    public final defpackage.ka0 kd6TUFXn() {
        return this.wll2JLbTBC2.QoRHpC4k.QoRHpC4k;
    }

    public final void lpprD5VAS() {
        if (!this.adDC3e2L) {
            this.NHJTzaLwkd = true;
            return;
        }
        defpackage.ma0 V7bD7b8KA = V7bD7b8KA();
        if (V7bD7b8KA != null) {
            V7bD7b8KA.lpprD5VAS();
        }
    }

    public final void mAr5m2L7gYDP(int i, int i2, int i3) {
        if (i == i2) {
            return;
        }
        for (int i4 = 0; i4 < i3; i4++) {
            int i5 = i > i2 ? i + i4 : i;
            int i6 = i > i2 ? i2 + i4 : (i2 + i3) - 2;
            defpackage.F7NU4MC0GW f7nu4mc0gw = this.SyNS6RMn;
            defpackage.xl0 xl0Var = (defpackage.xl0) f7nu4mc0gw.xiZrDbcSW0;
            defpackage.s4 s4Var = (defpackage.s4) f7nu4mc0gw.AARZUJiTa;
            java.lang.Object ez2rX8ReCYw = xl0Var.ez2rX8ReCYw(i5);
            s4Var.IHQe1A4L2xu();
            ((defpackage.xl0) f7nu4mc0gw.xiZrDbcSW0).IHQe1A4L2xu(i6, (defpackage.ma0) ez2rX8ReCYw);
            s4Var.IHQe1A4L2xu();
        }
        lpprD5VAS();
        SiPhmbmu();
        D2vUnMij();
    }

    public final void mL9sMlGfef(defpackage.ii0 ii0Var) {
        if (defpackage.x70.QoRHpC4k(this.QQUzIjv3iOC5, ii0Var)) {
            return;
        }
        this.QQUzIjv3iOC5 = ii0Var;
        defpackage.F7NU4MC0GW f7nu4mc0gw = this.C0U8sNJm;
        if (f7nu4mc0gw != null) {
            ((defpackage.qt0) f7nu4mc0gw.AARZUJiTa).setValue(ii0Var);
        }
        D2vUnMij();
    }

    public final void nBH8hAHy() {
        if (this.hyxIchWRW) {
            defpackage.ep0 ep0Var = this.yIx6ChFVk;
            defpackage.ip0 ip0Var = ep0Var.r1MBDhnF;
            defpackage.ip0 ip0Var2 = ep0Var.F7NU4MC0GW.kNAkVymC;
            this.mAr5m2L7gYDP = null;
            while (true) {
                if (defpackage.x70.QoRHpC4k(ip0Var, ip0Var2)) {
                    break;
                }
                if ((ip0Var != null ? ip0Var.hkbnNdmy : null) != null) {
                    this.mAr5m2L7gYDP = ip0Var;
                    break;
                }
                ip0Var = ip0Var != null ? ip0Var.kNAkVymC : null;
            }
            this.hyxIchWRW = false;
        }
        defpackage.ip0 ip0Var3 = this.mAr5m2L7gYDP;
        if (ip0Var3 != null && ip0Var3.hkbnNdmy == null) {
            throw defpackage.fx0.AARZUJiTa("layer was not set. This error is usually caused by operating off of the UI thread. Did you call invalidate() instead of postInvalidate()?");
        }
        if (ip0Var3 != null) {
            ip0Var3.pZi369F0fM();
            return;
        }
        defpackage.ma0 V7bD7b8KA = V7bD7b8KA();
        if (V7bD7b8KA != null) {
            V7bD7b8KA.nBH8hAHy();
            return;
        }
        defpackage.ts0 ts0Var = this.kd6TUFXn;
        if (ts0Var != null) {
            ((defpackage.v0) ts0Var).invalidate();
        }
    }

    public final void nVhUznk1t(defpackage.qn qnVar) {
        if (defpackage.x70.QoRHpC4k(this.UsuH8pd5P, qnVar)) {
            return;
        }
        this.UsuH8pd5P = qnVar;
        D2vUnMij();
        defpackage.ma0 V7bD7b8KA = V7bD7b8KA();
        if (V7bD7b8KA != null) {
            V7bD7b8KA.nBH8hAHy();
        } else {
            defpackage.ts0 ts0Var = this.kd6TUFXn;
            if (ts0Var != null) {
                ((defpackage.v0) ts0Var).invalidate();
            }
        }
        v5iciZok();
        for (defpackage.lj0 lj0Var = this.yIx6ChFVk.xiZrDbcSW0; lj0Var != null; lj0Var = lj0Var.SH1y5HwkJhh) {
            lj0Var.IHQe1A4L2xu();
        }
    }

    @Override // defpackage.ig
    public final void oh6vYeIP() {
        defpackage.a0 a0Var;
        defpackage.ab0 ab0Var = this.XZx205DYe;
        if (ab0Var != null) {
            ab0Var.riuEU0zW4(true);
        }
        this.WLpAkxCo = true;
        defpackage.lj0 lj0Var = this.yIx6ChFVk.adDC3e2L;
        for (defpackage.lj0 lj0Var2 = lj0Var; lj0Var2 != null; lj0Var2 = lj0Var2.riuEU0zW4) {
            if (lj0Var2.kd6TUFXn) {
                lj0Var2.boH8X4DXyc4();
            }
        }
        for (defpackage.lj0 lj0Var3 = lj0Var; lj0Var3 != null; lj0Var3 = lj0Var3.riuEU0zW4) {
            if (lj0Var3.kd6TUFXn) {
                lj0Var3.Ay906ovssqgN();
            }
        }
        while (lj0Var != null) {
            if (lj0Var.kd6TUFXn) {
                lj0Var.k3hcgHS3MP();
            }
            lj0Var = lj0Var.riuEU0zW4;
        }
        if (p4kuH6PDtgom()) {
            this.V7bD7b8KA = null;
            this.kNAkVymC = false;
        }
        defpackage.ts0 ts0Var = this.kd6TUFXn;
        if (ts0Var != null) {
            defpackage.v0 v0Var = (defpackage.v0) ts0Var;
            if (defpackage.v0.xiZrDbcSW0() && (a0Var = v0Var.TFRaUu83X3E) != null && a0Var.ez2rX8ReCYw.adDC3e2L(this.xiZrDbcSW0)) {
                a0Var.adDC3e2L.AARZUJiTa(a0Var.AARZUJiTa, this.xiZrDbcSW0, false);
            }
        }
    }

    public final boolean p4kuH6PDtgom() {
        return this.kd6TUFXn != null;
    }

    /* JADX WARN: Type inference failed for: r7v1 */
    /* JADX WARN: Type inference failed for: r7v16 */
    /* JADX WARN: Type inference failed for: r7v17 */
    /* JADX WARN: Type inference failed for: r7v3, types: [ip0, lj0] */
    public final void r1MBDhnF(defpackage.mj0 mj0Var) {
        ?? r7;
        defpackage.ep0 ep0Var;
        defpackage.dp0 dp0Var;
        defpackage.xl0 xl0Var;
        boolean z;
        boolean z2;
        boolean z3;
        defpackage.xl0 xl0Var2;
        boolean z4;
        defpackage.s sVar;
        defpackage.ep0 ep0Var2 = this.yIx6ChFVk;
        int i = 16;
        boolean F7NU4MC0GW = ep0Var2.F7NU4MC0GW(16);
        defpackage.lj0 lj0Var = ep0Var2.adDC3e2L;
        boolean F7NU4MC0GW2 = ep0Var2.F7NU4MC0GW(1024);
        this.Uv8CGu3G = mj0Var;
        defpackage.d60 d60Var = ep0Var2.r1MBDhnF;
        defpackage.ma0 ma0Var = ep0Var2.IHQe1A4L2xu;
        defpackage.lj0 lj0Var2 = ep0Var2.xiZrDbcSW0;
        defpackage.dp0 dp0Var2 = ep0Var2.oh6vYeIP;
        if (lj0Var2 == dp0Var2) {
            defpackage.x50.oh6vYeIP("padChain called on already padded chain");
        }
        defpackage.lj0 lj0Var3 = ep0Var2.xiZrDbcSW0;
        lj0Var3.riuEU0zW4 = dp0Var2;
        dp0Var2.SH1y5HwkJhh = lj0Var3;
        defpackage.xl0 xl0Var3 = ep0Var2.AARZUJiTa;
        int i2 = xl0Var3 != null ? xl0Var3.AARZUJiTa : 0;
        defpackage.xl0 xl0Var4 = ep0Var2.EXtogiMhuM;
        if (xl0Var4 == null) {
            xl0Var4 = new defpackage.xl0(new defpackage.kj0[16]);
        }
        defpackage.xl0 xl0Var5 = ep0Var2.riuEU0zW4;
        xl0Var5.oh6vYeIP(mj0Var);
        defpackage.s sVar2 = null;
        while (true) {
            int i3 = xl0Var5.AARZUJiTa;
            if (i3 == 0) {
                break;
            }
            defpackage.mj0 mj0Var2 = (defpackage.mj0) xl0Var5.ez2rX8ReCYw(i3 - 1);
            if (mj0Var2 instanceof defpackage.we) {
                defpackage.we weVar = (defpackage.we) mj0Var2;
                xl0Var5.oh6vYeIP(weVar.oh6vYeIP);
                xl0Var5.oh6vYeIP(weVar.IHQe1A4L2xu);
            } else if (mj0Var2 instanceof defpackage.kj0) {
                xl0Var4.oh6vYeIP(mj0Var2);
            } else {
                if (sVar2 == null) {
                    sVar = new defpackage.s(i, xl0Var4);
                    sVar2 = sVar;
                } else {
                    sVar = sVar2;
                }
                mj0Var2.oh6vYeIP(sVar);
            }
        }
        int i4 = xl0Var4.AARZUJiTa;
        if (i4 == i2) {
            defpackage.lj0 lj0Var4 = dp0Var2.SH1y5HwkJhh;
            int i5 = 0;
            while (lj0Var4 != null && i5 < i2) {
                if (xl0Var3 == null) {
                    throw defpackage.fx0.AARZUJiTa("expected prior modifier list to be non-empty");
                }
                defpackage.kj0 kj0Var = (defpackage.kj0) xl0Var3.adDC3e2L[i5];
                defpackage.kj0 kj0Var2 = (defpackage.kj0) xl0Var4.adDC3e2L[i5];
                if (defpackage.x70.QoRHpC4k(kj0Var, kj0Var2)) {
                    xl0Var2 = xl0Var3;
                    z4 = 2;
                } else {
                    xl0Var2 = xl0Var3;
                    z4 = kj0Var.getClass() == kj0Var2.getClass();
                }
                if (!z4) {
                    lj0Var4 = lj0Var4.riuEU0zW4;
                    break;
                }
                if (z4) {
                    defpackage.ep0.EXtogiMhuM(kj0Var, kj0Var2, lj0Var4);
                }
                lj0Var4 = lj0Var4.SH1y5HwkJhh;
                i5++;
                xl0Var3 = xl0Var2;
            }
            xl0Var2 = xl0Var3;
            if (i5 >= i2) {
                ep0Var2 = ep0Var2;
                xl0Var3 = xl0Var2;
                z2 = false;
                ep0Var = ep0Var2;
                dp0Var = dp0Var2;
                xl0Var = xl0Var4;
                z = false;
                r7 = z2;
            } else {
                if (xl0Var2 == null) {
                    throw defpackage.fx0.AARZUJiTa("expected prior modifier list to be non-empty");
                }
                if (lj0Var4 == null) {
                    throw defpackage.fx0.AARZUJiTa("structuralUpdate requires a non-null tail");
                }
                boolean z5 = ma0Var.lpprD5VAS != null;
                defpackage.lj0 lj0Var5 = lj0Var4;
                ep0Var = ep0Var2;
                xl0Var = xl0Var4;
                xl0Var3 = xl0Var2;
                z3 = false;
                ep0Var.xiZrDbcSW0(i5, xl0Var3, xl0Var, lj0Var5, !z5);
                dp0Var = dp0Var2;
                z = true;
                r7 = z3;
            }
        } else {
            r7 = 0;
            z3 = false;
            z2 = false;
            defpackage.mj0 mj0Var3 = ma0Var.lpprD5VAS;
            if (mj0Var3 != null && i2 == 0) {
                defpackage.lj0 lj0Var6 = dp0Var2;
                for (int i6 = 0; i6 < xl0Var4.AARZUJiTa; i6++) {
                    lj0Var6 = defpackage.ep0.oh6vYeIP((defpackage.kj0) xl0Var4.adDC3e2L[i6], lj0Var6);
                }
                int i7 = 0;
                for (defpackage.lj0 lj0Var7 = lj0Var.riuEU0zW4; lj0Var7 != null && lj0Var7 != dp0Var2; lj0Var7 = lj0Var7.riuEU0zW4) {
                    i7 |= lj0Var7.AARZUJiTa;
                    lj0Var7.EXtogiMhuM = i7;
                }
                ep0Var = ep0Var2;
                dp0Var = dp0Var2;
                xl0Var = xl0Var4;
                z = true;
                r7 = z3;
            } else if (i4 != 0) {
                if (xl0Var3 == null) {
                    xl0Var3 = new defpackage.xl0(new defpackage.kj0[16]);
                }
                ep0Var = ep0Var2;
                dp0Var = dp0Var2;
                xl0Var = xl0Var4;
                ep0Var.xiZrDbcSW0(0, xl0Var3, xl0Var, dp0Var, !(mj0Var3 != null));
                z = true;
            } else {
                if (xl0Var3 == null) {
                    throw defpackage.fx0.AARZUJiTa("expected prior modifier list to be non-empty");
                }
                defpackage.lj0 lj0Var8 = dp0Var2.SH1y5HwkJhh;
                for (int i8 = 0; lj0Var8 != null && i8 < xl0Var3.AARZUJiTa; i8++) {
                    lj0Var8 = defpackage.ep0.r1MBDhnF(lj0Var8).SH1y5HwkJhh;
                }
                defpackage.ma0 V7bD7b8KA = ma0Var.V7bD7b8KA();
                d60Var.kNAkVymC = V7bD7b8KA != null ? V7bD7b8KA.yIx6ChFVk.r1MBDhnF : null;
                ep0Var2.F7NU4MC0GW = d60Var;
                ep0Var = ep0Var2;
                dp0Var = dp0Var2;
                xl0Var = xl0Var4;
                z = false;
                r7 = z2;
            }
        }
        ep0Var.AARZUJiTa = xl0Var;
        if (xl0Var3 != null) {
            xl0Var3.AARZUJiTa();
        } else {
            xl0Var3 = r7;
        }
        ep0Var.EXtogiMhuM = xl0Var3;
        defpackage.lj0 lj0Var9 = dp0Var.SH1y5HwkJhh;
        if (lj0Var9 != null) {
            lj0Var = lj0Var9;
        }
        lj0Var.riuEU0zW4 = r7;
        dp0Var.SH1y5HwkJhh = r7;
        dp0Var.EXtogiMhuM = -1;
        dp0Var.JlrlGoKF = r7;
        if (lj0Var == dp0Var) {
            defpackage.x50.oh6vYeIP("trimChain did not update the head");
        }
        ep0Var.xiZrDbcSW0 = lj0Var;
        if (z) {
            ep0Var.AARZUJiTa();
        }
        boolean F7NU4MC0GW3 = ep0Var.F7NU4MC0GW(16);
        boolean F7NU4MC0GW4 = ep0Var.F7NU4MC0GW(1024);
        this.wll2JLbTBC2.SH1y5HwkJhh();
        if (this.JlrlGoKF == null && ep0Var.F7NU4MC0GW(512)) {
            CGXpA9s3RjIa(this);
        }
        if (F7NU4MC0GW == F7NU4MC0GW3 && F7NU4MC0GW2 == F7NU4MC0GW4) {
            return;
        }
        defpackage.mz0 rectManager = ((defpackage.v0) defpackage.pa0.IHQe1A4L2xu(this)).getRectManager();
        rectManager.getClass();
        if (p4kuH6PDtgom()) {
            defpackage.p2 p2Var = rectManager.oh6vYeIP;
            int i9 = this.xiZrDbcSW0 & 33554431;
            long[] jArr = (long[]) p2Var.oh6vYeIP;
            int i10 = p2Var.IHQe1A4L2xu;
            for (int i11 = 0; i11 < jArr.length - 2 && i11 < i10; i11 += 3) {
                int i12 = i11 + 2;
                long j = jArr[i12];
                if ((((int) j) & 33554431) == i9) {
                    jArr[i12] = ((-6917529027641081857L) & j) | ((F7NU4MC0GW4 ? 1L : 0L) * 2305843009213693952L) | ((F7NU4MC0GW3 ? 1L : 0L) * 4611686018427387904L);
                    return;
                }
            }
        }
    }

    public final void riuEU0zW4(defpackage.hb hbVar, defpackage.q20 q20Var) {
        try {
            this.yIx6ChFVk.F7NU4MC0GW.XkvoyZRg(hbVar, q20Var);
        } catch (java.lang.Throwable th) {
            QUKZkWRtw6(th);
            throw null;
        }
    }

    public final void sJNB7mCer5() {
        if (this.DFo87pBq1E5 <= 0 || !this.QoRHpC4k) {
            return;
        }
        this.QoRHpC4k = false;
        defpackage.xl0 xl0Var = this.cnag84Bm;
        if (xl0Var == null) {
            xl0Var = new defpackage.xl0(new defpackage.ma0[16]);
            this.cnag84Bm = xl0Var;
        }
        xl0Var.AARZUJiTa();
        defpackage.xl0 xl0Var2 = (defpackage.xl0) this.SyNS6RMn.xiZrDbcSW0;
        java.lang.Object[] objArr = xl0Var2.adDC3e2L;
        int i = xl0Var2.AARZUJiTa;
        for (int i2 = 0; i2 < i; i2++) {
            defpackage.ma0 ma0Var = (defpackage.ma0) objArr[i2];
            if (ma0Var.adDC3e2L) {
                xl0Var.r1MBDhnF(xl0Var.AARZUJiTa, ma0Var.QQUzIjv3iOC5());
            } else {
                xl0Var.oh6vYeIP(ma0Var);
            }
        }
        defpackage.qa0 qa0Var = this.wll2JLbTBC2;
        qa0Var.QoRHpC4k.nBH8hAHy = true;
        defpackage.fg0 fg0Var = qa0Var.G3OKOH3wZRC;
        if (fg0Var != null) {
            fg0Var.PAEGRtP0bX = true;
        }
    }

    public final java.lang.String toString() {
        return defpackage.e90.C0U8sNJm(this) + " children: " + ((defpackage.ul0) SyNS6RMn()).adDC3e2L.AARZUJiTa + " measurePolicy: " + this.QQUzIjv3iOC5 + " deactivated: " + this.WLpAkxCo;
    }

    public final void v5iciZok() {
        defpackage.ep0 ep0Var = this.yIx6ChFVk;
        defpackage.ip0 ip0Var = ep0Var.F7NU4MC0GW;
        defpackage.d60 d60Var = ep0Var.r1MBDhnF;
        while (ip0Var != d60Var) {
            ip0Var.getClass();
            defpackage.fa0 fa0Var = (defpackage.fa0) ip0Var;
            defpackage.ss0 ss0Var = fa0Var.hkbnNdmy;
            if (ss0Var != null) {
                ((defpackage.t20) ss0Var).r1MBDhnF();
            }
            ip0Var = fa0Var.fnWB2E7cs;
        }
        defpackage.ss0 ss0Var2 = ep0Var.r1MBDhnF.hkbnNdmy;
        if (ss0Var2 != null) {
            ((defpackage.t20) ss0Var2).r1MBDhnF();
        }
    }

    public final java.lang.Boolean wll2JLbTBC2() {
        defpackage.fg0 fg0Var = this.wll2JLbTBC2.G3OKOH3wZRC;
        if (fg0Var != null) {
            return java.lang.Boolean.valueOf(fg0Var.fnWB2E7cs != defpackage.dg0.AARZUJiTa);
        }
        return null;
    }

    public final void xiZrDbcSW0() {
        this.SiPhmbmu = this.frpfPPIgqM9O;
        this.frpfPPIgqM9O = defpackage.ka0.AARZUJiTa;
        defpackage.xl0 QQUzIjv3iOC5 = QQUzIjv3iOC5();
        java.lang.Object[] objArr = QQUzIjv3iOC5.adDC3e2L;
        int i = QQUzIjv3iOC5.AARZUJiTa;
        for (int i2 = 0; i2 < i; i2++) {
            defpackage.ma0 ma0Var = (defpackage.ma0) objArr[i2];
            if (ma0Var.frpfPPIgqM9O == defpackage.ka0.xiZrDbcSW0) {
                ma0Var.xiZrDbcSW0();
            }
        }
    }

    public final boolean yIx6ChFVk() {
        return this.wll2JLbTBC2.QoRHpC4k.V7bD7b8KA;
    }

    public ma0(int i) {
        this(defpackage.c71.IHQe1A4L2xu.addAndGet(1), (i & 1) == 0);
    }
}
