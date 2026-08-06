package defpackage;

/* compiled from: r8-map-id-5e15bf382d9e1cc682b2b5d208f848646545054061ee84effb1e415a0540fc32 */
/* loaded from: classes.dex */
public final class x60 {
    public final int ZpBGe2uQfcn8;
    public final java.lang.Object giKS3J6vZuNy;

    public x60(int i, java.lang.Object obj) {
        this.ZpBGe2uQfcn8 = i;
        this.giKS3J6vZuNy = obj;
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof defpackage.x60)) {
            return false;
        }
        defpackage.x60 x60Var = (defpackage.x60) obj;
        return this.ZpBGe2uQfcn8 == x60Var.ZpBGe2uQfcn8 && defpackage.ma0.QiMR8OkAhezm(this.giKS3J6vZuNy, x60Var.giKS3J6vZuNy);
    }

    public final int hashCode() {
        int hashCode = java.lang.Integer.hashCode(this.ZpBGe2uQfcn8) * 31;
        java.lang.Object obj = this.giKS3J6vZuNy;
        return hashCode + (obj == null ? 0 : obj.hashCode());
    }

    public final java.lang.String toString() {
        return "IndexedValue(index=" + this.ZpBGe2uQfcn8 + ", value=" + this.giKS3J6vZuNy + ')';
    }
}
