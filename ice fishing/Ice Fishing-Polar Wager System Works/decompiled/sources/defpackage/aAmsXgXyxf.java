package defpackage;

/* loaded from: classes.dex */
public final /* synthetic */ class aAmsXgXyxf implements defpackage.g00 {
    public final /* synthetic */ int adDC3e2L;
    public final /* synthetic */ defpackage.g00 xiZrDbcSW0;

    public /* synthetic */ aAmsXgXyxf(defpackage.g00 g00Var, int i) {
        this.adDC3e2L = i;
        this.xiZrDbcSW0 = g00Var;
    }

    @Override // defpackage.g00
    public final java.lang.Object AARZUJiTa(java.lang.Object obj) {
        int i = this.adDC3e2L;
        defpackage.g00 g00Var = this.xiZrDbcSW0;
        switch (i) {
            case 0:
                java.lang.String str = (java.lang.String) obj;
                str.getClass();
                g00Var.AARZUJiTa(new defpackage.eSIfjzq9c3LO(str));
                return defpackage.ok1.IHQe1A4L2xu;
            case 1:
                java.lang.String str2 = (java.lang.String) obj;
                str2.getClass();
                g00Var.AARZUJiTa(new defpackage.qwkVicYTIcrn(str2));
                return defpackage.ok1.IHQe1A4L2xu;
            case defpackage.gx0.FLOAT_FIELD_NUMBER /* 2 */:
                g00Var.AARZUJiTa(new defpackage.gp(((java.lang.Integer) obj).intValue()));
                return defpackage.ok1.IHQe1A4L2xu;
            case defpackage.gx0.INTEGER_FIELD_NUMBER /* 3 */:
                defpackage.oa1 oa1Var = (defpackage.oa1) g00Var.AARZUJiTa((defpackage.ua1) obj);
                synchronized (defpackage.wa1.r1MBDhnF) {
                    defpackage.wa1.F7NU4MC0GW = defpackage.wa1.F7NU4MC0GW.xiZrDbcSW0(oa1Var.AARZUJiTa());
                }
                return oa1Var;
            default:
                java.lang.Long l = (java.lang.Long) obj;
                l.getClass();
                return g00Var.AARZUJiTa(l);
        }
    }
}
