package defpackage;

import kotlin.ranges.IntRange;
import kotlin.text.StringsKt;
import kotlin.text.g;

/* loaded from: classes5.dex */
public class mlr extends g {
    public static String E(int i, String str) {
        str.getClass();
        if (i < 0) {
            xq0.o(dfi.c(i, "Requested character count ", " is less than zero."));
            return null;
        }
        int length = str.length();
        if (i > length) {
            i = length;
        }
        return str.substring(i);
    }

    public static String F(String str) {
        str.getClass();
        int length = str.length() - 1;
        if (length < 0) {
            length = 0;
        }
        return K(length, str);
    }

    public static char G(CharSequence charSequence) {
        charSequence.getClass();
        if (charSequence.length() != 0) {
            return charSequence.charAt(0);
        }
        wvs.h("Char sequence is empty.");
        return (char) 0;
    }

    public static Character H(CharSequence charSequence) {
        charSequence.getClass();
        if (charSequence.length() == 0) {
            return null;
        }
        return Character.valueOf(charSequence.charAt(0));
    }

    public static char I(CharSequence charSequence) {
        charSequence.getClass();
        if (charSequence.length() != 0) {
            return charSequence.charAt(charSequence.length() - 1);
        }
        wvs.h("Char sequence is empty.");
        return (char) 0;
    }

    public static String J(String str, IntRange intRange) {
        str.getClass();
        intRange.getClass();
        return intRange.isEmpty() ? "" : StringsKt.j0(str, intRange);
    }

    public static String K(int i, String str) {
        str.getClass();
        if (i < 0) {
            xq0.o(dfi.c(i, "Requested character count ", " is less than zero."));
            return null;
        }
        int length = str.length();
        if (i > length) {
            i = length;
        }
        return str.substring(0, i);
    }

    public static String L(int i, String str) {
        str.getClass();
        if (i < 0) {
            xq0.o(dfi.c(i, "Requested character count ", " is less than zero."));
            return null;
        }
        int length = str.length();
        if (i > length) {
            i = length;
        }
        return str.substring(length - i);
    }
}
