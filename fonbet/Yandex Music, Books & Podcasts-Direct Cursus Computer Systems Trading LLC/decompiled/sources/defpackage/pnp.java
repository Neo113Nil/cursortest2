package defpackage;

import java.util.Calendar;
import java.util.List;

/* loaded from: classes3.dex */
public final class pnp extends oyc {
    public static final pnp a = new pnp();
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
        Calendar M = qld.M(vc7Var);
        int actualMaximum = M.getActualMaximum(5);
        if (1 <= longValue && longValue <= actualMaximum) {
            M.set(5, (int) longValue);
        } else {
            if (longValue != -1) {
                ghh.J("setDay", list, "Unable to set day " + longValue + " for date " + vc7Var + '.', null);
                throw null;
            }
            M.set(5, 0);
        }
        return new vc7(M.getTimeInMillis(), vc7Var.b);
    }

    @Override // defpackage.oyc
    public final List b() {
        return b;
    }

    @Override // defpackage.oyc
    public final String c() {
        return "setDay";
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
