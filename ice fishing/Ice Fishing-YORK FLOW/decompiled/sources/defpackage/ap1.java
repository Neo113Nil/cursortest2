package defpackage;

/* compiled from: r8-map-id-5e15bf382d9e1cc682b2b5d208f848646545054061ee84effb1e415a0540fc32 */
/* loaded from: classes.dex */
public final class ap1 {
    public final defpackage.l6 ZpBGe2uQfcn8;
    public final defpackage.zs0 giKS3J6vZuNy;

    public ap1(defpackage.l6 l6Var, defpackage.zs0 zs0Var) {
        this.ZpBGe2uQfcn8 = l6Var;
        this.giKS3J6vZuNy = zs0Var;
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof defpackage.ap1)) {
            return false;
        }
        defpackage.ap1 ap1Var = (defpackage.ap1) obj;
        return defpackage.ma0.QiMR8OkAhezm(this.ZpBGe2uQfcn8, ap1Var.ZpBGe2uQfcn8) && this.giKS3J6vZuNy.equals(ap1Var.giKS3J6vZuNy);
    }

    public final int hashCode() {
        return this.giKS3J6vZuNy.hashCode() + (this.ZpBGe2uQfcn8.hashCode() * 31);
    }

    public final java.lang.String toString() {
        return "TransformedText(text=" + ((java.lang.Object) this.ZpBGe2uQfcn8) + ", offsetMapping=" + this.giKS3J6vZuNy + ')';
    }
}
