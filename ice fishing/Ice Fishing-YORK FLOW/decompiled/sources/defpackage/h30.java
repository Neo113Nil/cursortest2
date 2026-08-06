package defpackage;

/* compiled from: r8-map-id-5e15bf382d9e1cc682b2b5d208f848646545054061ee84effb1e415a0540fc32 */
/* loaded from: classes.dex */
public final class h30 implements defpackage.n10 {
    public final /* synthetic */ defpackage.i30 WDYagTQQm9ns;

    public h30(defpackage.i30 i30Var) {
        this.WDYagTQQm9ns = i30Var;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.n10
    public final java.lang.Object ZpBGe2uQfcn8() {
        java.util.ArrayList arrayList = this.WDYagTQQm9ns.ZpBGe2uQfcn8;
        defpackage.yn0 yn0Var = new defpackage.yn0(arrayList.size());
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            defpackage.xb0 xb0Var = (defpackage.xb0) arrayList.get(i);
            java.lang.Object obj = xb0Var.giKS3J6vZuNy;
            int i2 = xb0Var.ZpBGe2uQfcn8;
            java.lang.Object kb0Var = obj != null ? new defpackage.kb0(java.lang.Integer.valueOf(i2), xb0Var.giKS3J6vZuNy) : java.lang.Integer.valueOf(i2);
            int oh71FJcDz6S2 = yn0Var.oh71FJcDz6S2(kb0Var);
            boolean z = oh71FJcDz6S2 < 0;
            java.lang.Object obj2 = z ? null : yn0Var.fWTAfUmVKrZq[oh71FJcDz6S2];
            if (obj2 != null) {
                if (obj2 instanceof defpackage.sn0) {
                    defpackage.sn0 sn0Var = (defpackage.sn0) obj2;
                    sn0Var.ZpBGe2uQfcn8(xb0Var);
                    xb0Var = sn0Var;
                } else {
                    java.lang.Object[] objArr = defpackage.ns0.ZpBGe2uQfcn8;
                    defpackage.sn0 sn0Var2 = new defpackage.sn0(2);
                    sn0Var2.ZpBGe2uQfcn8(obj2);
                    sn0Var2.ZpBGe2uQfcn8(xb0Var);
                    xb0Var = sn0Var2;
                }
            }
            if (z) {
                int i3 = ~oh71FJcDz6S2;
                yn0Var.giKS3J6vZuNy[i3] = kb0Var;
                yn0Var.fWTAfUmVKrZq[i3] = xb0Var;
            } else {
                yn0Var.fWTAfUmVKrZq[oh71FJcDz6S2] = xb0Var;
            }
        }
        return new defpackage.cn0(yn0Var);
    }
}
