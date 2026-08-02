package defpackage;

import java.util.List;

/* loaded from: classes3.dex */
public final class yt1 extends oyc {
    public static final yt1 a = new yt1();
    public static final List b;
    public static final mhb c;
    public static final boolean d;

    static {
        mhb mhbVar = mhb.NUMBER;
        b = u75.h(new azc(mhbVar), new azc(mhbVar));
        c = mhbVar;
        d = true;
    }

    @Override // defpackage.oyc
    public final Object a(g06 g06Var, jhb jhbVar, List list) {
        double doubleValue = ((Double) ouj.i(list, 0)).doubleValue();
        Object obj = list.get(1);
        obj.getClass();
        return Double.valueOf(Math.atan2(doubleValue, ((Double) obj).doubleValue()));
    }

    @Override // defpackage.oyc
    public final List b() {
        return b;
    }

    @Override // defpackage.oyc
    public final String c() {
        return "atan2";
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
