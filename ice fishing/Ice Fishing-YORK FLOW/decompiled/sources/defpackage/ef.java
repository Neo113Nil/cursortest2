package defpackage;

/* compiled from: r8-map-id-5e15bf382d9e1cc682b2b5d208f848646545054061ee84effb1e415a0540fc32 */
/* loaded from: classes.dex */
public final class ef {
    public final int ZpBGe2uQfcn8;
    public final int giKS3J6vZuNy;

    public ef(int i, int i2) {
        this.ZpBGe2uQfcn8 = i;
        this.giKS3J6vZuNy = i2;
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof defpackage.ef)) {
            return false;
        }
        defpackage.ef efVar = (defpackage.ef) obj;
        return this.ZpBGe2uQfcn8 == efVar.ZpBGe2uQfcn8 && this.giKS3J6vZuNy == efVar.giKS3J6vZuNy;
    }

    public final int hashCode() {
        return java.lang.Integer.hashCode(this.giKS3J6vZuNy) + (java.lang.Integer.hashCode(this.ZpBGe2uQfcn8) * 31);
    }

    public final java.lang.String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder("CollectionInfo(rowCount=");
        sb.append(this.ZpBGe2uQfcn8);
        sb.append(", columnCount=");
        return defpackage.pVQOaWB9QMo4.Ns0WNyEWdPsk(sb, this.giKS3J6vZuNy, ')');
    }
}
