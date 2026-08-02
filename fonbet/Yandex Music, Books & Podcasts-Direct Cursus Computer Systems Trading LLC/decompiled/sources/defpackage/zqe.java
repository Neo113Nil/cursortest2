package defpackage;

import java.util.Iterator;
import java.util.List;

/* loaded from: classes3.dex */
public final class zqe extends oyc {
    public static final zqe a = new zqe();
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
        Long l = 0L;
        Iterator it = list.iterator();
        while (it.hasNext()) {
            l = (Long) vnj.x(ums.a, Long.valueOf(l.longValue()), it.next());
        }
        return l;
    }

    @Override // defpackage.oyc
    public final List b() {
        return b;
    }

    @Override // defpackage.oyc
    public final String c() {
        return "sum";
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
