package defpackage;

import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RadialGradient;
import android.graphics.RectF;
import android.graphics.Region;
import android.graphics.Shader;

/* loaded from: classes11.dex */
public final class xhr0 extends air0 {
    public final zhr0 c;

    public xhr0(zhr0 zhr0Var) {
        this.c = zhr0Var;
    }

    @Override // defpackage.air0
    public final void b(Matrix matrix, sgr0 sgr0Var, int i, Canvas canvas) {
        zhr0 zhr0Var = this.c;
        float f = zhr0Var.f;
        float f2 = zhr0Var.g;
        RectF rectF = new RectF(zhr0Var.b, zhr0Var.c, zhr0Var.d, zhr0Var.e);
        Paint paint = sgr0Var.b;
        boolean z = f2 < 0.0f;
        Path path = sgr0Var.g;
        int[] iArr = sgr0.k;
        if (z) {
            iArr[0] = 0;
            iArr[1] = sgr0Var.f;
            iArr[2] = sgr0Var.e;
            iArr[3] = sgr0Var.d;
        } else {
            path.rewind();
            path.moveTo(rectF.centerX(), rectF.centerY());
            path.arcTo(rectF, f, f2);
            path.close();
            float f3 = -i;
            rectF.inset(f3, f3);
            iArr[0] = 0;
            iArr[1] = sgr0Var.d;
            iArr[2] = sgr0Var.e;
            iArr[3] = sgr0Var.f;
        }
        float width = rectF.width() / 2.0f;
        if (width <= 0.0f) {
            return;
        }
        float f4 = 1.0f - (i / width);
        float a = n.a(1.0f, f4, 2.0f, f4);
        float[] fArr = sgr0.l;
        fArr[1] = f4;
        fArr[2] = a;
        paint.setShader(new RadialGradient(rectF.centerX(), rectF.centerY(), width, iArr, fArr, Shader.TileMode.CLAMP));
        canvas.save();
        canvas.concat(matrix);
        canvas.scale(1.0f, rectF.height() / rectF.width());
        if (!z) {
            canvas.clipPath(path, Region.Op.DIFFERENCE);
            canvas.drawPath(path, sgr0Var.h);
        }
        canvas.drawArc(rectF, f, f2, true, paint);
        canvas.restore();
    }
}
