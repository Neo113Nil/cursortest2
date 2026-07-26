package android.content.Context;

import android.util.Pair;

/* compiled from: r8-map-id-ad53bc00775cc49f3760de3ef5ee15f0f7d4eb373264baa1785c3fa1a15d54ed */
/* loaded from: classes.dex */
public final class FrostHunterViewPager2TurboTitanPulse7502 implements FrostHunterGyroscopeHyperionDragon5531 {
    public final long[] FrostHunterAlphaAnimationNeoCosmos5761;
    public final long FrostHunterBundlePulseFusionHero2475;
    public final long[] FrostHunterConstraintSetCloneMasterUltraRogue2633;

    public FrostHunterViewPager2TurboTitanPulse7502(long j, long[] jArr, long[] jArr2) {
        this.FrostHunterAlphaAnimationNeoCosmos5761 = jArr;
        this.FrostHunterConstraintSetCloneMasterUltraRogue2633 = jArr2;
        this.FrostHunterBundlePulseFusionHero2475 = j == -9223372036854775807L ? FrostHunterGyroscopeHeroAlpha1995.FrostHunterDatabaseEliteShadowUltra2452(jArr2[jArr2.length - 1]) : j;
    }

    public static Pair FrostHunterCameraXPixelTurboCosmos9814(long j, long[] jArr, long[] jArr2) {
        int FrostHunterServiceEliteCelestialThunder1757 = FrostHunterGyroscopeHeroAlpha1995.FrostHunterServiceEliteCelestialThunder1757(jArr, j, true);
        long j2 = jArr[FrostHunterServiceEliteCelestialThunder1757];
        long j3 = jArr2[FrostHunterServiceEliteCelestialThunder1757];
        int i = FrostHunterServiceEliteCelestialThunder1757 + 1;
        if (i == jArr.length) {
            return Pair.create(Long.valueOf(j2), Long.valueOf(j3));
        }
        return Pair.create(Long.valueOf(j), Long.valueOf(((long) ((jArr[i] == j2 ? 0.0d : (j - j2) / (r6 - j2)) * (jArr2[i] - j3))) + j3));
    }

    @Override // android.content.Context.FrostHunterGyroscopeHyperionDragon5531
    public final long FrostHunterAlphaAnimationNeoCosmos5761() {
        return -1L;
    }

    @Override // android.content.Context.FrostHunterGeocoderHyperionTitan2118
    public final boolean FrostHunterBundlePulseFusionHero2475() {
        return true;
    }

    @Override // android.content.Context.FrostHunterGyroscopeHyperionDragon5531
    public final int FrostHunterLevelListDrawableFusionDragonHero2232() {
        return -2147483647;
    }

    @Override // android.content.Context.FrostHunterGeocoderHyperionTitan2118
    public final FrostHunterInputMethodManagerTurboPrime9723 FrostHunterLifecycleBlazeGammaElite2889(long j) {
        Pair FrostHunterCameraXPixelTurboCosmos9814 = FrostHunterCameraXPixelTurboCosmos9814(FrostHunterGyroscopeHeroAlpha1995.FrostHunterPagingDataTurboTitanium7332(FrostHunterGyroscopeHeroAlpha1995.FrostHunterCameraXPixelTurboCosmos9814(j, 0L, this.FrostHunterBundlePulseFusionHero2475)), this.FrostHunterConstraintSetCloneMasterUltraRogue2633, this.FrostHunterAlphaAnimationNeoCosmos5761);
        FrostHunterDelayHyperAurora1705 frostHunterDelayHyperAurora1705 = new FrostHunterDelayHyperAurora1705(FrostHunterGyroscopeHeroAlpha1995.FrostHunterDatabaseEliteShadowUltra2452(((Long) FrostHunterCameraXPixelTurboCosmos9814.first).longValue()), ((Long) FrostHunterCameraXPixelTurboCosmos9814.second).longValue());
        return new FrostHunterInputMethodManagerTurboPrime9723(frostHunterDelayHyperAurora1705, frostHunterDelayHyperAurora1705);
    }

    @Override // android.content.Context.FrostHunterGeocoderHyperionTitan2118
    public final long FrostHunterRemoteConfigSpeedSpeed8566() {
        return this.FrostHunterBundlePulseFusionHero2475;
    }

    @Override // android.content.Context.FrostHunterGyroscopeHyperionDragon5531
    public final long FrostHunterServiceEliteCelestialThunder1757(long j) {
        return FrostHunterGyroscopeHeroAlpha1995.FrostHunterDatabaseEliteShadowUltra2452(((Long) FrostHunterCameraXPixelTurboCosmos9814(j, this.FrostHunterAlphaAnimationNeoCosmos5761, this.FrostHunterConstraintSetCloneMasterUltraRogue2633).second).longValue());
    }
}
