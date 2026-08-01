package S0;

import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RadialGradient;
import android.graphics.RectF;
import android.graphics.Region;
import android.graphics.Shader;
import androidx.recyclerview.widget.RecyclerView;

/* loaded from: classes.dex */
public final class o extends t {

    /* renamed from: c, reason: collision with root package name */
    public final q f1126c;

    public o(q qVar) {
        this.f1126c = qVar;
    }

    @Override // S0.t
    public final void a(Matrix matrix, R0.a aVar, int i, Canvas canvas) {
        q qVar = this.f1126c;
        float f2 = qVar.f1133f;
        float f3 = qVar.f1134g;
        RectF rectF = new RectF(qVar.f1130b, qVar.f1131c, qVar.f1132d, qVar.e);
        aVar.getClass();
        boolean z2 = f3 < RecyclerView.f2111C0;
        Path path = aVar.f1017g;
        int[] iArr = R0.a.f1010k;
        if (z2) {
            iArr[0] = 0;
            iArr[1] = aVar.f1016f;
            iArr[2] = aVar.e;
            iArr[3] = aVar.f1015d;
        } else {
            path.rewind();
            path.moveTo(rectF.centerX(), rectF.centerY());
            path.arcTo(rectF, f2, f3);
            path.close();
            float f4 = -i;
            rectF.inset(f4, f4);
            iArr[0] = 0;
            iArr[1] = aVar.f1015d;
            iArr[2] = aVar.e;
            iArr[3] = aVar.f1016f;
        }
        float width = rectF.width() / 2.0f;
        if (width <= RecyclerView.f2111C0) {
            return;
        }
        float f5 = 1.0f - (i / width);
        float[] fArr = R0.a.f1011l;
        fArr[1] = f5;
        fArr[2] = ((1.0f - f5) / 2.0f) + f5;
        RadialGradient radialGradient = new RadialGradient(rectF.centerX(), rectF.centerY(), width, iArr, fArr, Shader.TileMode.CLAMP);
        Paint paint = aVar.f1013b;
        paint.setShader(radialGradient);
        canvas.save();
        canvas.concat(matrix);
        canvas.scale(1.0f, rectF.height() / rectF.width());
        if (!z2) {
            canvas.clipPath(path, Region.Op.DIFFERENCE);
            canvas.drawPath(path, aVar.f1018h);
        }
        canvas.drawArc(rectF, f2, f3, true, paint);
        canvas.restore();
    }
}
