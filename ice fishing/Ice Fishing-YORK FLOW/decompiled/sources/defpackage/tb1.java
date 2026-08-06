package defpackage;

/* compiled from: r8-map-id-5e15bf382d9e1cc682b2b5d208f848646545054061ee84effb1e415a0540fc32 */
/* loaded from: classes.dex */
public final class tb1 implements java.util.Comparator {
    public final /* synthetic */ int ZpBGe2uQfcn8 = 0;
    public final /* synthetic */ java.util.Comparator giKS3J6vZuNy;

    public tb1(defpackage.tb1 tb1Var) {
        this.giKS3J6vZuNy = tb1Var;
    }

    @Override // java.util.Comparator
    public final int compare(java.lang.Object obj, java.lang.Object obj2) {
        int i = this.ZpBGe2uQfcn8;
        java.util.Comparator comparator = this.giKS3J6vZuNy;
        switch (i) {
            case 0:
                int compare = comparator.compare(obj, obj2);
                if (compare != 0) {
                    return compare;
                }
                return defpackage.jd0.EPEWHACkMcF1.compare(((defpackage.jb1) obj).fWTAfUmVKrZq, ((defpackage.jb1) obj2).fWTAfUmVKrZq);
            default:
                int compare2 = ((defpackage.tb1) comparator).compare(obj, obj2);
                return compare2 != 0 ? compare2 : java.lang.Integer.valueOf(((defpackage.jb1) obj).oh71FJcDz6S2).compareTo(java.lang.Integer.valueOf(((defpackage.jb1) obj2).oh71FJcDz6S2));
        }
    }

    public tb1(java.util.Comparator comparator) {
        this.giKS3J6vZuNy = comparator;
    }
}
