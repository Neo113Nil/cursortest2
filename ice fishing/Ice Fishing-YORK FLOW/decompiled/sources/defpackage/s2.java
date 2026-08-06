package defpackage;

/* compiled from: r8-map-id-5e15bf382d9e1cc682b2b5d208f848646545054061ee84effb1e415a0540fc32 */
/* loaded from: classes.dex */
public final class s2 {
    public android.graphics.Matrix JhCgjQRTAOCT;
    public final android.graphics.Path ZpBGe2uQfcn8;
    public float[] fWTAfUmVKrZq;
    public android.graphics.RectF giKS3J6vZuNy;

    public s2(android.graphics.Path path) {
        this.ZpBGe2uQfcn8 = path;
    }

    public static void ZpBGe2uQfcn8(defpackage.s2 s2Var, defpackage.s2 s2Var2) {
        android.graphics.Path path = s2Var.ZpBGe2uQfcn8;
        if (!(s2Var2 instanceof defpackage.s2)) {
            throw new java.lang.UnsupportedOperationException("Unable to obtain android.graphics.Path");
        }
        path.addPath(s2Var2.ZpBGe2uQfcn8, java.lang.Float.intBitsToFloat(0), java.lang.Float.intBitsToFloat(0));
    }

    public static void fWTAfUmVKrZq(defpackage.s2 s2Var, defpackage.n61 n61Var) {
        if (s2Var.giKS3J6vZuNy == null) {
            s2Var.giKS3J6vZuNy = new android.graphics.RectF();
        }
        android.graphics.RectF rectF = s2Var.giKS3J6vZuNy;
        rectF.getClass();
        float f = n61Var.ZpBGe2uQfcn8;
        long j = n61Var.P05cfTpS5W5L;
        long j2 = n61Var.QiMR8OkAhezm;
        long j3 = n61Var.oh71FJcDz6S2;
        long j4 = n61Var.WDYagTQQm9ns;
        rectF.set(f, n61Var.giKS3J6vZuNy, n61Var.fWTAfUmVKrZq, n61Var.JhCgjQRTAOCT);
        if (s2Var.fWTAfUmVKrZq == null) {
            s2Var.fWTAfUmVKrZq = new float[8];
        }
        float[] fArr = s2Var.fWTAfUmVKrZq;
        fArr.getClass();
        fArr[0] = java.lang.Float.intBitsToFloat((int) (j4 >> 32));
        fArr[1] = java.lang.Float.intBitsToFloat((int) (j4 & 4294967295L));
        fArr[2] = java.lang.Float.intBitsToFloat((int) (j3 >> 32));
        fArr[3] = java.lang.Float.intBitsToFloat((int) (j3 & 4294967295L));
        fArr[4] = java.lang.Float.intBitsToFloat((int) (j2 >> 32));
        fArr[5] = java.lang.Float.intBitsToFloat((int) (j2 & 4294967295L));
        fArr[6] = java.lang.Float.intBitsToFloat((int) (j >> 32));
        fArr[7] = java.lang.Float.intBitsToFloat((int) (j & 4294967295L));
        android.graphics.Path path = s2Var.ZpBGe2uQfcn8;
        android.graphics.RectF rectF2 = s2Var.giKS3J6vZuNy;
        rectF2.getClass();
        float[] fArr2 = s2Var.fWTAfUmVKrZq;
        fArr2.getClass();
        path.addRoundRect(rectF2, fArr2, android.graphics.Path.Direction.CCW);
    }

    public static void giKS3J6vZuNy(defpackage.s2 s2Var, defpackage.s31 s31Var) {
        float f = s31Var.ZpBGe2uQfcn8;
        float f2 = s31Var.JhCgjQRTAOCT;
        float f3 = s31Var.fWTAfUmVKrZq;
        float f4 = s31Var.giKS3J6vZuNy;
        if (java.lang.Float.isNaN(f) || java.lang.Float.isNaN(f4) || java.lang.Float.isNaN(f3) || java.lang.Float.isNaN(f2)) {
            defpackage.u2.giKS3J6vZuNy("Invalid rectangle, make sure no value is NaN");
        }
        if (s2Var.giKS3J6vZuNy == null) {
            s2Var.giKS3J6vZuNy = new android.graphics.RectF();
        }
        android.graphics.RectF rectF = s2Var.giKS3J6vZuNy;
        rectF.getClass();
        rectF.set(f, f4, f3, f2);
        android.graphics.Path path = s2Var.ZpBGe2uQfcn8;
        android.graphics.RectF rectF2 = s2Var.giKS3J6vZuNy;
        rectF2.getClass();
        path.addRect(rectF2, android.graphics.Path.Direction.CCW);
    }

    public final defpackage.s31 JhCgjQRTAOCT() {
        if (this.giKS3J6vZuNy == null) {
            this.giKS3J6vZuNy = new android.graphics.RectF();
        }
        android.graphics.RectF rectF = this.giKS3J6vZuNy;
        rectF.getClass();
        this.ZpBGe2uQfcn8.computeBounds(rectF, true);
        return new defpackage.s31(rectF.left, rectF.top, rectF.right, rectF.bottom);
    }

    public final boolean WDYagTQQm9ns(defpackage.s2 s2Var, defpackage.s2 s2Var2, int i) {
        android.graphics.Path.Op op = i == 0 ? android.graphics.Path.Op.DIFFERENCE : i == 1 ? android.graphics.Path.Op.INTERSECT : i == 4 ? android.graphics.Path.Op.REVERSE_DIFFERENCE : i == 2 ? android.graphics.Path.Op.UNION : android.graphics.Path.Op.XOR;
        if (!(s2Var instanceof defpackage.s2)) {
            throw new java.lang.UnsupportedOperationException("Unable to obtain android.graphics.Path");
        }
        android.graphics.Path path = s2Var.ZpBGe2uQfcn8;
        if (s2Var2 instanceof defpackage.s2) {
            return this.ZpBGe2uQfcn8.op(path, s2Var2.ZpBGe2uQfcn8, op);
        }
        throw new java.lang.UnsupportedOperationException("Unable to obtain android.graphics.Path");
    }

    public final void oh71FJcDz6S2() {
        this.ZpBGe2uQfcn8.reset();
    }
}
