package defpackage;

import java.util.List;

/* loaded from: classes3.dex */
public final class chj extends oyc {
    public static final chj a = new chj();
    public static final List b = t75.c(new azc(mhb.NUMBER));
    public static final mhb c = mhb.STRING;
    public static final boolean d = true;

    @Override // defpackage.oyc
    public final Object a(g06 g06Var, jhb jhbVar, List list) {
        return String.valueOf(((Double) ouj.j(list, list)).doubleValue());
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
