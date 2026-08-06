package defpackage;

/* compiled from: r8-map-id-5e15bf382d9e1cc682b2b5d208f848646545054061ee84effb1e415a0540fc32 */
/* loaded from: classes.dex */
public final class jo1 {
    public final java.lang.String ZpBGe2uQfcn8;
    public final java.lang.String giKS3J6vZuNy;

    public jo1(java.lang.String str, java.lang.String str2) {
        this.ZpBGe2uQfcn8 = str;
        this.giKS3J6vZuNy = str2;
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof defpackage.jo1)) {
            return false;
        }
        defpackage.jo1 jo1Var = (defpackage.jo1) obj;
        return this.ZpBGe2uQfcn8.equals(jo1Var.ZpBGe2uQfcn8) && this.giKS3J6vZuNy.equals(jo1Var.giKS3J6vZuNy);
    }

    public final int hashCode() {
        return this.giKS3J6vZuNy.hashCode() + (this.ZpBGe2uQfcn8.hashCode() * 31);
    }

    public final java.lang.String toString() {
        return "Tip(emoji=" + this.ZpBGe2uQfcn8 + ", text=" + this.giKS3J6vZuNy + ")";
    }
}
