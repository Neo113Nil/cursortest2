package defpackage;

import java.util.List;

/* loaded from: classes3.dex */
public final class rqe extends oyc {
    public static final rqe a = new rqe();
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
            ghh.J("min", list, "Function requires non empty argument list.", null);
            throw null;
        }
        Long l = Long.MAX_VALUE;
        for (Object obj : list) {
            long longValue = l.longValue();
            obj.getClass();
            l = Long.valueOf(Math.min(longValue, ((Long) obj).longValue()));
        }
        return l;
    }

    @Override // defpackage.oyc
    public final List b() {
        return b;
    }

    @Override // defpackage.oyc
    public final String c() {
        return "min";
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
