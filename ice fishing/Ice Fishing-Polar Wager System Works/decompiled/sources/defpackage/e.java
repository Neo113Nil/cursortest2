package defpackage;

/* loaded from: classes.dex */
public final /* synthetic */ class e implements defpackage.k00 {
    public final /* synthetic */ int adDC3e2L;
    public final /* synthetic */ defpackage.sf xiZrDbcSW0;

    public /* synthetic */ e(defpackage.sf sfVar) {
        this.adDC3e2L = 1;
        this.xiZrDbcSW0 = sfVar;
    }

    @Override // defpackage.k00
    public final java.lang.Object adDC3e2L(java.lang.Object obj, java.lang.Object obj2) {
        int i = this.adDC3e2L;
        defpackage.ok1 ok1Var = defpackage.ok1.IHQe1A4L2xu;
        defpackage.sf sfVar = this.xiZrDbcSW0;
        defpackage.t10 t10Var = (defpackage.t10) obj;
        java.lang.Integer num = (java.lang.Integer) obj2;
        switch (i) {
            case 0:
                num.getClass();
                defpackage.m.oh6vYeIP(sfVar, t10Var, defpackage.a70.hyxIchWRW(439));
                break;
            case 1:
                int intValue = num.intValue();
                if (!t10Var.lpprD5VAS(intValue & 1, (intValue & 3) != 2)) {
                    t10Var.WLpAkxCo();
                    break;
                } else {
                    sfVar.F7NU4MC0GW(defpackage.qx.IHQe1A4L2xu, t10Var, 6);
                    break;
                }
            case defpackage.gx0.FLOAT_FIELD_NUMBER /* 2 */:
                num.getClass();
                defpackage.j70.IHQe1A4L2xu(sfVar, t10Var, defpackage.a70.hyxIchWRW(7));
                break;
            default:
                num.getClass();
                defpackage.fm.riuEU0zW4(sfVar, t10Var, defpackage.a70.hyxIchWRW(7));
                break;
        }
        return ok1Var;
    }

    public /* synthetic */ e(defpackage.sf sfVar, int i, int i2) {
        this.adDC3e2L = i2;
        this.xiZrDbcSW0 = sfVar;
    }
}
