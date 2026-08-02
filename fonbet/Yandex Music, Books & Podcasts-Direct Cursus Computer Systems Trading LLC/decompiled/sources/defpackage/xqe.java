package defpackage;

import java.util.List;

/* loaded from: classes3.dex */
public final class xqe extends oyc {
    public static final xqe a = new xqe();
    public static final List b;
    public static final mhb c;
    public static final boolean d;

    static {
        mhb mhbVar = mhb.INTEGER;
        b = t75.c(new azc(mhbVar));
        c = mhbVar;
        d = true;
    }

    @Override // defpackage.oyc
    public final Object a(g06 g06Var, jhb jhbVar, List list) {
        return Long.valueOf(Long.signum(((Long) ouj.j(list, list)).longValue()));
    }

    @Override // defpackage.oyc
    public final List b() {
        return b;
    }

    @Override // defpackage.oyc
    public final String c() {
        return "signum";
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
