package defpackage;

import j$.util.DesugarTimeZone;
import java.util.List;
import java.util.TimeZone;

/* loaded from: classes3.dex */
public final class g7k extends oyc {
    public static final g7k a = new g7k();
    public static final List b = t75.c(new azc(mhb.INTEGER));
    public static final mhb c = mhb.DATETIME;
    public static final boolean d = true;

    @Override // defpackage.oyc
    public final Object a(g06 g06Var, jhb jhbVar, List list) {
        long longValue = ((Long) ouj.j(list, list)).longValue() * 1000;
        TimeZone timeZone = DesugarTimeZone.getTimeZone("UTC");
        timeZone.getClass();
        return new vc7(longValue, timeZone);
    }

    @Override // defpackage.oyc
    public final List b() {
        return b;
    }

    @Override // defpackage.oyc
    public final String c() {
        return "parseUnixTime";
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
