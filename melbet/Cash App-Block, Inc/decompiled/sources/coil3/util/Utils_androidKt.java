package coil3.util;

import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.widget.ImageView;

/* loaded from: classes.dex */
public abstract class Utils_androidKt {
    public static final Bitmap.Config[] VALID_TRANSFORMATION_CONFIGS = {Bitmap.Config.ARGB_8888, Bitmap.Config.RGBA_F16};
    public static final Bitmap.Config DEFAULT_BITMAP_CONFIG = Bitmap.Config.HARDWARE;

    /* loaded from: classes3.dex */
    public abstract /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$1;

        static {
            int[] iArr = new int[Logger$Level.values().length];
            try {
                Logger$Level[] logger$LevelArr = Logger$Level.$VALUES;
                iArr[0] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                Logger$Level[] logger$LevelArr2 = Logger$Level.$VALUES;
                iArr[1] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                Logger$Level[] logger$LevelArr3 = Logger$Level.$VALUES;
                iArr[2] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                Logger$Level[] logger$LevelArr4 = Logger$Level.$VALUES;
                iArr[3] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                Logger$Level[] logger$LevelArr5 = Logger$Level.$VALUES;
                iArr[4] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            int[] iArr2 = new int[ImageView.ScaleType.values().length];
            try {
                iArr2[ImageView.ScaleType.FIT_START.ordinal()] = 1;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr2[ImageView.ScaleType.FIT_CENTER.ordinal()] = 2;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                iArr2[ImageView.ScaleType.FIT_END.ordinal()] = 3;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                iArr2[ImageView.ScaleType.CENTER_INSIDE.ordinal()] = 4;
            } catch (NoSuchFieldError unused9) {
            }
            $EnumSwitchMapping$1 = iArr2;
        }
    }

    public static final int getHeight(Drawable drawable) {
        Bitmap bitmap;
        BitmapDrawable bitmapDrawable = drawable instanceof BitmapDrawable ? (BitmapDrawable) drawable : null;
        return (bitmapDrawable == null || (bitmap = bitmapDrawable.getBitmap()) == null) ? drawable.getIntrinsicHeight() : bitmap.getHeight();
    }

    public static final int getWidth(Drawable drawable) {
        Bitmap bitmap;
        BitmapDrawable bitmapDrawable = drawable instanceof BitmapDrawable ? (BitmapDrawable) drawable : null;
        return (bitmapDrawable == null || (bitmap = bitmapDrawable.getBitmap()) == null) ? drawable.getIntrinsicWidth() : bitmap.getWidth();
    }
}
