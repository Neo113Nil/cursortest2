package defpackage;

/* compiled from: r8-map-id-5e15bf382d9e1cc682b2b5d208f848646545054061ee84effb1e415a0540fc32 */
/* loaded from: classes.dex */
public final class xn0 {
    public float ZpBGe2uQfcn8 = 0.0f;
    public float giKS3J6vZuNy = 0.0f;
    public float fWTAfUmVKrZq = 0.0f;
    public float JhCgjQRTAOCT = 0.0f;

    public final void ZpBGe2uQfcn8(float f, float f2, float f3, float f4) {
        this.ZpBGe2uQfcn8 = java.lang.Math.max(f, this.ZpBGe2uQfcn8);
        this.giKS3J6vZuNy = java.lang.Math.max(f2, this.giKS3J6vZuNy);
        this.fWTAfUmVKrZq = java.lang.Math.min(f3, this.fWTAfUmVKrZq);
        this.JhCgjQRTAOCT = java.lang.Math.min(f4, this.JhCgjQRTAOCT);
    }

    public final void fWTAfUmVKrZq(long j) {
        float intBitsToFloat = java.lang.Float.intBitsToFloat((int) (j >> 32));
        float intBitsToFloat2 = java.lang.Float.intBitsToFloat((int) (j & 4294967295L));
        this.ZpBGe2uQfcn8 += intBitsToFloat;
        this.giKS3J6vZuNy += intBitsToFloat2;
        this.fWTAfUmVKrZq += intBitsToFloat;
        this.JhCgjQRTAOCT += intBitsToFloat2;
    }

    public final boolean giKS3J6vZuNy() {
        return (this.ZpBGe2uQfcn8 >= this.fWTAfUmVKrZq) | (this.giKS3J6vZuNy >= this.JhCgjQRTAOCT);
    }

    public final java.lang.String toString() {
        return "MutableRect(" + defpackage.nq1.fhbmYuu9J3cT(this.ZpBGe2uQfcn8) + ", " + defpackage.nq1.fhbmYuu9J3cT(this.giKS3J6vZuNy) + ", " + defpackage.nq1.fhbmYuu9J3cT(this.fWTAfUmVKrZq) + ", " + defpackage.nq1.fhbmYuu9J3cT(this.JhCgjQRTAOCT) + ')';
    }
}
