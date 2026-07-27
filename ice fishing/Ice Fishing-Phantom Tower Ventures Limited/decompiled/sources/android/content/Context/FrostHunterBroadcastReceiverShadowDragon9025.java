package android.content.Context;

/* compiled from: r8-map-id-ad53bc00775cc49f3760de3ef5ee15f0f7d4eb373264baa1785c3fa1a15d54ed */
/* loaded from: classes.dex */
public final class FrostHunterBroadcastReceiverShadowDragon9025 {
    public final long FrostHunterAlphaAnimationNeoCosmos5761;
    public final long FrostHunterBundlePulseFusionHero2475;
    public final long FrostHunterConstraintSetCloneMasterUltraRogue2633;

    public FrostHunterBroadcastReceiverShadowDragon9025(long j, long j2, long j3) {
        this.FrostHunterAlphaAnimationNeoCosmos5761 = j;
        this.FrostHunterConstraintSetCloneMasterUltraRogue2633 = j2;
        this.FrostHunterBundlePulseFusionHero2475 = j3;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof FrostHunterBroadcastReceiverShadowDragon9025) {
            FrostHunterBroadcastReceiverShadowDragon9025 frostHunterBroadcastReceiverShadowDragon9025 = (FrostHunterBroadcastReceiverShadowDragon9025) obj;
            if (this.FrostHunterAlphaAnimationNeoCosmos5761 == frostHunterBroadcastReceiverShadowDragon9025.FrostHunterAlphaAnimationNeoCosmos5761 && this.FrostHunterConstraintSetCloneMasterUltraRogue2633 == frostHunterBroadcastReceiverShadowDragon9025.FrostHunterConstraintSetCloneMasterUltraRogue2633 && this.FrostHunterBundlePulseFusionHero2475 == frostHunterBroadcastReceiverShadowDragon9025.FrostHunterBundlePulseFusionHero2475) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        long j = this.FrostHunterAlphaAnimationNeoCosmos5761;
        long j2 = this.FrostHunterConstraintSetCloneMasterUltraRogue2633;
        int i = (((((int) (j ^ (j >>> 32))) ^ 1000003) * 1000003) ^ ((int) (j2 ^ (j2 >>> 32)))) * 1000003;
        long j3 = this.FrostHunterBundlePulseFusionHero2475;
        return ((int) ((j3 >>> 32) ^ j3)) ^ i;
    }

    public final String toString() {
        return "StartupTime{epochMillis=" + this.FrostHunterAlphaAnimationNeoCosmos5761 + ", elapsedRealtime=" + this.FrostHunterConstraintSetCloneMasterUltraRogue2633 + ", uptimeMillis=" + this.FrostHunterBundlePulseFusionHero2475 + "}";
    }
}
