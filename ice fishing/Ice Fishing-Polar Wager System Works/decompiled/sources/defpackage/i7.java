package defpackage;

/* loaded from: classes.dex */
public final class i7 extends defpackage.lj0 {
    public defpackage.rg1 EgCjBq0SZwJ;
    public final /* synthetic */ defpackage.j7 fnWB2E7cs;

    public i7(defpackage.j7 j7Var) {
        this.fnWB2E7cs = j7Var;
    }

    @Override // defpackage.lj0
    public final void JX5fKip1C6() {
        defpackage.j7 j7Var = this.fnWB2E7cs;
        j7Var.IHQe1A4L2xu = this;
        if (j7Var.oh6vYeIP != null) {
            UVjEelCZ();
        }
    }

    public final void UVjEelCZ() {
        defpackage.r1MBDhnF r1mbdhnf = new defpackage.r1MBDhnF(2, this, this.fnWB2E7cs);
        defpackage.ma0 D2vUnMij = defpackage.w70.D2vUnMij(this);
        int i = D2vUnMij.xiZrDbcSW0;
        defpackage.mz0 rectManager = ((defpackage.v0) defpackage.pa0.IHQe1A4L2xu(D2vUnMij)).getRectManager();
        defpackage.sg1 sg1Var = rectManager.r1MBDhnF;
        sg1Var.getClass();
        defpackage.xk0 xk0Var = sg1Var.IHQe1A4L2xu;
        defpackage.rg1 rg1Var = new defpackage.rg1(sg1Var, i, this, r1mbdhnf);
        java.lang.Object oh6vYeIP = xk0Var.oh6vYeIP(i);
        if (oh6vYeIP == null) {
            xk0Var.EXtogiMhuM(i, rg1Var);
            oh6vYeIP = rg1Var;
        }
        defpackage.rg1 rg1Var2 = (defpackage.rg1) oh6vYeIP;
        if (rg1Var2 != rg1Var) {
            while (true) {
                defpackage.rg1 rg1Var3 = rg1Var2.F7NU4MC0GW;
                if (rg1Var3 == null) {
                    break;
                } else {
                    rg1Var2 = rg1Var3;
                }
            }
            rg1Var2.F7NU4MC0GW = rg1Var;
        }
        if (defpackage.w70.D2vUnMij(this.adDC3e2L).ez2rX8ReCYw) {
            rectManager.oh6vYeIP.xiZrDbcSW0(i, true);
        }
        rectManager.adDC3e2L = true;
        rectManager.riuEU0zW4();
        this.EgCjBq0SZwJ = rg1Var;
    }

    @Override // defpackage.lj0
    public final void yUiIS9dG7NYk() {
        defpackage.j7 j7Var = this.fnWB2E7cs;
        if (j7Var.IHQe1A4L2xu == this) {
            j7Var.IHQe1A4L2xu = null;
        }
        defpackage.rg1 rg1Var = this.EgCjBq0SZwJ;
        if (rg1Var != null) {
            rg1Var.oh6vYeIP();
        }
        this.EgCjBq0SZwJ = null;
    }
}
