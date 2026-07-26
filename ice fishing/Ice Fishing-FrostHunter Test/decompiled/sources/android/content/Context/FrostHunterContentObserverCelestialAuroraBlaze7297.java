package android.content.Context;

import com.adjust.sdk.Adjust;
import com.adjust.sdk.AdjustConfig;
import com.adjust.sdk.LogLevel;
import com.android.installreferrer.api.InstallReferrerClient;
import com.frosthunter.arcticwildlands.frozenexpedition.adventure.GeneratorStateActivity;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;

/* compiled from: r8-map-id-ad53bc00775cc49f3760de3ef5ee15f0f7d4eb373264baa1785c3fa1a15d54ed */
/* loaded from: classes.dex */
public final class FrostHunterContentObserverCelestialAuroraBlaze7297 implements FrostHunterCoroutineScopeSolarTitan6330 {
    public final List FrostHunterCameraXPixelTurboCosmos9814;

    public /* synthetic */ FrostHunterContentObserverCelestialAuroraBlaze7297(List list) {
        this.FrostHunterCameraXPixelTurboCosmos9814 = list;
    }

    public void FrostHunterAlphaAnimationNeoCosmos5761(FrostHunterDrawerLayoutUltraStrike3303 frostHunterDrawerLayoutUltraStrike3303) {
        for (FrostHunterInAppPurchaseSparkMega4286 frostHunterInAppPurchaseSparkMega4286 : this.FrostHunterCameraXPixelTurboCosmos9814) {
            if (frostHunterInAppPurchaseSparkMega4286.FrostHunterAlphaAnimationNeoCosmos5761.FrostHunterServiceEliteCelestialThunder1757(frostHunterDrawerLayoutUltraStrike3303) && frostHunterInAppPurchaseSparkMega4286.FrostHunterAlphaAnimationNeoCosmos5761.FrostHunterServiceEliteCelestialThunder1757(frostHunterDrawerLayoutUltraStrike3303)) {
                switch (frostHunterInAppPurchaseSparkMega4286.FrostHunterConstraintSetCloneMasterUltraRogue2633) {
                    case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                        Adjust.onPause();
                        break;
                    case 1:
                        FrostHunterFirebaseModelInterpreterMaxGamma1554 frostHunterFirebaseModelInterpreterMaxGamma1554 = (FrostHunterFirebaseModelInterpreterMaxGamma1554) frostHunterDrawerLayoutUltraStrike3303;
                        FrostHunterLaunchHeroForce4010[] frostHunterLaunchHeroForce4010Arr = {new FrostHunterLaunchHeroForce4010("target_env", AdjustConfig.ENVIRONMENT_PRODUCTION), new FrostHunterLaunchHeroForce4010("verbosity", LogLevel.VERBOSE)};
                        LinkedHashMap linkedHashMap = new LinkedHashMap(FrostHunterBroadcastHeroSpectra7879.FrostHunterSoundPoolNovaTitanTitan5784(2));
                        FrostHunterBroadcastHeroSpectra7879.FrostHunterNestedScrollViewThunderNovaX6772(linkedHashMap, frostHunterLaunchHeroForce4010Arr);
                        GeneratorStateActivity generatorStateActivity = frostHunterFirebaseModelInterpreterMaxGamma1554.FrostHunterFirebaseModelDownloadConditionsSolarBlaze2223.FrostHunterAlphaAnimationNeoCosmos5761;
                        String str = frostHunterFirebaseModelInterpreterMaxGamma1554.FrostHunterLintTitanVortexQuantum9911.FrostHunterAlphaAnimationNeoCosmos5761;
                        Object obj = linkedHashMap.get("target_env");
                        obj.getClass();
                        AdjustConfig adjustConfig = new AdjustConfig(generatorStateActivity, str, (String) obj);
                        Object obj2 = linkedHashMap.get("verbosity");
                        obj2.getClass();
                        adjustConfig.setLogLevel((LogLevel) obj2);
                        Adjust.initSdk(adjustConfig);
                        break;
                    default:
                        Adjust.onResume();
                        break;
                }
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r10v3 */
    public List FrostHunterBundlePulseFusionHero2475(FrostHunterActivityInfoMaxOlympian4796 frostHunterActivityInfoMaxOlympian4796) {
        String str;
        int i;
        List list;
        FrostHunterLicensingSpectraPulse8868 frostHunterLicensingSpectraPulse8868 = new FrostHunterLicensingSpectraPulse8868((byte[]) frostHunterActivityInfoMaxOlympian4796.FrostHunterKeyframeGammaGamma1197);
        ArrayList arrayList = this.FrostHunterCameraXPixelTurboCosmos9814;
        while (frostHunterLicensingSpectraPulse8868.FrostHunterAlphaAnimationNeoCosmos5761() > 0) {
            int FrostHunterMeteringPointBetaCyber9571 = frostHunterLicensingSpectraPulse8868.FrostHunterMeteringPointBetaCyber9571();
            int FrostHunterMeteringPointBetaCyber95712 = frostHunterLicensingSpectraPulse8868.FrostHunterConstraintSetCloneMasterUltraRogue2633 + frostHunterLicensingSpectraPulse8868.FrostHunterMeteringPointBetaCyber9571();
            if (FrostHunterMeteringPointBetaCyber9571 == 134) {
                arrayList = new ArrayList();
                int FrostHunterMeteringPointBetaCyber95713 = frostHunterLicensingSpectraPulse8868.FrostHunterMeteringPointBetaCyber9571() & 31;
                for (int i2 = 0; i2 < FrostHunterMeteringPointBetaCyber95713; i2++) {
                    String FrostHunterDialogFragmentTurboPhoenixDragon7627 = frostHunterLicensingSpectraPulse8868.FrostHunterDialogFragmentTurboPhoenixDragon7627(3, StandardCharsets.UTF_8);
                    int FrostHunterMeteringPointBetaCyber95714 = frostHunterLicensingSpectraPulse8868.FrostHunterMeteringPointBetaCyber9571();
                    boolean z = (FrostHunterMeteringPointBetaCyber95714 & 128) != 0;
                    if (z) {
                        i = FrostHunterMeteringPointBetaCyber95714 & 63;
                        str = "application/cea-708";
                    } else {
                        str = "application/cea-608";
                        i = 1;
                    }
                    byte FrostHunterMeteringPointBetaCyber95715 = (byte) frostHunterLicensingSpectraPulse8868.FrostHunterMeteringPointBetaCyber9571();
                    frostHunterLicensingSpectraPulse8868.FrostHunterFCMDeltaQuantumHero8364(1);
                    if (z) {
                        boolean z2 = (FrostHunterMeteringPointBetaCyber95715 & 64) != 0;
                        byte[] bArr = FrostHunterTraceVisionNova3975.FrostHunterAlphaAnimationNeoCosmos5761;
                        list = Collections.singletonList(z2 ? new byte[]{1} : new byte[]{0});
                    } else {
                        list = null;
                    }
                    FrostHunterCamera2EpicNovaX6250 frostHunterCamera2EpicNovaX6250 = new FrostHunterCamera2EpicNovaX6250();
                    frostHunterCamera2EpicNovaX6250.FrostHunterLightSensorForceFusion4241 = FrostHunterOrientationSensorDeltaSolarMaster8286.FrostHunterKeyframeGammaGamma1197(str);
                    frostHunterCamera2EpicNovaX6250.FrostHunterServiceEliteCelestialThunder1757 = FrostHunterDialogFragmentTurboPhoenixDragon7627;
                    frostHunterCamera2EpicNovaX6250.FrostHunterMagnetometerFusionTitanium8202 = i;
                    frostHunterCamera2EpicNovaX6250.FrostHunterLintTitanVortexQuantum9911 = list;
                    arrayList.add(new FrostHunterFirebaseOlympianMax4818(frostHunterCamera2EpicNovaX6250));
                }
            }
            frostHunterLicensingSpectraPulse8868.FrostHunterR8MasterNebulaSpark7247(FrostHunterMeteringPointBetaCyber95712);
            arrayList = arrayList;
        }
        return arrayList;
    }

    @Override // android.content.Context.FrostHunterCoroutineScopeSolarTitan6330
    public int FrostHunterConstraintSetCloneMasterUltraRogue2633(long j) {
        return j < 0 ? 0 : -1;
    }

    @Override // android.content.Context.FrostHunterCoroutineScopeSolarTitan6330
    public long FrostHunterFlowMaxDragonHero5809(int i) {
        FrostHunterCanvasInfernoVortex4700.FrostHunterResourcesTitanHyperVision5823(i == 0);
        return 0L;
    }

    @Override // android.content.Context.FrostHunterCoroutineScopeSolarTitan6330
    public int FrostHunterScaleAnimationStrikeSpark5059() {
        return 1;
    }

    @Override // android.content.Context.FrostHunterCoroutineScopeSolarTitan6330
    public List FrostHunterServiceConnectionTurboPhoenixOmega6719(long j) {
        return j >= 0 ? this.FrostHunterCameraXPixelTurboCosmos9814 : Collections.EMPTY_LIST;
    }

    public boolean FrostHunterServiceEliteCelestialThunder1757(String str) {
        List list = this.FrostHunterCameraXPixelTurboCosmos9814;
        if (list.isEmpty()) {
            return false;
        }
        Iterator it = list.iterator();
        while (it.hasNext()) {
            if (FrostHunterOnTouchListenerCelestialTitanNova9943.FrostHunterLooperThreadBetaHyperionMax1000(str, (String) it.next())) {
                return true;
            }
        }
        return false;
    }
}
