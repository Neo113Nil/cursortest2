package defpackage;

/* compiled from: r8-map-id-5e15bf382d9e1cc682b2b5d208f848646545054061ee84effb1e415a0540fc32 */
/* loaded from: classes.dex */
public final class zi1 {
    public final java.util.ArrayList JhCgjQRTAOCT;
    public final java.util.ArrayList WDYagTQQm9ns;
    public final java.lang.String ZpBGe2uQfcn8;
    public final java.lang.String fWTAfUmVKrZq;
    public final java.lang.String giKS3J6vZuNy;

    public zi1(java.lang.String str, java.lang.String str2, java.lang.String str3, java.util.ArrayList arrayList, java.util.ArrayList arrayList2) {
        str.getClass();
        str2.getClass();
        str3.getClass();
        this.ZpBGe2uQfcn8 = str;
        this.giKS3J6vZuNy = str2;
        this.fWTAfUmVKrZq = str3;
        this.JhCgjQRTAOCT = arrayList;
        this.WDYagTQQm9ns = arrayList2;
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof defpackage.zi1)) {
            return false;
        }
        defpackage.zi1 zi1Var = (defpackage.zi1) obj;
        if (defpackage.ma0.QiMR8OkAhezm(this.ZpBGe2uQfcn8, zi1Var.ZpBGe2uQfcn8) && defpackage.ma0.QiMR8OkAhezm(this.giKS3J6vZuNy, zi1Var.giKS3J6vZuNy) && defpackage.ma0.QiMR8OkAhezm(this.fWTAfUmVKrZq, zi1Var.fWTAfUmVKrZq) && this.JhCgjQRTAOCT.equals(zi1Var.JhCgjQRTAOCT)) {
            return this.WDYagTQQm9ns.equals(zi1Var.WDYagTQQm9ns);
        }
        return false;
    }

    public final int hashCode() {
        return this.WDYagTQQm9ns.hashCode() + ((this.JhCgjQRTAOCT.hashCode() + ((this.fWTAfUmVKrZq.hashCode() + ((this.giKS3J6vZuNy.hashCode() + (this.ZpBGe2uQfcn8.hashCode() * 31)) * 31)) * 31)) * 31);
    }

    public final java.lang.String toString() {
        return defpackage.ug1.hH0RRJrNssvh(defpackage.ug1.xahdJg25P1Bv("\n            |ForeignKey {\n            |   referenceTable = '" + this.ZpBGe2uQfcn8 + "',\n            |   onDelete = '" + this.giKS3J6vZuNy + "',\n            |   onUpdate = '" + this.fWTAfUmVKrZq + "',\n            |   columnNames = {" + defpackage.w60.frSwwKIlbUhK(defpackage.hf.eSwlWMUpitz8(this.JhCgjQRTAOCT)) + "\n            |   referenceColumnNames = {" + defpackage.w60.Mearx7yMn90V(defpackage.hf.eSwlWMUpitz8(this.WDYagTQQm9ns)) + "\n            |}\n        "));
    }
}
