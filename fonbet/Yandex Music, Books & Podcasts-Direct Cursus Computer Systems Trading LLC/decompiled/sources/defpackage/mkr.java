package defpackage;

import java.util.List;

/* loaded from: classes3.dex */
public final class mkr extends oyc {
    public static final mkr a = new mkr();
    public static final List b = t75.c(new azc(mhb.STRING));
    public static final mhb c = mhb.INTEGER;
    public static final boolean d = true;

    @Override // defpackage.oyc
    public final Object a(g06 g06Var, jhb jhbVar, List list) {
        return Long.valueOf(((String) ouj.j(list, list)).length());
    }

    @Override // defpackage.oyc
    public final List b() {
        return b;
    }

    @Override // defpackage.oyc
    public final String c() {
        return "len";
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
