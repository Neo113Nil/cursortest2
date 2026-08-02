package defpackage;

import java.net.URLDecoder;
import java.util.List;
import kotlin.text.Charsets;

/* loaded from: classes3.dex */
public final class gkr extends oyc {
    public static final gkr a = new gkr();
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
        String decode = URLDecoder.decode((String) ouj.i(list, 0), Charsets.UTF_8.name());
        decode.getClass();
        return decode;
    }

    @Override // defpackage.oyc
    public final List b() {
        return b;
    }

    @Override // defpackage.oyc
    public final String c() {
        return "decodeUri";
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
