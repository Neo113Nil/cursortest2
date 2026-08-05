package defpackage;

import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RadialGradient;
import android.graphics.RectF;
import android.graphics.Region;
import android.graphics.Shader;

/* compiled from: r8-map-id-3663cbcef52f1a493ceac7deeb6c50e305d4d0c9f83e91180cb6ce540f71d6b5 */
/* loaded from: classes.dex */
public final class x60 extends c70 {
    public final z60 MdtA4re8;

    public x60(z60 z60Var) {
        this.MdtA4re8 = z60Var;
    }

    @Override // defpackage.c70
    public final void qoPGr6Ce(Matrix matrix, q60 q60Var, int i, Canvas canvas) {
        RectF rectF = z60.Qr9iLBAD;
        z60 z60Var = this.MdtA4re8;
        float f = z60Var.P7K7Inc8;
        float f2 = z60Var.b2ZJblxo;
        RectF rectF2 = new RectF(z60Var.NCTxEWno, z60Var.MdtA4re8, z60Var.wxUZMvaN, z60Var.VgvYg0wo);
        Paint paint = q60Var.NCTxEWno;
        boolean z = f2 < 0.0f;
        Path path = q60Var.b2ZJblxo;
        int[] iArr = q60.k3x7lurq;
        if (z) {
            iArr[0] = 0;
            iArr[1] = q60Var.P7K7Inc8;
            iArr[2] = q60Var.VgvYg0wo;
            iArr[3] = q60Var.wxUZMvaN;
        } else {
            path.rewind();
            path.moveTo(rectF2.centerX(), rectF2.centerY());
            path.arcTo(rectF2, f, f2);
            path.close();
            float f3 = -i;
            rectF2.inset(f3, f3);
            iArr[0] = 0;
            iArr[1] = q60Var.wxUZMvaN;
            iArr[2] = q60Var.VgvYg0wo;
            iArr[3] = q60Var.P7K7Inc8;
        }
        float width = rectF2.width() / 2.0f;
        if (width <= 0.0f) {
            return;
        }
        float f4 = 1.0f - (i / width);
        float[] fArr = q60.ow5vqvCr;
        fArr[1] = f4;
        fArr[2] = ((1.0f - f4) / 2.0f) + f4;
        paint.setShader(new RadialGradient(rectF2.centerX(), rectF2.centerY(), width, iArr, fArr, Shader.TileMode.CLAMP));
        canvas.save();
        canvas.concat(matrix);
        canvas.scale(1.0f, rectF2.height() / rectF2.width());
        if (!z) {
            canvas.clipPath(path, Region.Op.DIFFERENCE);
            canvas.drawPath(path, q60Var.Qr9iLBAD);
        }
        canvas.drawArc(rectF2, f, f2, true, paint);
        canvas.restore();
    }
}
