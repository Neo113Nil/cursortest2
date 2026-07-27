package android.content.Context;

import android.graphics.Bitmap;
import android.graphics.Rect;
import com.android.installreferrer.api.InstallReferrerClient;
import java.nio.charset.StandardCharsets;
import java.util.List;
import java.util.zip.Inflater;

/* compiled from: r8-map-id-ad53bc00775cc49f3760de3ef5ee15f0f7d4eb373264baa1785c3fa1a15d54ed */
/* loaded from: classes.dex */
public final class FrostHunterAdMobStormSpectraUltra3563 implements FrostHunterActionBarHyperMax6338 {
    public static final FrostHunterWindowManagerInfernoOlympianVortex6395 FrostHunterFragmentBetaMegaVortex6025;
    public final FrostHunterLooperThreadGammaHyperion3034 FrostHunterAlertDialogAuroraDelta3200;
    public final FrostHunterLicensingSpectraPulse8868 FrostHunterCameraXPixelTurboCosmos9814 = new FrostHunterLicensingSpectraPulse8868();
    public final FrostHunterLicensingSpectraPulse8868 FrostHunterFlowMaxDragonHero5809 = new FrostHunterLicensingSpectraPulse8868();
    public Inflater FrostHunterKeyframeGammaGamma1197;

    static {
        FrostHunterAnimatorOlympianPhantomElite2405 frostHunterAnimatorOlympianPhantomElite2405 = FrostHunterAlarmManagerHeroTitaniumFusion5758.FrostHunterFlowMaxDragonHero5809;
        FrostHunterFragmentBetaMegaVortex6025 = new FrostHunterWindowManagerInfernoOlympianVortex6395(-9223372036854775807L, -9223372036854775807L, FrostHunterBitmapNeoCosmos7205.FrostHunterFragmentBetaMegaVortex6025);
    }

    public FrostHunterAdMobStormSpectraUltra3563(List list) {
        int i;
        FrostHunterLooperThreadGammaHyperion3034 frostHunterLooperThreadGammaHyperion3034 = new FrostHunterLooperThreadGammaHyperion3034();
        this.FrostHunterAlertDialogAuroraDelta3200 = frostHunterLooperThreadGammaHyperion3034;
        String trim = new String((byte[]) list.get(0), StandardCharsets.UTF_8).trim();
        String str = FrostHunterGyroscopeHeroAlpha1995.FrostHunterAlphaAnimationNeoCosmos5761;
        for (String str2 : trim.split("\\r?\\n", -1)) {
            if (str2.startsWith("palette: ")) {
                String[] split = str2.substring(9).split(",", -1);
                frostHunterLooperThreadGammaHyperion3034.FrostHunterLevelListDrawableFusionDragonHero2232 = new int[split.length];
                for (int i2 = 0; i2 < split.length; i2++) {
                    int[] iArr = frostHunterLooperThreadGammaHyperion3034.FrostHunterLevelListDrawableFusionDragonHero2232;
                    try {
                        i = Integer.parseInt(split[i2].trim(), 16);
                    } catch (RuntimeException e) {
                        FrostHunterDrawerLayoutUltraStrike3303.FrostHunterColorDrawableLegendPhoenixVision7927("Parsing color failed", e);
                        i = 0;
                    }
                    iArr[i2] = i;
                }
            } else if (str2.startsWith("size: ")) {
                String[] split2 = str2.substring(6).trim().split("x", -1);
                if (split2.length != 2) {
                    FrostHunterDrawerLayoutUltraStrike3303.FrostHunterColorStateListInflaterNovaQuantum4229("Ignoring malformed IDX size line: '" + str2 + "'");
                } else {
                    try {
                        frostHunterLooperThreadGammaHyperion3034.FrostHunterRemoteConfigSpeedSpeed8566 = Integer.parseInt(split2[0]);
                        frostHunterLooperThreadGammaHyperion3034.FrostHunterCameraXPixelTurboCosmos9814 = Integer.parseInt(split2[1]);
                        frostHunterLooperThreadGammaHyperion3034.FrostHunterServiceEliteCelestialThunder1757 = true;
                    } catch (RuntimeException e2) {
                        FrostHunterDrawerLayoutUltraStrike3303.FrostHunterColorDrawableLegendPhoenixVision7927("Parsing IDX failed", e2);
                    }
                }
            }
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to find 'out' block for switch in B:76:0x00b8. Please report as an issue. */
    /* JADX WARN: Removed duplicated region for block: B:34:0x026b  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x027e  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0284  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0278  */
    @Override // android.content.Context.FrostHunterActionBarHyperMax6338
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void FrostHunterFirebaseModelDownloadConditionsSolarBlaze2223(byte[] bArr, int i, int i2, FrostHunterLaunchGammaTitanium8407 frostHunterLaunchGammaTitanium8407, FrostHunterLayoutInflaterNebulaVision6522 frostHunterLayoutInflaterNebulaVision6522) {
        FrostHunterWindowManagerInfernoOlympianVortex6395 frostHunterWindowManagerInfernoOlympianVortex6395;
        boolean z;
        long j;
        boolean z2;
        boolean z3;
        FrostHunterConstraintSetPhoenixVision2576 frostHunterConstraintSetPhoenixVision2576;
        long j2;
        long j3;
        Rect rect;
        FrostHunterLicensingSpectraPulse8868 frostHunterLicensingSpectraPulse8868 = this.FrostHunterCameraXPixelTurboCosmos9814;
        frostHunterLicensingSpectraPulse8868.FrostHunterMagnetometerFusionTitanium8202(bArr, i + i2);
        frostHunterLicensingSpectraPulse8868.FrostHunterR8MasterNebulaSpark7247(i);
        if (this.FrostHunterKeyframeGammaGamma1197 == null) {
            this.FrostHunterKeyframeGammaGamma1197 = new Inflater();
        }
        Inflater inflater = this.FrostHunterKeyframeGammaGamma1197;
        FrostHunterLicensingSpectraPulse8868 frostHunterLicensingSpectraPulse88682 = this.FrostHunterFlowMaxDragonHero5809;
        if (FrostHunterGyroscopeHeroAlpha1995.FrostHunterEditTextPulseHyperion1262(frostHunterLicensingSpectraPulse8868, frostHunterLicensingSpectraPulse88682, inflater)) {
            frostHunterLicensingSpectraPulse8868.FrostHunterMagnetometerFusionTitanium8202(frostHunterLicensingSpectraPulse88682.FrostHunterAlphaAnimationNeoCosmos5761, frostHunterLicensingSpectraPulse88682.FrostHunterBundlePulseFusionHero2475);
        }
        FrostHunterLooperThreadGammaHyperion3034 frostHunterLooperThreadGammaHyperion3034 = this.FrostHunterAlertDialogAuroraDelta3200;
        long j4 = -9223372036854775807L;
        frostHunterLooperThreadGammaHyperion3034.FrostHunterConstraintSetCloneMasterUltraRogue2633 = -9223372036854775807L;
        frostHunterLooperThreadGammaHyperion3034.FrostHunterBundlePulseFusionHero2475 = -9223372036854775807L;
        boolean z4 = false;
        frostHunterLooperThreadGammaHyperion3034.FrostHunterLifecycleBlazeGammaElite2889 = false;
        frostHunterLooperThreadGammaHyperion3034.FrostHunterFlowMaxDragonHero5809 = null;
        frostHunterLooperThreadGammaHyperion3034.FrostHunterAlertDialogAuroraDelta3200 = -1;
        frostHunterLooperThreadGammaHyperion3034.FrostHunterKeyframeGammaGamma1197 = -1;
        int FrostHunterAlphaAnimationNeoCosmos5761 = frostHunterLicensingSpectraPulse8868.FrostHunterAlphaAnimationNeoCosmos5761();
        if (FrostHunterAlphaAnimationNeoCosmos5761 < 2 || frostHunterLicensingSpectraPulse8868.FrostHunterBillingClientFusionVortex9008() != FrostHunterAlphaAnimationNeoCosmos5761) {
            frostHunterWindowManagerInfernoOlympianVortex6395 = FrostHunterFragmentBetaMegaVortex6025;
        } else {
            if (frostHunterLooperThreadGammaHyperion3034.FrostHunterLevelListDrawableFusionDragonHero2232 == null) {
                FrostHunterDrawerLayoutUltraStrike3303.FrostHunterColorStateListInflaterNovaQuantum4229("Skipping SPU (no palette)");
            } else if (frostHunterLooperThreadGammaHyperion3034.FrostHunterServiceEliteCelestialThunder1757) {
                int i3 = frostHunterLicensingSpectraPulse8868.FrostHunterConstraintSetCloneMasterUltraRogue2633 - 2;
                frostHunterLicensingSpectraPulse8868.FrostHunterR8MasterNebulaSpark7247(frostHunterLicensingSpectraPulse8868.FrostHunterBillingClientFusionVortex9008() + i3);
                while (true) {
                    if (frostHunterLicensingSpectraPulse8868.FrostHunterAlphaAnimationNeoCosmos5761() < 4) {
                        j = j4;
                        z2 = z4;
                        z = z2;
                    } else {
                        int i4 = frostHunterLicensingSpectraPulse8868.FrostHunterConstraintSetCloneMasterUltraRogue2633;
                        int FrostHunterBillingClientFusionVortex9008 = frostHunterLicensingSpectraPulse8868.FrostHunterBillingClientFusionVortex9008() * 10000;
                        int FrostHunterBillingClientFusionVortex90082 = frostHunterLicensingSpectraPulse8868.FrostHunterBillingClientFusionVortex9008() + i3;
                        z = (FrostHunterBillingClientFusionVortex90082 == i4 || FrostHunterBillingClientFusionVortex90082 >= frostHunterLicensingSpectraPulse8868.FrostHunterBundlePulseFusionHero2475) ? z4 : true;
                        int i5 = z ? FrostHunterBillingClientFusionVortex90082 : frostHunterLicensingSpectraPulse8868.FrostHunterBundlePulseFusionHero2475;
                        j = j4;
                        boolean z5 = true;
                        while (frostHunterLicensingSpectraPulse8868.FrostHunterConstraintSetCloneMasterUltraRogue2633 < i5 && z5) {
                            long j5 = FrostHunterBillingClientFusionVortex9008;
                            int[] iArr = frostHunterLooperThreadGammaHyperion3034.FrostHunterAlphaAnimationNeoCosmos5761;
                            int FrostHunterMeteringPointBetaCyber9571 = frostHunterLicensingSpectraPulse8868.FrostHunterMeteringPointBetaCyber9571();
                            boolean z6 = z4;
                            if (FrostHunterMeteringPointBetaCyber9571 != 255) {
                                switch (FrostHunterMeteringPointBetaCyber9571) {
                                    case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                                        z3 = true;
                                        break;
                                    case 1:
                                        frostHunterLooperThreadGammaHyperion3034.FrostHunterConstraintSetCloneMasterUltraRogue2633 = j5;
                                        z3 = true;
                                        break;
                                    case 2:
                                        frostHunterLooperThreadGammaHyperion3034.FrostHunterBundlePulseFusionHero2475 = j5;
                                        z3 = true;
                                        break;
                                    case 3:
                                        if (frostHunterLicensingSpectraPulse8868.FrostHunterAlphaAnimationNeoCosmos5761() >= 2) {
                                            int FrostHunterMeteringPointBetaCyber95712 = frostHunterLicensingSpectraPulse8868.FrostHunterMeteringPointBetaCyber9571();
                                            int FrostHunterMeteringPointBetaCyber95713 = frostHunterLicensingSpectraPulse8868.FrostHunterMeteringPointBetaCyber9571();
                                            iArr[3] = FrostHunterLooperThreadGammaHyperion3034.FrostHunterAlphaAnimationNeoCosmos5761(FrostHunterMeteringPointBetaCyber95712 >> 4, frostHunterLooperThreadGammaHyperion3034.FrostHunterLevelListDrawableFusionDragonHero2232);
                                            iArr[2] = FrostHunterLooperThreadGammaHyperion3034.FrostHunterAlphaAnimationNeoCosmos5761(FrostHunterMeteringPointBetaCyber95712 & 15, frostHunterLooperThreadGammaHyperion3034.FrostHunterLevelListDrawableFusionDragonHero2232);
                                            iArr[1] = FrostHunterLooperThreadGammaHyperion3034.FrostHunterAlphaAnimationNeoCosmos5761(FrostHunterMeteringPointBetaCyber95713 >> 4, frostHunterLooperThreadGammaHyperion3034.FrostHunterLevelListDrawableFusionDragonHero2232);
                                            iArr[z6 ? 1 : 0] = FrostHunterLooperThreadGammaHyperion3034.FrostHunterAlphaAnimationNeoCosmos5761(FrostHunterMeteringPointBetaCyber95713 & 15, frostHunterLooperThreadGammaHyperion3034.FrostHunterLevelListDrawableFusionDragonHero2232);
                                            frostHunterLooperThreadGammaHyperion3034.FrostHunterLifecycleBlazeGammaElite2889 = true;
                                            z3 = true;
                                            break;
                                        } else {
                                            FrostHunterDrawerLayoutUltraStrike3303.FrostHunterColorStateListInflaterNovaQuantum4229("Incomplete color command");
                                            break;
                                        }
                                    case 4:
                                        if (frostHunterLicensingSpectraPulse8868.FrostHunterAlphaAnimationNeoCosmos5761() >= 2) {
                                            if (!frostHunterLooperThreadGammaHyperion3034.FrostHunterLifecycleBlazeGammaElite2889) {
                                                FrostHunterDrawerLayoutUltraStrike3303.FrostHunterColorStateListInflaterNovaQuantum4229("Ignoring alpha command before color command");
                                                break;
                                            } else {
                                                int FrostHunterMeteringPointBetaCyber95714 = frostHunterLicensingSpectraPulse8868.FrostHunterMeteringPointBetaCyber9571();
                                                int FrostHunterMeteringPointBetaCyber95715 = frostHunterLicensingSpectraPulse8868.FrostHunterMeteringPointBetaCyber9571();
                                                iArr[3] = FrostHunterLooperThreadGammaHyperion3034.FrostHunterBundlePulseFusionHero2475(iArr[3], FrostHunterMeteringPointBetaCyber95714 >> 4);
                                                iArr[2] = FrostHunterLooperThreadGammaHyperion3034.FrostHunterBundlePulseFusionHero2475(iArr[2], FrostHunterMeteringPointBetaCyber95714 & 15);
                                                iArr[1] = FrostHunterLooperThreadGammaHyperion3034.FrostHunterBundlePulseFusionHero2475(iArr[1], FrostHunterMeteringPointBetaCyber95715 >> 4);
                                                iArr[z6 ? 1 : 0] = FrostHunterLooperThreadGammaHyperion3034.FrostHunterBundlePulseFusionHero2475(iArr[z6 ? 1 : 0], FrostHunterMeteringPointBetaCyber95715 & 15);
                                                z3 = true;
                                                break;
                                            }
                                        } else {
                                            FrostHunterDrawerLayoutUltraStrike3303.FrostHunterColorStateListInflaterNovaQuantum4229("Incomplete alpha command");
                                            break;
                                        }
                                    case FrostHunterRemoteModelManagerCyberLegend2797.STRING_FIELD_NUMBER /* 5 */:
                                        if (frostHunterLicensingSpectraPulse8868.FrostHunterAlphaAnimationNeoCosmos5761() >= 6) {
                                            int FrostHunterMeteringPointBetaCyber95716 = frostHunterLicensingSpectraPulse8868.FrostHunterMeteringPointBetaCyber9571();
                                            int FrostHunterMeteringPointBetaCyber95717 = frostHunterLicensingSpectraPulse8868.FrostHunterMeteringPointBetaCyber9571();
                                            int i6 = (FrostHunterMeteringPointBetaCyber95716 << 4) | (FrostHunterMeteringPointBetaCyber95717 >> 4);
                                            int FrostHunterMeteringPointBetaCyber95718 = ((FrostHunterMeteringPointBetaCyber95717 & 15) << 8) | frostHunterLicensingSpectraPulse8868.FrostHunterMeteringPointBetaCyber9571();
                                            int FrostHunterMeteringPointBetaCyber95719 = frostHunterLicensingSpectraPulse8868.FrostHunterMeteringPointBetaCyber9571();
                                            int FrostHunterMeteringPointBetaCyber957110 = frostHunterLicensingSpectraPulse8868.FrostHunterMeteringPointBetaCyber9571();
                                            frostHunterLooperThreadGammaHyperion3034.FrostHunterFlowMaxDragonHero5809 = new Rect(i6, (FrostHunterMeteringPointBetaCyber95719 << 4) | (FrostHunterMeteringPointBetaCyber957110 >> 4), FrostHunterMeteringPointBetaCyber95718 + 1, (((FrostHunterMeteringPointBetaCyber957110 & 15) << 8) | frostHunterLicensingSpectraPulse8868.FrostHunterMeteringPointBetaCyber9571()) + 1);
                                            z3 = true;
                                            break;
                                        } else {
                                            FrostHunterDrawerLayoutUltraStrike3303.FrostHunterColorStateListInflaterNovaQuantum4229("Incomplete area command");
                                            break;
                                        }
                                    case FrostHunterRemoteModelManagerCyberLegend2797.STRING_SET_FIELD_NUMBER /* 6 */:
                                        if (frostHunterLicensingSpectraPulse8868.FrostHunterAlphaAnimationNeoCosmos5761() >= 4) {
                                            frostHunterLooperThreadGammaHyperion3034.FrostHunterAlertDialogAuroraDelta3200 = frostHunterLicensingSpectraPulse8868.FrostHunterBillingClientFusionVortex9008();
                                            frostHunterLooperThreadGammaHyperion3034.FrostHunterKeyframeGammaGamma1197 = frostHunterLicensingSpectraPulse8868.FrostHunterBillingClientFusionVortex9008();
                                            z3 = true;
                                            break;
                                        } else {
                                            FrostHunterDrawerLayoutUltraStrike3303.FrostHunterColorStateListInflaterNovaQuantum4229("Incomplete offsets command");
                                            break;
                                        }
                                    default:
                                        FrostHunterKeyEventNovaXAlpha1220.FrostHunterMotionSceneAuroraMega2271("Unrecognized command: ", FrostHunterMeteringPointBetaCyber9571);
                                        break;
                                }
                                z4 = z6 ? 1 : 0;
                                z5 = z3;
                            }
                            z3 = z6 ? 1 : 0;
                            z4 = z6 ? 1 : 0;
                            z5 = z3;
                        }
                        z2 = z4;
                        if (z) {
                            frostHunterLicensingSpectraPulse8868.FrostHunterR8MasterNebulaSpark7247(FrostHunterBillingClientFusionVortex90082);
                        }
                    }
                    if (z) {
                        j4 = j;
                        z4 = z2;
                    } else {
                        if (frostHunterLooperThreadGammaHyperion3034.FrostHunterLevelListDrawableFusionDragonHero2232 != null || !frostHunterLooperThreadGammaHyperion3034.FrostHunterServiceEliteCelestialThunder1757 || !frostHunterLooperThreadGammaHyperion3034.FrostHunterLifecycleBlazeGammaElite2889 || (rect = frostHunterLooperThreadGammaHyperion3034.FrostHunterFlowMaxDragonHero5809) == null || frostHunterLooperThreadGammaHyperion3034.FrostHunterAlertDialogAuroraDelta3200 == -1 || frostHunterLooperThreadGammaHyperion3034.FrostHunterKeyframeGammaGamma1197 == -1 || rect.width() < 2 || frostHunterLooperThreadGammaHyperion3034.FrostHunterFlowMaxDragonHero5809.height() < 2) {
                            frostHunterConstraintSetPhoenixVision2576 = null;
                        } else {
                            Rect rect2 = frostHunterLooperThreadGammaHyperion3034.FrostHunterFlowMaxDragonHero5809;
                            int[] iArr2 = new int[rect2.height() * rect2.width()];
                            FrostHunterCountDownTimerStormPulseFusion5949 frostHunterCountDownTimerStormPulseFusion5949 = new FrostHunterCountDownTimerStormPulseFusion5949();
                            frostHunterLicensingSpectraPulse8868.FrostHunterR8MasterNebulaSpark7247(frostHunterLooperThreadGammaHyperion3034.FrostHunterAlertDialogAuroraDelta3200);
                            frostHunterCountDownTimerStormPulseFusion5949.FrostHunterKeyframeGammaGamma1197(frostHunterLicensingSpectraPulse8868);
                            frostHunterLooperThreadGammaHyperion3034.FrostHunterConstraintSetCloneMasterUltraRogue2633(frostHunterCountDownTimerStormPulseFusion5949, true, rect2, iArr2);
                            frostHunterLicensingSpectraPulse8868.FrostHunterR8MasterNebulaSpark7247(frostHunterLooperThreadGammaHyperion3034.FrostHunterKeyframeGammaGamma1197);
                            frostHunterCountDownTimerStormPulseFusion5949.FrostHunterKeyframeGammaGamma1197(frostHunterLicensingSpectraPulse8868);
                            frostHunterLooperThreadGammaHyperion3034.FrostHunterConstraintSetCloneMasterUltraRogue2633(frostHunterCountDownTimerStormPulseFusion5949, z2, rect2, iArr2);
                            frostHunterConstraintSetPhoenixVision2576 = new FrostHunterConstraintSetPhoenixVision2576(null, null, null, Bitmap.createBitmap(iArr2, rect2.width(), rect2.height(), Bitmap.Config.ARGB_8888), rect2.top / frostHunterLooperThreadGammaHyperion3034.FrostHunterCameraXPixelTurboCosmos9814, 0, 0, rect2.left / frostHunterLooperThreadGammaHyperion3034.FrostHunterRemoteConfigSpeedSpeed8566, 0, Integer.MIN_VALUE, -3.4028235E38f, rect2.width() / frostHunterLooperThreadGammaHyperion3034.FrostHunterRemoteConfigSpeedSpeed8566, rect2.height() / frostHunterLooperThreadGammaHyperion3034.FrostHunterCameraXPixelTurboCosmos9814, false, -16777216, Integer.MIN_VALUE, 0.0f, 0);
                        }
                        j2 = frostHunterLooperThreadGammaHyperion3034.FrostHunterBundlePulseFusionHero2475;
                        if (j2 == j) {
                            long j6 = frostHunterLooperThreadGammaHyperion3034.FrostHunterConstraintSetCloneMasterUltraRogue2633;
                            if (j6 != j && j2 > j6) {
                                j2 -= j6;
                            }
                            j3 = j2;
                        } else {
                            j3 = j;
                        }
                        frostHunterWindowManagerInfernoOlympianVortex6395 = new FrostHunterWindowManagerInfernoOlympianVortex6395(frostHunterLooperThreadGammaHyperion3034.FrostHunterConstraintSetCloneMasterUltraRogue2633, j3, frostHunterConstraintSetPhoenixVision2576 == null ? FrostHunterAlarmManagerHeroTitaniumFusion5758.FrostHunterScaleAnimationStrikeSpark5059(frostHunterConstraintSetPhoenixVision2576) : FrostHunterBitmapNeoCosmos7205.FrostHunterFragmentBetaMegaVortex6025);
                    }
                }
            } else {
                FrostHunterDrawerLayoutUltraStrike3303.FrostHunterColorStateListInflaterNovaQuantum4229("Skipping SPU (no plane)");
            }
            j = -9223372036854775807L;
            z2 = false;
            if (frostHunterLooperThreadGammaHyperion3034.FrostHunterLevelListDrawableFusionDragonHero2232 != null) {
            }
            frostHunterConstraintSetPhoenixVision2576 = null;
            j2 = frostHunterLooperThreadGammaHyperion3034.FrostHunterBundlePulseFusionHero2475;
            if (j2 == j) {
            }
            frostHunterWindowManagerInfernoOlympianVortex6395 = new FrostHunterWindowManagerInfernoOlympianVortex6395(frostHunterLooperThreadGammaHyperion3034.FrostHunterConstraintSetCloneMasterUltraRogue2633, j3, frostHunterConstraintSetPhoenixVision2576 == null ? FrostHunterAlarmManagerHeroTitaniumFusion5758.FrostHunterScaleAnimationStrikeSpark5059(frostHunterConstraintSetPhoenixVision2576) : FrostHunterBitmapNeoCosmos7205.FrostHunterFragmentBetaMegaVortex6025);
        }
        frostHunterLayoutInflaterNebulaVision6522.accept(frostHunterWindowManagerInfernoOlympianVortex6395);
    }
}
