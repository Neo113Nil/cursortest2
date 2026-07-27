package android.content.Context;

import android.content.Context;
import android.content.res.AssetFileDescriptor;
import android.graphics.Bitmap;
import android.graphics.ImageDecoder;
import android.os.Build;
import android.system.ErrnoException;
import android.system.Os;
import android.system.OsConstants;

/* compiled from: r8-map-id-ad53bc00775cc49f3760de3ef5ee15f0f7d4eb373264baa1785c3fa1a15d54ed */
/* loaded from: classes.dex */
public final class FrostHunterNotificationManagerSpectraCosmosSolar9460 implements FrostHunterRunnableHyperionVortex7742 {
    public final FrostHunterR8CosmosThunder5511 FrostHunterAlphaAnimationNeoCosmos5761;

    public FrostHunterNotificationManagerSpectraCosmosSolar9460(FrostHunterR8CosmosThunder5511 frostHunterR8CosmosThunder5511) {
        this.FrostHunterAlphaAnimationNeoCosmos5761 = frostHunterR8CosmosThunder5511;
    }

    /* JADX WARN: Code restructure failed: missing block: B:4:0x000f, code lost:
    
        if (r0 == r2) goto L6;
     */
    @Override // android.content.Context.FrostHunterRunnableHyperionVortex7742
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final FrostHunterTranslateAnimationVisionBetaPulse4522 FrostHunterAlphaAnimationNeoCosmos5761(FrostHunterBannerAdNeoHyper7007 frostHunterBannerAdNeoHyper7007, FrostHunterCameraViewTitaniumHyperionEclipse8189 frostHunterCameraViewTitaniumHyperionEclipse8189) {
        ImageDecoder.Source createSource;
        FrostHunterCoroutineScopePrimeSpark1417 FrostHunterLintTitanVortexQuantum9911;
        Bitmap.Config config;
        Bitmap.Config FrostHunterAlphaAnimationNeoCosmos5761 = FrostHunterEditTextTurboBetaElite4670.FrostHunterAlphaAnimationNeoCosmos5761(frostHunterCameraViewTitaniumHyperionEclipse8189);
        Context context = frostHunterCameraViewTitaniumHyperionEclipse8189.FrostHunterAlphaAnimationNeoCosmos5761;
        if (FrostHunterAlphaAnimationNeoCosmos5761 != Bitmap.Config.ARGB_8888) {
            config = Bitmap.Config.HARDWARE;
        }
        FrostHunterNotificationManagerPulsePulseNeo9042 frostHunterNotificationManagerPulsePulseNeo9042 = frostHunterBannerAdNeoHyper7007.FrostHunterAlphaAnimationNeoCosmos5761;
        if (frostHunterNotificationManagerPulsePulseNeo9042.getFileSystem() != FrostHunterRemoteModelManagerPrimeStrikePrime5960.FrostHunterCameraXPixelTurboCosmos9814 || (FrostHunterLintTitanVortexQuantum9911 = frostHunterNotificationManagerPulsePulseNeo9042.FrostHunterLintTitanVortexQuantum9911()) == null) {
            FrostHunterDiffUtilQuantumNebulaTurbo2317 FrostHunterCameraXTurboCelestialHero5430 = frostHunterNotificationManagerPulsePulseNeo9042.FrostHunterCameraXTurboCelestialHero5430();
            if (FrostHunterCameraXTurboCelestialHero5430 instanceof FrostHunterColorStateListHeroOmegaBeta8611) {
                createSource = ImageDecoder.createSource(context.getAssets(), ((FrostHunterColorStateListHeroOmegaBeta8611) FrostHunterCameraXTurboCelestialHero5430).FrostHunterCameraXTurboCelestialHero5430);
            } else if (!(FrostHunterCameraXTurboCelestialHero5430 instanceof FrostHunterAlphaAnimationHeroNebulaTitan9171) || Build.VERSION.SDK_INT < 29) {
                if (FrostHunterCameraXTurboCelestialHero5430 instanceof FrostHunterGradlePhantomPixelNebula5099) {
                    FrostHunterGradlePhantomPixelNebula5099 frostHunterGradlePhantomPixelNebula5099 = (FrostHunterGradlePhantomPixelNebula5099) FrostHunterCameraXTurboCelestialHero5430;
                    if (frostHunterGradlePhantomPixelNebula5099.FrostHunterCameraXTurboCelestialHero5430.equals(context.getPackageName())) {
                        createSource = ImageDecoder.createSource(context.getResources(), frostHunterGradlePhantomPixelNebula5099.FrostHunterResourcesTitanHyperVision5823);
                    }
                }
                if (FrostHunterCameraXTurboCelestialHero5430 instanceof FrostHunterRunnableShadowNeoDragon8291) {
                    createSource = ImageDecoder.createSource(((FrostHunterRunnableShadowNeoDragon8291) FrostHunterCameraXTurboCelestialHero5430).FrostHunterCameraXTurboCelestialHero5430);
                }
                createSource = null;
            } else {
                try {
                    AssetFileDescriptor assetFileDescriptor = ((FrostHunterAlphaAnimationHeroNebulaTitan9171) FrostHunterCameraXTurboCelestialHero5430).FrostHunterCameraXTurboCelestialHero5430;
                    Os.lseek(assetFileDescriptor.getFileDescriptor(), assetFileDescriptor.getStartOffset(), OsConstants.SEEK_SET);
                    createSource = ImageDecoder.createSource(new FrostHunterButtonStormVision4803(2, assetFileDescriptor));
                } catch (ErrnoException unused) {
                }
            }
        } else {
            createSource = ImageDecoder.createSource(FrostHunterLintTitanVortexQuantum9911.toFile());
        }
        if (createSource != null) {
            return new FrostHunterTranslateAnimationVisionBetaPulse4522(createSource, frostHunterBannerAdNeoHyper7007.FrostHunterAlphaAnimationNeoCosmos5761, frostHunterCameraViewTitaniumHyperionEclipse8189, this.FrostHunterAlphaAnimationNeoCosmos5761);
        }
        return null;
    }
}
