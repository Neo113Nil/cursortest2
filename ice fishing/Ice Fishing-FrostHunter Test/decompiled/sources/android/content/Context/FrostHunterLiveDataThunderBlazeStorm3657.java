package android.content.Context;

/* compiled from: r8-map-id-ad53bc00775cc49f3760de3ef5ee15f0f7d4eb373264baa1785c3fa1a15d54ed */
/* loaded from: classes.dex */
public final class FrostHunterLiveDataThunderBlazeStorm3657 {
    public final String FrostHunterAlphaAnimationNeoCosmos5761;
    public final long FrostHunterBundlePulseFusionHero2475;
    public final long FrostHunterConstraintSetCloneMasterUltraRogue2633;

    public FrostHunterLiveDataThunderBlazeStorm3657(String str, long j, long j2) {
        this.FrostHunterAlphaAnimationNeoCosmos5761 = str;
        this.FrostHunterConstraintSetCloneMasterUltraRogue2633 = j;
        this.FrostHunterBundlePulseFusionHero2475 = j2;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof FrostHunterLiveDataThunderBlazeStorm3657) {
            FrostHunterLiveDataThunderBlazeStorm3657 frostHunterLiveDataThunderBlazeStorm3657 = (FrostHunterLiveDataThunderBlazeStorm3657) obj;
            if (this.FrostHunterAlphaAnimationNeoCosmos5761.equals(frostHunterLiveDataThunderBlazeStorm3657.FrostHunterAlphaAnimationNeoCosmos5761) && this.FrostHunterConstraintSetCloneMasterUltraRogue2633 == frostHunterLiveDataThunderBlazeStorm3657.FrostHunterConstraintSetCloneMasterUltraRogue2633 && this.FrostHunterBundlePulseFusionHero2475 == frostHunterLiveDataThunderBlazeStorm3657.FrostHunterBundlePulseFusionHero2475) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int hashCode = (this.FrostHunterAlphaAnimationNeoCosmos5761.hashCode() ^ 1000003) * 1000003;
        long j = this.FrostHunterConstraintSetCloneMasterUltraRogue2633;
        long j2 = this.FrostHunterBundlePulseFusionHero2475;
        return ((int) (j2 ^ (j2 >>> 32))) ^ ((hashCode ^ ((int) (j ^ (j >>> 32)))) * 1000003);
    }

    public final String toString() {
        return "InstallationTokenResult{token=" + this.FrostHunterAlphaAnimationNeoCosmos5761 + ", tokenExpirationTimestamp=" + this.FrostHunterConstraintSetCloneMasterUltraRogue2633 + ", tokenCreationTimestamp=" + this.FrostHunterBundlePulseFusionHero2475 + "}";
    }
}
