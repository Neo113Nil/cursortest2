package f0;

import pc.j;

/* compiled from: r8-map-id-9ca073bbfde00f50be8682633edd5c48170ffeeeebc591f4c22ad3deaafa0d20 */
/* loaded from: classes.dex */
public abstract class c {

    /* renamed from: a, reason: collision with root package name */
    public static final String f2182a;

    /* renamed from: b, reason: collision with root package name */
    public static final String f2183b;

    static {
        String str;
        int length = "H".length();
        if (length != 0) {
            int i10 = 1;
            if (length != 1) {
                StringBuilder sb = new StringBuilder("H".length() * 10);
                while (true) {
                    sb.append((CharSequence) "H");
                    if (i10 == 10) {
                        break;
                    } else {
                        i10++;
                    }
                }
                str = sb.toString();
                j.b(str);
            } else {
                char charAt = "H".charAt(0);
                char[] cArr = new char[10];
                for (int i11 = 0; i11 < 10; i11++) {
                    cArr[i11] = charAt;
                }
                str = new String(cArr);
            }
        } else {
            str = "";
        }
        f2182a = str;
        f2183b = str + '\n' + str;
    }
}
