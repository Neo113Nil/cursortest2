package defpackage;

import java.util.List;
import java.util.TimeZone;

/* loaded from: classes3.dex */
public final class fgj extends oyc {
    public static final fgj a = new fgj();
    public static final c5b b = c5b.a;

    @Override // defpackage.oyc
    public final Object a(g06 g06Var, jhb jhbVar, List list) {
        list.getClass();
        long currentTimeMillis = System.currentTimeMillis();
        TimeZone timeZone = TimeZone.getDefault();
        timeZone.getClass();
        return new vc7(currentTimeMillis, timeZone);
    }

    @Override // defpackage.oyc
    public final List b() {
        return b;
    }

    @Override // defpackage.oyc
    public final String c() {
        return "nowLocal";
    }

    @Override // defpackage.oyc
    public final mhb d() {
        return mhb.DATETIME;
    }

    @Override // defpackage.oyc
    public final boolean f() {
        return false;
    }
}
