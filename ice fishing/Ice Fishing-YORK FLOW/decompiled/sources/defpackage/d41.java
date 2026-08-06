package defpackage;

/* compiled from: r8-map-id-5e15bf382d9e1cc682b2b5d208f848646545054061ee84effb1e415a0540fc32 */
/* loaded from: classes.dex */
public final class d41 implements java.io.Serializable {
    public final java.util.regex.Pattern WDYagTQQm9ns;

    public d41(java.lang.String str, int i) {
        str.getClass();
        java.util.regex.Pattern compile = java.util.regex.Pattern.compile(str, 66);
        compile.getClass();
        this.WDYagTQQm9ns = compile;
    }

    public final defpackage.a7 ZpBGe2uQfcn8(java.lang.String str) {
        str.getClass();
        java.util.regex.Matcher matcher = this.WDYagTQQm9ns.matcher(str);
        matcher.getClass();
        if (matcher.matches()) {
            return new defpackage.a7(matcher, str);
        }
        return null;
    }

    public final java.lang.String toString() {
        java.lang.String pattern = this.WDYagTQQm9ns.toString();
        pattern.getClass();
        return pattern;
    }

    public d41(java.lang.String str) {
        str.getClass();
        java.util.regex.Pattern compile = java.util.regex.Pattern.compile(str);
        compile.getClass();
        this.WDYagTQQm9ns = compile;
    }
}
