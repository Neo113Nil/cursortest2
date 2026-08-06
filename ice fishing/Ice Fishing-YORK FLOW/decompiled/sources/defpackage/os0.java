package defpackage;

/* compiled from: r8-map-id-5e15bf382d9e1cc682b2b5d208f848646545054061ee84effb1e415a0540fc32 */
/* loaded from: classes.dex */
public final class os0 {
    public final int ZpBGe2uQfcn8;
    public final java.lang.Integer giKS3J6vZuNy;

    public os0(int i, java.lang.Integer num) {
        this.ZpBGe2uQfcn8 = i;
        this.giKS3J6vZuNy = num;
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof defpackage.os0)) {
            return false;
        }
        defpackage.os0 os0Var = (defpackage.os0) obj;
        return this.ZpBGe2uQfcn8 == os0Var.ZpBGe2uQfcn8 && defpackage.ma0.QiMR8OkAhezm(this.giKS3J6vZuNy, os0Var.giKS3J6vZuNy);
    }

    public final int hashCode() {
        int hashCode = java.lang.Integer.hashCode(this.ZpBGe2uQfcn8) * 31;
        java.lang.Integer num = this.giKS3J6vZuNy;
        return hashCode + (num == null ? 0 : num.hashCode());
    }

    public final java.lang.String toString() {
        return "ObjectLocation(group=" + this.ZpBGe2uQfcn8 + ", dataOffset=" + this.giKS3J6vZuNy + ')';
    }
}
