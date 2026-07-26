package android.content.Context;

import java.nio.ByteBuffer;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Locale;

/* compiled from: r8-map-id-ad53bc00775cc49f3760de3ef5ee15f0f7d4eb373264baa1785c3fa1a15d54ed */
/* loaded from: classes.dex */
public final class FrostHunterAlertDialogDeltaBetaNovaX7607 extends FrostHunterGraphQuantumSpeed6562 {
    public static final FrostHunterVibratorSpectraBetaNovaX4683 FrostHunterConstraintSetCloneMasterUltraRogue2633 = new FrostHunterVibratorSpectraBetaNovaX4683(21);
    public final FrostHunterMLKitPixelSpark4804 FrostHunterAlphaAnimationNeoCosmos5761;

    public FrostHunterAlertDialogDeltaBetaNovaX7607(FrostHunterMLKitPixelSpark4804 frostHunterMLKitPixelSpark4804) {
        this.FrostHunterAlphaAnimationNeoCosmos5761 = frostHunterMLKitPixelSpark4804;
    }

    public static int FrostHunterBillingClientFusionVortex9008(byte[] bArr, int i) {
        while (i < bArr.length) {
            if (bArr[i] == 0) {
                return i;
            }
            i++;
        }
        return bArr.length;
    }

    public static String FrostHunterBitmapTurboDeltaNebula8743(byte[] bArr, int i, int i2, Charset charset) {
        return (i2 <= i || i2 > bArr.length) ? "" : new String(bArr, i, i2 - i, charset);
    }

    public static FrostHunterConfigurationQuantumEclipseRogue4956 FrostHunterCameraXTurboCelestialHero5430(int i, FrostHunterLicensingSpectraPulse8868 frostHunterLicensingSpectraPulse8868) {
        if (i < 4) {
            return null;
        }
        int FrostHunterMeteringPointBetaCyber9571 = frostHunterLicensingSpectraPulse8868.FrostHunterMeteringPointBetaCyber9571();
        Charset FrostHunterCardViewSpectraCyber7714 = FrostHunterCardViewSpectraCyber7714(FrostHunterMeteringPointBetaCyber9571);
        byte[] bArr = new byte[3];
        frostHunterLicensingSpectraPulse8868.FrostHunterKeyframeGammaGamma1197(bArr, 0, 3);
        String str = new String(bArr, 0, 3);
        int i2 = i - 4;
        byte[] bArr2 = new byte[i2];
        frostHunterLicensingSpectraPulse8868.FrostHunterKeyframeGammaGamma1197(bArr2, 0, i2);
        int FrostHunterMeteringPointMegaCyber7955 = FrostHunterMeteringPointMegaCyber7955(bArr2, 0, FrostHunterMeteringPointBetaCyber9571);
        String str2 = new String(bArr2, 0, FrostHunterMeteringPointMegaCyber7955, FrostHunterCardViewSpectraCyber7714);
        int FrostHunterDatabaseEliteShadowUltra2452 = FrostHunterDatabaseEliteShadowUltra2452(FrostHunterMeteringPointBetaCyber9571) + FrostHunterMeteringPointMegaCyber7955;
        return new FrostHunterConfigurationQuantumEclipseRogue4956(str, str2, FrostHunterBitmapTurboDeltaNebula8743(bArr2, FrostHunterDatabaseEliteShadowUltra2452, FrostHunterMeteringPointMegaCyber7955(bArr2, FrostHunterDatabaseEliteShadowUltra2452, FrostHunterMeteringPointBetaCyber9571), FrostHunterCardViewSpectraCyber7714));
    }

    public static Charset FrostHunterCardViewSpectraCyber7714(int i) {
        return i != 1 ? i != 2 ? i != 3 ? StandardCharsets.ISO_8859_1 : StandardCharsets.UTF_8 : StandardCharsets.UTF_16BE : StandardCharsets.UTF_16;
    }

    public static int FrostHunterDatabaseEliteShadowUltra2452(int i) {
        return (i == 0 || i == 3) ? 1 : 2;
    }

    public static FrostHunterSharedPreferencesVisionQuantum3531 FrostHunterDialogFragmentTurboPhoenixDragon7627(int i, FrostHunterLicensingSpectraPulse8868 frostHunterLicensingSpectraPulse8868, String str) {
        if (i < 1) {
            return null;
        }
        int FrostHunterMeteringPointBetaCyber9571 = frostHunterLicensingSpectraPulse8868.FrostHunterMeteringPointBetaCyber9571();
        int i2 = i - 1;
        byte[] bArr = new byte[i2];
        frostHunterLicensingSpectraPulse8868.FrostHunterKeyframeGammaGamma1197(bArr, 0, i2);
        return new FrostHunterSharedPreferencesVisionQuantum3531(str, null, FrostHunterLooperHyperionForce4133(bArr, FrostHunterMeteringPointBetaCyber9571, 0));
    }

    public static FrostHunterPaintMasterMaxRogue5470 FrostHunterEditTextPulseHyperion1262(int i, FrostHunterLicensingSpectraPulse8868 frostHunterLicensingSpectraPulse8868) {
        if (i < 1) {
            return null;
        }
        int FrostHunterMeteringPointBetaCyber9571 = frostHunterLicensingSpectraPulse8868.FrostHunterMeteringPointBetaCyber9571();
        int i2 = i - 1;
        byte[] bArr = new byte[i2];
        frostHunterLicensingSpectraPulse8868.FrostHunterKeyframeGammaGamma1197(bArr, 0, i2);
        int FrostHunterMeteringPointMegaCyber7955 = FrostHunterMeteringPointMegaCyber7955(bArr, 0, FrostHunterMeteringPointBetaCyber9571);
        String str = new String(bArr, 0, FrostHunterMeteringPointMegaCyber7955, FrostHunterCardViewSpectraCyber7714(FrostHunterMeteringPointBetaCyber9571));
        int FrostHunterDatabaseEliteShadowUltra2452 = FrostHunterDatabaseEliteShadowUltra2452(FrostHunterMeteringPointBetaCyber9571) + FrostHunterMeteringPointMegaCyber7955;
        return new FrostHunterPaintMasterMaxRogue5470("WXXX", str, FrostHunterBitmapTurboDeltaNebula8743(bArr, FrostHunterDatabaseEliteShadowUltra2452, FrostHunterBillingClientFusionVortex9008(bArr, FrostHunterDatabaseEliteShadowUltra2452), StandardCharsets.ISO_8859_1));
    }

    public static FrostHunterRemoteConfigOmegaOlympian1993 FrostHunterFirebaseModelDownloadConditionsSolarBlaze2223(FrostHunterLicensingSpectraPulse8868 frostHunterLicensingSpectraPulse8868, int i, int i2, boolean z, int i3, FrostHunterMLKitPixelSpark4804 frostHunterMLKitPixelSpark4804) {
        int i4 = frostHunterLicensingSpectraPulse8868.FrostHunterConstraintSetCloneMasterUltraRogue2633;
        int FrostHunterBillingClientFusionVortex9008 = FrostHunterBillingClientFusionVortex9008(frostHunterLicensingSpectraPulse8868.FrostHunterAlphaAnimationNeoCosmos5761, i4);
        String str = new String(frostHunterLicensingSpectraPulse8868.FrostHunterAlphaAnimationNeoCosmos5761, i4, FrostHunterBillingClientFusionVortex9008 - i4, StandardCharsets.ISO_8859_1);
        frostHunterLicensingSpectraPulse8868.FrostHunterR8MasterNebulaSpark7247(FrostHunterBillingClientFusionVortex9008 + 1);
        int FrostHunterServiceConnectionTurboPhoenixOmega6719 = frostHunterLicensingSpectraPulse8868.FrostHunterServiceConnectionTurboPhoenixOmega6719();
        int FrostHunterServiceConnectionTurboPhoenixOmega67192 = frostHunterLicensingSpectraPulse8868.FrostHunterServiceConnectionTurboPhoenixOmega6719();
        long FrostHunterEditTextPulseHyperion1262 = frostHunterLicensingSpectraPulse8868.FrostHunterEditTextPulseHyperion1262();
        if (FrostHunterEditTextPulseHyperion1262 == 4294967295L) {
            FrostHunterEditTextPulseHyperion1262 = -1;
        }
        long FrostHunterEditTextPulseHyperion12622 = frostHunterLicensingSpectraPulse8868.FrostHunterEditTextPulseHyperion1262();
        long j = FrostHunterEditTextPulseHyperion12622 == 4294967295L ? -1L : FrostHunterEditTextPulseHyperion12622;
        ArrayList arrayList = new ArrayList();
        int i5 = i4 + i;
        while (frostHunterLicensingSpectraPulse8868.FrostHunterConstraintSetCloneMasterUltraRogue2633 < i5) {
            FrostHunterExecutorBetaPhoenix5827 FrostHunterResourcesTitanHyperVision5823 = FrostHunterResourcesTitanHyperVision5823(i2, frostHunterLicensingSpectraPulse8868, z, i3, frostHunterMLKitPixelSpark4804);
            if (FrostHunterResourcesTitanHyperVision5823 != null) {
                arrayList.add(FrostHunterResourcesTitanHyperVision5823);
            }
        }
        return new FrostHunterRemoteConfigOmegaOlympian1993(str, FrostHunterServiceConnectionTurboPhoenixOmega6719, FrostHunterServiceConnectionTurboPhoenixOmega67192, FrostHunterEditTextPulseHyperion1262, j, (FrostHunterExecutorBetaPhoenix5827[]) arrayList.toArray(new FrostHunterExecutorBetaPhoenix5827[0]));
    }

    public static FrostHunterStrictModeNeoSparkPixel2322 FrostHunterLintTitanVortexQuantum9911(FrostHunterLicensingSpectraPulse8868 frostHunterLicensingSpectraPulse8868, int i, int i2, boolean z, int i3, FrostHunterMLKitPixelSpark4804 frostHunterMLKitPixelSpark4804) {
        int i4 = frostHunterLicensingSpectraPulse8868.FrostHunterConstraintSetCloneMasterUltraRogue2633;
        int FrostHunterBillingClientFusionVortex9008 = FrostHunterBillingClientFusionVortex9008(frostHunterLicensingSpectraPulse8868.FrostHunterAlphaAnimationNeoCosmos5761, i4);
        String str = new String(frostHunterLicensingSpectraPulse8868.FrostHunterAlphaAnimationNeoCosmos5761, i4, FrostHunterBillingClientFusionVortex9008 - i4, StandardCharsets.ISO_8859_1);
        frostHunterLicensingSpectraPulse8868.FrostHunterR8MasterNebulaSpark7247(FrostHunterBillingClientFusionVortex9008 + 1);
        int FrostHunterMeteringPointBetaCyber9571 = frostHunterLicensingSpectraPulse8868.FrostHunterMeteringPointBetaCyber9571();
        boolean z2 = (FrostHunterMeteringPointBetaCyber9571 & 2) != 0;
        boolean z3 = (FrostHunterMeteringPointBetaCyber9571 & 1) != 0;
        int FrostHunterMeteringPointBetaCyber95712 = frostHunterLicensingSpectraPulse8868.FrostHunterMeteringPointBetaCyber9571();
        String[] strArr = new String[FrostHunterMeteringPointBetaCyber95712];
        for (int i5 = 0; i5 < FrostHunterMeteringPointBetaCyber95712; i5++) {
            int i6 = frostHunterLicensingSpectraPulse8868.FrostHunterConstraintSetCloneMasterUltraRogue2633;
            int FrostHunterBillingClientFusionVortex90082 = FrostHunterBillingClientFusionVortex9008(frostHunterLicensingSpectraPulse8868.FrostHunterAlphaAnimationNeoCosmos5761, i6);
            strArr[i5] = new String(frostHunterLicensingSpectraPulse8868.FrostHunterAlphaAnimationNeoCosmos5761, i6, FrostHunterBillingClientFusionVortex90082 - i6, StandardCharsets.ISO_8859_1);
            frostHunterLicensingSpectraPulse8868.FrostHunterR8MasterNebulaSpark7247(FrostHunterBillingClientFusionVortex90082 + 1);
        }
        ArrayList arrayList = new ArrayList();
        int i7 = i4 + i;
        while (frostHunterLicensingSpectraPulse8868.FrostHunterConstraintSetCloneMasterUltraRogue2633 < i7) {
            FrostHunterExecutorBetaPhoenix5827 FrostHunterResourcesTitanHyperVision5823 = FrostHunterResourcesTitanHyperVision5823(i2, frostHunterLicensingSpectraPulse8868, z, i3, frostHunterMLKitPixelSpark4804);
            if (FrostHunterResourcesTitanHyperVision5823 != null) {
                arrayList.add(FrostHunterResourcesTitanHyperVision5823);
            }
        }
        return new FrostHunterStrictModeNeoSparkPixel2322(str, z2, z3, strArr, (FrostHunterExecutorBetaPhoenix5827[]) arrayList.toArray(new FrostHunterExecutorBetaPhoenix5827[0]));
    }

    public static FrostHunterBitmapNeoCosmos7205 FrostHunterLooperHyperionForce4133(byte[] bArr, int i, int i2) {
        if (i2 >= bArr.length) {
            return FrostHunterAlarmManagerHeroTitaniumFusion5758.FrostHunterScaleAnimationStrikeSpark5059("");
        }
        FrostHunterTextureViewBlazePhantomDragon5593 FrostHunterAlertDialogAuroraDelta3200 = FrostHunterAlarmManagerHeroTitaniumFusion5758.FrostHunterAlertDialogAuroraDelta3200();
        int FrostHunterMeteringPointMegaCyber7955 = FrostHunterMeteringPointMegaCyber7955(bArr, i2, i);
        while (i2 < FrostHunterMeteringPointMegaCyber7955) {
            FrostHunterAlertDialogAuroraDelta3200.FrostHunterConstraintSetCloneMasterUltraRogue2633(new String(bArr, i2, FrostHunterMeteringPointMegaCyber7955 - i2, FrostHunterCardViewSpectraCyber7714(i)));
            i2 = FrostHunterDatabaseEliteShadowUltra2452(i) + FrostHunterMeteringPointMegaCyber7955;
            FrostHunterMeteringPointMegaCyber7955 = FrostHunterMeteringPointMegaCyber7955(bArr, i2, i);
        }
        FrostHunterBitmapNeoCosmos7205 FrostHunterLevelListDrawableFusionDragonHero2232 = FrostHunterAlertDialogAuroraDelta3200.FrostHunterLevelListDrawableFusionDragonHero2232();
        return FrostHunterLevelListDrawableFusionDragonHero2232.isEmpty() ? FrostHunterAlarmManagerHeroTitaniumFusion5758.FrostHunterScaleAnimationStrikeSpark5059("") : FrostHunterLevelListDrawableFusionDragonHero2232;
    }

    public static FrostHunterGradientDrawableVortexBetaNebula1574 FrostHunterLooperThreadBetaHyperionMax1000(int i, FrostHunterLicensingSpectraPulse8868 frostHunterLicensingSpectraPulse8868) {
        int FrostHunterBillingClientFusionVortex9008 = frostHunterLicensingSpectraPulse8868.FrostHunterBillingClientFusionVortex9008();
        int FrostHunterDatabaseEliteShadowUltra2452 = frostHunterLicensingSpectraPulse8868.FrostHunterDatabaseEliteShadowUltra2452();
        int FrostHunterDatabaseEliteShadowUltra24522 = frostHunterLicensingSpectraPulse8868.FrostHunterDatabaseEliteShadowUltra2452();
        int FrostHunterMeteringPointBetaCyber9571 = frostHunterLicensingSpectraPulse8868.FrostHunterMeteringPointBetaCyber9571();
        int FrostHunterMeteringPointBetaCyber95712 = frostHunterLicensingSpectraPulse8868.FrostHunterMeteringPointBetaCyber9571();
        FrostHunterCountDownTimerStormPulseFusion5949 frostHunterCountDownTimerStormPulseFusion5949 = new FrostHunterCountDownTimerStormPulseFusion5949();
        frostHunterCountDownTimerStormPulseFusion5949.FrostHunterKeyframeGammaGamma1197(frostHunterLicensingSpectraPulse8868);
        int i2 = ((i - 10) * 8) / (FrostHunterMeteringPointBetaCyber9571 + FrostHunterMeteringPointBetaCyber95712);
        int[] iArr = new int[i2];
        int[] iArr2 = new int[i2];
        for (int i3 = 0; i3 < i2; i3++) {
            int FrostHunterRemoteConfigSpeedSpeed8566 = frostHunterCountDownTimerStormPulseFusion5949.FrostHunterRemoteConfigSpeedSpeed8566(FrostHunterMeteringPointBetaCyber9571);
            int FrostHunterRemoteConfigSpeedSpeed85662 = frostHunterCountDownTimerStormPulseFusion5949.FrostHunterRemoteConfigSpeedSpeed8566(FrostHunterMeteringPointBetaCyber95712);
            iArr[i3] = FrostHunterRemoteConfigSpeedSpeed8566;
            iArr2[i3] = FrostHunterRemoteConfigSpeedSpeed85662;
        }
        return new FrostHunterGradientDrawableVortexBetaNebula1574(FrostHunterBillingClientFusionVortex9008, FrostHunterDatabaseEliteShadowUltra2452, FrostHunterDatabaseEliteShadowUltra24522, iArr, iArr2);
    }

    public static int FrostHunterMediaPlayerCelestialBetaTitan3868(int i, FrostHunterLicensingSpectraPulse8868 frostHunterLicensingSpectraPulse8868) {
        byte[] bArr = frostHunterLicensingSpectraPulse8868.FrostHunterAlphaAnimationNeoCosmos5761;
        int i2 = frostHunterLicensingSpectraPulse8868.FrostHunterConstraintSetCloneMasterUltraRogue2633;
        int i3 = i2;
        while (true) {
            int i4 = i3 + 1;
            if (i4 >= i2 + i) {
                return i;
            }
            if ((bArr[i3] & 255) == 255 && bArr[i4] == 0) {
                System.arraycopy(bArr, i3 + 2, bArr, i4, (i - (i3 - i2)) - 2);
                i--;
            }
            i3 = i4;
        }
    }

    public static FrostHunterSharedPreferencesVisionQuantum3531 FrostHunterMeteringPointBetaCyber9571(int i, FrostHunterLicensingSpectraPulse8868 frostHunterLicensingSpectraPulse8868) {
        if (i < 1) {
            return null;
        }
        int FrostHunterMeteringPointBetaCyber9571 = frostHunterLicensingSpectraPulse8868.FrostHunterMeteringPointBetaCyber9571();
        int i2 = i - 1;
        byte[] bArr = new byte[i2];
        frostHunterLicensingSpectraPulse8868.FrostHunterKeyframeGammaGamma1197(bArr, 0, i2);
        int FrostHunterMeteringPointMegaCyber7955 = FrostHunterMeteringPointMegaCyber7955(bArr, 0, FrostHunterMeteringPointBetaCyber9571);
        return new FrostHunterSharedPreferencesVisionQuantum3531("TXXX", new String(bArr, 0, FrostHunterMeteringPointMegaCyber7955, FrostHunterCardViewSpectraCyber7714(FrostHunterMeteringPointBetaCyber9571)), FrostHunterLooperHyperionForce4133(bArr, FrostHunterMeteringPointBetaCyber9571, FrostHunterDatabaseEliteShadowUltra2452(FrostHunterMeteringPointBetaCyber9571) + FrostHunterMeteringPointMegaCyber7955));
    }

    public static int FrostHunterMeteringPointMegaCyber7955(byte[] bArr, int i, int i2) {
        int FrostHunterBillingClientFusionVortex9008 = FrostHunterBillingClientFusionVortex9008(bArr, i);
        if (i2 == 0 || i2 == 3) {
            return FrostHunterBillingClientFusionVortex9008;
        }
        while (FrostHunterBillingClientFusionVortex9008 < bArr.length - 1) {
            if ((FrostHunterBillingClientFusionVortex9008 - i) % 2 == 0 && bArr[FrostHunterBillingClientFusionVortex9008 + 1] == 0) {
                return FrostHunterBillingClientFusionVortex9008;
            }
            FrostHunterBillingClientFusionVortex9008 = FrostHunterBillingClientFusionVortex9008(bArr, FrostHunterBillingClientFusionVortex9008 + 1);
        }
        return bArr.length;
    }

    public static FrostHunterStateFlowCelestialSolar6013 FrostHunterMotionSceneAuroraMega2271(int i, FrostHunterLicensingSpectraPulse8868 frostHunterLicensingSpectraPulse8868) {
        byte[] bArr = new byte[i];
        frostHunterLicensingSpectraPulse8868.FrostHunterKeyframeGammaGamma1197(bArr, 0, i);
        int FrostHunterBillingClientFusionVortex9008 = FrostHunterBillingClientFusionVortex9008(bArr, 0);
        String str = new String(bArr, 0, FrostHunterBillingClientFusionVortex9008, StandardCharsets.ISO_8859_1);
        int i2 = FrostHunterBillingClientFusionVortex9008 + 1;
        return new FrostHunterStateFlowCelestialSolar6013(str, i <= i2 ? FrostHunterGyroscopeHeroAlpha1995.FrostHunterConstraintSetCloneMasterUltraRogue2633 : Arrays.copyOfRange(bArr, i2, i));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:63:0x023b  */
    /* JADX WARN: Type inference failed for: r12v1 */
    /* JADX WARN: Type inference failed for: r12v2, types: [android.content.Context.FrostHunterExecutorBetaPhoenix5827] */
    /* JADX WARN: Type inference failed for: r12v4 */
    /* JADX WARN: Type inference failed for: r1v1, types: [int] */
    /* JADX WARN: Type inference failed for: r1v13 */
    /* JADX WARN: Type inference failed for: r1v14 */
    /* JADX WARN: Type inference failed for: r1v16 */
    /* JADX WARN: Type inference failed for: r1v17 */
    /* JADX WARN: Type inference failed for: r1v18 */
    /* JADX WARN: Type inference failed for: r1v19 */
    /* JADX WARN: Type inference failed for: r1v21 */
    /* JADX WARN: Type inference failed for: r1v26 */
    /* JADX WARN: Type inference failed for: r1v27 */
    /* JADX WARN: Type inference failed for: r1v28, types: [android.content.Context.FrostHunterLicensingSpectraPulse8868] */
    /* JADX WARN: Type inference failed for: r1v29 */
    /* JADX WARN: Type inference failed for: r1v3 */
    /* JADX WARN: Type inference failed for: r1v30 */
    /* JADX WARN: Type inference failed for: r1v32 */
    /* JADX WARN: Type inference failed for: r1v33 */
    /* JADX WARN: Type inference failed for: r1v34 */
    /* JADX WARN: Type inference failed for: r1v35 */
    /* JADX WARN: Type inference failed for: r1v4 */
    /* JADX WARN: Type inference failed for: r1v40 */
    /* JADX WARN: Type inference failed for: r1v41 */
    /* JADX WARN: Type inference failed for: r1v42 */
    /* JADX WARN: Type inference failed for: r1v6 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static FrostHunterExecutorBetaPhoenix5827 FrostHunterResourcesTitanHyperVision5823(int i, FrostHunterLicensingSpectraPulse8868 frostHunterLicensingSpectraPulse8868, boolean z, int i2, FrostHunterMLKitPixelSpark4804 frostHunterMLKitPixelSpark4804) {
        int FrostHunterCardViewSpectraCyber7714;
        int i3;
        int i4;
        int i5;
        ?? r1;
        boolean z2;
        boolean z3;
        boolean z4;
        boolean z5;
        boolean z6;
        int i6;
        int i7;
        FrostHunterLicensingSpectraPulse8868 frostHunterLicensingSpectraPulse88682;
        Throwable th;
        FrostHunterLicensingSpectraPulse8868 frostHunterLicensingSpectraPulse88683;
        int i8;
        FrostHunterLicensingSpectraPulse8868 frostHunterLicensingSpectraPulse88684;
        ?? r12;
        FrostHunterExecutorBetaPhoenix5827 frostHunterFirebasePrimeTitanium8884;
        int i9 = i;
        int FrostHunterMeteringPointBetaCyber9571 = frostHunterLicensingSpectraPulse8868.FrostHunterMeteringPointBetaCyber9571();
        int FrostHunterMeteringPointBetaCyber95712 = frostHunterLicensingSpectraPulse8868.FrostHunterMeteringPointBetaCyber9571();
        int FrostHunterMeteringPointBetaCyber95713 = frostHunterLicensingSpectraPulse8868.FrostHunterMeteringPointBetaCyber9571();
        int FrostHunterMeteringPointBetaCyber95714 = i9 >= 3 ? frostHunterLicensingSpectraPulse8868.FrostHunterMeteringPointBetaCyber9571() : 0;
        if (i9 == 4) {
            FrostHunterCardViewSpectraCyber7714 = frostHunterLicensingSpectraPulse8868.FrostHunterCardViewSpectraCyber7714();
            if (!z) {
                FrostHunterCardViewSpectraCyber7714 = (((FrostHunterCardViewSpectraCyber7714 >> 24) & 255) << 21) | (FrostHunterCardViewSpectraCyber7714 & 255) | (((FrostHunterCardViewSpectraCyber7714 >> 8) & 255) << 7) | (((FrostHunterCardViewSpectraCyber7714 >> 16) & 255) << 14);
            }
        } else {
            FrostHunterCardViewSpectraCyber7714 = i9 == 3 ? frostHunterLicensingSpectraPulse8868.FrostHunterCardViewSpectraCyber7714() : frostHunterLicensingSpectraPulse8868.FrostHunterDatabaseEliteShadowUltra2452();
        }
        int i10 = FrostHunterCardViewSpectraCyber7714;
        int FrostHunterBillingClientFusionVortex9008 = i9 >= 3 ? frostHunterLicensingSpectraPulse8868.FrostHunterBillingClientFusionVortex9008() : 0;
        if (FrostHunterMeteringPointBetaCyber9571 == 0 && FrostHunterMeteringPointBetaCyber95712 == 0 && FrostHunterMeteringPointBetaCyber95713 == 0 && FrostHunterMeteringPointBetaCyber95714 == 0 && i10 == 0 && FrostHunterBillingClientFusionVortex9008 == 0) {
            frostHunterLicensingSpectraPulse8868.FrostHunterR8MasterNebulaSpark7247(frostHunterLicensingSpectraPulse8868.FrostHunterBundlePulseFusionHero2475);
            return null;
        }
        int i11 = frostHunterLicensingSpectraPulse8868.FrostHunterConstraintSetCloneMasterUltraRogue2633 + i10;
        if (i11 > frostHunterLicensingSpectraPulse8868.FrostHunterBundlePulseFusionHero2475) {
            FrostHunterDrawerLayoutUltraStrike3303.FrostHunterColorStateListInflaterNovaQuantum4229("Frame size exceeds remaining tag data");
            frostHunterLicensingSpectraPulse8868.FrostHunterR8MasterNebulaSpark7247(frostHunterLicensingSpectraPulse8868.FrostHunterBundlePulseFusionHero2475);
            return null;
        }
        if (frostHunterMLKitPixelSpark4804 != null) {
            boolean FrostHunterConstraintSetCloneMasterUltraRogue26332 = frostHunterMLKitPixelSpark4804.FrostHunterConstraintSetCloneMasterUltraRogue2633(i9, FrostHunterMeteringPointBetaCyber9571, FrostHunterMeteringPointBetaCyber95712, FrostHunterMeteringPointBetaCyber95713, FrostHunterMeteringPointBetaCyber95714);
            i9 = i9;
            r1 = FrostHunterMeteringPointBetaCyber95712;
            i3 = FrostHunterMeteringPointBetaCyber9571;
            i4 = FrostHunterMeteringPointBetaCyber95713;
            i5 = FrostHunterMeteringPointBetaCyber95714;
            if (!FrostHunterConstraintSetCloneMasterUltraRogue26332) {
                frostHunterLicensingSpectraPulse8868.FrostHunterR8MasterNebulaSpark7247(i11);
                return null;
            }
        } else {
            i3 = FrostHunterMeteringPointBetaCyber9571;
            i4 = FrostHunterMeteringPointBetaCyber95713;
            i5 = FrostHunterMeteringPointBetaCyber95714;
            r1 = FrostHunterMeteringPointBetaCyber95712;
        }
        if (i9 == 3) {
            z2 = (FrostHunterBillingClientFusionVortex9008 & 128) != 0;
            z3 = (FrostHunterBillingClientFusionVortex9008 & 64) != 0;
            z6 = false;
            z5 = (FrostHunterBillingClientFusionVortex9008 & 32) != 0;
            z4 = z2;
        } else if (i9 == 4) {
            boolean z7 = (FrostHunterBillingClientFusionVortex9008 & 64) != 0;
            boolean z8 = (FrostHunterBillingClientFusionVortex9008 & 8) != 0;
            boolean z9 = (FrostHunterBillingClientFusionVortex9008 & 4) != 0;
            z6 = (FrostHunterBillingClientFusionVortex9008 & 2) != 0;
            z4 = (FrostHunterBillingClientFusionVortex9008 & 1) != 0;
            boolean z10 = z9;
            z5 = z7;
            z2 = z8;
            z3 = z10;
        } else {
            z2 = false;
            z3 = false;
            z4 = false;
            z5 = false;
            z6 = false;
        }
        if (z2 || z3) {
            FrostHunterDrawerLayoutUltraStrike3303.FrostHunterColorStateListInflaterNovaQuantum4229("Skipping unsupported compressed or encrypted frame");
            frostHunterLicensingSpectraPulse8868.FrostHunterR8MasterNebulaSpark7247(i11);
            return null;
        }
        if (z5) {
            i10--;
            frostHunterLicensingSpectraPulse8868.FrostHunterFCMDeltaQuantumHero8364(1);
        }
        if (z4) {
            i10 -= 4;
            frostHunterLicensingSpectraPulse8868.FrostHunterFCMDeltaQuantumHero8364(4);
        }
        if (z6) {
            i10 = FrostHunterMediaPlayerCelestialBetaTitan3868(i10, frostHunterLicensingSpectraPulse8868);
        }
        try {
            try {
            } catch (Throwable th2) {
                th = th2;
                frostHunterLicensingSpectraPulse88683 = frostHunterLicensingSpectraPulse8868;
            }
        } catch (Exception e) {
            e = e;
            i6 = r1;
            i7 = i4;
            frostHunterLicensingSpectraPulse88682 = frostHunterLicensingSpectraPulse8868;
            i4 = i10;
            th = null;
            i8 = i5;
            frostHunterLicensingSpectraPulse88684 = frostHunterLicensingSpectraPulse88682;
            frostHunterLicensingSpectraPulse88684.FrostHunterR8MasterNebulaSpark7247(i11);
            r12 = th;
            if (r12 == 0) {
            }
            return r12;
        } catch (OutOfMemoryError e2) {
            e = e2;
            i6 = r1;
            i7 = i4;
            frostHunterLicensingSpectraPulse88682 = frostHunterLicensingSpectraPulse8868;
            i4 = i10;
            th = null;
            i8 = i5;
            frostHunterLicensingSpectraPulse88684 = frostHunterLicensingSpectraPulse88682;
            frostHunterLicensingSpectraPulse88684.FrostHunterR8MasterNebulaSpark7247(i11);
            r12 = th;
            if (r12 == 0) {
            }
            return r12;
        }
        if (i3 == 84 && r1 == 88 && i4 == 88 && (i9 == 2 || i5 == 88)) {
            frostHunterFirebasePrimeTitanium8884 = FrostHunterMeteringPointBetaCyber9571(i10, frostHunterLicensingSpectraPulse8868);
        } else if (i3 == 84) {
            frostHunterFirebasePrimeTitanium8884 = FrostHunterDialogFragmentTurboPhoenixDragon7627(i10, frostHunterLicensingSpectraPulse8868, FrostHunterViewPhantomNeo1634(i9, i3, r1, i4, i5));
        } else if (i3 == 87 && r1 == 88 && i4 == 88 && (i9 == 2 || i5 == 88)) {
            frostHunterFirebasePrimeTitanium8884 = FrostHunterEditTextPulseHyperion1262(i10, frostHunterLicensingSpectraPulse8868);
        } else if (i3 == 87) {
            frostHunterFirebasePrimeTitanium8884 = FrostHunterServiceInfoHyperionSparkMax9966(i10, frostHunterLicensingSpectraPulse8868, FrostHunterViewPhantomNeo1634(i9, i3, r1, i4, i5));
        } else if (i3 == 80 && r1 == 82 && i4 == 73 && i5 == 86) {
            frostHunterFirebasePrimeTitanium8884 = FrostHunterMotionSceneAuroraMega2271(i10, frostHunterLicensingSpectraPulse8868);
        } else {
            if (i3 != 71 || r1 != 69 || i4 != 79 || (i5 != 66 && i9 != 2)) {
                th = null;
                try {
                } catch (Exception e3) {
                    e = e3;
                    i6 = r1;
                    i7 = i4;
                    frostHunterLicensingSpectraPulse88682 = frostHunterLicensingSpectraPulse8868;
                    i4 = i10;
                    i8 = i5;
                    frostHunterLicensingSpectraPulse88684 = frostHunterLicensingSpectraPulse88682;
                    frostHunterLicensingSpectraPulse88684.FrostHunterR8MasterNebulaSpark7247(i11);
                    r12 = th;
                    if (r12 == 0) {
                    }
                    return r12;
                } catch (OutOfMemoryError e4) {
                    e = e4;
                    i6 = r1;
                    i7 = i4;
                    frostHunterLicensingSpectraPulse88682 = frostHunterLicensingSpectraPulse8868;
                    i4 = i10;
                    i8 = i5;
                    frostHunterLicensingSpectraPulse88684 = frostHunterLicensingSpectraPulse88682;
                    frostHunterLicensingSpectraPulse88684.FrostHunterR8MasterNebulaSpark7247(i11);
                    r12 = th;
                    if (r12 == 0) {
                    }
                    return r12;
                }
                if (i9 != 2 ? i3 == 65 && r1 == 80 && i4 == 73 && i5 == 67 : i3 == 80 && r1 == 73 && i4 == 67) {
                    frostHunterFirebasePrimeTitanium8884 = FrostHunterScaleAnimationStrikeSpark5059(frostHunterLicensingSpectraPulse8868, i10, i9);
                } else {
                    if (i3 != 67 || r1 != 79 || i4 != 77 || (i5 != 77 && i9 != 2)) {
                        if (i3 == 67 && r1 == 72 && i4 == 65 && i5 == 80) {
                            i6 = r1;
                            i7 = i4;
                            i4 = i10;
                            i8 = i5;
                            try {
                                frostHunterFirebasePrimeTitanium8884 = FrostHunterFirebaseModelDownloadConditionsSolarBlaze2223(frostHunterLicensingSpectraPulse8868, i4, i9, z, i2, frostHunterMLKitPixelSpark4804);
                                i9 = i;
                                r1 = frostHunterLicensingSpectraPulse8868;
                            } catch (Exception e5) {
                                e = e5;
                                i9 = i;
                                frostHunterLicensingSpectraPulse88684 = frostHunterLicensingSpectraPulse8868;
                                frostHunterLicensingSpectraPulse88684.FrostHunterR8MasterNebulaSpark7247(i11);
                                r12 = th;
                                if (r12 == 0) {
                                }
                                return r12;
                            } catch (OutOfMemoryError e6) {
                                e = e6;
                                i9 = i;
                                frostHunterLicensingSpectraPulse88684 = frostHunterLicensingSpectraPulse8868;
                                frostHunterLicensingSpectraPulse88684.FrostHunterR8MasterNebulaSpark7247(i11);
                                r12 = th;
                                if (r12 == 0) {
                                }
                                return r12;
                            } catch (Throwable th3) {
                                th = th3;
                                frostHunterLicensingSpectraPulse88683 = frostHunterLicensingSpectraPulse8868;
                                frostHunterLicensingSpectraPulse88683.FrostHunterR8MasterNebulaSpark7247(i11);
                                throw th;
                            }
                        } else {
                            i6 = r1;
                            i7 = i4;
                            i4 = i10;
                            i8 = i5;
                            try {
                                if (i3 == 67 && i6 == 84 && i7 == 79 && i8 == 67) {
                                    i9 = i;
                                    FrostHunterLicensingSpectraPulse8868 frostHunterLicensingSpectraPulse88685 = frostHunterLicensingSpectraPulse8868;
                                    frostHunterFirebasePrimeTitanium8884 = FrostHunterLintTitanVortexQuantum9911(frostHunterLicensingSpectraPulse88685, i4, i9, z, i2, frostHunterMLKitPixelSpark4804);
                                    r1 = frostHunterLicensingSpectraPulse88685;
                                } else {
                                    i9 = i;
                                    FrostHunterLicensingSpectraPulse8868 frostHunterLicensingSpectraPulse88686 = frostHunterLicensingSpectraPulse8868;
                                    if (i3 == 77 && i6 == 76 && i7 == 76 && i8 == 84) {
                                        frostHunterFirebasePrimeTitanium8884 = FrostHunterLooperThreadBetaHyperionMax1000(i4, frostHunterLicensingSpectraPulse88686);
                                        r1 = frostHunterLicensingSpectraPulse88686;
                                    } else {
                                        String FrostHunterViewPhantomNeo1634 = FrostHunterViewPhantomNeo1634(i9, i3, i6, i7, i8);
                                        byte[] bArr = new byte[i4];
                                        frostHunterLicensingSpectraPulse88686.FrostHunterKeyframeGammaGamma1197(bArr, 0, i4);
                                        frostHunterFirebasePrimeTitanium8884 = new FrostHunterFirebasePrimeTitanium8884(FrostHunterViewPhantomNeo1634, bArr);
                                        r1 = frostHunterLicensingSpectraPulse88686;
                                    }
                                }
                            } catch (Exception e7) {
                                e = e7;
                                frostHunterLicensingSpectraPulse88684 = r1;
                                frostHunterLicensingSpectraPulse88684.FrostHunterR8MasterNebulaSpark7247(i11);
                                r12 = th;
                                if (r12 == 0) {
                                }
                                return r12;
                            } catch (OutOfMemoryError e8) {
                                e = e8;
                                frostHunterLicensingSpectraPulse88684 = r1;
                                frostHunterLicensingSpectraPulse88684.FrostHunterR8MasterNebulaSpark7247(i11);
                                r12 = th;
                                if (r12 == 0) {
                                }
                                return r12;
                            } catch (Throwable th4) {
                                th = th4;
                                frostHunterLicensingSpectraPulse88683 = r1;
                                frostHunterLicensingSpectraPulse88683.FrostHunterR8MasterNebulaSpark7247(i11);
                                throw th;
                            }
                        }
                        r1.FrostHunterR8MasterNebulaSpark7247(i11);
                        r12 = frostHunterFirebasePrimeTitanium8884;
                        e = th;
                        if (r12 == 0) {
                            FrostHunterDrawerLayoutUltraStrike3303.FrostHunterColorDrawableLegendPhoenixVision7927("Failed to decode frame: id=" + FrostHunterViewPhantomNeo1634(i9, i3, i6, i7, i8) + ", frameSize=" + i4, e);
                        }
                        return r12;
                    }
                    frostHunterFirebasePrimeTitanium8884 = FrostHunterCameraXTurboCelestialHero5430(i10, frostHunterLicensingSpectraPulse8868);
                }
                i6 = r1;
                i7 = i4;
                r1 = frostHunterLicensingSpectraPulse8868;
                i4 = i10;
                r1 = r1;
                i8 = i5;
                r1.FrostHunterR8MasterNebulaSpark7247(i11);
                r12 = frostHunterFirebasePrimeTitanium8884;
                e = th;
                if (r12 == 0) {
                }
                return r12;
            }
            frostHunterFirebasePrimeTitanium8884 = FrostHunterTextViewDragonStormMega4297(i10, frostHunterLicensingSpectraPulse8868);
        }
        i6 = r1;
        i7 = i4;
        r1 = frostHunterLicensingSpectraPulse8868;
        i4 = i10;
        th = null;
        r1 = r1;
        i8 = i5;
        r1.FrostHunterR8MasterNebulaSpark7247(i11);
        r12 = frostHunterFirebasePrimeTitanium8884;
        e = th;
        if (r12 == 0) {
        }
        return r12;
    }

    public static FrostHunterFirebasePixelQuantumNovaX5662 FrostHunterScaleAnimationStrikeSpark5059(FrostHunterLicensingSpectraPulse8868 frostHunterLicensingSpectraPulse8868, int i, int i2) {
        int FrostHunterBillingClientFusionVortex9008;
        String concat;
        int FrostHunterMeteringPointBetaCyber9571 = frostHunterLicensingSpectraPulse8868.FrostHunterMeteringPointBetaCyber9571();
        Charset FrostHunterCardViewSpectraCyber7714 = FrostHunterCardViewSpectraCyber7714(FrostHunterMeteringPointBetaCyber9571);
        int i3 = i - 1;
        byte[] bArr = new byte[i3];
        frostHunterLicensingSpectraPulse8868.FrostHunterKeyframeGammaGamma1197(bArr, 0, i3);
        if (i2 == 2) {
            concat = "image/" + FrostHunterCoroutineNovaXMasterMaster7803.FrostHunterConstraintSetCloneOmegaHyperion9304(new String(bArr, 0, 3, StandardCharsets.ISO_8859_1));
            if ("image/jpg".equals(concat)) {
                concat = "image/jpeg";
            }
            FrostHunterBillingClientFusionVortex9008 = 2;
        } else {
            FrostHunterBillingClientFusionVortex9008 = FrostHunterBillingClientFusionVortex9008(bArr, 0);
            String FrostHunterConstraintSetCloneOmegaHyperion9304 = FrostHunterCoroutineNovaXMasterMaster7803.FrostHunterConstraintSetCloneOmegaHyperion9304(new String(bArr, 0, FrostHunterBillingClientFusionVortex9008, StandardCharsets.ISO_8859_1));
            concat = FrostHunterConstraintSetCloneOmegaHyperion9304.indexOf(47) == -1 ? "image/".concat(FrostHunterConstraintSetCloneOmegaHyperion9304) : FrostHunterConstraintSetCloneOmegaHyperion9304;
        }
        int i4 = bArr[FrostHunterBillingClientFusionVortex9008 + 1] & 255;
        int i5 = FrostHunterBillingClientFusionVortex9008 + 2;
        int FrostHunterMeteringPointMegaCyber7955 = FrostHunterMeteringPointMegaCyber7955(bArr, i5, FrostHunterMeteringPointBetaCyber9571);
        String str = new String(bArr, i5, FrostHunterMeteringPointMegaCyber7955 - i5, FrostHunterCardViewSpectraCyber7714);
        int FrostHunterDatabaseEliteShadowUltra2452 = FrostHunterDatabaseEliteShadowUltra2452(FrostHunterMeteringPointBetaCyber9571) + FrostHunterMeteringPointMegaCyber7955;
        return new FrostHunterFirebasePixelQuantumNovaX5662(concat, str, i4, i3 <= FrostHunterDatabaseEliteShadowUltra2452 ? FrostHunterGyroscopeHeroAlpha1995.FrostHunterConstraintSetCloneMasterUltraRogue2633 : Arrays.copyOfRange(bArr, FrostHunterDatabaseEliteShadowUltra2452, i3));
    }

    public static FrostHunterPaintMasterMaxRogue5470 FrostHunterServiceInfoHyperionSparkMax9966(int i, FrostHunterLicensingSpectraPulse8868 frostHunterLicensingSpectraPulse8868, String str) {
        byte[] bArr = new byte[i];
        frostHunterLicensingSpectraPulse8868.FrostHunterKeyframeGammaGamma1197(bArr, 0, i);
        return new FrostHunterPaintMasterMaxRogue5470(str, null, new String(bArr, 0, FrostHunterBillingClientFusionVortex9008(bArr, 0), StandardCharsets.ISO_8859_1));
    }

    public static FrostHunterBitmapVisionSolarPhantom7310 FrostHunterTextViewDragonStormMega4297(int i, FrostHunterLicensingSpectraPulse8868 frostHunterLicensingSpectraPulse8868) {
        int FrostHunterMeteringPointBetaCyber9571 = frostHunterLicensingSpectraPulse8868.FrostHunterMeteringPointBetaCyber9571();
        Charset FrostHunterCardViewSpectraCyber7714 = FrostHunterCardViewSpectraCyber7714(FrostHunterMeteringPointBetaCyber9571);
        int i2 = i - 1;
        byte[] bArr = new byte[i2];
        frostHunterLicensingSpectraPulse8868.FrostHunterKeyframeGammaGamma1197(bArr, 0, i2);
        int FrostHunterBillingClientFusionVortex9008 = FrostHunterBillingClientFusionVortex9008(bArr, 0);
        String FrostHunterKeyframeGammaGamma1197 = FrostHunterOrientationSensorDeltaSolarMaster8286.FrostHunterKeyframeGammaGamma1197(new String(bArr, 0, FrostHunterBillingClientFusionVortex9008, StandardCharsets.ISO_8859_1));
        int i3 = FrostHunterBillingClientFusionVortex9008 + 1;
        int FrostHunterMeteringPointMegaCyber7955 = FrostHunterMeteringPointMegaCyber7955(bArr, i3, FrostHunterMeteringPointBetaCyber9571);
        String FrostHunterBitmapTurboDeltaNebula8743 = FrostHunterBitmapTurboDeltaNebula8743(bArr, i3, FrostHunterMeteringPointMegaCyber7955, FrostHunterCardViewSpectraCyber7714);
        int FrostHunterDatabaseEliteShadowUltra2452 = FrostHunterDatabaseEliteShadowUltra2452(FrostHunterMeteringPointBetaCyber9571) + FrostHunterMeteringPointMegaCyber7955;
        int FrostHunterMeteringPointMegaCyber79552 = FrostHunterMeteringPointMegaCyber7955(bArr, FrostHunterDatabaseEliteShadowUltra2452, FrostHunterMeteringPointBetaCyber9571);
        String FrostHunterBitmapTurboDeltaNebula87432 = FrostHunterBitmapTurboDeltaNebula8743(bArr, FrostHunterDatabaseEliteShadowUltra2452, FrostHunterMeteringPointMegaCyber79552, FrostHunterCardViewSpectraCyber7714);
        int FrostHunterDatabaseEliteShadowUltra24522 = FrostHunterDatabaseEliteShadowUltra2452(FrostHunterMeteringPointBetaCyber9571) + FrostHunterMeteringPointMegaCyber79552;
        return new FrostHunterBitmapVisionSolarPhantom7310(FrostHunterKeyframeGammaGamma1197, FrostHunterBitmapTurboDeltaNebula8743, FrostHunterBitmapTurboDeltaNebula87432, i2 <= FrostHunterDatabaseEliteShadowUltra24522 ? FrostHunterGyroscopeHeroAlpha1995.FrostHunterConstraintSetCloneMasterUltraRogue2633 : Arrays.copyOfRange(bArr, FrostHunterDatabaseEliteShadowUltra24522, i2));
    }

    /* JADX WARN: Code restructure failed: missing block: B:31:0x0077, code lost:
    
        if ((r10 & 1) != 0) goto L45;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x007a, code lost:
    
        r4 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:54:0x0087, code lost:
    
        if ((r10 & 128) != 0) goto L45;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static boolean FrostHunterTranslateAnimationCyberSolarUltra7101(FrostHunterLicensingSpectraPulse8868 frostHunterLicensingSpectraPulse8868, int i, int i2, boolean z) {
        int FrostHunterDatabaseEliteShadowUltra2452;
        long FrostHunterDatabaseEliteShadowUltra24522;
        int i3;
        int i4;
        int i5 = frostHunterLicensingSpectraPulse8868.FrostHunterConstraintSetCloneMasterUltraRogue2633;
        while (true) {
            try {
                boolean z2 = true;
                if (frostHunterLicensingSpectraPulse8868.FrostHunterAlphaAnimationNeoCosmos5761() < i2) {
                    frostHunterLicensingSpectraPulse8868.FrostHunterR8MasterNebulaSpark7247(i5);
                    return true;
                }
                if (i >= 3) {
                    FrostHunterDatabaseEliteShadowUltra2452 = frostHunterLicensingSpectraPulse8868.FrostHunterServiceConnectionTurboPhoenixOmega6719();
                    FrostHunterDatabaseEliteShadowUltra24522 = frostHunterLicensingSpectraPulse8868.FrostHunterEditTextPulseHyperion1262();
                    i3 = frostHunterLicensingSpectraPulse8868.FrostHunterBillingClientFusionVortex9008();
                } else {
                    FrostHunterDatabaseEliteShadowUltra2452 = frostHunterLicensingSpectraPulse8868.FrostHunterDatabaseEliteShadowUltra2452();
                    FrostHunterDatabaseEliteShadowUltra24522 = frostHunterLicensingSpectraPulse8868.FrostHunterDatabaseEliteShadowUltra2452();
                    i3 = 0;
                }
                if (FrostHunterDatabaseEliteShadowUltra2452 == 0 && FrostHunterDatabaseEliteShadowUltra24522 == 0 && i3 == 0) {
                    frostHunterLicensingSpectraPulse8868.FrostHunterR8MasterNebulaSpark7247(i5);
                    return true;
                }
                if (i == 4 && !z) {
                    if ((8421504 & FrostHunterDatabaseEliteShadowUltra24522) != 0) {
                        frostHunterLicensingSpectraPulse8868.FrostHunterR8MasterNebulaSpark7247(i5);
                        return false;
                    }
                    FrostHunterDatabaseEliteShadowUltra24522 = (((FrostHunterDatabaseEliteShadowUltra24522 >> 24) & 255) << 21) | (FrostHunterDatabaseEliteShadowUltra24522 & 255) | (((FrostHunterDatabaseEliteShadowUltra24522 >> 8) & 255) << 7) | (((FrostHunterDatabaseEliteShadowUltra24522 >> 16) & 255) << 14);
                }
                if (i == 4) {
                    i4 = (i3 & 64) != 0 ? 1 : 0;
                } else {
                    if (i == 3) {
                        i4 = (i3 & 32) != 0 ? 1 : 0;
                    } else {
                        i4 = 0;
                        z2 = false;
                    }
                    if (z2) {
                        i4 += 4;
                    }
                    if (FrostHunterDatabaseEliteShadowUltra24522 < i4) {
                        frostHunterLicensingSpectraPulse8868.FrostHunterR8MasterNebulaSpark7247(i5);
                        return false;
                    }
                    if (frostHunterLicensingSpectraPulse8868.FrostHunterAlphaAnimationNeoCosmos5761() < FrostHunterDatabaseEliteShadowUltra24522) {
                        frostHunterLicensingSpectraPulse8868.FrostHunterR8MasterNebulaSpark7247(i5);
                        return false;
                    }
                    frostHunterLicensingSpectraPulse8868.FrostHunterFCMDeltaQuantumHero8364((int) FrostHunterDatabaseEliteShadowUltra24522);
                }
            } catch (Throwable th) {
                frostHunterLicensingSpectraPulse8868.FrostHunterR8MasterNebulaSpark7247(i5);
                throw th;
            }
        }
    }

    public static String FrostHunterViewPhantomNeo1634(int i, int i2, int i3, int i4, int i5) {
        return i == 2 ? String.format(Locale.US, "%c%c%c", Integer.valueOf(i2), Integer.valueOf(i3), Integer.valueOf(i4)) : String.format(Locale.US, "%c%c%c%c", Integer.valueOf(i2), Integer.valueOf(i3), Integer.valueOf(i4), Integer.valueOf(i5));
    }

    @Override // android.content.Context.FrostHunterGraphQuantumSpeed6562
    public final FrostHunterDialogFragmentTitaniumEpicMega8033 FrostHunterBundlePulseFusionHero2475(FrostHunterSharedFlowUltraNeoDragon7502 frostHunterSharedFlowUltraNeoDragon7502, ByteBuffer byteBuffer) {
        return FrostHunterLightSensorForceFusion4241(byteBuffer.array(), byteBuffer.limit());
    }

    /* JADX WARN: Removed duplicated region for block: B:6:0x0099 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:8:0x009a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final FrostHunterDialogFragmentTitaniumEpicMega8033 FrostHunterLightSensorForceFusion4241(byte[] bArr, int i) {
        FrostHunterDragEventAuroraGamma1931 frostHunterDragEventAuroraGamma1931;
        ArrayList arrayList = new ArrayList();
        FrostHunterLicensingSpectraPulse8868 frostHunterLicensingSpectraPulse8868 = new FrostHunterLicensingSpectraPulse8868(bArr, i);
        boolean z = false;
        if (frostHunterLicensingSpectraPulse8868.FrostHunterAlphaAnimationNeoCosmos5761() < 10) {
            FrostHunterDrawerLayoutUltraStrike3303.FrostHunterColorStateListInflaterNovaQuantum4229("Data too short to be an ID3 tag");
        } else {
            int FrostHunterDatabaseEliteShadowUltra2452 = frostHunterLicensingSpectraPulse8868.FrostHunterDatabaseEliteShadowUltra2452();
            if (FrostHunterDatabaseEliteShadowUltra2452 == 4801587) {
                int FrostHunterMeteringPointBetaCyber9571 = frostHunterLicensingSpectraPulse8868.FrostHunterMeteringPointBetaCyber9571();
                frostHunterLicensingSpectraPulse8868.FrostHunterFCMDeltaQuantumHero8364(1);
                int FrostHunterMeteringPointBetaCyber95712 = frostHunterLicensingSpectraPulse8868.FrostHunterMeteringPointBetaCyber9571();
                int FrostHunterLooperHyperionForce4133 = frostHunterLicensingSpectraPulse8868.FrostHunterLooperHyperionForce4133();
                if (FrostHunterMeteringPointBetaCyber9571 == 2) {
                    if ((FrostHunterMeteringPointBetaCyber95712 & 64) != 0) {
                        FrostHunterDrawerLayoutUltraStrike3303.FrostHunterColorStateListInflaterNovaQuantum4229("Skipped ID3 tag with majorVersion=2 and undefined compression scheme");
                    }
                    frostHunterDragEventAuroraGamma1931 = new FrostHunterDragEventAuroraGamma1931(FrostHunterMeteringPointBetaCyber9571, FrostHunterLooperHyperionForce4133, FrostHunterMeteringPointBetaCyber9571 >= 4 && (FrostHunterMeteringPointBetaCyber95712 & 128) != 0);
                } else {
                    if (FrostHunterMeteringPointBetaCyber9571 == 3) {
                        if ((FrostHunterMeteringPointBetaCyber95712 & 64) != 0) {
                            int FrostHunterServiceConnectionTurboPhoenixOmega6719 = frostHunterLicensingSpectraPulse8868.FrostHunterServiceConnectionTurboPhoenixOmega6719();
                            frostHunterLicensingSpectraPulse8868.FrostHunterFCMDeltaQuantumHero8364(FrostHunterServiceConnectionTurboPhoenixOmega6719);
                            FrostHunterLooperHyperionForce4133 -= FrostHunterServiceConnectionTurboPhoenixOmega6719 + 4;
                        }
                    } else if (FrostHunterMeteringPointBetaCyber9571 == 4) {
                        if ((FrostHunterMeteringPointBetaCyber95712 & 64) != 0) {
                            int FrostHunterLooperHyperionForce41332 = frostHunterLicensingSpectraPulse8868.FrostHunterLooperHyperionForce4133();
                            frostHunterLicensingSpectraPulse8868.FrostHunterFCMDeltaQuantumHero8364(FrostHunterLooperHyperionForce41332 - 4);
                            FrostHunterLooperHyperionForce4133 -= FrostHunterLooperHyperionForce41332;
                        }
                        if ((FrostHunterMeteringPointBetaCyber95712 & 16) != 0) {
                            FrostHunterLooperHyperionForce4133 -= 10;
                        }
                    } else {
                        FrostHunterKeyEventNovaXAlpha1220.FrostHunterMotionSceneAuroraMega2271("Skipped ID3 tag with unsupported majorVersion=", FrostHunterMeteringPointBetaCyber9571);
                    }
                    frostHunterDragEventAuroraGamma1931 = new FrostHunterDragEventAuroraGamma1931(FrostHunterMeteringPointBetaCyber9571, FrostHunterLooperHyperionForce4133, FrostHunterMeteringPointBetaCyber9571 >= 4 && (FrostHunterMeteringPointBetaCyber95712 & 128) != 0);
                }
                if (frostHunterDragEventAuroraGamma1931 != null) {
                    return null;
                }
                int i2 = frostHunterDragEventAuroraGamma1931.FrostHunterAlphaAnimationNeoCosmos5761;
                int i3 = frostHunterLicensingSpectraPulse8868.FrostHunterConstraintSetCloneMasterUltraRogue2633;
                int i4 = i2 == 2 ? 6 : 10;
                int i5 = frostHunterDragEventAuroraGamma1931.FrostHunterBundlePulseFusionHero2475;
                if (frostHunterDragEventAuroraGamma1931.FrostHunterConstraintSetCloneMasterUltraRogue2633) {
                    i5 = FrostHunterMediaPlayerCelestialBetaTitan3868(i5, frostHunterLicensingSpectraPulse8868);
                }
                frostHunterLicensingSpectraPulse8868.FrostHunterPagingDataTurboTitanium7332(i3 + i5);
                if (!FrostHunterTranslateAnimationCyberSolarUltra7101(frostHunterLicensingSpectraPulse8868, i2, i4, false)) {
                    if (i2 != 4 || !FrostHunterTranslateAnimationCyberSolarUltra7101(frostHunterLicensingSpectraPulse8868, 4, i4, true)) {
                        FrostHunterKeyEventNovaXAlpha1220.FrostHunterMotionSceneAuroraMega2271("Failed to validate ID3 tag with majorVersion=", i2);
                        return null;
                    }
                    z = true;
                }
                while (frostHunterLicensingSpectraPulse8868.FrostHunterAlphaAnimationNeoCosmos5761() >= i4) {
                    FrostHunterExecutorBetaPhoenix5827 FrostHunterResourcesTitanHyperVision5823 = FrostHunterResourcesTitanHyperVision5823(i2, frostHunterLicensingSpectraPulse8868, z, i4, this.FrostHunterAlphaAnimationNeoCosmos5761);
                    if (FrostHunterResourcesTitanHyperVision5823 != null) {
                        arrayList.add(FrostHunterResourcesTitanHyperVision5823);
                    }
                }
                return new FrostHunterDialogFragmentTitaniumEpicMega8033(arrayList);
            }
            FrostHunterDrawerLayoutUltraStrike3303.FrostHunterColorStateListInflaterNovaQuantum4229("Unexpected first three bytes of ID3 tag header: 0x".concat(String.format("%06X", Integer.valueOf(FrostHunterDatabaseEliteShadowUltra2452))));
        }
        frostHunterDragEventAuroraGamma1931 = null;
        if (frostHunterDragEventAuroraGamma1931 != null) {
        }
    }
}
