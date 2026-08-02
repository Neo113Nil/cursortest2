package defpackage;

import java.util.List;

/* loaded from: classes3.dex */
public final class d9d extends oyc {
    public static final d9d a = new d9d();
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
        long longValue = ((Long) ouj.i(list, 0)).longValue();
        if (longValue < 0) {
            kac.h("Failed to evaluate [getIntervalTotalHours(-1)]. Expecting non-negative number of milliseconds.", null);
            return null;
        }
        long j = 60;
        return Long.valueOf(((longValue / 1000) / j) / j);
    }

    @Override // defpackage.oyc
    public final List b() {
        return b;
    }

    @Override // defpackage.oyc
    public final String c() {
        return "getIntervalTotalHours";
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
