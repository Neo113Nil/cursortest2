package defpackage;

import java.util.List;

/* loaded from: classes3.dex */
public final class i0k extends oyc {
    public static final i0k a = new i0k();
    public static final List b;
    public static final mhb c;
    public static final boolean d;

    static {
        mhb mhbVar = mhb.STRING;
        b = u75.h(new azc(mhbVar), new azc(mhb.INTEGER), new azc(mhbVar));
        c = mhbVar;
        d = true;
    }

    @Override // defpackage.oyc
    public final Object a(g06 g06Var, jhb jhbVar, List list) {
        String str = (String) ouj.i(list, 0);
        Object obj = list.get(1);
        obj.getClass();
        long longValue = ((Long) obj).longValue();
        Object obj2 = list.get(2);
        obj2.getClass();
        return bfg.l(g06Var, jhbVar, (int) (longValue - str.length()), (String) obj2).concat(str);
    }

    @Override // defpackage.oyc
    public final List b() {
        return b;
    }

    @Override // defpackage.oyc
    public final String c() {
        return "padStart";
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
