package defpackage;

import android.graphics.Canvas;
import android.graphics.LinearGradient;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.RectF;
import android.graphics.Shader;

/* compiled from: r8-map-id-3663cbcef52f1a493ceac7deeb6c50e305d4d0c9f83e91180cb6ce540f71d6b5 */
/* loaded from: classes.dex */
public final class y60 extends c70 {
    public final a70 MdtA4re8;
    public final float VgvYg0wo;
    public final float wxUZMvaN;

    public y60(a70 a70Var, float f, float f2) {
        this.MdtA4re8 = a70Var;
        this.wxUZMvaN = f;
        this.VgvYg0wo = f2;
    }

    public final float NCTxEWno() {
        a70 a70Var = this.MdtA4re8;
        return (float) Math.toDegrees(Math.atan((a70Var.MdtA4re8 - this.VgvYg0wo) / (a70Var.NCTxEWno - this.wxUZMvaN)));
    }

    @Override // defpackage.c70
    public final void qoPGr6Ce(Matrix matrix, q60 q60Var, int i, Canvas canvas) {
        a70 a70Var = this.MdtA4re8;
        float f = a70Var.MdtA4re8;
        float f2 = this.VgvYg0wo;
        float f3 = a70Var.NCTxEWno;
        float f4 = this.wxUZMvaN;
        RectF rectF = new RectF(0.0f, 0.0f, (float) Math.hypot(f - f2, f3 - f4), 0.0f);
        Matrix matrix2 = this.qoPGr6Ce;
        matrix2.set(matrix);
        matrix2.preTranslate(f4, f2);
        matrix2.preRotate(NCTxEWno());
        q60Var.getClass();
        rectF.bottom += i;
        rectF.offset(0.0f, -i);
        int i2 = q60Var.P7K7Inc8;
        int[] iArr = q60.jb9XjC4I;
        iArr[0] = i2;
        iArr[1] = q60Var.VgvYg0wo;
        iArr[2] = q60Var.wxUZMvaN;
        Paint paint = q60Var.MdtA4re8;
        float f5 = rectF.left;
        paint.setShader(new LinearGradient(f5, rectF.top, f5, rectF.bottom, iArr, q60.eVhOlqcC, Shader.TileMode.CLAMP));
        canvas.save();
        canvas.concat(matrix2);
        canvas.drawRect(rectF, paint);
        canvas.restore();
    }
}
