package defpackage;

/* compiled from: r8-map-id-5e15bf382d9e1cc682b2b5d208f848646545054061ee84effb1e415a0540fc32 */
/* loaded from: classes.dex */
public final class v80 {
    public static final defpackage.v80 WDYagTQQm9ns = new defpackage.v80(0, 0, 0, 0);
    public final int JhCgjQRTAOCT;
    public final int ZpBGe2uQfcn8;
    public final int fWTAfUmVKrZq;
    public final int giKS3J6vZuNy;

    public v80(int i, int i2, int i3, int i4) {
        this.ZpBGe2uQfcn8 = i;
        this.giKS3J6vZuNy = i2;
        this.fWTAfUmVKrZq = i3;
        this.JhCgjQRTAOCT = i4;
    }

    public static defpackage.v80 ZpBGe2uQfcn8(defpackage.v80 v80Var, defpackage.v80 v80Var2) {
        return giKS3J6vZuNy(java.lang.Math.max(v80Var.ZpBGe2uQfcn8, v80Var2.ZpBGe2uQfcn8), java.lang.Math.max(v80Var.giKS3J6vZuNy, v80Var2.giKS3J6vZuNy), java.lang.Math.max(v80Var.fWTAfUmVKrZq, v80Var2.fWTAfUmVKrZq), java.lang.Math.max(v80Var.JhCgjQRTAOCT, v80Var2.JhCgjQRTAOCT));
    }

    public static defpackage.v80 fWTAfUmVKrZq(android.graphics.Insets insets) {
        int i;
        int i2;
        int i3;
        int i4;
        i = insets.left;
        i2 = insets.top;
        i3 = insets.right;
        i4 = insets.bottom;
        return giKS3J6vZuNy(i, i2, i3, i4);
    }

    public static defpackage.v80 giKS3J6vZuNy(int i, int i2, int i3, int i4) {
        return (i == 0 && i2 == 0 && i3 == 0 && i4 == 0) ? WDYagTQQm9ns : new defpackage.v80(i, i2, i3, i4);
    }

    public final android.graphics.Insets JhCgjQRTAOCT() {
        return defpackage.rk.P05cfTpS5W5L(this.ZpBGe2uQfcn8, this.giKS3J6vZuNy, this.fWTAfUmVKrZq, this.JhCgjQRTAOCT);
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || defpackage.v80.class != obj.getClass()) {
            return false;
        }
        defpackage.v80 v80Var = (defpackage.v80) obj;
        return this.JhCgjQRTAOCT == v80Var.JhCgjQRTAOCT && this.ZpBGe2uQfcn8 == v80Var.ZpBGe2uQfcn8 && this.fWTAfUmVKrZq == v80Var.fWTAfUmVKrZq && this.giKS3J6vZuNy == v80Var.giKS3J6vZuNy;
    }

    public final int hashCode() {
        return (((((this.ZpBGe2uQfcn8 * 31) + this.giKS3J6vZuNy) * 31) + this.fWTAfUmVKrZq) * 31) + this.JhCgjQRTAOCT;
    }

    public final java.lang.String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder("Insets{left=");
        sb.append(this.ZpBGe2uQfcn8);
        sb.append(", top=");
        sb.append(this.giKS3J6vZuNy);
        sb.append(", right=");
        sb.append(this.fWTAfUmVKrZq);
        sb.append(", bottom=");
        return defpackage.pVQOaWB9QMo4.Ns0WNyEWdPsk(sb, this.JhCgjQRTAOCT, '}');
    }
}
