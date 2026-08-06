package defpackage;

/* compiled from: r8-map-id-5e15bf382d9e1cc682b2b5d208f848646545054061ee84effb1e415a0540fc32 */
/* loaded from: classes.dex */
public final class oa1 {
    public final defpackage.na1 ZpBGe2uQfcn8;
    public final boolean fWTAfUmVKrZq;
    public final defpackage.na1 giKS3J6vZuNy;

    public oa1(defpackage.na1 na1Var, defpackage.na1 na1Var2, boolean z) {
        this.ZpBGe2uQfcn8 = na1Var;
        this.giKS3J6vZuNy = na1Var2;
        this.fWTAfUmVKrZq = z;
    }

    public static defpackage.oa1 ZpBGe2uQfcn8(defpackage.oa1 oa1Var, defpackage.na1 na1Var, defpackage.na1 na1Var2, boolean z, int i) {
        if ((i & 1) != 0) {
            na1Var = oa1Var.ZpBGe2uQfcn8;
        }
        if ((i & 2) != 0) {
            na1Var2 = oa1Var.giKS3J6vZuNy;
        }
        oa1Var.getClass();
        return new defpackage.oa1(na1Var, na1Var2, z);
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof defpackage.oa1)) {
            return false;
        }
        defpackage.oa1 oa1Var = (defpackage.oa1) obj;
        return defpackage.ma0.QiMR8OkAhezm(this.ZpBGe2uQfcn8, oa1Var.ZpBGe2uQfcn8) && defpackage.ma0.QiMR8OkAhezm(this.giKS3J6vZuNy, oa1Var.giKS3J6vZuNy) && this.fWTAfUmVKrZq == oa1Var.fWTAfUmVKrZq;
    }

    public final int hashCode() {
        return java.lang.Boolean.hashCode(this.fWTAfUmVKrZq) + ((this.giKS3J6vZuNy.hashCode() + (this.ZpBGe2uQfcn8.hashCode() * 31)) * 31);
    }

    public final java.lang.String toString() {
        return "Selection(start=" + this.ZpBGe2uQfcn8 + ", end=" + this.giKS3J6vZuNy + ", handlesCrossed=" + this.fWTAfUmVKrZq + ')';
    }
}
