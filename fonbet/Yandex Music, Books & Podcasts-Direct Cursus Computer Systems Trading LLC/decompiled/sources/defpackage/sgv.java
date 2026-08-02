package defpackage;

import java.util.regex.Pattern;

/* loaded from: classes.dex */
public final class sgv {
    public static final Pattern c = Pattern.compile("\\[voice=\"([^\"]*)\"\\]");
    public static final Pattern d = Pattern.compile("^((?:[0-9]*\\.)?[0-9]+)(px|em|%)$");
    public final d7k a = new d7k();
    public final StringBuilder b = new StringBuilder();

    public static String a(d7k d7kVar, StringBuilder sb) {
        boolean z = false;
        sb.setLength(0);
        int i = d7kVar.b;
        int i2 = d7kVar.c;
        while (i < i2 && !z) {
            char c2 = (char) d7kVar.a[i];
            if ((c2 < 'A' || c2 > 'Z') && ((c2 < 'a' || c2 > 'z') && !((c2 >= '0' && c2 <= '9') || c2 == '#' || c2 == '-' || c2 == '.' || c2 == '_'))) {
                z = true;
            } else {
                i++;
                sb.append(c2);
            }
        }
        d7kVar.I(i - d7kVar.b);
        return sb.toString();
    }

    public static String b(d7k d7kVar, StringBuilder sb) {
        c(d7kVar);
        if (d7kVar.a() == 0) {
            return null;
        }
        String a = a(d7kVar, sb);
        if (!"".equals(a)) {
            return a;
        }
        return "" + ((char) d7kVar.v());
    }

    public static void c(d7k d7kVar) {
        while (true) {
            for (boolean z = true; d7kVar.a() > 0 && z; z = false) {
                int i = d7kVar.b;
                byte[] bArr = d7kVar.a;
                byte b = bArr[i];
                char c2 = (char) b;
                if (c2 == '\t' || c2 == '\n' || c2 == '\f' || c2 == '\r' || c2 == ' ') {
                    d7kVar.I(1);
                } else {
                    int i2 = d7kVar.c;
                    int i3 = i + 2;
                    if (i3 <= i2) {
                        int i4 = i + 1;
                        if (b == 47 && bArr[i4] == 42) {
                            while (true) {
                                int i5 = i3 + 1;
                                if (i5 >= i2) {
                                    break;
                                }
                                if (((char) bArr[i3]) == '*' && ((char) bArr[i5]) == '/') {
                                    i3 += 2;
                                    i2 = i3;
                                } else {
                                    i3 = i5;
                                }
                            }
                            d7kVar.I(i2 - d7kVar.b);
                        }
                    }
                }
            }
            return;
        }
    }
}
