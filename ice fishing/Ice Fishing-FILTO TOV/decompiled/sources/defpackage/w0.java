package defpackage;

import android.graphics.Bitmap;
import android.os.Build;

/* compiled from: r8-map-id-f07502904ffb6c7cfc104556b013e0e48cd078697d1e7ebb5294e50317be4258 */
/* loaded from: classes.dex */
public final class w0 {
    public final Bitmap GWasM1elztuh;

    public w0(Bitmap bitmap) {
        this.GWasM1elztuh = bitmap;
    }

    public final int GWasM1elztuh() {
        Bitmap.Config config;
        Bitmap.Config config2;
        Bitmap.Config config3 = this.GWasM1elztuh.getConfig();
        config3.getClass();
        if (config3 == Bitmap.Config.ALPHA_8) {
            return 1;
        }
        if (config3 == Bitmap.Config.RGB_565) {
            return 2;
        }
        if (config3 == Bitmap.Config.ARGB_4444) {
            return 0;
        }
        int i = Build.VERSION.SDK_INT;
        if (i >= 26) {
            config2 = Bitmap.Config.RGBA_F16;
            if (config3 == config2) {
                return 3;
            }
        }
        if (i < 26) {
            return 0;
        }
        config = Bitmap.Config.HARDWARE;
        return config3 == config ? 4 : 0;
    }
}
