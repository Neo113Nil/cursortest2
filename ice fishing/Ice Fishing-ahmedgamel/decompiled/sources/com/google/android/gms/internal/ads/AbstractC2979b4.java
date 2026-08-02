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
public abstract class AbstractC2979b4 {

    /* renamed from: a, reason: collision with root package name */
    public static final Pattern f29993a = Pattern.compile("^(\\S+)\\s+-->\\s+(\\S+)((?:.|\\f)*+)?$");

    /* renamed from: b, reason: collision with root package name */
    public static final Pattern f29994b = Pattern.compile("(\\S+?):(\\S+)");

    /* renamed from: c, reason: collision with root package name */
    public static final Map f29995c;

    /* renamed from: d, reason: collision with root package name */
    public static final Map f29996d;

    static {
        HashMap hashMap = new HashMap();
        hashMap.put("white", Integer.valueOf(Color.rgb(com.anythink.basead.exoplayer.k.p.f9259b, com.anythink.basead.exoplayer.k.p.f9259b, com.anythink.basead.exoplayer.k.p.f9259b)));
        hashMap.put("lime", Integer.valueOf(Color.rgb(0, com.anythink.basead.exoplayer.k.p.f9259b, 0)));
        hashMap.put("cyan", Integer.valueOf(Color.rgb(0, com.anythink.basead.exoplayer.k.p.f9259b, com.anythink.basead.exoplayer.k.p.f9259b)));
        hashMap.put("red", Integer.valueOf(Color.rgb(com.anythink.basead.exoplayer.k.p.f9259b, 0, 0)));
        hashMap.put("yellow", Integer.valueOf(Color.rgb(com.anythink.basead.exoplayer.k.p.f9259b, com.anythink.basead.exoplayer.k.p.f9259b, 0)));
        hashMap.put("magenta", Integer.valueOf(Color.rgb(com.anythink.basead.exoplayer.k.p.f9259b, 0, com.anythink.basead.exoplayer.k.p.f9259b)));
        hashMap.put("blue", Integer.valueOf(Color.rgb(0, 0, com.anythink.basead.exoplayer.k.p.f9259b)));
        hashMap.put("black", Integer.valueOf(Color.rgb(0, 0, 0)));
        f29995c = Collections.unmodifiableMap(hashMap);
        HashMap hashMap2 = new HashMap();
        hashMap2.put("bg_white", Integer.valueOf(Color.rgb(com.anythink.basead.exoplayer.k.p.f9259b, com.anythink.basead.exoplayer.k.p.f9259b, com.anythink.basead.exoplayer.k.p.f9259b)));
        hashMap2.put("bg_lime", Integer.valueOf(Color.rgb(0, com.anythink.basead.exoplayer.k.p.f9259b, 0)));
        hashMap2.put("bg_cyan", Integer.valueOf(Color.rgb(0, com.anythink.basead.exoplayer.k.p.f9259b, com.anythink.basead.exoplayer.k.p.f9259b)));
        hashMap2.put("bg_red", Integer.valueOf(Color.rgb(com.anythink.basead.exoplayer.k.p.f9259b, 0, 0)));
        hashMap2.put("bg_yellow", Integer.valueOf(Color.rgb(com.anythink.basead.exoplayer.k.p.f9259b, com.anythink.basead.exoplayer.k.p.f9259b, 0)));
        hashMap2.put("bg_magenta", Integer.valueOf(Color.rgb(com.anythink.basead.exoplayer.k.p.f9259b, 0, com.anythink.basead.exoplayer.k.p.f9259b)));
        hashMap2.put("bg_blue", Integer.valueOf(Color.rgb(0, 0, com.anythink.basead.exoplayer.k.p.f9259b)));
        hashMap2.put("bg_black", Integer.valueOf(Color.rgb(0, 0, 0)));
        f29996d = Collections.unmodifiableMap(hashMap2);
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
        int i4;
        int i6;
        int i9 = -1;
        int i10 = 1;
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        ArrayDeque arrayDeque = new ArrayDeque();
        ArrayList arrayList = new ArrayList();
        int i11 = 0;
        int i12 = 0;
        while (true) {
            String str3 = "";
            if (i12 >= str2.length()) {
                while (!arrayDeque.isEmpty()) {
                    d(str, (Y3) arrayDeque.pop(), arrayList, spannableStringBuilder, list);
                }
                d(str, new Y3("", i11, "", Collections.EMPTY_SET), Collections.EMPTY_LIST, spannableStringBuilder, list);
                return SpannedString.valueOf(spannableStringBuilder);
            }
            int i13 = i12 + 1;
            char charAt = str2.charAt(i12);
            int i14 = i10;
            int i15 = i11;
            if (charAt == '&') {
                int indexOf = str2.indexOf(59, i13);
                int indexOf2 = str2.indexOf(32, i13);
                if (indexOf == -1) {
                    indexOf = indexOf2;
                } else if (indexOf2 != -1) {
                    indexOf = Math.min(indexOf, indexOf2);
                }
                if (indexOf != -1) {
                    String substring = str2.substring(i13, indexOf);
                    int hashCode = substring.hashCode();
                    if (hashCode == 3309) {
                        if (substring.equals("gt")) {
                            i = i14;
                            if (i != 0) {
                            }
                            if (indexOf == indexOf2) {
                            }
                            i14 = 1;
                            i12 = indexOf + 1;
                            i10 = i14;
                            i11 = i15;
                            i9 = -1;
                        }
                        i = -1;
                        if (i != 0) {
                        }
                        if (indexOf == indexOf2) {
                        }
                        i14 = 1;
                        i12 = indexOf + 1;
                        i10 = i14;
                        i11 = i15;
                        i9 = -1;
                    } else if (hashCode == 3464) {
                        if (substring.equals("lt")) {
                            i = i15;
                            if (i != 0) {
                            }
                            if (indexOf == indexOf2) {
                            }
                            i14 = 1;
                            i12 = indexOf + 1;
                            i10 = i14;
                            i11 = i15;
                            i9 = -1;
                        }
                        i = -1;
                        if (i != 0) {
                        }
                        if (indexOf == indexOf2) {
                        }
                        i14 = 1;
                        i12 = indexOf + 1;
                        i10 = i14;
                        i11 = i15;
                        i9 = -1;
                    } else if (hashCode != 96708) {
                        if (hashCode == 3374865 && substring.equals("nbsp")) {
                            i = 2;
                            if (i != 0) {
                                spannableStringBuilder.append('<');
                            } else if (i == i14) {
                                spannableStringBuilder.append('>');
                            } else if (i == 2) {
                                spannableStringBuilder.append(' ');
                            } else if (i != 3) {
                                StringBuilder sb = new StringBuilder(substring.length() + 33);
                                sb.append("ignoring unsupported entity: '&");
                                sb.append(substring);
                                sb.append(";'");
                                AbstractC2991bG.y("WebvttCueParser", sb.toString());
                            } else {
                                spannableStringBuilder.append('&');
                            }
                            if (indexOf == indexOf2) {
                                spannableStringBuilder.append((CharSequence) " ");
                            }
                            i14 = 1;
                            i12 = indexOf + 1;
                            i10 = i14;
                            i11 = i15;
                            i9 = -1;
                        }
                        i = -1;
                        if (i != 0) {
                        }
                        if (indexOf == indexOf2) {
                        }
                        i14 = 1;
                        i12 = indexOf + 1;
                        i10 = i14;
                        i11 = i15;
                        i9 = -1;
                    } else {
                        if (substring.equals("amp")) {
                            i = 3;
                            if (i != 0) {
                            }
                            if (indexOf == indexOf2) {
                            }
                            i14 = 1;
                            i12 = indexOf + 1;
                            i10 = i14;
                            i11 = i15;
                            i9 = -1;
                        }
                        i = -1;
                        if (i != 0) {
                        }
                        if (indexOf == indexOf2) {
                        }
                        i14 = 1;
                        i12 = indexOf + 1;
                        i10 = i14;
                        i11 = i15;
                        i9 = -1;
                    }
                } else {
                    spannableStringBuilder.append(charAt);
                }
            } else if (charAt != '<') {
                spannableStringBuilder.append(charAt);
            } else if (i13 < str2.length()) {
                char charAt2 = str2.charAt(i13);
                int indexOf3 = str2.indexOf(62, i13);
                int length = indexOf3 == i9 ? str2.length() : indexOf3 + 1;
                int i16 = length - 2;
                int i17 = str2.charAt(i16) == '/' ? i14 : i15;
                int i18 = i12 + (charAt2 == '/' ? 2 : i14);
                if (i17 == 0) {
                    i16 = length - 1;
                }
                String substring2 = str2.substring(i18, i16);
                if (!substring2.trim().isEmpty()) {
                    String trim = substring2.trim();
                    AbstractC2792Sd.i(!trim.isEmpty());
                    String str4 = AbstractC3182eu.f30782a;
                    String str5 = trim.split("[ \\.]", 2)[i15];
                    int hashCode2 = str5.hashCode();
                    if (hashCode2 == 98) {
                        if (str5.equals("b")) {
                            i4 = i15;
                            switch (i4) {
                            }
                            i12 = length;
                            i11 = i6;
                            i10 = i14;
                        }
                        i4 = -1;
                        switch (i4) {
                        }
                        i12 = length;
                        i11 = i6;
                        i10 = i14;
                    } else if (hashCode2 == 99) {
                        if (str5.equals("c")) {
                            i4 = i14;
                            switch (i4) {
                            }
                            i12 = length;
                            i11 = i6;
                            i10 = i14;
                        }
                        i4 = -1;
                        switch (i4) {
                        }
                        i12 = length;
                        i11 = i6;
                        i10 = i14;
                    } else if (hashCode2 == 105) {
                        if (str5.equals("i")) {
                            i4 = 2;
                            switch (i4) {
                            }
                            i12 = length;
                            i11 = i6;
                            i10 = i14;
                        }
                        i4 = -1;
                        switch (i4) {
                        }
                        i12 = length;
                        i11 = i6;
                        i10 = i14;
                    } else if (hashCode2 == 3650) {
                        if (str5.equals("rt")) {
                            i4 = 5;
                            switch (i4) {
                            }
                            i12 = length;
                            i11 = i6;
                            i10 = i14;
                        }
                        i4 = -1;
                        switch (i4) {
                        }
                        i12 = length;
                        i11 = i6;
                        i10 = i14;
                    } else if (hashCode2 == 3314158) {
                        if (str5.equals(b.c.f12228j)) {
                            i4 = 3;
                            switch (i4) {
                            }
                            i12 = length;
                            i11 = i6;
                            i10 = i14;
                        }
                        i4 = -1;
                        switch (i4) {
                        }
                        i12 = length;
                        i11 = i6;
                        i10 = i14;
                    } else if (hashCode2 == 3511770) {
                        if (str5.equals("ruby")) {
                            i4 = 4;
                            switch (i4) {
                            }
                            i12 = length;
                            i11 = i6;
                            i10 = i14;
                        }
                        i4 = -1;
                        switch (i4) {
                        }
                        i12 = length;
                        i11 = i6;
                        i10 = i14;
                    } else if (hashCode2 != 117) {
                        if (hashCode2 == 118 && str5.equals("v")) {
                            i4 = 7;
                            switch (i4) {
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
                                            if (y32.f29426a.equals(str5)) {
                                            }
                                        }
                                    } else if (i17 == 0) {
                                        int length2 = spannableStringBuilder.length();
                                        String trim2 = substring2.trim();
                                        AbstractC2792Sd.i(!trim2.isEmpty());
                                        int indexOf4 = trim2.indexOf(" ");
                                        if (indexOf4 == -1) {
                                            i6 = i15;
                                        } else {
                                            str3 = trim2.substring(indexOf4).trim();
                                            i6 = i15;
                                            trim2 = trim2.substring(i6, indexOf4);
                                        }
                                        String[] split = trim2.split("\\.", -1);
                                        String str6 = split[i6];
                                        HashSet hashSet = new HashSet();
                                        for (int i19 = i14; i19 < split.length; i19++) {
                                            hashSet.add(split[i19]);
                                        }
                                        arrayDeque.push(new Y3(str6, length2, str3, hashSet));
                                        break;
                                    }
                                default:
                                    i6 = i15;
                                    break;
                            }
                            i12 = length;
                            i11 = i6;
                            i10 = i14;
                        }
                        i4 = -1;
                        switch (i4) {
                        }
                        i12 = length;
                        i11 = i6;
                        i10 = i14;
                    } else {
                        if (str5.equals("u")) {
                            i4 = 6;
                            switch (i4) {
                            }
                            i12 = length;
                            i11 = i6;
                            i10 = i14;
                        }
                        i4 = -1;
                        switch (i4) {
                        }
                        i12 = length;
                        i11 = i6;
                        i10 = i14;
                    }
                    i9 = -1;
                }
                i6 = i15;
                i12 = length;
                i11 = i6;
                i10 = i14;
                i9 = -1;
            }
            i12 = i13;
            i10 = i14;
            i11 = i15;
            i9 = -1;
        }
    }

    public static W3 b(String str, Matcher matcher, Cr cr, ArrayList arrayList) {
        C2925a4 c2925a4 = new C2925a4();
        try {
            String group = matcher.group(1);
            if (group == null) {
                throw null;
            }
            c2925a4.f29785a = SK.g(group);
            String group2 = matcher.group(2);
            if (group2 == null) {
                throw null;
            }
            c2925a4.f29786b = SK.g(group2);
            String group3 = matcher.group(3);
            group3.getClass();
            c(group3, c2925a4);
            StringBuilder sb = new StringBuilder();
            String n9 = cr.n(StandardCharsets.UTF_8);
            while (!TextUtils.isEmpty(n9)) {
                if (sb.length() > 0) {
                    sb.append("\n");
                }
                sb.append(n9.trim());
                n9 = cr.n(StandardCharsets.UTF_8);
            }
            c2925a4.f29787c = a(str, sb.toString(), arrayList);
            return new W3(c2925a4.a().a(), c2925a4.f29785a, c2925a4.f29786b);
        } catch (IllegalArgumentException unused) {
            AbstractC2991bG.y("WebvttCueParser", "Skipping cue with bad header: ".concat(String.valueOf(matcher.group())));
            return null;
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    public static void c(String str, C2925a4 c2925a4) {
        char c9;
        char c10;
        char c11;
        Matcher matcher = f29994b.matcher(str);
        while (matcher.find()) {
            int i = 1;
            String group = matcher.group(1);
            group.getClass();
            int i4 = 2;
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
                            i4 = 0;
                        } else if (c12 == 1 || c12 == 2) {
                            i4 = 1;
                        } else if (c12 != 3) {
                            AbstractC2991bG.y("WebvttCueParser", "Invalid anchor value: ".concat(substring));
                            i4 = Integer.MIN_VALUE;
                        }
                        c2925a4.f29791g = i4;
                        group2 = group2.substring(0, indexOf);
                    }
                    if (group2.endsWith("%")) {
                        c2925a4.f29789e = SK.p(group2);
                        c2925a4.f29790f = 0;
                    } else {
                        c2925a4.f29789e = Integer.parseInt(group2);
                        c2925a4.f29790f = 1;
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
                                    AbstractC2991bG.y("WebvttCueParser", "Invalid alignment value: ".concat(group2));
                                } else {
                                    i = 5;
                                }
                            }
                            i = 2;
                        } else {
                            i = 4;
                        }
                    }
                    c2925a4.f29788d = i;
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
                                AbstractC2991bG.y("WebvttCueParser", "Invalid anchor value: ".concat(substring2));
                                i = Integer.MIN_VALUE;
                            }
                        }
                        c2925a4.i = i;
                        group2 = group2.substring(0, indexOf2);
                    }
                    c2925a4.f29792h = SK.p(group2);
                } else if ("size".equals(group)) {
                    c2925a4.f29793j = SK.p(group2);
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
                            AbstractC2991bG.y("WebvttCueParser", "Invalid 'vertical' value: ".concat(group2));
                            i = Integer.MIN_VALUE;
                        } else {
                            i = 2;
                        }
                    }
                    c2925a4.f29794k = i;
                } else {
                    StringBuilder sb = new StringBuilder(group.length() + 21 + group2.length());
                    sb.append("Unknown cue setting ");
                    sb.append(group);
                    sb.append(":");
                    sb.append(group2);
                    AbstractC2991bG.y("WebvttCueParser", sb.toString());
                }
            } catch (NumberFormatException unused) {
                AbstractC2991bG.y("WebvttCueParser", "Skipping bad cue setting: ".concat(String.valueOf(matcher.group())));
            }
        }
    }

    public static void d(String str, Y3 y32, List list, SpannableStringBuilder spannableStringBuilder, List list2) {
        char c9;
        int i;
        int i4;
        int i6;
        int i9 = y32.f29427b;
        int length = spannableStringBuilder.length();
        String str2 = y32.f29426a;
        int hashCode = str2.hashCode();
        int i10 = -1;
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
            if (str2.equals(b.c.f12228j)) {
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
                spannableStringBuilder.setSpan(new StyleSpan(1), i9, length, 33);
                break;
            case 1:
                spannableStringBuilder.setSpan(new StyleSpan(2), i9, length, 33);
                break;
            case 2:
                int e9 = e(list2, str, y32);
                ArrayList arrayList = new ArrayList(list.size());
                arrayList.addAll(list);
                Collections.sort(arrayList, C3027c.f30172G);
                int i11 = i9;
                int i12 = 0;
                int i13 = 0;
                while (i12 < arrayList.size()) {
                    if ("rt".equals(((X3) arrayList.get(i12)).f29256a.f29426a)) {
                        X3 x32 = (X3) arrayList.get(i12);
                        int e10 = e(list2, str, x32.f29256a);
                        if (e10 == i10) {
                            e10 = e9 != i10 ? e9 : 1;
                        }
                        int i14 = x32.f29256a.f29427b - i13;
                        int i15 = x32.f29257b - i13;
                        CharSequence subSequence = spannableStringBuilder.subSequence(i14, i15);
                        spannableStringBuilder.delete(i14, i15);
                        spannableStringBuilder.setSpan(new C3764pk(subSequence.toString(), e10), i11, i14, 33);
                        i13 += subSequence.length();
                        i11 = i14;
                    }
                    i12++;
                    i10 = -1;
                }
                break;
            case 3:
                spannableStringBuilder.setSpan(new UnderlineSpan(), i9, length, 33);
                break;
            case 4:
                for (String str3 : y32.f29429d) {
                    Map map = f29995c;
                    if (map.containsKey(str3)) {
                        spannableStringBuilder.setSpan(new ForegroundColorSpan(((Integer) map.get(str3)).intValue()), i9, length, 33);
                    } else {
                        Map map2 = f29996d;
                        if (map2.containsKey(str3)) {
                            spannableStringBuilder.setSpan(new BackgroundColorSpan(((Integer) map2.get(str3)).intValue()), i9, length, 33);
                        }
                    }
                }
                break;
            case 5:
                spannableStringBuilder.setSpan(new C2765Qk(y32.f29428c), i9, length, 33);
                break;
            case 6:
            case 7:
                break;
            default:
                return;
        }
        ArrayList f2 = f(list2, str, y32);
        for (int i16 = 0; i16 < f2.size(); i16++) {
            V3 v32 = ((Z3) f2.get(i16)).f29616u;
            int i17 = v32.f28885k;
            if (i17 == -1 && v32.f28886l == -1) {
                i = -1;
            } else {
                i = (v32.f28886l == 1 ? (char) 2 : (char) 0) | (i17 == 1 ? (char) 1 : (char) 0);
            }
            if (i != -1) {
                int i18 = v32.f28885k;
                if (i18 == -1 && v32.f28886l == -1) {
                    i6 = -1;
                    i4 = 1;
                } else {
                    i4 = 1;
                    i6 = (i18 == 1 ? 1 : 0) | (v32.f28886l == 1 ? 2 : 0);
                }
                SK.m(spannableStringBuilder, new StyleSpan(i6), i9, length);
            } else {
                i4 = 1;
            }
            if (v32.f28884j == i4) {
                spannableStringBuilder.setSpan(new UnderlineSpan(), i9, length, 33);
            }
            if (v32.f28882g) {
                if (!v32.f28882g) {
                    throw new IllegalStateException("Font color not defined");
                }
                SK.m(spannableStringBuilder, new ForegroundColorSpan(v32.f28881f), i9, length);
            }
            if (v32.i) {
                if (!v32.i) {
                    throw new IllegalStateException("Background color not defined.");
                }
                SK.m(spannableStringBuilder, new BackgroundColorSpan(v32.f28883h), i9, length);
            }
            if (v32.f28880e != null) {
                SK.m(spannableStringBuilder, new TypefaceSpan(v32.f28880e), i9, length);
            }
            int i19 = v32.f28887m;
            if (i19 == 1) {
                SK.m(spannableStringBuilder, new AbsoluteSizeSpan((int) v32.f28888n, true), i9, length);
            } else if (i19 == 2) {
                SK.m(spannableStringBuilder, new RelativeSizeSpan(v32.f28888n), i9, length);
            } else if (i19 == 3) {
                SK.m(spannableStringBuilder, new RelativeSizeSpan(v32.f28888n / 100.0f), i9, length);
            }
            if (v32.f28890p) {
                spannableStringBuilder.setSpan(new C3172ek(), i9, length, 33);
            }
        }
    }

    public static int e(List list, String str, Y3 y32) {
        ArrayList f2 = f(list, str, y32);
        for (int i = 0; i < f2.size(); i++) {
            int i4 = ((Z3) f2.get(i)).f29616u.f28889o;
            if (i4 != -1) {
                return i4;
            }
        }
        return -1;
    }

    public static ArrayList f(List list, String str, Y3 y32) {
        int size;
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < list.size(); i++) {
            V3 v32 = (V3) list.get(i);
            String str2 = y32.f29426a;
            if (v32.f28876a.isEmpty() && v32.f28877b.isEmpty() && v32.f28878c.isEmpty() && v32.f28879d.isEmpty()) {
                if (TextUtils.isEmpty(str2)) {
                    size = 1;
                }
                size = 0;
            } else {
                int a9 = V3.a(V3.a(V3.a(0, 1073741824, v32.f28876a, str), 2, v32.f28877b, str2), 4, v32.f28879d, y32.f29428c);
                if (a9 != -1) {
                    if (y32.f29429d.containsAll(v32.f28878c)) {
                        size = a9 + (v32.f28878c.size() * 4);
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
