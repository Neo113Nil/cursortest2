package defpackage;

import java.util.Locale;

/* loaded from: classes9.dex */
public class rza {
    public static void a(int i) {
        if (2 > i || i >= 37) {
            StringBuilder t = b64.t(i, "radix ", " was not in valid range ");
            t.append(new d6w(2, 36, 1));
            throw new IllegalArgumentException(t.toString());
        }
    }

    public static boolean b(char c) {
        return Character.isWhitespace(c) || Character.isSpaceChar(c);
    }

    public static String c(char c, Locale locale) {
        String upperCase = String.valueOf(c).toUpperCase(locale);
        if (upperCase.length() > 1) {
            if (c != 329) {
                return upperCase.charAt(0) + upperCase.substring(1).toLowerCase(Locale.ROOT);
            }
        } else if (upperCase.equals(String.valueOf(c).toUpperCase(Locale.ROOT))) {
            return String.valueOf(Character.toTitleCase(c));
        }
        return upperCase;
    }
}
