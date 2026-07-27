package android.content.Context;

import android.content.ComponentName;
import android.content.Context;
import android.content.pm.PackageManager;
import android.content.pm.ServiceInfo;
import android.os.Bundle;
import com.adjust.sdk.Constants;
import com.google.android.datatransport.cct.CctBackendFactory;
import com.google.android.datatransport.runtime.backends.TransportBackendDiscovery;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.TimeUnit;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: r8-map-id-ad53bc00775cc49f3760de3ef5ee15f0f7d4eb373264baa1785c3fa1a15d54ed */
/* loaded from: classes.dex */
public final class FrostHunterKotlinQuantumRogue5892 implements FrostHunterCameraViewVisionMaxCelestial6838, FrostHunterProGuardCyberHyper2901, FrostHunterViewBindingPixelGammaBeta7636, FrostHunterManifestAuroraLegend1794, FrostHunterFragmentAuroraDelta4793, FrostHunterDisplayMetricsMasterPhantomVortex1539 {
    public Object FrostHunterAlertDialogAuroraDelta3200;
    public final /* synthetic */ int FrostHunterCameraXPixelTurboCosmos9814;
    public Object FrostHunterFlowMaxDragonHero5809;

    public FrostHunterKotlinQuantumRogue5892(int i) {
        this.FrostHunterCameraXPixelTurboCosmos9814 = i;
        switch (i) {
            case 1:
                this.FrostHunterFlowMaxDragonHero5809 = new HashMap();
                break;
            case FrostHunterRemoteModelManagerCyberLegend2797.BYTES_FIELD_NUMBER /* 8 */:
                this.FrostHunterAlertDialogAuroraDelta3200 = new FrostHunterStrictModePrimeShadow7851(0);
                this.FrostHunterFlowMaxDragonHero5809 = new FrostHunterStrictModePrimeShadow7851(0);
                break;
            case 9:
                this.FrostHunterAlertDialogAuroraDelta3200 = FrostHunterLiveDataScopeOmegaBeta9836.FrostHunterCameraXPixelTurboCosmos9814(Boolean.FALSE);
                break;
            case 11:
                this.FrostHunterAlertDialogAuroraDelta3200 = new FrostHunterToastHyperTitanThunder2275();
                this.FrostHunterFlowMaxDragonHero5809 = new FrostHunterToastHyperTitanThunder2275();
                break;
            case 13:
                this.FrostHunterAlertDialogAuroraDelta3200 = new FrostHunterObjectAnimatorNeoStrike7090(new FrostHunterOnGlobalLayoutListenerTitanStrikeNovaX1439[16]);
                break;
            case 20:
                this.FrostHunterAlertDialogAuroraDelta3200 = new LinkedHashMap();
                this.FrostHunterFlowMaxDragonHero5809 = new LinkedHashMap();
                break;
            case 25:
                this.FrostHunterAlertDialogAuroraDelta3200 = new FrostHunterGyroscopeNebulaVisionInferno5349(100);
                this.FrostHunterFlowMaxDragonHero5809 = FrostHunterLiveDataScopeOmegaBeta9836.FrostHunterCameraXPixelTurboCosmos9814(Boolean.FALSE);
                break;
            default:
                this.FrostHunterAlertDialogAuroraDelta3200 = new ArrayList();
                this.FrostHunterFlowMaxDragonHero5809 = new HashMap();
                new HashMap();
                break;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v0 */
    /* JADX WARN: Type inference failed for: r4v1, types: [android.content.Context.FrostHunterGradientDrawablePulseDragonInferno9637] */
    /* JADX WARN: Type inference failed for: r4v10 */
    /* JADX WARN: Type inference failed for: r4v11 */
    /* JADX WARN: Type inference failed for: r4v3 */
    /* JADX WARN: Type inference failed for: r4v4, types: [android.content.Context.FrostHunterGradientDrawablePulseDragonInferno9637] */
    /* JADX WARN: Type inference failed for: r4v5, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v6 */
    /* JADX WARN: Type inference failed for: r4v7 */
    /* JADX WARN: Type inference failed for: r4v8 */
    /* JADX WARN: Type inference failed for: r4v9 */
    /* JADX WARN: Type inference failed for: r5v0 */
    /* JADX WARN: Type inference failed for: r5v1 */
    /* JADX WARN: Type inference failed for: r5v10 */
    /* JADX WARN: Type inference failed for: r5v11 */
    /* JADX WARN: Type inference failed for: r5v2 */
    /* JADX WARN: Type inference failed for: r5v3, types: [android.content.Context.FrostHunterObjectAnimatorNeoStrike7090] */
    /* JADX WARN: Type inference failed for: r5v4 */
    /* JADX WARN: Type inference failed for: r5v5 */
    /* JADX WARN: Type inference failed for: r5v6, types: [android.content.Context.FrostHunterObjectAnimatorNeoStrike7090] */
    /* JADX WARN: Type inference failed for: r5v8 */
    /* JADX WARN: Type inference failed for: r5v9 */
    public static void FrostHunterAlertDialogAuroraDelta3200(FrostHunterOnGlobalLayoutListenerTitanStrikeNovaX1439 frostHunterOnGlobalLayoutListenerTitanStrikeNovaX1439) {
        if (frostHunterOnGlobalLayoutListenerTitanStrikeNovaX1439.FrostHunterRemoteConfigThunderShadow4435 > 0) {
            if (frostHunterOnGlobalLayoutListenerTitanStrikeNovaX1439.FrostHunterR8MasterNebulaSpark7247.FrostHunterBundlePulseFusionHero2475 == FrostHunterGeocoderQuantumStrikeNebula5853.FrostHunterFragmentBetaMegaVortex6025 && !frostHunterOnGlobalLayoutListenerTitanStrikeNovaX1439.FrostHunterLightSensorForceFusion4241() && !frostHunterOnGlobalLayoutListenerTitanStrikeNovaX1439.FrostHunterScaleAnimationStrikeSpark5059() && !frostHunterOnGlobalLayoutListenerTitanStrikeNovaX1439.FrostHunterPushNotificationStormTitanGamma8999 && frostHunterOnGlobalLayoutListenerTitanStrikeNovaX1439.FrostHunterMediaPlayerCelestialBetaTitan3868()) {
                FrostHunterGradientDrawablePulseDragonInferno9637 frostHunterGradientDrawablePulseDragonInferno9637 = (FrostHunterGradientDrawablePulseDragonInferno9637) frostHunterOnGlobalLayoutListenerTitanStrikeNovaX1439.FrostHunterPagingDataTurboTitanium7332.FrostHunterAlertDialogAuroraDelta3200;
                if ((frostHunterGradientDrawablePulseDragonInferno9637.FrostHunterKeyframeGammaGamma1197 & 256) != 0) {
                    while (frostHunterGradientDrawablePulseDragonInferno9637 != null) {
                        if ((frostHunterGradientDrawablePulseDragonInferno9637.FrostHunterAlertDialogAuroraDelta3200 & 256) != 0) {
                            FrostHunterToolbarVortexMaster1971 frostHunterToolbarVortexMaster1971 = frostHunterGradientDrawablePulseDragonInferno9637;
                            ?? r5 = 0;
                            while (frostHunterToolbarVortexMaster1971 != 0) {
                                if (frostHunterToolbarVortexMaster1971 instanceof FrostHunterStrictModeAlphaLegendTitan1578) {
                                    FrostHunterStrictModeAlphaLegendTitan1578 frostHunterStrictModeAlphaLegendTitan1578 = (FrostHunterStrictModeAlphaLegendTitan1578) frostHunterToolbarVortexMaster1971;
                                    frostHunterStrictModeAlphaLegendTitan1578.FrostHunterServiceInfoHyperionSparkMax9966(FrostHunterRemoteConfigPhantomDelta1739.FrostHunterR8MasterNebulaSpark7247(frostHunterStrictModeAlphaLegendTitan1578, 256));
                                } else if ((frostHunterToolbarVortexMaster1971.FrostHunterAlertDialogAuroraDelta3200 & 256) != 0 && (frostHunterToolbarVortexMaster1971 instanceof FrostHunterToolbarVortexMaster1971)) {
                                    FrostHunterGradientDrawablePulseDragonInferno9637 frostHunterGradientDrawablePulseDragonInferno96372 = frostHunterToolbarVortexMaster1971.FrostHunterBitmapTurboDeltaNebula8743;
                                    int i = 0;
                                    frostHunterToolbarVortexMaster1971 = frostHunterToolbarVortexMaster1971;
                                    r5 = r5;
                                    while (frostHunterGradientDrawablePulseDragonInferno96372 != null) {
                                        if ((frostHunterGradientDrawablePulseDragonInferno96372.FrostHunterAlertDialogAuroraDelta3200 & 256) != 0) {
                                            i++;
                                            r5 = r5;
                                            if (i == 1) {
                                                frostHunterToolbarVortexMaster1971 = frostHunterGradientDrawablePulseDragonInferno96372;
                                            } else {
                                                if (r5 == 0) {
                                                    r5 = new FrostHunterObjectAnimatorNeoStrike7090(new FrostHunterGradientDrawablePulseDragonInferno9637[16]);
                                                }
                                                if (frostHunterToolbarVortexMaster1971 != 0) {
                                                    r5.FrostHunterConstraintSetCloneMasterUltraRogue2633(frostHunterToolbarVortexMaster1971);
                                                    frostHunterToolbarVortexMaster1971 = 0;
                                                }
                                                r5.FrostHunterConstraintSetCloneMasterUltraRogue2633(frostHunterGradientDrawablePulseDragonInferno96372);
                                            }
                                        }
                                        frostHunterGradientDrawablePulseDragonInferno96372 = frostHunterGradientDrawablePulseDragonInferno96372.FrostHunterServiceConnectionTurboPhoenixOmega6719;
                                        frostHunterToolbarVortexMaster1971 = frostHunterToolbarVortexMaster1971;
                                        r5 = r5;
                                    }
                                    if (i == 1) {
                                    }
                                }
                                frostHunterToolbarVortexMaster1971 = FrostHunterRemoteConfigPhantomDelta1739.FrostHunterScaleAnimationStrikeSpark5059(r5);
                            }
                        }
                        if ((frostHunterGradientDrawablePulseDragonInferno9637.FrostHunterKeyframeGammaGamma1197 & 256) == 0) {
                            break;
                        } else {
                            frostHunterGradientDrawablePulseDragonInferno9637 = frostHunterGradientDrawablePulseDragonInferno9637.FrostHunterServiceConnectionTurboPhoenixOmega6719;
                        }
                    }
                }
            }
            frostHunterOnGlobalLayoutListenerTitanStrikeNovaX1439.FrostHunterRewardedAdSpectraElite8288 = false;
            FrostHunterObjectAnimatorNeoStrike7090 FrostHunterDialogFragmentTurboPhoenixDragon7627 = frostHunterOnGlobalLayoutListenerTitanStrikeNovaX1439.FrostHunterDialogFragmentTurboPhoenixDragon7627();
            Object[] objArr = FrostHunterDialogFragmentTurboPhoenixDragon7627.FrostHunterCameraXPixelTurboCosmos9814;
            int i2 = FrostHunterDialogFragmentTurboPhoenixDragon7627.FrostHunterAlertDialogAuroraDelta3200;
            for (int i3 = 0; i3 < i2; i3++) {
                FrostHunterAlertDialogAuroraDelta3200((FrostHunterOnGlobalLayoutListenerTitanStrikeNovaX1439) objArr[i3]);
            }
        }
    }

    @Override // android.content.Context.FrostHunterCameraViewVisionMaxCelestial6838
    /* renamed from: FrostHunterAlphaAnimationNeoCosmos5761 */
    public void mo6FrostHunterAlphaAnimationNeoCosmos5761(Object obj) {
        switch (this.FrostHunterCameraXPixelTurboCosmos9814) {
            case 3:
                FrostHunterMenuNeoPrime3001 frostHunterMenuNeoPrime3001 = (FrostHunterMenuNeoPrime3001) obj;
                frostHunterMenuNeoPrime3001.getClass();
                if (!frostHunterMenuNeoPrime3001.equals(FrostHunterAlertDialogMegaPixelThunder1385.FrostHunterAlphaAnimationNeoCosmos5761)) {
                    if (!(frostHunterMenuNeoPrime3001 instanceof FrostHunterFCMOmegaStormLegend9803)) {
                        FrostHunterAdapterDelegateDragonVision1098.FrostHunterConstraintSetCloneMasterUltraRogue2633();
                        break;
                    } else {
                        ((FrostHunterAnimatorQuantumFusionMaster8565) this.FrostHunterAlertDialogAuroraDelta3200).mo6FrostHunterAlphaAnimationNeoCosmos5761(((FrostHunterFCMOmegaStormLegend9803) frostHunterMenuNeoPrime3001).FrostHunterAlphaAnimationNeoCosmos5761.FrostHunterAlphaAnimationNeoCosmos5761);
                        break;
                    }
                } else {
                    ((FrostHunterVelocityTrackerThunderAuroraTurbo6999) this.FrostHunterFlowMaxDragonHero5809).FrostHunterBillingClientFusionVortex9008();
                    break;
                }
            default:
                ((FrostHunterCameraViewVisionMaxCelestial6838) this.FrostHunterFlowMaxDragonHero5809).mo6FrostHunterAlphaAnimationNeoCosmos5761(((FrostHunterDiffUtilQuantumNebulaTurbo2317) this.FrostHunterAlertDialogAuroraDelta3200).FrostHunterAlphaAnimationNeoCosmos5761(obj));
                break;
        }
    }

    @Override // android.content.Context.FrostHunterManifestAuroraLegend1794
    public FrostHunterInputMethodManagerHyperOlympian5297 FrostHunterBundlePulseFusionHero2475(FrostHunterPreviewNeoBeta3393 frostHunterPreviewNeoBeta3393, long j) {
        int FrostHunterAlphaAnimationNeoCosmos5761;
        long position = frostHunterPreviewNeoBeta3393.getPosition();
        int min = (int) Math.min(20000L, frostHunterPreviewNeoBeta3393.FrostHunterServiceEliteCelestialThunder1757() - position);
        FrostHunterLicensingSpectraPulse8868 frostHunterLicensingSpectraPulse8868 = (FrostHunterLicensingSpectraPulse8868) this.FrostHunterFlowMaxDragonHero5809;
        frostHunterLicensingSpectraPulse8868.FrostHunterStateCelestialNovaPixel8414(min);
        frostHunterPreviewNeoBeta3393.FrostHunterLintTitanVortexQuantum9911(frostHunterLicensingSpectraPulse8868.FrostHunterAlphaAnimationNeoCosmos5761, 0, min);
        int i = -1;
        int i2 = -1;
        long j2 = -9223372036854775807L;
        while (frostHunterLicensingSpectraPulse8868.FrostHunterAlphaAnimationNeoCosmos5761() >= 4) {
            if (FrostHunterDelaySpectraSpeedHero7686.FrostHunterAlphaAnimationNeoCosmos5761(frostHunterLicensingSpectraPulse8868.FrostHunterAlphaAnimationNeoCosmos5761, frostHunterLicensingSpectraPulse8868.FrostHunterConstraintSetCloneMasterUltraRogue2633) != 442) {
                frostHunterLicensingSpectraPulse8868.FrostHunterFCMDeltaQuantumHero8364(1);
            } else {
                frostHunterLicensingSpectraPulse8868.FrostHunterFCMDeltaQuantumHero8364(4);
                long FrostHunterBundlePulseFusionHero2475 = FrostHunterObjectAnimatorMegaSpark1345.FrostHunterBundlePulseFusionHero2475(frostHunterLicensingSpectraPulse8868);
                if (FrostHunterBundlePulseFusionHero2475 != -9223372036854775807L) {
                    long FrostHunterConstraintSetCloneMasterUltraRogue2633 = ((FrostHunterPaintFlagsDrawFilterPhantomRogue4543) this.FrostHunterAlertDialogAuroraDelta3200).FrostHunterConstraintSetCloneMasterUltraRogue2633(FrostHunterBundlePulseFusionHero2475);
                    if (FrostHunterConstraintSetCloneMasterUltraRogue2633 > j) {
                        return j2 == -9223372036854775807L ? new FrostHunterInputMethodManagerHyperOlympian5297(-1, FrostHunterConstraintSetCloneMasterUltraRogue2633, position) : new FrostHunterInputMethodManagerHyperOlympian5297(0, -9223372036854775807L, position + i2);
                    }
                    j2 = FrostHunterConstraintSetCloneMasterUltraRogue2633;
                    long j3 = 100000 + j2;
                    i2 = frostHunterLicensingSpectraPulse8868.FrostHunterConstraintSetCloneMasterUltraRogue2633;
                    if (j3 > j) {
                        return new FrostHunterInputMethodManagerHyperOlympian5297(0, -9223372036854775807L, position + i2);
                    }
                }
                int i3 = frostHunterLicensingSpectraPulse8868.FrostHunterBundlePulseFusionHero2475;
                if (frostHunterLicensingSpectraPulse8868.FrostHunterAlphaAnimationNeoCosmos5761() >= 10) {
                    frostHunterLicensingSpectraPulse8868.FrostHunterFCMDeltaQuantumHero8364(9);
                    int FrostHunterMeteringPointBetaCyber9571 = frostHunterLicensingSpectraPulse8868.FrostHunterMeteringPointBetaCyber9571() & 7;
                    if (frostHunterLicensingSpectraPulse8868.FrostHunterAlphaAnimationNeoCosmos5761() >= FrostHunterMeteringPointBetaCyber9571) {
                        frostHunterLicensingSpectraPulse8868.FrostHunterFCMDeltaQuantumHero8364(FrostHunterMeteringPointBetaCyber9571);
                        if (frostHunterLicensingSpectraPulse8868.FrostHunterAlphaAnimationNeoCosmos5761() >= 4) {
                            if (FrostHunterDelaySpectraSpeedHero7686.FrostHunterAlphaAnimationNeoCosmos5761(frostHunterLicensingSpectraPulse8868.FrostHunterAlphaAnimationNeoCosmos5761, frostHunterLicensingSpectraPulse8868.FrostHunterConstraintSetCloneMasterUltraRogue2633) == 443) {
                                frostHunterLicensingSpectraPulse8868.FrostHunterFCMDeltaQuantumHero8364(4);
                                int FrostHunterBillingClientFusionVortex9008 = frostHunterLicensingSpectraPulse8868.FrostHunterBillingClientFusionVortex9008();
                                if (frostHunterLicensingSpectraPulse8868.FrostHunterAlphaAnimationNeoCosmos5761() < FrostHunterBillingClientFusionVortex9008) {
                                    frostHunterLicensingSpectraPulse8868.FrostHunterR8MasterNebulaSpark7247(i3);
                                } else {
                                    frostHunterLicensingSpectraPulse8868.FrostHunterFCMDeltaQuantumHero8364(FrostHunterBillingClientFusionVortex9008);
                                }
                            }
                            while (true) {
                                if (frostHunterLicensingSpectraPulse8868.FrostHunterAlphaAnimationNeoCosmos5761() < 4 || (FrostHunterAlphaAnimationNeoCosmos5761 = FrostHunterDelaySpectraSpeedHero7686.FrostHunterAlphaAnimationNeoCosmos5761(frostHunterLicensingSpectraPulse8868.FrostHunterAlphaAnimationNeoCosmos5761, frostHunterLicensingSpectraPulse8868.FrostHunterConstraintSetCloneMasterUltraRogue2633)) == 442 || FrostHunterAlphaAnimationNeoCosmos5761 == 441 || (FrostHunterAlphaAnimationNeoCosmos5761 >>> 8) != 1) {
                                    break;
                                }
                                frostHunterLicensingSpectraPulse8868.FrostHunterFCMDeltaQuantumHero8364(4);
                                if (frostHunterLicensingSpectraPulse8868.FrostHunterAlphaAnimationNeoCosmos5761() < 2) {
                                    frostHunterLicensingSpectraPulse8868.FrostHunterR8MasterNebulaSpark7247(i3);
                                    break;
                                }
                                frostHunterLicensingSpectraPulse8868.FrostHunterR8MasterNebulaSpark7247(Math.min(frostHunterLicensingSpectraPulse8868.FrostHunterBundlePulseFusionHero2475, frostHunterLicensingSpectraPulse8868.FrostHunterConstraintSetCloneMasterUltraRogue2633 + frostHunterLicensingSpectraPulse8868.FrostHunterBillingClientFusionVortex9008()));
                            }
                        } else {
                            frostHunterLicensingSpectraPulse8868.FrostHunterR8MasterNebulaSpark7247(i3);
                        }
                    } else {
                        frostHunterLicensingSpectraPulse8868.FrostHunterR8MasterNebulaSpark7247(i3);
                    }
                } else {
                    frostHunterLicensingSpectraPulse8868.FrostHunterR8MasterNebulaSpark7247(i3);
                }
                i = frostHunterLicensingSpectraPulse8868.FrostHunterConstraintSetCloneMasterUltraRogue2633;
            }
        }
        return j2 != -9223372036854775807L ? new FrostHunterInputMethodManagerHyperOlympian5297(-2, j2, position + i) : FrostHunterInputMethodManagerHyperOlympian5297.FrostHunterLifecycleBlazeGammaElite2889;
    }

    public void FrostHunterCameraXPixelTurboCosmos9814(Object obj, String str) {
        ((ArrayList) this.FrostHunterAlertDialogAuroraDelta3200).add(str + "=" + String.valueOf(obj));
    }

    public void FrostHunterCameraXTurboCelestialHero5430(Bundle bundle) {
        FrostHunterRotateDrawableSparkAurora3314 frostHunterRotateDrawableSparkAurora3314 = (FrostHunterRotateDrawableSparkAurora3314) this.FrostHunterAlertDialogAuroraDelta3200;
        FrostHunterTimerPixelAurora2235 frostHunterTimerPixelAurora2235 = frostHunterRotateDrawableSparkAurora3314.FrostHunterAlphaAnimationNeoCosmos5761;
        if (!frostHunterRotateDrawableSparkAurora3314.FrostHunterLifecycleBlazeGammaElite2889) {
            frostHunterRotateDrawableSparkAurora3314.FrostHunterAlphaAnimationNeoCosmos5761();
        }
        if (frostHunterTimerPixelAurora2235.FrostHunterRemoteConfigSpeedSpeed8566().FrostHunterServiceEliteCelestialThunder1757.compareTo(FrostHunterLicensingBlazeNebula6214.FrostHunterKeyframeGammaGamma1197) >= 0) {
            FrostHunterMaterialCardViewShadowBlazeBlaze3823.FrostHunterServiceConnectionTurboPhoenixOmega6719(frostHunterTimerPixelAurora2235.FrostHunterRemoteConfigSpeedSpeed8566().FrostHunterServiceEliteCelestialThunder1757, "performRestore cannot be called when owner is ");
            return;
        }
        if (frostHunterRotateDrawableSparkAurora3314.FrostHunterRemoteConfigSpeedSpeed8566) {
            FrostHunterFlowHyperionVortexDelta5013.FrostHunterServiceConnectionTurboPhoenixOmega6719("SavedStateRegistry was already restored.");
            return;
        }
        Bundle bundle2 = null;
        if (bundle != null && bundle.containsKey("androidx.lifecycle.BundlableSavedStateRegistry.key")) {
            bundle2 = FrostHunterRemoteConfigPhantomDelta1739.FrostHunterMeteringPointMegaCyber7955(bundle, "androidx.lifecycle.BundlableSavedStateRegistry.key");
        }
        frostHunterRotateDrawableSparkAurora3314.FrostHunterLevelListDrawableFusionDragonHero2232 = bundle2;
        frostHunterRotateDrawableSparkAurora3314.FrostHunterRemoteConfigSpeedSpeed8566 = true;
    }

    @Override // android.content.Context.FrostHunterViewBindingPixelGammaBeta7636
    public List FrostHunterConstraintSetCloneMasterUltraRogue2633(Integer num) {
        List FrostHunterConstraintSetCloneMasterUltraRogue2633 = ((FrostHunterViewBindingPixelGammaBeta7636) this.FrostHunterAlertDialogAuroraDelta3200).FrostHunterConstraintSetCloneMasterUltraRogue2633(null);
        FrostHunterOnClickListenerNebulaStorm6760 frostHunterOnClickListenerNebulaStorm6760 = (FrostHunterOnClickListenerNebulaStorm6760) this.FrostHunterFlowMaxDragonHero5809;
        int i = frostHunterOnClickListenerNebulaStorm6760.FrostHunterMotionSceneAuroraMega2271;
        return i < 0 ? FrostHunterConstraintSetCloneMasterUltraRogue2633 : FrostHunterStrictModeNebulaTitanPrime4338.FrostHunterCoordinatorLayoutGammaTurboSpark2420(FrostHunterBindingAdapterSpeedNeo6677.FrostHunterCameraXPixelTurboCosmos9814(frostHunterOnClickListenerNebulaStorm6760, num, i, Integer.valueOf(frostHunterOnClickListenerNebulaStorm6760.FrostHunterDatabaseEliteShadowUltra2452(i, frostHunterOnClickListenerNebulaStorm6760.FrostHunterConstraintSetCloneMasterUltraRogue2633))), FrostHunterConstraintSetCloneMasterUltraRogue2633);
    }

    public synchronized Map FrostHunterFirebaseModelDownloadConditionsSolarBlaze2223() {
        try {
            if (((Map) this.FrostHunterAlertDialogAuroraDelta3200) == null) {
                this.FrostHunterAlertDialogAuroraDelta3200 = Collections.unmodifiableMap(new HashMap((HashMap) this.FrostHunterFlowMaxDragonHero5809));
            }
        } catch (Throwable th) {
            throw th;
        }
        return (Map) this.FrostHunterAlertDialogAuroraDelta3200;
    }

    public Bundle FrostHunterFlowMaxDragonHero5809(String str) {
        FrostHunterRotateDrawableSparkAurora3314 frostHunterRotateDrawableSparkAurora3314 = (FrostHunterRotateDrawableSparkAurora3314) this.FrostHunterAlertDialogAuroraDelta3200;
        if (!frostHunterRotateDrawableSparkAurora3314.FrostHunterRemoteConfigSpeedSpeed8566) {
            FrostHunterFlowHyperionVortexDelta5013.FrostHunterServiceConnectionTurboPhoenixOmega6719("You can 'consumeRestoredStateForKey' only after the corresponding component has moved to the 'CREATED' state");
            return null;
        }
        Bundle bundle = frostHunterRotateDrawableSparkAurora3314.FrostHunterLevelListDrawableFusionDragonHero2232;
        if (bundle == null) {
            return null;
        }
        Bundle FrostHunterMeteringPointMegaCyber7955 = bundle.containsKey(str) ? FrostHunterRemoteConfigPhantomDelta1739.FrostHunterMeteringPointMegaCyber7955(bundle, str) : null;
        bundle.remove(str);
        if (bundle.isEmpty()) {
            frostHunterRotateDrawableSparkAurora3314.FrostHunterLevelListDrawableFusionDragonHero2232 = null;
        }
        return FrostHunterMeteringPointMegaCyber7955;
    }

    public File FrostHunterFragmentBetaMegaVortex6025() {
        if (((File) this.FrostHunterAlertDialogAuroraDelta3200) == null) {
            synchronized (this) {
                try {
                    if (((File) this.FrostHunterAlertDialogAuroraDelta3200) == null) {
                        com.google.firebase.FrostHunterTransitionManagerOmegaNeoMaster3754 frostHunterTransitionManagerOmegaNeoMaster3754 = (com.google.firebase.FrostHunterTransitionManagerOmegaNeoMaster3754) this.FrostHunterFlowMaxDragonHero5809;
                        frostHunterTransitionManagerOmegaNeoMaster3754.FrostHunterAlphaAnimationNeoCosmos5761();
                        this.FrostHunterAlertDialogAuroraDelta3200 = new File(frostHunterTransitionManagerOmegaNeoMaster3754.FrostHunterAlphaAnimationNeoCosmos5761.getFilesDir(), "PersistedInstallation." + ((com.google.firebase.FrostHunterTransitionManagerOmegaNeoMaster3754) this.FrostHunterFlowMaxDragonHero5809).FrostHunterBundlePulseFusionHero2475() + ".json");
                    }
                } finally {
                }
            }
        }
        return (File) this.FrostHunterAlertDialogAuroraDelta3200;
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x002e  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x002b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public CctBackendFactory FrostHunterKeyframeGammaGamma1197(String str) {
        Bundle bundle;
        Map map;
        PackageManager packageManager;
        ServiceInfo serviceInfo;
        if (((Map) this.FrostHunterFlowMaxDragonHero5809) == null) {
            Context context = (Context) this.FrostHunterAlertDialogAuroraDelta3200;
            try {
                packageManager = context.getPackageManager();
            } catch (PackageManager.NameNotFoundException unused) {
            }
            if (packageManager != null && (serviceInfo = packageManager.getServiceInfo(new ComponentName(context, (Class<?>) TransportBackendDiscovery.class), 128)) != null) {
                bundle = serviceInfo.metaData;
                if (bundle != null) {
                    map = Collections.EMPTY_MAP;
                } else {
                    HashMap hashMap = new HashMap();
                    for (String str2 : bundle.keySet()) {
                        Object obj = bundle.get(str2);
                        if ((obj instanceof String) && str2.startsWith("backend:")) {
                            for (String str3 : ((String) obj).split(",", -1)) {
                                String trim = str3.trim();
                                if (!trim.isEmpty()) {
                                    hashMap.put(trim, str2.substring(8));
                                }
                            }
                        }
                    }
                    map = hashMap;
                }
                this.FrostHunterFlowMaxDragonHero5809 = map;
            }
            bundle = null;
            if (bundle != null) {
            }
            this.FrostHunterFlowMaxDragonHero5809 = map;
        }
        String str4 = (String) ((Map) this.FrostHunterFlowMaxDragonHero5809).get(str);
        if (str4 == null) {
            return null;
        }
        try {
            return (CctBackendFactory) Class.forName(str4).asSubclass(CctBackendFactory.class).getDeclaredConstructor(null).newInstance(null);
        } catch (ClassNotFoundException unused2) {
            StringBuilder sb = new StringBuilder("Class ");
            sb.append(str4);
            sb.append(" is not found.");
            return null;
        } catch (IllegalAccessException unused3) {
            StringBuilder sb2 = new StringBuilder("Could not instantiate ");
            sb2.append(str4);
            sb2.append(".");
            return null;
        } catch (InstantiationException unused4) {
            StringBuilder sb3 = new StringBuilder("Could not instantiate ");
            sb3.append(str4);
            sb3.append(".");
            return null;
        } catch (NoSuchMethodException unused5) {
            "Could not instantiate ".concat(str4);
            return null;
        } catch (InvocationTargetException unused6) {
            "Could not instantiate ".concat(str4);
            return null;
        }
    }

    @Override // android.content.Context.FrostHunterManifestAuroraLegend1794
    public void FrostHunterLevelListDrawableFusionDragonHero2232() {
        FrostHunterLicensingSpectraPulse8868 frostHunterLicensingSpectraPulse8868 = (FrostHunterLicensingSpectraPulse8868) this.FrostHunterFlowMaxDragonHero5809;
        byte[] bArr = FrostHunterGyroscopeHeroAlpha1995.FrostHunterConstraintSetCloneMasterUltraRogue2633;
        frostHunterLicensingSpectraPulse8868.getClass();
        frostHunterLicensingSpectraPulse8868.FrostHunterMagnetometerFusionTitanium8202(bArr, bArr.length);
    }

    /* JADX WARN: Code restructure failed: missing block: B:34:0x00db, code lost:
    
        if (r11 == null) goto L37;
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x00e7, code lost:
    
        r9 = r5;
        r16 = r10;
     */
    /* JADX WARN: Code restructure failed: missing block: B:55:0x0112, code lost:
    
        if (r13 == null) goto L37;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r10v20 */
    /* JADX WARN: Type inference failed for: r10v8 */
    /* JADX WARN: Type inference failed for: r12v4 */
    /* JADX WARN: Type inference failed for: r12v8 */
    /* JADX WARN: Type inference failed for: r14v3 */
    /* JADX WARN: Type inference failed for: r14v7 */
    /* JADX WARN: Type inference failed for: r15v23 */
    @Override // android.content.Context.FrostHunterFragmentAuroraDelta4793
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void FrostHunterLifecycleBlazeGammaElite2889(FrostHunterSurfaceViewPrimeAlphaPulse4865 frostHunterSurfaceViewPrimeAlphaPulse4865, FrostHunterThemeOverlayAlphaUltra2883 frostHunterThemeOverlayAlphaUltra2883) {
        FrostHunterFontFamilySolarSpeedCelestial8941 FrostHunterServiceEliteCelestialThunder1757;
        FrostHunterProfilerPhantomLegendPhoenix6109 FrostHunterAlphaAnimationNeoCosmos5761;
        int intValue;
        int i;
        int i2;
        int i3;
        String str;
        try {
            FrostHunterTraceAuroraFusion8204 FrostHunterAlphaAnimationNeoCosmos57612 = ((FrostHunterMagnetometerTitaniumCyber5302) this.FrostHunterAlertDialogAuroraDelta3200).FrostHunterAlphaAnimationNeoCosmos5761(frostHunterThemeOverlayAlphaUltra2883);
            FrostHunterColorStateListInflaterHeroEclipseOlympian7298 frostHunterColorStateListInflaterHeroEclipseOlympian7298 = frostHunterThemeOverlayAlphaUltra2883.FrostHunterServiceConnectionTurboPhoenixOmega6719;
            int size = frostHunterColorStateListInflaterHeroEclipseOlympian7298.size();
            int i4 = 0;
            int i5 = 0;
            boolean z = 0;
            boolean z2 = 0;
            boolean z3 = 0;
            boolean z4 = 0;
            Integer num = null;
            Integer num2 = null;
            while (i5 < size) {
                int i6 = 1;
                if (frostHunterColorStateListInflaterHeroEclipseOlympian7298.FrostHunterBundlePulseFusionHero2475(i5).equalsIgnoreCase("Sec-WebSocket-Extensions")) {
                    String FrostHunterLifecycleBlazeGammaElite2889 = frostHunterColorStateListInflaterHeroEclipseOlympian7298.FrostHunterLifecycleBlazeGammaElite2889(i5);
                    int i7 = i4;
                    z = z;
                    z2 = z2;
                    z3 = z3;
                    z4 = z4;
                    while (i7 < FrostHunterLifecycleBlazeGammaElite2889.length()) {
                        FrostHunterColorStateListInflaterHeroEclipseOlympian7298 frostHunterColorStateListInflaterHeroEclipseOlympian72982 = frostHunterColorStateListInflaterHeroEclipseOlympian7298;
                        int FrostHunterServiceEliteCelestialThunder17572 = FrostHunterFirebasePhantomVisionOlympian3288.FrostHunterServiceEliteCelestialThunder1757(FrostHunterLifecycleBlazeGammaElite2889, ',', i7, i4, 4);
                        int FrostHunterBundlePulseFusionHero2475 = FrostHunterFirebasePhantomVisionOlympian3288.FrostHunterBundlePulseFusionHero2475(FrostHunterLifecycleBlazeGammaElite2889, ';', i7, FrostHunterServiceEliteCelestialThunder17572);
                        int FrostHunterRemoteConfigSpeedSpeed8566 = FrostHunterFirebasePhantomVisionOlympian3288.FrostHunterRemoteConfigSpeedSpeed8566(FrostHunterLifecycleBlazeGammaElite2889, i7, FrostHunterBundlePulseFusionHero2475);
                        String substring = FrostHunterLifecycleBlazeGammaElite2889.substring(FrostHunterRemoteConfigSpeedSpeed8566, FrostHunterFirebasePhantomVisionOlympian3288.FrostHunterCameraXPixelTurboCosmos9814(FrostHunterLifecycleBlazeGammaElite2889, FrostHunterRemoteConfigSpeedSpeed8566, FrostHunterBundlePulseFusionHero2475));
                        i7 = FrostHunterBundlePulseFusionHero2475 + 1;
                        int i8 = z4;
                        if (substring.equalsIgnoreCase("permessage-deflate")) {
                            if (z != 0) {
                                i8 = i6;
                            }
                            while (i7 < FrostHunterServiceEliteCelestialThunder17572) {
                                int FrostHunterBundlePulseFusionHero24752 = FrostHunterFirebasePhantomVisionOlympian3288.FrostHunterBundlePulseFusionHero2475(FrostHunterLifecycleBlazeGammaElite2889, ';', i7, FrostHunterServiceEliteCelestialThunder17572);
                                int FrostHunterBundlePulseFusionHero24753 = FrostHunterFirebasePhantomVisionOlympian3288.FrostHunterBundlePulseFusionHero2475(FrostHunterLifecycleBlazeGammaElite2889, '=', i7, FrostHunterBundlePulseFusionHero24752);
                                int FrostHunterRemoteConfigSpeedSpeed85662 = FrostHunterFirebasePhantomVisionOlympian3288.FrostHunterRemoteConfigSpeedSpeed8566(FrostHunterLifecycleBlazeGammaElite2889, i7, FrostHunterBundlePulseFusionHero24753);
                                String substring2 = FrostHunterLifecycleBlazeGammaElite2889.substring(FrostHunterRemoteConfigSpeedSpeed85662, FrostHunterFirebasePhantomVisionOlympian3288.FrostHunterCameraXPixelTurboCosmos9814(FrostHunterLifecycleBlazeGammaElite2889, FrostHunterRemoteConfigSpeedSpeed85662, FrostHunterBundlePulseFusionHero24753));
                                if (FrostHunterBundlePulseFusionHero24753 < FrostHunterBundlePulseFusionHero24752) {
                                    int FrostHunterRemoteConfigSpeedSpeed85663 = FrostHunterFirebasePhantomVisionOlympian3288.FrostHunterRemoteConfigSpeedSpeed8566(FrostHunterLifecycleBlazeGammaElite2889, FrostHunterBundlePulseFusionHero24753 + 1, FrostHunterBundlePulseFusionHero24752);
                                    str = FrostHunterLifecycleBlazeGammaElite2889.substring(FrostHunterRemoteConfigSpeedSpeed85663, FrostHunterFirebasePhantomVisionOlympian3288.FrostHunterCameraXPixelTurboCosmos9814(FrostHunterLifecycleBlazeGammaElite2889, FrostHunterRemoteConfigSpeedSpeed85663, FrostHunterBundlePulseFusionHero24752));
                                    i = FrostHunterServiceEliteCelestialThunder17572;
                                    i2 = size;
                                    if (str.length() < 2) {
                                        i3 = i6;
                                    } else if (FrostHunterFocusMeteringActionShadowLegend9828.FrostHunterCameraXTurboCelestialHero5430(str, "\"", false) && FrostHunterFocusMeteringActionShadowLegend9828.FrostHunterLightSensorForceFusion4241(str, "\"", false)) {
                                        i3 = i6;
                                        str = str.substring(i3, str.length() - 1);
                                    } else {
                                        i3 = i6;
                                    }
                                } else {
                                    i = FrostHunterServiceEliteCelestialThunder17572;
                                    i2 = size;
                                    i3 = i6;
                                    str = null;
                                }
                                int i9 = FrostHunterBundlePulseFusionHero24752 + 1;
                                i8 = i8;
                                if (substring2.equalsIgnoreCase("client_max_window_bits")) {
                                    if (num != null) {
                                        i8 = i3;
                                    }
                                    num = str != null ? FrostHunterFocusMeteringActionShadowLegend9828.FrostHunterResourcesTitanHyperVision5823(str) : null;
                                } else {
                                    i8 = i8;
                                    if (substring2.equalsIgnoreCase("client_no_context_takeover")) {
                                        if (z2 != 0) {
                                            i8 = i3;
                                        }
                                        if (str != null) {
                                            i8 = i3;
                                        }
                                        i7 = i9;
                                        z2 = i3;
                                        i6 = z2 ? 1 : 0;
                                    } else {
                                        i8 = i8;
                                        if (substring2.equalsIgnoreCase("server_max_window_bits")) {
                                            if (num2 != null) {
                                                i8 = i3;
                                            }
                                            num2 = str != null ? FrostHunterFocusMeteringActionShadowLegend9828.FrostHunterResourcesTitanHyperVision5823(str) : null;
                                        } else {
                                            i8 = i8;
                                            if (substring2.equalsIgnoreCase("server_no_context_takeover")) {
                                                if (z3 != 0) {
                                                    i8 = i3;
                                                }
                                                if (str != null) {
                                                    i8 = i3;
                                                }
                                                i7 = i9;
                                                z3 = i3;
                                                i6 = z3 ? 1 : 0;
                                            }
                                        }
                                        i7 = i9;
                                        i8 = i3;
                                        i6 = i8 == true ? 1 : 0;
                                    }
                                }
                                FrostHunterServiceEliteCelestialThunder17572 = i;
                                size = i2;
                            }
                            z = i6;
                        } else {
                            i8 = i6;
                        }
                        frostHunterColorStateListInflaterHeroEclipseOlympian7298 = frostHunterColorStateListInflaterHeroEclipseOlympian72982;
                        i4 = 0;
                        z = z;
                        z2 = z2;
                        z3 = z3;
                        z4 = i8;
                    }
                }
                i5++;
                i4 = i4;
                frostHunterColorStateListInflaterHeroEclipseOlympian7298 = frostHunterColorStateListInflaterHeroEclipseOlympian7298;
                size = size;
                z = z;
                z2 = z2;
                z3 = z3;
                z4 = z4;
            }
            int i10 = 1;
            ((FrostHunterMagnetometerTitaniumCyber5302) this.FrostHunterAlertDialogAuroraDelta3200).FrostHunterServiceEliteCelestialThunder1757 = new FrostHunterMotionLayoutTransitionSpeedAlphaInferno9042(z, num, z2, num2, z3, z4);
            if (z4 != 0 || num != null || (num2 != null && (8 > (intValue = num2.intValue()) || intValue >= 16))) {
                FrostHunterMagnetometerTitaniumCyber5302 frostHunterMagnetometerTitaniumCyber5302 = (FrostHunterMagnetometerTitaniumCyber5302) this.FrostHunterAlertDialogAuroraDelta3200;
                synchronized (frostHunterMagnetometerTitaniumCyber5302) {
                    frostHunterMagnetometerTitaniumCyber5302.FrostHunterFirebaseModelDownloadConditionsSolarBlaze2223.clear();
                    frostHunterMagnetometerTitaniumCyber5302.FrostHunterConstraintSetCloneMasterUltraRogue2633("unexpected Sec-WebSocket-Extensions in response header", 1010);
                }
            }
            String str2 = FrostHunterTextureViewForceEpicQuantum6388.FrostHunterConstraintSetCloneMasterUltraRogue2633 + " WebSocket " + ((FrostHunterLifecycleCameraControllerStormAlpha3266) this.FrostHunterFlowMaxDragonHero5809).FrostHunterAlphaAnimationNeoCosmos5761.FrostHunterLevelListDrawableFusionDragonHero2232();
            FrostHunterMagnetometerTitaniumCyber5302 frostHunterMagnetometerTitaniumCyber53022 = (FrostHunterMagnetometerTitaniumCyber5302) this.FrostHunterAlertDialogAuroraDelta3200;
            FrostHunterTraceHyperionAuroraNebula9947 frostHunterTraceHyperionAuroraNebula9947 = new FrostHunterTraceHyperionAuroraNebula9947(FrostHunterAlphaAnimationNeoCosmos57612);
            FrostHunterMotionLayoutTransitionSpeedAlphaInferno9042 frostHunterMotionLayoutTransitionSpeedAlphaInferno9042 = frostHunterMagnetometerTitaniumCyber53022.FrostHunterServiceEliteCelestialThunder1757;
            frostHunterMotionLayoutTransitionSpeedAlphaInferno9042.getClass();
            synchronized (frostHunterMagnetometerTitaniumCyber53022) {
                try {
                    frostHunterMagnetometerTitaniumCyber53022.FrostHunterServiceConnectionTurboPhoenixOmega6719 = str2;
                    frostHunterMagnetometerTitaniumCyber53022.FrostHunterLightSensorForceFusion4241 = frostHunterTraceHyperionAuroraNebula9947;
                    frostHunterMagnetometerTitaniumCyber53022.FrostHunterKeyframeGammaGamma1197 = new FrostHunterHandlerOlympianNebulaVision5814((FrostHunterConstraintSetBlazeSpectra9155) frostHunterTraceHyperionAuroraNebula9947.FrostHunterKeyframeGammaGamma1197, frostHunterMagnetometerTitaniumCyber53022.FrostHunterConstraintSetCloneMasterUltraRogue2633, frostHunterMotionLayoutTransitionSpeedAlphaInferno9042.FrostHunterAlphaAnimationNeoCosmos5761, frostHunterMotionLayoutTransitionSpeedAlphaInferno9042.FrostHunterBundlePulseFusionHero2475, frostHunterMagnetometerTitaniumCyber53022.FrostHunterLifecycleBlazeGammaElite2889);
                    frostHunterMagnetometerTitaniumCyber53022.FrostHunterFlowMaxDragonHero5809 = new FrostHunterKaptHyperionCyberCyber7632(frostHunterMagnetometerTitaniumCyber53022);
                    long j = frostHunterMagnetometerTitaniumCyber53022.FrostHunterBundlePulseFusionHero2475;
                    if (j != 0) {
                        long nanos = TimeUnit.MILLISECONDS.toNanos(j);
                        FrostHunterApplicationInfoUltraInfernoSpectra4401 frostHunterApplicationInfoUltraInfernoSpectra4401 = frostHunterMagnetometerTitaniumCyber53022.FrostHunterFragmentBetaMegaVortex6025;
                        String concat = str2.concat(" ping");
                        FrostHunterExoPlayerDragonNeo7394 frostHunterExoPlayerDragonNeo7394 = new FrostHunterExoPlayerDragonNeo7394(frostHunterMagnetometerTitaniumCyber53022, nanos, i10);
                        frostHunterApplicationInfoUltraInfernoSpectra4401.getClass();
                        frostHunterApplicationInfoUltraInfernoSpectra4401.FrostHunterBundlePulseFusionHero2475(new FrostHunterNestedScrollViewFusionHyperion6860(concat, frostHunterExoPlayerDragonNeo7394), nanos);
                    }
                    if (!frostHunterMagnetometerTitaniumCyber53022.FrostHunterFirebaseModelDownloadConditionsSolarBlaze2223.isEmpty()) {
                        frostHunterMagnetometerTitaniumCyber53022.FrostHunterLifecycleBlazeGammaElite2889();
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
            frostHunterMagnetometerTitaniumCyber53022.FrostHunterAlertDialogAuroraDelta3200 = new FrostHunterViewModelScopeHeroRogueThunder9610((FrostHunterConstraintLayoutBetaAlphaNebula8582) frostHunterTraceHyperionAuroraNebula9947.FrostHunterAlertDialogAuroraDelta3200, frostHunterMagnetometerTitaniumCyber53022, frostHunterMotionLayoutTransitionSpeedAlphaInferno9042.FrostHunterAlphaAnimationNeoCosmos5761, frostHunterMotionLayoutTransitionSpeedAlphaInferno9042.FrostHunterLifecycleBlazeGammaElite2889);
            FrostHunterMagnetometerTitaniumCyber5302 frostHunterMagnetometerTitaniumCyber53023 = (FrostHunterMagnetometerTitaniumCyber5302) this.FrostHunterAlertDialogAuroraDelta3200;
            try {
                frostHunterMagnetometerTitaniumCyber53023.FrostHunterAlphaAnimationNeoCosmos5761.FrostHunterMeteringPointBetaCyber9571(frostHunterMagnetometerTitaniumCyber53023, frostHunterThemeOverlayAlphaUltra2883);
                while (frostHunterMagnetometerTitaniumCyber53023.FrostHunterResourcesTitanHyperVision5823 == -1) {
                    FrostHunterViewModelScopeHeroRogueThunder9610 frostHunterViewModelScopeHeroRogueThunder9610 = frostHunterMagnetometerTitaniumCyber53023.FrostHunterAlertDialogAuroraDelta3200;
                    frostHunterViewModelScopeHeroRogueThunder9610.getClass();
                    frostHunterViewModelScopeHeroRogueThunder9610.FrostHunterAlphaAnimationNeoCosmos5761();
                }
            } catch (Exception e) {
                FrostHunterMagnetometerTitaniumCyber5302.FrostHunterBundlePulseFusionHero2475(frostHunterMagnetometerTitaniumCyber53023, e, 6);
            } finally {
                frostHunterMagnetometerTitaniumCyber53023.FrostHunterServiceEliteCelestialThunder1757();
            }
        } catch (IOException e2) {
            FrostHunterMagnetometerTitaniumCyber5302.FrostHunterBundlePulseFusionHero2475((FrostHunterMagnetometerTitaniumCyber5302) this.FrostHunterAlertDialogAuroraDelta3200, e2, 4);
            FrostHunterFirebasePhantomVisionOlympian3288.FrostHunterAlphaAnimationNeoCosmos5761(frostHunterThemeOverlayAlphaUltra2883);
            FrostHunterTraceAuroraFusion8204 frostHunterTraceAuroraFusion8204 = frostHunterThemeOverlayAlphaUltra2883.FrostHunterScaleAnimationStrikeSpark5059;
            if (frostHunterTraceAuroraFusion8204 != null && (FrostHunterAlphaAnimationNeoCosmos5761 = frostHunterTraceAuroraFusion8204.FrostHunterAlphaAnimationNeoCosmos5761()) != null) {
                FrostHunterFirebasePhantomVisionOlympian3288.FrostHunterAlphaAnimationNeoCosmos5761(FrostHunterAlphaAnimationNeoCosmos5761);
            }
            FrostHunterTraceAuroraFusion8204 frostHunterTraceAuroraFusion82042 = frostHunterThemeOverlayAlphaUltra2883.FrostHunterScaleAnimationStrikeSpark5059;
            if (frostHunterTraceAuroraFusion82042 == null || (FrostHunterServiceEliteCelestialThunder1757 = frostHunterTraceAuroraFusion82042.FrostHunterServiceEliteCelestialThunder1757()) == null) {
                return;
            }
            FrostHunterFirebasePhantomVisionOlympian3288.FrostHunterAlphaAnimationNeoCosmos5761(FrostHunterServiceEliteCelestialThunder1757);
        }
    }

    public FrostHunterApplicationInfoEclipseSparkDelta6014 FrostHunterLightSensorForceFusion4241() {
        return (FrostHunterApplicationInfoEclipseSparkDelta6014) ((FrostHunterCountDownTimerLegendOlympian4078) this.FrostHunterFlowMaxDragonHero5809).getValue();
    }

    public void FrostHunterLintTitanVortexQuantum9911(FrostHunterCanvasOmegaSolarNebula2242 frostHunterCanvasOmegaSolarNebula2242) {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("Fid", frostHunterCanvasOmegaSolarNebula2242.FrostHunterAlphaAnimationNeoCosmos5761);
            jSONObject.put("Status", FrostHunterKeyEventNovaXAlpha1220.FrostHunterLooperHyperionForce4133(frostHunterCanvasOmegaSolarNebula2242.FrostHunterConstraintSetCloneMasterUltraRogue2633));
            jSONObject.put("AuthToken", frostHunterCanvasOmegaSolarNebula2242.FrostHunterBundlePulseFusionHero2475);
            jSONObject.put("RefreshToken", frostHunterCanvasOmegaSolarNebula2242.FrostHunterServiceEliteCelestialThunder1757);
            jSONObject.put("TokenCreationEpochInSecs", frostHunterCanvasOmegaSolarNebula2242.FrostHunterLevelListDrawableFusionDragonHero2232);
            jSONObject.put("ExpiresInSecs", frostHunterCanvasOmegaSolarNebula2242.FrostHunterLifecycleBlazeGammaElite2889);
            jSONObject.put("FisError", frostHunterCanvasOmegaSolarNebula2242.FrostHunterRemoteConfigSpeedSpeed8566);
            com.google.firebase.FrostHunterTransitionManagerOmegaNeoMaster3754 frostHunterTransitionManagerOmegaNeoMaster3754 = (com.google.firebase.FrostHunterTransitionManagerOmegaNeoMaster3754) this.FrostHunterFlowMaxDragonHero5809;
            frostHunterTransitionManagerOmegaNeoMaster3754.FrostHunterAlphaAnimationNeoCosmos5761();
            File createTempFile = File.createTempFile("PersistedInstallation", "tmp", frostHunterTransitionManagerOmegaNeoMaster3754.FrostHunterAlphaAnimationNeoCosmos5761.getFilesDir());
            FileOutputStream fileOutputStream = new FileOutputStream(createTempFile);
            fileOutputStream.write(jSONObject.toString().getBytes(Constants.ENCODING));
            fileOutputStream.close();
            if (createTempFile.renameTo(FrostHunterFragmentBetaMegaVortex6025())) {
            } else {
                throw new IOException("unable to rename the tmpfile to PersistedInstallation");
            }
        } catch (IOException | JSONException unused) {
        }
    }

    public void FrostHunterLooperThreadBetaHyperionMax1000(String str, FrostHunterAccelerometerPulseTitaniumMaster6945 frostHunterAccelerometerPulseTitaniumMaster6945) {
        frostHunterAccelerometerPulseTitaniumMaster6945.getClass();
        FrostHunterRotateDrawableSparkAurora3314 frostHunterRotateDrawableSparkAurora3314 = (FrostHunterRotateDrawableSparkAurora3314) this.FrostHunterAlertDialogAuroraDelta3200;
        synchronized (frostHunterRotateDrawableSparkAurora3314.FrostHunterBundlePulseFusionHero2475) {
            if (frostHunterRotateDrawableSparkAurora3314.FrostHunterServiceEliteCelestialThunder1757.containsKey(str)) {
                throw new IllegalArgumentException("SavedStateProvider with the given key is already registered");
            }
            frostHunterRotateDrawableSparkAurora3314.FrostHunterServiceEliteCelestialThunder1757.put(str, frostHunterAccelerometerPulseTitaniumMaster6945);
        }
    }

    public void FrostHunterMotionSceneAuroraMega2271() {
        if (!((FrostHunterRotateDrawableSparkAurora3314) this.FrostHunterAlertDialogAuroraDelta3200).FrostHunterCameraXPixelTurboCosmos9814) {
            FrostHunterFlowHyperionVortexDelta5013.FrostHunterServiceConnectionTurboPhoenixOmega6719("Can not perform this action after onSaveInstanceState");
            return;
        }
        FrostHunterFlowCollectorNebulaEclipseTitan2170 frostHunterFlowCollectorNebulaEclipseTitan2170 = (FrostHunterFlowCollectorNebulaEclipseTitan2170) this.FrostHunterFlowMaxDragonHero5809;
        if (frostHunterFlowCollectorNebulaEclipseTitan2170 == null) {
            frostHunterFlowCollectorNebulaEclipseTitan2170 = new FrostHunterFlowCollectorNebulaEclipseTitan2170(this);
        }
        this.FrostHunterFlowMaxDragonHero5809 = frostHunterFlowCollectorNebulaEclipseTitan2170;
        try {
            FrostHunterNotificationVortexNovaX2037.class.getDeclaredConstructor(null);
            FrostHunterFlowCollectorNebulaEclipseTitan2170 frostHunterFlowCollectorNebulaEclipseTitan21702 = (FrostHunterFlowCollectorNebulaEclipseTitan2170) this.FrostHunterFlowMaxDragonHero5809;
            if (frostHunterFlowCollectorNebulaEclipseTitan21702 != null) {
                frostHunterFlowCollectorNebulaEclipseTitan21702.FrostHunterAlphaAnimationNeoCosmos5761.add(FrostHunterNotificationVortexNovaX2037.class.getName());
            }
        } catch (NoSuchMethodException e) {
            throw new IllegalArgumentException("Class " + FrostHunterNotificationVortexNovaX2037.class.getSimpleName() + " must have default constructor in order to be automatically recreated", e);
        }
    }

    @Override // android.content.Context.FrostHunterFragmentAuroraDelta4793
    public void FrostHunterRemoteConfigSpeedSpeed8566(FrostHunterSurfaceViewPrimeAlphaPulse4865 frostHunterSurfaceViewPrimeAlphaPulse4865, IOException iOException) {
        FrostHunterMagnetometerTitaniumCyber5302.FrostHunterBundlePulseFusionHero2475((FrostHunterMagnetometerTitaniumCyber5302) this.FrostHunterAlertDialogAuroraDelta3200, iOException, 6);
    }

    public void FrostHunterResourcesTitanHyperVision5823(Bundle bundle) {
        FrostHunterRotateDrawableSparkAurora3314 frostHunterRotateDrawableSparkAurora3314 = (FrostHunterRotateDrawableSparkAurora3314) this.FrostHunterAlertDialogAuroraDelta3200;
        Bundle FrostHunterAlertDialogAuroraDelta3200 = FrostHunterVectorDrawableForceMax1351.FrostHunterAlertDialogAuroraDelta3200((FrostHunterLaunchHeroForce4010[]) Arrays.copyOf(new FrostHunterLaunchHeroForce4010[0], 0));
        Bundle bundle2 = frostHunterRotateDrawableSparkAurora3314.FrostHunterLevelListDrawableFusionDragonHero2232;
        if (bundle2 != null) {
            FrostHunterAlertDialogAuroraDelta3200.putAll(bundle2);
        }
        synchronized (frostHunterRotateDrawableSparkAurora3314.FrostHunterBundlePulseFusionHero2475) {
            for (Map.Entry entry : frostHunterRotateDrawableSparkAurora3314.FrostHunterServiceEliteCelestialThunder1757.entrySet()) {
                String str = (String) entry.getKey();
                Bundle FrostHunterAlphaAnimationNeoCosmos5761 = ((FrostHunterAccelerometerPulseTitaniumMaster6945) entry.getValue()).FrostHunterAlphaAnimationNeoCosmos5761();
                str.getClass();
                FrostHunterAlertDialogAuroraDelta3200.putBundle(str, FrostHunterAlphaAnimationNeoCosmos5761);
            }
        }
        if (FrostHunterAlertDialogAuroraDelta3200.isEmpty()) {
            return;
        }
        bundle.putBundle("androidx.lifecycle.BundlableSavedStateRegistry.key", FrostHunterAlertDialogAuroraDelta3200);
    }

    public FrostHunterAccelerometerPulseTitaniumMaster6945 FrostHunterScaleAnimationStrikeSpark5059() {
        FrostHunterAccelerometerPulseTitaniumMaster6945 frostHunterAccelerometerPulseTitaniumMaster6945;
        FrostHunterRotateDrawableSparkAurora3314 frostHunterRotateDrawableSparkAurora3314 = (FrostHunterRotateDrawableSparkAurora3314) this.FrostHunterAlertDialogAuroraDelta3200;
        synchronized (frostHunterRotateDrawableSparkAurora3314.FrostHunterBundlePulseFusionHero2475) {
            Iterator it = frostHunterRotateDrawableSparkAurora3314.FrostHunterServiceEliteCelestialThunder1757.entrySet().iterator();
            do {
                frostHunterAccelerometerPulseTitaniumMaster6945 = null;
                if (!it.hasNext()) {
                    break;
                }
                Map.Entry entry = (Map.Entry) it.next();
                String str = (String) entry.getKey();
                FrostHunterAccelerometerPulseTitaniumMaster6945 frostHunterAccelerometerPulseTitaniumMaster69452 = (FrostHunterAccelerometerPulseTitaniumMaster6945) entry.getValue();
                if (FrostHunterDrawerLayoutUltraStrike3303.FrostHunterLightSensorForceFusion4241(str, "androidx.lifecycle.internal.SavedStateHandlesProvider")) {
                    frostHunterAccelerometerPulseTitaniumMaster6945 = frostHunterAccelerometerPulseTitaniumMaster69452;
                }
            } while (frostHunterAccelerometerPulseTitaniumMaster6945 == null);
        }
        return frostHunterAccelerometerPulseTitaniumMaster6945;
    }

    public List FrostHunterServiceConnectionTurboPhoenixOmega6719() {
        ArrayList arrayList;
        if (((ArrayList) this.FrostHunterAlertDialogAuroraDelta3200).isEmpty()) {
            return Collections.EMPTY_LIST;
        }
        synchronized (((ArrayList) this.FrostHunterAlertDialogAuroraDelta3200)) {
            arrayList = new ArrayList((ArrayList) this.FrostHunterAlertDialogAuroraDelta3200);
        }
        return arrayList;
    }

    @Override // android.content.Context.FrostHunterDisplayMetricsMasterPhantomVortex1539
    public Object FrostHunterServiceEliteCelestialThunder1757(FrostHunterVibratorOmegaSpeed8811 frostHunterVibratorOmegaSpeed8811, Object obj) {
        return ((FrostHunterFontFamilyNeoBetaEpic8574) this.FrostHunterAlertDialogAuroraDelta3200).FrostHunterCameraXPixelTurboCosmos9814(frostHunterVibratorOmegaSpeed8811, obj);
    }

    public FrostHunterCanvasOmegaSolarNebula2242 FrostHunterTextViewDragonStormMega4297() {
        JSONObject jSONObject;
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        byte[] bArr = new byte[16384];
        try {
            FileInputStream fileInputStream = new FileInputStream(FrostHunterFragmentBetaMegaVortex6025());
            while (true) {
                try {
                    int read = fileInputStream.read(bArr, 0, 16384);
                    if (read < 0) {
                        break;
                    }
                    byteArrayOutputStream.write(bArr, 0, read);
                } finally {
                }
            }
            jSONObject = new JSONObject(byteArrayOutputStream.toString());
            fileInputStream.close();
        } catch (IOException | JSONException unused) {
            jSONObject = new JSONObject();
        }
        String optString = jSONObject.optString("Fid", null);
        int optInt = jSONObject.optInt("Status", 0);
        String optString2 = jSONObject.optString("AuthToken", null);
        String optString3 = jSONObject.optString("RefreshToken", null);
        long optLong = jSONObject.optLong("TokenCreationEpochInSecs", 0L);
        long optLong2 = jSONObject.optLong("ExpiresInSecs", 0L);
        String optString4 = jSONObject.optString("FisError", null);
        int i = FrostHunterKeyEventNovaXAlpha1220.FrostHunterMeteringPointBetaCyber9571(5)[optInt];
        if (i == 0) {
            FrostHunterMaterialCardViewShadowBlazeBlaze3823.FrostHunterCameraXPixelTurboCosmos9814("Null registrationStatus");
            return null;
        }
        String str = i == 0 ? " registrationStatus" : "";
        if (str.isEmpty()) {
            return new FrostHunterCanvasOmegaSolarNebula2242(optString, i, optString2, optString3, optLong2, optLong, optString4);
        }
        FrostHunterFlowHyperionVortexDelta5013.FrostHunterServiceConnectionTurboPhoenixOmega6719("Missing required properties:".concat(str));
        return null;
    }

    @Override // android.content.Context.FrostHunterClipboardManagerMegaRogue2930
    public Object get() {
        switch (this.FrostHunterCameraXPixelTurboCosmos9814) {
            case FrostHunterRemoteModelManagerCyberLegend2797.DOUBLE_FIELD_NUMBER /* 7 */:
                return new FrostHunterRecyclerViewEpicRogueTitan1803((Context) ((FrostHunterInstrumentationStrikeBlazeThunder7469) this.FrostHunterAlertDialogAuroraDelta3200).FrostHunterCameraXPixelTurboCosmos9814, (FrostHunterTraceHyperionAuroraNebula9947) ((FrostHunterLayoutInflaterTurboHyperion3832) this.FrostHunterFlowMaxDragonHero5809).get());
            default:
                FrostHunterAuthPixelSolar5465 frostHunterAuthPixelSolar5465 = new FrostHunterAuthPixelSolar5465();
                FrostHunterLocationManagerAlphaFusion6480 frostHunterLocationManagerAlphaFusion6480 = new FrostHunterLocationManagerAlphaFusion6480();
                Object obj = ((FrostHunterClipboardManagerMegaRogue2930) this.FrostHunterAlertDialogAuroraDelta3200).get();
                FrostHunterClipboardManagerMegaRogue2930 frostHunterClipboardManagerMegaRogue2930 = (FrostHunterClipboardManagerMegaRogue2930) this.FrostHunterFlowMaxDragonHero5809;
                return new FrostHunterModelInputOutputTitanHyperion7556(frostHunterAuthPixelSolar5465, frostHunterLocationManagerAlphaFusion6480, FrostHunterFlipAnimationInfernoVisionForce3014.FrostHunterLevelListDrawableFusionDragonHero2232, (FrostHunterBroadcastBetaHyper4060) obj, frostHunterClipboardManagerMegaRogue2930);
        }
    }

    public String toString() {
        switch (this.FrostHunterCameraXPixelTurboCosmos9814) {
            case 12:
                StringBuilder sb = new StringBuilder(100);
                sb.append(this.FrostHunterFlowMaxDragonHero5809.getClass().getSimpleName());
                sb.append('{');
                ArrayList arrayList = (ArrayList) this.FrostHunterAlertDialogAuroraDelta3200;
                int size = arrayList.size();
                for (int i = 0; i < size; i++) {
                    sb.append((String) arrayList.get(i));
                    if (i < size - 1) {
                        sb.append(", ");
                    }
                }
                sb.append('}');
                return sb.toString();
            default:
                return super.toString();
        }
    }

    public /* synthetic */ FrostHunterKotlinQuantumRogue5892(int i, boolean z) {
        this.FrostHunterCameraXPixelTurboCosmos9814 = i;
    }

    public FrostHunterKotlinQuantumRogue5892(FrostHunterRotateDrawableSparkAurora3314 frostHunterRotateDrawableSparkAurora3314, int i) {
        this.FrostHunterCameraXPixelTurboCosmos9814 = i;
        switch (i) {
            case 23:
                this.FrostHunterAlertDialogAuroraDelta3200 = frostHunterRotateDrawableSparkAurora3314;
                this.FrostHunterFlowMaxDragonHero5809 = new FrostHunterKotlinQuantumRogue5892(frostHunterRotateDrawableSparkAurora3314, 22);
                break;
            default:
                this.FrostHunterAlertDialogAuroraDelta3200 = frostHunterRotateDrawableSparkAurora3314;
                break;
        }
    }

    public FrostHunterKotlinQuantumRogue5892(FrostHunterOnGlobalLayoutListenerTitanStrikeNovaX1439 frostHunterOnGlobalLayoutListenerTitanStrikeNovaX1439, FrostHunterApplicationInfoEclipseSparkDelta6014 frostHunterApplicationInfoEclipseSparkDelta6014) {
        this.FrostHunterCameraXPixelTurboCosmos9814 = 2;
        this.FrostHunterAlertDialogAuroraDelta3200 = frostHunterOnGlobalLayoutListenerTitanStrikeNovaX1439;
        this.FrostHunterFlowMaxDragonHero5809 = FrostHunterLiveDataScopeOmegaBeta9836.FrostHunterCameraXPixelTurboCosmos9814(frostHunterApplicationInfoEclipseSparkDelta6014);
    }

    public /* synthetic */ FrostHunterKotlinQuantumRogue5892(int i, Object obj, Object obj2) {
        this.FrostHunterCameraXPixelTurboCosmos9814 = i;
        this.FrostHunterAlertDialogAuroraDelta3200 = obj;
        this.FrostHunterFlowMaxDragonHero5809 = obj2;
    }

    public FrostHunterKotlinQuantumRogue5892(ExecutorService executorService) {
        this.FrostHunterCameraXPixelTurboCosmos9814 = 19;
        this.FrostHunterFlowMaxDragonHero5809 = new FrostHunterViewPager2SpectraForceVortex4544(0);
        this.FrostHunterAlertDialogAuroraDelta3200 = executorService;
    }

    public FrostHunterKotlinQuantumRogue5892(FrostHunterPaintFlagsDrawFilterPhantomRogue4543 frostHunterPaintFlagsDrawFilterPhantomRogue4543) {
        this.FrostHunterCameraXPixelTurboCosmos9814 = 17;
        this.FrostHunterAlertDialogAuroraDelta3200 = frostHunterPaintFlagsDrawFilterPhantomRogue4543;
        this.FrostHunterFlowMaxDragonHero5809 = new FrostHunterLicensingSpectraPulse8868();
    }

    public FrostHunterKotlinQuantumRogue5892(com.google.firebase.FrostHunterTransitionManagerOmegaNeoMaster3754 frostHunterTransitionManagerOmegaNeoMaster3754) {
        this.FrostHunterCameraXPixelTurboCosmos9814 = 15;
        this.FrostHunterFlowMaxDragonHero5809 = frostHunterTransitionManagerOmegaNeoMaster3754;
    }

    public FrostHunterKotlinQuantumRogue5892(Context context) {
        this.FrostHunterCameraXPixelTurboCosmos9814 = 6;
        this.FrostHunterFlowMaxDragonHero5809 = null;
        this.FrostHunterAlertDialogAuroraDelta3200 = context;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public FrostHunterKotlinQuantumRogue5892(int i, Object obj) {
        this(9);
        this.FrostHunterCameraXPixelTurboCosmos9814 = i;
        switch (i) {
            case 12:
                this.FrostHunterFlowMaxDragonHero5809 = obj;
                this.FrostHunterAlertDialogAuroraDelta3200 = new ArrayList();
                break;
            default:
                this.FrostHunterFlowMaxDragonHero5809 = FrostHunterLiveDataScopeOmegaBeta9836.FrostHunterCameraXPixelTurboCosmos9814(obj);
                FrostHunterLiveDataScopeOmegaBeta9836.FrostHunterCameraXPixelTurboCosmos9814(obj);
                break;
        }
    }
}
