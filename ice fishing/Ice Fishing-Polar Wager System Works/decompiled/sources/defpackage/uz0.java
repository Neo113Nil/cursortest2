package defpackage;

/* loaded from: classes.dex */
public final class uz0 implements java.io.Serializable {
    public final java.util.regex.Pattern adDC3e2L;

    public uz0(java.lang.String str, int i) {
        str.getClass();
        java.util.regex.Pattern compile = java.util.regex.Pattern.compile(str, 66);
        compile.getClass();
        this.adDC3e2L = compile;
    }

    public final defpackage.v5 IHQe1A4L2xu(java.lang.String str) {
        str.getClass();
        java.util.regex.Matcher matcher = this.adDC3e2L.matcher(str);
        matcher.getClass();
        if (matcher.matches()) {
            return new defpackage.v5(matcher, str);
        }
        return null;
    }

    public final java.lang.String toString() {
        java.lang.String pattern = this.adDC3e2L.toString();
        pattern.getClass();
        return pattern;
    }

    public uz0(java.lang.String str) {
        str.getClass();
        java.util.regex.Pattern compile = java.util.regex.Pattern.compile(str);
        compile.getClass();
        this.adDC3e2L = compile;
    }
}
