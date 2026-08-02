package coil3.request;

import android.graphics.Bitmap;
import android.graphics.ColorSpace;
import android.graphics.drawable.Drawable;
import android.widget.ImageView;
import coil3.Extras;
import coil3.ExtrasKt;
import coil3.Image_androidKt;
import coil3.request.ImageRequest;
import coil3.target.ImageViewTarget;
import coil3.transition.Transition;
import coil3.util.Utils_androidKt;

/* loaded from: classes.dex */
public abstract class ImageRequests_androidKt {
    public static final Extras.Key allowHardwareKey;
    public static final Extras.Key allowRgb565Key;
    public static final Extras.Key colorSpaceKey;
    public static final Extras.Key lifecycleKey;
    public static final Extras.Key premultipliedAlphaKey;
    public static final Extras.Key transitionFactoryKey = new Extras.Key(Transition.Factory.NONE);
    public static final Extras.Key bitmapConfigKey = new Extras.Key(Utils_androidKt.DEFAULT_BITMAP_CONFIG);

    static {
        Object obj = null;
        colorSpaceKey = new Extras.Key(obj);
        Boolean bool = Boolean.TRUE;
        premultipliedAlphaKey = new Extras.Key(bool);
        lifecycleKey = new Extras.Key(obj);
        allowHardwareKey = new Extras.Key(bool);
        allowRgb565Key = new Extras.Key(Boolean.FALSE);
    }

    public static final void allowHardware(ImageRequest.Builder builder, boolean z) {
        builder.getExtras().set(allowHardwareKey, Boolean.valueOf(z));
    }

    public static final void error(ImageRequest.Builder builder, Drawable drawable) {
        builder.error(Image_androidKt.asImage(drawable));
    }

    public static final Bitmap.Config getBitmapConfig(Options options) {
        return (Bitmap.Config) ExtrasKt.getExtra(options, bitmapConfigKey);
    }

    public static final ColorSpace getColorSpace(Options options) {
        return (ColorSpace) ExtrasKt.getExtra(options, colorSpaceKey);
    }

    public static final void placeholder(ImageRequest.Builder builder, Drawable drawable) {
        builder.placeholder(drawable != null ? Image_androidKt.asImage(drawable) : null);
    }

    public static final void target(ImageRequest.Builder builder, ImageView imageView) {
        builder.target(new ImageViewTarget(imageView));
    }
}
