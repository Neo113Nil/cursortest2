package defpackage;

/* compiled from: r8-map-id-f07502904ffb6c7cfc104556b013e0e48cd078697d1e7ebb5294e50317be4258 */
/* loaded from: classes.dex */
public final class ol0 extends tm0 {
    public static final ol0 X1lG3V04pd = new ol0(0, 2, 1);

    @Override // defpackage.tm0
    public final void GWasM1elztuh(nb nbVar, m4 m4Var, c31 c31Var, au0 au0Var, um0 um0Var) {
        lx lxVar = (lx) nbVar.X1lG3V04pd(0);
        Object X1lG3V04pd2 = nbVar.X1lG3V04pd(1);
        if (X1lG3V04pd2 instanceof vx) {
            vx vxVar = (vx) X1lG3V04pd2;
            au0Var.OOA6hdeuvCS.Yi7zF1RB1(vxVar);
            au0Var.xqGvceK5x.GWasM1elztuh(vxVar);
        }
        if (c31Var.uFEq9NpZ != 0) {
            we.GWasM1elztuh("Can only append a slot if not current inserting");
        }
        int i = c31Var.mOu10nynGul;
        int i2 = c31Var.JFJ3QoxA;
        int X1lG3V04pd3 = c31Var.X1lG3V04pd(lxVar);
        int AvO7iQsrTN = c31Var.AvO7iQsrTN(c31Var.Yi7zF1RB1, c31Var.Mjvvu5DE(X1lG3V04pd3 + 1));
        c31Var.mOu10nynGul = AvO7iQsrTN;
        c31Var.JFJ3QoxA = AvO7iQsrTN;
        c31Var.WdrkLMV3xh(1, X1lG3V04pd3);
        if (i >= AvO7iQsrTN) {
            i++;
            i2++;
        }
        c31Var.X1lG3V04pd[AvO7iQsrTN] = X1lG3V04pd2;
        c31Var.mOu10nynGul = i;
        c31Var.JFJ3QoxA = i2;
    }
}
