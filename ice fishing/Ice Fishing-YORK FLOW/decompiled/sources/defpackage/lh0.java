package defpackage;

/* compiled from: r8-map-id-5e15bf382d9e1cc682b2b5d208f848646545054061ee84effb1e415a0540fc32 */
/* loaded from: classes.dex */
public final class lh0 {
    public static final defpackage.lh0 JhCgjQRTAOCT = new defpackage.lh0(defpackage.ih0.fWTAfUmVKrZq, 17, 0);
    public final float ZpBGe2uQfcn8;
    public final int fWTAfUmVKrZq;
    public final int giKS3J6vZuNy;

    public lh0(float f, int i, int i2) {
        this.ZpBGe2uQfcn8 = f;
        this.giKS3J6vZuNy = i;
        this.fWTAfUmVKrZq = i2;
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof defpackage.lh0)) {
            return false;
        }
        defpackage.lh0 lh0Var = (defpackage.lh0) obj;
        float f = lh0Var.ZpBGe2uQfcn8;
        float f2 = defpackage.ih0.giKS3J6vZuNy;
        return java.lang.Float.compare(this.ZpBGe2uQfcn8, f) == 0 && this.giKS3J6vZuNy == lh0Var.giKS3J6vZuNy && this.fWTAfUmVKrZq == lh0Var.fWTAfUmVKrZq;
    }

    public final int hashCode() {
        float f = defpackage.ih0.giKS3J6vZuNy;
        return java.lang.Integer.hashCode(this.fWTAfUmVKrZq) + defpackage.pVQOaWB9QMo4.giKS3J6vZuNy(this.giKS3J6vZuNy, java.lang.Float.hashCode(this.ZpBGe2uQfcn8) * 31, 31);
    }

    public final java.lang.String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder("LineHeightStyle(alignment=");
        sb.append((java.lang.Object) defpackage.ih0.giKS3J6vZuNy(this.ZpBGe2uQfcn8));
        sb.append(", trim=");
        java.lang.String str = "Invalid";
        int i = this.giKS3J6vZuNy;
        sb.append((java.lang.Object) (i == 1 ? "LineHeightStyle.Trim.FirstLineTop" : i == 16 ? "LineHeightStyle.Trim.LastLineBottom" : i == 17 ? "LineHeightStyle.Trim.Both" : i == 0 ? "LineHeightStyle.Trim.None" : "Invalid"));
        sb.append(",mode=");
        int i2 = this.fWTAfUmVKrZq;
        if (i2 == 0) {
            str = "LineHeightStyle.Mode.Fixed";
        } else if (i2 == 1) {
            str = "LineHeightStyle.Mode.Minimum";
        } else if (i2 == 2) {
            str = "LineHeightStyle.Mode.Tight";
        }
        sb.append((java.lang.Object) str);
        sb.append(')');
        return sb.toString();
    }
}
