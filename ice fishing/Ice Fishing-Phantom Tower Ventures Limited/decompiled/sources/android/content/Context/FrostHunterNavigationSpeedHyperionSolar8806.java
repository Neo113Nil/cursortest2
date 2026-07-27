package android.content.Context;

import java.util.Iterator;

/* compiled from: r8-map-id-ad53bc00775cc49f3760de3ef5ee15f0f7d4eb373264baa1785c3fa1a15d54ed */
/* loaded from: classes.dex */
public final class FrostHunterNavigationSpeedHyperionSolar8806 implements Iterator, FrostHunterContextBlazePrimeMax4967 {
    public int FrostHunterAlertDialogAuroraDelta3200;
    public int FrostHunterCameraXPixelTurboCosmos9814 = -1;
    public int FrostHunterFlowMaxDragonHero5809;
    public final /* synthetic */ FrostHunterThemeOverlayNovaXMaster6614 FrostHunterFragmentBetaMegaVortex6025;
    public FrostHunterFirebaseModelInterpreterOlympianStorm9227 FrostHunterKeyframeGammaGamma1197;

    public FrostHunterNavigationSpeedHyperionSolar8806(FrostHunterThemeOverlayNovaXMaster6614 frostHunterThemeOverlayNovaXMaster6614) {
        this.FrostHunterFragmentBetaMegaVortex6025 = frostHunterThemeOverlayNovaXMaster6614;
        int FrostHunterCameraXTurboCelestialHero5430 = FrostHunterDrawerLayoutUltraStrike3303.FrostHunterCameraXTurboCelestialHero5430(0, 0, ((CharSequence) frostHunterThemeOverlayNovaXMaster6614.FrostHunterConstraintSetCloneMasterUltraRogue2633).length());
        this.FrostHunterFlowMaxDragonHero5809 = FrostHunterCameraXTurboCelestialHero5430;
        this.FrostHunterAlertDialogAuroraDelta3200 = FrostHunterCameraXTurboCelestialHero5430;
    }

    public final void FrostHunterAlphaAnimationNeoCosmos5761() {
        FrostHunterThemeOverlayNovaXMaster6614 frostHunterThemeOverlayNovaXMaster6614 = this.FrostHunterFragmentBetaMegaVortex6025;
        CharSequence charSequence = (CharSequence) frostHunterThemeOverlayNovaXMaster6614.FrostHunterConstraintSetCloneMasterUltraRogue2633;
        int i = this.FrostHunterAlertDialogAuroraDelta3200;
        if (i < 0) {
            this.FrostHunterCameraXPixelTurboCosmos9814 = 0;
            this.FrostHunterKeyframeGammaGamma1197 = null;
            return;
        }
        if (i > charSequence.length()) {
            int i2 = this.FrostHunterFlowMaxDragonHero5809;
            charSequence.getClass();
            this.FrostHunterKeyframeGammaGamma1197 = new FrostHunterFirebaseModelInterpreterOlympianStorm9227(i2, charSequence.length() - 1, 1);
            this.FrostHunterAlertDialogAuroraDelta3200 = -1;
        } else {
            FrostHunterLaunchHeroForce4010 frostHunterLaunchHeroForce4010 = (FrostHunterLaunchHeroForce4010) ((FrostHunterFontFamilyNeoBetaEpic8574) frostHunterThemeOverlayNovaXMaster6614.FrostHunterBundlePulseFusionHero2475).FrostHunterCameraXPixelTurboCosmos9814(charSequence, Integer.valueOf(this.FrostHunterAlertDialogAuroraDelta3200));
            if (frostHunterLaunchHeroForce4010 == null) {
                int i3 = this.FrostHunterFlowMaxDragonHero5809;
                charSequence.getClass();
                this.FrostHunterKeyframeGammaGamma1197 = new FrostHunterFirebaseModelInterpreterOlympianStorm9227(i3, charSequence.length() - 1, 1);
                this.FrostHunterAlertDialogAuroraDelta3200 = -1;
            } else {
                int intValue = ((Number) frostHunterLaunchHeroForce4010.FrostHunterCameraXPixelTurboCosmos9814).intValue();
                int intValue2 = ((Number) frostHunterLaunchHeroForce4010.FrostHunterFlowMaxDragonHero5809).intValue();
                this.FrostHunterKeyframeGammaGamma1197 = FrostHunterDrawerLayoutUltraStrike3303.FrostHunterRunnableCosmosCelestial4235(this.FrostHunterFlowMaxDragonHero5809, intValue);
                int i4 = intValue + intValue2;
                this.FrostHunterFlowMaxDragonHero5809 = i4;
                this.FrostHunterAlertDialogAuroraDelta3200 = i4 + (intValue2 == 0 ? 1 : 0);
            }
        }
        this.FrostHunterCameraXPixelTurboCosmos9814 = 1;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        if (this.FrostHunterCameraXPixelTurboCosmos9814 == -1) {
            FrostHunterAlphaAnimationNeoCosmos5761();
        }
        return this.FrostHunterCameraXPixelTurboCosmos9814 == 1;
    }

    @Override // java.util.Iterator
    public final Object next() {
        if (this.FrostHunterCameraXPixelTurboCosmos9814 == -1) {
            FrostHunterAlphaAnimationNeoCosmos5761();
        }
        if (this.FrostHunterCameraXPixelTurboCosmos9814 == 0) {
            FrostHunterVibratorSpectraBetaNovaX4683.FrostHunterCameraXPixelTurboCosmos9814();
            return null;
        }
        FrostHunterFirebaseModelInterpreterOlympianStorm9227 frostHunterFirebaseModelInterpreterOlympianStorm9227 = this.FrostHunterKeyframeGammaGamma1197;
        frostHunterFirebaseModelInterpreterOlympianStorm9227.getClass();
        this.FrostHunterKeyframeGammaGamma1197 = null;
        this.FrostHunterCameraXPixelTurboCosmos9814 = -1;
        return frostHunterFirebaseModelInterpreterOlympianStorm9227;
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
