package defpackage;

import java.util.Iterator;
import java.util.List;

/* loaded from: classes3.dex */
public final class q9a extends oyc {
    public static final q9a a = new q9a();
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
        Double valueOf = Double.valueOf(0.0d);
        Iterator it = list.iterator();
        while (it.hasNext()) {
            valueOf = (Double) vnj.x(ums.a, Double.valueOf(valueOf.doubleValue()), it.next());
        }
        return valueOf;
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
