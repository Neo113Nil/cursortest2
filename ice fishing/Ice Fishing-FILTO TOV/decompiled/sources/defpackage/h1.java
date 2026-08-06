package defpackage;

import android.graphics.Path;
import android.graphics.RectF;

/* compiled from: r8-map-id-f07502904ffb6c7cfc104556b013e0e48cd078697d1e7ebb5294e50317be4258 */
/* loaded from: classes.dex */
public final class h1 {
    public final Path GWasM1elztuh;
    public float[] X1lG3V04pd;
    public RectF Yi7zF1RB1;

    public h1(Path path) {
        this.GWasM1elztuh = path;
    }

    public static void GWasM1elztuh(h1 h1Var, h1 h1Var2) {
        h1Var.GWasM1elztuh.addPath(h1Var2.GWasM1elztuh, Float.intBitsToFloat(0), Float.intBitsToFloat(0));
    }

    public static void Yi7zF1RB1(h1 h1Var, sv0 sv0Var) {
        if (h1Var.Yi7zF1RB1 == null) {
            h1Var.Yi7zF1RB1 = new RectF();
        }
        RectF rectF = h1Var.Yi7zF1RB1;
        rectF.getClass();
        float f = sv0Var.GWasM1elztuh;
        long j = sv0Var.encWxUiV2;
        long j2 = sv0Var.AvO7iQsrTN;
        long j3 = sv0Var.EljAMC1QTz;
        long j4 = sv0Var.OOA6hdeuvCS;
        rectF.set(f, sv0Var.Yi7zF1RB1, sv0Var.X1lG3V04pd, sv0Var.xqGvceK5x);
        if (h1Var.X1lG3V04pd == null) {
            h1Var.X1lG3V04pd = new float[8];
        }
        float[] fArr = h1Var.X1lG3V04pd;
        fArr.getClass();
        fArr[0] = Float.intBitsToFloat((int) (j4 >> 32));
        fArr[1] = Float.intBitsToFloat((int) (j4 & 4294967295L));
        fArr[2] = Float.intBitsToFloat((int) (j3 >> 32));
        fArr[3] = Float.intBitsToFloat((int) (j3 & 4294967295L));
        fArr[4] = Float.intBitsToFloat((int) (j2 >> 32));
        fArr[5] = Float.intBitsToFloat((int) (j2 & 4294967295L));
        fArr[6] = Float.intBitsToFloat((int) (j >> 32));
        fArr[7] = Float.intBitsToFloat((int) (j & 4294967295L));
        Path path = h1Var.GWasM1elztuh;
        RectF rectF2 = h1Var.Yi7zF1RB1;
        rectF2.getClass();
        float[] fArr2 = h1Var.X1lG3V04pd;
        fArr2.getClass();
        path.addRoundRect(rectF2, fArr2, Path.Direction.CCW);
    }

    public final void OOA6hdeuvCS() {
        this.GWasM1elztuh.reset();
    }

    public final kt0 X1lG3V04pd() {
        if (this.Yi7zF1RB1 == null) {
            this.Yi7zF1RB1 = new RectF();
        }
        RectF rectF = this.Yi7zF1RB1;
        rectF.getClass();
        this.GWasM1elztuh.computeBounds(rectF, true);
        return new kt0(rectF.left, rectF.top, rectF.right, rectF.bottom);
    }

    public final boolean xqGvceK5x(h1 h1Var, h1 h1Var2, int i) {
        Path.Op op = i == 0 ? Path.Op.DIFFERENCE : i == 1 ? Path.Op.INTERSECT : i == 4 ? Path.Op.REVERSE_DIFFERENCE : i == 2 ? Path.Op.UNION : Path.Op.XOR;
        if (!(h1Var instanceof h1)) {
            throw new UnsupportedOperationException("Unable to obtain android.graphics.Path");
        }
        Path path = h1Var.GWasM1elztuh;
        if (h1Var2 instanceof h1) {
            return this.GWasM1elztuh.op(path, h1Var2.GWasM1elztuh, op);
        }
        throw new UnsupportedOperationException("Unable to obtain android.graphics.Path");
    }
}
