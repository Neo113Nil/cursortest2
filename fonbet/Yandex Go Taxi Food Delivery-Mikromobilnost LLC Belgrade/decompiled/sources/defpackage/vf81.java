package defpackage;

import android.text.SpannableStringBuilder;
import android.text.SpannedString;
import android.text.TextUtils;
import android.text.style.AbsoluteSizeSpan;
import android.text.style.BackgroundColorSpan;
import android.text.style.ForegroundColorSpan;
import android.text.style.RelativeSizeSpan;
import android.text.style.StrikethroughSpan;
import android.text.style.StyleSpan;
import android.text.style.TypefaceSpan;
import android.text.style.UnderlineSpan;
import io.appmetrica.analytics.push.coreutils.internal.CoreConstants;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import ru.CryptoPro.JCP.tools.HexString;
import ru.CryptoPro.JCSP.MSCAPI.HProv;

/* loaded from: classes7.dex */
public abstract class vf81 {
    public static final Pattern a = Pattern.compile("^(\\S+)\\s+-->\\s+(\\S+)(.*)?$");
    public static final Pattern b = Pattern.compile("(\\S+?):(\\S+)");
    public static final Map c;
    public static final Map d;

    static {
        HashMap hashMap = new HashMap();
        smw0.s(255, 255, 255, hashMap, "white");
        smw0.s(0, 255, 0, hashMap, "lime");
        smw0.s(0, 255, 255, hashMap, "cyan");
        smw0.s(255, 0, 0, hashMap, "red");
        smw0.s(255, 255, 0, hashMap, "yellow");
        smw0.s(255, 0, 255, hashMap, "magenta");
        smw0.s(0, 0, 255, hashMap, "blue");
        smw0.s(0, 0, 0, hashMap, "black");
        c = Collections.unmodifiableMap(hashMap);
        HashMap hashMap2 = new HashMap();
        smw0.s(255, 255, 255, hashMap2, "bg_white");
        smw0.s(0, 255, 0, hashMap2, "bg_lime");
        smw0.s(0, 255, 255, hashMap2, "bg_cyan");
        smw0.s(255, 0, 0, hashMap2, "bg_red");
        smw0.s(255, 255, 0, hashMap2, "bg_yellow");
        smw0.s(255, 0, 255, hashMap2, "bg_magenta");
        smw0.s(0, 0, 255, hashMap2, "bg_blue");
        smw0.s(0, 0, 0, hashMap2, "bg_black");
        d = Collections.unmodifiableMap(hashMap2);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    public static SpannedString a(String str, String str2, List list) {
        char c2;
        char c3;
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        ArrayDeque arrayDeque = new ArrayDeque();
        ArrayList arrayList = new ArrayList();
        int i = 0;
        while (true) {
            String str3 = "";
            if (i >= str2.length()) {
                while (!arrayDeque.isEmpty()) {
                    c(str, (x581) arrayDeque.pop(), arrayList, spannableStringBuilder, list);
                }
                c(str, new x581("", 0, "", Collections.EMPTY_SET), Collections.EMPTY_LIST, spannableStringBuilder, list);
                return SpannedString.valueOf(spannableStringBuilder);
            }
            char charAt = str2.charAt(i);
            if (charAt == '&') {
                i++;
                int indexOf = str2.indexOf(59, i);
                int indexOf2 = str2.indexOf(32, i);
                if (indexOf == -1) {
                    indexOf = indexOf2;
                } else if (indexOf2 != -1) {
                    indexOf = Math.min(indexOf, indexOf2);
                }
                if (indexOf != -1) {
                    switch (str2.substring(i, indexOf)) {
                        case "gt":
                            spannableStringBuilder.append('>');
                            break;
                        case "lt":
                            spannableStringBuilder.append('<');
                            break;
                        case "amp":
                            spannableStringBuilder.append('&');
                            break;
                        case "nbsp":
                            spannableStringBuilder.append(HexString.CHAR_SPACE);
                            break;
                        default:
                            nba1.e();
                            break;
                    }
                    if (indexOf == indexOf2) {
                        spannableStringBuilder.append((CharSequence) " ");
                    }
                    i = indexOf + 1;
                } else {
                    spannableStringBuilder.append(charAt);
                }
            } else if (charAt != '<') {
                spannableStringBuilder.append(charAt);
                i++;
            } else {
                int i2 = i + 1;
                if (i2 < str2.length()) {
                    boolean z = str2.charAt(i2) == '/';
                    int indexOf3 = str2.indexOf(62, i2);
                    i2 = indexOf3 == -1 ? str2.length() : indexOf3 + 1;
                    int i3 = i2 - 2;
                    boolean z2 = str2.charAt(i3) == '/';
                    int i4 = i + (z ? 2 : 1);
                    if (!z2) {
                        i3 = i2 - 1;
                    }
                    String substring = str2.substring(i4, i3);
                    if (!substring.trim().isEmpty()) {
                        String trim = substring.trim();
                        if (trim.isEmpty()) {
                            w511.q();
                            return null;
                        }
                        int i5 = rf71.a;
                        String str4 = trim.split("[ \\.]", 2)[0];
                        str4.getClass();
                        switch (str4.hashCode()) {
                            case HProv.PP_REBOOT /* 98 */:
                                if (str4.equals("b")) {
                                    c2 = 0;
                                    break;
                                }
                                c2 = 65535;
                                break;
                            case 99:
                                if (str4.equals("c")) {
                                    c2 = 1;
                                    break;
                                }
                                c2 = 65535;
                                break;
                            case 105:
                                if (str4.equals(CoreConstants.PushMessage.SERVICE_TYPE)) {
                                    c2 = 2;
                                    break;
                                }
                                c2 = 65535;
                                break;
                            case HProv.PP_NK_SYNC /* 117 */:
                                if (str4.equals("u")) {
                                    c2 = 3;
                                    break;
                                }
                                c2 = 65535;
                                break;
                            case HProv.PP_INFO /* 118 */:
                                if (str4.equals("v")) {
                                    c2 = 4;
                                    break;
                                }
                                c2 = 65535;
                                break;
                            case 3650:
                                if (str4.equals("rt")) {
                                    c2 = 5;
                                    break;
                                }
                                c2 = 65535;
                                break;
                            case 3314158:
                                if (str4.equals("lang")) {
                                    c2 = 6;
                                    break;
                                }
                                c2 = 65535;
                                break;
                            case 3511770:
                                if (str4.equals("ruby")) {
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
                            case 1:
                            case 2:
                            case 3:
                            case 4:
                            case 5:
                            case 6:
                            case 7:
                                if (z) {
                                    while (!arrayDeque.isEmpty()) {
                                        x581 x581Var = (x581) arrayDeque.pop();
                                        c(str, x581Var, arrayList, spannableStringBuilder, list);
                                        if (arrayDeque.isEmpty()) {
                                            arrayList.clear();
                                        } else {
                                            arrayList.add(new y281(x581Var, spannableStringBuilder.length()));
                                        }
                                        if (x581Var.a.equals(str4)) {
                                        }
                                    }
                                } else if (!z2) {
                                    int length = spannableStringBuilder.length();
                                    String trim2 = substring.trim();
                                    if (trim2.isEmpty()) {
                                        w511.q();
                                        break;
                                    } else {
                                        int indexOf4 = trim2.indexOf(" ");
                                        if (indexOf4 == -1) {
                                            c3 = 0;
                                        } else {
                                            str3 = trim2.substring(indexOf4).trim();
                                            c3 = 0;
                                            trim2 = trim2.substring(0, indexOf4);
                                        }
                                        String[] split = trim2.split("\\.", -1);
                                        String str5 = split[c3];
                                        HashSet hashSet = new HashSet();
                                        for (int i6 = 1; i6 < split.length; i6++) {
                                            hashSet.add(split[i6]);
                                        }
                                        arrayDeque.push(new x581(str5, length, str3, hashSet));
                                    }
                                }
                            default:
                                i = i2;
                                break;
                        }
                        return null;
                    }
                }
                i = i2;
            }
        }
    }

    public static oz71 b(String str, Matcher matcher, dl81 dl81Var, ArrayList arrayList) {
        wc81 wc81Var = new wc81();
        try {
            String group = matcher.group(1);
            group.getClass();
            wc81Var.a = im81.a(group);
            String group2 = matcher.group(2);
            group2.getClass();
            wc81Var.b = im81.a(group2);
            String group3 = matcher.group(3);
            group3.getClass();
            d(group3, wc81Var);
            StringBuilder sb = new StringBuilder();
            String f = dl81Var.f();
            while (!TextUtils.isEmpty(f)) {
                if (sb.length() > 0) {
                    sb.append("\n");
                }
                sb.append(f.trim());
                f = dl81Var.f();
            }
            wc81Var.c = a(str, sb.toString(), arrayList);
            return new oz71(wc81Var.a().a(), wc81Var.a, wc81Var.b);
        } catch (NumberFormatException unused) {
            matcher.group();
            nba1.e();
            return null;
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    public static void c(String str, x581 x581Var, List list, SpannableStringBuilder spannableStringBuilder, List list2) {
        char c2;
        int i;
        int i2;
        int i3;
        ArrayList arrayList;
        int i4;
        int i5 = x581Var.b;
        String str2 = x581Var.c;
        Set<String> set = x581Var.d;
        int length = spannableStringBuilder.length();
        String str3 = x581Var.a;
        str3.getClass();
        switch (str3.hashCode()) {
            case 0:
                if (str3.equals("")) {
                    c2 = 0;
                    break;
                }
                c2 = 65535;
                break;
            case HProv.PP_REBOOT /* 98 */:
                if (str3.equals("b")) {
                    c2 = 1;
                    break;
                }
                c2 = 65535;
                break;
            case 99:
                if (str3.equals("c")) {
                    c2 = 2;
                    break;
                }
                c2 = 65535;
                break;
            case 105:
                if (str3.equals(CoreConstants.PushMessage.SERVICE_TYPE)) {
                    c2 = 3;
                    break;
                }
                c2 = 65535;
                break;
            case HProv.PP_NK_SYNC /* 117 */:
                if (str3.equals("u")) {
                    c2 = 4;
                    break;
                }
                c2 = 65535;
                break;
            case HProv.PP_INFO /* 118 */:
                if (str3.equals("v")) {
                    c2 = 5;
                    break;
                }
                c2 = 65535;
                break;
            case 3314158:
                if (str3.equals("lang")) {
                    c2 = 6;
                    break;
                }
                c2 = 65535;
                break;
            case 3511770:
                if (str3.equals("ruby")) {
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
            case 6:
                break;
            case 1:
                spannableStringBuilder.setSpan(new StyleSpan(1), i5, length, 33);
                break;
            case 2:
                for (String str4 : set) {
                    Map map = c;
                    if (map.containsKey(str4)) {
                        spannableStringBuilder.setSpan(new ForegroundColorSpan(((Integer) map.get(str4)).intValue()), i5, length, 33);
                    } else {
                        Map map2 = d;
                        if (map2.containsKey(str4)) {
                            spannableStringBuilder.setSpan(new BackgroundColorSpan(((Integer) map2.get(str4)).intValue()), i5, length, 33);
                        }
                    }
                }
                break;
            case 3:
                spannableStringBuilder.setSpan(new StyleSpan(2), i5, length, 33);
                break;
            case 4:
                spannableStringBuilder.setSpan(new UnderlineSpan(), i5, length, 33);
                break;
            case 7:
                ArrayList arrayList2 = new ArrayList();
                for (int i6 = 0; i6 < list2.size(); i6++) {
                    kw71 kw71Var = (kw71) list2.get(i6);
                    int a2 = kw71Var.a(str, str3, str2, set);
                    if (a2 > 0) {
                        arrayList2.add(new l981(a2, kw71Var));
                    }
                }
                Collections.sort(arrayList2);
                for (int i7 = 0; i7 < arrayList2.size() && ((l981) arrayList2.get(i7)).b.p == -1; i7++) {
                }
                ArrayList arrayList3 = new ArrayList(list.size());
                arrayList3.addAll(list);
                Collections.sort(arrayList3, y281.c);
                int i8 = x581Var.b;
                int i9 = 0;
                int i10 = 0;
                while (i9 < arrayList3.size()) {
                    if ("rt".equals(((y281) arrayList3.get(i9)).a.a)) {
                        y281 y281Var = (y281) arrayList3.get(i9);
                        x581 x581Var2 = y281Var.a;
                        ArrayList arrayList4 = new ArrayList();
                        arrayList = arrayList3;
                        int i11 = 0;
                        while (i11 < list2.size()) {
                            kw71 kw71Var2 = (kw71) list2.get(i11);
                            int i12 = i9;
                            int i13 = i10;
                            int i14 = i11;
                            int a3 = kw71Var2.a(str, x581Var2.a, x581Var2.c, x581Var2.d);
                            if (a3 > 0) {
                                arrayList4.add(new l981(a3, kw71Var2));
                            }
                            i11 = i14 + 1;
                            i9 = i12;
                            i10 = i13;
                        }
                        i4 = i9;
                        int i15 = i10;
                        Collections.sort(arrayList4);
                        for (int i16 = 0; i16 < arrayList4.size() && ((l981) arrayList4.get(i16)).b.p == -1; i16++) {
                        }
                        int i17 = y281Var.a.b - i15;
                        int i18 = y281Var.b - i15;
                        CharSequence subSequence = spannableStringBuilder.subSequence(i17, i18);
                        spannableStringBuilder.delete(i17, i18);
                        subSequence.toString();
                        spannableStringBuilder.setSpan(new cb71(), i8, i17, 33);
                        i10 = subSequence.length() + i15;
                        i8 = i17;
                    } else {
                        arrayList = arrayList3;
                        i4 = i9;
                    }
                    i9 = i4 + 1;
                    arrayList3 = arrayList;
                }
                break;
            default:
                return;
        }
        ArrayList arrayList5 = new ArrayList();
        for (int i19 = 0; i19 < list2.size(); i19++) {
            kw71 kw71Var3 = (kw71) list2.get(i19);
            int a4 = kw71Var3.a(str, str3, str2, set);
            if (a4 > 0) {
                arrayList5.add(new l981(a4, kw71Var3));
            }
        }
        Collections.sort(arrayList5);
        for (int i20 = 0; i20 < arrayList5.size(); i20++) {
            kw71 kw71Var4 = ((l981) arrayList5.get(i20)).b;
            int i21 = kw71Var4.l;
            if (((i21 == -1 && kw71Var4.m == -1) ? -1 : (i21 == 1 ? (char) 1 : (char) 0) | (kw71Var4.m == 1 ? (char) 2 : (char) 0)) != -1) {
                int i22 = kw71Var4.l;
                if (i22 == -1 && kw71Var4.m == -1) {
                    i3 = -1;
                    i = 1;
                } else {
                    i = 1;
                    i3 = (i22 == 1 ? 1 : 0) | (kw71Var4.m == 1 ? 2 : 0);
                }
                vaa1.b(spannableStringBuilder, new StyleSpan(i3), i5, length);
            } else {
                i = 1;
            }
            if (kw71Var4.j == i) {
                i2 = 33;
                spannableStringBuilder.setSpan(new StrikethroughSpan(), i5, length, 33);
            } else {
                i2 = 33;
            }
            if (kw71Var4.k == i) {
                spannableStringBuilder.setSpan(new UnderlineSpan(), i5, length, i2);
            }
            if (kw71Var4.g) {
                if (!kw71Var4.g) {
                    ny61.r("Font color not defined");
                    return;
                }
                vaa1.b(spannableStringBuilder, new ForegroundColorSpan(kw71Var4.f), i5, length);
            }
            if (kw71Var4.i) {
                if (!kw71Var4.i) {
                    ny61.r("Background color not defined.");
                    return;
                }
                vaa1.b(spannableStringBuilder, new BackgroundColorSpan(kw71Var4.h), i5, length);
            }
            if (kw71Var4.e != null) {
                vaa1.b(spannableStringBuilder, new TypefaceSpan(kw71Var4.e), i5, length);
            }
            int i23 = kw71Var4.n;
            if (i23 == 1) {
                vaa1.b(spannableStringBuilder, new AbsoluteSizeSpan((int) kw71Var4.o, true), i5, length);
            } else if (i23 == 2) {
                vaa1.b(spannableStringBuilder, new RelativeSizeSpan(kw71Var4.o), i5, length);
            } else if (i23 == 3) {
                vaa1.b(spannableStringBuilder, new RelativeSizeSpan(kw71Var4.o / 100.0f), i5, length);
            }
            if (kw71Var4.q) {
                spannableStringBuilder.setSpan(new j081(), i5, length, 33);
            }
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:60:0x00c1, code lost:
    
        if (r6.equals("start") == false) goto L55;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static void d(String str, wc81 wc81Var) {
        int i;
        int i2;
        Matcher matcher = b.matcher(str);
        while (matcher.find()) {
            int i3 = 1;
            String group = matcher.group(1);
            group.getClass();
            String group2 = matcher.group(2);
            group2.getClass();
            try {
                if ("line".equals(group)) {
                    e(group2, wc81Var);
                } else {
                    char c2 = 5;
                    if ("align".equals(group)) {
                        switch (group2) {
                            case "center":
                            case "middle":
                                i3 = 2;
                                break;
                            case "end":
                                i3 = 3;
                                break;
                            case "left":
                                i3 = 4;
                                break;
                            case "right":
                                i3 = 5;
                                break;
                            case "start":
                                break;
                            default:
                                nba1.e();
                                i3 = 2;
                                break;
                        }
                        wc81Var.d = i3;
                    } else if ("position".equals(group)) {
                        int indexOf = group2.indexOf(44);
                        if (indexOf != -1) {
                            String substring = group2.substring(indexOf + 1);
                            switch (substring.hashCode()) {
                                case -1842484672:
                                    if (substring.equals("line-left")) {
                                        c2 = 0;
                                        break;
                                    }
                                    c2 = 65535;
                                    break;
                                case -1364013995:
                                    if (substring.equals("center")) {
                                        c2 = 1;
                                        break;
                                    }
                                    c2 = 65535;
                                    break;
                                case -1276788989:
                                    if (substring.equals("line-right")) {
                                        c2 = 2;
                                        break;
                                    }
                                    c2 = 65535;
                                    break;
                                case -1074341483:
                                    if (substring.equals("middle")) {
                                        c2 = 3;
                                        break;
                                    }
                                    c2 = 65535;
                                    break;
                                case 100571:
                                    if (substring.equals("end")) {
                                        c2 = 4;
                                        break;
                                    }
                                    c2 = 65535;
                                    break;
                                case 109757538:
                                    break;
                                default:
                                    c2 = 65535;
                                    break;
                            }
                            switch (c2) {
                                case 0:
                                case 5:
                                    i = 0;
                                    break;
                                case 1:
                                case 3:
                                    i = 1;
                                    break;
                                case 2:
                                case 4:
                                    i = 2;
                                    break;
                                default:
                                    nba1.e();
                                    i = Integer.MIN_VALUE;
                                    break;
                            }
                            wc81Var.i = i;
                            group2 = group2.substring(0, indexOf);
                        }
                        int i4 = im81.a;
                        if (!group2.endsWith("%")) {
                            throw new NumberFormatException("Percentages must end with %");
                        }
                        wc81Var.h = Float.parseFloat(group2.substring(0, group2.length() - 1)) / 100.0f;
                    } else if ("size".equals(group)) {
                        int i5 = im81.a;
                        if (!group2.endsWith("%")) {
                            throw new NumberFormatException("Percentages must end with %");
                        }
                        wc81Var.j = Float.parseFloat(group2.substring(0, group2.length() - 1)) / 100.0f;
                    } else if ("vertical".equals(group)) {
                        if (group2.equals("lr")) {
                            i2 = 2;
                        } else if (group2.equals("rl")) {
                            i2 = 1;
                        } else {
                            nba1.e();
                            i2 = Integer.MIN_VALUE;
                        }
                        wc81Var.k = i2;
                    } else {
                        nba1.e();
                    }
                }
            } catch (NumberFormatException unused) {
                matcher.group();
                nba1.e();
            }
        }
    }

    public static void e(String str, wc81 wc81Var) {
        int i;
        int indexOf = str.indexOf(44);
        if (indexOf != -1) {
            i = 2;
            switch (str.substring(indexOf + 1)) {
                case "center":
                case "middle":
                    i = 1;
                    break;
                case "end":
                    break;
                case "start":
                    i = 0;
                    break;
                default:
                    nba1.e();
                    i = Integer.MIN_VALUE;
                    break;
            }
            wc81Var.g = i;
            str = str.substring(0, indexOf);
        }
        if (!str.endsWith("%")) {
            wc81Var.e = Integer.parseInt(str);
            wc81Var.f = 1;
            return;
        }
        int i2 = im81.a;
        if (!str.endsWith("%")) {
            throw new NumberFormatException("Percentages must end with %");
        }
        wc81Var.e = Float.parseFloat(str.substring(0, str.length() - 1)) / 100.0f;
        wc81Var.f = 0;
    }
}
