package defpackage;

import android.net.Uri;
import android.text.TextUtils;
import android.util.Base64;
import android.util.Pair;
import android.util.Xml;
import com.connectsdk.device.ConnectableDevice;
import com.connectsdk.service.webos.lgcast.remotecamera.RemoteCameraConfig;
import com.connectsdk.service.webos.lgcast.remotecamera.service.CameraProperty;
import io.appmetrica.analytics.coreutils.internal.StringUtils;
import io.appmetrica.analytics.rtm.internal.Constants;
import java.io.ByteArrayOutputStream;
import java.math.RoundingMode;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import org.xml.sax.helpers.DefaultHandler;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;
import org.xmlpull.v1.XmlPullParserFactory;
import org.xmlpull.v1.XmlSerializer;

/* loaded from: classes.dex */
public class f97 extends DefaultHandler implements c8k {
    public static final Pattern b = Pattern.compile("(\\d+)(?:/(\\d+))?");
    public static final Pattern c = Pattern.compile("CC([1-4])=.*");
    public static final Pattern d = Pattern.compile("([1-9]|[1-5][0-9]|6[0-3])=.*");
    public static final int[] e = {2, 1, 2, 2, 2, 2, 1, 2, 2, 1, 1, 1, 1, 2, 1, 1, 2, 2, 2};
    public static final int[] f = {-1, 1, 2, 3, 4, 5, 6, 8, 2, 3, 4, 7, 8, 24, 8, 12, 10, 12, 14, 12, 14};
    public final XmlPullParserFactory a;

    public f97() {
        try {
            this.a = XmlPullParserFactory.newInstance();
        } catch (XmlPullParserException e2) {
            kac.k("Couldn't create XmlPullParserFactory instance", e2);
            throw null;
        }
    }

    public static dnh B(XmlPullParser xmlPullParser) {
        long j = -9223372036854775807L;
        long j2 = -9223372036854775807L;
        long j3 = -9223372036854775807L;
        float f2 = -3.4028235E38f;
        float f3 = -3.4028235E38f;
        do {
            xmlPullParser.next();
            if (g0g.R("Latency", xmlPullParser)) {
                String attributeValue = xmlPullParser.getAttributeValue(null, "target");
                j = attributeValue == null ? -9223372036854775807L : Long.parseLong(attributeValue);
                String attributeValue2 = xmlPullParser.getAttributeValue(null, "min");
                j2 = attributeValue2 == null ? -9223372036854775807L : Long.parseLong(attributeValue2);
                String attributeValue3 = xmlPullParser.getAttributeValue(null, "max");
                j3 = attributeValue3 == null ? -9223372036854775807L : Long.parseLong(attributeValue3);
            } else if (g0g.R("PlaybackRate", xmlPullParser)) {
                String attributeValue4 = xmlPullParser.getAttributeValue(null, "min");
                f2 = attributeValue4 == null ? -3.4028235E38f : Float.parseFloat(attributeValue4);
                String attributeValue5 = xmlPullParser.getAttributeValue(null, "max");
                f3 = attributeValue5 == null ? -3.4028235E38f : Float.parseFloat(attributeValue5);
            }
        } while (!g0g.Q("ServiceDescription", xmlPullParser));
        dnh dnhVar = new dnh();
        dnhVar.a = j;
        dnhVar.b = j2;
        dnhVar.c = j3;
        dnhVar.d = f2;
        dnhVar.e = f3;
        return dnhVar;
    }

    public static String C(String str, XmlPullParser xmlPullParser) {
        String str2 = "";
        do {
            xmlPullParser.next();
            if (xmlPullParser.getEventType() == 4) {
                str2 = xmlPullParser.getText();
            } else {
                g(xmlPullParser);
            }
        } while (!g0g.Q(str, xmlPullParser));
        return str2;
    }

    public static long a(ArrayList arrayList, long j, long j2, int i, long j3) {
        int i2;
        if (i >= 0) {
            i2 = i + 1;
        } else {
            int i3 = dvt.a;
            i2 = (int) ((((j3 - j) + j2) - 1) / j2);
        }
        for (int i4 = 0; i4 < i2; i4++) {
            arrayList.add(new cbp(j, j2));
            j += j2;
        }
        return j;
    }

    public static void g(XmlPullParser xmlPullParser) {
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
    /* JADX WARN: Code restructure failed: missing block: B:12:0x008f, code lost:
    
        if (r12 == 0) goto L135;
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x0093, code lost:
    
        r10 = r12;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x00cc, code lost:
    
        if (r12.equals("fa01") == false) goto L63;
     */
    /* JADX WARN: Code restructure failed: missing block: B:74:0x0190, code lost:
    
        if (r12 == 0) goto L135;
     */
    /* JADX WARN: Code restructure failed: missing block: B:80:0x01a3, code lost:
    
        if (r12 < 33) goto L49;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static int h(String str, XmlPullParser xmlPullParser) {
        char c2;
        int parseInt;
        String attributeValue = xmlPullParser.getAttributeValue(null, "schemeIdUri");
        if (attributeValue == null) {
            attributeValue = null;
        }
        attributeValue.getClass();
        int i = 5;
        char c3 = 4;
        int i2 = 0;
        int i3 = -1;
        switch (attributeValue.hashCode()) {
            case -2128649360:
                if (attributeValue.equals("urn:dts:dash:audio_channel_configuration:2012")) {
                    c2 = 0;
                    break;
                }
                c2 = 65535;
                break;
            case -2060825028:
                if (attributeValue.equals("tag:dolby.com,2015:dash:audio_channel_configuration:2015")) {
                    c2 = 1;
                    break;
                }
                c2 = 65535;
                break;
            case -1352850286:
                if (attributeValue.equals("urn:mpeg:dash:23003:3:audio_channel_configuration:2011")) {
                    c2 = 2;
                    break;
                }
                c2 = 65535;
                break;
            case -1138141449:
                if (attributeValue.equals("tag:dolby.com,2014:dash:audio_channel_configuration:2011")) {
                    c2 = 3;
                    break;
                }
                c2 = 65535;
                break;
            case -986633423:
                if (attributeValue.equals("urn:mpeg:mpegB:cicp:ChannelConfiguration")) {
                    c2 = 4;
                    break;
                }
                c2 = 65535;
                break;
            case -79006963:
                if (attributeValue.equals("tag:dts.com,2014:dash:audio_channel_configuration:2012")) {
                    c2 = 5;
                    break;
                }
                c2 = 65535;
                break;
            case 312179081:
                if (attributeValue.equals("tag:dts.com,2018:uhd:audio_channel_configuration")) {
                    c2 = 6;
                    break;
                }
                c2 = 65535;
                break;
            case 2036691300:
                if (attributeValue.equals("urn:dolby:dash:audio_channel_configuration:2011")) {
                    c2 = 7;
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
            case 5:
                String attributeValue2 = xmlPullParser.getAttributeValue(null, Constants.KEY_VALUE);
                parseInt = attributeValue2 == null ? -1 : Integer.parseInt(attributeValue2);
                if (parseInt > 0) {
                    break;
                }
                break;
            case 1:
                String attributeValue3 = xmlPullParser.getAttributeValue(null, Constants.KEY_VALUE);
                if (attributeValue3 != null && attributeValue3.length() == 6) {
                    int parseInt2 = Integer.parseInt(attributeValue3, 16);
                    if ((8388608 & parseInt2) == 0) {
                        parseInt = 0;
                        while (true) {
                            int[] iArr = e;
                            if (i2 >= iArr.length) {
                                break;
                            } else {
                                parseInt += ((parseInt2 >> i2) & 1) * iArr[i2];
                                i2++;
                            }
                        }
                    } else {
                        String[] j0 = dvt.j0(str);
                        if (j0.length != 0) {
                            List f2 = rjp.e('.').f(ltg.M(j0[0].trim()));
                            if (f2.size() == 4 && ((String) f2.get(0)).equals("ac-4")) {
                                String str2 = (String) f2.get(3);
                                str2.getClass();
                                if (!str2.equals("03")) {
                                    if (str2.equals("04")) {
                                        i3 = 21;
                                        break;
                                    }
                                } else {
                                    i3 = 18;
                                    break;
                                }
                            }
                        }
                    }
                }
                break;
            case 2:
                String attributeValue4 = xmlPullParser.getAttributeValue(null, Constants.KEY_VALUE);
                if (attributeValue4 != null) {
                    i3 = Integer.parseInt(attributeValue4);
                    break;
                }
                break;
            case 3:
            case 7:
                String attributeValue5 = xmlPullParser.getAttributeValue(null, Constants.KEY_VALUE);
                if (attributeValue5 != null) {
                    String M = ltg.M(attributeValue5);
                    M.getClass();
                    switch (M.hashCode()) {
                        case 1596796:
                            if (M.equals("4000")) {
                                c3 = 0;
                                break;
                            }
                            c3 = 65535;
                            break;
                        case 2937391:
                            if (M.equals("a000")) {
                                c3 = 1;
                                break;
                            }
                            c3 = 65535;
                            break;
                        case 3094034:
                            if (M.equals("f800")) {
                                c3 = 2;
                                break;
                            }
                            c3 = 65535;
                            break;
                        case 3094035:
                            if (M.equals("f801")) {
                                c3 = 3;
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
                            i = 6;
                            break;
                        case 4:
                            i = 8;
                            break;
                    }
                    i3 = i;
                    break;
                }
                i = -1;
                i3 = i;
            case 4:
                String attributeValue6 = xmlPullParser.getAttributeValue(null, Constants.KEY_VALUE);
                int parseInt3 = attributeValue6 == null ? -1 : Integer.parseInt(attributeValue6);
                if (parseInt3 >= 0) {
                    int[] iArr2 = f;
                    if (parseInt3 < iArr2.length) {
                        i3 = iArr2[parseInt3];
                        break;
                    }
                }
                break;
            case 6:
                String attributeValue7 = xmlPullParser.getAttributeValue(null, Constants.KEY_VALUE);
                if (attributeValue7 != null) {
                    parseInt = Integer.bitCount(Integer.parseInt(attributeValue7, 16));
                    break;
                }
                break;
        }
        do {
            xmlPullParser.next();
        } while (!g0g.Q("AudioChannelConfiguration", xmlPullParser));
        return i3;
    }

    public static long i(XmlPullParser xmlPullParser, long j) {
        String attributeValue = xmlPullParser.getAttributeValue(null, "availabilityTimeOffset");
        if (attributeValue == null) {
            return j;
        }
        if ("INF".equals(attributeValue)) {
            return Long.MAX_VALUE;
        }
        return (long) (Float.parseFloat(attributeValue) * 1000000.0f);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:39:0x016f  */
    /* JADX WARN: Type inference failed for: r10v7, types: [java.util.UUID] */
    /* JADX WARN: Type inference failed for: r7v0 */
    /* JADX WARN: Type inference failed for: r7v1 */
    /* JADX WARN: Type inference failed for: r7v10 */
    /* JADX WARN: Type inference failed for: r7v16, types: [java.util.UUID] */
    /* JADX WARN: Type inference failed for: r7v17, types: [java.util.UUID] */
    /* JADX WARN: Type inference failed for: r7v18 */
    /* JADX WARN: Type inference failed for: r7v19, types: [java.util.UUID] */
    /* JADX WARN: Type inference failed for: r7v2 */
    /* JADX WARN: Type inference failed for: r7v24 */
    /* JADX WARN: Type inference failed for: r7v26, types: [java.util.UUID] */
    /* JADX WARN: Type inference failed for: r7v3 */
    /* JADX WARN: Type inference failed for: r7v4, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r7v5, types: [java.util.UUID] */
    /* JADX WARN: Type inference failed for: r7v8 */
    /* JADX WARN: Type inference failed for: r8v12 */
    /* JADX WARN: Type inference failed for: r8v13 */
    /* JADX WARN: Type inference failed for: r8v2 */
    /* JADX WARN: Type inference failed for: r8v26 */
    /* JADX WARN: Type inference failed for: r8v27 */
    /* JADX WARN: Type inference failed for: r8v28 */
    /* JADX WARN: Type inference failed for: r8v29 */
    /* JADX WARN: Type inference failed for: r8v3 */
    /* JADX WARN: Type inference failed for: r8v30 */
    /* JADX WARN: Type inference failed for: r8v31 */
    /* JADX WARN: Type inference failed for: r8v4, types: [byte[]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static Pair k(XmlPullParser xmlPullParser) {
        String str;
        ?? r7;
        String str2;
        String str3;
        ?? r8;
        char c2;
        String str4;
        String attributeValue = xmlPullParser.getAttributeValue(null, "schemeIdUri");
        if (attributeValue != null) {
            String M = ltg.M(attributeValue);
            M.getClass();
            switch (M.hashCode()) {
                case -1980789791:
                    if (M.equals("urn:uuid:e2719d58-a985-b3c9-781a-b030af78d30e")) {
                        c2 = 0;
                        break;
                    }
                    c2 = 65535;
                    break;
                case 489446379:
                    if (M.equals("urn:uuid:9a04f079-9840-4286-ab92-e65be0885f95")) {
                        c2 = 1;
                        break;
                    }
                    c2 = 65535;
                    break;
                case 755418770:
                    if (M.equals("urn:uuid:edef8ba9-79d6-4ace-a3c8-27dcd51d21ed")) {
                        c2 = 2;
                        break;
                    }
                    c2 = 65535;
                    break;
                case 1812765994:
                    if (M.equals("urn:mpeg:dash:mp4protection:2011")) {
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
                    r7 = un3.c;
                    str = null;
                    str2 = null;
                    str3 = str2;
                    r8 = str2;
                    break;
                case 1:
                    r7 = un3.e;
                    str = null;
                    str2 = null;
                    str3 = str2;
                    r8 = str2;
                    break;
                case 2:
                    r7 = un3.d;
                    str = null;
                    str2 = null;
                    str3 = str2;
                    r8 = str2;
                    break;
                case 3:
                    str = xmlPullParser.getAttributeValue(null, Constants.KEY_VALUE);
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
                        r7 = un3.b;
                        str3 = null;
                        r8 = wyf.u(r7, uuidArr, null);
                        break;
                    } else {
                        vq1.n0("MpdParser", "Ignoring <ContentProtection> with schemeIdUri=\"urn:mpeg:dash:mp4protection:2011\" (ClearKey) due to missing required default_KID attribute.");
                        r7 = null;
                        str2 = r7;
                        str3 = str2;
                        r8 = str2;
                        break;
                    }
                    break;
            }
            do {
                xmlPullParser.next();
                if ((!g0g.R("clearkey:Laurl", xmlPullParser) || g0g.R("dashif:Laurl", xmlPullParser)) && xmlPullParser.next() == 4) {
                    str3 = xmlPullParser.getText();
                    r8 = r8;
                } else if (g0g.R("ms:laurl", xmlPullParser)) {
                    str3 = xmlPullParser.getAttributeValue(null, "licenseUrl");
                    r8 = r8;
                } else {
                    if (r8 == 0 && xmlPullParser.getEventType() == 2) {
                        String name = xmlPullParser.getName();
                        int indexOf2 = name.indexOf(58);
                        if (indexOf2 != -1) {
                            name = name.substring(indexOf2 + 1);
                        }
                        if (name.equals("pssh") && xmlPullParser.next() == 4) {
                            byte[] decode = Base64.decode(xmlPullParser.getText(), 0);
                            anx V = wyf.V(decode);
                            UUID uuid = V == null ? null : (UUID) V.b;
                            if (uuid == null) {
                                vq1.n0("MpdParser", "Skipping malformed cenc:pssh data");
                                r7 = uuid;
                                r8 = 0;
                            } else {
                                UUID uuid2 = uuid;
                                r8 = decode;
                                r7 = uuid2;
                            }
                        }
                    }
                    if (r8 == 0) {
                        ?? r10 = un3.e;
                        if (r10.equals(r7) && g0g.R("mspr:pro", xmlPullParser) && xmlPullParser.next() == 4) {
                            r8 = wyf.u(r10, null, Base64.decode(xmlPullParser.getText(), 0));
                        }
                    }
                    g(xmlPullParser);
                    r8 = r8;
                }
            } while (!g0g.Q("ContentProtection", xmlPullParser));
            return Pair.create(str, r7 != null ? new oqa(r7, str3, "video/mp4", r8) : null);
        }
        str = null;
        r7 = null;
        str2 = r7;
        str3 = str2;
        r8 = str2;
        do {
            xmlPullParser.next();
            if (g0g.R("clearkey:Laurl", xmlPullParser)) {
            }
            str3 = xmlPullParser.getText();
            r8 = r8;
        } while (!g0g.Q("ContentProtection", xmlPullParser));
        return Pair.create(str, r7 != null ? new oqa(r7, str3, "video/mp4", r8) : null);
    }

    public static int l(XmlPullParser xmlPullParser) {
        String attributeValue = xmlPullParser.getAttributeValue(null, "contentType");
        if (TextUtils.isEmpty(attributeValue)) {
            return -1;
        }
        if (CameraProperty.AUDIO.equals(attributeValue)) {
            return 1;
        }
        if ("video".equals(attributeValue)) {
            return 2;
        }
        if ("text".equals(attributeValue)) {
            return 3;
        }
        return "image".equals(attributeValue) ? 4 : -1;
    }

    public static iy7 m(String str, XmlPullParser xmlPullParser) {
        String attributeValue = xmlPullParser.getAttributeValue(null, "schemeIdUri");
        if (attributeValue == null) {
            attributeValue = "";
        }
        String attributeValue2 = xmlPullParser.getAttributeValue(null, Constants.KEY_VALUE);
        if (attributeValue2 == null) {
            attributeValue2 = null;
        }
        String attributeValue3 = xmlPullParser.getAttributeValue(null, ConnectableDevice.KEY_ID);
        String str2 = attributeValue3 != null ? attributeValue3 : null;
        do {
            xmlPullParser.next();
        } while (!g0g.Q(str, xmlPullParser));
        return new iy7(attributeValue, attributeValue2, str2);
    }

    public static long n(XmlPullParser xmlPullParser, String str, long j) {
        String attributeValue = xmlPullParser.getAttributeValue(null, str);
        if (attributeValue == null) {
            return j;
        }
        Matcher matcher = dvt.f.matcher(attributeValue);
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

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    public static zib p(XmlPullParser xmlPullParser) {
        long j;
        ByteArrayOutputStream byteArrayOutputStream;
        long j2;
        String str;
        ArrayList arrayList;
        long j3;
        String str2;
        String str3 = null;
        String attributeValue = xmlPullParser.getAttributeValue(null, "schemeIdUri");
        String str4 = attributeValue == null ? "" : attributeValue;
        String attributeValue2 = xmlPullParser.getAttributeValue(null, Constants.KEY_VALUE);
        String str5 = attributeValue2 == null ? "" : attributeValue2;
        String attributeValue3 = xmlPullParser.getAttributeValue(null, "timescale");
        long parseLong = attributeValue3 == null ? 1L : Long.parseLong(attributeValue3);
        String attributeValue4 = xmlPullParser.getAttributeValue(null, "presentationTimeOffset");
        long parseLong2 = attributeValue4 == null ? 0L : Long.parseLong(attributeValue4);
        ArrayList arrayList2 = new ArrayList();
        ByteArrayOutputStream byteArrayOutputStream2 = new ByteArrayOutputStream(RemoteCameraConfig.Mic.BUFFER_SIZE);
        while (true) {
            xmlPullParser.next();
            if (g0g.R("Event", xmlPullParser)) {
                String attributeValue5 = xmlPullParser.getAttributeValue(str3, ConnectableDevice.KEY_ID);
                long parseLong3 = attributeValue5 == null ? 0L : Long.parseLong(attributeValue5);
                String attributeValue6 = xmlPullParser.getAttributeValue(str3, "duration");
                long parseLong4 = attributeValue6 == null ? -9223372036854775807L : Long.parseLong(attributeValue6);
                String attributeValue7 = xmlPullParser.getAttributeValue(str3, "presentationTime");
                long parseLong5 = attributeValue7 == null ? 0L : Long.parseLong(attributeValue7);
                int i = dvt.a;
                RoundingMode roundingMode = RoundingMode.DOWN;
                ByteArrayOutputStream byteArrayOutputStream3 = byteArrayOutputStream2;
                long g0 = dvt.g0(parseLong4, 1000L, parseLong, roundingMode);
                long g02 = dvt.g0(parseLong5 - parseLong2, 1000000L, parseLong, roundingMode);
                j2 = parseLong;
                String attributeValue8 = xmlPullParser.getAttributeValue(str3, "messageData");
                if (attributeValue8 == null) {
                    attributeValue8 = str3;
                }
                byteArrayOutputStream3.reset();
                XmlSerializer newSerializer = Xml.newSerializer();
                byteArrayOutputStream = byteArrayOutputStream3;
                newSerializer.setOutput(byteArrayOutputStream, StandardCharsets.UTF_8.name());
                xmlPullParser.nextToken();
                while (!g0g.Q("Event", xmlPullParser)) {
                    switch (xmlPullParser.getEventType()) {
                        case 0:
                            j3 = parseLong2;
                            str2 = null;
                            newSerializer.startDocument(null, Boolean.FALSE);
                            break;
                        case 1:
                            j3 = parseLong2;
                            newSerializer.endDocument();
                            str2 = null;
                            break;
                        case 2:
                            newSerializer.startTag(xmlPullParser.getNamespace(), xmlPullParser.getName());
                            int i2 = 0;
                            while (i2 < xmlPullParser.getAttributeCount()) {
                                newSerializer.attribute(xmlPullParser.getAttributeNamespace(i2), xmlPullParser.getAttributeName(i2), xmlPullParser.getAttributeValue(i2));
                                i2++;
                                parseLong2 = parseLong2;
                            }
                            j3 = parseLong2;
                            str2 = null;
                            break;
                        case 3:
                            newSerializer.endTag(xmlPullParser.getNamespace(), xmlPullParser.getName());
                            j3 = parseLong2;
                            str2 = null;
                            break;
                        case 4:
                            newSerializer.text(xmlPullParser.getText());
                            j3 = parseLong2;
                            str2 = str3;
                            break;
                        case 5:
                            newSerializer.cdsect(xmlPullParser.getText());
                            j3 = parseLong2;
                            str2 = str3;
                            break;
                        case 6:
                            newSerializer.entityRef(xmlPullParser.getText());
                            j3 = parseLong2;
                            str2 = str3;
                            break;
                        case 7:
                            newSerializer.ignorableWhitespace(xmlPullParser.getText());
                            j3 = parseLong2;
                            str2 = str3;
                            break;
                        case 8:
                            newSerializer.processingInstruction(xmlPullParser.getText());
                            j3 = parseLong2;
                            str2 = str3;
                            break;
                        case 9:
                            newSerializer.comment(xmlPullParser.getText());
                            j3 = parseLong2;
                            str2 = str3;
                            break;
                        case 10:
                            newSerializer.docdecl(xmlPullParser.getText());
                            j3 = parseLong2;
                            str2 = str3;
                            break;
                        default:
                            j3 = parseLong2;
                            str2 = str3;
                            break;
                    }
                    xmlPullParser.nextToken();
                    str3 = str2;
                    parseLong2 = j3;
                }
                j = parseLong2;
                str = str3;
                newSerializer.flush();
                byte[] byteArray = byteArrayOutputStream.toByteArray();
                Long valueOf = Long.valueOf(g02);
                if (attributeValue8 != null) {
                    byteArray = attributeValue8.getBytes(StandardCharsets.UTF_8);
                }
                byte[] bArr = byteArray;
                arrayList = arrayList2;
                arrayList.add(Pair.create(valueOf, new tib(str4, str5, g0, parseLong3, bArr)));
            } else {
                j = parseLong2;
                byteArrayOutputStream = byteArrayOutputStream2;
                j2 = parseLong;
                str = str3;
                arrayList = arrayList2;
                g(xmlPullParser);
            }
            if (g0g.Q("EventStream", xmlPullParser)) {
                long[] jArr = new long[arrayList.size()];
                tib[] tibVarArr = new tib[arrayList.size()];
                for (int i3 = 0; i3 < arrayList.size(); i3++) {
                    Pair pair = (Pair) arrayList.get(i3);
                    jArr[i3] = ((Long) pair.first).longValue();
                    tibVarArr[i3] = (tib) pair.second;
                }
                return new zib(str4, str5, jArr, tibVarArr);
            }
            arrayList2 = arrayList;
            str3 = str;
            parseLong = j2;
            byteArrayOutputStream2 = byteArrayOutputStream;
            parseLong2 = j;
        }
    }

    public static float q(XmlPullParser xmlPullParser, float f2) {
        String attributeValue = xmlPullParser.getAttributeValue(null, "frameRate");
        if (attributeValue != null) {
            Matcher matcher = b.matcher(attributeValue);
            if (matcher.matches()) {
                int parseInt = Integer.parseInt(matcher.group(1));
                return !TextUtils.isEmpty(matcher.group(2)) ? parseInt / Integer.parseInt(r2) : parseInt;
            }
        }
        return f2;
    }

    public static long r(List list) {
        for (int i = 0; i < list.size(); i++) {
            iy7 iy7Var = (iy7) list.get(i);
            if (ltg.C("http://dashif.org/guidelines/last-segment-number", iy7Var.a)) {
                return Long.parseLong(iy7Var.b);
            }
        }
        return -1L;
    }

    public static mum t(XmlPullParser xmlPullParser) {
        String str = null;
        String attributeValue = xmlPullParser.getAttributeValue(null, "moreInformationURL");
        String str2 = attributeValue == null ? null : attributeValue;
        String attributeValue2 = xmlPullParser.getAttributeValue(null, "lang");
        String str3 = attributeValue2 == null ? null : attributeValue2;
        String str4 = null;
        String str5 = null;
        while (true) {
            xmlPullParser.next();
            if (g0g.R("Title", xmlPullParser)) {
                str = xmlPullParser.nextText();
            } else if (g0g.R("Source", xmlPullParser)) {
                str4 = xmlPullParser.nextText();
            } else if (g0g.R("Copyright", xmlPullParser)) {
                str5 = xmlPullParser.nextText();
            } else {
                g(xmlPullParser);
            }
            String str6 = str4;
            String str7 = str;
            String str8 = str5;
            if (g0g.Q("ProgramInformation", xmlPullParser)) {
                return new mum(str7, str6, str8, str2, str3);
            }
            str = str7;
            str4 = str6;
            str5 = str8;
        }
    }

    public static whn u(XmlPullParser xmlPullParser, String str, String str2) {
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
        return new whn(attributeValue, j, j2);
    }

    public static int v(String str) {
        if (str != null) {
            switch (str) {
                case "subtitle":
                case "forced_subtitle":
                case "forced-subtitle":
                    return 128;
                case "description":
                    return RemoteCameraConfig.Mic.BUFFER_SIZE;
                case "enhanced-audio-intelligibility":
                    return 2048;
                case "alternate":
                    return 2;
                case "dub":
                    return 16;
                case "main":
                    return 1;
                case "sign":
                    return 256;
                case "caption":
                    return 64;
                case "commentary":
                    return 8;
                case "emergency":
                    return 32;
                case "supplementary":
                    return 4;
            }
        }
        return 0;
    }

    public static int w(ArrayList arrayList) {
        int i = 0;
        for (int i2 = 0; i2 < arrayList.size(); i2++) {
            if (ltg.C("http://dashif.org/guidelines/trickmode", ((iy7) arrayList.get(i2)).a)) {
                i = 16384;
            }
        }
        return i;
    }

    public static dbp x(XmlPullParser xmlPullParser, dbp dbpVar) {
        long j = dbpVar != null ? dbpVar.b : 1L;
        String attributeValue = xmlPullParser.getAttributeValue(null, "timescale");
        if (attributeValue != null) {
            j = Long.parseLong(attributeValue);
        }
        long j2 = j;
        long j3 = dbpVar != null ? dbpVar.c : 0L;
        String attributeValue2 = xmlPullParser.getAttributeValue(null, "presentationTimeOffset");
        if (attributeValue2 != null) {
            j3 = Long.parseLong(attributeValue2);
        }
        long j4 = j3;
        long j5 = dbpVar != null ? dbpVar.d : 0L;
        long j6 = dbpVar != null ? dbpVar.e : 0L;
        String attributeValue3 = xmlPullParser.getAttributeValue(null, "indexRange");
        if (attributeValue3 != null) {
            String[] split = attributeValue3.split("-");
            j5 = Long.parseLong(split[0]);
            j6 = (Long.parseLong(split[1]) - j5) + 1;
        }
        long j7 = j6;
        long j8 = j5;
        whn whnVar = dbpVar != null ? dbpVar.a : null;
        while (true) {
            xmlPullParser.next();
            if (g0g.R("Initialization", xmlPullParser)) {
                whnVar = u(xmlPullParser, "sourceURL", "range");
            } else {
                g(xmlPullParser);
            }
            whn whnVar2 = whnVar;
            if (g0g.Q("SegmentBase", xmlPullParser)) {
                return new dbp(whnVar2, j2, j4, j8, j7);
            }
            whnVar = whnVar2;
        }
    }

    public ArrayList A(XmlPullParser xmlPullParser, long j, long j2) {
        long j3;
        ArrayList arrayList = new ArrayList();
        long j4 = 0;
        long j5 = -9223372036854775807L;
        boolean z = false;
        int i = 0;
        do {
            xmlPullParser.next();
            if (g0g.R("S", xmlPullParser)) {
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
                g(xmlPullParser);
            }
        } while (!g0g.Q("SegmentTimeline", xmlPullParser));
        if (!z) {
            return arrayList;
        }
        int i3 = dvt.a;
        a(arrayList, j4, j5, i, dvt.g0(j2, j, 1000L, RoundingMode.DOWN));
        return arrayList;
    }

    public gqt D(XmlPullParser xmlPullParser, String str, gqt gqtVar) {
        String attributeValue = xmlPullParser.getAttributeValue(null, str);
        return attributeValue != null ? gqt.b(attributeValue) : gqtVar;
    }

    /* JADX WARN: Code restructure failed: missing block: B:15:0x008a, code lost:
    
        r5 = "audio/eac3-joc";
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x0096, code lost:
    
        if ("audio/eac3-joc".equals(r5) != false) goto L42;
     */
    /* JADX WARN: Removed duplicated region for block: B:181:0x009c  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x00a5  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x00b6  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x00e8  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x010b  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0055  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x0188 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public dsc b(String str, String str2, int i, int i2, float f2, int i3, int i4, int i5, String str3, ArrayList arrayList, ArrayList arrayList2, String str4, String str5, String str6, ArrayList arrayList3, ArrayList arrayList4) {
        String str7;
        String str8;
        ArrayList arrayList5;
        String str9;
        int i6;
        int i7;
        int i8;
        Pair pair;
        String str10;
        int i9;
        int i10;
        String str11 = str5;
        if (l5i.k(str2)) {
            str7 = l5i.b(str4);
        } else if (l5i.o(str2)) {
            str7 = l5i.j(str4);
        } else {
            if (l5i.n(str2) || l5i.m(str2)) {
                str7 = str2;
                str8 = str7;
            } else {
                str8 = str2;
                if ("application/mp4".equals(str8)) {
                    str7 = l5i.e(str4);
                    if ("text/vtt".equals(str7)) {
                        str7 = "application/x-mp4-vtt";
                    }
                } else {
                    str7 = null;
                }
            }
            if (!"audio/eac3".equals(str7)) {
                while (true) {
                    str9 = "ec+3";
                    if (i10 >= arrayList4.size()) {
                        arrayList5 = arrayList4;
                        str7 = "audio/eac3";
                        break;
                    }
                    arrayList5 = arrayList4;
                    iy7 iy7Var = (iy7) arrayList5.get(i10);
                    String str12 = iy7Var.a;
                    String str13 = iy7Var.b;
                    i10 = (("tag:dolby.com,2018:dash:EC3_ExtensionType:2018".equals(str12) && "JOC".equals(str13)) || ("tag:dolby.com,2014:dash:DolbyDigitalPlusExtensionType:2014".equals(str12) && "ec+3".equals(str13))) ? 0 : i10 + 1;
                }
            } else {
                arrayList5 = arrayList4;
            }
            str9 = str4;
            if (l5i.l(str9, str11)) {
                if (str11 == null) {
                    str11 = str9;
                }
                str7 = "video/dolby-vision";
                str9 = str11;
            }
            int i11 = 0;
            for (i6 = 0; i6 < arrayList.size(); i6++) {
                iy7 iy7Var2 = (iy7) arrayList.get(i6);
                if (ltg.C("urn:mpeg:dash:role:2011", iy7Var2.a)) {
                    String str14 = iy7Var2.b;
                    i11 |= (str14 != null && (str14.equals("forced_subtitle") || str14.equals("forced-subtitle"))) ? 2 : 0;
                }
            }
            int i12 = 0;
            for (i7 = 0; i7 < arrayList.size(); i7++) {
                iy7 iy7Var3 = (iy7) arrayList.get(i7);
                if (ltg.C("urn:mpeg:dash:role:2011", iy7Var3.a)) {
                    i12 |= v(iy7Var3.b);
                }
            }
            i8 = 0;
            int i13 = 0;
            while (true) {
                if (i8 < arrayList2.size()) {
                    int i14 = 1;
                    int w = i12 | i13 | w(arrayList3) | w(arrayList5);
                    int i15 = 0;
                    while (true) {
                        if (i15 < arrayList3.size()) {
                            iy7 iy7Var4 = (iy7) arrayList3.get(i15);
                            if ((ltg.C("http://dashif.org/thumbnail_tile", iy7Var4.a) || ltg.C("http://dashif.org/guidelines/thumbnail_tile", iy7Var4.a)) && (str10 = iy7Var4.b) != null) {
                                int i16 = dvt.a;
                                String[] split = str10.split("x", -1);
                                if (split.length != 2) {
                                    continue;
                                } else {
                                    try {
                                        pair = Pair.create(Integer.valueOf(Integer.parseInt(split[0])), Integer.valueOf(Integer.parseInt(split[1])));
                                    } catch (NumberFormatException unused) {
                                        continue;
                                    }
                                }
                            }
                            i15++;
                        } else {
                            pair = null;
                        }
                    }
                    bsc bscVar = new bsc();
                    bscVar.a = str;
                    bscVar.l = l5i.p(str8);
                    bscVar.m = l5i.p(str7);
                    bscVar.j = str9;
                    bscVar.i = i5;
                    bscVar.e = i11;
                    bscVar.f = w;
                    bscVar.d = str3;
                    bscVar.J = pair != null ? ((Integer) pair.first).intValue() : -1;
                    bscVar.K = pair != null ? ((Integer) pair.second).intValue() : -1;
                    if (l5i.o(str7)) {
                        bscVar.t = i;
                        bscVar.u = i2;
                        bscVar.v = f2;
                    } else if (l5i.k(str7)) {
                        bscVar.C = i3;
                        bscVar.D = i4;
                    } else if (l5i.n(str7)) {
                        if ("application/cea-608".equals(str7)) {
                            int i17 = 0;
                            while (true) {
                                if (i17 < arrayList2.size()) {
                                    iy7 iy7Var5 = (iy7) arrayList2.get(i17);
                                    String str15 = iy7Var5.a;
                                    String str16 = iy7Var5.b;
                                    if ("urn:scte:dash:cc:cea-608:2015".equals(str15) && str16 != null) {
                                        if (!c.matcher(str16).matches()) {
                                            vq1.n0("MpdParser", "Unable to parse CEA-608 channel number from: ".concat(str16));
                                        }
                                    }
                                    i17++;
                                    i14 = 1;
                                }
                            }
                        } else if ("application/cea-708".equals(str7)) {
                            int i18 = 0;
                            while (true) {
                                if (i18 < arrayList2.size()) {
                                    iy7 iy7Var6 = (iy7) arrayList2.get(i18);
                                    String str17 = iy7Var6.a;
                                    String str18 = iy7Var6.b;
                                    if ("urn:scte:dash:cc:cea-708:2015".equals(str17) && str18 != null) {
                                        if (!d.matcher(str18).matches()) {
                                            vq1.n0("MpdParser", "Unable to parse CEA-708 service block number from: ".concat(str18));
                                        }
                                    }
                                    i18++;
                                }
                            }
                        }
                    } else if (l5i.m(str7)) {
                        bscVar.t = i;
                        bscVar.u = i2;
                    }
                    return new dsc(bscVar);
                }
                iy7 iy7Var7 = (iy7) arrayList2.get(i8);
                String str19 = iy7Var7.a;
                String str20 = iy7Var7.b;
                if (ltg.C("urn:mpeg:dash:role:2011", str19)) {
                    i13 |= v(str20);
                } else if (ltg.C("urn:tva:metadata:cs:AudioPurposeCS:2007", iy7Var7.a)) {
                    if (str20 != null) {
                        i9 = 4;
                        switch (str20) {
                            case "1":
                                i9 = RemoteCameraConfig.Mic.BUFFER_SIZE;
                                break;
                            case "2":
                                i9 = 2048;
                                break;
                            case "4":
                                i9 = 8;
                                break;
                            case "6":
                                i9 = 1;
                                break;
                        }
                        i13 |= i9;
                    }
                    i9 = 0;
                    i13 |= i9;
                }
                i8++;
            }
        }
        str8 = str2;
        if (!"audio/eac3".equals(str7)) {
        }
        str9 = str4;
        if (l5i.l(str9, str11)) {
        }
        int i112 = 0;
        while (i6 < arrayList.size()) {
        }
        int i122 = 0;
        while (i7 < arrayList.size()) {
        }
        i8 = 0;
        int i132 = 0;
        while (true) {
            if (i8 < arrayList2.size()) {
            }
            i8++;
        }
    }

    public d97 c(long j, long j2, long j3, boolean z, long j4, long j5, long j6, long j7, mum mumVar, y3e y3eVar, dnh dnhVar, Uri uri, ArrayList arrayList) {
        return new d97(j, j2, j3, z, j4, j5, j6, j7, mumVar, y3eVar, dnhVar, uri, arrayList);
    }

    public a0o d(e97 e97Var, String str, ArrayList arrayList, String str2, ArrayList arrayList2, ArrayList arrayList3) {
        String str3;
        bsc a = e97Var.a.a();
        if (str == null || !arrayList.isEmpty()) {
            a.c = yde.v(arrayList);
        } else {
            a.b = str;
        }
        String str4 = e97Var.d;
        if (str4 != null) {
            str2 = str4;
        }
        ArrayList arrayList4 = e97Var.e;
        arrayList4.addAll(arrayList2);
        if (!arrayList4.isEmpty()) {
            int i = 0;
            while (true) {
                if (i >= arrayList4.size()) {
                    str3 = null;
                    break;
                }
                oqa oqaVar = (oqa) arrayList4.get(i);
                if (un3.c.equals(oqaVar.b) && (str3 = oqaVar.c) != null) {
                    arrayList4.remove(i);
                    break;
                }
                i++;
            }
            if (str3 != null) {
                for (int i2 = 0; i2 < arrayList4.size(); i2++) {
                    oqa oqaVar2 = (oqa) arrayList4.get(i2);
                    if (un3.b.equals(oqaVar2.b) && oqaVar2.c == null) {
                        arrayList4.set(i2, new oqa(un3.c, str3, oqaVar2.d, oqaVar2.e));
                    }
                }
            }
            for (int size = arrayList4.size() - 1; size >= 0; size--) {
                oqa oqaVar3 = (oqa) arrayList4.get(size);
                if (oqaVar3.e == null) {
                    int i3 = 0;
                    while (true) {
                        if (i3 < arrayList4.size()) {
                            oqa oqaVar4 = (oqa) arrayList4.get(i3);
                            if (oqaVar4.e != null && oqaVar3.e == null && oqaVar4.a(oqaVar3.b)) {
                                arrayList4.remove(size);
                                break;
                            }
                            i3++;
                        }
                    }
                }
            }
            a.q = new pqa(str2, arrayList4);
        }
        ArrayList arrayList5 = e97Var.f;
        arrayList5.addAll(arrayList3);
        dsc dscVar = new dsc(a);
        yde ydeVar = e97Var.b;
        ebp ebpVar = e97Var.c;
        if (ebpVar instanceof dbp) {
            return new zzn(dscVar, ydeVar, (dbp) ebpVar, arrayList5);
        }
        if (ebpVar instanceof zap) {
            return new yzn(dscVar, ydeVar, (zap) ebpVar, arrayList5);
        }
        xq0.x("segmentBase must be of type SingleSegmentBase or MultiSegmentBase");
        return null;
    }

    public abp e(whn whnVar, long j, long j2, long j3, long j4, List list, long j5, List list2, long j6, long j7) {
        return new abp(whnVar, j, j2, j3, j4, list, j5, list2, dvt.Y(j6), dvt.Y(j7));
    }

    public bbp f(whn whnVar, long j, long j2, long j3, long j4, long j5, List list, long j6, gqt gqtVar, gqt gqtVar2, long j7, long j8) {
        return new bbp(whnVar, j, j2, j3, j4, j5, list, j6, gqtVar, gqtVar2, dvt.Y(j7), dvt.Y(j8));
    }

    public ArrayList j(XmlPullParser xmlPullParser, ArrayList arrayList, boolean z) {
        String attributeValue = xmlPullParser.getAttributeValue(null, "dvb:priority");
        int parseInt = attributeValue != null ? Integer.parseInt(attributeValue) : z ? 1 : Integer.MIN_VALUE;
        String attributeValue2 = xmlPullParser.getAttributeValue(null, "dvb:weight");
        int parseInt2 = attributeValue2 != null ? Integer.parseInt(attributeValue2) : 1;
        String attributeValue3 = xmlPullParser.getAttributeValue(null, "serviceLocation");
        String C = C("BaseURL", xmlPullParser);
        if (C != null && p1g.F(C)[0] != -1) {
            if (attributeValue3 == null) {
                attributeValue3 = C;
            }
            return ldg.z(new mu2(parseInt, parseInt2, C, attributeValue3));
        }
        ArrayList arrayList2 = new ArrayList();
        for (int i = 0; i < arrayList.size(); i++) {
            mu2 mu2Var = (mu2) arrayList.get(i);
            String M = p1g.M(mu2Var.a, C);
            String str = attributeValue3 == null ? M : attributeValue3;
            if (z) {
                parseInt = mu2Var.c;
                parseInt2 = mu2Var.d;
                str = mu2Var.b;
            }
            arrayList2.add(new mu2(parseInt, parseInt2, M, str));
        }
        return arrayList2;
    }

    @Override // defpackage.c8k
    public final Object o(Uri uri, kb7 kb7Var) {
        try {
            XmlPullParser newPullParser = this.a.newPullParser();
            newPullParser.setInput(kb7Var, null);
            if (newPullParser.next() == 2 && "MPD".equals(newPullParser.getName())) {
                return s(newPullParser, uri);
            }
            throw r7k.b("inputStream does not contain a valid media presentation description", null);
        } catch (XmlPullParserException e2) {
            throw r7k.b(null, e2);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:136:0x0af0 A[LOOP:3: B:127:0x02fb->B:136:0x0af0, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:137:0x0a97 A[EDGE_INSN: B:137:0x0a97->B:138:0x0a97 BREAK  A[LOOP:3: B:127:0x02fb->B:136:0x0af0], SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:226:0x08d1 A[LOOP:5: B:216:0x05c5->B:226:0x08d1, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:227:0x0829 A[EDGE_INSN: B:227:0x0829->B:228:0x0829 BREAK  A[LOOP:5: B:216:0x05c5->B:226:0x08d1], SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:53:0x0cf2  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x0d0f  */
    /* JADX WARN: Type inference failed for: r14v60 */
    /* JADX WARN: Type inference failed for: r14v62 */
    /* JADX WARN: Type inference failed for: r14v63, types: [java.lang.Exception] */
    /* JADX WARN: Type inference failed for: r14v65 */
    /* JADX WARN: Type inference failed for: r14v66 */
    /* JADX WARN: Type inference failed for: r8v15 */
    /* JADX WARN: Type inference failed for: r8v16 */
    /* JADX WARN: Type inference failed for: r8v17 */
    /* JADX WARN: Type inference failed for: r8v19 */
    /* JADX WARN: Type inference failed for: r8v20 */
    /* JADX WARN: Type inference failed for: r8v21 */
    /* JADX WARN: Type inference failed for: r8v22 */
    /* JADX WARN: Type inference failed for: r8v27 */
    /* JADX WARN: Type inference failed for: r8v28 */
    /* JADX WARN: Type inference failed for: r8v29 */
    /* JADX WARN: Type inference failed for: r8v30 */
    /* JADX WARN: Type inference failed for: r8v31 */
    /* JADX WARN: Type inference failed for: r8v34 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public d97 s(XmlPullParser xmlPullParser, Uri uri) {
        boolean z;
        boolean z2;
        boolean z3;
        ArrayList arrayList;
        ArrayList arrayList2;
        ArrayList arrayList3;
        long j;
        Exception exc;
        boolean z4;
        int i;
        ArrayList arrayList4;
        ArrayList arrayList5;
        ArrayList arrayList6;
        String str;
        String str2;
        String str3;
        long j2;
        ArrayList arrayList7;
        ArrayList arrayList8;
        long j3;
        long j4;
        Exception exc2;
        String str4;
        Exception exc3;
        long j5;
        ArrayList arrayList9;
        String str5;
        long j6;
        long j7;
        ArrayList arrayList10;
        String str6;
        long j8;
        ArrayList arrayList11;
        String str7;
        String str8;
        String str9;
        String str10;
        String str11;
        String str12;
        String str13;
        ArrayList arrayList12;
        String str14;
        ArrayList arrayList13;
        ArrayList arrayList14;
        ArrayList arrayList15;
        String str15;
        int i2;
        long j9;
        String str16;
        String str17;
        ArrayList arrayList16;
        ArrayList arrayList17;
        XmlPullParser xmlPullParser2;
        long j10;
        ArrayList arrayList18;
        ArrayList arrayList19;
        String str18;
        ?? r8;
        String str19;
        String str20;
        int i3;
        String str21;
        int parseInt;
        String str22;
        String str23;
        String str24;
        String str25;
        int parseInt2;
        String str26;
        String str27;
        int parseInt3;
        String str28;
        float f2;
        int i4;
        ArrayList arrayList20;
        int i5;
        String str29;
        String str30;
        ArrayList arrayList21;
        String str31;
        String str32;
        ArrayList arrayList22;
        String str33;
        XmlPullParser xmlPullParser3;
        long j11;
        String str34;
        ArrayList arrayList23;
        String str35;
        String str36;
        ArrayList arrayList24;
        ArrayList arrayList25;
        String str37;
        ArrayList arrayList26;
        ArrayList arrayList27;
        long j12;
        long j13;
        String str38;
        int i6;
        boolean z5;
        String str39;
        f97 f97Var = this;
        XmlPullParser xmlPullParser4 = xmlPullParser;
        int i7 = 0;
        String[] strArr = new String[0];
        String str40 = null;
        String attributeValue = xmlPullParser4.getAttributeValue(null, "profiles");
        if (attributeValue != null) {
            strArr = attributeValue.split(StringUtils.COMMA);
        }
        int length = strArr.length;
        int i8 = 0;
        while (true) {
            z = true;
            if (i8 >= length) {
                z2 = false;
                break;
            }
            if (strArr[i8].startsWith("urn:dvb:dash:profile:dvb-dash:")) {
                z2 = true;
                break;
            }
            i8++;
        }
        String attributeValue2 = xmlPullParser4.getAttributeValue(null, "availabilityStartTime");
        long b0 = attributeValue2 == null ? -9223372036854775807L : dvt.b0(attributeValue2);
        long n = n(xmlPullParser4, "mediaPresentationDuration", -9223372036854775807L);
        long n2 = n(xmlPullParser4, "minBufferTime", -9223372036854775807L);
        boolean equals = "dynamic".equals(xmlPullParser4.getAttributeValue(null, "type"));
        long n3 = equals ? n(xmlPullParser4, "minimumUpdatePeriod", -9223372036854775807L) : -9223372036854775807L;
        long n4 = equals ? n(xmlPullParser4, "timeShiftBufferDepth", -9223372036854775807L) : -9223372036854775807L;
        long n5 = equals ? n(xmlPullParser4, "suggestedPresentationDelay", -9223372036854775807L) : -9223372036854775807L;
        String attributeValue3 = xmlPullParser4.getAttributeValue(null, "publishTime");
        long b02 = attributeValue3 == null ? -9223372036854775807L : dvt.b0(attributeValue3);
        long j14 = equals ? 0L : -9223372036854775807L;
        ArrayList z6 = ldg.z(new mu2(z2 ? 1 : Integer.MIN_VALUE, 1, uri.toString(), uri.toString()));
        ArrayList arrayList28 = new ArrayList();
        ArrayList arrayList29 = new ArrayList();
        long j15 = -9223372036854775807L;
        long j16 = equals ? -9223372036854775807L : 0L;
        boolean z7 = false;
        boolean z8 = false;
        mum mumVar = null;
        y3e y3eVar = null;
        Uri uri2 = null;
        dnh dnhVar = null;
        while (true) {
            xmlPullParser4.next();
            String str41 = "BaseURL";
            if (g0g.R("BaseURL", xmlPullParser4)) {
                if (!z7) {
                    j14 = i(xmlPullParser4, j14);
                    z7 = z;
                }
                arrayList29.addAll(f97Var.j(xmlPullParser4, z6, z2));
                z3 = z2;
                arrayList = z6;
                arrayList2 = arrayList28;
                arrayList3 = arrayList29;
                z4 = z;
                i = i7;
                str39 = str40;
            } else if (g0g.R("ProgramInformation", xmlPullParser4)) {
                mumVar = t(xmlPullParser4);
                z3 = z2;
                arrayList = z6;
                arrayList2 = arrayList28;
                arrayList3 = arrayList29;
                i = i7;
                str39 = str40;
                z4 = true;
            } else {
                if (g0g.R("UTCTiming", xmlPullParser4)) {
                    z3 = z2;
                    arrayList = z6;
                    arrayList2 = arrayList28;
                    arrayList3 = arrayList29;
                    y3eVar = new y3e(xmlPullParser4.getAttributeValue(str40, "schemeIdUri"), xmlPullParser4.getAttributeValue(str40, Constants.KEY_VALUE), 3);
                } else {
                    if (g0g.R("Location", xmlPullParser4)) {
                        uri2 = p1g.N(uri.toString(), xmlPullParser4.nextText());
                    } else if (g0g.R("ServiceDescription", xmlPullParser4)) {
                        dnhVar = B(xmlPullParser4);
                    } else {
                        if (!g0g.R("Period", xmlPullParser4) || z8) {
                            z3 = z2;
                            arrayList = z6;
                            arrayList2 = arrayList28;
                            arrayList3 = arrayList29;
                            j = j14;
                            exc = null;
                            z4 = true;
                            i = 0;
                            g(xmlPullParser4);
                            j16 = j16;
                        } else {
                            ArrayList arrayList30 = !arrayList29.isEmpty() ? arrayList29 : z6;
                            String str42 = ConnectableDevice.KEY_ID;
                            ArrayList arrayList31 = z6;
                            String attributeValue4 = xmlPullParser4.getAttributeValue(null, ConnectableDevice.KEY_ID);
                            long n6 = n(xmlPullParser4, "start", j16);
                            long j17 = b0 != j15 ? b0 + n6 : j15;
                            long j18 = j16;
                            long j19 = j15;
                            long n7 = n(xmlPullParser4, "duration", j19);
                            ArrayList arrayList32 = new ArrayList();
                            String str43 = "Period";
                            ArrayList arrayList33 = new ArrayList();
                            ArrayList arrayList34 = new ArrayList();
                            long j20 = j19;
                            ebp ebpVar = null;
                            boolean z9 = false;
                            ArrayList arrayList35 = arrayList32;
                            long j21 = j14;
                            while (true) {
                                xmlPullParser4.next();
                                if (g0g.R(str41, xmlPullParser4)) {
                                    if (!z9) {
                                        j21 = i(xmlPullParser4, j21);
                                        z9 = true;
                                    }
                                    long j22 = j21;
                                    arrayList34.addAll(f97Var.j(xmlPullParser4, arrayList30, z2));
                                    arrayList6 = arrayList28;
                                    arrayList3 = arrayList29;
                                    j = j14;
                                    str = str41;
                                    str2 = str42;
                                    arrayList5 = arrayList30;
                                    j4 = n7;
                                    arrayList = arrayList31;
                                    str4 = str43;
                                    j2 = j17;
                                    arrayList7 = arrayList33;
                                    j3 = j22;
                                    j15 = -9223372036854775807L;
                                    z4 = true;
                                    i = 0;
                                    z3 = z2;
                                    arrayList8 = arrayList35;
                                    arrayList4 = arrayList34;
                                    exc2 = null;
                                } else {
                                    arrayList4 = arrayList34;
                                    String str44 = "AdaptationSet";
                                    arrayList5 = arrayList30;
                                    String str45 = "SegmentTemplate";
                                    if (g0g.R("AdaptationSet", xmlPullParser4)) {
                                        long j23 = j21;
                                        ArrayList arrayList36 = !arrayList4.isEmpty() ? arrayList4 : arrayList5;
                                        String attributeValue5 = xmlPullParser4.getAttributeValue(null, str42);
                                        long parseLong = attributeValue5 == null ? -1L : Long.parseLong(attributeValue5);
                                        int l = l(xmlPullParser4);
                                        ArrayList arrayList37 = arrayList35;
                                        String attributeValue6 = xmlPullParser4.getAttributeValue(null, "mimeType");
                                        ArrayList arrayList38 = arrayList28;
                                        ArrayList arrayList39 = arrayList29;
                                        String attributeValue7 = xmlPullParser4.getAttributeValue(null, "codecs");
                                        long j24 = j14;
                                        String attributeValue8 = xmlPullParser4.getAttributeValue(null, "scte214:supplementalCodecs");
                                        String attributeValue9 = xmlPullParser4.getAttributeValue(null, "scte214:supplementalProfiles");
                                        long j25 = n4;
                                        String attributeValue10 = xmlPullParser4.getAttributeValue(null, CameraProperty.WIDTH);
                                        int parseInt4 = attributeValue10 == null ? -1 : Integer.parseInt(attributeValue10);
                                        String attributeValue11 = xmlPullParser4.getAttributeValue(null, CameraProperty.HEIGHT);
                                        int parseInt5 = attributeValue11 == null ? -1 : Integer.parseInt(attributeValue11);
                                        float q = q(xmlPullParser4, -1.0f);
                                        String str46 = "SegmentList";
                                        String str47 = "SegmentBase";
                                        String attributeValue12 = xmlPullParser4.getAttributeValue(null, "audioSamplingRate");
                                        int parseInt6 = attributeValue12 == null ? -1 : Integer.parseInt(attributeValue12);
                                        String str48 = "audioSamplingRate";
                                        String str49 = "lang";
                                        String attributeValue13 = xmlPullParser4.getAttributeValue(null, "lang");
                                        float f3 = q;
                                        String attributeValue14 = xmlPullParser4.getAttributeValue(null, "label");
                                        ArrayList arrayList40 = new ArrayList();
                                        ArrayList arrayList41 = new ArrayList();
                                        ArrayList arrayList42 = arrayList40;
                                        ArrayList arrayList43 = new ArrayList();
                                        ArrayList arrayList44 = new ArrayList();
                                        String str50 = CameraProperty.HEIGHT;
                                        ArrayList arrayList45 = new ArrayList();
                                        String str51 = CameraProperty.WIDTH;
                                        ArrayList arrayList46 = new ArrayList();
                                        String str52 = "scte214:supplementalProfiles";
                                        ArrayList arrayList47 = new ArrayList();
                                        String str53 = "scte214:supplementalCodecs";
                                        ArrayList arrayList48 = new ArrayList();
                                        ArrayList arrayList49 = new ArrayList();
                                        String str54 = "mimeType";
                                        str2 = str42;
                                        ebp ebpVar2 = ebpVar;
                                        long j26 = j20;
                                        long j27 = j23;
                                        String str55 = attributeValue13;
                                        boolean z10 = false;
                                        int i9 = -1;
                                        String str56 = "codecs";
                                        int i10 = l;
                                        String str57 = null;
                                        while (true) {
                                            xmlPullParser4.next();
                                            if (g0g.R(str41, xmlPullParser4)) {
                                                if (!z10) {
                                                    j27 = i(xmlPullParser4, j27);
                                                    z10 = true;
                                                }
                                                j5 = j27;
                                                arrayList49.addAll(f97Var.j(xmlPullParser4, arrayList36, z2));
                                            } else {
                                                j5 = j27;
                                                if (g0g.R("ContentProtection", xmlPullParser4)) {
                                                    Pair k = k(xmlPullParser4);
                                                    Object obj = k.first;
                                                    if (obj != null) {
                                                        str57 = (String) obj;
                                                    }
                                                    Object obj2 = k.second;
                                                    if (obj2 != null) {
                                                        arrayList41.add((oqa) obj2);
                                                    }
                                                } else if (g0g.R("ContentComponent", xmlPullParser4)) {
                                                    String attributeValue15 = xmlPullParser4.getAttributeValue(null, str49);
                                                    if (str55 == null) {
                                                        str55 = attributeValue15;
                                                    } else if (attributeValue15 != null) {
                                                        vq1.A(str55.equals(attributeValue15));
                                                    }
                                                    int l2 = l(xmlPullParser4);
                                                    if (i10 == -1) {
                                                        i10 = l2;
                                                    } else if (l2 != -1) {
                                                        vq1.A(i10 == l2);
                                                    }
                                                } else {
                                                    if (g0g.R("Role", xmlPullParser4)) {
                                                        arrayList45.add(m("Role", xmlPullParser4));
                                                        arrayList9 = arrayList36;
                                                    } else {
                                                        String str58 = "AudioChannelConfiguration";
                                                        if (g0g.R("AudioChannelConfiguration", xmlPullParser4)) {
                                                            arrayList9 = arrayList36;
                                                            i9 = h(attributeValue7, xmlPullParser4);
                                                            j6 = n7;
                                                            arrayList = arrayList31;
                                                            str3 = str43;
                                                            j7 = j17;
                                                            arrayList10 = arrayList33;
                                                            str21 = str44;
                                                            str17 = str45;
                                                            j8 = j23;
                                                            arrayList11 = arrayList37;
                                                            arrayList6 = arrayList38;
                                                            arrayList3 = arrayList39;
                                                            j = j24;
                                                            str16 = str47;
                                                            str8 = str48;
                                                            str9 = str56;
                                                            arrayList19 = arrayList42;
                                                            str10 = str51;
                                                            str11 = str52;
                                                            str12 = str53;
                                                            arrayList16 = arrayList48;
                                                            str13 = str54;
                                                            z4 = true;
                                                            i = 0;
                                                            z3 = z2;
                                                            arrayList12 = arrayList41;
                                                            i3 = i10;
                                                            str14 = attributeValue7;
                                                            arrayList13 = arrayList49;
                                                            str = str41;
                                                            arrayList15 = arrayList45;
                                                            str19 = str57;
                                                            str20 = attributeValue8;
                                                            j10 = j25;
                                                            arrayList18 = arrayList43;
                                                            r8 = null;
                                                            xmlPullParser2 = xmlPullParser4;
                                                            arrayList14 = arrayList46;
                                                            str18 = str49;
                                                            str15 = str46;
                                                            arrayList17 = arrayList47;
                                                            if (g0g.Q(str21, xmlPullParser2)) {
                                                                break;
                                                            }
                                                            arrayList42 = arrayList19;
                                                            str44 = str21;
                                                            str57 = str19;
                                                            arrayList43 = arrayList18;
                                                            j25 = j10;
                                                            arrayList45 = arrayList15;
                                                            i10 = i3;
                                                            arrayList49 = arrayList13;
                                                            arrayList46 = arrayList14;
                                                            arrayList47 = arrayList17;
                                                            str41 = str;
                                                            str54 = str13;
                                                            arrayList41 = arrayList12;
                                                            arrayList36 = arrayList9;
                                                            str56 = str9;
                                                            str48 = str8;
                                                            arrayList48 = arrayList16;
                                                            n7 = j6;
                                                            arrayList33 = arrayList10;
                                                            str43 = str3;
                                                            str45 = str17;
                                                            f97Var = this;
                                                            attributeValue8 = str20;
                                                            str47 = str16;
                                                            str46 = str15;
                                                            z2 = z3;
                                                            arrayList31 = arrayList;
                                                            arrayList39 = arrayList3;
                                                            j24 = j;
                                                            str53 = str12;
                                                            j27 = j5;
                                                            arrayList37 = arrayList11;
                                                            str49 = str18;
                                                            xmlPullParser4 = xmlPullParser2;
                                                            j23 = j8;
                                                            attributeValue7 = str14;
                                                            str52 = str11;
                                                            j17 = j7;
                                                            arrayList38 = arrayList6;
                                                            str51 = str10;
                                                        } else {
                                                            arrayList9 = arrayList36;
                                                            if (g0g.R("Accessibility", xmlPullParser4)) {
                                                                arrayList44.add(m("Accessibility", xmlPullParser4));
                                                            } else if (g0g.R("EssentialProperty", xmlPullParser4)) {
                                                                arrayList46.add(m("EssentialProperty", xmlPullParser4));
                                                            } else {
                                                                String str59 = str49;
                                                                if (g0g.R("SupplementalProperty", xmlPullParser4)) {
                                                                    arrayList47.add(m("SupplementalProperty", xmlPullParser4));
                                                                    str5 = str55;
                                                                    i2 = i10;
                                                                    j6 = n7;
                                                                    arrayList = arrayList31;
                                                                    str3 = str43;
                                                                    j7 = j17;
                                                                    arrayList10 = arrayList33;
                                                                    str6 = str44;
                                                                    str17 = str45;
                                                                    j8 = j23;
                                                                    arrayList11 = arrayList37;
                                                                    arrayList6 = arrayList38;
                                                                    arrayList3 = arrayList39;
                                                                    j = j24;
                                                                    str7 = attributeValue8;
                                                                    str15 = str46;
                                                                    str16 = str47;
                                                                    str8 = str48;
                                                                    str9 = str56;
                                                                    arrayList19 = arrayList42;
                                                                    arrayList18 = arrayList43;
                                                                    str10 = str51;
                                                                    str11 = str52;
                                                                    str12 = str53;
                                                                    arrayList16 = arrayList48;
                                                                    str13 = str54;
                                                                    z4 = true;
                                                                    i = 0;
                                                                    z3 = z2;
                                                                    arrayList12 = arrayList41;
                                                                    str14 = attributeValue7;
                                                                    arrayList13 = arrayList49;
                                                                    arrayList17 = arrayList47;
                                                                    str = str41;
                                                                    arrayList14 = arrayList46;
                                                                    arrayList15 = arrayList45;
                                                                    j10 = j25;
                                                                    j9 = j26;
                                                                    r8 = null;
                                                                    xmlPullParser2 = xmlPullParser4;
                                                                    str18 = str59;
                                                                } else {
                                                                    String str60 = "SupplementalProperty";
                                                                    String str61 = "Representation";
                                                                    if (g0g.R("Representation", xmlPullParser4)) {
                                                                        String str62 = str2;
                                                                        String str63 = "EssentialProperty";
                                                                        String str64 = "ContentProtection";
                                                                        ArrayList arrayList50 = !arrayList49.isEmpty() ? arrayList49 : arrayList9;
                                                                        String str65 = "InbandEventStream";
                                                                        String attributeValue16 = xmlPullParser4.getAttributeValue(null, str62);
                                                                        String str66 = str62;
                                                                        String attributeValue17 = xmlPullParser4.getAttributeValue(null, "bandwidth");
                                                                        if (attributeValue17 == null) {
                                                                            str22 = str54;
                                                                            parseInt = -1;
                                                                        } else {
                                                                            String str67 = str54;
                                                                            parseInt = Integer.parseInt(attributeValue17);
                                                                            str22 = str67;
                                                                        }
                                                                        String attributeValue18 = xmlPullParser4.getAttributeValue(null, str22);
                                                                        if (attributeValue18 == null) {
                                                                            String str68 = str56;
                                                                            str13 = str22;
                                                                            str23 = str68;
                                                                            attributeValue18 = attributeValue6;
                                                                        } else {
                                                                            String str69 = str56;
                                                                            str13 = str22;
                                                                            str23 = str69;
                                                                        }
                                                                        String attributeValue19 = xmlPullParser4.getAttributeValue(null, str23);
                                                                        String str70 = str53;
                                                                        arrayList12 = arrayList41;
                                                                        str9 = str23;
                                                                        String str71 = attributeValue19 == null ? attributeValue7 : attributeValue19;
                                                                        String attributeValue20 = xmlPullParser4.getAttributeValue(null, str70);
                                                                        if (attributeValue20 == null) {
                                                                            String str72 = str52;
                                                                            str12 = str70;
                                                                            str24 = str72;
                                                                            attributeValue20 = attributeValue8;
                                                                        } else {
                                                                            String str73 = str52;
                                                                            str12 = str70;
                                                                            str24 = str73;
                                                                        }
                                                                        String attributeValue21 = xmlPullParser4.getAttributeValue(null, str24);
                                                                        if (attributeValue21 == null) {
                                                                            String str74 = str51;
                                                                            str11 = str24;
                                                                            str25 = str74;
                                                                            attributeValue21 = attributeValue9;
                                                                        } else {
                                                                            String str75 = str51;
                                                                            str11 = str24;
                                                                            str25 = str75;
                                                                        }
                                                                        String attributeValue22 = xmlPullParser4.getAttributeValue(null, str25);
                                                                        if (attributeValue22 == null) {
                                                                            String str76 = str50;
                                                                            str26 = str25;
                                                                            str27 = str76;
                                                                            parseInt2 = parseInt4;
                                                                        } else {
                                                                            parseInt2 = Integer.parseInt(attributeValue22);
                                                                            String str77 = str50;
                                                                            str26 = str25;
                                                                            str27 = str77;
                                                                        }
                                                                        String attributeValue23 = xmlPullParser4.getAttributeValue(null, str27);
                                                                        if (attributeValue23 == null) {
                                                                            float f4 = f3;
                                                                            str28 = str27;
                                                                            f2 = f4;
                                                                            parseInt3 = parseInt5;
                                                                        } else {
                                                                            parseInt3 = Integer.parseInt(attributeValue23);
                                                                            float f5 = f3;
                                                                            str28 = str27;
                                                                            f2 = f5;
                                                                        }
                                                                        float q2 = q(xmlPullParser4, f2);
                                                                        float f6 = f2;
                                                                        String str78 = str48;
                                                                        String attributeValue24 = xmlPullParser4.getAttributeValue(null, str78);
                                                                        int parseInt7 = attributeValue24 == null ? parseInt6 : Integer.parseInt(attributeValue24);
                                                                        ArrayList arrayList51 = new ArrayList();
                                                                        ArrayList arrayList52 = new ArrayList();
                                                                        ArrayList arrayList53 = new ArrayList(arrayList46);
                                                                        ArrayList arrayList54 = new ArrayList(arrayList47);
                                                                        ArrayList arrayList55 = new ArrayList();
                                                                        str8 = str78;
                                                                        String str79 = str55;
                                                                        String str80 = attributeValue7;
                                                                        ArrayList arrayList56 = arrayList49;
                                                                        ebp ebpVar3 = ebpVar2;
                                                                        long j28 = j26;
                                                                        int i11 = i9;
                                                                        long j29 = j5;
                                                                        String str81 = null;
                                                                        boolean z11 = false;
                                                                        while (true) {
                                                                            xmlPullParser4.next();
                                                                            if (g0g.R(str41, xmlPullParser4)) {
                                                                                if (!z11) {
                                                                                    j29 = i(xmlPullParser4, j29);
                                                                                    z11 = true;
                                                                                }
                                                                                i4 = i10;
                                                                                arrayList55.addAll(f97Var.j(xmlPullParser4, arrayList50, z2));
                                                                            } else {
                                                                                i4 = i10;
                                                                                if (g0g.R(str58, xmlPullParser4)) {
                                                                                    i11 = h(str71, xmlPullParser4);
                                                                                } else {
                                                                                    String str82 = str47;
                                                                                    if (g0g.R(str82, xmlPullParser4)) {
                                                                                        ebpVar3 = x(xmlPullParser4, (dbp) ebpVar3);
                                                                                        xmlPullParser3 = xmlPullParser4;
                                                                                        str = str41;
                                                                                        j6 = n7;
                                                                                        str34 = str64;
                                                                                        arrayList = arrayList31;
                                                                                        j7 = j17;
                                                                                        j8 = j23;
                                                                                        arrayList11 = arrayList37;
                                                                                        arrayList6 = arrayList38;
                                                                                        arrayList3 = arrayList39;
                                                                                        j = j24;
                                                                                        str31 = attributeValue8;
                                                                                        j11 = j25;
                                                                                        str29 = str46;
                                                                                        str10 = str26;
                                                                                        arrayList20 = arrayList48;
                                                                                        str14 = str80;
                                                                                        arrayList13 = arrayList56;
                                                                                        arrayList26 = arrayList53;
                                                                                        i5 = i4;
                                                                                        z4 = true;
                                                                                        z3 = z2;
                                                                                        str30 = str71;
                                                                                        str32 = str82;
                                                                                        j13 = j29;
                                                                                        arrayList23 = arrayList47;
                                                                                        arrayList14 = arrayList46;
                                                                                        arrayList21 = arrayList45;
                                                                                        str35 = str58;
                                                                                        arrayList22 = arrayList50;
                                                                                        str50 = str28;
                                                                                        str33 = str63;
                                                                                        str37 = str60;
                                                                                        str36 = str65;
                                                                                        str2 = str66;
                                                                                        f3 = f6;
                                                                                        arrayList24 = arrayList51;
                                                                                        arrayList25 = arrayList52;
                                                                                        arrayList27 = arrayList54;
                                                                                        i6 = i11;
                                                                                        j12 = j28;
                                                                                        str38 = str61;
                                                                                        if (!g0g.Q(str38, xmlPullParser3)) {
                                                                                            break;
                                                                                        }
                                                                                        arrayList51 = arrayList24;
                                                                                        arrayList52 = arrayList25;
                                                                                        str64 = str34;
                                                                                        str61 = str38;
                                                                                        i11 = i6;
                                                                                        arrayList53 = arrayList26;
                                                                                        arrayList54 = arrayList27;
                                                                                        arrayList45 = arrayList21;
                                                                                        str71 = str30;
                                                                                        arrayList46 = arrayList14;
                                                                                        str58 = str35;
                                                                                        str41 = str;
                                                                                        f6 = f3;
                                                                                        str28 = str50;
                                                                                        arrayList47 = arrayList23;
                                                                                        str66 = str2;
                                                                                        j28 = j12;
                                                                                        j29 = j13;
                                                                                        arrayList48 = arrayList20;
                                                                                        n7 = j6;
                                                                                        xmlPullParser4 = xmlPullParser3;
                                                                                        str65 = str36;
                                                                                        str60 = str37;
                                                                                        str63 = str33;
                                                                                        z2 = z3;
                                                                                        arrayList31 = arrayList;
                                                                                        str80 = str14;
                                                                                        attributeValue8 = str31;
                                                                                        arrayList56 = arrayList13;
                                                                                        str46 = str29;
                                                                                        str47 = str32;
                                                                                        arrayList50 = arrayList22;
                                                                                        str26 = str10;
                                                                                        i10 = i5;
                                                                                        j25 = j11;
                                                                                        f97Var = this;
                                                                                        arrayList38 = arrayList6;
                                                                                        arrayList39 = arrayList3;
                                                                                        j24 = j;
                                                                                        arrayList37 = arrayList11;
                                                                                        j23 = j8;
                                                                                        j17 = j7;
                                                                                    } else {
                                                                                        String str83 = str46;
                                                                                        if (g0g.R(str83, xmlPullParser4)) {
                                                                                            ArrayList arrayList57 = arrayList47;
                                                                                            str = str41;
                                                                                            long i12 = i(xmlPullParser4, j28);
                                                                                            arrayList = arrayList31;
                                                                                            arrayList11 = arrayList37;
                                                                                            arrayList6 = arrayList38;
                                                                                            str10 = str26;
                                                                                            arrayList20 = arrayList48;
                                                                                            str14 = str80;
                                                                                            i5 = i4;
                                                                                            z3 = z2;
                                                                                            str50 = str28;
                                                                                            f3 = f6;
                                                                                            long j30 = j24;
                                                                                            str29 = str83;
                                                                                            arrayList13 = arrayList56;
                                                                                            long j31 = n7;
                                                                                            str30 = str71;
                                                                                            arrayList21 = arrayList45;
                                                                                            long j32 = j17;
                                                                                            j8 = j23;
                                                                                            arrayList3 = arrayList39;
                                                                                            j = j30;
                                                                                            str31 = attributeValue8;
                                                                                            arrayList14 = arrayList46;
                                                                                            long j33 = j25;
                                                                                            str32 = str82;
                                                                                            arrayList22 = arrayList50;
                                                                                            str33 = str63;
                                                                                            str2 = str66;
                                                                                            ebpVar3 = y(xmlPullParser4, (abp) ebpVar3, j32, j31, j29, i12, j33);
                                                                                            j13 = j29;
                                                                                            xmlPullParser3 = xmlPullParser4;
                                                                                            j7 = j32;
                                                                                            j6 = j31;
                                                                                            j11 = j33;
                                                                                            str34 = str64;
                                                                                            arrayList23 = arrayList57;
                                                                                            str37 = str60;
                                                                                            str36 = str65;
                                                                                            str38 = str61;
                                                                                            arrayList24 = arrayList51;
                                                                                            arrayList27 = arrayList54;
                                                                                            i6 = i11;
                                                                                            z4 = true;
                                                                                            j12 = i12;
                                                                                            str35 = str58;
                                                                                            arrayList25 = arrayList52;
                                                                                        } else {
                                                                                            ArrayList arrayList58 = arrayList47;
                                                                                            str = str41;
                                                                                            arrayList = arrayList31;
                                                                                            arrayList11 = arrayList37;
                                                                                            arrayList6 = arrayList38;
                                                                                            str10 = str26;
                                                                                            arrayList20 = arrayList48;
                                                                                            str14 = str80;
                                                                                            i5 = i4;
                                                                                            z3 = z2;
                                                                                            str50 = str28;
                                                                                            f3 = f6;
                                                                                            long j34 = j24;
                                                                                            str29 = str83;
                                                                                            String str84 = str45;
                                                                                            arrayList13 = arrayList56;
                                                                                            long j35 = j29;
                                                                                            long j36 = n7;
                                                                                            str30 = str71;
                                                                                            arrayList21 = arrayList45;
                                                                                            long j37 = j17;
                                                                                            j8 = j23;
                                                                                            arrayList3 = arrayList39;
                                                                                            j = j34;
                                                                                            str31 = attributeValue8;
                                                                                            arrayList14 = arrayList46;
                                                                                            long j38 = j25;
                                                                                            str32 = str82;
                                                                                            arrayList22 = arrayList50;
                                                                                            str33 = str63;
                                                                                            str2 = str66;
                                                                                            if (g0g.R(str84, xmlPullParser4)) {
                                                                                                long i13 = i(xmlPullParser4, j28);
                                                                                                z4 = true;
                                                                                                str45 = str84;
                                                                                                str35 = str58;
                                                                                                ebpVar3 = z(xmlPullParser4, (bbp) ebpVar3, arrayList58, j37, j36, j35, i13, j38);
                                                                                                xmlPullParser3 = xmlPullParser4;
                                                                                                arrayList23 = arrayList58;
                                                                                                j7 = j37;
                                                                                                j6 = j36;
                                                                                                j11 = j38;
                                                                                                j13 = j35;
                                                                                                str34 = str64;
                                                                                                str37 = str60;
                                                                                                str36 = str65;
                                                                                                str38 = str61;
                                                                                                arrayList24 = arrayList51;
                                                                                                arrayList25 = arrayList52;
                                                                                                arrayList27 = arrayList54;
                                                                                                i6 = i11;
                                                                                                j12 = i13;
                                                                                            } else {
                                                                                                str45 = str84;
                                                                                                xmlPullParser3 = xmlPullParser4;
                                                                                                j7 = j37;
                                                                                                j6 = j36;
                                                                                                j11 = j38;
                                                                                                str34 = str64;
                                                                                                arrayList23 = arrayList58;
                                                                                                z4 = true;
                                                                                                str35 = str58;
                                                                                                if (g0g.R(str34, xmlPullParser3)) {
                                                                                                    Pair k2 = k(xmlPullParser3);
                                                                                                    Object obj3 = k2.first;
                                                                                                    if (obj3 != null) {
                                                                                                        str81 = (String) obj3;
                                                                                                    }
                                                                                                    Object obj4 = k2.second;
                                                                                                    if (obj4 != null) {
                                                                                                        arrayList24 = arrayList51;
                                                                                                        arrayList24.add((oqa) obj4);
                                                                                                    } else {
                                                                                                        arrayList24 = arrayList51;
                                                                                                    }
                                                                                                    j13 = j35;
                                                                                                    str37 = str60;
                                                                                                    str36 = str65;
                                                                                                    arrayList25 = arrayList52;
                                                                                                    arrayList26 = arrayList53;
                                                                                                    arrayList27 = arrayList54;
                                                                                                    i6 = i11;
                                                                                                    j12 = j28;
                                                                                                    str38 = str61;
                                                                                                    if (!g0g.Q(str38, xmlPullParser3)) {
                                                                                                    }
                                                                                                } else {
                                                                                                    str36 = str65;
                                                                                                    arrayList24 = arrayList51;
                                                                                                    if (g0g.R(str36, xmlPullParser3)) {
                                                                                                        arrayList25 = arrayList52;
                                                                                                        arrayList25.add(m(str36, xmlPullParser3));
                                                                                                        str37 = str60;
                                                                                                        arrayList26 = arrayList53;
                                                                                                    } else {
                                                                                                        arrayList25 = arrayList52;
                                                                                                        if (g0g.R(str33, xmlPullParser3)) {
                                                                                                            arrayList26 = arrayList53;
                                                                                                            arrayList26.add(m(str33, xmlPullParser3));
                                                                                                            str37 = str60;
                                                                                                        } else {
                                                                                                            str37 = str60;
                                                                                                            arrayList26 = arrayList53;
                                                                                                            if (g0g.R(str37, xmlPullParser3)) {
                                                                                                                arrayList27 = arrayList54;
                                                                                                                arrayList27.add(m(str37, xmlPullParser3));
                                                                                                            } else {
                                                                                                                arrayList27 = arrayList54;
                                                                                                                g(xmlPullParser3);
                                                                                                            }
                                                                                                            j12 = j28;
                                                                                                            j13 = j35;
                                                                                                            str38 = str61;
                                                                                                            i6 = i11;
                                                                                                            if (!g0g.Q(str38, xmlPullParser3)) {
                                                                                                            }
                                                                                                        }
                                                                                                    }
                                                                                                    arrayList27 = arrayList54;
                                                                                                    j12 = j28;
                                                                                                    j13 = j35;
                                                                                                    str38 = str61;
                                                                                                    i6 = i11;
                                                                                                    if (!g0g.Q(str38, xmlPullParser3)) {
                                                                                                    }
                                                                                                }
                                                                                            }
                                                                                        }
                                                                                        arrayList26 = arrayList53;
                                                                                        if (!g0g.Q(str38, xmlPullParser3)) {
                                                                                        }
                                                                                    }
                                                                                }
                                                                            }
                                                                            xmlPullParser3 = xmlPullParser4;
                                                                            j6 = n7;
                                                                            str34 = str64;
                                                                            arrayList = arrayList31;
                                                                            j7 = j17;
                                                                            j8 = j23;
                                                                            arrayList11 = arrayList37;
                                                                            arrayList6 = arrayList38;
                                                                            arrayList3 = arrayList39;
                                                                            j = j24;
                                                                            str31 = attributeValue8;
                                                                            j11 = j25;
                                                                            str29 = str46;
                                                                            str32 = str47;
                                                                            str10 = str26;
                                                                            arrayList20 = arrayList48;
                                                                            str37 = str60;
                                                                            str14 = str80;
                                                                            arrayList13 = arrayList56;
                                                                            i5 = i4;
                                                                            z4 = true;
                                                                            z3 = z2;
                                                                            str30 = str71;
                                                                            j13 = j29;
                                                                            arrayList23 = arrayList47;
                                                                            str = str41;
                                                                            arrayList14 = arrayList46;
                                                                            arrayList21 = arrayList45;
                                                                            str35 = str58;
                                                                            arrayList22 = arrayList50;
                                                                            str50 = str28;
                                                                            str33 = str63;
                                                                            str36 = str65;
                                                                            str2 = str66;
                                                                            f3 = f6;
                                                                            arrayList24 = arrayList51;
                                                                            arrayList25 = arrayList52;
                                                                            arrayList26 = arrayList53;
                                                                            arrayList27 = arrayList54;
                                                                            i6 = i11;
                                                                            j12 = j28;
                                                                            str38 = str61;
                                                                            if (!g0g.Q(str38, xmlPullParser3)) {
                                                                            }
                                                                        }
                                                                        ArrayList arrayList59 = arrayList24;
                                                                        ArrayList arrayList60 = arrayList25;
                                                                        ArrayList arrayList61 = arrayList21;
                                                                        str3 = str43;
                                                                        arrayList10 = arrayList33;
                                                                        String str85 = str44;
                                                                        String str86 = str45;
                                                                        String str87 = str29;
                                                                        String str88 = str32;
                                                                        ArrayList arrayList62 = arrayList42;
                                                                        ArrayList arrayList63 = arrayList43;
                                                                        i = 0;
                                                                        ArrayList arrayList64 = arrayList26;
                                                                        ArrayList arrayList65 = arrayList27;
                                                                        dsc b2 = b(attributeValue16, attributeValue18, parseInt2, parseInt3, q2, i6, parseInt7, parseInt, str79, arrayList61, arrayList44, str30, attributeValue20, attributeValue21, arrayList64, arrayList65);
                                                                        arrayList15 = arrayList61;
                                                                        if (ebpVar3 == null) {
                                                                            ebpVar3 = new dbp();
                                                                        }
                                                                        e97 e97Var = new e97(b2, !arrayList55.isEmpty() ? arrayList55 : arrayList22, ebpVar3, str81, arrayList59, arrayList60, arrayList64, arrayList65);
                                                                        int i14 = l5i.i(b2.n);
                                                                        int i15 = i5;
                                                                        if (i15 != -1) {
                                                                            if (i14 != -1) {
                                                                                vq1.A(i15 == i14 ? z4 : false);
                                                                            }
                                                                            i14 = i15;
                                                                        }
                                                                        ArrayList arrayList66 = arrayList20;
                                                                        arrayList66.add(e97Var);
                                                                        xmlPullParser2 = xmlPullParser3;
                                                                        arrayList16 = arrayList66;
                                                                        str19 = str57;
                                                                        str20 = str31;
                                                                        arrayList17 = arrayList23;
                                                                        str55 = str79;
                                                                        j10 = j11;
                                                                        arrayList19 = arrayList62;
                                                                        str18 = str59;
                                                                        str21 = str85;
                                                                        str17 = str86;
                                                                        str15 = str87;
                                                                        str16 = str88;
                                                                        r8 = null;
                                                                        i3 = i14;
                                                                        arrayList18 = arrayList63;
                                                                    } else {
                                                                        XmlPullParser xmlPullParser5 = xmlPullParser4;
                                                                        str5 = str55;
                                                                        int i16 = i10;
                                                                        j6 = n7;
                                                                        arrayList = arrayList31;
                                                                        str3 = str43;
                                                                        j7 = j17;
                                                                        arrayList10 = arrayList33;
                                                                        str6 = str44;
                                                                        String str89 = str45;
                                                                        j8 = j23;
                                                                        arrayList11 = arrayList37;
                                                                        arrayList6 = arrayList38;
                                                                        arrayList3 = arrayList39;
                                                                        j = j24;
                                                                        str7 = attributeValue8;
                                                                        long j39 = j25;
                                                                        String str90 = str46;
                                                                        String str91 = str47;
                                                                        str8 = str48;
                                                                        str9 = str56;
                                                                        ArrayList arrayList67 = arrayList42;
                                                                        ArrayList arrayList68 = arrayList43;
                                                                        str10 = str51;
                                                                        str11 = str52;
                                                                        str12 = str53;
                                                                        ArrayList arrayList69 = arrayList48;
                                                                        str13 = str54;
                                                                        z4 = true;
                                                                        i = 0;
                                                                        z3 = z2;
                                                                        arrayList12 = arrayList41;
                                                                        str14 = attributeValue7;
                                                                        arrayList13 = arrayList49;
                                                                        ArrayList arrayList70 = arrayList47;
                                                                        str = str41;
                                                                        arrayList14 = arrayList46;
                                                                        arrayList15 = arrayList45;
                                                                        if (g0g.R(str91, xmlPullParser5)) {
                                                                            ebpVar2 = x(xmlPullParser5, (dbp) ebpVar2);
                                                                            xmlPullParser2 = xmlPullParser5;
                                                                            arrayList16 = arrayList69;
                                                                            str19 = str57;
                                                                            str20 = str7;
                                                                            arrayList17 = arrayList70;
                                                                            str55 = str5;
                                                                            j10 = j39;
                                                                            arrayList19 = arrayList67;
                                                                            arrayList18 = arrayList68;
                                                                            str21 = str6;
                                                                            str17 = str89;
                                                                            str15 = str90;
                                                                            r8 = null;
                                                                            i3 = i16;
                                                                            str16 = str91;
                                                                        } else if (g0g.R(str90, xmlPullParser5)) {
                                                                            long i17 = i(xmlPullParser5, j26);
                                                                            str15 = str90;
                                                                            str16 = str91;
                                                                            ebpVar2 = y(xmlPullParser5, (abp) ebpVar2, j7, j6, j5, i17, j39);
                                                                            j6 = j6;
                                                                            j26 = i17;
                                                                            arrayList16 = arrayList69;
                                                                            str19 = str57;
                                                                            str20 = str7;
                                                                            arrayList17 = arrayList70;
                                                                            str55 = str5;
                                                                            i3 = i16;
                                                                            arrayList19 = arrayList67;
                                                                            arrayList18 = arrayList68;
                                                                            str21 = str6;
                                                                            str17 = str89;
                                                                            r8 = null;
                                                                            xmlPullParser2 = xmlPullParser5;
                                                                            j10 = j39;
                                                                        } else {
                                                                            str15 = str90;
                                                                            i2 = i16;
                                                                            j9 = j26;
                                                                            str16 = str91;
                                                                            if (g0g.R(str89, xmlPullParser5)) {
                                                                                long i18 = i(xmlPullParser5, j9);
                                                                                str17 = str89;
                                                                                arrayList16 = arrayList69;
                                                                                j10 = j39;
                                                                                ebpVar2 = z(xmlPullParser5, (bbp) ebpVar2, arrayList70, j7, j6, j5, i18, j10);
                                                                                arrayList17 = arrayList70;
                                                                                j6 = j6;
                                                                                xmlPullParser2 = xmlPullParser5;
                                                                                j26 = i18;
                                                                                str19 = str57;
                                                                                str20 = str7;
                                                                                str55 = str5;
                                                                                i3 = i2;
                                                                                arrayList19 = arrayList67;
                                                                                arrayList18 = arrayList68;
                                                                                str18 = str59;
                                                                                str21 = str6;
                                                                                r8 = null;
                                                                            } else {
                                                                                str17 = str89;
                                                                                j6 = j6;
                                                                                arrayList16 = arrayList69;
                                                                                arrayList17 = arrayList70;
                                                                                xmlPullParser2 = xmlPullParser5;
                                                                                j10 = j39;
                                                                                if (g0g.R("InbandEventStream", xmlPullParser2)) {
                                                                                    arrayList18 = arrayList68;
                                                                                    arrayList18.add(m("InbandEventStream", xmlPullParser2));
                                                                                    arrayList19 = arrayList67;
                                                                                    str18 = str59;
                                                                                    r8 = null;
                                                                                } else {
                                                                                    arrayList18 = arrayList68;
                                                                                    if (g0g.R("Label", xmlPullParser2)) {
                                                                                        str18 = str59;
                                                                                        r8 = null;
                                                                                        arrayList19 = arrayList67;
                                                                                        arrayList19.add(new rif(xmlPullParser2.getAttributeValue(null, str18), C("Label", xmlPullParser2)));
                                                                                    } else {
                                                                                        arrayList19 = arrayList67;
                                                                                        str18 = str59;
                                                                                        r8 = null;
                                                                                        if (xmlPullParser2.getEventType() == 2) {
                                                                                            g(xmlPullParser2);
                                                                                        }
                                                                                    }
                                                                                }
                                                                            }
                                                                        }
                                                                        str18 = str59;
                                                                    }
                                                                    if (g0g.Q(str21, xmlPullParser2)) {
                                                                    }
                                                                }
                                                                j26 = j9;
                                                                str19 = str57;
                                                                str20 = str7;
                                                                str55 = str5;
                                                                i3 = i2;
                                                                str21 = str6;
                                                                if (g0g.Q(str21, xmlPullParser2)) {
                                                                }
                                                            }
                                                        }
                                                    }
                                                    str5 = str55;
                                                    i2 = i10;
                                                    j6 = n7;
                                                    arrayList = arrayList31;
                                                    str3 = str43;
                                                    j7 = j17;
                                                    arrayList10 = arrayList33;
                                                    str6 = str44;
                                                    str17 = str45;
                                                    j8 = j23;
                                                    arrayList11 = arrayList37;
                                                    arrayList6 = arrayList38;
                                                    arrayList3 = arrayList39;
                                                    j = j24;
                                                    str7 = attributeValue8;
                                                    str16 = str47;
                                                    str8 = str48;
                                                    str9 = str56;
                                                    arrayList19 = arrayList42;
                                                    arrayList18 = arrayList43;
                                                    str10 = str51;
                                                    str11 = str52;
                                                    str12 = str53;
                                                    arrayList16 = arrayList48;
                                                    str13 = str54;
                                                    z4 = true;
                                                    i = 0;
                                                    z3 = z2;
                                                    arrayList12 = arrayList41;
                                                    str14 = attributeValue7;
                                                    arrayList13 = arrayList49;
                                                    str = str41;
                                                    arrayList14 = arrayList46;
                                                    arrayList15 = arrayList45;
                                                    j10 = j25;
                                                    j9 = j26;
                                                    r8 = null;
                                                    xmlPullParser2 = xmlPullParser4;
                                                    str18 = str49;
                                                    str15 = str46;
                                                    arrayList17 = arrayList47;
                                                    j26 = j9;
                                                    str19 = str57;
                                                    str20 = str7;
                                                    str55 = str5;
                                                    i3 = i2;
                                                    str21 = str6;
                                                    if (g0g.Q(str21, xmlPullParser2)) {
                                                    }
                                                }
                                            }
                                            arrayList9 = arrayList36;
                                            j6 = n7;
                                            arrayList = arrayList31;
                                            str3 = str43;
                                            j7 = j17;
                                            arrayList10 = arrayList33;
                                            str21 = str44;
                                            str17 = str45;
                                            j8 = j23;
                                            arrayList11 = arrayList37;
                                            arrayList6 = arrayList38;
                                            arrayList3 = arrayList39;
                                            j = j24;
                                            str16 = str47;
                                            str8 = str48;
                                            str9 = str56;
                                            arrayList19 = arrayList42;
                                            str10 = str51;
                                            str11 = str52;
                                            str12 = str53;
                                            arrayList16 = arrayList48;
                                            str13 = str54;
                                            z4 = true;
                                            i = 0;
                                            z3 = z2;
                                            arrayList12 = arrayList41;
                                            i3 = i10;
                                            str14 = attributeValue7;
                                            arrayList13 = arrayList49;
                                            str = str41;
                                            arrayList15 = arrayList45;
                                            str19 = str57;
                                            str20 = attributeValue8;
                                            j10 = j25;
                                            arrayList18 = arrayList43;
                                            r8 = null;
                                            xmlPullParser2 = xmlPullParser4;
                                            arrayList14 = arrayList46;
                                            str18 = str49;
                                            str15 = str46;
                                            arrayList17 = arrayList47;
                                            if (g0g.Q(str21, xmlPullParser2)) {
                                            }
                                        }
                                        ArrayList arrayList71 = new ArrayList(arrayList16.size());
                                        int i19 = i;
                                        while (i19 < arrayList16.size()) {
                                            ArrayList arrayList72 = arrayList19;
                                            String str92 = attributeValue14;
                                            arrayList71.add(d((e97) arrayList16.get(i19), str92, arrayList72, str19, arrayList12, arrayList18));
                                            i19++;
                                            attributeValue14 = str92;
                                            arrayList19 = arrayList72;
                                        }
                                        nj njVar = new nj(parseLong, i3, arrayList71, arrayList44, arrayList14, arrayList17);
                                        ArrayList arrayList73 = arrayList11;
                                        arrayList73.add(njVar);
                                        xmlPullParser4 = xmlPullParser2;
                                        exc3 = r8;
                                        n4 = j10;
                                        j2 = j7;
                                        j4 = j6;
                                        j15 = -9223372036854775807L;
                                        long j40 = j8;
                                        arrayList8 = arrayList73;
                                        j3 = j40;
                                        arrayList7 = arrayList10;
                                    } else {
                                        arrayList6 = arrayList28;
                                        arrayList3 = arrayList29;
                                        j = j14;
                                        str = str41;
                                        str2 = str42;
                                        long j41 = n7;
                                        arrayList = arrayList31;
                                        str3 = str43;
                                        long j42 = j17;
                                        ArrayList arrayList74 = arrayList33;
                                        z4 = true;
                                        i = 0;
                                        XmlPullParser xmlPullParser6 = xmlPullParser4;
                                        z3 = z2;
                                        long j43 = j21;
                                        ArrayList arrayList75 = arrayList35;
                                        long j44 = n4;
                                        if (g0g.R("EventStream", xmlPullParser6)) {
                                            arrayList74.add(p(xmlPullParser6));
                                            exc3 = null;
                                            n4 = j44;
                                            j2 = j42;
                                            j15 = -9223372036854775807L;
                                            arrayList7 = arrayList74;
                                            xmlPullParser4 = xmlPullParser6;
                                            arrayList8 = arrayList75;
                                            j3 = j43;
                                            j4 = j41;
                                        } else if (g0g.R("SegmentBase", xmlPullParser6)) {
                                            ebpVar = x(xmlPullParser6, null);
                                            exc2 = null;
                                            n4 = j44;
                                            j2 = j42;
                                            str4 = str3;
                                            j15 = -9223372036854775807L;
                                            arrayList7 = arrayList74;
                                            xmlPullParser4 = xmlPullParser6;
                                            arrayList8 = arrayList75;
                                            j3 = j43;
                                            j4 = j41;
                                        } else if (g0g.R("SegmentList", xmlPullParser6)) {
                                            long i20 = i(xmlPullParser6, -9223372036854775807L);
                                            n4 = j44;
                                            j2 = j42;
                                            arrayList7 = arrayList74;
                                            arrayList8 = arrayList75;
                                            xmlPullParser4 = xmlPullParser6;
                                            j3 = j43;
                                            j4 = j41;
                                            ebpVar = y(xmlPullParser4, null, j2, j41, j43, i20, n4);
                                            j20 = i20;
                                            str4 = str3;
                                            j15 = -9223372036854775807L;
                                            exc2 = null;
                                        } else {
                                            n4 = j44;
                                            j2 = j42;
                                            arrayList7 = arrayList74;
                                            xmlPullParser4 = xmlPullParser6;
                                            arrayList8 = arrayList75;
                                            j3 = j43;
                                            j4 = j41;
                                            if (g0g.R(str45, xmlPullParser4)) {
                                                long i21 = i(xmlPullParser4, -9223372036854775807L);
                                                ude udeVar = yde.b;
                                                j15 = -9223372036854775807L;
                                                exc2 = null;
                                                bbp z12 = z(xmlPullParser4, null, qsn.e, j2, j4, j3, i21, n4);
                                                j2 = j2;
                                                n4 = n4;
                                                j20 = i21;
                                                str4 = str3;
                                                ebpVar = z12;
                                            } else {
                                                j15 = -9223372036854775807L;
                                                Exception exc4 = null;
                                                if (g0g.R("AssetIdentifier", xmlPullParser4)) {
                                                    m("AssetIdentifier", xmlPullParser4);
                                                    exc3 = exc4;
                                                } else {
                                                    g(xmlPullParser4);
                                                    exc3 = exc4;
                                                }
                                            }
                                        }
                                    }
                                    str4 = str3;
                                    exc2 = exc3;
                                }
                                if (g0g.Q(str4, xmlPullParser4)) {
                                    break;
                                }
                                str43 = str4;
                                n7 = j4;
                                z2 = z3;
                                arrayList35 = arrayList8;
                                arrayList33 = arrayList7;
                                arrayList31 = arrayList;
                                arrayList28 = arrayList6;
                                arrayList34 = arrayList4;
                                arrayList30 = arrayList5;
                                arrayList29 = arrayList3;
                                str41 = str;
                                str42 = str2;
                                f97Var = this;
                                j17 = j2;
                                j21 = j3;
                                j14 = j;
                            }
                            Pair create = Pair.create(new pkk(attributeValue4, n6, arrayList8, arrayList7), Long.valueOf(j4));
                            pkk pkkVar = (pkk) create.first;
                            if (pkkVar.b != j15) {
                                long longValue = ((Long) create.second).longValue();
                                j16 = longValue == j15 ? j15 : pkkVar.b + longValue;
                                arrayList2 = arrayList6;
                                arrayList2.add(pkkVar);
                                z5 = z8;
                            } else {
                                if (!equals) {
                                    throw r7k.b("Unable to determine start of period " + arrayList6.size(), exc2);
                                }
                                z5 = z4;
                                j16 = j18;
                                arrayList2 = arrayList6;
                            }
                            z8 = z5;
                            exc = exc2;
                        }
                        j14 = j;
                        str39 = exc;
                    }
                    z3 = z2;
                    arrayList = z6;
                    arrayList2 = arrayList28;
                    arrayList3 = arrayList29;
                }
                str39 = 0;
                z4 = true;
                i = 0;
            }
            if (g0g.Q("MPD", xmlPullParser4)) {
                if (n == j15) {
                    if (j16 == j15) {
                        if (!equals) {
                            throw r7k.b("Unable to determine duration of static manifest.", str39);
                        }
                    }
                    if (arrayList2.isEmpty()) {
                        return c(b0, j16, n2, equals, n3, n4, n5, b02, mumVar, y3eVar, dnhVar, uri2, arrayList2);
                    }
                    throw r7k.b("No periods found.", str39);
                }
                j16 = n;
                if (arrayList2.isEmpty()) {
                }
            } else {
                str40 = str39;
                arrayList28 = arrayList2;
                z = z4;
                i7 = i;
                arrayList29 = arrayList3;
                f97Var = this;
                b0 = b0;
                z2 = z3;
                z6 = arrayList;
            }
        }
    }

    public final abp y(XmlPullParser xmlPullParser, abp abpVar, long j, long j2, long j3, long j4, long j5) {
        long j6;
        long j7 = abpVar != null ? abpVar.b : 1L;
        String attributeValue = xmlPullParser.getAttributeValue(null, "timescale");
        if (attributeValue != null) {
            j7 = Long.parseLong(attributeValue);
        }
        long j8 = j7;
        long j9 = abpVar != null ? abpVar.c : 0L;
        String attributeValue2 = xmlPullParser.getAttributeValue(null, "presentationTimeOffset");
        if (attributeValue2 != null) {
            j9 = Long.parseLong(attributeValue2);
        }
        long j10 = j9;
        long j11 = abpVar != null ? abpVar.e : -9223372036854775807L;
        String attributeValue3 = xmlPullParser.getAttributeValue(null, "duration");
        if (attributeValue3 != null) {
            j11 = Long.parseLong(attributeValue3);
        }
        long j12 = j11;
        long j13 = abpVar != null ? abpVar.d : 1L;
        String attributeValue4 = xmlPullParser.getAttributeValue(null, "startNumber");
        if (attributeValue4 != null) {
            j13 = Long.parseLong(attributeValue4);
        }
        long j14 = j13;
        long j15 = j4 == -9223372036854775807L ? j3 : j4;
        long j16 = j15 == Long.MAX_VALUE ? -9223372036854775807L : j15;
        List list = null;
        whn whnVar = null;
        List list2 = null;
        while (true) {
            xmlPullParser.next();
            if (g0g.R("Initialization", xmlPullParser)) {
                whnVar = u(xmlPullParser, "sourceURL", "range");
                j6 = j8;
            } else if (g0g.R("SegmentTimeline", xmlPullParser)) {
                j6 = j8;
                list2 = A(xmlPullParser, j6, j2);
            } else {
                j6 = j8;
                if (g0g.R("SegmentURL", xmlPullParser)) {
                    if (list == null) {
                        list = new ArrayList();
                    }
                    list.add(u(xmlPullParser, "media", "mediaRange"));
                } else {
                    g(xmlPullParser);
                }
            }
            if (g0g.Q("SegmentList", xmlPullParser)) {
                break;
            }
            j8 = j6;
        }
        if (abpVar != null) {
            if (whnVar == null) {
                whnVar = abpVar.a;
            }
            if (list2 == null) {
                list2 = abpVar.f;
            }
            if (list == null) {
                list = abpVar.j;
            }
        }
        return e(whnVar, j6, j10, j14, j12, list2, j16, list, j5, j);
    }

    public bbp z(XmlPullParser xmlPullParser, bbp bbpVar, List list, long j, long j2, long j3, long j4, long j5) {
        long j6;
        f97 f97Var = this;
        long j7 = bbpVar != null ? bbpVar.b : 1L;
        whn whnVar = null;
        String attributeValue = xmlPullParser.getAttributeValue(null, "timescale");
        if (attributeValue != null) {
            j7 = Long.parseLong(attributeValue);
        }
        long j8 = bbpVar != null ? bbpVar.c : 0L;
        String attributeValue2 = xmlPullParser.getAttributeValue(null, "presentationTimeOffset");
        if (attributeValue2 != null) {
            j8 = Long.parseLong(attributeValue2);
        }
        long j9 = bbpVar != null ? bbpVar.e : -9223372036854775807L;
        String attributeValue3 = xmlPullParser.getAttributeValue(null, "duration");
        if (attributeValue3 != null) {
            j9 = Long.parseLong(attributeValue3);
        }
        long j10 = bbpVar != null ? bbpVar.d : 1L;
        String attributeValue4 = xmlPullParser.getAttributeValue(null, "startNumber");
        if (attributeValue4 != null) {
            j10 = Long.parseLong(attributeValue4);
        }
        long j11 = j10;
        long r = r(list);
        long j12 = j4 == -9223372036854775807L ? j3 : j4;
        long j13 = j12 != Long.MAX_VALUE ? j12 : -9223372036854775807L;
        gqt D = f97Var.D(xmlPullParser, "media", bbpVar != null ? bbpVar.k : null);
        gqt D2 = f97Var.D(xmlPullParser, "initialization", bbpVar != null ? bbpVar.j : null);
        List list2 = null;
        while (true) {
            xmlPullParser.next();
            if (g0g.R("Initialization", xmlPullParser)) {
                whnVar = u(xmlPullParser, "sourceURL", "range");
                j6 = j7;
            } else if (g0g.R("SegmentTimeline", xmlPullParser)) {
                j6 = j7;
                list2 = f97Var.A(xmlPullParser, j6, j2);
            } else {
                j6 = j7;
                g(xmlPullParser);
            }
            if (g0g.Q("SegmentTemplate", xmlPullParser)) {
                break;
            }
            j9 = j9;
            j13 = j13;
            r = r;
            f97Var = this;
            j11 = j11;
            j7 = j6;
        }
        if (bbpVar != null) {
            if (whnVar == null) {
                whnVar = bbpVar.a;
            }
            if (list2 == null) {
                list2 = bbpVar.f;
            }
        }
        return f(whnVar, j6, j8, j11, r, j9, list2, j13, D2, D, j5, j);
    }
}
