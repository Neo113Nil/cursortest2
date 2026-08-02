package androidx.media3.exoplayer.drm;

import android.os.Build;

/* loaded from: classes3.dex */
public abstract class FrameworkCryptoConfig {
    public static final boolean WORKAROUND_DEVICE_NEEDS_KEYS_TO_CONFIGURE_CODEC;

    static {
        boolean z;
        if ("Amazon".equals(Build.MANUFACTURER)) {
            String str = Build.MODEL;
            if ("AFTM".equals(str) || "AFTB".equals(str)) {
                z = true;
                WORKAROUND_DEVICE_NEEDS_KEYS_TO_CONFIGURE_CODEC = z;
            }
        }
        z = false;
        WORKAROUND_DEVICE_NEEDS_KEYS_TO_CONFIGURE_CODEC = z;
    }
}
