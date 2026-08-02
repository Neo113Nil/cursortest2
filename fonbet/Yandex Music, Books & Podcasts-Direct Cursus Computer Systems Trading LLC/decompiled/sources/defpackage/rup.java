package defpackage;

import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RadialGradient;
import android.graphics.RectF;
import android.graphics.Region;
import android.graphics.Shader;

/* loaded from: classes3.dex */
public final class rup extends wup {
    public final tup c;

    public rup(tup tupVar) {
        this.c = tupVar;
    }

    @Override // defpackage.wup
    public final void a(Matrix matrix, stp stpVar, int i, Canvas canvas) {
        float f;
        tup tupVar = this.c;
        float f2 = tupVar.f;
        float f3 = tupVar.g;
        RectF rectF = new RectF(tupVar.b, tupVar.c, tupVar.d, tupVar.e);
        Paint paint = stpVar.b;
        boolean z = f3 < 0.0f;
        Path path = stpVar.g;
        int[] iArr = stp.k;
        if (z) {
            iArr[0] = 0;
            iArr[1] = stpVar.f;
            iArr[2] = stpVar.e;
            iArr[3] = stpVar.d;
            f = 0.0f;
        } else {
            path.rewind();
            f = 0.0f;
            path.moveTo(rectF.centerX(), rectF.centerY());
            path.arcTo(rectF, f2, f3);
            path.close();
            float f4 = -i;
            rectF.inset(f4, f4);
            iArr[0] = 0;
            iArr[1] = stpVar.d;
            iArr[2] = stpVar.e;
            iArr[3] = stpVar.f;
        }
        float width = rectF.width() / 2.0f;
        if (width <= f) {
            return;
        }
        float f5 = 1.0f - (i / width);
        float[] fArr = stp.l;
        fArr[1] = f5;
        fArr[2] = ((1.0f - f5) / 2.0f) + f5;
        paint.setShader(new RadialGradient(rectF.centerX(), rectF.centerY(), width, iArr, fArr, Shader.TileMode.CLAMP));
        canvas.save();
        canvas.concat(matrix);
        canvas.scale(1.0f, rectF.height() / rectF.width());
        if (!z) {
            canvas.clipPath(path, Region.Op.DIFFERENCE);
            canvas.drawPath(path, stpVar.h);
        }
        canvas.drawArc(rectF, f2, f3, true, paint);
        canvas.restore();
    }
}
