package defpackage;

import java.util.List;

/* loaded from: classes3.dex */
public final class lk extends oyc {
    public static final lk a = new lk();
    public static final List b;
    public static final mhb c;
    public static final boolean d;

    static {
        mhb mhbVar = mhb.DATETIME;
        b = u75.h(new azc(mhbVar), new azc(mhb.INTEGER));
        c = mhbVar;
        d = true;
    }

    @Override // defpackage.oyc
    public final Object a(g06 g06Var, jhb jhbVar, List list) {
        vc7 vc7Var = (vc7) ouj.i(list, 0);
        Object obj = list.get(1);
        obj.getClass();
        return new vc7(vc7Var.a + ((Long) obj).longValue(), vc7Var.b);
    }

    @Override // defpackage.oyc
    public final List b() {
        return b;
    }

    @Override // defpackage.oyc
    public final String c() {
        return "addMillis";
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
