package androidx.media3.extractor.text.ttml;

import android.text.Layout;
import android.text.TextUtils;
import androidx.camera.video.Recorder$$ExternalSyntheticOutline2;
import androidx.fragment.app.Fragment$5$$ExternalSyntheticOutline0;
import androidx.media3.common.util.ColorParser;
import androidx.media3.common.util.Consumer;
import androidx.media3.common.util.Log;
import androidx.media3.common.util.Util;
import androidx.media3.extractor.text.LegacySubtitleUtil;
import androidx.media3.extractor.text.Subtitle;
import androidx.media3.extractor.text.SubtitleDecoderException;
import androidx.media3.extractor.text.SubtitleParser;
import androidx.recyclerview.widget.RecyclerView;
import androidx.tracing.Trace;
import bo.app.a$$ExternalSyntheticBUOutline0;
import com.google.android.filament.Viewport;
import com.google.common.base.Ascii;
import com.google.common.collect.ImmutableSet;
import com.google.common.collect.Maps;
import com.google.common.collect.Sets$2;
import com.google.firebase.components.OptionalProvider$$ExternalSyntheticLambda0;
import com.nimbusds.jose.JWECryptoParts;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;
import org.xmlpull.v1.XmlPullParserFactory;

/* loaded from: classes3.dex */
public final class TtmlParser implements SubtitleParser {
    public final XmlPullParserFactory xmlParserFactory;
    public static final Pattern CLOCK_TIME = Pattern.compile("^([0-9][0-9]+):([0-9][0-9]):([0-9][0-9])(?:(\\.[0-9]+)|:([0-9][0-9])(?:\\.([0-9]+))?)?$");
    public static final Pattern OFFSET_TIME = Pattern.compile("^([0-9]+(?:\\.[0-9]+)?)(h|m|s|ms|f|t)$");
    public static final Pattern FONT_SIZE = Pattern.compile("^(([0-9]*.)?[0-9]+)(px|em|%)$");
    public static final Pattern SIGNED_PERCENTAGE = Pattern.compile("^([-+]?\\d+\\.?\\d*?)%$");
    public static final Pattern PERCENTAGE_COORDINATES = Pattern.compile("^([-+]?\\d+\\.?\\d*?)% ([-+]?\\d+\\.?\\d*?)%$");
    public static final Pattern PIXEL_COORDINATES = Pattern.compile("^([-+]?\\d+\\.?\\d*?)px ([-+]?\\d+\\.?\\d*?)px$");
    public static final Pattern CELL_RESOLUTION = Pattern.compile("^(\\d+) (\\d+)$");
    public static final FrameAndTickRate DEFAULT_FRAME_AND_TICK_RATE = new FrameAndTickRate(30.0f, 1, 1);

    public final class FrameAndTickRate {
        public float effectiveFrameRate;
        public int subFrameRate;
        public int tickRate;

        public FrameAndTickRate(float f, int i, int i2) {
            this.effectiveFrameRate = f;
            this.subFrameRate = i;
            this.tickRate = i2;
        }
    }

    public TtmlParser() {
        try {
            XmlPullParserFactory newInstance = XmlPullParserFactory.newInstance();
            this.xmlParserFactory = newInstance;
            newInstance.setNamespaceAware(true);
        } catch (XmlPullParserException e) {
            OptionalProvider$$ExternalSyntheticLambda0.m("Couldn't create XmlPullParserFactory instance", (Throwable) e);
            throw null;
        }
    }

    public static TtmlStyle createIfNull(TtmlStyle ttmlStyle) {
        return ttmlStyle == null ? new TtmlStyle() : ttmlStyle;
    }

    public static boolean isSupportedTag(String str) {
        return str.equals("tt") || str.equals("head") || str.equals("body") || str.equals("div") || str.equals("p") || str.equals("span") || str.equals("br") || str.equals("style") || str.equals("styling") || str.equals("layout") || str.equals("region") || str.equals("metadata") || str.equals("image") || str.equals("data") || str.equals("information");
    }

    public static int parseCellRows(XmlPullParser xmlPullParser) {
        String attributeValue = xmlPullParser.getAttributeValue("http://www.w3.org/ns/ttml#parameter", "cellResolution");
        if (attributeValue == null) {
            return 15;
        }
        Matcher matcher = CELL_RESOLUTION.matcher(attributeValue);
        if (!matcher.matches()) {
            Log.w("TtmlParser", "Ignoring malformed cell resolution: ".concat(attributeValue));
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
            Trace.checkArgument(parseInt, parseInt2, "Invalid cell resolution %s %s", z);
            return parseInt2;
        } catch (NumberFormatException unused) {
            Log.w("TtmlParser", "Ignoring malformed cell resolution: ".concat(attributeValue));
            return 15;
        }
    }

    public static void parseFontSize(String str, TtmlStyle ttmlStyle) {
        Matcher matcher;
        String group;
        String str2 = Util.DEVICE_DEBUG_INFO;
        String[] split = str.split("\\s+", -1);
        int length = split.length;
        Pattern pattern = FONT_SIZE;
        if (length == 1) {
            matcher = pattern.matcher(str);
        } else {
            if (split.length != 2) {
                throw new SubtitleDecoderException(JsonLogicResult$Success$$ExternalSyntheticOutline0.m(split.length, ".", new StringBuilder("Invalid number of entries for fontSize: ")));
            }
            matcher = pattern.matcher(split[1]);
            Log.w("TtmlParser", "Multiple values in fontSize attribute. Picking the second value for vertical font size and ignoring the first.");
        }
        if (!matcher.matches()) {
            throw new SubtitleDecoderException(JsonLogicResult$Success$$ExternalSyntheticOutline0.m("Invalid expression for fontSize: '", str, "'."));
        }
        group = matcher.group(3);
        group.getClass();
        switch (group) {
            case "%":
                ttmlStyle.fontSizeUnit = 3;
                break;
            case "em":
                ttmlStyle.fontSizeUnit = 2;
                break;
            case "px":
                ttmlStyle.fontSizeUnit = 1;
                break;
            default:
                throw new SubtitleDecoderException(JsonLogicResult$Success$$ExternalSyntheticOutline0.m("Invalid unit for fontSize: '", group, "'."));
        }
        String group2 = matcher.group(1);
        group2.getClass();
        ttmlStyle.fontSize = Float.parseFloat(group2);
    }

    public static FrameAndTickRate parseFrameAndTickRates(XmlPullParser xmlPullParser) {
        float f;
        String attributeValue = xmlPullParser.getAttributeValue("http://www.w3.org/ns/ttml#parameter", "frameRate");
        int parseInt = attributeValue != null ? Integer.parseInt(attributeValue) : 30;
        String attributeValue2 = xmlPullParser.getAttributeValue("http://www.w3.org/ns/ttml#parameter", "frameRateMultiplier");
        if (attributeValue2 != null) {
            String str = Util.DEVICE_DEBUG_INFO;
            Trace.checkArgument("frameRateMultiplier doesn't have 2 parts", attributeValue2.split(" ", -1).length == 2);
            f = Integer.parseInt(r2[0]) / Integer.parseInt(r2[1]);
        } else {
            f = 1.0f;
        }
        FrameAndTickRate frameAndTickRate = DEFAULT_FRAME_AND_TICK_RATE;
        int i = frameAndTickRate.subFrameRate;
        String attributeValue3 = xmlPullParser.getAttributeValue("http://www.w3.org/ns/ttml#parameter", "subFrameRate");
        if (attributeValue3 != null) {
            i = Integer.parseInt(attributeValue3);
        }
        int i2 = frameAndTickRate.tickRate;
        String attributeValue4 = xmlPullParser.getAttributeValue("http://www.w3.org/ns/ttml#parameter", "tickRate");
        if (attributeValue4 != null) {
            i2 = Integer.parseInt(attributeValue4);
        }
        return new FrameAndTickRate(parseInt * f, i, i2);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Removed duplicated region for block: B:32:0x022d  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x01dc  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static void parseHeader(XmlPullParser xmlPullParser, HashMap hashMap, int i, Viewport viewport, HashMap hashMap2, HashMap hashMap3) {
        String attributeValue;
        float f;
        float f2;
        float f3;
        float f4;
        float f5;
        float f6;
        int i2;
        String attributeValue2;
        int i3;
        TtmlRegion ttmlRegion;
        char c;
        float parseFloat;
        float parseFloat2;
        String attributeValue3;
        TtmlStyle ttmlStyle;
        String attributeValue4;
        TtmlStyle ttmlStyle2;
        String[] split;
        do {
            xmlPullParser.next();
            if (Log.isStartTag(xmlPullParser, "style")) {
                String attributeValue5 = Log.getAttributeValue(xmlPullParser, "style");
                TtmlStyle parseStyleAttributes = parseStyleAttributes(xmlPullParser, new TtmlStyle());
                if (attributeValue5 != null) {
                    String trim = attributeValue5.trim();
                    if (trim.isEmpty()) {
                        split = new String[0];
                    } else {
                        String str = Util.DEVICE_DEBUG_INFO;
                        split = trim.split("\\s+", -1);
                    }
                    for (String str2 : split) {
                        parseStyleAttributes.chain((TtmlStyle) hashMap.get(str2));
                    }
                }
                String str3 = parseStyleAttributes.id;
                if (str3 != null) {
                    hashMap.put(str3, parseStyleAttributes);
                }
            } else if (Log.isStartTag(xmlPullParser, "region")) {
                String attributeValue6 = Log.getAttributeValue(xmlPullParser, "id");
                if (attributeValue6 != null) {
                    String attributeValue7 = Log.getAttributeValue(xmlPullParser, "origin");
                    if (attributeValue7 == null && (attributeValue4 = Log.getAttributeValue(xmlPullParser, "style")) != null && (ttmlStyle2 = (TtmlStyle) hashMap.get(attributeValue4)) != null) {
                        attributeValue7 = ttmlStyle2.origin;
                    }
                    int i4 = 2;
                    Pattern pattern = PIXEL_COORDINATES;
                    Pattern pattern2 = PERCENTAGE_COORDINATES;
                    if (attributeValue7 != null) {
                        Matcher matcher = pattern2.matcher(attributeValue7);
                        Matcher matcher2 = pattern.matcher(attributeValue7);
                        if (matcher.matches()) {
                            try {
                                String group = matcher.group(1);
                                group.getClass();
                                f3 = Float.parseFloat(group) / 100.0f;
                                String group2 = matcher.group(2);
                                group2.getClass();
                                f2 = Float.parseFloat(group2) / 100.0f;
                                f = 100.0f;
                            } catch (NumberFormatException unused) {
                                Log.w("TtmlParser", "Ignoring region with malformed origin: ".concat(attributeValue7));
                            }
                        } else if (!matcher2.matches()) {
                            Log.w("TtmlParser", "Ignoring region with unsupported origin: ".concat(attributeValue7));
                        } else if (viewport == null) {
                            Log.w("TtmlParser", "Ignoring region with missing tts:extent: ".concat(attributeValue7));
                        } else {
                            try {
                                String group3 = matcher2.group(1);
                                group3.getClass();
                                int parseInt = Integer.parseInt(group3);
                                String group4 = matcher2.group(2);
                                group4.getClass();
                                f = 100.0f;
                                float f7 = parseInt / viewport.width;
                                float parseInt2 = Integer.parseInt(group4) / viewport.height;
                                f3 = f7;
                                f2 = parseInt2;
                            } catch (NumberFormatException unused2) {
                                Log.w("TtmlParser", "Ignoring region with malformed origin: ".concat(attributeValue7));
                            }
                        }
                    } else {
                        f = 100.0f;
                        f2 = RecyclerView.DECELERATION_RATE;
                        f3 = 0.0f;
                    }
                    String attributeValue8 = Log.getAttributeValue(xmlPullParser, "extent");
                    if (attributeValue8 == null && (attributeValue3 = Log.getAttributeValue(xmlPullParser, "style")) != null && (ttmlStyle = (TtmlStyle) hashMap.get(attributeValue3)) != null) {
                        attributeValue8 = ttmlStyle.extent;
                    }
                    if (attributeValue8 != null) {
                        Matcher matcher3 = pattern2.matcher(attributeValue8);
                        Matcher matcher4 = pattern.matcher(attributeValue8);
                        if (matcher3.matches()) {
                            try {
                                String group5 = matcher3.group(1);
                                group5.getClass();
                                parseFloat = Float.parseFloat(group5) / f;
                                String group6 = matcher3.group(2);
                                group6.getClass();
                                parseFloat2 = Float.parseFloat(group6) / f;
                            } catch (NumberFormatException unused3) {
                                Fragment$5$$ExternalSyntheticOutline0.m("Ignoring region with malformed extent: ", attributeValue7, "TtmlParser");
                            }
                        } else if (!matcher4.matches()) {
                            Fragment$5$$ExternalSyntheticOutline0.m("Ignoring region with unsupported extent: ", attributeValue7, "TtmlParser");
                        } else if (viewport == null) {
                            Fragment$5$$ExternalSyntheticOutline0.m("Ignoring region with missing tts:extent: ", attributeValue7, "TtmlParser");
                        } else {
                            String group7 = matcher4.group(1);
                            group7.getClass();
                            int parseInt3 = Integer.parseInt(group7);
                            String group8 = matcher4.group(2);
                            group8.getClass();
                            float f8 = parseInt3 / viewport.width;
                            parseFloat2 = Integer.parseInt(group8) / viewport.height;
                            parseFloat = f8;
                        }
                        f4 = parseFloat;
                        f5 = parseFloat2;
                    } else {
                        f4 = 1.0f;
                        f5 = 1.0f;
                    }
                    String attributeValue9 = Log.getAttributeValue(xmlPullParser, "displayAlign");
                    if (attributeValue9 != null) {
                        String lowerCase = Ascii.toLowerCase(attributeValue9);
                        lowerCase.getClass();
                        if (lowerCase.equals("center")) {
                            f6 = f2 + (f5 / 2.0f);
                            i2 = 1;
                        } else if (lowerCase.equals("after")) {
                            f6 = f2 + f5;
                            i2 = 2;
                        }
                        float f9 = 1.0f / i;
                        attributeValue2 = Log.getAttributeValue(xmlPullParser, "writingMode");
                        if (attributeValue2 != null) {
                            String lowerCase2 = Ascii.toLowerCase(attributeValue2);
                            lowerCase2.getClass();
                            switch (lowerCase2.hashCode()) {
                                case 3694:
                                    if (lowerCase2.equals("tb")) {
                                        c = 0;
                                        break;
                                    }
                                    c = 65535;
                                    break;
                                case 3553396:
                                    if (lowerCase2.equals("tblr")) {
                                        c = 1;
                                        break;
                                    }
                                    c = 65535;
                                    break;
                                case 3553576:
                                    if (lowerCase2.equals("tbrl")) {
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
                                case 0:
                                case 1:
                                    i3 = i4;
                                    break;
                                case 2:
                                    i3 = 1;
                                    break;
                            }
                            ttmlRegion = new TtmlRegion(attributeValue6, f3, f6, 0, i2, f4, f5, 1, f9, i3);
                            if (ttmlRegion != null) {
                                hashMap2.put(ttmlRegion.id, ttmlRegion);
                            }
                        }
                        i4 = PKIFailureInfo.systemUnavail;
                        i3 = i4;
                        ttmlRegion = new TtmlRegion(attributeValue6, f3, f6, 0, i2, f4, f5, 1, f9, i3);
                        if (ttmlRegion != null) {
                        }
                    }
                    f6 = f2;
                    i2 = 0;
                    float f92 = 1.0f / i;
                    attributeValue2 = Log.getAttributeValue(xmlPullParser, "writingMode");
                    if (attributeValue2 != null) {
                    }
                    i4 = PKIFailureInfo.systemUnavail;
                    i3 = i4;
                    ttmlRegion = new TtmlRegion(attributeValue6, f3, f6, 0, i2, f4, f5, 1, f92, i3);
                    if (ttmlRegion != null) {
                    }
                }
                ttmlRegion = null;
                if (ttmlRegion != null) {
                }
            } else if (Log.isStartTag(xmlPullParser, "metadata")) {
                do {
                    xmlPullParser.next();
                    if (Log.isStartTag(xmlPullParser, "image") && (attributeValue = Log.getAttributeValue(xmlPullParser, "id")) != null) {
                        hashMap3.put(attributeValue, xmlPullParser.nextText());
                    }
                } while (!Log.isEndTag(xmlPullParser, "metadata"));
            }
        } while (!Log.isEndTag(xmlPullParser, "head"));
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    public static TtmlNode parseNode(XmlPullParser xmlPullParser, TtmlNode ttmlNode, HashMap hashMap, FrameAndTickRate frameAndTickRate) {
        long j;
        char c;
        String[] split;
        int attributeCount = xmlPullParser.getAttributeCount();
        String[] strArr = null;
        TtmlStyle parseStyleAttributes = parseStyleAttributes(xmlPullParser, null);
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
                case 0:
                    if (!hashMap.containsKey(attributeValue)) {
                        break;
                    } else {
                        str2 = attributeValue;
                        continue;
                    }
                case 1:
                    j4 = parseTimeExpression(attributeValue, frameAndTickRate);
                    break;
                case 2:
                    j3 = parseTimeExpression(attributeValue, frameAndTickRate);
                    break;
                case 3:
                    j2 = parseTimeExpression(attributeValue, frameAndTickRate);
                    break;
                case 4:
                    String trim = attributeValue.trim();
                    if (trim.isEmpty()) {
                        split = new String[0];
                    } else {
                        String str3 = Util.DEVICE_DEBUG_INFO;
                        split = trim.split("\\s+", -1);
                    }
                    if (split.length > 0) {
                        strArr = split;
                        break;
                    }
                    break;
                case 5:
                    if (attributeValue.startsWith("#")) {
                        str = attributeValue.substring(1);
                        break;
                    }
                    break;
            }
        }
        if (ttmlNode != null) {
            long j5 = ttmlNode.startTimeUs;
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
            } else if (ttmlNode != null) {
                long j6 = ttmlNode.endTimeUs;
                if (j6 != -9223372036854775807L) {
                    j = j6;
                    return new TtmlNode(xmlPullParser.getName(), null, j2, j, parseStyleAttributes, strArr, str2, str, ttmlNode);
                }
            }
        }
        j = j3;
        return new TtmlNode(xmlPullParser.getName(), null, j2, j, parseStyleAttributes, strArr, str2, str, ttmlNode);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:101:0x02c5  */
    /* JADX WARN: Removed duplicated region for block: B:113:0x02e5  */
    /* JADX WARN: Removed duplicated region for block: B:114:0x02b9  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x0221  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x0255  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x02b4  */
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
    public static TtmlStyle parseStyleAttributes(XmlPullParser xmlPullParser, TtmlStyle ttmlStyle) {
        char c;
        ?? r9;
        boolean z;
        char c2;
        int i;
        Sets$2 intersection;
        int i2;
        int hashCode;
        int i3;
        TextEmphasis textEmphasis;
        int i4;
        char c3;
        int attributeCount = xmlPullParser.getAttributeCount();
        TtmlStyle ttmlStyle2 = ttmlStyle;
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
                case 0:
                    ttmlStyle2 = createIfNull(ttmlStyle2);
                    ttmlStyle2.italic = "italic".equalsIgnoreCase(attributeValue) ? 1 : 0;
                    break;
                case 1:
                    ttmlStyle2 = createIfNull(ttmlStyle2);
                    ttmlStyle2.extent = attributeValue;
                    break;
                case 2:
                    ttmlStyle2 = createIfNull(ttmlStyle2);
                    ttmlStyle2.fontFamily = attributeValue;
                    break;
                case 3:
                    ttmlStyle2 = createIfNull(ttmlStyle2);
                    String lowerCase = Ascii.toLowerCase(attributeValue);
                    lowerCase.getClass();
                    switch (lowerCase.hashCode()) {
                        case -1364013995:
                            if (lowerCase.equals("center")) {
                                r9 = false;
                                break;
                            }
                            r9 = -1;
                            break;
                        case 100571:
                            if (lowerCase.equals("end")) {
                                r9 = true;
                                break;
                            }
                            r9 = -1;
                            break;
                        case 3317767:
                            if (lowerCase.equals("left")) {
                                r9 = 2;
                                break;
                            }
                            r9 = -1;
                            break;
                        case 108511772:
                            if (lowerCase.equals("right")) {
                                r9 = 3;
                                break;
                            }
                            r9 = -1;
                            break;
                        case 109757538:
                            if (lowerCase.equals("start")) {
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
                        case 0:
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
                    ttmlStyle2.textAlign = alignment;
                    break;
                case 4:
                    ttmlStyle2 = createIfNull(ttmlStyle2);
                    ttmlStyle2.origin = attributeValue;
                    break;
                case 5:
                    String lowerCase2 = Ascii.toLowerCase(attributeValue);
                    lowerCase2.getClass();
                    switch (lowerCase2.hashCode()) {
                        case -1461280213:
                            if (lowerCase2.equals("nounderline")) {
                                z = false;
                                break;
                            }
                            z = -1;
                            break;
                        case -1026963764:
                            if (lowerCase2.equals("underline")) {
                                z = true;
                                break;
                            }
                            z = -1;
                            break;
                        case 913457136:
                            if (lowerCase2.equals("nolinethrough")) {
                                z = 2;
                                break;
                            }
                            z = -1;
                            break;
                        case 1679736913:
                            if (lowerCase2.equals("linethrough")) {
                                z = 3;
                                break;
                            }
                            z = -1;
                            break;
                        default:
                            z = -1;
                            break;
                    }
                    switch (z) {
                        case false:
                            ttmlStyle2 = createIfNull(ttmlStyle2);
                            ttmlStyle2.underline = 0;
                            break;
                        case true:
                            ttmlStyle2 = createIfNull(ttmlStyle2);
                            ttmlStyle2.underline = 1;
                            break;
                        case true:
                            ttmlStyle2 = createIfNull(ttmlStyle2);
                            ttmlStyle2.linethrough = 0;
                            break;
                        case true:
                            ttmlStyle2 = createIfNull(ttmlStyle2);
                            ttmlStyle2.linethrough = 1;
                            break;
                    }
                case 6:
                    ttmlStyle2 = createIfNull(ttmlStyle2);
                    ttmlStyle2.bold = "bold".equalsIgnoreCase(attributeValue) ? 1 : 0;
                    break;
                case 7:
                    if ("style".equals(xmlPullParser.getName())) {
                        ttmlStyle2 = createIfNull(ttmlStyle2);
                        ttmlStyle2.id = attributeValue;
                        break;
                    } else {
                        break;
                    }
                case '\b':
                    String lowerCase3 = Ascii.toLowerCase(attributeValue);
                    lowerCase3.getClass();
                    switch (lowerCase3.hashCode()) {
                        case -618561360:
                            if (lowerCase3.equals("baseContainer")) {
                                c2 = 0;
                                break;
                            }
                            c2 = 65535;
                            break;
                        case -410956671:
                            if (lowerCase3.equals("container")) {
                                c2 = 1;
                                break;
                            }
                            c2 = 65535;
                            break;
                        case -250518009:
                            if (lowerCase3.equals("delimiter")) {
                                c2 = 2;
                                break;
                            }
                            c2 = 65535;
                            break;
                        case -136074796:
                            if (lowerCase3.equals("textContainer")) {
                                c2 = 3;
                                break;
                            }
                            c2 = 65535;
                            break;
                        case 3016401:
                            if (lowerCase3.equals("base")) {
                                c2 = 4;
                                break;
                            }
                            c2 = 65535;
                            break;
                        case 3556653:
                            if (lowerCase3.equals("text")) {
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
                        case 0:
                        case 4:
                            ttmlStyle2 = createIfNull(ttmlStyle2);
                            ttmlStyle2.rubyType = 2;
                            break;
                        case 1:
                            ttmlStyle2 = createIfNull(ttmlStyle2);
                            ttmlStyle2.rubyType = 1;
                            break;
                        case 2:
                            ttmlStyle2 = createIfNull(ttmlStyle2);
                            ttmlStyle2.rubyType = 4;
                            break;
                        case 3:
                        case 5:
                            ttmlStyle2 = createIfNull(ttmlStyle2);
                            ttmlStyle2.rubyType = 3;
                            break;
                    }
                case '\t':
                    ttmlStyle2 = createIfNull(ttmlStyle2);
                    try {
                        ttmlStyle2.fontColor = ColorParser.parseColorInternal(attributeValue, false);
                        ttmlStyle2.hasFontColor = true;
                        break;
                    } catch (IllegalArgumentException unused) {
                        Fragment$5$$ExternalSyntheticOutline0.m("Failed parsing color value: ", attributeValue, "TtmlParser");
                        break;
                    }
                case '\n':
                    TtmlStyle createIfNull = createIfNull(ttmlStyle2);
                    Matcher matcher = SIGNED_PERCENTAGE.matcher(attributeValue);
                    float f = Float.MAX_VALUE;
                    if (matcher.matches()) {
                        try {
                            String group = matcher.group(1);
                            group.getClass();
                            f = Math.min(100.0f, Math.max(-100.0f, Float.parseFloat(group)));
                        } catch (NumberFormatException e) {
                            Log.w("TtmlParser", "Failed to parse shear: " + attributeValue, e);
                        }
                    } else {
                        Fragment$5$$ExternalSyntheticOutline0.m("Invalid value for shear: ", attributeValue, "TtmlParser");
                    }
                    createIfNull.shearPercentage = f;
                    ttmlStyle2 = createIfNull;
                    break;
                case 11:
                    String lowerCase4 = Ascii.toLowerCase(attributeValue);
                    lowerCase4.getClass();
                    if (lowerCase4.equals("all")) {
                        ttmlStyle2 = createIfNull(ttmlStyle2);
                        ttmlStyle2.textCombine = 1;
                        break;
                    } else if (lowerCase4.equals("none")) {
                        ttmlStyle2 = createIfNull(ttmlStyle2);
                        ttmlStyle2.textCombine = 0;
                        break;
                    } else {
                        break;
                    }
                case '\f':
                    try {
                        ttmlStyle2 = createIfNull(ttmlStyle2);
                        parseFontSize(attributeValue, ttmlStyle2);
                        break;
                    } catch (SubtitleDecoderException unused2) {
                        Fragment$5$$ExternalSyntheticOutline0.m("Failed parsing fontSize value: ", attributeValue, "TtmlParser");
                        break;
                    }
                case '\r':
                    ttmlStyle2 = createIfNull(ttmlStyle2);
                    Pattern pattern = TextEmphasis.WHITESPACE_PATTERN;
                    if (attributeValue != null) {
                        String lowerCase5 = Ascii.toLowerCase(attributeValue.trim());
                        if (!lowerCase5.isEmpty()) {
                            ImmutableSet copyOf = ImmutableSet.copyOf(TextUtils.split(lowerCase5, TextEmphasis.WHITESPACE_PATTERN));
                            Sets$2.AnonymousClass1 it = Maps.intersection(TextEmphasis.POSITION_VALUES, copyOf).iterator();
                            String str = (String) (it.hasNext() ? it.next() : "outside");
                            int hashCode2 = str.hashCode();
                            if (hashCode2 != -1392885889) {
                                if (hashCode2 != -1106037339) {
                                    if (hashCode2 == 92734940 && str.equals("after")) {
                                        i = 2;
                                        intersection = Maps.intersection(TextEmphasis.SINGLE_STYLE_VALUES, copyOf);
                                        if (intersection.isEmpty()) {
                                            Sets$2 intersection2 = Maps.intersection(TextEmphasis.MARK_FILL_VALUES, copyOf);
                                            Sets$2 intersection3 = Maps.intersection(TextEmphasis.MARK_SHAPE_VALUES, copyOf);
                                            if (intersection2.isEmpty() && intersection3.isEmpty()) {
                                                textEmphasis = new TextEmphasis(-1, 0, i);
                                            } else {
                                                Sets$2.AnonymousClass1 it2 = intersection2.iterator();
                                                String str2 = (String) (it2.hasNext() ? it2.next() : "filled");
                                                int hashCode3 = str2.hashCode();
                                                if (hashCode3 == -1274499742) {
                                                    str2.equals("filled");
                                                } else if (hashCode3 == 3417674 && str2.equals("open")) {
                                                    i2 = 2;
                                                    Sets$2.AnonymousClass1 it3 = intersection3.iterator();
                                                    String str3 = (String) (!it3.hasNext() ? it3.next() : "circle");
                                                    hashCode = str3.hashCode();
                                                    if (hashCode != -1360216880) {
                                                        str3.equals("circle");
                                                    } else if (hashCode != -905816648) {
                                                        if (hashCode == 99657 && str3.equals("dot")) {
                                                            i3 = 2;
                                                            textEmphasis = new TextEmphasis(i3, i2, i);
                                                        }
                                                    } else if (str3.equals("sesame")) {
                                                        i3 = 3;
                                                        textEmphasis = new TextEmphasis(i3, i2, i);
                                                    }
                                                    i3 = 1;
                                                    textEmphasis = new TextEmphasis(i3, i2, i);
                                                }
                                                i2 = 1;
                                                Sets$2.AnonymousClass1 it32 = intersection3.iterator();
                                                String str32 = (String) (!it32.hasNext() ? it32.next() : "circle");
                                                hashCode = str32.hashCode();
                                                if (hashCode != -1360216880) {
                                                }
                                                i3 = 1;
                                                textEmphasis = new TextEmphasis(i3, i2, i);
                                            }
                                        } else {
                                            String str4 = (String) new Sets$2.AnonymousClass1(intersection.val$set1, intersection.val$set2).next();
                                            int hashCode4 = str4.hashCode();
                                            if (hashCode4 == 3005871) {
                                                str4.equals("auto");
                                            } else if (hashCode4 == 3387192 && str4.equals("none")) {
                                                i4 = 0;
                                                textEmphasis = new TextEmphasis(i4, 0, i);
                                            }
                                            i4 = -1;
                                            textEmphasis = new TextEmphasis(i4, 0, i);
                                        }
                                    }
                                } else if (str.equals("outside")) {
                                    i = -2;
                                    intersection = Maps.intersection(TextEmphasis.SINGLE_STYLE_VALUES, copyOf);
                                    if (intersection.isEmpty()) {
                                    }
                                }
                                ttmlStyle2.textEmphasis = textEmphasis;
                                break;
                            } else {
                                str.equals("before");
                            }
                            i = 1;
                            intersection = Maps.intersection(TextEmphasis.SINGLE_STYLE_VALUES, copyOf);
                            if (intersection.isEmpty()) {
                            }
                            ttmlStyle2.textEmphasis = textEmphasis;
                        }
                    }
                    textEmphasis = null;
                    ttmlStyle2.textEmphasis = textEmphasis;
                    break;
                case 14:
                    String lowerCase6 = Ascii.toLowerCase(attributeValue);
                    lowerCase6.getClass();
                    if (lowerCase6.equals("before")) {
                        ttmlStyle2 = createIfNull(ttmlStyle2);
                        ttmlStyle2.rubyPosition = 1;
                        break;
                    } else if (lowerCase6.equals("after")) {
                        ttmlStyle2 = createIfNull(ttmlStyle2);
                        ttmlStyle2.rubyPosition = 2;
                        break;
                    } else {
                        break;
                    }
                case 15:
                    ttmlStyle2 = createIfNull(ttmlStyle2);
                    try {
                        ttmlStyle2.backgroundColor = ColorParser.parseColorInternal(attributeValue, false);
                        ttmlStyle2.hasBackgroundColor = true;
                        break;
                    } catch (IllegalArgumentException unused3) {
                        Fragment$5$$ExternalSyntheticOutline0.m("Failed parsing background value: ", attributeValue, "TtmlParser");
                        break;
                    }
                case 16:
                    ttmlStyle2 = createIfNull(ttmlStyle2);
                    String lowerCase7 = Ascii.toLowerCase(attributeValue);
                    lowerCase7.getClass();
                    switch (lowerCase7.hashCode()) {
                        case -1364013995:
                            if (lowerCase7.equals("center")) {
                                c3 = 0;
                                break;
                            }
                            c3 = 65535;
                            break;
                        case 100571:
                            if (lowerCase7.equals("end")) {
                                c3 = 1;
                                break;
                            }
                            c3 = 65535;
                            break;
                        case 3317767:
                            if (lowerCase7.equals("left")) {
                                c3 = 2;
                                break;
                            }
                            c3 = 65535;
                            break;
                        case 108511772:
                            if (lowerCase7.equals("right")) {
                                c3 = 3;
                                break;
                            }
                            c3 = 65535;
                            break;
                        case 109757538:
                            if (lowerCase7.equals("start")) {
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
                        case 0:
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
                    ttmlStyle2.multiRowAlign = alignment;
                    break;
            }
        }
        return ttmlStyle2;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x00ab, code lost:
    
        if (r13.equals("ms") == false) goto L21;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static long parseTimeExpression(String str, FrameAndTickRate frameAndTickRate) {
        double d;
        double d2;
        Matcher matcher = CLOCK_TIME.matcher(str);
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
            return (long) ((parseLong3 + (group2 != null ? Double.parseDouble(group2) : 0.0d) + (matcher.group(5) != null ? Long.parseLong(r13) / frameAndTickRate.effectiveFrameRate : 0.0d) + (matcher.group(6) != null ? (Long.parseLong(r13) / frameAndTickRate.subFrameRate) / frameAndTickRate.effectiveFrameRate : 0.0d)) * 1000000.0d);
        }
        Matcher matcher2 = OFFSET_TIME.matcher(str);
        if (!matcher2.matches()) {
            throw new SubtitleDecoderException(Recorder$$ExternalSyntheticOutline2.m("Malformed time expression: ", str));
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
            case 0:
                d = frameAndTickRate.effectiveFrameRate;
                parseDouble /= d;
                break;
            case 1:
                d2 = 3600.0d;
                break;
            case 2:
                d2 = 60.0d;
                break;
            case 3:
                d = frameAndTickRate.tickRate;
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

    public static Viewport parseTtsExtent(XmlPullParser xmlPullParser) {
        String attributeValue = Log.getAttributeValue(xmlPullParser, "extent");
        if (attributeValue == null) {
            return null;
        }
        Matcher matcher = PIXEL_COORDINATES.matcher(attributeValue);
        if (!matcher.matches()) {
            Log.w("TtmlParser", "Ignoring non-pixel tts extent: ".concat(attributeValue));
            return null;
        }
        try {
            String group = matcher.group(1);
            group.getClass();
            int parseInt = Integer.parseInt(group);
            String group2 = matcher.group(2);
            group2.getClass();
            return new Viewport(parseInt, Integer.parseInt(group2));
        } catch (NumberFormatException unused) {
            Log.w("TtmlParser", "Ignoring malformed tts extent: ".concat(attributeValue));
            return null;
        }
    }

    @Override // androidx.media3.extractor.text.SubtitleParser
    public final void parse(byte[] bArr, int i, int i2, SubtitleParser.OutputOptions outputOptions, Consumer consumer) {
        LegacySubtitleUtil.toCuesWithTiming(parseToLegacySubtitle(i, i2, bArr), outputOptions, consumer);
    }

    @Override // androidx.media3.extractor.text.SubtitleParser
    public final Subtitle parseToLegacySubtitle(int i, int i2, byte[] bArr) {
        Subtitle subtitle;
        Subtitle subtitle2 = null;
        try {
            XmlPullParser newPullParser = this.xmlParserFactory.newPullParser();
            HashMap hashMap = new HashMap();
            HashMap hashMap2 = new HashMap();
            HashMap hashMap3 = new HashMap();
            hashMap2.put("", new TtmlRegion("", -3.4028235E38f, -3.4028235E38f, PKIFailureInfo.systemUnavail, PKIFailureInfo.systemUnavail, -3.4028235E38f, -3.4028235E38f, PKIFailureInfo.systemUnavail, -3.4028235E38f, PKIFailureInfo.systemUnavail));
            newPullParser.setInput(new ByteArrayInputStream(bArr, i, i2), null);
            ArrayDeque arrayDeque = new ArrayDeque();
            int eventType = newPullParser.getEventType();
            FrameAndTickRate frameAndTickRate = DEFAULT_FRAME_AND_TICK_RATE;
            int i3 = 15;
            int i4 = 0;
            JWECryptoParts jWECryptoParts = null;
            Viewport viewport = null;
            while (eventType != 1) {
                TtmlNode ttmlNode = (TtmlNode) arrayDeque.peek();
                if (i4 == 0) {
                    String name = newPullParser.getName();
                    subtitle = subtitle2;
                    if (eventType == 2) {
                        try {
                            if ("tt".equals(name)) {
                                frameAndTickRate = parseFrameAndTickRates(newPullParser);
                                i3 = parseCellRows(newPullParser);
                                viewport = parseTtsExtent(newPullParser);
                            }
                            FrameAndTickRate frameAndTickRate2 = frameAndTickRate;
                            int i5 = i3;
                            Viewport viewport2 = viewport;
                            if (isSupportedTag(name)) {
                                if ("head".equals(name)) {
                                    parseHeader(newPullParser, hashMap, i5, viewport2, hashMap2, hashMap3);
                                } else {
                                    try {
                                        TtmlNode parseNode = parseNode(newPullParser, ttmlNode, hashMap2, frameAndTickRate2);
                                        arrayDeque.push(parseNode);
                                        if (ttmlNode != null) {
                                            if (ttmlNode.children == null) {
                                                ttmlNode.children = new ArrayList();
                                            }
                                            ttmlNode.children.add(parseNode);
                                        }
                                    } catch (SubtitleDecoderException e) {
                                        Log.w("TtmlParser", "Suppressing parser error", e);
                                    }
                                }
                                viewport = viewport2;
                                i3 = i5;
                                frameAndTickRate = frameAndTickRate2;
                            } else {
                                Log.i("TtmlParser", "Ignoring unsupported tag: " + newPullParser.getName());
                            }
                            i4++;
                            viewport = viewport2;
                            i3 = i5;
                            frameAndTickRate = frameAndTickRate2;
                        } catch (IOException e2) {
                            e = e2;
                            a$$ExternalSyntheticBUOutline0.m("Unexpected error when reading input.", e);
                            return subtitle;
                        } catch (XmlPullParserException e3) {
                            e = e3;
                            a$$ExternalSyntheticBUOutline0.m("Unable to decode source", e);
                            return subtitle;
                        }
                    } else if (eventType == 4) {
                        ttmlNode.getClass();
                        TtmlNode buildTextNode = TtmlNode.buildTextNode(newPullParser.getText());
                        if (ttmlNode.children == null) {
                            ttmlNode.children = new ArrayList();
                        }
                        ttmlNode.children.add(buildTextNode);
                    } else if (eventType == 3) {
                        if (newPullParser.getName().equals("tt")) {
                            TtmlNode ttmlNode2 = (TtmlNode) arrayDeque.peek();
                            ttmlNode2.getClass();
                            jWECryptoParts = new JWECryptoParts(ttmlNode2, hashMap, hashMap2, hashMap3);
                        }
                        arrayDeque.pop();
                    }
                } else {
                    subtitle = subtitle2;
                    if (eventType == 2) {
                        i4++;
                    } else if (eventType == 3) {
                        i4--;
                    }
                }
                newPullParser.next();
                eventType = newPullParser.getEventType();
                subtitle2 = subtitle;
            }
            subtitle = subtitle2;
            jWECryptoParts.getClass();
            return jWECryptoParts;
        } catch (IOException e4) {
            e = e4;
            subtitle = subtitle2;
        } catch (XmlPullParserException e5) {
            e = e5;
            subtitle = subtitle2;
        }
    }
}
