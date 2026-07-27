package com.google.android.gms.internal.ads;

import android.graphics.Color;
import android.text.SpannableStringBuilder;
import android.text.SpannedString;
import android.text.TextUtils;
import android.text.style.AbsoluteSizeSpan;
import android.text.style.BackgroundColorSpan;
import android.text.style.ForegroundColorSpan;
import android.text.style.RelativeSizeSpan;
import android.text.style.StyleSpan;
import android.text.style.TypefaceSpan;
import android.text.style.UnderlineSpan;
import com.anythink.basead.webtemplet.a.b;
import java.nio.charset.StandardCharsets;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* renamed from: com.google.android.gms.internal.ads.b4, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public abstract class AbstractC2956b4 {

    /* renamed from: a, reason: collision with root package name */
    public static final Pattern f29205a = Pattern.compile("^(\\S+)\\s+-->\\s+(\\S+)((?:.|\\f)*+)?$");

    /* renamed from: b, reason: collision with root package name */
    public static final Pattern f29206b = Pattern.compile("(\\S+?):(\\S+)");

    /* renamed from: c, reason: collision with root package name */
    public static final Map f29207c;

    /* renamed from: d, reason: collision with root package name */
    public static final Map f29208d;

    static {
        HashMap hashMap = new HashMap();
        hashMap.put("white", Integer.valueOf(Color.rgb(com.anythink.basead.exoplayer.k.p.f8473b, com.anythink.basead.exoplayer.k.p.f8473b, com.anythink.basead.exoplayer.k.p.f8473b)));
        hashMap.put("lime", Integer.valueOf(Color.rgb(0, com.anythink.basead.exoplayer.k.p.f8473b, 0)));
        hashMap.put("cyan", Integer.valueOf(Color.rgb(0, com.anythink.basead.exoplayer.k.p.f8473b, com.anythink.basead.exoplayer.k.p.f8473b)));
        hashMap.put("red", Integer.valueOf(Color.rgb(com.anythink.basead.exoplayer.k.p.f8473b, 0, 0)));
        hashMap.put("yellow", Integer.valueOf(Color.rgb(com.anythink.basead.exoplayer.k.p.f8473b, com.anythink.basead.exoplayer.k.p.f8473b, 0)));
        hashMap.put("magenta", Integer.valueOf(Color.rgb(com.anythink.basead.exoplayer.k.p.f8473b, 0, com.anythink.basead.exoplayer.k.p.f8473b)));
        hashMap.put("blue", Integer.valueOf(Color.rgb(0, 0, com.anythink.basead.exoplayer.k.p.f8473b)));
        hashMap.put("black", Integer.valueOf(Color.rgb(0, 0, 0)));
        f29207c = Collections.unmodifiableMap(hashMap);
        HashMap hashMap2 = new HashMap();
        hashMap2.put("bg_white", Integer.valueOf(Color.rgb(com.anythink.basead.exoplayer.k.p.f8473b, com.anythink.basead.exoplayer.k.p.f8473b, com.anythink.basead.exoplayer.k.p.f8473b)));
        hashMap2.put("bg_lime", Integer.valueOf(Color.rgb(0, com.anythink.basead.exoplayer.k.p.f8473b, 0)));
        hashMap2.put("bg_cyan", Integer.valueOf(Color.rgb(0, com.anythink.basead.exoplayer.k.p.f8473b, com.anythink.basead.exoplayer.k.p.f8473b)));
        hashMap2.put("bg_red", Integer.valueOf(Color.rgb(com.anythink.basead.exoplayer.k.p.f8473b, 0, 0)));
        hashMap2.put("bg_yellow", Integer.valueOf(Color.rgb(com.anythink.basead.exoplayer.k.p.f8473b, com.anythink.basead.exoplayer.k.p.f8473b, 0)));
        hashMap2.put("bg_magenta", Integer.valueOf(Color.rgb(com.anythink.basead.exoplayer.k.p.f8473b, 0, com.anythink.basead.exoplayer.k.p.f8473b)));
        hashMap2.put("bg_blue", Integer.valueOf(Color.rgb(0, 0, com.anythink.basead.exoplayer.k.p.f8473b)));
        hashMap2.put("bg_black", Integer.valueOf(Color.rgb(0, 0, 0)));
        f29208d = Collections.unmodifiableMap(hashMap2);
    }

    /* JADX WARN: Removed duplicated region for block: B:114:0x0224  */
    /* JADX WARN: Removed duplicated region for block: B:122:0x0261  */
    /* JADX WARN: Removed duplicated region for block: B:127:0x025c  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x00a2 A[FALL_THROUGH] */
    /* JADX WARN: Removed duplicated region for block: B:50:0x013c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static SpannedString a(String str, String str2, List list) {
        int i;
        int i6;
        int i9;
        int i10 = -1;
        int i11 = 1;
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        ArrayDeque arrayDeque = new ArrayDeque();
        ArrayList arrayList = new ArrayList();
        int i12 = 0;
        int i13 = 0;
        while (true) {
            String str3 = "";
            if (i13 >= str2.length()) {
                while (!arrayDeque.isEmpty()) {
                    d(str, (Y3) arrayDeque.pop(), arrayList, spannableStringBuilder, list);
                }
                d(str, new Y3("", i12, "", Collections.EMPTY_SET), Collections.EMPTY_LIST, spannableStringBuilder, list);
                return SpannedString.valueOf(spannableStringBuilder);
            }
            int i14 = i13 + 1;
            char charAt = str2.charAt(i13);
            int i15 = i11;
            int i16 = i12;
            if (charAt == '&') {
                int indexOf = str2.indexOf(59, i14);
                int indexOf2 = str2.indexOf(32, i14);
                if (indexOf == -1) {
                    indexOf = indexOf2;
                } else if (indexOf2 != -1) {
                    indexOf = Math.min(indexOf, indexOf2);
                }
                if (indexOf != -1) {
                    String substring = str2.substring(i14, indexOf);
                    int hashCode = substring.hashCode();
                    if (hashCode == 3309) {
                        if (substring.equals("gt")) {
                            i = i15;
                            if (i != 0) {
                            }
                            if (indexOf == indexOf2) {
                            }
                            i15 = 1;
                            i13 = indexOf + 1;
                            i11 = i15;
                            i12 = i16;
                            i10 = -1;
                        }
                        i = -1;
                        if (i != 0) {
                        }
                        if (indexOf == indexOf2) {
                        }
                        i15 = 1;
                        i13 = indexOf + 1;
                        i11 = i15;
                        i12 = i16;
                        i10 = -1;
                    } else if (hashCode == 3464) {
                        if (substring.equals("lt")) {
                            i = i16;
                            if (i != 0) {
                            }
                            if (indexOf == indexOf2) {
                            }
                            i15 = 1;
                            i13 = indexOf + 1;
                            i11 = i15;
                            i12 = i16;
                            i10 = -1;
                        }
                        i = -1;
                        if (i != 0) {
                        }
                        if (indexOf == indexOf2) {
                        }
                        i15 = 1;
                        i13 = indexOf + 1;
                        i11 = i15;
                        i12 = i16;
                        i10 = -1;
                    } else if (hashCode != 96708) {
                        if (hashCode == 3374865 && substring.equals("nbsp")) {
                            i = 2;
                            if (i != 0) {
                                spannableStringBuilder.append('<');
                            } else if (i == i15) {
                                spannableStringBuilder.append('>');
                            } else if (i == 2) {
                                spannableStringBuilder.append(' ');
                            } else if (i != 3) {
                                StringBuilder sb = new StringBuilder(substring.length() + 33);
                                sb.append("ignoring unsupported entity: '&");
                                sb.append(substring);
                                sb.append(";'");
                                AbstractC2968bG.y("WebvttCueParser", sb.toString());
                            } else {
                                spannableStringBuilder.append('&');
                            }
                            if (indexOf == indexOf2) {
                                spannableStringBuilder.append((CharSequence) " ");
                            }
                            i15 = 1;
                            i13 = indexOf + 1;
                            i11 = i15;
                            i12 = i16;
                            i10 = -1;
                        }
                        i = -1;
                        if (i != 0) {
                        }
                        if (indexOf == indexOf2) {
                        }
                        i15 = 1;
                        i13 = indexOf + 1;
                        i11 = i15;
                        i12 = i16;
                        i10 = -1;
                    } else {
                        if (substring.equals("amp")) {
                            i = 3;
                            if (i != 0) {
                            }
                            if (indexOf == indexOf2) {
                            }
                            i15 = 1;
                            i13 = indexOf + 1;
                            i11 = i15;
                            i12 = i16;
                            i10 = -1;
                        }
                        i = -1;
                        if (i != 0) {
                        }
                        if (indexOf == indexOf2) {
                        }
                        i15 = 1;
                        i13 = indexOf + 1;
                        i11 = i15;
                        i12 = i16;
                        i10 = -1;
                    }
                } else {
                    spannableStringBuilder.append(charAt);
                }
            } else if (charAt != '<') {
                spannableStringBuilder.append(charAt);
            } else if (i14 < str2.length()) {
                char charAt2 = str2.charAt(i14);
                int indexOf3 = str2.indexOf(62, i14);
                int length = indexOf3 == i10 ? str2.length() : indexOf3 + 1;
                int i17 = length - 2;
                int i18 = str2.charAt(i17) == '/' ? i15 : i16;
                int i19 = i13 + (charAt2 == '/' ? 2 : i15);
                if (i18 == 0) {
                    i17 = length - 1;
                }
                String substring2 = str2.substring(i19, i17);
                if (!substring2.trim().isEmpty()) {
                    String trim = substring2.trim();
                    AbstractC2772Sd.i(!trim.isEmpty());
                    String str4 = AbstractC3159eu.f29993a;
                    String str5 = trim.split("[ \\.]", 2)[i16];
                    int hashCode2 = str5.hashCode();
                    if (hashCode2 == 98) {
                        if (str5.equals("b")) {
                            i6 = i16;
                            switch (i6) {
                            }
                            i13 = length;
                            i12 = i9;
                            i11 = i15;
                        }
                        i6 = -1;
                        switch (i6) {
                        }
                        i13 = length;
                        i12 = i9;
                        i11 = i15;
                    } else if (hashCode2 == 99) {
                        if (str5.equals("c")) {
                            i6 = i15;
                            switch (i6) {
                            }
                            i13 = length;
                            i12 = i9;
                            i11 = i15;
                        }
                        i6 = -1;
                        switch (i6) {
                        }
                        i13 = length;
                        i12 = i9;
                        i11 = i15;
                    } else if (hashCode2 == 105) {
                        if (str5.equals("i")) {
                            i6 = 2;
                            switch (i6) {
                            }
                            i13 = length;
                            i12 = i9;
                            i11 = i15;
                        }
                        i6 = -1;
                        switch (i6) {
                        }
                        i13 = length;
                        i12 = i9;
                        i11 = i15;
                    } else if (hashCode2 == 3650) {
                        if (str5.equals("rt")) {
                            i6 = 5;
                            switch (i6) {
                            }
                            i13 = length;
                            i12 = i9;
                            i11 = i15;
                        }
                        i6 = -1;
                        switch (i6) {
                        }
                        i13 = length;
                        i12 = i9;
                        i11 = i15;
                    } else if (hashCode2 == 3314158) {
                        if (str5.equals(b.c.f11442j)) {
                            i6 = 3;
                            switch (i6) {
                            }
                            i13 = length;
                            i12 = i9;
                            i11 = i15;
                        }
                        i6 = -1;
                        switch (i6) {
                        }
                        i13 = length;
                        i12 = i9;
                        i11 = i15;
                    } else if (hashCode2 == 3511770) {
                        if (str5.equals("ruby")) {
                            i6 = 4;
                            switch (i6) {
                            }
                            i13 = length;
                            i12 = i9;
                            i11 = i15;
                        }
                        i6 = -1;
                        switch (i6) {
                        }
                        i13 = length;
                        i12 = i9;
                        i11 = i15;
                    } else if (hashCode2 != 117) {
                        if (hashCode2 == 118 && str5.equals("v")) {
                            i6 = 7;
                            switch (i6) {
                                case 0:
                                case 1:
                                case 2:
                                case 3:
                                case 4:
                                case 5:
                                case 6:
                                case 7:
                                    if (charAt2 == '/') {
                                        while (!arrayDeque.isEmpty()) {
                                            Y3 y32 = (Y3) arrayDeque.pop();
                                            d(str, y32, arrayList, spannableStringBuilder, list);
                                            if (arrayDeque.isEmpty()) {
                                                arrayList.clear();
                                            } else {
                                                arrayList.add(new X3(y32, spannableStringBuilder.length()));
                                            }
                                            if (y32.f28649a.equals(str5)) {
                                            }
                                        }
                                    } else if (i18 == 0) {
                                        int length2 = spannableStringBuilder.length();
                                        String trim2 = substring2.trim();
                                        AbstractC2772Sd.i(!trim2.isEmpty());
                                        int indexOf4 = trim2.indexOf(" ");
                                        if (indexOf4 == -1) {
                                            i9 = i16;
                                        } else {
                                            str3 = trim2.substring(indexOf4).trim();
                                            i9 = i16;
                                            trim2 = trim2.substring(i9, indexOf4);
                                        }
                                        String[] split = trim2.split("\\.", -1);
                                        String str6 = split[i9];
                                        HashSet hashSet = new HashSet();
                                        for (int i20 = i15; i20 < split.length; i20++) {
                                            hashSet.add(split[i20]);
                                        }
                                        arrayDeque.push(new Y3(str6, length2, str3, hashSet));
                                        break;
                                    }
                                default:
                                    i9 = i16;
                                    break;
                            }
                            i13 = length;
                            i12 = i9;
                            i11 = i15;
                        }
                        i6 = -1;
                        switch (i6) {
                        }
                        i13 = length;
                        i12 = i9;
                        i11 = i15;
                    } else {
                        if (str5.equals("u")) {
                            i6 = 6;
                            switch (i6) {
                            }
                            i13 = length;
                            i12 = i9;
                            i11 = i15;
                        }
                        i6 = -1;
                        switch (i6) {
                        }
                        i13 = length;
                        i12 = i9;
                        i11 = i15;
                    }
                    i10 = -1;
                }
                i9 = i16;
                i13 = length;
                i12 = i9;
                i11 = i15;
                i10 = -1;
            }
            i13 = i14;
            i11 = i15;
            i12 = i16;
            i10 = -1;
        }
    }

    public static W3 b(String str, Matcher matcher, Cr cr, ArrayList arrayList) {
        C2902a4 c2902a4 = new C2902a4();
        try {
            String group = matcher.group(1);
            if (group == null) {
                throw null;
            }
            c2902a4.f29015a = SK.g(group);
            String group2 = matcher.group(2);
            if (group2 == null) {
                throw null;
            }
            c2902a4.f29016b = SK.g(group2);
            String group3 = matcher.group(3);
            group3.getClass();
            c(group3, c2902a4);
            StringBuilder sb = new StringBuilder();
            String n9 = cr.n(StandardCharsets.UTF_8);
            while (!TextUtils.isEmpty(n9)) {
                if (sb.length() > 0) {
                    sb.append("\n");
                }
                sb.append(n9.trim());
                n9 = cr.n(StandardCharsets.UTF_8);
            }
            c2902a4.f29017c = a(str, sb.toString(), arrayList);
            return new W3(c2902a4.a().a(), c2902a4.f29015a, c2902a4.f29016b);
        } catch (IllegalArgumentException unused) {
            AbstractC2968bG.y("WebvttCueParser", "Skipping cue with bad header: ".concat(String.valueOf(matcher.group())));
            return null;
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    public static void c(String str, C2902a4 c2902a4) {
        char c9;
        char c10;
        char c11;
        Matcher matcher = f29206b.matcher(str);
        while (matcher.find()) {
            int i = 1;
            String group = matcher.group(1);
            group.getClass();
            int i6 = 2;
            String group2 = matcher.group(2);
            group2.getClass();
            try {
                if ("line".equals(group)) {
                    int indexOf = group2.indexOf(44);
                    char c12 = 65535;
                    if (indexOf != -1) {
                        String substring = group2.substring(indexOf + 1);
                        switch (substring.hashCode()) {
                            case -1364013995:
                                if (substring.equals("center")) {
                                    c12 = 1;
                                    break;
                                }
                                break;
                            case -1074341483:
                                if (substring.equals("middle")) {
                                    c12 = 2;
                                    break;
                                }
                                break;
                            case 100571:
                                if (substring.equals("end")) {
                                    c12 = 3;
                                    break;
                                }
                                break;
                            case 109757538:
                                if (substring.equals(com.anythink.expressad.foundation.d.d.cg)) {
                                    c12 = 0;
                                    break;
                                }
                                break;
                        }
                        if (c12 == 0) {
                            i6 = 0;
                        } else if (c12 == 1 || c12 == 2) {
                            i6 = 1;
                        } else if (c12 != 3) {
                            AbstractC2968bG.y("WebvttCueParser", "Invalid anchor value: ".concat(substring));
                            i6 = Integer.MIN_VALUE;
                        }
                        c2902a4.f29021g = i6;
                        group2 = group2.substring(0, indexOf);
                    }
                    if (group2.endsWith("%")) {
                        c2902a4.f29019e = SK.p(group2);
                        c2902a4.f29020f = 0;
                    } else {
                        c2902a4.f29019e = Integer.parseInt(group2);
                        c2902a4.f29020f = 1;
                    }
                } else if ("align".equals(group)) {
                    switch (group2.hashCode()) {
                        case -1364013995:
                            if (group2.equals("center")) {
                                c9 = 2;
                                break;
                            }
                            c9 = 65535;
                            break;
                        case -1074341483:
                            if (group2.equals("middle")) {
                                c9 = 3;
                                break;
                            }
                            c9 = 65535;
                            break;
                        case 100571:
                            if (group2.equals("end")) {
                                c9 = 4;
                                break;
                            }
                            c9 = 65535;
                            break;
                        case 3317767:
                            if (group2.equals("left")) {
                                c9 = 1;
                                break;
                            }
                            c9 = 65535;
                            break;
                        case 108511772:
                            if (group2.equals("right")) {
                                c9 = 5;
                                break;
                            }
                            c9 = 65535;
                            break;
                        case 109757538:
                            if (group2.equals(com.anythink.expressad.foundation.d.d.cg)) {
                                c9 = 0;
                                break;
                            }
                            c9 = 65535;
                            break;
                        default:
                            c9 = 65535;
                            break;
                    }
                    if (c9 != 0) {
                        if (c9 != 1) {
                            if (c9 != 2 && c9 != 3) {
                                if (c9 == 4) {
                                    i = 3;
                                } else if (c9 != 5) {
                                    AbstractC2968bG.y("WebvttCueParser", "Invalid alignment value: ".concat(group2));
                                } else {
                                    i = 5;
                                }
                            }
                            i = 2;
                        } else {
                            i = 4;
                        }
                    }
                    c2902a4.f29018d = i;
                } else if (com.anythink.expressad.foundation.g.g.a.b.ab.equals(group)) {
                    int indexOf2 = group2.indexOf(44);
                    if (indexOf2 != -1) {
                        String substring2 = group2.substring(indexOf2 + 1);
                        switch (substring2.hashCode()) {
                            case -1842484672:
                                if (substring2.equals("line-left")) {
                                    c11 = 0;
                                    break;
                                }
                                c11 = 65535;
                                break;
                            case -1364013995:
                                if (substring2.equals("center")) {
                                    c11 = 2;
                                    break;
                                }
                                c11 = 65535;
                                break;
                            case -1276788989:
                                if (substring2.equals("line-right")) {
                                    c11 = 4;
                                    break;
                                }
                                c11 = 65535;
                                break;
                            case -1074341483:
                                if (substring2.equals("middle")) {
                                    c11 = 3;
                                    break;
                                }
                                c11 = 65535;
                                break;
                            case 100571:
                                if (substring2.equals("end")) {
                                    c11 = 5;
                                    break;
                                }
                                c11 = 65535;
                                break;
                            case 109757538:
                                if (substring2.equals(com.anythink.expressad.foundation.d.d.cg)) {
                                    c11 = 1;
                                    break;
                                }
                                c11 = 65535;
                                break;
                            default:
                                c11 = 65535;
                                break;
                        }
                        if (c11 == 0 || c11 == 1) {
                            i = 0;
                        } else if (c11 != 2 && c11 != 3) {
                            if (c11 == 4 || c11 == 5) {
                                i = 2;
                            } else {
                                AbstractC2968bG.y("WebvttCueParser", "Invalid anchor value: ".concat(substring2));
                                i = Integer.MIN_VALUE;
                            }
                        }
                        c2902a4.i = i;
                        group2 = group2.substring(0, indexOf2);
                    }
                    c2902a4.f29022h = SK.p(group2);
                } else if ("size".equals(group)) {
                    c2902a4.f29023j = SK.p(group2);
                } else if ("vertical".equals(group)) {
                    int hashCode = group2.hashCode();
                    if (hashCode != 3462) {
                        if (hashCode == 3642 && group2.equals("rl")) {
                            c10 = 0;
                        }
                        c10 = 65535;
                    } else {
                        if (group2.equals("lr")) {
                            c10 = 1;
                        }
                        c10 = 65535;
                    }
                    if (c10 != 0) {
                        if (c10 != 1) {
                            AbstractC2968bG.y("WebvttCueParser", "Invalid 'vertical' value: ".concat(group2));
                            i = Integer.MIN_VALUE;
                        } else {
                            i = 2;
                        }
                    }
                    c2902a4.f29024k = i;
                } else {
                    StringBuilder sb = new StringBuilder(group.length() + 21 + group2.length());
                    sb.append("Unknown cue setting ");
                    sb.append(group);
                    sb.append(":");
                    sb.append(group2);
                    AbstractC2968bG.y("WebvttCueParser", sb.toString());
                }
            } catch (NumberFormatException unused) {
                AbstractC2968bG.y("WebvttCueParser", "Skipping bad cue setting: ".concat(String.valueOf(matcher.group())));
            }
        }
    }

    public static void d(String str, Y3 y32, List list, SpannableStringBuilder spannableStringBuilder, List list2) {
        char c9;
        int i;
        int i6;
        int i9;
        int i10 = y32.f28650b;
        int length = spannableStringBuilder.length();
        String str2 = y32.f28649a;
        int hashCode = str2.hashCode();
        int i11 = -1;
        if (hashCode == 0) {
            if (str2.equals("")) {
                c9 = 7;
            }
            c9 = 65535;
        } else if (hashCode == 105) {
            if (str2.equals("i")) {
                c9 = 1;
            }
            c9 = 65535;
        } else if (hashCode == 3314158) {
            if (str2.equals(b.c.f11442j)) {
                c9 = 6;
            }
            c9 = 65535;
        } else if (hashCode == 3511770) {
            if (str2.equals("ruby")) {
                c9 = 2;
            }
            c9 = 65535;
        } else if (hashCode == 98) {
            if (str2.equals("b")) {
                c9 = 0;
            }
            c9 = 65535;
        } else if (hashCode == 99) {
            if (str2.equals("c")) {
                c9 = 4;
            }
            c9 = 65535;
        } else if (hashCode != 117) {
            if (hashCode == 118 && str2.equals("v")) {
                c9 = 5;
            }
            c9 = 65535;
        } else {
            if (str2.equals("u")) {
                c9 = 3;
            }
            c9 = 65535;
        }
        switch (c9) {
            case 0:
                spannableStringBuilder.setSpan(new StyleSpan(1), i10, length, 33);
                break;
            case 1:
                spannableStringBuilder.setSpan(new StyleSpan(2), i10, length, 33);
                break;
            case 2:
                int e9 = e(list2, str, y32);
                ArrayList arrayList = new ArrayList(list.size());
                arrayList.addAll(list);
                Collections.sort(arrayList, C3004c.f29389G);
                int i12 = i10;
                int i13 = 0;
                int i14 = 0;
                while (i13 < arrayList.size()) {
                    if ("rt".equals(((X3) arrayList.get(i13)).f28476a.f28649a)) {
                        X3 x32 = (X3) arrayList.get(i13);
                        int e10 = e(list2, str, x32.f28476a);
                        if (e10 == i11) {
                            e10 = e9 != i11 ? e9 : 1;
                        }
                        int i15 = x32.f28476a.f28650b - i14;
                        int i16 = x32.f28477b - i14;
                        CharSequence subSequence = spannableStringBuilder.subSequence(i15, i16);
                        spannableStringBuilder.delete(i15, i16);
                        spannableStringBuilder.setSpan(new C3741pk(subSequence.toString(), e10), i12, i15, 33);
                        i14 += subSequence.length();
                        i12 = i15;
                    }
                    i13++;
                    i11 = -1;
                }
                break;
            case 3:
                spannableStringBuilder.setSpan(new UnderlineSpan(), i10, length, 33);
                break;
            case 4:
                for (String str3 : y32.f28652d) {
                    Map map = f29207c;
                    if (map.containsKey(str3)) {
                        spannableStringBuilder.setSpan(new ForegroundColorSpan(((Integer) map.get(str3)).intValue()), i10, length, 33);
                    } else {
                        Map map2 = f29208d;
                        if (map2.containsKey(str3)) {
                            spannableStringBuilder.setSpan(new BackgroundColorSpan(((Integer) map2.get(str3)).intValue()), i10, length, 33);
                        }
                    }
                }
                break;
            case 5:
                spannableStringBuilder.setSpan(new C2745Qk(y32.f28651c), i10, length, 33);
                break;
            case 6:
            case 7:
                break;
            default:
                return;
        }
        ArrayList f3 = f(list2, str, y32);
        for (int i17 = 0; i17 < f3.size(); i17++) {
            V3 v32 = ((Z3) f3.get(i17)).f28836u;
            int i18 = v32.f28088k;
            if (i18 == -1 && v32.f28089l == -1) {
                i = -1;
            } else {
                i = (v32.f28089l == 1 ? (char) 2 : (char) 0) | (i18 == 1 ? (char) 1 : (char) 0);
            }
            if (i != -1) {
                int i19 = v32.f28088k;
                if (i19 == -1 && v32.f28089l == -1) {
                    i9 = -1;
                    i6 = 1;
                } else {
                    i6 = 1;
                    i9 = (i19 == 1 ? 1 : 0) | (v32.f28089l == 1 ? 2 : 0);
                }
                SK.m(spannableStringBuilder, new StyleSpan(i9), i10, length);
            } else {
                i6 = 1;
            }
            if (v32.f28087j == i6) {
                spannableStringBuilder.setSpan(new UnderlineSpan(), i10, length, 33);
            }
            if (v32.f28085g) {
                if (!v32.f28085g) {
                    throw new IllegalStateException("Font color not defined");
                }
                SK.m(spannableStringBuilder, new ForegroundColorSpan(v32.f28084f), i10, length);
            }
            if (v32.i) {
                if (!v32.i) {
                    throw new IllegalStateException("Background color not defined.");
                }
                SK.m(spannableStringBuilder, new BackgroundColorSpan(v32.f28086h), i10, length);
            }
            if (v32.f28083e != null) {
                SK.m(spannableStringBuilder, new TypefaceSpan(v32.f28083e), i10, length);
            }
            int i20 = v32.f28090m;
            if (i20 == 1) {
                SK.m(spannableStringBuilder, new AbsoluteSizeSpan((int) v32.f28091n, true), i10, length);
            } else if (i20 == 2) {
                SK.m(spannableStringBuilder, new RelativeSizeSpan(v32.f28091n), i10, length);
            } else if (i20 == 3) {
                SK.m(spannableStringBuilder, new RelativeSizeSpan(v32.f28091n / 100.0f), i10, length);
            }
            if (v32.f28093p) {
                spannableStringBuilder.setSpan(new C3149ek(), i10, length, 33);
            }
        }
    }

    public static int e(List list, String str, Y3 y32) {
        ArrayList f3 = f(list, str, y32);
        for (int i = 0; i < f3.size(); i++) {
            int i6 = ((Z3) f3.get(i)).f28836u.f28092o;
            if (i6 != -1) {
                return i6;
            }
        }
        return -1;
    }

    public static ArrayList f(List list, String str, Y3 y32) {
        int size;
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < list.size(); i++) {
            V3 v32 = (V3) list.get(i);
            String str2 = y32.f28649a;
            if (v32.f28079a.isEmpty() && v32.f28080b.isEmpty() && v32.f28081c.isEmpty() && v32.f28082d.isEmpty()) {
                if (TextUtils.isEmpty(str2)) {
                    size = 1;
                }
                size = 0;
            } else {
                int a9 = V3.a(V3.a(V3.a(0, 1073741824, v32.f28079a, str), 2, v32.f28080b, str2), 4, v32.f28082d, y32.f28651c);
                if (a9 != -1) {
                    if (y32.f28652d.containsAll(v32.f28081c)) {
                        size = a9 + (v32.f28081c.size() * 4);
                    }
                }
                size = 0;
            }
            if (size > 0) {
                arrayList.add(new Z3(size, v32));
            }
        }
        Collections.sort(arrayList);
        return arrayList;
    }
}
