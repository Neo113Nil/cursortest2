package S0;

import android.graphics.Canvas;
import android.graphics.LinearGradient;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.RectF;
import android.graphics.Shader;
import androidx.recyclerview.widget.RecyclerView;

/* loaded from: classes.dex */
public final class p extends t {

    /* renamed from: c, reason: collision with root package name */
    public final r f1127c;

    /* renamed from: d, reason: collision with root package name */
    public final float f1128d;
    public final float e;

    public p(r rVar, float f2, float f3) {
        this.f1127c = rVar;
        this.f1128d = f2;
        this.e = f3;
    }

    @Override // S0.t
    public final void a(Matrix matrix, R0.a aVar, int i, Canvas canvas) {
        r rVar = this.f1127c;
        float f2 = rVar.f1136c;
        float f3 = this.e;
        float f4 = rVar.f1135b;
        float f5 = this.f1128d;
        RectF rectF = new RectF(RecyclerView.f2111C0, RecyclerView.f2111C0, (float) Math.hypot(f2 - f3, f4 - f5), RecyclerView.f2111C0);
        Matrix matrix2 = this.f1139a;
        matrix2.set(matrix);
        matrix2.preTranslate(f5, f3);
        matrix2.preRotate(b());
        aVar.getClass();
        rectF.bottom += i;
        rectF.offset(RecyclerView.f2111C0, -i);
        int[] iArr = R0.a.i;
        iArr[0] = aVar.f1016f;
        iArr[1] = aVar.e;
        iArr[2] = aVar.f1015d;
        Paint paint = aVar.f1014c;
        float f6 = rectF.left;
        paint.setShader(new LinearGradient(f6, rectF.top, f6, rectF.bottom, iArr, R0.a.j, Shader.TileMode.CLAMP));
        canvas.save();
        canvas.concat(matrix2);
        canvas.drawRect(rectF, paint);
        canvas.restore();
    }

    public final float b() {
        r rVar = this.f1127c;
        return (float) Math.toDegrees(Math.atan((rVar.f1136c - this.e) / (rVar.f1135b - this.f1128d)));
    }
}
