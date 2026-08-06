package defpackage;

/* loaded from: classes.dex */
public final class yf implements defpackage.k00 {
    public final /* synthetic */ int adDC3e2L;
    public static final defpackage.yf xiZrDbcSW0 = new defpackage.yf(0);
    public static final defpackage.yf AARZUJiTa = new defpackage.yf(1);
    public static final defpackage.yf EXtogiMhuM = new defpackage.yf(2);
    public static final defpackage.yf riuEU0zW4 = new defpackage.yf(3);
    public static final defpackage.yf SH1y5HwkJhh = new defpackage.yf(4);

    public /* synthetic */ yf(int i) {
        this.adDC3e2L = i;
    }

    @Override // defpackage.k00
    public final java.lang.Object adDC3e2L(java.lang.Object obj, java.lang.Object obj2) {
        int i = this.adDC3e2L;
        defpackage.ok1 ok1Var = defpackage.ok1.IHQe1A4L2xu;
        switch (i) {
            case 0:
                defpackage.t10 t10Var = (defpackage.t10) obj;
                int intValue = ((java.lang.Number) obj2).intValue();
                if (!t10Var.lpprD5VAS(intValue & 1, (intValue & 3) != 2)) {
                    t10Var.WLpAkxCo();
                }
                return ok1Var;
            case 1:
                defpackage.t10 t10Var2 = (defpackage.t10) obj;
                int intValue2 = ((java.lang.Number) obj2).intValue();
                if (!t10Var2.lpprD5VAS(intValue2 & 1, (intValue2 & 3) != 2)) {
                    t10Var2.WLpAkxCo();
                }
                return ok1Var;
            case defpackage.gx0.FLOAT_FIELD_NUMBER /* 2 */:
                defpackage.t10 t10Var3 = (defpackage.t10) obj;
                int intValue3 = ((java.lang.Number) obj2).intValue();
                if (!t10Var3.lpprD5VAS(intValue3 & 1, (intValue3 & 3) != 2)) {
                    t10Var3.WLpAkxCo();
                }
                return ok1Var;
            case defpackage.gx0.INTEGER_FIELD_NUMBER /* 3 */:
                defpackage.t10 t10Var4 = (defpackage.t10) obj;
                int intValue4 = ((java.lang.Number) obj2).intValue();
                if (!t10Var4.lpprD5VAS(intValue4 & 1, (intValue4 & 3) != 2)) {
                    t10Var4.WLpAkxCo();
                }
                return ok1Var;
            default:
                long j = ((defpackage.ae) obj2).IHQe1A4L2xu;
                return j == 16 ? java.lang.Boolean.FALSE : java.lang.Integer.valueOf(defpackage.w70.yIx6ChFVk(j));
        }
    }
}
