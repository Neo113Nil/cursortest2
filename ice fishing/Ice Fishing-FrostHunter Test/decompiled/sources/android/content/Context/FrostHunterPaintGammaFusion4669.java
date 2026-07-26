package android.content.Context;

import android.text.SpannableStringBuilder;
import android.text.style.ForegroundColorSpan;
import android.text.style.StyleSpan;
import android.text.style.TypefaceSpan;
import android.text.style.UnderlineSpan;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.List;

/* compiled from: r8-map-id-ad53bc00775cc49f3760de3ef5ee15f0f7d4eb373264baa1785c3fa1a15d54ed */
/* loaded from: classes.dex */
public final class FrostHunterPaintGammaFusion4669 implements FrostHunterActionBarHyperMax6338 {
    public final int FrostHunterAlertDialogAuroraDelta3200;
    public final FrostHunterLicensingSpectraPulse8868 FrostHunterCameraXPixelTurboCosmos9814 = new FrostHunterLicensingSpectraPulse8868();
    public final boolean FrostHunterFlowMaxDragonHero5809;
    public final String FrostHunterFragmentBetaMegaVortex6025;
    public final int FrostHunterKeyframeGammaGamma1197;
    public final int FrostHunterLightSensorForceFusion4241;
    public final float FrostHunterServiceConnectionTurboPhoenixOmega6719;

    public FrostHunterPaintGammaFusion4669(List list) {
        if (list.size() != 1 || (((byte[]) list.get(0)).length != 48 && ((byte[]) list.get(0)).length != 53)) {
            this.FrostHunterAlertDialogAuroraDelta3200 = 0;
            this.FrostHunterKeyframeGammaGamma1197 = -1;
            this.FrostHunterFragmentBetaMegaVortex6025 = "sans-serif";
            this.FrostHunterFlowMaxDragonHero5809 = false;
            this.FrostHunterServiceConnectionTurboPhoenixOmega6719 = 0.85f;
            this.FrostHunterLightSensorForceFusion4241 = -1;
            return;
        }
        byte[] bArr = (byte[]) list.get(0);
        this.FrostHunterAlertDialogAuroraDelta3200 = bArr[24];
        this.FrostHunterKeyframeGammaGamma1197 = ((bArr[26] & 255) << 24) | ((bArr[27] & 255) << 16) | ((bArr[28] & 255) << 8) | (bArr[29] & 255);
        this.FrostHunterFragmentBetaMegaVortex6025 = "Serif".equals(new String(bArr, 43, bArr.length - 43, StandardCharsets.UTF_8)) ? "serif" : "sans-serif";
        int i = bArr[25] * 20;
        this.FrostHunterLightSensorForceFusion4241 = i;
        boolean z = (bArr[0] & 32) != 0;
        this.FrostHunterFlowMaxDragonHero5809 = z;
        if (z) {
            this.FrostHunterServiceConnectionTurboPhoenixOmega6719 = FrostHunterGyroscopeHeroAlpha1995.FrostHunterLevelListDrawableFusionDragonHero2232(((bArr[11] & 255) | ((bArr[10] & 255) << 8)) / i, 0.0f, 0.95f);
        } else {
            this.FrostHunterServiceConnectionTurboPhoenixOmega6719 = 0.85f;
        }
    }

    public static void FrostHunterAlphaAnimationNeoCosmos5761(SpannableStringBuilder spannableStringBuilder, int i, int i2, int i3, int i4, int i5) {
        if (i != i2) {
            spannableStringBuilder.setSpan(new ForegroundColorSpan((i >>> 8) | ((i & 255) << 24)), i3, i4, i5 | 33);
        }
    }

    public static void FrostHunterConstraintSetCloneMasterUltraRogue2633(SpannableStringBuilder spannableStringBuilder, int i, int i2, int i3, int i4, int i5) {
        if (i != i2) {
            int i6 = i5 | 33;
            boolean z = (i & 1) != 0;
            boolean z2 = (i & 2) != 0;
            if (z) {
                if (z2) {
                    spannableStringBuilder.setSpan(new StyleSpan(3), i3, i4, i6);
                } else {
                    spannableStringBuilder.setSpan(new StyleSpan(1), i3, i4, i6);
                }
            } else if (z2) {
                spannableStringBuilder.setSpan(new StyleSpan(2), i3, i4, i6);
            }
            boolean z3 = (i & 4) != 0;
            if (z3) {
                spannableStringBuilder.setSpan(new UnderlineSpan(), i3, i4, i6);
            }
            if (z3 || z || z2) {
                return;
            }
            spannableStringBuilder.setSpan(new StyleSpan(0), i3, i4, i6);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // android.content.Context.FrostHunterActionBarHyperMax6338
    public final void FrostHunterFirebaseModelDownloadConditionsSolarBlaze2223(byte[] bArr, int i, int i2, FrostHunterLaunchGammaTitanium8407 frostHunterLaunchGammaTitanium8407, FrostHunterLayoutInflaterNebulaVision6522 frostHunterLayoutInflaterNebulaVision6522) {
        String FrostHunterDialogFragmentTurboPhoenixDragon7627;
        int i3;
        FrostHunterLicensingSpectraPulse8868 frostHunterLicensingSpectraPulse8868 = this.FrostHunterCameraXPixelTurboCosmos9814;
        frostHunterLicensingSpectraPulse8868.FrostHunterMagnetometerFusionTitanium8202(bArr, i + i2);
        frostHunterLicensingSpectraPulse8868.FrostHunterR8MasterNebulaSpark7247(i);
        int i4 = 1;
        int i5 = 0;
        FrostHunterCanvasInfernoVortex4700.FrostHunterResourcesTitanHyperVision5823(frostHunterLicensingSpectraPulse8868.FrostHunterAlphaAnimationNeoCosmos5761() >= 2);
        int FrostHunterBillingClientFusionVortex9008 = frostHunterLicensingSpectraPulse8868.FrostHunterBillingClientFusionVortex9008();
        if (FrostHunterBillingClientFusionVortex9008 == 0) {
            FrostHunterDialogFragmentTurboPhoenixDragon7627 = "";
        } else {
            int i6 = frostHunterLicensingSpectraPulse8868.FrostHunterConstraintSetCloneMasterUltraRogue2633;
            Charset FrostHunterTranslateAnimationCyberSolarUltra7101 = frostHunterLicensingSpectraPulse8868.FrostHunterTranslateAnimationCyberSolarUltra7101();
            int i7 = FrostHunterBillingClientFusionVortex9008 - (frostHunterLicensingSpectraPulse8868.FrostHunterConstraintSetCloneMasterUltraRogue2633 - i6);
            if (FrostHunterTranslateAnimationCyberSolarUltra7101 == null) {
                FrostHunterTranslateAnimationCyberSolarUltra7101 = StandardCharsets.UTF_8;
            }
            FrostHunterDialogFragmentTurboPhoenixDragon7627 = frostHunterLicensingSpectraPulse8868.FrostHunterDialogFragmentTurboPhoenixDragon7627(i7, FrostHunterTranslateAnimationCyberSolarUltra7101);
        }
        if (FrostHunterDialogFragmentTurboPhoenixDragon7627.isEmpty()) {
            FrostHunterAnimatorOlympianPhantomElite2405 frostHunterAnimatorOlympianPhantomElite2405 = FrostHunterAlarmManagerHeroTitaniumFusion5758.FrostHunterFlowMaxDragonHero5809;
            frostHunterLayoutInflaterNebulaVision6522.accept(new FrostHunterWindowManagerInfernoOlympianVortex6395(-9223372036854775807L, -9223372036854775807L, FrostHunterBitmapNeoCosmos7205.FrostHunterFragmentBetaMegaVortex6025));
            return;
        }
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(FrostHunterDialogFragmentTurboPhoenixDragon7627);
        FrostHunterConstraintSetCloneMasterUltraRogue2633(spannableStringBuilder, this.FrostHunterAlertDialogAuroraDelta3200, 0, 0, spannableStringBuilder.length(), 16711680);
        FrostHunterAlphaAnimationNeoCosmos5761(spannableStringBuilder, this.FrostHunterKeyframeGammaGamma1197, -1, 0, spannableStringBuilder.length(), 16711680);
        int length = spannableStringBuilder.length();
        String str = this.FrostHunterFragmentBetaMegaVortex6025;
        if (str != "sans-serif") {
            spannableStringBuilder.setSpan(new TypefaceSpan(str), 0, length, 16711713);
        }
        float f = this.FrostHunterServiceConnectionTurboPhoenixOmega6719;
        while (frostHunterLicensingSpectraPulse8868.FrostHunterAlphaAnimationNeoCosmos5761() >= 8) {
            int i8 = frostHunterLicensingSpectraPulse8868.FrostHunterConstraintSetCloneMasterUltraRogue2633;
            int FrostHunterServiceConnectionTurboPhoenixOmega6719 = frostHunterLicensingSpectraPulse8868.FrostHunterServiceConnectionTurboPhoenixOmega6719();
            int FrostHunterServiceConnectionTurboPhoenixOmega67192 = frostHunterLicensingSpectraPulse8868.FrostHunterServiceConnectionTurboPhoenixOmega6719();
            if (FrostHunterServiceConnectionTurboPhoenixOmega67192 == 1937013100) {
                FrostHunterCanvasInfernoVortex4700.FrostHunterResourcesTitanHyperVision5823(frostHunterLicensingSpectraPulse8868.FrostHunterAlphaAnimationNeoCosmos5761() >= 2 ? i4 : i5);
                int FrostHunterBillingClientFusionVortex90082 = frostHunterLicensingSpectraPulse8868.FrostHunterBillingClientFusionVortex9008();
                int i9 = i5;
                while (i9 < FrostHunterBillingClientFusionVortex90082) {
                    FrostHunterCanvasInfernoVortex4700.FrostHunterResourcesTitanHyperVision5823(frostHunterLicensingSpectraPulse8868.FrostHunterAlphaAnimationNeoCosmos5761() >= 12 ? i4 : i5);
                    int FrostHunterBillingClientFusionVortex90083 = frostHunterLicensingSpectraPulse8868.FrostHunterBillingClientFusionVortex9008();
                    int FrostHunterBillingClientFusionVortex90084 = frostHunterLicensingSpectraPulse8868.FrostHunterBillingClientFusionVortex9008();
                    frostHunterLicensingSpectraPulse8868.FrostHunterFCMDeltaQuantumHero8364(2);
                    int i10 = i9;
                    int FrostHunterMeteringPointBetaCyber9571 = frostHunterLicensingSpectraPulse8868.FrostHunterMeteringPointBetaCyber9571();
                    frostHunterLicensingSpectraPulse8868.FrostHunterFCMDeltaQuantumHero8364(i4);
                    int FrostHunterServiceConnectionTurboPhoenixOmega67193 = frostHunterLicensingSpectraPulse8868.FrostHunterServiceConnectionTurboPhoenixOmega6719();
                    if (FrostHunterBillingClientFusionVortex90084 > spannableStringBuilder.length()) {
                        StringBuilder FrostHunterServiceConnectionTurboPhoenixOmega67194 = FrostHunterKeyEventNovaXAlpha1220.FrostHunterServiceConnectionTurboPhoenixOmega6719("Truncating styl end (", FrostHunterBillingClientFusionVortex90084, ") to cueText.length() (");
                        FrostHunterServiceConnectionTurboPhoenixOmega67194.append(spannableStringBuilder.length());
                        FrostHunterServiceConnectionTurboPhoenixOmega67194.append(").");
                        FrostHunterDrawerLayoutUltraStrike3303.FrostHunterColorStateListInflaterNovaQuantum4229(FrostHunterServiceConnectionTurboPhoenixOmega67194.toString());
                        FrostHunterBillingClientFusionVortex90084 = spannableStringBuilder.length();
                    }
                    if (FrostHunterBillingClientFusionVortex90083 >= FrostHunterBillingClientFusionVortex90084) {
                        FrostHunterDrawerLayoutUltraStrike3303.FrostHunterColorStateListInflaterNovaQuantum4229("Ignoring styl with start (" + FrostHunterBillingClientFusionVortex90083 + ") >= end (" + FrostHunterBillingClientFusionVortex90084 + ").");
                        i3 = i10;
                    } else {
                        i3 = i10;
                        int i11 = FrostHunterBillingClientFusionVortex90084;
                        FrostHunterConstraintSetCloneMasterUltraRogue2633(spannableStringBuilder, FrostHunterMeteringPointBetaCyber9571, this.FrostHunterAlertDialogAuroraDelta3200, FrostHunterBillingClientFusionVortex90083, i11, 0);
                        FrostHunterAlphaAnimationNeoCosmos5761(spannableStringBuilder, FrostHunterServiceConnectionTurboPhoenixOmega67193, this.FrostHunterKeyframeGammaGamma1197, FrostHunterBillingClientFusionVortex90083, i11, 0);
                    }
                    i9 = i3 + 1;
                    i4 = 1;
                    i5 = 0;
                }
            } else if (FrostHunterServiceConnectionTurboPhoenixOmega67192 == 1952608120 && this.FrostHunterFlowMaxDragonHero5809) {
                FrostHunterCanvasInfernoVortex4700.FrostHunterResourcesTitanHyperVision5823(frostHunterLicensingSpectraPulse8868.FrostHunterAlphaAnimationNeoCosmos5761() >= 2);
                f = FrostHunterGyroscopeHeroAlpha1995.FrostHunterLevelListDrawableFusionDragonHero2232(frostHunterLicensingSpectraPulse8868.FrostHunterBillingClientFusionVortex9008() / this.FrostHunterLightSensorForceFusion4241, 0.0f, 0.95f);
            }
            frostHunterLicensingSpectraPulse8868.FrostHunterR8MasterNebulaSpark7247(i8 + FrostHunterServiceConnectionTurboPhoenixOmega6719);
            i4 = 1;
            i5 = 0;
        }
        frostHunterLayoutInflaterNebulaVision6522.accept(new FrostHunterWindowManagerInfernoOlympianVortex6395(-9223372036854775807L, -9223372036854775807L, FrostHunterAlarmManagerHeroTitaniumFusion5758.FrostHunterScaleAnimationStrikeSpark5059(new FrostHunterConstraintSetPhoenixVision2576(spannableStringBuilder, null, null, null, f, 0, 0, -3.4028235E38f, Integer.MIN_VALUE, Integer.MIN_VALUE, -3.4028235E38f, -3.4028235E38f, -3.4028235E38f, false, -16777216, Integer.MIN_VALUE, 0.0f, 0))));
    }
}
