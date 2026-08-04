package com.gamericefishpro.space.ka;

import android.graphics.Canvas;
import android.graphics.LinearGradient;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.RectF;
import android.graphics.Shader;

/* JADX INFO: compiled from: r8-map-id-020a1517951ead57be77a6b773195444ecc812bf491d4c7c9fe6933b01540740 */
/* JADX INFO: loaded from: classes.dex */
public final class s extends w {
    public final u c;
    public final float d;
    public final float e;

    public s(u uVar, float f, float f2) {
        this.c = uVar;
        this.d = f;
        this.e = f2;
    }

    @Override // com.gamericefishpro.space.ka.w
    public final void a(Matrix matrix, com.gamericefishpro.space.ja.a aVar, int i, Canvas canvas) {
        u uVar = this.c;
        float f = uVar.c;
        float f2 = this.e;
        float f3 = uVar.b;
        float f4 = this.d;
        RectF rectF = new RectF(0.0f, 0.0f, (float) Math.hypot(f - f2, f3 - f4), 0.0f);
        Matrix matrix2 = this.a;
        matrix2.set(matrix);
        matrix2.preTranslate(f4, f2);
        matrix2.preRotate(b());
        aVar.getClass();
        rectF.bottom += i;
        rectF.offset(0.0f, -i);
        int i2 = aVar.f;
        int[] iArr = com.gamericefishpro.space.ja.a.i;
        iArr[0] = i2;
        iArr[1] = aVar.e;
        iArr[2] = aVar.d;
        Paint paint = aVar.c;
        float f5 = rectF.left;
        paint.setShader(new LinearGradient(f5, rectF.top, f5, rectF.bottom, iArr, com.gamericefishpro.space.ja.a.j, Shader.TileMode.CLAMP));
        canvas.save();
        canvas.concat(matrix2);
        canvas.drawRect(rectF, paint);
        canvas.restore();
    }

    public final float b() {
        u uVar = this.c;
        return (float) Math.toDegrees(Math.atan((uVar.c - this.e) / (uVar.b - this.d)));
    }
}
