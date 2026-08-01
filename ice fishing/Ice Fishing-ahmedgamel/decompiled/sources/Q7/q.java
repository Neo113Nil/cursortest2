package Q7;

import L3.F;

/* loaded from: classes2.dex */
public abstract class q extends p {
    public static boolean K(String str, String suffix) {
        kotlin.jvm.internal.h.e(str, "<this>");
        kotlin.jvm.internal.h.e(suffix, "suffix");
        return str.endsWith(suffix);
    }

    public static boolean L(String str, String str2) {
        return str == null ? str2 == null : str.equalsIgnoreCase(str2);
    }

    public static final void M(String str) {
        throw new NumberFormatException(u1.h.b('\'', "Invalid number format: '", str));
    }

    public static boolean N(int i, int i6, int i9, String str, String other, boolean z3) {
        kotlin.jvm.internal.h.e(str, "<this>");
        kotlin.jvm.internal.h.e(other, "other");
        return !z3 ? str.regionMatches(i, other, i6, i9) : str.regionMatches(z3, i, other, i6, i9);
    }

    public static String O(String str, char c9, char c10) {
        kotlin.jvm.internal.h.e(str, "<this>");
        String replace = str.replace(c9, c10);
        kotlin.jvm.internal.h.d(replace, "replace(...)");
        return replace;
    }

    public static String P(String str, String str2, String newValue) {
        kotlin.jvm.internal.h.e(str, "<this>");
        kotlin.jvm.internal.h.e(newValue, "newValue");
        int Y = j.Y(str, str2, 0, false);
        if (Y < 0) {
            return str;
        }
        int length = str2.length();
        int i = length >= 1 ? length : 1;
        int length2 = newValue.length() + (str.length() - length);
        if (length2 < 0) {
            throw new OutOfMemoryError();
        }
        StringBuilder sb = new StringBuilder(length2);
        int i6 = 0;
        do {
            sb.append((CharSequence) str, i6, Y);
            sb.append(newValue);
            i6 = Y + length;
            if (Y >= str.length()) {
                break;
            }
            Y = j.Y(str, str2, Y + i, false);
        } while (Y > 0);
        sb.append((CharSequence) str, i6, str.length());
        String sb2 = sb.toString();
        kotlin.jvm.internal.h.d(sb2, "toString(...)");
        return sb2;
    }

    public static boolean Q(String str, int i, String str2, boolean z3) {
        kotlin.jvm.internal.h.e(str, "<this>");
        return !z3 ? str.startsWith(str2, i) : N(i, 0, str2.length(), str, str2, z3);
    }

    public static boolean R(String str, String prefix) {
        kotlin.jvm.internal.h.e(str, "<this>");
        kotlin.jvm.internal.h.e(prefix, "prefix");
        return str.startsWith(prefix);
    }

    public static Integer S(String str) {
        boolean z3;
        int i;
        int i6;
        kotlin.jvm.internal.h.e(str, "<this>");
        F.g(10);
        int length = str.length();
        if (length == 0) {
            return null;
        }
        int i9 = 0;
        char charAt = str.charAt(0);
        int i10 = -2147483647;
        if (kotlin.jvm.internal.h.f(charAt, 48) < 0) {
            i = 1;
            if (length == 1) {
                return null;
            }
            if (charAt == '+') {
                z3 = false;
            } else {
                if (charAt != '-') {
                    return null;
                }
                i10 = Integer.MIN_VALUE;
                z3 = true;
            }
        } else {
            z3 = false;
            i = 0;
        }
        int i11 = -59652323;
        while (i < length) {
            int digit = Character.digit((int) str.charAt(i), 10);
            if (digit < 0) {
                return null;
            }
            if ((i9 < i11 && (i11 != -59652323 || i9 < (i11 = i10 / 10))) || (i6 = i9 * 10) < i10 + digit) {
                return null;
            }
            i9 = i6 - digit;
            i++;
        }
        return z3 ? Integer.valueOf(i9) : Integer.valueOf(-i9);
    }

    public static Long T(String str) {
        boolean z3;
        kotlin.jvm.internal.h.e(str, "<this>");
        F.g(10);
        int length = str.length();
        if (length == 0) {
            return null;
        }
        int i = 0;
        char charAt = str.charAt(0);
        int f3 = kotlin.jvm.internal.h.f(charAt, 48);
        long j6 = com.anythink.basead.exoplayer.b.f6382b;
        if (f3 < 0) {
            z3 = true;
            if (length == 1) {
                return null;
            }
            if (charAt == '+') {
                z3 = false;
                i = 1;
            } else {
                if (charAt != '-') {
                    return null;
                }
                j6 = Long.MIN_VALUE;
                i = 1;
            }
        } else {
            z3 = false;
        }
        long j9 = 0;
        long j10 = -256204778801521550L;
        while (i < length) {
            int digit = Character.digit((int) str.charAt(i), 10);
            if (digit < 0) {
                return null;
            }
            if (j9 < j10) {
                if (j10 != -256204778801521550L) {
                    return null;
                }
                j10 = j6 / 10;
                if (j9 < j10) {
                    return null;
                }
            }
            long j11 = j9 * 10;
            long j12 = digit;
            if (j11 < j6 + j12) {
                return null;
            }
            j9 = j11 - j12;
            i++;
        }
        return z3 ? Long.valueOf(j9) : Long.valueOf(-j9);
    }
}
