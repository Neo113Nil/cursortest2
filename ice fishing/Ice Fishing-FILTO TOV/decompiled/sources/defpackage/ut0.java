package defpackage;

import java.io.Serializable;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* compiled from: r8-map-id-f07502904ffb6c7cfc104556b013e0e48cd078697d1e7ebb5294e50317be4258 */
/* loaded from: classes.dex */
public final class ut0 implements Serializable {
    public final Pattern OOA6hdeuvCS;

    public ut0(String str, int i) {
        str.getClass();
        Pattern compile = Pattern.compile(str, 66);
        compile.getClass();
        this.OOA6hdeuvCS = compile;
    }

    public final f4 GWasM1elztuh(String str) {
        str.getClass();
        Matcher matcher = this.OOA6hdeuvCS.matcher(str);
        matcher.getClass();
        if (matcher.matches()) {
            return new f4(matcher, str);
        }
        return null;
    }

    public final String toString() {
        String pattern = this.OOA6hdeuvCS.toString();
        pattern.getClass();
        return pattern;
    }

    public ut0(String str) {
        str.getClass();
        Pattern compile = Pattern.compile(str);
        compile.getClass();
        this.OOA6hdeuvCS = compile;
    }
}
