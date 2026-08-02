package coil3;

import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import com.squareup.cash.clientroutes.ClientRoute;
import kotlin.collections.EmptyList;

/* loaded from: classes3.dex */
public abstract class Image_androidKt {
    public static final Drawable asDrawable(Image image, Resources resources) {
        return image instanceof DrawableImage ? ((DrawableImage) image).drawable : image instanceof BitmapImage ? new BitmapDrawable(resources, ((BitmapImage) image).bitmap) : new ImageDrawable(image, 0);
    }

    public static final Image asImage(Drawable drawable) {
        return drawable instanceof BitmapDrawable ? new BitmapImage(((BitmapDrawable) drawable).getBitmap()) : new DrawableImage(drawable);
    }

    public static EmptyList getDeepLinkSpecs() {
        return ClientRoute.ViewFullScreenAd.deepLinkSpecs;
    }

    public static final Bitmap toBitmap(Image image, int i, int i2) {
        boolean z = image instanceof BitmapImage;
        Bitmap.Config config = z ? ((BitmapImage) image).bitmap.getConfig() : null;
        if (config == null) {
            config = Bitmap.Config.ARGB_8888;
        }
        if (z) {
            Bitmap bitmap = ((BitmapImage) image).bitmap;
            if (bitmap.getWidth() == i && bitmap.getHeight() == i2 && bitmap.getConfig() == config) {
                return bitmap;
            }
        }
        Bitmap createBitmap = Bitmap.createBitmap(i, i2, config);
        image.draw(new Canvas(createBitmap));
        return createBitmap;
    }
}
