package defpackage;

import android.graphics.Canvas;
import android.graphics.LinearGradient;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.RectF;
import android.graphics.Shader;
import defpackage.bir0;

/* loaded from: classes11.dex */
public final class yhr0 extends air0 {
    public final bir0.a c;
    public final float d;
    public final float e;

    public yhr0(bir0.a aVar, float f, float f2) {
        this.c = aVar;
        this.d = f;
        this.e = f2;
    }

    @Override // defpackage.air0
    public final void b(Matrix matrix, sgr0 sgr0Var, int i, Canvas canvas) {
        bir0.a aVar = this.c;
        float f = aVar.c;
        float f2 = this.e;
        float f3 = aVar.b;
        float f4 = this.d;
        RectF rectF = new RectF(0.0f, 0.0f, (float) Math.hypot(f - f2, f3 - f4), 0.0f);
        Matrix matrix2 = this.a;
        matrix2.set(matrix);
        matrix2.preTranslate(f4, f2);
        matrix2.preRotate(c());
        sgr0Var.getClass();
        rectF.bottom += i;
        rectF.offset(0.0f, -i);
        int i2 = sgr0Var.f;
        int[] iArr = sgr0.i;
        iArr[0] = i2;
        iArr[1] = sgr0Var.e;
        iArr[2] = sgr0Var.d;
        Paint paint = sgr0Var.c;
        float f5 = rectF.left;
        paint.setShader(new LinearGradient(f5, rectF.top, f5, rectF.bottom, iArr, sgr0.j, Shader.TileMode.CLAMP));
        canvas.save();
        canvas.concat(matrix2);
        canvas.drawRect(rectF, paint);
        canvas.restore();
    }

    public final float c() {
        bir0.a aVar = this.c;
        return (float) Math.toDegrees(Math.atan((aVar.c - this.e) / (aVar.b - this.d)));
    }
}
