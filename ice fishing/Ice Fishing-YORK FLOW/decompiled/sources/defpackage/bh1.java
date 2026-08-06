package defpackage;

/* compiled from: r8-map-id-5e15bf382d9e1cc682b2b5d208f848646545054061ee84effb1e415a0540fc32 */
/* loaded from: classes.dex */
public final class bh1 extends defpackage.dt {
    public final int JhCgjQRTAOCT;
    public final float ZpBGe2uQfcn8;
    public final int fWTAfUmVKrZq;
    public final float giKS3J6vZuNy;

    public bh1(float f, float f2, int i, int i2, int i3) {
        f2 = (i3 & 2) != 0 ? 4.0f : f2;
        i = (i3 & 4) != 0 ? 0 : i;
        i2 = (i3 & 8) != 0 ? 0 : i2;
        this.ZpBGe2uQfcn8 = f;
        this.giKS3J6vZuNy = f2;
        this.fWTAfUmVKrZq = i;
        this.JhCgjQRTAOCT = i2;
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof defpackage.bh1)) {
            return false;
        }
        defpackage.bh1 bh1Var = (defpackage.bh1) obj;
        return this.ZpBGe2uQfcn8 == bh1Var.ZpBGe2uQfcn8 && this.giKS3J6vZuNy == bh1Var.giKS3J6vZuNy && this.fWTAfUmVKrZq == bh1Var.fWTAfUmVKrZq && this.JhCgjQRTAOCT == bh1Var.JhCgjQRTAOCT;
    }

    public final int hashCode() {
        return defpackage.pVQOaWB9QMo4.giKS3J6vZuNy(this.JhCgjQRTAOCT, defpackage.pVQOaWB9QMo4.giKS3J6vZuNy(this.fWTAfUmVKrZq, defpackage.pVQOaWB9QMo4.ZpBGe2uQfcn8(this.giKS3J6vZuNy, java.lang.Float.hashCode(this.ZpBGe2uQfcn8) * 31, 31), 31), 31);
    }

    public final java.lang.String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder("Stroke(width=");
        sb.append(this.ZpBGe2uQfcn8);
        sb.append(", miter=");
        sb.append(this.giKS3J6vZuNy);
        sb.append(", cap=");
        java.lang.String str = "Unknown";
        int i = this.fWTAfUmVKrZq;
        sb.append((java.lang.Object) (i == 0 ? "Butt" : i == 1 ? "Round" : i == 2 ? "Square" : "Unknown"));
        sb.append(", join=");
        int i2 = this.JhCgjQRTAOCT;
        if (i2 == 0) {
            str = "Miter";
        } else if (i2 == 1) {
            str = "Round";
        } else if (i2 == 2) {
            str = "Bevel";
        }
        sb.append((java.lang.Object) str);
        sb.append(", pathEffect=null)");
        return sb.toString();
    }
}
