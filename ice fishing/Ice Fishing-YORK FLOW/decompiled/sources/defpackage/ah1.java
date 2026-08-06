package defpackage;

/* compiled from: r8-map-id-5e15bf382d9e1cc682b2b5d208f848646545054061ee84effb1e415a0540fc32 */
/* loaded from: classes.dex */
public abstract class ah1 extends defpackage.zg1 {
    public static boolean OVwOqzUGHcCU(java.lang.String str, java.lang.String str2) {
        str.getClass();
        return str.startsWith(str2);
    }

    public static java.lang.String Wc0TdmRSwbbi(java.lang.String str, java.lang.String str2, java.lang.String str3) {
        str.getClass();
        int CZa7MwI9IzLd = defpackage.tg1.CZa7MwI9IzLd(0, str, str2, false);
        if (CZa7MwI9IzLd < 0) {
            return str;
        }
        int length = str2.length();
        int i = length >= 1 ? length : 1;
        int length2 = str3.length() + (str.length() - length);
        if (length2 < 0) {
            throw new java.lang.OutOfMemoryError();
        }
        java.lang.StringBuilder sb = new java.lang.StringBuilder(length2);
        int i2 = 0;
        do {
            sb.append((java.lang.CharSequence) str, i2, CZa7MwI9IzLd);
            sb.append(str3);
            i2 = CZa7MwI9IzLd + length;
            if (CZa7MwI9IzLd >= str.length()) {
                break;
            }
            CZa7MwI9IzLd = defpackage.tg1.CZa7MwI9IzLd(CZa7MwI9IzLd + i, str, str2, false);
        } while (CZa7MwI9IzLd > 0);
        sb.append((java.lang.CharSequence) str, i2, str.length());
        return sb.toString();
    }

    public static boolean w6IV1lieBIux(java.lang.String str, java.lang.String str2, boolean z) {
        return str == null ? str2 == null : !z ? str.equals(str2) : str.equalsIgnoreCase(str2);
    }

    public static java.lang.String zJPqDeoF0Os1() {
        char charAt = "H".charAt(0);
        char[] cArr = new char[10];
        for (int i = 0; i < 10; i++) {
            cArr[i] = charAt;
        }
        return new java.lang.String(cArr);
    }
}
