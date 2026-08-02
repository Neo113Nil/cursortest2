package defpackage;

import java.util.List;
import kotlin.collections.CollectionsKt;

/* loaded from: classes3.dex */
public final class lqe extends oyc {
    public static final lqe a = new lqe();
    public static final List b;
    public static final mhb c;
    public static final boolean d;

    static {
        mhb mhbVar = mhb.INTEGER;
        b = u75.h(new azc(mhbVar), new azc(mhbVar));
        c = mhbVar;
        d = true;
    }

    @Override // defpackage.oyc
    public final Object a(g06 g06Var, jhb jhbVar, List list) {
        Long l = (Long) ouj.j(list, list);
        long longValue = l.longValue();
        Object Y = CollectionsKt.Y(list);
        Y.getClass();
        int signum = Long.signum(((Long) Y).longValue());
        if (signum != 0) {
            if (longValue != Long.MIN_VALUE) {
                return Long.valueOf(Math.abs(longValue) * signum);
            }
            if (signum != -1) {
                ghh.J("copySign", list, "Integer overflow.", null);
                throw null;
            }
        }
        return l;
    }

    @Override // defpackage.oyc
    public final List b() {
        return b;
    }

    @Override // defpackage.oyc
    public final String c() {
        return "copySign";
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
