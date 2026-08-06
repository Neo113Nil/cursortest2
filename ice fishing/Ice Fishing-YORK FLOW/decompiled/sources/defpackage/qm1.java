package defpackage;

/* compiled from: r8-map-id-5e15bf382d9e1cc682b2b5d208f848646545054061ee84effb1e415a0540fc32 */
/* loaded from: classes.dex */
public final class qm1 {
    public static final defpackage.qm1 fWTAfUmVKrZq = new defpackage.qm1(1.0f, 0.0f);
    public final float ZpBGe2uQfcn8;
    public final float giKS3J6vZuNy;

    public qm1(float f, float f2) {
        this.ZpBGe2uQfcn8 = f;
        this.giKS3J6vZuNy = f2;
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof defpackage.qm1)) {
            return false;
        }
        defpackage.qm1 qm1Var = (defpackage.qm1) obj;
        return this.ZpBGe2uQfcn8 == qm1Var.ZpBGe2uQfcn8 && this.giKS3J6vZuNy == qm1Var.giKS3J6vZuNy;
    }

    public final int hashCode() {
        return java.lang.Float.hashCode(this.giKS3J6vZuNy) + (java.lang.Float.hashCode(this.ZpBGe2uQfcn8) * 31);
    }

    public final java.lang.String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder("TextGeometricTransform(scaleX=");
        sb.append(this.ZpBGe2uQfcn8);
        sb.append(", skewX=");
        return defpackage.pVQOaWB9QMo4.GE9mJIPrb8gP(sb, this.giKS3J6vZuNy, ')');
    }
}
