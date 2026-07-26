package android.content.Context;

import java.math.RoundingMode;

/* compiled from: r8-map-id-ad53bc00775cc49f3760de3ef5ee15f0f7d4eb373264baa1785c3fa1a15d54ed */
/* loaded from: classes.dex */
public final class FrostHunterFCMPulseSpectraNeo8332 implements FrostHunterGeocoderHyperionTitan2118 {
    public final FrostHunterCoordinatorLayoutSpectraQuantum6405 FrostHunterAlphaAnimationNeoCosmos5761;
    public final long FrostHunterBundlePulseFusionHero2475;
    public final int FrostHunterConstraintSetCloneMasterUltraRogue2633;
    public final long FrostHunterLifecycleBlazeGammaElite2889;
    public final long FrostHunterServiceEliteCelestialThunder1757;

    public FrostHunterFCMPulseSpectraNeo8332(FrostHunterCoordinatorLayoutSpectraQuantum6405 frostHunterCoordinatorLayoutSpectraQuantum6405, int i, long j, long j2) {
        this.FrostHunterAlphaAnimationNeoCosmos5761 = frostHunterCoordinatorLayoutSpectraQuantum6405;
        this.FrostHunterConstraintSetCloneMasterUltraRogue2633 = i;
        this.FrostHunterBundlePulseFusionHero2475 = j;
        long j3 = (j2 - j) / frostHunterCoordinatorLayoutSpectraQuantum6405.FrostHunterBundlePulseFusionHero2475;
        this.FrostHunterServiceEliteCelestialThunder1757 = j3;
        this.FrostHunterLifecycleBlazeGammaElite2889 = FrostHunterCameraXPixelTurboCosmos9814(j3);
    }

    @Override // android.content.Context.FrostHunterGeocoderHyperionTitan2118
    public final boolean FrostHunterBundlePulseFusionHero2475() {
        return true;
    }

    public final long FrostHunterCameraXPixelTurboCosmos9814(long j) {
        long j2 = j * this.FrostHunterConstraintSetCloneMasterUltraRogue2633;
        long j3 = this.FrostHunterAlphaAnimationNeoCosmos5761.FrostHunterConstraintSetCloneMasterUltraRogue2633;
        String str = FrostHunterGyroscopeHeroAlpha1995.FrostHunterAlphaAnimationNeoCosmos5761;
        return FrostHunterGyroscopeHeroAlpha1995.FrostHunterTranslateAnimationCyberSolarUltra7101(j2, 1000000L, j3, RoundingMode.DOWN);
    }

    @Override // android.content.Context.FrostHunterGeocoderHyperionTitan2118
    public final FrostHunterInputMethodManagerTurboPrime9723 FrostHunterLifecycleBlazeGammaElite2889(long j) {
        FrostHunterCoordinatorLayoutSpectraQuantum6405 frostHunterCoordinatorLayoutSpectraQuantum6405 = this.FrostHunterAlphaAnimationNeoCosmos5761;
        long j2 = this.FrostHunterServiceEliteCelestialThunder1757 - 1;
        long FrostHunterCameraXPixelTurboCosmos9814 = FrostHunterGyroscopeHeroAlpha1995.FrostHunterCameraXPixelTurboCosmos9814((frostHunterCoordinatorLayoutSpectraQuantum6405.FrostHunterConstraintSetCloneMasterUltraRogue2633 * j) / (this.FrostHunterConstraintSetCloneMasterUltraRogue2633 * 1000000), 0L, j2);
        int i = frostHunterCoordinatorLayoutSpectraQuantum6405.FrostHunterBundlePulseFusionHero2475;
        long j3 = this.FrostHunterBundlePulseFusionHero2475;
        long FrostHunterCameraXPixelTurboCosmos98142 = FrostHunterCameraXPixelTurboCosmos9814(FrostHunterCameraXPixelTurboCosmos9814);
        FrostHunterDelayHyperAurora1705 frostHunterDelayHyperAurora1705 = new FrostHunterDelayHyperAurora1705(FrostHunterCameraXPixelTurboCosmos98142, (i * FrostHunterCameraXPixelTurboCosmos9814) + j3);
        if (FrostHunterCameraXPixelTurboCosmos98142 >= j || FrostHunterCameraXPixelTurboCosmos9814 == j2) {
            return new FrostHunterInputMethodManagerTurboPrime9723(frostHunterDelayHyperAurora1705, frostHunterDelayHyperAurora1705);
        }
        long j4 = FrostHunterCameraXPixelTurboCosmos9814 + 1;
        return new FrostHunterInputMethodManagerTurboPrime9723(frostHunterDelayHyperAurora1705, new FrostHunterDelayHyperAurora1705(FrostHunterCameraXPixelTurboCosmos9814(j4), (i * j4) + j3));
    }

    @Override // android.content.Context.FrostHunterGeocoderHyperionTitan2118
    public final long FrostHunterRemoteConfigSpeedSpeed8566() {
        return this.FrostHunterLifecycleBlazeGammaElite2889;
    }
}
