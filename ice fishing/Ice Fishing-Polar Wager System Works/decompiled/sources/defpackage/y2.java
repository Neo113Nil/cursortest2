package defpackage;

/* loaded from: classes.dex */
public final class y2 {
    public final android.graphics.Path IHQe1A4L2xu;
    public android.graphics.RectF oh6vYeIP;
    public float[] r1MBDhnF;

    public y2(android.graphics.Path path) {
        this.IHQe1A4L2xu = path;
    }

    public static void IHQe1A4L2xu(defpackage.y2 y2Var, defpackage.x21 x21Var) {
        if (y2Var.oh6vYeIP == null) {
            y2Var.oh6vYeIP = new android.graphics.RectF();
        }
        android.graphics.RectF rectF = y2Var.oh6vYeIP;
        rectF.getClass();
        float f = x21Var.IHQe1A4L2xu;
        long j = x21Var.EXtogiMhuM;
        long j2 = x21Var.AARZUJiTa;
        long j3 = x21Var.xiZrDbcSW0;
        long j4 = x21Var.adDC3e2L;
        rectF.set(f, x21Var.oh6vYeIP, x21Var.r1MBDhnF, x21Var.F7NU4MC0GW);
        if (y2Var.r1MBDhnF == null) {
            y2Var.r1MBDhnF = new float[8];
        }
        float[] fArr = y2Var.r1MBDhnF;
        fArr.getClass();
        fArr[0] = java.lang.Float.intBitsToFloat((int) (j4 >> 32));
        fArr[1] = java.lang.Float.intBitsToFloat((int) (j4 & 4294967295L));
        fArr[2] = java.lang.Float.intBitsToFloat((int) (j3 >> 32));
        fArr[3] = java.lang.Float.intBitsToFloat((int) (j3 & 4294967295L));
        fArr[4] = java.lang.Float.intBitsToFloat((int) (j2 >> 32));
        fArr[5] = java.lang.Float.intBitsToFloat((int) (j2 & 4294967295L));
        fArr[6] = java.lang.Float.intBitsToFloat((int) (j >> 32));
        fArr[7] = java.lang.Float.intBitsToFloat((int) (j & 4294967295L));
        android.graphics.Path path = y2Var.IHQe1A4L2xu;
        android.graphics.RectF rectF2 = y2Var.oh6vYeIP;
        rectF2.getClass();
        float[] fArr2 = y2Var.r1MBDhnF;
        fArr2.getClass();
        path.addRoundRect(rectF2, fArr2, android.graphics.Path.Direction.CCW);
    }

    public final boolean F7NU4MC0GW(defpackage.y2 y2Var, defpackage.y2 y2Var2, int i) {
        android.graphics.Path.Op op = i == 0 ? android.graphics.Path.Op.DIFFERENCE : i == 1 ? android.graphics.Path.Op.INTERSECT : i == 4 ? android.graphics.Path.Op.REVERSE_DIFFERENCE : i == 2 ? android.graphics.Path.Op.UNION : android.graphics.Path.Op.XOR;
        if (!(y2Var instanceof defpackage.y2)) {
            throw new java.lang.UnsupportedOperationException("Unable to obtain android.graphics.Path");
        }
        android.graphics.Path path = y2Var.IHQe1A4L2xu;
        if (y2Var2 instanceof defpackage.y2) {
            return this.IHQe1A4L2xu.op(path, y2Var2.IHQe1A4L2xu, op);
        }
        throw new java.lang.UnsupportedOperationException("Unable to obtain android.graphics.Path");
    }

    public final defpackage.kz0 oh6vYeIP() {
        if (this.oh6vYeIP == null) {
            this.oh6vYeIP = new android.graphics.RectF();
        }
        android.graphics.RectF rectF = this.oh6vYeIP;
        rectF.getClass();
        this.IHQe1A4L2xu.computeBounds(rectF, true);
        return new defpackage.kz0(rectF.left, rectF.top, rectF.right, rectF.bottom);
    }

    public final void r1MBDhnF(float f, float f2) {
        this.IHQe1A4L2xu.lineTo(f, f2);
    }
}
