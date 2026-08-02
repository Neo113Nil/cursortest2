package coil3.transform;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import coil3.size.Size;
import kotlin.jvm.internal.Reflection;

/* loaded from: classes3.dex */
public final class CircleCropTransformation extends Transformation {
    public final String cacheKey = String.valueOf(Reflection.factory.getOrCreateKotlinClass(CircleCropTransformation.class).getQualifiedName());

    @Override // coil3.transform.Transformation
    public final String getCacheKey() {
        return this.cacheKey;
    }

    @Override // coil3.transform.Transformation
    public final Bitmap transform(Bitmap bitmap, Size size) {
        int min = Math.min(bitmap.getWidth(), bitmap.getHeight());
        Bitmap.Config config = bitmap.getConfig();
        if (config == null) {
            config = Bitmap.Config.ARGB_8888;
        }
        Bitmap createBitmap = Bitmap.createBitmap(min, min, config);
        Canvas canvas = new Canvas(createBitmap);
        Paint newScaledShaderPaint = TransformationsKt.newScaledShaderPaint(bitmap, min, min);
        float f = min / 2.0f;
        canvas.drawCircle(f, f, f, newScaledShaderPaint);
        return createBitmap;
    }
}
