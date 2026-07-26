package android.content.Context;

import android.graphics.PointF;
import android.text.Layout;
import android.text.SpannableString;
import android.text.TextUtils;
import android.text.style.BackgroundColorSpan;
import android.text.style.ForegroundColorSpan;
import android.text.style.StrikethroughSpan;
import android.text.style.StyleSpan;
import android.text.style.UnderlineSpan;
import com.android.installreferrer.api.InstallReferrerClient;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Collection;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* compiled from: r8-map-id-ad53bc00775cc49f3760de3ef5ee15f0f7d4eb373264baa1785c3fa1a15d54ed */
/* loaded from: classes.dex */
public final class FrostHunterRoomEntityRogueLegendElite4551 implements FrostHunterActionBarHyperMax6338 {
    public static final Pattern FrostHunterLightSensorForceFusion4241 = Pattern.compile("(?:(\\d+):)?(\\d+):(\\d+)[:.](\\d+)");
    public final boolean FrostHunterCameraXPixelTurboCosmos9814;
    public final FrostHunterMotionSceneTitaniumNovaX1599 FrostHunterFlowMaxDragonHero5809;
    public LinkedHashMap FrostHunterKeyframeGammaGamma1197;
    public float FrostHunterFragmentBetaMegaVortex6025 = -3.4028235E38f;
    public float FrostHunterServiceConnectionTurboPhoenixOmega6719 = -3.4028235E38f;
    public final FrostHunterLicensingSpectraPulse8868 FrostHunterAlertDialogAuroraDelta3200 = new FrostHunterLicensingSpectraPulse8868();

    public FrostHunterRoomEntityRogueLegendElite4551(List list) {
        if (list == null || list.isEmpty()) {
            this.FrostHunterCameraXPixelTurboCosmos9814 = false;
            this.FrostHunterFlowMaxDragonHero5809 = null;
            return;
        }
        this.FrostHunterCameraXPixelTurboCosmos9814 = true;
        byte[] bArr = (byte[]) list.get(0);
        Charset charset = StandardCharsets.UTF_8;
        String str = new String(bArr, charset);
        FrostHunterCanvasInfernoVortex4700.FrostHunterResourcesTitanHyperVision5823(str.startsWith("Format:"));
        FrostHunterMotionSceneTitaniumNovaX1599 FrostHunterAlphaAnimationNeoCosmos5761 = FrostHunterMotionSceneTitaniumNovaX1599.FrostHunterAlphaAnimationNeoCosmos5761(str);
        FrostHunterAlphaAnimationNeoCosmos5761.getClass();
        this.FrostHunterFlowMaxDragonHero5809 = FrostHunterAlphaAnimationNeoCosmos5761;
        FrostHunterConstraintSetCloneMasterUltraRogue2633(new FrostHunterLicensingSpectraPulse8868((byte[]) list.get(1)), charset);
    }

    public static int FrostHunterAlphaAnimationNeoCosmos5761(long j, ArrayList arrayList, ArrayList arrayList2) {
        int i;
        int size = arrayList.size() - 1;
        while (true) {
            if (size < 0) {
                i = 0;
                break;
            }
            if (((Long) arrayList.get(size)).longValue() == j) {
                return size;
            }
            if (((Long) arrayList.get(size)).longValue() < j) {
                i = size + 1;
                break;
            }
            size--;
        }
        arrayList.add(i, Long.valueOf(j));
        arrayList2.add(i, i == 0 ? new ArrayList() : new ArrayList((Collection) arrayList2.get(i - 1)));
        return i;
    }

    public static long FrostHunterBundlePulseFusionHero2475(String str) {
        Matcher matcher = FrostHunterLightSensorForceFusion4241.matcher(str.trim());
        if (!matcher.matches()) {
            return -9223372036854775807L;
        }
        String group = matcher.group(1);
        String str2 = FrostHunterGyroscopeHeroAlpha1995.FrostHunterAlphaAnimationNeoCosmos5761;
        return (Long.parseLong(matcher.group(4)) * 10000) + (Long.parseLong(matcher.group(3)) * 1000000) + (Long.parseLong(matcher.group(2)) * 60000000) + (Long.parseLong(group) * 3600000000L);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Removed duplicated region for block: B:50:0x02ed  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void FrostHunterConstraintSetCloneMasterUltraRogue2633(FrostHunterLicensingSpectraPulse8868 frostHunterLicensingSpectraPulse8868, Charset charset) {
        int i;
        FrostHunterFirebaseModelInterpreterHyperionHyperionPixel2204 frostHunterFirebaseModelInterpreterHyperionHyperionPixel2204;
        while (true) {
            String FrostHunterLightSensorForceFusion42412 = frostHunterLicensingSpectraPulse8868.FrostHunterLightSensorForceFusion4241(charset);
            if (FrostHunterLightSensorForceFusion42412 == null) {
                return;
            }
            int i2 = 2;
            int i3 = 0;
            if ("[Script Info]".equalsIgnoreCase(FrostHunterLightSensorForceFusion42412)) {
                while (true) {
                    String FrostHunterLightSensorForceFusion42413 = frostHunterLicensingSpectraPulse8868.FrostHunterLightSensorForceFusion4241(charset);
                    if (FrostHunterLightSensorForceFusion42413 == null) {
                        break;
                    }
                    if (frostHunterLicensingSpectraPulse8868.FrostHunterAlphaAnimationNeoCosmos5761() != 0) {
                        if ((frostHunterLicensingSpectraPulse8868.FrostHunterCameraXPixelTurboCosmos9814(charset) != 0 ? FrostHunterRemoteConfigPhantomDelta1739.FrostHunterResourcesTitanHyperVision5823(r2 >>> 8) : 1114112) == 91) {
                            break;
                        }
                    }
                    String[] split = FrostHunterLightSensorForceFusion42413.split(":");
                    if (split.length == 2) {
                        String FrostHunterConstraintSetCloneOmegaHyperion9304 = FrostHunterCoroutineNovaXMasterMaster7803.FrostHunterConstraintSetCloneOmegaHyperion9304(split[0].trim());
                        FrostHunterConstraintSetCloneOmegaHyperion9304.getClass();
                        if (FrostHunterConstraintSetCloneOmegaHyperion9304.equals("playresx")) {
                            this.FrostHunterFragmentBetaMegaVortex6025 = Float.parseFloat(split[1].trim());
                        } else if (FrostHunterConstraintSetCloneOmegaHyperion9304.equals("playresy")) {
                            try {
                                this.FrostHunterServiceConnectionTurboPhoenixOmega6719 = Float.parseFloat(split[1].trim());
                            } catch (NumberFormatException unused) {
                            }
                        }
                    }
                }
            } else if ("[V4+ Styles]".equalsIgnoreCase(FrostHunterLightSensorForceFusion42412)) {
                LinkedHashMap linkedHashMap = new LinkedHashMap();
                while (true) {
                    FrostHunterConstraintSetClonePulseAuroraVision2622 frostHunterConstraintSetClonePulseAuroraVision2622 = null;
                    while (true) {
                        String FrostHunterLightSensorForceFusion42414 = frostHunterLicensingSpectraPulse8868.FrostHunterLightSensorForceFusion4241(charset);
                        if (FrostHunterLightSensorForceFusion42414 != null) {
                            if (frostHunterLicensingSpectraPulse8868.FrostHunterAlphaAnimationNeoCosmos5761() != 0) {
                                if ((frostHunterLicensingSpectraPulse8868.FrostHunterCameraXPixelTurboCosmos9814(charset) != 0 ? FrostHunterRemoteConfigPhantomDelta1739.FrostHunterResourcesTitanHyperVision5823(r0 >>> 8) : 1114112) == 91) {
                                }
                            }
                            int i4 = -1;
                            if (FrostHunterLightSensorForceFusion42414.startsWith("Format:")) {
                                String[] split2 = TextUtils.split(FrostHunterLightSensorForceFusion42414.substring(7), ",");
                                int i5 = -1;
                                int i6 = -1;
                                int i7 = -1;
                                int i8 = -1;
                                int i9 = -1;
                                int i10 = -1;
                                int i11 = -1;
                                int i12 = -1;
                                int i13 = -1;
                                int i14 = -1;
                                for (int i15 = i3; i15 < split2.length; i15++) {
                                    String FrostHunterConstraintSetCloneOmegaHyperion93042 = FrostHunterCoroutineNovaXMasterMaster7803.FrostHunterConstraintSetCloneOmegaHyperion9304(split2[i15].trim());
                                    FrostHunterConstraintSetCloneOmegaHyperion93042.getClass();
                                    switch (FrostHunterConstraintSetCloneOmegaHyperion93042.hashCode()) {
                                        case -1178781136:
                                            if (FrostHunterConstraintSetCloneOmegaHyperion93042.equals("italic")) {
                                                i = i3;
                                                break;
                                            }
                                            i = -1;
                                            break;
                                        case -1026963764:
                                            if (FrostHunterConstraintSetCloneOmegaHyperion93042.equals("underline")) {
                                                i = 1;
                                                break;
                                            }
                                            i = -1;
                                            break;
                                        case -192095652:
                                            if (FrostHunterConstraintSetCloneOmegaHyperion93042.equals("strikeout")) {
                                                i = i2;
                                                break;
                                            }
                                            i = -1;
                                            break;
                                        case -70925746:
                                            if (FrostHunterConstraintSetCloneOmegaHyperion93042.equals("primarycolour")) {
                                                i = 3;
                                                break;
                                            }
                                            i = -1;
                                            break;
                                        case 3029637:
                                            if (FrostHunterConstraintSetCloneOmegaHyperion93042.equals("bold")) {
                                                i = 4;
                                                break;
                                            }
                                            i = -1;
                                            break;
                                        case 3373707:
                                            if (FrostHunterConstraintSetCloneOmegaHyperion93042.equals("name")) {
                                                i = 5;
                                                break;
                                            }
                                            i = -1;
                                            break;
                                        case 366554320:
                                            if (FrostHunterConstraintSetCloneOmegaHyperion93042.equals("fontsize")) {
                                                i = 6;
                                                break;
                                            }
                                            i = -1;
                                            break;
                                        case 767321349:
                                            if (FrostHunterConstraintSetCloneOmegaHyperion93042.equals("borderstyle")) {
                                                i = 7;
                                                break;
                                            }
                                            i = -1;
                                            break;
                                        case 1767875043:
                                            if (FrostHunterConstraintSetCloneOmegaHyperion93042.equals("alignment")) {
                                                i = 8;
                                                break;
                                            }
                                            i = -1;
                                            break;
                                        case 1988365454:
                                            if (FrostHunterConstraintSetCloneOmegaHyperion93042.equals("outlinecolour")) {
                                                i = 9;
                                                break;
                                            }
                                            i = -1;
                                            break;
                                        default:
                                            i = -1;
                                            break;
                                    }
                                    switch (i) {
                                        case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                                            i11 = i15;
                                            break;
                                        case 1:
                                            i12 = i15;
                                            break;
                                        case 2:
                                            i13 = i15;
                                            break;
                                        case 3:
                                            i7 = i15;
                                            break;
                                        case 4:
                                            i10 = i15;
                                            break;
                                        case FrostHunterRemoteModelManagerCyberLegend2797.STRING_FIELD_NUMBER /* 5 */:
                                            i5 = i15;
                                            break;
                                        case FrostHunterRemoteModelManagerCyberLegend2797.STRING_SET_FIELD_NUMBER /* 6 */:
                                            i9 = i15;
                                            break;
                                        case FrostHunterRemoteModelManagerCyberLegend2797.DOUBLE_FIELD_NUMBER /* 7 */:
                                            i14 = i15;
                                            break;
                                        case FrostHunterRemoteModelManagerCyberLegend2797.BYTES_FIELD_NUMBER /* 8 */:
                                            i6 = i15;
                                            break;
                                        case 9:
                                            i8 = i15;
                                            break;
                                    }
                                }
                                if (i5 != -1) {
                                    frostHunterConstraintSetClonePulseAuroraVision2622 = new FrostHunterConstraintSetClonePulseAuroraVision2622(i5, i6, i7, i8, i9, i10, i11, i12, i13, i14, split2.length);
                                }
                            } else {
                                if (FrostHunterLightSensorForceFusion42414.startsWith("Style:")) {
                                    if (frostHunterConstraintSetClonePulseAuroraVision2622 == null) {
                                        FrostHunterDrawerLayoutUltraStrike3303.FrostHunterColorStateListInflaterNovaQuantum4229("Skipping 'Style:' line before 'Format:' line: ".concat(FrostHunterLightSensorForceFusion42414));
                                    } else {
                                        FrostHunterCanvasInfernoVortex4700.FrostHunterResourcesTitanHyperVision5823(FrostHunterLightSensorForceFusion42414.startsWith("Style:"));
                                        String[] split3 = TextUtils.split(FrostHunterLightSensorForceFusion42414.substring(6), ",");
                                        int length = split3.length;
                                        int i16 = frostHunterConstraintSetClonePulseAuroraVision2622.FrostHunterKeyframeGammaGamma1197;
                                        if (length != i16) {
                                            int length2 = split3.length;
                                            String str = FrostHunterGyroscopeHeroAlpha1995.FrostHunterAlphaAnimationNeoCosmos5761;
                                            Locale locale = Locale.US;
                                            FrostHunterDrawerLayoutUltraStrike3303.FrostHunterColorStateListInflaterNovaQuantum4229("Skipping malformed 'Style:' line (expected " + i16 + " values, found " + length2 + "): '" + FrostHunterLightSensorForceFusion42414 + "'");
                                        } else {
                                            try {
                                                String trim = split3[frostHunterConstraintSetClonePulseAuroraVision2622.FrostHunterAlphaAnimationNeoCosmos5761].trim();
                                                int i17 = frostHunterConstraintSetClonePulseAuroraVision2622.FrostHunterConstraintSetCloneMasterUltraRogue2633;
                                                int FrostHunterAlphaAnimationNeoCosmos5761 = i17 != -1 ? FrostHunterFirebaseModelInterpreterHyperionHyperionPixel2204.FrostHunterAlphaAnimationNeoCosmos5761(split3[i17].trim()) : -1;
                                                int i18 = frostHunterConstraintSetClonePulseAuroraVision2622.FrostHunterBundlePulseFusionHero2475;
                                                Integer FrostHunterBundlePulseFusionHero2475 = i18 != -1 ? FrostHunterFirebaseModelInterpreterHyperionHyperionPixel2204.FrostHunterBundlePulseFusionHero2475(split3[i18].trim()) : null;
                                                int i19 = frostHunterConstraintSetClonePulseAuroraVision2622.FrostHunterServiceEliteCelestialThunder1757;
                                                Integer FrostHunterBundlePulseFusionHero24752 = i19 != -1 ? FrostHunterFirebaseModelInterpreterHyperionHyperionPixel2204.FrostHunterBundlePulseFusionHero2475(split3[i19].trim()) : null;
                                                int i20 = frostHunterConstraintSetClonePulseAuroraVision2622.FrostHunterLifecycleBlazeGammaElite2889;
                                                float f = -3.4028235E38f;
                                                if (i20 != -1) {
                                                    String trim2 = split3[i20].trim();
                                                    try {
                                                        f = Float.parseFloat(trim2);
                                                    } catch (NumberFormatException e) {
                                                        FrostHunterDrawerLayoutUltraStrike3303.FrostHunterColorDrawableLegendPhoenixVision7927("Failed to parse font size: '" + trim2 + "'", e);
                                                    }
                                                }
                                                float f2 = f;
                                                int i21 = frostHunterConstraintSetClonePulseAuroraVision2622.FrostHunterLevelListDrawableFusionDragonHero2232;
                                                boolean z = i21 != -1 && FrostHunterFirebaseModelInterpreterHyperionHyperionPixel2204.FrostHunterConstraintSetCloneMasterUltraRogue2633(split3[i21].trim());
                                                int i22 = frostHunterConstraintSetClonePulseAuroraVision2622.FrostHunterRemoteConfigSpeedSpeed8566;
                                                boolean z2 = i22 != -1 && FrostHunterFirebaseModelInterpreterHyperionHyperionPixel2204.FrostHunterConstraintSetCloneMasterUltraRogue2633(split3[i22].trim());
                                                int i23 = frostHunterConstraintSetClonePulseAuroraVision2622.FrostHunterCameraXPixelTurboCosmos9814;
                                                boolean z3 = i23 != -1 && FrostHunterFirebaseModelInterpreterHyperionHyperionPixel2204.FrostHunterConstraintSetCloneMasterUltraRogue2633(split3[i23].trim());
                                                int i24 = frostHunterConstraintSetClonePulseAuroraVision2622.FrostHunterFlowMaxDragonHero5809;
                                                boolean z4 = i24 != -1 && FrostHunterFirebaseModelInterpreterHyperionHyperionPixel2204.FrostHunterConstraintSetCloneMasterUltraRogue2633(split3[i24].trim());
                                                int i25 = frostHunterConstraintSetClonePulseAuroraVision2622.FrostHunterAlertDialogAuroraDelta3200;
                                                if (i25 != -1) {
                                                    String trim3 = split3[i25].trim();
                                                    try {
                                                        int parseInt = Integer.parseInt(trim3.trim());
                                                        if (parseInt == 1 || parseInt == 3) {
                                                            i4 = parseInt;
                                                        }
                                                    } catch (NumberFormatException unused2) {
                                                    }
                                                    FrostHunterDrawerLayoutUltraStrike3303.FrostHunterColorStateListInflaterNovaQuantum4229("Ignoring unknown BorderStyle: " + trim3);
                                                }
                                                frostHunterFirebaseModelInterpreterHyperionHyperionPixel2204 = new FrostHunterFirebaseModelInterpreterHyperionHyperionPixel2204(trim, FrostHunterAlphaAnimationNeoCosmos5761, FrostHunterBundlePulseFusionHero2475, FrostHunterBundlePulseFusionHero24752, f2, z, z2, z3, z4, i4);
                                            } catch (RuntimeException e2) {
                                                FrostHunterDrawerLayoutUltraStrike3303.FrostHunterColorDrawableLegendPhoenixVision7927("Skipping malformed 'Style:' line: '" + FrostHunterLightSensorForceFusion42414 + "'", e2);
                                            }
                                            if (frostHunterFirebaseModelInterpreterHyperionHyperionPixel2204 != null) {
                                                linkedHashMap.put(frostHunterFirebaseModelInterpreterHyperionHyperionPixel2204.FrostHunterAlphaAnimationNeoCosmos5761, frostHunterFirebaseModelInterpreterHyperionHyperionPixel2204);
                                            }
                                        }
                                        frostHunterFirebaseModelInterpreterHyperionHyperionPixel2204 = null;
                                        if (frostHunterFirebaseModelInterpreterHyperionHyperionPixel2204 != null) {
                                        }
                                    }
                                }
                                i2 = 2;
                                i3 = 0;
                            }
                        }
                    }
                }
                this.FrostHunterKeyframeGammaGamma1197 = linkedHashMap;
            } else if ("[V4 Styles]".equalsIgnoreCase(FrostHunterLightSensorForceFusion42412)) {
                FrostHunterDrawerLayoutUltraStrike3303.FrostHunterMagnetometerFusionTitanium8202("[V4 Styles] are not supported");
            } else if ("[Events]".equalsIgnoreCase(FrostHunterLightSensorForceFusion42412)) {
                return;
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:27:0x00c2  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x00ca  */
    @Override // android.content.Context.FrostHunterActionBarHyperMax6338
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void FrostHunterFirebaseModelDownloadConditionsSolarBlaze2223(byte[] bArr, int i, int i2, FrostHunterLaunchGammaTitanium8407 frostHunterLaunchGammaTitanium8407, FrostHunterLayoutInflaterNebulaVision6522 frostHunterLayoutInflaterNebulaVision6522) {
        Charset charset;
        long j;
        FrostHunterMotionSceneTitaniumNovaX1599 frostHunterMotionSceneTitaniumNovaX1599;
        FrostHunterLicensingSpectraPulse8868 frostHunterLicensingSpectraPulse8868;
        int parseInt;
        long FrostHunterBundlePulseFusionHero2475;
        float f;
        float f2;
        int i3;
        float f3;
        int i4;
        Layout.Alignment alignment;
        Layout.Alignment alignment2;
        int i5;
        int i6;
        int i7;
        float f4;
        float f5;
        float f6;
        boolean z;
        int i8;
        int i9;
        float f7;
        int i10;
        int i11;
        float f8;
        int i12;
        int i13;
        int i14;
        FrostHunterRoomEntityRogueLegendElite4551 frostHunterRoomEntityRogueLegendElite4551 = this;
        long j2 = frostHunterLaunchGammaTitanium8407.FrostHunterAlphaAnimationNeoCosmos5761;
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        FrostHunterLicensingSpectraPulse8868 frostHunterLicensingSpectraPulse88682 = frostHunterRoomEntityRogueLegendElite4551.FrostHunterAlertDialogAuroraDelta3200;
        frostHunterLicensingSpectraPulse88682.FrostHunterMagnetometerFusionTitanium8202(bArr, i + i2);
        frostHunterLicensingSpectraPulse88682.FrostHunterR8MasterNebulaSpark7247(i);
        Charset FrostHunterTranslateAnimationCyberSolarUltra7101 = frostHunterLicensingSpectraPulse88682.FrostHunterTranslateAnimationCyberSolarUltra7101();
        if (FrostHunterTranslateAnimationCyberSolarUltra7101 == null) {
            FrostHunterTranslateAnimationCyberSolarUltra7101 = StandardCharsets.UTF_8;
        }
        boolean z2 = frostHunterRoomEntityRogueLegendElite4551.FrostHunterCameraXPixelTurboCosmos9814;
        if (!z2) {
            frostHunterRoomEntityRogueLegendElite4551.FrostHunterConstraintSetCloneMasterUltraRogue2633(frostHunterLicensingSpectraPulse88682, FrostHunterTranslateAnimationCyberSolarUltra7101);
        }
        FrostHunterMotionSceneTitaniumNovaX1599 frostHunterMotionSceneTitaniumNovaX15992 = z2 ? frostHunterRoomEntityRogueLegendElite4551.FrostHunterFlowMaxDragonHero5809 : null;
        while (true) {
            String FrostHunterLightSensorForceFusion42412 = frostHunterLicensingSpectraPulse88682.FrostHunterLightSensorForceFusion4241(FrostHunterTranslateAnimationCyberSolarUltra7101);
            if (FrostHunterLightSensorForceFusion42412 == null) {
                long j3 = j2;
                ArrayList arrayList3 = (j3 == -9223372036854775807L || !frostHunterLaunchGammaTitanium8407.FrostHunterConstraintSetCloneMasterUltraRogue2633) ? null : new ArrayList();
                for (int i15 = 0; i15 < arrayList.size(); i15++) {
                    List list = (List) arrayList.get(i15);
                    if (!list.isEmpty() || i15 == 0) {
                        if (i15 == arrayList.size() - 1) {
                            FrostHunterMaterialCardViewShadowBlazeBlaze3823.FrostHunterScaleAnimationStrikeSpark5059();
                            return;
                        }
                        long longValue = ((Long) arrayList2.get(i15)).longValue();
                        long longValue2 = ((Long) arrayList2.get(i15 + 1)).longValue();
                        FrostHunterWindowManagerInfernoOlympianVortex6395 frostHunterWindowManagerInfernoOlympianVortex6395 = new FrostHunterWindowManagerInfernoOlympianVortex6395(longValue, longValue2 - longValue, list);
                        if (j3 == -9223372036854775807L || longValue2 >= j3) {
                            frostHunterLayoutInflaterNebulaVision6522.accept(frostHunterWindowManagerInfernoOlympianVortex6395);
                        } else if (arrayList3 != null) {
                            arrayList3.add(frostHunterWindowManagerInfernoOlympianVortex6395);
                        }
                    }
                }
                if (arrayList3 != null) {
                    int size = arrayList3.size();
                    int i16 = 0;
                    while (i16 < size) {
                        Object obj = arrayList3.get(i16);
                        i16++;
                        frostHunterLayoutInflaterNebulaVision6522.accept((FrostHunterWindowManagerInfernoOlympianVortex6395) obj);
                    }
                    return;
                }
                return;
            }
            if (FrostHunterLightSensorForceFusion42412.startsWith("Format:")) {
                frostHunterMotionSceneTitaniumNovaX15992 = FrostHunterMotionSceneTitaniumNovaX1599.FrostHunterAlphaAnimationNeoCosmos5761(FrostHunterLightSensorForceFusion42412);
            } else {
                if (FrostHunterLightSensorForceFusion42412.startsWith("Dialogue:")) {
                    if (frostHunterMotionSceneTitaniumNovaX15992 == null) {
                        FrostHunterDrawerLayoutUltraStrike3303.FrostHunterColorStateListInflaterNovaQuantum4229("Skipping dialogue line before complete format: ".concat(FrostHunterLightSensorForceFusion42412));
                    } else {
                        int i17 = frostHunterMotionSceneTitaniumNovaX15992.FrostHunterLevelListDrawableFusionDragonHero2232;
                        FrostHunterCanvasInfernoVortex4700.FrostHunterResourcesTitanHyperVision5823(FrostHunterLightSensorForceFusion42412.startsWith("Dialogue:"));
                        String substring = FrostHunterLightSensorForceFusion42412.substring(9);
                        int i18 = frostHunterMotionSceneTitaniumNovaX15992.FrostHunterAlphaAnimationNeoCosmos5761;
                        String[] split = substring.split(",", i17);
                        if (split.length != i17) {
                            FrostHunterDrawerLayoutUltraStrike3303.FrostHunterColorStateListInflaterNovaQuantum4229("Skipping dialogue line with fewer columns than format: ".concat(FrostHunterLightSensorForceFusion42412));
                        } else {
                            if (i18 != -1) {
                                try {
                                    parseInt = Integer.parseInt(split[i18].trim());
                                } catch (RuntimeException unused) {
                                    FrostHunterDrawerLayoutUltraStrike3303.FrostHunterColorStateListInflaterNovaQuantum4229("Fail to parse layer: " + split[i18]);
                                }
                                FrostHunterBundlePulseFusionHero2475 = FrostHunterBundlePulseFusionHero2475(split[frostHunterMotionSceneTitaniumNovaX15992.FrostHunterConstraintSetCloneMasterUltraRogue2633]);
                                if (FrostHunterBundlePulseFusionHero2475 != -9223372036854775807L) {
                                    FrostHunterDrawerLayoutUltraStrike3303.FrostHunterColorStateListInflaterNovaQuantum4229("Skipping invalid timing: ".concat(FrostHunterLightSensorForceFusion42412));
                                } else {
                                    j = j2;
                                    long FrostHunterBundlePulseFusionHero24752 = FrostHunterBundlePulseFusionHero2475(split[frostHunterMotionSceneTitaniumNovaX15992.FrostHunterBundlePulseFusionHero2475]);
                                    if (FrostHunterBundlePulseFusionHero24752 == -9223372036854775807L || FrostHunterBundlePulseFusionHero24752 <= FrostHunterBundlePulseFusionHero2475) {
                                        charset = FrostHunterTranslateAnimationCyberSolarUltra7101;
                                        frostHunterMotionSceneTitaniumNovaX1599 = frostHunterMotionSceneTitaniumNovaX15992;
                                        frostHunterLicensingSpectraPulse8868 = frostHunterLicensingSpectraPulse88682;
                                        FrostHunterDrawerLayoutUltraStrike3303.FrostHunterColorStateListInflaterNovaQuantum4229("Skipping invalid timing: ".concat(FrostHunterLightSensorForceFusion42412));
                                    } else {
                                        LinkedHashMap linkedHashMap = frostHunterRoomEntityRogueLegendElite4551.FrostHunterKeyframeGammaGamma1197;
                                        FrostHunterFirebaseModelInterpreterHyperionHyperionPixel2204 frostHunterFirebaseModelInterpreterHyperionHyperionPixel2204 = (linkedHashMap == null || (i14 = frostHunterMotionSceneTitaniumNovaX15992.FrostHunterServiceEliteCelestialThunder1757) == -1) ? null : (FrostHunterFirebaseModelInterpreterHyperionHyperionPixel2204) linkedHashMap.get(split[i14].trim());
                                        String str = split[frostHunterMotionSceneTitaniumNovaX15992.FrostHunterLifecycleBlazeGammaElite2889];
                                        Matcher matcher = FrostHunterProGuardPhoenixSpectra5236.FrostHunterAlphaAnimationNeoCosmos5761.matcher(str);
                                        charset = FrostHunterTranslateAnimationCyberSolarUltra7101;
                                        PointF pointF = null;
                                        int i19 = -1;
                                        while (matcher.find()) {
                                            FrostHunterMotionSceneTitaniumNovaX1599 frostHunterMotionSceneTitaniumNovaX15993 = frostHunterMotionSceneTitaniumNovaX15992;
                                            FrostHunterLicensingSpectraPulse8868 frostHunterLicensingSpectraPulse88683 = frostHunterLicensingSpectraPulse88682;
                                            String group = matcher.group(1);
                                            group.getClass();
                                            try {
                                                PointF FrostHunterAlphaAnimationNeoCosmos5761 = FrostHunterProGuardPhoenixSpectra5236.FrostHunterAlphaAnimationNeoCosmos5761(group);
                                                if (FrostHunterAlphaAnimationNeoCosmos5761 != null) {
                                                    pointF = FrostHunterAlphaAnimationNeoCosmos5761;
                                                }
                                            } catch (RuntimeException unused2) {
                                            }
                                            try {
                                                Matcher matcher2 = FrostHunterProGuardPhoenixSpectra5236.FrostHunterServiceEliteCelestialThunder1757.matcher(group);
                                                if (matcher2.find()) {
                                                    String group2 = matcher2.group(1);
                                                    group2.getClass();
                                                    i13 = FrostHunterFirebaseModelInterpreterHyperionHyperionPixel2204.FrostHunterAlphaAnimationNeoCosmos5761(group2);
                                                } else {
                                                    i13 = -1;
                                                }
                                                if (i13 != -1) {
                                                    i19 = i13;
                                                }
                                            } catch (RuntimeException unused3) {
                                            }
                                            frostHunterMotionSceneTitaniumNovaX15992 = frostHunterMotionSceneTitaniumNovaX15993;
                                            frostHunterLicensingSpectraPulse88682 = frostHunterLicensingSpectraPulse88683;
                                        }
                                        frostHunterMotionSceneTitaniumNovaX1599 = frostHunterMotionSceneTitaniumNovaX15992;
                                        frostHunterLicensingSpectraPulse8868 = frostHunterLicensingSpectraPulse88682;
                                        String replace = FrostHunterProGuardPhoenixSpectra5236.FrostHunterAlphaAnimationNeoCosmos5761.matcher(str).replaceAll("").replace("\\N", "\n").replace("\\n", "\n").replace("\\h", " ");
                                        float f9 = frostHunterRoomEntityRogueLegendElite4551.FrostHunterFragmentBetaMegaVortex6025;
                                        float f10 = frostHunterRoomEntityRogueLegendElite4551.FrostHunterServiceConnectionTurboPhoenixOmega6719;
                                        SpannableString spannableString = new SpannableString(replace);
                                        if (frostHunterFirebaseModelInterpreterHyperionHyperionPixel2204 != null) {
                                            boolean z3 = frostHunterFirebaseModelInterpreterHyperionHyperionPixel2204.FrostHunterRemoteConfigSpeedSpeed8566;
                                            Integer num = frostHunterFirebaseModelInterpreterHyperionHyperionPixel2204.FrostHunterServiceEliteCelestialThunder1757;
                                            Integer num2 = frostHunterFirebaseModelInterpreterHyperionHyperionPixel2204.FrostHunterBundlePulseFusionHero2475;
                                            if (num2 != null) {
                                                z = z3;
                                                f = f9;
                                                f2 = f10;
                                                i8 = 33;
                                                i9 = 0;
                                                spannableString.setSpan(new ForegroundColorSpan(num2.intValue()), 0, spannableString.length(), 33);
                                            } else {
                                                z = z3;
                                                f = f9;
                                                f2 = f10;
                                                i8 = 33;
                                                i9 = 0;
                                            }
                                            if (frostHunterFirebaseModelInterpreterHyperionHyperionPixel2204.FrostHunterAlertDialogAuroraDelta3200 == 3 && num != null) {
                                                spannableString.setSpan(new BackgroundColorSpan(num.intValue()), i9, spannableString.length(), i8);
                                            }
                                            float f11 = frostHunterFirebaseModelInterpreterHyperionHyperionPixel2204.FrostHunterLifecycleBlazeGammaElite2889;
                                            if (f11 == -3.4028235E38f || f2 == -3.4028235E38f) {
                                                f7 = -3.4028235E38f;
                                                i10 = Integer.MIN_VALUE;
                                            } else {
                                                f7 = f11 / f2;
                                                i10 = 1;
                                            }
                                            boolean z4 = frostHunterFirebaseModelInterpreterHyperionHyperionPixel2204.FrostHunterLevelListDrawableFusionDragonHero2232;
                                            if (z4 && z) {
                                                i11 = i10;
                                                f8 = f7;
                                                i12 = 33;
                                                i3 = 0;
                                                spannableString.setSpan(new StyleSpan(3), 0, spannableString.length(), 33);
                                            } else {
                                                i11 = i10;
                                                f8 = f7;
                                                i12 = 33;
                                                i3 = 0;
                                                if (z4) {
                                                    spannableString.setSpan(new StyleSpan(1), 0, spannableString.length(), 33);
                                                } else if (z) {
                                                    spannableString.setSpan(new StyleSpan(2), 0, spannableString.length(), 33);
                                                }
                                            }
                                            if (frostHunterFirebaseModelInterpreterHyperionHyperionPixel2204.FrostHunterCameraXPixelTurboCosmos9814) {
                                                spannableString.setSpan(new UnderlineSpan(), i3, spannableString.length(), i12);
                                            }
                                            if (frostHunterFirebaseModelInterpreterHyperionHyperionPixel2204.FrostHunterFlowMaxDragonHero5809) {
                                                spannableString.setSpan(new StrikethroughSpan(), i3, spannableString.length(), i12);
                                            }
                                            i4 = i11;
                                            f3 = f8;
                                        } else {
                                            f = f9;
                                            f2 = f10;
                                            i3 = 0;
                                            f3 = -3.4028235E38f;
                                            i4 = Integer.MIN_VALUE;
                                        }
                                        if (i19 == -1) {
                                            i19 = frostHunterFirebaseModelInterpreterHyperionHyperionPixel2204 != null ? frostHunterFirebaseModelInterpreterHyperionHyperionPixel2204.FrostHunterConstraintSetCloneMasterUltraRogue2633 : -1;
                                        }
                                        switch (i19) {
                                            case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                                            default:
                                                FrostHunterKeyEventNovaXAlpha1220.FrostHunterMotionSceneAuroraMega2271("Unknown alignment: ", i19);
                                            case InstallReferrerClient.InstallReferrerResponse.SERVICE_DISCONNECTED /* -1 */:
                                                alignment2 = null;
                                                break;
                                            case 1:
                                            case 4:
                                            case FrostHunterRemoteModelManagerCyberLegend2797.DOUBLE_FIELD_NUMBER /* 7 */:
                                                alignment = Layout.Alignment.ALIGN_NORMAL;
                                                alignment2 = alignment;
                                                break;
                                            case 2:
                                            case FrostHunterRemoteModelManagerCyberLegend2797.STRING_FIELD_NUMBER /* 5 */:
                                            case FrostHunterRemoteModelManagerCyberLegend2797.BYTES_FIELD_NUMBER /* 8 */:
                                                alignment = Layout.Alignment.ALIGN_CENTER;
                                                alignment2 = alignment;
                                                break;
                                            case 3:
                                            case FrostHunterRemoteModelManagerCyberLegend2797.STRING_SET_FIELD_NUMBER /* 6 */:
                                            case 9:
                                                alignment = Layout.Alignment.ALIGN_OPPOSITE;
                                                alignment2 = alignment;
                                                break;
                                        }
                                        int i20 = Integer.MIN_VALUE;
                                        switch (i19) {
                                            case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                                            default:
                                                FrostHunterKeyEventNovaXAlpha1220.FrostHunterMotionSceneAuroraMega2271("Unknown alignment: ", i19);
                                            case InstallReferrerClient.InstallReferrerResponse.SERVICE_DISCONNECTED /* -1 */:
                                                i5 = Integer.MIN_VALUE;
                                                break;
                                            case 1:
                                            case 4:
                                            case FrostHunterRemoteModelManagerCyberLegend2797.DOUBLE_FIELD_NUMBER /* 7 */:
                                                i5 = i3;
                                                break;
                                            case 2:
                                            case FrostHunterRemoteModelManagerCyberLegend2797.STRING_FIELD_NUMBER /* 5 */:
                                            case FrostHunterRemoteModelManagerCyberLegend2797.BYTES_FIELD_NUMBER /* 8 */:
                                                i5 = 1;
                                                break;
                                            case 3:
                                            case FrostHunterRemoteModelManagerCyberLegend2797.STRING_SET_FIELD_NUMBER /* 6 */:
                                            case 9:
                                                i5 = 2;
                                                break;
                                        }
                                        switch (i19) {
                                            case InstallReferrerClient.InstallReferrerResponse.SERVICE_DISCONNECTED /* -1 */:
                                                break;
                                            case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                                            default:
                                                FrostHunterKeyEventNovaXAlpha1220.FrostHunterMotionSceneAuroraMega2271("Unknown alignment: ", i19);
                                                break;
                                            case 1:
                                            case 2:
                                            case 3:
                                                i20 = 2;
                                                break;
                                            case 4:
                                            case FrostHunterRemoteModelManagerCyberLegend2797.STRING_FIELD_NUMBER /* 5 */:
                                            case FrostHunterRemoteModelManagerCyberLegend2797.STRING_SET_FIELD_NUMBER /* 6 */:
                                                i20 = 1;
                                                break;
                                            case FrostHunterRemoteModelManagerCyberLegend2797.DOUBLE_FIELD_NUMBER /* 7 */:
                                            case FrostHunterRemoteModelManagerCyberLegend2797.BYTES_FIELD_NUMBER /* 8 */:
                                            case 9:
                                                i20 = i3;
                                                break;
                                        }
                                        if (pointF == null || f2 == -3.4028235E38f || f == -3.4028235E38f) {
                                            float f12 = 0.95f;
                                            if (i5 != 0) {
                                                i7 = 1;
                                                if (i5 != 1) {
                                                    i6 = 2;
                                                    f4 = i5 != 2 ? -3.4028235E38f : 0.95f;
                                                } else {
                                                    i6 = 2;
                                                    f4 = 0.5f;
                                                }
                                            } else {
                                                i6 = 2;
                                                i7 = 1;
                                                f4 = 0.05f;
                                            }
                                            if (i20 == 0) {
                                                f12 = 0.05f;
                                            } else if (i20 == i7) {
                                                f12 = 0.5f;
                                            } else if (i20 != i6) {
                                                f12 = -3.4028235E38f;
                                            }
                                            f5 = f12;
                                            f6 = f4;
                                        } else {
                                            f6 = pointF.x / f;
                                            f5 = pointF.y / f2;
                                        }
                                        FrostHunterConstraintSetPhoenixVision2576 frostHunterConstraintSetPhoenixVision2576 = new FrostHunterConstraintSetPhoenixVision2576(spannableString, alignment2, null, null, f5, i3, i20, f6, i5, i4, f3, -3.4028235E38f, -3.4028235E38f, false, -16777216, Integer.MIN_VALUE, 0.0f, parseInt);
                                        int FrostHunterAlphaAnimationNeoCosmos57612 = FrostHunterAlphaAnimationNeoCosmos5761(FrostHunterBundlePulseFusionHero24752, arrayList2, arrayList);
                                        for (int FrostHunterAlphaAnimationNeoCosmos57613 = FrostHunterAlphaAnimationNeoCosmos5761(FrostHunterBundlePulseFusionHero2475, arrayList2, arrayList); FrostHunterAlphaAnimationNeoCosmos57613 < FrostHunterAlphaAnimationNeoCosmos57612; FrostHunterAlphaAnimationNeoCosmos57613++) {
                                            ((List) arrayList.get(FrostHunterAlphaAnimationNeoCosmos57613)).add(frostHunterConstraintSetPhoenixVision2576);
                                        }
                                    }
                                    frostHunterRoomEntityRogueLegendElite4551 = this;
                                    j2 = j;
                                    FrostHunterTranslateAnimationCyberSolarUltra7101 = charset;
                                    frostHunterMotionSceneTitaniumNovaX15992 = frostHunterMotionSceneTitaniumNovaX1599;
                                    frostHunterLicensingSpectraPulse88682 = frostHunterLicensingSpectraPulse8868;
                                }
                            }
                            parseInt = 0;
                            FrostHunterBundlePulseFusionHero2475 = FrostHunterBundlePulseFusionHero2475(split[frostHunterMotionSceneTitaniumNovaX15992.FrostHunterConstraintSetCloneMasterUltraRogue2633]);
                            if (FrostHunterBundlePulseFusionHero2475 != -9223372036854775807L) {
                            }
                        }
                    }
                }
                charset = FrostHunterTranslateAnimationCyberSolarUltra7101;
                j = j2;
                frostHunterMotionSceneTitaniumNovaX1599 = frostHunterMotionSceneTitaniumNovaX15992;
                frostHunterLicensingSpectraPulse8868 = frostHunterLicensingSpectraPulse88682;
                frostHunterRoomEntityRogueLegendElite4551 = this;
                j2 = j;
                FrostHunterTranslateAnimationCyberSolarUltra7101 = charset;
                frostHunterMotionSceneTitaniumNovaX15992 = frostHunterMotionSceneTitaniumNovaX1599;
                frostHunterLicensingSpectraPulse88682 = frostHunterLicensingSpectraPulse8868;
            }
        }
    }
}
