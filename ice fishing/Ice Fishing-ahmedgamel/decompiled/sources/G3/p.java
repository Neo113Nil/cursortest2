package G3;

import android.graphics.Canvas;
import android.graphics.LinearGradient;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.RectF;
import android.graphics.Shader;

/* loaded from: classes2.dex */
public final class p extends t {

    /* renamed from: c, reason: collision with root package name */
    public final r f1154c;

    /* renamed from: d, reason: collision with root package name */
    public final float f1155d;

    /* renamed from: e, reason: collision with root package name */
    public final float f1156e;

    public p(r rVar, float f2, float f9) {
        this.f1154c = rVar;
        this.f1155d = f2;
        this.f1156e = f9;
    }

    @Override // G3.t
    public final void a(Matrix matrix, F3.a aVar, int i, Canvas canvas) {
        r rVar = this.f1154c;
        float f2 = rVar.f1165c;
        float f9 = this.f1156e;
        float f10 = rVar.f1164b;
        float f11 = this.f1155d;
        RectF rectF = new RectF(0.0f, 0.0f, (float) Math.hypot(f2 - f9, f10 - f11), 0.0f);
        Matrix matrix2 = this.f1168a;
        matrix2.set(matrix);
        matrix2.preTranslate(f11, f9);
        matrix2.preRotate(b());
        aVar.getClass();
        rectF.bottom += i;
        rectF.offset(0.0f, -i);
        int[] iArr = F3.a.i;
        iArr[0] = aVar.f987f;
        iArr[1] = aVar.f986e;
        iArr[2] = aVar.f985d;
        Paint paint = aVar.f984c;
        float f12 = rectF.left;
        paint.setShader(new LinearGradient(f12, rectF.top, f12, rectF.bottom, iArr, F3.a.f979j, Shader.TileMode.CLAMP));
        canvas.save();
        canvas.concat(matrix2);
        canvas.drawRect(rectF, paint);
        canvas.restore();
    }

    public final float b() {
        r rVar = this.f1154c;
        return (float) Math.toDegrees(Math.atan((rVar.f1165c - this.f1156e) / (rVar.f1164b - this.f1155d)));
    }
}
