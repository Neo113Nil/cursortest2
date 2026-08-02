package kotlin.text;

import com.connectsdk.service.airplay.PListParser;
import com.connectsdk.service.webos.lgcast.screenmirroring.uibc.UibcKeyCode;
import defpackage.dfi;
import defpackage.e7o;
import defpackage.f1d;
import defpackage.hx7;
import defpackage.mlr;
import defpackage.o7t;
import defpackage.v75;
import defpackage.vz0;
import defpackage.xq0;
import defpackage.xz0;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.IntRange;

@Metadata(d1 = {"glr", "hlr", "ilr", "jlr", "klr", "llr", "kotlin/text/b", "kotlin/text/StringsKt__StringNumberConversionsKt", "kotlin/text/c", "kotlin/text/StringsKt__StringsKt", "kotlin/text/g", "mlr"}, d2 = {}, k = 4, mv = {2, 2, 0}, xi = UibcKeyCode.TV_KEYCODE_1)
/* loaded from: classes5.dex */
public final class StringsKt extends mlr {
    public static boolean M(CharSequence charSequence, CharSequence charSequence2, boolean z) {
        charSequence.getClass();
        charSequence2.getClass();
        if (charSequence2 instanceof String) {
            if (T(charSequence, (String) charSequence2, 0, z, 2) >= 0) {
                return true;
            }
        } else if (StringsKt__StringsKt.x(charSequence, charSequence2, 0, charSequence.length(), z, false) >= 0) {
            return true;
        }
        return false;
    }

    public static boolean N(CharSequence charSequence, char c) {
        charSequence.getClass();
        return S(charSequence, c, 0, 2) >= 0;
    }

    public static boolean O(CharSequence charSequence, char c) {
        charSequence.getClass();
        return charSequence.length() > 0 && a.c(charSequence.charAt(charSequence.length() - 1), c, false);
    }

    public static boolean P(CharSequence charSequence, String str) {
        charSequence.getClass();
        return charSequence instanceof String ? c.n((String) charSequence, str, false) : StringsKt__StringsKt.A(charSequence, charSequence.length() - str.length(), str, 0, str.length(), false);
    }

    public static int Q(CharSequence charSequence) {
        charSequence.getClass();
        return charSequence.length() - 1;
    }

    public static int R(CharSequence charSequence, char c, int i, boolean z) {
        charSequence.getClass();
        return (z || !(charSequence instanceof String)) ? StringsKt__StringsKt.y(charSequence, new char[]{c}, i, z) : ((String) charSequence).indexOf(c, i);
    }

    public static /* synthetic */ int S(CharSequence charSequence, char c, int i, int i2) {
        if ((i2 & 2) != 0) {
            i = 0;
        }
        return R(charSequence, c, i, false);
    }

    public static /* synthetic */ int T(CharSequence charSequence, String str, int i, boolean z, int i2) {
        if ((i2 & 2) != 0) {
            i = 0;
        }
        if ((i2 & 4) != 0) {
            z = false;
        }
        return StringsKt__StringsKt.w(i, charSequence, str, z);
    }

    public static boolean U(CharSequence charSequence) {
        charSequence.getClass();
        for (int i = 0; i < charSequence.length(); i++) {
            if (!CharsKt.d(charSequence.charAt(i))) {
                return false;
            }
        }
        return true;
    }

    public static int V(int i, String str, String str2) {
        int Q = (i & 2) != 0 ? Q(str) : 0;
        str.getClass();
        str2.getClass();
        return str.lastIndexOf(str2, Q);
    }

    public static int W(CharSequence charSequence, char c, int i, int i2) {
        if ((i2 & 2) != 0) {
            i = Q(charSequence);
        }
        charSequence.getClass();
        if (charSequence instanceof String) {
            return ((String) charSequence).lastIndexOf(c, i);
        }
        char[] cArr = {c};
        if (charSequence instanceof String) {
            return ((String) charSequence).lastIndexOf(xz0.R(cArr), i);
        }
        int length = charSequence.length() - 1;
        if (i > length) {
            i = length;
        }
        while (-1 < i) {
            if (a.c(cArr[0], charSequence.charAt(i), false)) {
                return i;
            }
            i--;
        }
        return -1;
    }

    public static String X(int i, String str) {
        CharSequence charSequence;
        str.getClass();
        if (i < 0) {
            xq0.x(dfi.c(i, "Desired length ", " is less than zero."));
            return null;
        }
        if (i <= str.length()) {
            charSequence = str.subSequence(0, str.length());
        } else {
            StringBuilder sb = new StringBuilder(i);
            int length = i - str.length();
            int i2 = 1;
            if (1 <= length) {
                while (true) {
                    sb.append('0');
                    if (i2 == length) {
                        break;
                    }
                    i2++;
                }
            }
            sb.append((CharSequence) str);
            charSequence = sb;
        }
        return charSequence.toString();
    }

    public static String Y(String str, String str2) {
        str.getClass();
        str2.getClass();
        return h0(str, str2) ? str.substring(str2.length()) : str;
    }

    public static CharSequence Z(String str, IntRange intRange) {
        str.getClass();
        intRange.getClass();
        int i = intRange.a;
        int i2 = intRange.b + 1;
        if (i2 < i) {
            e7o.o(dfi.f("End index (", i2, i, ") is less than start index (", ")."));
            return null;
        }
        if (i2 == i) {
            return str.subSequence(0, str.length());
        }
        StringBuilder sb = new StringBuilder(str.length() - (i2 - i));
        sb.append((CharSequence) str, 0, i);
        sb.append((CharSequence) str, i2, str.length());
        return sb;
    }

    public static String a0(String str, String str2) {
        str.getClass();
        return P(str, str2) ? str.substring(0, str.length() - str2.length()) : str;
    }

    public static String b0(String str) {
        return (str.length() >= 2 && h0(str, "\"") && P(str, "\"")) ? f1d.d(1, 1, str) : str;
    }

    public static StringBuilder c0(CharSequence charSequence, int i, int i2, CharSequence charSequence2) {
        charSequence.getClass();
        charSequence2.getClass();
        if (i2 < i) {
            e7o.o(dfi.f("End index (", i2, i, ") is less than start index (", ")."));
            return null;
        }
        StringBuilder sb = new StringBuilder();
        sb.append(charSequence, 0, i);
        sb.append(charSequence2);
        sb.append(charSequence, i2, charSequence.length());
        return sb;
    }

    public static List d0(CharSequence charSequence, String[] strArr, boolean z, int i) {
        charSequence.getClass();
        strArr.getClass();
        if (strArr.length == 1) {
            String str = strArr[0];
            if (str.length() != 0) {
                return StringsKt__StringsKt.C(i, charSequence, str, z);
            }
        }
        hx7 z2 = StringsKt__StringsKt.z(charSequence, strArr, z, i);
        ArrayList arrayList = new ArrayList(v75.o(new vz0(4, z2), 10));
        Iterator it = z2.iterator();
        while (it.hasNext()) {
            arrayList.add(StringsKt__StringsKt.D(charSequence, (IntRange) it.next()));
        }
        return arrayList;
    }

    public static List e0(CharSequence charSequence, final char[] cArr, int i) {
        int i2 = (i & 4) != 0 ? 0 : 2;
        charSequence.getClass();
        if (cArr.length == 1) {
            return StringsKt__StringsKt.C(i2, charSequence, String.valueOf(cArr[0]), false);
        }
        StringsKt__StringsKt.B(i2);
        hx7 hx7Var = new hx7(charSequence, i2, new Function2() { // from class: kotlin.text.d
            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) {
                CharSequence charSequence2 = (CharSequence) obj;
                int intValue = ((Integer) obj2).intValue();
                charSequence2.getClass();
                int y = StringsKt__StringsKt.y(charSequence2, cArr, intValue, false);
                if (y < 0) {
                    return null;
                }
                return new Pair(Integer.valueOf(y), 1);
            }
        });
        ArrayList arrayList = new ArrayList(v75.o(new vz0(4, hx7Var), 10));
        Iterator it = hx7Var.iterator();
        while (it.hasNext()) {
            arrayList.add(StringsKt__StringsKt.D(charSequence, (IntRange) it.next()));
        }
        return arrayList;
    }

    public static o7t g0(final String str, String[] strArr) {
        str.getClass();
        return new o7t(StringsKt__StringsKt.z(str, strArr, true, 0), new Function1() { // from class: kotlin.text.f
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                IntRange intRange = (IntRange) obj;
                intRange.getClass();
                return StringsKt__StringsKt.D(str, intRange);
            }
        });
    }

    public static boolean h0(CharSequence charSequence, CharSequence charSequence2) {
        charSequence.getClass();
        charSequence2.getClass();
        return ((charSequence instanceof String) && (charSequence2 instanceof String)) ? c.v((String) charSequence, (String) charSequence2, false) : StringsKt__StringsKt.A(charSequence, 0, charSequence2, 0, charSequence2.length(), false);
    }

    public static boolean i0(String str, char c) {
        return str.length() > 0 && a.c(str.charAt(0), c, false);
    }

    public static String j0(String str, IntRange intRange) {
        str.getClass();
        intRange.getClass();
        return str.substring(intRange.a, intRange.b + 1);
    }

    public static String k0(String str, String str2, String str3) {
        str.getClass();
        str3.getClass();
        int T = T(str, str2, 0, false, 6);
        return T == -1 ? str3 : str.substring(str2.length() + T, str.length());
    }

    public static String l0(char c, String str, String str2) {
        str.getClass();
        str2.getClass();
        int W = W(str, c, 0, 6);
        return W == -1 ? str2 : str.substring(W + 1, str.length());
    }

    public static String m0(char c, String str, String str2) {
        int S = S(str, c, 0, 6);
        return S == -1 ? str2 : str.substring(0, S);
    }

    public static String n0(String str, String str2) {
        str.getClass();
        str.getClass();
        int T = T(str, str2, 0, false, 6);
        return T == -1 ? str : str.substring(0, T);
    }

    public static String o0(String str, char c) {
        str.getClass();
        str.getClass();
        int W = W(str, c, 0, 6);
        return W == -1 ? str : str.substring(0, W);
    }

    public static Boolean p0(String str) {
        str.getClass();
        if (Intrinsics.d(str, PListParser.TAG_TRUE)) {
            return Boolean.TRUE;
        }
        if (Intrinsics.d(str, PListParser.TAG_FALSE)) {
            return Boolean.FALSE;
        }
        return null;
    }

    public static Integer q0(String str) {
        boolean z;
        int i;
        int i2;
        str.getClass();
        CharsKt__CharJVMKt.checkRadix(10);
        int length = str.length();
        if (length == 0) {
            return null;
        }
        int i3 = 0;
        char charAt = str.charAt(0);
        int i4 = -2147483647;
        if (Intrinsics.e(charAt, 48) < 0) {
            i = 1;
            if (length == 1) {
                return null;
            }
            if (charAt == '+') {
                z = false;
            } else {
                if (charAt != '-') {
                    return null;
                }
                i4 = Integer.MIN_VALUE;
                z = true;
            }
        } else {
            z = false;
            i = 0;
        }
        int i5 = -59652323;
        while (i < length) {
            int digit = Character.digit((int) str.charAt(i), 10);
            if (digit < 0) {
                return null;
            }
            if ((i3 < i5 && (i5 != -59652323 || i3 < (i5 = i4 / 10))) || (i2 = i3 * 10) < i4 + digit) {
                return null;
            }
            i3 = i2 - digit;
            i++;
        }
        return z ? Integer.valueOf(i3) : Integer.valueOf(-i3);
    }

    public static Long r0(int i, String str) {
        boolean z;
        str.getClass();
        CharsKt__CharJVMKt.checkRadix(i);
        int length = str.length();
        if (length == 0) {
            return null;
        }
        int i2 = 0;
        char charAt = str.charAt(0);
        long j = -9223372036854775807L;
        if (Intrinsics.e(charAt, 48) < 0) {
            z = true;
            if (length == 1) {
                return null;
            }
            if (charAt == '+') {
                z = false;
                i2 = 1;
            } else {
                if (charAt != '-') {
                    return null;
                }
                j = Long.MIN_VALUE;
                i2 = 1;
            }
        } else {
            z = false;
        }
        long j2 = 0;
        long j3 = -256204778801521550L;
        while (i2 < length) {
            int digit = Character.digit((int) str.charAt(i2), i);
            if (digit < 0) {
                return null;
            }
            if (j2 < j3) {
                if (j3 != -256204778801521550L) {
                    return null;
                }
                j3 = j / i;
                if (j2 < j3) {
                    return null;
                }
            }
            long j4 = j2 * i;
            long j5 = digit;
            if (j4 < j + j5) {
                return null;
            }
            j2 = j4 - j5;
            i2++;
        }
        return z ? Long.valueOf(j2) : Long.valueOf(-j2);
    }

    public static Long s0(String str) {
        str.getClass();
        return r0(10, str);
    }

    public static CharSequence t0(CharSequence charSequence) {
        charSequence.getClass();
        int length = charSequence.length() - 1;
        int i = 0;
        boolean z = false;
        while (i <= length) {
            boolean d = CharsKt.d(charSequence.charAt(!z ? i : length));
            if (z) {
                if (!d) {
                    break;
                }
                length--;
            } else if (d) {
                i++;
            } else {
                z = true;
            }
        }
        return charSequence.subSequence(i, length + 1);
    }

    public static String u0(String str, char... cArr) {
        str.getClass();
        int length = str.length() - 1;
        int i = 0;
        boolean z = false;
        while (i <= length) {
            boolean s = xz0.s(cArr, str.charAt(!z ? i : length));
            if (z) {
                if (!s) {
                    break;
                }
                length--;
            } else if (s) {
                i++;
            } else {
                z = true;
            }
        }
        return str.subSequence(i, length + 1).toString();
    }

    public static CharSequence v0(String str) {
        str.getClass();
        int length = str.length();
        for (int i = 0; i < length; i++) {
            if (!CharsKt.d(str.charAt(i))) {
                return str.subSequence(i, str.length());
            }
        }
        return "";
    }
}
