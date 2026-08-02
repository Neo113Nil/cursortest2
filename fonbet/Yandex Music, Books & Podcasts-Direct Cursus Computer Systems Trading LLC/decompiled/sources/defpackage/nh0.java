package defpackage;

import android.graphics.Matrix;
import android.graphics.Path;
import android.graphics.RectF;

/* loaded from: classes.dex */
public final class nh0 implements eak {
    public final Path a;
    public RectF b;
    public float[] c;
    public Matrix d;

    public nh0(Path path) {
        this.a = path;
    }

    public final void b() {
        this.a.close();
    }

    public final void c(float f, float f2, float f3, float f4, float f5, float f6) {
        this.a.cubicTo(f, f2, f3, f4, f5, f6);
    }

    public final ynn d() {
        if (this.b == null) {
            this.b = new RectF();
        }
        RectF rectF = this.b;
        rectF.getClass();
        this.a.computeBounds(rectF, true);
        return new ynn(rectF.left, rectF.top, rectF.right, rectF.bottom);
    }

    public final void e(float f, float f2) {
        this.a.lineTo(f, f2);
    }

    public final void f(float f, float f2) {
        this.a.moveTo(f, f2);
    }

    public final boolean g(eak eakVar, eak eakVar2, int i) {
        Path.Op op = i == 0 ? Path.Op.DIFFERENCE : i == 1 ? Path.Op.INTERSECT : i == 4 ? Path.Op.REVERSE_DIFFERENCE : i == 2 ? Path.Op.UNION : Path.Op.XOR;
        if (!(eakVar instanceof nh0)) {
            qq6.d("Unable to obtain android.graphics.Path");
            return false;
        }
        Path path = ((nh0) eakVar).a;
        if (eakVar2 instanceof nh0) {
            return this.a.op(path, ((nh0) eakVar2).a, op);
        }
        qq6.d("Unable to obtain android.graphics.Path");
        return false;
    }

    public final void h() {
        this.a.reset();
    }

    public final void i(int i) {
        this.a.setFillType(i == 1 ? Path.FillType.EVEN_ODD : Path.FillType.WINDING);
    }

    public final void j(long j) {
        Matrix matrix = this.d;
        if (matrix == null) {
            this.d = new Matrix();
        } else {
            matrix.reset();
        }
        Matrix matrix2 = this.d;
        matrix2.getClass();
        matrix2.setTranslate(Float.intBitsToFloat((int) (j >> 32)), Float.intBitsToFloat((int) (j & 4294967295L)));
        Matrix matrix3 = this.d;
        matrix3.getClass();
        this.a.transform(matrix3);
    }
}
