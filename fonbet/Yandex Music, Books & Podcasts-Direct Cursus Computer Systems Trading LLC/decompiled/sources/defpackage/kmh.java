package defpackage;

import com.connectsdk.service.webos.lgcast.common.utils.StringUtil;
import java.util.regex.Pattern;

/* loaded from: classes.dex */
public final class kmh {
    public final int a;
    public final String b;
    public final int c;
    public final int d;

    public kmh(String str, int i, int i2, int i3) {
        this.a = i;
        this.b = str;
        this.c = i2;
        this.d = i3;
    }

    public static kmh a(String str) {
        int i = dvt.a;
        String[] split = str.split(StringUtil.SPACE, 2);
        vq1.v(split.length == 2);
        String str2 = split[0];
        Pattern pattern = cjo.a;
        try {
            int parseInt = Integer.parseInt(str2);
            int i2 = -1;
            String[] split2 = split[1].trim().split("/", -1);
            vq1.v(split2.length >= 2);
            String str3 = split2[1];
            try {
                int parseInt2 = Integer.parseInt(str3);
                if (split2.length == 3) {
                    String str4 = split2[2];
                    try {
                        i2 = Integer.parseInt(str4);
                    } catch (NumberFormatException e) {
                        throw r7k.b(str4, e);
                    }
                }
                return new kmh(split2[0], parseInt, parseInt2, i2);
            } catch (NumberFormatException e2) {
                throw r7k.b(str3, e2);
            }
        } catch (NumberFormatException e3) {
            throw r7k.b(str2, e3);
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && kmh.class == obj.getClass()) {
            kmh kmhVar = (kmh) obj;
            if (this.a == kmhVar.a && this.b.equals(kmhVar.b) && this.c == kmhVar.c && this.d == kmhVar.d) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((k5r.c((217 + this.a) * 31, 31, this.b) + this.c) * 31) + this.d;
    }
}
