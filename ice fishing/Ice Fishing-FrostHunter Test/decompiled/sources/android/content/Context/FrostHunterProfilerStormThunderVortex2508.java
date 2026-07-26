package android.content.Context;

/* compiled from: r8-map-id-ad53bc00775cc49f3760de3ef5ee15f0f7d4eb373264baa1785c3fa1a15d54ed */
/* loaded from: classes.dex */
public final class FrostHunterProfilerStormThunderVortex2508 implements FrostHunterGyroscopeHyperionDragon5531 {
    public final long FrostHunterAlphaAnimationNeoCosmos5761;
    public final long FrostHunterBundlePulseFusionHero2475;
    public final int FrostHunterConstraintSetCloneMasterUltraRogue2633;
    public final long FrostHunterLevelListDrawableFusionDragonHero2232;
    public final long FrostHunterLifecycleBlazeGammaElite2889;
    public final long[] FrostHunterRemoteConfigSpeedSpeed8566;
    public final int FrostHunterServiceEliteCelestialThunder1757;

    public FrostHunterProfilerStormThunderVortex2508(long j, int i, long j2, int i2, long j3, long[] jArr) {
        this.FrostHunterAlphaAnimationNeoCosmos5761 = j;
        this.FrostHunterConstraintSetCloneMasterUltraRogue2633 = i;
        this.FrostHunterBundlePulseFusionHero2475 = j2;
        this.FrostHunterServiceEliteCelestialThunder1757 = i2;
        this.FrostHunterLifecycleBlazeGammaElite2889 = j3;
        this.FrostHunterRemoteConfigSpeedSpeed8566 = jArr;
        this.FrostHunterLevelListDrawableFusionDragonHero2232 = j3 != -1 ? j + j3 : -1L;
    }

    @Override // android.content.Context.FrostHunterGyroscopeHyperionDragon5531
    public final long FrostHunterAlphaAnimationNeoCosmos5761() {
        return this.FrostHunterLevelListDrawableFusionDragonHero2232;
    }

    @Override // android.content.Context.FrostHunterGeocoderHyperionTitan2118
    public final boolean FrostHunterBundlePulseFusionHero2475() {
        return this.FrostHunterRemoteConfigSpeedSpeed8566 != null;
    }

    @Override // android.content.Context.FrostHunterGyroscopeHyperionDragon5531
    public final int FrostHunterLevelListDrawableFusionDragonHero2232() {
        return this.FrostHunterServiceEliteCelestialThunder1757;
    }

    @Override // android.content.Context.FrostHunterGeocoderHyperionTitan2118
    public final FrostHunterInputMethodManagerTurboPrime9723 FrostHunterLifecycleBlazeGammaElite2889(long j) {
        double d;
        double d2;
        boolean FrostHunterBundlePulseFusionHero2475 = FrostHunterBundlePulseFusionHero2475();
        int i = this.FrostHunterConstraintSetCloneMasterUltraRogue2633;
        long j2 = this.FrostHunterAlphaAnimationNeoCosmos5761;
        if (!FrostHunterBundlePulseFusionHero2475) {
            FrostHunterDelayHyperAurora1705 frostHunterDelayHyperAurora1705 = new FrostHunterDelayHyperAurora1705(0L, j2 + i);
            return new FrostHunterInputMethodManagerTurboPrime9723(frostHunterDelayHyperAurora1705, frostHunterDelayHyperAurora1705);
        }
        long FrostHunterCameraXPixelTurboCosmos9814 = FrostHunterGyroscopeHeroAlpha1995.FrostHunterCameraXPixelTurboCosmos9814(j, 0L, this.FrostHunterBundlePulseFusionHero2475);
        double d3 = (FrostHunterCameraXPixelTurboCosmos9814 * 100.0d) / this.FrostHunterBundlePulseFusionHero2475;
        double d4 = 0.0d;
        if (d3 <= 0.0d) {
            d = 256.0d;
        } else if (d3 >= 100.0d) {
            d = 256.0d;
            d4 = 256.0d;
        } else {
            int i2 = (int) d3;
            long[] jArr = this.FrostHunterRemoteConfigSpeedSpeed8566;
            jArr.getClass();
            double d5 = jArr[i2];
            if (i2 == 99) {
                d = 256.0d;
                d2 = 256.0d;
            } else {
                d = 256.0d;
                d2 = jArr[i2 + 1];
            }
            d4 = ((d2 - d5) * (d3 - i2)) + d5;
        }
        long j3 = this.FrostHunterLifecycleBlazeGammaElite2889;
        FrostHunterDelayHyperAurora1705 frostHunterDelayHyperAurora17052 = new FrostHunterDelayHyperAurora1705(FrostHunterCameraXPixelTurboCosmos9814, j2 + FrostHunterGyroscopeHeroAlpha1995.FrostHunterCameraXPixelTurboCosmos9814(Math.round((d4 / d) * j3), i, j3 - 1));
        return new FrostHunterInputMethodManagerTurboPrime9723(frostHunterDelayHyperAurora17052, frostHunterDelayHyperAurora17052);
    }

    @Override // android.content.Context.FrostHunterGeocoderHyperionTitan2118
    public final long FrostHunterRemoteConfigSpeedSpeed8566() {
        return this.FrostHunterBundlePulseFusionHero2475;
    }

    @Override // android.content.Context.FrostHunterGyroscopeHyperionDragon5531
    public final long FrostHunterServiceEliteCelestialThunder1757(long j) {
        long j2 = j - this.FrostHunterAlphaAnimationNeoCosmos5761;
        if (!FrostHunterBundlePulseFusionHero2475() || j2 <= this.FrostHunterConstraintSetCloneMasterUltraRogue2633) {
            return 0L;
        }
        long[] jArr = this.FrostHunterRemoteConfigSpeedSpeed8566;
        jArr.getClass();
        double d = (j2 * 256.0d) / this.FrostHunterLifecycleBlazeGammaElite2889;
        int FrostHunterServiceEliteCelestialThunder1757 = FrostHunterGyroscopeHeroAlpha1995.FrostHunterServiceEliteCelestialThunder1757(jArr, (long) d, true);
        long j3 = this.FrostHunterBundlePulseFusionHero2475;
        long j4 = (FrostHunterServiceEliteCelestialThunder1757 * j3) / 100;
        long j5 = jArr[FrostHunterServiceEliteCelestialThunder1757];
        int i = FrostHunterServiceEliteCelestialThunder1757 + 1;
        long j6 = (j3 * i) / 100;
        return Math.round((j5 == (FrostHunterServiceEliteCelestialThunder1757 == 99 ? 256L : jArr[i]) ? 0.0d : (d - j5) / (r0 - j5)) * (j6 - j4)) + j4;
    }
}
