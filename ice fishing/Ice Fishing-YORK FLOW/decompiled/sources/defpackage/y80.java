package defpackage;

/* compiled from: r8-map-id-5e15bf382d9e1cc682b2b5d208f848646545054061ee84effb1e415a0540fc32 */
/* loaded from: classes.dex */
public final class y80 {
    public final int JhCgjQRTAOCT;
    public final int ZpBGe2uQfcn8;
    public final int fWTAfUmVKrZq;
    public final int giKS3J6vZuNy;

    public y80(int i, int i2, int i3, int i4) {
        this.ZpBGe2uQfcn8 = i;
        this.giKS3J6vZuNy = i2;
        this.fWTAfUmVKrZq = i3;
        this.JhCgjQRTAOCT = i4;
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof defpackage.y80)) {
            return false;
        }
        defpackage.y80 y80Var = (defpackage.y80) obj;
        return this.ZpBGe2uQfcn8 == y80Var.ZpBGe2uQfcn8 && this.giKS3J6vZuNy == y80Var.giKS3J6vZuNy && this.fWTAfUmVKrZq == y80Var.fWTAfUmVKrZq && this.JhCgjQRTAOCT == y80Var.JhCgjQRTAOCT;
    }

    public final int hashCode() {
        return (((((this.ZpBGe2uQfcn8 * 31) + this.giKS3J6vZuNy) * 31) + this.fWTAfUmVKrZq) * 31) + this.JhCgjQRTAOCT;
    }

    public final java.lang.String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder("InsetsValues(left=");
        sb.append(this.ZpBGe2uQfcn8);
        sb.append(", top=");
        sb.append(this.giKS3J6vZuNy);
        sb.append(", right=");
        sb.append(this.fWTAfUmVKrZq);
        sb.append(", bottom=");
        return defpackage.pVQOaWB9QMo4.Ns0WNyEWdPsk(sb, this.JhCgjQRTAOCT, ')');
    }
}
