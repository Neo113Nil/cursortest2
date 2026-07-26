package android.content.Context;

import android.graphics.Bitmap;
import android.os.Build;

/* compiled from: r8-map-id-ad53bc00775cc49f3760de3ef5ee15f0f7d4eb373264baa1785c3fa1a15d54ed */
/* loaded from: classes.dex */
public final class FrostHunterPoseDetectionPixelEclipseBeta2021 {
    public final Bitmap FrostHunterAlphaAnimationNeoCosmos5761;

    public FrostHunterPoseDetectionPixelEclipseBeta2021(Bitmap bitmap) {
        this.FrostHunterAlphaAnimationNeoCosmos5761 = bitmap;
    }

    public final int FrostHunterAlphaAnimationNeoCosmos5761() {
        Bitmap.Config config;
        Bitmap.Config config2;
        Bitmap.Config config3 = this.FrostHunterAlphaAnimationNeoCosmos5761.getConfig();
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
