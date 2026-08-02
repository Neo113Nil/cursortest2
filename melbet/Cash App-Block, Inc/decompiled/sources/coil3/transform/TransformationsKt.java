package coil3.transform;

import android.graphics.Bitmap;
import android.graphics.BitmapShader;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Shader;
import coil3.decode.DecodeUtils;
import coil3.size.Scale;
import coil3.size.Size;
import com.squareup.cash.clientroutes.ClientRoute;
import kotlin.collections.EmptyList;

/* loaded from: classes3.dex */
public abstract class TransformationsKt {
    public static EmptyList getDeepLinkSpecs() {
        return ClientRoute.ViewInvestingRoundupsPayments.deepLinkSpecs;
    }

    public static final Paint newScaledShaderPaint(Bitmap bitmap, int i, int i2) {
        Matrix matrix = new Matrix();
        float computeSizeMultiplier = (float) DecodeUtils.computeSizeMultiplier(bitmap.getWidth(), bitmap.getHeight(), i, i2, Scale.FILL, Size.ORIGINAL);
        matrix.setTranslate((i - (bitmap.getWidth() * computeSizeMultiplier)) / 2.0f, (i2 - (bitmap.getHeight() * computeSizeMultiplier)) / 2.0f);
        matrix.preScale(computeSizeMultiplier, computeSizeMultiplier);
        Paint paint = new Paint(3);
        Shader.TileMode tileMode = Shader.TileMode.CLAMP;
        BitmapShader bitmapShader = new BitmapShader(bitmap, tileMode, tileMode);
        bitmapShader.setLocalMatrix(matrix);
        paint.setShader(bitmapShader);
        return paint;
    }
}
