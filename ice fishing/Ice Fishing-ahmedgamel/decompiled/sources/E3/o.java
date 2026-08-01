package E3;

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
    public final q f811c;

    public o(q qVar) {
        this.f811c = qVar;
    }

    @Override // E3.t
    public final void a(Matrix matrix, D3.a aVar, int i, Canvas canvas) {
        q qVar = this.f811c;
        float f3 = qVar.f820f;
        float f9 = qVar.f821g;
        RectF rectF = new RectF(qVar.f816b, qVar.f817c, qVar.f818d, qVar.f819e);
        aVar.getClass();
        boolean z3 = f9 < 0.0f;
        Path path = aVar.f644g;
        int[] iArr = D3.a.f636k;
        if (z3) {
            iArr[0] = 0;
            iArr[1] = aVar.f643f;
            iArr[2] = aVar.f642e;
            iArr[3] = aVar.f641d;
        } else {
            path.rewind();
            path.moveTo(rectF.centerX(), rectF.centerY());
            path.arcTo(rectF, f3, f9);
            path.close();
            float f10 = -i;
            rectF.inset(f10, f10);
            iArr[0] = 0;
            iArr[1] = aVar.f641d;
            iArr[2] = aVar.f642e;
            iArr[3] = aVar.f643f;
        }
        float width = rectF.width() / 2.0f;
        if (width <= 0.0f) {
            return;
        }
        float f11 = 1.0f - (i / width);
        float[] fArr = D3.a.f637l;
        fArr[1] = f11;
        fArr[2] = ((1.0f - f11) / 2.0f) + f11;
        RadialGradient radialGradient = new RadialGradient(rectF.centerX(), rectF.centerY(), width, iArr, fArr, Shader.TileMode.CLAMP);
        Paint paint = aVar.f639b;
        paint.setShader(radialGradient);
        canvas.save();
        canvas.concat(matrix);
        canvas.scale(1.0f, rectF.height() / rectF.width());
        if (!z3) {
            canvas.clipPath(path, Region.Op.DIFFERENCE);
            canvas.drawPath(path, aVar.f645h);
        }
        canvas.drawArc(rectF, f3, f9, true, paint);
        canvas.restore();
    }
}
