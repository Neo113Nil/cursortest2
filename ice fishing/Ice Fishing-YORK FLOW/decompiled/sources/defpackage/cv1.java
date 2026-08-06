package defpackage;

/* compiled from: r8-map-id-5e15bf382d9e1cc682b2b5d208f848646545054061ee84effb1e415a0540fc32 */
/* loaded from: classes.dex */
public final class cv1 implements defpackage.il0 {
    public final defpackage.da ZpBGe2uQfcn8;
    public final int giKS3J6vZuNy;

    public cv1(defpackage.da daVar, int i) {
        this.ZpBGe2uQfcn8 = daVar;
        this.giKS3J6vZuNy = i;
    }

    @Override // defpackage.il0
    public final int ZpBGe2uQfcn8(defpackage.q90 q90Var, long j, int i) {
        int i2 = (int) (j & 4294967295L);
        int i3 = this.giKS3J6vZuNy;
        return i >= i2 - (i3 * 2) ? java.lang.Math.round(((i2 - i) / 2.0f) * 1.0f) : defpackage.j80.T1fB7bDYiVJQ(this.ZpBGe2uQfcn8.ZpBGe2uQfcn8(i, i2), i3, (i2 - i3) - i);
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof defpackage.cv1)) {
            return false;
        }
        defpackage.cv1 cv1Var = (defpackage.cv1) obj;
        return this.ZpBGe2uQfcn8.equals(cv1Var.ZpBGe2uQfcn8) && this.giKS3J6vZuNy == cv1Var.giKS3J6vZuNy;
    }

    public final int hashCode() {
        return java.lang.Integer.hashCode(this.giKS3J6vZuNy) + (java.lang.Float.hashCode(this.ZpBGe2uQfcn8.ZpBGe2uQfcn8) * 31);
    }

    public final java.lang.String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder("Vertical(alignment=");
        sb.append(this.ZpBGe2uQfcn8);
        sb.append(", margin=");
        return defpackage.pVQOaWB9QMo4.Ns0WNyEWdPsk(sb, this.giKS3J6vZuNy, ')');
    }
}
