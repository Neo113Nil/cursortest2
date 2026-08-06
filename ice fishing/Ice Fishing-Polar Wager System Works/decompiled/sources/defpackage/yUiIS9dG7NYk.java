package defpackage;

/* loaded from: classes.dex */
public final /* synthetic */ class yUiIS9dG7NYk implements defpackage.g00 {
    public final /* synthetic */ int AARZUJiTa;
    public final /* synthetic */ int adDC3e2L;
    public final /* synthetic */ java.lang.Object xiZrDbcSW0;

    public /* synthetic */ yUiIS9dG7NYk(int i, java.util.Collection collection) {
        this.adDC3e2L = 2;
        this.AARZUJiTa = i;
        this.xiZrDbcSW0 = collection;
    }

    @Override // defpackage.g00
    public final java.lang.Object AARZUJiTa(java.lang.Object obj) {
        int i = this.adDC3e2L;
        defpackage.ok1 ok1Var = defpackage.ok1.IHQe1A4L2xu;
        java.lang.Object obj2 = this.xiZrDbcSW0;
        int i2 = this.AARZUJiTa;
        switch (i) {
            case 0:
                defpackage.av0.SH1y5HwkJhh((defpackage.av0) obj, (defpackage.bv0) obj2, 0, -i2);
                return ok1Var;
            case 1:
                defpackage.av0.SH1y5HwkJhh((defpackage.av0) obj, (defpackage.bv0) obj2, -i2, 0);
                return ok1Var;
            default:
                return java.lang.Boolean.valueOf(((java.util.List) obj).addAll(i2, (java.util.Collection) obj2));
        }
    }

    public /* synthetic */ yUiIS9dG7NYk(int i, int i2, defpackage.bv0 bv0Var) {
        this.adDC3e2L = i2;
        this.xiZrDbcSW0 = bv0Var;
        this.AARZUJiTa = i;
    }
}
