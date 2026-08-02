package defpackage;

import android.text.Layout;
import android.text.TextUtils;
import com.yandex.fintechsdk.adapters.flex.sdk.impl.divkit.shimmer.ShimmerDivHandler;
import com.yandex.urbanads.internal.navigation.UrbanAdsBottomSheetFragment;
import io.appmetrica.analytics.BuildConfig;
import io.appmetrica.analytics.rtm.internal.Constants;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;
import org.xmlpull.v1.XmlPullParserFactory;
import ru.CryptoPro.JCP.VMInspector.OpenList;
import ru.CryptoPro.JCP.tools.CertReader.Extension;
import ru.CryptoPro.JCP.tools.HexString;
import yads.ay2;
import yads.cl2;
import yads.w23;
import yads.y31;

/* loaded from: classes7.dex */
public final class yk81 extends zt71 {
    public static final Pattern n = Pattern.compile("^([0-9][0-9]+):([0-9][0-9]):([0-9][0-9])(?:(\\.[0-9]+)|:([0-9][0-9])(?:\\.([0-9]+))?)?$");
    public static final Pattern o = Pattern.compile("^([0-9]+(?:\\.[0-9]+)?)(h|m|s|ms|f|t)$");
    public static final Pattern p = Pattern.compile("^(([0-9]*.)?[0-9]+)(px|em|%)$");
    public static final Pattern q = Pattern.compile("^([-+]?\\d+\\.?\\d*?)%$");
    public static final Pattern r = Pattern.compile("^(\\d+\\.?\\d*?)% (\\d+\\.?\\d*?)%$");
    public static final Pattern s = Pattern.compile("^(\\d+\\.?\\d*?)px (\\d+\\.?\\d*?)px$");
    public static final Pattern t = Pattern.compile("^(\\d+) (\\d+)$");
    public static final nj11 u = new nj11(30.0f, 1, 1);
    public static final dn60 v = new dn60(15, 16, (byte) 0);
    public final XmlPullParserFactory m;

    public yk81() {
        try {
            XmlPullParserFactory newInstance = XmlPullParserFactory.newInstance();
            this.m = newInstance;
            newInstance.setNamespaceAware(true);
        } catch (XmlPullParserException e) {
            ny61.n("Couldn't create XmlPullParserFactory instance", e);
            throw null;
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x00aa, code lost:
    
        if (r13.equals("ms") == false) goto L21;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static long f(String str, nj11 nj11Var) {
        double d;
        double d2;
        Matcher matcher = n.matcher(str);
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
            return (long) ((parseLong3 + (group2 != null ? Double.parseDouble(group2) : 0.0d) + (matcher.group(5) != null ? Long.parseLong(r13) / nj11Var.a : 0.0d) + (matcher.group(6) != null ? (Long.parseLong(r13) / nj11Var.b) / nj11Var.a : 0.0d)) * 1000000.0d);
        }
        Matcher matcher2 = o.matcher(str);
        if (!matcher2.matches()) {
            throw new w23(g8e.o("Malformed time expression: ", str));
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
            case BuildConfig.API_LEVEL /* 116 */:
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
                d = nj11Var.a;
                parseDouble /= d;
                break;
            case 1:
                d2 = 3600.0d;
                break;
            case 2:
                d2 = 60.0d;
                break;
            case 3:
                d = nj11Var.c;
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

    public static dn60 g(XmlPullParser xmlPullParser, dn60 dn60Var) {
        String attributeValue = xmlPullParser.getAttributeValue("http://www.w3.org/ns/ttml#parameter", "cellResolution");
        if (attributeValue == null) {
            return dn60Var;
        }
        Matcher matcher = t.matcher(attributeValue);
        if (!matcher.matches()) {
            nba1.e();
            return dn60Var;
        }
        try {
            String group = matcher.group(1);
            group.getClass();
            int parseInt = Integer.parseInt(group);
            String group2 = matcher.group(2);
            group2.getClass();
            int parseInt2 = Integer.parseInt(group2);
            if (parseInt != 0 && parseInt2 != 0) {
                return new dn60(parseInt2, 16, (byte) 0);
            }
            throw new w23("Invalid cell resolution " + parseInt + " " + parseInt2);
        } catch (NumberFormatException unused) {
            nba1.e();
            return dn60Var;
        }
    }

    public static nj11 h(XmlPullParser xmlPullParser) {
        float f;
        String attributeValue = xmlPullParser.getAttributeValue("http://www.w3.org/ns/ttml#parameter", "frameRate");
        int parseInt = attributeValue != null ? Integer.parseInt(attributeValue) : 30;
        String attributeValue2 = xmlPullParser.getAttributeValue("http://www.w3.org/ns/ttml#parameter", "frameRateMultiplier");
        if (attributeValue2 != null) {
            int i = rf71.a;
            if (attributeValue2.split(" ", -1).length != 2) {
                throw new w23("frameRateMultiplier doesn't have 2 parts");
            }
            f = Integer.parseInt(r2[0]) / Integer.parseInt(r2[1]);
        } else {
            f = 1.0f;
        }
        nj11 nj11Var = u;
        int i2 = nj11Var.b;
        String attributeValue3 = xmlPullParser.getAttributeValue("http://www.w3.org/ns/ttml#parameter", "subFrameRate");
        if (attributeValue3 != null) {
            i2 = Integer.parseInt(attributeValue3);
        }
        int i3 = nj11Var.c;
        String attributeValue4 = xmlPullParser.getAttributeValue("http://www.w3.org/ns/ttml#parameter", "tickRate");
        if (attributeValue4 != null) {
            i3 = Integer.parseInt(attributeValue4);
        }
        return new nj11(parseInt * f, i2, i3);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    public static do81 i(XmlPullParser xmlPullParser, do81 do81Var, HashMap hashMap, nj11 nj11Var) {
        long j;
        char c;
        String[] split;
        int attributeCount = xmlPullParser.getAttributeCount();
        String[] strArr = null;
        ex81 j2 = j(xmlPullParser, null);
        String str = null;
        String str2 = "";
        long j3 = -9223372036854775807L;
        long j4 = -9223372036854775807L;
        long j5 = -9223372036854775807L;
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
                    j5 = f(attributeValue, nj11Var);
                    break;
                case 2:
                    j4 = f(attributeValue, nj11Var);
                    break;
                case 3:
                    j3 = f(attributeValue, nj11Var);
                    break;
                case 4:
                    String trim = attributeValue.trim();
                    if (trim.isEmpty()) {
                        split = new String[0];
                    } else {
                        int i2 = rf71.a;
                        split = trim.split("\\s+", -1);
                    }
                    if (split.length > 0) {
                        strArr = split;
                        break;
                    }
                    break;
                case 5:
                    if (attributeValue.startsWith(ShimmerDivHandler.NUMBER_SING)) {
                        str = attributeValue.substring(1);
                        break;
                    }
                    break;
            }
        }
        if (do81Var != null) {
            long j6 = do81Var.d;
            if (j6 != -9223372036854775807L) {
                if (j3 != -9223372036854775807L) {
                    j3 += j6;
                }
                if (j4 != -9223372036854775807L) {
                    j4 += j6;
                }
            }
        }
        if (j4 == -9223372036854775807L) {
            if (j5 != -9223372036854775807L) {
                j4 = j3 + j5;
            } else if (do81Var != null) {
                long j7 = do81Var.e;
                if (j7 != -9223372036854775807L) {
                    j = j7;
                    return new do81(xmlPullParser.getName(), null, j3, j, j2, strArr, str2, str, do81Var);
                }
            }
        }
        j = j4;
        return new do81(xmlPullParser.getName(), null, j3, j, j2, strArr, str2, str, do81Var);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:238:0x0480, code lost:
    
        if (r5.equals("start") == false) goto L282;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static ex81 j(XmlPullParser xmlPullParser, ex81 ex81Var) {
        char c;
        char c2;
        char c3;
        String str;
        char c4;
        int attributeCount = xmlPullParser.getAttributeCount();
        ex81 ex81Var2 = ex81Var;
        for (int i = 0; i < attributeCount; i++) {
            String attributeValue = xmlPullParser.getAttributeValue(i);
            String attributeName = xmlPullParser.getAttributeName(i);
            attributeName.getClass();
            switch (attributeName.hashCode()) {
                case -1550943582:
                    if (attributeName.equals("fontStyle")) {
                        c = 0;
                        break;
                    }
                    c = 65535;
                    break;
                case -1224696685:
                    if (attributeName.equals("fontFamily")) {
                        c = 1;
                        break;
                    }
                    c = 65535;
                    break;
                case -1065511464:
                    if (attributeName.equals("textAlign")) {
                        c = 2;
                        break;
                    }
                    c = 65535;
                    break;
                case -879295043:
                    if (attributeName.equals("textDecoration")) {
                        c = 3;
                        break;
                    }
                    c = 65535;
                    break;
                case -734428249:
                    if (attributeName.equals("fontWeight")) {
                        c = 4;
                        break;
                    }
                    c = 65535;
                    break;
                case 3355:
                    if (attributeName.equals("id")) {
                        c = 5;
                        break;
                    }
                    c = 65535;
                    break;
                case 3511770:
                    if (attributeName.equals("ruby")) {
                        c = 6;
                        break;
                    }
                    c = 65535;
                    break;
                case 94842723:
                    if (attributeName.equals("color")) {
                        c = 7;
                        break;
                    }
                    c = 65535;
                    break;
                case 109403361:
                    if (attributeName.equals("shear")) {
                        c = '\b';
                        break;
                    }
                    c = 65535;
                    break;
                case 110138194:
                    if (attributeName.equals("textCombine")) {
                        c = '\t';
                        break;
                    }
                    c = 65535;
                    break;
                case 365601008:
                    if (attributeName.equals("fontSize")) {
                        c = '\n';
                        break;
                    }
                    c = 65535;
                    break;
                case 921125321:
                    if (attributeName.equals("textEmphasis")) {
                        c = 11;
                        break;
                    }
                    c = 65535;
                    break;
                case 1115953443:
                    if (attributeName.equals("rubyPosition")) {
                        c = '\f';
                        break;
                    }
                    c = 65535;
                    break;
                case 1287124693:
                    if (attributeName.equals(UrbanAdsBottomSheetFragment.BACKGROUND_COLOR)) {
                        c = HexString.LF;
                        break;
                    }
                    c = 65535;
                    break;
                case 1754920356:
                    if (attributeName.equals("multiRowAlign")) {
                        c = 14;
                        break;
                    }
                    c = 65535;
                    break;
                default:
                    c = 65535;
                    break;
            }
            Layout.Alignment alignment = null;
            Layout.Alignment alignment2 = null;
            r16 = null;
            ww81 ww81Var = null;
            switch (c) {
                case 0:
                    ex81Var2 = k(ex81Var2);
                    ex81Var2.i = "italic".equalsIgnoreCase(attributeValue) ? 1 : 0;
                    break;
                case 1:
                    ex81Var2 = k(ex81Var2);
                    ex81Var2.a = attributeValue;
                    break;
                case 2:
                    char c5 = 4;
                    ex81Var2 = k(ex81Var2);
                    String a = tea1.a(attributeValue);
                    a.getClass();
                    switch (a.hashCode()) {
                        case -1364013995:
                            if (a.equals("center")) {
                                c5 = 0;
                                break;
                            }
                            c5 = 65535;
                            break;
                        case 100571:
                            if (a.equals("end")) {
                                c5 = 1;
                                break;
                            }
                            c5 = 65535;
                            break;
                        case 3317767:
                            if (a.equals("left")) {
                                c5 = 2;
                                break;
                            }
                            c5 = 65535;
                            break;
                        case 108511772:
                            if (a.equals("right")) {
                                c5 = 3;
                                break;
                            }
                            c5 = 65535;
                            break;
                        case 109757538:
                            break;
                        default:
                            c5 = 65535;
                            break;
                    }
                    switch (c5) {
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
                    ex81Var2.o = alignment;
                    break;
                case 3:
                    String a2 = tea1.a(attributeValue);
                    a2.getClass();
                    switch (a2.hashCode()) {
                        case -1461280213:
                            if (a2.equals("nounderline")) {
                                c2 = 0;
                                break;
                            }
                            c2 = 65535;
                            break;
                        case -1026963764:
                            if (a2.equals("underline")) {
                                c2 = 1;
                                break;
                            }
                            c2 = 65535;
                            break;
                        case 913457136:
                            if (a2.equals("nolinethrough")) {
                                c2 = 2;
                                break;
                            }
                            c2 = 65535;
                            break;
                        case 1679736913:
                            if (a2.equals("linethrough")) {
                                c2 = 3;
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
                            ex81Var2 = k(ex81Var2);
                            ex81Var2.g = 0;
                            break;
                        case 1:
                            ex81Var2 = k(ex81Var2);
                            ex81Var2.g = 1;
                            break;
                        case 2:
                            ex81Var2 = k(ex81Var2);
                            ex81Var2.f = 0;
                            break;
                        case 3:
                            ex81Var2 = k(ex81Var2);
                            ex81Var2.f = 1;
                            break;
                    }
                case 4:
                    ex81Var2 = k(ex81Var2);
                    ex81Var2.h = "bold".equalsIgnoreCase(attributeValue) ? 1 : 0;
                    break;
                case 5:
                    if ("style".equals(xmlPullParser.getName())) {
                        ex81Var2 = k(ex81Var2);
                        ex81Var2.l = attributeValue;
                        break;
                    } else {
                        break;
                    }
                case 6:
                    String a3 = tea1.a(attributeValue);
                    a3.getClass();
                    switch (a3.hashCode()) {
                        case -618561360:
                            if (a3.equals("baseContainer")) {
                                c3 = 0;
                                break;
                            }
                            c3 = 65535;
                            break;
                        case -410956671:
                            if (a3.equals("container")) {
                                c3 = 1;
                                break;
                            }
                            c3 = 65535;
                            break;
                        case -250518009:
                            if (a3.equals("delimiter")) {
                                c3 = 2;
                                break;
                            }
                            c3 = 65535;
                            break;
                        case -136074796:
                            if (a3.equals("textContainer")) {
                                c3 = 3;
                                break;
                            }
                            c3 = 65535;
                            break;
                        case 3016401:
                            if (a3.equals("base")) {
                                c3 = 4;
                                break;
                            }
                            c3 = 65535;
                            break;
                        case 3556653:
                            if (a3.equals("text")) {
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
                            ex81Var2 = k(ex81Var2);
                            ex81Var2.m = 2;
                            break;
                        case 1:
                            ex81Var2 = k(ex81Var2);
                            ex81Var2.m = 1;
                            break;
                        case 2:
                            ex81Var2 = k(ex81Var2);
                            ex81Var2.m = 4;
                            break;
                        case 3:
                        case 5:
                            ex81Var2 = k(ex81Var2);
                            ex81Var2.m = 3;
                            break;
                    }
                case 7:
                    ex81Var2 = k(ex81Var2);
                    try {
                        ex81Var2.b = y291.a(attributeValue, false);
                        ex81Var2.c = true;
                        break;
                    } catch (IllegalArgumentException unused) {
                        nba1.e();
                        break;
                    }
                case '\b':
                    ex81 k = k(ex81Var2);
                    Matcher matcher = q.matcher(attributeValue);
                    float f = Float.MAX_VALUE;
                    if (matcher.matches()) {
                        try {
                            String group = matcher.group(1);
                            group.getClass();
                            f = Math.min(100.0f, Math.max(-100.0f, Float.parseFloat(group)));
                        } catch (NumberFormatException e) {
                            nba1.b("Failed to parse shear: " + attributeValue, e);
                            nba1.e();
                        }
                    } else {
                        nba1.e();
                    }
                    k.s = f;
                    ex81Var2 = k;
                    break;
                case '\t':
                    String a4 = tea1.a(attributeValue);
                    a4.getClass();
                    if (a4.equals("all")) {
                        ex81Var2 = k(ex81Var2);
                        ex81Var2.q = 1;
                        break;
                    } else if (a4.equals("none")) {
                        ex81Var2 = k(ex81Var2);
                        ex81Var2.q = 0;
                        break;
                    } else {
                        break;
                    }
                case '\n':
                    try {
                        ex81Var2 = k(ex81Var2);
                        l(attributeValue, ex81Var2);
                        break;
                    } catch (w23 unused2) {
                        nba1.e();
                        break;
                    }
                case 11:
                    ex81Var2 = k(ex81Var2);
                    Pattern pattern = ww81.a;
                    if (attributeValue != null) {
                        String a5 = tea1.a(attributeValue.trim());
                        if (!a5.isEmpty()) {
                            String[] split = TextUtils.split(a5, ww81.a);
                            int length = split.length;
                            y31 l = length != 0 ? length != 1 ? y31.l(split.length, (Object[]) split.clone()) : new ay2(split[0]) : cl2.C;
                            y31 y31Var = ww81.e;
                            if (y31Var == null) {
                                ny61.t("set1");
                                return null;
                            }
                            if (l == null) {
                                ny61.t("set2");
                                return null;
                            }
                            f081 f081Var = new f081(new s381(y31Var, l));
                            String str2 = (String) (f081Var.hasNext() ? f081Var.next() : "outside");
                            int hashCode = str2.hashCode();
                            if (hashCode == -1392885889) {
                                str2.equals("before");
                            } else if (hashCode == -1106037339) {
                                str2.equals("outside");
                            } else if (hashCode == 92734940) {
                                str2.equals("after");
                            }
                            y31 y31Var2 = ww81.b;
                            if (y31Var2 == null) {
                                ny61.t("set1");
                                return null;
                            }
                            s381 s381Var = new s381(y31Var2, l);
                            if (Collections.disjoint(l, y31Var2)) {
                                y31 y31Var3 = ww81.d;
                                if (y31Var3 == null) {
                                    ny61.t("set1");
                                    return null;
                                }
                                s381 s381Var2 = new s381(y31Var3, l);
                                y31 y31Var4 = ww81.c;
                                if (y31Var4 == null) {
                                    ny61.t("set1");
                                    return null;
                                }
                                s381 s381Var3 = new s381(y31Var4, l);
                                if (Collections.disjoint(l, y31Var3) && Collections.disjoint(l, y31Var4)) {
                                    ww81Var = new ww81();
                                } else {
                                    f081 f081Var2 = new f081(s381Var2);
                                    String str3 = (String) (f081Var2.hasNext() ? f081Var2.next() : "filled");
                                    int hashCode2 = str3.hashCode();
                                    if (hashCode2 != -1274499742 && hashCode2 == 3417674) {
                                        str3.equals(OpenList.STR_OPEN);
                                    }
                                    f081 f081Var3 = new f081(s381Var3);
                                    String str4 = (String) (f081Var3.hasNext() ? f081Var3.next() : "circle");
                                    int hashCode3 = str4.hashCode();
                                    if (hashCode3 != -1360216880) {
                                        if (hashCode3 != -905816648) {
                                            str = hashCode3 == 99657 ? "dot" : "sesame";
                                        }
                                        str4.equals(str);
                                    } else {
                                        str4.equals("circle");
                                    }
                                    ww81Var = new ww81();
                                }
                            } else {
                                String str5 = (String) new f081(s381Var).next();
                                int hashCode4 = str5.hashCode();
                                if (hashCode4 != 3005871 && hashCode4 == 3387192) {
                                    str5.equals("none");
                                }
                                ww81Var = new ww81();
                            }
                        }
                    }
                    ex81Var2.r = ww81Var;
                    break;
                case '\f':
                    String a6 = tea1.a(attributeValue);
                    a6.getClass();
                    if (a6.equals("before")) {
                        ex81Var2 = k(ex81Var2);
                        ex81Var2.n = 1;
                        break;
                    } else if (a6.equals("after")) {
                        ex81Var2 = k(ex81Var2);
                        ex81Var2.n = 2;
                        break;
                    } else {
                        break;
                    }
                case '\r':
                    ex81Var2 = k(ex81Var2);
                    try {
                        ex81Var2.d = y291.a(attributeValue, false);
                        ex81Var2.e = true;
                        break;
                    } catch (IllegalArgumentException unused3) {
                        nba1.e();
                        break;
                    }
                case 14:
                    ex81Var2 = k(ex81Var2);
                    String a7 = tea1.a(attributeValue);
                    a7.getClass();
                    switch (a7.hashCode()) {
                        case -1364013995:
                            if (a7.equals("center")) {
                                c4 = 0;
                                break;
                            }
                            c4 = 65535;
                            break;
                        case 100571:
                            if (a7.equals("end")) {
                                c4 = 1;
                                break;
                            }
                            c4 = 65535;
                            break;
                        case 3317767:
                            if (a7.equals("left")) {
                                c4 = 2;
                                break;
                            }
                            c4 = 65535;
                            break;
                        case 108511772:
                            if (a7.equals("right")) {
                                c4 = 3;
                                break;
                            }
                            c4 = 65535;
                            break;
                        case 109757538:
                            if (a7.equals("start")) {
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
                            alignment2 = Layout.Alignment.ALIGN_CENTER;
                            break;
                        case 1:
                        case 3:
                            alignment2 = Layout.Alignment.ALIGN_OPPOSITE;
                            break;
                        case 2:
                        case 4:
                            alignment2 = Layout.Alignment.ALIGN_NORMAL;
                            break;
                    }
                    ex81Var2.p = alignment2;
                    break;
            }
        }
        return ex81Var2;
    }

    public static ex81 k(ex81 ex81Var) {
        return ex81Var == null ? new ex81() : ex81Var;
    }

    public static void l(String str, ex81 ex81Var) {
        Matcher matcher;
        String group;
        int i = rf71.a;
        String[] split = str.split("\\s+", -1);
        int length = split.length;
        Pattern pattern = p;
        if (length == 1) {
            matcher = pattern.matcher(str);
        } else {
            if (split.length != 2) {
                throw new w23(oyr.m(split.length, Extension.DOT_CHAR, new StringBuilder("Invalid number of entries for fontSize: ")));
            }
            matcher = pattern.matcher(split[1]);
            nba1.e();
        }
        if (!matcher.matches()) {
            throw new w23(oyr.p("Invalid expression for fontSize: '", str, "'."));
        }
        group = matcher.group(3);
        group.getClass();
        switch (group) {
            case "%":
                ex81Var.j = 3;
                break;
            case "em":
                ex81Var.j = 2;
                break;
            case "px":
                ex81Var.j = 1;
                break;
            default:
                throw new w23(oyr.p("Invalid unit for fontSize: '", group, "'."));
        }
        String group2 = matcher.group(1);
        group2.getClass();
        ex81Var.k = Float.parseFloat(group2);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Removed duplicated region for block: B:60:0x0179  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static void m(XmlPullParser xmlPullParser, HashMap hashMap, dn60 dn60Var, i6z0 i6z0Var, HashMap hashMap2, HashMap hashMap3) {
        String a;
        float f;
        float f2;
        float parseFloat;
        float parseFloat2;
        dn60 dn60Var2;
        int i;
        String a2;
        int i2;
        String[] split;
        do {
            xmlPullParser.next();
            if (nja1.d(xmlPullParser, "style")) {
                String a3 = nja1.a(xmlPullParser, "style");
                ex81 j = j(xmlPullParser, new ex81());
                if (a3 != null) {
                    String trim = a3.trim();
                    if (trim.isEmpty()) {
                        split = new String[0];
                    } else {
                        int i3 = rf71.a;
                        split = trim.split("\\s+", -1);
                    }
                    for (String str : split) {
                        j.a((ex81) hashMap.get(str));
                    }
                }
                String str2 = j.l;
                if (str2 != null) {
                    hashMap.put(str2, j);
                }
            } else if (nja1.d(xmlPullParser, "region")) {
                String a4 = nja1.a(xmlPullParser, "id");
                qr81 qr81Var = null;
                if (a4 != null) {
                    String a5 = nja1.a(xmlPullParser, "origin");
                    if (a5 != null) {
                        Pattern pattern = r;
                        Matcher matcher = pattern.matcher(a5);
                        Pattern pattern2 = s;
                        Matcher matcher2 = pattern2.matcher(a5);
                        int i4 = 2;
                        if (matcher.matches()) {
                            try {
                                String group = matcher.group(1);
                                group.getClass();
                                float parseFloat3 = Float.parseFloat(group) / 100.0f;
                                String group2 = matcher.group(2);
                                group2.getClass();
                                float parseFloat4 = Float.parseFloat(group2) / 100.0f;
                                f = parseFloat3;
                                f2 = parseFloat4;
                            } catch (NumberFormatException unused) {
                                nba1.e();
                            }
                        } else if (!matcher2.matches()) {
                            nba1.e();
                        } else if (i6z0Var == null) {
                            nba1.e();
                        } else {
                            try {
                                String group3 = matcher2.group(1);
                                group3.getClass();
                                int parseInt = Integer.parseInt(group3);
                                String group4 = matcher2.group(2);
                                group4.getClass();
                                f = parseInt / i6z0Var.b;
                                f2 = Integer.parseInt(group4) / i6z0Var.c;
                            } catch (NumberFormatException unused2) {
                                nba1.e();
                            }
                        }
                        String a6 = nja1.a(xmlPullParser, "extent");
                        if (a6 != null) {
                            Matcher matcher3 = pattern.matcher(a6);
                            Matcher matcher4 = pattern2.matcher(a6);
                            if (matcher3.matches()) {
                                try {
                                    String group5 = matcher3.group(1);
                                    group5.getClass();
                                    parseFloat = Float.parseFloat(group5) / 100.0f;
                                    String group6 = matcher3.group(2);
                                    group6.getClass();
                                    parseFloat2 = Float.parseFloat(group6) / 100.0f;
                                } catch (NumberFormatException unused3) {
                                    nba1.e();
                                }
                            } else if (!matcher4.matches()) {
                                nba1.e();
                            } else if (i6z0Var == null) {
                                nba1.e();
                            } else {
                                try {
                                    String group7 = matcher4.group(1);
                                    group7.getClass();
                                    int parseInt2 = Integer.parseInt(group7);
                                    String group8 = matcher4.group(2);
                                    group8.getClass();
                                    float f3 = parseInt2 / i6z0Var.b;
                                    parseFloat2 = Integer.parseInt(group8) / i6z0Var.c;
                                    parseFloat = f3;
                                } catch (NumberFormatException unused4) {
                                    nba1.e();
                                }
                            }
                            String a7 = nja1.a(xmlPullParser, "displayAlign");
                            if (a7 != null) {
                                String a8 = tea1.a(a7);
                                a8.getClass();
                                if (a8.equals("center")) {
                                    f2 += parseFloat2 / 2.0f;
                                    dn60Var2 = dn60Var;
                                    i = 1;
                                } else if (a8.equals("after")) {
                                    f2 += parseFloat2;
                                    dn60Var2 = dn60Var;
                                    i = 2;
                                }
                                float f4 = 1.0f / dn60Var2.b;
                                a2 = nja1.a(xmlPullParser, "writingMode");
                                if (a2 != null) {
                                    String a9 = tea1.a(a2);
                                    a9.getClass();
                                    switch (a9) {
                                        case "tb":
                                        case "tblr":
                                            i2 = i4;
                                            break;
                                        case "tbrl":
                                            i2 = 1;
                                            break;
                                    }
                                    qr81Var = new qr81(a4, f, f2, 0, i, parseFloat, parseFloat2, 1, f4, i2);
                                }
                                i4 = Integer.MIN_VALUE;
                                i2 = i4;
                                qr81Var = new qr81(a4, f, f2, 0, i, parseFloat, parseFloat2, 1, f4, i2);
                            }
                            dn60Var2 = dn60Var;
                            i = 0;
                            float f42 = 1.0f / dn60Var2.b;
                            a2 = nja1.a(xmlPullParser, "writingMode");
                            if (a2 != null) {
                            }
                            i4 = Integer.MIN_VALUE;
                            i2 = i4;
                            qr81Var = new qr81(a4, f, f2, 0, i, parseFloat, parseFloat2, 1, f42, i2);
                        } else {
                            nba1.e();
                        }
                    } else {
                        nba1.e();
                    }
                }
                if (qr81Var != null) {
                    hashMap2.put(qr81Var.a, qr81Var);
                }
            } else if (nja1.d(xmlPullParser, kju0.j)) {
                do {
                    xmlPullParser.next();
                    if (nja1.d(xmlPullParser, "image") && (a = nja1.a(xmlPullParser, "id")) != null) {
                        hashMap3.put(a, xmlPullParser.nextText());
                    }
                } while (!nja1.c(xmlPullParser, kju0.j));
            }
        } while (!nja1.c(xmlPullParser, "head"));
    }

    public static boolean n(String str) {
        return str.equals("tt") || str.equals("head") || str.equals("body") || str.equals("div") || str.equals("p") || str.equals("span") || str.equals("br") || str.equals("style") || str.equals("styling") || str.equals("layout") || str.equals("region") || str.equals(kju0.j) || str.equals("image") || str.equals(Constants.KEY_DATA) || str.equals("information");
    }

    public static i6z0 o(XmlPullParser xmlPullParser) {
        String a = nja1.a(xmlPullParser, "extent");
        if (a == null) {
            return null;
        }
        Matcher matcher = s.matcher(a);
        if (!matcher.matches()) {
            nba1.e();
            return null;
        }
        try {
            String group = matcher.group(1);
            group.getClass();
            int parseInt = Integer.parseInt(group);
            String group2 = matcher.group(2);
            group2.getClass();
            return new i6z0(parseInt, Integer.parseInt(group2), 16);
        } catch (NumberFormatException unused) {
            nba1.e();
            return null;
        }
    }

    @Override // defpackage.zt71
    public final fh81 c(int i, byte[] bArr, boolean z) {
        fh81 fh81Var;
        HashMap hashMap;
        HashMap hashMap2;
        HashMap hashMap3;
        fh81 fh81Var2 = null;
        try {
            try {
                XmlPullParser newPullParser = this.m.newPullParser();
                HashMap hashMap4 = new HashMap();
                HashMap hashMap5 = new HashMap();
                HashMap hashMap6 = new HashMap();
                hashMap5.put("", new qr81("", -3.4028235E38f, -3.4028235E38f, Integer.MIN_VALUE, Integer.MIN_VALUE, -3.4028235E38f, -3.4028235E38f, Integer.MIN_VALUE, -3.4028235E38f, Integer.MIN_VALUE));
                newPullParser.setInput(new ByteArrayInputStream(bArr, 0, i), null);
                ArrayDeque arrayDeque = new ArrayDeque();
                int eventType = newPullParser.getEventType();
                nj11 nj11Var = u;
                dn60 dn60Var = v;
                hlx0 hlx0Var = null;
                i6z0 i6z0Var = null;
                int i2 = 0;
                dn60 dn60Var2 = dn60Var;
                while (eventType != 1) {
                    do81 do81Var = (do81) arrayDeque.peek();
                    fh81Var = fh81Var2;
                    if (i2 == 0) {
                        try {
                            String name = newPullParser.getName();
                            HashMap hashMap7 = hashMap4;
                            if (eventType == 2) {
                                if ("tt".equals(name)) {
                                    nj11Var = h(newPullParser);
                                    dn60Var2 = g(newPullParser, dn60Var);
                                    i6z0Var = o(newPullParser);
                                }
                                nj11 nj11Var2 = nj11Var;
                                i6z0 i6z0Var2 = i6z0Var;
                                if (n(name)) {
                                    if ("head".equals(name)) {
                                        m(newPullParser, hashMap7, dn60Var2, i6z0Var2, hashMap5, hashMap6);
                                        hashMap = hashMap6;
                                        hashMap2 = hashMap5;
                                        hashMap3 = hashMap7;
                                    } else {
                                        hashMap = hashMap6;
                                        hashMap2 = hashMap5;
                                        hashMap3 = hashMap7;
                                        try {
                                            do81 i3 = i(newPullParser, do81Var, hashMap2, nj11Var2);
                                            arrayDeque.push(i3);
                                            if (do81Var != null) {
                                                if (do81Var.m == null) {
                                                    do81Var.m = new ArrayList();
                                                }
                                                do81Var.m.add(i3);
                                            }
                                        } catch (w23 e) {
                                            nba1.b("Suppressing parser error", e);
                                            nba1.e();
                                        }
                                    }
                                    i6z0Var = i6z0Var2;
                                    nj11Var = nj11Var2;
                                } else {
                                    nba1.d("TtmlDecoder", "Ignoring unsupported tag: " + newPullParser.getName());
                                    hashMap = hashMap6;
                                    hashMap2 = hashMap5;
                                    hashMap3 = hashMap7;
                                }
                                i6z0Var = i6z0Var2;
                                nj11Var = nj11Var2;
                                i2++;
                            } else {
                                hashMap = hashMap6;
                                hashMap2 = hashMap5;
                                hashMap3 = hashMap7;
                                if (eventType == 4) {
                                    do81Var.getClass();
                                    do81 c = do81.c(newPullParser.getText());
                                    if (do81Var.m == null) {
                                        do81Var.m = new ArrayList();
                                    }
                                    do81Var.m.add(c);
                                } else if (eventType == 3) {
                                    if (newPullParser.getName().equals("tt")) {
                                        do81 do81Var2 = (do81) arrayDeque.peek();
                                        do81Var2.getClass();
                                        hlx0Var = new hlx0(do81Var2, hashMap3, hashMap2, hashMap);
                                    }
                                    arrayDeque.pop();
                                }
                            }
                            newPullParser.next();
                            eventType = newPullParser.getEventType();
                            fh81Var2 = fh81Var;
                            hashMap4 = hashMap3;
                            hashMap5 = hashMap2;
                            hashMap6 = hashMap;
                        } catch (IOException e2) {
                            e = e2;
                            ny61.h("Unexpected error when reading input.", e);
                            return fh81Var;
                        }
                    } else {
                        hashMap = hashMap6;
                        hashMap2 = hashMap5;
                        hashMap3 = hashMap4;
                        if (eventType != 2) {
                            if (eventType == 3) {
                                i2--;
                            }
                            newPullParser.next();
                            eventType = newPullParser.getEventType();
                            fh81Var2 = fh81Var;
                            hashMap4 = hashMap3;
                            hashMap5 = hashMap2;
                            hashMap6 = hashMap;
                        }
                        i2++;
                        newPullParser.next();
                        eventType = newPullParser.getEventType();
                        fh81Var2 = fh81Var;
                        hashMap4 = hashMap3;
                        hashMap5 = hashMap2;
                        hashMap6 = hashMap;
                    }
                }
                fh81Var = fh81Var2;
                if (hlx0Var != null) {
                    return hlx0Var;
                }
                throw new w23("No TTML subtitles found");
            } catch (IOException e3) {
                e = e3;
                fh81Var = fh81Var2;
            }
        } catch (XmlPullParserException e4) {
            throw new w23("Unable to decode source", e4);
        }
    }
}
