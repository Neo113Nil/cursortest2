package defpackage;

/* compiled from: r8-map-id-5e15bf382d9e1cc682b2b5d208f848646545054061ee84effb1e415a0540fc32 */
/* loaded from: classes.dex */
public abstract class m6 {
    public static final defpackage.l6 ZpBGe2uQfcn8 = new defpackage.l6("");

    public static final java.util.List ZpBGe2uQfcn8(defpackage.l6 l6Var, int i, int i2, defpackage.awuGf4qH8HFd awugf4qh8hfd) {
        java.util.List list;
        if (i == i2 || (list = l6Var.WDYagTQQm9ns) == null) {
            return null;
        }
        int i3 = 0;
        if (i == 0 && i2 >= l6Var.oh71FJcDz6S2.length()) {
            if (awugf4qh8hfd == null) {
                return list;
            }
            java.util.ArrayList arrayList = new java.util.ArrayList(list.size());
            int size = list.size();
            while (i3 < size) {
                java.lang.Object obj = list.get(i3);
                if (((java.lang.Boolean) awugf4qh8hfd.P05cfTpS5W5L(((defpackage.k6) obj).ZpBGe2uQfcn8)).booleanValue()) {
                    arrayList.add(obj);
                }
                i3++;
            }
            return arrayList;
        }
        java.util.ArrayList arrayList2 = new java.util.ArrayList(list.size());
        int size2 = list.size();
        while (i3 < size2) {
            defpackage.k6 k6Var = (defpackage.k6) list.get(i3);
            if (awugf4qh8hfd != null ? ((java.lang.Boolean) awugf4qh8hfd.P05cfTpS5W5L(k6Var.ZpBGe2uQfcn8)).booleanValue() : true) {
                int i4 = k6Var.giKS3J6vZuNy;
                int i5 = k6Var.fWTAfUmVKrZq;
                if (giKS3J6vZuNy(i, i2, i4, i5)) {
                    arrayList2.add(new defpackage.k6(defpackage.j80.T1fB7bDYiVJQ(k6Var.giKS3J6vZuNy, i, i2) - i, defpackage.j80.T1fB7bDYiVJQ(i5, i, i2) - i, (defpackage.h6) k6Var.ZpBGe2uQfcn8, k6Var.JhCgjQRTAOCT));
                }
            }
            i3++;
        }
        return arrayList2;
    }

    public static final boolean giKS3J6vZuNy(int i, int i2, int i3, int i4) {
        return ((i < i4) & (i3 < i2)) | (((i == i2) | (i3 == i4)) & (i == i3));
    }
}
