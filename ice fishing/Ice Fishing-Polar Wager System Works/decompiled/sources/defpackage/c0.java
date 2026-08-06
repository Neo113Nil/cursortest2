package defpackage;

/* loaded from: classes.dex */
public final class c0 implements defpackage.hb {
    public android.graphics.Canvas IHQe1A4L2xu = defpackage.d0.IHQe1A4L2xu;
    public android.graphics.Rect oh6vYeIP;
    public android.graphics.Rect r1MBDhnF;

    @Override // defpackage.hb
    public final void AARZUJiTa() {
        this.IHQe1A4L2xu.restore();
    }

    @Override // defpackage.hb
    public final void DFo87pBq1E5() {
        defpackage.mj1.QQUzIjv3iOC5(this.IHQe1A4L2xu, true);
    }

    @Override // defpackage.hb
    public final void EXtogiMhuM(float f, float f2, float f3, float f4, float f5, float f6, defpackage.r2 r2Var) {
        this.IHQe1A4L2xu.drawRoundRect(f, f2, f3, f4, f5, f6, (android.graphics.Paint) r2Var.oh6vYeIP);
    }

    @Override // defpackage.hb
    public final void F7NU4MC0GW(float f, float f2, float f3, float f4, int i) {
        this.IHQe1A4L2xu.clipRect(f, f2, f3, f4, i == 0 ? android.graphics.Region.Op.DIFFERENCE : android.graphics.Region.Op.INTERSECT);
    }

    @Override // defpackage.hb
    public final void IHQe1A4L2xu(float f, float f2) {
        this.IHQe1A4L2xu.scale(f, f2);
    }

    @Override // defpackage.hb
    public final void JlrlGoKF(float f, float f2, float f3, float f4, defpackage.r2 r2Var) {
        this.IHQe1A4L2xu.drawRect(f, f2, f3, f4, defpackage.s21.D2vUnMij(r2Var));
    }

    @Override // defpackage.hb
    public final void SH1y5HwkJhh(long j, long j2, defpackage.r2 r2Var) {
        this.IHQe1A4L2xu.drawLine(java.lang.Float.intBitsToFloat((int) (j >> 32)), java.lang.Float.intBitsToFloat((int) (j & 4294967295L)), java.lang.Float.intBitsToFloat((int) (j2 >> 32)), java.lang.Float.intBitsToFloat((int) (j2 & 4294967295L)), (android.graphics.Paint) r2Var.oh6vYeIP);
    }

    @Override // defpackage.hb
    public final void SyNS6RMn(defpackage.y2 y2Var) {
        android.graphics.Canvas canvas = this.IHQe1A4L2xu;
        if (!(y2Var instanceof defpackage.y2)) {
            throw new java.lang.UnsupportedOperationException("Unable to obtain android.graphics.Path");
        }
        canvas.clipPath(y2Var.IHQe1A4L2xu, android.graphics.Region.Op.INTERSECT);
    }

    @Override // defpackage.hb
    public final void adDC3e2L(float f, float f2) {
        this.IHQe1A4L2xu.translate(f, f2);
    }

    @Override // defpackage.hb
    public final void ez2rX8ReCYw() {
        defpackage.mj1.QQUzIjv3iOC5(this.IHQe1A4L2xu, false);
    }

    @Override // defpackage.hb
    public final void oh6vYeIP(float f, long j, defpackage.r2 r2Var) {
        this.IHQe1A4L2xu.drawCircle(java.lang.Float.intBitsToFloat((int) (j >> 32)), java.lang.Float.intBitsToFloat((int) (j & 4294967295L)), f, (android.graphics.Paint) r2Var.oh6vYeIP);
    }

    @Override // defpackage.hb
    public final void r1MBDhnF(defpackage.o2 o2Var, long j, long j2, defpackage.r2 r2Var) {
        if (this.oh6vYeIP == null) {
            this.oh6vYeIP = new android.graphics.Rect();
            this.r1MBDhnF = new android.graphics.Rect();
        }
        android.graphics.Canvas canvas = this.IHQe1A4L2xu;
        if (o2Var == null) {
            throw new java.lang.UnsupportedOperationException("Unable to obtain android.graphics.Bitmap");
        }
        android.graphics.Bitmap bitmap = o2Var.IHQe1A4L2xu;
        android.graphics.Rect rect = this.oh6vYeIP;
        rect.getClass();
        rect.left = 0;
        rect.top = 0;
        rect.right = (int) (j >> 32);
        rect.bottom = (int) (j & 4294967295L);
        android.graphics.Rect rect2 = this.r1MBDhnF;
        rect2.getClass();
        rect2.left = 0;
        rect2.top = 0;
        rect2.right = (int) (j2 >> 32);
        rect2.bottom = (int) (j2 & 4294967295L);
        canvas.drawBitmap(bitmap, rect, rect2, (android.graphics.Paint) r2Var.oh6vYeIP);
    }

    @Override // defpackage.hb
    public final void riuEU0zW4() {
        this.IHQe1A4L2xu.save();
    }

    @Override // defpackage.hb
    public final void xiZrDbcSW0(defpackage.y2 y2Var, defpackage.r2 r2Var) {
        android.graphics.Canvas canvas = this.IHQe1A4L2xu;
        if (!(y2Var instanceof defpackage.y2)) {
            throw new java.lang.UnsupportedOperationException("Unable to obtain android.graphics.Path");
        }
        canvas.drawPath(y2Var.IHQe1A4L2xu, (android.graphics.Paint) r2Var.oh6vYeIP);
    }
}
