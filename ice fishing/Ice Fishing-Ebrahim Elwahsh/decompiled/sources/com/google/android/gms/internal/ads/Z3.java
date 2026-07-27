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

/* loaded from: classes2.dex */
public abstract class Z3 {

    /* renamed from: a, reason: collision with root package name */
    public static final Pattern f28959a = Pattern.compile("^(\\S+)\\s+-->\\s+(\\S+)((?:.|\\f)*+)?$");

    /* renamed from: b, reason: collision with root package name */
    public static final Pattern f28960b = Pattern.compile("(\\S+?):(\\S+)");

    /* renamed from: c, reason: collision with root package name */
    public static final Map f28961c;

    /* renamed from: d, reason: collision with root package name */
    public static final Map f28962d;

    static {
        HashMap hashMap = new HashMap();
        hashMap.put("white", Integer.valueOf(Color.rgb(com.anythink.basead.exoplayer.k.p.f8630b, com.anythink.basead.exoplayer.k.p.f8630b, com.anythink.basead.exoplayer.k.p.f8630b)));
        hashMap.put("lime", Integer.valueOf(Color.rgb(0, com.anythink.basead.exoplayer.k.p.f8630b, 0)));
        hashMap.put("cyan", Integer.valueOf(Color.rgb(0, com.anythink.basead.exoplayer.k.p.f8630b, com.anythink.basead.exoplayer.k.p.f8630b)));
        hashMap.put("red", Integer.valueOf(Color.rgb(com.anythink.basead.exoplayer.k.p.f8630b, 0, 0)));
        hashMap.put("yellow", Integer.valueOf(Color.rgb(com.anythink.basead.exoplayer.k.p.f8630b, com.anythink.basead.exoplayer.k.p.f8630b, 0)));
        hashMap.put("magenta", Integer.valueOf(Color.rgb(com.anythink.basead.exoplayer.k.p.f8630b, 0, com.anythink.basead.exoplayer.k.p.f8630b)));
        hashMap.put("blue", Integer.valueOf(Color.rgb(0, 0, com.anythink.basead.exoplayer.k.p.f8630b)));
        hashMap.put("black", Integer.valueOf(Color.rgb(0, 0, 0)));
        f28961c = Collections.unmodifiableMap(hashMap);
        HashMap hashMap2 = new HashMap();
        hashMap2.put("bg_white", Integer.valueOf(Color.rgb(com.anythink.basead.exoplayer.k.p.f8630b, com.anythink.basead.exoplayer.k.p.f8630b, com.anythink.basead.exoplayer.k.p.f8630b)));
        hashMap2.put("bg_lime", Integer.valueOf(Color.rgb(0, com.anythink.basead.exoplayer.k.p.f8630b, 0)));
        hashMap2.put("bg_cyan", Integer.valueOf(Color.rgb(0, com.anythink.basead.exoplayer.k.p.f8630b, com.anythink.basead.exoplayer.k.p.f8630b)));
        hashMap2.put("bg_red", Integer.valueOf(Color.rgb(com.anythink.basead.exoplayer.k.p.f8630b, 0, 0)));
        hashMap2.put("bg_yellow", Integer.valueOf(Color.rgb(com.anythink.basead.exoplayer.k.p.f8630b, com.anythink.basead.exoplayer.k.p.f8630b, 0)));
        hashMap2.put("bg_magenta", Integer.valueOf(Color.rgb(com.anythink.basead.exoplayer.k.p.f8630b, 0, com.anythink.basead.exoplayer.k.p.f8630b)));
        hashMap2.put("bg_blue", Integer.valueOf(Color.rgb(0, 0, com.anythink.basead.exoplayer.k.p.f8630b)));
        hashMap2.put("bg_black", Integer.valueOf(Color.rgb(0, 0, 0)));
        f28962d = Collections.unmodifiableMap(hashMap2);
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
                    d(str, (W3) arrayDeque.pop(), arrayList, spannableStringBuilder, list);
                }
                d(str, new W3("", i12, "", Collections.EMPTY_SET), Collections.EMPTY_LIST, spannableStringBuilder, list);
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
                                AbstractC3217fl.I("WebvttCueParser", sb.toString());
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
                    PA.n(!trim.isEmpty());
                    String str4 = AbstractC3548lu.f32613a;
                    String str5 = trim.split("[ \\.]", 2)[i16];
                    int hashCode2 = str5.hashCode();
                    if (hashCode2 == 98) {
                        if (str5.equals("b")) {
                            i4 = i16;
                            switch (i4) {
                            }
                            i13 = length;
                            i12 = i9;
                            i11 = i15;
                        }
                        i4 = -1;
                        switch (i4) {
                        }
                        i13 = length;
                        i12 = i9;
                        i11 = i15;
                    } else if (hashCode2 == 99) {
                        if (str5.equals("c")) {
                            i4 = i15;
                            switch (i4) {
                            }
                            i13 = length;
                            i12 = i9;
                            i11 = i15;
                        }
                        i4 = -1;
                        switch (i4) {
                        }
                        i13 = length;
                        i12 = i9;
                        i11 = i15;
                    } else if (hashCode2 == 105) {
                        if (str5.equals("i")) {
                            i4 = 2;
                            switch (i4) {
                            }
                            i13 = length;
                            i12 = i9;
                            i11 = i15;
                        }
                        i4 = -1;
                        switch (i4) {
                        }
                        i13 = length;
                        i12 = i9;
                        i11 = i15;
                    } else if (hashCode2 == 3650) {
                        if (str5.equals("rt")) {
                            i4 = 5;
                            switch (i4) {
                            }
                            i13 = length;
                            i12 = i9;
                            i11 = i15;
                        }
                        i4 = -1;
                        switch (i4) {
                        }
                        i13 = length;
                        i12 = i9;
                        i11 = i15;
                    } else if (hashCode2 == 3314158) {
                        if (str5.equals(b.c.f11599j)) {
                            i4 = 3;
                            switch (i4) {
                            }
                            i13 = length;
                            i12 = i9;
                            i11 = i15;
                        }
                        i4 = -1;
                        switch (i4) {
                        }
                        i13 = length;
                        i12 = i9;
                        i11 = i15;
                    } else if (hashCode2 == 3511770) {
                        if (str5.equals("ruby")) {
                            i4 = 4;
                            switch (i4) {
                            }
                            i13 = length;
                            i12 = i9;
                            i11 = i15;
                        }
                        i4 = -1;
                        switch (i4) {
                        }
                        i13 = length;
                        i12 = i9;
                        i11 = i15;
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
                                            W3 w32 = (W3) arrayDeque.pop();
                                            d(str, w32, arrayList, spannableStringBuilder, list);
                                            if (arrayDeque.isEmpty()) {
                                                arrayList.clear();
                                            } else {
                                                arrayList.add(new V3(w32, spannableStringBuilder.length()));
                                            }
                                            if (w32.f28360a.equals(str5)) {
                                            }
                                        }
                                    } else if (i18 == 0) {
                                        int length2 = spannableStringBuilder.length();
                                        String trim2 = substring2.trim();
                                        PA.n(!trim2.isEmpty());
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
                                        arrayDeque.push(new W3(str6, length2, str3, hashSet));
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
                        i4 = -1;
                        switch (i4) {
                        }
                        i13 = length;
                        i12 = i9;
                        i11 = i15;
                    } else {
                        if (str5.equals("u")) {
                            i4 = 6;
                            switch (i4) {
                            }
                            i13 = length;
                            i12 = i9;
                            i11 = i15;
                        }
                        i4 = -1;
                        switch (i4) {
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

    public static U3 b(String str, Matcher matcher, Lr lr, ArrayList arrayList) {
        Y3 y32 = new Y3();
        try {
            String group = matcher.group(1);
            if (group == null) {
                throw null;
            }
            y32.f28777a = AbstractC3217fl.f(group);
            String group2 = matcher.group(2);
            if (group2 == null) {
                throw null;
            }
            y32.f28778b = AbstractC3217fl.f(group2);
            String group3 = matcher.group(3);
            group3.getClass();
            c(group3, y32);
            StringBuilder sb = new StringBuilder();
            String n9 = lr.n(StandardCharsets.UTF_8);
            while (!TextUtils.isEmpty(n9)) {
                if (sb.length() > 0) {
                    sb.append("\n");
                }
                sb.append(n9.trim());
                n9 = lr.n(StandardCharsets.UTF_8);
            }
            y32.f28779c = a(str, sb.toString(), arrayList);
            return new U3(y32.a().a(), y32.f28777a, y32.f28778b);
        } catch (IllegalArgumentException unused) {
            AbstractC3217fl.I("WebvttCueParser", "Skipping cue with bad header: ".concat(String.valueOf(matcher.group())));
            return null;
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    public static void c(String str, Y3 y32) {
        char c4;
        char c9;
        char c10;
        Matcher matcher = f28960b.matcher(str);
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
                    char c11 = 65535;
                    if (indexOf != -1) {
                        String substring = group2.substring(indexOf + 1);
                        switch (substring.hashCode()) {
                            case -1364013995:
                                if (substring.equals("center")) {
                                    c11 = 1;
                                    break;
                                }
                                break;
                            case -1074341483:
                                if (substring.equals("middle")) {
                                    c11 = 2;
                                    break;
                                }
                                break;
                            case 100571:
                                if (substring.equals("end")) {
                                    c11 = 3;
                                    break;
                                }
                                break;
                            case 109757538:
                                if (substring.equals(com.anythink.expressad.foundation.d.d.cg)) {
                                    c11 = 0;
                                    break;
                                }
                                break;
                        }
                        if (c11 == 0) {
                            i4 = 0;
                        } else if (c11 == 1 || c11 == 2) {
                            i4 = 1;
                        } else if (c11 != 3) {
                            AbstractC3217fl.I("WebvttCueParser", "Invalid anchor value: ".concat(substring));
                            i4 = Integer.MIN_VALUE;
                        }
                        y32.f28783g = i4;
                        group2 = group2.substring(0, indexOf);
                    }
                    if (group2.endsWith("%")) {
                        y32.f28781e = AbstractC3217fl.r(group2);
                        y32.f28782f = 0;
                    } else {
                        y32.f28781e = Integer.parseInt(group2);
                        y32.f28782f = 1;
                    }
                } else if ("align".equals(group)) {
                    switch (group2.hashCode()) {
                        case -1364013995:
                            if (group2.equals("center")) {
                                c4 = 2;
                                break;
                            }
                            c4 = 65535;
                            break;
                        case -1074341483:
                            if (group2.equals("middle")) {
                                c4 = 3;
                                break;
                            }
                            c4 = 65535;
                            break;
                        case 100571:
                            if (group2.equals("end")) {
                                c4 = 4;
                                break;
                            }
                            c4 = 65535;
                            break;
                        case 3317767:
                            if (group2.equals("left")) {
                                c4 = 1;
                                break;
                            }
                            c4 = 65535;
                            break;
                        case 108511772:
                            if (group2.equals("right")) {
                                c4 = 5;
                                break;
                            }
                            c4 = 65535;
                            break;
                        case 109757538:
                            if (group2.equals(com.anythink.expressad.foundation.d.d.cg)) {
                                c4 = 0;
                                break;
                            }
                            c4 = 65535;
                            break;
                        default:
                            c4 = 65535;
                            break;
                    }
                    if (c4 != 0) {
                        if (c4 != 1) {
                            if (c4 != 2 && c4 != 3) {
                                if (c4 == 4) {
                                    i = 3;
                                } else if (c4 != 5) {
                                    AbstractC3217fl.I("WebvttCueParser", "Invalid alignment value: ".concat(group2));
                                } else {
                                    i = 5;
                                }
                            }
                            i = 2;
                        } else {
                            i = 4;
                        }
                    }
                    y32.f28780d = i;
                } else if (com.anythink.expressad.foundation.g.g.a.b.ab.equals(group)) {
                    int indexOf2 = group2.indexOf(44);
                    if (indexOf2 != -1) {
                        String substring2 = group2.substring(indexOf2 + 1);
                        switch (substring2.hashCode()) {
                            case -1842484672:
                                if (substring2.equals("line-left")) {
                                    c10 = 0;
                                    break;
                                }
                                c10 = 65535;
                                break;
                            case -1364013995:
                                if (substring2.equals("center")) {
                                    c10 = 2;
                                    break;
                                }
                                c10 = 65535;
                                break;
                            case -1276788989:
                                if (substring2.equals("line-right")) {
                                    c10 = 4;
                                    break;
                                }
                                c10 = 65535;
                                break;
                            case -1074341483:
                                if (substring2.equals("middle")) {
                                    c10 = 3;
                                    break;
                                }
                                c10 = 65535;
                                break;
                            case 100571:
                                if (substring2.equals("end")) {
                                    c10 = 5;
                                    break;
                                }
                                c10 = 65535;
                                break;
                            case 109757538:
                                if (substring2.equals(com.anythink.expressad.foundation.d.d.cg)) {
                                    c10 = 1;
                                    break;
                                }
                                c10 = 65535;
                                break;
                            default:
                                c10 = 65535;
                                break;
                        }
                        if (c10 == 0 || c10 == 1) {
                            i = 0;
                        } else if (c10 != 2 && c10 != 3) {
                            if (c10 == 4 || c10 == 5) {
                                i = 2;
                            } else {
                                AbstractC3217fl.I("WebvttCueParser", "Invalid anchor value: ".concat(substring2));
                                i = Integer.MIN_VALUE;
                            }
                        }
                        y32.i = i;
                        group2 = group2.substring(0, indexOf2);
                    }
                    y32.f28784h = AbstractC3217fl.r(group2);
                } else if ("size".equals(group)) {
                    y32.f28785j = AbstractC3217fl.r(group2);
                } else if ("vertical".equals(group)) {
                    int hashCode = group2.hashCode();
                    if (hashCode != 3462) {
                        if (hashCode == 3642 && group2.equals("rl")) {
                            c9 = 0;
                        }
                        c9 = 65535;
                    } else {
                        if (group2.equals("lr")) {
                            c9 = 1;
                        }
                        c9 = 65535;
                    }
                    if (c9 != 0) {
                        if (c9 != 1) {
                            AbstractC3217fl.I("WebvttCueParser", "Invalid 'vertical' value: ".concat(group2));
                            i = Integer.MIN_VALUE;
                        } else {
                            i = 2;
                        }
                    }
                    y32.f28786k = i;
                } else {
                    StringBuilder sb = new StringBuilder(group.length() + 21 + group2.length());
                    sb.append("Unknown cue setting ");
                    sb.append(group);
                    sb.append(":");
                    sb.append(group2);
                    AbstractC3217fl.I("WebvttCueParser", sb.toString());
                }
            } catch (NumberFormatException unused) {
                AbstractC3217fl.I("WebvttCueParser", "Skipping bad cue setting: ".concat(String.valueOf(matcher.group())));
            }
        }
    }

    public static void d(String str, W3 w32, List list, SpannableStringBuilder spannableStringBuilder, List list2) {
        char c4;
        int i;
        int i4;
        int i9;
        int i10 = w32.f28361b;
        int length = spannableStringBuilder.length();
        String str2 = w32.f28360a;
        int hashCode = str2.hashCode();
        int i11 = -1;
        if (hashCode == 0) {
            if (str2.equals("")) {
                c4 = 7;
            }
            c4 = 65535;
        } else if (hashCode == 105) {
            if (str2.equals("i")) {
                c4 = 1;
            }
            c4 = 65535;
        } else if (hashCode == 3314158) {
            if (str2.equals(b.c.f11599j)) {
                c4 = 6;
            }
            c4 = 65535;
        } else if (hashCode == 3511770) {
            if (str2.equals("ruby")) {
                c4 = 2;
            }
            c4 = 65535;
        } else if (hashCode == 98) {
            if (str2.equals("b")) {
                c4 = 0;
            }
            c4 = 65535;
        } else if (hashCode == 99) {
            if (str2.equals("c")) {
                c4 = 4;
            }
            c4 = 65535;
        } else if (hashCode != 117) {
            if (hashCode == 118 && str2.equals("v")) {
                c4 = 5;
            }
            c4 = 65535;
        } else {
            if (str2.equals("u")) {
                c4 = 3;
            }
            c4 = 65535;
        }
        switch (c4) {
            case 0:
                spannableStringBuilder.setSpan(new StyleSpan(1), i10, length, 33);
                break;
            case 1:
                spannableStringBuilder.setSpan(new StyleSpan(2), i10, length, 33);
                break;
            case 2:
                int e6 = e(list2, str, w32);
                ArrayList arrayList = new ArrayList(list.size());
                arrayList.addAll(list);
                Collections.sort(arrayList, C2959b.f29361F);
                int i12 = i10;
                int i13 = 0;
                int i14 = 0;
                while (i13 < arrayList.size()) {
                    if ("rt".equals(((V3) arrayList.get(i13)).f28208a.f28360a)) {
                        V3 v32 = (V3) arrayList.get(i13);
                        int e9 = e(list2, str, v32.f28208a);
                        if (e9 == i11) {
                            e9 = e6 != i11 ? e6 : 1;
                        }
                        int i15 = v32.f28208a.f28361b - i14;
                        int i16 = v32.f28209b - i14;
                        CharSequence subSequence = spannableStringBuilder.subSequence(i15, i16);
                        spannableStringBuilder.delete(i15, i16);
                        spannableStringBuilder.setSpan(new C3969tk(subSequence.toString(), e9), i12, i15, 33);
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
                for (String str3 : w32.f28363d) {
                    Map map = f28961c;
                    if (map.containsKey(str3)) {
                        spannableStringBuilder.setSpan(new ForegroundColorSpan(((Integer) map.get(str3)).intValue()), i10, length, 33);
                    } else {
                        Map map2 = f28962d;
                        if (map2.containsKey(str3)) {
                            spannableStringBuilder.setSpan(new BackgroundColorSpan(((Integer) map2.get(str3)).intValue()), i10, length, 33);
                        }
                    }
                }
                break;
            case 5:
                spannableStringBuilder.setSpan(new C2846Wk(w32.f28362c), i10, length, 33);
                break;
            case 6:
            case 7:
                break;
            default:
                return;
        }
        ArrayList f6 = f(list2, str, w32);
        for (int i17 = 0; i17 < f6.size(); i17++) {
            T3 t32 = ((X3) f6.get(i17)).f28601u;
            int i18 = t32.f27703k;
            if (i18 == -1 && t32.f27704l == -1) {
                i = -1;
            } else {
                i = (t32.f27704l == 1 ? (char) 2 : (char) 0) | (i18 == 1 ? (char) 1 : (char) 0);
            }
            if (i != -1) {
                int i19 = t32.f27703k;
                if (i19 == -1 && t32.f27704l == -1) {
                    i9 = -1;
                    i4 = 1;
                } else {
                    i4 = 1;
                    i9 = (i19 == 1 ? 1 : 0) | (t32.f27704l == 1 ? 2 : 0);
                }
                AbstractC3217fl.n(spannableStringBuilder, new StyleSpan(i9), i10, length);
            } else {
                i4 = 1;
            }
            if (t32.f27702j == i4) {
                spannableStringBuilder.setSpan(new UnderlineSpan(), i10, length, 33);
            }
            if (t32.f27700g) {
                if (!t32.f27700g) {
                    throw new IllegalStateException("Font color not defined");
                }
                AbstractC3217fl.n(spannableStringBuilder, new ForegroundColorSpan(t32.f27699f), i10, length);
            }
            if (t32.i) {
                if (!t32.i) {
                    throw new IllegalStateException("Background color not defined.");
                }
                AbstractC3217fl.n(spannableStringBuilder, new BackgroundColorSpan(t32.f27701h), i10, length);
            }
            if (t32.f27698e != null) {
                AbstractC3217fl.n(spannableStringBuilder, new TypefaceSpan(t32.f27698e), i10, length);
            }
            int i20 = t32.f27705m;
            if (i20 == 1) {
                AbstractC3217fl.n(spannableStringBuilder, new AbsoluteSizeSpan((int) t32.f27706n, true), i10, length);
            } else if (i20 == 2) {
                AbstractC3217fl.n(spannableStringBuilder, new RelativeSizeSpan(t32.f27706n), i10, length);
            } else if (i20 == 3) {
                AbstractC3217fl.n(spannableStringBuilder, new RelativeSizeSpan(t32.f27706n / 100.0f), i10, length);
            }
            if (t32.f27708p) {
                spannableStringBuilder.setSpan(new C3430jk(), i10, length, 33);
            }
        }
    }

    public static int e(List list, String str, W3 w32) {
        ArrayList f6 = f(list, str, w32);
        for (int i = 0; i < f6.size(); i++) {
            int i4 = ((X3) f6.get(i)).f28601u.f27707o;
            if (i4 != -1) {
                return i4;
            }
        }
        return -1;
    }

    public static ArrayList f(List list, String str, W3 w32) {
        int size;
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < list.size(); i++) {
            T3 t32 = (T3) list.get(i);
            String str2 = w32.f28360a;
            if (t32.f27694a.isEmpty() && t32.f27695b.isEmpty() && t32.f27696c.isEmpty() && t32.f27697d.isEmpty()) {
                if (TextUtils.isEmpty(str2)) {
                    size = 1;
                }
                size = 0;
            } else {
                int a9 = T3.a(T3.a(T3.a(0, 1073741824, t32.f27694a, str), 2, t32.f27695b, str2), 4, t32.f27697d, w32.f28362c);
                if (a9 != -1) {
                    if (w32.f28363d.containsAll(t32.f27696c)) {
                        size = a9 + (t32.f27696c.size() * 4);
                    }
                }
                size = 0;
            }
            if (size > 0) {
                arrayList.add(new X3(size, t32));
            }
        }
        Collections.sort(arrayList);
        return arrayList;
    }
}
