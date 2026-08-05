package defpackage;

import java.io.Serializable;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* compiled from: r8-map-id-3663cbcef52f1a493ceac7deeb6c50e305d4d0c9f83e91180cb6ce540f71d6b5 */
/* loaded from: classes.dex */
public final class o20 implements Serializable {
    public final Pattern NCTxEWno;

    public o20(String str, int i) {
        str.getClass();
        Pattern compile = Pattern.compile(str, 66);
        compile.getClass();
        this.NCTxEWno = compile;
    }

    public final f0 qoPGr6Ce(String str) {
        str.getClass();
        Matcher matcher = this.NCTxEWno.matcher(str);
        matcher.getClass();
        if (matcher.matches()) {
            return new f0(matcher, str);
        }
        return null;
    }

    public final String toString() {
        String pattern = this.NCTxEWno.toString();
        pattern.getClass();
        return pattern;
    }

    public o20(String str) {
        str.getClass();
        Pattern compile = Pattern.compile(str);
        compile.getClass();
        this.NCTxEWno = compile;
    }
}
