package androidx.compose.ui.graphics;

import android.graphics.Bitmap;

/* loaded from: classes.dex */
public final class AndroidImageBitmap {
    public final Bitmap bitmap;

    public AndroidImageBitmap(Bitmap bitmap) {
        this.bitmap = bitmap;
    }

    /* renamed from: getConfig-_sVssgQ, reason: not valid java name */
    public final int m655getConfig_sVssgQ() {
        Bitmap.Config config = this.bitmap.getConfig();
        config.getClass();
        if (config == Bitmap.Config.ALPHA_8) {
            return 1;
        }
        if (config == Bitmap.Config.RGB_565) {
            return 2;
        }
        if (config == Bitmap.Config.ARGB_4444) {
            return 0;
        }
        if (config == Bitmap.Config.RGBA_F16) {
            return 3;
        }
        return config == Bitmap.Config.HARDWARE ? 4 : 0;
    }
}
