package defpackage;

/* loaded from: classes.dex */
public abstract class sc1 extends defpackage.s70 {
    public static java.lang.String QPwENk36pDC(java.lang.String str) {
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append((java.lang.CharSequence) "");
        defpackage.ne0 ne0Var = new defpackage.ne0(str);
        int i = 0;
        while (ne0Var.hasNext()) {
            java.lang.String str2 = (java.lang.String) ne0Var.next();
            str2.getClass();
            if (!defpackage.rc1.AQHddgaEX(str2)) {
                str2 = "    ".concat(str2);
            } else if (str2.length() < 4) {
                str2 = "    ";
            }
            i++;
            if (i > 1) {
                sb.append((java.lang.CharSequence) "\n");
            }
            defpackage.s70.xiZrDbcSW0(sb, str2, null);
        }
        sb.append((java.lang.CharSequence) "");
        return sb.toString();
    }

    public static java.lang.String Ye0N2xE9Hc(java.lang.String str) {
        if (defpackage.rc1.AQHddgaEX("|")) {
            defpackage.db.fnWB2E7cs("marginPrefix must be non-blank string.");
            return null;
        }
        java.util.List CGXpA9s3RjIa = defpackage.rc1.CGXpA9s3RjIa(str);
        int length = str.length();
        CGXpA9s3RjIa.size();
        int size = CGXpA9s3RjIa.size() - 1;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        int i = 0;
        for (java.lang.Object obj : CGXpA9s3RjIa) {
            int i2 = i + 1;
            if (i < 0) {
                defpackage.fm.hkbnNdmy();
                throw null;
            }
            java.lang.String str2 = (java.lang.String) obj;
            if ((i == 0 || i == size) && defpackage.rc1.AQHddgaEX(str2)) {
                str2 = null;
            } else {
                int length2 = str2.length();
                int i3 = 0;
                while (true) {
                    if (i3 >= length2) {
                        i3 = -1;
                        break;
                    }
                    if (!defpackage.x70.yIx6ChFVk(str2.charAt(i3))) {
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
        defpackage.td.OtkytngK3Mr(arrayList, sb, "\n", "", "", "...", null);
        return sb.toString();
    }
}
