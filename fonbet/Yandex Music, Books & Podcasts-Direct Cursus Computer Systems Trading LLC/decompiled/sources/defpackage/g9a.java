package defpackage;

import java.util.List;
import kotlin.collections.CollectionsKt;

/* loaded from: classes3.dex */
public final class g9a extends oyc {
    public static final g9a a = new g9a();
    public static final List b;
    public static final mhb c;
    public static final boolean d;

    static {
        mhb mhbVar = mhb.NUMBER;
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
        Object Q = CollectionsKt.Q(list);
        for (Object obj : list) {
            Q.getClass();
            double doubleValue = ((Double) Q).doubleValue();
            obj.getClass();
            Q = Double.valueOf(Math.max(doubleValue, ((Double) obj).doubleValue()));
        }
        return Q;
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
