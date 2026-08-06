package defpackage;

/* compiled from: r8-map-id-f07502904ffb6c7cfc104556b013e0e48cd078697d1e7ebb5294e50317be4258 */
/* loaded from: classes.dex */
public final class bm0 extends tm0 {
    public static final bm0 AvO7iQsrTN;
    public static final bm0 EljAMC1QTz;
    public static final bm0 OOA6hdeuvCS;
    public static final bm0 xqGvceK5x;
    public final /* synthetic */ int X1lG3V04pd;

    static {
        int i = 1;
        xqGvceK5x = new bm0(i, 2, 0);
        int i2 = 1;
        OOA6hdeuvCS = new bm0(i2, i2, 1);
        EljAMC1QTz = new bm0(i, 2, 2);
        int i3 = 1;
        AvO7iQsrTN = new bm0(i3, i3, 3);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ bm0(int i, int i2, int i3) {
        super(i, i2);
        this.X1lG3V04pd = i3;
    }

    @Override // defpackage.tm0
    public final void GWasM1elztuh(nb nbVar, m4 m4Var, c31 c31Var, au0 au0Var, um0 um0Var) {
        switch (this.X1lG3V04pd) {
            case 0:
                Object GWasM1elztuh = ((wu) nbVar.X1lG3V04pd(0)).GWasM1elztuh();
                lx lxVar = (lx) nbVar.X1lG3V04pd(1);
                int Yi7zF1RB1 = nbVar.Yi7zF1RB1(0);
                lxVar.getClass();
                c31Var.J3Xc8BaqpN8(c31Var.X1lG3V04pd(lxVar), GWasM1elztuh);
                m4Var.EljAMC1QTz(Yi7zF1RB1, GWasM1elztuh);
                m4Var.xqGvceK5x(GWasM1elztuh);
                break;
            case 1:
                lx lxVar2 = (lx) nbVar.X1lG3V04pd(0);
                int Yi7zF1RB12 = nbVar.Yi7zF1RB1(0);
                m4Var.YmKjaVtbfp5Z();
                lxVar2.getClass();
                m4Var.X1lG3V04pd(Yi7zF1RB12, c31Var.EXrPz3p7hFb(c31Var.X1lG3V04pd(lxVar2)));
                break;
            case 2:
                Object X1lG3V04pd = nbVar.X1lG3V04pd(0);
                lx lxVar3 = (lx) nbVar.X1lG3V04pd(1);
                int Yi7zF1RB13 = nbVar.Yi7zF1RB1(0);
                if (X1lG3V04pd instanceof vx) {
                    vx vxVar = (vx) X1lG3V04pd;
                    au0Var.OOA6hdeuvCS.Yi7zF1RB1(vxVar);
                    au0Var.xqGvceK5x.GWasM1elztuh(vxVar);
                }
                Object DmJncFq5 = c31Var.DmJncFq5(c31Var.X1lG3V04pd(lxVar3), Yi7zF1RB13, X1lG3V04pd);
                if (!(DmJncFq5 instanceof vx)) {
                    if (DmJncFq5 instanceof at0) {
                        ((at0) DmJncFq5).X1lG3V04pd();
                        break;
                    }
                } else {
                    au0Var.OOA6hdeuvCS((vx) DmJncFq5);
                    break;
                }
                break;
            default:
                Object X1lG3V04pd2 = nbVar.X1lG3V04pd(0);
                int Yi7zF1RB14 = nbVar.Yi7zF1RB1(0);
                if (X1lG3V04pd2 instanceof vx) {
                    vx vxVar2 = (vx) X1lG3V04pd2;
                    au0Var.OOA6hdeuvCS.Yi7zF1RB1(vxVar2);
                    au0Var.xqGvceK5x.GWasM1elztuh(vxVar2);
                }
                Object DmJncFq52 = c31Var.DmJncFq5(c31Var.jivtDDk9H, Yi7zF1RB14, X1lG3V04pd2);
                if (!(DmJncFq52 instanceof vx)) {
                    if (DmJncFq52 instanceof at0) {
                        ((at0) DmJncFq52).X1lG3V04pd();
                        break;
                    }
                } else {
                    au0Var.OOA6hdeuvCS((vx) DmJncFq52);
                    break;
                }
                break;
        }
    }

    @Override // defpackage.tm0
    public lx Yi7zF1RB1(nb nbVar) {
        switch (this.X1lG3V04pd) {
            case 0:
                return (lx) nbVar.X1lG3V04pd(1);
            case 1:
                return (lx) nbVar.X1lG3V04pd(0);
            default:
                return super.Yi7zF1RB1(nbVar);
        }
    }
}
