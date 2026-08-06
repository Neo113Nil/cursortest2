package defpackage;

/* compiled from: r8-map-id-5e15bf382d9e1cc682b2b5d208f848646545054061ee84effb1e415a0540fc32 */
/* loaded from: classes.dex */
public final /* synthetic */ class qg implements java.util.Comparator {
    public final /* synthetic */ int ZpBGe2uQfcn8;
    public final /* synthetic */ java.lang.Object giKS3J6vZuNy;

    public /* synthetic */ qg(int i, java.lang.Object obj) {
        this.ZpBGe2uQfcn8 = i;
        this.giKS3J6vZuNy = obj;
    }

    @Override // java.util.Comparator
    public final int compare(java.lang.Object obj, java.lang.Object obj2) {
        int i = this.ZpBGe2uQfcn8;
        java.lang.Object obj3 = this.giKS3J6vZuNy;
        switch (i) {
            case 0:
                for (defpackage.y10 y10Var : (defpackage.y10[]) obj3) {
                    int XntWc4eZSQ8j = defpackage.vx1.XntWc4eZSQ8j((java.lang.Comparable) y10Var.P05cfTpS5W5L(obj), (java.lang.Comparable) y10Var.P05cfTpS5W5L(obj2));
                    if (XntWc4eZSQ8j != 0) {
                        return XntWc4eZSQ8j;
                    }
                }
                return 0;
            default:
                return ((java.lang.Number) ((defpackage.c20) obj3).QiMR8OkAhezm(obj, obj2)).intValue();
        }
    }
}
