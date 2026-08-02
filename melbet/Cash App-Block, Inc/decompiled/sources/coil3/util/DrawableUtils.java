package coil3.util;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import coil3.decode.DecodeUtils;
import coil3.size.Scale;
import coil3.size.Size;
import com.squareup.cash.clientroutes.ClientRoute;
import java.util.List;
import kotlin.math.MathKt__MathJVMKt;
import org.bouncycastle.asn1.cmc.BodyPartID;

/* loaded from: classes3.dex */
public abstract class DrawableUtils {
    /* JADX WARN: Code restructure failed: missing block: B:11:0x005a, code lost:
    
        if (r2 == 1.0d) goto L16;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static Bitmap convertToBitmap(Drawable drawable, Bitmap.Config config, Size size, Scale scale, Size size2, boolean z) {
        Scale scale2 = scale;
        Size size3 = size2;
        if (drawable instanceof BitmapDrawable) {
            Bitmap bitmap = ((BitmapDrawable) drawable).getBitmap();
            if (bitmap.getConfig() == ((config == null || BitmapsKt.isHardware(config)) ? Bitmap.Config.ARGB_8888 : config)) {
                if (!z) {
                    long m1455computeDstSizesEdh43o = DecodeUtils.m1455computeDstSizesEdh43o(bitmap.getWidth(), bitmap.getHeight(), size, scale2, size3);
                    double computeSizeMultiplier = DecodeUtils.computeSizeMultiplier(bitmap.getWidth(), bitmap.getHeight(), (int) (m1455computeDstSizesEdh43o >> 32), (int) (m1455computeDstSizesEdh43o & BodyPartID.bodyIdMax), scale2, size2);
                    scale2 = scale2;
                    size3 = size2;
                }
                return bitmap;
            }
        }
        Drawable mutate = drawable.mutate();
        int width = Utils_androidKt.getWidth(mutate);
        if (width <= 0) {
            width = 512;
        }
        int height = Utils_androidKt.getHeight(mutate);
        int i = height > 0 ? height : 512;
        long m1455computeDstSizesEdh43o2 = DecodeUtils.m1455computeDstSizesEdh43o(width, i, size, scale2, size3);
        int i2 = i;
        double computeSizeMultiplier2 = DecodeUtils.computeSizeMultiplier(width, i2, (int) (m1455computeDstSizesEdh43o2 >> 32), (int) (m1455computeDstSizesEdh43o2 & BodyPartID.bodyIdMax), scale2, size3);
        int roundToInt = MathKt__MathJVMKt.roundToInt(width * computeSizeMultiplier2);
        int roundToInt2 = MathKt__MathJVMKt.roundToInt(computeSizeMultiplier2 * i2);
        Bitmap createBitmap = Bitmap.createBitmap(roundToInt, roundToInt2, (config == null || BitmapsKt.isHardware(config)) ? Bitmap.Config.ARGB_8888 : config);
        Rect bounds = mutate.getBounds();
        int i3 = bounds.left;
        int i4 = bounds.top;
        int i5 = bounds.right;
        int i6 = bounds.bottom;
        mutate.setBounds(0, 0, roundToInt, roundToInt2);
        mutate.draw(new Canvas(createBitmap));
        mutate.setBounds(i3, i4, i5, i6);
        return createBitmap;
    }

    public static List getDeepLinkSpecs() {
        return ClientRoute.ViewInviteFriends.deepLinkSpecs;
    }
}
