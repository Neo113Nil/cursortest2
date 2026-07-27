package C3;

import android.graphics.Canvas;
import android.graphics.LinearGradient;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.RectF;
import android.graphics.Shader;

/* loaded from: classes2.dex */
public final class p extends t {

    /* renamed from: c, reason: collision with root package name */
    public final r f459c;

    /* renamed from: d, reason: collision with root package name */
    public final float f460d;

    /* renamed from: e, reason: collision with root package name */
    public final float f461e;

    public p(r rVar, float f6, float f9) {
        this.f459c = rVar;
        this.f460d = f6;
        this.f461e = f9;
    }

    @Override // C3.t
    public final void a(Matrix matrix, B3.a aVar, int i, Canvas canvas) {
        r rVar = this.f459c;
        float f6 = rVar.f470c;
        float f9 = this.f461e;
        float f10 = rVar.f469b;
        float f11 = this.f460d;
        RectF rectF = new RectF(0.0f, 0.0f, (float) Math.hypot(f6 - f9, f10 - f11), 0.0f);
        Matrix matrix2 = this.f473a;
        matrix2.set(matrix);
        matrix2.preTranslate(f11, f9);
        matrix2.preRotate(b());
        aVar.getClass();
        rectF.bottom += i;
        rectF.offset(0.0f, -i);
        int[] iArr = B3.a.i;
        iArr[0] = aVar.f332f;
        iArr[1] = aVar.f331e;
        iArr[2] = aVar.f330d;
        Paint paint = aVar.f329c;
        float f12 = rectF.left;
        paint.setShader(new LinearGradient(f12, rectF.top, f12, rectF.bottom, iArr, B3.a.f324j, Shader.TileMode.CLAMP));
        canvas.save();
        canvas.concat(matrix2);
        canvas.drawRect(rectF, paint);
        canvas.restore();
    }

    public final float b() {
        r rVar = this.f459c;
        return (float) Math.toDegrees(Math.atan((rVar.f470c - this.f461e) / (rVar.f469b - this.f460d)));
    }
}
