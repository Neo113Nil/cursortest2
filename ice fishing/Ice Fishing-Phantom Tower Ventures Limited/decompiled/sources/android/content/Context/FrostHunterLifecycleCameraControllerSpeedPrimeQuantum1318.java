package android.content.Context;

import java.util.Set;

/* compiled from: r8-map-id-ad53bc00775cc49f3760de3ef5ee15f0f7d4eb373264baa1785c3fa1a15d54ed */
/* loaded from: classes.dex */
public final class FrostHunterLifecycleCameraControllerSpeedPrimeQuantum1318 {
    public final long FrostHunterAlphaAnimationNeoCosmos5761;
    public final Set FrostHunterBundlePulseFusionHero2475;
    public final long FrostHunterConstraintSetCloneMasterUltraRogue2633;

    public FrostHunterLifecycleCameraControllerSpeedPrimeQuantum1318(long j, long j2, Set set) {
        this.FrostHunterAlphaAnimationNeoCosmos5761 = j;
        this.FrostHunterConstraintSetCloneMasterUltraRogue2633 = j2;
        this.FrostHunterBundlePulseFusionHero2475 = set;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof FrostHunterLifecycleCameraControllerSpeedPrimeQuantum1318) {
            FrostHunterLifecycleCameraControllerSpeedPrimeQuantum1318 frostHunterLifecycleCameraControllerSpeedPrimeQuantum1318 = (FrostHunterLifecycleCameraControllerSpeedPrimeQuantum1318) obj;
            if (this.FrostHunterAlphaAnimationNeoCosmos5761 == frostHunterLifecycleCameraControllerSpeedPrimeQuantum1318.FrostHunterAlphaAnimationNeoCosmos5761 && this.FrostHunterConstraintSetCloneMasterUltraRogue2633 == frostHunterLifecycleCameraControllerSpeedPrimeQuantum1318.FrostHunterConstraintSetCloneMasterUltraRogue2633 && this.FrostHunterBundlePulseFusionHero2475.equals(frostHunterLifecycleCameraControllerSpeedPrimeQuantum1318.FrostHunterBundlePulseFusionHero2475)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        long j = this.FrostHunterAlphaAnimationNeoCosmos5761;
        int i = (((int) (j ^ (j >>> 32))) ^ 1000003) * 1000003;
        long j2 = this.FrostHunterConstraintSetCloneMasterUltraRogue2633;
        return this.FrostHunterBundlePulseFusionHero2475.hashCode() ^ ((i ^ ((int) ((j2 >>> 32) ^ j2))) * 1000003);
    }

    public final String toString() {
        return "ConfigValue{delta=" + this.FrostHunterAlphaAnimationNeoCosmos5761 + ", maxAllowedDelay=" + this.FrostHunterConstraintSetCloneMasterUltraRogue2633 + ", flags=" + this.FrostHunterBundlePulseFusionHero2475 + "}";
    }
}
