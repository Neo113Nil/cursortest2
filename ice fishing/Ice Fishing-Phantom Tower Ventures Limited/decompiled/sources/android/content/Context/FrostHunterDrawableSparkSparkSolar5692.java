package android.content.Context;

import android.os.IBinder;
import android.os.RemoteException;
import com.android.installreferrer.api.InstallReferrerClient;
import java.util.concurrent.Callable;
import java.util.concurrent.CancellationException;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;

/* compiled from: r8-map-id-ad53bc00775cc49f3760de3ef5ee15f0f7d4eb373264baa1785c3fa1a15d54ed */
/* loaded from: classes.dex */
public final /* synthetic */ class FrostHunterDrawableSparkSparkSolar5692 implements Runnable {
    public final /* synthetic */ Object FrostHunterAlertDialogAuroraDelta3200;
    public final /* synthetic */ int FrostHunterCameraXPixelTurboCosmos9814;
    public final /* synthetic */ Object FrostHunterFlowMaxDragonHero5809;

    public /* synthetic */ FrostHunterDrawableSparkSparkSolar5692(int i, Object obj, Object obj2) {
        this.FrostHunterCameraXPixelTurboCosmos9814 = i;
        this.FrostHunterFlowMaxDragonHero5809 = obj;
        this.FrostHunterAlertDialogAuroraDelta3200 = obj2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.FrostHunterCameraXPixelTurboCosmos9814) {
            case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                FrostHunterDataBindingNovaXMax2962 frostHunterDataBindingNovaXMax2962 = (FrostHunterDataBindingNovaXMax2962) this.FrostHunterFlowMaxDragonHero5809;
                IBinder iBinder = (IBinder) this.FrostHunterAlertDialogAuroraDelta3200;
                synchronized (frostHunterDataBindingNovaXMax2962) {
                    if (iBinder == null) {
                        frostHunterDataBindingNovaXMax2962.FrostHunterAlphaAnimationNeoCosmos5761("Null service connection");
                    } else {
                        try {
                            frostHunterDataBindingNovaXMax2962.FrostHunterBundlePulseFusionHero2475 = new FrostHunterProximitySensorEpicSolar3138(iBinder);
                            frostHunterDataBindingNovaXMax2962.FrostHunterAlphaAnimationNeoCosmos5761 = 2;
                            ((ScheduledExecutorService) frostHunterDataBindingNovaXMax2962.FrostHunterLevelListDrawableFusionDragonHero2232.FrostHunterBundlePulseFusionHero2475).execute(new FrostHunterDelayQuantumEliteNeo8679(frostHunterDataBindingNovaXMax2962, 0));
                        } catch (RemoteException e) {
                            frostHunterDataBindingNovaXMax2962.FrostHunterAlphaAnimationNeoCosmos5761(e.getMessage());
                        }
                    }
                }
                return;
            case 1:
                synchronized (((FrostHunterServiceConnectionGammaMax9245) this.FrostHunterAlertDialogAuroraDelta3200).FrostHunterAlertDialogAuroraDelta3200) {
                    FrostHunterCrashlyticsBlazeDragon4282 frostHunterCrashlyticsBlazeDragon4282 = (FrostHunterCrashlyticsBlazeDragon4282) ((FrostHunterServiceConnectionGammaMax9245) this.FrostHunterAlertDialogAuroraDelta3200).FrostHunterKeyframeGammaGamma1197;
                    Exception FrostHunterLifecycleBlazeGammaElite2889 = ((FrostHunterGradientDrawablePrimeSpectraUltra1716) this.FrostHunterFlowMaxDragonHero5809).FrostHunterLifecycleBlazeGammaElite2889();
                    FrostHunterCardViewHyperionAurora3829.FrostHunterScaleAnimationStrikeSpark5059(FrostHunterLifecycleBlazeGammaElite2889);
                    frostHunterCrashlyticsBlazeDragon4282.FrostHunterServiceEliteCelestialThunder1757(FrostHunterLifecycleBlazeGammaElite2889);
                }
                return;
            case 2:
                synchronized (((FrostHunterServiceConnectionGammaMax9245) this.FrostHunterAlertDialogAuroraDelta3200).FrostHunterAlertDialogAuroraDelta3200) {
                    ((FrostHunterLocationManagerHeroPhoenixTitanium9045) ((FrostHunterServiceConnectionGammaMax9245) this.FrostHunterAlertDialogAuroraDelta3200).FrostHunterKeyframeGammaGamma1197).FrostHunterConstraintSetCloneMasterUltraRogue2633(((FrostHunterGradientDrawablePrimeSpectraUltra1716) this.FrostHunterFlowMaxDragonHero5809).FrostHunterLevelListDrawableFusionDragonHero2232());
                }
                return;
            case 3:
                FrostHunterDataBindingNovaXMax2962 frostHunterDataBindingNovaXMax29622 = (FrostHunterDataBindingNovaXMax2962) this.FrostHunterFlowMaxDragonHero5809;
                int i = ((FrostHunterShapeAppearanceNebulaAurora4980) this.FrostHunterAlertDialogAuroraDelta3200).FrostHunterAlphaAnimationNeoCosmos5761;
                synchronized (frostHunterDataBindingNovaXMax29622) {
                    FrostHunterShapeAppearanceNebulaAurora4980 frostHunterShapeAppearanceNebulaAurora4980 = (FrostHunterShapeAppearanceNebulaAurora4980) frostHunterDataBindingNovaXMax29622.FrostHunterLifecycleBlazeGammaElite2889.get(i);
                    if (frostHunterShapeAppearanceNebulaAurora4980 != null) {
                        frostHunterDataBindingNovaXMax29622.FrostHunterLifecycleBlazeGammaElite2889.remove(i);
                        frostHunterShapeAppearanceNebulaAurora4980.FrostHunterConstraintSetCloneMasterUltraRogue2633(new FrostHunterRotateAnimationSpectraPhoenixPhantom3899("Timed out waiting for response", null));
                        frostHunterDataBindingNovaXMax29622.FrostHunterBundlePulseFusionHero2475();
                    }
                }
                return;
            case 4:
                FrostHunterServiceConnectionGammaMax9245 frostHunterServiceConnectionGammaMax9245 = (FrostHunterServiceConnectionGammaMax9245) this.FrostHunterAlertDialogAuroraDelta3200;
                FrostHunterGradientDrawablePrimeSpectraUltra1716 frostHunterGradientDrawablePrimeSpectraUltra1716 = (FrostHunterGradientDrawablePrimeSpectraUltra1716) frostHunterServiceConnectionGammaMax9245.FrostHunterKeyframeGammaGamma1197;
                try {
                    FrostHunterGradientDrawablePrimeSpectraUltra1716 FrostHunterKeyframeGammaGamma1197 = ((FrostHunterGradientDrawableAlphaHeroShadow5897) frostHunterServiceConnectionGammaMax9245.FrostHunterAlertDialogAuroraDelta3200).FrostHunterKeyframeGammaGamma1197(((FrostHunterGradientDrawablePrimeSpectraUltra1716) this.FrostHunterFlowMaxDragonHero5809).FrostHunterLevelListDrawableFusionDragonHero2232());
                    FrostHunterPushNotificationUltraQuantum3493 frostHunterPushNotificationUltraQuantum3493 = FrostHunterKeyframeGammaGamma1197.FrostHunterConstraintSetCloneMasterUltraRogue2633;
                    FrostHunterTextInputEditTextBetaTitanDelta2402 frostHunterTextInputEditTextBetaTitanDelta2402 = FrostHunterServiceOlympianTitanPhantom8748.FrostHunterConstraintSetCloneMasterUltraRogue2633;
                    FrostHunterKeyframeGammaGamma1197.FrostHunterConstraintSetCloneMasterUltraRogue2633(frostHunterTextInputEditTextBetaTitanDelta2402, frostHunterServiceConnectionGammaMax9245);
                    frostHunterPushNotificationUltraQuantum3493.FrostHunterLifecycleBlazeGammaElite2889(new FrostHunterServiceConnectionGammaMax9245((Executor) frostHunterTextInputEditTextBetaTitanDelta2402, (FrostHunterCrashlyticsBlazeDragon4282) frostHunterServiceConnectionGammaMax9245));
                    FrostHunterKeyframeGammaGamma1197.FrostHunterLightSensorForceFusion4241();
                    frostHunterPushNotificationUltraQuantum3493.FrostHunterLifecycleBlazeGammaElite2889(new FrostHunterServiceConnectionGammaMax9245((Executor) frostHunterTextInputEditTextBetaTitanDelta2402, (FrostHunterFlatMapVisionVortex6512) frostHunterServiceConnectionGammaMax9245));
                    FrostHunterKeyframeGammaGamma1197.FrostHunterLightSensorForceFusion4241();
                    return;
                } catch (FrostHunterManifestUltraNeoMaster3003 e2) {
                    if (e2.getCause() instanceof Exception) {
                        frostHunterServiceConnectionGammaMax9245.FrostHunterServiceEliteCelestialThunder1757((Exception) e2.getCause());
                        return;
                    } else {
                        frostHunterGradientDrawablePrimeSpectraUltra1716.FrostHunterAlertDialogAuroraDelta3200(e2);
                        return;
                    }
                } catch (CancellationException unused) {
                    frostHunterServiceConnectionGammaMax9245.FrostHunterAlphaAnimationNeoCosmos5761();
                    return;
                } catch (Exception e3) {
                    frostHunterGradientDrawablePrimeSpectraUltra1716.FrostHunterAlertDialogAuroraDelta3200(e3);
                    return;
                }
            default:
                FrostHunterGradientDrawablePrimeSpectraUltra1716 frostHunterGradientDrawablePrimeSpectraUltra17162 = (FrostHunterGradientDrawablePrimeSpectraUltra1716) this.FrostHunterFlowMaxDragonHero5809;
                try {
                    frostHunterGradientDrawablePrimeSpectraUltra17162.FrostHunterKeyframeGammaGamma1197(((Callable) this.FrostHunterAlertDialogAuroraDelta3200).call());
                    return;
                } catch (Exception e4) {
                    frostHunterGradientDrawablePrimeSpectraUltra17162.FrostHunterAlertDialogAuroraDelta3200(e4);
                    return;
                } catch (Throwable th) {
                    frostHunterGradientDrawablePrimeSpectraUltra17162.FrostHunterAlertDialogAuroraDelta3200(new RuntimeException(th));
                    return;
                }
        }
    }

    public /* synthetic */ FrostHunterDrawableSparkSparkSolar5692(FrostHunterRemoteModelManagerBlazeSpectraMax5028 frostHunterRemoteModelManagerBlazeSpectraMax5028, FrostHunterGradientDrawablePrimeSpectraUltra1716 frostHunterGradientDrawablePrimeSpectraUltra1716, int i) {
        this.FrostHunterCameraXPixelTurboCosmos9814 = i;
        this.FrostHunterAlertDialogAuroraDelta3200 = frostHunterRemoteModelManagerBlazeSpectraMax5028;
        this.FrostHunterFlowMaxDragonHero5809 = frostHunterGradientDrawablePrimeSpectraUltra1716;
    }
}
