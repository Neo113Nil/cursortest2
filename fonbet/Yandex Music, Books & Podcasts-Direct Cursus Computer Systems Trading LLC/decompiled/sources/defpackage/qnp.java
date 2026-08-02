package defpackage;

import java.util.Calendar;
import java.util.List;

/* loaded from: classes3.dex */
public final class qnp extends oyc {
    public static final qnp a = new qnp();
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
        if (longValue <= 23 && longValue >= 0) {
            Calendar M = qld.M(vc7Var);
            M.setTimeInMillis(vc7Var.a);
            M.set(11, (int) longValue);
            return new vc7(M.getTimeInMillis(), vc7Var.b);
        }
        ghh.J("setHours", list, "Expecting hours in [0..23], instead got " + longValue + '.', null);
        throw null;
    }

    @Override // defpackage.oyc
    public final List b() {
        return b;
    }

    @Override // defpackage.oyc
    public final String c() {
        return "setHours";
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
