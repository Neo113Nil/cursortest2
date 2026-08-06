package defpackage;

/* compiled from: r8-map-id-5e15bf382d9e1cc682b2b5d208f848646545054061ee84effb1e415a0540fc32 */
/* loaded from: classes.dex */
public final class k60 {
    public final defpackage.j60 ZpBGe2uQfcn8;
    public final int giKS3J6vZuNy;

    public k60(defpackage.j60 j60Var, int i) {
        this.ZpBGe2uQfcn8 = j60Var;
        this.giKS3J6vZuNy = i;
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof defpackage.k60)) {
            return false;
        }
        defpackage.k60 k60Var = (defpackage.k60) obj;
        return this.ZpBGe2uQfcn8.equals(k60Var.ZpBGe2uQfcn8) && this.giKS3J6vZuNy == k60Var.giKS3J6vZuNy;
    }

    public final int hashCode() {
        return java.lang.Integer.hashCode(this.giKS3J6vZuNy) + (this.ZpBGe2uQfcn8.hashCode() * 31);
    }

    public final java.lang.String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder("ImageVectorEntry(imageVector=");
        sb.append(this.ZpBGe2uQfcn8);
        sb.append(", configFlags=");
        return defpackage.pVQOaWB9QMo4.Ns0WNyEWdPsk(sb, this.giKS3J6vZuNy, ')');
    }
}
