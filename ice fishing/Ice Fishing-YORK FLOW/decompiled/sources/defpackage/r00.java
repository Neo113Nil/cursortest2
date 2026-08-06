package defpackage;

/* compiled from: r8-map-id-5e15bf382d9e1cc682b2b5d208f848646545054061ee84effb1e415a0540fc32 */
/* loaded from: classes.dex */
public final class r00 implements defpackage.p00 {
    public final float[] ZpBGe2uQfcn8;
    public final float[] giKS3J6vZuNy;

    public r00(float[] fArr, float[] fArr2) {
        if (fArr.length != fArr2.length || fArr.length == 0) {
            defpackage.h7.w7APNrr0aGRc("Array lengths must match and be nonzero");
            throw null;
        }
        this.ZpBGe2uQfcn8 = fArr;
        this.giKS3J6vZuNy = fArr2;
    }

    @Override // defpackage.p00
    public final float ZpBGe2uQfcn8(float f) {
        return defpackage.hu.e6mdH7fiFuta(f, this.giKS3J6vZuNy, this.ZpBGe2uQfcn8);
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof defpackage.r00)) {
            return false;
        }
        defpackage.r00 r00Var = (defpackage.r00) obj;
        return java.util.Arrays.equals(this.ZpBGe2uQfcn8, r00Var.ZpBGe2uQfcn8) && java.util.Arrays.equals(this.giKS3J6vZuNy, r00Var.giKS3J6vZuNy);
    }

    @Override // defpackage.p00
    public final float giKS3J6vZuNy(float f) {
        return defpackage.hu.e6mdH7fiFuta(f, this.ZpBGe2uQfcn8, this.giKS3J6vZuNy);
    }

    public final int hashCode() {
        return java.util.Arrays.hashCode(this.giKS3J6vZuNy) + (java.util.Arrays.hashCode(this.ZpBGe2uQfcn8) * 31);
    }

    public final java.lang.String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder("FontScaleConverter{fromSpValues=");
        java.lang.String arrays = java.util.Arrays.toString(this.ZpBGe2uQfcn8);
        arrays.getClass();
        sb.append(arrays);
        sb.append(", toDpValues=");
        java.lang.String arrays2 = java.util.Arrays.toString(this.giKS3J6vZuNy);
        arrays2.getClass();
        sb.append(arrays2);
        sb.append('}');
        return sb.toString();
    }
}
