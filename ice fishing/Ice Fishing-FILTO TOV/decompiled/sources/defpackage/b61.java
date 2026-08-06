package defpackage;

import java.util.ArrayList;
import java.util.List;

/* loaded from: classes.dex */
public abstract class b61 extends i61 {
    public static final int CMh55RymNfS(CharSequence charSequence, String str, int i, boolean z) {
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
        x20 x20Var = new x20(i, length, 1);
        boolean z3 = charSequence instanceof String;
        int i2 = x20Var.EljAMC1QTz;
        if (!z3) {
            if (i > i2) {
                return -1;
            }
            while (!Uxq83abb04(str, charSequence, i, str.length(), z)) {
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

    public static final List Fm8W7vP7q(String str, String str2) {
        int CMh55RymNfS = CMh55RymNfS(str, str2, 0, false);
        if (CMh55RymNfS == -1) {
            return fb1.HFYAaqMd6(str.toString());
        }
        ArrayList arrayList = new ArrayList(10);
        int i = 0;
        do {
            arrayList.add(str.subSequence(i, CMh55RymNfS).toString());
            i = str2.length() + CMh55RymNfS;
            CMh55RymNfS = CMh55RymNfS(str, str2, i, false);
        } while (CMh55RymNfS != -1);
        arrayList.add(str.subSequence(i, str.length()).toString());
        return arrayList;
    }

    public static /* synthetic */ int J3Xc8BaqpN8(CharSequence charSequence, String str, int i, int i2) {
        if ((i2 & 2) != 0) {
            i = 0;
        }
        return CMh55RymNfS(charSequence, str, i, false);
    }

    public static boolean MItybXapHX(CharSequence charSequence) {
        charSequence.getClass();
        for (int i = 0; i < charSequence.length(); i++) {
            if (!ki1.A1EKNP6CxJ(charSequence.charAt(i))) {
                return false;
            }
        }
        return true;
    }

    public static final List MjxSquD6Av(String str) {
        na0 na0Var = new na0(str);
        if (!na0Var.hasNext()) {
            return xp.OOA6hdeuvCS;
        }
        Object next = na0Var.next();
        if (!na0Var.hasNext()) {
            return fb1.HFYAaqMd6(next);
        }
        ArrayList arrayList = new ArrayList();
        arrayList.add(next);
        while (na0Var.hasNext()) {
            arrayList.add(na0Var.next());
        }
        return arrayList;
    }

    public static final boolean Uxq83abb04(CharSequence charSequence, CharSequence charSequence2, int i, int i2, boolean z) {
        int i3;
        char upperCase;
        char upperCase2;
        charSequence.getClass();
        charSequence2.getClass();
        if (i >= 0 && charSequence.length() - i2 >= 0 && i <= charSequence2.length() - i2) {
            for (0; i3 < i2; i3 + 1) {
                char charAt = charSequence.charAt(i3);
                char charAt2 = charSequence2.charAt(i + i3);
                i3 = (charAt == charAt2 || (z && ((upperCase = Character.toUpperCase(charAt)) == (upperCase2 = Character.toUpperCase(charAt2)) || Character.toLowerCase(upperCase) == Character.toLowerCase(upperCase2)))) ? i3 + 1 : 0;
            }
            return true;
        }
        return false;
    }

    public static boolean YXi2hvwn7WL(String str, String str2) {
        return J3Xc8BaqpN8(str, str2, 0, 2) >= 0;
    }

    public static String c4eaifQP(String str, String str2) {
        int J3Xc8BaqpN8 = J3Xc8BaqpN8(str, str2, 0, 6);
        return J3Xc8BaqpN8 == -1 ? str : str.substring(str2.length() + J3Xc8BaqpN8, str.length());
    }

    public static String mqNvfisv7(String str, int i) {
        str.getClass();
        if (i < 0) {
            o4.OOA6hdeuvCS(mr0.encWxUiV2("Requested character count ", i, " is less than zero."));
            return null;
        }
        int length = str.length();
        if (i > length) {
            i = length;
        }
        return str.substring(0, i);
    }

    public static int qugwajBSa59j(CharSequence charSequence, char c, int i, int i2) {
        if ((i2 & 2) != 0) {
            i = 0;
        }
        charSequence.getClass();
        if (charSequence instanceof String) {
            return ((String) charSequence).indexOf(c, i);
        }
        char[] cArr = {c};
        if (charSequence instanceof String) {
            return ((String) charSequence).indexOf(cArr[0], i);
        }
        if (i < 0) {
            i = 0;
        }
        int length = charSequence.length() - 1;
        if (i > length) {
            return -1;
        }
        while (cArr[0] != charSequence.charAt(i)) {
            if (i == length) {
                return -1;
            }
            i++;
        }
        return i;
    }
}
