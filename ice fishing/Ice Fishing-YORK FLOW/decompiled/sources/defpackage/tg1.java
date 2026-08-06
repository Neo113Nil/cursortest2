package defpackage;

/* loaded from: classes.dex */
public abstract class tg1 extends defpackage.ah1 {
    public static final int CZa7MwI9IzLd(int i, java.lang.CharSequence charSequence, java.lang.String str, boolean z) {
        charSequence.getClass();
        str.getClass();
        return (z || !(charSequence instanceof java.lang.String)) ? EPEWHACkMcF1(charSequence, str, i, charSequence.length(), z) : ((java.lang.String) charSequence).indexOf(str, i);
    }

    public static int EPEWHACkMcF1(java.lang.CharSequence charSequence, java.lang.CharSequence charSequence2, int i, int i2, boolean z) {
        if (i < 0) {
            i = 0;
        }
        int length = charSequence.length();
        if (i2 <= length) {
            length = i2;
        }
        defpackage.p90 p90Var = new defpackage.p90(i, length, 1);
        boolean z2 = charSequence instanceof java.lang.String;
        int i3 = p90Var.oh71FJcDz6S2;
        if (!z2 || !(charSequence2 instanceof java.lang.String)) {
            if (i > i3) {
                return -1;
            }
            int i4 = i;
            while (!fhbmYuu9J3cT(charSequence2, 0, charSequence, i4, charSequence2.length(), z)) {
                if (i4 == i3) {
                    return -1;
                }
                i4++;
            }
            return i4;
        }
        if (i > i3) {
            return -1;
        }
        int i5 = i;
        while (true) {
            java.lang.String str = (java.lang.String) charSequence2;
            java.lang.String str2 = (java.lang.String) charSequence;
            int length2 = str.length();
            if (!z ? str.regionMatches(0, str2, i5, length2) : str.regionMatches(z, 0, str2, i5, length2)) {
                return i5;
            }
            if (i5 == i3) {
                return -1;
            }
            i5++;
        }
    }

    public static java.lang.String FhgBoOud6zyW(java.lang.String str, java.lang.String str2, java.lang.String str3) {
        int z16KqenTjq8o = z16KqenTjq8o(6, str, str2, false);
        return z16KqenTjq8o == -1 ? str3 : str.substring(str2.length() + z16KqenTjq8o, str.length());
    }

    public static boolean Fu5WBEia9jBo(java.lang.CharSequence charSequence, char c) {
        charSequence.getClass();
        return NkfcFfdaVTox(charSequence, c, 0, 2) >= 0;
    }

    public static java.util.List GoIRkIe1iwj6(java.lang.String str) {
        defpackage.ph0 ph0Var = new defpackage.ph0(str);
        if (!ph0Var.hasNext()) {
            return defpackage.av.WDYagTQQm9ns;
        }
        java.lang.Object next = ph0Var.next();
        if (!ph0Var.hasNext()) {
            return defpackage.ma0.VFeft99leXEK(next);
        }
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(next);
        while (ph0Var.hasNext()) {
            arrayList.add(ph0Var.next());
        }
        return arrayList;
    }

    public static boolean Jkfc0NcwyPL8(java.lang.CharSequence charSequence, java.lang.CharSequence charSequence2, boolean z) {
        charSequence.getClass();
        charSequence2.getClass();
        if (charSequence2 instanceof java.lang.String) {
            if (z16KqenTjq8o(2, charSequence, (java.lang.String) charSequence2, z) >= 0) {
                return true;
            }
        } else if (EPEWHACkMcF1(charSequence, charSequence2, 0, charSequence.length(), z) >= 0) {
            return true;
        }
        return false;
    }

    public static int NkfcFfdaVTox(java.lang.CharSequence charSequence, char c, int i, int i2) {
        if ((i2 & 2) != 0) {
            i = 0;
        }
        charSequence.getClass();
        if (charSequence instanceof java.lang.String) {
            return ((java.lang.String) charSequence).indexOf(c, i);
        }
        char[] cArr = {c};
        if (charSequence instanceof java.lang.String) {
            return ((java.lang.String) charSequence).indexOf(cArr[0], i);
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

    public static boolean PS16moFv2oLu(java.lang.CharSequence charSequence) {
        charSequence.getClass();
        for (int i = 0; i < charSequence.length(); i++) {
            if (!defpackage.jr0.frSwwKIlbUhK(charSequence.charAt(i))) {
                return false;
            }
        }
        return true;
    }

    public static java.lang.String Rl68HURFBtL3(java.lang.String str, char c) {
        str.getClass();
        str.getClass();
        int lastIndexOf = str.lastIndexOf(c, str.length() - 1);
        return lastIndexOf == -1 ? str : str.substring(lastIndexOf + 1, str.length());
    }

    public static java.lang.String cCeDCHgnx5OL(java.lang.String str, int i) {
        str.getClass();
        if (i < 0) {
            defpackage.p81.fWTAfUmVKrZq("Requested character count ", i, " is less than zero.");
            return null;
        }
        int length = str.length();
        if (i > length) {
            i = length;
        }
        return str.substring(0, i);
    }

    public static final boolean fhbmYuu9J3cT(java.lang.CharSequence charSequence, int i, java.lang.CharSequence charSequence2, int i2, int i3, boolean z) {
        int i4;
        char upperCase;
        char upperCase2;
        charSequence.getClass();
        charSequence2.getClass();
        if (i2 >= 0 && i >= 0 && i <= charSequence.length() - i3 && i2 <= charSequence2.length() - i3) {
            for (0; i4 < i3; i4 + 1) {
                char charAt = charSequence.charAt(i + i4);
                char charAt2 = charSequence2.charAt(i2 + i4);
                i4 = (charAt == charAt2 || (z && ((upperCase = java.lang.Character.toUpperCase(charAt)) == (upperCase2 = java.lang.Character.toUpperCase(charAt2)) || java.lang.Character.toLowerCase(upperCase) == java.lang.Character.toLowerCase(upperCase2)))) ? i4 + 1 : 0;
            }
            return true;
        }
        return false;
    }

    public static java.lang.CharSequence omM9cAlgeGXx(java.lang.String str) {
        str.getClass();
        int length = str.length() - 1;
        int i = 0;
        boolean z = false;
        while (i <= length) {
            boolean frSwwKIlbUhK = defpackage.jr0.frSwwKIlbUhK(str.charAt(!z ? i : length));
            if (z) {
                if (!frSwwKIlbUhK) {
                    break;
                }
                length--;
            } else if (frSwwKIlbUhK) {
                i++;
            } else {
                z = true;
            }
        }
        return str.subSequence(i, length + 1);
    }

    public static /* synthetic */ int z16KqenTjq8o(int i, java.lang.CharSequence charSequence, java.lang.String str, boolean z) {
        if ((i & 4) != 0) {
            z = false;
        }
        return CZa7MwI9IzLd(0, charSequence, str, z);
    }
}
