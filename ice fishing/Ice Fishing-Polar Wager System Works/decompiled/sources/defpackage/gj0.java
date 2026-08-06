package defpackage;

/* loaded from: classes.dex */
public abstract class gj0 {
    public static final java.lang.String IHQe1A4L2xu;
    public static final java.lang.String oh6vYeIP;

    static {
        java.lang.String str;
        int length = "H".length();
        if (length != 0) {
            int i = 1;
            if (length != 1) {
                java.lang.StringBuilder sb = new java.lang.StringBuilder("H".length() * 10);
                while (true) {
                    sb.append((java.lang.CharSequence) "H");
                    if (i == 10) {
                        break;
                    } else {
                        i++;
                    }
                }
                str = sb.toString();
            } else {
                char charAt = "H".charAt(0);
                char[] cArr = new char[10];
                for (int i2 = 0; i2 < 10; i2++) {
                    cArr[i2] = charAt;
                }
                str = new java.lang.String(cArr);
            }
        } else {
            str = "";
        }
        IHQe1A4L2xu = str;
        oh6vYeIP = str + '\n' + str;
    }
}
