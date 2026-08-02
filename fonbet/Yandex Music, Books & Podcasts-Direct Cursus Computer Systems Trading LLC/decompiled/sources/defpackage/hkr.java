package defpackage;

import java.net.URLEncoder;
import java.util.List;
import kotlin.text.Charsets;
import kotlin.text.c;

/* loaded from: classes3.dex */
public final class hkr extends oyc {
    public static final hkr a = new hkr();
    public static final List b;
    public static final mhb c;
    public static final boolean d;

    static {
        mhb mhbVar = mhb.STRING;
        b = t75.c(new azc(mhbVar));
        c = mhbVar;
        d = true;
    }

    @Override // defpackage.oyc
    public final Object a(g06 g06Var, jhb jhbVar, List list) {
        String encode = URLEncoder.encode((String) ouj.i(list, 0), Charsets.UTF_8.name());
        encode.getClass();
        return c.r(c.r(c.r(c.r(c.r(c.r(encode, "+", "%20", false), "%21", "!", false), "%7E", "~", false), "%27", "'", false), "%28", "(", false), "%29", ")", false);
    }

    @Override // defpackage.oyc
    public final List b() {
        return b;
    }

    @Override // defpackage.oyc
    public final String c() {
        return "encodeUri";
    }

    @Override // defpackage.oyc
    public final mhb d() {
        return c;
    }

    @Override // defpackage.oyc
    public final boolean f() {
        return d;
    }
}
