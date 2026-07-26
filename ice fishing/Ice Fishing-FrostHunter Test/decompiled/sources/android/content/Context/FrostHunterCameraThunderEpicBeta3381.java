package android.content.Context;

import java.util.Locale;

/* compiled from: r8-map-id-ad53bc00775cc49f3760de3ef5ee15f0f7d4eb373264baa1785c3fa1a15d54ed */
/* loaded from: classes.dex */
public final class FrostHunterCameraThunderEpicBeta3381 {
    public static final FrostHunterCameraThunderEpicBeta3381 FrostHunterServiceEliteCelestialThunder1757 = new FrostHunterCameraThunderEpicBeta3381(1.0f, 1.0f);
    public final float FrostHunterAlphaAnimationNeoCosmos5761;
    public final int FrostHunterBundlePulseFusionHero2475;
    public final float FrostHunterConstraintSetCloneMasterUltraRogue2633;

    static {
        FrostHunterGyroscopeHeroAlpha1995.FrostHunterBitmapTurboDeltaNebula8743(0);
        FrostHunterGyroscopeHeroAlpha1995.FrostHunterBitmapTurboDeltaNebula8743(1);
    }

    public FrostHunterCameraThunderEpicBeta3381(float f, float f2) {
        FrostHunterCanvasInfernoVortex4700.FrostHunterResourcesTitanHyperVision5823(f > 0.0f);
        FrostHunterCanvasInfernoVortex4700.FrostHunterResourcesTitanHyperVision5823(f2 > 0.0f);
        this.FrostHunterAlphaAnimationNeoCosmos5761 = f;
        this.FrostHunterConstraintSetCloneMasterUltraRogue2633 = f2;
        this.FrostHunterBundlePulseFusionHero2475 = Math.round(f * 1000.0f);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && FrostHunterCameraThunderEpicBeta3381.class == obj.getClass()) {
            FrostHunterCameraThunderEpicBeta3381 frostHunterCameraThunderEpicBeta3381 = (FrostHunterCameraThunderEpicBeta3381) obj;
            if (this.FrostHunterAlphaAnimationNeoCosmos5761 == frostHunterCameraThunderEpicBeta3381.FrostHunterAlphaAnimationNeoCosmos5761 && this.FrostHunterConstraintSetCloneMasterUltraRogue2633 == frostHunterCameraThunderEpicBeta3381.FrostHunterConstraintSetCloneMasterUltraRogue2633) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Float.floatToRawIntBits(this.FrostHunterConstraintSetCloneMasterUltraRogue2633) + ((Float.floatToRawIntBits(this.FrostHunterAlphaAnimationNeoCosmos5761) + 527) * 31);
    }

    public final String toString() {
        Object[] objArr = {Float.valueOf(this.FrostHunterAlphaAnimationNeoCosmos5761), Float.valueOf(this.FrostHunterConstraintSetCloneMasterUltraRogue2633)};
        String str = FrostHunterGyroscopeHeroAlpha1995.FrostHunterAlphaAnimationNeoCosmos5761;
        return String.format(Locale.US, "PlaybackParameters(speed=%.2f, pitch=%.2f)", objArr);
    }
}
