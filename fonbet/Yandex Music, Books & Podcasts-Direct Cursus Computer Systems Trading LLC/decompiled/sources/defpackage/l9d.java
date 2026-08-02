package defpackage;

import java.util.List;

/* loaded from: classes3.dex */
public final class l9d extends oyc {
    public static final l9d a = new l9d();
    public static final List b = t75.c(new azc(mhb.DATETIME));
    public static final mhb c = mhb.INTEGER;
    public static final boolean d = true;

    @Override // defpackage.oyc
    public final Object a(g06 g06Var, jhb jhbVar, List list) {
        return Long.valueOf(qld.M((vc7) ouj.i(list, 0)).get(2) + 1);
    }

    @Override // defpackage.oyc
    public final List b() {
        return b;
    }

    @Override // defpackage.oyc
    public final String c() {
        return "getMonth";
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
