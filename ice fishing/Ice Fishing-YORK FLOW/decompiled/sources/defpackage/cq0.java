package defpackage;

/* compiled from: r8-map-id-5e15bf382d9e1cc682b2b5d208f848646545054061ee84effb1e415a0540fc32 */
/* loaded from: classes.dex */
public final /* synthetic */ class cq0 implements defpackage.n10 {
    public final /* synthetic */ int WDYagTQQm9ns;
    public final /* synthetic */ defpackage.dg1 oh71FJcDz6S2;

    public /* synthetic */ cq0(defpackage.dg1 dg1Var, int i) {
        this.WDYagTQQm9ns = i;
        this.oh71FJcDz6S2 = dg1Var;
    }

    @Override // defpackage.n10
    public final java.lang.Object ZpBGe2uQfcn8() {
        int i = this.WDYagTQQm9ns;
        defpackage.dg1 dg1Var = this.oh71FJcDz6S2;
        switch (i) {
            case 0:
                java.util.List list = (java.util.List) dg1Var.getValue();
                java.util.ArrayList arrayList = new java.util.ArrayList();
                for (java.lang.Object obj : list) {
                    if (defpackage.ma0.QiMR8OkAhezm(((defpackage.xo0) obj).oh71FJcDz6S2.WDYagTQQm9ns, "composable")) {
                        arrayList.add(obj);
                    }
                }
                return arrayList;
            case 1:
                return new defpackage.ws0(((defpackage.ws0) dg1Var.getValue()).ZpBGe2uQfcn8);
            case 2:
                defpackage.d6 d6Var = defpackage.cb1.ZpBGe2uQfcn8;
                return new defpackage.ws0(((defpackage.ws0) dg1Var.getValue()).ZpBGe2uQfcn8);
            case 3:
                return java.lang.Boolean.valueOf(((java.lang.Number) dg1Var.getValue()).floatValue() > 0.0f);
            default:
                return java.lang.Boolean.valueOf(((java.lang.Number) dg1Var.getValue()).floatValue() > 0.0f);
        }
    }
}
