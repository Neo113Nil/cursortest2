package defpackage;

/* compiled from: r8-map-id-5e15bf382d9e1cc682b2b5d208f848646545054061ee84effb1e415a0540fc32 */
/* loaded from: classes.dex */
public final class bj1 {
    public final java.util.Map ZpBGe2uQfcn8;
    public final java.util.Set fWTAfUmVKrZq;
    public final java.util.Set giKS3J6vZuNy;

    public bj1(java.util.Map map, java.util.AbstractSet abstractSet, java.util.AbstractSet abstractSet2) {
        abstractSet.getClass();
        this.ZpBGe2uQfcn8 = map;
        this.giKS3J6vZuNy = abstractSet;
        this.fWTAfUmVKrZq = abstractSet2;
    }

    public final boolean equals(java.lang.Object obj) {
        java.util.Set set;
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof defpackage.bj1)) {
            return false;
        }
        defpackage.bj1 bj1Var = (defpackage.bj1) obj;
        if (!this.ZpBGe2uQfcn8.equals(bj1Var.ZpBGe2uQfcn8) || !defpackage.ma0.QiMR8OkAhezm(this.giKS3J6vZuNy, bj1Var.giKS3J6vZuNy)) {
            return false;
        }
        java.util.Set set2 = this.fWTAfUmVKrZq;
        if (set2 == null || (set = bj1Var.fWTAfUmVKrZq) == null) {
            return true;
        }
        return set2.equals(set);
    }

    public final int hashCode() {
        return this.giKS3J6vZuNy.hashCode() + ((this.ZpBGe2uQfcn8.hashCode() - 1178660800) * 31);
    }

    public final java.lang.String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder("\n            |TableInfo {\n            |    name = 'items',\n            |    columns = {");
        sb.append(defpackage.w60.maCixPsq4ml2(defpackage.hf.mnkwqFSfsWTC(this.ZpBGe2uQfcn8.values(), new defpackage.oz(10))));
        sb.append("\n            |    foreignKeys = {");
        sb.append(defpackage.w60.maCixPsq4ml2(this.giKS3J6vZuNy));
        sb.append("\n            |    indices = {");
        java.util.Set set = this.fWTAfUmVKrZq;
        sb.append(defpackage.w60.maCixPsq4ml2(set != null ? defpackage.hf.mnkwqFSfsWTC(set, new defpackage.oz(11)) : defpackage.av.WDYagTQQm9ns));
        sb.append("\n            |}\n        ");
        return defpackage.ug1.xahdJg25P1Bv(sb.toString());
    }
}
