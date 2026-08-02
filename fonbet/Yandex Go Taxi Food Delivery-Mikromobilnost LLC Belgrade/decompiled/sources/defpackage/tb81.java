package defpackage;

import java.util.List;
import kotlin.collections.a;

/* loaded from: classes7.dex */
public final class tb81 {
    public static m881 a(String str) {
        Integer l;
        int length = str.length();
        int i = 0;
        while (true) {
            if (i < length) {
                if (str.charAt(i) == '-') {
                    str = str.substring(0, i);
                    break;
                }
                i++;
            } else {
                break;
            }
        }
        List Y = evu0.Y(str, new char[]{'.'}, 0, 6);
        String str2 = (String) a.S(0, Y);
        if (str2 == null || (l = bvu0.l(10, str2)) == null) {
            return null;
        }
        int intValue = l.intValue();
        Integer l2 = bvu0.l(10, (String) (1 <= scc.f(Y) ? Y.get(1) : "0"));
        if (l2 == null) {
            return null;
        }
        int intValue2 = l2.intValue();
        Integer l3 = bvu0.l(10, (String) (2 <= scc.f(Y) ? Y.get(2) : "0"));
        if (l3 != null) {
            return new m881(intValue, intValue2, l3.intValue());
        }
        return null;
    }
}
