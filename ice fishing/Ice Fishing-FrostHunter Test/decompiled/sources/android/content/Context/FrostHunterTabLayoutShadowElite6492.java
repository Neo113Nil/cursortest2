package android.content.Context;

/* compiled from: r8-map-id-ad53bc00775cc49f3760de3ef5ee15f0f7d4eb373264baa1785c3fa1a15d54ed */
/* loaded from: classes.dex */
public final class FrostHunterTabLayoutShadowElite6492 {
    public final long FrostHunterAlphaAnimationNeoCosmos5761;
    public static final FrostHunterLifecycleMaxPulseElite3479[] FrostHunterConstraintSetCloneMasterUltraRogue2633 = {new FrostHunterLifecycleMaxPulseElite3479(0), new FrostHunterLifecycleMaxPulseElite3479(4294967296L), new FrostHunterLifecycleMaxPulseElite3479(8589934592L)};
    public static final long FrostHunterBundlePulseFusionHero2475 = FrostHunterLiveDataScopeOmegaBeta9836.FrostHunterFlowMaxDragonHero5809(0, Float.NaN);

    public /* synthetic */ FrostHunterTabLayoutShadowElite6492(long j) {
        this.FrostHunterAlphaAnimationNeoCosmos5761 = j;
    }

    public static final boolean FrostHunterAlphaAnimationNeoCosmos5761(long j, long j2) {
        return j == j2;
    }

    public static final float FrostHunterBundlePulseFusionHero2475(long j) {
        return Float.intBitsToFloat((int) (j & 4294967295L));
    }

    public static final long FrostHunterConstraintSetCloneMasterUltraRogue2633(long j) {
        return FrostHunterConstraintSetCloneMasterUltraRogue2633[(int) ((j & 1095216660480L) >>> 32)].FrostHunterAlphaAnimationNeoCosmos5761;
    }

    public static String FrostHunterServiceEliteCelestialThunder1757(long j) {
        long FrostHunterConstraintSetCloneMasterUltraRogue26332 = FrostHunterConstraintSetCloneMasterUltraRogue2633(j);
        if (FrostHunterLifecycleMaxPulseElite3479.FrostHunterAlphaAnimationNeoCosmos5761(FrostHunterConstraintSetCloneMasterUltraRogue26332, 0L)) {
            return "Unspecified";
        }
        if (FrostHunterLifecycleMaxPulseElite3479.FrostHunterAlphaAnimationNeoCosmos5761(FrostHunterConstraintSetCloneMasterUltraRogue26332, 4294967296L)) {
            return FrostHunterBundlePulseFusionHero2475(j) + ".sp";
        }
        if (!FrostHunterLifecycleMaxPulseElite3479.FrostHunterAlphaAnimationNeoCosmos5761(FrostHunterConstraintSetCloneMasterUltraRogue26332, 8589934592L)) {
            return "Invalid";
        }
        return FrostHunterBundlePulseFusionHero2475(j) + ".em";
    }

    public final boolean equals(Object obj) {
        if (obj instanceof FrostHunterTabLayoutShadowElite6492) {
            return this.FrostHunterAlphaAnimationNeoCosmos5761 == ((FrostHunterTabLayoutShadowElite6492) obj).FrostHunterAlphaAnimationNeoCosmos5761;
        }
        return false;
    }

    public final int hashCode() {
        return Long.hashCode(this.FrostHunterAlphaAnimationNeoCosmos5761);
    }

    public final String toString() {
        return FrostHunterServiceEliteCelestialThunder1757(this.FrostHunterAlphaAnimationNeoCosmos5761);
    }
}
