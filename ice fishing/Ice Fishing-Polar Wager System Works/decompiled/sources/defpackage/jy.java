package defpackage;

/* loaded from: classes.dex */
public final class jy extends defpackage.ln implements defpackage.d71, defpackage.h20, defpackage.lh, defpackage.dq0, defpackage.ui1 {
    public static final defpackage.ad1 C0U8sNJm = new defpackage.ad1(29);
    public defpackage.ip0 NHJTzaLwkd;
    public defpackage.tx PAEGRtP0bX;
    public final defpackage.gy QQUzIjv3iOC5;
    public final defpackage.xiZrDbcSW0 V7bD7b8KA;
    public defpackage.zb0 abhbClRa;
    public defpackage.zk0 kNAkVymC;

    public jy(defpackage.zk0 zk0Var, defpackage.xiZrDbcSW0 xizrdbcsw0) {
        this.kNAkVymC = zk0Var;
        this.V7bD7b8KA = xizrdbcsw0;
        defpackage.gy gyVar = new defpackage.gy(0, new defpackage.iy(2, this, defpackage.jy.class, "onFocusStateChange", "onFocusStateChange(Landroidx/compose/ui/focus/FocusState;Landroidx/compose/ui/focus/FocusState;)V", 0, 0, 0), 10);
        UVjEelCZ(gyVar);
        this.QQUzIjv3iOC5 = gyVar;
    }

    @Override // defpackage.ui1
    public final java.lang.Object JlrlGoKF() {
        return C0U8sNJm;
    }

    @Override // defpackage.h20
    public final void QoRHpC4k(defpackage.ip0 ip0Var) {
        this.NHJTzaLwkd = ip0Var;
        if (this.QQUzIjv3iOC5.fzubgBFo().IHQe1A4L2xu()) {
            if (!ip0Var.GhHh9OOt4I().kd6TUFXn) {
                uLnPvzwk();
                return;
            }
            defpackage.ip0 ip0Var2 = this.NHJTzaLwkd;
            if (ip0Var2 == null || !ip0Var2.GhHh9OOt4I().kd6TUFXn) {
                return;
            }
            uLnPvzwk();
        }
    }

    public final void WnQbjbWuMR(defpackage.zk0 zk0Var, defpackage.l70 l70Var) {
        if (!this.kd6TUFXn) {
            zk0Var.oh6vYeIP(l70Var);
            return;
        }
        defpackage.u80 u80Var = (defpackage.u80) ((defpackage.dj) dOmtpLcqqI1y()).adDC3e2L.cnag84Bm(defpackage.n.lpprD5VAS);
        defpackage.fm.SiPhmbmu(dOmtpLcqqI1y(), null, new defpackage.AARZUJiTa(zk0Var, l70Var, u80Var != null ? u80Var.kNAkVymC(new defpackage.r1MBDhnF(6, zk0Var, l70Var)) : null, null, 9), 3);
    }

    @Override // defpackage.lj0
    public final boolean ZNF7fheNE() {
        return false;
    }

    public final void fzubgBFo(defpackage.zk0 zk0Var) {
        defpackage.tx txVar;
        if (defpackage.x70.QoRHpC4k(this.kNAkVymC, zk0Var)) {
            return;
        }
        defpackage.zk0 zk0Var2 = this.kNAkVymC;
        if (zk0Var2 != null && (txVar = this.PAEGRtP0bX) != null) {
            zk0Var2.oh6vYeIP(new defpackage.ux(txVar));
        }
        this.PAEGRtP0bX = null;
        this.kNAkVymC = zk0Var;
    }

    @Override // defpackage.lj0
    public final void juTJww2r() {
        defpackage.zb0 zb0Var = this.abhbClRa;
        if (zb0Var != null) {
            zb0Var.oh6vYeIP();
        }
        this.abhbClRa = null;
    }

    @Override // defpackage.dq0
    public final void nBH8hAHy() {
        defpackage.rz0 rz0Var = new defpackage.rz0();
        defpackage.f70.V7bD7b8KA(this, new defpackage.DSux0S2nxMSk(5, rz0Var, this));
        defpackage.zb0 zb0Var = (defpackage.zb0) rz0Var.adDC3e2L;
        if (this.QQUzIjv3iOC5.fzubgBFo().IHQe1A4L2xu()) {
            defpackage.zb0 zb0Var2 = this.abhbClRa;
            if (zb0Var2 != null) {
                zb0Var2.oh6vYeIP();
            }
            if (zb0Var != null) {
                zb0Var.IHQe1A4L2xu();
            } else {
                zb0Var = null;
            }
            this.abhbClRa = zb0Var;
        }
    }

    public final void uLnPvzwk() {
        defpackage.ep0 ep0Var;
        if (this.kd6TUFXn) {
            if (!this.adDC3e2L.kd6TUFXn) {
                defpackage.x50.oh6vYeIP("visitAncestors called on an unattached node");
            }
            defpackage.lj0 lj0Var = this.adDC3e2L.riuEU0zW4;
            defpackage.ma0 D2vUnMij = defpackage.w70.D2vUnMij(this);
            while (D2vUnMij != null) {
                if ((D2vUnMij.yIx6ChFVk.xiZrDbcSW0.EXtogiMhuM & 262144) != 0) {
                    while (lj0Var != null) {
                        if ((lj0Var.AARZUJiTa & 262144) != 0) {
                            defpackage.lj0 lj0Var2 = lj0Var;
                            defpackage.xl0 xl0Var = null;
                            while (lj0Var2 != null) {
                                if (lj0Var2 instanceof defpackage.ui1) {
                                    if (defpackage.ly.EgCjBq0SZwJ == ((defpackage.ui1) lj0Var2).JlrlGoKF()) {
                                        return;
                                    }
                                }
                                if ((lj0Var2.AARZUJiTa & 262144) != 0 && (lj0Var2 instanceof defpackage.ln)) {
                                    int i = 0;
                                    for (defpackage.lj0 lj0Var3 = ((defpackage.ln) lj0Var2).fnWB2E7cs; lj0Var3 != null; lj0Var3 = lj0Var3.SH1y5HwkJhh) {
                                        if ((lj0Var3.AARZUJiTa & 262144) != 0) {
                                            i++;
                                            if (i == 1) {
                                                lj0Var2 = lj0Var3;
                                            } else {
                                                if (xl0Var == null) {
                                                    xl0Var = new defpackage.xl0(new defpackage.lj0[16]);
                                                }
                                                if (lj0Var2 != null) {
                                                    xl0Var.oh6vYeIP(lj0Var2);
                                                    lj0Var2 = null;
                                                }
                                                xl0Var.oh6vYeIP(lj0Var3);
                                            }
                                        }
                                    }
                                    if (i == 1) {
                                    }
                                }
                                lj0Var2 = defpackage.w70.riuEU0zW4(xl0Var);
                            }
                        }
                        lj0Var = lj0Var.riuEU0zW4;
                    }
                }
                D2vUnMij = D2vUnMij.V7bD7b8KA();
                lj0Var = (D2vUnMij == null || (ep0Var = D2vUnMij.yIx6ChFVk) == null) ? null : ep0Var.adDC3e2L;
            }
        }
    }

    @Override // defpackage.d71
    public final void wKlPRKlRnfqr(defpackage.n71 n71Var) {
        boolean IHQe1A4L2xu = this.QQUzIjv3iOC5.fzubgBFo().IHQe1A4L2xu();
        defpackage.j90[] j90VarArr = defpackage.l71.IHQe1A4L2xu;
        defpackage.m71 m71Var = defpackage.j71.JlrlGoKF;
        defpackage.j90 j90Var = defpackage.l71.IHQe1A4L2xu[4];
        n71Var.IHQe1A4L2xu(m71Var, java.lang.Boolean.valueOf(IHQe1A4L2xu));
        n71Var.IHQe1A4L2xu(defpackage.a71.V7bD7b8KA, new defpackage.TFRaUu83X3E(null, new defpackage.m0(0, this, defpackage.jy.class, "requestFocus", "requestFocus()Z", 0, 0, 2)));
    }
}
