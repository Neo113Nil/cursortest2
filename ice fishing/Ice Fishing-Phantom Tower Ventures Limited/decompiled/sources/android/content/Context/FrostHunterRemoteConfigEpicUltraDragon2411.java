package android.content.Context;

import android.media.AudioAttributes;
import android.os.Build;

/* compiled from: r8-map-id-ad53bc00775cc49f3760de3ef5ee15f0f7d4eb373264baa1785c3fa1a15d54ed */
/* loaded from: classes.dex */
public final class FrostHunterRemoteConfigEpicUltraDragon2411 {
    public static final FrostHunterRemoteConfigEpicUltraDragon2411 FrostHunterConstraintSetCloneMasterUltraRogue2633 = new FrostHunterRemoteConfigEpicUltraDragon2411();
    public AudioAttributes FrostHunterAlphaAnimationNeoCosmos5761;

    static {
        FrostHunterKeyEventNovaXAlpha1220.FrostHunterFirebaseModelDownloadConditionsSolarBlaze2223(0, 1, 2, 3, 4);
        FrostHunterGyroscopeHeroAlpha1995.FrostHunterBitmapTurboDeltaNebula8743(5);
        FrostHunterGyroscopeHeroAlpha1995.FrostHunterBitmapTurboDeltaNebula8743(6);
    }

    public final AudioAttributes FrostHunterAlphaAnimationNeoCosmos5761() {
        if (this.FrostHunterAlphaAnimationNeoCosmos5761 == null) {
            AudioAttributes.Builder usage = new AudioAttributes.Builder().setContentType(0).setFlags(0).setUsage(1);
            int i = Build.VERSION.SDK_INT;
            if (i >= 29) {
                usage.setAllowedCapturePolicy(1);
                usage.setHapticChannelsMuted(true);
            }
            if (i >= 32) {
                usage.setSpatializationBehavior(0);
                usage.setIsContentSpatialized(false);
            }
            this.FrostHunterAlphaAnimationNeoCosmos5761 = usage.build();
        }
        return this.FrostHunterAlphaAnimationNeoCosmos5761;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || FrostHunterRemoteConfigEpicUltraDragon2411.class != obj.getClass()) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return -436042064;
    }
}
