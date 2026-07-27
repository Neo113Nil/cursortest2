package android.content.Context;

import android.media.AudioFormat;
import android.media.Spatializer;
import android.os.Build;
import com.android.installreferrer.api.InstallReferrerClient;
import java.util.Objects;

/* compiled from: r8-map-id-ad53bc00775cc49f3760de3ef5ee15f0f7d4eb373264baa1785c3fa1a15d54ed */
/* loaded from: classes.dex */
public final /* synthetic */ class FrostHunterLinearLayoutLegendPhantomCosmos6401 implements FrostHunterLintPhantomTurbo6249 {
    public final /* synthetic */ FrostHunterLiveDataScopeShadowCelestialMax5831 FrostHunterCameraXPixelTurboCosmos9814;
    public final /* synthetic */ FrostHunterCanvasTitanShadow6265 FrostHunterFlowMaxDragonHero5809;

    public /* synthetic */ FrostHunterLinearLayoutLegendPhantomCosmos6401(FrostHunterLiveDataScopeShadowCelestialMax5831 frostHunterLiveDataScopeShadowCelestialMax5831, FrostHunterCanvasTitanShadow6265 frostHunterCanvasTitanShadow6265) {
        this.FrostHunterCameraXPixelTurboCosmos9814 = frostHunterLiveDataScopeShadowCelestialMax5831;
        this.FrostHunterFlowMaxDragonHero5809 = frostHunterCanvasTitanShadow6265;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x006a, code lost:
    
        if (r8.FrostHunterCameraXPixelTurboCosmos9814 != false) goto L42;
     */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0092  */
    @Override // android.content.Context.FrostHunterLintPhantomTurbo6249
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean apply(Object obj) {
        Boolean bool;
        FrostHunterAudioManagerNovaNovaXAurora2834 frostHunterAudioManagerNovaNovaXAurora2834;
        Spatializer spatializer;
        boolean isAvailable;
        Spatializer spatializer2;
        boolean isEnabled;
        boolean z;
        boolean isAvailable2;
        Spatializer spatializer3;
        boolean isEnabled2;
        char c;
        FrostHunterFirebaseOlympianMax4818 frostHunterFirebaseOlympianMax4818 = (FrostHunterFirebaseOlympianMax4818) obj;
        FrostHunterLiveDataScopeShadowCelestialMax5831 frostHunterLiveDataScopeShadowCelestialMax5831 = this.FrostHunterCameraXPixelTurboCosmos9814;
        frostHunterLiveDataScopeShadowCelestialMax5831.getClass();
        if (this.FrostHunterFlowMaxDragonHero5809.FrostHunterServiceInfoHyperionSparkMax9966 && ((bool = frostHunterLiveDataScopeShadowCelestialMax5831.FrostHunterAlertDialogAuroraDelta3200) == null || !bool.booleanValue())) {
            int i = frostHunterFirebaseOlympianMax4818.FrostHunterBillingClientFusionVortex9008;
            String str = frostHunterFirebaseOlympianMax4818.FrostHunterScaleAnimationStrikeSpark5059;
            if (i != -1 && i > 2) {
                if (str != null) {
                    switch (str.hashCode()) {
                        case -2123537834:
                            if (str.equals("audio/eac3-joc")) {
                                c = 0;
                                break;
                            }
                            c = 65535;
                            break;
                        case 187078296:
                            if (str.equals("audio/ac3")) {
                                c = 1;
                                break;
                            }
                            c = 65535;
                            break;
                        case 187078297:
                            if (str.equals("audio/ac4")) {
                                c = 2;
                                break;
                            }
                            c = 65535;
                            break;
                        case 1504578661:
                            if (str.equals("audio/eac3")) {
                                c = 3;
                                break;
                            }
                            c = 65535;
                            break;
                        default:
                            c = 65535;
                            break;
                    }
                    switch (c) {
                        case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                        case 1:
                        case 2:
                        case 3:
                            if (Build.VERSION.SDK_INT >= 32) {
                                FrostHunterAudioManagerNovaNovaXAurora2834 frostHunterAudioManagerNovaNovaXAurora28342 = frostHunterLiveDataScopeShadowCelestialMax5831.FrostHunterCameraXPixelTurboCosmos9814;
                                if (frostHunterAudioManagerNovaNovaXAurora28342 != null) {
                                    break;
                                }
                            }
                            break;
                        default:
                            if (Build.VERSION.SDK_INT >= 32 && (frostHunterAudioManagerNovaNovaXAurora2834 = frostHunterLiveDataScopeShadowCelestialMax5831.FrostHunterCameraXPixelTurboCosmos9814) != null && frostHunterAudioManagerNovaNovaXAurora2834.FrostHunterCameraXPixelTurboCosmos9814 && (spatializer = (Spatializer) frostHunterAudioManagerNovaNovaXAurora2834.FrostHunterFlowMaxDragonHero5809) != null) {
                                isAvailable = spatializer.isAvailable();
                                if (isAvailable && (spatializer2 = (Spatializer) frostHunterLiveDataScopeShadowCelestialMax5831.FrostHunterCameraXPixelTurboCosmos9814.FrostHunterFlowMaxDragonHero5809) != null) {
                                    isEnabled = spatializer2.isEnabled();
                                    if (isEnabled) {
                                        FrostHunterAudioManagerNovaNovaXAurora2834 frostHunterAudioManagerNovaNovaXAurora28343 = frostHunterLiveDataScopeShadowCelestialMax5831.FrostHunterCameraXPixelTurboCosmos9814;
                                        FrostHunterRemoteConfigEpicUltraDragon2411 frostHunterRemoteConfigEpicUltraDragon2411 = frostHunterLiveDataScopeShadowCelestialMax5831.FrostHunterFlowMaxDragonHero5809;
                                        Spatializer spatializer4 = (Spatializer) frostHunterAudioManagerNovaNovaXAurora28343.FrostHunterFlowMaxDragonHero5809;
                                        if (spatializer4 != null && frostHunterAudioManagerNovaNovaXAurora28343.FrostHunterCameraXPixelTurboCosmos9814) {
                                            isAvailable2 = spatializer4.isAvailable();
                                            if (isAvailable2 && (spatializer3 = (Spatializer) frostHunterAudioManagerNovaNovaXAurora28343.FrostHunterFlowMaxDragonHero5809) != null) {
                                                isEnabled2 = spatializer3.isEnabled();
                                                if (isEnabled2) {
                                                    int i2 = frostHunterFirebaseOlympianMax4818.FrostHunterBillingClientFusionVortex9008;
                                                    if (Objects.equals(str, "audio/eac3-joc")) {
                                                        if (i2 == 16) {
                                                            i2 = 12;
                                                        }
                                                    } else if (Objects.equals(str, "audio/iamf")) {
                                                        if (i2 == -1) {
                                                            i2 = 6;
                                                        }
                                                    } else if (Objects.equals(str, "audio/ac4") && (i2 == 18 || i2 == 21)) {
                                                        i2 = 24;
                                                    }
                                                    int FrostHunterServiceConnectionTurboPhoenixOmega6719 = FrostHunterGyroscopeHeroAlpha1995.FrostHunterServiceConnectionTurboPhoenixOmega6719(i2);
                                                    if (FrostHunterServiceConnectionTurboPhoenixOmega6719 != 0) {
                                                        AudioFormat.Builder channelMask = new AudioFormat.Builder().setEncoding(2).setChannelMask(FrostHunterServiceConnectionTurboPhoenixOmega6719);
                                                        int i3 = frostHunterFirebaseOlympianMax4818.FrostHunterMediaPlayerCelestialBetaTitan3868;
                                                        if (i3 != -1) {
                                                            channelMask.setSampleRate(i3);
                                                        }
                                                        Spatializer spatializer5 = (Spatializer) frostHunterAudioManagerNovaNovaXAurora28343.FrostHunterFlowMaxDragonHero5809;
                                                        spatializer5.getClass();
                                                        z = FrostHunterLifecycleShadowStormNebula6021.FrostHunterBundlePulseFusionHero2475(spatializer5).canBeSpatialized(frostHunterRemoteConfigEpicUltraDragon2411.FrostHunterAlphaAnimationNeoCosmos5761(), channelMask.build());
                                                        if (!z) {
                                                        }
                                                    }
                                                }
                                            }
                                        }
                                        z = false;
                                        if (!z) {
                                        }
                                    }
                                }
                            }
                            return false;
                    }
                }
                if (Build.VERSION.SDK_INT >= 32) {
                    isAvailable = spatializer.isAvailable();
                    if (isAvailable) {
                        isEnabled = spatializer2.isEnabled();
                        if (isEnabled) {
                        }
                    }
                }
                return false;
            }
        }
        return true;
    }
}
