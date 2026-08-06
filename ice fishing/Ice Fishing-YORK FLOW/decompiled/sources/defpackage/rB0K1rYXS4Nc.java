package defpackage;

/* compiled from: r8-map-id-5e15bf382d9e1cc682b2b5d208f848646545054061ee84effb1e415a0540fc32 */
/* loaded from: classes.dex */
public final class rB0K1rYXS4Nc implements defpackage.il0 {
    public final defpackage.da ZpBGe2uQfcn8;
    public final defpackage.da giKS3J6vZuNy;

    public rB0K1rYXS4Nc(defpackage.da daVar, defpackage.da daVar2) {
        this.ZpBGe2uQfcn8 = daVar;
        this.giKS3J6vZuNy = daVar2;
    }

    @Override // defpackage.il0
    public final int ZpBGe2uQfcn8(defpackage.q90 q90Var, long j, int i) {
        int ZpBGe2uQfcn8 = this.giKS3J6vZuNy.ZpBGe2uQfcn8(0, q90Var.giKS3J6vZuNy());
        return q90Var.giKS3J6vZuNy + ZpBGe2uQfcn8 + (-this.ZpBGe2uQfcn8.ZpBGe2uQfcn8(0, i));
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof defpackage.rB0K1rYXS4Nc)) {
            return false;
        }
        defpackage.rB0K1rYXS4Nc rb0k1ryxs4nc = (defpackage.rB0K1rYXS4Nc) obj;
        return this.ZpBGe2uQfcn8.equals(rb0k1ryxs4nc.ZpBGe2uQfcn8) && this.giKS3J6vZuNy.equals(rb0k1ryxs4nc.giKS3J6vZuNy);
    }

    public final int hashCode() {
        return java.lang.Integer.hashCode(0) + defpackage.pVQOaWB9QMo4.ZpBGe2uQfcn8(this.giKS3J6vZuNy.ZpBGe2uQfcn8, java.lang.Float.hashCode(this.ZpBGe2uQfcn8.ZpBGe2uQfcn8) * 31, 31);
    }

    public final java.lang.String toString() {
        return "Vertical(menuAlignment=" + this.ZpBGe2uQfcn8 + ", anchorAlignment=" + this.giKS3J6vZuNy + ", offset=0)";
    }
}
