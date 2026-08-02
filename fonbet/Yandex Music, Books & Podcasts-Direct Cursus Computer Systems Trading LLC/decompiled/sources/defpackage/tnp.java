package defpackage;

import java.util.Calendar;
import java.util.List;

/* loaded from: classes3.dex */
public final class tnp extends oyc {
    public static final tnp a = new tnp();
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
        long longValue = ((Long) obj).longValue();
        if (longValue <= 12 && longValue >= 1) {
            Calendar M = qld.M(vc7Var);
            M.set(2, (int) (longValue - 1));
            return new vc7(M.getTimeInMillis(), vc7Var.b);
        }
        ghh.J("setMonth", list, "Expecting month in [1..12], instead got " + longValue + '.', null);
        throw null;
    }

    @Override // defpackage.oyc
    public final List b() {
        return b;
    }

    @Override // defpackage.oyc
    public final String c() {
        return "setMonth";
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
