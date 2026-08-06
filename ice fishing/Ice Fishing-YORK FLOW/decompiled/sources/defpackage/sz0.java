package defpackage;

/* compiled from: r8-map-id-5e15bf382d9e1cc682b2b5d208f848646545054061ee84effb1e415a0540fc32 */
/* loaded from: classes.dex */
public final class sz0 {
    public final defpackage.nz0 ZpBGe2uQfcn8;
    public final defpackage.fz0 giKS3J6vZuNy;

    public sz0(defpackage.nz0 nz0Var, defpackage.fz0 fz0Var) {
        this.ZpBGe2uQfcn8 = nz0Var;
        this.giKS3J6vZuNy = fz0Var;
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof defpackage.sz0)) {
            return false;
        }
        defpackage.sz0 sz0Var = (defpackage.sz0) obj;
        return defpackage.ma0.QiMR8OkAhezm(this.giKS3J6vZuNy, sz0Var.giKS3J6vZuNy) && defpackage.ma0.QiMR8OkAhezm(this.ZpBGe2uQfcn8, sz0Var.ZpBGe2uQfcn8);
    }

    public final int hashCode() {
        defpackage.nz0 nz0Var = this.ZpBGe2uQfcn8;
        int hashCode = (nz0Var != null ? nz0Var.hashCode() : 0) * 31;
        defpackage.fz0 fz0Var = this.giKS3J6vZuNy;
        return hashCode + (fz0Var != null ? fz0Var.hashCode() : 0);
    }

    public final java.lang.String toString() {
        return "PlatformTextStyle(spanStyle=" + this.ZpBGe2uQfcn8 + ", paragraphSyle=" + this.giKS3J6vZuNy + ')';
    }
}
