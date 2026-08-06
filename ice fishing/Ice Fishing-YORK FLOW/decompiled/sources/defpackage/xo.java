package defpackage;

/* compiled from: r8-map-id-5e15bf382d9e1cc682b2b5d208f848646545054061ee84effb1e415a0540fc32 */
/* loaded from: classes.dex */
public abstract class xo extends defpackage.ul0 {
    public final int BHfvd2J71qpO = defpackage.tr0.WDYagTQQm9ns(this);
    public defpackage.ul0 ZVVdXbWmyCSK;

    @Override // defpackage.ul0
    public final void ARgw6UjYb9W7(defpackage.ul0 ul0Var) {
        this.WDYagTQQm9ns = ul0Var;
        for (defpackage.ul0 ul0Var2 = this.ZVVdXbWmyCSK; ul0Var2 != null; ul0Var2 = ul0Var2.GE9mJIPrb8gP) {
            ul0Var2.ARgw6UjYb9W7(ul0Var);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v1, types: [ul0] */
    /* JADX WARN: Type inference failed for: r2v5 */
    /* JADX WARN: Type inference failed for: r2v6 */
    public final void I9id0xDxCgYV(int i, boolean z) {
        defpackage.ul0 ul0Var;
        int i2 = this.QiMR8OkAhezm;
        this.QiMR8OkAhezm = i;
        if (i2 != i) {
            defpackage.ul0 ul0Var2 = this.WDYagTQQm9ns;
            if (ul0Var2 == this) {
                this.P05cfTpS5W5L = i;
            }
            boolean z2 = this.s0TASMVLSWD5;
            ?? r2 = this;
            if (z2) {
                while (r2 != 0) {
                    i |= r2.QiMR8OkAhezm;
                    r2.QiMR8OkAhezm = i;
                    if (r2 == ul0Var2) {
                        break;
                    } else {
                        r2 = r2.e6mdH7fiFuta;
                    }
                }
                if (z && r2 == ul0Var2) {
                    i = defpackage.tr0.oh71FJcDz6S2(ul0Var2);
                    ul0Var2.QiMR8OkAhezm = i;
                }
                int i3 = i | ((r2 == 0 || (ul0Var = r2.GE9mJIPrb8gP) == null) ? 0 : ul0Var.P05cfTpS5W5L);
                for (defpackage.ul0 ul0Var3 = r2; ul0Var3 != null; ul0Var3 = ul0Var3.e6mdH7fiFuta) {
                    i3 |= ul0Var3.QiMR8OkAhezm;
                    ul0Var3.P05cfTpS5W5L = i3;
                }
            }
        }
    }

    @Override // defpackage.ul0
    public final void K0gkXZrJwRZi() {
        for (defpackage.ul0 ul0Var = this.ZVVdXbWmyCSK; ul0Var != null; ul0Var = ul0Var.GE9mJIPrb8gP) {
            ul0Var.K0gkXZrJwRZi();
        }
        super.K0gkXZrJwRZi();
    }

    @Override // defpackage.ul0
    public final void S0c5Wv6LbIVo() {
        super.S0c5Wv6LbIVo();
        for (defpackage.ul0 ul0Var = this.ZVVdXbWmyCSK; ul0Var != null; ul0Var = ul0Var.GE9mJIPrb8gP) {
            ul0Var.SJaTq1YjP6B8(this.fNwYGHIYeJcR);
            if (!ul0Var.s0TASMVLSWD5) {
                ul0Var.S0c5Wv6LbIVo();
            }
        }
    }

    @Override // defpackage.ul0
    public final void SJaTq1YjP6B8(defpackage.sr0 sr0Var) {
        this.fNwYGHIYeJcR = sr0Var;
        for (defpackage.ul0 ul0Var = this.ZVVdXbWmyCSK; ul0Var != null; ul0Var = ul0Var.GE9mJIPrb8gP) {
            ul0Var.SJaTq1YjP6B8(sr0Var);
        }
    }

    @Override // defpackage.ul0
    public final void TlJvUa0ZXCBu() {
        for (defpackage.ul0 ul0Var = this.ZVVdXbWmyCSK; ul0Var != null; ul0Var = ul0Var.GE9mJIPrb8gP) {
            ul0Var.TlJvUa0ZXCBu();
        }
        super.TlJvUa0ZXCBu();
    }

    @Override // defpackage.ul0
    public final void Ux2tdpxXtKdg() {
        super.Ux2tdpxXtKdg();
        for (defpackage.ul0 ul0Var = this.ZVVdXbWmyCSK; ul0Var != null; ul0Var = ul0Var.GE9mJIPrb8gP) {
            ul0Var.Ux2tdpxXtKdg();
        }
    }

    public final defpackage.wo YZh1E3mnTFwf(defpackage.wo woVar) {
        defpackage.ul0 ul0Var = ((defpackage.ul0) woVar).WDYagTQQm9ns;
        if (ul0Var != woVar) {
            defpackage.ul0 ul0Var2 = woVar instanceof defpackage.ul0 ? (defpackage.ul0) woVar : null;
            defpackage.ul0 ul0Var3 = ul0Var2 != null ? ul0Var2.e6mdH7fiFuta : null;
            if (ul0Var != this.WDYagTQQm9ns || !defpackage.ma0.QiMR8OkAhezm(ul0Var3, this)) {
                defpackage.h7.P05cfTpS5W5L("Cannot delegate to an already delegated node");
                return null;
            }
        } else {
            if (ul0Var.s0TASMVLSWD5) {
                defpackage.e80.giKS3J6vZuNy("Cannot delegate to an already attached node");
            }
            ul0Var.ARgw6UjYb9W7(this.WDYagTQQm9ns);
            int i = this.QiMR8OkAhezm;
            int oh71FJcDz6S2 = defpackage.tr0.oh71FJcDz6S2(ul0Var);
            ul0Var.QiMR8OkAhezm = oh71FJcDz6S2;
            int i2 = this.QiMR8OkAhezm;
            int i3 = oh71FJcDz6S2 & 2;
            if (i3 != 0 && (i2 & 2) != 0 && !(this instanceof defpackage.ad0)) {
                defpackage.e80.giKS3J6vZuNy("Delegating to multiple LayoutModifierNodes without the delegating node implementing LayoutModifierNode itself is not allowed.\nDelegating Node: " + this + "\nDelegate Node: " + ul0Var);
            }
            ul0Var.GE9mJIPrb8gP = this.ZVVdXbWmyCSK;
            this.ZVVdXbWmyCSK = ul0Var;
            ul0Var.e6mdH7fiFuta = this;
            I9id0xDxCgYV(oh71FJcDz6S2 | this.QiMR8OkAhezm, false);
            if (this.s0TASMVLSWD5) {
                if (i3 == 0 || (i & 2) != 0) {
                    SJaTq1YjP6B8(this.fNwYGHIYeJcR);
                } else {
                    defpackage.or0 or0Var = defpackage.la0.UmgHb6n58gfG(this).IBvW5fLsPuHy;
                    this.WDYagTQQm9ns.SJaTq1YjP6B8(null);
                    or0Var.QiMR8OkAhezm();
                }
                ul0Var.S0c5Wv6LbIVo();
                ul0Var.K0gkXZrJwRZi();
                if (!ul0Var.s0TASMVLSWD5) {
                    defpackage.e80.giKS3J6vZuNy("autoInvalidateInsertedNode called on unattached node");
                }
                defpackage.tr0.ZpBGe2uQfcn8(ul0Var, -1, 1);
            }
        }
        return woVar;
    }

    @Override // defpackage.ul0
    public final void ZdAZC2JJ1p6Z() {
        super.ZdAZC2JJ1p6Z();
        for (defpackage.ul0 ul0Var = this.ZVVdXbWmyCSK; ul0Var != null; ul0Var = ul0Var.GE9mJIPrb8gP) {
            ul0Var.ZdAZC2JJ1p6Z();
        }
    }

    public final void xbkEJUK1coRZ(defpackage.wo woVar) {
        defpackage.ul0 ul0Var = null;
        for (defpackage.ul0 ul0Var2 = this.ZVVdXbWmyCSK; ul0Var2 != null; ul0Var2 = ul0Var2.GE9mJIPrb8gP) {
            if (ul0Var2 == woVar) {
                boolean z = ul0Var2.s0TASMVLSWD5;
                if (z) {
                    defpackage.on0 on0Var = defpackage.tr0.ZpBGe2uQfcn8;
                    if (!z) {
                        defpackage.e80.giKS3J6vZuNy("autoInvalidateRemovedNode called on unattached node");
                    }
                    defpackage.tr0.ZpBGe2uQfcn8(ul0Var2, -1, 2);
                    ul0Var2.Ux2tdpxXtKdg();
                    ul0Var2.TlJvUa0ZXCBu();
                }
                ul0Var2.ARgw6UjYb9W7(ul0Var2);
                ul0Var2.P05cfTpS5W5L = 0;
                defpackage.ul0 ul0Var3 = ul0Var2.GE9mJIPrb8gP;
                if (ul0Var == null) {
                    this.ZVVdXbWmyCSK = ul0Var3;
                } else {
                    ul0Var.GE9mJIPrb8gP = ul0Var3;
                }
                ul0Var2.GE9mJIPrb8gP = null;
                ul0Var2.e6mdH7fiFuta = null;
                int i = this.QiMR8OkAhezm;
                int oh71FJcDz6S2 = defpackage.tr0.oh71FJcDz6S2(this);
                I9id0xDxCgYV(oh71FJcDz6S2, true);
                if (this.s0TASMVLSWD5 && (i & 2) != 0 && (oh71FJcDz6S2 & 2) == 0) {
                    defpackage.or0 or0Var = defpackage.la0.UmgHb6n58gfG(this).IBvW5fLsPuHy;
                    this.WDYagTQQm9ns.SJaTq1YjP6B8(null);
                    or0Var.QiMR8OkAhezm();
                    return;
                }
                return;
            }
            ul0Var = ul0Var2;
        }
        defpackage.h7.QiMR8OkAhezm(woVar, "Could not find delegate: ");
    }
}
