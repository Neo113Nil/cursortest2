package defpackage;

import android.text.Layout;
import android.text.TextUtils;
import com.connectsdk.device.ConnectableDevice;
import com.connectsdk.service.webos.lgcast.common.utils.StringUtil;
import io.appmetrica.analytics.BuildConfig;
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

/* loaded from: classes.dex */
public final class jbt implements upr {
    public static final Pattern b = Pattern.compile("^([0-9][0-9]+):([0-9][0-9]):([0-9][0-9])(?:(\\.[0-9]+)|:([0-9][0-9])(?:\\.([0-9]+))?)?$");
    public static final Pattern c = Pattern.compile("^([0-9]+(?:\\.[0-9]+)?)(h|m|s|ms|f|t)$");
    public static final Pattern d = Pattern.compile("^(([0-9]*.)?[0-9]+)(px|em|%)$");
    public static final Pattern e = Pattern.compile("^([-+]?\\d+\\.?\\d*?)%$");
    public static final Pattern f = Pattern.compile("^([-+]?\\d+\\.?\\d*?)% ([-+]?\\d+\\.?\\d*?)%$");
    public static final Pattern g = Pattern.compile("^([-+]?\\d+\\.?\\d*?)px ([-+]?\\d+\\.?\\d*?)px$");
    public static final Pattern h = Pattern.compile("^(\\d+) (\\d+)$");
    public static final fwo i = new fwo(1, 30.0f, 1);
    public final XmlPullParserFactory a;

    public jbt() {
        try {
            XmlPullParserFactory newInstance = XmlPullParserFactory.newInstance();
            this.a = newInstance;
            newInstance.setNamespaceAware(true);
        } catch (XmlPullParserException e2) {
            kac.k("Couldn't create XmlPullParserFactory instance", e2);
            throw null;
        }
    }

    public static lbt a(lbt lbtVar) {
        return lbtVar == null ? new lbt() : lbtVar;
    }

    public static boolean b(String str) {
        return str.equals("tt") || str.equals("head") || str.equals("body") || str.equals("div") || str.equals("p") || str.equals("span") || str.equals("br") || str.equals("style") || str.equals("styling") || str.equals("layout") || str.equals("region") || str.equals("metadata") || str.equals("image") || str.equals("data") || str.equals("information");
    }

    public static int c(XmlPullParser xmlPullParser) {
        String attributeValue = xmlPullParser.getAttributeValue("http://www.w3.org/ns/ttml#parameter", "cellResolution");
        if (attributeValue == null) {
            return 15;
        }
        Matcher matcher = h.matcher(attributeValue);
        if (!matcher.matches()) {
            vq1.n0("TtmlParser", "Ignoring malformed cell resolution: ".concat(attributeValue));
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
            vq1.u("Invalid cell resolution " + parseInt + StringUtil.SPACE + parseInt2, z);
            return parseInt2;
        } catch (NumberFormatException unused) {
            vq1.n0("TtmlParser", "Ignoring malformed cell resolution: ".concat(attributeValue));
            return 15;
        }
    }

    public static void d(String str, lbt lbtVar) {
        Matcher matcher;
        String group;
        int i2 = dvt.a;
        String[] split = str.split("\\s+", -1);
        int length = split.length;
        Pattern pattern = d;
        if (length == 1) {
            matcher = pattern.matcher(str);
        } else {
            if (split.length != 2) {
                throw new kpr(f1d.i(new StringBuilder("Invalid number of entries for fontSize: "), split.length, "."));
            }
            matcher = pattern.matcher(split[1]);
            vq1.n0("TtmlParser", "Multiple values in fontSize attribute. Picking the second value for vertical font size and ignoring the first.");
        }
        if (!matcher.matches()) {
            throw new kpr(hrg.q("Invalid expression for fontSize: '", str, "'."));
        }
        group = matcher.group(3);
        group.getClass();
        switch (group) {
            case "%":
                lbtVar.j = 3;
                break;
            case "em":
                lbtVar.j = 2;
                break;
            case "px":
                lbtVar.j = 1;
                break;
            default:
                throw new kpr(hrg.q("Invalid unit for fontSize: '", group, "'."));
        }
        String group2 = matcher.group(1);
        group2.getClass();
        lbtVar.k = Float.parseFloat(group2);
    }

    public static fwo e(XmlPullParser xmlPullParser) {
        float f2;
        String attributeValue = xmlPullParser.getAttributeValue("http://www.w3.org/ns/ttml#parameter", "frameRate");
        int parseInt = attributeValue != null ? Integer.parseInt(attributeValue) : 30;
        String attributeValue2 = xmlPullParser.getAttributeValue("http://www.w3.org/ns/ttml#parameter", "frameRateMultiplier");
        if (attributeValue2 != null) {
            int i2 = dvt.a;
            vq1.u("frameRateMultiplier doesn't have 2 parts", attributeValue2.split(StringUtil.SPACE, -1).length == 2);
            f2 = Integer.parseInt(r2[0]) / Integer.parseInt(r2[1]);
        } else {
            f2 = 1.0f;
        }
        fwo fwoVar = i;
        int i3 = fwoVar.b;
        String attributeValue3 = xmlPullParser.getAttributeValue("http://www.w3.org/ns/ttml#parameter", "subFrameRate");
        if (attributeValue3 != null) {
            i3 = Integer.parseInt(attributeValue3);
        }
        int i4 = fwoVar.c;
        String attributeValue4 = xmlPullParser.getAttributeValue("http://www.w3.org/ns/ttml#parameter", "tickRate");
        if (attributeValue4 != null) {
            i4 = Integer.parseInt(attributeValue4);
        }
        return new fwo(i3, parseInt * f2, i4);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0225  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x01d7  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static void f(XmlPullParser xmlPullParser, HashMap hashMap, int i2, c9n c9nVar, HashMap hashMap2, HashMap hashMap3) {
        String K;
        float f2;
        float f3;
        float f4;
        float f5;
        float f6;
        float f7;
        int i3;
        String K2;
        int i4;
        kbt kbtVar;
        char c2;
        float parseFloat;
        float parseFloat2;
        String K3;
        lbt lbtVar;
        String K4;
        lbt lbtVar2;
        String[] split;
        do {
            xmlPullParser.next();
            if (g0g.R("style", xmlPullParser)) {
                String K5 = g0g.K("style", xmlPullParser);
                lbt h2 = h(xmlPullParser, new lbt());
                if (K5 != null) {
                    String trim = K5.trim();
                    if (trim.isEmpty()) {
                        split = new String[0];
                    } else {
                        int i5 = dvt.a;
                        split = trim.split("\\s+", -1);
                    }
                    for (String str : split) {
                        h2.a((lbt) hashMap.get(str));
                    }
                }
                String str2 = h2.l;
                if (str2 != null) {
                    hashMap.put(str2, h2);
                }
            } else if (g0g.R("region", xmlPullParser)) {
                String K6 = g0g.K(ConnectableDevice.KEY_ID, xmlPullParser);
                if (K6 != null) {
                    String K7 = g0g.K("origin", xmlPullParser);
                    if (K7 == null && (K4 = g0g.K("style", xmlPullParser)) != null && (lbtVar2 = (lbt) hashMap.get(K4)) != null) {
                        K7 = lbtVar2.t;
                    }
                    int i6 = 2;
                    Pattern pattern = g;
                    Pattern pattern2 = f;
                    if (K7 != null) {
                        Matcher matcher = pattern2.matcher(K7);
                        Matcher matcher2 = pattern.matcher(K7);
                        if (matcher.matches()) {
                            try {
                                String group = matcher.group(1);
                                group.getClass();
                                f4 = Float.parseFloat(group) / 100.0f;
                                String group2 = matcher.group(2);
                                group2.getClass();
                                f3 = Float.parseFloat(group2) / 100.0f;
                                f2 = 100.0f;
                            } catch (NumberFormatException unused) {
                                vq1.n0("TtmlParser", "Ignoring region with malformed origin: ".concat(K7));
                            }
                        } else if (!matcher2.matches()) {
                            vq1.n0("TtmlParser", "Ignoring region with unsupported origin: ".concat(K7));
                        } else if (c9nVar == null) {
                            vq1.n0("TtmlParser", "Ignoring region with missing tts:extent: ".concat(K7));
                        } else {
                            try {
                                String group3 = matcher2.group(1);
                                group3.getClass();
                                int parseInt = Integer.parseInt(group3);
                                String group4 = matcher2.group(2);
                                group4.getClass();
                                f2 = 100.0f;
                                float f8 = parseInt / c9nVar.b;
                                float parseInt2 = Integer.parseInt(group4) / c9nVar.c;
                                f4 = f8;
                                f3 = parseInt2;
                            } catch (NumberFormatException unused2) {
                                vq1.n0("TtmlParser", "Ignoring region with malformed origin: ".concat(K7));
                            }
                        }
                    } else {
                        f2 = 100.0f;
                        f3 = 0.0f;
                        f4 = 0.0f;
                    }
                    String K8 = g0g.K("extent", xmlPullParser);
                    if (K8 == null && (K3 = g0g.K("style", xmlPullParser)) != null && (lbtVar = (lbt) hashMap.get(K3)) != null) {
                        K8 = lbtVar.u;
                    }
                    if (K8 != null) {
                        Matcher matcher3 = pattern2.matcher(K8);
                        Matcher matcher4 = pattern.matcher(K8);
                        if (matcher3.matches()) {
                            try {
                                String group5 = matcher3.group(1);
                                group5.getClass();
                                parseFloat = Float.parseFloat(group5) / f2;
                                String group6 = matcher3.group(2);
                                group6.getClass();
                                parseFloat2 = Float.parseFloat(group6) / f2;
                            } catch (NumberFormatException unused3) {
                                vz1.C("Ignoring region with malformed extent: ", K7, "TtmlParser");
                            }
                        } else if (!matcher4.matches()) {
                            vz1.C("Ignoring region with unsupported extent: ", K7, "TtmlParser");
                        } else if (c9nVar == null) {
                            vz1.C("Ignoring region with missing tts:extent: ", K7, "TtmlParser");
                        } else {
                            String group7 = matcher4.group(1);
                            group7.getClass();
                            int parseInt3 = Integer.parseInt(group7);
                            String group8 = matcher4.group(2);
                            group8.getClass();
                            float f9 = parseInt3 / c9nVar.b;
                            parseFloat2 = Integer.parseInt(group8) / c9nVar.c;
                            parseFloat = f9;
                        }
                        f5 = parseFloat;
                        f6 = parseFloat2;
                    } else {
                        f5 = 1.0f;
                        f6 = 1.0f;
                    }
                    String K9 = g0g.K("displayAlign", xmlPullParser);
                    if (K9 != null) {
                        String M = ltg.M(K9);
                        M.getClass();
                        if (M.equals("center")) {
                            f7 = f3 + (f6 / 2.0f);
                            i3 = 1;
                        } else if (M.equals("after")) {
                            f7 = f3 + f6;
                            i3 = 2;
                        }
                        float f10 = 1.0f / i2;
                        K2 = g0g.K("writingMode", xmlPullParser);
                        if (K2 != null) {
                            String M2 = ltg.M(K2);
                            M2.getClass();
                            switch (M2.hashCode()) {
                                case 3694:
                                    if (M2.equals("tb")) {
                                        c2 = 0;
                                        break;
                                    }
                                    c2 = 65535;
                                    break;
                                case 3553396:
                                    if (M2.equals("tblr")) {
                                        c2 = 1;
                                        break;
                                    }
                                    c2 = 65535;
                                    break;
                                case 3553576:
                                    if (M2.equals("tbrl")) {
                                        c2 = 2;
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
                                case 1:
                                    i4 = i6;
                                    break;
                                case 2:
                                    i4 = 1;
                                    break;
                            }
                            kbtVar = new kbt(K6, f4, f7, 0, i3, f5, f6, 1, f10, i4);
                            if (kbtVar != null) {
                                hashMap2.put(kbtVar.a, kbtVar);
                            }
                        }
                        i6 = Integer.MIN_VALUE;
                        i4 = i6;
                        kbtVar = new kbt(K6, f4, f7, 0, i3, f5, f6, 1, f10, i4);
                        if (kbtVar != null) {
                        }
                    }
                    f7 = f3;
                    i3 = 0;
                    float f102 = 1.0f / i2;
                    K2 = g0g.K("writingMode", xmlPullParser);
                    if (K2 != null) {
                    }
                    i6 = Integer.MIN_VALUE;
                    i4 = i6;
                    kbtVar = new kbt(K6, f4, f7, 0, i3, f5, f6, 1, f102, i4);
                    if (kbtVar != null) {
                    }
                }
                kbtVar = null;
                if (kbtVar != null) {
                }
            } else if (g0g.R("metadata", xmlPullParser)) {
                do {
                    xmlPullParser.next();
                    if (g0g.R("image", xmlPullParser) && (K = g0g.K(ConnectableDevice.KEY_ID, xmlPullParser)) != null) {
                        hashMap3.put(K, xmlPullParser.nextText());
                    }
                } while (!g0g.Q("metadata", xmlPullParser));
            }
        } while (!g0g.Q("head", xmlPullParser));
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    public static ibt g(XmlPullParser xmlPullParser, ibt ibtVar, HashMap hashMap, fwo fwoVar) {
        long j;
        char c2;
        String[] split;
        int attributeCount = xmlPullParser.getAttributeCount();
        String[] strArr = null;
        lbt h2 = h(xmlPullParser, null);
        String str = null;
        String str2 = "";
        long j2 = -9223372036854775807L;
        long j3 = -9223372036854775807L;
        long j4 = -9223372036854775807L;
        for (int i2 = 0; i2 < attributeCount; i2++) {
            String attributeName = xmlPullParser.getAttributeName(i2);
            String attributeValue = xmlPullParser.getAttributeValue(i2);
            attributeName.getClass();
            switch (attributeName.hashCode()) {
                case -934795532:
                    if (attributeName.equals("region")) {
                        c2 = 0;
                        break;
                    }
                    c2 = 65535;
                    break;
                case 99841:
                    if (attributeName.equals("dur")) {
                        c2 = 1;
                        break;
                    }
                    c2 = 65535;
                    break;
                case 100571:
                    if (attributeName.equals("end")) {
                        c2 = 2;
                        break;
                    }
                    c2 = 65535;
                    break;
                case 93616297:
                    if (attributeName.equals("begin")) {
                        c2 = 3;
                        break;
                    }
                    c2 = 65535;
                    break;
                case 109780401:
                    if (attributeName.equals("style")) {
                        c2 = 4;
                        break;
                    }
                    c2 = 65535;
                    break;
                case 1292595405:
                    if (attributeName.equals("backgroundImage")) {
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
                    if (!hashMap.containsKey(attributeValue)) {
                        break;
                    } else {
                        str2 = attributeValue;
                        continue;
                    }
                case 1:
                    j4 = j(attributeValue, fwoVar);
                    break;
                case 2:
                    j3 = j(attributeValue, fwoVar);
                    break;
                case 3:
                    j2 = j(attributeValue, fwoVar);
                    break;
                case 4:
                    String trim = attributeValue.trim();
                    if (trim.isEmpty()) {
                        split = new String[0];
                    } else {
                        int i3 = dvt.a;
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
        if (ibtVar != null) {
            long j5 = ibtVar.d;
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
            } else if (ibtVar != null) {
                long j6 = ibtVar.e;
                if (j6 != -9223372036854775807L) {
                    j = j6;
                    return new ibt(xmlPullParser.getName(), null, j2, j, h2, strArr, str2, str, ibtVar);
                }
            }
        }
        j = j3;
        return new ibt(xmlPullParser.getName(), null, j2, j, h2, strArr, str2, str, ibtVar);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:109:0x02c4  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x021f  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x024f  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x02a5  */
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
    public static lbt h(XmlPullParser xmlPullParser, lbt lbtVar) {
        char c2;
        ?? r9;
        boolean z;
        char c3;
        int i2;
        qop J;
        int i3;
        int hashCode;
        int i4;
        mas masVar;
        int i5;
        char c4;
        int attributeCount = xmlPullParser.getAttributeCount();
        lbt lbtVar2 = lbtVar;
        for (int i6 = 0; i6 < attributeCount; i6++) {
            String attributeValue = xmlPullParser.getAttributeValue(i6);
            String attributeName = xmlPullParser.getAttributeName(i6);
            attributeName.getClass();
            switch (attributeName.hashCode()) {
                case -1550943582:
                    if (attributeName.equals("fontStyle")) {
                        c2 = 0;
                        break;
                    }
                    c2 = 65535;
                    break;
                case -1289044182:
                    if (attributeName.equals("extent")) {
                        c2 = 1;
                        break;
                    }
                    c2 = 65535;
                    break;
                case -1224696685:
                    if (attributeName.equals("fontFamily")) {
                        c2 = 2;
                        break;
                    }
                    c2 = 65535;
                    break;
                case -1065511464:
                    if (attributeName.equals("textAlign")) {
                        c2 = 3;
                        break;
                    }
                    c2 = 65535;
                    break;
                case -1008619738:
                    if (attributeName.equals("origin")) {
                        c2 = 4;
                        break;
                    }
                    c2 = 65535;
                    break;
                case -879295043:
                    if (attributeName.equals("textDecoration")) {
                        c2 = 5;
                        break;
                    }
                    c2 = 65535;
                    break;
                case -734428249:
                    if (attributeName.equals("fontWeight")) {
                        c2 = 6;
                        break;
                    }
                    c2 = 65535;
                    break;
                case 3355:
                    if (attributeName.equals(ConnectableDevice.KEY_ID)) {
                        c2 = 7;
                        break;
                    }
                    c2 = 65535;
                    break;
                case 3511770:
                    if (attributeName.equals("ruby")) {
                        c2 = '\b';
                        break;
                    }
                    c2 = 65535;
                    break;
                case 94842723:
                    if (attributeName.equals("color")) {
                        c2 = '\t';
                        break;
                    }
                    c2 = 65535;
                    break;
                case 109403361:
                    if (attributeName.equals("shear")) {
                        c2 = '\n';
                        break;
                    }
                    c2 = 65535;
                    break;
                case 110138194:
                    if (attributeName.equals("textCombine")) {
                        c2 = 11;
                        break;
                    }
                    c2 = 65535;
                    break;
                case 365601008:
                    if (attributeName.equals("fontSize")) {
                        c2 = '\f';
                        break;
                    }
                    c2 = 65535;
                    break;
                case 921125321:
                    if (attributeName.equals("textEmphasis")) {
                        c2 = '\r';
                        break;
                    }
                    c2 = 65535;
                    break;
                case 1115953443:
                    if (attributeName.equals("rubyPosition")) {
                        c2 = 14;
                        break;
                    }
                    c2 = 65535;
                    break;
                case 1287124693:
                    if (attributeName.equals("backgroundColor")) {
                        c2 = 15;
                        break;
                    }
                    c2 = 65535;
                    break;
                case 1754920356:
                    if (attributeName.equals("multiRowAlign")) {
                        c2 = 16;
                        break;
                    }
                    c2 = 65535;
                    break;
                default:
                    c2 = 65535;
                    break;
            }
            Layout.Alignment alignment = null;
            switch (c2) {
                case 0:
                    lbtVar2 = a(lbtVar2);
                    lbtVar2.i = "italic".equalsIgnoreCase(attributeValue) ? 1 : 0;
                    break;
                case 1:
                    lbtVar2 = a(lbtVar2);
                    lbtVar2.u = attributeValue;
                    break;
                case 2:
                    lbtVar2 = a(lbtVar2);
                    lbtVar2.a = attributeValue;
                    break;
                case 3:
                    lbtVar2 = a(lbtVar2);
                    String M = ltg.M(attributeValue);
                    M.getClass();
                    switch (M.hashCode()) {
                        case -1364013995:
                            if (M.equals("center")) {
                                r9 = false;
                                break;
                            }
                            r9 = -1;
                            break;
                        case 100571:
                            if (M.equals("end")) {
                                r9 = true;
                                break;
                            }
                            r9 = -1;
                            break;
                        case 3317767:
                            if (M.equals("left")) {
                                r9 = 2;
                                break;
                            }
                            r9 = -1;
                            break;
                        case 108511772:
                            if (M.equals("right")) {
                                r9 = 3;
                                break;
                            }
                            r9 = -1;
                            break;
                        case 109757538:
                            if (M.equals("start")) {
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
                    lbtVar2.o = alignment;
                    break;
                case 4:
                    lbtVar2 = a(lbtVar2);
                    lbtVar2.t = attributeValue;
                    break;
                case 5:
                    String M2 = ltg.M(attributeValue);
                    M2.getClass();
                    switch (M2.hashCode()) {
                        case -1461280213:
                            if (M2.equals("nounderline")) {
                                z = false;
                                break;
                            }
                            z = -1;
                            break;
                        case -1026963764:
                            if (M2.equals("underline")) {
                                z = true;
                                break;
                            }
                            z = -1;
                            break;
                        case 913457136:
                            if (M2.equals("nolinethrough")) {
                                z = 2;
                                break;
                            }
                            z = -1;
                            break;
                        case 1679736913:
                            if (M2.equals("linethrough")) {
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
                            lbtVar2 = a(lbtVar2);
                            lbtVar2.g = 0;
                            break;
                        case true:
                            lbtVar2 = a(lbtVar2);
                            lbtVar2.g = 1;
                            break;
                        case true:
                            lbtVar2 = a(lbtVar2);
                            lbtVar2.f = 0;
                            break;
                        case true:
                            lbtVar2 = a(lbtVar2);
                            lbtVar2.f = 1;
                            break;
                    }
                case 6:
                    lbtVar2 = a(lbtVar2);
                    lbtVar2.h = "bold".equalsIgnoreCase(attributeValue) ? 1 : 0;
                    break;
                case 7:
                    if ("style".equals(xmlPullParser.getName())) {
                        lbtVar2 = a(lbtVar2);
                        lbtVar2.l = attributeValue;
                        break;
                    } else {
                        break;
                    }
                case '\b':
                    String M3 = ltg.M(attributeValue);
                    M3.getClass();
                    switch (M3.hashCode()) {
                        case -618561360:
                            if (M3.equals("baseContainer")) {
                                c3 = 0;
                                break;
                            }
                            c3 = 65535;
                            break;
                        case -410956671:
                            if (M3.equals("container")) {
                                c3 = 1;
                                break;
                            }
                            c3 = 65535;
                            break;
                        case -250518009:
                            if (M3.equals("delimiter")) {
                                c3 = 2;
                                break;
                            }
                            c3 = 65535;
                            break;
                        case -136074796:
                            if (M3.equals("textContainer")) {
                                c3 = 3;
                                break;
                            }
                            c3 = 65535;
                            break;
                        case 3016401:
                            if (M3.equals("base")) {
                                c3 = 4;
                                break;
                            }
                            c3 = 65535;
                            break;
                        case 3556653:
                            if (M3.equals("text")) {
                                c3 = 5;
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
                        case 4:
                            lbtVar2 = a(lbtVar2);
                            lbtVar2.m = 2;
                            break;
                        case 1:
                            lbtVar2 = a(lbtVar2);
                            lbtVar2.m = 1;
                            break;
                        case 2:
                            lbtVar2 = a(lbtVar2);
                            lbtVar2.m = 4;
                            break;
                        case 3:
                        case 5:
                            lbtVar2 = a(lbtVar2);
                            lbtVar2.m = 3;
                            break;
                    }
                case '\t':
                    lbtVar2 = a(lbtVar2);
                    try {
                        lbtVar2.b = z85.a(attributeValue, false);
                        lbtVar2.c = true;
                        break;
                    } catch (IllegalArgumentException unused) {
                        vz1.C("Failed parsing color value: ", attributeValue, "TtmlParser");
                        break;
                    }
                case '\n':
                    lbt a = a(lbtVar2);
                    Matcher matcher = e.matcher(attributeValue);
                    float f2 = Float.MAX_VALUE;
                    if (matcher.matches()) {
                        try {
                            String group = matcher.group(1);
                            group.getClass();
                            f2 = Math.min(100.0f, Math.max(-100.0f, Float.parseFloat(group)));
                        } catch (NumberFormatException e2) {
                            vq1.o0("TtmlParser", "Failed to parse shear: " + attributeValue, e2);
                        }
                    } else {
                        vz1.C("Invalid value for shear: ", attributeValue, "TtmlParser");
                    }
                    a.s = f2;
                    lbtVar2 = a;
                    break;
                case 11:
                    String M4 = ltg.M(attributeValue);
                    M4.getClass();
                    if (M4.equals("all")) {
                        lbtVar2 = a(lbtVar2);
                        lbtVar2.q = 1;
                        break;
                    } else if (M4.equals("none")) {
                        lbtVar2 = a(lbtVar2);
                        lbtVar2.q = 0;
                        break;
                    } else {
                        break;
                    }
                case '\f':
                    try {
                        lbtVar2 = a(lbtVar2);
                        d(attributeValue, lbtVar2);
                        break;
                    } catch (kpr unused2) {
                        vz1.C("Failed parsing fontSize value: ", attributeValue, "TtmlParser");
                        break;
                    }
                case '\r':
                    lbtVar2 = a(lbtVar2);
                    Pattern pattern = mas.d;
                    if (attributeValue != null) {
                        String M5 = ltg.M(attributeValue.trim());
                        if (!M5.isEmpty()) {
                            String[] split = TextUtils.split(M5, mas.d);
                            int length = split.length;
                            hee u = length != 0 ? length != 1 ? hee.u(split.length, (Object[]) split.clone()) : new gmq(split[0]) : wsn.j;
                            String str = (String) ild.w(ezf.J(mas.h, u), "outside");
                            int hashCode2 = str.hashCode();
                            if (hashCode2 != -1392885889) {
                                if (hashCode2 != -1106037339) {
                                    if (hashCode2 == 92734940 && str.equals("after")) {
                                        i2 = 2;
                                        J = ezf.J(mas.e, u);
                                        if (J.isEmpty()) {
                                            qop J2 = ezf.J(mas.g, u);
                                            qop J3 = ezf.J(mas.f, u);
                                            if (J2.isEmpty() && J3.isEmpty()) {
                                                masVar = new mas(-1, 0, i2);
                                            } else {
                                                String str2 = (String) ild.w(J2, "filled");
                                                int hashCode3 = str2.hashCode();
                                                if (hashCode3 == -1274499742) {
                                                    str2.equals("filled");
                                                } else if (hashCode3 == 3417674 && str2.equals("open")) {
                                                    i3 = 2;
                                                    String str3 = (String) ild.w(J3, "circle");
                                                    hashCode = str3.hashCode();
                                                    if (hashCode != -1360216880) {
                                                        str3.equals("circle");
                                                    } else if (hashCode != -905816648) {
                                                        if (hashCode == 99657 && str3.equals("dot")) {
                                                            i4 = 2;
                                                            masVar = new mas(i4, i3, i2);
                                                        }
                                                    } else if (str3.equals("sesame")) {
                                                        i4 = 3;
                                                        masVar = new mas(i4, i3, i2);
                                                    }
                                                    i4 = 1;
                                                    masVar = new mas(i4, i3, i2);
                                                }
                                                i3 = 1;
                                                String str32 = (String) ild.w(J3, "circle");
                                                hashCode = str32.hashCode();
                                                if (hashCode != -1360216880) {
                                                }
                                                i4 = 1;
                                                masVar = new mas(i4, i3, i2);
                                            }
                                        } else {
                                            String str4 = (String) new e1f(J).next();
                                            int hashCode4 = str4.hashCode();
                                            if (hashCode4 == 3005871) {
                                                str4.equals("auto");
                                            } else if (hashCode4 == 3387192 && str4.equals("none")) {
                                                i5 = 0;
                                                masVar = new mas(i5, 0, i2);
                                            }
                                            i5 = -1;
                                            masVar = new mas(i5, 0, i2);
                                        }
                                    }
                                } else if (str.equals("outside")) {
                                    i2 = -2;
                                    J = ezf.J(mas.e, u);
                                    if (J.isEmpty()) {
                                    }
                                }
                                lbtVar2.r = masVar;
                                break;
                            } else {
                                str.equals("before");
                            }
                            i2 = 1;
                            J = ezf.J(mas.e, u);
                            if (J.isEmpty()) {
                            }
                            lbtVar2.r = masVar;
                        }
                    }
                    masVar = null;
                    lbtVar2.r = masVar;
                    break;
                case 14:
                    String M6 = ltg.M(attributeValue);
                    M6.getClass();
                    if (M6.equals("before")) {
                        lbtVar2 = a(lbtVar2);
                        lbtVar2.n = 1;
                        break;
                    } else if (M6.equals("after")) {
                        lbtVar2 = a(lbtVar2);
                        lbtVar2.n = 2;
                        break;
                    } else {
                        break;
                    }
                case 15:
                    lbtVar2 = a(lbtVar2);
                    try {
                        lbtVar2.d = z85.a(attributeValue, false);
                        lbtVar2.e = true;
                        break;
                    } catch (IllegalArgumentException unused3) {
                        vz1.C("Failed parsing background value: ", attributeValue, "TtmlParser");
                        break;
                    }
                case 16:
                    lbtVar2 = a(lbtVar2);
                    String M7 = ltg.M(attributeValue);
                    M7.getClass();
                    switch (M7.hashCode()) {
                        case -1364013995:
                            if (M7.equals("center")) {
                                c4 = 0;
                                break;
                            }
                            c4 = 65535;
                            break;
                        case 100571:
                            if (M7.equals("end")) {
                                c4 = 1;
                                break;
                            }
                            c4 = 65535;
                            break;
                        case 3317767:
                            if (M7.equals("left")) {
                                c4 = 2;
                                break;
                            }
                            c4 = 65535;
                            break;
                        case 108511772:
                            if (M7.equals("right")) {
                                c4 = 3;
                                break;
                            }
                            c4 = 65535;
                            break;
                        case 109757538:
                            if (M7.equals("start")) {
                                c4 = 4;
                                break;
                            }
                            c4 = 65535;
                            break;
                        default:
                            c4 = 65535;
                            break;
                    }
                    switch (c4) {
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
                    lbtVar2.p = alignment;
                    break;
            }
        }
        return lbtVar2;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x00aa, code lost:
    
        if (r13.equals("ms") == false) goto L21;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static long j(String str, fwo fwoVar) {
        double d2;
        double d3;
        Matcher matcher = b.matcher(str);
        char c2 = 4;
        if (matcher.matches()) {
            String group = matcher.group(1);
            group.getClass();
            double parseLong = Long.parseLong(group) * 3600;
            matcher.group(2).getClass();
            double parseLong2 = parseLong + (Long.parseLong(r13) * 60);
            matcher.group(3).getClass();
            double parseLong3 = parseLong2 + Long.parseLong(r13);
            String group2 = matcher.group(4);
            return (long) ((parseLong3 + (group2 != null ? Double.parseDouble(group2) : 0.0d) + (matcher.group(5) != null ? Long.parseLong(r13) / fwoVar.a : 0.0d) + (matcher.group(6) != null ? (Long.parseLong(r13) / fwoVar.b) / fwoVar.a : 0.0d)) * 1000000.0d);
        }
        Matcher matcher2 = c.matcher(str);
        if (!matcher2.matches()) {
            throw new kpr(f1d.g("Malformed time expression: ", str));
        }
        String group3 = matcher2.group(1);
        group3.getClass();
        double parseDouble = Double.parseDouble(group3);
        String group4 = matcher2.group(2);
        group4.getClass();
        switch (group4.hashCode()) {
            case 102:
                if (group4.equals("f")) {
                    c2 = 0;
                    break;
                }
                c2 = 65535;
                break;
            case 104:
                if (group4.equals("h")) {
                    c2 = 1;
                    break;
                }
                c2 = 65535;
                break;
            case 109:
                if (group4.equals("m")) {
                    c2 = 2;
                    break;
                }
                c2 = 65535;
                break;
            case BuildConfig.API_LEVEL /* 116 */:
                if (group4.equals("t")) {
                    c2 = 3;
                    break;
                }
                c2 = 65535;
                break;
            case 3494:
                break;
            default:
                c2 = 65535;
                break;
        }
        switch (c2) {
            case 0:
                d2 = fwoVar.a;
                parseDouble /= d2;
                break;
            case 1:
                d3 = 3600.0d;
                break;
            case 2:
                d3 = 60.0d;
                break;
            case 3:
                d2 = fwoVar.c;
                parseDouble /= d2;
                break;
            case 4:
                d2 = 1000.0d;
                parseDouble /= d2;
                break;
        }
        parseDouble *= d3;
        return (long) (parseDouble * 1000000.0d);
    }

    public static c9n k(XmlPullParser xmlPullParser) {
        String K = g0g.K("extent", xmlPullParser);
        if (K == null) {
            return null;
        }
        Matcher matcher = g.matcher(K);
        if (!matcher.matches()) {
            vq1.n0("TtmlParser", "Ignoring non-pixel tts extent: ".concat(K));
            return null;
        }
        try {
            String group = matcher.group(1);
            group.getClass();
            int parseInt = Integer.parseInt(group);
            String group2 = matcher.group(2);
            group2.getClass();
            return new c9n(parseInt, Integer.parseInt(group2), 13);
        } catch (NumberFormatException unused) {
            vq1.n0("TtmlParser", "Ignoring malformed tts extent: ".concat(K));
            return null;
        }
    }

    @Override // defpackage.upr
    public final void i(byte[] bArr, int i2, int i3, tpr tprVar, ua6 ua6Var) {
        zwf.c0(p(bArr, i2, i3), tprVar, ua6Var);
    }

    @Override // defpackage.upr
    public final ipr p(byte[] bArr, int i2, int i3) {
        try {
            XmlPullParser newPullParser = this.a.newPullParser();
            HashMap hashMap = new HashMap();
            HashMap hashMap2 = new HashMap();
            HashMap hashMap3 = new HashMap();
            hashMap2.put("", new kbt("", -3.4028235E38f, -3.4028235E38f, Integer.MIN_VALUE, Integer.MIN_VALUE, -3.4028235E38f, -3.4028235E38f, Integer.MIN_VALUE, -3.4028235E38f, Integer.MIN_VALUE));
            c9n c9nVar = null;
            newPullParser.setInput(new ByteArrayInputStream(bArr, i2, i3), null);
            ArrayDeque arrayDeque = new ArrayDeque();
            fwo fwoVar = i;
            int i4 = 0;
            int i5 = 15;
            tao taoVar = null;
            for (int eventType = newPullParser.getEventType(); eventType != 1; eventType = newPullParser.getEventType()) {
                ibt ibtVar = (ibt) arrayDeque.peek();
                if (i4 == 0) {
                    String name = newPullParser.getName();
                    if (eventType == 2) {
                        if ("tt".equals(name)) {
                            fwoVar = e(newPullParser);
                            i5 = c(newPullParser);
                            c9nVar = k(newPullParser);
                        }
                        fwo fwoVar2 = fwoVar;
                        c9n c9nVar2 = c9nVar;
                        int i6 = i5;
                        if (b(name)) {
                            if ("head".equals(name)) {
                                f(newPullParser, hashMap, i6, c9nVar2, hashMap2, hashMap3);
                            } else {
                                try {
                                    ibt g2 = g(newPullParser, ibtVar, hashMap2, fwoVar2);
                                    arrayDeque.push(g2);
                                    if (ibtVar != null) {
                                        if (ibtVar.m == null) {
                                            ibtVar.m = new ArrayList();
                                        }
                                        ibtVar.m.add(g2);
                                    }
                                } catch (kpr e2) {
                                    vq1.o0("TtmlParser", "Suppressing parser error", e2);
                                }
                            }
                            i5 = i6;
                            c9nVar = c9nVar2;
                            fwoVar = fwoVar2;
                        } else {
                            vq1.Y("TtmlParser", "Ignoring unsupported tag: " + newPullParser.getName());
                        }
                        i4++;
                        i5 = i6;
                        c9nVar = c9nVar2;
                        fwoVar = fwoVar2;
                    } else if (eventType == 4) {
                        ibtVar.getClass();
                        ibt a = ibt.a(newPullParser.getText());
                        if (ibtVar.m == null) {
                            ibtVar.m = new ArrayList();
                        }
                        ibtVar.m.add(a);
                    } else if (eventType == 3) {
                        if (newPullParser.getName().equals("tt")) {
                            ibt ibtVar2 = (ibt) arrayDeque.peek();
                            ibtVar2.getClass();
                            taoVar = new tao(ibtVar2, hashMap, hashMap2, hashMap3);
                        }
                        arrayDeque.pop();
                    }
                } else if (eventType == 2) {
                    i4++;
                } else if (eventType == 3) {
                    i4--;
                }
                newPullParser.next();
            }
            taoVar.getClass();
            return taoVar;
        } catch (IOException e3) {
            b6e.o("Unexpected error when reading input.", e3);
            return null;
        } catch (XmlPullParserException e4) {
            b6e.o("Unable to decode source", e4);
            return null;
        }
    }

    @Override // defpackage.upr
    public final int y() {
        return 1;
    }
}
