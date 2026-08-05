package defpackage;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes.dex */
public abstract class ba0 extends ja0 {
    public static List DK9slbsy(CharSequence charSequence) {
        hp hpVar = new hp(charSequence);
        if (!hpVar.hasNext()) {
            return wf.NCTxEWno;
        }
        Object next = hpVar.next();
        if (!hpVar.hasNext()) {
            return ra.FySoLYna(next);
        }
        ArrayList arrayList = new ArrayList();
        arrayList.add(next);
        while (hpVar.hasNext()) {
            arrayList.add(hpVar.next());
        }
        return arrayList;
    }

    public static /* synthetic */ int FySoLYna(CharSequence charSequence, String str, int i, int i2) {
        if ((i2 & 2) != 0) {
            i = 0;
        }
        return RXQxj5Oe(charSequence, str, i, false);
    }

    public static boolean I5GHvsYW(String str, String str2) {
        return FySoLYna(str, str2, 0, 2) >= 0;
    }

    public static String Mq3SeTnW(String str) {
        str.getClass();
        str.getClass();
        int lastIndexOf = str.lastIndexOf(47, str.length() - 1);
        return lastIndexOf == -1 ? str : str.substring(lastIndexOf + 1, str.length());
    }

    public static final int RXQxj5Oe(CharSequence charSequence, String str, int i, boolean z) {
        String str2;
        boolean z2;
        boolean regionMatches;
        charSequence.getClass();
        str.getClass();
        if (!z && (charSequence instanceof String)) {
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
        en enVar = new en(i, length, 1);
        boolean z3 = charSequence instanceof String;
        int i2 = enVar.MdtA4re8;
        if (!z3) {
            if (i > i2) {
                return -1;
            }
            while (!lwWCatUu(str, charSequence, i, str.length(), z)) {
                if (i == i2) {
                    return -1;
                }
                i++;
            }
            return i;
        }
        if (i > i2) {
            return -1;
        }
        int i3 = i;
        while (true) {
            String str3 = (String) charSequence;
            int length3 = str.length();
            if (z) {
                str2 = str;
                z2 = z;
                regionMatches = str2.regionMatches(z2, 0, str3, i3, length3);
            } else {
                regionMatches = str.regionMatches(0, str3, i3, length3);
                str2 = str;
                z2 = z;
            }
            if (regionMatches) {
                return i3;
            }
            if (i3 == i2) {
                return -1;
            }
            i3++;
            str = str2;
            z = z2;
        }
    }

    public static CharSequence SgZGMMPL(String str) {
        str.getClass();
        int length = str.length() - 1;
        int i = 0;
        boolean z = false;
        while (i <= length) {
            boolean U0LaHZX7 = le0.U0LaHZX7(str.charAt(!z ? i : length));
            if (z) {
                if (!U0LaHZX7) {
                    break;
                }
                length--;
            } else if (U0LaHZX7) {
                i++;
            } else {
                z = true;
            }
        }
        return str.subSequence(i, length + 1);
    }

    public static List U0LaHZX7(CharSequence charSequence, String[] strArr) {
        charSequence.getClass();
        if (strArr.length == 1) {
            String str = strArr[0];
            if (str.length() != 0) {
                int RXQxj5Oe = RXQxj5Oe(charSequence, str, 0, false);
                if (RXQxj5Oe == -1) {
                    return ra.FySoLYna(charSequence.toString());
                }
                ArrayList arrayList = new ArrayList(10);
                int i = 0;
                do {
                    arrayList.add(charSequence.subSequence(i, RXQxj5Oe).toString());
                    i = str.length() + RXQxj5Oe;
                    RXQxj5Oe = RXQxj5Oe(charSequence, str, i, false);
                } while (RXQxj5Oe != -1);
                arrayList.add(charSequence.subSequence(i, charSequence.length()).toString());
                return arrayList;
            }
        }
        List asList = Arrays.asList(strArr);
        asList.getClass();
        n60 n60Var = new n60(new xb(charSequence, new kx(2, asList)));
        ArrayList arrayList2 = new ArrayList(z5.bvfAo0eO(n60Var, 10));
        Iterator it = n60Var.iterator();
        while (true) {
            wb wbVar = (wb) it;
            if (!wbVar.hasNext()) {
                return arrayList2;
            }
            en enVar = (en) wbVar.next();
            enVar.getClass();
            arrayList2.add(charSequence.subSequence(enVar.NCTxEWno, enVar.MdtA4re8 + 1).toString());
        }
    }

    public static boolean WYNAV5pd(CharSequence charSequence) {
        charSequence.getClass();
        for (int i = 0; i < charSequence.length(); i++) {
            if (!le0.U0LaHZX7(charSequence.charAt(i))) {
                return false;
            }
        }
        return true;
    }

    public static String euDDoUNr(String str) {
        str.getClass();
        int length = str.length();
        if (1 <= length) {
            length = 1;
        }
        return str.substring(0, length);
    }

    public static int gjV1z5T1(String str, char c, int i, int i2) {
        if ((i2 & 2) != 0) {
            i = 0;
        }
        return str.indexOf(c, i);
    }

    public static String i7xS8jrb(String str, String str2, String str3) {
        int FySoLYna = FySoLYna(str, str2, 0, 6);
        return FySoLYna == -1 ? str3 : str.substring(str2.length() + FySoLYna, str.length());
    }

    public static final boolean lwWCatUu(String str, CharSequence charSequence, int i, int i2, boolean z) {
        int i3;
        char upperCase;
        char upperCase2;
        str.getClass();
        charSequence.getClass();
        if (i >= 0 && str.length() - i2 >= 0 && i <= charSequence.length() - i2) {
            for (0; i3 < i2; i3 + 1) {
                char charAt = str.charAt(i3);
                char charAt2 = charSequence.charAt(i + i3);
                i3 = (charAt == charAt2 || (z && ((upperCase = Character.toUpperCase(charAt)) == (upperCase2 = Character.toUpperCase(charAt2)) || Character.toLowerCase(upperCase) == Character.toLowerCase(upperCase2)))) ? i3 + 1 : 0;
            }
            return true;
        }
        return false;
    }
}
