package defpackage;

/* loaded from: classes.dex */
public abstract class ln extends defpackage.lj0 {
    public final int EgCjBq0SZwJ = defpackage.jp0.adDC3e2L(this);
    public defpackage.lj0 fnWB2E7cs;

    @Override // defpackage.lj0
    public final void Ay906ovssqgN() {
        super.Ay906ovssqgN();
        for (defpackage.lj0 lj0Var = this.fnWB2E7cs; lj0Var != null; lj0Var = lj0Var.SH1y5HwkJhh) {
            lj0Var.Ay906ovssqgN();
        }
    }

    @Override // defpackage.lj0
    public final void FisHbM7NmV(defpackage.lj0 lj0Var) {
        this.adDC3e2L = lj0Var;
        for (defpackage.lj0 lj0Var2 = this.fnWB2E7cs; lj0Var2 != null; lj0Var2 = lj0Var2.SH1y5HwkJhh) {
            lj0Var2.FisHbM7NmV(lj0Var);
        }
    }

    public final void H6IrRhrpWoH(defpackage.kn knVar) {
        defpackage.lj0 lj0Var = null;
        for (defpackage.lj0 lj0Var2 = this.fnWB2E7cs; lj0Var2 != null; lj0Var2 = lj0Var2.SH1y5HwkJhh) {
            if (lj0Var2 == knVar) {
                boolean z = lj0Var2.kd6TUFXn;
                if (z) {
                    defpackage.fl0 fl0Var = defpackage.jp0.IHQe1A4L2xu;
                    if (!z) {
                        defpackage.x50.oh6vYeIP("autoInvalidateRemovedNode called on unattached node");
                    }
                    defpackage.jp0.IHQe1A4L2xu(lj0Var2, -1, 2);
                    lj0Var2.Ay906ovssqgN();
                    lj0Var2.k3hcgHS3MP();
                }
                lj0Var2.FisHbM7NmV(lj0Var2);
                lj0Var2.EXtogiMhuM = 0;
                defpackage.lj0 lj0Var3 = lj0Var2.SH1y5HwkJhh;
                if (lj0Var == null) {
                    this.fnWB2E7cs = lj0Var3;
                } else {
                    lj0Var.SH1y5HwkJhh = lj0Var3;
                }
                lj0Var2.SH1y5HwkJhh = null;
                lj0Var2.riuEU0zW4 = null;
                int i = this.AARZUJiTa;
                int xiZrDbcSW0 = defpackage.jp0.xiZrDbcSW0(this);
                pm90rNzI5F(xiZrDbcSW0, true);
                if (this.kd6TUFXn && (i & 2) != 0 && (xiZrDbcSW0 & 2) == 0) {
                    defpackage.ep0 ep0Var = defpackage.w70.D2vUnMij(this).yIx6ChFVk;
                    this.adDC3e2L.xWQVQvEdoGv(null);
                    ep0Var.AARZUJiTa();
                    return;
                }
                return;
            }
            lj0Var = lj0Var2;
        }
        defpackage.db.xiZrDbcSW0(knVar, "Could not find delegate: ");
    }

    public final defpackage.kn UVjEelCZ(defpackage.kn knVar) {
        defpackage.lj0 lj0Var = ((defpackage.lj0) knVar).adDC3e2L;
        if (lj0Var != knVar) {
            defpackage.lj0 lj0Var2 = knVar instanceof defpackage.lj0 ? (defpackage.lj0) knVar : null;
            defpackage.lj0 lj0Var3 = lj0Var2 != null ? lj0Var2.riuEU0zW4 : null;
            if (lj0Var != this.adDC3e2L || !defpackage.x70.QoRHpC4k(lj0Var3, this)) {
                defpackage.db.AARZUJiTa("Cannot delegate to an already delegated node");
                return null;
            }
        } else {
            if (lj0Var.kd6TUFXn) {
                defpackage.x50.oh6vYeIP("Cannot delegate to an already attached node");
            }
            lj0Var.FisHbM7NmV(this.adDC3e2L);
            int i = this.AARZUJiTa;
            int xiZrDbcSW0 = defpackage.jp0.xiZrDbcSW0(lj0Var);
            lj0Var.AARZUJiTa = xiZrDbcSW0;
            int i2 = this.AARZUJiTa;
            int i3 = xiZrDbcSW0 & 2;
            if (i3 != 0 && (i2 & 2) != 0 && !(this instanceof defpackage.da0)) {
                defpackage.x50.oh6vYeIP("Delegating to multiple LayoutModifierNodes without the delegating node implementing LayoutModifierNode itself is not allowed.\nDelegating Node: " + this + "\nDelegate Node: " + lj0Var);
            }
            lj0Var.SH1y5HwkJhh = this.fnWB2E7cs;
            this.fnWB2E7cs = lj0Var;
            lj0Var.riuEU0zW4 = this;
            pm90rNzI5F(xiZrDbcSW0 | this.AARZUJiTa, false);
            if (this.kd6TUFXn) {
                if (i3 == 0 || (i & 2) != 0) {
                    xWQVQvEdoGv(this.JlrlGoKF);
                } else {
                    defpackage.ep0 ep0Var = defpackage.w70.D2vUnMij(this).yIx6ChFVk;
                    this.adDC3e2L.xWQVQvEdoGv(null);
                    ep0Var.AARZUJiTa();
                }
                lj0Var.flIYPhR0();
                lj0Var.seT5W8IHOge();
                if (!lj0Var.kd6TUFXn) {
                    defpackage.x50.oh6vYeIP("autoInvalidateInsertedNode called on unattached node");
                }
                defpackage.jp0.IHQe1A4L2xu(lj0Var, -1, 1);
            }
        }
        return knVar;
    }

    @Override // defpackage.lj0
    public final void boH8X4DXyc4() {
        super.boH8X4DXyc4();
        for (defpackage.lj0 lj0Var = this.fnWB2E7cs; lj0Var != null; lj0Var = lj0Var.SH1y5HwkJhh) {
            lj0Var.boH8X4DXyc4();
        }
    }

    @Override // defpackage.lj0
    public final void flIYPhR0() {
        super.flIYPhR0();
        for (defpackage.lj0 lj0Var = this.fnWB2E7cs; lj0Var != null; lj0Var = lj0Var.SH1y5HwkJhh) {
            lj0Var.xWQVQvEdoGv(this.JlrlGoKF);
            if (!lj0Var.kd6TUFXn) {
                lj0Var.flIYPhR0();
            }
        }
    }

    @Override // defpackage.lj0
    public final void k3hcgHS3MP() {
        for (defpackage.lj0 lj0Var = this.fnWB2E7cs; lj0Var != null; lj0Var = lj0Var.SH1y5HwkJhh) {
            lj0Var.k3hcgHS3MP();
        }
        super.k3hcgHS3MP();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v1, types: [lj0] */
    /* JADX WARN: Type inference failed for: r2v5 */
    /* JADX WARN: Type inference failed for: r2v6 */
    public final void pm90rNzI5F(int i, boolean z) {
        defpackage.lj0 lj0Var;
        int i2 = this.AARZUJiTa;
        this.AARZUJiTa = i;
        if (i2 != i) {
            defpackage.lj0 lj0Var2 = this.adDC3e2L;
            if (lj0Var2 == this) {
                this.EXtogiMhuM = i;
            }
            boolean z2 = this.kd6TUFXn;
            ?? r2 = this;
            if (z2) {
                while (r2 != 0) {
                    i |= r2.AARZUJiTa;
                    r2.AARZUJiTa = i;
                    if (r2 == lj0Var2) {
                        break;
                    } else {
                        r2 = r2.riuEU0zW4;
                    }
                }
                if (z && r2 == lj0Var2) {
                    i = defpackage.jp0.xiZrDbcSW0(lj0Var2);
                    lj0Var2.AARZUJiTa = i;
                }
                int i3 = i | ((r2 == 0 || (lj0Var = r2.SH1y5HwkJhh) == null) ? 0 : lj0Var.EXtogiMhuM);
                for (defpackage.lj0 lj0Var3 = r2; lj0Var3 != null; lj0Var3 = lj0Var3.riuEU0zW4) {
                    i3 |= lj0Var3.AARZUJiTa;
                    lj0Var3.EXtogiMhuM = i3;
                }
            }
        }
    }

    @Override // defpackage.lj0
    public final void seT5W8IHOge() {
        for (defpackage.lj0 lj0Var = this.fnWB2E7cs; lj0Var != null; lj0Var = lj0Var.SH1y5HwkJhh) {
            lj0Var.seT5W8IHOge();
        }
        super.seT5W8IHOge();
    }

    @Override // defpackage.lj0
    public final void xWQVQvEdoGv(defpackage.ip0 ip0Var) {
        this.JlrlGoKF = ip0Var;
        for (defpackage.lj0 lj0Var = this.fnWB2E7cs; lj0Var != null; lj0Var = lj0Var.SH1y5HwkJhh) {
            lj0Var.xWQVQvEdoGv(ip0Var);
        }
    }
}
