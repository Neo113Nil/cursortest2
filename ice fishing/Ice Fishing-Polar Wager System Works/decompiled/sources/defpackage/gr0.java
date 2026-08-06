package defpackage;

/* loaded from: classes.dex */
public final class gr0 extends defpackage.gs0 {
    public static final defpackage.gr0 r1MBDhnF = new defpackage.gr0(0, 2, 1);

    @Override // defpackage.gs0
    public final void IHQe1A4L2xu(defpackage.pd pdVar, defpackage.b6 b6Var, defpackage.ia1 ia1Var, defpackage.v01 v01Var, defpackage.hs0 hs0Var) {
        int i;
        defpackage.g70 g70Var = (defpackage.g70) pdVar.r1MBDhnF(0);
        int r1MBDhnF2 = ia1Var.r1MBDhnF((defpackage.o10) pdVar.r1MBDhnF(1));
        if (ia1Var.fnWB2E7cs >= r1MBDhnF2) {
            defpackage.dh.IHQe1A4L2xu("Check failed");
        }
        defpackage.s70.XZx205DYe(ia1Var, b6Var, r1MBDhnF2);
        int i2 = ia1Var.fnWB2E7cs;
        int i3 = ia1Var.V7bD7b8KA;
        while (i3 >= 0 && !ia1Var.NHJTzaLwkd(i3)) {
            i3 = ia1Var.D2vUnMij(ia1Var.oh6vYeIP, i3);
        }
        int i4 = i3 + 1;
        int i5 = 0;
        while (i4 < i2) {
            if (ia1Var.V7bD7b8KA(i2, i4)) {
                if (ia1Var.NHJTzaLwkd(i4)) {
                    i5 = 0;
                }
                i4++;
            } else {
                i5 += ia1Var.NHJTzaLwkd(i4) ? 1 : ia1Var.oh6vYeIP[(ia1Var.kd6TUFXn(i4) * 5) + 1] & 67108863;
                i4 += ia1Var.kNAkVymC(i4);
            }
        }
        while (true) {
            i = ia1Var.fnWB2E7cs;
            if (i >= r1MBDhnF2) {
                break;
            }
            if (ia1Var.V7bD7b8KA(r1MBDhnF2, i)) {
                int i6 = ia1Var.fnWB2E7cs;
                if (i6 < ia1Var.kNAkVymC && (ia1Var.oh6vYeIP[(ia1Var.kd6TUFXn(i6) * 5) + 1] & 1073741824) != 0) {
                    b6Var.F7NU4MC0GW(ia1Var.v5iciZok(ia1Var.fnWB2E7cs));
                    i5 = 0;
                }
                ia1Var.hkbnNdmy();
            } else {
                i5 += ia1Var.mAr5m2L7gYDP();
            }
        }
        if (i != r1MBDhnF2) {
            defpackage.dh.IHQe1A4L2xu("Check failed");
        }
        g70Var.IHQe1A4L2xu = i5;
    }
}
