package defpackage;

/* loaded from: classes.dex */
public final class or0 extends defpackage.gs0 {
    public static final defpackage.or0 AARZUJiTa;
    public static final defpackage.or0 F7NU4MC0GW;
    public static final defpackage.or0 adDC3e2L;
    public static final defpackage.or0 xiZrDbcSW0;
    public final /* synthetic */ int r1MBDhnF;

    static {
        int i = 1;
        F7NU4MC0GW = new defpackage.or0(i, 2, 0);
        int i2 = 1;
        adDC3e2L = new defpackage.or0(i2, i2, 1);
        xiZrDbcSW0 = new defpackage.or0(i, 2, 2);
        int i3 = 1;
        AARZUJiTa = new defpackage.or0(i3, i3, 3);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ or0(int i, int i2, int i3) {
        super(i, i2);
        this.r1MBDhnF = i3;
    }

    @Override // defpackage.gs0
    public final void IHQe1A4L2xu(defpackage.pd pdVar, defpackage.b6 b6Var, defpackage.ia1 ia1Var, defpackage.v01 v01Var, defpackage.hs0 hs0Var) {
        switch (this.r1MBDhnF) {
            case 0:
                java.lang.Object IHQe1A4L2xu = ((defpackage.vz) pdVar.r1MBDhnF(0)).IHQe1A4L2xu();
                defpackage.o10 o10Var = (defpackage.o10) pdVar.r1MBDhnF(1);
                int oh6vYeIP = pdVar.oh6vYeIP(0);
                o10Var.getClass();
                ia1Var.EoOhNTTfIN7K(ia1Var.r1MBDhnF(o10Var), IHQe1A4L2xu);
                b6Var.xiZrDbcSW0(oh6vYeIP, IHQe1A4L2xu);
                b6Var.F7NU4MC0GW(IHQe1A4L2xu);
                break;
            case 1:
                defpackage.o10 o10Var2 = (defpackage.o10) pdVar.r1MBDhnF(0);
                int oh6vYeIP2 = pdVar.oh6vYeIP(0);
                b6Var.G3OKOH3wZRC();
                o10Var2.getClass();
                b6Var.r1MBDhnF(oh6vYeIP2, ia1Var.v5iciZok(ia1Var.r1MBDhnF(o10Var2)));
                break;
            case defpackage.gx0.FLOAT_FIELD_NUMBER /* 2 */:
                java.lang.Object r1MBDhnF = pdVar.r1MBDhnF(0);
                defpackage.o10 o10Var3 = (defpackage.o10) pdVar.r1MBDhnF(1);
                int oh6vYeIP3 = pdVar.oh6vYeIP(0);
                if (r1MBDhnF instanceof defpackage.x10) {
                    defpackage.x10 x10Var = (defpackage.x10) r1MBDhnF;
                    v01Var.adDC3e2L.oh6vYeIP(x10Var);
                    v01Var.F7NU4MC0GW.IHQe1A4L2xu(x10Var);
                }
                java.lang.Object XZx205DYe = ia1Var.XZx205DYe(ia1Var.r1MBDhnF(o10Var3), oh6vYeIP3, r1MBDhnF);
                if (!(XZx205DYe instanceof defpackage.x10)) {
                    if (XZx205DYe instanceof defpackage.az0) {
                        ((defpackage.az0) XZx205DYe).r1MBDhnF();
                        break;
                    }
                } else {
                    v01Var.adDC3e2L((defpackage.x10) XZx205DYe);
                    break;
                }
                break;
            default:
                java.lang.Object r1MBDhnF2 = pdVar.r1MBDhnF(0);
                int oh6vYeIP4 = pdVar.oh6vYeIP(0);
                if (r1MBDhnF2 instanceof defpackage.x10) {
                    defpackage.x10 x10Var2 = (defpackage.x10) r1MBDhnF2;
                    v01Var.adDC3e2L.oh6vYeIP(x10Var2);
                    v01Var.F7NU4MC0GW.IHQe1A4L2xu(x10Var2);
                }
                java.lang.Object XZx205DYe2 = ia1Var.XZx205DYe(ia1Var.fnWB2E7cs, oh6vYeIP4, r1MBDhnF2);
                if (!(XZx205DYe2 instanceof defpackage.x10)) {
                    if (XZx205DYe2 instanceof defpackage.az0) {
                        ((defpackage.az0) XZx205DYe2).r1MBDhnF();
                        break;
                    }
                } else {
                    v01Var.adDC3e2L((defpackage.x10) XZx205DYe2);
                    break;
                }
                break;
        }
    }

    @Override // defpackage.gs0
    public defpackage.o10 oh6vYeIP(defpackage.pd pdVar) {
        switch (this.r1MBDhnF) {
            case 0:
                return (defpackage.o10) pdVar.r1MBDhnF(1);
            case 1:
                return (defpackage.o10) pdVar.r1MBDhnF(0);
            default:
                return super.oh6vYeIP(pdVar);
        }
    }
}
