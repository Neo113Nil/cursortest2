package defpackage;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapShader;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Shader;

/* loaded from: classes12.dex */
public final class qxk0 extends mw01 {
    public final Context a;
    public final sfv b;

    public qxk0(Context context, sfv sfvVar) {
        this.a = context;
        this.b = sfvVar;
    }

    @Override // defpackage.mw01
    public final String a() {
        return this.b.d;
    }

    @Override // defpackage.mw01
    public final Bitmap b(Bitmap bitmap, xis0 xis0Var) {
        float f = this.a.getResources().getDisplayMetrics().density;
        sfv sfvVar = this.b;
        float f2 = f * sfvVar.a;
        float f3 = f * sfvVar.c;
        int width = bitmap.getWidth();
        int height = bitmap.getHeight();
        okj okjVar = xis0Var.a;
        int i = okjVar instanceof kkj ? ((kkj) okjVar).a : width;
        okj okjVar2 = xis0Var.b;
        int i2 = okjVar2 instanceof kkj ? ((kkj) okjVar2).a : height;
        float f4 = i;
        float f5 = f2 * 2.0f;
        float f6 = f4 - f5;
        float f7 = i2;
        float f8 = f7 - f5;
        float f9 = width;
        float max = Math.max(f6 / f9, f8 / height);
        int b = m810.b(f9 * max);
        float b2 = (m810.b(r3 * max) - f8) / 2.0f;
        Matrix matrix = new Matrix();
        matrix.postScale(max, max);
        matrix.postTranslate((-((b - f6) / 2.0f)) + f2, (-b2) + f2);
        Bitmap createBitmap = Bitmap.createBitmap(i, i2, bb1.e(bitmap));
        Paint paint = new Paint(3);
        Shader.TileMode tileMode = Shader.TileMode.CLAMP;
        BitmapShader bitmapShader = new BitmapShader(bitmap, tileMode, tileMode);
        bitmapShader.setLocalMatrix(matrix);
        paint.setShader(bitmapShader);
        Canvas canvas = new Canvas(createBitmap);
        float f10 = 1.1f * f2;
        int i3 = sfvVar.b;
        if (((i3 >> 24) & 255) > 0 && f10 > 0.0f) {
            Paint paint2 = new Paint(1);
            paint2.setStrokeWidth(f10);
            paint2.setColor(i3);
            paint2.setStyle(Paint.Style.STROKE);
            float f11 = f2 / 2.0f;
            canvas.drawRoundRect(f11, f11, f4 - f11, f7 - f11, f3, f3, paint2);
        }
        float f12 = f3 * 0.9f;
        canvas.drawRoundRect(f2, f2, f4 - f2, f7 - f2, f12, f12, paint);
        canvas.setBitmap(null);
        return createBitmap;
    }
}
