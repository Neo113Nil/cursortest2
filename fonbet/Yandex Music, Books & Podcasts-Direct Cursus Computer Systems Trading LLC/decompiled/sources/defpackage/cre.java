package defpackage;

import java.util.List;

/* loaded from: classes3.dex */
public final class cre extends oyc {
    public static final cre a = new cre();
    public static final List b = t75.c(new azc(mhb.INTEGER));
    public static final mhb c = mhb.STRING;
    public static final boolean d = true;

    @Override // defpackage.oyc
    public final Object a(g06 g06Var, jhb jhbVar, List list) {
        return String.valueOf(((Long) ouj.j(list, list)).longValue());
    }

    @Override // defpackage.oyc
    public final List b() {
        return b;
    }

    @Override // defpackage.oyc
    public final String c() {
        return "toString";
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
