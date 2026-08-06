package defpackage;

/* compiled from: r8-map-id-5e15bf382d9e1cc682b2b5d208f848646545054061ee84effb1e415a0540fc32 */
/* loaded from: classes.dex */
public final class p1 {
    public final float ZpBGe2uQfcn8;
    public final float giKS3J6vZuNy;

    public p1(float f, float f2) {
        this.ZpBGe2uQfcn8 = f;
        this.giKS3J6vZuNy = f2;
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof defpackage.p1)) {
            return false;
        }
        defpackage.p1 p1Var = (defpackage.p1) obj;
        return java.lang.Float.compare(this.ZpBGe2uQfcn8, p1Var.ZpBGe2uQfcn8) == 0 && java.lang.Float.compare(this.giKS3J6vZuNy, p1Var.giKS3J6vZuNy) == 0;
    }

    public final int hashCode() {
        return java.lang.Float.hashCode(this.giKS3J6vZuNy) + (java.lang.Float.hashCode(this.ZpBGe2uQfcn8) * 31);
    }

    public final java.lang.String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder("FlingResult(distanceCoefficient=");
        sb.append(this.ZpBGe2uQfcn8);
        sb.append(", velocityCoefficient=");
        return defpackage.pVQOaWB9QMo4.GE9mJIPrb8gP(sb, this.giKS3J6vZuNy, ')');
    }
}
