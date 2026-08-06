package defpackage;

/* compiled from: r8-map-id-5e15bf382d9e1cc682b2b5d208f848646545054061ee84effb1e415a0540fc32 */
/* loaded from: classes.dex */
public final class DR1ov5IJDbR8 implements defpackage.id {
    public android.graphics.Canvas ZpBGe2uQfcn8 = defpackage.a.ZpBGe2uQfcn8;
    public android.graphics.Rect fWTAfUmVKrZq;
    public android.graphics.Rect giKS3J6vZuNy;

    @Override // defpackage.id
    public final void BHfvd2J71qpO(defpackage.s2 s2Var) {
        android.graphics.Canvas canvas = this.ZpBGe2uQfcn8;
        if (!(s2Var instanceof defpackage.s2)) {
            throw new java.lang.UnsupportedOperationException("Unable to obtain android.graphics.Path");
        }
        canvas.clipPath(s2Var.ZpBGe2uQfcn8, android.graphics.Region.Op.INTERSECT);
    }

    @Override // defpackage.id
    public final void GE9mJIPrb8gP(float f, float f2, float f3, float f4, float f5, float f6, defpackage.j2 j2Var) {
        this.ZpBGe2uQfcn8.drawRoundRect(f, f2, f3, f4, f5, f6, (android.graphics.Paint) j2Var.giKS3J6vZuNy);
    }

    @Override // defpackage.id
    public final void JhCgjQRTAOCT(defpackage.w1 w1Var, long j, long j2, long j3, defpackage.j2 j2Var) {
        if (this.giKS3J6vZuNy == null) {
            this.giKS3J6vZuNy = new android.graphics.Rect();
            this.fWTAfUmVKrZq = new android.graphics.Rect();
        }
        android.graphics.Canvas canvas = this.ZpBGe2uQfcn8;
        android.graphics.Bitmap Ns0WNyEWdPsk = defpackage.la0.Ns0WNyEWdPsk(w1Var);
        android.graphics.Rect rect = this.giKS3J6vZuNy;
        rect.getClass();
        int i = (int) (j >> 32);
        rect.left = i;
        int i2 = (int) (j & 4294967295L);
        rect.top = i2;
        rect.right = i + ((int) (j2 >> 32));
        rect.bottom = i2 + ((int) (j2 & 4294967295L));
        android.graphics.Rect rect2 = this.fWTAfUmVKrZq;
        rect2.getClass();
        rect2.left = 0;
        rect2.top = 0;
        rect2.right = (int) (j3 >> 32);
        rect2.bottom = (int) (j3 & 4294967295L);
        canvas.drawBitmap(Ns0WNyEWdPsk, rect, rect2, (android.graphics.Paint) j2Var.giKS3J6vZuNy);
    }

    @Override // defpackage.id
    public final void P05cfTpS5W5L() {
        this.ZpBGe2uQfcn8.rotate(45.0f);
    }

    @Override // defpackage.id
    public final void QiMR8OkAhezm(defpackage.s2 s2Var, defpackage.j2 j2Var) {
        android.graphics.Canvas canvas = this.ZpBGe2uQfcn8;
        if (!(s2Var instanceof defpackage.s2)) {
            throw new java.lang.UnsupportedOperationException("Unable to obtain android.graphics.Path");
        }
        canvas.drawPath(s2Var.ZpBGe2uQfcn8, defpackage.jr0.blKFvluuDQOf(j2Var));
    }

    @Override // defpackage.id
    public final void T1fB7bDYiVJQ(defpackage.s31 s31Var, defpackage.j2 j2Var) {
        this.ZpBGe2uQfcn8.saveLayer(s31Var.ZpBGe2uQfcn8, s31Var.giKS3J6vZuNy, s31Var.fWTAfUmVKrZq, s31Var.JhCgjQRTAOCT, (android.graphics.Paint) j2Var.giKS3J6vZuNy, 31);
    }

    @Override // defpackage.id
    public final void WDYagTQQm9ns(float f, float f2, float f3, float f4, int i) {
        this.ZpBGe2uQfcn8.clipRect(f, f2, f3, f4, i == 0 ? android.graphics.Region.Op.DIFFERENCE : android.graphics.Region.Op.INTERSECT);
    }

    @Override // defpackage.id
    public final void WmetiUbpKU9I(float[] fArr) {
        if (defpackage.m90.blKFvluuDQOf(fArr)) {
            return;
        }
        android.graphics.Matrix matrix = new android.graphics.Matrix();
        defpackage.ma0.frSwwKIlbUhK(matrix, fArr);
        this.ZpBGe2uQfcn8.concat(matrix);
    }

    @Override // defpackage.id
    public final void XntWc4eZSQ8j(float f, float f2, float f3, float f4, defpackage.j2 j2Var) {
        this.ZpBGe2uQfcn8.drawRect(f, f2, f3, f4, defpackage.jr0.blKFvluuDQOf(j2Var));
    }

    @Override // defpackage.id
    public final void ZpBGe2uQfcn8(defpackage.w1 w1Var, defpackage.j2 j2Var) {
        this.ZpBGe2uQfcn8.drawBitmap(defpackage.la0.Ns0WNyEWdPsk(w1Var), java.lang.Float.intBitsToFloat(0), java.lang.Float.intBitsToFloat(0), (android.graphics.Paint) j2Var.giKS3J6vZuNy);
    }

    @Override // defpackage.id
    public final void e6mdH7fiFuta() {
        this.ZpBGe2uQfcn8.restore();
    }

    @Override // defpackage.id
    public final void fNwYGHIYeJcR() {
        this.ZpBGe2uQfcn8.save();
    }

    @Override // defpackage.id
    public final void fWTAfUmVKrZq(float f, long j, defpackage.j2 j2Var) {
        this.ZpBGe2uQfcn8.drawCircle(java.lang.Float.intBitsToFloat((int) (j >> 32)), java.lang.Float.intBitsToFloat((int) (j & 4294967295L)), f, (android.graphics.Paint) j2Var.giKS3J6vZuNy);
    }

    @Override // defpackage.id
    public final void gUjdnLbkVAaA() {
        defpackage.nn.h3m55N1URyyK(this.ZpBGe2uQfcn8, false);
    }

    @Override // defpackage.id
    public final void giKS3J6vZuNy(float f, float f2) {
        this.ZpBGe2uQfcn8.scale(f, f2);
    }

    @Override // defpackage.id
    public final void h3m55N1URyyK(long j, long j2, defpackage.j2 j2Var) {
        this.ZpBGe2uQfcn8.drawLine(java.lang.Float.intBitsToFloat((int) (j >> 32)), java.lang.Float.intBitsToFloat((int) (j & 4294967295L)), java.lang.Float.intBitsToFloat((int) (j2 >> 32)), java.lang.Float.intBitsToFloat((int) (j2 & 4294967295L)), (android.graphics.Paint) j2Var.giKS3J6vZuNy);
    }

    @Override // defpackage.id
    public final void oh71FJcDz6S2(float f, float f2) {
        this.ZpBGe2uQfcn8.translate(f, f2);
    }

    @Override // defpackage.id
    public final void s0TASMVLSWD5() {
        defpackage.nn.h3m55N1URyyK(this.ZpBGe2uQfcn8, true);
    }
}
