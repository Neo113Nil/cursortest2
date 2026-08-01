package com.google.android.gms.internal.ads;

import O.C0344t;
import android.text.Layout;
import android.text.TextUtils;
import com.anythink.expressad.foundation.d.d;
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

/* loaded from: classes2.dex */
public final class N3 implements InterfaceC3868s3 {

    /* renamed from: n, reason: collision with root package name */
    public final XmlPullParserFactory f26400n;

    /* renamed from: u, reason: collision with root package name */
    public static final Pattern f26394u = Pattern.compile("^([0-9][0-9]+):([0-9][0-9]):([0-9][0-9])(?:(\\.[0-9]+)|:([0-9][0-9])(?:\\.([0-9]+))?)?$");

    /* renamed from: v, reason: collision with root package name */
    public static final Pattern f26395v = Pattern.compile("^([0-9]+(?:\\.[0-9]+)?)(h|m|s|ms|f|t)$");

    /* renamed from: w, reason: collision with root package name */
    public static final Pattern f26396w = Pattern.compile("^(([0-9]*.)?[0-9]+)(px|em|%)$");

    /* renamed from: x, reason: collision with root package name */
    public static final Pattern f26397x = Pattern.compile("^([-+]?\\d+\\.?\\d*?)%$");

    /* renamed from: y, reason: collision with root package name */
    public static final Pattern f26398y = Pattern.compile("^([-+]?\\d+\\.?\\d*?)% ([-+]?\\d+\\.?\\d*?)%$");

    /* renamed from: z, reason: collision with root package name */
    public static final Pattern f26399z = Pattern.compile("^([-+]?\\d+\\.?\\d*?)px ([-+]?\\d+\\.?\\d*?)px$");

    /* renamed from: A, reason: collision with root package name */
    public static final Pattern f26392A = Pattern.compile("^(\\d+) (\\d+)$");

    /* renamed from: B, reason: collision with root package name */
    public static final M3 f26393B = new M3(1, 1, 30.0f);

    public N3() {
        try {
            XmlPullParserFactory newInstance = XmlPullParserFactory.newInstance();
            this.f26400n = newInstance;
            newInstance.setNamespaceAware(true);
        } catch (XmlPullParserException e9) {
            throw new RuntimeException("Couldn't create XmlPullParserFactory instance", e9);
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Removed duplicated region for block: B:39:0x01a3  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x01b6  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x01da  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x023e  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x0244  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x01a9  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static Q3 b(XmlPullParser xmlPullParser, Q3 q32) {
        char c9;
        Matcher matcher;
        char c10;
        char c11;
        char c12;
        char c13;
        char c14;
        K3 k32;
        char c15;
        C3931tC f3;
        int i;
        char c16;
        int i6;
        int attributeCount = xmlPullParser.getAttributeCount();
        Q3 q33 = q32;
        for (int i9 = 0; i9 < attributeCount; i9++) {
            String attributeValue = xmlPullParser.getAttributeValue(i9);
            String attributeName = xmlPullParser.getAttributeName(i9);
            switch (attributeName.hashCode()) {
                case -1550943582:
                    if (attributeName.equals("fontStyle")) {
                        c9 = 6;
                        break;
                    }
                    c9 = 65535;
                    break;
                case -1289044182:
                    if (attributeName.equals("extent")) {
                        c9 = 16;
                        break;
                    }
                    c9 = 65535;
                    break;
                case -1224696685:
                    if (attributeName.equals("fontFamily")) {
                        c9 = 3;
                        break;
                    }
                    c9 = 65535;
                    break;
                case -1065511464:
                    if (attributeName.equals("textAlign")) {
                        c9 = 7;
                        break;
                    }
                    c9 = 65535;
                    break;
                case -1008619738:
                    if (attributeName.equals("origin")) {
                        c9 = 15;
                        break;
                    }
                    c9 = 65535;
                    break;
                case -879295043:
                    if (attributeName.equals("textDecoration")) {
                        c9 = '\f';
                        break;
                    }
                    c9 = 65535;
                    break;
                case -734428249:
                    if (attributeName.equals("fontWeight")) {
                        c9 = 5;
                        break;
                    }
                    c9 = 65535;
                    break;
                case 3355:
                    if (attributeName.equals("id")) {
                        c9 = 0;
                        break;
                    }
                    c9 = 65535;
                    break;
                case 3511770:
                    if (attributeName.equals("ruby")) {
                        c9 = '\n';
                        break;
                    }
                    c9 = 65535;
                    break;
                case 94842723:
                    if (attributeName.equals(com.anythink.expressad.foundation.h.k.f19633d)) {
                        c9 = 2;
                        break;
                    }
                    c9 = 65535;
                    break;
                case 109403361:
                    if (attributeName.equals("shear")) {
                        c9 = 14;
                        break;
                    }
                    c9 = 65535;
                    break;
                case 110138194:
                    if (attributeName.equals("textCombine")) {
                        c9 = '\t';
                        break;
                    }
                    c9 = 65535;
                    break;
                case 365601008:
                    if (attributeName.equals("fontSize")) {
                        c9 = 4;
                        break;
                    }
                    c9 = 65535;
                    break;
                case 921125321:
                    if (attributeName.equals("textEmphasis")) {
                        c9 = '\r';
                        break;
                    }
                    c9 = 65535;
                    break;
                case 1115953443:
                    if (attributeName.equals("rubyPosition")) {
                        c9 = 11;
                        break;
                    }
                    c9 = 65535;
                    break;
                case 1287124693:
                    if (attributeName.equals("backgroundColor")) {
                        c9 = 1;
                        break;
                    }
                    c9 = 65535;
                    break;
                case 1587328867:
                    if (attributeName.equals("displayAlign")) {
                        c9 = 17;
                        break;
                    }
                    c9 = 65535;
                    break;
                case 1754920356:
                    if (attributeName.equals("multiRowAlign")) {
                        c9 = '\b';
                        break;
                    }
                    c9 = 65535;
                    break;
                default:
                    c9 = 65535;
                    break;
            }
            switch (c9) {
                case 0:
                    if (com.anythink.expressad.foundation.h.k.f19634e.equals(xmlPullParser.getName())) {
                        q33 = c(q33);
                        q33.f26968l = attributeValue;
                        continue;
                    }
                case 1:
                    q33 = c(q33);
                    try {
                        q33.f26961d = AbstractC2628Jm.a(attributeValue, false);
                        q33.f26962e = true;
                        continue;
                    } catch (IllegalArgumentException unused) {
                        com.anythink.basead.exoplayer.f.f.v(attributeValue, "Failed parsing background value: ", "TtmlParser");
                    }
                case 2:
                    q33 = c(q33);
                    try {
                        q33.f26959b = AbstractC2628Jm.a(attributeValue, false);
                        q33.f26960c = true;
                        break;
                    } catch (IllegalArgumentException unused2) {
                        com.anythink.basead.exoplayer.f.f.v(attributeValue, "Failed parsing color value: ", "TtmlParser");
                        break;
                    }
                case 3:
                    q33 = c(q33);
                    q33.f26958a = attributeValue;
                    break;
                case 4:
                    try {
                        q33 = c(q33);
                        String str = AbstractC3159eu.f29993a;
                        String[] split = attributeValue.split("\\s+", -1);
                        int length = split.length;
                        Pattern pattern = f26396w;
                        if (length == 1) {
                            matcher = pattern.matcher(attributeValue);
                        } else {
                            if (length != 2) {
                                StringBuilder sb = new StringBuilder(String.valueOf(length).length() + 41);
                                sb.append("Invalid number of entries for fontSize: ");
                                sb.append(length);
                                sb.append(com.anythink.core.common.d.j.f12378z);
                                throw new C3761q3(sb.toString());
                            }
                            matcher = pattern.matcher(split[1]);
                            AbstractC2968bG.y("TtmlParser", "Multiple values in fontSize attribute. Picking the second value for vertical font size and ignoring the first.");
                        }
                        if (!matcher.matches()) {
                            StringBuilder sb2 = new StringBuilder(attributeValue.length() + 36);
                            sb2.append("Invalid expression for fontSize: '");
                            sb2.append(attributeValue);
                            sb2.append("'.");
                            throw new C3761q3(sb2.toString());
                        }
                        String group = matcher.group(3);
                        if (group == null) {
                            throw null;
                        }
                        int hashCode = group.hashCode();
                        if (hashCode == 37) {
                            if (group.equals("%")) {
                                c10 = 2;
                            }
                            c10 = 65535;
                        } else if (hashCode != 3240) {
                            if (hashCode == 3592 && group.equals("px")) {
                                c10 = 0;
                            }
                            c10 = 65535;
                        } else {
                            if (group.equals("em")) {
                                c10 = 1;
                            }
                            c10 = 65535;
                        }
                        if (c10 == 0) {
                            q33.f26966j = 1;
                        } else if (c10 == 1) {
                            q33.f26966j = 2;
                        } else {
                            if (c10 != 2) {
                                StringBuilder sb3 = new StringBuilder(group.length() + 30);
                                sb3.append("Invalid unit for fontSize: '");
                                sb3.append(group);
                                sb3.append("'.");
                                throw new C3761q3(sb3.toString());
                            }
                            q33.f26966j = 3;
                        }
                        String group2 = matcher.group(1);
                        if (group2 == null) {
                            throw null;
                        }
                        q33.f26967k = Float.parseFloat(group2);
                        break;
                    } catch (C3761q3 unused3) {
                        com.anythink.basead.exoplayer.f.f.v(attributeValue, "Failed parsing fontSize value: ", "TtmlParser");
                        break;
                    }
                    break;
                case 5:
                    q33 = c(q33);
                    q33.f26965h = "bold".equalsIgnoreCase(attributeValue) ? 1 : 0;
                    break;
                case 6:
                    q33 = c(q33);
                    q33.i = "italic".equalsIgnoreCase(attributeValue) ? 1 : 0;
                    break;
                case 7:
                    q33 = c(q33);
                    q33.f26971o = d(attributeValue);
                    break;
                case '\b':
                    q33 = c(q33);
                    q33.f26972p = d(attributeValue);
                    break;
                case '\t':
                    String f9 = AbstractC3043cl.f(attributeValue);
                    int hashCode2 = f9.hashCode();
                    if (hashCode2 != 96673) {
                        if (hashCode2 == 3387192 && f9.equals("none")) {
                            c11 = 0;
                        }
                        c11 = 65535;
                    } else {
                        if (f9.equals("all")) {
                            c11 = 1;
                        }
                        c11 = 65535;
                    }
                    if (c11 != 0) {
                        if (c11 == 1) {
                            q33 = c(q33);
                            q33.f26973q = 1;
                            break;
                        }
                    } else {
                        q33 = c(q33);
                        q33.f26973q = 0;
                        break;
                    }
                    break;
                case '\n':
                    String f10 = AbstractC3043cl.f(attributeValue);
                    switch (f10.hashCode()) {
                        case -618561360:
                            if (f10.equals("baseContainer")) {
                                c12 = 2;
                                break;
                            }
                            c12 = 65535;
                            break;
                        case -410956671:
                            if (f10.equals("container")) {
                                c12 = 0;
                                break;
                            }
                            c12 = 65535;
                            break;
                        case -250518009:
                            if (f10.equals("delimiter")) {
                                c12 = 5;
                                break;
                            }
                            c12 = 65535;
                            break;
                        case -136074796:
                            if (f10.equals("textContainer")) {
                                c12 = 4;
                                break;
                            }
                            c12 = 65535;
                            break;
                        case 3016401:
                            if (f10.equals("base")) {
                                c12 = 1;
                                break;
                            }
                            c12 = 65535;
                            break;
                        case 3556653:
                            if (f10.equals(com.anythink.basead.exoplayer.k.o.f8446c)) {
                                c12 = 3;
                                break;
                            }
                            c12 = 65535;
                            break;
                        default:
                            c12 = 65535;
                            break;
                    }
                    if (c12 != 0) {
                        if (c12 != 1 && c12 != 2) {
                            if (c12 != 3 && c12 != 4) {
                                if (c12 == 5) {
                                    q33 = c(q33);
                                    q33.f26969m = 4;
                                    break;
                                }
                            } else {
                                q33 = c(q33);
                                q33.f26969m = 3;
                                break;
                            }
                        } else {
                            q33 = c(q33);
                            q33.f26969m = 2;
                            break;
                        }
                    } else {
                        q33 = c(q33);
                        q33.f26969m = 1;
                        break;
                    }
                    break;
                case 11:
                    String f11 = AbstractC3043cl.f(attributeValue);
                    int hashCode3 = f11.hashCode();
                    if (hashCode3 != -1392885889) {
                        if (hashCode3 == 92734940 && f11.equals("after")) {
                            c13 = 1;
                        }
                        c13 = 65535;
                    } else {
                        if (f11.equals("before")) {
                            c13 = 0;
                        }
                        c13 = 65535;
                    }
                    if (c13 != 0) {
                        if (c13 == 1) {
                            q33 = c(q33);
                            q33.f26970n = 2;
                            break;
                        }
                    } else {
                        q33 = c(q33);
                        q33.f26970n = 1;
                        break;
                    }
                    break;
                case '\f':
                    String f12 = AbstractC3043cl.f(attributeValue);
                    switch (f12.hashCode()) {
                        case -1461280213:
                            if (f12.equals("nounderline")) {
                                c14 = 3;
                                break;
                            }
                            c14 = 65535;
                            break;
                        case -1026963764:
                            if (f12.equals("underline")) {
                                c14 = 2;
                                break;
                            }
                            c14 = 65535;
                            break;
                        case 913457136:
                            if (f12.equals("nolinethrough")) {
                                c14 = 1;
                                break;
                            }
                            c14 = 65535;
                            break;
                        case 1679736913:
                            if (f12.equals("linethrough")) {
                                c14 = 0;
                                break;
                            }
                            c14 = 65535;
                            break;
                        default:
                            c14 = 65535;
                            break;
                    }
                    if (c14 == 0) {
                        q33 = c(q33);
                        q33.f26963f = 1;
                        break;
                    } else if (c14 == 1) {
                        q33 = c(q33);
                        q33.f26963f = 0;
                        break;
                    } else {
                        if (c14 == 2) {
                            q33 = c(q33);
                            q33.f26964g = 1;
                        } else if (c14 == 3) {
                            q33 = c(q33);
                            q33.f26964g = 0;
                        }
                    }
                    break;
                case '\r':
                    q33 = c(q33);
                    Pattern pattern2 = K3.f25833d;
                    if (attributeValue != null) {
                        String f13 = AbstractC3043cl.f(attributeValue.trim());
                        if (!f13.isEmpty()) {
                            XB l9 = XB.l(TextUtils.split(f13, K3.f25833d));
                            String str2 = (String) MA.o(AbstractC2639Kg.f(K3.f25837h, l9), "outside");
                            int hashCode4 = str2.hashCode();
                            if (hashCode4 != -1106037339) {
                                if (hashCode4 == 92734940 && str2.equals("after")) {
                                    c15 = 0;
                                    int i10 = c15 == 0 ? c15 != 1 ? 1 : -2 : 2;
                                    f3 = AbstractC2639Kg.f(K3.f25834e, l9);
                                    if (f3.isEmpty()) {
                                        String str3 = (String) new C2910aC(f3, f3.f34227n, f3.f34228u).next();
                                        if (str3.hashCode() == 3387192 && str3.equals("none")) {
                                            i = 0;
                                            i6 = 0;
                                            k32 = new K3(i6, i, i10);
                                            q33.f26974r = k32;
                                            break;
                                        }
                                        i = 0;
                                        i6 = -1;
                                        k32 = new K3(i6, i, i10);
                                        q33.f26974r = k32;
                                    } else {
                                        C3931tC f14 = AbstractC2639Kg.f(K3.f25836g, l9);
                                        C3931tC f15 = AbstractC2639Kg.f(K3.f25835f, l9);
                                        if (!f14.isEmpty() || !f15.isEmpty()) {
                                            String str4 = (String) MA.o(f14, "filled");
                                            i = (str4.hashCode() == 3417674 && str4.equals("open")) ? 2 : 1;
                                            String str5 = (String) MA.o(f15, "circle");
                                            int hashCode5 = str5.hashCode();
                                            if (hashCode5 != -905816648) {
                                                if (hashCode5 == 99657 && str5.equals("dot")) {
                                                    c16 = 0;
                                                    i6 = c16 == 0 ? c16 != 1 ? 1 : 3 : 2;
                                                    k32 = new K3(i6, i, i10);
                                                    q33.f26974r = k32;
                                                }
                                                c16 = 65535;
                                                if (c16 == 0) {
                                                }
                                                k32 = new K3(i6, i, i10);
                                                q33.f26974r = k32;
                                            } else {
                                                if (str5.equals("sesame")) {
                                                    c16 = 1;
                                                    if (c16 == 0) {
                                                    }
                                                    k32 = new K3(i6, i, i10);
                                                    q33.f26974r = k32;
                                                }
                                                c16 = 65535;
                                                if (c16 == 0) {
                                                }
                                                k32 = new K3(i6, i, i10);
                                                q33.f26974r = k32;
                                            }
                                        }
                                        i = 0;
                                        i6 = -1;
                                        k32 = new K3(i6, i, i10);
                                        q33.f26974r = k32;
                                    }
                                }
                                c15 = 65535;
                                if (c15 == 0) {
                                }
                                f3 = AbstractC2639Kg.f(K3.f25834e, l9);
                                if (f3.isEmpty()) {
                                }
                            } else {
                                if (str2.equals("outside")) {
                                    c15 = 1;
                                    if (c15 == 0) {
                                    }
                                    f3 = AbstractC2639Kg.f(K3.f25834e, l9);
                                    if (f3.isEmpty()) {
                                    }
                                }
                                c15 = 65535;
                                if (c15 == 0) {
                                }
                                f3 = AbstractC2639Kg.f(K3.f25834e, l9);
                                if (f3.isEmpty()) {
                                }
                            }
                        }
                    }
                    k32 = null;
                    q33.f26974r = k32;
                    break;
                case 14:
                    Q3 c17 = c(q33);
                    Matcher matcher2 = f26397x.matcher(attributeValue);
                    float f16 = Float.MAX_VALUE;
                    if (matcher2.matches()) {
                        try {
                            String group3 = matcher2.group(1);
                            if (group3 == null) {
                                throw null;
                                break;
                            } else {
                                f16 = Math.min(100.0f, Math.max(-100.0f, Float.parseFloat(group3)));
                            }
                        } catch (NumberFormatException e9) {
                            AbstractC2968bG.C("TtmlParser", "Failed to parse shear: ".concat(String.valueOf(attributeValue)), e9);
                        }
                    } else {
                        com.anythink.basead.exoplayer.f.f.v(attributeValue, "Invalid value for shear: ", "TtmlParser");
                    }
                    c17.f26975s = f16;
                    q33 = c17;
                    break;
                case 15:
                    q33 = c(q33);
                    q33.f26976t = attributeValue;
                    break;
                case 16:
                    q33 = c(q33);
                    q33.f26977u = attributeValue;
                    break;
                case 17:
                    q33 = c(q33);
                    q33.f26978v = attributeValue;
                    break;
            }
        }
        return q33;
    }

    public static Q3 c(Q3 q32) {
        return q32 == null ? new Q3() : q32;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    public static Layout.Alignment d(String str) {
        char c9;
        String f3 = AbstractC3043cl.f(str);
        switch (f3.hashCode()) {
            case -1364013995:
                if (f3.equals("center")) {
                    c9 = 4;
                    break;
                }
                c9 = 65535;
                break;
            case 100571:
                if (f3.equals("end")) {
                    c9 = 3;
                    break;
                }
                c9 = 65535;
                break;
            case 3317767:
                if (f3.equals("left")) {
                    c9 = 0;
                    break;
                }
                c9 = 65535;
                break;
            case 108511772:
                if (f3.equals("right")) {
                    c9 = 2;
                    break;
                }
                c9 = 65535;
                break;
            case 109757538:
                if (f3.equals(com.anythink.expressad.foundation.d.d.cg)) {
                    c9 = 1;
                    break;
                }
                c9 = 65535;
                break;
            default:
                c9 = 65535;
                break;
        }
        if (c9 == 0 || c9 == 1) {
            return Layout.Alignment.ALIGN_NORMAL;
        }
        if (c9 == 2 || c9 == 3) {
            return Layout.Alignment.ALIGN_OPPOSITE;
        }
        if (c9 != 4) {
            return null;
        }
        return Layout.Alignment.ALIGN_CENTER;
    }

    /* JADX WARN: Code restructure failed: missing block: B:50:0x00c7, code lost:
    
        if (r13.equals(com.anythink.core.common.s.f16249a) != false) goto L51;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static long e(String str, M3 m32) {
        double d2;
        double d9;
        Matcher matcher = f26394u.matcher(str);
        char c9 = 2;
        if (matcher.matches()) {
            String group = matcher.group(1);
            group.getClass();
            long parseLong = Long.parseLong(group) * com.anythink.expressad.f.a.b.f18401P;
            String group2 = matcher.group(2);
            group2.getClass();
            long parseLong2 = Long.parseLong(group2) * 60;
            String group3 = matcher.group(3);
            group3.getClass();
            double d10 = parseLong + parseLong2;
            double parseLong3 = Long.parseLong(group3);
            String group4 = matcher.group(4);
            double parseDouble = group4 != null ? Double.parseDouble(group4) : 0.0d;
            double d11 = d10 + parseLong3;
            return (long) ((d11 + parseDouble + (matcher.group(5) != null ? Long.parseLong(r13) / m32.f26236a : 0.0d) + (matcher.group(6) != null ? (Long.parseLong(r13) / m32.f26237b) / m32.f26236a : 0.0d)) * 1000000.0d);
        }
        Matcher matcher2 = f26395v.matcher(str);
        if (!matcher2.matches()) {
            throw new C3761q3("Malformed time expression: ".concat(String.valueOf(str)));
        }
        String group5 = matcher2.group(1);
        group5.getClass();
        double parseDouble2 = Double.parseDouble(group5);
        String group6 = matcher2.group(2);
        group6.getClass();
        int hashCode = group6.hashCode();
        if (hashCode == 102) {
            if (group6.equals("f")) {
                c9 = 4;
            }
            c9 = 65535;
        } else if (hashCode == 104) {
            if (group6.equals("h")) {
                c9 = 0;
            }
            c9 = 65535;
        } else if (hashCode == 109) {
            if (group6.equals(com.anythink.expressad.f.a.b.dI)) {
                c9 = 1;
            }
            c9 = 65535;
        } else if (hashCode == 3494) {
            if (group6.equals("ms")) {
                c9 = 3;
            }
            c9 = 65535;
        } else if (hashCode != 115) {
            if (hashCode == 116 && group6.equals("t")) {
                c9 = 5;
            }
            c9 = 65535;
        }
        if (c9 == 0) {
            d2 = 3600.0d;
        } else {
            if (c9 != 1) {
                if (c9 == 3) {
                    d9 = 1000.0d;
                } else {
                    if (c9 != 4) {
                        if (c9 == 5) {
                            d9 = m32.f26238c;
                        }
                        return (long) (parseDouble2 * 1000000.0d);
                    }
                    d9 = m32.f26236a;
                }
                parseDouble2 /= d9;
                return (long) (parseDouble2 * 1000000.0d);
            }
            d2 = 60.0d;
        }
        parseDouble2 *= d2;
        return (long) (parseDouble2 * 1000000.0d);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:121:0x0358  */
    /* JADX WARN: Removed duplicated region for block: B:140:0x0402 A[Catch: IOException -> 0x0096, XmlPullParserException -> 0x0099, TRY_LEAVE, TryCatch #16 {IOException -> 0x0096, XmlPullParserException -> 0x0099, blocks: (B:3:0x0009, B:5:0x0060, B:7:0x006d, B:10:0x0079, B:13:0x0089, B:15:0x0091, B:16:0x009e, B:18:0x00a6, B:21:0x00bc, B:22:0x00d7, B:24:0x00e1, B:25:0x00e5, B:27:0x00f1, B:28:0x00f5, B:32:0x018c, B:37:0x01e3, B:40:0x01f7, B:42:0x01fd, B:44:0x0205, B:46:0x020d, B:48:0x0215, B:50:0x021d, B:52:0x0225, B:54:0x022b, B:56:0x0233, B:58:0x023b, B:60:0x0241, B:62:0x0247, B:64:0x024d, B:66:0x0255, B:69:0x025e, B:74:0x07df, B:75:0x0293, B:78:0x029b, B:80:0x02a4, B:82:0x02b5, B:84:0x02bf, B:85:0x02cf, B:87:0x02d5, B:89:0x02ed, B:91:0x02f3, B:93:0x05af, B:99:0x02c6, B:101:0x0303, B:104:0x0311, B:108:0x055f, B:111:0x032e, B:113:0x0336, B:115:0x033e, B:117:0x0346, B:122:0x035a, B:126:0x036d, B:128:0x0373, B:130:0x0380, B:132:0x03e8, B:134:0x03ee, B:136:0x03f4, B:138:0x03fc, B:140:0x0402, B:144:0x0411, B:146:0x0417, B:148:0x0424, B:149:0x049b, B:151:0x04a3, B:153:0x04a9, B:155:0x04b1, B:157:0x04b7, B:170:0x0502, B:172:0x050c, B:188:0x0552, B:205:0x042f, B:208:0x0430, B:209:0x0431, B:211:0x043e, B:214:0x0446, B:217:0x0454, B:219:0x045a, B:221:0x0465, B:223:0x0479, B:225:0x047a, B:226:0x047b, B:227:0x0488, B:230:0x0389, B:232:0x038a, B:233:0x038b, B:234:0x0398, B:237:0x03a2, B:240:0x03ab, B:242:0x03b1, B:244:0x03bc, B:246:0x03cc, B:248:0x03cd, B:249:0x03ce, B:250:0x03d6, B:254:0x0572, B:256:0x057f, B:258:0x058a, B:260:0x0590, B:261:0x059c, B:270:0x05d7, B:274:0x05f9, B:293:0x06e2, B:300:0x066a, B:302:0x0672, B:304:0x0689, B:308:0x0692, B:319:0x069d, B:312:0x06ab, B:311:0x06a2, B:299:0x0761, B:324:0x06c2, B:325:0x06c9, B:326:0x06d3, B:351:0x06fb, B:355:0x0707, B:358:0x0710, B:364:0x0723, B:366:0x0733, B:369:0x0743, B:371:0x0748, B:373:0x074c, B:374:0x0753, B:378:0x072a, B:388:0x0199, B:390:0x01a3, B:393:0x01ac, B:395:0x01b2, B:397:0x01bd, B:399:0x01c7, B:401:0x01c8, B:402:0x01c9, B:403:0x0111, B:405:0x011d, B:408:0x0129, B:411:0x012f, B:413:0x013c, B:422:0x015d, B:426:0x0161, B:427:0x0174, B:430:0x0184, B:435:0x017e, B:438:0x0183, B:449:0x0781, B:451:0x078d, B:452:0x0794, B:455:0x079c, B:458:0x07a0, B:460:0x07aa, B:462:0x07b4, B:465:0x07bb, B:466:0x07bc, B:469:0x07d0, B:472:0x07dd, B:479:0x07fc), top: B:2:0x0009, inners: #5, #11, #12, #14, #15 }] */
    /* JADX WARN: Removed duplicated region for block: B:157:0x04b7 A[Catch: IOException -> 0x0096, XmlPullParserException -> 0x0099, TRY_LEAVE, TryCatch #16 {IOException -> 0x0096, XmlPullParserException -> 0x0099, blocks: (B:3:0x0009, B:5:0x0060, B:7:0x006d, B:10:0x0079, B:13:0x0089, B:15:0x0091, B:16:0x009e, B:18:0x00a6, B:21:0x00bc, B:22:0x00d7, B:24:0x00e1, B:25:0x00e5, B:27:0x00f1, B:28:0x00f5, B:32:0x018c, B:37:0x01e3, B:40:0x01f7, B:42:0x01fd, B:44:0x0205, B:46:0x020d, B:48:0x0215, B:50:0x021d, B:52:0x0225, B:54:0x022b, B:56:0x0233, B:58:0x023b, B:60:0x0241, B:62:0x0247, B:64:0x024d, B:66:0x0255, B:69:0x025e, B:74:0x07df, B:75:0x0293, B:78:0x029b, B:80:0x02a4, B:82:0x02b5, B:84:0x02bf, B:85:0x02cf, B:87:0x02d5, B:89:0x02ed, B:91:0x02f3, B:93:0x05af, B:99:0x02c6, B:101:0x0303, B:104:0x0311, B:108:0x055f, B:111:0x032e, B:113:0x0336, B:115:0x033e, B:117:0x0346, B:122:0x035a, B:126:0x036d, B:128:0x0373, B:130:0x0380, B:132:0x03e8, B:134:0x03ee, B:136:0x03f4, B:138:0x03fc, B:140:0x0402, B:144:0x0411, B:146:0x0417, B:148:0x0424, B:149:0x049b, B:151:0x04a3, B:153:0x04a9, B:155:0x04b1, B:157:0x04b7, B:170:0x0502, B:172:0x050c, B:188:0x0552, B:205:0x042f, B:208:0x0430, B:209:0x0431, B:211:0x043e, B:214:0x0446, B:217:0x0454, B:219:0x045a, B:221:0x0465, B:223:0x0479, B:225:0x047a, B:226:0x047b, B:227:0x0488, B:230:0x0389, B:232:0x038a, B:233:0x038b, B:234:0x0398, B:237:0x03a2, B:240:0x03ab, B:242:0x03b1, B:244:0x03bc, B:246:0x03cc, B:248:0x03cd, B:249:0x03ce, B:250:0x03d6, B:254:0x0572, B:256:0x057f, B:258:0x058a, B:260:0x0590, B:261:0x059c, B:270:0x05d7, B:274:0x05f9, B:293:0x06e2, B:300:0x066a, B:302:0x0672, B:304:0x0689, B:308:0x0692, B:319:0x069d, B:312:0x06ab, B:311:0x06a2, B:299:0x0761, B:324:0x06c2, B:325:0x06c9, B:326:0x06d3, B:351:0x06fb, B:355:0x0707, B:358:0x0710, B:364:0x0723, B:366:0x0733, B:369:0x0743, B:371:0x0748, B:373:0x074c, B:374:0x0753, B:378:0x072a, B:388:0x0199, B:390:0x01a3, B:393:0x01ac, B:395:0x01b2, B:397:0x01bd, B:399:0x01c7, B:401:0x01c8, B:402:0x01c9, B:403:0x0111, B:405:0x011d, B:408:0x0129, B:411:0x012f, B:413:0x013c, B:422:0x015d, B:426:0x0161, B:427:0x0174, B:430:0x0184, B:435:0x017e, B:438:0x0183, B:449:0x0781, B:451:0x078d, B:452:0x0794, B:455:0x079c, B:458:0x07a0, B:460:0x07aa, B:462:0x07b4, B:465:0x07bb, B:466:0x07bc, B:469:0x07d0, B:472:0x07dd, B:479:0x07fc), top: B:2:0x0009, inners: #5, #11, #12, #14, #15 }] */
    /* JADX WARN: Removed duplicated region for block: B:166:0x04e1  */
    /* JADX WARN: Removed duplicated region for block: B:172:0x050c A[Catch: IOException -> 0x0096, XmlPullParserException -> 0x0099, TRY_LEAVE, TryCatch #16 {IOException -> 0x0096, XmlPullParserException -> 0x0099, blocks: (B:3:0x0009, B:5:0x0060, B:7:0x006d, B:10:0x0079, B:13:0x0089, B:15:0x0091, B:16:0x009e, B:18:0x00a6, B:21:0x00bc, B:22:0x00d7, B:24:0x00e1, B:25:0x00e5, B:27:0x00f1, B:28:0x00f5, B:32:0x018c, B:37:0x01e3, B:40:0x01f7, B:42:0x01fd, B:44:0x0205, B:46:0x020d, B:48:0x0215, B:50:0x021d, B:52:0x0225, B:54:0x022b, B:56:0x0233, B:58:0x023b, B:60:0x0241, B:62:0x0247, B:64:0x024d, B:66:0x0255, B:69:0x025e, B:74:0x07df, B:75:0x0293, B:78:0x029b, B:80:0x02a4, B:82:0x02b5, B:84:0x02bf, B:85:0x02cf, B:87:0x02d5, B:89:0x02ed, B:91:0x02f3, B:93:0x05af, B:99:0x02c6, B:101:0x0303, B:104:0x0311, B:108:0x055f, B:111:0x032e, B:113:0x0336, B:115:0x033e, B:117:0x0346, B:122:0x035a, B:126:0x036d, B:128:0x0373, B:130:0x0380, B:132:0x03e8, B:134:0x03ee, B:136:0x03f4, B:138:0x03fc, B:140:0x0402, B:144:0x0411, B:146:0x0417, B:148:0x0424, B:149:0x049b, B:151:0x04a3, B:153:0x04a9, B:155:0x04b1, B:157:0x04b7, B:170:0x0502, B:172:0x050c, B:188:0x0552, B:205:0x042f, B:208:0x0430, B:209:0x0431, B:211:0x043e, B:214:0x0446, B:217:0x0454, B:219:0x045a, B:221:0x0465, B:223:0x0479, B:225:0x047a, B:226:0x047b, B:227:0x0488, B:230:0x0389, B:232:0x038a, B:233:0x038b, B:234:0x0398, B:237:0x03a2, B:240:0x03ab, B:242:0x03b1, B:244:0x03bc, B:246:0x03cc, B:248:0x03cd, B:249:0x03ce, B:250:0x03d6, B:254:0x0572, B:256:0x057f, B:258:0x058a, B:260:0x0590, B:261:0x059c, B:270:0x05d7, B:274:0x05f9, B:293:0x06e2, B:300:0x066a, B:302:0x0672, B:304:0x0689, B:308:0x0692, B:319:0x069d, B:312:0x06ab, B:311:0x06a2, B:299:0x0761, B:324:0x06c2, B:325:0x06c9, B:326:0x06d3, B:351:0x06fb, B:355:0x0707, B:358:0x0710, B:364:0x0723, B:366:0x0733, B:369:0x0743, B:371:0x0748, B:373:0x074c, B:374:0x0753, B:378:0x072a, B:388:0x0199, B:390:0x01a3, B:393:0x01ac, B:395:0x01b2, B:397:0x01bd, B:399:0x01c7, B:401:0x01c8, B:402:0x01c9, B:403:0x0111, B:405:0x011d, B:408:0x0129, B:411:0x012f, B:413:0x013c, B:422:0x015d, B:426:0x0161, B:427:0x0174, B:430:0x0184, B:435:0x017e, B:438:0x0183, B:449:0x0781, B:451:0x078d, B:452:0x0794, B:455:0x079c, B:458:0x07a0, B:460:0x07aa, B:462:0x07b4, B:465:0x07bb, B:466:0x07bc, B:469:0x07d0, B:472:0x07dd, B:479:0x07fc), top: B:2:0x0009, inners: #5, #11, #12, #14, #15 }] */
    /* JADX WARN: Removed duplicated region for block: B:183:0x0544  */
    /* JADX WARN: Removed duplicated region for block: B:198:0x04f4  */
    /* JADX WARN: Removed duplicated region for block: B:228:0x0497  */
    /* JADX WARN: Removed duplicated region for block: B:251:0x03de  */
    /* JADX WARN: Removed duplicated region for block: B:268:0x05cd  */
    /* JADX WARN: Removed duplicated region for block: B:388:0x0199 A[Catch: IOException -> 0x0096, XmlPullParserException -> 0x0099, TryCatch #16 {IOException -> 0x0096, XmlPullParserException -> 0x0099, blocks: (B:3:0x0009, B:5:0x0060, B:7:0x006d, B:10:0x0079, B:13:0x0089, B:15:0x0091, B:16:0x009e, B:18:0x00a6, B:21:0x00bc, B:22:0x00d7, B:24:0x00e1, B:25:0x00e5, B:27:0x00f1, B:28:0x00f5, B:32:0x018c, B:37:0x01e3, B:40:0x01f7, B:42:0x01fd, B:44:0x0205, B:46:0x020d, B:48:0x0215, B:50:0x021d, B:52:0x0225, B:54:0x022b, B:56:0x0233, B:58:0x023b, B:60:0x0241, B:62:0x0247, B:64:0x024d, B:66:0x0255, B:69:0x025e, B:74:0x07df, B:75:0x0293, B:78:0x029b, B:80:0x02a4, B:82:0x02b5, B:84:0x02bf, B:85:0x02cf, B:87:0x02d5, B:89:0x02ed, B:91:0x02f3, B:93:0x05af, B:99:0x02c6, B:101:0x0303, B:104:0x0311, B:108:0x055f, B:111:0x032e, B:113:0x0336, B:115:0x033e, B:117:0x0346, B:122:0x035a, B:126:0x036d, B:128:0x0373, B:130:0x0380, B:132:0x03e8, B:134:0x03ee, B:136:0x03f4, B:138:0x03fc, B:140:0x0402, B:144:0x0411, B:146:0x0417, B:148:0x0424, B:149:0x049b, B:151:0x04a3, B:153:0x04a9, B:155:0x04b1, B:157:0x04b7, B:170:0x0502, B:172:0x050c, B:188:0x0552, B:205:0x042f, B:208:0x0430, B:209:0x0431, B:211:0x043e, B:214:0x0446, B:217:0x0454, B:219:0x045a, B:221:0x0465, B:223:0x0479, B:225:0x047a, B:226:0x047b, B:227:0x0488, B:230:0x0389, B:232:0x038a, B:233:0x038b, B:234:0x0398, B:237:0x03a2, B:240:0x03ab, B:242:0x03b1, B:244:0x03bc, B:246:0x03cc, B:248:0x03cd, B:249:0x03ce, B:250:0x03d6, B:254:0x0572, B:256:0x057f, B:258:0x058a, B:260:0x0590, B:261:0x059c, B:270:0x05d7, B:274:0x05f9, B:293:0x06e2, B:300:0x066a, B:302:0x0672, B:304:0x0689, B:308:0x0692, B:319:0x069d, B:312:0x06ab, B:311:0x06a2, B:299:0x0761, B:324:0x06c2, B:325:0x06c9, B:326:0x06d3, B:351:0x06fb, B:355:0x0707, B:358:0x0710, B:364:0x0723, B:366:0x0733, B:369:0x0743, B:371:0x0748, B:373:0x074c, B:374:0x0753, B:378:0x072a, B:388:0x0199, B:390:0x01a3, B:393:0x01ac, B:395:0x01b2, B:397:0x01bd, B:399:0x01c7, B:401:0x01c8, B:402:0x01c9, B:403:0x0111, B:405:0x011d, B:408:0x0129, B:411:0x012f, B:413:0x013c, B:422:0x015d, B:426:0x0161, B:427:0x0174, B:430:0x0184, B:435:0x017e, B:438:0x0183, B:449:0x0781, B:451:0x078d, B:452:0x0794, B:455:0x079c, B:458:0x07a0, B:460:0x07aa, B:462:0x07b4, B:465:0x07bb, B:466:0x07bc, B:469:0x07d0, B:472:0x07dd, B:479:0x07fc), top: B:2:0x0009, inners: #5, #11, #12, #14, #15 }] */
    /* JADX WARN: Removed duplicated region for block: B:40:0x01f7 A[Catch: IOException -> 0x0096, XmlPullParserException -> 0x0099, TRY_ENTER, TryCatch #16 {IOException -> 0x0096, XmlPullParserException -> 0x0099, blocks: (B:3:0x0009, B:5:0x0060, B:7:0x006d, B:10:0x0079, B:13:0x0089, B:15:0x0091, B:16:0x009e, B:18:0x00a6, B:21:0x00bc, B:22:0x00d7, B:24:0x00e1, B:25:0x00e5, B:27:0x00f1, B:28:0x00f5, B:32:0x018c, B:37:0x01e3, B:40:0x01f7, B:42:0x01fd, B:44:0x0205, B:46:0x020d, B:48:0x0215, B:50:0x021d, B:52:0x0225, B:54:0x022b, B:56:0x0233, B:58:0x023b, B:60:0x0241, B:62:0x0247, B:64:0x024d, B:66:0x0255, B:69:0x025e, B:74:0x07df, B:75:0x0293, B:78:0x029b, B:80:0x02a4, B:82:0x02b5, B:84:0x02bf, B:85:0x02cf, B:87:0x02d5, B:89:0x02ed, B:91:0x02f3, B:93:0x05af, B:99:0x02c6, B:101:0x0303, B:104:0x0311, B:108:0x055f, B:111:0x032e, B:113:0x0336, B:115:0x033e, B:117:0x0346, B:122:0x035a, B:126:0x036d, B:128:0x0373, B:130:0x0380, B:132:0x03e8, B:134:0x03ee, B:136:0x03f4, B:138:0x03fc, B:140:0x0402, B:144:0x0411, B:146:0x0417, B:148:0x0424, B:149:0x049b, B:151:0x04a3, B:153:0x04a9, B:155:0x04b1, B:157:0x04b7, B:170:0x0502, B:172:0x050c, B:188:0x0552, B:205:0x042f, B:208:0x0430, B:209:0x0431, B:211:0x043e, B:214:0x0446, B:217:0x0454, B:219:0x045a, B:221:0x0465, B:223:0x0479, B:225:0x047a, B:226:0x047b, B:227:0x0488, B:230:0x0389, B:232:0x038a, B:233:0x038b, B:234:0x0398, B:237:0x03a2, B:240:0x03ab, B:242:0x03b1, B:244:0x03bc, B:246:0x03cc, B:248:0x03cd, B:249:0x03ce, B:250:0x03d6, B:254:0x0572, B:256:0x057f, B:258:0x058a, B:260:0x0590, B:261:0x059c, B:270:0x05d7, B:274:0x05f9, B:293:0x06e2, B:300:0x066a, B:302:0x0672, B:304:0x0689, B:308:0x0692, B:319:0x069d, B:312:0x06ab, B:311:0x06a2, B:299:0x0761, B:324:0x06c2, B:325:0x06c9, B:326:0x06d3, B:351:0x06fb, B:355:0x0707, B:358:0x0710, B:364:0x0723, B:366:0x0733, B:369:0x0743, B:371:0x0748, B:373:0x074c, B:374:0x0753, B:378:0x072a, B:388:0x0199, B:390:0x01a3, B:393:0x01ac, B:395:0x01b2, B:397:0x01bd, B:399:0x01c7, B:401:0x01c8, B:402:0x01c9, B:403:0x0111, B:405:0x011d, B:408:0x0129, B:411:0x012f, B:413:0x013c, B:422:0x015d, B:426:0x0161, B:427:0x0174, B:430:0x0184, B:435:0x017e, B:438:0x0183, B:449:0x0781, B:451:0x078d, B:452:0x0794, B:455:0x079c, B:458:0x07a0, B:460:0x07aa, B:462:0x07b4, B:465:0x07bb, B:466:0x07bc, B:469:0x07d0, B:472:0x07dd, B:479:0x07fc), top: B:2:0x0009, inners: #5, #11, #12, #14, #15 }] */
    /* JADX WARN: Removed duplicated region for block: B:78:0x029b A[Catch: IOException -> 0x0096, XmlPullParserException -> 0x0099, LOOP:1: B:78:0x029b->B:95:0x05bc, LOOP_START, PHI: r2 r4 r5 r6 r9 r12 r14 r15 r21 r31
      0x029b: PHI (r2v9 java.lang.String) = (r2v6 java.lang.String), (r2v54 java.lang.String) binds: [B:77:0x0299, B:95:0x05bc] A[DONT_GENERATE, DONT_INLINE]
      0x029b: PHI (r4v15 java.lang.String) = (r4v6 java.lang.String), (r4v41 java.lang.String) binds: [B:77:0x0299, B:95:0x05bc] A[DONT_GENERATE, DONT_INLINE]
      0x029b: PHI (r5v10 java.lang.String) = (r5v1 java.lang.String), (r5v23 java.lang.String) binds: [B:77:0x0299, B:95:0x05bc] A[DONT_GENERATE, DONT_INLINE]
      0x029b: PHI (r6v20 int) = (r6v7 int), (r6v47 int) binds: [B:77:0x0299, B:95:0x05bc] A[DONT_GENERATE, DONT_INLINE]
      0x029b: PHI (r9v23 java.util.HashMap) = (r9v1 java.util.HashMap), (r9v41 java.util.HashMap) binds: [B:77:0x0299, B:95:0x05bc] A[DONT_GENERATE, DONT_INLINE]
      0x029b: PHI (r12v22 java.lang.String) = (r12v8 java.lang.String), (r12v25 java.lang.String) binds: [B:77:0x0299, B:95:0x05bc] A[DONT_GENERATE, DONT_INLINE]
      0x029b: PHI (r14v10 java.lang.String) = (r14v7 java.lang.String), (r14v19 java.lang.String) binds: [B:77:0x0299, B:95:0x05bc] A[DONT_GENERATE, DONT_INLINE]
      0x029b: PHI (r15v7 java.lang.String) = (r15v4 java.lang.String), (r15v12 java.lang.String) binds: [B:77:0x0299, B:95:0x05bc] A[DONT_GENERATE, DONT_INLINE]
      0x029b: PHI (r21v3 int) = (r21v2 int), (r21v4 int) binds: [B:77:0x0299, B:95:0x05bc] A[DONT_GENERATE, DONT_INLINE]
      0x029b: PHI (r31v1 java.util.HashMap) = (r31v0 java.util.HashMap), (r31v4 java.util.HashMap) binds: [B:77:0x0299, B:95:0x05bc] A[DONT_GENERATE, DONT_INLINE], TRY_ENTER, TryCatch #16 {IOException -> 0x0096, XmlPullParserException -> 0x0099, blocks: (B:3:0x0009, B:5:0x0060, B:7:0x006d, B:10:0x0079, B:13:0x0089, B:15:0x0091, B:16:0x009e, B:18:0x00a6, B:21:0x00bc, B:22:0x00d7, B:24:0x00e1, B:25:0x00e5, B:27:0x00f1, B:28:0x00f5, B:32:0x018c, B:37:0x01e3, B:40:0x01f7, B:42:0x01fd, B:44:0x0205, B:46:0x020d, B:48:0x0215, B:50:0x021d, B:52:0x0225, B:54:0x022b, B:56:0x0233, B:58:0x023b, B:60:0x0241, B:62:0x0247, B:64:0x024d, B:66:0x0255, B:69:0x025e, B:74:0x07df, B:75:0x0293, B:78:0x029b, B:80:0x02a4, B:82:0x02b5, B:84:0x02bf, B:85:0x02cf, B:87:0x02d5, B:89:0x02ed, B:91:0x02f3, B:93:0x05af, B:99:0x02c6, B:101:0x0303, B:104:0x0311, B:108:0x055f, B:111:0x032e, B:113:0x0336, B:115:0x033e, B:117:0x0346, B:122:0x035a, B:126:0x036d, B:128:0x0373, B:130:0x0380, B:132:0x03e8, B:134:0x03ee, B:136:0x03f4, B:138:0x03fc, B:140:0x0402, B:144:0x0411, B:146:0x0417, B:148:0x0424, B:149:0x049b, B:151:0x04a3, B:153:0x04a9, B:155:0x04b1, B:157:0x04b7, B:170:0x0502, B:172:0x050c, B:188:0x0552, B:205:0x042f, B:208:0x0430, B:209:0x0431, B:211:0x043e, B:214:0x0446, B:217:0x0454, B:219:0x045a, B:221:0x0465, B:223:0x0479, B:225:0x047a, B:226:0x047b, B:227:0x0488, B:230:0x0389, B:232:0x038a, B:233:0x038b, B:234:0x0398, B:237:0x03a2, B:240:0x03ab, B:242:0x03b1, B:244:0x03bc, B:246:0x03cc, B:248:0x03cd, B:249:0x03ce, B:250:0x03d6, B:254:0x0572, B:256:0x057f, B:258:0x058a, B:260:0x0590, B:261:0x059c, B:270:0x05d7, B:274:0x05f9, B:293:0x06e2, B:300:0x066a, B:302:0x0672, B:304:0x0689, B:308:0x0692, B:319:0x069d, B:312:0x06ab, B:311:0x06a2, B:299:0x0761, B:324:0x06c2, B:325:0x06c9, B:326:0x06d3, B:351:0x06fb, B:355:0x0707, B:358:0x0710, B:364:0x0723, B:366:0x0733, B:369:0x0743, B:371:0x0748, B:373:0x074c, B:374:0x0753, B:378:0x072a, B:388:0x0199, B:390:0x01a3, B:393:0x01ac, B:395:0x01b2, B:397:0x01bd, B:399:0x01c7, B:401:0x01c8, B:402:0x01c9, B:403:0x0111, B:405:0x011d, B:408:0x0129, B:411:0x012f, B:413:0x013c, B:422:0x015d, B:426:0x0161, B:427:0x0174, B:430:0x0184, B:435:0x017e, B:438:0x0183, B:449:0x0781, B:451:0x078d, B:452:0x0794, B:455:0x079c, B:458:0x07a0, B:460:0x07aa, B:462:0x07b4, B:465:0x07bb, B:466:0x07bc, B:469:0x07d0, B:472:0x07dd, B:479:0x07fc), top: B:2:0x0009, inners: #5, #11, #12, #14, #15 }] */
    /* JADX WARN: Type inference failed for: r51v1, types: [com.google.android.gms.internal.ads.Q3, java.lang.Throwable] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final C3864s a(byte[] bArr, int i, int i6) {
        String str;
        String str2;
        String str3;
        HashMap hashMap;
        HashMap hashMap2;
        ArrayDeque arrayDeque;
        M3 m32;
        int i9;
        ArrayDeque arrayDeque2;
        L3 l32;
        M3 m33;
        C0344t c0344t;
        int i10;
        boolean equals;
        HashMap hashMap3;
        boolean equals2;
        int i11;
        M3 m34;
        L3 l33;
        L3 l34;
        long j6;
        Object obj;
        char c9;
        String str4;
        String[] strArr;
        String str5;
        String str6;
        String str7;
        String str8;
        String v9;
        String str9;
        String str10;
        String str11;
        String str12;
        int i12;
        HashMap hashMap4;
        float f3;
        float f9;
        P3 p32;
        String v10;
        float f10;
        float f11;
        String v11;
        float f12;
        int i13;
        String v12;
        int i14;
        char c10;
        char c11;
        String v13;
        Q3 q32;
        String v14;
        Q3 q33;
        float f13;
        Q3 q34;
        String str13;
        String[] split;
        float f14;
        String group;
        int i15;
        boolean z3;
        String v15;
        String group2;
        C0344t c0344t2;
        int i16 = 1;
        String str14 = "";
        String str15 = "http://www.w3.org/ns/ttml#parameter";
        String str16 = "Ignoring unsupported tag: ";
        try {
            XmlPullParser newPullParser = this.f26400n.newPullParser();
            HashMap hashMap5 = new HashMap();
            HashMap hashMap6 = new HashMap();
            HashMap hashMap7 = new HashMap();
            hashMap6.put("", new P3("", -3.4028235E38f, -3.4028235E38f, Integer.MIN_VALUE, Integer.MIN_VALUE, -3.4028235E38f, -3.4028235E38f, Integer.MIN_VALUE, -3.4028235E38f, Integer.MIN_VALUE));
            Object obj2 = null;
            newPullParser.setInput(new ByteArrayInputStream(bArr, i, i6), null);
            ArrayDeque arrayDeque3 = new ArrayDeque();
            int eventType = newPullParser.getEventType();
            M3 m35 = f26393B;
            C3864s c3864s = null;
            M3 m36 = null;
            M3 m37 = m35;
            int i17 = 0;
            int i18 = 15;
            while (eventType != i16) {
                L3 l35 = (L3) arrayDeque3.peek();
                ?? r51 = obj2;
                if (i17 == 0) {
                    int i19 = 0;
                    String name = newPullParser.getName();
                    int i20 = i16;
                    if (eventType == 2) {
                        boolean equals3 = "tt".equals(name);
                        Pattern pattern = f26399z;
                        str = str14;
                        if (equals3) {
                            String attributeValue = newPullParser.getAttributeValue(str15, "frameRate");
                            int parseInt = attributeValue != null ? Integer.parseInt(attributeValue) : 30;
                            String attributeValue2 = newPullParser.getAttributeValue(str15, "frameRateMultiplier");
                            if (attributeValue2 != null) {
                                arrayDeque2 = arrayDeque3;
                                String str17 = AbstractC3159eu.f29993a;
                                l32 = l35;
                                AbstractC2772Sd.q("frameRateMultiplier doesn't have 2 parts", attributeValue2.split(" ", -1).length == 2 ? i20 : 0);
                                f14 = Integer.parseInt(r6[0]) / Integer.parseInt(r6[i20]);
                            } else {
                                arrayDeque2 = arrayDeque3;
                                l32 = l35;
                                f14 = 1.0f;
                            }
                            int i21 = m35.f26237b;
                            String attributeValue3 = newPullParser.getAttributeValue(str15, "subFrameRate");
                            if (attributeValue3 != null) {
                                i21 = Integer.parseInt(attributeValue3);
                            }
                            int i22 = m35.f26238c;
                            float f15 = f14;
                            String attributeValue4 = newPullParser.getAttributeValue(str15, "tickRate");
                            if (attributeValue4 != null) {
                                i22 = Integer.parseInt(attributeValue4);
                            }
                            M3 m38 = new M3(i21, i22, parseInt * f15);
                            String attributeValue5 = newPullParser.getAttributeValue(str15, "cellResolution");
                            if (attributeValue5 != null) {
                                Matcher matcher = f26392A.matcher(attributeValue5);
                                if (matcher.matches()) {
                                    str2 = str15;
                                    try {
                                        group = matcher.group(i20);
                                        try {
                                        } catch (NumberFormatException unused) {
                                            AbstractC2968bG.y("TtmlParser", "Ignoring malformed cell resolution: ".concat(attributeValue5));
                                            i18 = 15;
                                            v15 = AbstractC2639Kg.v(newPullParser, "extent");
                                            if (v15 != null) {
                                            }
                                            c0344t2 = r51;
                                            m33 = m36;
                                            c0344t = c0344t2;
                                            i10 = i18;
                                            equals = name.equals("tt");
                                            String str18 = d.c.f18635e;
                                            String str19 = "metadata";
                                            String str20 = "region";
                                            m37 = m33;
                                            String str21 = "head";
                                            hashMap3 = hashMap7;
                                            if (!equals) {
                                                String name2 = newPullParser.getName();
                                                StringBuilder sb = new StringBuilder(String.valueOf(name2).length() + 26);
                                                sb.append(str16);
                                                sb.append(name2);
                                                AbstractC2968bG.t("TtmlParser", sb.toString());
                                                str3 = str16;
                                                i18 = i10;
                                                hashMap = hashMap6;
                                                m36 = c0344t;
                                                arrayDeque = arrayDeque2;
                                                hashMap2 = hashMap3;
                                                i17 = 1;
                                                i9 = 1;
                                                newPullParser.next();
                                                eventType = newPullParser.getEventType();
                                                hashMap6 = hashMap;
                                                arrayDeque3 = arrayDeque;
                                                hashMap7 = hashMap2;
                                                i16 = i9;
                                                str14 = str;
                                                str15 = str2;
                                                m35 = m32;
                                                str16 = str3;
                                                obj2 = null;
                                            }
                                            equals2 = "head".equals(name);
                                            String str22 = "\\s+";
                                            if (equals2) {
                                            }
                                            m37 = m34;
                                            i18 = i11;
                                            m36 = c0344t;
                                            i9 = 1;
                                            newPullParser.next();
                                            eventType = newPullParser.getEventType();
                                            hashMap6 = hashMap;
                                            arrayDeque3 = arrayDeque;
                                            hashMap7 = hashMap2;
                                            i16 = i9;
                                            str14 = str;
                                            str15 = str2;
                                            m35 = m32;
                                            str16 = str3;
                                            obj2 = null;
                                        }
                                    } catch (NumberFormatException unused2) {
                                        m36 = m38;
                                    }
                                    if (group == null) {
                                        throw r51;
                                    }
                                    int parseInt2 = Integer.parseInt(group);
                                    String group3 = matcher.group(2);
                                    if (group3 == null) {
                                        throw r51;
                                    }
                                    int parseInt3 = Integer.parseInt(group3);
                                    if (parseInt2 == 0) {
                                        i15 = parseInt3;
                                        z3 = false;
                                    } else if (parseInt3 != 0) {
                                        i15 = parseInt3;
                                        z3 = true;
                                    } else {
                                        i15 = 0;
                                        z3 = false;
                                    }
                                    if (z3) {
                                        m36 = m38;
                                        m32 = m35;
                                        i18 = i15;
                                        v15 = AbstractC2639Kg.v(newPullParser, "extent");
                                        if (v15 != null) {
                                            Matcher matcher2 = pattern.matcher(v15);
                                            if (matcher2.matches()) {
                                                try {
                                                    group2 = matcher2.group(1);
                                                } catch (NumberFormatException unused3) {
                                                    AbstractC2968bG.y("TtmlParser", "Ignoring malformed tts extent: ".concat(v15));
                                                }
                                                if (group2 == null) {
                                                    throw r51;
                                                }
                                                int parseInt4 = Integer.parseInt(group2);
                                                String group4 = matcher2.group(2);
                                                if (group4 == null) {
                                                    throw r51;
                                                }
                                                c0344t2 = new C0344t(parseInt4, Integer.parseInt(group4));
                                                m33 = m36;
                                                c0344t = c0344t2;
                                            } else {
                                                AbstractC2968bG.y("TtmlParser", "Ignoring non-pixel tts extent: ".concat(v15));
                                            }
                                        }
                                        c0344t2 = r51;
                                        m33 = m36;
                                        c0344t = c0344t2;
                                    } else {
                                        m36 = m38;
                                        try {
                                            throw new IllegalArgumentException(AbstractC2639Kg.x("Invalid cell resolution %s %s", Integer.valueOf(parseInt2), Integer.valueOf(i15)));
                                        } catch (NumberFormatException unused4) {
                                            m32 = m35;
                                            AbstractC2968bG.y("TtmlParser", "Ignoring malformed cell resolution: ".concat(attributeValue5));
                                            i18 = 15;
                                            v15 = AbstractC2639Kg.v(newPullParser, "extent");
                                            if (v15 != null) {
                                            }
                                            c0344t2 = r51;
                                            m33 = m36;
                                            c0344t = c0344t2;
                                            i10 = i18;
                                            equals = name.equals("tt");
                                            String str182 = d.c.f18635e;
                                            String str192 = "metadata";
                                            String str202 = "region";
                                            m37 = m33;
                                            String str212 = "head";
                                            hashMap3 = hashMap7;
                                            if (!equals) {
                                            }
                                            equals2 = "head".equals(name);
                                            String str222 = "\\s+";
                                            if (equals2) {
                                            }
                                            m37 = m34;
                                            i18 = i11;
                                            m36 = c0344t;
                                            i9 = 1;
                                            newPullParser.next();
                                            eventType = newPullParser.getEventType();
                                            hashMap6 = hashMap;
                                            arrayDeque3 = arrayDeque;
                                            hashMap7 = hashMap2;
                                            i16 = i9;
                                            str14 = str;
                                            str15 = str2;
                                            m35 = m32;
                                            str16 = str3;
                                            obj2 = null;
                                        }
                                    }
                                } else {
                                    AbstractC2968bG.y("TtmlParser", "Ignoring malformed cell resolution: ".concat(attributeValue5));
                                }
                            }
                            str2 = str15;
                            m36 = m38;
                            m32 = m35;
                            i18 = 15;
                            v15 = AbstractC2639Kg.v(newPullParser, "extent");
                            if (v15 != null) {
                            }
                            c0344t2 = r51;
                            m33 = m36;
                            c0344t = c0344t2;
                        } else {
                            str2 = str15;
                            arrayDeque2 = arrayDeque3;
                            m32 = m35;
                            l32 = l35;
                            m33 = m37;
                            c0344t = m36;
                        }
                        i10 = i18;
                        equals = name.equals("tt");
                        String str1822 = d.c.f18635e;
                        String str1922 = "metadata";
                        String str2022 = "region";
                        m37 = m33;
                        String str2122 = "head";
                        hashMap3 = hashMap7;
                        if (!equals && !name.equals("head") && !name.equals("body") && !name.equals("div") && !name.equals("p") && !name.equals("span") && !name.equals("br") && !name.equals(com.anythink.expressad.foundation.h.k.f19634e) && !name.equals("styling") && !name.equals("layout") && !name.equals("region") && !name.equals("metadata") && !name.equals(d.c.f18635e) && !name.equals("data") && !name.equals("information")) {
                            String name22 = newPullParser.getName();
                            StringBuilder sb2 = new StringBuilder(String.valueOf(name22).length() + 26);
                            sb2.append(str16);
                            sb2.append(name22);
                            AbstractC2968bG.t("TtmlParser", sb2.toString());
                            str3 = str16;
                            i18 = i10;
                            hashMap = hashMap6;
                            m36 = c0344t;
                            arrayDeque = arrayDeque2;
                            hashMap2 = hashMap3;
                            i17 = 1;
                        }
                        equals2 = "head".equals(name);
                        String str2222 = "\\s+";
                        if (equals2) {
                            while (true) {
                                newPullParser.next();
                                if (AbstractC2639Kg.s(newPullParser, com.anythink.expressad.foundation.h.k.f19634e)) {
                                    String v16 = AbstractC2639Kg.v(newPullParser, com.anythink.expressad.foundation.h.k.f19634e);
                                    str3 = str16;
                                    Q3 b9 = b(newPullParser, new Q3());
                                    if (v16 != null) {
                                        String trim = v16.trim();
                                        if (trim.isEmpty()) {
                                            str13 = str2122;
                                            split = new String[i19];
                                        } else {
                                            str13 = str2122;
                                            String str23 = AbstractC3159eu.f29993a;
                                            split = trim.split(str2222, -1);
                                        }
                                        str5 = str2222;
                                        int i23 = 0;
                                        for (int length = split.length; i23 < length; length = length) {
                                            b9.d((Q3) hashMap5.get(split[i23]));
                                            i23++;
                                        }
                                    } else {
                                        str13 = str2122;
                                        str5 = str2222;
                                    }
                                    String e9 = b9.e();
                                    if (e9 != null) {
                                        hashMap5.put(e9, b9);
                                    }
                                    int i24 = i10;
                                    str8 = str1822;
                                    i11 = i24;
                                    hashMap = hashMap6;
                                    str6 = str1922;
                                    str7 = str2022;
                                    str2122 = str13;
                                    hashMap2 = hashMap3;
                                } else {
                                    String str24 = str2122;
                                    str3 = str16;
                                    str5 = str2222;
                                    if (AbstractC2639Kg.s(newPullParser, str2022)) {
                                        str7 = str2022;
                                        String str25 = str1822;
                                        String v17 = AbstractC2639Kg.v(newPullParser, "id");
                                        if (v17 == null) {
                                            p32 = r51;
                                            i11 = i10;
                                            hashMap4 = hashMap6;
                                            str11 = str1922;
                                        } else {
                                            String v18 = AbstractC2639Kg.v(newPullParser, "origin");
                                            if (v18 == null) {
                                                str9 = v18;
                                                String v19 = AbstractC2639Kg.v(newPullParser, com.anythink.expressad.foundation.h.k.f19634e);
                                                if (v19 != null && (q34 = (Q3) hashMap5.get(v19)) != null) {
                                                    str10 = q34.a();
                                                    str11 = str1922;
                                                    Pattern pattern2 = f26398y;
                                                    if (str10 == null) {
                                                        hashMap4 = hashMap6;
                                                        Matcher matcher3 = pattern2.matcher(str10);
                                                        i12 = i10;
                                                        Matcher matcher4 = pattern.matcher(str10);
                                                        if (matcher3.matches()) {
                                                            str12 = "Ignoring region with unsupported extent: ";
                                                            try {
                                                                String group5 = matcher3.group(1);
                                                                if (group5 == null) {
                                                                    throw r51;
                                                                }
                                                                f13 = Float.parseFloat(group5) / 100.0f;
                                                                String group6 = matcher3.group(2);
                                                                if (group6 == null) {
                                                                    throw r51;
                                                                }
                                                                f3 = Float.parseFloat(group6) / 100.0f;
                                                                f9 = f13;
                                                            } catch (NumberFormatException unused5) {
                                                                AbstractC2968bG.y("TtmlParser", "Ignoring region with malformed origin: ".concat(str10));
                                                            }
                                                        } else {
                                                            str12 = "Ignoring region with unsupported extent: ";
                                                            if (!matcher4.matches()) {
                                                                AbstractC2968bG.y("TtmlParser", "Ignoring region with unsupported origin: ".concat(str10));
                                                            } else if (c0344t == 0) {
                                                                AbstractC2968bG.y("TtmlParser", "Ignoring region with missing tts:extent: ".concat(str10));
                                                            } else {
                                                                try {
                                                                    String group7 = matcher4.group(1);
                                                                    if (group7 == null) {
                                                                        throw r51;
                                                                    }
                                                                    int parseInt5 = Integer.parseInt(group7);
                                                                    String group8 = matcher4.group(2);
                                                                    if (group8 == null) {
                                                                        throw r51;
                                                                    }
                                                                    f13 = parseInt5 / c0344t.f2133a;
                                                                    f3 = Integer.parseInt(group8) / c0344t.f2134b;
                                                                    f9 = f13;
                                                                } catch (NumberFormatException unused6) {
                                                                    AbstractC2968bG.y("TtmlParser", "Ignoring region with malformed origin: ".concat(str10));
                                                                }
                                                            }
                                                            p32 = r51;
                                                            i11 = i12;
                                                        }
                                                    } else {
                                                        str12 = "Ignoring region with unsupported extent: ";
                                                        i12 = i10;
                                                        hashMap4 = hashMap6;
                                                        f3 = 0.0f;
                                                        f9 = 0.0f;
                                                    }
                                                    v10 = AbstractC2639Kg.v(newPullParser, "extent");
                                                    if (v10 == null && (v14 = AbstractC2639Kg.v(newPullParser, com.anythink.expressad.foundation.h.k.f19634e)) != null && (q33 = (Q3) hashMap5.get(v14)) != null) {
                                                        v10 = q33.b();
                                                    }
                                                    if (v10 == null) {
                                                        Matcher matcher5 = pattern2.matcher(v10);
                                                        Matcher matcher6 = pattern.matcher(v10);
                                                        if (matcher5.matches()) {
                                                            try {
                                                                String group9 = matcher5.group(1);
                                                                if (group9 == null) {
                                                                    throw r51;
                                                                }
                                                                float parseFloat = Float.parseFloat(group9) / 100.0f;
                                                                String group10 = matcher5.group(2);
                                                                if (group10 == null) {
                                                                    throw r51;
                                                                }
                                                                f10 = parseFloat;
                                                                f11 = Float.parseFloat(group10) / 100.0f;
                                                            } catch (NumberFormatException unused7) {
                                                                AbstractC2968bG.y("TtmlParser", "Ignoring region with malformed extent: ".concat(String.valueOf(str10)));
                                                            }
                                                        } else {
                                                            if (!matcher6.matches()) {
                                                                AbstractC2968bG.y("TtmlParser", str12.concat(String.valueOf(str10)));
                                                            } else if (c0344t == 0) {
                                                                AbstractC2968bG.y("TtmlParser", "Ignoring region with missing tts:extent: ".concat(String.valueOf(str10)));
                                                            } else {
                                                                try {
                                                                    String group11 = matcher6.group(1);
                                                                    if (group11 == null) {
                                                                        throw r51;
                                                                    }
                                                                    int parseInt6 = Integer.parseInt(group11);
                                                                    String group12 = matcher6.group(2);
                                                                    if (group12 == null) {
                                                                        throw r51;
                                                                    }
                                                                    f11 = Integer.parseInt(group12) / c0344t.f2134b;
                                                                    f10 = parseInt6 / c0344t.f2133a;
                                                                } catch (NumberFormatException unused8) {
                                                                    AbstractC2968bG.y("TtmlParser", "Ignoring region with malformed extent: ".concat(String.valueOf(str10)));
                                                                }
                                                            }
                                                            p32 = r51;
                                                            i11 = i12;
                                                        }
                                                    } else {
                                                        f10 = 1.0f;
                                                        f11 = 1.0f;
                                                    }
                                                    v11 = AbstractC2639Kg.v(newPullParser, "displayAlign");
                                                    if (v11 == null && (v13 = AbstractC2639Kg.v(newPullParser, com.anythink.expressad.foundation.h.k.f19634e)) != null && (q32 = (Q3) hashMap5.get(v13)) != null) {
                                                        v11 = q32.c();
                                                    }
                                                    if (v11 != null) {
                                                        String f16 = AbstractC3043cl.f(v11);
                                                        int hashCode = f16.hashCode();
                                                        if (hashCode != -1364013995) {
                                                            if (hashCode == 92734940 && f16.equals("after")) {
                                                                c11 = 1;
                                                                if (c11 != 0) {
                                                                    f12 = f3 + (f11 / 2.0f);
                                                                    i11 = i12;
                                                                    i13 = 1;
                                                                } else if (c11 == 1) {
                                                                    f12 = f3 + f11;
                                                                    i11 = i12;
                                                                    i13 = 2;
                                                                }
                                                                float f17 = 1.0f / i11;
                                                                v12 = AbstractC2639Kg.v(newPullParser, "writingMode");
                                                                if (v12 != null) {
                                                                    String f18 = AbstractC3043cl.f(v12);
                                                                    int hashCode2 = f18.hashCode();
                                                                    if (hashCode2 == 3694) {
                                                                        if (f18.equals("tb")) {
                                                                            c10 = 0;
                                                                            if (c10 != 0) {
                                                                            }
                                                                            i14 = 2;
                                                                            p32 = new P3(v17, f9, f12, 0, i13, f10, f11, 1, f17, i14);
                                                                        }
                                                                        c10 = 65535;
                                                                        if (c10 != 0) {
                                                                        }
                                                                        i14 = 2;
                                                                        p32 = new P3(v17, f9, f12, 0, i13, f10, f11, 1, f17, i14);
                                                                    } else if (hashCode2 != 3553396) {
                                                                        if (hashCode2 == 3553576 && f18.equals("tbrl")) {
                                                                            c10 = 2;
                                                                            if (c10 != 0 || c10 == 1) {
                                                                                i14 = 2;
                                                                            } else if (c10 == 2) {
                                                                                i14 = 1;
                                                                            }
                                                                            p32 = new P3(v17, f9, f12, 0, i13, f10, f11, 1, f17, i14);
                                                                        }
                                                                        c10 = 65535;
                                                                        if (c10 != 0) {
                                                                        }
                                                                        i14 = 2;
                                                                        p32 = new P3(v17, f9, f12, 0, i13, f10, f11, 1, f17, i14);
                                                                    } else {
                                                                        if (f18.equals("tblr")) {
                                                                            c10 = 1;
                                                                            if (c10 != 0) {
                                                                            }
                                                                            i14 = 2;
                                                                            p32 = new P3(v17, f9, f12, 0, i13, f10, f11, 1, f17, i14);
                                                                        }
                                                                        c10 = 65535;
                                                                        if (c10 != 0) {
                                                                        }
                                                                        i14 = 2;
                                                                        p32 = new P3(v17, f9, f12, 0, i13, f10, f11, 1, f17, i14);
                                                                    }
                                                                }
                                                                i14 = Integer.MIN_VALUE;
                                                                p32 = new P3(v17, f9, f12, 0, i13, f10, f11, 1, f17, i14);
                                                            }
                                                            c11 = 65535;
                                                            if (c11 != 0) {
                                                            }
                                                            float f172 = 1.0f / i11;
                                                            v12 = AbstractC2639Kg.v(newPullParser, "writingMode");
                                                            if (v12 != null) {
                                                            }
                                                            i14 = Integer.MIN_VALUE;
                                                            p32 = new P3(v17, f9, f12, 0, i13, f10, f11, 1, f172, i14);
                                                        } else {
                                                            if (f16.equals("center")) {
                                                                c11 = 0;
                                                                if (c11 != 0) {
                                                                }
                                                                float f1722 = 1.0f / i11;
                                                                v12 = AbstractC2639Kg.v(newPullParser, "writingMode");
                                                                if (v12 != null) {
                                                                }
                                                                i14 = Integer.MIN_VALUE;
                                                                p32 = new P3(v17, f9, f12, 0, i13, f10, f11, 1, f1722, i14);
                                                            }
                                                            c11 = 65535;
                                                            if (c11 != 0) {
                                                            }
                                                            float f17222 = 1.0f / i11;
                                                            v12 = AbstractC2639Kg.v(newPullParser, "writingMode");
                                                            if (v12 != null) {
                                                            }
                                                            i14 = Integer.MIN_VALUE;
                                                            p32 = new P3(v17, f9, f12, 0, i13, f10, f11, 1, f17222, i14);
                                                        }
                                                    }
                                                    f12 = f3;
                                                    i11 = i12;
                                                    i13 = 0;
                                                    float f172222 = 1.0f / i11;
                                                    v12 = AbstractC2639Kg.v(newPullParser, "writingMode");
                                                    if (v12 != null) {
                                                    }
                                                    i14 = Integer.MIN_VALUE;
                                                    p32 = new P3(v17, f9, f12, 0, i13, f10, f11, 1, f172222, i14);
                                                }
                                            } else {
                                                str9 = v18;
                                            }
                                            str10 = str9;
                                            str11 = str1922;
                                            Pattern pattern22 = f26398y;
                                            if (str10 == null) {
                                            }
                                            v10 = AbstractC2639Kg.v(newPullParser, "extent");
                                            if (v10 == null) {
                                                v10 = q33.b();
                                            }
                                            if (v10 == null) {
                                            }
                                            v11 = AbstractC2639Kg.v(newPullParser, "displayAlign");
                                            if (v11 == null) {
                                                v11 = q32.c();
                                            }
                                            if (v11 != null) {
                                            }
                                            f12 = f3;
                                            i11 = i12;
                                            i13 = 0;
                                            float f1722222 = 1.0f / i11;
                                            v12 = AbstractC2639Kg.v(newPullParser, "writingMode");
                                            if (v12 != null) {
                                            }
                                            i14 = Integer.MIN_VALUE;
                                            p32 = new P3(v17, f9, f12, 0, i13, f10, f11, 1, f1722222, i14);
                                        }
                                        if (p32 != null) {
                                            hashMap = hashMap4;
                                            hashMap.put(p32.f26729a, p32);
                                        } else {
                                            hashMap = hashMap4;
                                        }
                                        str2122 = str24;
                                        hashMap2 = hashMap3;
                                        str8 = str25;
                                        str6 = str11;
                                    } else {
                                        String str26 = str1822;
                                        i11 = i10;
                                        hashMap = hashMap6;
                                        str6 = str1922;
                                        str7 = str2022;
                                        if (AbstractC2639Kg.s(newPullParser, str6)) {
                                            while (true) {
                                                newPullParser.next();
                                                str8 = str26;
                                                if (!AbstractC2639Kg.s(newPullParser, str8) || (v9 = AbstractC2639Kg.v(newPullParser, "id")) == null) {
                                                    hashMap2 = hashMap3;
                                                } else {
                                                    hashMap2 = hashMap3;
                                                    hashMap2.put(v9, newPullParser.nextText());
                                                }
                                                if (!AbstractC2639Kg.l(newPullParser, str6)) {
                                                    str26 = str8;
                                                    hashMap3 = hashMap2;
                                                }
                                            }
                                        } else {
                                            hashMap2 = hashMap3;
                                            str8 = str26;
                                        }
                                        str2122 = str24;
                                    }
                                }
                                if (AbstractC2639Kg.l(newPullParser, str2122)) {
                                    m34 = m37;
                                    arrayDeque = arrayDeque2;
                                } else {
                                    String str27 = str8;
                                    i10 = i11;
                                    str1822 = str27;
                                    str1922 = str6;
                                    hashMap6 = hashMap;
                                    hashMap3 = hashMap2;
                                    str2222 = str5;
                                    str16 = str3;
                                    str2022 = str7;
                                    i19 = 0;
                                }
                            }
                        } else {
                            str3 = str16;
                            i11 = i10;
                            hashMap = hashMap6;
                            String str28 = "\\s+";
                            Object obj3 = "region";
                            hashMap2 = hashMap3;
                            try {
                                int attributeCount = newPullParser.getAttributeCount();
                                Q3 b10 = b(newPullParser, r51);
                                String str29 = str;
                                int i25 = 0;
                                long j9 = com.anythink.basead.exoplayer.b.f6382b;
                                long j10 = com.anythink.basead.exoplayer.b.f6382b;
                                String[] strArr2 = null;
                                String str30 = null;
                                long j11 = com.anythink.basead.exoplayer.b.f6382b;
                                while (i25 < attributeCount) {
                                    try {
                                        String attributeName = newPullParser.getAttributeName(i25);
                                        String attributeValue6 = newPullParser.getAttributeValue(i25);
                                        switch (attributeName.hashCode()) {
                                            case -934795532:
                                                obj = obj3;
                                                if (attributeName.equals(obj)) {
                                                    c9 = 4;
                                                    break;
                                                }
                                                c9 = 65535;
                                                break;
                                            case 99841:
                                                if (attributeName.equals("dur")) {
                                                    obj = obj3;
                                                    c9 = 2;
                                                    break;
                                                }
                                                obj = obj3;
                                                c9 = 65535;
                                                break;
                                            case 100571:
                                                if (attributeName.equals("end")) {
                                                    obj = obj3;
                                                    c9 = 1;
                                                    break;
                                                }
                                                obj = obj3;
                                                c9 = 65535;
                                                break;
                                            case 93616297:
                                                if (attributeName.equals("begin")) {
                                                    obj = obj3;
                                                    c9 = 0;
                                                    break;
                                                }
                                                obj = obj3;
                                                c9 = 65535;
                                                break;
                                            case 109780401:
                                                if (attributeName.equals(com.anythink.expressad.foundation.h.k.f19634e)) {
                                                    obj = obj3;
                                                    c9 = 3;
                                                    break;
                                                }
                                                obj = obj3;
                                                c9 = 65535;
                                                break;
                                            case 1292595405:
                                                if (attributeName.equals("backgroundImage")) {
                                                    c9 = 5;
                                                    obj = obj3;
                                                    break;
                                                }
                                                obj = obj3;
                                                c9 = 65535;
                                                break;
                                            default:
                                                obj = obj3;
                                                c9 = 65535;
                                                break;
                                        }
                                        if (c9 == 0) {
                                            m34 = m37;
                                            str4 = str28;
                                            j10 = e(attributeValue6, m34);
                                        } else if (c9 == 1) {
                                            m34 = m37;
                                            str4 = str28;
                                            j9 = e(attributeValue6, m34);
                                        } else if (c9 != 2) {
                                            if (c9 == 3) {
                                                try {
                                                    String trim2 = attributeValue6.trim();
                                                    if (trim2.isEmpty()) {
                                                        try {
                                                            strArr = new String[0];
                                                            str4 = str28;
                                                        } catch (C3761q3 e10) {
                                                            e = e10;
                                                            m34 = m37;
                                                            arrayDeque = arrayDeque2;
                                                            AbstractC2968bG.C("TtmlParser", "Suppressing parser error", e);
                                                            m37 = m34;
                                                            i18 = i11;
                                                            m36 = c0344t;
                                                            i17 = 1;
                                                            i9 = 1;
                                                            newPullParser.next();
                                                            eventType = newPullParser.getEventType();
                                                            hashMap6 = hashMap;
                                                            arrayDeque3 = arrayDeque;
                                                            hashMap7 = hashMap2;
                                                            i16 = i9;
                                                            str14 = str;
                                                            str15 = str2;
                                                            m35 = m32;
                                                            str16 = str3;
                                                            obj2 = null;
                                                        }
                                                    } else {
                                                        String str31 = AbstractC3159eu.f29993a;
                                                        str4 = str28;
                                                        strArr = trim2.split(str4, -1);
                                                    }
                                                    if (strArr.length > 0) {
                                                        strArr2 = strArr;
                                                    }
                                                } catch (C3761q3 e11) {
                                                    e = e11;
                                                }
                                            } else if (c9 != 4) {
                                                if (c9 == 5 && attributeValue6.startsWith("#")) {
                                                    str30 = attributeValue6.substring(1);
                                                    m34 = m37;
                                                    str4 = str28;
                                                }
                                                str4 = str28;
                                            } else {
                                                if (hashMap.containsKey(attributeValue6)) {
                                                    str29 = attributeValue6;
                                                    m34 = m37;
                                                    str4 = str28;
                                                }
                                                str4 = str28;
                                            }
                                            m34 = m37;
                                        } else {
                                            m34 = m37;
                                            str4 = str28;
                                            j11 = e(attributeValue6, m34);
                                        }
                                        try {
                                            i25++;
                                            m37 = m34;
                                            obj3 = obj;
                                            str28 = str4;
                                        } catch (C3761q3 e12) {
                                            e = e12;
                                            arrayDeque = arrayDeque2;
                                            AbstractC2968bG.C("TtmlParser", "Suppressing parser error", e);
                                            m37 = m34;
                                            i18 = i11;
                                            m36 = c0344t;
                                            i17 = 1;
                                            i9 = 1;
                                            newPullParser.next();
                                            eventType = newPullParser.getEventType();
                                            hashMap6 = hashMap;
                                            arrayDeque3 = arrayDeque;
                                            hashMap7 = hashMap2;
                                            i16 = i9;
                                            str14 = str;
                                            str15 = str2;
                                            m35 = m32;
                                            str16 = str3;
                                            obj2 = null;
                                        }
                                    } catch (C3761q3 e13) {
                                        e = e13;
                                        m34 = m37;
                                    }
                                }
                                m34 = m37;
                                long j12 = com.anythink.basead.exoplayer.b.f6382b;
                                if (l32 != null) {
                                    l33 = l32;
                                    long j13 = l33.f26049d;
                                    if (j13 != com.anythink.basead.exoplayer.b.f6382b) {
                                        j10 = j10 != com.anythink.basead.exoplayer.b.f6382b ? j10 + j13 : -9223372036854775807L;
                                        if (j9 != com.anythink.basead.exoplayer.b.f6382b) {
                                            j9 += j13;
                                        } else {
                                            l34 = l33;
                                            j9 = -9223372036854775807L;
                                        }
                                    }
                                    l34 = l33;
                                } else {
                                    l33 = l32;
                                    l34 = null;
                                }
                                if (j9 == com.anythink.basead.exoplayer.b.f6382b) {
                                    if (j11 != com.anythink.basead.exoplayer.b.f6382b) {
                                        j6 = j10 + j11;
                                    } else if (l34 != null) {
                                        j6 = l34.f26050e;
                                        if (j6 != com.anythink.basead.exoplayer.b.f6382b) {
                                        }
                                    }
                                    j12 = j6;
                                } else {
                                    j12 = j9;
                                }
                                L3 b11 = L3.b(newPullParser.getName(), j10, j12, b10, strArr2, str29, str30, l34);
                                arrayDeque = arrayDeque2;
                                try {
                                    arrayDeque.push(b11);
                                    if (l33 != null) {
                                        if (l33.f26057m == null) {
                                            l33.f26057m = new ArrayList();
                                        }
                                        l33.f26057m.add(b11);
                                    }
                                } catch (C3761q3 e14) {
                                    e = e14;
                                    AbstractC2968bG.C("TtmlParser", "Suppressing parser error", e);
                                    m37 = m34;
                                    i18 = i11;
                                    m36 = c0344t;
                                    i17 = 1;
                                    i9 = 1;
                                    newPullParser.next();
                                    eventType = newPullParser.getEventType();
                                    hashMap6 = hashMap;
                                    arrayDeque3 = arrayDeque;
                                    hashMap7 = hashMap2;
                                    i16 = i9;
                                    str14 = str;
                                    str15 = str2;
                                    m35 = m32;
                                    str16 = str3;
                                    obj2 = null;
                                }
                            } catch (C3761q3 e15) {
                                e = e15;
                                m34 = m37;
                                arrayDeque = arrayDeque2;
                            }
                        }
                        m37 = m34;
                        i18 = i11;
                        m36 = c0344t;
                    } else {
                        str = str14;
                        str2 = str15;
                        str3 = str16;
                        hashMap = hashMap6;
                        hashMap2 = hashMap7;
                        arrayDeque = arrayDeque3;
                        m32 = m35;
                        if (eventType == 4) {
                            if (l35 == null) {
                                throw null;
                            }
                            L3 a9 = L3.a(newPullParser.getText());
                            if (l35.f26057m == null) {
                                l35.f26057m = new ArrayList();
                            }
                            l35.f26057m.add(a9);
                        } else if (eventType == 3) {
                            if (newPullParser.getName().equals("tt")) {
                                L3 l36 = (L3) arrayDeque.peek();
                                if (l36 == null) {
                                    throw null;
                                }
                                c3864s = new C3864s(l36, hashMap5, hashMap, hashMap2);
                            }
                            arrayDeque.pop();
                        }
                    }
                    i9 = 1;
                } else {
                    str = str14;
                    str2 = str15;
                    str3 = str16;
                    hashMap = hashMap6;
                    hashMap2 = hashMap7;
                    arrayDeque = arrayDeque3;
                    m32 = m35;
                    if (eventType == 2) {
                        i9 = 1;
                        i17++;
                    } else {
                        i9 = 1;
                        if (eventType == 3) {
                            i17--;
                        }
                        newPullParser.next();
                        eventType = newPullParser.getEventType();
                        hashMap6 = hashMap;
                        arrayDeque3 = arrayDeque;
                        hashMap7 = hashMap2;
                        i16 = i9;
                        str14 = str;
                        str15 = str2;
                        m35 = m32;
                        str16 = str3;
                        obj2 = null;
                    }
                }
                newPullParser.next();
                eventType = newPullParser.getEventType();
                hashMap6 = hashMap;
                arrayDeque3 = arrayDeque;
                hashMap7 = hashMap2;
                i16 = i9;
                str14 = str;
                str15 = str2;
                m35 = m32;
                str16 = str3;
                obj2 = null;
            }
            if (c3864s != null) {
                return c3864s;
            }
            throw null;
        } catch (IOException e16) {
            throw new IllegalStateException("Unexpected error when reading input.", e16);
        } catch (XmlPullParserException e17) {
            throw new IllegalStateException("Unable to decode source", e17);
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3868s3
    public final void h(byte[] bArr, int i, int i6, X1.b bVar) {
        MA.h(a(bArr, i, i6), bVar);
    }
}
