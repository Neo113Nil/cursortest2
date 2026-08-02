package defpackage;

import java.util.List;

/* loaded from: classes3.dex */
public final class p7d extends oyc {
    public static final p7d a = new p7d();
    public static final List b = t75.c(new azc(mhb.DATETIME));
    public static final mhb c = mhb.INTEGER;
    public static final boolean d = true;

    @Override // defpackage.oyc
    public final Object a(g06 g06Var, jhb jhbVar, List list) {
        return Long.valueOf(qld.M((vc7) ouj.i(list, 0)).get(5));
    }

    @Override // defpackage.oyc
    public final List b() {
        return b;
    }

    @Override // defpackage.oyc
    public final String c() {
        return "getDay";
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
