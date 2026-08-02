package defpackage;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapShader;
import android.graphics.Canvas;
import android.graphics.LinearGradient;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.RectF;
import android.graphics.Shader;
import kotlin.Pair;
import kotlin.a;

/* loaded from: classes13.dex */
public final class tcc0 {
    public final Context a;
    public final pwy0 b;
    public final i3y c = a.a(new t9b0(23, this));
    public final i3y d = a.a(new fvb0(16));
    public final i3y e = a.a(new fvb0(17));
    public final i3y f = a.a(new fvb0(18));

    public tcc0(Context context, pwy0 pwy0Var) {
        this.a = context;
        this.b = pwy0Var;
    }

    public static void c(Canvas canvas, Bitmap bitmap, float f, float f2, float f3) {
        Matrix matrix;
        RectF rectF = new RectF(f2, f3, f2 + f, f3 + f);
        float min = Math.min(rectF.width() / bitmap.getWidth(), rectF.height() / bitmap.getHeight());
        if (min >= 1.0f) {
            matrix = new Matrix();
            matrix.postTranslate(n.a(f, bitmap.getWidth(), 2.0f, rectF.left), n.a(f, bitmap.getHeight(), 2.0f, rectF.top));
        } else {
            Matrix matrix2 = new Matrix();
            matrix2.postScale(min, min);
            matrix2.postTranslate(((rectF.width() - (bitmap.getWidth() * min)) / 2.0f) + rectF.left, ((rectF.height() - (bitmap.getHeight() * min)) / 2.0f) + rectF.top);
            matrix = matrix2;
        }
        canvas.drawBitmap(bitmap, matrix, new Paint(1));
    }

    public static scc0 d(int i, int i2, int i3, int i4, int i5) {
        return new scc0(Math.max(i, i3), i2 + i4, (r1 - i) / 2.0f, (r1 - i3) / 2.0f, i2 - y6i0.d(i5, 0, i2));
    }

    public final Bitmap a(zwy0 zwy0Var, int i, int i2, int i3, int i4, int i5, zwy0 zwy0Var2, int i6, boolean z, Integer num, Integer num2) {
        i3y i3yVar;
        int i7 = i3 * 2;
        int i8 = i + i7;
        Bitmap createBitmap = Bitmap.createBitmap(i8, i7 + i2, Bitmap.Config.ARGB_8888);
        Canvas canvas = new Canvas(createBitmap);
        pwy0 pwy0Var = this.b;
        Bitmap a = zwy0Var.a(pwy0Var.getThemeType());
        float f = i3;
        float f2 = i5;
        float f3 = i;
        float f4 = i2;
        float max = Math.max(f3 / a.getWidth(), f4 / a.getHeight());
        float width = a.getWidth() * max;
        float height = a.getHeight() * max;
        Pair pair = new Pair(Float.valueOf(f), Float.valueOf(f));
        float floatValue = ((Number) pair.getFirst()).floatValue();
        float floatValue2 = ((Number) pair.getSecond()).floatValue();
        Paint paint = new Paint(1);
        Shader.TileMode tileMode = Shader.TileMode.CLAMP;
        BitmapShader bitmapShader = new BitmapShader(a, tileMode, tileMode);
        Matrix matrix = new Matrix();
        matrix.setScale(max, max);
        matrix.postTranslate(n.a(f3, width, 2.0f, floatValue), n.a(f4, height, 2.0f, floatValue2));
        bitmapShader.setLocalMatrix(matrix);
        paint.setShader(bitmapShader);
        RectF rectF = new RectF(floatValue, floatValue2, f3 + floatValue, f4 + floatValue2);
        i3y i3yVar2 = this.d;
        Paint paint2 = (Paint) i3yVar2.getValue();
        int i9 = xng0.bgMain;
        Context context = this.a;
        paint2.setColor(qje.t(i9, context));
        paint2.setShadowLayer(5.47f, 0.0f, 2.19f, context.getColor(mqg0.black_alpha10));
        i3y i3yVar3 = this.f;
        ((Paint) i3yVar3.getValue()).setColor(qje.u(context.getTheme(), xng0.bgMinor));
        if (i4 > 0) {
            if (num == null || num2 == null) {
                i3yVar = i3yVar2;
            } else {
                float f5 = i4;
                i3yVar = i3yVar2;
                RectF rectF2 = new RectF(rectF.left - f5, rectF.top - f5, rectF.right + f5, rectF.bottom + f5);
                int intValue = num.intValue();
                int intValue2 = num2.intValue();
                i3y i3yVar4 = this.e;
                Paint paint3 = (Paint) i3yVar4.getValue();
                paint3.setShader(new LinearGradient(rectF.right, rectF.centerY(), rectF.left, rectF.centerY(), intValue, intValue2, tileMode));
                paint3.setShadowLayer(5.47f, 0.0f, 2.19f, context.getColor(mqg0.black_alpha10));
                ((Paint) i3yVar4.getValue()).setStrokeWidth(f5 * 2.0f);
                float f6 = f5 + f2;
                canvas.drawRoundRect(rectF2, f6, f6, (Paint) i3yVar4.getValue());
            }
            ((Paint) i3yVar.getValue()).setStrokeWidth(i4 * 2.0f);
            canvas.drawRoundRect(rectF, f2, f2, (Paint) i3yVar.getValue());
        }
        if (z) {
            canvas.drawRoundRect(rectF, f2, f2, (Paint) i3yVar3.getValue());
        }
        canvas.drawRoundRect(rectF, f2, f2, paint);
        if (zwy0Var2 != null && i6 > 0) {
            float f7 = i6;
            c(canvas, zwy0Var2.a(pwy0Var.getThemeType()), f7, i8 - f7, 0.0f);
        }
        return createBitmap;
    }
}
