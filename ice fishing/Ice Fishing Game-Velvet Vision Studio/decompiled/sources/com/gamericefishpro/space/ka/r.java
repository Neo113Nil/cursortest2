package com.gamericefishpro.space.ka;

import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RadialGradient;
import android.graphics.RectF;
import android.graphics.Region;
import android.graphics.Shader;

/* JADX INFO: compiled from: r8-map-id-020a1517951ead57be77a6b773195444ecc812bf491d4c7c9fe6933b01540740 */
/* JADX INFO: loaded from: classes.dex */
public final class r extends w {
    public final t c;

    public r(t tVar) {
        this.c = tVar;
    }

    @Override // com.gamericefishpro.space.ka.w
    public final void a(Matrix matrix, com.gamericefishpro.space.ja.a aVar, int i, Canvas canvas) {
        t tVar = this.c;
        float f = tVar.f;
        float f2 = tVar.g;
        RectF rectF = new RectF(tVar.b, tVar.c, tVar.d, tVar.e);
        Paint paint = aVar.b;
        boolean z = f2 < 0.0f;
        Path path = aVar.g;
        int[] iArr = com.gamericefishpro.space.ja.a.k;
        if (z) {
            iArr[0] = 0;
            iArr[1] = aVar.f;
            iArr[2] = aVar.e;
            iArr[3] = aVar.d;
        } else {
            path.rewind();
            path.moveTo(rectF.centerX(), rectF.centerY());
            path.arcTo(rectF, f, f2);
            path.close();
            float f3 = -i;
            rectF.inset(f3, f3);
            iArr[0] = 0;
            iArr[1] = aVar.d;
            iArr[2] = aVar.e;
            iArr[3] = aVar.f;
        }
        float fWidth = rectF.width() / 2.0f;
        if (fWidth <= 0) {
            return;
        }
        float f4 = 1.0f - (i / fWidth);
        float[] fArr = com.gamericefishpro.space.ja.a.l;
        fArr[1] = f4;
        fArr[2] = ((1.0f - f4) / 2.0f) + f4;
        paint.setShader(new RadialGradient(rectF.centerX(), rectF.centerY(), fWidth, iArr, fArr, Shader.TileMode.CLAMP));
        canvas.save();
        canvas.concat(matrix);
        canvas.scale(1.0f, rectF.height() / rectF.width());
        if (!z) {
            canvas.clipPath(path, Region.Op.DIFFERENCE);
            canvas.drawPath(path, aVar.h);
        }
        canvas.drawArc(rectF, f, f2, true, paint);
        canvas.restore();
    }
}
