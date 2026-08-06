package defpackage;

/* compiled from: r8-map-id-5e15bf382d9e1cc682b2b5d208f848646545054061ee84effb1e415a0540fc32 */
/* loaded from: classes.dex */
public final class w1 {
    public final android.graphics.Bitmap ZpBGe2uQfcn8;

    public w1(android.graphics.Bitmap bitmap) {
        this.ZpBGe2uQfcn8 = bitmap;
    }

    public final int ZpBGe2uQfcn8() {
        android.graphics.Bitmap.Config config;
        android.graphics.Bitmap.Config config2;
        android.graphics.Bitmap.Config config3 = this.ZpBGe2uQfcn8.getConfig();
        config3.getClass();
        if (config3 == android.graphics.Bitmap.Config.ALPHA_8) {
            return 1;
        }
        if (config3 == android.graphics.Bitmap.Config.RGB_565) {
            return 2;
        }
        if (config3 == android.graphics.Bitmap.Config.ARGB_4444) {
            return 0;
        }
        int i = android.os.Build.VERSION.SDK_INT;
        if (i >= 26) {
            config2 = android.graphics.Bitmap.Config.RGBA_F16;
            if (config3 == config2) {
                return 3;
            }
        }
        if (i < 26) {
            return 0;
        }
        config = android.graphics.Bitmap.Config.HARDWARE;
        return config3 == config ? 4 : 0;
    }
}
