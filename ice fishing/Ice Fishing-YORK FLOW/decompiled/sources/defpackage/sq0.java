package defpackage;

/* compiled from: r8-map-id-5e15bf382d9e1cc682b2b5d208f848646545054061ee84effb1e415a0540fc32 */
/* loaded from: classes.dex */
public final class sq0 {
    public final java.util.List ZpBGe2uQfcn8;
    public final int giKS3J6vZuNy;

    public sq0(int i, java.util.List list) {
        this.ZpBGe2uQfcn8 = list;
        this.giKS3J6vZuNy = i;
        if (list.isEmpty() && i == -1) {
            return;
        }
        if (!list.isEmpty()) {
            int size = list.size();
            if (i >= 0 && i < size) {
                return;
            }
        }
        defpackage.h7.gUjdnLbkVAaA(defpackage.pVQOaWB9QMo4.h3m55N1URyyK(i, "Invalid 'NavigationEventHistory' state:  'currentIndex' must be within the bounds of 'mergedHistory' (or -1 if empty). Received: currentIndex = '", "', bounds = '"), new defpackage.p90(0, list.size() - 1, 1), "'.");
        throw null;
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || defpackage.sq0.class != obj.getClass()) {
            return false;
        }
        defpackage.sq0 sq0Var = (defpackage.sq0) obj;
        return this.giKS3J6vZuNy == sq0Var.giKS3J6vZuNy && defpackage.ma0.QiMR8OkAhezm(this.ZpBGe2uQfcn8, sq0Var.ZpBGe2uQfcn8);
    }

    public final int hashCode() {
        return this.ZpBGe2uQfcn8.hashCode() + (this.giKS3J6vZuNy * 31);
    }

    public final java.lang.String toString() {
        return "NavigationEventHistory(currentIndex=" + this.giKS3J6vZuNy + ", mergedHistory=" + this.ZpBGe2uQfcn8 + ')';
    }

    public sq0() {
        this(-1, defpackage.av.WDYagTQQm9ns);
    }
}
