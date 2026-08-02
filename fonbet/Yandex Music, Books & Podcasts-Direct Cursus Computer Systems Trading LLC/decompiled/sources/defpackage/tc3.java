package defpackage;

import java.util.List;

/* loaded from: classes3.dex */
public final class tc3 extends oyc {
    public static final tc3 a = new tc3();
    public static final List b = t75.c(new azc(mhb.BOOLEAN));
    public static final mhb c = mhb.INTEGER;
    public static final boolean d = true;

    @Override // defpackage.oyc
    public final Object a(g06 g06Var, jhb jhbVar, List list) {
        return Long.valueOf(((Boolean) ouj.j(list, list)).booleanValue() ? 1L : 0L);
    }

    @Override // defpackage.oyc
    public final List b() {
        return b;
    }

    @Override // defpackage.oyc
    public final String c() {
        return "toInteger";
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
