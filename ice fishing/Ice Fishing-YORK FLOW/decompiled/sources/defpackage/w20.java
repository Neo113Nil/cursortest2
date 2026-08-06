package defpackage;

/* compiled from: r8-map-id-5e15bf382d9e1cc682b2b5d208f848646545054061ee84effb1e415a0540fc32 */
/* loaded from: classes.dex */
public final class w20 {
    public final java.util.List JhCgjQRTAOCT;
    public final java.util.ArrayList ZpBGe2uQfcn8;
    public final defpackage.v20 fWTAfUmVKrZq;
    public final defpackage.u20 giKS3J6vZuNy;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public /* synthetic */ w20() {
        this(r0, defpackage.u20.oh71FJcDz6S2, defpackage.v20.WDYagTQQm9ns, null);
        java.util.ArrayList arrayList = new java.util.ArrayList(9);
        for (int i = 0; i < 9; i++) {
            arrayList.add(defpackage.u20.WDYagTQQm9ns);
        }
    }

    public static defpackage.w20 ZpBGe2uQfcn8(defpackage.w20 w20Var, java.util.ArrayList arrayList, defpackage.v20 v20Var, java.util.List list, int i) {
        defpackage.u20 u20Var = (i & 2) != 0 ? w20Var.giKS3J6vZuNy : defpackage.u20.QiMR8OkAhezm;
        if ((i & 4) != 0) {
            v20Var = w20Var.fWTAfUmVKrZq;
        }
        if ((i & 8) != 0) {
            list = w20Var.JhCgjQRTAOCT;
        }
        w20Var.getClass();
        u20Var.getClass();
        v20Var.getClass();
        return new defpackage.w20(arrayList, u20Var, v20Var, list);
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof defpackage.w20)) {
            return false;
        }
        defpackage.w20 w20Var = (defpackage.w20) obj;
        return defpackage.ma0.QiMR8OkAhezm(this.ZpBGe2uQfcn8, w20Var.ZpBGe2uQfcn8) && this.giKS3J6vZuNy == w20Var.giKS3J6vZuNy && this.fWTAfUmVKrZq == w20Var.fWTAfUmVKrZq && defpackage.ma0.QiMR8OkAhezm(this.JhCgjQRTAOCT, w20Var.JhCgjQRTAOCT);
    }

    public final int hashCode() {
        int hashCode = (this.fWTAfUmVKrZq.hashCode() + ((this.giKS3J6vZuNy.hashCode() + (this.ZpBGe2uQfcn8.hashCode() * 31)) * 31)) * 31;
        java.util.List list = this.JhCgjQRTAOCT;
        return hashCode + (list == null ? 0 : list.hashCode());
    }

    public final java.lang.String toString() {
        return "State(board=" + this.ZpBGe2uQfcn8 + ", currentPlayer=" + this.giKS3J6vZuNy + ", status=" + this.fWTAfUmVKrZq + ", winningLine=" + this.JhCgjQRTAOCT + ")";
    }

    public w20(java.util.ArrayList arrayList, defpackage.u20 u20Var, defpackage.v20 v20Var, java.util.List list) {
        u20Var.getClass();
        v20Var.getClass();
        this.ZpBGe2uQfcn8 = arrayList;
        this.giKS3J6vZuNy = u20Var;
        this.fWTAfUmVKrZq = v20Var;
        this.JhCgjQRTAOCT = list;
    }
}
