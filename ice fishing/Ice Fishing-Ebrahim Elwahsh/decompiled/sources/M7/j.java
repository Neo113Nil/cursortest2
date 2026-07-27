package M7;

import D.y;
import com.google.android.gms.internal.ads.CL;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.NoSuchElementException;
import r7.AbstractC4978i;
import r7.AbstractC4981l;

/* loaded from: classes2.dex */
public abstract class j extends q {
    public static boolean L(CharSequence charSequence, String str, boolean z8) {
        kotlin.jvm.internal.h.e(charSequence, "<this>");
        return R(charSequence, str, 0, z8, 2) >= 0;
    }

    public static boolean M(CharSequence charSequence, char c4) {
        kotlin.jvm.internal.h.e(charSequence, "<this>");
        return Q(charSequence, c4, 0, 2) >= 0;
    }

    public static String N(int i, String str) {
        kotlin.jvm.internal.h.e(str, "<this>");
        if (i < 0) {
            throw new IllegalArgumentException(y.i(i, "Requested character count ", " is less than zero.").toString());
        }
        int length = str.length();
        if (i > length) {
            i = length;
        }
        String substring = str.substring(i);
        kotlin.jvm.internal.h.d(substring, "substring(...)");
        return substring;
    }

    public static final int O(CharSequence charSequence) {
        kotlin.jvm.internal.h.e(charSequence, "<this>");
        return charSequence.length() - 1;
    }

    public static final int P(CharSequence charSequence, String string, int i, boolean z8) {
        kotlin.jvm.internal.h.e(charSequence, "<this>");
        kotlin.jvm.internal.h.e(string, "string");
        if (!z8 && (charSequence instanceof String)) {
            return ((String) charSequence).indexOf(string, i);
        }
        int length = charSequence.length();
        if (i < 0) {
            i = 0;
        }
        int length2 = charSequence.length();
        if (length > length2) {
            length = length2;
        }
        J7.c cVar = new J7.c(i, length, 1);
        boolean z9 = charSequence instanceof String;
        int i4 = cVar.f1466v;
        int i9 = cVar.f1465u;
        int i10 = cVar.f1464n;
        if (!z9 || string == null) {
            boolean z10 = z8;
            if ((i4 <= 0 || i10 > i9) && (i4 >= 0 || i9 > i10)) {
                return -1;
            }
            while (true) {
                CharSequence charSequence2 = charSequence;
                boolean z11 = z10;
                z10 = z11;
                if (X(string, 0, charSequence2, i10, string.length(), z11)) {
                    return i10;
                }
                if (i10 == i9) {
                    return -1;
                }
                i10 += i4;
                charSequence = charSequence2;
            }
        } else {
            if ((i4 <= 0 || i10 > i9) && (i4 >= 0 || i9 > i10)) {
                return -1;
            }
            int i11 = i10;
            while (true) {
                String str = string;
                boolean z12 = z8;
                if (q.E(0, i11, string.length(), str, (String) charSequence, z12)) {
                    return i11;
                }
                if (i11 == i9) {
                    return -1;
                }
                i11 += i4;
                string = str;
                z8 = z12;
            }
        }
    }

    public static int Q(CharSequence charSequence, char c4, int i, int i4) {
        if ((i4 & 2) != 0) {
            i = 0;
        }
        kotlin.jvm.internal.h.e(charSequence, "<this>");
        return !(charSequence instanceof String) ? S(charSequence, new char[]{c4}, i, false) : ((String) charSequence).indexOf(c4, i);
    }

    public static /* synthetic */ int R(CharSequence charSequence, String str, int i, boolean z8, int i4) {
        if ((i4 & 2) != 0) {
            i = 0;
        }
        if ((i4 & 4) != 0) {
            z8 = false;
        }
        return P(charSequence, str, i, z8);
    }

    public static final int S(CharSequence charSequence, char[] cArr, int i, boolean z8) {
        kotlin.jvm.internal.h.e(charSequence, "<this>");
        if (!z8 && cArr.length == 1 && (charSequence instanceof String)) {
            int length = cArr.length;
            if (length == 0) {
                throw new NoSuchElementException("Array is empty.");
            }
            if (length != 1) {
                throw new IllegalArgumentException("Array has more than one element.");
            }
            return ((String) charSequence).indexOf(cArr[0], i);
        }
        if (i < 0) {
            i = 0;
        }
        int O8 = O(charSequence);
        if (i > O8) {
            return -1;
        }
        while (true) {
            char charAt = charSequence.charAt(i);
            for (char c4 : cArr) {
                if (p8.g.f(c4, charAt, z8)) {
                    return i;
                }
            }
            if (i == O8) {
                return -1;
            }
            i++;
        }
    }

    public static boolean T(String str) {
        kotlin.jvm.internal.h.e(str, "<this>");
        for (int i = 0; i < str.length(); i++) {
            if (!p8.g.j(str.charAt(i))) {
                return false;
            }
        }
        return true;
    }

    public static int U(int i, String str, String string) {
        int O8 = (i & 2) != 0 ? O(str) : 0;
        kotlin.jvm.internal.h.e(str, "<this>");
        kotlin.jvm.internal.h.e(string, "string");
        return str.lastIndexOf(string, O8);
    }

    public static int V(String str, int i, int i4, char c4) {
        if ((i4 & 2) != 0) {
            i = O(str);
        }
        return str.lastIndexOf(c4, i);
    }

    public static String W(int i, String str) {
        CharSequence charSequence;
        kotlin.jvm.internal.h.e(str, "<this>");
        if (i < 0) {
            throw new IllegalArgumentException(y.i(i, "Desired length ", " is less than zero."));
        }
        if (i <= str.length()) {
            charSequence = str.subSequence(0, str.length());
        } else {
            StringBuilder sb = new StringBuilder(i);
            int length = i - str.length();
            int i4 = 1;
            if (1 <= length) {
                while (true) {
                    sb.append('0');
                    if (i4 == length) {
                        break;
                    }
                    i4++;
                }
            }
            sb.append((CharSequence) str);
            charSequence = sb;
        }
        return charSequence.toString();
    }

    public static final boolean X(String str, int i, CharSequence other, int i4, int i9, boolean z8) {
        kotlin.jvm.internal.h.e(str, "<this>");
        kotlin.jvm.internal.h.e(other, "other");
        if (i4 >= 0 && i >= 0 && i <= str.length() - i9 && i4 <= other.length() - i9) {
            for (int i10 = 0; i10 < i9; i10++) {
                if (p8.g.f(str.charAt(i + i10), other.charAt(i4 + i10), z8)) {
                }
            }
            return true;
        }
        return false;
    }

    public static String Y(String str, String str2) {
        if (!q.I(str, str2)) {
            return str;
        }
        String substring = str.substring(str2.length());
        kotlin.jvm.internal.h.d(substring, "substring(...)");
        return substring;
    }

    public static final void Z(int i) {
        if (i < 0) {
            throw new IllegalArgumentException(CL.i(i, "Limit must be non-negative, but was ").toString());
        }
    }

    public static final List a0(int i, CharSequence charSequence, String str) {
        Z(i);
        int P8 = P(charSequence, str, 0, false);
        if (P8 == -1 || i == 1) {
            return p8.g.k(charSequence.toString());
        }
        boolean z8 = i > 0;
        int i4 = 10;
        if (z8 && i <= 10) {
            i4 = i;
        }
        ArrayList arrayList = new ArrayList(i4);
        int i9 = 0;
        do {
            arrayList.add(charSequence.subSequence(i9, P8).toString());
            i9 = str.length() + P8;
            if (z8 && arrayList.size() == i - 1) {
                break;
            }
            P8 = P(charSequence, str, i9, false);
        } while (P8 != -1);
        arrayList.add(charSequence.subSequence(i9, charSequence.length()).toString());
        return arrayList;
    }

    public static List b0(CharSequence charSequence, String[] strArr, int i) {
        int i4 = (i & 4) != 0 ? 0 : 2;
        kotlin.jvm.internal.h.e(charSequence, "<this>");
        if (strArr.length == 1) {
            String str = strArr[0];
            if (str.length() != 0) {
                return a0(i4, charSequence, str);
            }
        }
        Z(i4);
        L7.k kVar = new L7.k(0, new c(charSequence, i4, new r(0, AbstractC4978i.H(strArr))));
        ArrayList arrayList = new ArrayList(AbstractC4981l.E(kVar, 10));
        Iterator it = kVar.iterator();
        while (true) {
            b bVar = (b) it;
            if (!bVar.hasNext()) {
                return arrayList;
            }
            J7.c range = (J7.c) bVar.next();
            kotlin.jvm.internal.h.e(range, "range");
            arrayList.add(charSequence.subSequence(range.f1464n, range.f1465u + 1).toString());
        }
    }

    public static List c0(String str, char[] cArr) {
        kotlin.jvm.internal.h.e(str, "<this>");
        if (cArr.length == 1) {
            return a0(0, str, String.valueOf(cArr[0]));
        }
        Z(0);
        L7.k kVar = new L7.k(0, new c(str, 0, new r(1, cArr)));
        ArrayList arrayList = new ArrayList(AbstractC4981l.E(kVar, 10));
        Iterator it = kVar.iterator();
        while (true) {
            b bVar = (b) it;
            if (!bVar.hasNext()) {
                return arrayList;
            }
            J7.c range = (J7.c) bVar.next();
            kotlin.jvm.internal.h.e(range, "range");
            arrayList.add(str.subSequence(range.f1464n, range.f1465u + 1).toString());
        }
    }

    public static boolean d0(char c4, String str) {
        return str.length() > 0 && p8.g.f(str.charAt(0), c4, false);
    }

    public static String e0(String str, String delimiter) {
        kotlin.jvm.internal.h.e(delimiter, "delimiter");
        int R8 = R(str, delimiter, 0, false, 6);
        if (R8 == -1) {
            return str;
        }
        String substring = str.substring(delimiter.length() + R8, str.length());
        kotlin.jvm.internal.h.d(substring, "substring(...)");
        return substring;
    }

    public static String f0(int i, String str) {
        kotlin.jvm.internal.h.e(str, "<this>");
        if (i < 0) {
            throw new IllegalArgumentException(y.i(i, "Requested character count ", " is less than zero.").toString());
        }
        int length = str.length();
        if (i > length) {
            i = length;
        }
        String substring = str.substring(0, i);
        kotlin.jvm.internal.h.d(substring, "substring(...)");
        return substring;
    }

    public static String g0(String str) {
        kotlin.jvm.internal.h.e(str, "<this>");
        int length = str.length();
        String substring = str.substring(length - (8 > length ? length : 8));
        kotlin.jvm.internal.h.d(substring, "substring(...)");
        return substring;
    }

    public static CharSequence h0(String str) {
        kotlin.jvm.internal.h.e(str, "<this>");
        int length = str.length() - 1;
        int i = 0;
        boolean z8 = false;
        while (i <= length) {
            boolean j9 = p8.g.j(str.charAt(!z8 ? i : length));
            if (z8) {
                if (!j9) {
                    break;
                }
                length--;
            } else if (j9) {
                i++;
            } else {
                z8 = true;
            }
        }
        return str.subSequence(i, length + 1);
    }
}
