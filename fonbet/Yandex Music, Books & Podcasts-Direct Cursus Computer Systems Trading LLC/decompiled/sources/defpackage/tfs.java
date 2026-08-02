package defpackage;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.TimeZone;

/* loaded from: classes4.dex */
public final class tfs {
    public static final tfs d;
    public static final tfs e;
    public static final tfs f;
    public static final tfs g;
    public static final tfs h;
    public final String a;
    public final TimeZone b;
    public final urm c;

    static {
        jyr b = btf.b(new x6s(5));
        gbk[] gbkVarArr = gbk.a;
        Locale.US.getClass();
        d = new tfs("yyyy-MM-dd'T'HH:mm:ss.SSSZZZZZ");
        e = new tfs("yyyy-MM-dd'T'HH:mm:ss.SSS'Z'", (TimeZone) b.getValue());
        f = new tfs("yyyy-MM-dd'T'HH:mm:ssZZZZZ");
        g = new tfs("yyyy-MM-dd'T'HH:mm:ss'Z'", (TimeZone) b.getValue());
        h = new tfs("yyyy-MM-dd", (TimeZone) b.getValue());
        new tfs("yyyy-MM-dd'T'HH:mm:ss", (TimeZone) b.getValue());
    }

    public tfs(String str, TimeZone timeZone) {
        Locale locale = Locale.US;
        this.a = str;
        this.b = timeZone;
        this.c = new urm(2, this);
    }

    public final SimpleDateFormat a() {
        Object obj = this.c.get();
        obj.getClass();
        return (SimpleDateFormat) obj;
    }

    public final Date b(String str) {
        if (str == null) {
            return null;
        }
        try {
            return a().parse(str);
        } catch (ParseException unused) {
            return null;
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ tfs(String str) {
        this(str, null);
        Locale locale = Locale.US;
    }
}
