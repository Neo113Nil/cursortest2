package t0;

import C1.l;
import D1.i;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* renamed from: t0.d, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC0352d {
    public static String b(Object obj, String str) {
        i.e(obj, "value");
        return str + " value: " + obj;
    }

    public static f c(String str) {
        if (str == null || K1.d.k0(str)) {
            return null;
        }
        Matcher matcher = Pattern.compile("(\\d+)(?:\\.(\\d+))(?:\\.(\\d+))(?:-(.+))?").matcher(str);
        if (!matcher.matches()) {
            return null;
        }
        String group = matcher.group(1);
        Integer valueOf = group == null ? null : Integer.valueOf(Integer.parseInt(group));
        if (valueOf == null) {
            return null;
        }
        int intValue = valueOf.intValue();
        String group2 = matcher.group(2);
        Integer valueOf2 = group2 == null ? null : Integer.valueOf(Integer.parseInt(group2));
        if (valueOf2 == null) {
            return null;
        }
        int intValue2 = valueOf2.intValue();
        String group3 = matcher.group(3);
        Integer valueOf3 = group3 == null ? null : Integer.valueOf(Integer.parseInt(group3));
        if (valueOf3 == null) {
            return null;
        }
        int intValue3 = valueOf3.intValue();
        String group4 = matcher.group(4) != null ? matcher.group(4) : "";
        i.d(group4, "description");
        return new f(intValue, intValue2, intValue3, group4);
    }

    public abstract Object a();

    public abstract AbstractC0352d d(String str, l lVar);
}
