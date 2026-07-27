package E3;

import android.graphics.Canvas;
import android.graphics.LinearGradient;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.RectF;
import android.graphics.Shader;

/* loaded from: classes2.dex */
public final class p extends t {

    /* renamed from: c, reason: collision with root package name */
    public final r f812c;

    /* renamed from: d, reason: collision with root package name */
    public final float f813d;

    /* renamed from: e, reason: collision with root package name */
    public final float f814e;

    public p(r rVar, float f3, float f9) {
        this.f812c = rVar;
        this.f813d = f3;
        this.f814e = f9;
    }

    @Override // E3.t
    public final void a(Matrix matrix, D3.a aVar, int i, Canvas canvas) {
        r rVar = this.f812c;
        float f3 = rVar.f823c;
        float f9 = this.f814e;
        float f10 = rVar.f822b;
        float f11 = this.f813d;
        RectF rectF = new RectF(0.0f, 0.0f, (float) Math.hypot(f3 - f9, f10 - f11), 0.0f);
        Matrix matrix2 = this.f826a;
        matrix2.set(matrix);
        matrix2.preTranslate(f11, f9);
        matrix2.preRotate(b());
        aVar.getClass();
        rectF.bottom += i;
        rectF.offset(0.0f, -i);
        int[] iArr = D3.a.i;
        iArr[0] = aVar.f643f;
        iArr[1] = aVar.f642e;
        iArr[2] = aVar.f641d;
        Paint paint = aVar.f640c;
        float f12 = rectF.left;
        paint.setShader(new LinearGradient(f12, rectF.top, f12, rectF.bottom, iArr, D3.a.f635j, Shader.TileMode.CLAMP));
        canvas.save();
        canvas.concat(matrix2);
        canvas.drawRect(rectF, paint);
        canvas.restore();
    }

    public final float b() {
        r rVar = this.f812c;
        return (float) Math.toDegrees(Math.atan((rVar.f823c - this.f814e) / (rVar.f822b - this.f813d)));
    }
}
