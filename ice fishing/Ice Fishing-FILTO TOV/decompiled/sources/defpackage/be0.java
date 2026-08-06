package defpackage;

/* compiled from: r8-map-id-f07502904ffb6c7cfc104556b013e0e48cd078697d1e7ebb5294e50317be4258 */
/* loaded from: classes.dex */
public abstract class be0 {
    public static final String GWasM1elztuh;
    public static final String Yi7zF1RB1;

    static {
        String str;
        int length = "H".length();
        if (length != 0) {
            int i = 1;
            if (length != 1) {
                StringBuilder sb = new StringBuilder("H".length() * 10);
                while (true) {
                    sb.append((CharSequence) "H");
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
                str = new String(cArr);
            }
        } else {
            str = "";
        }
        GWasM1elztuh = str;
        Yi7zF1RB1 = str + '\n' + str;
    }
}
