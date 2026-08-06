package defpackage;

/* loaded from: classes.dex */
public final class br0 extends defpackage.gs0 {
    public static final defpackage.br0 r1MBDhnF = new defpackage.br0(0, 2, 1);

    @Override // defpackage.gs0
    public final void IHQe1A4L2xu(defpackage.pd pdVar, defpackage.b6 b6Var, defpackage.ia1 ia1Var, defpackage.v01 v01Var, defpackage.hs0 hs0Var) {
        defpackage.o10 o10Var = (defpackage.o10) pdVar.r1MBDhnF(0);
        java.lang.Object r1MBDhnF2 = pdVar.r1MBDhnF(1);
        if (r1MBDhnF2 instanceof defpackage.x10) {
            defpackage.x10 x10Var = (defpackage.x10) r1MBDhnF2;
            v01Var.adDC3e2L.oh6vYeIP(x10Var);
            v01Var.F7NU4MC0GW.IHQe1A4L2xu(x10Var);
        }
        if (ia1Var.SyNS6RMn != 0) {
            defpackage.dh.IHQe1A4L2xu("Can only append a slot if not current inserting");
        }
        int i = ia1Var.riuEU0zW4;
        int i2 = ia1Var.SH1y5HwkJhh;
        int r1MBDhnF3 = ia1Var.r1MBDhnF(o10Var);
        int AARZUJiTa = ia1Var.AARZUJiTa(ia1Var.oh6vYeIP, ia1Var.kd6TUFXn(r1MBDhnF3 + 1));
        ia1Var.riuEU0zW4 = AARZUJiTa;
        ia1Var.SH1y5HwkJhh = AARZUJiTa;
        ia1Var.abhbClRa(1, r1MBDhnF3);
        if (i >= AARZUJiTa) {
            i++;
            i2++;
        }
        ia1Var.r1MBDhnF[AARZUJiTa] = r1MBDhnF2;
        ia1Var.riuEU0zW4 = i;
        ia1Var.SH1y5HwkJhh = i2;
    }
}
