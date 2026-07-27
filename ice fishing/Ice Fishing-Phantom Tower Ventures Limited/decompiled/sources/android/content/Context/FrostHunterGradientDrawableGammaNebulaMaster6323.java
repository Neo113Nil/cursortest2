package android.content.Context;

/* compiled from: r8-map-id-ad53bc00775cc49f3760de3ef5ee15f0f7d4eb373264baa1785c3fa1a15d54ed */
/* loaded from: classes.dex */
public final class FrostHunterGradientDrawableGammaNebulaMaster6323 implements FrostHunterGyroscopeHyperionDragon5531 {
    public final long[] FrostHunterAlphaAnimationNeoCosmos5761;
    public final long FrostHunterBundlePulseFusionHero2475;
    public final long[] FrostHunterConstraintSetCloneMasterUltraRogue2633;
    public final int FrostHunterLifecycleBlazeGammaElite2889;
    public final long FrostHunterServiceEliteCelestialThunder1757;

    public FrostHunterGradientDrawableGammaNebulaMaster6323(long[] jArr, long[] jArr2, long j, long j2, long j3, int i) {
        this.FrostHunterAlphaAnimationNeoCosmos5761 = jArr;
        this.FrostHunterConstraintSetCloneMasterUltraRogue2633 = jArr2;
        this.FrostHunterBundlePulseFusionHero2475 = j;
        this.FrostHunterServiceEliteCelestialThunder1757 = j3;
        this.FrostHunterLifecycleBlazeGammaElite2889 = i;
    }

    @Override // android.content.Context.FrostHunterGyroscopeHyperionDragon5531
    public final long FrostHunterAlphaAnimationNeoCosmos5761() {
        return this.FrostHunterServiceEliteCelestialThunder1757;
    }

    @Override // android.content.Context.FrostHunterGeocoderHyperionTitan2118
    public final boolean FrostHunterBundlePulseFusionHero2475() {
        return true;
    }

    @Override // android.content.Context.FrostHunterGyroscopeHyperionDragon5531
    public final int FrostHunterLevelListDrawableFusionDragonHero2232() {
        return this.FrostHunterLifecycleBlazeGammaElite2889;
    }

    @Override // android.content.Context.FrostHunterGeocoderHyperionTitan2118
    public final FrostHunterInputMethodManagerTurboPrime9723 FrostHunterLifecycleBlazeGammaElite2889(long j) {
        long[] jArr = this.FrostHunterAlphaAnimationNeoCosmos5761;
        int FrostHunterServiceEliteCelestialThunder1757 = FrostHunterGyroscopeHeroAlpha1995.FrostHunterServiceEliteCelestialThunder1757(jArr, j, true);
        long j2 = jArr[FrostHunterServiceEliteCelestialThunder1757];
        long[] jArr2 = this.FrostHunterConstraintSetCloneMasterUltraRogue2633;
        FrostHunterDelayHyperAurora1705 frostHunterDelayHyperAurora1705 = new FrostHunterDelayHyperAurora1705(j2, jArr2[FrostHunterServiceEliteCelestialThunder1757]);
        if (j2 >= j || FrostHunterServiceEliteCelestialThunder1757 == jArr.length - 1) {
            return new FrostHunterInputMethodManagerTurboPrime9723(frostHunterDelayHyperAurora1705, frostHunterDelayHyperAurora1705);
        }
        int i = FrostHunterServiceEliteCelestialThunder1757 + 1;
        return new FrostHunterInputMethodManagerTurboPrime9723(frostHunterDelayHyperAurora1705, new FrostHunterDelayHyperAurora1705(jArr[i], jArr2[i]));
    }

    @Override // android.content.Context.FrostHunterGeocoderHyperionTitan2118
    public final long FrostHunterRemoteConfigSpeedSpeed8566() {
        return this.FrostHunterBundlePulseFusionHero2475;
    }

    @Override // android.content.Context.FrostHunterGyroscopeHyperionDragon5531
    public final long FrostHunterServiceEliteCelestialThunder1757(long j) {
        return this.FrostHunterAlphaAnimationNeoCosmos5761[FrostHunterGyroscopeHeroAlpha1995.FrostHunterServiceEliteCelestialThunder1757(this.FrostHunterConstraintSetCloneMasterUltraRogue2633, j, true)];
    }
}
