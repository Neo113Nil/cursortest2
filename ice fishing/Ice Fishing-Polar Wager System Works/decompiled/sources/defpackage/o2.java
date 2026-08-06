package defpackage;

/* loaded from: classes.dex */
public final class o2 {
    public final android.graphics.Bitmap IHQe1A4L2xu;

    public o2(android.graphics.Bitmap bitmap) {
        this.IHQe1A4L2xu = bitmap;
    }

    public final int IHQe1A4L2xu() {
        android.graphics.Bitmap.Config config;
        android.graphics.Bitmap.Config config2;
        android.graphics.Bitmap.Config config3 = this.IHQe1A4L2xu.getConfig();
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
