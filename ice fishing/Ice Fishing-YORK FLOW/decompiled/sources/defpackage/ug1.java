package defpackage;

/* compiled from: r8-map-id-5e15bf382d9e1cc682b2b5d208f848646545054061ee84effb1e415a0540fc32 */
/* loaded from: classes.dex */
public abstract class ug1 extends defpackage.v70 {
    public static java.lang.String GcLuU6pT9wO9(java.lang.String str) {
        java.lang.Comparable comparable;
        java.lang.String str2;
        java.util.List GoIRkIe1iwj6 = defpackage.tg1.GoIRkIe1iwj6(str);
        java.util.ArrayList arrayList = new java.util.ArrayList();
        for (java.lang.Object obj : GoIRkIe1iwj6) {
            if (!defpackage.tg1.PS16moFv2oLu((java.lang.String) obj)) {
                arrayList.add(obj);
            }
        }
        java.util.ArrayList arrayList2 = new java.util.ArrayList(defpackage.jf.Wc0TdmRSwbbi(arrayList, 10));
        int size = arrayList.size();
        int i = 0;
        int i2 = 0;
        while (i2 < size) {
            java.lang.Object obj2 = arrayList.get(i2);
            i2++;
            java.lang.String str3 = (java.lang.String) obj2;
            int length = str3.length();
            int i3 = 0;
            while (true) {
                if (i3 >= length) {
                    i3 = -1;
                    break;
                }
                if (!defpackage.jr0.frSwwKIlbUhK(str3.charAt(i3))) {
                    break;
                }
                i3++;
            }
            if (i3 == -1) {
                i3 = str3.length();
            }
            arrayList2.add(java.lang.Integer.valueOf(i3));
        }
        java.util.Iterator it = arrayList2.iterator();
        if (it.hasNext()) {
            comparable = (java.lang.Comparable) it.next();
            while (it.hasNext()) {
                java.lang.Comparable comparable2 = (java.lang.Comparable) it.next();
                if (comparable.compareTo(comparable2) > 0) {
                    comparable = comparable2;
                }
            }
        } else {
            comparable = null;
        }
        java.lang.Integer num = (java.lang.Integer) comparable;
        int intValue = num != null ? num.intValue() : 0;
        int length2 = str.length();
        GoIRkIe1iwj6.size();
        int size2 = GoIRkIe1iwj6.size() - 1;
        java.util.ArrayList arrayList3 = new java.util.ArrayList();
        for (java.lang.Object obj3 : GoIRkIe1iwj6) {
            int i4 = i + 1;
            if (i < 0) {
                defpackage.ma0.BXaznwstz2U0();
                throw null;
            }
            java.lang.String str4 = (java.lang.String) obj3;
            if ((i == 0 || i == size2) && defpackage.tg1.PS16moFv2oLu(str4)) {
                str2 = null;
            } else {
                str4.getClass();
                if (intValue < 0) {
                    defpackage.p81.fWTAfUmVKrZq("Requested character count ", intValue, " is less than zero.");
                    return null;
                }
                int length3 = str4.length();
                if (intValue <= length3) {
                    length3 = intValue;
                }
                str2 = str4.substring(length3);
            }
            if (str2 != null) {
                arrayList3.add(str2);
            }
            i = i4;
        }
        java.lang.StringBuilder sb = new java.lang.StringBuilder(length2);
        defpackage.hf.hwoZxnIesQBZ(arrayList3, sb, "\n", null, 124);
        return sb.toString();
    }

    public static java.lang.String hH0RRJrNssvh(java.lang.String str) {
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append((java.lang.CharSequence) "");
        defpackage.ph0 ph0Var = new defpackage.ph0(str);
        int i = 0;
        while (ph0Var.hasNext()) {
            java.lang.String str2 = (java.lang.String) ph0Var.next();
            str2.getClass();
            if (!defpackage.tg1.PS16moFv2oLu(str2)) {
                str2 = "    ".concat(str2);
            } else if (str2.length() < 4) {
                str2 = "    ";
            }
            i++;
            if (i > 1) {
                sb.append((java.lang.CharSequence) "\n");
            }
            defpackage.v70.GE9mJIPrb8gP(sb, str2, null);
        }
        sb.append((java.lang.CharSequence) "");
        return sb.toString();
    }

    public static java.lang.String xahdJg25P1Bv(java.lang.String str) {
        if (defpackage.tg1.PS16moFv2oLu("|")) {
            defpackage.h7.w7APNrr0aGRc("marginPrefix must be non-blank string.");
            return null;
        }
        java.util.List GoIRkIe1iwj6 = defpackage.tg1.GoIRkIe1iwj6(str);
        int length = str.length();
        GoIRkIe1iwj6.size();
        int size = GoIRkIe1iwj6.size() - 1;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        int i = 0;
        for (java.lang.Object obj : GoIRkIe1iwj6) {
            int i2 = i + 1;
            if (i < 0) {
                defpackage.ma0.BXaznwstz2U0();
                throw null;
            }
            java.lang.String str2 = (java.lang.String) obj;
            if ((i == 0 || i == size) && defpackage.tg1.PS16moFv2oLu(str2)) {
                str2 = null;
            } else {
                int length2 = str2.length();
                int i3 = 0;
                while (true) {
                    if (i3 >= length2) {
                        i3 = -1;
                        break;
                    }
                    if (!defpackage.jr0.frSwwKIlbUhK(str2.charAt(i3))) {
                        break;
                    }
                    i3++;
                }
                java.lang.String substring = (i3 != -1 && str2.startsWith("|", i3)) ? str2.substring("|".length() + i3) : null;
                if (substring != null) {
                    str2 = substring;
                }
            }
            if (str2 != null) {
                arrayList.add(str2);
            }
            i = i2;
        }
        java.lang.StringBuilder sb = new java.lang.StringBuilder(length);
        defpackage.hf.hwoZxnIesQBZ(arrayList, sb, "\n", null, 124);
        return sb.toString();
    }
}
