package defpackage;

import java.util.List;

/* loaded from: classes3.dex */
public final class f0k extends oyc {
    public static final f0k a = new f0k();
    public static final List b;
    public static final mhb c;
    public static final boolean d;

    static {
        mhb mhbVar = mhb.INTEGER;
        azc azcVar = new azc(mhbVar);
        azc azcVar2 = new azc(mhbVar);
        mhb mhbVar2 = mhb.STRING;
        b = u75.h(azcVar, azcVar2, new azc(mhbVar2));
        c = mhbVar2;
        d = true;
    }

    @Override // defpackage.oyc
    public final Object a(g06 g06Var, jhb jhbVar, List list) {
        String valueOf = String.valueOf(((Long) ouj.i(list, 0)).longValue());
        Object obj = list.get(1);
        obj.getClass();
        long longValue = ((Long) obj).longValue();
        Object obj2 = list.get(2);
        obj2.getClass();
        return valueOf.concat(bfg.l(g06Var, jhbVar, (int) (longValue - valueOf.length()), (String) obj2));
    }

    @Override // defpackage.oyc
    public final List b() {
        return b;
    }

    @Override // defpackage.oyc
    public final String c() {
        return "padEnd";
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
