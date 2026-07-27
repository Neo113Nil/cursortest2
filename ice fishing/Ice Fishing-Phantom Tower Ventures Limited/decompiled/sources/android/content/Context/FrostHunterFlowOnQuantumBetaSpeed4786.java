package android.content.Context;

import android.graphics.ImageDecoder;
import android.graphics.ImageDecoder$OnHeaderDecodedListener;
import android.util.Size;

/* compiled from: r8-map-id-ad53bc00775cc49f3760de3ef5ee15f0f7d4eb373264baa1785c3fa1a15d54ed */
/* loaded from: classes.dex */
public final class FrostHunterFlowOnQuantumBetaSpeed4786 implements ImageDecoder$OnHeaderDecodedListener {
    public final /* synthetic */ FrostHunterTranslateAnimationVisionBetaPulse4522 FrostHunterAlphaAnimationNeoCosmos5761;
    public final /* synthetic */ FrostHunterMeteringPointOlympianSpeedVision9916 FrostHunterConstraintSetCloneMasterUltraRogue2633;

    public FrostHunterFlowOnQuantumBetaSpeed4786(FrostHunterTranslateAnimationVisionBetaPulse4522 frostHunterTranslateAnimationVisionBetaPulse4522, FrostHunterMeteringPointOlympianSpeedVision9916 frostHunterMeteringPointOlympianSpeedVision9916) {
        this.FrostHunterAlphaAnimationNeoCosmos5761 = frostHunterTranslateAnimationVisionBetaPulse4522;
        this.FrostHunterConstraintSetCloneMasterUltraRogue2633 = frostHunterMeteringPointOlympianSpeedVision9916;
    }

    public final void onHeaderDecoded(ImageDecoder imageDecoder, ImageDecoder.ImageInfo imageInfo, ImageDecoder.Source source) {
        Size size;
        size = imageInfo.getSize();
        int width = size.getWidth();
        int height = size.getHeight();
        FrostHunterTranslateAnimationVisionBetaPulse4522 frostHunterTranslateAnimationVisionBetaPulse4522 = this.FrostHunterAlphaAnimationNeoCosmos5761;
        FrostHunterCameraViewTitaniumHyperionEclipse8189 frostHunterCameraViewTitaniumHyperionEclipse8189 = frostHunterTranslateAnimationVisionBetaPulse4522.FrostHunterConstraintSetCloneMasterUltraRogue2633;
        FrostHunterGestureDetectorForceTitan2560 frostHunterGestureDetectorForceTitan2560 = frostHunterCameraViewTitaniumHyperionEclipse8189.FrostHunterConstraintSetCloneMasterUltraRogue2633;
        FrostHunterLicensingAlphaTitanElite7131 frostHunterLicensingAlphaTitanElite7131 = frostHunterCameraViewTitaniumHyperionEclipse8189.FrostHunterBundlePulseFusionHero2475;
        FrostHunterInstrumentationStrikeBlazeThunder7469 frostHunterInstrumentationStrikeBlazeThunder7469 = FrostHunterBroadcastReceiverEliteEliteQuantum9225.FrostHunterConstraintSetCloneMasterUltraRogue2633;
        long FrostHunterServiceConnectionTurboPhoenixOmega6719 = FrostHunterExecutorSolarPhoenix3849.FrostHunterServiceConnectionTurboPhoenixOmega6719(width, height, frostHunterGestureDetectorForceTitan2560, frostHunterLicensingAlphaTitanElite7131, (FrostHunterGestureDetectorForceTitan2560) FrostHunterBannerAdTitanVisionDragon3523.FrostHunterEditTextPulseHyperion1262(frostHunterCameraViewTitaniumHyperionEclipse8189, frostHunterInstrumentationStrikeBlazeThunder7469));
        int i = (int) (FrostHunterServiceConnectionTurboPhoenixOmega6719 >> 32);
        int i2 = (int) (FrostHunterServiceConnectionTurboPhoenixOmega6719 & 4294967295L);
        if (width > 0 && height > 0 && (width != i || height != i2)) {
            FrostHunterCameraViewTitaniumHyperionEclipse8189 frostHunterCameraViewTitaniumHyperionEclipse81892 = frostHunterTranslateAnimationVisionBetaPulse4522.FrostHunterConstraintSetCloneMasterUltraRogue2633;
            double FrostHunterLightSensorForceFusion4241 = FrostHunterExecutorSolarPhoenix3849.FrostHunterLightSensorForceFusion4241(width, height, i, i2, frostHunterCameraViewTitaniumHyperionEclipse81892.FrostHunterBundlePulseFusionHero2475, (FrostHunterGestureDetectorForceTitan2560) FrostHunterBannerAdTitanVisionDragon3523.FrostHunterEditTextPulseHyperion1262(frostHunterCameraViewTitaniumHyperionEclipse81892, frostHunterInstrumentationStrikeBlazeThunder7469));
            boolean z = FrostHunterLightSensorForceFusion4241 < 1.0d;
            this.FrostHunterConstraintSetCloneMasterUltraRogue2633.FrostHunterCameraXPixelTurboCosmos9814 = z;
            if (z || frostHunterTranslateAnimationVisionBetaPulse4522.FrostHunterConstraintSetCloneMasterUltraRogue2633.FrostHunterServiceEliteCelestialThunder1757 == FrostHunterVectorDrawableCompatDeltaInferno6148.FrostHunterCameraXPixelTurboCosmos9814) {
                imageDecoder.setTargetSize(FrostHunterCardViewHyperionAurora3829.FrostHunterRunnableCosmosCelestial4235(width * FrostHunterLightSensorForceFusion4241), FrostHunterCardViewHyperionAurora3829.FrostHunterRunnableCosmosCelestial4235(FrostHunterLightSensorForceFusion4241 * height));
            }
        }
        imageDecoder.setOnPartialImageListener(new FrostHunterServiceConnectionAlphaPixel9197());
        FrostHunterCameraViewTitaniumHyperionEclipse8189 frostHunterCameraViewTitaniumHyperionEclipse81893 = frostHunterTranslateAnimationVisionBetaPulse4522.FrostHunterConstraintSetCloneMasterUltraRogue2633;
        imageDecoder.setAllocator(FrostHunterCanvasInfernoVortex4700.FrostHunterPermissionInfoAlphaDelta6279(FrostHunterEditTextTurboBetaElite4670.FrostHunterAlphaAnimationNeoCosmos5761(frostHunterCameraViewTitaniumHyperionEclipse81893)) ? 3 : 1);
        imageDecoder.setMemorySizePolicy(!((Boolean) FrostHunterBannerAdTitanVisionDragon3523.FrostHunterEditTextPulseHyperion1262(frostHunterCameraViewTitaniumHyperionEclipse81893, FrostHunterEditTextTurboBetaElite4670.FrostHunterRemoteConfigSpeedSpeed8566)).booleanValue() ? 1 : 0);
        FrostHunterInstrumentationStrikeBlazeThunder7469 frostHunterInstrumentationStrikeBlazeThunder74692 = FrostHunterEditTextTurboBetaElite4670.FrostHunterBundlePulseFusionHero2475;
        if (FrostHunterOnGlobalLayoutListenerCyberShadowFusion9348.FrostHunterServiceEliteCelestialThunder1757(FrostHunterBannerAdTitanVisionDragon3523.FrostHunterEditTextPulseHyperion1262(frostHunterCameraViewTitaniumHyperionEclipse81893, frostHunterInstrumentationStrikeBlazeThunder74692)) != null) {
            imageDecoder.setTargetColorSpace(FrostHunterOnGlobalLayoutListenerCyberShadowFusion9348.FrostHunterServiceEliteCelestialThunder1757(FrostHunterBannerAdTitanVisionDragon3523.FrostHunterEditTextPulseHyperion1262(frostHunterCameraViewTitaniumHyperionEclipse81893, frostHunterInstrumentationStrikeBlazeThunder74692)));
        }
        imageDecoder.setUnpremultipliedRequired(!((Boolean) FrostHunterBannerAdTitanVisionDragon3523.FrostHunterEditTextPulseHyperion1262(frostHunterCameraViewTitaniumHyperionEclipse81893, FrostHunterEditTextTurboBetaElite4670.FrostHunterServiceEliteCelestialThunder1757)).booleanValue());
    }
}
