package defpackage;

import java.util.List;
import java.util.Locale;

/* loaded from: classes3.dex */
public final class xks extends oyc {
    public static final xks a = new xks();
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
        String lowerCase = ((String) ouj.i(list, 0)).toLowerCase(Locale.ROOT);
        lowerCase.getClass();
        return lowerCase;
    }

    @Override // defpackage.oyc
    public final List b() {
        return b;
    }

    @Override // defpackage.oyc
    public final String c() {
        return "toLowerCase";
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
