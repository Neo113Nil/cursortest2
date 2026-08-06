package defpackage;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.Region;

/* compiled from: r8-map-id-f07502904ffb6c7cfc104556b013e0e48cd078697d1e7ebb5294e50317be4258 */
/* loaded from: classes.dex */
public final class Jz7YUlEP53 implements s9 {
    public Canvas GWasM1elztuh = ddkiCTz5mZ.GWasM1elztuh;
    public Rect X1lG3V04pd;
    public Rect Yi7zF1RB1;

    @Override // defpackage.s9
    public final void AvO7iQsrTN(float f, float f2) {
        this.GWasM1elztuh.translate(f, f2);
    }

    @Override // defpackage.s9
    public final void E7jCp8Ls() {
        this.GWasM1elztuh.save();
    }

    @Override // defpackage.s9
    public final void EljAMC1QTz(float f, float f2, float f3, float f4, int i) {
        this.GWasM1elztuh.clipRect(f, f2, f3, f4, i == 0 ? Region.Op.DIFFERENCE : Region.Op.INTERSECT);
    }

    @Override // defpackage.s9
    public final void GWasM1elztuh(float f, float f2, float f3, float f4, float f5, a1 a1Var) {
        this.GWasM1elztuh.drawArc(f, f2, f3, f4, f5, 90.0f, false, (Paint) a1Var.Yi7zF1RB1);
    }

    @Override // defpackage.s9
    public final void JFJ3QoxA() {
        this.GWasM1elztuh.restore();
    }

    @Override // defpackage.s9
    public final void Mjvvu5DE(h1 h1Var) {
        Canvas canvas = this.GWasM1elztuh;
        if (!(h1Var instanceof h1)) {
            throw new UnsupportedOperationException("Unable to obtain android.graphics.Path");
        }
        canvas.clipPath(h1Var.GWasM1elztuh, Region.Op.INTERSECT);
    }

    @Override // defpackage.s9
    public final void OOA6hdeuvCS(w0 w0Var, long j, long j2, a1 a1Var) {
        if (this.Yi7zF1RB1 == null) {
            this.Yi7zF1RB1 = new Rect();
            this.X1lG3V04pd = new Rect();
        }
        Canvas canvas = this.GWasM1elztuh;
        if (w0Var == null) {
            throw new UnsupportedOperationException("Unable to obtain android.graphics.Bitmap");
        }
        Bitmap bitmap = w0Var.GWasM1elztuh;
        Rect rect = this.Yi7zF1RB1;
        rect.getClass();
        rect.left = 0;
        rect.top = 0;
        rect.right = (int) (j >> 32);
        rect.bottom = (int) (j & 4294967295L);
        Rect rect2 = this.X1lG3V04pd;
        rect2.getClass();
        rect2.left = 0;
        rect2.top = 0;
        rect2.right = (int) (j2 >> 32);
        rect2.bottom = (int) (j2 & 4294967295L);
        canvas.drawBitmap(bitmap, rect, rect2, (Paint) a1Var.Yi7zF1RB1);
    }

    @Override // defpackage.s9
    public final void WIEu4Ya2g8(float[] fArr) {
        if (n4.uFEq9NpZ(fArr)) {
            return;
        }
        Matrix matrix = new Matrix();
        float f = fArr[0];
        float f2 = fArr[1];
        float f3 = fArr[2];
        float f4 = fArr[3];
        float f5 = fArr[4];
        float f6 = fArr[5];
        float f7 = fArr[6];
        float f8 = fArr[7];
        float f9 = fArr[8];
        float f10 = fArr[12];
        float f11 = fArr[13];
        float f12 = fArr[15];
        fArr[0] = f;
        fArr[1] = f5;
        fArr[2] = f10;
        fArr[3] = f2;
        fArr[4] = f6;
        fArr[5] = f11;
        fArr[6] = f4;
        fArr[7] = f8;
        fArr[8] = f12;
        matrix.setValues(fArr);
        fArr[0] = f;
        fArr[1] = f2;
        fArr[2] = f3;
        fArr[3] = f4;
        fArr[4] = f5;
        fArr[5] = f6;
        fArr[6] = f7;
        fArr[7] = f8;
        fArr[8] = f9;
        this.GWasM1elztuh.concat(matrix);
    }

    @Override // defpackage.s9
    public final void X1lG3V04pd(float f) {
        this.GWasM1elztuh.rotate(f);
    }

    @Override // defpackage.s9
    public final void XnEVoBF0td1l(long j, long j2, a1 a1Var) {
        this.GWasM1elztuh.drawLine(Float.intBitsToFloat((int) (j >> 32)), Float.intBitsToFloat((int) (j & 4294967295L)), Float.intBitsToFloat((int) (j2 >> 32)), Float.intBitsToFloat((int) (j2 & 4294967295L)), (Paint) a1Var.Yi7zF1RB1);
    }

    @Override // defpackage.s9
    public final void Yi7zF1RB1(float f, float f2) {
        this.GWasM1elztuh.scale(f, f2);
    }

    @Override // defpackage.s9
    public final void YmKjaVtbfp5Z() {
        vc0.mE4lRynR(this.GWasM1elztuh, true);
    }

    @Override // defpackage.s9
    public final void encWxUiV2(h1 h1Var, a1 a1Var) {
        Canvas canvas = this.GWasM1elztuh;
        if (!(h1Var instanceof h1)) {
            throw new UnsupportedOperationException("Unable to obtain android.graphics.Path");
        }
        canvas.drawPath(h1Var.GWasM1elztuh, (Paint) a1Var.Yi7zF1RB1);
    }

    @Override // defpackage.s9
    public final void iwATDS1i01k(float f, float f2, float f3, float f4, a1 a1Var) {
        this.GWasM1elztuh.drawRect(f, f2, f3, f4, qj.pog2g9KITJA(a1Var));
    }

    @Override // defpackage.s9
    public final void mOu10nynGul(float f, float f2, float f3, float f4, a1 a1Var) {
        this.GWasM1elztuh.drawOval(f, f2, f3, f4, (Paint) a1Var.Yi7zF1RB1);
    }

    @Override // defpackage.s9
    public final void rQPn8YBR(float f, float f2, float f3, float f4, float f5, float f6, a1 a1Var) {
        this.GWasM1elztuh.drawRoundRect(f, f2, f3, f4, f5, f6, (Paint) a1Var.Yi7zF1RB1);
    }

    @Override // defpackage.s9
    public final void uFEq9NpZ() {
        vc0.mE4lRynR(this.GWasM1elztuh, false);
    }

    @Override // defpackage.s9
    public final void xqGvceK5x(float f, long j, a1 a1Var) {
        this.GWasM1elztuh.drawCircle(Float.intBitsToFloat((int) (j >> 32)), Float.intBitsToFloat((int) (j & 4294967295L)), f, (Paint) a1Var.Yi7zF1RB1);
    }
}
