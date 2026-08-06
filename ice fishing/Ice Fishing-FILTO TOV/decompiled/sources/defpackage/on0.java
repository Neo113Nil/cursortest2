package defpackage;

/* compiled from: r8-map-id-f07502904ffb6c7cfc104556b013e0e48cd078697d1e7ebb5294e50317be4258 */
/* loaded from: classes.dex */
public final class on0 extends he0 implements w50 {
    public nn0 mE4lRynR;

    @Override // defpackage.w50
    public final cd0 ES6ysExf(dd0 dd0Var, wc0 wc0Var, long j) {
        nn0 nn0Var = this.mE4lRynR;
        p50 layoutDirection = dd0Var.getLayoutDirection();
        p50 p50Var = p50.OOA6hdeuvCS;
        float f = layoutDirection == p50Var ? nn0Var.GWasM1elztuh : nn0Var.X1lG3V04pd;
        nn0 nn0Var2 = this.mE4lRynR;
        float f2 = nn0Var2.Yi7zF1RB1;
        float f3 = dd0Var.getLayoutDirection() == p50Var ? nn0Var2.X1lG3V04pd : nn0Var2.GWasM1elztuh;
        float f4 = this.mE4lRynR.xqGvceK5x;
        if (!((cn.GWasM1elztuh(f, 0.0f) >= 0) & (cn.GWasM1elztuh(f2, 0.0f) >= 0) & (cn.GWasM1elztuh(f3, 0.0f) >= 0) & (cn.GWasM1elztuh(f4, 0.0f) >= 0))) {
            r10.GWasM1elztuh("Padding must be non-negative");
        }
        int rezfBrjOrqK = dd0Var.rezfBrjOrqK(f);
        int rezfBrjOrqK2 = dd0Var.rezfBrjOrqK(f3) + rezfBrjOrqK;
        int rezfBrjOrqK3 = dd0Var.rezfBrjOrqK(f2);
        int rezfBrjOrqK4 = dd0Var.rezfBrjOrqK(f4) + rezfBrjOrqK3;
        up0 OOA6hdeuvCS = wc0Var.OOA6hdeuvCS(fg.encWxUiV2(-rezfBrjOrqK2, -rezfBrjOrqK4, j));
        return dd0Var.MjxSquD6Av(fg.EljAMC1QTz(OOA6hdeuvCS.OOA6hdeuvCS + rezfBrjOrqK2, j), fg.OOA6hdeuvCS(OOA6hdeuvCS.EljAMC1QTz + rezfBrjOrqK4, j), yp.OOA6hdeuvCS, new j20(OOA6hdeuvCS, rezfBrjOrqK, rezfBrjOrqK3, 2));
    }
}
