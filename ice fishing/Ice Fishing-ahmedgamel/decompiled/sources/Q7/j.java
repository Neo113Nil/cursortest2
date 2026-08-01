package Q7;

import D.y;
import L3.F;
import com.icefishinggame.icefishinggamemultigames.AbstractC4404f;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.NoSuchElementException;
import v7.AbstractC5128i;
import v7.AbstractC5131l;

/* loaded from: classes2.dex */
public abstract class j extends q {
    public static boolean U(CharSequence charSequence, String str, boolean z3) {
        kotlin.jvm.internal.h.e(charSequence, "<this>");
        return a0(charSequence, str, 0, z3, 2) >= 0;
    }

    public static boolean V(CharSequence charSequence, char c9) {
        kotlin.jvm.internal.h.e(charSequence, "<this>");
        return Z(charSequence, c9, 0, 2) >= 0;
    }

    public static String W(int i, String str) {
        kotlin.jvm.internal.h.e(str, "<this>");
        if (i < 0) {
            throw new IllegalArgumentException(y.k(i, "Requested character count ", " is less than zero.").toString());
        }
        int length = str.length();
        if (i > length) {
            i = length;
        }
        String substring = str.substring(i);
        kotlin.jvm.internal.h.d(substring, "substring(...)");
        return substring;
    }

    public static final int X(CharSequence charSequence) {
        kotlin.jvm.internal.h.e(charSequence, "<this>");
        return charSequence.length() - 1;
    }

    public static final int Y(CharSequence charSequence, String string, int i, boolean z3) {
        kotlin.jvm.internal.h.e(charSequence, "<this>");
        kotlin.jvm.internal.h.e(string, "string");
        if (!z3 && (charSequence instanceof String)) {
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
        N7.c cVar = new N7.c(i, length, 1);
        boolean z6 = charSequence instanceof String;
        int i6 = cVar.f2019v;
        int i9 = cVar.f2018u;
        int i10 = cVar.f2017n;
        if (!z6 || string == null) {
            boolean z9 = z3;
            if ((i6 <= 0 || i10 > i9) && (i6 >= 0 || i9 > i10)) {
                return -1;
            }
            while (true) {
                CharSequence charSequence2 = charSequence;
                boolean z10 = z9;
                z9 = z10;
                if (g0(string, 0, charSequence2, i10, string.length(), z10)) {
                    return i10;
                }
                if (i10 == i9) {
                    return -1;
                }
                i10 += i6;
                charSequence = charSequence2;
            }
        } else {
            if ((i6 <= 0 || i10 > i9) && (i6 >= 0 || i9 > i10)) {
                return -1;
            }
            int i11 = i10;
            while (true) {
                String str = string;
                boolean z11 = z3;
                if (q.N(0, i11, string.length(), str, (String) charSequence, z11)) {
                    return i11;
                }
                if (i11 == i9) {
                    return -1;
                }
                i11 += i6;
                string = str;
                z3 = z11;
            }
        }
    }

    public static int Z(CharSequence charSequence, char c9, int i, int i6) {
        if ((i6 & 2) != 0) {
            i = 0;
        }
        kotlin.jvm.internal.h.e(charSequence, "<this>");
        return !(charSequence instanceof String) ? b0(charSequence, new char[]{c9}, i, false) : ((String) charSequence).indexOf(c9, i);
    }

    public static /* synthetic */ int a0(CharSequence charSequence, String str, int i, boolean z3, int i6) {
        if ((i6 & 2) != 0) {
            i = 0;
        }
        if ((i6 & 4) != 0) {
            z3 = false;
        }
        return Y(charSequence, str, i, z3);
    }

    public static final int b0(CharSequence charSequence, char[] cArr, int i, boolean z3) {
        kotlin.jvm.internal.h.e(charSequence, "<this>");
        if (!z3 && cArr.length == 1 && (charSequence instanceof String)) {
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
        int X8 = X(charSequence);
        if (i > X8) {
            return -1;
        }
        while (true) {
            char charAt = charSequence.charAt(i);
            for (char c9 : cArr) {
                if (F.k(c9, charAt, z3)) {
                    return i;
                }
            }
            if (i == X8) {
                return -1;
            }
            i++;
        }
    }

    public static boolean c0(String str) {
        kotlin.jvm.internal.h.e(str, "<this>");
        for (int i = 0; i < str.length(); i++) {
            if (!F.n(str.charAt(i))) {
                return false;
            }
        }
        return true;
    }

    public static int d0(int i, String str, String string) {
        int X8 = (i & 2) != 0 ? X(str) : 0;
        kotlin.jvm.internal.h.e(str, "<this>");
        kotlin.jvm.internal.h.e(string, "string");
        return str.lastIndexOf(string, X8);
    }

    public static int e0(String str, int i, int i6, char c9) {
        if ((i6 & 2) != 0) {
            i = X(str);
        }
        return str.lastIndexOf(c9, i);
    }

    public static String f0(int i, String str) {
        CharSequence charSequence;
        kotlin.jvm.internal.h.e(str, "<this>");
        if (i < 0) {
            throw new IllegalArgumentException(y.k(i, "Desired length ", " is less than zero."));
        }
        if (i <= str.length()) {
            charSequence = str.subSequence(0, str.length());
        } else {
            StringBuilder sb = new StringBuilder(i);
            int length = i - str.length();
            int i6 = 1;
            if (1 <= length) {
                while (true) {
                    sb.append('0');
                    if (i6 == length) {
                        break;
                    }
                    i6++;
                }
            }
            sb.append((CharSequence) str);
            charSequence = sb;
        }
        return charSequence.toString();
    }

    public static final boolean g0(String str, int i, CharSequence other, int i6, int i9, boolean z3) {
        kotlin.jvm.internal.h.e(str, "<this>");
        kotlin.jvm.internal.h.e(other, "other");
        if (i6 >= 0 && i >= 0 && i <= str.length() - i9 && i6 <= other.length() - i9) {
            for (int i10 = 0; i10 < i9; i10++) {
                if (F.k(str.charAt(i + i10), other.charAt(i6 + i10), z3)) {
                }
            }
            return true;
        }
        return false;
    }

    public static String h0(String str, String str2) {
        if (!q.R(str, str2)) {
            return str;
        }
        String substring = str.substring(str2.length());
        kotlin.jvm.internal.h.d(substring, "substring(...)");
        return substring;
    }

    public static final void i0(int i) {
        if (i < 0) {
            throw new IllegalArgumentException(AbstractC4404f.e(i, "Limit must be non-negative, but was ").toString());
        }
    }

    public static final List j0(int i, CharSequence charSequence, String str) {
        i0(i);
        int Y = Y(charSequence, str, 0, false);
        if (Y == -1 || i == 1) {
            return d6.c.k(charSequence.toString());
        }
        boolean z3 = i > 0;
        int i6 = 10;
        if (z3 && i <= 10) {
            i6 = i;
        }
        ArrayList arrayList = new ArrayList(i6);
        int i9 = 0;
        do {
            arrayList.add(charSequence.subSequence(i9, Y).toString());
            i9 = str.length() + Y;
            if (z3 && arrayList.size() == i - 1) {
                break;
            }
            Y = Y(charSequence, str, i9, false);
        } while (Y != -1);
        arrayList.add(charSequence.subSequence(i9, charSequence.length()).toString());
        return arrayList;
    }

    public static List k0(CharSequence charSequence, String[] strArr, int i) {
        int i6 = (i & 4) != 0 ? 0 : 2;
        kotlin.jvm.internal.h.e(charSequence, "<this>");
        if (strArr.length == 1) {
            String str = strArr[0];
            if (str.length() != 0) {
                return j0(i6, charSequence, str);
            }
        }
        i0(i6);
        P7.k kVar = new P7.k(0, new c(charSequence, i6, new r(0, AbstractC5128i.q(strArr))));
        ArrayList arrayList = new ArrayList(AbstractC5131l.y(kVar, 10));
        Iterator it = kVar.iterator();
        while (true) {
            b bVar = (b) it;
            if (!bVar.hasNext()) {
                return arrayList;
            }
            N7.c range = (N7.c) bVar.next();
            kotlin.jvm.internal.h.e(range, "range");
            arrayList.add(charSequence.subSequence(range.f2017n, range.f2018u + 1).toString());
        }
    }

    public static List l0(String str, char[] cArr) {
        kotlin.jvm.internal.h.e(str, "<this>");
        if (cArr.length == 1) {
            return j0(0, str, String.valueOf(cArr[0]));
        }
        i0(0);
        P7.k kVar = new P7.k(0, new c(str, 0, new r(1, cArr)));
        ArrayList arrayList = new ArrayList(AbstractC5131l.y(kVar, 10));
        Iterator it = kVar.iterator();
        while (true) {
            b bVar = (b) it;
            if (!bVar.hasNext()) {
                return arrayList;
            }
            N7.c range = (N7.c) bVar.next();
            kotlin.jvm.internal.h.e(range, "range");
            arrayList.add(str.subSequence(range.f2017n, range.f2018u + 1).toString());
        }
    }

    public static boolean m0(char c9, String str) {
        return str.length() > 0 && F.k(str.charAt(0), c9, false);
    }

    public static String n0(String str, String delimiter) {
        kotlin.jvm.internal.h.e(delimiter, "delimiter");
        int a02 = a0(str, delimiter, 0, false, 6);
        if (a02 == -1) {
            return str;
        }
        String substring = str.substring(delimiter.length() + a02, str.length());
        kotlin.jvm.internal.h.d(substring, "substring(...)");
        return substring;
    }

    public static String o0(int i, String str) {
        kotlin.jvm.internal.h.e(str, "<this>");
        if (i < 0) {
            throw new IllegalArgumentException(y.k(i, "Requested character count ", " is less than zero.").toString());
        }
        int length = str.length();
        if (i > length) {
            i = length;
        }
        String substring = str.substring(0, i);
        kotlin.jvm.internal.h.d(substring, "substring(...)");
        return substring;
    }

    public static String p0(String str) {
        kotlin.jvm.internal.h.e(str, "<this>");
        int length = str.length();
        String substring = str.substring(length - (8 > length ? length : 8));
        kotlin.jvm.internal.h.d(substring, "substring(...)");
        return substring;
    }

    public static CharSequence q0(String str) {
        kotlin.jvm.internal.h.e(str, "<this>");
        int length = str.length() - 1;
        int i = 0;
        boolean z3 = false;
        while (i <= length) {
            boolean n9 = F.n(str.charAt(!z3 ? i : length));
            if (z3) {
                if (!n9) {
                    break;
                }
                length--;
            } else if (n9) {
                i++;
            } else {
                z3 = true;
            }
        }
        return str.subSequence(i, length + 1);
    }
}
