package defpackage;

import java.util.List;

/* loaded from: classes3.dex */
public final class pqe extends oyc {
    public static final pqe a = new pqe();
    public static final List b;
    public static final mhb c;
    public static final boolean d;

    static {
        mhb mhbVar = mhb.INTEGER;
        b = t75.c(new azc(mhbVar, true));
        c = mhbVar;
        d = true;
    }

    @Override // defpackage.oyc
    public final Object a(g06 g06Var, jhb jhbVar, List list) {
        list.getClass();
        if (list.isEmpty()) {
            ghh.J("max", list, "Function requires non empty argument list.", null);
            throw null;
        }
        Long l = Long.MIN_VALUE;
        for (Object obj : list) {
            long longValue = l.longValue();
            obj.getClass();
            l = Long.valueOf(Math.max(longValue, ((Long) obj).longValue()));
        }
        return l;
    }

    @Override // defpackage.oyc
    public final List b() {
        return b;
    }

    @Override // defpackage.oyc
    public final String c() {
        return "max";
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
