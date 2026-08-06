package defpackage;

/* compiled from: r8-map-id-5e15bf382d9e1cc682b2b5d208f848646545054061ee84effb1e415a0540fc32 */
/* loaded from: classes.dex */
public final class l60 {
    public final android.content.res.Resources.Theme ZpBGe2uQfcn8;
    public final int giKS3J6vZuNy;

    public l60(android.content.res.Resources.Theme theme, int i) {
        this.ZpBGe2uQfcn8 = theme;
        this.giKS3J6vZuNy = i;
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof defpackage.l60)) {
            return false;
        }
        defpackage.l60 l60Var = (defpackage.l60) obj;
        return defpackage.ma0.QiMR8OkAhezm(this.ZpBGe2uQfcn8, l60Var.ZpBGe2uQfcn8) && this.giKS3J6vZuNy == l60Var.giKS3J6vZuNy;
    }

    public final int hashCode() {
        return java.lang.Integer.hashCode(this.giKS3J6vZuNy) + (this.ZpBGe2uQfcn8.hashCode() * 31);
    }

    public final java.lang.String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder("Key(theme=");
        sb.append(this.ZpBGe2uQfcn8);
        sb.append(", id=");
        return defpackage.pVQOaWB9QMo4.Ns0WNyEWdPsk(sb, this.giKS3J6vZuNy, ')');
    }
}
