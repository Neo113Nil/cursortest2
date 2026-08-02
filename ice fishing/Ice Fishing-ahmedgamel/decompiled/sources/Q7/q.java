package Q7;

import w.AbstractC5128c;

/* loaded from: classes2.dex */
public abstract class q extends p {
    public static boolean a0(String str, String suffix) {
        kotlin.jvm.internal.h.e(str, "<this>");
        kotlin.jvm.internal.h.e(suffix, "suffix");
        return str.endsWith(suffix);
    }

    public static boolean b0(String str, String str2) {
        return str == null ? str2 == null : str.equalsIgnoreCase(str2);
    }

    public static final void c0(String str) {
        throw new NumberFormatException(AbstractC5128c.b('\'', "Invalid number format: '", str));
    }

    public static boolean d0(int i, int i4, int i6, String str, String other, boolean z6) {
        kotlin.jvm.internal.h.e(str, "<this>");
        kotlin.jvm.internal.h.e(other, "other");
        return !z6 ? str.regionMatches(i, other, i4, i6) : str.regionMatches(z6, i, other, i4, i6);
    }

    public static String e0(String str, char c9, char c10) {
        kotlin.jvm.internal.h.e(str, "<this>");
        String replace = str.replace(c9, c10);
        kotlin.jvm.internal.h.d(replace, "replace(...)");
        return replace;
    }

    public static String f0(String str, String str2, String newValue) {
        kotlin.jvm.internal.h.e(str, "<this>");
        kotlin.jvm.internal.h.e(newValue, "newValue");
        int o02 = j.o0(str, str2, 0, false);
        if (o02 < 0) {
            return str;
        }
        int length = str2.length();
        int i = length >= 1 ? length : 1;
        int length2 = newValue.length() + (str.length() - length);
        if (length2 < 0) {
            throw new OutOfMemoryError();
        }
        StringBuilder sb = new StringBuilder(length2);
        int i4 = 0;
        do {
            sb.append((CharSequence) str, i4, o02);
            sb.append(newValue);
            i4 = o02 + length;
            if (o02 >= str.length()) {
                break;
            }
            o02 = j.o0(str, str2, o02 + i, false);
        } while (o02 > 0);
        sb.append((CharSequence) str, i4, str.length());
        String sb2 = sb.toString();
        kotlin.jvm.internal.h.d(sb2, "toString(...)");
        return sb2;
    }

    public static boolean g0(String str, int i, String str2, boolean z6) {
        kotlin.jvm.internal.h.e(str, "<this>");
        return !z6 ? str.startsWith(str2, i) : d0(i, 0, str2.length(), str, str2, z6);
    }

    public static boolean h0(String str, String prefix) {
        kotlin.jvm.internal.h.e(str, "<this>");
        kotlin.jvm.internal.h.e(prefix, "prefix");
        return str.startsWith(prefix);
    }

    public static Integer i0(String str) {
        boolean z6;
        int i;
        int i4;
        kotlin.jvm.internal.h.e(str, "<this>");
        A8.b.f(10);
        int length = str.length();
        if (length == 0) {
            return null;
        }
        int i6 = 0;
        char charAt = str.charAt(0);
        int i9 = -2147483647;
        if (kotlin.jvm.internal.h.f(charAt, 48) < 0) {
            i = 1;
            if (length == 1) {
                return null;
            }
            if (charAt == '+') {
                z6 = false;
            } else {
                if (charAt != '-') {
                    return null;
                }
                i9 = Integer.MIN_VALUE;
                z6 = true;
            }
        } else {
            z6 = false;
            i = 0;
        }
        int i10 = -59652323;
        while (i < length) {
            int digit = Character.digit((int) str.charAt(i), 10);
            if (digit < 0) {
                return null;
            }
            if ((i6 < i10 && (i10 != -59652323 || i6 < (i10 = i9 / 10))) || (i4 = i6 * 10) < i9 + digit) {
                return null;
            }
            i6 = i4 - digit;
            i++;
        }
        return z6 ? Integer.valueOf(i6) : Integer.valueOf(-i6);
    }

    public static Long j0(String str) {
        boolean z6;
        kotlin.jvm.internal.h.e(str, "<this>");
        A8.b.f(10);
        int length = str.length();
        if (length == 0) {
            return null;
        }
        int i = 0;
        char charAt = str.charAt(0);
        int f2 = kotlin.jvm.internal.h.f(charAt, 48);
        long j6 = com.anythink.basead.exoplayer.b.f7168b;
        if (f2 < 0) {
            z6 = true;
            if (length == 1) {
                return null;
            }
            if (charAt == '+') {
                z6 = false;
                i = 1;
            } else {
                if (charAt != '-') {
                    return null;
                }
                j6 = Long.MIN_VALUE;
                i = 1;
            }
        } else {
            z6 = false;
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
        return z6 ? Long.valueOf(j9) : Long.valueOf(-j9);
    }
}
