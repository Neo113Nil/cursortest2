package defpackage;

import android.graphics.Bitmap;
import android.graphics.BlurMaskFilter;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;
import android.os.Build;
import io.appmetrica.analytics.coreutils.internal.StringUtils;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final class i83 implements e7t {
    public final /* synthetic */ int a;
    public final String b;

    public i83(int i) {
        this.a = i;
        switch (i) {
            case 1:
                this.b = "BlurTransformationWithSmoothEdges:22:5";
                break;
            default:
                this.b = f1d.e(16, 4, "BlurTransformation:", StringUtils.PROCESS_POSTFIX_DELIMITER);
                break;
        }
    }

    @Override // defpackage.e7t
    public final String a() {
        switch (this.a) {
        }
        return this.b;
    }

    @Override // defpackage.e7t
    public final Bitmap b(Bitmap bitmap) {
        switch (this.a) {
            case 0:
                Bitmap createBitmap = Bitmap.createBitmap(bitmap.getWidth() / 4, bitmap.getHeight() / 4, Bitmap.Config.ARGB_8888);
                Canvas canvas = new Canvas(createBitmap);
                float f = 1 / 4;
                canvas.scale(f, f);
                Paint paint = new Paint();
                paint.setFlags(2);
                canvas.drawBitmap(bitmap, 0.0f, 0.0f, paint);
                l48 l48Var = l48.d;
                createBitmap.getClass();
                float f2 = 16;
                try {
                    return (Build.VERSION.SDK_INT >= 31 ? c83.a : l48Var).g(createBitmap, f2);
                } catch (Throwable th) {
                    ssg.a(5, null, "blur()", th);
                    l48Var.g(createBitmap, f2);
                    return createBitmap;
                }
            default:
                int width = bitmap.getWidth();
                int height = bitmap.getHeight();
                float f3 = 5;
                int ceil = ((int) Math.ceil(width / f3)) + 52;
                int ceil2 = 52 + ((int) Math.ceil(height / f3));
                Bitmap.Config config = bitmap.getConfig();
                if (config == null) {
                    config = Bitmap.Config.ARGB_8888;
                }
                Bitmap createBitmap2 = Bitmap.createBitmap(ceil, ceil2, config);
                createBitmap2.getClass();
                Canvas canvas2 = new Canvas(createBitmap2);
                float f4 = 22;
                float f5 = 4 + f4;
                canvas2.translate(f5, f5);
                float f6 = 1 / f3;
                canvas2.scale(f6, f6);
                Paint paint2 = new Paint();
                paint2.setFlags(2);
                int i = Build.VERSION.SDK_INT;
                if (i >= 31) {
                    canvas2.drawBitmap(bitmap, 0.0f, 0.0f, paint2);
                    if (i >= 31) {
                        return createBitmap2;
                    }
                    l48 l48Var2 = l48.d;
                    try {
                        return (i >= 31 ? c83.a : l48Var2).g(createBitmap2, f4);
                    } catch (Throwable th2) {
                        ssg.a(5, null, "blur()", th2);
                        l48Var2.g(createBitmap2, f4);
                        return createBitmap2;
                    }
                }
                paint2.setMaskFilter(new BlurMaskFilter(f4 * f3, BlurMaskFilter.Blur.NORMAL));
                Bitmap createScaledBitmap = Bitmap.createScaledBitmap(bitmap, 2, 2, true);
                if (i <= 25) {
                    Bitmap createScaledBitmap2 = Bitmap.createScaledBitmap(createScaledBitmap, bitmap.getWidth(), bitmap.getHeight(), true);
                    if (!Intrinsics.d(createScaledBitmap2, createScaledBitmap)) {
                        createScaledBitmap.recycle();
                    }
                    createScaledBitmap = createScaledBitmap2;
                }
                canvas2.drawBitmap(createScaledBitmap, (Rect) null, new RectF(0.0f, 0.0f, bitmap.getWidth(), bitmap.getHeight()), paint2);
                createScaledBitmap.recycle();
                return createBitmap2;
        }
    }
}
