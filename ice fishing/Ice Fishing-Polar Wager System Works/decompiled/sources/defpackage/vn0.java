package defpackage;

/* loaded from: classes.dex */
public final /* synthetic */ class vn0 implements defpackage.vz {
    public final /* synthetic */ int adDC3e2L;
    public final /* synthetic */ defpackage.ec1 xiZrDbcSW0;

    public /* synthetic */ vn0(defpackage.ec1 ec1Var, int i) {
        this.adDC3e2L = i;
        this.xiZrDbcSW0 = ec1Var;
    }

    @Override // defpackage.vz
    public final java.lang.Object IHQe1A4L2xu() {
        int i = this.adDC3e2L;
        defpackage.ec1 ec1Var = this.xiZrDbcSW0;
        switch (i) {
            case 0:
                java.util.List list = (java.util.List) ec1Var.getValue();
                java.util.ArrayList arrayList = new java.util.ArrayList();
                for (java.lang.Object obj : list) {
                    if (defpackage.x70.QoRHpC4k(((defpackage.nm0) obj).xiZrDbcSW0.adDC3e2L, "composable")) {
                        arrayList.add(obj);
                    }
                }
                return arrayList;
            default:
                return java.lang.Float.valueOf(((java.lang.Number) ec1Var.getValue()).floatValue());
        }
    }
}
