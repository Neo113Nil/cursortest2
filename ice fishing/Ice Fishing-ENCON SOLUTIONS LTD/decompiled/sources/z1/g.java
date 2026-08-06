package z1;

import a.AbstractC0083a;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.NoSuchElementException;
import w1.C1062c;

/* loaded from: classes.dex */
public abstract class g extends o {
    public static boolean S(CharSequence charSequence, char c2) {
        kotlin.jvm.internal.i.e(charSequence, "<this>");
        return X(charSequence, c2, 0, false, 2) >= 0;
    }

    public static boolean T(CharSequence charSequence, String str) {
        kotlin.jvm.internal.i.e(charSequence, "<this>");
        return Y(charSequence, str, 0, false, 2) >= 0;
    }

    public static Character U(String str) {
        kotlin.jvm.internal.i.e(str, "<this>");
        if (str.length() == 0) {
            return null;
        }
        return Character.valueOf(str.charAt(0));
    }

    public static final int V(CharSequence charSequence) {
        kotlin.jvm.internal.i.e(charSequence, "<this>");
        return charSequence.length() - 1;
    }

    public static final int W(CharSequence charSequence, String string, int i2, boolean z2) {
        kotlin.jvm.internal.i.e(charSequence, "<this>");
        kotlin.jvm.internal.i.e(string, "string");
        if (!z2 && (charSequence instanceof String)) {
            return ((String) charSequence).indexOf(string, i2);
        }
        int length = charSequence.length();
        if (i2 < 0) {
            i2 = 0;
        }
        int length2 = charSequence.length();
        if (length > length2) {
            length = length2;
        }
        C1062c c1062c = new C1062c(i2, length, 1);
        boolean z3 = charSequence instanceof String;
        int i3 = c1062c.f8518c;
        int i4 = c1062c.f8517b;
        int i5 = c1062c.f8516a;
        if (!z3 || string == null) {
            if ((i3 > 0 && i5 <= i4) || (i3 < 0 && i4 <= i5)) {
                while (!c0(string, 0, charSequence, i5, string.length(), z2)) {
                    if (i5 != i4) {
                        i5 += i3;
                    }
                }
                return i5;
            }
            return -1;
        }
        if ((i3 > 0 && i5 <= i4) || (i3 < 0 && i4 <= i5)) {
            while (!o.O(0, i5, string.length(), string, (String) charSequence, z2)) {
                if (i5 != i4) {
                    i5 += i3;
                }
            }
            return i5;
        }
        return -1;
    }

    public static int X(CharSequence charSequence, char c2, int i2, boolean z2, int i3) {
        if ((i3 & 2) != 0) {
            i2 = 0;
        }
        if ((i3 & 4) != 0) {
            z2 = false;
        }
        kotlin.jvm.internal.i.e(charSequence, "<this>");
        return (z2 || !(charSequence instanceof String)) ? Z(charSequence, new char[]{c2}, i2, z2) : ((String) charSequence).indexOf(c2, i2);
    }

    public static /* synthetic */ int Y(CharSequence charSequence, String str, int i2, boolean z2, int i3) {
        if ((i3 & 2) != 0) {
            i2 = 0;
        }
        if ((i3 & 4) != 0) {
            z2 = false;
        }
        return W(charSequence, str, i2, z2);
    }

    public static final int Z(CharSequence charSequence, char[] cArr, int i2, boolean z2) {
        kotlin.jvm.internal.i.e(charSequence, "<this>");
        if (!z2 && cArr.length == 1 && (charSequence instanceof String)) {
            int length = cArr.length;
            if (length == 0) {
                throw new NoSuchElementException("Array is empty.");
            }
            if (length != 1) {
                throw new IllegalArgumentException("Array has more than one element.");
            }
            return ((String) charSequence).indexOf(cArr[0], i2);
        }
        if (i2 < 0) {
            i2 = 0;
        }
        int V2 = V(charSequence);
        if (i2 > V2) {
            return -1;
        }
        while (true) {
            char charAt = charSequence.charAt(i2);
            for (char c2 : cArr) {
                if (R1.d.k(c2, charAt, z2)) {
                    return i2;
                }
            }
            if (i2 == V2) {
                return -1;
            }
            i2++;
        }
    }

    public static boolean a0(CharSequence charSequence) {
        kotlin.jvm.internal.i.e(charSequence, "<this>");
        for (int i2 = 0; i2 < charSequence.length(); i2++) {
            if (!R1.d.x(charSequence.charAt(i2))) {
                return false;
            }
        }
        return true;
    }

    public static int b0(String str, char c2, int i2, int i3) {
        if ((i3 & 2) != 0) {
            i2 = V(str);
        }
        kotlin.jvm.internal.i.e(str, "<this>");
        return str.lastIndexOf(c2, i2);
    }

    public static final boolean c0(String str, int i2, CharSequence other, int i3, int i4, boolean z2) {
        kotlin.jvm.internal.i.e(str, "<this>");
        kotlin.jvm.internal.i.e(other, "other");
        if (i3 < 0 || i2 < 0 || i2 > str.length() - i4 || i3 > other.length() - i4) {
            return false;
        }
        for (int i5 = 0; i5 < i4; i5++) {
            if (!R1.d.k(str.charAt(i2 + i5), other.charAt(i3 + i5), z2)) {
                return false;
            }
        }
        return true;
    }

    public static String d0(String str, String str2) {
        if (!o.R(str, str2, false)) {
            return str;
        }
        String substring = str.substring(str2.length());
        kotlin.jvm.internal.i.d(substring, "substring(...)");
        return substring;
    }

    public static final void e0(int i2) {
        if (i2 < 0) {
            throw new IllegalArgumentException(C1.a.f(i2, "Limit must be non-negative, but was ").toString());
        }
    }

    public static final List f0(int i2, String str, String str2, boolean z2) {
        e0(i2);
        int i3 = 0;
        int W2 = W(str, str2, 0, z2);
        if (W2 == -1 || i2 == 1) {
            return AbstractC0083a.m(str.toString());
        }
        boolean z3 = i2 > 0;
        int i4 = 10;
        if (z3 && i2 <= 10) {
            i4 = i2;
        }
        ArrayList arrayList = new ArrayList(i4);
        do {
            arrayList.add(str.subSequence(i3, W2).toString());
            i3 = str2.length() + W2;
            if (z3 && arrayList.size() == i2 - 1) {
                break;
            }
            W2 = W(str, str2, i3, z2);
        } while (W2 != -1);
        arrayList.add(str.subSequence(i3, str.length()).toString());
        return arrayList;
    }

    public static List g0(String str, char[] cArr) {
        kotlin.jvm.internal.i.e(str, "<this>");
        boolean z2 = false;
        if (cArr.length == 1) {
            return f0(0, str, String.valueOf(cArr[0]), false);
        }
        e0(0);
        y1.f fVar = new y1.f(new c(str, 0, 0, new p(cArr, z2, 0)));
        ArrayList arrayList = new ArrayList(i1.k.E(fVar));
        Iterator it = fVar.iterator();
        while (true) {
            b bVar = (b) it;
            if (!bVar.hasNext()) {
                return arrayList;
            }
            C1062c range = (C1062c) bVar.next();
            kotlin.jvm.internal.i.e(range, "range");
            arrayList.add(str.subSequence(range.f8516a, range.f8517b + 1).toString());
        }
    }

    public static String h0(String str, String delimiter) {
        kotlin.jvm.internal.i.e(delimiter, "delimiter");
        int Y = Y(str, delimiter, 0, false, 6);
        if (Y == -1) {
            return str;
        }
        String substring = str.substring(delimiter.length() + Y, str.length());
        kotlin.jvm.internal.i.d(substring, "substring(...)");
        return substring;
    }

    public static String i0(String str, String missingDelimiterValue) {
        kotlin.jvm.internal.i.e(missingDelimiterValue, "missingDelimiterValue");
        int b02 = b0(str, '.', 0, 6);
        if (b02 == -1) {
            return missingDelimiterValue;
        }
        String substring = str.substring(b02 + 1, str.length());
        kotlin.jvm.internal.i.d(substring, "substring(...)");
        return substring;
    }

    public static String j0(int i2, String str) {
        if (i2 < 0) {
            throw new IllegalArgumentException(C1.a.g(i2, "Requested character count ", " is less than zero.").toString());
        }
        int length = str.length();
        if (i2 > length) {
            i2 = length;
        }
        String substring = str.substring(0, i2);
        kotlin.jvm.internal.i.d(substring, "substring(...)");
        return substring;
    }

    public static CharSequence k0(String str) {
        kotlin.jvm.internal.i.e(str, "<this>");
        int length = str.length() - 1;
        int i2 = 0;
        boolean z2 = false;
        while (i2 <= length) {
            boolean x2 = R1.d.x(str.charAt(!z2 ? i2 : length));
            if (z2) {
                if (!x2) {
                    break;
                }
                length--;
            } else if (x2) {
                i2++;
            } else {
                z2 = true;
            }
        }
        return str.subSequence(i2, length + 1);
    }
}
