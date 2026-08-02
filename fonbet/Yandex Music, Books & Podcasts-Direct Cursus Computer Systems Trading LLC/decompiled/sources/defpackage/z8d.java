package defpackage;

import java.util.List;

/* loaded from: classes3.dex */
public final class z8d extends oyc {
    public static final z8d a = new z8d();
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
            kac.h("Failed to evaluate [getIntervalHours(-1)]. Expecting non-negative number of milliseconds.", null);
            return null;
        }
        long j = 60;
        return Long.valueOf((((longValue / 1000) / j) / j) % 24);
    }

    @Override // defpackage.oyc
    public final List b() {
        return b;
    }

    @Override // defpackage.oyc
    public final String c() {
        return "getIntervalHours";
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
