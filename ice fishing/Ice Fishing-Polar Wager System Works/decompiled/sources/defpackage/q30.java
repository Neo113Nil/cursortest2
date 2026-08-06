package defpackage;

/* loaded from: classes.dex */
public final class q30 implements defpackage.m00 {
    public final /* synthetic */ int adDC3e2L;
    public final /* synthetic */ java.util.List xiZrDbcSW0;

    public /* synthetic */ q30(int i, java.util.List list) {
        this.adDC3e2L = i;
        this.xiZrDbcSW0 = list;
    }

    @Override // defpackage.m00
    public final java.lang.Object riuEU0zW4(java.lang.Object obj, java.lang.Object obj2, java.lang.Object obj3, java.lang.Object obj4) {
        int i;
        int i2;
        int i3 = this.adDC3e2L;
        defpackage.ok1 ok1Var = defpackage.ok1.IHQe1A4L2xu;
        java.util.List list = this.xiZrDbcSW0;
        switch (i3) {
            case 0:
                defpackage.hb0 hb0Var = (defpackage.hb0) obj;
                int intValue = ((java.lang.Number) obj2).intValue();
                defpackage.t10 t10Var = (defpackage.t10) obj3;
                int intValue2 = ((java.lang.Number) obj4).intValue();
                if ((intValue2 & 6) == 0) {
                    i = intValue2 | (t10Var.xiZrDbcSW0(hb0Var) ? 4 : 2);
                } else {
                    i = intValue2;
                }
                if ((intValue2 & 48) == 0) {
                    i |= t10Var.F7NU4MC0GW(intValue) ? 32 : 16;
                }
                if (!t10Var.lpprD5VAS(i & 1, (i & 147) != 146)) {
                    t10Var.WLpAkxCo();
                    break;
                } else {
                    defpackage.j30 j30Var = (defpackage.j30) list.get(intValue);
                    t10Var.AsxAYCCkb3Hi(215302284);
                    defpackage.s21.adDC3e2L(j30Var, t10Var, 0);
                    t10Var.QoRHpC4k(false);
                    break;
                }
            default:
                defpackage.hb0 hb0Var2 = (defpackage.hb0) obj;
                int intValue3 = ((java.lang.Number) obj2).intValue();
                defpackage.t10 t10Var2 = (defpackage.t10) obj3;
                int intValue4 = ((java.lang.Number) obj4).intValue();
                if ((intValue4 & 6) == 0) {
                    i2 = intValue4 | (t10Var2.xiZrDbcSW0(hb0Var2) ? 4 : 2);
                } else {
                    i2 = intValue4;
                }
                if ((intValue4 & 48) == 0) {
                    i2 |= t10Var2.F7NU4MC0GW(intValue3) ? 32 : 16;
                }
                if (!t10Var2.lpprD5VAS(i2 & 1, (i2 & 147) != 146)) {
                    t10Var2.WLpAkxCo();
                    break;
                } else {
                    defpackage.WnQbjbWuMR wnQbjbWuMR = (defpackage.WnQbjbWuMR) list.get(intValue3);
                    t10Var2.AsxAYCCkb3Hi(1022402951);
                    defpackage.mj1.IHQe1A4L2xu(wnQbjbWuMR, t10Var2, 0);
                    t10Var2.QoRHpC4k(false);
                    break;
                }
        }
        return ok1Var;
    }
}
