package Q7;

import D.x;
import com.google.android.gms.internal.ads.Wv;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.NoSuchElementException;
import v7.AbstractC5118i;
import v7.AbstractC5121l;

/* loaded from: classes2.dex */
public abstract class j extends q {
    public static List A0(CharSequence charSequence, String[] strArr, int i) {
        int i4 = (i & 4) != 0 ? 0 : 2;
        kotlin.jvm.internal.h.e(charSequence, "<this>");
        if (strArr.length == 1) {
            String str = strArr[0];
            if (str.length() != 0) {
                return z0(i4, charSequence, str);
            }
        }
        y0(i4);
        P7.k kVar = new P7.k(0, new c(charSequence, i4, new r(0, AbstractC5118i.t(strArr))));
        ArrayList arrayList = new ArrayList(AbstractC5121l.w(kVar, 10));
        Iterator it = kVar.iterator();
        while (true) {
            b bVar = (b) it;
            if (!bVar.hasNext()) {
                return arrayList;
            }
            N7.c range = (N7.c) bVar.next();
            kotlin.jvm.internal.h.e(range, "range");
            arrayList.add(charSequence.subSequence(range.f2105n, range.f2106u + 1).toString());
        }
    }

    public static List B0(String str, char[] cArr) {
        kotlin.jvm.internal.h.e(str, "<this>");
        if (cArr.length == 1) {
            return z0(0, str, String.valueOf(cArr[0]));
        }
        y0(0);
        P7.k kVar = new P7.k(0, new c(str, 0, new r(1, cArr)));
        ArrayList arrayList = new ArrayList(AbstractC5121l.w(kVar, 10));
        Iterator it = kVar.iterator();
        while (true) {
            b bVar = (b) it;
            if (!bVar.hasNext()) {
                return arrayList;
            }
            N7.c range = (N7.c) bVar.next();
            kotlin.jvm.internal.h.e(range, "range");
            arrayList.add(str.subSequence(range.f2105n, range.f2106u + 1).toString());
        }
    }

    public static boolean C0(char c9, String str) {
        return str.length() > 0 && A8.b.h(str.charAt(0), c9, false);
    }

    public static String D0(String str, String delimiter) {
        kotlin.jvm.internal.h.e(delimiter, "delimiter");
        int q02 = q0(str, delimiter, 0, false, 6);
        if (q02 == -1) {
            return str;
        }
        String substring = str.substring(delimiter.length() + q02, str.length());
        kotlin.jvm.internal.h.d(substring, "substring(...)");
        return substring;
    }

    public static String E0(int i, String str) {
        kotlin.jvm.internal.h.e(str, "<this>");
        if (i < 0) {
            throw new IllegalArgumentException(x.j(i, "Requested character count ", " is less than zero.").toString());
        }
        int length = str.length();
        if (i > length) {
            i = length;
        }
        String substring = str.substring(0, i);
        kotlin.jvm.internal.h.d(substring, "substring(...)");
        return substring;
    }

    public static String F0(String str) {
        kotlin.jvm.internal.h.e(str, "<this>");
        int length = str.length();
        String substring = str.substring(length - (8 > length ? length : 8));
        kotlin.jvm.internal.h.d(substring, "substring(...)");
        return substring;
    }

    public static CharSequence G0(String str) {
        kotlin.jvm.internal.h.e(str, "<this>");
        int length = str.length() - 1;
        int i = 0;
        boolean z6 = false;
        while (i <= length) {
            boolean o4 = A8.b.o(str.charAt(!z6 ? i : length));
            if (z6) {
                if (!o4) {
                    break;
                }
                length--;
            } else if (o4) {
                i++;
            } else {
                z6 = true;
            }
        }
        return str.subSequence(i, length + 1);
    }

    public static boolean k0(CharSequence charSequence, String str, boolean z6) {
        kotlin.jvm.internal.h.e(charSequence, "<this>");
        return q0(charSequence, str, 0, z6, 2) >= 0;
    }

    public static boolean l0(CharSequence charSequence, char c9) {
        kotlin.jvm.internal.h.e(charSequence, "<this>");
        return p0(charSequence, c9, 0, 2) >= 0;
    }

    public static String m0(int i, String str) {
        kotlin.jvm.internal.h.e(str, "<this>");
        if (i < 0) {
            throw new IllegalArgumentException(x.j(i, "Requested character count ", " is less than zero.").toString());
        }
        int length = str.length();
        if (i > length) {
            i = length;
        }
        String substring = str.substring(i);
        kotlin.jvm.internal.h.d(substring, "substring(...)");
        return substring;
    }

    public static final int n0(CharSequence charSequence) {
        kotlin.jvm.internal.h.e(charSequence, "<this>");
        return charSequence.length() - 1;
    }

    public static final int o0(CharSequence charSequence, String string, int i, boolean z6) {
        kotlin.jvm.internal.h.e(charSequence, "<this>");
        kotlin.jvm.internal.h.e(string, "string");
        if (!z6 && (charSequence instanceof String)) {
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
        boolean z9 = charSequence instanceof String;
        int i4 = cVar.f2107v;
        int i6 = cVar.f2106u;
        int i9 = cVar.f2105n;
        if (!z9 || string == null) {
            boolean z10 = z6;
            if ((i4 <= 0 || i9 > i6) && (i4 >= 0 || i6 > i9)) {
                return -1;
            }
            while (true) {
                CharSequence charSequence2 = charSequence;
                boolean z11 = z10;
                z10 = z11;
                if (w0(string, 0, charSequence2, i9, string.length(), z11)) {
                    return i9;
                }
                if (i9 == i6) {
                    return -1;
                }
                i9 += i4;
                charSequence = charSequence2;
            }
        } else {
            if ((i4 <= 0 || i9 > i6) && (i4 >= 0 || i6 > i9)) {
                return -1;
            }
            int i10 = i9;
            while (true) {
                String str = string;
                boolean z12 = z6;
                if (q.d0(0, i10, string.length(), str, (String) charSequence, z12)) {
                    return i10;
                }
                if (i10 == i6) {
                    return -1;
                }
                i10 += i4;
                string = str;
                z6 = z12;
            }
        }
    }

    public static int p0(CharSequence charSequence, char c9, int i, int i4) {
        if ((i4 & 2) != 0) {
            i = 0;
        }
        kotlin.jvm.internal.h.e(charSequence, "<this>");
        return !(charSequence instanceof String) ? r0(charSequence, new char[]{c9}, i, false) : ((String) charSequence).indexOf(c9, i);
    }

    public static /* synthetic */ int q0(CharSequence charSequence, String str, int i, boolean z6, int i4) {
        if ((i4 & 2) != 0) {
            i = 0;
        }
        if ((i4 & 4) != 0) {
            z6 = false;
        }
        return o0(charSequence, str, i, z6);
    }

    public static final int r0(CharSequence charSequence, char[] cArr, int i, boolean z6) {
        kotlin.jvm.internal.h.e(charSequence, "<this>");
        if (!z6 && cArr.length == 1 && (charSequence instanceof String)) {
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
        int n02 = n0(charSequence);
        if (i > n02) {
            return -1;
        }
        while (true) {
            char charAt = charSequence.charAt(i);
            for (char c9 : cArr) {
                if (A8.b.h(c9, charAt, z6)) {
                    return i;
                }
            }
            if (i == n02) {
                return -1;
            }
            i++;
        }
    }

    public static boolean s0(String str) {
        kotlin.jvm.internal.h.e(str, "<this>");
        for (int i = 0; i < str.length(); i++) {
            if (!A8.b.o(str.charAt(i))) {
                return false;
            }
        }
        return true;
    }

    public static int t0(int i, String str, String string) {
        int n02 = (i & 2) != 0 ? n0(str) : 0;
        kotlin.jvm.internal.h.e(str, "<this>");
        kotlin.jvm.internal.h.e(string, "string");
        return str.lastIndexOf(string, n02);
    }

    public static int u0(String str, int i, int i4, char c9) {
        if ((i4 & 2) != 0) {
            i = n0(str);
        }
        return str.lastIndexOf(c9, i);
    }

    public static String v0(int i, String str) {
        CharSequence charSequence;
        kotlin.jvm.internal.h.e(str, "<this>");
        if (i < 0) {
            throw new IllegalArgumentException(x.j(i, "Desired length ", " is less than zero."));
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

    public static final boolean w0(String str, int i, CharSequence other, int i4, int i6, boolean z6) {
        kotlin.jvm.internal.h.e(str, "<this>");
        kotlin.jvm.internal.h.e(other, "other");
        if (i4 >= 0 && i >= 0 && i <= str.length() - i6 && i4 <= other.length() - i6) {
            for (int i9 = 0; i9 < i6; i9++) {
                if (A8.b.h(str.charAt(i + i9), other.charAt(i4 + i9), z6)) {
                }
            }
            return true;
        }
        return false;
    }

    public static String x0(String str, String str2) {
        if (!q.h0(str, str2)) {
            return str;
        }
        String substring = str.substring(str2.length());
        kotlin.jvm.internal.h.d(substring, "substring(...)");
        return substring;
    }

    public static final void y0(int i) {
        if (i < 0) {
            throw new IllegalArgumentException(Wv.f(i, "Limit must be non-negative, but was ").toString());
        }
    }

    public static final List z0(int i, CharSequence charSequence, String str) {
        y0(i);
        int o02 = o0(charSequence, str, 0, false);
        if (o02 == -1 || i == 1) {
            return Z2.d.n(charSequence.toString());
        }
        boolean z6 = i > 0;
        int i4 = 10;
        if (z6 && i <= 10) {
            i4 = i;
        }
        ArrayList arrayList = new ArrayList(i4);
        int i6 = 0;
        do {
            arrayList.add(charSequence.subSequence(i6, o02).toString());
            i6 = str.length() + o02;
            if (z6 && arrayList.size() == i - 1) {
                break;
            }
            o02 = o0(charSequence, str, i6, false);
        } while (o02 != -1);
        arrayList.add(charSequence.subSequence(i6, charSequence.length()).toString());
        return arrayList;
    }
}
