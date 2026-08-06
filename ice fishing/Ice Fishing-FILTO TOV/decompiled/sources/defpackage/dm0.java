package defpackage;

/* compiled from: r8-map-id-f07502904ffb6c7cfc104556b013e0e48cd078697d1e7ebb5294e50317be4258 */
/* loaded from: classes.dex */
public final class dm0 extends tm0 {
    public static final dm0 X1lG3V04pd = new dm0(0, 3, 1);

    @Override // defpackage.tm0
    public final void GWasM1elztuh(nb nbVar, m4 m4Var, c31 c31Var, au0 au0Var, um0 um0Var) {
        d dVar;
        z21 z21Var = (z21) nbVar.X1lG3V04pd(1);
        lx lxVar = (lx) nbVar.X1lG3V04pd(0);
        as asVar = (as) nbVar.X1lG3V04pd(2);
        c31 OOA6hdeuvCS = z21Var.OOA6hdeuvCS();
        if (um0Var != null) {
            try {
                dVar = new d(14, um0Var, c31Var);
            } catch (Throwable th) {
                OOA6hdeuvCS.OOA6hdeuvCS(false);
                throw th;
            }
        } else {
            dVar = null;
        }
        if (!asVar.X1lG3V04pd.rezfBrjOrqK()) {
            we.GWasM1elztuh("FixupList has pending fixup operations that were not realized. Were there mismatched insertNode() and endNodeInsert() calls?");
        }
        asVar.Yi7zF1RB1.HFYAaqMd6(m4Var, OOA6hdeuvCS, au0Var, dVar);
        OOA6hdeuvCS.OOA6hdeuvCS(true);
        c31Var.xqGvceK5x();
        lxVar.getClass();
        c31Var.pog2g9KITJA(z21Var, z21Var.GWasM1elztuh(lxVar));
        c31Var.rQPn8YBR();
    }
}
