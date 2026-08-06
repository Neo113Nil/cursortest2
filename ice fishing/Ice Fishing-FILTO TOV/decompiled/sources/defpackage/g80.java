package defpackage;

/* compiled from: r8-map-id-f07502904ffb6c7cfc104556b013e0e48cd078697d1e7ebb5294e50317be4258 */
/* loaded from: classes.dex */
public final class g80 extends he0 implements b01 {
    public d80 WRKkgoJXwDn;
    public final d80 WdrkLMV3xh = new d80(this, 0);
    public xm0 Y6hRI1cF8;
    public boolean cilMamHF;
    public b80 jivtDDk9H;
    public sx0 lv06NcmrQ;
    public wu mE4lRynR;

    public g80(wu wuVar, b80 b80Var, xm0 xm0Var, boolean z) {
        this.mE4lRynR = wuVar;
        this.jivtDDk9H = b80Var;
        this.Y6hRI1cF8 = xm0Var;
        this.cilMamHF = z;
        gqMuANyCes();
    }

    @Override // defpackage.he0
    public final boolean UjhVk5crk() {
        return false;
    }

    @Override // defpackage.b01
    public final void Uxq83abb04(l01 l01Var) {
        u40[] u40VarArr = j01.GWasM1elztuh;
        k01 k01Var = h01.uFEq9NpZ;
        u40[] u40VarArr2 = j01.GWasM1elztuh;
        u40 u40Var = u40VarArr2[6];
        l01Var.GWasM1elztuh(k01Var, Boolean.TRUE);
        l01Var.GWasM1elztuh(h01.HFYAaqMd6, this.WdrkLMV3xh);
        xm0 xm0Var = this.Y6hRI1cF8;
        sx0 sx0Var = this.lv06NcmrQ;
        if (xm0Var == xm0.OOA6hdeuvCS) {
            if (sx0Var == null) {
                o30.YXi2hvwn7WL("scrollAxisRange");
                throw null;
            }
            k01 k01Var2 = h01.lv06NcmrQ;
            u40 u40Var2 = u40VarArr2[13];
            l01Var.GWasM1elztuh(k01Var2, sx0Var);
        } else {
            if (sx0Var == null) {
                o30.YXi2hvwn7WL("scrollAxisRange");
                throw null;
            }
            k01 k01Var3 = h01.cilMamHF;
            u40 u40Var3 = u40VarArr2[12];
            l01Var.GWasM1elztuh(k01Var3, sx0Var);
        }
        d80 d80Var = this.WRKkgoJXwDn;
        if (d80Var != null) {
            l01Var.GWasM1elztuh(yz0.EljAMC1QTz, new VeqTn1PQw7(null, d80Var));
        }
        l01Var.GWasM1elztuh(yz0.M3K9sHhK, new VeqTn1PQw7(null, new NWXxPwoOUSX9(18, new e80(this, 2))));
        b80 b80Var = this.jivtDDk9H;
        b80Var.getClass();
        qb qbVar = new qb(((Number) b80Var.GWasM1elztuh.getValue()).intValue(), 1);
        k01 k01Var4 = h01.EljAMC1QTz;
        u40 u40Var4 = u40VarArr2[24];
        l01Var.GWasM1elztuh(k01Var4, qbVar);
    }

    public final void gqMuANyCes() {
        this.lv06NcmrQ = new sx0(new e80(this, 0), new e80(this, 1));
        this.WRKkgoJXwDn = this.cilMamHF ? new d80(this, 1) : null;
    }
}
