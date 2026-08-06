package defpackage;

/* loaded from: classes.dex */
public final class c4 extends defpackage.p90 implements defpackage.g00 {
    public final /* synthetic */ java.lang.Object AARZUJiTa;
    public final /* synthetic */ java.lang.Object EXtogiMhuM;
    public final /* synthetic */ java.lang.Object riuEU0zW4;
    public final /* synthetic */ int xiZrDbcSW0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ c4(java.lang.Object obj, java.lang.Object obj2, java.lang.Object obj3, int i) {
        super(1);
        this.xiZrDbcSW0 = i;
        this.AARZUJiTa = obj;
        this.EXtogiMhuM = obj2;
        this.riuEU0zW4 = obj3;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.g00
    public final java.lang.Object AARZUJiTa(java.lang.Object obj) {
        int i = this.xiZrDbcSW0;
        boolean z = false;
        java.lang.Object[] objArr = 0;
        defpackage.ci1 ci1Var = null;
        java.lang.Object obj2 = this.EXtogiMhuM;
        java.lang.Object obj3 = this.riuEU0zW4;
        java.lang.Object obj4 = this.AARZUJiTa;
        switch (i) {
            case 0:
                return new defpackage.b4((defpackage.gb1) obj4, obj2, (defpackage.p4) obj3, objArr == true ? 1 : 0);
            case 1:
                defpackage.ui1 ui1Var = (defpackage.ui1) obj;
                defpackage.yq yqVar = (defpackage.yq) ui1Var;
                if (!((defpackage.a2) ((defpackage.v0) defpackage.w70.frpfPPIgqM9O((defpackage.yq) obj2)).m14getDragAndDropManager()).oh6vYeIP.contains(yqVar) || !defpackage.s21.cnag84Bm(yqVar, defpackage.mj1.p4kuH6PDtgom((defpackage.c1NqjJifC7) obj3))) {
                    return defpackage.ti1.adDC3e2L;
                }
                ((defpackage.rz0) obj4).adDC3e2L = ui1Var;
                return defpackage.ti1.AARZUJiTa;
            case defpackage.gx0.FLOAT_FIELD_NUMBER /* 2 */:
                defpackage.w11 w11Var = (defpackage.w11) obj;
                defpackage.ec1 ec1Var = (defpackage.ec1) obj2;
                defpackage.ec1 ec1Var2 = (defpackage.ec1) obj4;
                w11Var.F7NU4MC0GW(ec1Var2 != null ? ((java.lang.Number) ec1Var2.getValue()).floatValue() : 1.0f);
                w11Var.xiZrDbcSW0(ec1Var != null ? ((java.lang.Number) ec1Var.getValue()).floatValue() : 1.0f);
                w11Var.AARZUJiTa(ec1Var != null ? ((java.lang.Number) ec1Var.getValue()).floatValue() : 1.0f);
                defpackage.ec1 ec1Var3 = (defpackage.ec1) obj3;
                w11Var.SH1y5HwkJhh(ec1Var3 != null ? ((defpackage.ci1) ec1Var3.getValue()).IHQe1A4L2xu : defpackage.ci1.oh6vYeIP);
                return defpackage.ok1.IHQe1A4L2xu;
            case defpackage.gx0.INTEGER_FIELD_NUMBER /* 3 */:
                defpackage.su suVar = (defpackage.su) obj3;
                int ordinal = ((defpackage.st) obj).ordinal();
                if (ordinal == 0) {
                    defpackage.mi1 mi1Var = suVar.IHQe1A4L2xu;
                } else if (ordinal == 1) {
                    ci1Var = (defpackage.ci1) obj4;
                } else {
                    if (ordinal != 2) {
                        defpackage.db.F7NU4MC0GW();
                        return null;
                    }
                    defpackage.mi1 mi1Var2 = suVar.IHQe1A4L2xu;
                }
                return new defpackage.ci1(ci1Var != null ? ci1Var.IHQe1A4L2xu : defpackage.ci1.oh6vYeIP);
            default:
                defpackage.gy gyVar = (defpackage.gy) obj;
                if (!defpackage.x70.QoRHpC4k(gyVar, (defpackage.gy) obj4)) {
                    if (defpackage.x70.QoRHpC4k(gyVar, ((defpackage.cy) obj2).r1MBDhnF)) {
                        defpackage.db.AARZUJiTa("Focus search landed at the root.");
                        return null;
                    }
                    z = ((java.lang.Boolean) ((defpackage.g00) obj3).AARZUJiTa(gyVar)).booleanValue();
                }
                return java.lang.Boolean.valueOf(z);
        }
    }
}
