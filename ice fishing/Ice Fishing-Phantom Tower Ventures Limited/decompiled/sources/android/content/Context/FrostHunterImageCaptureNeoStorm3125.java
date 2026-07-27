package android.content.Context;

import java.util.Objects;

/* compiled from: r8-map-id-ad53bc00775cc49f3760de3ef5ee15f0f7d4eb373264baa1785c3fa1a15d54ed */
/* loaded from: classes.dex */
public final class FrostHunterImageCaptureNeoStorm3125 {
    public final String FrostHunterAlphaAnimationNeoCosmos5761;
    public final int FrostHunterBundlePulseFusionHero2475;
    public final int FrostHunterConstraintSetCloneMasterUltraRogue2633;

    public FrostHunterImageCaptureNeoStorm3125(String str, int i, int i2) {
        this.FrostHunterAlphaAnimationNeoCosmos5761 = str;
        this.FrostHunterConstraintSetCloneMasterUltraRogue2633 = i;
        this.FrostHunterBundlePulseFusionHero2475 = i2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof FrostHunterImageCaptureNeoStorm3125)) {
            return false;
        }
        FrostHunterImageCaptureNeoStorm3125 frostHunterImageCaptureNeoStorm3125 = (FrostHunterImageCaptureNeoStorm3125) obj;
        return this.FrostHunterAlphaAnimationNeoCosmos5761.equals(frostHunterImageCaptureNeoStorm3125.FrostHunterAlphaAnimationNeoCosmos5761) && this.FrostHunterConstraintSetCloneMasterUltraRogue2633 == frostHunterImageCaptureNeoStorm3125.FrostHunterConstraintSetCloneMasterUltraRogue2633 && this.FrostHunterBundlePulseFusionHero2475 == frostHunterImageCaptureNeoStorm3125.FrostHunterBundlePulseFusionHero2475;
    }

    public final int hashCode() {
        Integer valueOf = Integer.valueOf(this.FrostHunterConstraintSetCloneMasterUltraRogue2633);
        Integer valueOf2 = Integer.valueOf(this.FrostHunterBundlePulseFusionHero2475);
        Float valueOf3 = Float.valueOf(1.0f);
        return Objects.hash(this.FrostHunterAlphaAnimationNeoCosmos5761, valueOf, valueOf2, valueOf3, 0, 0, 0, valueOf3);
    }

    public final String toString() {
        return "DisplayShapeCompat{ spec=" + Integer.valueOf(this.FrostHunterAlphaAnimationNeoCosmos5761.hashCode()) + " displayWidth=" + this.FrostHunterConstraintSetCloneMasterUltraRogue2633 + " displayHeight=" + this.FrostHunterBundlePulseFusionHero2475 + " physicalPixelDisplaySizeRatio=1.0 rotation=0 offsetX=0 offsetY=0 scale=1.0}";
    }
}
