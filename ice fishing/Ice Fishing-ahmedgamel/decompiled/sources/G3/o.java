package G3;

import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RadialGradient;
import android.graphics.RectF;
import android.graphics.Region;
import android.graphics.Shader;

/* loaded from: classes2.dex */
public final class o extends t {

    /* renamed from: c, reason: collision with root package name */
    public final q f1153c;

    public o(q qVar) {
        this.f1153c = qVar;
    }

    @Override // G3.t
    public final void a(Matrix matrix, F3.a aVar, int i, Canvas canvas) {
        q qVar = this.f1153c;
        float f2 = qVar.f1162f;
        float f9 = qVar.f1163g;
        RectF rectF = new RectF(qVar.f1158b, qVar.f1159c, qVar.f1160d, qVar.f1161e);
        aVar.getClass();
        boolean z6 = f9 < 0.0f;
        Path path = aVar.f988g;
        int[] iArr = F3.a.f980k;
        if (z6) {
            iArr[0] = 0;
            iArr[1] = aVar.f987f;
            iArr[2] = aVar.f986e;
            iArr[3] = aVar.f985d;
        } else {
            path.rewind();
            path.moveTo(rectF.centerX(), rectF.centerY());
            path.arcTo(rectF, f2, f9);
            path.close();
            float f10 = -i;
            rectF.inset(f10, f10);
            iArr[0] = 0;
            iArr[1] = aVar.f985d;
            iArr[2] = aVar.f986e;
            iArr[3] = aVar.f987f;
        }
        float width = rectF.width() / 2.0f;
        if (width <= 0.0f) {
            return;
        }
        float f11 = 1.0f - (i / width);
        float[] fArr = F3.a.f981l;
        fArr[1] = f11;
        fArr[2] = ((1.0f - f11) / 2.0f) + f11;
        RadialGradient radialGradient = new RadialGradient(rectF.centerX(), rectF.centerY(), width, iArr, fArr, Shader.TileMode.CLAMP);
        Paint paint = aVar.f983b;
        paint.setShader(radialGradient);
        canvas.save();
        canvas.concat(matrix);
        canvas.scale(1.0f, rectF.height() / rectF.width());
        if (!z6) {
            canvas.clipPath(path, Region.Op.DIFFERENCE);
            canvas.drawPath(path, aVar.f989h);
        }
        canvas.drawArc(rectF, f2, f9, true, paint);
        canvas.restore();
    }
}
