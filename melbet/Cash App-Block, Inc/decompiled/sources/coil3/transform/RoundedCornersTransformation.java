package coil3.transform;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;
import androidx.recyclerview.widget.RecyclerView;
import bo.app.a$$ExternalSyntheticBUOutline0;
import coil3.decode.DecodeUtils;
import coil3.size.Dimension;
import coil3.size.Scale;
import coil3.size.Size;
import coil3.util.BitmapsKt;
import coil3.util.IntPair;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlin.math.MathKt__MathJVMKt;
import org.bouncycastle.asn1.cmc.BodyPartID;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;

/* loaded from: classes3.dex */
public final class RoundedCornersTransformation extends Transformation {
    public final float bottomLeft;
    public final float bottomRight;
    public final String cacheKey;
    public final float topLeft;
    public final float topRight;

    public RoundedCornersTransformation(float f) {
        this.topLeft = f;
        this.topRight = f;
        this.bottomLeft = f;
        this.bottomRight = f;
        if (f < RecyclerView.DECELERATION_RATE || f < RecyclerView.DECELERATION_RATE || f < RecyclerView.DECELERATION_RATE || f < RecyclerView.DECELERATION_RATE) {
            a$$ExternalSyntheticBUOutline0.m$3("All radii must be >= 0.");
            throw null;
        }
        this.cacheKey = Reflection.factory.getOrCreateKotlinClass(RoundedCornersTransformation.class).getQualifiedName() + "-" + f + "," + f + "," + f + "," + f;
    }

    @Override // coil3.transform.Transformation
    public final String getCacheKey() {
        return this.cacheKey;
    }

    @Override // coil3.transform.Transformation
    public final Bitmap transform(Bitmap bitmap, Size size) {
        long m1474constructorimpl;
        Size size2 = Size.ORIGINAL;
        if (Intrinsics.areEqual(size, size2)) {
            m1474constructorimpl = IntPair.m1474constructorimpl(bitmap.getWidth(), bitmap.getHeight());
        } else {
            Dimension dimension = size.width;
            Dimension dimension2 = size.height;
            if ((dimension instanceof Dimension.Pixels) && (dimension2 instanceof Dimension.Pixels)) {
                m1474constructorimpl = IntPair.m1474constructorimpl(((Dimension.Pixels) dimension).px, ((Dimension.Pixels) dimension2).px);
            } else {
                int width = bitmap.getWidth();
                int height = bitmap.getHeight();
                Dimension dimension3 = size.width;
                boolean z = dimension3 instanceof Dimension.Pixels;
                int i = PKIFailureInfo.systemUnavail;
                int i2 = z ? ((Dimension.Pixels) dimension3).px : Integer.MIN_VALUE;
                if (dimension2 instanceof Dimension.Pixels) {
                    i = ((Dimension.Pixels) dimension2).px;
                }
                double computeSizeMultiplier = DecodeUtils.computeSizeMultiplier(width, height, i2, i, Scale.FILL, size2);
                m1474constructorimpl = IntPair.m1474constructorimpl(MathKt__MathJVMKt.roundToInt(bitmap.getWidth() * computeSizeMultiplier), MathKt__MathJVMKt.roundToInt(computeSizeMultiplier * bitmap.getHeight()));
            }
        }
        int i3 = (int) (m1474constructorimpl >> 32);
        int i4 = (int) (m1474constructorimpl & BodyPartID.bodyIdMax);
        Bitmap createBitmap = Bitmap.createBitmap(i3, i4, BitmapsKt.getSafeConfig(bitmap));
        Canvas canvas = new Canvas(createBitmap);
        Paint newScaledShaderPaint = TransformationsKt.newScaledShaderPaint(bitmap, i3, i4);
        float f = this.topLeft;
        float f2 = this.topRight;
        float f3 = this.bottomRight;
        float f4 = this.bottomLeft;
        if (f == f2 && f2 == f4 && f4 == f3) {
            canvas.drawRoundRect(RecyclerView.DECELERATION_RATE, RecyclerView.DECELERATION_RATE, i3, i4, f, f, newScaledShaderPaint);
            return createBitmap;
        }
        float[] fArr = {f, f, f2, f2, f3, f3, f4, f4};
        RectF rectF = new RectF(RecyclerView.DECELERATION_RATE, RecyclerView.DECELERATION_RATE, i3, i4);
        Path path = new Path();
        path.addRoundRect(rectF, fArr, Path.Direction.CW);
        canvas.drawPath(path, newScaledShaderPaint);
        return createBitmap;
    }
}
