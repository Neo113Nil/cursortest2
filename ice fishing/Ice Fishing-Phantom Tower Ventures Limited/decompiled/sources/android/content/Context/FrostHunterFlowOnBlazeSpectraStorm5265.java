package android.content.Context;

import android.graphics.Color;
import android.text.SpannableStringBuilder;
import android.text.SpannedString;
import android.text.TextUtils;
import android.text.style.AbsoluteSizeSpan;
import android.text.style.BackgroundColorSpan;
import android.text.style.ForegroundColorSpan;
import android.text.style.RelativeSizeSpan;
import android.text.style.StrikethroughSpan;
import android.text.style.StyleSpan;
import android.text.style.TypefaceSpan;
import android.text.style.UnderlineSpan;
import com.android.installreferrer.api.InstallReferrerClient;
import java.nio.charset.StandardCharsets;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* compiled from: r8-map-id-ad53bc00775cc49f3760de3ef5ee15f0f7d4eb373264baa1785c3fa1a15d54ed */
/* loaded from: classes.dex */
public abstract class FrostHunterFlowOnBlazeSpectraStorm5265 {
    public static final Map FrostHunterBundlePulseFusionHero2475;
    public static final Map FrostHunterServiceEliteCelestialThunder1757;
    public static final Pattern FrostHunterAlphaAnimationNeoCosmos5761 = Pattern.compile("^(\\S+)\\s+-->\\s+(\\S+)((?:.|\\f)*+)?$");
    public static final Pattern FrostHunterConstraintSetCloneMasterUltraRogue2633 = Pattern.compile("(\\S+?):(\\S+)");

    static {
        HashMap hashMap = new HashMap();
        hashMap.put("white", Integer.valueOf(Color.rgb(255, 255, 255)));
        hashMap.put("lime", Integer.valueOf(Color.rgb(0, 255, 0)));
        hashMap.put("cyan", Integer.valueOf(Color.rgb(0, 255, 255)));
        hashMap.put("red", Integer.valueOf(Color.rgb(255, 0, 0)));
        hashMap.put("yellow", Integer.valueOf(Color.rgb(255, 255, 0)));
        hashMap.put("magenta", Integer.valueOf(Color.rgb(255, 0, 255)));
        hashMap.put("blue", Integer.valueOf(Color.rgb(0, 0, 255)));
        hashMap.put("black", Integer.valueOf(Color.rgb(0, 0, 0)));
        FrostHunterBundlePulseFusionHero2475 = Collections.unmodifiableMap(hashMap);
        HashMap hashMap2 = new HashMap();
        hashMap2.put("bg_white", Integer.valueOf(Color.rgb(255, 255, 255)));
        hashMap2.put("bg_lime", Integer.valueOf(Color.rgb(0, 255, 0)));
        hashMap2.put("bg_cyan", Integer.valueOf(Color.rgb(0, 255, 255)));
        hashMap2.put("bg_red", Integer.valueOf(Color.rgb(255, 0, 0)));
        hashMap2.put("bg_yellow", Integer.valueOf(Color.rgb(255, 255, 0)));
        hashMap2.put("bg_magenta", Integer.valueOf(Color.rgb(255, 0, 255)));
        hashMap2.put("bg_blue", Integer.valueOf(Color.rgb(0, 0, 255)));
        hashMap2.put("bg_black", Integer.valueOf(Color.rgb(0, 0, 0)));
        FrostHunterServiceEliteCelestialThunder1757 = Collections.unmodifiableMap(hashMap2);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    public static void FrostHunterAlphaAnimationNeoCosmos5761(String str, FrostHunterPoseDetectionNebulaMaxBlaze7482 frostHunterPoseDetectionNebulaMaxBlaze7482, List list, SpannableStringBuilder spannableStringBuilder, List list2) {
        char c;
        int i;
        int i2;
        int i3;
        int i4 = frostHunterPoseDetectionNebulaMaxBlaze7482.FrostHunterConstraintSetCloneMasterUltraRogue2633;
        int length = spannableStringBuilder.length();
        String str2 = frostHunterPoseDetectionNebulaMaxBlaze7482.FrostHunterAlphaAnimationNeoCosmos5761;
        str2.getClass();
        int i5 = -1;
        switch (str2.hashCode()) {
            case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                if (str2.equals("")) {
                    c = 0;
                    break;
                }
                c = 65535;
                break;
            case 98:
                if (str2.equals("b")) {
                    c = 1;
                    break;
                }
                c = 65535;
                break;
            case 99:
                if (str2.equals("c")) {
                    c = 2;
                    break;
                }
                c = 65535;
                break;
            case 105:
                if (str2.equals("i")) {
                    c = 3;
                    break;
                }
                c = 65535;
                break;
            case 117:
                if (str2.equals("u")) {
                    c = 4;
                    break;
                }
                c = 65535;
                break;
            case 118:
                if (str2.equals("v")) {
                    c = 5;
                    break;
                }
                c = 65535;
                break;
            case 3314158:
                if (str2.equals("lang")) {
                    c = 6;
                    break;
                }
                c = 65535;
                break;
            case 3511770:
                if (str2.equals("ruby")) {
                    c = 7;
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
            case FrostHunterRemoteModelManagerCyberLegend2797.STRING_SET_FIELD_NUMBER /* 6 */:
                break;
            case 1:
                spannableStringBuilder.setSpan(new StyleSpan(1), i4, length, 33);
                break;
            case 2:
                for (String str3 : frostHunterPoseDetectionNebulaMaxBlaze7482.FrostHunterServiceEliteCelestialThunder1757) {
                    Map map = FrostHunterBundlePulseFusionHero2475;
                    if (map.containsKey(str3)) {
                        spannableStringBuilder.setSpan(new ForegroundColorSpan(((Integer) map.get(str3)).intValue()), i4, length, 33);
                    } else {
                        Map map2 = FrostHunterServiceEliteCelestialThunder1757;
                        if (map2.containsKey(str3)) {
                            spannableStringBuilder.setSpan(new BackgroundColorSpan(((Integer) map2.get(str3)).intValue()), i4, length, 33);
                        }
                    }
                }
                break;
            case 3:
                spannableStringBuilder.setSpan(new StyleSpan(2), i4, length, 33);
                break;
            case 4:
                spannableStringBuilder.setSpan(new UnderlineSpan(), i4, length, 33);
                break;
            case FrostHunterRemoteModelManagerCyberLegend2797.STRING_FIELD_NUMBER /* 5 */:
                spannableStringBuilder.setSpan(new FrostHunterAdapterDelegateRogueElite7232(frostHunterPoseDetectionNebulaMaxBlaze7482.FrostHunterBundlePulseFusionHero2475), i4, length, 33);
                break;
            case FrostHunterRemoteModelManagerCyberLegend2797.DOUBLE_FIELD_NUMBER /* 7 */:
                int FrostHunterBundlePulseFusionHero24752 = FrostHunterBundlePulseFusionHero2475(list2, str, frostHunterPoseDetectionNebulaMaxBlaze7482);
                ArrayList arrayList = new ArrayList(list.size());
                arrayList.addAll(list);
                Collections.sort(arrayList, FrostHunterImageAnalysisHyperionBeta7010.FrostHunterBundlePulseFusionHero2475);
                int i6 = frostHunterPoseDetectionNebulaMaxBlaze7482.FrostHunterConstraintSetCloneMasterUltraRogue2633;
                int i7 = 0;
                int i8 = 0;
                while (i7 < arrayList.size()) {
                    if ("rt".equals(((FrostHunterImageAnalysisHyperionBeta7010) arrayList.get(i7)).FrostHunterAlphaAnimationNeoCosmos5761.FrostHunterAlphaAnimationNeoCosmos5761)) {
                        FrostHunterImageAnalysisHyperionBeta7010 frostHunterImageAnalysisHyperionBeta7010 = (FrostHunterImageAnalysisHyperionBeta7010) arrayList.get(i7);
                        int FrostHunterBundlePulseFusionHero24753 = FrostHunterBundlePulseFusionHero2475(list2, str, frostHunterImageAnalysisHyperionBeta7010.FrostHunterAlphaAnimationNeoCosmos5761);
                        if (FrostHunterBundlePulseFusionHero24753 == i5) {
                            FrostHunterBundlePulseFusionHero24753 = FrostHunterBundlePulseFusionHero24752 != i5 ? FrostHunterBundlePulseFusionHero24752 : 1;
                        }
                        int i9 = frostHunterImageAnalysisHyperionBeta7010.FrostHunterAlphaAnimationNeoCosmos5761.FrostHunterConstraintSetCloneMasterUltraRogue2633 - i8;
                        int i10 = frostHunterImageAnalysisHyperionBeta7010.FrostHunterConstraintSetCloneMasterUltraRogue2633 - i8;
                        CharSequence subSequence = spannableStringBuilder.subSequence(i9, i10);
                        spannableStringBuilder.delete(i9, i10);
                        spannableStringBuilder.setSpan(new FrostHunterFragmentRogueNovaStorm2859(subSequence.toString(), FrostHunterBundlePulseFusionHero24753), i6, i9, 33);
                        i8 = subSequence.length() + i8;
                        i6 = i9;
                    }
                    i7++;
                    i5 = -1;
                }
                break;
            default:
                return;
        }
        ArrayList FrostHunterConstraintSetCloneMasterUltraRogue26332 = FrostHunterConstraintSetCloneMasterUltraRogue2633(list2, str, frostHunterPoseDetectionNebulaMaxBlaze7482);
        for (int i11 = 0; i11 < FrostHunterConstraintSetCloneMasterUltraRogue26332.size(); i11++) {
            FrostHunterAuthInfernoStormTitan6980 frostHunterAuthInfernoStormTitan6980 = ((FrostHunterResourcesMasterUltraHyperion4103) FrostHunterConstraintSetCloneMasterUltraRogue26332.get(i11)).FrostHunterFlowMaxDragonHero5809;
            int i12 = frostHunterAuthInfernoStormTitan6980.FrostHunterFragmentBetaMegaVortex6025;
            if (i12 == -1 && frostHunterAuthInfernoStormTitan6980.FrostHunterServiceConnectionTurboPhoenixOmega6719 == -1) {
                i = -1;
            } else {
                i = (frostHunterAuthInfernoStormTitan6980.FrostHunterServiceConnectionTurboPhoenixOmega6719 == 1 ? (char) 2 : (char) 0) | (i12 == 1 ? (char) 1 : (char) 0);
            }
            if (i != -1) {
                int i13 = frostHunterAuthInfernoStormTitan6980.FrostHunterFragmentBetaMegaVortex6025;
                if (i13 == -1 && frostHunterAuthInfernoStormTitan6980.FrostHunterServiceConnectionTurboPhoenixOmega6719 == -1) {
                    i3 = -1;
                    i2 = 1;
                } else {
                    i2 = 1;
                    i3 = (i13 == 1 ? 1 : 0) | (frostHunterAuthInfernoStormTitan6980.FrostHunterServiceConnectionTurboPhoenixOmega6719 == 1 ? 2 : 0);
                }
                FrostHunterJobIntentServiceOlympianVortex9856.FrostHunterServiceEliteCelestialThunder1757(spannableStringBuilder, new StyleSpan(i3), i4, length);
            } else {
                i2 = 1;
            }
            if (frostHunterAuthInfernoStormTitan6980.FrostHunterAlertDialogAuroraDelta3200 == i2) {
                spannableStringBuilder.setSpan(new StrikethroughSpan(), i4, length, 33);
            }
            if (frostHunterAuthInfernoStormTitan6980.FrostHunterKeyframeGammaGamma1197 == i2) {
                spannableStringBuilder.setSpan(new UnderlineSpan(), i4, length, 33);
            }
            if (frostHunterAuthInfernoStormTitan6980.FrostHunterRemoteConfigSpeedSpeed8566) {
                if (!frostHunterAuthInfernoStormTitan6980.FrostHunterRemoteConfigSpeedSpeed8566) {
                    FrostHunterFlowHyperionVortexDelta5013.FrostHunterServiceConnectionTurboPhoenixOmega6719("Font color not defined");
                    return;
                }
                FrostHunterJobIntentServiceOlympianVortex9856.FrostHunterServiceEliteCelestialThunder1757(spannableStringBuilder, new ForegroundColorSpan(frostHunterAuthInfernoStormTitan6980.FrostHunterLevelListDrawableFusionDragonHero2232), i4, length);
            }
            if (frostHunterAuthInfernoStormTitan6980.FrostHunterFlowMaxDragonHero5809) {
                if (!frostHunterAuthInfernoStormTitan6980.FrostHunterFlowMaxDragonHero5809) {
                    FrostHunterFlowHyperionVortexDelta5013.FrostHunterServiceConnectionTurboPhoenixOmega6719("Background color not defined.");
                    return;
                }
                FrostHunterJobIntentServiceOlympianVortex9856.FrostHunterServiceEliteCelestialThunder1757(spannableStringBuilder, new BackgroundColorSpan(frostHunterAuthInfernoStormTitan6980.FrostHunterCameraXPixelTurboCosmos9814), i4, length);
            }
            if (frostHunterAuthInfernoStormTitan6980.FrostHunterLifecycleBlazeGammaElite2889 != null) {
                FrostHunterJobIntentServiceOlympianVortex9856.FrostHunterServiceEliteCelestialThunder1757(spannableStringBuilder, new TypefaceSpan(frostHunterAuthInfernoStormTitan6980.FrostHunterLifecycleBlazeGammaElite2889), i4, length);
            }
            int i14 = frostHunterAuthInfernoStormTitan6980.FrostHunterLightSensorForceFusion4241;
            if (i14 == 1) {
                FrostHunterJobIntentServiceOlympianVortex9856.FrostHunterServiceEliteCelestialThunder1757(spannableStringBuilder, new AbsoluteSizeSpan((int) frostHunterAuthInfernoStormTitan6980.FrostHunterScaleAnimationStrikeSpark5059, true), i4, length);
            } else if (i14 == 2) {
                FrostHunterJobIntentServiceOlympianVortex9856.FrostHunterServiceEliteCelestialThunder1757(spannableStringBuilder, new RelativeSizeSpan(frostHunterAuthInfernoStormTitan6980.FrostHunterScaleAnimationStrikeSpark5059), i4, length);
            } else if (i14 == 3) {
                FrostHunterJobIntentServiceOlympianVortex9856.FrostHunterServiceEliteCelestialThunder1757(spannableStringBuilder, new RelativeSizeSpan(frostHunterAuthInfernoStormTitan6980.FrostHunterScaleAnimationStrikeSpark5059 / 100.0f), i4, length);
            }
            if (frostHunterAuthInfernoStormTitan6980.FrostHunterLintTitanVortexQuantum9911) {
                spannableStringBuilder.setSpan(new FrostHunterGradleTitanStorm4835(), i4, length, 33);
            }
        }
    }

    public static int FrostHunterBundlePulseFusionHero2475(List list, String str, FrostHunterPoseDetectionNebulaMaxBlaze7482 frostHunterPoseDetectionNebulaMaxBlaze7482) {
        ArrayList FrostHunterConstraintSetCloneMasterUltraRogue26332 = FrostHunterConstraintSetCloneMasterUltraRogue2633(list, str, frostHunterPoseDetectionNebulaMaxBlaze7482);
        for (int i = 0; i < FrostHunterConstraintSetCloneMasterUltraRogue26332.size(); i++) {
            int i2 = ((FrostHunterResourcesMasterUltraHyperion4103) FrostHunterConstraintSetCloneMasterUltraRogue26332.get(i)).FrostHunterFlowMaxDragonHero5809.FrostHunterFirebaseModelDownloadConditionsSolarBlaze2223;
            if (i2 != -1) {
                return i2;
            }
        }
        return -1;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static ArrayList FrostHunterConstraintSetCloneMasterUltraRogue2633(List list, String str, FrostHunterPoseDetectionNebulaMaxBlaze7482 frostHunterPoseDetectionNebulaMaxBlaze7482) {
        int size;
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < list.size(); i++) {
            FrostHunterAuthInfernoStormTitan6980 frostHunterAuthInfernoStormTitan6980 = (FrostHunterAuthInfernoStormTitan6980) list.get(i);
            String str2 = frostHunterPoseDetectionNebulaMaxBlaze7482.FrostHunterAlphaAnimationNeoCosmos5761;
            Set set = frostHunterPoseDetectionNebulaMaxBlaze7482.FrostHunterServiceEliteCelestialThunder1757;
            String str3 = frostHunterPoseDetectionNebulaMaxBlaze7482.FrostHunterBundlePulseFusionHero2475;
            if (frostHunterAuthInfernoStormTitan6980.FrostHunterAlphaAnimationNeoCosmos5761.isEmpty() && frostHunterAuthInfernoStormTitan6980.FrostHunterConstraintSetCloneMasterUltraRogue2633.isEmpty() && frostHunterAuthInfernoStormTitan6980.FrostHunterBundlePulseFusionHero2475.isEmpty() && frostHunterAuthInfernoStormTitan6980.FrostHunterServiceEliteCelestialThunder1757.isEmpty()) {
                size = TextUtils.isEmpty(str2);
            } else {
                int FrostHunterAlphaAnimationNeoCosmos57612 = FrostHunterAuthInfernoStormTitan6980.FrostHunterAlphaAnimationNeoCosmos5761(FrostHunterAuthInfernoStormTitan6980.FrostHunterAlphaAnimationNeoCosmos5761(FrostHunterAuthInfernoStormTitan6980.FrostHunterAlphaAnimationNeoCosmos5761(0, 1073741824, frostHunterAuthInfernoStormTitan6980.FrostHunterAlphaAnimationNeoCosmos5761, str), 2, frostHunterAuthInfernoStormTitan6980.FrostHunterConstraintSetCloneMasterUltraRogue2633, str2), 4, frostHunterAuthInfernoStormTitan6980.FrostHunterServiceEliteCelestialThunder1757, str3);
                size = (FrostHunterAlphaAnimationNeoCosmos57612 == -1 || !set.containsAll(frostHunterAuthInfernoStormTitan6980.FrostHunterBundlePulseFusionHero2475)) ? 0 : FrostHunterAlphaAnimationNeoCosmos57612 + (frostHunterAuthInfernoStormTitan6980.FrostHunterBundlePulseFusionHero2475.size() * 4);
            }
            if (size > 0) {
                arrayList.add(new FrostHunterResourcesMasterUltraHyperion4103(size, frostHunterAuthInfernoStormTitan6980));
            }
        }
        Collections.sort(arrayList);
        return arrayList;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    public static SpannedString FrostHunterLevelListDrawableFusionDragonHero2232(String str, String str2, List list) {
        char c;
        char c2;
        String substring;
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        ArrayDeque arrayDeque = new ArrayDeque();
        ArrayList arrayList = new ArrayList();
        int i = 0;
        while (true) {
            String str3 = "";
            if (i >= str2.length()) {
                while (!arrayDeque.isEmpty()) {
                    FrostHunterAlphaAnimationNeoCosmos5761(str, (FrostHunterPoseDetectionNebulaMaxBlaze7482) arrayDeque.pop(), arrayList, spannableStringBuilder, list);
                }
                FrostHunterAlphaAnimationNeoCosmos5761(str, new FrostHunterPoseDetectionNebulaMaxBlaze7482("", 0, "", Collections.EMPTY_SET), Collections.EMPTY_LIST, spannableStringBuilder, list);
                return SpannedString.valueOf(spannableStringBuilder);
            }
            char charAt = str2.charAt(i);
            if (charAt == '&') {
                i++;
                int indexOf = str2.indexOf(59, i);
                int indexOf2 = str2.indexOf(32, i);
                if (indexOf == -1) {
                    indexOf = indexOf2;
                } else if (indexOf2 != -1) {
                    indexOf = Math.min(indexOf, indexOf2);
                }
                if (indexOf != -1) {
                    substring = str2.substring(i, indexOf);
                    switch (substring) {
                        case "gt":
                            spannableStringBuilder.append('>');
                            break;
                        case "lt":
                            spannableStringBuilder.append('<');
                            break;
                        case "amp":
                            spannableStringBuilder.append('&');
                            break;
                        case "nbsp":
                            spannableStringBuilder.append(' ');
                            break;
                        default:
                            FrostHunterDrawerLayoutUltraStrike3303.FrostHunterColorStateListInflaterNovaQuantum4229("ignoring unsupported entity: '&" + substring + ";'");
                            break;
                    }
                    if (indexOf == indexOf2) {
                        spannableStringBuilder.append((CharSequence) " ");
                    }
                    i = indexOf + 1;
                } else {
                    spannableStringBuilder.append(charAt);
                }
            } else if (charAt != '<') {
                spannableStringBuilder.append(charAt);
                i++;
            } else {
                int i2 = i + 1;
                if (i2 < str2.length()) {
                    boolean z = str2.charAt(i2) == '/';
                    int indexOf3 = str2.indexOf(62, i2);
                    i2 = indexOf3 == -1 ? str2.length() : indexOf3 + 1;
                    int i3 = i2 - 2;
                    boolean z2 = str2.charAt(i3) == '/';
                    int i4 = i + (z ? 2 : 1);
                    if (!z2) {
                        i3 = i2 - 1;
                    }
                    String substring2 = str2.substring(i4, i3);
                    if (!substring2.trim().isEmpty()) {
                        String trim = substring2.trim();
                        FrostHunterCanvasInfernoVortex4700.FrostHunterResourcesTitanHyperVision5823(!trim.isEmpty());
                        String str4 = FrostHunterGyroscopeHeroAlpha1995.FrostHunterAlphaAnimationNeoCosmos5761;
                        String str5 = trim.split("[ \\.]", 2)[0];
                        str5.getClass();
                        switch (str5.hashCode()) {
                            case 98:
                                if (str5.equals("b")) {
                                    c = 0;
                                    break;
                                }
                                c = 65535;
                                break;
                            case 99:
                                if (str5.equals("c")) {
                                    c = 1;
                                    break;
                                }
                                c = 65535;
                                break;
                            case 105:
                                if (str5.equals("i")) {
                                    c = 2;
                                    break;
                                }
                                c = 65535;
                                break;
                            case 117:
                                if (str5.equals("u")) {
                                    c = 3;
                                    break;
                                }
                                c = 65535;
                                break;
                            case 118:
                                if (str5.equals("v")) {
                                    c = 4;
                                    break;
                                }
                                c = 65535;
                                break;
                            case 3650:
                                if (str5.equals("rt")) {
                                    c = 5;
                                    break;
                                }
                                c = 65535;
                                break;
                            case 3314158:
                                if (str5.equals("lang")) {
                                    c = 6;
                                    break;
                                }
                                c = 65535;
                                break;
                            case 3511770:
                                if (str5.equals("ruby")) {
                                    c = 7;
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
                            case 4:
                            case FrostHunterRemoteModelManagerCyberLegend2797.STRING_FIELD_NUMBER /* 5 */:
                            case FrostHunterRemoteModelManagerCyberLegend2797.STRING_SET_FIELD_NUMBER /* 6 */:
                            case FrostHunterRemoteModelManagerCyberLegend2797.DOUBLE_FIELD_NUMBER /* 7 */:
                                if (z) {
                                    while (!arrayDeque.isEmpty()) {
                                        FrostHunterPoseDetectionNebulaMaxBlaze7482 frostHunterPoseDetectionNebulaMaxBlaze7482 = (FrostHunterPoseDetectionNebulaMaxBlaze7482) arrayDeque.pop();
                                        FrostHunterAlphaAnimationNeoCosmos5761(str, frostHunterPoseDetectionNebulaMaxBlaze7482, arrayList, spannableStringBuilder, list);
                                        if (arrayDeque.isEmpty()) {
                                            arrayList.clear();
                                        } else {
                                            arrayList.add(new FrostHunterImageAnalysisHyperionBeta7010(frostHunterPoseDetectionNebulaMaxBlaze7482, spannableStringBuilder.length()));
                                        }
                                        if (frostHunterPoseDetectionNebulaMaxBlaze7482.FrostHunterAlphaAnimationNeoCosmos5761.equals(str5)) {
                                            break;
                                        }
                                    }
                                    break;
                                } else if (!z2) {
                                    int length = spannableStringBuilder.length();
                                    String trim2 = substring2.trim();
                                    FrostHunterCanvasInfernoVortex4700.FrostHunterResourcesTitanHyperVision5823(!trim2.isEmpty());
                                    int indexOf4 = trim2.indexOf(" ");
                                    if (indexOf4 == -1) {
                                        c2 = 0;
                                    } else {
                                        str3 = trim2.substring(indexOf4).trim();
                                        c2 = 0;
                                        trim2 = trim2.substring(0, indexOf4);
                                    }
                                    String[] split = trim2.split("\\.", -1);
                                    String str6 = split[c2];
                                    HashSet hashSet = new HashSet();
                                    for (int i5 = 1; i5 < split.length; i5++) {
                                        hashSet.add(split[i5]);
                                    }
                                    arrayDeque.push(new FrostHunterPoseDetectionNebulaMaxBlaze7482(str6, length, str3, hashSet));
                                    break;
                                }
                                break;
                        }
                    }
                }
                i = i2;
            }
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:52:0x00be, code lost:
    
        if (r6.equals("start") == false) goto L52;
     */
    /* JADX WARN: Code restructure failed: missing block: B:98:0x007f, code lost:
    
        if (r5.equals("center") == false) goto L14;
     */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static void FrostHunterLifecycleBlazeGammaElite2889(String str, FrostHunterViewModelEclipsePrimePulse6895 frostHunterViewModelEclipsePrimePulse6895) {
        Matcher matcher = FrostHunterConstraintSetCloneMasterUltraRogue2633.matcher(str);
        while (matcher.find()) {
            int i = 1;
            String group = matcher.group(1);
            group.getClass();
            String group2 = matcher.group(2);
            group2.getClass();
            try {
                if ("line".equals(group)) {
                    FrostHunterRemoteConfigSpeedSpeed8566(group2, frostHunterViewModelEclipsePrimePulse6895);
                } else {
                    char c = 5;
                    boolean z = false;
                    if ("align".equals(group)) {
                        switch (group2.hashCode()) {
                            case -1364013995:
                                break;
                            case -1074341483:
                                if (group2.equals("middle")) {
                                    z = true;
                                    break;
                                }
                                z = -1;
                                break;
                            case 100571:
                                if (group2.equals("end")) {
                                    z = 2;
                                    break;
                                }
                                z = -1;
                                break;
                            case 3317767:
                                if (group2.equals("left")) {
                                    z = 3;
                                    break;
                                }
                                z = -1;
                                break;
                            case 108511772:
                                if (group2.equals("right")) {
                                    z = 4;
                                    break;
                                }
                                z = -1;
                                break;
                            case 109757538:
                                if (group2.equals("start")) {
                                    z = 5;
                                    break;
                                }
                                z = -1;
                                break;
                            default:
                                z = -1;
                                break;
                        }
                        switch (z) {
                            case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                            case true:
                                i = 2;
                                break;
                            case true:
                                i = 3;
                                break;
                            case true:
                                i = 4;
                                break;
                            case true:
                                i = 5;
                                break;
                            case FrostHunterRemoteModelManagerCyberLegend2797.STRING_FIELD_NUMBER /* 5 */:
                                break;
                            default:
                                FrostHunterDrawerLayoutUltraStrike3303.FrostHunterColorStateListInflaterNovaQuantum4229("Invalid alignment value: ".concat(group2));
                                i = 2;
                                break;
                        }
                        frostHunterViewModelEclipsePrimePulse6895.FrostHunterServiceEliteCelestialThunder1757 = i;
                    } else if ("position".equals(group)) {
                        int indexOf = group2.indexOf(44);
                        if (indexOf != -1) {
                            String substring = group2.substring(indexOf + 1);
                            switch (substring.hashCode()) {
                                case -1842484672:
                                    if (substring.equals("line-left")) {
                                        c = 0;
                                        break;
                                    }
                                    c = 65535;
                                    break;
                                case -1364013995:
                                    if (substring.equals("center")) {
                                        c = 1;
                                        break;
                                    }
                                    c = 65535;
                                    break;
                                case -1276788989:
                                    if (substring.equals("line-right")) {
                                        c = 2;
                                        break;
                                    }
                                    c = 65535;
                                    break;
                                case -1074341483:
                                    if (substring.equals("middle")) {
                                        c = 3;
                                        break;
                                    }
                                    c = 65535;
                                    break;
                                case 100571:
                                    if (substring.equals("end")) {
                                        c = 4;
                                        break;
                                    }
                                    c = 65535;
                                    break;
                                case 109757538:
                                    break;
                                default:
                                    c = 65535;
                                    break;
                            }
                            switch (c) {
                                case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                                case FrostHunterRemoteModelManagerCyberLegend2797.STRING_FIELD_NUMBER /* 5 */:
                                    i = 0;
                                    break;
                                case 1:
                                case 3:
                                    break;
                                case 2:
                                case 4:
                                    i = 2;
                                    break;
                                default:
                                    FrostHunterDrawerLayoutUltraStrike3303.FrostHunterColorStateListInflaterNovaQuantum4229("Invalid anchor value: ".concat(substring));
                                    i = Integer.MIN_VALUE;
                                    break;
                            }
                            frostHunterViewModelEclipsePrimePulse6895.FrostHunterFlowMaxDragonHero5809 = i;
                            group2 = group2.substring(0, indexOf);
                        }
                        frostHunterViewModelEclipsePrimePulse6895.FrostHunterCameraXPixelTurboCosmos9814 = FrostHunterAlertDialogHeroHeroPrime2342.FrostHunterAlphaAnimationNeoCosmos5761(group2);
                    } else if ("size".equals(group)) {
                        frostHunterViewModelEclipsePrimePulse6895.FrostHunterAlertDialogAuroraDelta3200 = FrostHunterAlertDialogHeroHeroPrime2342.FrostHunterAlphaAnimationNeoCosmos5761(group2);
                    } else if ("vertical".equals(group)) {
                        if (group2.equals("lr")) {
                            i = 2;
                        } else if (!group2.equals("rl")) {
                            FrostHunterDrawerLayoutUltraStrike3303.FrostHunterColorStateListInflaterNovaQuantum4229("Invalid 'vertical' value: ".concat(group2));
                            i = Integer.MIN_VALUE;
                        }
                        frostHunterViewModelEclipsePrimePulse6895.FrostHunterKeyframeGammaGamma1197 = i;
                    } else {
                        FrostHunterDrawerLayoutUltraStrike3303.FrostHunterColorStateListInflaterNovaQuantum4229("Unknown cue setting " + group + ":" + group2);
                    }
                }
            } catch (NumberFormatException unused) {
                FrostHunterDrawerLayoutUltraStrike3303.FrostHunterColorStateListInflaterNovaQuantum4229("Skipping bad cue setting: " + matcher.group());
            }
        }
    }

    public static void FrostHunterRemoteConfigSpeedSpeed8566(String str, FrostHunterViewModelEclipsePrimePulse6895 frostHunterViewModelEclipsePrimePulse6895) {
        String substring;
        int i;
        int indexOf = str.indexOf(44);
        if (indexOf != -1) {
            substring = str.substring(indexOf + 1);
            i = 2;
            switch (substring) {
                case "center":
                case "middle":
                    i = 1;
                    break;
                case "end":
                    break;
                case "start":
                    i = 0;
                    break;
                default:
                    FrostHunterDrawerLayoutUltraStrike3303.FrostHunterColorStateListInflaterNovaQuantum4229("Invalid anchor value: ".concat(substring));
                    i = Integer.MIN_VALUE;
                    break;
            }
            frostHunterViewModelEclipsePrimePulse6895.FrostHunterRemoteConfigSpeedSpeed8566 = i;
            str = str.substring(0, indexOf);
        }
        if (str.endsWith("%")) {
            frostHunterViewModelEclipsePrimePulse6895.FrostHunterLifecycleBlazeGammaElite2889 = FrostHunterAlertDialogHeroHeroPrime2342.FrostHunterAlphaAnimationNeoCosmos5761(str);
            frostHunterViewModelEclipsePrimePulse6895.FrostHunterLevelListDrawableFusionDragonHero2232 = 0;
        } else {
            frostHunterViewModelEclipsePrimePulse6895.FrostHunterLifecycleBlazeGammaElite2889 = Integer.parseInt(str);
            frostHunterViewModelEclipsePrimePulse6895.FrostHunterLevelListDrawableFusionDragonHero2232 = 1;
        }
    }

    public static FrostHunterVideoCaptureOmegaQuantumSpeed9487 FrostHunterServiceEliteCelestialThunder1757(String str, Matcher matcher, FrostHunterLicensingSpectraPulse8868 frostHunterLicensingSpectraPulse8868, ArrayList arrayList) {
        FrostHunterViewModelEclipsePrimePulse6895 frostHunterViewModelEclipsePrimePulse6895 = new FrostHunterViewModelEclipsePrimePulse6895();
        try {
            String group = matcher.group(1);
            group.getClass();
            frostHunterViewModelEclipsePrimePulse6895.FrostHunterAlphaAnimationNeoCosmos5761 = FrostHunterAlertDialogHeroHeroPrime2342.FrostHunterConstraintSetCloneMasterUltraRogue2633(group);
            String group2 = matcher.group(2);
            group2.getClass();
            frostHunterViewModelEclipsePrimePulse6895.FrostHunterConstraintSetCloneMasterUltraRogue2633 = FrostHunterAlertDialogHeroHeroPrime2342.FrostHunterConstraintSetCloneMasterUltraRogue2633(group2);
            String group3 = matcher.group(3);
            group3.getClass();
            FrostHunterLifecycleBlazeGammaElite2889(group3, frostHunterViewModelEclipsePrimePulse6895);
            StringBuilder sb = new StringBuilder();
            frostHunterLicensingSpectraPulse8868.getClass();
            String FrostHunterLightSensorForceFusion4241 = frostHunterLicensingSpectraPulse8868.FrostHunterLightSensorForceFusion4241(StandardCharsets.UTF_8);
            while (!TextUtils.isEmpty(FrostHunterLightSensorForceFusion4241)) {
                if (sb.length() > 0) {
                    sb.append("\n");
                }
                sb.append(FrostHunterLightSensorForceFusion4241.trim());
                FrostHunterLightSensorForceFusion4241 = frostHunterLicensingSpectraPulse8868.FrostHunterLightSensorForceFusion4241(StandardCharsets.UTF_8);
            }
            frostHunterViewModelEclipsePrimePulse6895.FrostHunterBundlePulseFusionHero2475 = FrostHunterLevelListDrawableFusionDragonHero2232(str, sb.toString(), arrayList);
            return new FrostHunterVideoCaptureOmegaQuantumSpeed9487(frostHunterViewModelEclipsePrimePulse6895.FrostHunterAlphaAnimationNeoCosmos5761().FrostHunterAlphaAnimationNeoCosmos5761(), frostHunterViewModelEclipsePrimePulse6895.FrostHunterAlphaAnimationNeoCosmos5761, frostHunterViewModelEclipsePrimePulse6895.FrostHunterConstraintSetCloneMasterUltraRogue2633);
        } catch (IllegalArgumentException unused) {
            FrostHunterDrawerLayoutUltraStrike3303.FrostHunterColorStateListInflaterNovaQuantum4229("Skipping cue with bad header: " + matcher.group());
            return null;
        }
    }
}
