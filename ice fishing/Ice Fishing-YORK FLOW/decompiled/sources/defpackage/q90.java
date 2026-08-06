package defpackage;

/* compiled from: r8-map-id-5e15bf382d9e1cc682b2b5d208f848646545054061ee84effb1e415a0540fc32 */
/* loaded from: classes.dex */
public final class q90 {
    public static final defpackage.q90 WDYagTQQm9ns = new defpackage.q90(0, 0, 0, 0);
    public final int JhCgjQRTAOCT;
    public final int ZpBGe2uQfcn8;
    public final int fWTAfUmVKrZq;
    public final int giKS3J6vZuNy;

    public q90(int i, int i2, int i3, int i4) {
        this.ZpBGe2uQfcn8 = i;
        this.giKS3J6vZuNy = i2;
        this.fWTAfUmVKrZq = i3;
        this.JhCgjQRTAOCT = i4;
    }

    public final long ZpBGe2uQfcn8() {
        return (((giKS3J6vZuNy() / 2) + this.giKS3J6vZuNy) & 4294967295L) | (((fWTAfUmVKrZq() / 2) + this.ZpBGe2uQfcn8) << 32);
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof defpackage.q90)) {
            return false;
        }
        defpackage.q90 q90Var = (defpackage.q90) obj;
        return this.ZpBGe2uQfcn8 == q90Var.ZpBGe2uQfcn8 && this.giKS3J6vZuNy == q90Var.giKS3J6vZuNy && this.fWTAfUmVKrZq == q90Var.fWTAfUmVKrZq && this.JhCgjQRTAOCT == q90Var.JhCgjQRTAOCT;
    }

    public final int fWTAfUmVKrZq() {
        return this.fWTAfUmVKrZq - this.ZpBGe2uQfcn8;
    }

    public final int giKS3J6vZuNy() {
        return this.JhCgjQRTAOCT - this.giKS3J6vZuNy;
    }

    public final int hashCode() {
        return java.lang.Integer.hashCode(this.JhCgjQRTAOCT) + defpackage.pVQOaWB9QMo4.giKS3J6vZuNy(this.fWTAfUmVKrZq, defpackage.pVQOaWB9QMo4.giKS3J6vZuNy(this.giKS3J6vZuNy, java.lang.Integer.hashCode(this.ZpBGe2uQfcn8) * 31, 31), 31);
    }

    public final java.lang.String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder("IntRect.fromLTRB(");
        sb.append(this.ZpBGe2uQfcn8);
        sb.append(", ");
        sb.append(this.giKS3J6vZuNy);
        sb.append(", ");
        sb.append(this.fWTAfUmVKrZq);
        sb.append(", ");
        return defpackage.pVQOaWB9QMo4.Ns0WNyEWdPsk(sb, this.JhCgjQRTAOCT, ')');
    }
}
