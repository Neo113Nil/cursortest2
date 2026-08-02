package defpackage;

import java.util.List;
import kotlin.collections.CollectionsKt;

/* loaded from: classes3.dex */
public final class tqe extends oyc {
    public static final tqe a = new tqe();
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
        long longValue = ((Long) ouj.j(list, list)).longValue();
        Object Y = CollectionsKt.Y(list);
        Y.getClass();
        long longValue2 = ((Long) Y).longValue();
        if (longValue2 != 0) {
            return Long.valueOf(longValue % longValue2);
        }
        ghh.J("mod", list, "Division by zero is not supported.", null);
        throw null;
    }

    @Override // defpackage.oyc
    public final List b() {
        return b;
    }

    @Override // defpackage.oyc
    public final String c() {
        return "mod";
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
