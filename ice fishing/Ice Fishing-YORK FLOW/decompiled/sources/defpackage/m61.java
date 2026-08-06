package defpackage;

/* compiled from: r8-map-id-5e15bf382d9e1cc682b2b5d208f848646545054061ee84effb1e415a0540fc32 */
/* loaded from: classes.dex */
public final class m61 extends defpackage.gd0 {
    public static final defpackage.m61 fWTAfUmVKrZq = new defpackage.m61("Undefined intrinsics block and it is required", 0);
    public final /* synthetic */ int giKS3J6vZuNy;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ m61(java.lang.String str, int i) {
        super(str);
        this.giKS3J6vZuNy = i;
    }

    @Override // defpackage.vk0
    public final defpackage.wk0 oh71FJcDz6S2(defpackage.xk0 xk0Var, java.util.List list, long j) {
        switch (this.giKS3J6vZuNy) {
            case 0:
                int size = list.size();
                defpackage.bv bvVar = defpackage.bv.WDYagTQQm9ns;
                if (size == 0) {
                    return xk0Var.hwoZxnIesQBZ(defpackage.mk.GE9mJIPrb8gP(j), defpackage.mk.e6mdH7fiFuta(j), bvVar, defpackage.qv0.h3m55N1URyyK);
                }
                if (size == 1) {
                    defpackage.ry0 WDYagTQQm9ns = ((defpackage.qk0) list.get(0)).WDYagTQQm9ns(j);
                    return xk0Var.hwoZxnIesQBZ(defpackage.nk.QiMR8OkAhezm(WDYagTQQm9ns.WDYagTQQm9ns, j), defpackage.nk.oh71FJcDz6S2(WDYagTQQm9ns.oh71FJcDz6S2, j), bvVar, new defpackage.g(WDYagTQQm9ns, 5));
                }
                java.util.ArrayList arrayList = new java.util.ArrayList(list.size());
                int size2 = list.size();
                int i = 0;
                int i2 = 0;
                for (int i3 = 0; i3 < size2; i3++) {
                    defpackage.ry0 WDYagTQQm9ns2 = ((defpackage.qk0) list.get(i3)).WDYagTQQm9ns(j);
                    i = java.lang.Math.max(WDYagTQQm9ns2.WDYagTQQm9ns, i);
                    i2 = java.lang.Math.max(WDYagTQQm9ns2.oh71FJcDz6S2, i2);
                    arrayList.add(WDYagTQQm9ns2);
                }
                return xk0Var.hwoZxnIesQBZ(defpackage.nk.QiMR8OkAhezm(i, j), defpackage.nk.oh71FJcDz6S2(i2, j), bvVar, new defpackage.c1(3, arrayList));
            default:
                throw new java.lang.IllegalStateException("Undefined measure and it is required");
        }
    }
}
