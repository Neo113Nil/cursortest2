package xc;

import pc.j;

/* compiled from: r8-map-id-9ca073bbfde00f50be8682633edd5c48170ffeeeebc591f4c22ad3deaafa0d20 */
/* loaded from: classes.dex */
public abstract class h extends g {
    public static Integer A(String str) {
        boolean z10;
        int i10;
        int i11;
        u2.b.i(10);
        int length = str.length();
        if (length == 0) {
            return null;
        }
        int i12 = 0;
        char charAt = str.charAt(0);
        int i13 = -2147483647;
        if (j.f(charAt, 48) < 0) {
            i10 = 1;
            if (length == 1) {
                return null;
            }
            if (charAt == '+') {
                z10 = false;
            } else {
                if (charAt != '-') {
                    return null;
                }
                i13 = Integer.MIN_VALUE;
                z10 = true;
            }
        } else {
            z10 = false;
            i10 = 0;
        }
        int i14 = -59652323;
        while (i10 < length) {
            int digit = Character.digit((int) str.charAt(i10), 10);
            if (digit < 0) {
                return null;
            }
            if ((i12 < i14 && (i14 != -59652323 || i12 < (i14 = i13 / 10))) || (i11 = i12 * 10) < i13 + digit) {
                return null;
            }
            i12 = i11 - digit;
            i10++;
        }
        return z10 ? Integer.valueOf(i12) : Integer.valueOf(-i12);
    }

    public static boolean n(String str, String str2, boolean z10) {
        j.e(str2, "other");
        return s(str, str2, 0, z10, 2) >= 0;
    }

    public static boolean o(String str, String str2) {
        return str == null ? str2 == null : str.equalsIgnoreCase(str2);
    }

    public static final int p(CharSequence charSequence) {
        j.e(charSequence, "<this>");
        return charSequence.length() - 1;
    }

    public static final int q(CharSequence charSequence, String str, int i10, boolean z10) {
        j.e(charSequence, "<this>");
        j.e(str, "string");
        if (!z10 && (charSequence instanceof String)) {
            return ((String) charSequence).indexOf(str, i10);
        }
        int length = charSequence.length();
        if (i10 < 0) {
            i10 = 0;
        }
        int length2 = charSequence.length();
        if (length > length2) {
            length = length2;
        }
        uc.d dVar = new uc.d(i10, length, 1);
        boolean z11 = charSequence instanceof String;
        int i11 = dVar.f6737i;
        int i12 = dVar.f6736h;
        int i13 = dVar.f6735g;
        if (!z11 || !(str instanceof String)) {
            boolean z12 = z10;
            if ((i11 <= 0 || i13 > i12) && (i11 >= 0 || i12 > i13)) {
                return -1;
            }
            while (true) {
                CharSequence charSequence2 = charSequence;
                boolean z13 = z12;
                z12 = z13;
                if (v(str, 0, charSequence2, i13, str.length(), z13)) {
                    return i13;
                }
                if (i13 == i12) {
                    return -1;
                }
                i13 += i11;
                charSequence = charSequence2;
            }
        } else {
            if ((i11 <= 0 || i13 > i12) && (i11 >= 0 || i12 > i13)) {
                return -1;
            }
            int i14 = i13;
            while (true) {
                String str2 = str;
                boolean z14 = z10;
                if (u(0, i14, str.length(), str2, (String) charSequence, z14)) {
                    return i14;
                }
                if (i14 == i12) {
                    return -1;
                }
                i14 += i11;
                str = str2;
                z10 = z14;
            }
        }
    }

    public static int r(CharSequence charSequence, char c3, int i10, int i11) {
        if ((i11 & 2) != 0) {
            i10 = 0;
        }
        j.e(charSequence, "<this>");
        if (charSequence instanceof String) {
            return ((String) charSequence).indexOf(c3, i10);
        }
        char[] cArr = {c3};
        if (charSequence instanceof String) {
            return ((String) charSequence).indexOf(cArr[0], i10);
        }
        if (i10 < 0) {
            i10 = 0;
        }
        int p8 = p(charSequence);
        if (i10 > p8) {
            return -1;
        }
        while (cArr[0] != charSequence.charAt(i10)) {
            if (i10 == p8) {
                return -1;
            }
            i10++;
        }
        return i10;
    }

    public static /* synthetic */ int s(CharSequence charSequence, String str, int i10, boolean z10, int i11) {
        if ((i11 & 2) != 0) {
            i10 = 0;
        }
        if ((i11 & 4) != 0) {
            z10 = false;
        }
        return q(charSequence, str, i10, z10);
    }

    public static boolean t(String str) {
        j.e(str, "<this>");
        for (int i10 = 0; i10 < str.length(); i10++) {
            if (!u2.b.m(str.charAt(i10))) {
                return false;
            }
        }
        return true;
    }

    public static final boolean u(int i10, int i11, int i12, String str, String str2, boolean z10) {
        j.e(str, "<this>");
        j.e(str2, "other");
        return !z10 ? str.regionMatches(i10, str2, i11, i12) : str.regionMatches(z10, i10, str2, i11, i12);
    }

    public static final boolean v(CharSequence charSequence, int i10, CharSequence charSequence2, int i11, int i12, boolean z10) {
        int i13;
        char upperCase;
        char upperCase2;
        j.e(charSequence, "<this>");
        j.e(charSequence2, "other");
        if (i11 >= 0 && i10 >= 0 && i10 <= charSequence.length() - i12 && i11 <= charSequence2.length() - i12) {
            for (0; i13 < i12; i13 + 1) {
                char charAt = charSequence.charAt(i10 + i13);
                char charAt2 = charSequence2.charAt(i11 + i13);
                i13 = (charAt == charAt2 || (z10 && ((upperCase = Character.toUpperCase(charAt)) == (upperCase2 = Character.toUpperCase(charAt2)) || Character.toLowerCase(upperCase) == Character.toLowerCase(upperCase2)))) ? i13 + 1 : 0;
            }
            return true;
        }
        return false;
    }

    public static String w(String str, String str2, String str3) {
        j.e(str, "<this>");
        j.e(str3, "newValue");
        int q10 = q(str, str2, 0, false);
        if (q10 < 0) {
            return str;
        }
        int length = str2.length();
        int i10 = length >= 1 ? length : 1;
        int length2 = str3.length() + (str.length() - length);
        if (length2 < 0) {
            throw new OutOfMemoryError();
        }
        StringBuilder sb = new StringBuilder(length2);
        int i11 = 0;
        do {
            sb.append((CharSequence) str, i11, q10);
            sb.append(str3);
            i11 = q10 + length;
            if (q10 >= str.length()) {
                break;
            }
            q10 = q(str, str2, q10 + i10, false);
        } while (q10 > 0);
        sb.append((CharSequence) str, i11, str.length());
        String sb2 = sb.toString();
        j.d(sb2, "toString(...)");
        return sb2;
    }

    public static boolean x(String str, String str2) {
        j.e(str, "<this>");
        j.e(str2, "prefix");
        return str.startsWith(str2);
    }

    public static String y(String str, String str2) {
        j.e(str2, "delimiter");
        int s10 = s(str, str2, 0, false, 6);
        if (s10 == -1) {
            return str;
        }
        String substring = str.substring(str2.length() + s10, str.length());
        j.d(substring, "substring(...)");
        return substring;
    }

    public static String z(String str) {
        j.e(str, "<this>");
        j.e(str, "missingDelimiterValue");
        int lastIndexOf = str.lastIndexOf(46, p(str));
        if (lastIndexOf == -1) {
            return str;
        }
        String substring = str.substring(lastIndexOf + 1, str.length());
        j.d(substring, "substring(...)");
        return substring;
    }
}
