package android.content.Context;

import android.text.Layout;
import android.text.TextUtils;
import com.android.installreferrer.api.InstallReferrerClient;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;
import org.xmlpull.v1.XmlPullParserFactory;

/* compiled from: r8-map-id-ad53bc00775cc49f3760de3ef5ee15f0f7d4eb373264baa1785c3fa1a15d54ed */
/* loaded from: classes.dex */
public final class FrostHunterRotateAnimationSpeedOlympianGamma8444 implements FrostHunterActionBarHyperMax6338 {
    public final XmlPullParserFactory FrostHunterCameraXPixelTurboCosmos9814;
    public static final Pattern FrostHunterFlowMaxDragonHero5809 = Pattern.compile("^([0-9][0-9]+):([0-9][0-9]):([0-9][0-9])(?:(\\.[0-9]+)|:([0-9][0-9])(?:\\.([0-9]+))?)?$");
    public static final Pattern FrostHunterAlertDialogAuroraDelta3200 = Pattern.compile("^([0-9]+(?:\\.[0-9]+)?)(h|m|s|ms|f|t)$");
    public static final Pattern FrostHunterKeyframeGammaGamma1197 = Pattern.compile("^(([0-9]*.)?[0-9]+)(px|em|%)$");
    public static final Pattern FrostHunterFragmentBetaMegaVortex6025 = Pattern.compile("^([-+]?\\d+\\.?\\d*?)%$");
    public static final Pattern FrostHunterServiceConnectionTurboPhoenixOmega6719 = Pattern.compile("^([-+]?\\d+\\.?\\d*?)% ([-+]?\\d+\\.?\\d*?)%$");
    public static final Pattern FrostHunterLightSensorForceFusion4241 = Pattern.compile("^([-+]?\\d+\\.?\\d*?)px ([-+]?\\d+\\.?\\d*?)px$");
    public static final Pattern FrostHunterScaleAnimationStrikeSpark5059 = Pattern.compile("^(\\d+) (\\d+)$");
    public static final FrostHunterLooperForceUltraTitan3193 FrostHunterFirebaseModelDownloadConditionsSolarBlaze2223 = new FrostHunterLooperForceUltraTitan3193(30.0f, 1, 1);

    public FrostHunterRotateAnimationSpeedOlympianGamma8444() {
        try {
            XmlPullParserFactory newInstance = XmlPullParserFactory.newInstance();
            this.FrostHunterCameraXPixelTurboCosmos9814 = newInstance;
            newInstance.setNamespaceAware(true);
        } catch (XmlPullParserException e) {
            throw new RuntimeException("Couldn't create XmlPullParserFactory instance", e);
        }
    }

    public static FrostHunterViewModelTitanPhoenixCelestial3010 FrostHunterAlertDialogAuroraDelta3200(XmlPullParser xmlPullParser) {
        String FrostHunterConstraintSetCloneMasterUltraRogue2633 = FrostHunterCardViewLegendUltra9902.FrostHunterConstraintSetCloneMasterUltraRogue2633(xmlPullParser, "extent");
        if (FrostHunterConstraintSetCloneMasterUltraRogue2633 == null) {
            return null;
        }
        Matcher matcher = FrostHunterLightSensorForceFusion4241.matcher(FrostHunterConstraintSetCloneMasterUltraRogue2633);
        if (!matcher.matches()) {
            FrostHunterDrawerLayoutUltraStrike3303.FrostHunterColorStateListInflaterNovaQuantum4229("Ignoring non-pixel tts extent: ".concat(FrostHunterConstraintSetCloneMasterUltraRogue2633));
            return null;
        }
        try {
            String group = matcher.group(1);
            group.getClass();
            int parseInt = Integer.parseInt(group);
            String group2 = matcher.group(2);
            group2.getClass();
            return new FrostHunterViewModelTitanPhoenixCelestial3010(parseInt, Integer.parseInt(group2));
        } catch (NumberFormatException unused) {
            FrostHunterDrawerLayoutUltraStrike3303.FrostHunterColorStateListInflaterNovaQuantum4229("Ignoring malformed tts extent: ".concat(FrostHunterConstraintSetCloneMasterUltraRogue2633));
            return null;
        }
    }

    public static FrostHunterRewardedAdStormEpicAlpha6034 FrostHunterAlphaAnimationNeoCosmos5761(FrostHunterRewardedAdStormEpicAlpha6034 frostHunterRewardedAdStormEpicAlpha6034) {
        return frostHunterRewardedAdStormEpicAlpha6034 == null ? new FrostHunterRewardedAdStormEpicAlpha6034() : frostHunterRewardedAdStormEpicAlpha6034;
    }

    public static int FrostHunterBundlePulseFusionHero2475(XmlPullParser xmlPullParser) {
        String attributeValue = xmlPullParser.getAttributeValue("http://www.w3.org/ns/ttml#parameter", "cellResolution");
        if (attributeValue == null) {
            return 15;
        }
        Matcher matcher = FrostHunterScaleAnimationStrikeSpark5059.matcher(attributeValue);
        if (!matcher.matches()) {
            FrostHunterDrawerLayoutUltraStrike3303.FrostHunterColorStateListInflaterNovaQuantum4229("Ignoring malformed cell resolution: ".concat(attributeValue));
            return 15;
        }
        boolean z = true;
        try {
            String group = matcher.group(1);
            group.getClass();
            int parseInt = Integer.parseInt(group);
            String group2 = matcher.group(2);
            group2.getClass();
            int parseInt2 = Integer.parseInt(group2);
            if (parseInt == 0 || parseInt2 == 0) {
                z = false;
            }
            FrostHunterCanvasInfernoVortex4700.FrostHunterLintTitanVortexQuantum9911(parseInt, parseInt2, "Invalid cell resolution %s %s", z);
            return parseInt2;
        } catch (NumberFormatException unused) {
            FrostHunterDrawerLayoutUltraStrike3303.FrostHunterColorStateListInflaterNovaQuantum4229("Ignoring malformed cell resolution: ".concat(attributeValue));
            return 15;
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:102:0x02b8  */
    /* JADX WARN: Removed duplicated region for block: B:105:0x02c9  */
    /* JADX WARN: Removed duplicated region for block: B:117:0x02e8  */
    /* JADX WARN: Removed duplicated region for block: B:118:0x02bd  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x0228  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x0258  */
    /* JADX WARN: Type inference failed for: r10v1 */
    /* JADX WARN: Type inference failed for: r10v2 */
    /* JADX WARN: Type inference failed for: r10v3 */
    /* JADX WARN: Type inference failed for: r10v4 */
    /* JADX WARN: Type inference failed for: r10v5 */
    /* JADX WARN: Type inference failed for: r10v6 */
    /* JADX WARN: Type inference failed for: r9v1 */
    /* JADX WARN: Type inference failed for: r9v2 */
    /* JADX WARN: Type inference failed for: r9v3 */
    /* JADX WARN: Type inference failed for: r9v4 */
    /* JADX WARN: Type inference failed for: r9v5 */
    /* JADX WARN: Type inference failed for: r9v6 */
    /* JADX WARN: Type inference failed for: r9v7 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static FrostHunterRewardedAdStormEpicAlpha6034 FrostHunterCameraXPixelTurboCosmos9814(XmlPullParser xmlPullParser, FrostHunterRewardedAdStormEpicAlpha6034 frostHunterRewardedAdStormEpicAlpha6034) {
        char c;
        ?? r9;
        ?? r10;
        char c2;
        int i;
        FrostHunterAnalyticsThunderForceLegend3216 FrostHunterRemoteConfigSpeedSpeed8566;
        int i2;
        int hashCode;
        int i3;
        FrostHunterMotionEventNovaTitanium8295 frostHunterMotionEventNovaTitanium8295;
        int i4;
        char c3;
        int attributeCount = xmlPullParser.getAttributeCount();
        FrostHunterRewardedAdStormEpicAlpha6034 frostHunterRewardedAdStormEpicAlpha60342 = frostHunterRewardedAdStormEpicAlpha6034;
        for (int i5 = 0; i5 < attributeCount; i5++) {
            String attributeValue = xmlPullParser.getAttributeValue(i5);
            String attributeName = xmlPullParser.getAttributeName(i5);
            attributeName.getClass();
            switch (attributeName.hashCode()) {
                case -1550943582:
                    if (attributeName.equals("fontStyle")) {
                        c = 0;
                        break;
                    }
                    c = 65535;
                    break;
                case -1289044182:
                    if (attributeName.equals("extent")) {
                        c = 1;
                        break;
                    }
                    c = 65535;
                    break;
                case -1224696685:
                    if (attributeName.equals("fontFamily")) {
                        c = 2;
                        break;
                    }
                    c = 65535;
                    break;
                case -1065511464:
                    if (attributeName.equals("textAlign")) {
                        c = 3;
                        break;
                    }
                    c = 65535;
                    break;
                case -1008619738:
                    if (attributeName.equals("origin")) {
                        c = 4;
                        break;
                    }
                    c = 65535;
                    break;
                case -879295043:
                    if (attributeName.equals("textDecoration")) {
                        c = 5;
                        break;
                    }
                    c = 65535;
                    break;
                case -734428249:
                    if (attributeName.equals("fontWeight")) {
                        c = 6;
                        break;
                    }
                    c = 65535;
                    break;
                case 3355:
                    if (attributeName.equals("id")) {
                        c = 7;
                        break;
                    }
                    c = 65535;
                    break;
                case 3511770:
                    if (attributeName.equals("ruby")) {
                        c = '\b';
                        break;
                    }
                    c = 65535;
                    break;
                case 94842723:
                    if (attributeName.equals("color")) {
                        c = '\t';
                        break;
                    }
                    c = 65535;
                    break;
                case 109403361:
                    if (attributeName.equals("shear")) {
                        c = '\n';
                        break;
                    }
                    c = 65535;
                    break;
                case 110138194:
                    if (attributeName.equals("textCombine")) {
                        c = 11;
                        break;
                    }
                    c = 65535;
                    break;
                case 365601008:
                    if (attributeName.equals("fontSize")) {
                        c = '\f';
                        break;
                    }
                    c = 65535;
                    break;
                case 921125321:
                    if (attributeName.equals("textEmphasis")) {
                        c = '\r';
                        break;
                    }
                    c = 65535;
                    break;
                case 1115953443:
                    if (attributeName.equals("rubyPosition")) {
                        c = 14;
                        break;
                    }
                    c = 65535;
                    break;
                case 1287124693:
                    if (attributeName.equals("backgroundColor")) {
                        c = 15;
                        break;
                    }
                    c = 65535;
                    break;
                case 1754920356:
                    if (attributeName.equals("multiRowAlign")) {
                        c = 16;
                        break;
                    }
                    c = 65535;
                    break;
                default:
                    c = 65535;
                    break;
            }
            Layout.Alignment alignment = null;
            switch (c) {
                case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                    frostHunterRewardedAdStormEpicAlpha60342 = FrostHunterAlphaAnimationNeoCosmos5761(frostHunterRewardedAdStormEpicAlpha60342);
                    frostHunterRewardedAdStormEpicAlpha60342.FrostHunterFlowMaxDragonHero5809 = "italic".equalsIgnoreCase(attributeValue) ? 1 : 0;
                    break;
                case 1:
                    frostHunterRewardedAdStormEpicAlpha60342 = FrostHunterAlphaAnimationNeoCosmos5761(frostHunterRewardedAdStormEpicAlpha60342);
                    frostHunterRewardedAdStormEpicAlpha60342.FrostHunterLooperThreadBetaHyperionMax1000 = attributeValue;
                    break;
                case 2:
                    frostHunterRewardedAdStormEpicAlpha60342 = FrostHunterAlphaAnimationNeoCosmos5761(frostHunterRewardedAdStormEpicAlpha60342);
                    frostHunterRewardedAdStormEpicAlpha60342.FrostHunterAlphaAnimationNeoCosmos5761 = attributeValue;
                    break;
                case 3:
                    frostHunterRewardedAdStormEpicAlpha60342 = FrostHunterAlphaAnimationNeoCosmos5761(frostHunterRewardedAdStormEpicAlpha60342);
                    String FrostHunterConstraintSetCloneOmegaHyperion9304 = FrostHunterCoroutineNovaXMasterMaster7803.FrostHunterConstraintSetCloneOmegaHyperion9304(attributeValue);
                    FrostHunterConstraintSetCloneOmegaHyperion9304.getClass();
                    switch (FrostHunterConstraintSetCloneOmegaHyperion9304.hashCode()) {
                        case -1364013995:
                            if (FrostHunterConstraintSetCloneOmegaHyperion9304.equals("center")) {
                                r9 = false;
                                break;
                            }
                            r9 = -1;
                            break;
                        case 100571:
                            if (FrostHunterConstraintSetCloneOmegaHyperion9304.equals("end")) {
                                r9 = true;
                                break;
                            }
                            r9 = -1;
                            break;
                        case 3317767:
                            if (FrostHunterConstraintSetCloneOmegaHyperion9304.equals("left")) {
                                r9 = 2;
                                break;
                            }
                            r9 = -1;
                            break;
                        case 108511772:
                            if (FrostHunterConstraintSetCloneOmegaHyperion9304.equals("right")) {
                                r9 = 3;
                                break;
                            }
                            r9 = -1;
                            break;
                        case 109757538:
                            if (FrostHunterConstraintSetCloneOmegaHyperion9304.equals("start")) {
                                r9 = 4;
                                break;
                            }
                            r9 = -1;
                            break;
                        default:
                            r9 = -1;
                            break;
                    }
                    switch (r9) {
                        case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                            alignment = Layout.Alignment.ALIGN_CENTER;
                            break;
                        case 1:
                        case 3:
                            alignment = Layout.Alignment.ALIGN_OPPOSITE;
                            break;
                        case 2:
                        case 4:
                            alignment = Layout.Alignment.ALIGN_NORMAL;
                            break;
                    }
                    frostHunterRewardedAdStormEpicAlpha60342.FrostHunterScaleAnimationStrikeSpark5059 = alignment;
                    break;
                case 4:
                    frostHunterRewardedAdStormEpicAlpha60342 = FrostHunterAlphaAnimationNeoCosmos5761(frostHunterRewardedAdStormEpicAlpha60342);
                    frostHunterRewardedAdStormEpicAlpha60342.FrostHunterTextViewDragonStormMega4297 = attributeValue;
                    break;
                case FrostHunterRemoteModelManagerCyberLegend2797.STRING_FIELD_NUMBER /* 5 */:
                    String FrostHunterConstraintSetCloneOmegaHyperion93042 = FrostHunterCoroutineNovaXMasterMaster7803.FrostHunterConstraintSetCloneOmegaHyperion9304(attributeValue);
                    FrostHunterConstraintSetCloneOmegaHyperion93042.getClass();
                    switch (FrostHunterConstraintSetCloneOmegaHyperion93042.hashCode()) {
                        case -1461280213:
                            if (FrostHunterConstraintSetCloneOmegaHyperion93042.equals("nounderline")) {
                                r10 = false;
                                break;
                            }
                            r10 = -1;
                            break;
                        case -1026963764:
                            if (FrostHunterConstraintSetCloneOmegaHyperion93042.equals("underline")) {
                                r10 = true;
                                break;
                            }
                            r10 = -1;
                            break;
                        case 913457136:
                            if (FrostHunterConstraintSetCloneOmegaHyperion93042.equals("nolinethrough")) {
                                r10 = 2;
                                break;
                            }
                            r10 = -1;
                            break;
                        case 1679736913:
                            if (FrostHunterConstraintSetCloneOmegaHyperion93042.equals("linethrough")) {
                                r10 = 3;
                                break;
                            }
                            r10 = -1;
                            break;
                        default:
                            r10 = -1;
                            break;
                    }
                    switch (r10) {
                        case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                            frostHunterRewardedAdStormEpicAlpha60342 = FrostHunterAlphaAnimationNeoCosmos5761(frostHunterRewardedAdStormEpicAlpha60342);
                            frostHunterRewardedAdStormEpicAlpha60342.FrostHunterRemoteConfigSpeedSpeed8566 = 0;
                            break;
                        case 1:
                            frostHunterRewardedAdStormEpicAlpha60342 = FrostHunterAlphaAnimationNeoCosmos5761(frostHunterRewardedAdStormEpicAlpha60342);
                            frostHunterRewardedAdStormEpicAlpha60342.FrostHunterRemoteConfigSpeedSpeed8566 = 1;
                            break;
                        case 2:
                            frostHunterRewardedAdStormEpicAlpha60342 = FrostHunterAlphaAnimationNeoCosmos5761(frostHunterRewardedAdStormEpicAlpha60342);
                            frostHunterRewardedAdStormEpicAlpha60342.FrostHunterLevelListDrawableFusionDragonHero2232 = 0;
                            break;
                        case 3:
                            frostHunterRewardedAdStormEpicAlpha60342 = FrostHunterAlphaAnimationNeoCosmos5761(frostHunterRewardedAdStormEpicAlpha60342);
                            frostHunterRewardedAdStormEpicAlpha60342.FrostHunterLevelListDrawableFusionDragonHero2232 = 1;
                            break;
                    }
                case FrostHunterRemoteModelManagerCyberLegend2797.STRING_SET_FIELD_NUMBER /* 6 */:
                    frostHunterRewardedAdStormEpicAlpha60342 = FrostHunterAlphaAnimationNeoCosmos5761(frostHunterRewardedAdStormEpicAlpha60342);
                    frostHunterRewardedAdStormEpicAlpha60342.FrostHunterCameraXPixelTurboCosmos9814 = "bold".equalsIgnoreCase(attributeValue) ? 1 : 0;
                    break;
                case FrostHunterRemoteModelManagerCyberLegend2797.DOUBLE_FIELD_NUMBER /* 7 */:
                    if ("style".equals(xmlPullParser.getName())) {
                        frostHunterRewardedAdStormEpicAlpha60342 = FrostHunterAlphaAnimationNeoCosmos5761(frostHunterRewardedAdStormEpicAlpha60342);
                        frostHunterRewardedAdStormEpicAlpha60342.FrostHunterFragmentBetaMegaVortex6025 = attributeValue;
                        break;
                    } else {
                        break;
                    }
                case FrostHunterRemoteModelManagerCyberLegend2797.BYTES_FIELD_NUMBER /* 8 */:
                    String FrostHunterConstraintSetCloneOmegaHyperion93043 = FrostHunterCoroutineNovaXMasterMaster7803.FrostHunterConstraintSetCloneOmegaHyperion9304(attributeValue);
                    FrostHunterConstraintSetCloneOmegaHyperion93043.getClass();
                    switch (FrostHunterConstraintSetCloneOmegaHyperion93043.hashCode()) {
                        case -618561360:
                            if (FrostHunterConstraintSetCloneOmegaHyperion93043.equals("baseContainer")) {
                                c2 = 0;
                                break;
                            }
                            c2 = 65535;
                            break;
                        case -410956671:
                            if (FrostHunterConstraintSetCloneOmegaHyperion93043.equals("container")) {
                                c2 = 1;
                                break;
                            }
                            c2 = 65535;
                            break;
                        case -250518009:
                            if (FrostHunterConstraintSetCloneOmegaHyperion93043.equals("delimiter")) {
                                c2 = 2;
                                break;
                            }
                            c2 = 65535;
                            break;
                        case -136074796:
                            if (FrostHunterConstraintSetCloneOmegaHyperion93043.equals("textContainer")) {
                                c2 = 3;
                                break;
                            }
                            c2 = 65535;
                            break;
                        case 3016401:
                            if (FrostHunterConstraintSetCloneOmegaHyperion93043.equals("base")) {
                                c2 = 4;
                                break;
                            }
                            c2 = 65535;
                            break;
                        case 3556653:
                            if (FrostHunterConstraintSetCloneOmegaHyperion93043.equals("text")) {
                                c2 = 5;
                                break;
                            }
                            c2 = 65535;
                            break;
                        default:
                            c2 = 65535;
                            break;
                    }
                    switch (c2) {
                        case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                        case 4:
                            frostHunterRewardedAdStormEpicAlpha60342 = FrostHunterAlphaAnimationNeoCosmos5761(frostHunterRewardedAdStormEpicAlpha60342);
                            frostHunterRewardedAdStormEpicAlpha60342.FrostHunterServiceConnectionTurboPhoenixOmega6719 = 2;
                            break;
                        case 1:
                            frostHunterRewardedAdStormEpicAlpha60342 = FrostHunterAlphaAnimationNeoCosmos5761(frostHunterRewardedAdStormEpicAlpha60342);
                            frostHunterRewardedAdStormEpicAlpha60342.FrostHunterServiceConnectionTurboPhoenixOmega6719 = 1;
                            break;
                        case 2:
                            frostHunterRewardedAdStormEpicAlpha60342 = FrostHunterAlphaAnimationNeoCosmos5761(frostHunterRewardedAdStormEpicAlpha60342);
                            frostHunterRewardedAdStormEpicAlpha60342.FrostHunterServiceConnectionTurboPhoenixOmega6719 = 4;
                            break;
                        case 3:
                        case FrostHunterRemoteModelManagerCyberLegend2797.STRING_FIELD_NUMBER /* 5 */:
                            frostHunterRewardedAdStormEpicAlpha60342 = FrostHunterAlphaAnimationNeoCosmos5761(frostHunterRewardedAdStormEpicAlpha60342);
                            frostHunterRewardedAdStormEpicAlpha60342.FrostHunterServiceConnectionTurboPhoenixOmega6719 = 3;
                            break;
                    }
                case '\t':
                    frostHunterRewardedAdStormEpicAlpha60342 = FrostHunterAlphaAnimationNeoCosmos5761(frostHunterRewardedAdStormEpicAlpha60342);
                    try {
                        frostHunterRewardedAdStormEpicAlpha60342.FrostHunterConstraintSetCloneMasterUltraRogue2633 = FrostHunterZoomStateMaxEpicSpectra5366.FrostHunterAlphaAnimationNeoCosmos5761(attributeValue, false);
                        frostHunterRewardedAdStormEpicAlpha60342.FrostHunterBundlePulseFusionHero2475 = true;
                        break;
                    } catch (IllegalArgumentException unused) {
                        FrostHunterKeyEventNovaXAlpha1220.FrostHunterBitmapTurboDeltaNebula8743("Failed parsing color value: ", attributeValue);
                        break;
                    }
                case '\n':
                    FrostHunterRewardedAdStormEpicAlpha6034 FrostHunterAlphaAnimationNeoCosmos5761 = FrostHunterAlphaAnimationNeoCosmos5761(frostHunterRewardedAdStormEpicAlpha60342);
                    Matcher matcher = FrostHunterFragmentBetaMegaVortex6025.matcher(attributeValue);
                    float f = Float.MAX_VALUE;
                    if (matcher.matches()) {
                        try {
                            String group = matcher.group(1);
                            group.getClass();
                            f = Math.min(100.0f, Math.max(-100.0f, Float.parseFloat(group)));
                        } catch (NumberFormatException e) {
                            FrostHunterDrawerLayoutUltraStrike3303.FrostHunterColorDrawableLegendPhoenixVision7927("Failed to parse shear: " + attributeValue, e);
                        }
                    } else {
                        FrostHunterKeyEventNovaXAlpha1220.FrostHunterBitmapTurboDeltaNebula8743("Invalid value for shear: ", attributeValue);
                    }
                    FrostHunterAlphaAnimationNeoCosmos5761.FrostHunterResourcesTitanHyperVision5823 = f;
                    frostHunterRewardedAdStormEpicAlpha60342 = FrostHunterAlphaAnimationNeoCosmos5761;
                    break;
                case 11:
                    String FrostHunterConstraintSetCloneOmegaHyperion93044 = FrostHunterCoroutineNovaXMasterMaster7803.FrostHunterConstraintSetCloneOmegaHyperion9304(attributeValue);
                    FrostHunterConstraintSetCloneOmegaHyperion93044.getClass();
                    if (FrostHunterConstraintSetCloneOmegaHyperion93044.equals("all")) {
                        frostHunterRewardedAdStormEpicAlpha60342 = FrostHunterAlphaAnimationNeoCosmos5761(frostHunterRewardedAdStormEpicAlpha60342);
                        frostHunterRewardedAdStormEpicAlpha60342.FrostHunterLintTitanVortexQuantum9911 = 1;
                        break;
                    } else if (FrostHunterConstraintSetCloneOmegaHyperion93044.equals("none")) {
                        frostHunterRewardedAdStormEpicAlpha60342 = FrostHunterAlphaAnimationNeoCosmos5761(frostHunterRewardedAdStormEpicAlpha60342);
                        frostHunterRewardedAdStormEpicAlpha60342.FrostHunterLintTitanVortexQuantum9911 = 0;
                        break;
                    } else {
                        break;
                    }
                case '\f':
                    try {
                        frostHunterRewardedAdStormEpicAlpha60342 = FrostHunterAlphaAnimationNeoCosmos5761(frostHunterRewardedAdStormEpicAlpha60342);
                        FrostHunterServiceEliteCelestialThunder1757(attributeValue, frostHunterRewardedAdStormEpicAlpha60342);
                        break;
                    } catch (FrostHunterBannerAdPulseAlphaShadow4056 unused2) {
                        FrostHunterKeyEventNovaXAlpha1220.FrostHunterBitmapTurboDeltaNebula8743("Failed parsing fontSize value: ", attributeValue);
                        break;
                    }
                case '\r':
                    frostHunterRewardedAdStormEpicAlpha60342 = FrostHunterAlphaAnimationNeoCosmos5761(frostHunterRewardedAdStormEpicAlpha60342);
                    Pattern pattern = FrostHunterMotionEventNovaTitanium8295.FrostHunterServiceEliteCelestialThunder1757;
                    if (attributeValue != null) {
                        String FrostHunterConstraintSetCloneOmegaHyperion93045 = FrostHunterCoroutineNovaXMasterMaster7803.FrostHunterConstraintSetCloneOmegaHyperion9304(attributeValue.trim());
                        if (!FrostHunterConstraintSetCloneOmegaHyperion93045.isEmpty()) {
                            String[] split = TextUtils.split(FrostHunterConstraintSetCloneOmegaHyperion93045, FrostHunterMotionEventNovaTitanium8295.FrostHunterServiceEliteCelestialThunder1757);
                            int length = split.length;
                            FrostHunterDialogVortexMega8716 FrostHunterAlertDialogAuroraDelta32002 = length != 0 ? length != 1 ? FrostHunterDialogVortexMega8716.FrostHunterAlertDialogAuroraDelta3200(split.length, (Object[]) split.clone()) : new FrostHunterLocationManagerSpectraOlympianHyper1306(split[0]) : FrostHunterViewMegaOmega8556.FrostHunterLintTitanVortexQuantum9911;
                            FrostHunterLooperThreadTurboSolar7605 frostHunterLooperThreadTurboSolar7605 = new FrostHunterLooperThreadTurboSolar7605(FrostHunterCoroutineScopeNovaVortexMega5640.FrostHunterRemoteConfigSpeedSpeed8566(FrostHunterMotionEventNovaTitanium8295.FrostHunterCameraXPixelTurboCosmos9814, FrostHunterAlertDialogAuroraDelta32002));
                            String str = (String) (frostHunterLooperThreadTurboSolar7605.hasNext() ? frostHunterLooperThreadTurboSolar7605.next() : "outside");
                            int hashCode2 = str.hashCode();
                            if (hashCode2 != -1392885889) {
                                if (hashCode2 != -1106037339) {
                                    if (hashCode2 == 92734940 && str.equals("after")) {
                                        i = 2;
                                        FrostHunterRemoteConfigSpeedSpeed8566 = FrostHunterCoroutineScopeNovaVortexMega5640.FrostHunterRemoteConfigSpeedSpeed8566(FrostHunterMotionEventNovaTitanium8295.FrostHunterLifecycleBlazeGammaElite2889, FrostHunterAlertDialogAuroraDelta32002);
                                        if (FrostHunterRemoteConfigSpeedSpeed8566.isEmpty()) {
                                            FrostHunterAnalyticsThunderForceLegend3216 FrostHunterRemoteConfigSpeedSpeed85662 = FrostHunterCoroutineScopeNovaVortexMega5640.FrostHunterRemoteConfigSpeedSpeed8566(FrostHunterMotionEventNovaTitanium8295.FrostHunterRemoteConfigSpeedSpeed8566, FrostHunterAlertDialogAuroraDelta32002);
                                            FrostHunterAnalyticsThunderForceLegend3216 FrostHunterRemoteConfigSpeedSpeed85663 = FrostHunterCoroutineScopeNovaVortexMega5640.FrostHunterRemoteConfigSpeedSpeed8566(FrostHunterMotionEventNovaTitanium8295.FrostHunterLevelListDrawableFusionDragonHero2232, FrostHunterAlertDialogAuroraDelta32002);
                                            if (FrostHunterRemoteConfigSpeedSpeed85662.isEmpty() && FrostHunterRemoteConfigSpeedSpeed85663.isEmpty()) {
                                                frostHunterMotionEventNovaTitanium8295 = new FrostHunterMotionEventNovaTitanium8295(-1, 0, i);
                                            } else {
                                                FrostHunterLooperThreadTurboSolar7605 frostHunterLooperThreadTurboSolar76052 = new FrostHunterLooperThreadTurboSolar7605(FrostHunterRemoteConfigSpeedSpeed85662);
                                                String str2 = (String) (frostHunterLooperThreadTurboSolar76052.hasNext() ? frostHunterLooperThreadTurboSolar76052.next() : "filled");
                                                int hashCode3 = str2.hashCode();
                                                if (hashCode3 == -1274499742) {
                                                    str2.equals("filled");
                                                } else if (hashCode3 == 3417674 && str2.equals("open")) {
                                                    i2 = 2;
                                                    FrostHunterLooperThreadTurboSolar7605 frostHunterLooperThreadTurboSolar76053 = new FrostHunterLooperThreadTurboSolar7605(FrostHunterRemoteConfigSpeedSpeed85663);
                                                    String str3 = (String) (!frostHunterLooperThreadTurboSolar76053.hasNext() ? frostHunterLooperThreadTurboSolar76053.next() : "circle");
                                                    hashCode = str3.hashCode();
                                                    if (hashCode != -1360216880) {
                                                        str3.equals("circle");
                                                    } else if (hashCode != -905816648) {
                                                        if (hashCode == 99657 && str3.equals("dot")) {
                                                            i3 = 2;
                                                            frostHunterMotionEventNovaTitanium8295 = new FrostHunterMotionEventNovaTitanium8295(i3, i2, i);
                                                        }
                                                    } else if (str3.equals("sesame")) {
                                                        i3 = 3;
                                                        frostHunterMotionEventNovaTitanium8295 = new FrostHunterMotionEventNovaTitanium8295(i3, i2, i);
                                                    }
                                                    i3 = 1;
                                                    frostHunterMotionEventNovaTitanium8295 = new FrostHunterMotionEventNovaTitanium8295(i3, i2, i);
                                                }
                                                i2 = 1;
                                                FrostHunterLooperThreadTurboSolar7605 frostHunterLooperThreadTurboSolar760532 = new FrostHunterLooperThreadTurboSolar7605(FrostHunterRemoteConfigSpeedSpeed85663);
                                                String str32 = (String) (!frostHunterLooperThreadTurboSolar760532.hasNext() ? frostHunterLooperThreadTurboSolar760532.next() : "circle");
                                                hashCode = str32.hashCode();
                                                if (hashCode != -1360216880) {
                                                }
                                                i3 = 1;
                                                frostHunterMotionEventNovaTitanium8295 = new FrostHunterMotionEventNovaTitanium8295(i3, i2, i);
                                            }
                                        } else {
                                            String str4 = (String) new FrostHunterLooperThreadTurboSolar7605(FrostHunterRemoteConfigSpeedSpeed8566).next();
                                            int hashCode4 = str4.hashCode();
                                            if (hashCode4 == 3005871) {
                                                str4.equals("auto");
                                            } else if (hashCode4 == 3387192 && str4.equals("none")) {
                                                i4 = 0;
                                                frostHunterMotionEventNovaTitanium8295 = new FrostHunterMotionEventNovaTitanium8295(i4, 0, i);
                                            }
                                            i4 = -1;
                                            frostHunterMotionEventNovaTitanium8295 = new FrostHunterMotionEventNovaTitanium8295(i4, 0, i);
                                        }
                                    }
                                } else if (str.equals("outside")) {
                                    i = -2;
                                    FrostHunterRemoteConfigSpeedSpeed8566 = FrostHunterCoroutineScopeNovaVortexMega5640.FrostHunterRemoteConfigSpeedSpeed8566(FrostHunterMotionEventNovaTitanium8295.FrostHunterLifecycleBlazeGammaElite2889, FrostHunterAlertDialogAuroraDelta32002);
                                    if (FrostHunterRemoteConfigSpeedSpeed8566.isEmpty()) {
                                    }
                                }
                                frostHunterRewardedAdStormEpicAlpha60342.FrostHunterCameraXTurboCelestialHero5430 = frostHunterMotionEventNovaTitanium8295;
                                break;
                            } else {
                                str.equals("before");
                            }
                            i = 1;
                            FrostHunterRemoteConfigSpeedSpeed8566 = FrostHunterCoroutineScopeNovaVortexMega5640.FrostHunterRemoteConfigSpeedSpeed8566(FrostHunterMotionEventNovaTitanium8295.FrostHunterLifecycleBlazeGammaElite2889, FrostHunterAlertDialogAuroraDelta32002);
                            if (FrostHunterRemoteConfigSpeedSpeed8566.isEmpty()) {
                            }
                            frostHunterRewardedAdStormEpicAlpha60342.FrostHunterCameraXTurboCelestialHero5430 = frostHunterMotionEventNovaTitanium8295;
                        }
                    }
                    frostHunterMotionEventNovaTitanium8295 = null;
                    frostHunterRewardedAdStormEpicAlpha60342.FrostHunterCameraXTurboCelestialHero5430 = frostHunterMotionEventNovaTitanium8295;
                    break;
                case 14:
                    String FrostHunterConstraintSetCloneOmegaHyperion93046 = FrostHunterCoroutineNovaXMasterMaster7803.FrostHunterConstraintSetCloneOmegaHyperion9304(attributeValue);
                    FrostHunterConstraintSetCloneOmegaHyperion93046.getClass();
                    if (FrostHunterConstraintSetCloneOmegaHyperion93046.equals("before")) {
                        frostHunterRewardedAdStormEpicAlpha60342 = FrostHunterAlphaAnimationNeoCosmos5761(frostHunterRewardedAdStormEpicAlpha60342);
                        frostHunterRewardedAdStormEpicAlpha60342.FrostHunterLightSensorForceFusion4241 = 1;
                        break;
                    } else if (FrostHunterConstraintSetCloneOmegaHyperion93046.equals("after")) {
                        frostHunterRewardedAdStormEpicAlpha60342 = FrostHunterAlphaAnimationNeoCosmos5761(frostHunterRewardedAdStormEpicAlpha60342);
                        frostHunterRewardedAdStormEpicAlpha60342.FrostHunterLightSensorForceFusion4241 = 2;
                        break;
                    } else {
                        break;
                    }
                case 15:
                    frostHunterRewardedAdStormEpicAlpha60342 = FrostHunterAlphaAnimationNeoCosmos5761(frostHunterRewardedAdStormEpicAlpha60342);
                    try {
                        frostHunterRewardedAdStormEpicAlpha60342.FrostHunterServiceEliteCelestialThunder1757 = FrostHunterZoomStateMaxEpicSpectra5366.FrostHunterAlphaAnimationNeoCosmos5761(attributeValue, false);
                        frostHunterRewardedAdStormEpicAlpha60342.FrostHunterLifecycleBlazeGammaElite2889 = true;
                        break;
                    } catch (IllegalArgumentException unused3) {
                        FrostHunterKeyEventNovaXAlpha1220.FrostHunterBitmapTurboDeltaNebula8743("Failed parsing background value: ", attributeValue);
                        break;
                    }
                case 16:
                    frostHunterRewardedAdStormEpicAlpha60342 = FrostHunterAlphaAnimationNeoCosmos5761(frostHunterRewardedAdStormEpicAlpha60342);
                    String FrostHunterConstraintSetCloneOmegaHyperion93047 = FrostHunterCoroutineNovaXMasterMaster7803.FrostHunterConstraintSetCloneOmegaHyperion9304(attributeValue);
                    FrostHunterConstraintSetCloneOmegaHyperion93047.getClass();
                    switch (FrostHunterConstraintSetCloneOmegaHyperion93047.hashCode()) {
                        case -1364013995:
                            if (FrostHunterConstraintSetCloneOmegaHyperion93047.equals("center")) {
                                c3 = 0;
                                break;
                            }
                            c3 = 65535;
                            break;
                        case 100571:
                            if (FrostHunterConstraintSetCloneOmegaHyperion93047.equals("end")) {
                                c3 = 1;
                                break;
                            }
                            c3 = 65535;
                            break;
                        case 3317767:
                            if (FrostHunterConstraintSetCloneOmegaHyperion93047.equals("left")) {
                                c3 = 2;
                                break;
                            }
                            c3 = 65535;
                            break;
                        case 108511772:
                            if (FrostHunterConstraintSetCloneOmegaHyperion93047.equals("right")) {
                                c3 = 3;
                                break;
                            }
                            c3 = 65535;
                            break;
                        case 109757538:
                            if (FrostHunterConstraintSetCloneOmegaHyperion93047.equals("start")) {
                                c3 = 4;
                                break;
                            }
                            c3 = 65535;
                            break;
                        default:
                            c3 = 65535;
                            break;
                    }
                    switch (c3) {
                        case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                            alignment = Layout.Alignment.ALIGN_CENTER;
                            break;
                        case 1:
                        case 3:
                            alignment = Layout.Alignment.ALIGN_OPPOSITE;
                            break;
                        case 2:
                        case 4:
                            alignment = Layout.Alignment.ALIGN_NORMAL;
                            break;
                    }
                    frostHunterRewardedAdStormEpicAlpha60342.FrostHunterFirebaseModelDownloadConditionsSolarBlaze2223 = alignment;
                    break;
            }
        }
        return frostHunterRewardedAdStormEpicAlpha60342;
    }

    public static boolean FrostHunterConstraintSetCloneMasterUltraRogue2633(String str) {
        return str.equals("tt") || str.equals("head") || str.equals("body") || str.equals("div") || str.equals("p") || str.equals("span") || str.equals("br") || str.equals("style") || str.equals("styling") || str.equals("layout") || str.equals("region") || str.equals("metadata") || str.equals("image") || str.equals("data") || str.equals("information");
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x00aa, code lost:
    
        if (r13.equals("ms") == false) goto L21;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static long FrostHunterFlowMaxDragonHero5809(String str, FrostHunterLooperForceUltraTitan3193 frostHunterLooperForceUltraTitan3193) {
        double d;
        double d2;
        Matcher matcher = FrostHunterFlowMaxDragonHero5809.matcher(str);
        char c = 4;
        if (matcher.matches()) {
            String group = matcher.group(1);
            group.getClass();
            double parseLong = Long.parseLong(group) * 3600;
            matcher.group(2).getClass();
            double parseLong2 = parseLong + (Long.parseLong(r13) * 60);
            matcher.group(3).getClass();
            double parseLong3 = parseLong2 + Long.parseLong(r13);
            String group2 = matcher.group(4);
            return (long) ((parseLong3 + (group2 != null ? Double.parseDouble(group2) : 0.0d) + (matcher.group(5) != null ? Long.parseLong(r13) / frostHunterLooperForceUltraTitan3193.FrostHunterAlphaAnimationNeoCosmos5761 : 0.0d) + (matcher.group(6) != null ? (Long.parseLong(r13) / frostHunterLooperForceUltraTitan3193.FrostHunterConstraintSetCloneMasterUltraRogue2633) / frostHunterLooperForceUltraTitan3193.FrostHunterAlphaAnimationNeoCosmos5761 : 0.0d)) * 1000000.0d);
        }
        Matcher matcher2 = FrostHunterAlertDialogAuroraDelta3200.matcher(str);
        if (!matcher2.matches()) {
            throw new FrostHunterBannerAdPulseAlphaShadow4056("Malformed time expression: " + str);
        }
        String group3 = matcher2.group(1);
        group3.getClass();
        double parseDouble = Double.parseDouble(group3);
        String group4 = matcher2.group(2);
        group4.getClass();
        switch (group4.hashCode()) {
            case 102:
                if (group4.equals("f")) {
                    c = 0;
                    break;
                }
                c = 65535;
                break;
            case 104:
                if (group4.equals("h")) {
                    c = 1;
                    break;
                }
                c = 65535;
                break;
            case 109:
                if (group4.equals("m")) {
                    c = 2;
                    break;
                }
                c = 65535;
                break;
            case 116:
                if (group4.equals("t")) {
                    c = 3;
                    break;
                }
                c = 65535;
                break;
            case 3494:
                break;
            default:
                c = 65535;
                break;
        }
        switch (c) {
            case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                d = frostHunterLooperForceUltraTitan3193.FrostHunterAlphaAnimationNeoCosmos5761;
                parseDouble /= d;
                break;
            case 1:
                d2 = 3600.0d;
                break;
            case 2:
                d2 = 60.0d;
                break;
            case 3:
                d = frostHunterLooperForceUltraTitan3193.FrostHunterBundlePulseFusionHero2475;
                parseDouble /= d;
                break;
            case 4:
                d = 1000.0d;
                parseDouble /= d;
                break;
        }
        parseDouble *= d2;
        return (long) (parseDouble * 1000000.0d);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Removed duplicated region for block: B:32:0x021a  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x01cb  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static void FrostHunterLevelListDrawableFusionDragonHero2232(XmlPullParser xmlPullParser, HashMap hashMap, int i, FrostHunterViewModelTitanPhoenixCelestial3010 frostHunterViewModelTitanPhoenixCelestial3010, HashMap hashMap2, HashMap hashMap3) {
        String FrostHunterConstraintSetCloneMasterUltraRogue2633;
        float f;
        float f2;
        float f3;
        float f4;
        float f5;
        int i2;
        String FrostHunterConstraintSetCloneMasterUltraRogue26332;
        int i3;
        FrostHunterCountDownTimerInfernoOlympian9514 frostHunterCountDownTimerInfernoOlympian9514;
        char c;
        float parseFloat;
        float parseFloat2;
        String FrostHunterConstraintSetCloneMasterUltraRogue26333;
        FrostHunterRewardedAdStormEpicAlpha6034 frostHunterRewardedAdStormEpicAlpha6034;
        String FrostHunterConstraintSetCloneMasterUltraRogue26334;
        FrostHunterRewardedAdStormEpicAlpha6034 frostHunterRewardedAdStormEpicAlpha60342;
        String[] split;
        do {
            xmlPullParser.next();
            if (FrostHunterCardViewLegendUltra9902.FrostHunterLifecycleBlazeGammaElite2889(xmlPullParser, "style")) {
                String FrostHunterConstraintSetCloneMasterUltraRogue26335 = FrostHunterCardViewLegendUltra9902.FrostHunterConstraintSetCloneMasterUltraRogue2633(xmlPullParser, "style");
                FrostHunterRewardedAdStormEpicAlpha6034 FrostHunterCameraXPixelTurboCosmos9814 = FrostHunterCameraXPixelTurboCosmos9814(xmlPullParser, new FrostHunterRewardedAdStormEpicAlpha6034());
                if (FrostHunterConstraintSetCloneMasterUltraRogue26335 != null) {
                    String trim = FrostHunterConstraintSetCloneMasterUltraRogue26335.trim();
                    if (trim.isEmpty()) {
                        split = new String[0];
                    } else {
                        String str = FrostHunterGyroscopeHeroAlpha1995.FrostHunterAlphaAnimationNeoCosmos5761;
                        split = trim.split("\\s+", -1);
                    }
                    for (String str2 : split) {
                        FrostHunterCameraXPixelTurboCosmos9814.FrostHunterAlphaAnimationNeoCosmos5761((FrostHunterRewardedAdStormEpicAlpha6034) hashMap.get(str2));
                    }
                }
                String str3 = FrostHunterCameraXPixelTurboCosmos9814.FrostHunterFragmentBetaMegaVortex6025;
                if (str3 != null) {
                    hashMap.put(str3, FrostHunterCameraXPixelTurboCosmos9814);
                }
            } else if (FrostHunterCardViewLegendUltra9902.FrostHunterLifecycleBlazeGammaElite2889(xmlPullParser, "region")) {
                String FrostHunterConstraintSetCloneMasterUltraRogue26336 = FrostHunterCardViewLegendUltra9902.FrostHunterConstraintSetCloneMasterUltraRogue2633(xmlPullParser, "id");
                if (FrostHunterConstraintSetCloneMasterUltraRogue26336 != null) {
                    String FrostHunterConstraintSetCloneMasterUltraRogue26337 = FrostHunterCardViewLegendUltra9902.FrostHunterConstraintSetCloneMasterUltraRogue2633(xmlPullParser, "origin");
                    if (FrostHunterConstraintSetCloneMasterUltraRogue26337 == null && (FrostHunterConstraintSetCloneMasterUltraRogue26334 = FrostHunterCardViewLegendUltra9902.FrostHunterConstraintSetCloneMasterUltraRogue2633(xmlPullParser, "style")) != null && (frostHunterRewardedAdStormEpicAlpha60342 = (FrostHunterRewardedAdStormEpicAlpha6034) hashMap.get(FrostHunterConstraintSetCloneMasterUltraRogue26334)) != null) {
                        FrostHunterConstraintSetCloneMasterUltraRogue26337 = frostHunterRewardedAdStormEpicAlpha60342.FrostHunterTextViewDragonStormMega4297;
                    }
                    int i4 = 2;
                    Pattern pattern = FrostHunterLightSensorForceFusion4241;
                    Pattern pattern2 = FrostHunterServiceConnectionTurboPhoenixOmega6719;
                    if (FrostHunterConstraintSetCloneMasterUltraRogue26337 != null) {
                        Matcher matcher = pattern2.matcher(FrostHunterConstraintSetCloneMasterUltraRogue26337);
                        Matcher matcher2 = pattern.matcher(FrostHunterConstraintSetCloneMasterUltraRogue26337);
                        if (matcher.matches()) {
                            try {
                                String group = matcher.group(1);
                                group.getClass();
                                f = Float.parseFloat(group) / 100.0f;
                                String group2 = matcher.group(2);
                                group2.getClass();
                                f2 = Float.parseFloat(group2) / 100.0f;
                            } catch (NumberFormatException unused) {
                                FrostHunterDrawerLayoutUltraStrike3303.FrostHunterColorStateListInflaterNovaQuantum4229("Ignoring region with malformed origin: ".concat(FrostHunterConstraintSetCloneMasterUltraRogue26337));
                            }
                        } else if (!matcher2.matches()) {
                            FrostHunterDrawerLayoutUltraStrike3303.FrostHunterColorStateListInflaterNovaQuantum4229("Ignoring region with unsupported origin: ".concat(FrostHunterConstraintSetCloneMasterUltraRogue26337));
                        } else if (frostHunterViewModelTitanPhoenixCelestial3010 == null) {
                            FrostHunterDrawerLayoutUltraStrike3303.FrostHunterColorStateListInflaterNovaQuantum4229("Ignoring region with missing tts:extent: ".concat(FrostHunterConstraintSetCloneMasterUltraRogue26337));
                        } else {
                            try {
                                String group3 = matcher2.group(1);
                                group3.getClass();
                                int parseInt = Integer.parseInt(group3);
                                String group4 = matcher2.group(2);
                                group4.getClass();
                                float f6 = parseInt / frostHunterViewModelTitanPhoenixCelestial3010.FrostHunterAlphaAnimationNeoCosmos5761;
                                f2 = Integer.parseInt(group4) / frostHunterViewModelTitanPhoenixCelestial3010.FrostHunterConstraintSetCloneMasterUltraRogue2633;
                                f = f6;
                            } catch (NumberFormatException unused2) {
                                FrostHunterDrawerLayoutUltraStrike3303.FrostHunterColorStateListInflaterNovaQuantum4229("Ignoring region with malformed origin: ".concat(FrostHunterConstraintSetCloneMasterUltraRogue26337));
                            }
                        }
                    } else {
                        f = 0.0f;
                        f2 = 0.0f;
                    }
                    String FrostHunterConstraintSetCloneMasterUltraRogue26338 = FrostHunterCardViewLegendUltra9902.FrostHunterConstraintSetCloneMasterUltraRogue2633(xmlPullParser, "extent");
                    if (FrostHunterConstraintSetCloneMasterUltraRogue26338 == null && (FrostHunterConstraintSetCloneMasterUltraRogue26333 = FrostHunterCardViewLegendUltra9902.FrostHunterConstraintSetCloneMasterUltraRogue2633(xmlPullParser, "style")) != null && (frostHunterRewardedAdStormEpicAlpha6034 = (FrostHunterRewardedAdStormEpicAlpha6034) hashMap.get(FrostHunterConstraintSetCloneMasterUltraRogue26333)) != null) {
                        FrostHunterConstraintSetCloneMasterUltraRogue26338 = frostHunterRewardedAdStormEpicAlpha6034.FrostHunterLooperThreadBetaHyperionMax1000;
                    }
                    if (FrostHunterConstraintSetCloneMasterUltraRogue26338 != null) {
                        Matcher matcher3 = pattern2.matcher(FrostHunterConstraintSetCloneMasterUltraRogue26338);
                        Matcher matcher4 = pattern.matcher(FrostHunterConstraintSetCloneMasterUltraRogue26338);
                        if (matcher3.matches()) {
                            try {
                                String group5 = matcher3.group(1);
                                group5.getClass();
                                parseFloat = Float.parseFloat(group5) / 100.0f;
                                String group6 = matcher3.group(2);
                                group6.getClass();
                                parseFloat2 = Float.parseFloat(group6) / 100.0f;
                            } catch (NumberFormatException unused3) {
                                FrostHunterKeyEventNovaXAlpha1220.FrostHunterBitmapTurboDeltaNebula8743("Ignoring region with malformed extent: ", FrostHunterConstraintSetCloneMasterUltraRogue26337);
                            }
                        } else if (!matcher4.matches()) {
                            FrostHunterKeyEventNovaXAlpha1220.FrostHunterBitmapTurboDeltaNebula8743("Ignoring region with unsupported extent: ", FrostHunterConstraintSetCloneMasterUltraRogue26337);
                        } else if (frostHunterViewModelTitanPhoenixCelestial3010 == null) {
                            FrostHunterKeyEventNovaXAlpha1220.FrostHunterBitmapTurboDeltaNebula8743("Ignoring region with missing tts:extent: ", FrostHunterConstraintSetCloneMasterUltraRogue26337);
                        } else {
                            String group7 = matcher4.group(1);
                            group7.getClass();
                            int parseInt2 = Integer.parseInt(group7);
                            String group8 = matcher4.group(2);
                            group8.getClass();
                            float f7 = parseInt2 / frostHunterViewModelTitanPhoenixCelestial3010.FrostHunterAlphaAnimationNeoCosmos5761;
                            parseFloat2 = Integer.parseInt(group8) / frostHunterViewModelTitanPhoenixCelestial3010.FrostHunterConstraintSetCloneMasterUltraRogue2633;
                            parseFloat = f7;
                        }
                        f3 = parseFloat;
                        f4 = parseFloat2;
                    } else {
                        f3 = 1.0f;
                        f4 = 1.0f;
                    }
                    String FrostHunterConstraintSetCloneMasterUltraRogue26339 = FrostHunterCardViewLegendUltra9902.FrostHunterConstraintSetCloneMasterUltraRogue2633(xmlPullParser, "displayAlign");
                    if (FrostHunterConstraintSetCloneMasterUltraRogue26339 != null) {
                        String FrostHunterConstraintSetCloneOmegaHyperion9304 = FrostHunterCoroutineNovaXMasterMaster7803.FrostHunterConstraintSetCloneOmegaHyperion9304(FrostHunterConstraintSetCloneMasterUltraRogue26339);
                        FrostHunterConstraintSetCloneOmegaHyperion9304.getClass();
                        if (FrostHunterConstraintSetCloneOmegaHyperion9304.equals("center")) {
                            f5 = f2 + (f4 / 2.0f);
                            i2 = 1;
                        } else if (FrostHunterConstraintSetCloneOmegaHyperion9304.equals("after")) {
                            f5 = f2 + f4;
                            i2 = 2;
                        }
                        float f8 = 1.0f / i;
                        FrostHunterConstraintSetCloneMasterUltraRogue26332 = FrostHunterCardViewLegendUltra9902.FrostHunterConstraintSetCloneMasterUltraRogue2633(xmlPullParser, "writingMode");
                        if (FrostHunterConstraintSetCloneMasterUltraRogue26332 != null) {
                            String FrostHunterConstraintSetCloneOmegaHyperion93042 = FrostHunterCoroutineNovaXMasterMaster7803.FrostHunterConstraintSetCloneOmegaHyperion9304(FrostHunterConstraintSetCloneMasterUltraRogue26332);
                            FrostHunterConstraintSetCloneOmegaHyperion93042.getClass();
                            switch (FrostHunterConstraintSetCloneOmegaHyperion93042.hashCode()) {
                                case 3694:
                                    if (FrostHunterConstraintSetCloneOmegaHyperion93042.equals("tb")) {
                                        c = 0;
                                        break;
                                    }
                                    c = 65535;
                                    break;
                                case 3553396:
                                    if (FrostHunterConstraintSetCloneOmegaHyperion93042.equals("tblr")) {
                                        c = 1;
                                        break;
                                    }
                                    c = 65535;
                                    break;
                                case 3553576:
                                    if (FrostHunterConstraintSetCloneOmegaHyperion93042.equals("tbrl")) {
                                        c = 2;
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
                                    i3 = i4;
                                    break;
                                case 2:
                                    i3 = 1;
                                    break;
                            }
                            frostHunterCountDownTimerInfernoOlympian9514 = new FrostHunterCountDownTimerInfernoOlympian9514(FrostHunterConstraintSetCloneMasterUltraRogue26336, f, f5, 0, i2, f3, f4, 1, f8, i3);
                            if (frostHunterCountDownTimerInfernoOlympian9514 != null) {
                                hashMap2.put(frostHunterCountDownTimerInfernoOlympian9514.FrostHunterAlphaAnimationNeoCosmos5761, frostHunterCountDownTimerInfernoOlympian9514);
                            }
                        }
                        i4 = Integer.MIN_VALUE;
                        i3 = i4;
                        frostHunterCountDownTimerInfernoOlympian9514 = new FrostHunterCountDownTimerInfernoOlympian9514(FrostHunterConstraintSetCloneMasterUltraRogue26336, f, f5, 0, i2, f3, f4, 1, f8, i3);
                        if (frostHunterCountDownTimerInfernoOlympian9514 != null) {
                        }
                    }
                    f5 = f2;
                    i2 = 0;
                    float f82 = 1.0f / i;
                    FrostHunterConstraintSetCloneMasterUltraRogue26332 = FrostHunterCardViewLegendUltra9902.FrostHunterConstraintSetCloneMasterUltraRogue2633(xmlPullParser, "writingMode");
                    if (FrostHunterConstraintSetCloneMasterUltraRogue26332 != null) {
                    }
                    i4 = Integer.MIN_VALUE;
                    i3 = i4;
                    frostHunterCountDownTimerInfernoOlympian9514 = new FrostHunterCountDownTimerInfernoOlympian9514(FrostHunterConstraintSetCloneMasterUltraRogue26336, f, f5, 0, i2, f3, f4, 1, f82, i3);
                    if (frostHunterCountDownTimerInfernoOlympian9514 != null) {
                    }
                }
                frostHunterCountDownTimerInfernoOlympian9514 = null;
                if (frostHunterCountDownTimerInfernoOlympian9514 != null) {
                }
            } else if (FrostHunterCardViewLegendUltra9902.FrostHunterLifecycleBlazeGammaElite2889(xmlPullParser, "metadata")) {
                do {
                    xmlPullParser.next();
                    if (FrostHunterCardViewLegendUltra9902.FrostHunterLifecycleBlazeGammaElite2889(xmlPullParser, "image") && (FrostHunterConstraintSetCloneMasterUltraRogue2633 = FrostHunterCardViewLegendUltra9902.FrostHunterConstraintSetCloneMasterUltraRogue2633(xmlPullParser, "id")) != null) {
                        hashMap3.put(FrostHunterConstraintSetCloneMasterUltraRogue2633, xmlPullParser.nextText());
                    }
                } while (!FrostHunterCardViewLegendUltra9902.FrostHunterServiceEliteCelestialThunder1757(xmlPullParser, "metadata"));
            }
        } while (!FrostHunterCardViewLegendUltra9902.FrostHunterServiceEliteCelestialThunder1757(xmlPullParser, "head"));
    }

    public static FrostHunterLooperForceUltraTitan3193 FrostHunterLifecycleBlazeGammaElite2889(XmlPullParser xmlPullParser) {
        float f;
        String attributeValue = xmlPullParser.getAttributeValue("http://www.w3.org/ns/ttml#parameter", "frameRate");
        int parseInt = attributeValue != null ? Integer.parseInt(attributeValue) : 30;
        String attributeValue2 = xmlPullParser.getAttributeValue("http://www.w3.org/ns/ttml#parameter", "frameRateMultiplier");
        if (attributeValue2 != null) {
            String str = FrostHunterGyroscopeHeroAlpha1995.FrostHunterAlphaAnimationNeoCosmos5761;
            FrostHunterCanvasInfernoVortex4700.FrostHunterCameraXTurboCelestialHero5430("frameRateMultiplier doesn't have 2 parts", attributeValue2.split(" ", -1).length == 2);
            f = Integer.parseInt(r2[0]) / Integer.parseInt(r2[1]);
        } else {
            f = 1.0f;
        }
        FrostHunterLooperForceUltraTitan3193 frostHunterLooperForceUltraTitan3193 = FrostHunterFirebaseModelDownloadConditionsSolarBlaze2223;
        int i = frostHunterLooperForceUltraTitan3193.FrostHunterConstraintSetCloneMasterUltraRogue2633;
        String attributeValue3 = xmlPullParser.getAttributeValue("http://www.w3.org/ns/ttml#parameter", "subFrameRate");
        if (attributeValue3 != null) {
            i = Integer.parseInt(attributeValue3);
        }
        int i2 = frostHunterLooperForceUltraTitan3193.FrostHunterBundlePulseFusionHero2475;
        String attributeValue4 = xmlPullParser.getAttributeValue("http://www.w3.org/ns/ttml#parameter", "tickRate");
        if (attributeValue4 != null) {
            i2 = Integer.parseInt(attributeValue4);
        }
        return new FrostHunterLooperForceUltraTitan3193(parseInt * f, i, i2);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    public static FrostHunterLayerMegaSpeedOlympian6070 FrostHunterRemoteConfigSpeedSpeed8566(XmlPullParser xmlPullParser, FrostHunterLayerMegaSpeedOlympian6070 frostHunterLayerMegaSpeedOlympian6070, HashMap hashMap, FrostHunterLooperForceUltraTitan3193 frostHunterLooperForceUltraTitan3193) {
        long j;
        char c;
        String[] split;
        int attributeCount = xmlPullParser.getAttributeCount();
        String[] strArr = null;
        FrostHunterRewardedAdStormEpicAlpha6034 FrostHunterCameraXPixelTurboCosmos9814 = FrostHunterCameraXPixelTurboCosmos9814(xmlPullParser, null);
        String str = null;
        String str2 = "";
        long j2 = -9223372036854775807L;
        long j3 = -9223372036854775807L;
        long j4 = -9223372036854775807L;
        for (int i = 0; i < attributeCount; i++) {
            String attributeName = xmlPullParser.getAttributeName(i);
            String attributeValue = xmlPullParser.getAttributeValue(i);
            attributeName.getClass();
            switch (attributeName.hashCode()) {
                case -934795532:
                    if (attributeName.equals("region")) {
                        c = 0;
                        break;
                    }
                    c = 65535;
                    break;
                case 99841:
                    if (attributeName.equals("dur")) {
                        c = 1;
                        break;
                    }
                    c = 65535;
                    break;
                case 100571:
                    if (attributeName.equals("end")) {
                        c = 2;
                        break;
                    }
                    c = 65535;
                    break;
                case 93616297:
                    if (attributeName.equals("begin")) {
                        c = 3;
                        break;
                    }
                    c = 65535;
                    break;
                case 109780401:
                    if (attributeName.equals("style")) {
                        c = 4;
                        break;
                    }
                    c = 65535;
                    break;
                case 1292595405:
                    if (attributeName.equals("backgroundImage")) {
                        c = 5;
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
                    if (!hashMap.containsKey(attributeValue)) {
                        break;
                    } else {
                        str2 = attributeValue;
                        continue;
                    }
                case 1:
                    j4 = FrostHunterFlowMaxDragonHero5809(attributeValue, frostHunterLooperForceUltraTitan3193);
                    break;
                case 2:
                    j3 = FrostHunterFlowMaxDragonHero5809(attributeValue, frostHunterLooperForceUltraTitan3193);
                    break;
                case 3:
                    j2 = FrostHunterFlowMaxDragonHero5809(attributeValue, frostHunterLooperForceUltraTitan3193);
                    break;
                case 4:
                    String trim = attributeValue.trim();
                    if (trim.isEmpty()) {
                        split = new String[0];
                    } else {
                        String str3 = FrostHunterGyroscopeHeroAlpha1995.FrostHunterAlphaAnimationNeoCosmos5761;
                        split = trim.split("\\s+", -1);
                    }
                    if (split.length > 0) {
                        strArr = split;
                        break;
                    }
                    break;
                case FrostHunterRemoteModelManagerCyberLegend2797.STRING_FIELD_NUMBER /* 5 */:
                    if (attributeValue.startsWith("#")) {
                        str = attributeValue.substring(1);
                        break;
                    }
                    break;
            }
        }
        if (frostHunterLayerMegaSpeedOlympian6070 != null) {
            long j5 = frostHunterLayerMegaSpeedOlympian6070.FrostHunterServiceEliteCelestialThunder1757;
            if (j5 != -9223372036854775807L) {
                if (j2 != -9223372036854775807L) {
                    j2 += j5;
                }
                if (j3 != -9223372036854775807L) {
                    j3 += j5;
                }
            }
        }
        if (j3 == -9223372036854775807L) {
            if (j4 != -9223372036854775807L) {
                j3 = j2 + j4;
            } else if (frostHunterLayerMegaSpeedOlympian6070 != null) {
                long j6 = frostHunterLayerMegaSpeedOlympian6070.FrostHunterLifecycleBlazeGammaElite2889;
                if (j6 != -9223372036854775807L) {
                    j = j6;
                    return new FrostHunterLayerMegaSpeedOlympian6070(xmlPullParser.getName(), null, j2, j, FrostHunterCameraXPixelTurboCosmos9814, strArr, str2, str, frostHunterLayerMegaSpeedOlympian6070);
                }
            }
        }
        j = j3;
        return new FrostHunterLayerMegaSpeedOlympian6070(xmlPullParser.getName(), null, j2, j, FrostHunterCameraXPixelTurboCosmos9814, strArr, str2, str, frostHunterLayerMegaSpeedOlympian6070);
    }

    public static void FrostHunterServiceEliteCelestialThunder1757(String str, FrostHunterRewardedAdStormEpicAlpha6034 frostHunterRewardedAdStormEpicAlpha6034) {
        Matcher matcher;
        String group;
        String str2 = FrostHunterGyroscopeHeroAlpha1995.FrostHunterAlphaAnimationNeoCosmos5761;
        String[] split = str.split("\\s+", -1);
        int length = split.length;
        Pattern pattern = FrostHunterKeyframeGammaGamma1197;
        if (length == 1) {
            matcher = pattern.matcher(str);
        } else {
            if (split.length != 2) {
                throw new FrostHunterBannerAdPulseAlphaShadow4056("Invalid number of entries for fontSize: " + split.length + ".");
            }
            matcher = pattern.matcher(split[1]);
            FrostHunterDrawerLayoutUltraStrike3303.FrostHunterColorStateListInflaterNovaQuantum4229("Multiple values in fontSize attribute. Picking the second value for vertical font size and ignoring the first.");
        }
        if (!matcher.matches()) {
            throw new FrostHunterBannerAdPulseAlphaShadow4056(FrostHunterKeyEventNovaXAlpha1220.FrostHunterKeyframeGammaGamma1197("Invalid expression for fontSize: '", str, "'."));
        }
        group = matcher.group(3);
        group.getClass();
        switch (group) {
            case "%":
                frostHunterRewardedAdStormEpicAlpha6034.FrostHunterAlertDialogAuroraDelta3200 = 3;
                break;
            case "em":
                frostHunterRewardedAdStormEpicAlpha6034.FrostHunterAlertDialogAuroraDelta3200 = 2;
                break;
            case "px":
                frostHunterRewardedAdStormEpicAlpha6034.FrostHunterAlertDialogAuroraDelta3200 = 1;
                break;
            default:
                throw new FrostHunterBannerAdPulseAlphaShadow4056(FrostHunterKeyEventNovaXAlpha1220.FrostHunterKeyframeGammaGamma1197("Invalid unit for fontSize: '", group, "'."));
        }
        String group2 = matcher.group(1);
        group2.getClass();
        frostHunterRewardedAdStormEpicAlpha6034.FrostHunterKeyframeGammaGamma1197 = Float.parseFloat(group2);
    }

    @Override // android.content.Context.FrostHunterActionBarHyperMax6338
    public final void FrostHunterFirebaseModelDownloadConditionsSolarBlaze2223(byte[] bArr, int i, int i2, FrostHunterLaunchGammaTitanium8407 frostHunterLaunchGammaTitanium8407, FrostHunterLayoutInflaterNebulaVision6522 frostHunterLayoutInflaterNebulaVision6522) {
        FrostHunterDrawerLayoutUltraStrike3303.FrostHunterPreviewBlazeAurora1020(FrostHunterFragmentBetaMegaVortex6025(bArr, i, i2), frostHunterLaunchGammaTitanium8407, frostHunterLayoutInflaterNebulaVision6522);
    }

    @Override // android.content.Context.FrostHunterActionBarHyperMax6338
    public final FrostHunterCoroutineScopeSolarTitan6330 FrostHunterFragmentBetaMegaVortex6025(byte[] bArr, int i, int i2) {
        try {
            XmlPullParser newPullParser = this.FrostHunterCameraXPixelTurboCosmos9814.newPullParser();
            HashMap hashMap = new HashMap();
            HashMap hashMap2 = new HashMap();
            HashMap hashMap3 = new HashMap();
            hashMap2.put("", new FrostHunterCountDownTimerInfernoOlympian9514("", -3.4028235E38f, -3.4028235E38f, Integer.MIN_VALUE, Integer.MIN_VALUE, -3.4028235E38f, -3.4028235E38f, Integer.MIN_VALUE, -3.4028235E38f, Integer.MIN_VALUE));
            FrostHunterViewModelTitanPhoenixCelestial3010 frostHunterViewModelTitanPhoenixCelestial3010 = null;
            newPullParser.setInput(new ByteArrayInputStream(bArr, i, i2), null);
            ArrayDeque arrayDeque = new ArrayDeque();
            FrostHunterLooperForceUltraTitan3193 frostHunterLooperForceUltraTitan3193 = FrostHunterFirebaseModelDownloadConditionsSolarBlaze2223;
            int i3 = 0;
            int i4 = 15;
            FrostHunterOnItemLongClickListenerRogueDeltaStrike7658 frostHunterOnItemLongClickListenerRogueDeltaStrike7658 = null;
            for (int eventType = newPullParser.getEventType(); eventType != 1; eventType = newPullParser.getEventType()) {
                FrostHunterLayerMegaSpeedOlympian6070 frostHunterLayerMegaSpeedOlympian6070 = (FrostHunterLayerMegaSpeedOlympian6070) arrayDeque.peek();
                if (i3 == 0) {
                    String name = newPullParser.getName();
                    if (eventType == 2) {
                        if ("tt".equals(name)) {
                            frostHunterLooperForceUltraTitan3193 = FrostHunterLifecycleBlazeGammaElite2889(newPullParser);
                            i4 = FrostHunterBundlePulseFusionHero2475(newPullParser);
                            frostHunterViewModelTitanPhoenixCelestial3010 = FrostHunterAlertDialogAuroraDelta3200(newPullParser);
                        }
                        FrostHunterLooperForceUltraTitan3193 frostHunterLooperForceUltraTitan31932 = frostHunterLooperForceUltraTitan3193;
                        FrostHunterViewModelTitanPhoenixCelestial3010 frostHunterViewModelTitanPhoenixCelestial30102 = frostHunterViewModelTitanPhoenixCelestial3010;
                        int i5 = i4;
                        if (FrostHunterConstraintSetCloneMasterUltraRogue2633(name)) {
                            if ("head".equals(name)) {
                                FrostHunterLevelListDrawableFusionDragonHero2232(newPullParser, hashMap, i5, frostHunterViewModelTitanPhoenixCelestial30102, hashMap2, hashMap3);
                            } else {
                                try {
                                    FrostHunterLayerMegaSpeedOlympian6070 FrostHunterRemoteConfigSpeedSpeed8566 = FrostHunterRemoteConfigSpeedSpeed8566(newPullParser, frostHunterLayerMegaSpeedOlympian6070, hashMap2, frostHunterLooperForceUltraTitan31932);
                                    arrayDeque.push(FrostHunterRemoteConfigSpeedSpeed8566);
                                    if (frostHunterLayerMegaSpeedOlympian6070 != null) {
                                        if (frostHunterLayerMegaSpeedOlympian6070.FrostHunterServiceConnectionTurboPhoenixOmega6719 == null) {
                                            frostHunterLayerMegaSpeedOlympian6070.FrostHunterServiceConnectionTurboPhoenixOmega6719 = new ArrayList();
                                        }
                                        frostHunterLayerMegaSpeedOlympian6070.FrostHunterServiceConnectionTurboPhoenixOmega6719.add(FrostHunterRemoteConfigSpeedSpeed8566);
                                    }
                                } catch (FrostHunterBannerAdPulseAlphaShadow4056 e) {
                                    FrostHunterDrawerLayoutUltraStrike3303.FrostHunterColorDrawableLegendPhoenixVision7927("Suppressing parser error", e);
                                }
                            }
                            i4 = i5;
                            frostHunterViewModelTitanPhoenixCelestial3010 = frostHunterViewModelTitanPhoenixCelestial30102;
                            frostHunterLooperForceUltraTitan3193 = frostHunterLooperForceUltraTitan31932;
                        } else {
                            FrostHunterDrawerLayoutUltraStrike3303.FrostHunterMagnetometerFusionTitanium8202("Ignoring unsupported tag: " + newPullParser.getName());
                        }
                        i3++;
                        i4 = i5;
                        frostHunterViewModelTitanPhoenixCelestial3010 = frostHunterViewModelTitanPhoenixCelestial30102;
                        frostHunterLooperForceUltraTitan3193 = frostHunterLooperForceUltraTitan31932;
                    } else if (eventType == 4) {
                        frostHunterLayerMegaSpeedOlympian6070.getClass();
                        FrostHunterLayerMegaSpeedOlympian6070 FrostHunterAlphaAnimationNeoCosmos5761 = FrostHunterLayerMegaSpeedOlympian6070.FrostHunterAlphaAnimationNeoCosmos5761(newPullParser.getText());
                        if (frostHunterLayerMegaSpeedOlympian6070.FrostHunterServiceConnectionTurboPhoenixOmega6719 == null) {
                            frostHunterLayerMegaSpeedOlympian6070.FrostHunterServiceConnectionTurboPhoenixOmega6719 = new ArrayList();
                        }
                        frostHunterLayerMegaSpeedOlympian6070.FrostHunterServiceConnectionTurboPhoenixOmega6719.add(FrostHunterAlphaAnimationNeoCosmos5761);
                    } else if (eventType == 3) {
                        if (newPullParser.getName().equals("tt")) {
                            FrostHunterLayerMegaSpeedOlympian6070 frostHunterLayerMegaSpeedOlympian60702 = (FrostHunterLayerMegaSpeedOlympian6070) arrayDeque.peek();
                            frostHunterLayerMegaSpeedOlympian60702.getClass();
                            frostHunterOnItemLongClickListenerRogueDeltaStrike7658 = new FrostHunterOnItemLongClickListenerRogueDeltaStrike7658(frostHunterLayerMegaSpeedOlympian60702, hashMap, hashMap2, hashMap3);
                        }
                        arrayDeque.pop();
                    }
                } else if (eventType == 2) {
                    i3++;
                } else if (eventType == 3) {
                    i3--;
                }
                newPullParser.next();
            }
            frostHunterOnItemLongClickListenerRogueDeltaStrike7658.getClass();
            return frostHunterOnItemLongClickListenerRogueDeltaStrike7658;
        } catch (IOException e2) {
            throw new IllegalStateException("Unexpected error when reading input.", e2);
        } catch (XmlPullParserException e3) {
            throw new IllegalStateException("Unable to decode source", e3);
        }
    }
}
