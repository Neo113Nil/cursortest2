package defpackage;

/* compiled from: r8-map-id-5e15bf382d9e1cc682b2b5d208f848646545054061ee84effb1e415a0540fc32 */
/* loaded from: classes.dex */
public final class xahdJg25P1Bv {
    public final java.lang.String ZpBGe2uQfcn8;
    public final defpackage.k20 giKS3J6vZuNy;

    public xahdJg25P1Bv(java.lang.String str, defpackage.k20 k20Var) {
        this.ZpBGe2uQfcn8 = str;
        this.giKS3J6vZuNy = k20Var;
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof defpackage.xahdJg25P1Bv)) {
            return false;
        }
        defpackage.xahdJg25P1Bv xahdjg25p1bv = (defpackage.xahdJg25P1Bv) obj;
        return defpackage.ma0.QiMR8OkAhezm(this.ZpBGe2uQfcn8, xahdjg25p1bv.ZpBGe2uQfcn8) && defpackage.ma0.QiMR8OkAhezm(this.giKS3J6vZuNy, xahdjg25p1bv.giKS3J6vZuNy);
    }

    public final int hashCode() {
        java.lang.String str = this.ZpBGe2uQfcn8;
        int hashCode = (str != null ? str.hashCode() : 0) * 31;
        defpackage.k20 k20Var = this.giKS3J6vZuNy;
        return hashCode + (k20Var != null ? k20Var.hashCode() : 0);
    }

    public final java.lang.String toString() {
        return "AccessibilityAction(label=" + this.ZpBGe2uQfcn8 + ", action=" + this.giKS3J6vZuNy + ')';
    }
}
