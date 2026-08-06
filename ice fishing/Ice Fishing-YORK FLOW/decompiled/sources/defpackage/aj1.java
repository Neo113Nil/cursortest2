package defpackage;

/* compiled from: r8-map-id-5e15bf382d9e1cc682b2b5d208f848646545054061ee84effb1e415a0540fc32 */
/* loaded from: classes.dex */
public final class aj1 {
    public final java.util.List JhCgjQRTAOCT;
    public final java.lang.String ZpBGe2uQfcn8;
    public final java.util.List fWTAfUmVKrZq;
    public final boolean giKS3J6vZuNy;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v0, types: [java.util.Collection, java.util.List] */
    /* JADX WARN: Type inference failed for: r4v1, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r4v2, types: [java.util.ArrayList] */
    public aj1(java.lang.String str, boolean z, java.util.List list, java.util.List list2) {
        str.getClass();
        this.ZpBGe2uQfcn8 = str;
        this.giKS3J6vZuNy = z;
        this.fWTAfUmVKrZq = list;
        this.JhCgjQRTAOCT = list2;
        if (list2.isEmpty()) {
            int size = list.size();
            list2 = new java.util.ArrayList(size);
            for (int i = 0; i < size; i++) {
                list2.add("ASC");
            }
        }
        this.JhCgjQRTAOCT = list2;
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof defpackage.aj1)) {
            return false;
        }
        defpackage.aj1 aj1Var = (defpackage.aj1) obj;
        java.lang.String str = aj1Var.ZpBGe2uQfcn8;
        if (this.giKS3J6vZuNy != aj1Var.giKS3J6vZuNy || !this.fWTAfUmVKrZq.equals(aj1Var.fWTAfUmVKrZq) || !defpackage.ma0.QiMR8OkAhezm(this.JhCgjQRTAOCT, aj1Var.JhCgjQRTAOCT)) {
            return false;
        }
        java.lang.String str2 = this.ZpBGe2uQfcn8;
        return defpackage.ah1.OVwOqzUGHcCU(str2, "index_") ? defpackage.ah1.OVwOqzUGHcCU(str, "index_") : str2.equals(str);
    }

    public final int hashCode() {
        java.lang.String str = this.ZpBGe2uQfcn8;
        return this.JhCgjQRTAOCT.hashCode() + ((this.fWTAfUmVKrZq.hashCode() + ((((defpackage.ah1.OVwOqzUGHcCU(str, "index_") ? -1184239155 : str.hashCode()) * 31) + (this.giKS3J6vZuNy ? 1 : 0)) * 31)) * 31);
    }

    public final java.lang.String toString() {
        return defpackage.ug1.hH0RRJrNssvh(defpackage.ug1.xahdJg25P1Bv("\n            |Index {\n            |   name = '" + this.ZpBGe2uQfcn8 + "',\n            |   unique = '" + this.giKS3J6vZuNy + "',\n            |   columns = {" + defpackage.w60.frSwwKIlbUhK(this.fWTAfUmVKrZq) + "\n            |   orders = {" + defpackage.w60.Mearx7yMn90V(this.JhCgjQRTAOCT) + "\n            |}\n        "));
    }
}
