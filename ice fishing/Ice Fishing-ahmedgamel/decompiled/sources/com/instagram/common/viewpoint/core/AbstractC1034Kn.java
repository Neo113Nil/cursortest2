package com.instagram.common.viewpoint.core;

import android.graphics.Color;
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
import com.anythink.basead.b.b.j;
import com.anythink.basead.exoplayer.k.p;
import com.anythink.basead.ui.BaseATView;
import com.anythink.core.common.n.b.a.c.k;
import com.anythink.core.common.s.a.c;
import com.anythink.expressad.video.module.a.a;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* renamed from: com.facebook.ads.redexgen.X.Kn, reason: case insensitive filesystem */
/* loaded from: assets/audience_network/classes2.dex */
public abstract class AbstractC1034Kn {
    public static byte[] A00;
    public static String[] A01 = {"6VJGxYRVGzkOFylAWqo", "TQDRStRjVTcp84EAqriMHD1W", "Y0YMWliml1c9R0RakThzWHnpZrTCSrBu", "hjS3TiOTsIfHHkhXtOFrFHFAaycKEbQY", "GvjOo5wC83Psjizly91M8Dr7lGNbFkes", "VFbjP0ZwmY6IK0pKGb7V8NSJj5u1SgyV", "T0F9FjreghpLds1JHOV1Zh8xCqpA0ysb", "F9ZBXP7xE9Rr53rKOaE"};
    public static final Pattern A02;
    public static final Map<String, Integer> A03;
    public static final Map<String, Integer> A04;
    public static final Pattern A05;

    /* JADX WARN: Failed to parse debug info
    java.lang.ArrayIndexOutOfBoundsException
     */
    public static int A06(List<C1022Kb> list, String str, C1030Kj c1030Kj) {
        List<C1031Kk> A0E = A0E(list, str, c1030Kj);
        for (int i = 0; i < A0E.size(); i++) {
            C1022Kb c1022Kb = A0E.get(i).A01;
            if (c1022Kb.A07() != -1) {
                return c1022Kb.A07();
            }
        }
        return -1;
    }

    /* JADX WARN: Code restructure failed: missing block: B:23:0x007e, code lost:
    
        if (r10 != false) goto L25;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x0080, code lost:
    
        r0 = r4 - 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:62:0x0094, code lost:
    
        r0 = r4 - 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:63:0x0091, code lost:
    
        if (r10 != false) goto L25;
     */
    /* JADX WARN: Failed to parse debug info
    java.lang.ArrayIndexOutOfBoundsException
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static SpannedString A07(String str, String str2, List<C1022Kb> list) {
        int i;
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        ArrayDeque arrayDeque = new ArrayDeque();
        int i6 = 0;
        ArrayList arrayList = new ArrayList();
        while (true) {
            int length = str2.length();
            if (A01[3].charAt(21) == 'Z') {
                throw new RuntimeException();
            }
            A01[5] = "AeTA9zfG0TGme9BEKFHCyzeTODloAdj0";
            if (i6 >= length) {
                while (!arrayDeque.isEmpty()) {
                    A0K(str, (C1030Kj) arrayDeque.pop(), arrayList, spannableStringBuilder, list);
                }
                A0K(str, C1030Kj.A00(), Collections.emptyList(), spannableStringBuilder, list);
                return SpannedString.valueOf(spannableStringBuilder);
            }
            char charAt = str2.charAt(i6);
            switch (charAt) {
                case j.f5806M /* 38 */:
                    int indexOf = str2.indexOf(59, i6 + 1);
                    int indexOf2 = str2.indexOf(32, i6 + 1);
                    if (indexOf == -1) {
                        indexOf = indexOf2;
                    } else if (indexOf2 != -1) {
                        indexOf = Math.min(indexOf, indexOf2);
                    }
                    if (indexOf == -1) {
                        spannableStringBuilder.append(charAt);
                        i6++;
                        break;
                    } else {
                        A0J(str2.substring(i6 + 1, indexOf), spannableStringBuilder);
                        if (indexOf == indexOf2) {
                            spannableStringBuilder.append((CharSequence) A0C(1, 1, 38));
                        }
                        i6 = indexOf + 1;
                        break;
                    }
                case '<':
                    if (i6 + 1 < str2.length()) {
                        int i9 = i6;
                        boolean z3 = str2.charAt(i9 + 1) == '/';
                        i6 = A05(str2, i9 + 1);
                        boolean z6 = str2.charAt(i6 + (-2)) == '/';
                        int i10 = (z3 ? 2 : 1) + i9;
                        if (A01[1].length() != 9) {
                            String[] strArr = A01;
                            strArr[2] = "RmddLkS1dXQ96i0rYlSMmYhsPXo1tsUj";
                            strArr[6] = "bXvTM6kBQx9RsuQ7PFPuWtENxJrNvh3v";
                            break;
                        }
                        String substring = str2.substring(i10, i);
                        if (!substring.trim().isEmpty()) {
                            String A0D = A0D(substring);
                            if (!A0O(A0D)) {
                                break;
                            } else if (!z3) {
                                if (!z6) {
                                    int length2 = spannableStringBuilder.length();
                                    if (A01[4].charAt(3) == 'a') {
                                        arrayDeque.push(C1030Kj.A01(substring, length2));
                                        break;
                                    } else {
                                        String[] strArr2 = A01;
                                        strArr2[0] = "wdDtpexUk8e3MYkSHhs";
                                        strArr2[7] = "WrocTxwzP1SCyFuF7cP";
                                        arrayDeque.push(C1030Kj.A01(substring, length2));
                                        break;
                                    }
                                } else {
                                    break;
                                }
                            } else {
                                while (!arrayDeque.isEmpty()) {
                                    C1030Kj c1030Kj = (C1030Kj) arrayDeque.pop();
                                    A0K(str, c1030Kj, arrayList, spannableStringBuilder, list);
                                    if (!arrayDeque.isEmpty()) {
                                        arrayList.add(new C1029Ki(c1030Kj, spannableStringBuilder.length()));
                                    } else if (A01[1].length() != 9) {
                                        A01[3] = "6LBQPk5FkDk3NWAQRRtmrnBQ3lB0BSgu";
                                        arrayList.clear();
                                    } else {
                                        arrayList.clear();
                                    }
                                    if (c1030Kj.A01.equals(A0D)) {
                                        break;
                                    }
                                }
                                break;
                            }
                        } else {
                            break;
                        }
                    } else {
                        i6++;
                        break;
                    }
                default:
                    spannableStringBuilder.append(charAt);
                    i6++;
                    break;
            }
        }
    }

    /* JADX WARN: Failed to parse debug info
    java.lang.ArrayIndexOutOfBoundsException
     */
    public static C1026Kf A0A(C06474v c06474v, List<C1022Kb> list) {
        String A0T = c06474v.A0T();
        if (A0T == null) {
            return null;
        }
        Matcher matcher = A02.matcher(A0T);
        if (matcher.matches()) {
            return A0B(null, matcher, c06474v, list);
        }
        String A0T2 = c06474v.A0T();
        if (A0T2 == null) {
            return null;
        }
        Matcher matcher2 = A02.matcher(A0T2);
        if (matcher2.matches()) {
            return A0B(A0T.trim(), matcher2, c06474v, list);
        }
        return null;
    }

    public static String A0C(int i, int i6, int i9) {
        byte[] copyOfRange = Arrays.copyOfRange(A00, i, i + i6);
        for (int i10 = 0; i10 < copyOfRange.length; i10++) {
            copyOfRange[i10] = (byte) ((copyOfRange[i10] ^ i9) ^ 6);
        }
        return new String(copyOfRange);
    }

    public static void A0F() {
        A00 = new byte[]{81, 0, 85, 68, 48, c.f16318c, 71, 83, 69, 86, 68, 48, c.f16318c, 71, 69, 0, 106, 118, 51, 20, 12, 27, 22, 19, 30, 90, 93, 12, 31, 8, 14, 19, 25, 27, 22, 93, 90, 12, 27, 22, 15, 31, c.f16317b, 90, c.f16318c, 24, 0, 23, 26, 31, 18, 86, 23, 26, 31, 17, 24, 27, 19, 24, 2, 86, 0, 23, 26, 3, 19, 76, 86, 82, 117, 109, 122, 119, 114, Byte.MAX_VALUE, 59, 122, 117, 120, 115, 116, 105, 59, 109, 122, 119, 110, 126, 33, 59, 46, 22, 20, 13, 13, 20, 19, 26, 93, 31, 28, 25, 93, 30, 8, 24, 93, 14, 24, 9, 9, 20, 19, 26, 71, 93, c.f16318c, 7, 5, 28, 28, 5, 2, 11, 76, 15, 25, 9, 76, 27, 5, 24, 4, 76, 14, 13, 8, 76, 4, 9, 13, 8, 9, 30, 86, 76, 53, 14, 11, 14, 15, 23, 14, c.f16317b, 3, 21, 5, c.f16317b, 19, 5, 20, 20, 9, 14, 7, c.f16317b, 10, 56, c.f16318c, 43, 41, 41, 30, 40, 56, 13, 60, 47, 46, 56, 47, 40, 83, 47, 93, 46, 123, 13, 121, 118, 14, 12, 121, 86, 14, 8, 8, 27, 121, 86, 14, 13, 121, 118, 14, 12, 13, 11, 15, 12, 26, 1, 81, 92, 89, 87, 94, 10, 6, 27, 45, 93, 88, 96, 93, 83, 94, 92, 84, 4, 1, 57, 4, 10, 19, 3, 119, 114, 74, 118, 108, 116, 123, 118, 115, 75, 120, 125, 121, 113, 7, 2, 58, 8, 4, 2, 0, 11, 17, 4, 39, 34, 26, 55, 32, 33, c.f16317b, 69, 125, 85, 74, 75, 86, 71, 91, 94, 102, c.f16317b, 92, 85, 85, 86, 78, 6, 8, 5, 7, 15, 15, 1, 24, 8, 7, 101, 99, 104, 114, 99, 116, 7, 29, 5, 10, 117, 126, 116, 65, 82, 0, 3, 13, 4, 5, 24, 3, 4, 13, 74, 31, 4, 25, 31, 26, 26, 5, 24, 30, 15, 14, 74, 15, 4, 30, 3, 30, 19, 80, 74, 77, 76, 90, 87, 88, 81, 69, 76, 79, 93, 107, 110, 106, 98, 65, 68, 67, 72, 35, 38, 33, 42, 98, 35, 42, 41, 59, 113, 116, 115, 120, 48, 111, 116, 122, 117, 105, 106, 116, 113, 105, 79, 67, 69, 71, 76, 86, 67, 5, 1, 12, 12, 4, 13, 53, 57, 40, 43, 29, 2, 30, 4, 25, 4, 2, 3, 73, 94, 95, 84, 79, 65, 78, 82, 37, 59, 69, 67, 7, 0, 23, 12, 86, 76, 95, c.f16317b, 0, 7, 18, 1, 7, 110, 124, 44, c.f16318c, 40, 46, 51, 57, 59, 54, 68, 91, 90, 71, 86, 52, 40, 33, 33, 34, 58};
    }

    /* JADX WARN: Failed to parse debug info
    java.lang.ArrayIndexOutOfBoundsException
     */
    public static void A0H(SpannableStringBuilder spannableStringBuilder, String str, C1030Kj c1030Kj, List<C1029Ki> list, List<C1022Kb> list2) {
        C1030Kj c1030Kj2;
        C1030Kj c1030Kj3;
        C1030Kj c1030Kj4;
        int i;
        int A06 = A06(list2, str, c1030Kj);
        ArrayList arrayList = new ArrayList(list.size());
        arrayList.addAll(list);
        Collections.sort(arrayList, C1029Ki.A03());
        int i6 = 0;
        int i9 = c1030Kj.A00;
        for (int i10 = 0; i10 < arrayList.size(); i10++) {
            c1030Kj2 = ((C1029Ki) arrayList.get(i10)).A01;
            if (A0C(415, 2, 49).equals(c1030Kj2.A01)) {
                C1029Ki c1029Ki = (C1029Ki) arrayList.get(i10);
                c1030Kj3 = c1029Ki.A01;
                int A002 = A00(A06(list2, str, c1030Kj3), A06, 1);
                c1030Kj4 = c1029Ki.A01;
                int i11 = c1030Kj4.A00 - i6;
                i = c1029Ki.A00;
                int i12 = i - i6;
                CharSequence subSequence = spannableStringBuilder.subSequence(i11, i12);
                spannableStringBuilder.delete(i11, i12);
                spannableStringBuilder.setSpan(new C2346pP(subSequence.toString(), A002), i9, i11, 33);
                i6 += subSequence.length();
                i9 = i11;
            }
        }
    }

    static {
        A0F();
        A02 = Pattern.compile(A0C(187, 26, 35));
        A05 = Pattern.compile(A0C(3, 12, 106));
        HashMap hashMap = new HashMap();
        hashMap.put(A0C(440, 5, 53), Integer.valueOf(Color.rgb(p.f8473b, p.f8473b, p.f8473b)));
        hashMap.put(A0C(349, 4, 1), Integer.valueOf(Color.rgb(0, p.f8473b, 0)));
        hashMap.put(A0C(300, 4, 98), Integer.valueOf(Color.rgb(0, p.f8473b, p.f8473b)));
        hashMap.put(A0C(405, 3, 61), Integer.valueOf(Color.rgb(p.f8473b, 0, 0)));
        hashMap.put(A0C(445, 6, 75), Integer.valueOf(Color.rgb(p.f8473b, p.f8473b, 0)));
        hashMap.put(A0C(380, 7, 36), Integer.valueOf(Color.rgb(p.f8473b, 0, p.f8473b)));
        hashMap.put(A0C(289, 4, 107), Integer.valueOf(Color.rgb(0, 0, p.f8473b)));
        hashMap.put(A0C(284, 5, 98), Integer.valueOf(Color.rgb(0, 0, 0)));
        Map<String, Integer> defaultColors = Collections.unmodifiableMap(hashMap);
        A04 = defaultColors;
        HashMap hashMap2 = new HashMap();
        hashMap2.put(A0C(267, 8, 36), Integer.valueOf(Color.rgb(p.f8473b, p.f8473b, p.f8473b)));
        hashMap2.put(A0C(244, 7, 18), Integer.valueOf(Color.rgb(0, p.f8473b, 0)));
        hashMap2.put(A0C(237, 7, 19), Integer.valueOf(Color.rgb(0, p.f8473b, p.f8473b)));
        hashMap2.put(A0C(261, 6, 67), Integer.valueOf(Color.rgb(p.f8473b, 0, 0)));
        hashMap2.put(A0C(275, 9, 63), Integer.valueOf(Color.rgb(p.f8473b, p.f8473b, 0)));
        hashMap2.put(A0C(251, 10, 99), Integer.valueOf(Color.rgb(p.f8473b, 0, p.f8473b)));
        hashMap2.put(A0C(230, 7, 96), Integer.valueOf(Color.rgb(0, 0, p.f8473b)));
        hashMap2.put(A0C(222, 8, 57), Integer.valueOf(Color.rgb(0, 0, 0)));
        Map<String, Integer> defaultBackgroundColors = Collections.unmodifiableMap(hashMap2);
        A03 = defaultBackgroundColors;
    }

    public static int A00(int i, int i6, int i9) {
        if (i != -1) {
            return i;
        }
        if (i6 != -1) {
            return i6;
        }
        if (i9 != -1) {
            return i9;
        }
        throw new IllegalArgumentException();
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0093 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:5:0x000e  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0091 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0092 A[RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static int A01(String str) {
        char c9;
        switch (str.hashCode()) {
            case -1364013995:
                if (str.equals(A0C(294, 6, 0))) {
                    c9 = 1;
                    switch (c9) {
                        case 0:
                            return 0;
                        case 1:
                        case 2:
                            return 1;
                        case 3:
                            return 2;
                        default:
                            AbstractC06324g.A07(A0C(167, 15, 91), A0C(69, 22, 29) + str);
                            return Integer.MIN_VALUE;
                    }
                }
                c9 = 65535;
                switch (c9) {
                }
            case -1074341483:
                if (A01[1].length() == 9) {
                    throw new RuntimeException();
                }
                A01[4] = "zDr3pXiReOD9C2voGl4pNyTssnTsthj2";
                if (str.equals(A0C(387, 6, 110))) {
                    c9 = 2;
                    switch (c9) {
                    }
                }
                c9 = 65535;
                switch (c9) {
                }
            case 100571:
                if (str.equals(A0C(BaseATView.a.f9778O, 3, 22))) {
                    c9 = 3;
                    switch (c9) {
                    }
                }
                c9 = 65535;
                switch (c9) {
                }
            case 109757538:
                if (str.equals(A0C(425, 5, 117))) {
                    c9 = 0;
                    switch (c9) {
                    }
                }
                c9 = 65535;
                switch (c9) {
                }
            default:
                c9 = 65535;
                switch (c9) {
                }
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    public static int A02(String str) {
        char c9;
        switch (str.hashCode()) {
            case -1842484672:
                if (str.equals(A0C(357, 9, 73))) {
                    c9 = 0;
                    break;
                }
                c9 = 65535;
                break;
            case -1364013995:
                if (str.equals(A0C(294, 6, 0))) {
                    c9 = 2;
                    break;
                }
                c9 = 65535;
                break;
            case -1276788989:
                if (str.equals(A0C(366, 10, 27))) {
                    c9 = 4;
                    break;
                }
                c9 = 65535;
                break;
            case -1074341483:
                if (str.equals(A0C(387, 6, 110))) {
                    c9 = 3;
                    break;
                }
                c9 = 65535;
                break;
            case 100571:
                if (str.equals(A0C(BaseATView.a.f9778O, 3, 22))) {
                    c9 = 5;
                    break;
                }
                c9 = 65535;
                break;
            case 109757538:
                if (str.equals(A0C(425, 5, 117))) {
                    c9 = 1;
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
            case 1:
                return 0;
            case 2:
            case 3:
                return 1;
            case 4:
            case 5:
                return 2;
            default:
                AbstractC06324g.A07(A0C(167, 15, 91), A0C(69, 22, 29) + str);
                return Integer.MIN_VALUE;
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    public static int A03(String str) {
        char c9;
        switch (str.hashCode()) {
            case -1364013995:
                if (str.equals(A0C(294, 6, 0))) {
                    c9 = 2;
                    break;
                }
                c9 = 65535;
                break;
            case -1074341483:
                if (str.equals(A0C(387, 6, 110))) {
                    c9 = 3;
                    break;
                }
                c9 = 65535;
                break;
            case 100571:
                if (str.equals(A0C(BaseATView.a.f9778O, 3, 22))) {
                    c9 = 4;
                    break;
                }
                c9 = 65535;
                break;
            case 3317767:
                if (str.equals(A0C(345, 4, 47))) {
                    c9 = 1;
                    break;
                }
                c9 = 65535;
                break;
            case 108511772:
                if (str.equals(A0C(408, 5, 32))) {
                    c9 = 5;
                    break;
                }
                c9 = 65535;
                break;
            case 109757538:
                if (str.equals(A0C(425, 5, 117))) {
                    c9 = 0;
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
                return 1;
            case 1:
                return 4;
            case 2:
            case 3:
                return 2;
            case 4:
                return 3;
            case 5:
                return 5;
            default:
                AbstractC06324g.A07(A0C(167, 15, 91), A0C(44, 25, 112) + str);
                return 2;
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    public static int A04(String str) {
        char c9;
        switch (str.hashCode()) {
            case 3462:
                if (str.equals(A0C(376, 2, 0))) {
                    c9 = 1;
                    break;
                }
                c9 = 65535;
                break;
            case 3642:
                if (str.equals(A0C(413, 2, 81))) {
                    c9 = 0;
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
                return 1;
            case 1:
                return 2;
            default:
                AbstractC06324g.A07(A0C(167, 15, 91), A0C(18, 26, 124) + str);
                return Integer.MIN_VALUE;
        }
    }

    public static int A05(String str, int i) {
        int indexOf = str.indexOf(62, i);
        if (indexOf == -1) {
            int index = str.length();
            return index;
        }
        int index2 = indexOf + 1;
        return index2;
    }

    public static C06143o A08(String str) {
        C1033Km builder = new C1033Km();
        A0L(str, builder);
        return builder.A07();
    }

    public static C2350pT A09(CharSequence charSequence) {
        C1033Km infoBuilder = new C1033Km();
        infoBuilder.A0A = charSequence;
        return infoBuilder.A07().A0H();
    }

    public static C1026Kf A0B(String str, Matcher matcher, C06474v c06474v, List<C1022Kb> list) {
        C1033Km c1033Km = new C1033Km();
        try {
            c1033Km.A09 = AbstractC1035Ko.A01((String) AbstractC06243y.A01(matcher.group(1)));
            c1033Km.A08 = AbstractC1035Ko.A01((String) AbstractC06243y.A01(matcher.group(2)));
            A0L((String) AbstractC06243y.A01(matcher.group(3)), c1033Km);
            StringBuilder sb = new StringBuilder();
            String A0T = c06474v.A0T();
            while (true) {
                boolean isEmpty = TextUtils.isEmpty(A0T);
                if (A01[5].charAt(2) == 'h') {
                    throw new RuntimeException();
                }
                A01[1] = "2AwiW2AhFaTR";
                if (!isEmpty) {
                    if (sb.length() > 0) {
                        sb.append(A0C(0, 1, 93));
                    }
                    sb.append(A0T.trim());
                    A0T = c06474v.A0T();
                } else {
                    c1033Km.A0A = A07(str, sb.toString(), list);
                    return c1033Km.A08();
                }
            }
        } catch (NumberFormatException unused) {
            AbstractC06324g.A07(A0C(167, 15, 91), A0C(117, 30, 106) + matcher.group());
            return null;
        }
    }

    public static String A0D(String str) {
        String trim = str.trim();
        AbstractC06243y.A07(!trim.isEmpty());
        return C5C.A1P(trim, A0C(182, 5, 117))[0];
    }

    public static List<C1031Kk> A0E(List<C1022Kb> list, String str, C1030Kj c1030Kj) {
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < list.size(); i++) {
            C1022Kb c1022Kb = list.get(i);
            int i6 = c1022Kb.A09(str, c1030Kj.A01, c1030Kj.A03, c1030Kj.A02);
            if (i6 > 0) {
                arrayList.add(new C1031Kk(i6, c1022Kb));
            }
        }
        Collections.sort(arrayList);
        if (A01[3].charAt(21) == 'Z') {
            throw new RuntimeException();
        }
        A01[3] = "10DtqaDx3Mjis7pngfRsmCfeCaw0vB2Q";
        return arrayList;
    }

    public static void A0G(SpannableStringBuilder spannableStringBuilder, C1022Kb c1022Kb, int i, int i6) {
        if (c1022Kb == null) {
            return;
        }
        if (c1022Kb.A08() != -1) {
            AbstractC06193t.A00(spannableStringBuilder, new StyleSpan(c1022Kb.A08()), i, i6, 33);
        }
        if (c1022Kb.A0S()) {
            spannableStringBuilder.setSpan(new StrikethroughSpan(), i, i6, 33);
        }
        boolean A0T = c1022Kb.A0T();
        if (A01[3].charAt(21) != 'Z') {
            A01[3] = "1YLI45HvZzSZe2yut9V0MUcCwjpGC5gE";
            if (A0T) {
                spannableStringBuilder.setSpan(new UnderlineSpan(), i, i6, 33);
            }
            if (c1022Kb.A0R()) {
                AbstractC06193t.A00(spannableStringBuilder, new ForegroundColorSpan(c1022Kb.A05()), i, i6, 33);
            }
            if (c1022Kb.A0Q()) {
                AbstractC06193t.A00(spannableStringBuilder, new BackgroundColorSpan(c1022Kb.A04()), i, i6, 33);
            }
            if (c1022Kb.A0K() != null) {
                AbstractC06193t.A00(spannableStringBuilder, new TypefaceSpan(c1022Kb.A0K()), i, i6, 33);
            }
            switch (c1022Kb.A06()) {
                case 1:
                    AbstractC06193t.A00(spannableStringBuilder, new AbsoluteSizeSpan((int) c1022Kb.A03(), true), i, i6, 33);
                    break;
                case 2:
                    AbstractC06193t.A00(spannableStringBuilder, new RelativeSizeSpan(c1022Kb.A03()), i, i6, 33);
                    break;
                case 3:
                    AbstractC06193t.A00(spannableStringBuilder, new RelativeSizeSpan(c1022Kb.A03() / 100.0f), i, i6, 33);
                    break;
            }
            if (c1022Kb.A0P()) {
                spannableStringBuilder.setSpan(new C2347pQ(), i, i6, 33);
                return;
            }
            return;
        }
        throw new RuntimeException();
    }

    public static void A0I(SpannableStringBuilder spannableStringBuilder, Set<String> set, int i, int i6) {
        for (String str : set) {
            boolean containsKey = A04.containsKey(str);
            if (A01[1].length() == 9) {
                throw new RuntimeException();
            }
            A01[5] = "YNIn8hUAyZDjSH3JhERqEXsouXgj93JS";
            if (containsKey) {
                spannableStringBuilder.setSpan(new ForegroundColorSpan(A04.get(str).intValue()), i, i6, 33);
            } else {
                Map<String, Integer> map = A03;
                String className = A01[3];
                if (className.charAt(21) != 'Z') {
                    A01[3] = "z1JdxX10iLj514Di1TKQv9nGlpU0X7eV";
                    if (map.containsKey(str)) {
                        spannableStringBuilder.setSpan(new BackgroundColorSpan(A03.get(str).intValue()), i, i6, 33);
                    }
                } else if (map.containsKey(str)) {
                    spannableStringBuilder.setSpan(new BackgroundColorSpan(A03.get(str).intValue()), i, i6, 33);
                }
            }
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0047  */
    /* JADX WARN: Removed duplicated region for block: B:12:0x004d  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0053  */
    /* JADX WARN: Removed duplicated region for block: B:5:0x000b  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0041  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static void A0J(String str, SpannableStringBuilder spannableStringBuilder) {
        char c9;
        switch (str.hashCode()) {
            case 3309:
                boolean equals = str.equals(A0C(k.f15070a, 2, 32));
                String[] strArr = A01;
                if (strArr[0].length() == strArr[7].length()) {
                    A01[1] = "Z6Yq6aysKH1bmBhKZFPJxCKyS02If";
                    if (equals) {
                        c9 = 1;
                        switch (c9) {
                            case 0:
                                spannableStringBuilder.append('<');
                                return;
                            case 1:
                                spannableStringBuilder.append('>');
                                return;
                            case 2:
                                spannableStringBuilder.append(' ');
                                return;
                            case 3:
                                spannableStringBuilder.append('&');
                                return;
                            default:
                                AbstractC06324g.A07(A0C(167, 15, 91), A0C(310, 31, 108) + str + A0C(16, 2, 87));
                                return;
                        }
                    }
                    c9 = 65535;
                    switch (c9) {
                    }
                }
                throw new RuntimeException();
            case 3464:
                if (str.equals(A0C(378, 2, 27))) {
                    c9 = 0;
                    switch (c9) {
                    }
                }
                c9 = 65535;
                switch (c9) {
                }
            case 96708:
                boolean equals2 = str.equals(A0C(218, 3, a.f21756z));
                if (A01[5].charAt(2) != 'h') {
                    String[] strArr2 = A01;
                    strArr2[2] = "0e7ADHSVMy4QvuNOaRsoWPMCToECBQOy";
                    strArr2[6] = "0jhJvpoe9graGazv1ZIcpM6WWqxYTLD3";
                    if (equals2) {
                        c9 = 3;
                        switch (c9) {
                        }
                    }
                    c9 = 65535;
                    switch (c9) {
                    }
                }
                throw new RuntimeException();
            case 3374865:
                if (str.equals(A0C(393, 4, 93))) {
                    c9 = 2;
                    switch (c9) {
                    }
                }
                c9 = 65535;
                switch (c9) {
                }
            default:
                c9 = 65535;
                switch (c9) {
                }
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Incorrect condition in loop: B:15:0x00ee */
    /* JADX WARN: Removed duplicated region for block: B:10:0x00d0  */
    /* JADX WARN: Removed duplicated region for block: B:11:0x00d4  */
    /* JADX WARN: Removed duplicated region for block: B:12:0x00dd  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x00f0 A[LOOP:0: B:14:0x00ea->B:16:0x00f0, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:6:0x0017 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:8:0x00c1  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x00c7  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static void A0K(String str, C1030Kj c1030Kj, List<C1029Ki> list, SpannableStringBuilder spannableStringBuilder, List<C1022Kb> list2) {
        int start;
        List<C1031Kk> A0E;
        int end;
        int start2;
        int i = c1030Kj.A00;
        int i6 = spannableStringBuilder.length();
        String str2 = c1030Kj.A01;
        int start3 = str2.hashCode();
        switch (start3) {
            case 0:
                if (str2.equals(A0C(0, 0, 43))) {
                    start = 7;
                    switch (start) {
                        case 0:
                            spannableStringBuilder.setSpan(new StyleSpan(1), i, i6, 33);
                            break;
                        case 1:
                            spannableStringBuilder.setSpan(new StyleSpan(2), i, i6, 33);
                            break;
                        case 2:
                            A0H(spannableStringBuilder, str, c1030Kj, list, list2);
                            break;
                        case 3:
                            spannableStringBuilder.setSpan(new UnderlineSpan(), i, i6, 33);
                            break;
                        case 4:
                            A0I(spannableStringBuilder, c1030Kj.A03, i, i6);
                            break;
                        case 5:
                        case 6:
                        case 7:
                            break;
                        default:
                            return;
                    }
                    A0E = A0E(list2, str, c1030Kj);
                    for (end = 0; end < start2; end++) {
                        A0G(spannableStringBuilder, A0E.get(end).A01, i, i6);
                    }
                    return;
                }
                start = -1;
                switch (start) {
                }
                A0E = A0E(list2, str, c1030Kj);
                while (end < start2) {
                }
                return;
            case 98:
                if (str2.equals(A0C(221, 1, 73))) {
                    start = 0;
                    switch (start) {
                    }
                    A0E = A0E(list2, str, c1030Kj);
                    while (end < start2) {
                    }
                    return;
                }
                start = -1;
                switch (start) {
                }
                A0E = A0E(list2, str, c1030Kj);
                while (end < start2) {
                }
                return;
            case 99:
                if (str2.equals(A0C(293, 1, 98))) {
                    start = 4;
                    switch (start) {
                    }
                    A0E = A0E(list2, str, c1030Kj);
                    while (end < start2) {
                    }
                    return;
                }
                start = -1;
                switch (start) {
                }
                A0E = A0E(list2, str, c1030Kj);
                while (end < start2) {
                }
                return;
            case 105:
                if (str2.equals(A0C(309, 1, 111))) {
                    start = 1;
                    switch (start) {
                    }
                    A0E = A0E(list2, str, c1030Kj);
                    while (end < start2) {
                    }
                    return;
                }
                start = -1;
                switch (start) {
                }
                A0E = A0E(list2, str, c1030Kj);
                while (end < start2) {
                }
                return;
            case 117:
                if (str2.equals(A0C(430, 1, 29))) {
                    start = 3;
                    switch (start) {
                    }
                    A0E = A0E(list2, str, c1030Kj);
                    while (end < start2) {
                    }
                    return;
                }
                start = -1;
                switch (start) {
                }
                A0E = A0E(list2, str, c1030Kj);
                while (end < start2) {
                }
                return;
            case 118:
                if (str2.equals(A0C(431, 1, 12))) {
                    start = 6;
                    switch (start) {
                    }
                    A0E = A0E(list2, str, c1030Kj);
                    while (end < start2) {
                    }
                    return;
                }
                start = -1;
                switch (start) {
                }
                A0E = A0E(list2, str, c1030Kj);
                while (end < start2) {
                }
                return;
            case 3314158:
                if (str2.equals(A0C(341, 4, 48))) {
                    start = 5;
                    switch (start) {
                    }
                    A0E = A0E(list2, str, c1030Kj);
                    while (end < start2) {
                    }
                    return;
                }
                start = -1;
                switch (start) {
                }
                A0E = A0E(list2, str, c1030Kj);
                while (end < start2) {
                }
                return;
            case 3511770:
                boolean equals = str2.equals(A0C(417, 4, 115));
                String[] strArr = A01;
                String str3 = strArr[0];
                String str4 = strArr[7];
                int end2 = str3.length();
                int start4 = str4.length();
                if (end2 != start4) {
                    throw new RuntimeException();
                }
                A01[3] = "p1tLKUYj0fLqnT8dJpZfHw2ryYMkTMQB";
                if (equals) {
                    start = 2;
                    switch (start) {
                    }
                    A0E = A0E(list2, str, c1030Kj);
                    while (end < start2) {
                    }
                    return;
                }
                start = -1;
                switch (start) {
                }
                A0E = A0E(list2, str, c1030Kj);
                while (end < start2) {
                }
                return;
            default:
                start = -1;
                switch (start) {
                }
                A0E = A0E(list2, str, c1030Kj);
                while (end < start2) {
                }
                return;
        }
    }

    public static void A0L(String str, C1033Km c1033Km) {
        String value = A0C(167, 15, 91);
        Matcher matcher = A05.matcher(str);
        while (matcher.find()) {
            Object A012 = AbstractC06243y.A01(matcher.group(1));
            String[] strArr = A01;
            if (strArr[2].charAt(10) == strArr[6].charAt(10)) {
                throw new RuntimeException();
            }
            A01[3] = "IuLRiWa83LmFflMS6GnqXQo4BkpBDAaM";
            String str2 = (String) A012;
            String str3 = (String) AbstractC06243y.A01(matcher.group(2));
            try {
                if (A0C(353, 4, 43).equals(str2)) {
                    A0M(str3, c1033Km);
                } else if (A0C(213, 5, 54).equals(str2)) {
                    c1033Km.A06 = A03(str3);
                } else if (A0C(397, 8, 107).equals(str2)) {
                    A0N(str3, c1033Km);
                } else if (A0C(421, 4, 35).equals(str2)) {
                    c1033Km.A02 = AbstractC1035Ko.A00(str3);
                } else if (A0C(432, 8, 92).equals(str2)) {
                    c1033Km.A07 = A04(str3);
                } else {
                    AbstractC06324g.A07(value, A0C(147, 20, 102) + str2 + A0C(15, 1, 60) + str3);
                }
            } catch (NumberFormatException unused) {
                AbstractC06324g.A07(value, A0C(91, 26, 123) + matcher.group());
            }
        }
    }

    public static void A0M(String str, C1033Km c1033Km) {
        int indexOf = str.indexOf(44);
        if (indexOf != -1) {
            int commaIndex = indexOf + 1;
            c1033Km.A03 = A01(str.substring(commaIndex));
            str = str.substring(0, indexOf);
        }
        if (str.endsWith(A0C(2, 1, 118))) {
            c1033Km.A00 = AbstractC1035Ko.A00(str);
            c1033Km.A04 = 0;
        } else {
            int commaIndex2 = Integer.parseInt(str);
            c1033Km.A00 = commaIndex2;
            c1033Km.A04 = 1;
        }
    }

    public static void A0N(String str, C1033Km c1033Km) {
        int indexOf = str.indexOf(44);
        if (indexOf != -1) {
            int commaIndex = indexOf + 1;
            c1033Km.A05 = A02(str.substring(commaIndex));
            str = str.substring(0, indexOf);
        }
        c1033Km.A01 = AbstractC1035Ko.A00(str);
    }

    /* JADX WARN: Code restructure failed: missing block: B:24:0x007f, code lost:
    
        if (r7.equals(A0C(431, 1, 12)) != false) goto L22;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x0081, code lost:
    
        r0 = 7;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x0093, code lost:
    
        if (r7.equals(A0C(431, 1, 6)) != false) goto L22;
     */
    /* JADX WARN: Removed duplicated region for block: B:5:0x000d A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x00fe A[RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static boolean A0O(String str) {
        char c9;
        switch (str.hashCode()) {
            case 98:
                if (str.equals(A0C(221, 1, 73))) {
                    c9 = 0;
                    switch (c9) {
                        case 0:
                        case 1:
                        case 2:
                        case 3:
                        case 4:
                        case 5:
                        case 6:
                        case 7:
                            return true;
                        default:
                            return false;
                    }
                }
                break;
            case 99:
                if (str.equals(A0C(293, 1, 98))) {
                    c9 = 1;
                    switch (c9) {
                    }
                }
                break;
            case 105:
                String A0C = A0C(309, 1, 111);
                String[] strArr = A01;
                if (strArr[2].charAt(10) == strArr[6].charAt(10)) {
                    throw new RuntimeException();
                }
                String[] strArr2 = A01;
                strArr2[2] = "lfhFeDS1O2o1uIM0aOGK2jmnN5o1ZQFy";
                strArr2[6] = "gZA4cz0ExJhogJKpMVDSuYGHtyxwi0jr";
                if (str.equals(A0C)) {
                    c9 = 2;
                    switch (c9) {
                    }
                }
                break;
            case 117:
                if (str.equals(A0C(430, 1, 29))) {
                    c9 = 6;
                    switch (c9) {
                    }
                }
                break;
            case 118:
                if (A01[3].charAt(21) == 'Z') {
                    A01[1] = "d0efHOF5zOPljB40";
                    break;
                } else {
                    A01[4] = "nN5IyC8pDtxjsjNmobfqstup1YpOndtX";
                    break;
                }
                switch (c9) {
                }
            case 3650:
                if (A01[3].charAt(21) == 'Z') {
                    throw new RuntimeException();
                }
                String[] strArr3 = A01;
                strArr3[0] = "3Lkw1PxTKRAL7UJ3iME";
                strArr3[7] = "Pvn03sQd9gQ2SLf9pLX";
                if (str.equals(A0C(415, 2, 49))) {
                    c9 = 5;
                    switch (c9) {
                    }
                }
                break;
            case 3314158:
                if (str.equals(A0C(341, 4, 48))) {
                    c9 = 3;
                    switch (c9) {
                    }
                }
                break;
            case 3511770:
                if (str.equals(A0C(417, 4, 115))) {
                    c9 = 4;
                    switch (c9) {
                    }
                }
                break;
        }
        c9 = 65535;
        switch (c9) {
        }
    }
}
