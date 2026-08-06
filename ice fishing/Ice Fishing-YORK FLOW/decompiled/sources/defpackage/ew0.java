package defpackage;

/* compiled from: r8-map-id-5e15bf382d9e1cc682b2b5d208f848646545054061ee84effb1e415a0540fc32 */
/* loaded from: classes.dex */
public final class ew0 {
    public final defpackage.q2 ZpBGe2uQfcn8;
    public final int fWTAfUmVKrZq;
    public final int giKS3J6vZuNy;

    public ew0(defpackage.q2 q2Var, int i, int i2) {
        this.ZpBGe2uQfcn8 = q2Var;
        this.giKS3J6vZuNy = i;
        this.fWTAfUmVKrZq = i2;
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof defpackage.ew0) {
            defpackage.ew0 ew0Var = (defpackage.ew0) obj;
            if (this.ZpBGe2uQfcn8 == ew0Var.ZpBGe2uQfcn8 && this.giKS3J6vZuNy == ew0Var.giKS3J6vZuNy && this.fWTAfUmVKrZq == ew0Var.fWTAfUmVKrZq) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return java.lang.Integer.hashCode(this.fWTAfUmVKrZq) + defpackage.pVQOaWB9QMo4.giKS3J6vZuNy(this.giKS3J6vZuNy, this.ZpBGe2uQfcn8.hashCode() * 31, 31);
    }

    public final java.lang.String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder("ParagraphIntrinsicInfo(intrinsics=");
        sb.append(this.ZpBGe2uQfcn8);
        sb.append(", startIndex=");
        sb.append(this.giKS3J6vZuNy);
        sb.append(", endIndex=");
        return defpackage.pVQOaWB9QMo4.Ns0WNyEWdPsk(sb, this.fWTAfUmVKrZq, ')');
    }
}
