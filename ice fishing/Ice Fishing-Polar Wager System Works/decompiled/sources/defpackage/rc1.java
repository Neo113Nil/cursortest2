package defpackage;

/* loaded from: classes.dex */
public abstract class rc1 extends defpackage.yc1 {
    public static boolean AQHddgaEX(java.lang.CharSequence charSequence) {
        charSequence.getClass();
        for (int i = 0; i < charSequence.length(); i++) {
            if (!defpackage.x70.yIx6ChFVk(charSequence.charAt(i))) {
                return false;
            }
        }
        return true;
    }

    public static boolean AsxAYCCkb3Hi(java.lang.String str, java.lang.String str2, boolean z) {
        return QUKZkWRtw6(2, str, str2, z) >= 0;
    }

    public static java.util.List CGXpA9s3RjIa(java.lang.String str) {
        defpackage.ne0 ne0Var = new defpackage.ne0(str);
        if (!ne0Var.hasNext()) {
            return defpackage.nt.adDC3e2L;
        }
        java.lang.Object next = ne0Var.next();
        if (!ne0Var.hasNext()) {
            return defpackage.fm.p4kuH6PDtgom(next);
        }
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(next);
        while (ne0Var.hasNext()) {
            arrayList.add(ne0Var.next());
        }
        return arrayList;
    }

    public static java.lang.String JcqDrWrgMf(java.lang.String str, int i) {
        str.getClass();
        if (i < 0) {
            defpackage.db.adDC3e2L(defpackage.fx0.riuEU0zW4(i, "Requested character count ", " is less than zero."));
            return null;
        }
        int length = str.length();
        if (i > length) {
            i = length;
        }
        return str.substring(0, i);
    }

    public static /* synthetic */ int QUKZkWRtw6(int i, java.lang.String str, java.lang.String str2, boolean z) {
        if ((i & 4) != 0) {
            z = false;
        }
        return RmCzwkUxICV(0, str, str2, z);
    }

    public static final int RmCzwkUxICV(int i, java.lang.String str, java.lang.String str2, boolean z) {
        int i2;
        char upperCase;
        char upperCase2;
        java.lang.String str3;
        java.lang.String str4;
        boolean z2;
        boolean regionMatches;
        str2.getClass();
        if (!z) {
            return str.indexOf(str2, i);
        }
        int length = str.length();
        if (i < 0) {
            i = 0;
        }
        int length2 = str.length();
        if (length > length2) {
            length = length2;
        }
        int i3 = new defpackage.d70(i, length, 1).xiZrDbcSW0;
        if (str2 != null) {
            if (i <= i3) {
                int i4 = i;
                while (true) {
                    int length3 = str2.length();
                    if (z) {
                        str3 = str;
                        str4 = str2;
                        z2 = z;
                        regionMatches = str4.regionMatches(z2, 0, str3, i4, length3);
                    } else {
                        regionMatches = str2.regionMatches(0, str, i4, length3);
                        str3 = str;
                        str4 = str2;
                        z2 = z;
                    }
                    if (regionMatches) {
                        return i4;
                    }
                    if (i4 == i3) {
                        break;
                    }
                    i4++;
                    str2 = str4;
                    z = z2;
                    str = str3;
                }
            }
        } else if (i <= i3) {
            while (true) {
                int length4 = str2.length();
                if (i >= 0 && str2.length() - length4 >= 0 && i <= str.length() - length4) {
                    for (0; i2 < length4; i2 + 1) {
                        char charAt = str2.charAt(i2);
                        char charAt2 = str.charAt(i + i2);
                        i2 = (charAt == charAt2 || (z && ((upperCase = java.lang.Character.toUpperCase(charAt)) == (upperCase2 = java.lang.Character.toUpperCase(charAt2)) || java.lang.Character.toLowerCase(upperCase) == java.lang.Character.toLowerCase(upperCase2)))) ? i2 + 1 : 0;
                    }
                    return i;
                }
                if (i == i3) {
                    break;
                }
                i++;
            }
        }
        return -1;
    }

    public static java.lang.CharSequence gG5uWf3dqScO(java.lang.String str) {
        str.getClass();
        int length = str.length() - 1;
        int i = 0;
        boolean z = false;
        while (i <= length) {
            boolean yIx6ChFVk = defpackage.x70.yIx6ChFVk(str.charAt(!z ? i : length));
            if (z) {
                if (!yIx6ChFVk) {
                    break;
                }
                length--;
            } else if (yIx6ChFVk) {
                i++;
            } else {
                z = true;
            }
        }
        return str.subSequence(i, length + 1);
    }

    public static java.lang.String mL9sMlGfef(java.lang.String str, java.lang.String str2, java.lang.String str3) {
        int QUKZkWRtw6 = QUKZkWRtw6(6, str, str2, false);
        return QUKZkWRtw6 == -1 ? str3 : str.substring(str2.length() + QUKZkWRtw6, str.length());
    }

    public static int nVhUznk1t(java.lang.CharSequence charSequence, char c, int i, int i2) {
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
}
