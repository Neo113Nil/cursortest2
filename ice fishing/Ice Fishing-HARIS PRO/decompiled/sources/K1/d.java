package K1;

/* loaded from: classes.dex */
public abstract class d extends l {
    public static boolean g0(CharSequence charSequence, String str) {
        return j0(0, 2, charSequence, str, false) >= 0;
    }

    public static final int h0(CharSequence charSequence) {
        D1.i.e(charSequence, "<this>");
        return charSequence.length() - 1;
    }

    public static final int i0(CharSequence charSequence, String str, int i, boolean z2) {
        D1.i.e(charSequence, "<this>");
        D1.i.e(str, "string");
        if (!z2 && (charSequence instanceof String)) {
            return ((String) charSequence).indexOf(str, i);
        }
        int length = charSequence.length();
        if (i < 0) {
            i = 0;
        }
        int length2 = charSequence.length();
        if (length > length2) {
            length = length2;
        }
        H1.c cVar = new H1.c(i, length, 1);
        boolean z3 = charSequence instanceof String;
        int i2 = cVar.f344c;
        int i3 = cVar.f343b;
        int i4 = cVar.f342a;
        if (!z3 || str == null) {
            if ((i2 > 0 && i4 <= i3) || (i2 < 0 && i3 <= i4)) {
                while (!l0(i4, str.length(), charSequence, str, z2)) {
                    if (i4 != i3) {
                        i4 += i2;
                    }
                }
                return i4;
            }
            return -1;
        }
        if ((i2 > 0 && i4 <= i3) || (i2 < 0 && i3 <= i4)) {
            while (!l.e0(0, i4, str.length(), str, (String) charSequence, z2)) {
                if (i4 != i3) {
                    i4 += i2;
                }
            }
            return i4;
        }
        return -1;
    }

    public static /* synthetic */ int j0(int i, int i2, CharSequence charSequence, String str, boolean z2) {
        if ((i2 & 2) != 0) {
            i = 0;
        }
        if ((i2 & 4) != 0) {
            z2 = false;
        }
        return i0(charSequence, str, i, z2);
    }

    public static boolean k0(CharSequence charSequence) {
        D1.i.e(charSequence, "<this>");
        for (int i = 0; i < charSequence.length(); i++) {
            char charAt = charSequence.charAt(i);
            if (!Character.isWhitespace(charAt) && !Character.isSpaceChar(charAt)) {
                return false;
            }
        }
        return true;
    }

    public static final boolean l0(int i, int i2, CharSequence charSequence, String str, boolean z2) {
        char upperCase;
        char upperCase2;
        D1.i.e(str, "<this>");
        D1.i.e(charSequence, "other");
        if (i < 0 || str.length() - i2 < 0 || i > charSequence.length() - i2) {
            return false;
        }
        for (int i3 = 0; i3 < i2; i3++) {
            char charAt = str.charAt(i3);
            char charAt2 = charSequence.charAt(i + i3);
            if (charAt != charAt2 && (!z2 || ((upperCase = Character.toUpperCase(charAt)) != (upperCase2 = Character.toUpperCase(charAt2)) && Character.toLowerCase(upperCase) != Character.toLowerCase(upperCase2)))) {
                return false;
            }
        }
        return true;
    }

    public static final void m0(int i) {
        if (i < 0) {
            throw new IllegalArgumentException(D1.h.e("Limit must be non-negative, but was ", i).toString());
        }
    }

    public static String n0(String str, String str2) {
        D1.i.e(str2, "delimiter");
        int j02 = j0(0, 6, str, str2, false);
        if (j02 == -1) {
            return str;
        }
        String substring = str.substring(str2.length() + j02, str.length());
        D1.i.d(substring, "substring(...)");
        return substring;
    }

    public static String o0(String str) {
        D1.i.e(str, "<this>");
        D1.i.e(str, "missingDelimiterValue");
        int lastIndexOf = str.lastIndexOf(46, h0(str));
        if (lastIndexOf == -1) {
            return str;
        }
        String substring = str.substring(lastIndexOf + 1, str.length());
        D1.i.d(substring, "substring(...)");
        return substring;
    }

    public static String p0(String str) {
        int length = str.length();
        if (80 <= length) {
            length = 80;
        }
        String substring = str.substring(0, length);
        D1.i.d(substring, "substring(...)");
        return substring;
    }

    public static CharSequence q0(String str) {
        int length = str.length() - 1;
        int i = 0;
        boolean z2 = false;
        while (i <= length) {
            char charAt = str.charAt(!z2 ? i : length);
            boolean z3 = Character.isWhitespace(charAt) || Character.isSpaceChar(charAt);
            if (z2) {
                if (!z3) {
                    break;
                }
                length--;
            } else if (z3) {
                i++;
            } else {
                z2 = true;
            }
        }
        return str.subSequence(i, length + 1);
    }
}
