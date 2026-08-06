package defpackage;

/* compiled from: r8-map-id-5e15bf382d9e1cc682b2b5d208f848646545054061ee84effb1e415a0540fc32 */
/* loaded from: classes.dex */
public final class s31 {
    public static final defpackage.s31 WDYagTQQm9ns = new defpackage.s31(0.0f, 0.0f, 0.0f, 0.0f);
    public final float JhCgjQRTAOCT;
    public final float ZpBGe2uQfcn8;
    public final float fWTAfUmVKrZq;
    public final float giKS3J6vZuNy;

    public s31(float f, float f2, float f3, float f4) {
        this.ZpBGe2uQfcn8 = f;
        this.giKS3J6vZuNy = f2;
        this.fWTAfUmVKrZq = f3;
        this.JhCgjQRTAOCT = f4;
    }

    public final long JhCgjQRTAOCT() {
        return (java.lang.Float.floatToRawIntBits(this.ZpBGe2uQfcn8) << 32) | (java.lang.Float.floatToRawIntBits(this.giKS3J6vZuNy) & 4294967295L);
    }

    public final defpackage.s31 P05cfTpS5W5L(float f, float f2) {
        return new defpackage.s31(this.ZpBGe2uQfcn8 + f, this.giKS3J6vZuNy + f2, this.fWTAfUmVKrZq + f, this.JhCgjQRTAOCT + f2);
    }

    public final boolean QiMR8OkAhezm(defpackage.s31 s31Var) {
        return (this.ZpBGe2uQfcn8 < s31Var.fWTAfUmVKrZq) & (s31Var.ZpBGe2uQfcn8 < this.fWTAfUmVKrZq) & (this.giKS3J6vZuNy < s31Var.JhCgjQRTAOCT) & (s31Var.giKS3J6vZuNy < this.JhCgjQRTAOCT);
    }

    public final defpackage.s31 WDYagTQQm9ns(defpackage.s31 s31Var) {
        return new defpackage.s31(java.lang.Math.max(this.ZpBGe2uQfcn8, s31Var.ZpBGe2uQfcn8), java.lang.Math.max(this.giKS3J6vZuNy, s31Var.giKS3J6vZuNy), java.lang.Math.min(this.fWTAfUmVKrZq, s31Var.fWTAfUmVKrZq), java.lang.Math.min(this.JhCgjQRTAOCT, s31Var.JhCgjQRTAOCT));
    }

    public final boolean ZpBGe2uQfcn8(long j) {
        float intBitsToFloat = java.lang.Float.intBitsToFloat((int) (j >> 32));
        float intBitsToFloat2 = java.lang.Float.intBitsToFloat((int) (j & 4294967295L));
        return (intBitsToFloat >= this.ZpBGe2uQfcn8) & (intBitsToFloat < this.fWTAfUmVKrZq) & (intBitsToFloat2 >= this.giKS3J6vZuNy) & (intBitsToFloat2 < this.JhCgjQRTAOCT);
    }

    public final defpackage.s31 e6mdH7fiFuta(long j) {
        int i = (int) (j >> 32);
        int i2 = (int) (j & 4294967295L);
        return new defpackage.s31(java.lang.Float.intBitsToFloat(i) + this.ZpBGe2uQfcn8, java.lang.Float.intBitsToFloat(i2) + this.giKS3J6vZuNy, java.lang.Float.intBitsToFloat(i) + this.fWTAfUmVKrZq, java.lang.Float.intBitsToFloat(i2) + this.JhCgjQRTAOCT);
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof defpackage.s31)) {
            return false;
        }
        defpackage.s31 s31Var = (defpackage.s31) obj;
        return java.lang.Float.compare(this.ZpBGe2uQfcn8, s31Var.ZpBGe2uQfcn8) == 0 && java.lang.Float.compare(this.giKS3J6vZuNy, s31Var.giKS3J6vZuNy) == 0 && java.lang.Float.compare(this.fWTAfUmVKrZq, s31Var.fWTAfUmVKrZq) == 0 && java.lang.Float.compare(this.JhCgjQRTAOCT, s31Var.JhCgjQRTAOCT) == 0;
    }

    public final long fWTAfUmVKrZq() {
        float f = this.fWTAfUmVKrZq - this.ZpBGe2uQfcn8;
        float f2 = this.JhCgjQRTAOCT - this.giKS3J6vZuNy;
        return (java.lang.Float.floatToRawIntBits(f2) & 4294967295L) | (java.lang.Float.floatToRawIntBits(f) << 32);
    }

    public final long giKS3J6vZuNy() {
        float f = this.fWTAfUmVKrZq;
        float f2 = this.ZpBGe2uQfcn8;
        float f3 = ((f - f2) / 2.0f) + f2;
        float f4 = this.JhCgjQRTAOCT;
        float f5 = this.giKS3J6vZuNy;
        return (java.lang.Float.floatToRawIntBits(((f4 - f5) / 2.0f) + f5) & 4294967295L) | (java.lang.Float.floatToRawIntBits(f3) << 32);
    }

    public final int hashCode() {
        return java.lang.Float.hashCode(this.JhCgjQRTAOCT) + defpackage.pVQOaWB9QMo4.ZpBGe2uQfcn8(this.fWTAfUmVKrZq, defpackage.pVQOaWB9QMo4.ZpBGe2uQfcn8(this.giKS3J6vZuNy, java.lang.Float.hashCode(this.ZpBGe2uQfcn8) * 31, 31), 31);
    }

    public final boolean oh71FJcDz6S2() {
        return (this.ZpBGe2uQfcn8 >= this.fWTAfUmVKrZq) | (this.giKS3J6vZuNy >= this.JhCgjQRTAOCT);
    }

    public final java.lang.String toString() {
        return "Rect.fromLTRB(" + defpackage.nq1.fhbmYuu9J3cT(this.ZpBGe2uQfcn8) + ", " + defpackage.nq1.fhbmYuu9J3cT(this.giKS3J6vZuNy) + ", " + defpackage.nq1.fhbmYuu9J3cT(this.fWTAfUmVKrZq) + ", " + defpackage.nq1.fhbmYuu9J3cT(this.JhCgjQRTAOCT) + ')';
    }
}
