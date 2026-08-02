package defpackage;

import android.net.Uri;
import android.text.TextUtils;
import android.util.Base64;
import android.util.Pair;
import android.util.Xml;
import java.io.ByteArrayOutputStream;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import org.webrtc.MediaStreamTrack;
import org.xml.sax.helpers.DefaultHandler;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;
import org.xmlpull.v1.XmlPullParserFactory;
import org.xmlpull.v1.XmlSerializer;
import ru.CryptoPro.JCSP.api.bio.CspBioProgressConstants;
import ru.CryptoPro.JCSP.tools.common.window.ipc.RemoteBioParameters;
import ru.cprocsp.ACSP.tools.config.ConfigConstants;
import ru.yandex.video.m3.player.utils.DRMInfoProvider;
import yads.aa2;
import yads.jk0;
import yads.kk0;
import yads.nm0;
import yads.t31;
import yads.wk2;

/* loaded from: classes7.dex */
public final class tn81 extends DefaultHandler implements ql61 {
    public static final Pattern b = Pattern.compile("(\\d+)(?:/(\\d+))?");
    public static final Pattern c = Pattern.compile("CC([1-4])=.*");
    public static final Pattern w = Pattern.compile("([1-9]|[1-5][0-9]|6[0-3])=.*");
    public static final int[] x = {-1, 1, 2, 3, 4, 5, 6, 8, 2, 3, 4, 7, 8, 24, 8, 12, 10, 12, 14, 12, 14};
    public final XmlPullParserFactory a;

    public tn81() {
        try {
            this.a = XmlPullParserFactory.newInstance();
        } catch (XmlPullParserException e) {
            ny61.n("Couldn't create XmlPullParserFactory instance", e);
            throw null;
        }
    }

    public static long b(XmlPullParser xmlPullParser, long j) {
        String attributeValue = xmlPullParser.getAttributeValue(null, "availabilityTimeOffset");
        return attributeValue == null ? j : "INF".equals(attributeValue) ? ConfigConstants.VAL_WARNING_2001_VALUE_DISABLED : (long) (Float.parseFloat(attributeValue) * 1000000.0f);
    }

    public static long c(XmlPullParser xmlPullParser, String str, long j) {
        String attributeValue = xmlPullParser.getAttributeValue(null, str);
        if (attributeValue == null) {
            return j;
        }
        Matcher matcher = rf71.h.matcher(attributeValue);
        if (!matcher.matches()) {
            return (long) (Double.parseDouble(attributeValue) * 3600.0d * 1000.0d);
        }
        boolean isEmpty = TextUtils.isEmpty(matcher.group(1));
        String group = matcher.group(3);
        double parseDouble = group != null ? Double.parseDouble(group) * 3.1556908E7d : 0.0d;
        String group2 = matcher.group(5);
        double parseDouble2 = parseDouble + (group2 != null ? Double.parseDouble(group2) * 2629739.0d : 0.0d);
        String group3 = matcher.group(7);
        double parseDouble3 = parseDouble2 + (group3 != null ? Double.parseDouble(group3) * 86400.0d : 0.0d);
        String group4 = matcher.group(10);
        double parseDouble4 = parseDouble3 + (group4 != null ? Double.parseDouble(group4) * 3600.0d : 0.0d);
        String group5 = matcher.group(12);
        double parseDouble5 = parseDouble4 + (group5 != null ? Double.parseDouble(group5) * 60.0d : 0.0d);
        String group6 = matcher.group(14);
        long parseDouble6 = (long) ((parseDouble5 + (group6 != null ? Double.parseDouble(group6) : 0.0d)) * 1000.0d);
        return !isEmpty ? -parseDouble6 : parseDouble6;
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:31:0x00cc. Please report as an issue. */
    public static lg d(XmlPullParser xmlPullParser, String str, lg lgVar) {
        lg lgVar2;
        String str2;
        lg lgVar3 = null;
        String attributeValue = xmlPullParser.getAttributeValue(null, str);
        if (attributeValue == null) {
            return lgVar;
        }
        String[] strArr = new String[5];
        int[] iArr = new int[4];
        String[] strArr2 = new String[4];
        strArr[0] = "";
        int i = 0;
        int i2 = 0;
        while (i < attributeValue.length()) {
            int indexOf = attributeValue.indexOf("$", i);
            if (indexOf == -1) {
                strArr[i2] = strArr[i2] + attributeValue.substring(i);
                i = attributeValue.length();
            } else if (indexOf != i) {
                strArr[i2] = strArr[i2] + attributeValue.substring(i, indexOf);
                i = indexOf;
            } else if (attributeValue.startsWith("$$", i)) {
                strArr[i2] = oyr.t(new StringBuilder(), strArr[i2], "$");
                i += 2;
            } else {
                int i3 = i + 1;
                int indexOf2 = attributeValue.indexOf("$", i3);
                String substring = attributeValue.substring(i3, indexOf2);
                if (substring.equals("RepresentationID")) {
                    iArr[i2] = 1;
                    lgVar2 = lgVar3;
                } else {
                    int indexOf3 = substring.indexOf("%0");
                    if (indexOf3 != -1) {
                        str2 = substring.substring(indexOf3);
                        if (str2.endsWith("d")) {
                            lgVar2 = lgVar3;
                        } else {
                            lgVar2 = lgVar3;
                            if (!str2.endsWith(RemoteBioParameters.X) && !str2.endsWith("X")) {
                                str2 = str2.concat("d");
                            }
                        }
                        substring = substring.substring(0, indexOf3);
                    } else {
                        lgVar2 = lgVar3;
                        str2 = "%01d";
                    }
                    switch (substring) {
                        case "Number":
                            iArr[i2] = 2;
                            break;
                        case "Time":
                            iArr[i2] = 4;
                            break;
                        case "Bandwidth":
                            iArr[i2] = 3;
                            break;
                        default:
                            ny61.g("Invalid template: ".concat(attributeValue));
                            return lgVar2;
                    }
                    strArr2[i2] = str2;
                }
                i2++;
                strArr[i2] = "";
                i = indexOf2 + 1;
                lgVar3 = lgVar2;
            }
        }
        return new lg(strArr, iArr, strArr2, i2);
    }

    public static ArrayList e(XmlPullParser xmlPullParser, long j, long j2) {
        long j3;
        ArrayList arrayList = new ArrayList();
        long j4 = 0;
        long j5 = -9223372036854775807L;
        boolean z = false;
        int i = 0;
        do {
            xmlPullParser.next();
            if (nja1.d(xmlPullParser, "S")) {
                String attributeValue = xmlPullParser.getAttributeValue(null, "t");
                long parseLong = attributeValue == null ? -9223372036854775807L : Long.parseLong(attributeValue);
                if (z) {
                    int i2 = i;
                    j3 = parseLong;
                    j4 = a(arrayList, j4, j5, i2, j3);
                } else {
                    j3 = parseLong;
                }
                if (j3 != -9223372036854775807L) {
                    j4 = j3;
                }
                String attributeValue2 = xmlPullParser.getAttributeValue(null, "d");
                j5 = attributeValue2 == null ? -9223372036854775807L : Long.parseLong(attributeValue2);
                String attributeValue3 = xmlPullParser.getAttributeValue(null, "r");
                i = attributeValue3 == null ? 0 : Integer.parseInt(attributeValue3);
                z = true;
            } else {
                m(xmlPullParser);
            }
        } while (!nja1.c(xmlPullParser, "SegmentTimeline"));
        if (!z) {
            return arrayList;
        }
        a(arrayList, j4, j5, i, rf71.h(j2, j, 1000L));
        return arrayList;
    }

    public static ArrayList f(XmlPullParser xmlPullParser, ArrayList arrayList, boolean z) {
        String attributeValue = xmlPullParser.getAttributeValue(null, "dvb:priority");
        int parseInt = attributeValue != null ? Integer.parseInt(attributeValue) : z ? 1 : Integer.MIN_VALUE;
        String attributeValue2 = xmlPullParser.getAttributeValue(null, "dvb:weight");
        int parseInt2 = attributeValue2 != null ? Integer.parseInt(attributeValue2) : 1;
        String attributeValue3 = xmlPullParser.getAttributeValue(null, "serviceLocation");
        String str = "";
        do {
            xmlPullParser.next();
            if (xmlPullParser.getEventType() == 4) {
                str = xmlPullParser.getText();
            } else {
                m(xmlPullParser);
            }
        } while (!nja1.c(xmlPullParser, "BaseURL"));
        if (str != null && cia1.c(str)[0] != -1) {
            if (attributeValue3 == null) {
                attributeValue3 = str;
            }
            return mia1.a(new ik71(parseInt, parseInt2, str, attributeValue3));
        }
        ArrayList arrayList2 = new ArrayList();
        for (int i = 0; i < arrayList.size(); i++) {
            ik71 ik71Var = (ik71) arrayList.get(i);
            String a = cia1.a(ik71Var.a, str);
            String str2 = attributeValue3 == null ? a : attributeValue3;
            if (z) {
                parseInt = ik71Var.c;
                parseInt2 = ik71Var.d;
                str2 = ik71Var.b;
            }
            arrayList2.add(new ik71(parseInt, parseInt2, a, str2));
        }
        return arrayList2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1, types: [java.util.List] */
    public static ex71 g(XmlPullParser xmlPullParser, ex71 ex71Var, long j, long j2, long j3, long j4, long j5) {
        long j6 = ex71Var != null ? ex71Var.b : 1L;
        List list = null;
        String attributeValue = xmlPullParser.getAttributeValue(null, "timescale");
        if (attributeValue != null) {
            j6 = Long.parseLong(attributeValue);
        }
        long j7 = j6;
        long j8 = ex71Var != null ? ex71Var.c : 0L;
        String attributeValue2 = xmlPullParser.getAttributeValue(null, "presentationTimeOffset");
        if (attributeValue2 != null) {
            j8 = Long.parseLong(attributeValue2);
        }
        long j9 = j8;
        long j10 = ex71Var != null ? ex71Var.e : -9223372036854775807L;
        String attributeValue3 = xmlPullParser.getAttributeValue(null, "duration");
        if (attributeValue3 != null) {
            j10 = Long.parseLong(attributeValue3);
        }
        long j11 = j10;
        long j12 = ex71Var != null ? ex71Var.d : 1L;
        String attributeValue4 = xmlPullParser.getAttributeValue(null, "startNumber");
        if (attributeValue4 != null) {
            j12 = Long.parseLong(attributeValue4);
        }
        long j13 = j12;
        long j14 = j4 == -9223372036854775807L ? j3 : j4;
        long j15 = j14 == ConfigConstants.VAL_WARNING_2001_VALUE_DISABLED ? -9223372036854775807L : j14;
        of81 of81Var = null;
        ArrayList arrayList = null;
        do {
            xmlPullParser.next();
            if (nja1.d(xmlPullParser, "Initialization")) {
                of81Var = j(xmlPullParser, "sourceURL", "range");
            } else if (nja1.d(xmlPullParser, "SegmentTimeline")) {
                arrayList = e(xmlPullParser, j7, j2);
            } else if (nja1.d(xmlPullParser, "SegmentURL")) {
                if (list == null) {
                    list = new ArrayList();
                }
                list.add(j(xmlPullParser, "media", "mediaRange"));
            } else {
                m(xmlPullParser);
            }
        } while (!nja1.c(xmlPullParser, "SegmentList"));
        if (ex71Var != null) {
            if (of81Var == null) {
                of81Var = ex71Var.a;
            }
            if (arrayList == null) {
                arrayList = ex71Var.f;
            }
            if (list == null) {
                list = ex71Var.j;
            }
        }
        return new ex71(of81Var, j7, j9, j13, j11, arrayList, j15, list, rf71.g(j5), rf71.g(j));
    }

    public static d081 h(XmlPullParser xmlPullParser, d081 d081Var, List list, long j, long j2, long j3, long j4, long j5) {
        long j6;
        long j7 = d081Var != null ? d081Var.b : 1L;
        of81 of81Var = null;
        String attributeValue = xmlPullParser.getAttributeValue(null, "timescale");
        if (attributeValue != null) {
            j7 = Long.parseLong(attributeValue);
        }
        long j8 = j7;
        long j9 = d081Var != null ? d081Var.c : 0L;
        String attributeValue2 = xmlPullParser.getAttributeValue(null, "presentationTimeOffset");
        if (attributeValue2 != null) {
            j9 = Long.parseLong(attributeValue2);
        }
        long j10 = j9;
        long j11 = d081Var != null ? d081Var.e : -9223372036854775807L;
        String attributeValue3 = xmlPullParser.getAttributeValue(null, "duration");
        if (attributeValue3 != null) {
            j11 = Long.parseLong(attributeValue3);
        }
        long j12 = j11;
        long j13 = d081Var != null ? d081Var.d : 1L;
        String attributeValue4 = xmlPullParser.getAttributeValue(null, "startNumber");
        if (attributeValue4 != null) {
            j13 = Long.parseLong(attributeValue4);
        }
        long j14 = j13;
        int i = 0;
        while (true) {
            if (i >= list.size()) {
                j6 = -1;
                break;
            }
            ol81 ol81Var = (ol81) list.get(i);
            if (tea1.d("http://dashif.org/guidelines/last-segment-number", ol81Var.a)) {
                j6 = Long.parseLong(ol81Var.b);
                break;
            }
            i++;
        }
        long j15 = j6;
        long j16 = j4 == -9223372036854775807L ? j3 : j4;
        long j17 = j16 == ConfigConstants.VAL_WARNING_2001_VALUE_DISABLED ? -9223372036854775807L : j16;
        lg d = d(xmlPullParser, "media", d081Var != null ? d081Var.k : null);
        lg d2 = d(xmlPullParser, "initialization", d081Var != null ? d081Var.j : null);
        List list2 = null;
        do {
            xmlPullParser.next();
            if (nja1.d(xmlPullParser, "Initialization")) {
                of81Var = j(xmlPullParser, "sourceURL", "range");
            } else if (nja1.d(xmlPullParser, "SegmentTimeline")) {
                list2 = e(xmlPullParser, j8, j2);
            } else {
                m(xmlPullParser);
            }
        } while (!nja1.c(xmlPullParser, "SegmentTemplate"));
        if (d081Var != null) {
            if (of81Var == null) {
                of81Var = d081Var.a;
            }
            if (list2 == null) {
                list2 = d081Var.f;
            }
        }
        return new d081(of81Var, j8, j10, j14, j15, j12, list2, j17, d2, d, rf71.g(j5), rf71.g(j));
    }

    public static n681 i(XmlPullParser xmlPullParser, n681 n681Var) {
        long j = n681Var != null ? n681Var.b : 1L;
        String attributeValue = xmlPullParser.getAttributeValue(null, "timescale");
        if (attributeValue != null) {
            j = Long.parseLong(attributeValue);
        }
        long j2 = j;
        long j3 = n681Var != null ? n681Var.c : 0L;
        String attributeValue2 = xmlPullParser.getAttributeValue(null, "presentationTimeOffset");
        if (attributeValue2 != null) {
            j3 = Long.parseLong(attributeValue2);
        }
        long j4 = j3;
        long j5 = n681Var != null ? n681Var.d : 0L;
        long j6 = n681Var != null ? n681Var.e : 0L;
        String attributeValue3 = xmlPullParser.getAttributeValue(null, "indexRange");
        if (attributeValue3 != null) {
            String[] split = attributeValue3.split("-");
            j5 = Long.parseLong(split[0]);
            j6 = (Long.parseLong(split[1]) - j5) + 1;
        }
        long j7 = j6;
        long j8 = j5;
        of81 of81Var = n681Var != null ? n681Var.a : null;
        while (true) {
            xmlPullParser.next();
            if (nja1.d(xmlPullParser, "Initialization")) {
                of81Var = j(xmlPullParser, "sourceURL", "range");
            } else {
                m(xmlPullParser);
            }
            of81 of81Var2 = of81Var;
            if (nja1.c(xmlPullParser, "SegmentBase")) {
                return new n681(of81Var2, j2, j4, j8, j7);
            }
            of81Var = of81Var2;
        }
    }

    public static of81 j(XmlPullParser xmlPullParser, String str, String str2) {
        long j;
        String attributeValue = xmlPullParser.getAttributeValue(null, str);
        String attributeValue2 = xmlPullParser.getAttributeValue(null, str2);
        long j2 = -1;
        if (attributeValue2 != null) {
            String[] split = attributeValue2.split("-");
            j = Long.parseLong(split[0]);
            if (split.length == 2) {
                j2 = (Long.parseLong(split[1]) - j) + 1;
            }
        } else {
            j = 0;
        }
        return new of81(attributeValue, j, j2);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:413:0x0b0b, code lost:
    
        if ("audio/eac3-joc".equals(r3) != false) goto L405;
     */
    /* JADX WARN: Removed duplicated region for block: B:177:0x0382  */
    /* JADX WARN: Removed duplicated region for block: B:181:0x0396  */
    /* JADX WARN: Removed duplicated region for block: B:185:0x03ae  */
    /* JADX WARN: Removed duplicated region for block: B:193:0x03eb  */
    /* JADX WARN: Removed duplicated region for block: B:197:0x0459  */
    /* JADX WARN: Removed duplicated region for block: B:205:0x1220 A[LOOP:5: B:195:0x0450->B:205:0x1220, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:206:0x10d4 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:288:0x04b4  */
    /* JADX WARN: Removed duplicated region for block: B:308:0x0517  */
    /* JADX WARN: Removed duplicated region for block: B:309:0x0561  */
    /* JADX WARN: Removed duplicated region for block: B:379:0x07c1  */
    /* JADX WARN: Removed duplicated region for block: B:384:0x0809  */
    /* JADX WARN: Removed duplicated region for block: B:390:0x0f42 A[LOOP:11: B:382:0x0800->B:390:0x0f42, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:391:0x0a01 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:399:0x0aba  */
    /* JADX WARN: Removed duplicated region for block: B:418:0x0b24  */
    /* JADX WARN: Removed duplicated region for block: B:432:0x0b57 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:45:0x15fd A[LOOP:1: B:35:0x00cd->B:45:0x15fd, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:46:0x15c3 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:694:0x0b11  */
    /* JADX WARN: Removed duplicated region for block: B:739:0x086e  */
    /* JADX WARN: Removed duplicated region for block: B:775:0x07c6  */
    /* JADX WARN: Removed duplicated region for block: B:814:0x03ee  */
    /* JADX WARN: Removed duplicated region for block: B:817:0x039b  */
    /* JADX WARN: Removed duplicated region for block: B:818:0x0387  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static dh81 k(XmlPullParser xmlPullParser, Uri uri) {
        boolean z;
        boolean z2;
        ArrayList arrayList;
        long j;
        ArrayList arrayList2;
        boolean z3;
        ArrayList arrayList3;
        boolean z4;
        long j2;
        ArrayList arrayList4;
        ArrayList arrayList5;
        ArrayList arrayList6;
        long j3;
        String str;
        String str2;
        long j4;
        long j5;
        ArrayList arrayList7;
        String str3;
        String str4;
        String str5;
        long j6;
        String str6;
        ArrayList arrayList8;
        String str7;
        String str8;
        long j7;
        String str9;
        String str10;
        String str11;
        ArrayList arrayList9;
        int i;
        long j8;
        String str12;
        String str13;
        String str14;
        String attributeValue;
        Pattern pattern;
        String str15;
        float f;
        ArrayList arrayList10;
        String str16;
        ArrayList arrayList11;
        String str17;
        String str18;
        ArrayList arrayList12;
        ArrayList arrayList13;
        ArrayList arrayList14;
        ArrayList arrayList15;
        String str19;
        ArrayList arrayList16;
        long j9;
        int i2;
        long j10;
        ArrayList arrayList17;
        ArrayList arrayList18;
        String str20;
        String str21;
        ArrayList arrayList19;
        String str22;
        String str23;
        String str24;
        String str25;
        String str26;
        String str27;
        XmlPullParser xmlPullParser2;
        ArrayList arrayList20;
        int i3;
        ArrayList arrayList21;
        ArrayList arrayList22;
        String str28;
        String str29;
        long j11;
        long j12;
        String str30;
        String str31;
        String str32;
        ArrayList arrayList23;
        String str33;
        ArrayList arrayList24;
        String str34;
        int i4;
        String str35;
        int i5;
        String str36;
        String str37;
        ArrayList arrayList25;
        int parseInt;
        String str38;
        String str39;
        String str40;
        int parseInt2;
        String str41;
        int parseInt3;
        float f2;
        int parseInt4;
        ArrayList arrayList26;
        ArrayList arrayList27;
        ArrayList arrayList28;
        ArrayList arrayList29;
        ArrayList arrayList30;
        String str42;
        String str43;
        ea81 ea81Var;
        long j13;
        int i6;
        String str44;
        float f3;
        String str45;
        int i7;
        String str46;
        ArrayList arrayList31;
        long j14;
        String str47;
        String str48;
        int i8;
        String str49;
        float f4;
        ArrayList arrayList32;
        String str50;
        String str51;
        String str52;
        String str53;
        String str54;
        long j15;
        String str55;
        ArrayList arrayList33;
        long j16;
        ArrayList arrayList34;
        ArrayList arrayList35;
        String str56;
        long j17;
        ea81 ea81Var2;
        int i9;
        String str57;
        String str58;
        String str59;
        String b2;
        ArrayList arrayList36;
        String str60;
        int i10;
        long j18;
        String str61;
        String str62;
        int parseInt5;
        String str63;
        String str64;
        char c2;
        int i11;
        char c3;
        int i12;
        char c4;
        int i13;
        String str65;
        long j19;
        ArrayList arrayList37;
        x281 jw71Var;
        String str66;
        ArrayList arrayList38;
        String str67;
        String str68;
        String str69;
        String str70;
        XmlPullParser xmlPullParser3 = xmlPullParser;
        String[] strArr = new String[0];
        String str71 = null;
        String attributeValue2 = xmlPullParser3.getAttributeValue(null, "profiles");
        if (attributeValue2 != null) {
            strArr = attributeValue2.split(",");
        }
        int length = strArr.length;
        int i14 = 0;
        while (true) {
            z = true;
            if (i14 >= length) {
                z2 = false;
                break;
            }
            if (strArr[i14].startsWith("urn:dvb:dash:profile:dvb-dash:")) {
                z2 = true;
                break;
            }
            i14++;
        }
        String attributeValue3 = xmlPullParser3.getAttributeValue(null, "availabilityStartTime");
        long j20 = -9223372036854775807L;
        long B = attributeValue3 == null ? -9223372036854775807L : rf71.B(attributeValue3);
        long c5 = c(xmlPullParser3, "mediaPresentationDuration", -9223372036854775807L);
        long c6 = c(xmlPullParser3, "minBufferTime", -9223372036854775807L);
        boolean equals = "dynamic".equals(xmlPullParser3.getAttributeValue(null, "type"));
        long c7 = equals ? c(xmlPullParser3, "minimumUpdatePeriod", -9223372036854775807L) : -9223372036854775807L;
        long c8 = equals ? c(xmlPullParser3, "timeShiftBufferDepth", -9223372036854775807L) : -9223372036854775807L;
        long c9 = equals ? c(xmlPullParser3, "suggestedPresentationDelay", -9223372036854775807L) : -9223372036854775807L;
        String attributeValue4 = xmlPullParser3.getAttributeValue(null, "publishTime");
        long B2 = attributeValue4 == null ? -9223372036854775807L : rf71.B(attributeValue4);
        long j21 = equals ? 0L : -9223372036854775807L;
        ArrayList a = mia1.a(new ik71(z2 ? 1 : Integer.MIN_VALUE, 1, uri.toString(), uri.toString()));
        ArrayList arrayList39 = new ArrayList();
        ArrayList arrayList40 = new ArrayList();
        long j22 = equals ? -9223372036854775807L : 0L;
        boolean z5 = false;
        boolean z6 = false;
        um71 um71Var = null;
        rbh rbhVar = null;
        Uri uri2 = null;
        qh71 qh71Var = null;
        while (true) {
            xmlPullParser3.next();
            String str72 = "BaseURL";
            if (nja1.d(xmlPullParser3, "BaseURL")) {
                if (!z5) {
                    j21 = b(xmlPullParser3, j21);
                    z5 = z;
                }
                arrayList40.addAll(f(xmlPullParser3, a, z2));
            } else {
                String str73 = "lang";
                if (nja1.d(xmlPullParser3, "ProgramInformation")) {
                    String attributeValue5 = xmlPullParser3.getAttributeValue(str71, "moreInformationURL");
                    String str74 = attributeValue5 == null ? str71 : attributeValue5;
                    String attributeValue6 = xmlPullParser3.getAttributeValue(str71, "lang");
                    if (attributeValue6 == null) {
                        str68 = str71;
                        str69 = str68;
                        str70 = str69;
                        str67 = str70;
                    } else {
                        str67 = attributeValue6;
                        str68 = str71;
                        str69 = str68;
                        str70 = str69;
                    }
                    while (true) {
                        xmlPullParser3.next();
                        long j23 = j20;
                        if (nja1.d(xmlPullParser3, "Title")) {
                            str68 = xmlPullParser3.nextText();
                        } else if (nja1.d(xmlPullParser3, "Source")) {
                            str69 = xmlPullParser3.nextText();
                        } else if (nja1.d(xmlPullParser3, "Copyright")) {
                            str70 = xmlPullParser3.nextText();
                        } else {
                            m(xmlPullParser3);
                        }
                        String str75 = str68;
                        String str76 = str69;
                        String str77 = str70;
                        if (nja1.c(xmlPullParser3, "ProgramInformation")) {
                            um71 um71Var2 = new um71(str75, str76, str77, str74, str67);
                            arrayList = a;
                            j = j21;
                            arrayList2 = arrayList40;
                            z3 = z2;
                            arrayList3 = arrayList39;
                            um71Var = um71Var2;
                        } else {
                            str68 = str75;
                            str69 = str76;
                            str70 = str77;
                            j20 = j23;
                        }
                    }
                } else {
                    long j24 = j20;
                    if (nja1.d(xmlPullParser3, "UTCTiming")) {
                        arrayList = a;
                        j = j21;
                        arrayList2 = arrayList40;
                        rbhVar = new rbh(xmlPullParser3.getAttributeValue(str71, "schemeIdUri"), xmlPullParser3.getAttributeValue(str71, "value"), 12);
                        z3 = z2;
                        arrayList3 = arrayList39;
                    } else if (nja1.d(xmlPullParser3, "Location")) {
                        uri2 = Uri.parse(cia1.a(uri.toString(), xmlPullParser3.nextText()));
                    } else if (nja1.d(xmlPullParser3, "ServiceDescription")) {
                        float f5 = -3.4028235E38f;
                        float f6 = -3.4028235E38f;
                        long j25 = j24;
                        long j26 = j25;
                        long j27 = j26;
                        while (true) {
                            xmlPullParser3.next();
                            if (nja1.d(xmlPullParser3, "Latency")) {
                                arrayList = a;
                                String attributeValue7 = xmlPullParser3.getAttributeValue(null, "target");
                                j27 = attributeValue7 == null ? j24 : Long.parseLong(attributeValue7);
                                String attributeValue8 = xmlPullParser3.getAttributeValue(null, "min");
                                j25 = attributeValue8 == null ? j24 : Long.parseLong(attributeValue8);
                                String attributeValue9 = xmlPullParser3.getAttributeValue(null, CspBioProgressConstants.MAX);
                                j26 = attributeValue9 == null ? j24 : Long.parseLong(attributeValue9);
                            } else {
                                arrayList = a;
                                if (nja1.d(xmlPullParser3, "PlaybackRate")) {
                                    String attributeValue10 = xmlPullParser3.getAttributeValue(null, "min");
                                    f5 = attributeValue10 == null ? -3.4028235E38f : Float.parseFloat(attributeValue10);
                                    String attributeValue11 = xmlPullParser3.getAttributeValue(null, CspBioProgressConstants.MAX);
                                    f6 = attributeValue11 == null ? -3.4028235E38f : Float.parseFloat(attributeValue11);
                                }
                            }
                            float f7 = f5;
                            float f8 = f6;
                            long j28 = j25;
                            long j29 = j26;
                            long j30 = j27;
                            if (nja1.c(xmlPullParser3, "ServiceDescription")) {
                                j = j21;
                                arrayList2 = arrayList40;
                                z3 = z2;
                                arrayList3 = arrayList39;
                                qh71Var = new qh71(f7, f8, j30, j28, j29);
                            } else {
                                a = arrayList;
                                f5 = f7;
                                f6 = f8;
                                j27 = j30;
                                j25 = j28;
                                j26 = j29;
                            }
                        }
                    } else {
                        arrayList = a;
                        if (!nja1.d(xmlPullParser3, "Period") || z6) {
                            j = j21;
                            arrayList2 = arrayList40;
                            z3 = z2;
                            arrayList3 = arrayList39;
                            z4 = false;
                            j2 = c8;
                            m(xmlPullParser3);
                            j22 = j22;
                        } else {
                            ArrayList arrayList41 = !arrayList40.isEmpty() ? arrayList40 : arrayList;
                            String str78 = "id";
                            String str79 = "value";
                            String attributeValue12 = xmlPullParser3.getAttributeValue(null, "id");
                            long c10 = c(xmlPullParser3, "start", j22);
                            long j31 = B != j24 ? B + c10 : j24;
                            j = j21;
                            long c11 = c(xmlPullParser3, "duration", j24);
                            String str80 = "Period";
                            ArrayList arrayList42 = new ArrayList();
                            String str81 = "schemeIdUri";
                            ArrayList arrayList43 = new ArrayList();
                            ArrayList arrayList44 = new ArrayList();
                            String str82 = "duration";
                            long j32 = j24;
                            long j33 = j;
                            ea81 ea81Var3 = null;
                            boolean z7 = false;
                            while (true) {
                                xmlPullParser3.next();
                                if (nja1.d(xmlPullParser3, str72)) {
                                    if (!z7) {
                                        j33 = b(xmlPullParser3, j33);
                                        z7 = true;
                                    }
                                    arrayList44.addAll(f(xmlPullParser3, arrayList41, z2));
                                    arrayList6 = arrayList41;
                                    str4 = str78;
                                    j3 = j33;
                                    str = str72;
                                    z3 = z2;
                                    arrayList4 = arrayList44;
                                    arrayList5 = arrayList42;
                                    str2 = str73;
                                    str3 = str79;
                                    j6 = j31;
                                    j4 = c11;
                                    str6 = str80;
                                    str5 = str82;
                                    z4 = false;
                                    arrayList2 = arrayList40;
                                    j5 = j22;
                                    j2 = c8;
                                    arrayList7 = arrayList39;
                                } else {
                                    arrayList4 = arrayList44;
                                    arrayList5 = arrayList42;
                                    String str83 = "SegmentTemplate";
                                    if (nja1.d(xmlPullParser3, "AdaptationSet")) {
                                        if (arrayList4.isEmpty()) {
                                            arrayList6 = arrayList41;
                                        } else {
                                            arrayList6 = arrayList41;
                                            arrayList41 = arrayList4;
                                        }
                                        j3 = j33;
                                        String attributeValue13 = xmlPullParser3.getAttributeValue(null, str78);
                                        int parseInt6 = attributeValue13 == null ? -1 : Integer.parseInt(attributeValue13);
                                        String str84 = "contentType";
                                        String str85 = "AdaptationSet";
                                        String attributeValue14 = xmlPullParser3.getAttributeValue(null, "contentType");
                                        boolean isEmpty = TextUtils.isEmpty(attributeValue14);
                                        String str86 = "text";
                                        ArrayList arrayList45 = arrayList40;
                                        String str87 = MediaStreamTrack.VIDEO_TRACK_KIND;
                                        long j34 = j22;
                                        String str88 = MediaStreamTrack.AUDIO_TRACK_KIND;
                                        if (!isEmpty) {
                                            if (MediaStreamTrack.AUDIO_TRACK_KIND.equals(attributeValue14)) {
                                                i = 1;
                                            } else if (MediaStreamTrack.VIDEO_TRACK_KIND.equals(attributeValue14)) {
                                                i = 2;
                                            } else if ("text".equals(attributeValue14)) {
                                                i = 3;
                                            }
                                            int i15 = i;
                                            String attributeValue15 = xmlPullParser3.getAttributeValue(null, "mimeType");
                                            j8 = c8;
                                            String attributeValue16 = xmlPullParser3.getAttributeValue(null, "codecs");
                                            String attributeValue17 = xmlPullParser3.getAttributeValue(null, "width");
                                            int parseInt7 = attributeValue17 != null ? -1 : Integer.parseInt(attributeValue17);
                                            str12 = "SegmentList";
                                            String attributeValue18 = xmlPullParser3.getAttributeValue(null, "height");
                                            int parseInt8 = attributeValue18 != null ? -1 : Integer.parseInt(attributeValue18);
                                            str13 = "SegmentBase";
                                            str14 = "height";
                                            attributeValue = xmlPullParser3.getAttributeValue(null, "frameRate");
                                            Pattern pattern2 = b;
                                            if (attributeValue != null) {
                                                Matcher matcher = pattern2.matcher(attributeValue);
                                                if (matcher.matches()) {
                                                    pattern = pattern2;
                                                    int parseInt9 = Integer.parseInt(matcher.group(1));
                                                    str15 = "frameRate";
                                                    f = !TextUtils.isEmpty(matcher.group(2)) ? parseInt9 / Integer.parseInt(r14) : parseInt9;
                                                    float f9 = f;
                                                    String attributeValue19 = xmlPullParser3.getAttributeValue(null, "audioSamplingRate");
                                                    int parseInt10 = attributeValue19 == null ? -1 : Integer.parseInt(attributeValue19);
                                                    String attributeValue20 = xmlPullParser3.getAttributeValue(null, str73);
                                                    String attributeValue21 = xmlPullParser3.getAttributeValue(null, "label");
                                                    arrayList10 = new ArrayList();
                                                    str16 = attributeValue21;
                                                    arrayList11 = new ArrayList();
                                                    ArrayList arrayList46 = new ArrayList();
                                                    str17 = "audioSamplingRate";
                                                    ArrayList arrayList47 = new ArrayList();
                                                    str18 = "width";
                                                    arrayList12 = new ArrayList();
                                                    String str89 = "codecs";
                                                    ArrayList arrayList48 = new ArrayList();
                                                    String str90 = "mimeType";
                                                    arrayList13 = new ArrayList();
                                                    arrayList14 = new ArrayList();
                                                    arrayList15 = arrayList48;
                                                    String str91 = attributeValue20;
                                                    str19 = str78;
                                                    ArrayList arrayList49 = arrayList46;
                                                    arrayList16 = arrayList47;
                                                    ea81 ea81Var4 = ea81Var3;
                                                    long j35 = j32;
                                                    j9 = j3;
                                                    i2 = i15;
                                                    String str92 = null;
                                                    boolean z8 = false;
                                                    int i16 = -1;
                                                    while (true) {
                                                        xmlPullParser3.next();
                                                        if (nja1.d(xmlPullParser3, str72)) {
                                                            if (!z8) {
                                                                j9 = b(xmlPullParser3, j9);
                                                                z8 = true;
                                                            }
                                                            j10 = j9;
                                                            arrayList14.addAll(f(xmlPullParser3, arrayList41, z2));
                                                        } else {
                                                            j10 = j9;
                                                            if (nja1.d(xmlPullParser3, "ContentProtection")) {
                                                                Pair o = o(xmlPullParser3);
                                                                Object obj = o.first;
                                                                if (obj != null) {
                                                                    str92 = (String) obj;
                                                                }
                                                                Object obj2 = o.second;
                                                                if (obj2 != null) {
                                                                    arrayList10.add((jk0) obj2);
                                                                }
                                                            } else {
                                                                if (nja1.d(xmlPullParser3, "ContentComponent")) {
                                                                    String attributeValue22 = xmlPullParser3.getAttributeValue(null, str73);
                                                                    if (str91 == null) {
                                                                        str91 = attributeValue22;
                                                                    } else if (attributeValue22 != null && !str91.equals(attributeValue22)) {
                                                                        ny61.k();
                                                                        return null;
                                                                    }
                                                                    String attributeValue23 = xmlPullParser3.getAttributeValue(null, str84);
                                                                    if (!TextUtils.isEmpty(attributeValue23)) {
                                                                        if (str88.equals(attributeValue23)) {
                                                                            i13 = 1;
                                                                        } else if (str87.equals(attributeValue23)) {
                                                                            i13 = 2;
                                                                        } else if (str86.equals(attributeValue23)) {
                                                                            i13 = 3;
                                                                        }
                                                                        if (i2 != -1) {
                                                                            arrayList17 = arrayList41;
                                                                            str20 = str86;
                                                                            str21 = str84;
                                                                            arrayList19 = arrayList10;
                                                                            str31 = str87;
                                                                            str22 = str88;
                                                                            str = str72;
                                                                            z3 = z2;
                                                                            str3 = str79;
                                                                            j12 = j31;
                                                                            str5 = str82;
                                                                            arrayList2 = arrayList45;
                                                                            j5 = j34;
                                                                            str29 = str12;
                                                                            str24 = str14;
                                                                            arrayList20 = arrayList15;
                                                                            str34 = str16;
                                                                            arrayList24 = arrayList11;
                                                                            str25 = str17;
                                                                            str26 = str18;
                                                                            str27 = str19;
                                                                            arrayList18 = arrayList16;
                                                                            xmlPullParser2 = xmlPullParser3;
                                                                            arrayList21 = arrayList14;
                                                                            arrayList22 = arrayList12;
                                                                            str2 = str73;
                                                                            arrayList7 = arrayList39;
                                                                            str35 = str85;
                                                                            j2 = j8;
                                                                            str32 = str13;
                                                                            str28 = str15;
                                                                            arrayList23 = arrayList13;
                                                                            i4 = i13;
                                                                            j4 = c11;
                                                                            str33 = str83;
                                                                        } else {
                                                                            if (i13 != -1 && i2 != i13) {
                                                                                ny61.k();
                                                                                return null;
                                                                            }
                                                                            arrayList17 = arrayList41;
                                                                            str20 = str86;
                                                                            str21 = str84;
                                                                            arrayList19 = arrayList10;
                                                                            str31 = str87;
                                                                            str22 = str88;
                                                                            str = str72;
                                                                            z3 = z2;
                                                                            str3 = str79;
                                                                            j12 = j31;
                                                                            str5 = str82;
                                                                            str33 = str83;
                                                                            arrayList2 = arrayList45;
                                                                            j5 = j34;
                                                                            str29 = str12;
                                                                            str24 = str14;
                                                                            arrayList20 = arrayList15;
                                                                            arrayList24 = arrayList11;
                                                                            str25 = str17;
                                                                            str26 = str18;
                                                                            str27 = str19;
                                                                            arrayList18 = arrayList16;
                                                                            xmlPullParser2 = xmlPullParser3;
                                                                            arrayList21 = arrayList14;
                                                                            arrayList22 = arrayList12;
                                                                            str2 = str73;
                                                                            arrayList7 = arrayList39;
                                                                            str35 = str85;
                                                                            j2 = j8;
                                                                            str32 = str13;
                                                                            str28 = str15;
                                                                            arrayList23 = arrayList13;
                                                                            i4 = i2;
                                                                            j4 = c11;
                                                                            str34 = str16;
                                                                        }
                                                                    }
                                                                    i13 = -1;
                                                                    if (i2 != -1) {
                                                                    }
                                                                } else {
                                                                    if (nja1.d(xmlPullParser3, "Role")) {
                                                                        ArrayList arrayList50 = arrayList16;
                                                                        arrayList50.add(l(xmlPullParser3, "Role"));
                                                                        arrayList17 = arrayList41;
                                                                        str20 = str86;
                                                                        str21 = str84;
                                                                        arrayList19 = arrayList10;
                                                                        str31 = str87;
                                                                        str22 = str88;
                                                                        str = str72;
                                                                        str30 = str91;
                                                                        z3 = z2;
                                                                        arrayList18 = arrayList50;
                                                                        str2 = str73;
                                                                    } else {
                                                                        ArrayList arrayList51 = arrayList16;
                                                                        str2 = str73;
                                                                        String str93 = "AudioChannelConfiguration";
                                                                        if (nja1.d(xmlPullParser3, "AudioChannelConfiguration")) {
                                                                            arrayList17 = arrayList41;
                                                                            str20 = str86;
                                                                            str21 = str84;
                                                                            arrayList19 = arrayList10;
                                                                            str31 = str87;
                                                                            str22 = str88;
                                                                            str = str72;
                                                                            z3 = z2;
                                                                            i16 = n(xmlPullParser3);
                                                                            arrayList18 = arrayList51;
                                                                            str3 = str79;
                                                                            j12 = j31;
                                                                            str5 = str82;
                                                                            str33 = str83;
                                                                            arrayList2 = arrayList45;
                                                                            j5 = j34;
                                                                            str29 = str12;
                                                                            str32 = str13;
                                                                            str24 = str14;
                                                                            arrayList20 = arrayList15;
                                                                            arrayList24 = arrayList11;
                                                                            str25 = str17;
                                                                            str26 = str18;
                                                                            str27 = str19;
                                                                            xmlPullParser2 = xmlPullParser3;
                                                                            arrayList21 = arrayList14;
                                                                            arrayList22 = arrayList12;
                                                                            arrayList7 = arrayList39;
                                                                            str35 = str85;
                                                                            j2 = j8;
                                                                            str28 = str15;
                                                                            arrayList23 = arrayList13;
                                                                            i4 = i2;
                                                                            j4 = c11;
                                                                            str34 = str16;
                                                                        } else {
                                                                            arrayList17 = arrayList41;
                                                                            if (nja1.d(xmlPullParser3, "Accessibility")) {
                                                                                arrayList49.add(l(xmlPullParser3, "Accessibility"));
                                                                            } else if (nja1.d(xmlPullParser3, "EssentialProperty")) {
                                                                                arrayList12.add(l(xmlPullParser3, "EssentialProperty"));
                                                                            } else {
                                                                                arrayList18 = arrayList51;
                                                                                if (nja1.d(xmlPullParser3, "SupplementalProperty")) {
                                                                                    ArrayList arrayList52 = arrayList15;
                                                                                    arrayList52.add(l(xmlPullParser3, "SupplementalProperty"));
                                                                                    str20 = str86;
                                                                                    str21 = str84;
                                                                                    arrayList19 = arrayList10;
                                                                                    str31 = str87;
                                                                                    str22 = str88;
                                                                                    str = str72;
                                                                                    str30 = str91;
                                                                                    z3 = z2;
                                                                                    str3 = str79;
                                                                                    j12 = j31;
                                                                                    str5 = str82;
                                                                                    str23 = str85;
                                                                                    arrayList2 = arrayList45;
                                                                                    j5 = j34;
                                                                                    str29 = str12;
                                                                                    str32 = str13;
                                                                                    str24 = str14;
                                                                                    arrayList24 = arrayList11;
                                                                                    str25 = str17;
                                                                                    str26 = str18;
                                                                                    str27 = str19;
                                                                                    xmlPullParser2 = xmlPullParser3;
                                                                                    i3 = i2;
                                                                                    arrayList21 = arrayList14;
                                                                                    arrayList22 = arrayList12;
                                                                                    arrayList20 = arrayList52;
                                                                                    arrayList7 = arrayList39;
                                                                                    str33 = str83;
                                                                                    j2 = j8;
                                                                                    str28 = str15;
                                                                                    arrayList23 = arrayList13;
                                                                                    j11 = j35;
                                                                                    j4 = c11;
                                                                                    j35 = j11;
                                                                                    str34 = str16;
                                                                                    i4 = i3;
                                                                                    str91 = str30;
                                                                                    str35 = str23;
                                                                                } else {
                                                                                    ArrayList arrayList53 = arrayList15;
                                                                                    String str94 = "EssentialProperty";
                                                                                    String str95 = "SupplementalProperty";
                                                                                    String str96 = "Representation";
                                                                                    if (nja1.d(xmlPullParser3, "Representation")) {
                                                                                        if (arrayList14.isEmpty()) {
                                                                                            String str97 = str19;
                                                                                            i5 = i2;
                                                                                            str36 = str97;
                                                                                            str37 = "InbandEventStream";
                                                                                            arrayList25 = arrayList17;
                                                                                        } else {
                                                                                            String str98 = str19;
                                                                                            i5 = i2;
                                                                                            str36 = str98;
                                                                                            str37 = "InbandEventStream";
                                                                                            arrayList25 = arrayList14;
                                                                                        }
                                                                                        str20 = str86;
                                                                                        String str99 = "ContentProtection";
                                                                                        String attributeValue24 = xmlPullParser3.getAttributeValue(null, str36);
                                                                                        String str100 = str36;
                                                                                        String attributeValue25 = xmlPullParser3.getAttributeValue(null, "bandwidth");
                                                                                        if (attributeValue25 == null) {
                                                                                            str38 = str90;
                                                                                            parseInt = -1;
                                                                                        } else {
                                                                                            String str101 = str90;
                                                                                            parseInt = Integer.parseInt(attributeValue25);
                                                                                            str38 = str101;
                                                                                        }
                                                                                        String attributeValue26 = xmlPullParser3.getAttributeValue(null, str38);
                                                                                        String str102 = str89;
                                                                                        String str103 = str38;
                                                                                        String str104 = attributeValue26 == null ? attributeValue15 : attributeValue26;
                                                                                        String attributeValue27 = xmlPullParser3.getAttributeValue(null, str102);
                                                                                        String str105 = str102;
                                                                                        String str106 = str18;
                                                                                        String str107 = attributeValue27 == null ? attributeValue16 : attributeValue27;
                                                                                        String attributeValue28 = xmlPullParser3.getAttributeValue(null, str106);
                                                                                        if (attributeValue28 == null) {
                                                                                            String str108 = str14;
                                                                                            str39 = attributeValue24;
                                                                                            str40 = str108;
                                                                                            parseInt2 = parseInt7;
                                                                                        } else {
                                                                                            String str109 = str14;
                                                                                            str39 = attributeValue24;
                                                                                            str40 = str109;
                                                                                            parseInt2 = Integer.parseInt(attributeValue28);
                                                                                        }
                                                                                        String attributeValue29 = xmlPullParser3.getAttributeValue(null, str40);
                                                                                        if (attributeValue29 == null) {
                                                                                            str24 = str40;
                                                                                            str41 = str15;
                                                                                            parseInt3 = parseInt8;
                                                                                        } else {
                                                                                            str24 = str40;
                                                                                            str41 = str15;
                                                                                            parseInt3 = Integer.parseInt(attributeValue29);
                                                                                        }
                                                                                        str26 = str106;
                                                                                        String attributeValue30 = xmlPullParser3.getAttributeValue(null, str41);
                                                                                        if (attributeValue30 != null) {
                                                                                            Pattern pattern3 = pattern;
                                                                                            Matcher matcher2 = pattern3.matcher(attributeValue30);
                                                                                            if (matcher2.matches()) {
                                                                                                pattern = pattern3;
                                                                                                int parseInt11 = Integer.parseInt(matcher2.group(1));
                                                                                                str21 = str84;
                                                                                                f2 = !TextUtils.isEmpty(matcher2.group(2)) ? parseInt11 / Integer.parseInt(r2) : parseInt11;
                                                                                                String str110 = str17;
                                                                                                String attributeValue31 = xmlPullParser3.getAttributeValue(null, str110);
                                                                                                parseInt4 = attributeValue31 != null ? parseInt10 : Integer.parseInt(attributeValue31);
                                                                                                str28 = str41;
                                                                                                arrayList26 = new ArrayList();
                                                                                                ArrayList arrayList54 = new ArrayList();
                                                                                                arrayList27 = new ArrayList(arrayList12);
                                                                                                arrayList28 = new ArrayList(arrayList53);
                                                                                                arrayList29 = new ArrayList();
                                                                                                arrayList30 = arrayList53;
                                                                                                str25 = str110;
                                                                                                str42 = str87;
                                                                                                str43 = str88;
                                                                                                ea81Var = ea81Var4;
                                                                                                j13 = j35;
                                                                                                i6 = i16;
                                                                                                long j36 = j10;
                                                                                                boolean z9 = false;
                                                                                                str44 = null;
                                                                                                while (true) {
                                                                                                    xmlPullParser3.next();
                                                                                                    if (nja1.d(xmlPullParser3, str72)) {
                                                                                                        f3 = f2;
                                                                                                        if (nja1.d(xmlPullParser3, str93)) {
                                                                                                            i6 = n(xmlPullParser3);
                                                                                                        } else {
                                                                                                            String str111 = str13;
                                                                                                            if (nja1.d(xmlPullParser3, str111)) {
                                                                                                                str13 = str111;
                                                                                                                ea81Var = i(xmlPullParser3, (n681) ea81Var);
                                                                                                            } else {
                                                                                                                String str112 = str12;
                                                                                                                if (nja1.d(xmlPullParser3, str112)) {
                                                                                                                    arrayList21 = arrayList14;
                                                                                                                    str = str72;
                                                                                                                    long b3 = b(xmlPullParser3, j13);
                                                                                                                    str45 = str112;
                                                                                                                    i7 = parseInt4;
                                                                                                                    arrayList19 = arrayList10;
                                                                                                                    str46 = str91;
                                                                                                                    arrayList31 = arrayList29;
                                                                                                                    str3 = str79;
                                                                                                                    long j37 = j31;
                                                                                                                    long j38 = c11;
                                                                                                                    str5 = str82;
                                                                                                                    str47 = str85;
                                                                                                                    arrayList2 = arrayList45;
                                                                                                                    j5 = j34;
                                                                                                                    str48 = str111;
                                                                                                                    i8 = parseInt;
                                                                                                                    str27 = str100;
                                                                                                                    arrayList20 = arrayList30;
                                                                                                                    str49 = str43;
                                                                                                                    f4 = f3;
                                                                                                                    arrayList22 = arrayList12;
                                                                                                                    arrayList32 = arrayList25;
                                                                                                                    arrayList7 = arrayList39;
                                                                                                                    long j39 = j8;
                                                                                                                    str50 = str94;
                                                                                                                    str90 = str103;
                                                                                                                    str89 = str105;
                                                                                                                    str51 = str93;
                                                                                                                    str52 = str42;
                                                                                                                    ea81 g = g(xmlPullParser3, (ex71) ea81Var, j37, j38, j36, b3, j39);
                                                                                                                    j4 = j38;
                                                                                                                    j14 = j37;
                                                                                                                    z3 = z2;
                                                                                                                    str53 = str83;
                                                                                                                    str54 = str99;
                                                                                                                    arrayList35 = arrayList28;
                                                                                                                    ea81Var2 = g;
                                                                                                                    i9 = i6;
                                                                                                                    j16 = b3;
                                                                                                                    j15 = j39;
                                                                                                                    str55 = str37;
                                                                                                                } else {
                                                                                                                    str45 = str112;
                                                                                                                    i7 = parseInt4;
                                                                                                                    arrayList19 = arrayList10;
                                                                                                                    arrayList21 = arrayList14;
                                                                                                                    str = str72;
                                                                                                                    str46 = str91;
                                                                                                                    arrayList31 = arrayList29;
                                                                                                                    str3 = str79;
                                                                                                                    j14 = j31;
                                                                                                                    str5 = str82;
                                                                                                                    String str113 = str83;
                                                                                                                    str47 = str85;
                                                                                                                    arrayList2 = arrayList45;
                                                                                                                    j5 = j34;
                                                                                                                    str48 = str111;
                                                                                                                    i8 = parseInt;
                                                                                                                    str27 = str100;
                                                                                                                    arrayList20 = arrayList30;
                                                                                                                    str49 = str43;
                                                                                                                    f4 = f3;
                                                                                                                    arrayList22 = arrayList12;
                                                                                                                    arrayList32 = arrayList25;
                                                                                                                    arrayList7 = arrayList39;
                                                                                                                    long j40 = j8;
                                                                                                                    str50 = str94;
                                                                                                                    str90 = str103;
                                                                                                                    str89 = str105;
                                                                                                                    str51 = str93;
                                                                                                                    j4 = c11;
                                                                                                                    str52 = str42;
                                                                                                                    if (nja1.d(xmlPullParser3, str113)) {
                                                                                                                        j15 = j40;
                                                                                                                        long b4 = b(xmlPullParser3, j13);
                                                                                                                        str53 = str113;
                                                                                                                        z3 = z2;
                                                                                                                        long j41 = j36;
                                                                                                                        j36 = j41;
                                                                                                                        str55 = str37;
                                                                                                                        str54 = str99;
                                                                                                                        arrayList35 = arrayList28;
                                                                                                                        ea81Var2 = h(xmlPullParser3, (d081) ea81Var, arrayList20, j14, j4, j41, b4, j15);
                                                                                                                        i9 = i6;
                                                                                                                        j16 = b4;
                                                                                                                    } else {
                                                                                                                        str53 = str113;
                                                                                                                        z3 = z2;
                                                                                                                        str54 = str99;
                                                                                                                        j15 = j40;
                                                                                                                        if (nja1.d(xmlPullParser3, str54)) {
                                                                                                                            Pair o2 = o(xmlPullParser3);
                                                                                                                            Object obj3 = o2.first;
                                                                                                                            if (obj3 != null) {
                                                                                                                                str44 = (String) obj3;
                                                                                                                            }
                                                                                                                            Object obj4 = o2.second;
                                                                                                                            if (obj4 != null) {
                                                                                                                                arrayList33 = arrayList26;
                                                                                                                                arrayList33.add((jk0) obj4);
                                                                                                                            } else {
                                                                                                                                arrayList33 = arrayList26;
                                                                                                                            }
                                                                                                                            j16 = j13;
                                                                                                                            str55 = str37;
                                                                                                                            arrayList34 = arrayList27;
                                                                                                                            arrayList35 = arrayList28;
                                                                                                                            ea81Var2 = ea81Var;
                                                                                                                            i9 = i6;
                                                                                                                            str57 = str44;
                                                                                                                            long j42 = j14;
                                                                                                                            str56 = str96;
                                                                                                                            j17 = j42;
                                                                                                                            if (nja1.c(xmlPullParser3, str56)) {
                                                                                                                                int i17 = i9;
                                                                                                                                arrayList26 = arrayList33;
                                                                                                                                String str114 = str104;
                                                                                                                                long j43 = j15;
                                                                                                                                xmlPullParser3 = xmlPullParser;
                                                                                                                                arrayList28 = arrayList35;
                                                                                                                                arrayList27 = arrayList34;
                                                                                                                                str43 = str49;
                                                                                                                                str94 = str50;
                                                                                                                                str42 = str52;
                                                                                                                                str93 = str51;
                                                                                                                                arrayList25 = arrayList32;
                                                                                                                                arrayList39 = arrayList7;
                                                                                                                                z2 = z3;
                                                                                                                                arrayList12 = arrayList22;
                                                                                                                                arrayList30 = arrayList20;
                                                                                                                                i6 = i17;
                                                                                                                                c11 = j4;
                                                                                                                                j8 = j43;
                                                                                                                                str44 = str57;
                                                                                                                                str72 = str;
                                                                                                                                arrayList29 = arrayList31;
                                                                                                                                str91 = str46;
                                                                                                                                parseInt4 = i7;
                                                                                                                                str85 = str47;
                                                                                                                                str79 = str3;
                                                                                                                                str13 = str48;
                                                                                                                                str104 = str114;
                                                                                                                                arrayList45 = arrayList2;
                                                                                                                                j34 = j5;
                                                                                                                                ea81Var = ea81Var2;
                                                                                                                                str105 = str89;
                                                                                                                                str103 = str90;
                                                                                                                                j31 = j17;
                                                                                                                                j13 = j16;
                                                                                                                                parseInt = i8;
                                                                                                                                str82 = str5;
                                                                                                                                str100 = str27;
                                                                                                                                str83 = str53;
                                                                                                                                str96 = str56;
                                                                                                                                str99 = str54;
                                                                                                                                str37 = str55;
                                                                                                                                arrayList14 = arrayList21;
                                                                                                                                arrayList10 = arrayList19;
                                                                                                                                f2 = f4;
                                                                                                                                str12 = str45;
                                                                                                                            } else {
                                                                                                                                String str115 = "image";
                                                                                                                                if (str49.equals(g681.d(str104))) {
                                                                                                                                    if (str107 != null) {
                                                                                                                                        int i18 = rf71.a;
                                                                                                                                        for (String str116 : TextUtils.isEmpty(str107) ? new String[0] : str107.trim().split("(\\s*,\\s*)", -1)) {
                                                                                                                                            b2 = g681.b(str116);
                                                                                                                                            if (b2 != null && str49.equals(g681.d(b2))) {
                                                                                                                                                str58 = b2;
                                                                                                                                                str59 = str104;
                                                                                                                                                String str117 = "audio/eac3";
                                                                                                                                                if ("audio/eac3".equals(str58)) {
                                                                                                                                                    int i19 = 0;
                                                                                                                                                    while (true) {
                                                                                                                                                        str60 = "ec+3";
                                                                                                                                                        if (i19 < arrayList35.size()) {
                                                                                                                                                            ol81 ol81Var = (ol81) arrayList35.get(i19);
                                                                                                                                                            int i20 = i19;
                                                                                                                                                            String str118 = ol81Var.a;
                                                                                                                                                            String str119 = str117;
                                                                                                                                                            if ("tag:dolby.com,2018:dash:EC3_ExtensionType:2018".equals(str118)) {
                                                                                                                                                                arrayList36 = arrayList33;
                                                                                                                                                                if ("JOC".equals(ol81Var.b)) {
                                                                                                                                                                }
                                                                                                                                                            } else {
                                                                                                                                                                arrayList36 = arrayList33;
                                                                                                                                                            }
                                                                                                                                                            if (!"tag:dolby.com,2014:dash:DolbyDigitalPlusExtensionType:2014".equals(str118) || !"ec+3".equals(ol81Var.b)) {
                                                                                                                                                                i19 = i20 + 1;
                                                                                                                                                                str117 = str119;
                                                                                                                                                                arrayList33 = arrayList36;
                                                                                                                                                            }
                                                                                                                                                        } else {
                                                                                                                                                            arrayList36 = arrayList33;
                                                                                                                                                            str58 = str117;
                                                                                                                                                        }
                                                                                                                                                    }
                                                                                                                                                    str58 = "audio/eac3-joc";
                                                                                                                                                } else {
                                                                                                                                                    arrayList36 = arrayList33;
                                                                                                                                                }
                                                                                                                                                str60 = str107;
                                                                                                                                                i10 = 0;
                                                                                                                                                int i21 = 0;
                                                                                                                                                while (true) {
                                                                                                                                                    j18 = j15;
                                                                                                                                                    if (i10 < arrayList18.size()) {
                                                                                                                                                        ArrayList arrayList55 = arrayList18;
                                                                                                                                                        int i22 = i10;
                                                                                                                                                        ol81 ol81Var2 = (ol81) arrayList55.get(i10);
                                                                                                                                                        if (tea1.d("urn:mpeg:dash:role:2011", ol81Var2.a)) {
                                                                                                                                                            String str120 = ol81Var2.b;
                                                                                                                                                            i21 = ((str120 != null && (str120.equals("forced_subtitle") || str120.equals("forced-subtitle"))) ? 2 : 0) | i21;
                                                                                                                                                        }
                                                                                                                                                        i10 = i22 + 1;
                                                                                                                                                        arrayList18 = arrayList55;
                                                                                                                                                        j15 = j18;
                                                                                                                                                    } else {
                                                                                                                                                        ArrayList arrayList56 = arrayList18;
                                                                                                                                                        int i23 = 0;
                                                                                                                                                        int i24 = 0;
                                                                                                                                                        while (true) {
                                                                                                                                                            int size = arrayList56.size();
                                                                                                                                                            String str121 = str115;
                                                                                                                                                            int i25 = i9;
                                                                                                                                                            String str122 = DRMInfoProvider.MediaDRMKeys.PLUGIN_DESCRIPTION;
                                                                                                                                                            String str123 = str49;
                                                                                                                                                            if (i23 < size) {
                                                                                                                                                                ol81 ol81Var3 = (ol81) arrayList56.get(i23);
                                                                                                                                                                int i26 = i23;
                                                                                                                                                                if (tea1.d("urn:mpeg:dash:role:2011", ol81Var3.a)) {
                                                                                                                                                                    String str124 = ol81Var3.b;
                                                                                                                                                                    if (str124 != null) {
                                                                                                                                                                        switch (str124.hashCode()) {
                                                                                                                                                                            case -2060497896:
                                                                                                                                                                                if (str124.equals("subtitle")) {
                                                                                                                                                                                    c4 = 0;
                                                                                                                                                                                    break;
                                                                                                                                                                                }
                                                                                                                                                                                c4 = 65535;
                                                                                                                                                                                break;
                                                                                                                                                                            case -1724546052:
                                                                                                                                                                                if (str124.equals(DRMInfoProvider.MediaDRMKeys.PLUGIN_DESCRIPTION)) {
                                                                                                                                                                                    c4 = 1;
                                                                                                                                                                                    break;
                                                                                                                                                                                }
                                                                                                                                                                                c4 = 65535;
                                                                                                                                                                                break;
                                                                                                                                                                            case -1580883024:
                                                                                                                                                                                if (str124.equals("enhanced-audio-intelligibility")) {
                                                                                                                                                                                    c4 = 2;
                                                                                                                                                                                    break;
                                                                                                                                                                                }
                                                                                                                                                                                c4 = 65535;
                                                                                                                                                                                break;
                                                                                                                                                                            case -1574842690:
                                                                                                                                                                                if (str124.equals("forced_subtitle")) {
                                                                                                                                                                                    c4 = 3;
                                                                                                                                                                                    break;
                                                                                                                                                                                }
                                                                                                                                                                                c4 = 65535;
                                                                                                                                                                                break;
                                                                                                                                                                            case -1408024454:
                                                                                                                                                                                if (str124.equals("alternate")) {
                                                                                                                                                                                    c4 = 4;
                                                                                                                                                                                    break;
                                                                                                                                                                                }
                                                                                                                                                                                c4 = 65535;
                                                                                                                                                                                break;
                                                                                                                                                                            case -1396432756:
                                                                                                                                                                                if (str124.equals("forced-subtitle")) {
                                                                                                                                                                                    c4 = 5;
                                                                                                                                                                                    break;
                                                                                                                                                                                }
                                                                                                                                                                                c4 = 65535;
                                                                                                                                                                                break;
                                                                                                                                                                            case 99825:
                                                                                                                                                                                if (str124.equals("dub")) {
                                                                                                                                                                                    c4 = 6;
                                                                                                                                                                                    break;
                                                                                                                                                                                }
                                                                                                                                                                                c4 = 65535;
                                                                                                                                                                                break;
                                                                                                                                                                            case 3343801:
                                                                                                                                                                                if (str124.equals("main")) {
                                                                                                                                                                                    c4 = 7;
                                                                                                                                                                                    break;
                                                                                                                                                                                }
                                                                                                                                                                                c4 = 65535;
                                                                                                                                                                                break;
                                                                                                                                                                            case 3530173:
                                                                                                                                                                                if (str124.equals("sign")) {
                                                                                                                                                                                    c4 = '\b';
                                                                                                                                                                                    break;
                                                                                                                                                                                }
                                                                                                                                                                                c4 = 65535;
                                                                                                                                                                                break;
                                                                                                                                                                            case 552573414:
                                                                                                                                                                                if (str124.equals("caption")) {
                                                                                                                                                                                    c4 = '\t';
                                                                                                                                                                                    break;
                                                                                                                                                                                }
                                                                                                                                                                                c4 = 65535;
                                                                                                                                                                                break;
                                                                                                                                                                            case 899152809:
                                                                                                                                                                                if (str124.equals("commentary")) {
                                                                                                                                                                                    c4 = '\n';
                                                                                                                                                                                    break;
                                                                                                                                                                                }
                                                                                                                                                                                c4 = 65535;
                                                                                                                                                                                break;
                                                                                                                                                                            case 1629013393:
                                                                                                                                                                                if (str124.equals("emergency")) {
                                                                                                                                                                                    c4 = 11;
                                                                                                                                                                                    break;
                                                                                                                                                                                }
                                                                                                                                                                                c4 = 65535;
                                                                                                                                                                                break;
                                                                                                                                                                            case 1855372047:
                                                                                                                                                                                if (str124.equals("supplementary")) {
                                                                                                                                                                                    c4 = '\f';
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
                                                                                                                                                                            case 3:
                                                                                                                                                                            case 5:
                                                                                                                                                                                i12 = 128;
                                                                                                                                                                                break;
                                                                                                                                                                            case 1:
                                                                                                                                                                                i12 = 512;
                                                                                                                                                                                break;
                                                                                                                                                                            case 2:
                                                                                                                                                                                i12 = 2048;
                                                                                                                                                                                break;
                                                                                                                                                                            case 4:
                                                                                                                                                                                i12 = 2;
                                                                                                                                                                                break;
                                                                                                                                                                            case 6:
                                                                                                                                                                                i12 = 16;
                                                                                                                                                                                break;
                                                                                                                                                                            case 7:
                                                                                                                                                                                i12 = 1;
                                                                                                                                                                                break;
                                                                                                                                                                            case '\b':
                                                                                                                                                                                i12 = 256;
                                                                                                                                                                                break;
                                                                                                                                                                            case '\t':
                                                                                                                                                                                i12 = 64;
                                                                                                                                                                                break;
                                                                                                                                                                            case '\n':
                                                                                                                                                                                i12 = 8;
                                                                                                                                                                                break;
                                                                                                                                                                            case 11:
                                                                                                                                                                                i12 = 32;
                                                                                                                                                                                break;
                                                                                                                                                                            case '\f':
                                                                                                                                                                                i12 = 4;
                                                                                                                                                                                break;
                                                                                                                                                                        }
                                                                                                                                                                        i24 |= i12;
                                                                                                                                                                    }
                                                                                                                                                                    i12 = 0;
                                                                                                                                                                    i24 |= i12;
                                                                                                                                                                }
                                                                                                                                                                i23 = i26 + 1;
                                                                                                                                                                str115 = str121;
                                                                                                                                                                i9 = i25;
                                                                                                                                                                str49 = str123;
                                                                                                                                                            } else {
                                                                                                                                                                int i27 = 0;
                                                                                                                                                                int i28 = 0;
                                                                                                                                                                while (i27 < arrayList49.size()) {
                                                                                                                                                                    ArrayList arrayList57 = arrayList49;
                                                                                                                                                                    int i29 = i27;
                                                                                                                                                                    ol81 ol81Var4 = (ol81) arrayList57.get(i27);
                                                                                                                                                                    ArrayList arrayList58 = arrayList56;
                                                                                                                                                                    if (tea1.d("urn:mpeg:dash:role:2011", ol81Var4.a)) {
                                                                                                                                                                        String str125 = ol81Var4.b;
                                                                                                                                                                        if (str125 != null) {
                                                                                                                                                                            switch (str125.hashCode()) {
                                                                                                                                                                                case -2060497896:
                                                                                                                                                                                    if (str125.equals("subtitle")) {
                                                                                                                                                                                        c3 = 0;
                                                                                                                                                                                        break;
                                                                                                                                                                                    }
                                                                                                                                                                                    c3 = 65535;
                                                                                                                                                                                    break;
                                                                                                                                                                                case -1724546052:
                                                                                                                                                                                    if (str125.equals(str122)) {
                                                                                                                                                                                        c3 = 1;
                                                                                                                                                                                        break;
                                                                                                                                                                                    }
                                                                                                                                                                                    c3 = 65535;
                                                                                                                                                                                    break;
                                                                                                                                                                                case -1580883024:
                                                                                                                                                                                    if (str125.equals("enhanced-audio-intelligibility")) {
                                                                                                                                                                                        c3 = 2;
                                                                                                                                                                                        break;
                                                                                                                                                                                    }
                                                                                                                                                                                    c3 = 65535;
                                                                                                                                                                                    break;
                                                                                                                                                                                case -1574842690:
                                                                                                                                                                                    if (str125.equals("forced_subtitle")) {
                                                                                                                                                                                        c3 = 3;
                                                                                                                                                                                        break;
                                                                                                                                                                                    }
                                                                                                                                                                                    c3 = 65535;
                                                                                                                                                                                    break;
                                                                                                                                                                                case -1408024454:
                                                                                                                                                                                    if (str125.equals("alternate")) {
                                                                                                                                                                                        c3 = 4;
                                                                                                                                                                                        break;
                                                                                                                                                                                    }
                                                                                                                                                                                    c3 = 65535;
                                                                                                                                                                                    break;
                                                                                                                                                                                case -1396432756:
                                                                                                                                                                                    if (str125.equals("forced-subtitle")) {
                                                                                                                                                                                        c3 = 5;
                                                                                                                                                                                        break;
                                                                                                                                                                                    }
                                                                                                                                                                                    c3 = 65535;
                                                                                                                                                                                    break;
                                                                                                                                                                                case 99825:
                                                                                                                                                                                    if (str125.equals("dub")) {
                                                                                                                                                                                        c3 = 6;
                                                                                                                                                                                        break;
                                                                                                                                                                                    }
                                                                                                                                                                                    c3 = 65535;
                                                                                                                                                                                    break;
                                                                                                                                                                                case 3343801:
                                                                                                                                                                                    if (str125.equals("main")) {
                                                                                                                                                                                        c3 = 7;
                                                                                                                                                                                        break;
                                                                                                                                                                                    }
                                                                                                                                                                                    c3 = 65535;
                                                                                                                                                                                    break;
                                                                                                                                                                                case 3530173:
                                                                                                                                                                                    if (str125.equals("sign")) {
                                                                                                                                                                                        c3 = '\b';
                                                                                                                                                                                        break;
                                                                                                                                                                                    }
                                                                                                                                                                                    c3 = 65535;
                                                                                                                                                                                    break;
                                                                                                                                                                                case 552573414:
                                                                                                                                                                                    if (str125.equals("caption")) {
                                                                                                                                                                                        c3 = '\t';
                                                                                                                                                                                        break;
                                                                                                                                                                                    }
                                                                                                                                                                                    c3 = 65535;
                                                                                                                                                                                    break;
                                                                                                                                                                                case 899152809:
                                                                                                                                                                                    if (str125.equals("commentary")) {
                                                                                                                                                                                        c3 = '\n';
                                                                                                                                                                                        break;
                                                                                                                                                                                    }
                                                                                                                                                                                    c3 = 65535;
                                                                                                                                                                                    break;
                                                                                                                                                                                case 1629013393:
                                                                                                                                                                                    if (str125.equals("emergency")) {
                                                                                                                                                                                        c3 = 11;
                                                                                                                                                                                        break;
                                                                                                                                                                                    }
                                                                                                                                                                                    c3 = 65535;
                                                                                                                                                                                    break;
                                                                                                                                                                                case 1855372047:
                                                                                                                                                                                    if (str125.equals("supplementary")) {
                                                                                                                                                                                        c3 = '\f';
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
                                                                                                                                                                                case 3:
                                                                                                                                                                                case 5:
                                                                                                                                                                                    i11 = 128;
                                                                                                                                                                                    str64 = str122;
                                                                                                                                                                                    break;
                                                                                                                                                                                case 1:
                                                                                                                                                                                    str64 = str122;
                                                                                                                                                                                    i11 = 512;
                                                                                                                                                                                    break;
                                                                                                                                                                                case 2:
                                                                                                                                                                                    str64 = str122;
                                                                                                                                                                                    i11 = 2048;
                                                                                                                                                                                    break;
                                                                                                                                                                                case 4:
                                                                                                                                                                                    str64 = str122;
                                                                                                                                                                                    i11 = 2;
                                                                                                                                                                                    break;
                                                                                                                                                                                case 6:
                                                                                                                                                                                    i11 = 16;
                                                                                                                                                                                    str64 = str122;
                                                                                                                                                                                    break;
                                                                                                                                                                                case 7:
                                                                                                                                                                                    str64 = str122;
                                                                                                                                                                                    i11 = 1;
                                                                                                                                                                                    break;
                                                                                                                                                                                case '\b':
                                                                                                                                                                                    i11 = 256;
                                                                                                                                                                                    str64 = str122;
                                                                                                                                                                                    break;
                                                                                                                                                                                case '\t':
                                                                                                                                                                                    i11 = 64;
                                                                                                                                                                                    str64 = str122;
                                                                                                                                                                                    break;
                                                                                                                                                                                case '\n':
                                                                                                                                                                                    str64 = str122;
                                                                                                                                                                                    i11 = 8;
                                                                                                                                                                                    break;
                                                                                                                                                                                case 11:
                                                                                                                                                                                    i11 = 32;
                                                                                                                                                                                    str64 = str122;
                                                                                                                                                                                    break;
                                                                                                                                                                                case '\f':
                                                                                                                                                                                    str64 = str122;
                                                                                                                                                                                    i11 = 4;
                                                                                                                                                                                    break;
                                                                                                                                                                            }
                                                                                                                                                                        }
                                                                                                                                                                        str64 = str122;
                                                                                                                                                                        i11 = 0;
                                                                                                                                                                    } else {
                                                                                                                                                                        str64 = str122;
                                                                                                                                                                        if (tea1.d("urn:tva:metadata:cs:AudioPurposeCS:2007", ol81Var4.a)) {
                                                                                                                                                                            String str126 = ol81Var4.b;
                                                                                                                                                                            if (str126 != null) {
                                                                                                                                                                                switch (str126.hashCode()) {
                                                                                                                                                                                    case 49:
                                                                                                                                                                                        if (str126.equals("1")) {
                                                                                                                                                                                            c2 = 0;
                                                                                                                                                                                            break;
                                                                                                                                                                                        }
                                                                                                                                                                                        c2 = 65535;
                                                                                                                                                                                        break;
                                                                                                                                                                                    case 50:
                                                                                                                                                                                        if (str126.equals("2")) {
                                                                                                                                                                                            c2 = 1;
                                                                                                                                                                                            break;
                                                                                                                                                                                        }
                                                                                                                                                                                        c2 = 65535;
                                                                                                                                                                                        break;
                                                                                                                                                                                    case SAFETY_TIPS_VALUE:
                                                                                                                                                                                        if (str126.equals("3")) {
                                                                                                                                                                                            c2 = 2;
                                                                                                                                                                                            break;
                                                                                                                                                                                        }
                                                                                                                                                                                        c2 = 65535;
                                                                                                                                                                                        break;
                                                                                                                                                                                    case 52:
                                                                                                                                                                                        if (str126.equals("4")) {
                                                                                                                                                                                            c2 = 3;
                                                                                                                                                                                            break;
                                                                                                                                                                                        }
                                                                                                                                                                                        c2 = 65535;
                                                                                                                                                                                        break;
                                                                                                                                                                                    case 53:
                                                                                                                                                                                    default:
                                                                                                                                                                                        c2 = 65535;
                                                                                                                                                                                        break;
                                                                                                                                                                                    case 54:
                                                                                                                                                                                        if (str126.equals("6")) {
                                                                                                                                                                                            c2 = 4;
                                                                                                                                                                                            break;
                                                                                                                                                                                        }
                                                                                                                                                                                        c2 = 65535;
                                                                                                                                                                                        break;
                                                                                                                                                                                }
                                                                                                                                                                                switch (c2) {
                                                                                                                                                                                    case 0:
                                                                                                                                                                                        i11 = 512;
                                                                                                                                                                                        break;
                                                                                                                                                                                    case 1:
                                                                                                                                                                                        i11 = 2048;
                                                                                                                                                                                        break;
                                                                                                                                                                                    case 2:
                                                                                                                                                                                        i11 = 4;
                                                                                                                                                                                        break;
                                                                                                                                                                                    case 3:
                                                                                                                                                                                        i11 = 8;
                                                                                                                                                                                        break;
                                                                                                                                                                                    case 4:
                                                                                                                                                                                        i11 = 1;
                                                                                                                                                                                        break;
                                                                                                                                                                                }
                                                                                                                                                                            }
                                                                                                                                                                            i11 = 0;
                                                                                                                                                                        } else {
                                                                                                                                                                            i27 = i29 + 1;
                                                                                                                                                                            arrayList49 = arrayList57;
                                                                                                                                                                            str122 = str64;
                                                                                                                                                                            arrayList56 = arrayList58;
                                                                                                                                                                        }
                                                                                                                                                                    }
                                                                                                                                                                    i28 |= i11;
                                                                                                                                                                    i27 = i29 + 1;
                                                                                                                                                                    arrayList49 = arrayList57;
                                                                                                                                                                    str122 = str64;
                                                                                                                                                                    arrayList56 = arrayList58;
                                                                                                                                                                }
                                                                                                                                                                arrayList18 = arrayList56;
                                                                                                                                                                ArrayList arrayList59 = arrayList49;
                                                                                                                                                                int i30 = i24 | i28;
                                                                                                                                                                int i31 = 0;
                                                                                                                                                                for (int i32 = 0; i32 < arrayList34.size(); i32++) {
                                                                                                                                                                    if (tea1.d("http://dashif.org/guidelines/trickmode", ((ol81) arrayList34.get(i32)).a)) {
                                                                                                                                                                        i31 = 16384;
                                                                                                                                                                    }
                                                                                                                                                                }
                                                                                                                                                                int i33 = i30 | i31;
                                                                                                                                                                int i34 = 0;
                                                                                                                                                                for (int i35 = 0; i35 < arrayList35.size(); i35++) {
                                                                                                                                                                    if (tea1.d("http://dashif.org/guidelines/trickmode", ((ol81) arrayList35.get(i35)).a)) {
                                                                                                                                                                        i34 = 16384;
                                                                                                                                                                    }
                                                                                                                                                                }
                                                                                                                                                                da81 da81Var = new da81();
                                                                                                                                                                da81Var.a = str39;
                                                                                                                                                                da81Var.j = str59;
                                                                                                                                                                da81Var.k = str58;
                                                                                                                                                                da81Var.h = str60;
                                                                                                                                                                da81Var.g = i8;
                                                                                                                                                                da81Var.d = i21;
                                                                                                                                                                da81Var.e = i33 | i34;
                                                                                                                                                                String str127 = str46;
                                                                                                                                                                da81Var.c = str127;
                                                                                                                                                                if (str52.equals(g681.d(str58))) {
                                                                                                                                                                    da81Var.p = parseInt2;
                                                                                                                                                                    da81Var.q = parseInt3;
                                                                                                                                                                    da81Var.r = f4;
                                                                                                                                                                    str61 = str123;
                                                                                                                                                                } else {
                                                                                                                                                                    int i36 = parseInt3;
                                                                                                                                                                    int i37 = parseInt2;
                                                                                                                                                                    str61 = str123;
                                                                                                                                                                    if (str61.equals(g681.d(str58))) {
                                                                                                                                                                        da81Var.x = i25;
                                                                                                                                                                        da81Var.y = i7;
                                                                                                                                                                    } else if (g681.f(str58)) {
                                                                                                                                                                        if ("application/cea-608".equals(str58)) {
                                                                                                                                                                            for (int i38 = 0; i38 < arrayList59.size(); i38++) {
                                                                                                                                                                                ol81 ol81Var5 = (ol81) arrayList59.get(i38);
                                                                                                                                                                                if ("urn:scte:dash:cc:cea-608:2015".equals(ol81Var5.a) && (str63 = ol81Var5.b) != null) {
                                                                                                                                                                                    Matcher matcher3 = c.matcher(str63);
                                                                                                                                                                                    if (matcher3.matches()) {
                                                                                                                                                                                        parseInt5 = Integer.parseInt(matcher3.group(1));
                                                                                                                                                                                        da81Var.C = parseInt5;
                                                                                                                                                                                    } else {
                                                                                                                                                                                        nba1.e();
                                                                                                                                                                                    }
                                                                                                                                                                                }
                                                                                                                                                                            }
                                                                                                                                                                            parseInt5 = -1;
                                                                                                                                                                            da81Var.C = parseInt5;
                                                                                                                                                                        } else {
                                                                                                                                                                            if ("application/cea-708".equals(str58)) {
                                                                                                                                                                                for (int i39 = 0; i39 < arrayList59.size(); i39++) {
                                                                                                                                                                                    ol81 ol81Var6 = (ol81) arrayList59.get(i39);
                                                                                                                                                                                    if ("urn:scte:dash:cc:cea-708:2015".equals(ol81Var6.a) && (str62 = ol81Var6.b) != null) {
                                                                                                                                                                                        Matcher matcher4 = w.matcher(str62);
                                                                                                                                                                                        if (matcher4.matches()) {
                                                                                                                                                                                            parseInt5 = Integer.parseInt(matcher4.group(1));
                                                                                                                                                                                            da81Var.C = parseInt5;
                                                                                                                                                                                        } else {
                                                                                                                                                                                            nba1.e();
                                                                                                                                                                                        }
                                                                                                                                                                                    }
                                                                                                                                                                                }
                                                                                                                                                                            }
                                                                                                                                                                            parseInt5 = -1;
                                                                                                                                                                            da81Var.C = parseInt5;
                                                                                                                                                                        }
                                                                                                                                                                    } else if (str121.equals(g681.d(str58))) {
                                                                                                                                                                        da81Var.p = i37;
                                                                                                                                                                        da81Var.q = i36;
                                                                                                                                                                    }
                                                                                                                                                                }
                                                                                                                                                                qd81 qd81Var = new qd81(da81Var);
                                                                                                                                                                ok81 ok81Var = new ok81(qd81Var, !arrayList31.isEmpty() ? arrayList31 : arrayList32, ea81Var2 != null ? ea81Var2 : new n681(), str57, arrayList36, arrayList54);
                                                                                                                                                                int e = g681.e(qd81Var.E);
                                                                                                                                                                int i40 = i5;
                                                                                                                                                                if (i40 != -1) {
                                                                                                                                                                    if (e != -1 && i40 != e) {
                                                                                                                                                                        ny61.k();
                                                                                                                                                                        return null;
                                                                                                                                                                    }
                                                                                                                                                                    e = i40;
                                                                                                                                                                }
                                                                                                                                                                ArrayList arrayList60 = arrayList13;
                                                                                                                                                                arrayList60.add(ok81Var);
                                                                                                                                                                arrayList23 = arrayList60;
                                                                                                                                                                i4 = e;
                                                                                                                                                                str22 = str61;
                                                                                                                                                                arrayList49 = arrayList59;
                                                                                                                                                                str91 = str127;
                                                                                                                                                                str31 = str52;
                                                                                                                                                                str34 = str16;
                                                                                                                                                                arrayList24 = arrayList11;
                                                                                                                                                                j12 = j17;
                                                                                                                                                                j2 = j18;
                                                                                                                                                                str35 = str47;
                                                                                                                                                                str29 = str45;
                                                                                                                                                                str32 = str48;
                                                                                                                                                                str33 = str53;
                                                                                                                                                                xmlPullParser2 = xmlPullParser;
                                                                                                                                                            }
                                                                                                                                                        }
                                                                                                                                                    }
                                                                                                                                                }
                                                                                                                                            }
                                                                                                                                        }
                                                                                                                                    }
                                                                                                                                    str59 = str104;
                                                                                                                                    str58 = null;
                                                                                                                                    String str1172 = "audio/eac3";
                                                                                                                                    if ("audio/eac3".equals(str58)) {
                                                                                                                                    }
                                                                                                                                    str60 = str107;
                                                                                                                                    i10 = 0;
                                                                                                                                    int i212 = 0;
                                                                                                                                    while (true) {
                                                                                                                                        j18 = j15;
                                                                                                                                        if (i10 < arrayList18.size()) {
                                                                                                                                        }
                                                                                                                                        i10 = i22 + 1;
                                                                                                                                        arrayList18 = arrayList55;
                                                                                                                                        j15 = j18;
                                                                                                                                    }
                                                                                                                                } else if (str52.equals(g681.d(str104))) {
                                                                                                                                    if (str107 != null) {
                                                                                                                                        int i41 = rf71.a;
                                                                                                                                        for (String str128 : TextUtils.isEmpty(str107) ? new String[0] : str107.trim().split("(\\s*,\\s*)", -1)) {
                                                                                                                                            b2 = g681.b(str128);
                                                                                                                                            if (b2 != null && str52.equals(g681.d(b2))) {
                                                                                                                                                str58 = b2;
                                                                                                                                                str59 = str104;
                                                                                                                                                String str11722 = "audio/eac3";
                                                                                                                                                if ("audio/eac3".equals(str58)) {
                                                                                                                                                }
                                                                                                                                                str60 = str107;
                                                                                                                                                i10 = 0;
                                                                                                                                                int i2122 = 0;
                                                                                                                                                while (true) {
                                                                                                                                                    j18 = j15;
                                                                                                                                                    if (i10 < arrayList18.size()) {
                                                                                                                                                    }
                                                                                                                                                    i10 = i22 + 1;
                                                                                                                                                    arrayList18 = arrayList55;
                                                                                                                                                    j15 = j18;
                                                                                                                                                }
                                                                                                                                            }
                                                                                                                                        }
                                                                                                                                    }
                                                                                                                                    str59 = str104;
                                                                                                                                    str58 = null;
                                                                                                                                    String str117222 = "audio/eac3";
                                                                                                                                    if ("audio/eac3".equals(str58)) {
                                                                                                                                    }
                                                                                                                                    str60 = str107;
                                                                                                                                    i10 = 0;
                                                                                                                                    int i21222 = 0;
                                                                                                                                    while (true) {
                                                                                                                                        j18 = j15;
                                                                                                                                        if (i10 < arrayList18.size()) {
                                                                                                                                        }
                                                                                                                                        i10 = i22 + 1;
                                                                                                                                        arrayList18 = arrayList55;
                                                                                                                                        j15 = j18;
                                                                                                                                    }
                                                                                                                                } else {
                                                                                                                                    if (g681.f(str104) || "image".equals(g681.d(str104))) {
                                                                                                                                        str58 = str104;
                                                                                                                                        str59 = str58;
                                                                                                                                    } else {
                                                                                                                                        str59 = str104;
                                                                                                                                        if ("application/mp4".equals(str59)) {
                                                                                                                                            str58 = g681.b(str107);
                                                                                                                                            if ("text/vtt".equals(str58)) {
                                                                                                                                                str58 = "application/x-mp4-vtt";
                                                                                                                                            }
                                                                                                                                        }
                                                                                                                                        str58 = null;
                                                                                                                                    }
                                                                                                                                    String str1172222 = "audio/eac3";
                                                                                                                                    if ("audio/eac3".equals(str58)) {
                                                                                                                                    }
                                                                                                                                    str60 = str107;
                                                                                                                                    i10 = 0;
                                                                                                                                    int i212222 = 0;
                                                                                                                                    while (true) {
                                                                                                                                        j18 = j15;
                                                                                                                                        if (i10 < arrayList18.size()) {
                                                                                                                                        }
                                                                                                                                        i10 = i22 + 1;
                                                                                                                                        arrayList18 = arrayList55;
                                                                                                                                        j15 = j18;
                                                                                                                                    }
                                                                                                                                }
                                                                                                                            }
                                                                                                                        } else {
                                                                                                                            str55 = str37;
                                                                                                                            arrayList33 = arrayList26;
                                                                                                                            if (nja1.d(xmlPullParser3, str55)) {
                                                                                                                                j16 = j13;
                                                                                                                                arrayList54.add(l(xmlPullParser3, str55));
                                                                                                                                arrayList34 = arrayList27;
                                                                                                                            } else {
                                                                                                                                j16 = j13;
                                                                                                                                ArrayList arrayList61 = arrayList54;
                                                                                                                                if (nja1.d(xmlPullParser3, str50)) {
                                                                                                                                    arrayList34 = arrayList27;
                                                                                                                                    arrayList34.add(l(xmlPullParser3, str50));
                                                                                                                                    arrayList54 = arrayList61;
                                                                                                                                } else {
                                                                                                                                    String str129 = str95;
                                                                                                                                    arrayList34 = arrayList27;
                                                                                                                                    if (nja1.d(xmlPullParser3, str129)) {
                                                                                                                                        arrayList54 = arrayList61;
                                                                                                                                        ol81 l = l(xmlPullParser3, str129);
                                                                                                                                        str95 = str129;
                                                                                                                                        arrayList35 = arrayList28;
                                                                                                                                        arrayList35.add(l);
                                                                                                                                    } else {
                                                                                                                                        arrayList54 = arrayList61;
                                                                                                                                        str95 = str129;
                                                                                                                                        arrayList35 = arrayList28;
                                                                                                                                        m(xmlPullParser3);
                                                                                                                                    }
                                                                                                                                    str56 = str96;
                                                                                                                                    j17 = j14;
                                                                                                                                    ea81Var2 = ea81Var;
                                                                                                                                    i9 = i6;
                                                                                                                                    str57 = str44;
                                                                                                                                    if (nja1.c(xmlPullParser3, str56)) {
                                                                                                                                    }
                                                                                                                                }
                                                                                                                            }
                                                                                                                            arrayList35 = arrayList28;
                                                                                                                            str56 = str96;
                                                                                                                            j17 = j14;
                                                                                                                            ea81Var2 = ea81Var;
                                                                                                                            i9 = i6;
                                                                                                                            str57 = str44;
                                                                                                                            if (nja1.c(xmlPullParser3, str56)) {
                                                                                                                            }
                                                                                                                        }
                                                                                                                    }
                                                                                                                }
                                                                                                                arrayList34 = arrayList27;
                                                                                                                str57 = str44;
                                                                                                                arrayList33 = arrayList26;
                                                                                                                long j422 = j14;
                                                                                                                str56 = str96;
                                                                                                                j17 = j422;
                                                                                                                if (nja1.c(xmlPullParser3, str56)) {
                                                                                                                }
                                                                                                            }
                                                                                                        }
                                                                                                    } else {
                                                                                                        if (!z9) {
                                                                                                            j36 = b(xmlPullParser3, j36);
                                                                                                            z9 = true;
                                                                                                        }
                                                                                                        f3 = f2;
                                                                                                        arrayList29.addAll(f(xmlPullParser3, arrayList25, z2));
                                                                                                    }
                                                                                                    i7 = parseInt4;
                                                                                                    arrayList19 = arrayList10;
                                                                                                    str = str72;
                                                                                                    str46 = str91;
                                                                                                    z3 = z2;
                                                                                                    arrayList31 = arrayList29;
                                                                                                    str3 = str79;
                                                                                                    str5 = str82;
                                                                                                    str53 = str83;
                                                                                                    str47 = str85;
                                                                                                    j5 = j34;
                                                                                                    str45 = str12;
                                                                                                    str48 = str13;
                                                                                                    i8 = parseInt;
                                                                                                    str56 = str96;
                                                                                                    str54 = str99;
                                                                                                    str27 = str100;
                                                                                                    arrayList34 = arrayList27;
                                                                                                    ea81Var2 = ea81Var;
                                                                                                    arrayList33 = arrayList26;
                                                                                                    arrayList20 = arrayList30;
                                                                                                    str49 = str43;
                                                                                                    f4 = f3;
                                                                                                    j16 = j13;
                                                                                                    arrayList21 = arrayList14;
                                                                                                    arrayList32 = arrayList25;
                                                                                                    str50 = str94;
                                                                                                    str90 = str103;
                                                                                                    str55 = str37;
                                                                                                    str89 = str105;
                                                                                                    arrayList35 = arrayList28;
                                                                                                    str57 = str44;
                                                                                                    i9 = i6;
                                                                                                    j17 = j31;
                                                                                                    arrayList2 = arrayList45;
                                                                                                    arrayList22 = arrayList12;
                                                                                                    arrayList7 = arrayList39;
                                                                                                    j15 = j8;
                                                                                                    str51 = str93;
                                                                                                    j4 = c11;
                                                                                                    str52 = str42;
                                                                                                    if (nja1.c(xmlPullParser3, str56)) {
                                                                                                    }
                                                                                                }
                                                                                            } else {
                                                                                                pattern = pattern3;
                                                                                            }
                                                                                        }
                                                                                        str21 = str84;
                                                                                        f2 = f9;
                                                                                        String str1102 = str17;
                                                                                        String attributeValue312 = xmlPullParser3.getAttributeValue(null, str1102);
                                                                                        if (attributeValue312 != null) {
                                                                                        }
                                                                                        str28 = str41;
                                                                                        arrayList26 = new ArrayList();
                                                                                        ArrayList arrayList542 = new ArrayList();
                                                                                        arrayList27 = new ArrayList(arrayList12);
                                                                                        arrayList28 = new ArrayList(arrayList53);
                                                                                        arrayList29 = new ArrayList();
                                                                                        arrayList30 = arrayList53;
                                                                                        str25 = str1102;
                                                                                        str42 = str87;
                                                                                        str43 = str88;
                                                                                        ea81Var = ea81Var4;
                                                                                        j13 = j35;
                                                                                        i6 = i16;
                                                                                        long j362 = j10;
                                                                                        boolean z92 = false;
                                                                                        str44 = null;
                                                                                        while (true) {
                                                                                            xmlPullParser3.next();
                                                                                            if (nja1.d(xmlPullParser3, str72)) {
                                                                                            }
                                                                                            i7 = parseInt4;
                                                                                            arrayList19 = arrayList10;
                                                                                            str = str72;
                                                                                            str46 = str91;
                                                                                            z3 = z2;
                                                                                            arrayList31 = arrayList29;
                                                                                            str3 = str79;
                                                                                            str5 = str82;
                                                                                            str53 = str83;
                                                                                            str47 = str85;
                                                                                            j5 = j34;
                                                                                            str45 = str12;
                                                                                            str48 = str13;
                                                                                            i8 = parseInt;
                                                                                            str56 = str96;
                                                                                            str54 = str99;
                                                                                            str27 = str100;
                                                                                            arrayList34 = arrayList27;
                                                                                            ea81Var2 = ea81Var;
                                                                                            arrayList33 = arrayList26;
                                                                                            arrayList20 = arrayList30;
                                                                                            str49 = str43;
                                                                                            f4 = f3;
                                                                                            j16 = j13;
                                                                                            arrayList21 = arrayList14;
                                                                                            arrayList32 = arrayList25;
                                                                                            str50 = str94;
                                                                                            str90 = str103;
                                                                                            str55 = str37;
                                                                                            str89 = str105;
                                                                                            arrayList35 = arrayList28;
                                                                                            str57 = str44;
                                                                                            i9 = i6;
                                                                                            j17 = j31;
                                                                                            arrayList2 = arrayList45;
                                                                                            arrayList22 = arrayList12;
                                                                                            arrayList7 = arrayList39;
                                                                                            j15 = j8;
                                                                                            str51 = str93;
                                                                                            j4 = c11;
                                                                                            str52 = str42;
                                                                                            if (nja1.c(xmlPullParser3, str56)) {
                                                                                            }
                                                                                            int i172 = i9;
                                                                                            arrayList26 = arrayList33;
                                                                                            String str1142 = str104;
                                                                                            long j432 = j15;
                                                                                            xmlPullParser3 = xmlPullParser;
                                                                                            arrayList28 = arrayList35;
                                                                                            arrayList27 = arrayList34;
                                                                                            str43 = str49;
                                                                                            str94 = str50;
                                                                                            str42 = str52;
                                                                                            str93 = str51;
                                                                                            arrayList25 = arrayList32;
                                                                                            arrayList39 = arrayList7;
                                                                                            z2 = z3;
                                                                                            arrayList12 = arrayList22;
                                                                                            arrayList30 = arrayList20;
                                                                                            i6 = i172;
                                                                                            c11 = j4;
                                                                                            j8 = j432;
                                                                                            str44 = str57;
                                                                                            str72 = str;
                                                                                            arrayList29 = arrayList31;
                                                                                            str91 = str46;
                                                                                            parseInt4 = i7;
                                                                                            str85 = str47;
                                                                                            str79 = str3;
                                                                                            str13 = str48;
                                                                                            str104 = str1142;
                                                                                            arrayList45 = arrayList2;
                                                                                            j34 = j5;
                                                                                            ea81Var = ea81Var2;
                                                                                            str105 = str89;
                                                                                            str103 = str90;
                                                                                            j31 = j17;
                                                                                            j13 = j16;
                                                                                            parseInt = i8;
                                                                                            str82 = str5;
                                                                                            str100 = str27;
                                                                                            str83 = str53;
                                                                                            str96 = str56;
                                                                                            str99 = str54;
                                                                                            str37 = str55;
                                                                                            arrayList14 = arrayList21;
                                                                                            arrayList10 = arrayList19;
                                                                                            f2 = f4;
                                                                                            str12 = str45;
                                                                                        }
                                                                                    } else {
                                                                                        str20 = str86;
                                                                                        str21 = str84;
                                                                                        arrayList19 = arrayList10;
                                                                                        String str130 = str87;
                                                                                        str22 = str88;
                                                                                        str = str72;
                                                                                        String str131 = str91;
                                                                                        z3 = z2;
                                                                                        str3 = str79;
                                                                                        long j44 = j31;
                                                                                        str5 = str82;
                                                                                        String str132 = str83;
                                                                                        str23 = str85;
                                                                                        arrayList2 = arrayList45;
                                                                                        j5 = j34;
                                                                                        long j45 = j8;
                                                                                        String str133 = str12;
                                                                                        String str134 = str13;
                                                                                        str24 = str14;
                                                                                        str25 = str17;
                                                                                        str26 = str18;
                                                                                        str27 = str19;
                                                                                        xmlPullParser2 = xmlPullParser3;
                                                                                        arrayList20 = arrayList53;
                                                                                        i3 = i2;
                                                                                        arrayList21 = arrayList14;
                                                                                        arrayList22 = arrayList12;
                                                                                        arrayList7 = arrayList39;
                                                                                        j4 = c11;
                                                                                        str28 = str15;
                                                                                        if (nja1.d(xmlPullParser2, str134)) {
                                                                                            ea81Var4 = i(xmlPullParser2, (n681) ea81Var4);
                                                                                            str91 = str131;
                                                                                            str31 = str130;
                                                                                            str34 = str16;
                                                                                            arrayList24 = arrayList11;
                                                                                            arrayList23 = arrayList13;
                                                                                            i4 = i3;
                                                                                            j12 = j44;
                                                                                            j2 = j45;
                                                                                            str35 = str23;
                                                                                            str29 = str133;
                                                                                            str33 = str132;
                                                                                            str32 = str134;
                                                                                        } else {
                                                                                            str29 = str133;
                                                                                            if (nja1.d(xmlPullParser2, str29)) {
                                                                                                long b5 = b(xmlPullParser2, j35);
                                                                                                ea81Var4 = g(xmlPullParser2, (ex71) ea81Var4, j44, j4, j10, b5, j45);
                                                                                                j2 = j45;
                                                                                                j12 = j44;
                                                                                                xmlPullParser2 = xmlPullParser2;
                                                                                                j35 = b5;
                                                                                                str91 = str131;
                                                                                                str31 = str130;
                                                                                                str32 = str134;
                                                                                                str34 = str16;
                                                                                                arrayList24 = arrayList11;
                                                                                                arrayList23 = arrayList13;
                                                                                                i4 = i3;
                                                                                                str35 = str23;
                                                                                                str33 = str132;
                                                                                            } else {
                                                                                                j11 = j35;
                                                                                                j12 = j44;
                                                                                                j2 = j45;
                                                                                                if (nja1.d(xmlPullParser2, str132)) {
                                                                                                    long b6 = b(xmlPullParser2, j11);
                                                                                                    str30 = str131;
                                                                                                    str31 = str130;
                                                                                                    str32 = str134;
                                                                                                    arrayList23 = arrayList13;
                                                                                                    str33 = str132;
                                                                                                    ea81Var4 = h(xmlPullParser2, (d081) ea81Var4, arrayList20, j12, j4, j10, b6, j2);
                                                                                                    xmlPullParser2 = xmlPullParser2;
                                                                                                    j35 = b6;
                                                                                                    str34 = str16;
                                                                                                    arrayList24 = arrayList11;
                                                                                                } else {
                                                                                                    str30 = str131;
                                                                                                    str31 = str130;
                                                                                                    str32 = str134;
                                                                                                    arrayList23 = arrayList13;
                                                                                                    str33 = str132;
                                                                                                    if (nja1.d(xmlPullParser2, "InbandEventStream")) {
                                                                                                        arrayList24 = arrayList11;
                                                                                                        arrayList24.add(l(xmlPullParser2, "InbandEventStream"));
                                                                                                    } else {
                                                                                                        arrayList24 = arrayList11;
                                                                                                        if (nja1.d(xmlPullParser2, "Label")) {
                                                                                                            str34 = "";
                                                                                                            do {
                                                                                                                xmlPullParser2.next();
                                                                                                                if (xmlPullParser2.getEventType() == 4) {
                                                                                                                    str34 = xmlPullParser2.getText();
                                                                                                                } else {
                                                                                                                    m(xmlPullParser2);
                                                                                                                }
                                                                                                            } while (!nja1.c(xmlPullParser2, "Label"));
                                                                                                            j35 = j11;
                                                                                                        } else if (xmlPullParser2.getEventType() == 2) {
                                                                                                            m(xmlPullParser2);
                                                                                                        }
                                                                                                    }
                                                                                                    j35 = j11;
                                                                                                    str34 = str16;
                                                                                                    i4 = i3;
                                                                                                    str91 = str30;
                                                                                                    str35 = str23;
                                                                                                }
                                                                                                i4 = i3;
                                                                                                str91 = str30;
                                                                                                str35 = str23;
                                                                                            }
                                                                                        }
                                                                                    }
                                                                                }
                                                                            }
                                                                            str20 = str86;
                                                                            str21 = str84;
                                                                            arrayList19 = arrayList10;
                                                                            str31 = str87;
                                                                            str22 = str88;
                                                                            str = str72;
                                                                            str30 = str91;
                                                                            z3 = z2;
                                                                            arrayList18 = arrayList51;
                                                                        }
                                                                    }
                                                                    str3 = str79;
                                                                    j12 = j31;
                                                                    str5 = str82;
                                                                    str33 = str83;
                                                                    str23 = str85;
                                                                    arrayList2 = arrayList45;
                                                                    j5 = j34;
                                                                    str29 = str12;
                                                                    str32 = str13;
                                                                    str24 = str14;
                                                                    arrayList20 = arrayList15;
                                                                    arrayList24 = arrayList11;
                                                                    str25 = str17;
                                                                    str26 = str18;
                                                                    str27 = str19;
                                                                    xmlPullParser2 = xmlPullParser3;
                                                                    i3 = i2;
                                                                    arrayList21 = arrayList14;
                                                                    arrayList22 = arrayList12;
                                                                    arrayList7 = arrayList39;
                                                                    j2 = j8;
                                                                    str28 = str15;
                                                                    arrayList23 = arrayList13;
                                                                    j11 = j35;
                                                                    j4 = c11;
                                                                    j35 = j11;
                                                                    str34 = str16;
                                                                    i4 = i3;
                                                                    str91 = str30;
                                                                    str35 = str23;
                                                                }
                                                                if (nja1.c(xmlPullParser2, str35)) {
                                                                    arrayList11 = arrayList24;
                                                                    str83 = str33;
                                                                    str13 = str32;
                                                                    arrayList13 = arrayList23;
                                                                    str16 = str34;
                                                                    arrayList39 = arrayList7;
                                                                    i2 = i4;
                                                                    arrayList15 = arrayList20;
                                                                    c11 = j4;
                                                                    arrayList14 = arrayList21;
                                                                    str15 = str28;
                                                                    str73 = str2;
                                                                    arrayList41 = arrayList17;
                                                                    arrayList16 = arrayList18;
                                                                    str14 = str24;
                                                                    str18 = str26;
                                                                    str17 = str25;
                                                                    str88 = str22;
                                                                    str72 = str;
                                                                    arrayList10 = arrayList19;
                                                                    str79 = str3;
                                                                    str19 = str27;
                                                                    str85 = str35;
                                                                    xmlPullParser3 = xmlPullParser2;
                                                                    j8 = j2;
                                                                    str12 = str29;
                                                                    j34 = j5;
                                                                    z2 = z3;
                                                                    arrayList12 = arrayList22;
                                                                    j9 = j10;
                                                                    str87 = str31;
                                                                    str82 = str5;
                                                                    arrayList45 = arrayList2;
                                                                    j31 = j12;
                                                                    str86 = str20;
                                                                    str84 = str21;
                                                                } else {
                                                                    ArrayList arrayList62 = new ArrayList(arrayList23.size());
                                                                    int i42 = 0;
                                                                    while (i42 < arrayList23.size()) {
                                                                        ArrayList arrayList63 = arrayList23;
                                                                        ok81 ok81Var2 = (ok81) arrayList63.get(i42);
                                                                        da81 da81Var2 = new da81(ok81Var2.a);
                                                                        if (str34 != null) {
                                                                            da81Var2.b = str34;
                                                                        }
                                                                        String str135 = ok81Var2.d;
                                                                        if (str135 == null) {
                                                                            str135 = str92;
                                                                        }
                                                                        ArrayList arrayList64 = ok81Var2.e;
                                                                        ArrayList arrayList65 = arrayList19;
                                                                        arrayList64.addAll(arrayList65);
                                                                        int i43 = i42;
                                                                        if (arrayList64.isEmpty()) {
                                                                            str65 = str34;
                                                                            j19 = j12;
                                                                            arrayList37 = arrayList63;
                                                                        } else {
                                                                            int i44 = 0;
                                                                            while (true) {
                                                                                if (i44 < arrayList64.size()) {
                                                                                    jk0 jk0Var = (jk0) arrayList64.get(i44);
                                                                                    str65 = str34;
                                                                                    j19 = j12;
                                                                                    if (!sm81.c.equals(jk0Var.c) || (str66 = jk0Var.d) == null) {
                                                                                        i44++;
                                                                                        str34 = str65;
                                                                                        j12 = j19;
                                                                                    } else {
                                                                                        arrayList64.remove(i44);
                                                                                    }
                                                                                } else {
                                                                                    str65 = str34;
                                                                                    j19 = j12;
                                                                                    str66 = null;
                                                                                }
                                                                            }
                                                                            if (str66 != null) {
                                                                                int i45 = 0;
                                                                                while (i45 < arrayList64.size()) {
                                                                                    jk0 jk0Var2 = (jk0) arrayList64.get(i45);
                                                                                    if (sm81.b.equals(jk0Var2.c) && jk0Var2.d == null) {
                                                                                        arrayList38 = arrayList63;
                                                                                        arrayList64.set(i45, new jk0(sm81.c, str66, jk0Var2.e, jk0Var2.f));
                                                                                    } else {
                                                                                        arrayList38 = arrayList63;
                                                                                    }
                                                                                    i45++;
                                                                                    arrayList63 = arrayList38;
                                                                                }
                                                                            }
                                                                            arrayList37 = arrayList63;
                                                                            for (int size2 = arrayList64.size() - 1; size2 >= 0; size2--) {
                                                                                jk0 jk0Var3 = (jk0) arrayList64.get(size2);
                                                                                if (jk0Var3.f == null) {
                                                                                    int i46 = 0;
                                                                                    while (true) {
                                                                                        if (i46 < arrayList64.size()) {
                                                                                            jk0 jk0Var4 = (jk0) arrayList64.get(i46);
                                                                                            if (jk0Var4.f != null && jk0Var3.f == null && jk0Var4.a(jk0Var3.c)) {
                                                                                                arrayList64.remove(size2);
                                                                                            } else {
                                                                                                i46++;
                                                                                            }
                                                                                        }
                                                                                    }
                                                                                }
                                                                            }
                                                                            da81Var2.n = new kk0(str135, false, (jk0[]) arrayList64.toArray(new jk0[0]));
                                                                        }
                                                                        ArrayList arrayList66 = ok81Var2.f;
                                                                        arrayList66.addAll(arrayList24);
                                                                        qd81 qd81Var2 = new qd81(da81Var2);
                                                                        t31 t31Var = ok81Var2.b;
                                                                        ea81 ea81Var5 = ok81Var2.c;
                                                                        if (ea81Var5 instanceof n681) {
                                                                            jw71Var = new nz71(qd81Var2, t31Var, (n681) ea81Var5, arrayList66);
                                                                        } else {
                                                                            if (!(ea81Var5 instanceof tt71)) {
                                                                                ny61.g("segmentBase must be of type SingleSegmentBase or MultiSegmentBase");
                                                                                return null;
                                                                            }
                                                                            jw71Var = new jw71(qd81Var2, t31Var, (tt71) ea81Var5, arrayList66);
                                                                        }
                                                                        arrayList62.add(jw71Var);
                                                                        i42 = i43 + 1;
                                                                        arrayList19 = arrayList65;
                                                                        str34 = str65;
                                                                        arrayList23 = arrayList37;
                                                                        j12 = j19;
                                                                    }
                                                                    arrayList5.add(new k881(parseInt6, i4, arrayList62, arrayList49, arrayList22, arrayList20));
                                                                    z4 = false;
                                                                    xmlPullParser3 = xmlPullParser2;
                                                                    j6 = j12;
                                                                    str4 = str27;
                                                                }
                                                            }
                                                        }
                                                        arrayList17 = arrayList41;
                                                        str20 = str86;
                                                        str21 = str84;
                                                        arrayList19 = arrayList10;
                                                        str31 = str87;
                                                        str22 = str88;
                                                        str = str72;
                                                        z3 = z2;
                                                        str3 = str79;
                                                        j12 = j31;
                                                        str5 = str82;
                                                        str33 = str83;
                                                        arrayList2 = arrayList45;
                                                        j5 = j34;
                                                        str29 = str12;
                                                        str24 = str14;
                                                        arrayList20 = arrayList15;
                                                        arrayList24 = arrayList11;
                                                        str25 = str17;
                                                        str26 = str18;
                                                        str27 = str19;
                                                        arrayList18 = arrayList16;
                                                        xmlPullParser2 = xmlPullParser3;
                                                        arrayList21 = arrayList14;
                                                        arrayList22 = arrayList12;
                                                        str2 = str73;
                                                        arrayList7 = arrayList39;
                                                        str35 = str85;
                                                        j2 = j8;
                                                        str32 = str13;
                                                        str28 = str15;
                                                        arrayList23 = arrayList13;
                                                        i4 = i2;
                                                        j4 = c11;
                                                        str34 = str16;
                                                        if (nja1.c(xmlPullParser2, str35)) {
                                                        }
                                                    }
                                                }
                                            }
                                            pattern = pattern2;
                                            str15 = "frameRate";
                                            f = -1.0f;
                                            float f92 = f;
                                            String attributeValue192 = xmlPullParser3.getAttributeValue(null, "audioSamplingRate");
                                            if (attributeValue192 == null) {
                                            }
                                            String attributeValue202 = xmlPullParser3.getAttributeValue(null, str73);
                                            String attributeValue212 = xmlPullParser3.getAttributeValue(null, "label");
                                            arrayList10 = new ArrayList();
                                            str16 = attributeValue212;
                                            arrayList11 = new ArrayList();
                                            ArrayList arrayList462 = new ArrayList();
                                            str17 = "audioSamplingRate";
                                            ArrayList arrayList472 = new ArrayList();
                                            str18 = "width";
                                            arrayList12 = new ArrayList();
                                            String str892 = "codecs";
                                            ArrayList arrayList482 = new ArrayList();
                                            String str902 = "mimeType";
                                            arrayList13 = new ArrayList();
                                            arrayList14 = new ArrayList();
                                            arrayList15 = arrayList482;
                                            String str912 = attributeValue202;
                                            str19 = str78;
                                            ArrayList arrayList492 = arrayList462;
                                            arrayList16 = arrayList472;
                                            ea81 ea81Var42 = ea81Var3;
                                            long j352 = j32;
                                            j9 = j3;
                                            i2 = i15;
                                            String str922 = null;
                                            boolean z82 = false;
                                            int i162 = -1;
                                            while (true) {
                                                xmlPullParser3.next();
                                                if (nja1.d(xmlPullParser3, str72)) {
                                                }
                                                arrayList17 = arrayList41;
                                                str20 = str86;
                                                str21 = str84;
                                                arrayList19 = arrayList10;
                                                str31 = str87;
                                                str22 = str88;
                                                str = str72;
                                                z3 = z2;
                                                str3 = str79;
                                                j12 = j31;
                                                str5 = str82;
                                                str33 = str83;
                                                arrayList2 = arrayList45;
                                                j5 = j34;
                                                str29 = str12;
                                                str24 = str14;
                                                arrayList20 = arrayList15;
                                                arrayList24 = arrayList11;
                                                str25 = str17;
                                                str26 = str18;
                                                str27 = str19;
                                                arrayList18 = arrayList16;
                                                xmlPullParser2 = xmlPullParser3;
                                                arrayList21 = arrayList14;
                                                arrayList22 = arrayList12;
                                                str2 = str73;
                                                arrayList7 = arrayList39;
                                                str35 = str85;
                                                j2 = j8;
                                                str32 = str13;
                                                str28 = str15;
                                                arrayList23 = arrayList13;
                                                i4 = i2;
                                                j4 = c11;
                                                str34 = str16;
                                                if (nja1.c(xmlPullParser2, str35)) {
                                                }
                                                arrayList11 = arrayList24;
                                                str83 = str33;
                                                str13 = str32;
                                                arrayList13 = arrayList23;
                                                str16 = str34;
                                                arrayList39 = arrayList7;
                                                i2 = i4;
                                                arrayList15 = arrayList20;
                                                c11 = j4;
                                                arrayList14 = arrayList21;
                                                str15 = str28;
                                                str73 = str2;
                                                arrayList41 = arrayList17;
                                                arrayList16 = arrayList18;
                                                str14 = str24;
                                                str18 = str26;
                                                str17 = str25;
                                                str88 = str22;
                                                str72 = str;
                                                arrayList10 = arrayList19;
                                                str79 = str3;
                                                str19 = str27;
                                                str85 = str35;
                                                xmlPullParser3 = xmlPullParser2;
                                                j8 = j2;
                                                str12 = str29;
                                                j34 = j5;
                                                z2 = z3;
                                                arrayList12 = arrayList22;
                                                j9 = j10;
                                                str87 = str31;
                                                str82 = str5;
                                                arrayList45 = arrayList2;
                                                j31 = j12;
                                                str86 = str20;
                                                str84 = str21;
                                            }
                                        }
                                        i = -1;
                                        int i152 = i;
                                        String attributeValue152 = xmlPullParser3.getAttributeValue(null, "mimeType");
                                        j8 = c8;
                                        String attributeValue162 = xmlPullParser3.getAttributeValue(null, "codecs");
                                        String attributeValue172 = xmlPullParser3.getAttributeValue(null, "width");
                                        if (attributeValue172 != null) {
                                        }
                                        str12 = "SegmentList";
                                        String attributeValue182 = xmlPullParser3.getAttributeValue(null, "height");
                                        if (attributeValue182 != null) {
                                        }
                                        str13 = "SegmentBase";
                                        str14 = "height";
                                        attributeValue = xmlPullParser3.getAttributeValue(null, "frameRate");
                                        Pattern pattern22 = b;
                                        if (attributeValue != null) {
                                        }
                                        pattern = pattern22;
                                        str15 = "frameRate";
                                        f = -1.0f;
                                        float f922 = f;
                                        String attributeValue1922 = xmlPullParser3.getAttributeValue(null, "audioSamplingRate");
                                        if (attributeValue1922 == null) {
                                        }
                                        String attributeValue2022 = xmlPullParser3.getAttributeValue(null, str73);
                                        String attributeValue2122 = xmlPullParser3.getAttributeValue(null, "label");
                                        arrayList10 = new ArrayList();
                                        str16 = attributeValue2122;
                                        arrayList11 = new ArrayList();
                                        ArrayList arrayList4622 = new ArrayList();
                                        str17 = "audioSamplingRate";
                                        ArrayList arrayList4722 = new ArrayList();
                                        str18 = "width";
                                        arrayList12 = new ArrayList();
                                        String str8922 = "codecs";
                                        ArrayList arrayList4822 = new ArrayList();
                                        String str9022 = "mimeType";
                                        arrayList13 = new ArrayList();
                                        arrayList14 = new ArrayList();
                                        arrayList15 = arrayList4822;
                                        String str9122 = attributeValue2022;
                                        str19 = str78;
                                        ArrayList arrayList4922 = arrayList4622;
                                        arrayList16 = arrayList4722;
                                        ea81 ea81Var422 = ea81Var3;
                                        long j3522 = j32;
                                        j9 = j3;
                                        i2 = i152;
                                        String str9222 = null;
                                        boolean z822 = false;
                                        int i1622 = -1;
                                        while (true) {
                                            xmlPullParser3.next();
                                            if (nja1.d(xmlPullParser3, str72)) {
                                            }
                                            arrayList17 = arrayList41;
                                            str20 = str86;
                                            str21 = str84;
                                            arrayList19 = arrayList10;
                                            str31 = str87;
                                            str22 = str88;
                                            str = str72;
                                            z3 = z2;
                                            str3 = str79;
                                            j12 = j31;
                                            str5 = str82;
                                            str33 = str83;
                                            arrayList2 = arrayList45;
                                            j5 = j34;
                                            str29 = str12;
                                            str24 = str14;
                                            arrayList20 = arrayList15;
                                            arrayList24 = arrayList11;
                                            str25 = str17;
                                            str26 = str18;
                                            str27 = str19;
                                            arrayList18 = arrayList16;
                                            xmlPullParser2 = xmlPullParser3;
                                            arrayList21 = arrayList14;
                                            arrayList22 = arrayList12;
                                            str2 = str73;
                                            arrayList7 = arrayList39;
                                            str35 = str85;
                                            j2 = j8;
                                            str32 = str13;
                                            str28 = str15;
                                            arrayList23 = arrayList13;
                                            i4 = i2;
                                            j4 = c11;
                                            str34 = str16;
                                            if (nja1.c(xmlPullParser2, str35)) {
                                            }
                                            arrayList11 = arrayList24;
                                            str83 = str33;
                                            str13 = str32;
                                            arrayList13 = arrayList23;
                                            str16 = str34;
                                            arrayList39 = arrayList7;
                                            i2 = i4;
                                            arrayList15 = arrayList20;
                                            c11 = j4;
                                            arrayList14 = arrayList21;
                                            str15 = str28;
                                            str73 = str2;
                                            arrayList41 = arrayList17;
                                            arrayList16 = arrayList18;
                                            str14 = str24;
                                            str18 = str26;
                                            str17 = str25;
                                            str88 = str22;
                                            str72 = str;
                                            arrayList10 = arrayList19;
                                            str79 = str3;
                                            str19 = str27;
                                            str85 = str35;
                                            xmlPullParser3 = xmlPullParser2;
                                            j8 = j2;
                                            str12 = str29;
                                            j34 = j5;
                                            z2 = z3;
                                            arrayList12 = arrayList22;
                                            j9 = j10;
                                            str87 = str31;
                                            str82 = str5;
                                            arrayList45 = arrayList2;
                                            j31 = j12;
                                            str86 = str20;
                                            str84 = str21;
                                        }
                                    } else {
                                        arrayList6 = arrayList41;
                                        String str136 = str78;
                                        j3 = j33;
                                        str = str72;
                                        z3 = z2;
                                        str2 = str73;
                                        String str137 = str79;
                                        long j46 = j31;
                                        j4 = c11;
                                        String str138 = str82;
                                        ArrayList arrayList67 = arrayList5;
                                        arrayList2 = arrayList40;
                                        j5 = j22;
                                        j2 = c8;
                                        arrayList7 = arrayList39;
                                        XmlPullParser xmlPullParser4 = xmlPullParser3;
                                        if (nja1.d(xmlPullParser4, "EventStream")) {
                                            String str139 = str81;
                                            String attributeValue32 = xmlPullParser4.getAttributeValue(null, str139);
                                            String str140 = attributeValue32 == null ? "" : attributeValue32;
                                            String attributeValue33 = xmlPullParser4.getAttributeValue(null, str137);
                                            String str141 = attributeValue33 == null ? "" : attributeValue33;
                                            String attributeValue34 = xmlPullParser4.getAttributeValue(null, "timescale");
                                            long parseLong = attributeValue34 == null ? 1L : Long.parseLong(attributeValue34);
                                            ArrayList arrayList68 = new ArrayList();
                                            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream(512);
                                            while (true) {
                                                xmlPullParser4.next();
                                                if (nja1.d(xmlPullParser4, "Event")) {
                                                    str10 = str136;
                                                    String attributeValue35 = xmlPullParser4.getAttributeValue(null, str10);
                                                    long parseLong2 = attributeValue35 == null ? 0L : Long.parseLong(attributeValue35);
                                                    str9 = str138;
                                                    String attributeValue36 = xmlPullParser4.getAttributeValue(null, str9);
                                                    long parseLong3 = attributeValue36 == null ? -9223372036854775807L : Long.parseLong(attributeValue36);
                                                    String attributeValue37 = xmlPullParser4.getAttributeValue(null, "presentationTime");
                                                    long parseLong4 = attributeValue37 == null ? 0L : Long.parseLong(attributeValue37);
                                                    long h = rf71.h(parseLong3, 1000L, parseLong);
                                                    long h2 = rf71.h(parseLong4, 1000000L, parseLong);
                                                    j7 = parseLong;
                                                    String attributeValue38 = xmlPullParser4.getAttributeValue(null, "messageData");
                                                    if (attributeValue38 == null) {
                                                        attributeValue38 = null;
                                                    }
                                                    byteArrayOutputStream.reset();
                                                    XmlSerializer newSerializer = Xml.newSerializer();
                                                    newSerializer.setOutput(byteArrayOutputStream, md81.c.name());
                                                    xmlPullParser4.nextToken();
                                                    while (!nja1.c(xmlPullParser4, "Event")) {
                                                        switch (xmlPullParser4.getEventType()) {
                                                            case 0:
                                                                str11 = str139;
                                                                arrayList9 = arrayList67;
                                                                newSerializer.startDocument(null, Boolean.FALSE);
                                                                break;
                                                            case 1:
                                                                str11 = str139;
                                                                arrayList9 = arrayList67;
                                                                newSerializer.endDocument();
                                                                break;
                                                            case 2:
                                                                newSerializer.startTag(xmlPullParser4.getNamespace(), xmlPullParser4.getName());
                                                                int i47 = 0;
                                                                while (i47 < xmlPullParser4.getAttributeCount()) {
                                                                    newSerializer.attribute(xmlPullParser4.getAttributeNamespace(i47), xmlPullParser4.getAttributeName(i47), xmlPullParser4.getAttributeValue(i47));
                                                                    i47++;
                                                                    arrayList67 = arrayList67;
                                                                    str139 = str139;
                                                                }
                                                                str11 = str139;
                                                                arrayList9 = arrayList67;
                                                                break;
                                                            case 3:
                                                                newSerializer.endTag(xmlPullParser4.getNamespace(), xmlPullParser4.getName());
                                                                str11 = str139;
                                                                arrayList9 = arrayList67;
                                                                break;
                                                            case 4:
                                                                newSerializer.text(xmlPullParser4.getText());
                                                                str11 = str139;
                                                                arrayList9 = arrayList67;
                                                                break;
                                                            case 5:
                                                                newSerializer.cdsect(xmlPullParser4.getText());
                                                                str11 = str139;
                                                                arrayList9 = arrayList67;
                                                                break;
                                                            case 6:
                                                                newSerializer.entityRef(xmlPullParser4.getText());
                                                                str11 = str139;
                                                                arrayList9 = arrayList67;
                                                                break;
                                                            case 7:
                                                                newSerializer.ignorableWhitespace(xmlPullParser4.getText());
                                                                str11 = str139;
                                                                arrayList9 = arrayList67;
                                                                break;
                                                            case 8:
                                                                newSerializer.processingInstruction(xmlPullParser4.getText());
                                                                str11 = str139;
                                                                arrayList9 = arrayList67;
                                                                break;
                                                            case 9:
                                                                newSerializer.comment(xmlPullParser4.getText());
                                                                str11 = str139;
                                                                arrayList9 = arrayList67;
                                                                break;
                                                            case 10:
                                                                newSerializer.docdecl(xmlPullParser4.getText());
                                                                str11 = str139;
                                                                arrayList9 = arrayList67;
                                                                break;
                                                            default:
                                                                str11 = str139;
                                                                arrayList9 = arrayList67;
                                                                break;
                                                        }
                                                        xmlPullParser4.nextToken();
                                                        arrayList67 = arrayList9;
                                                        str139 = str11;
                                                    }
                                                    str81 = str139;
                                                    arrayList8 = arrayList67;
                                                    newSerializer.flush();
                                                    byte[] byteArray = byteArrayOutputStream.toByteArray();
                                                    Long valueOf = Long.valueOf(h2);
                                                    if (attributeValue38 != null) {
                                                        byteArray = attributeValue38.getBytes(md81.c);
                                                    }
                                                    str7 = str140;
                                                    str8 = str141;
                                                    arrayList68.add(Pair.create(valueOf, new nm0(str140, str141, h, parseLong2, byteArray)));
                                                } else {
                                                    str81 = str139;
                                                    arrayList8 = arrayList67;
                                                    str7 = str140;
                                                    str8 = str141;
                                                    j7 = parseLong;
                                                    str9 = str138;
                                                    str10 = str136;
                                                    m(xmlPullParser4);
                                                }
                                                if (nja1.c(xmlPullParser4, "EventStream")) {
                                                    long[] jArr = new long[arrayList68.size()];
                                                    nm0[] nm0VarArr = new nm0[arrayList68.size()];
                                                    for (int i48 = 0; i48 < arrayList68.size(); i48++) {
                                                        Pair pair = (Pair) arrayList68.get(i48);
                                                        jArr[i48] = ((Long) pair.first).longValue();
                                                        nm0VarArr[i48] = (nm0) pair.second;
                                                    }
                                                    arrayList43.add(new i981(str7, str8, jArr, nm0VarArr));
                                                    str3 = str137;
                                                    xmlPullParser3 = xmlPullParser4;
                                                    str4 = str10;
                                                    str5 = str9;
                                                    arrayList5 = arrayList8;
                                                    j6 = j46;
                                                    z4 = false;
                                                } else {
                                                    str140 = str7;
                                                    str141 = str8;
                                                    str136 = str10;
                                                    str138 = str9;
                                                    arrayList67 = arrayList8;
                                                    str139 = str81;
                                                    parseLong = j7;
                                                }
                                            }
                                        } else {
                                            ArrayList arrayList69 = arrayList43;
                                            if (nja1.d(xmlPullParser4, "SegmentBase")) {
                                                ea81Var3 = i(xmlPullParser4, null);
                                                arrayList43 = arrayList69;
                                                str3 = str137;
                                                xmlPullParser3 = xmlPullParser4;
                                                str4 = str136;
                                                str5 = str138;
                                                arrayList5 = arrayList67;
                                                str6 = str80;
                                                j6 = j46;
                                                z4 = false;
                                            } else if (nja1.d(xmlPullParser4, "SegmentList")) {
                                                long b7 = b(xmlPullParser4, -9223372036854775807L);
                                                arrayList43 = arrayList69;
                                                str3 = str137;
                                                xmlPullParser3 = xmlPullParser4;
                                                str4 = str136;
                                                str5 = str138;
                                                arrayList5 = arrayList67;
                                                z4 = false;
                                                ea81Var3 = g(xmlPullParser3, null, j46, j4, j3, b7, j2);
                                                j2 = j2;
                                                j6 = j46;
                                                j32 = b7;
                                            } else {
                                                arrayList43 = arrayList69;
                                                str3 = str137;
                                                xmlPullParser3 = xmlPullParser4;
                                                str4 = str136;
                                                str5 = str138;
                                                arrayList5 = arrayList67;
                                                j6 = j46;
                                                z4 = false;
                                                if (nja1.d(xmlPullParser3, str83)) {
                                                    long b8 = b(xmlPullParser3, -9223372036854775807L);
                                                    p481 p481Var = t31.b;
                                                    ea81Var3 = h(xmlPullParser3, null, wk2.x, j6, j4, j3, b8, j2);
                                                    j32 = b8;
                                                } else if (nja1.d(xmlPullParser3, "AssetIdentifier")) {
                                                    l(xmlPullParser3, "AssetIdentifier");
                                                } else {
                                                    m(xmlPullParser3);
                                                }
                                            }
                                        }
                                    }
                                    str6 = str80;
                                }
                                if (nja1.c(xmlPullParser3, str6)) {
                                    Pair create = Pair.create(new ey71(attributeValue12, c10, arrayList5, arrayList43), Long.valueOf(j4));
                                    ey71 ey71Var = (ey71) create.first;
                                    if (ey71Var.b != -9223372036854775807L) {
                                        long longValue = ((Long) create.second).longValue();
                                        long j47 = longValue == -9223372036854775807L ? -9223372036854775807L : longValue + ey71Var.b;
                                        arrayList3 = arrayList7;
                                        arrayList3.add(ey71Var);
                                        j22 = j47;
                                    } else {
                                        if (!equals) {
                                            throw new aa2("Unable to determine start of period " + arrayList7.size(), null, true, 4);
                                        }
                                        arrayList3 = arrayList7;
                                        j22 = j5;
                                        z6 = true;
                                    }
                                } else {
                                    str80 = str6;
                                    c8 = j2;
                                    arrayList39 = arrayList7;
                                    arrayList40 = arrayList2;
                                    j22 = j5;
                                    z2 = z3;
                                    arrayList41 = arrayList6;
                                    arrayList44 = arrayList4;
                                    arrayList42 = arrayList5;
                                    c11 = j4;
                                    str78 = str4;
                                    str73 = str2;
                                    str72 = str;
                                    str82 = str5;
                                    str79 = str3;
                                    j31 = j6;
                                    j33 = j3;
                                }
                            }
                        }
                        if (nja1.c(xmlPullParser3, "MPD")) {
                            if (c5 == -9223372036854775807L) {
                                if (j22 != -9223372036854775807L) {
                                    c5 = j22;
                                } else if (!equals) {
                                    throw new aa2("Unable to determine duration of static manifest.", null, true, 4);
                                }
                            }
                            if (arrayList3.isEmpty()) {
                                throw new aa2("No periods found.", null, true, 4);
                            }
                            return new dh81(B, c5, c6, equals, c7, j2, c9, B2, um71Var, rbhVar, qh71Var, uri2, arrayList3);
                        }
                        arrayList39 = arrayList3;
                        c8 = j2;
                        arrayList40 = arrayList2;
                        j21 = j;
                        j20 = -9223372036854775807L;
                        a = arrayList;
                        z2 = z3;
                        str71 = null;
                        z = true;
                    }
                }
                z4 = false;
                j2 = c8;
                if (nja1.c(xmlPullParser3, "MPD")) {
                }
            }
            arrayList = a;
            j = j21;
            arrayList2 = arrayList40;
            z3 = z2;
            arrayList3 = arrayList39;
            z4 = false;
            j2 = c8;
            if (nja1.c(xmlPullParser3, "MPD")) {
            }
        }
    }

    public static ol81 l(XmlPullParser xmlPullParser, String str) {
        String attributeValue = xmlPullParser.getAttributeValue(null, "schemeIdUri");
        if (attributeValue == null) {
            attributeValue = "";
        }
        String attributeValue2 = xmlPullParser.getAttributeValue(null, "value");
        if (attributeValue2 == null) {
            attributeValue2 = null;
        }
        String attributeValue3 = xmlPullParser.getAttributeValue(null, "id");
        String str2 = attributeValue3 != null ? attributeValue3 : null;
        do {
            xmlPullParser.next();
        } while (!nja1.c(xmlPullParser, str));
        return new ol81(attributeValue, attributeValue2, str2);
    }

    public static void m(XmlPullParser xmlPullParser) {
        if (xmlPullParser.getEventType() == 2) {
            int i = 1;
            while (i != 0) {
                xmlPullParser.next();
                if (xmlPullParser.getEventType() == 2) {
                    i++;
                } else if (xmlPullParser.getEventType() == 3) {
                    i--;
                }
            }
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x0081, code lost:
    
        if (r3 == 0) goto L81;
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x00b9, code lost:
    
        if (r0.equals("fa01") == false) goto L58;
     */
    /* JADX WARN: Code restructure failed: missing block: B:56:0x0105, code lost:
    
        if (r3 < 33) goto L94;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static int n(XmlPullParser xmlPullParser) {
        char c2;
        String attributeValue = xmlPullParser.getAttributeValue(null, "schemeIdUri");
        if (attributeValue == null) {
            attributeValue = null;
        }
        attributeValue.getClass();
        int i = 6;
        char c3 = 3;
        switch (attributeValue.hashCode()) {
            case -2128649360:
                if (attributeValue.equals("urn:dts:dash:audio_channel_configuration:2012")) {
                    c2 = 0;
                    break;
                }
                c2 = 65535;
                break;
            case -1352850286:
                if (attributeValue.equals("urn:mpeg:dash:23003:3:audio_channel_configuration:2011")) {
                    c2 = 1;
                    break;
                }
                c2 = 65535;
                break;
            case -1138141449:
                if (attributeValue.equals("tag:dolby.com,2014:dash:audio_channel_configuration:2011")) {
                    c2 = 2;
                    break;
                }
                c2 = 65535;
                break;
            case -986633423:
                if (attributeValue.equals("urn:mpeg:mpegB:cicp:ChannelConfiguration")) {
                    c2 = 3;
                    break;
                }
                c2 = 65535;
                break;
            case -79006963:
                if (attributeValue.equals("tag:dts.com,2014:dash:audio_channel_configuration:2012")) {
                    c2 = 4;
                    break;
                }
                c2 = 65535;
                break;
            case 312179081:
                if (attributeValue.equals("tag:dts.com,2018:uhd:audio_channel_configuration")) {
                    c2 = 5;
                    break;
                }
                c2 = 65535;
                break;
            case 2036691300:
                if (attributeValue.equals("urn:dolby:dash:audio_channel_configuration:2011")) {
                    c2 = 6;
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
                String attributeValue2 = xmlPullParser.getAttributeValue(null, "value");
                i = attributeValue2 == null ? -1 : Integer.parseInt(attributeValue2);
                if (i > 0) {
                    break;
                }
                i = -1;
                break;
            case 1:
                String attributeValue3 = xmlPullParser.getAttributeValue(null, "value");
                if (attributeValue3 != null) {
                    i = Integer.parseInt(attributeValue3);
                    break;
                }
                i = -1;
                break;
            case 2:
            case 6:
                String attributeValue4 = xmlPullParser.getAttributeValue(null, "value");
                if (attributeValue4 != null) {
                    String a = tea1.a(attributeValue4);
                    a.getClass();
                    switch (a.hashCode()) {
                        case 1596796:
                            if (a.equals("4000")) {
                                c3 = 0;
                                break;
                            }
                            c3 = 65535;
                            break;
                        case 2937391:
                            if (a.equals("a000")) {
                                c3 = 1;
                                break;
                            }
                            c3 = 65535;
                            break;
                        case 3094035:
                            if (a.equals("f801")) {
                                c3 = 2;
                                break;
                            }
                            c3 = 65535;
                            break;
                        case 3133436:
                            break;
                        default:
                            c3 = 65535;
                            break;
                    }
                    switch (c3) {
                        case 0:
                            i = 1;
                            break;
                        case 1:
                            i = 2;
                            break;
                        case 3:
                            i = 8;
                            break;
                    }
                }
                i = -1;
                break;
            case 3:
                String attributeValue5 = xmlPullParser.getAttributeValue(null, "value");
                int parseInt = attributeValue5 == null ? -1 : Integer.parseInt(attributeValue5);
                if (parseInt >= 0) {
                    int[] iArr = x;
                    if (parseInt < iArr.length) {
                        i = iArr[parseInt];
                        break;
                    }
                }
                i = -1;
                break;
            case 5:
                String attributeValue6 = xmlPullParser.getAttributeValue(null, "value");
                if (attributeValue6 != null) {
                    i = Integer.bitCount(Integer.parseInt(attributeValue6, 16));
                    break;
                }
                i = -1;
                break;
            default:
                i = -1;
                break;
        }
        do {
            xmlPullParser.next();
        } while (!nja1.c(xmlPullParser, "AudioChannelConfiguration"));
        return i;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:37:0x015e  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x00dd  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x00e5  */
    /* JADX WARN: Type inference failed for: r6v0 */
    /* JADX WARN: Type inference failed for: r6v1 */
    /* JADX WARN: Type inference failed for: r6v15, types: [java.util.UUID] */
    /* JADX WARN: Type inference failed for: r6v16, types: [java.util.UUID] */
    /* JADX WARN: Type inference failed for: r6v17 */
    /* JADX WARN: Type inference failed for: r6v18, types: [java.util.UUID] */
    /* JADX WARN: Type inference failed for: r6v2 */
    /* JADX WARN: Type inference failed for: r6v22 */
    /* JADX WARN: Type inference failed for: r6v24, types: [java.util.UUID] */
    /* JADX WARN: Type inference failed for: r6v3 */
    /* JADX WARN: Type inference failed for: r6v4, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r6v7 */
    /* JADX WARN: Type inference failed for: r6v8 */
    /* JADX WARN: Type inference failed for: r6v9, types: [java.util.UUID] */
    /* JADX WARN: Type inference failed for: r7v11 */
    /* JADX WARN: Type inference failed for: r7v12 */
    /* JADX WARN: Type inference failed for: r7v14, types: [byte[]] */
    /* JADX WARN: Type inference failed for: r7v2 */
    /* JADX WARN: Type inference failed for: r7v26 */
    /* JADX WARN: Type inference failed for: r7v27 */
    /* JADX WARN: Type inference failed for: r7v28 */
    /* JADX WARN: Type inference failed for: r7v29 */
    /* JADX WARN: Type inference failed for: r7v3 */
    /* JADX WARN: Type inference failed for: r7v30 */
    /* JADX WARN: Type inference failed for: r7v31 */
    /* JADX WARN: Type inference failed for: r9v4, types: [java.util.UUID] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static Pair o(XmlPullParser xmlPullParser) {
        String str;
        ?? r6;
        String str2;
        String str3;
        ?? r7;
        char c2;
        String str4;
        String attributeValue = xmlPullParser.getAttributeValue(null, "schemeIdUri");
        if (attributeValue != null) {
            String a = tea1.a(attributeValue);
            a.getClass();
            switch (a.hashCode()) {
                case -1980789791:
                    if (a.equals("urn:uuid:e2719d58-a985-b3c9-781a-b030af78d30e")) {
                        c2 = 0;
                        break;
                    }
                    c2 = 65535;
                    break;
                case 489446379:
                    if (a.equals("urn:uuid:9a04f079-9840-4286-ab92-e65be0885f95")) {
                        c2 = 1;
                        break;
                    }
                    c2 = 65535;
                    break;
                case 755418770:
                    if (a.equals("urn:uuid:edef8ba9-79d6-4ace-a3c8-27dcd51d21ed")) {
                        c2 = 2;
                        break;
                    }
                    c2 = 65535;
                    break;
                case 1812765994:
                    if (a.equals("urn:mpeg:dash:mp4protection:2011")) {
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
                    r6 = sm81.c;
                    str = null;
                    str2 = null;
                    str3 = str2;
                    r7 = str2;
                    break;
                case 1:
                    r6 = sm81.e;
                    str = null;
                    str2 = null;
                    str3 = str2;
                    r7 = str2;
                    break;
                case 2:
                    r6 = sm81.d;
                    str = null;
                    str2 = null;
                    str3 = str2;
                    r7 = str2;
                    break;
                case 3:
                    str = xmlPullParser.getAttributeValue(null, "value");
                    int attributeCount = xmlPullParser.getAttributeCount();
                    int i = 0;
                    while (true) {
                        if (i >= attributeCount) {
                            str4 = null;
                        } else {
                            String attributeName = xmlPullParser.getAttributeName(i);
                            int indexOf = attributeName.indexOf(58);
                            if (indexOf != -1) {
                                attributeName = attributeName.substring(indexOf + 1);
                            }
                            if (attributeName.equals("default_KID")) {
                                str4 = xmlPullParser.getAttributeValue(i);
                            } else {
                                i++;
                            }
                        }
                    }
                    if (!TextUtils.isEmpty(str4) && !"00000000-0000-0000-0000-000000000000".equals(str4)) {
                        String[] split = str4.split("\\s+");
                        UUID[] uuidArr = new UUID[split.length];
                        for (int i2 = 0; i2 < split.length; i2++) {
                            uuidArr[i2] = UUID.fromString(split[i2]);
                        }
                        r6 = sm81.b;
                        str3 = null;
                        r7 = sba1.f(r6, uuidArr, null);
                        break;
                    } else {
                        r6 = null;
                        str2 = r6;
                        str3 = str2;
                        r7 = str2;
                        break;
                    }
                    break;
            }
            do {
                xmlPullParser.next();
                if (!nja1.d(xmlPullParser, "clearkey:Laurl") && xmlPullParser.next() == 4) {
                    str3 = xmlPullParser.getText();
                    r7 = r7;
                } else if (nja1.d(xmlPullParser, "ms:laurl")) {
                    if (r7 == 0 && xmlPullParser.getEventType() == 2) {
                        String name = xmlPullParser.getName();
                        int indexOf2 = name.indexOf(58);
                        if (indexOf2 != -1) {
                            name = name.substring(indexOf2 + 1);
                        }
                        if (name.equals("pssh") && xmlPullParser.next() == 4) {
                            byte[] decode = Base64.decode(xmlPullParser.getText(), 0);
                            nr41 c3 = sba1.c(decode);
                            UUID uuid = c3 == null ? null : (UUID) c3.b;
                            if (uuid == null) {
                                nba1.e();
                                r6 = uuid;
                                r7 = 0;
                            } else {
                                UUID uuid2 = uuid;
                                r7 = decode;
                                r6 = uuid2;
                            }
                        }
                    }
                    if (r7 == 0) {
                        ?? r9 = sm81.e;
                        if (r9.equals(r6) && nja1.d(xmlPullParser, "mspr:pro") && xmlPullParser.next() == 4) {
                            r7 = sba1.f(r9, null, Base64.decode(xmlPullParser.getText(), 0));
                        }
                    }
                    m(xmlPullParser);
                    r7 = r7;
                } else {
                    str3 = xmlPullParser.getAttributeValue(null, "licenseUrl");
                    r7 = r7;
                }
            } while (!nja1.c(xmlPullParser, "ContentProtection"));
            return Pair.create(str, r6 != null ? new jk0(r6, str3, "video/mp4", r7) : null);
        }
        str = null;
        r6 = null;
        str2 = r6;
        str3 = str2;
        r7 = str2;
        do {
            xmlPullParser.next();
            if (!nja1.d(xmlPullParser, "clearkey:Laurl")) {
            }
            if (nja1.d(xmlPullParser, "ms:laurl")) {
            }
        } while (!nja1.c(xmlPullParser, "ContentProtection"));
        return Pair.create(str, r6 != null ? new jk0(r6, str3, "video/mp4", r7) : null);
    }

    @Override // defpackage.ql61
    public final Object a(Uri uri, ef71 ef71Var) {
        try {
            XmlPullParser newPullParser = this.a.newPullParser();
            newPullParser.setInput(ef71Var, null);
            if (newPullParser.next() == 2 && "MPD".equals(newPullParser.getName())) {
                return k(newPullParser, uri);
            }
            throw new aa2("inputStream does not contain a valid media presentation description", null, true, 4);
        } catch (XmlPullParserException e) {
            throw new aa2(null, e, true, 4);
        }
    }

    public static long a(ArrayList arrayList, long j, long j2, int i, long j3) {
        int i2;
        if (i >= 0) {
            i2 = i + 1;
        } else {
            int i3 = rf71.a;
            i2 = (int) ((((j3 - j) + j2) - 1) / j2);
        }
        for (int i4 = 0; i4 < i2; i4++) {
            arrayList.add(new q381(j, j2));
            j += j2;
        }
        return j;
    }
}
