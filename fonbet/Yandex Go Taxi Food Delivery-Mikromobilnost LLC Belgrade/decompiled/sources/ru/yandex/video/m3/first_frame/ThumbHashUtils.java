package ru.yandex.video.m3.first_frame;

import android.graphics.Bitmap;
import android.util.Base64;
import defpackage.evu0;
import defpackage.h5z0;
import kotlin.Metadata;
import ru.yandex.video.m3.first_frame.ThumbHash;

@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\bÇ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0010\u0010\u0003\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0005\u001a\u00020\u0006J \u0010\u0007\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\t¨\u0006\u000b"}, d2 = {"Lru/yandex/video/m3/first_frame/ThumbHashUtils;", "", "()V", "makeBlurredBitmap", "Landroid/graphics/Bitmap;", "thumbHash", "", "makeScaledBlurredBitmap", "widthRatio", "", "heightRatio", "video-player_internalRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class ThumbHashUtils {
    public static final int $stable = 0;
    public static final ThumbHashUtils INSTANCE = new ThumbHashUtils();

    private ThumbHashUtils() {
    }

    public final Bitmap makeBlurredBitmap(String thumbHash) {
        int i;
        try {
            byte[] decode = Base64.decode(thumbHash, 0);
            if (decode == null) {
                return null;
            }
            try {
                ThumbHash.Image thumbHashToARGB = ThumbHash.thumbHashToARGB(decode);
                int i2 = thumbHashToARGB.height;
                if (i2 > 0 && (i = thumbHashToARGB.width) > 0) {
                    int[] iArr = thumbHashToARGB.argb;
                    if (iArr.length == i * i2) {
                        return Bitmap.createBitmap(iArr, i, i2, Bitmap.Config.ARGB_8888);
                    }
                }
                return null;
            } catch (IndexOutOfBoundsException e) {
                h5z0.a.e(e);
                return null;
            }
        } catch (IllegalArgumentException e2) {
            h5z0.a.e(e2);
            return null;
        }
    }

    public final Bitmap makeScaledBlurredBitmap(String thumbHash, int widthRatio, int heightRatio) {
        Bitmap makeBlurredBitmap;
        if (evu0.J(thumbHash) || (makeBlurredBitmap = makeBlurredBitmap(thumbHash)) == null) {
            return null;
        }
        int width = makeBlurredBitmap.getWidth();
        int height = makeBlurredBitmap.getHeight();
        if (width * heightRatio == height * widthRatio) {
            return makeBlurredBitmap;
        }
        int max = Math.max(((width + widthRatio) - 1) / widthRatio, ((height + heightRatio) - 1) / heightRatio);
        if (max < 1) {
            max = 1;
        }
        Bitmap createScaledBitmap = Bitmap.createScaledBitmap(makeBlurredBitmap, widthRatio * max, heightRatio * max, true);
        makeBlurredBitmap.recycle();
        return createScaledBitmap;
    }
}
