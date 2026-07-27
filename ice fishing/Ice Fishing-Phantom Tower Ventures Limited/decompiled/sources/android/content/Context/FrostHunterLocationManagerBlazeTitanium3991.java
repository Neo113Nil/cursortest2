package android.content.Context;

import android.os.Handler;
import android.os.Message;
import android.os.SystemClock;
import android.view.Surface;

/* compiled from: r8-map-id-ad53bc00775cc49f3760de3ef5ee15f0f7d4eb373264baa1785c3fa1a15d54ed */
/* loaded from: classes.dex */
public final class FrostHunterLocationManagerBlazeTitanium3991 implements Handler.Callback {
    public final Handler FrostHunterCameraXPixelTurboCosmos9814;
    public final /* synthetic */ FrostHunterFilterBetaTurboEclipse8836 FrostHunterFlowMaxDragonHero5809;

    public FrostHunterLocationManagerBlazeTitanium3991(FrostHunterFilterBetaTurboEclipse8836 frostHunterFilterBetaTurboEclipse8836, FrostHunterIntentSpeedCyber8582 frostHunterIntentSpeedCyber8582) {
        this.FrostHunterFlowMaxDragonHero5809 = frostHunterFilterBetaTurboEclipse8836;
        Handler FrostHunterKeyframeGammaGamma1197 = FrostHunterGyroscopeHeroAlpha1995.FrostHunterKeyframeGammaGamma1197(this);
        this.FrostHunterCameraXPixelTurboCosmos9814 = FrostHunterKeyframeGammaGamma1197;
        frostHunterIntentSpeedCyber8582.FrostHunterDialogFragmentTurboPhoenixDragon7627(this, FrostHunterKeyframeGammaGamma1197);
    }

    public final void FrostHunterAlphaAnimationNeoCosmos5761(long j) {
        Surface surface;
        FrostHunterFilterBetaTurboEclipse8836 frostHunterFilterBetaTurboEclipse8836 = this.FrostHunterFlowMaxDragonHero5809;
        FrostHunterStorageDeltaInferno9007 frostHunterStorageDeltaInferno9007 = frostHunterFilterBetaTurboEclipse8836.FrostHunterShapeAppearanceDragonCelestialMega9459;
        if (this != frostHunterFilterBetaTurboEclipse8836.FrostHunterActionBarCosmosPhoenixDelta7435 || frostHunterFilterBetaTurboEclipse8836.FrostHunterRemoteConfigThunderShadow4435 == null) {
            return;
        }
        if (j == Long.MAX_VALUE) {
            frostHunterFilterBetaTurboEclipse8836.FrostHunterExecutorNeoDragonMax5687 = true;
            return;
        }
        try {
            frostHunterFilterBetaTurboEclipse8836.FrostHunterItemDecorationPixelShadow2695(j);
            FrostHunterCoroutineSolarPixel5536 frostHunterCoroutineSolarPixel5536 = frostHunterFilterBetaTurboEclipse8836.FrostHunterPagingDataThunderPhoenixGamma6126;
            if (!frostHunterCoroutineSolarPixel5536.equals(FrostHunterCoroutineSolarPixel5536.FrostHunterServiceEliteCelestialThunder1757) && !frostHunterCoroutineSolarPixel5536.equals(frostHunterFilterBetaTurboEclipse8836.FrostHunterTextRecognitionTurboSpeedStorm6151)) {
                frostHunterFilterBetaTurboEclipse8836.FrostHunterTextRecognitionTurboSpeedStorm6151 = frostHunterCoroutineSolarPixel5536;
                frostHunterStorageDeltaInferno9007.FrostHunterConstraintSetCloneMasterUltraRogue2633(frostHunterCoroutineSolarPixel5536);
            }
            frostHunterFilterBetaTurboEclipse8836.FrostHunterFlipAnimationPrimeOlympian7620.FrostHunterLifecycleBlazeGammaElite2889++;
            FrostHunterIntentMasterMax5923 frostHunterIntentMasterMax5923 = frostHunterFilterBetaTurboEclipse8836.FrostHunterCombineOmegaForceLegend1540;
            boolean z = frostHunterIntentMasterMax5923.FrostHunterLifecycleBlazeGammaElite2889 != 3;
            frostHunterIntentMasterMax5923.FrostHunterLifecycleBlazeGammaElite2889 = 3;
            frostHunterIntentMasterMax5923.FrostHunterFragmentBetaMegaVortex6025.getClass();
            frostHunterIntentMasterMax5923.FrostHunterRemoteConfigSpeedSpeed8566 = FrostHunterGyroscopeHeroAlpha1995.FrostHunterDatabaseEliteShadowUltra2452(SystemClock.elapsedRealtime());
            if (z && (surface = frostHunterFilterBetaTurboEclipse8836.FrostHunterTransitionManagerMegaSpark4983) != null) {
                Handler handler = frostHunterStorageDeltaInferno9007.FrostHunterAlphaAnimationNeoCosmos5761;
                if (handler != null) {
                    handler.post(new FrostHunterDialogFragmentAuroraOmega2719(frostHunterStorageDeltaInferno9007, surface, SystemClock.elapsedRealtime(), 4));
                }
                frostHunterFilterBetaTurboEclipse8836.FrostHunterAudioManagerSpeedStrikeUltra5694 = true;
            }
            frostHunterFilterBetaTurboEclipse8836.FrostHunterInAppPurchaseLegendEpicDragon4579(j);
        } catch (FrostHunterAnimatedVectorDrawablePhoenixEclipseHero3868 e) {
            frostHunterFilterBetaTurboEclipse8836.FrostHunterItemDecorationPixelShadow2695 = e;
        }
    }

    @Override // android.os.Handler.Callback
    public final boolean handleMessage(Message message) {
        if (message.what != 0) {
            return false;
        }
        int i = message.arg1;
        int i2 = message.arg2;
        String str = FrostHunterGyroscopeHeroAlpha1995.FrostHunterAlphaAnimationNeoCosmos5761;
        FrostHunterAlphaAnimationNeoCosmos5761(((i & 4294967295L) << 32) | (4294967295L & i2));
        return true;
    }
}
