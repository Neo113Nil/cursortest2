package kotlin.text;

import defpackage.b7;
import defpackage.dfi;
import defpackage.hrg;
import defpackage.xq0;
import java.util.Arrays;
import java.util.List;
import java.util.Locale;
import java.util.regex.Pattern;

/* loaded from: classes5.dex */
public class c extends StringsKt__StringNumberConversionsKt {
    public static String k(String str) {
        str.getClass();
        Locale locale = Locale.getDefault();
        locale.getClass();
        str.getClass();
        locale.getClass();
        if (str.length() <= 0) {
            return str;
        }
        char charAt = str.charAt(0);
        if (!Character.isLowerCase(charAt)) {
            return str;
        }
        StringBuilder sb = new StringBuilder();
        char titleCase = Character.toTitleCase(charAt);
        if (titleCase != Character.toUpperCase(charAt)) {
            sb.append(titleCase);
        } else {
            String upperCase = str.substring(0, 1).toUpperCase(locale);
            upperCase.getClass();
            sb.append(upperCase);
        }
        sb.append(str.substring(1));
        return sb.toString();
    }

    public static String l(char[] cArr, int i, int i2) {
        cArr.getClass();
        b7 b7Var = kotlin.collections.a.a;
        int length = cArr.length;
        b7Var.getClass();
        b7.a(i, i2, length);
        return new String(cArr, i, i2 - i);
    }

    public static String m(byte[] bArr) {
        bArr.getClass();
        return new String(bArr, Charsets.UTF_8);
    }

    public static boolean n(String str, String str2, boolean z) {
        str.getClass();
        str2.getClass();
        return !z ? str.endsWith(str2) : str.regionMatches(true, str.length() - str2.length(), str2, 0, str2.length());
    }

    public static boolean o(String str, String str2, boolean z) {
        return str == null ? str2 == null : !z ? str.equals(str2) : str.equalsIgnoreCase(str2);
    }

    public static boolean p(String str, boolean z, String str2, int i, int i2, int i3) {
        str.getClass();
        str2.getClass();
        return !z ? str.regionMatches(i, str2, i2, i3) : str.regionMatches(z, i, str2, i2, i3);
    }

    public static String q(int i, CharSequence charSequence) {
        charSequence.getClass();
        if (i < 0) {
            xq0.o(hrg.o("Count 'n' must be non-negative, but was ", i, '.'));
            return null;
        }
        if (i == 0) {
            return "";
        }
        int i2 = 1;
        if (i == 1) {
            return charSequence.toString();
        }
        int length = charSequence.length();
        if (length == 0) {
            return "";
        }
        if (length != 1) {
            StringBuilder sb = new StringBuilder(charSequence.length() * i);
            if (1 <= i) {
                while (true) {
                    sb.append(charSequence);
                    if (i2 == i) {
                        break;
                    }
                    i2++;
                }
            }
            return sb.toString();
        }
        char charAt = charSequence.charAt(0);
        char[] cArr = new char[i];
        for (int i3 = 0; i3 < i; i3++) {
            cArr[i3] = charAt;
        }
        return new String(cArr);
    }

    public static String r(String str, String str2, String str3, boolean z) {
        dfi.s(str, str2, str3);
        int i = 0;
        int w = StringsKt__StringsKt.w(0, str, str2, z);
        if (w < 0) {
            return str;
        }
        int length = str2.length();
        int i2 = length >= 1 ? length : 1;
        int length2 = str3.length() + (str.length() - length);
        if (length2 < 0) {
            throw new OutOfMemoryError();
        }
        StringBuilder sb = new StringBuilder(length2);
        do {
            sb.append((CharSequence) str, i, w);
            sb.append(str3);
            i = w + length;
            if (w >= str.length()) {
                break;
            }
            w = StringsKt__StringsKt.w(w + i2, str, str2, z);
        } while (w > 0);
        sb.append((CharSequence) str, i, str.length());
        return sb.toString();
    }

    public static String s(char c, char c2, String str) {
        str.getClass();
        String replace = str.replace(c, c2);
        replace.getClass();
        return replace;
    }

    public static List t(String str, Pattern pattern) {
        pattern.getClass();
        StringsKt__StringsKt.B(0);
        String[] split = pattern.split(str, -1);
        split.getClass();
        List asList = Arrays.asList(split);
        asList.getClass();
        return asList;
    }

    public static boolean u(int i, String str, String str2, boolean z) {
        str.getClass();
        return !z ? str.startsWith(str2, i) : p(str, z, str2, i, 0, str2.length());
    }

    public static boolean v(String str, String str2, boolean z) {
        str.getClass();
        str2.getClass();
        return !z ? str.startsWith(str2) : p(str, z, str2, 0, 0, str2.length());
    }
}
