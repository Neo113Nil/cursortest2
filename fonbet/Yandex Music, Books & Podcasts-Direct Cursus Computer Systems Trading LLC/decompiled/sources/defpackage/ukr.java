package defpackage;

import java.util.List;

/* loaded from: classes3.dex */
public final class ukr extends oyc {
    public static final ukr a = new ukr();
    public static final List b;
    public static final mhb c;
    public static final boolean d;

    static {
        mhb mhbVar = mhb.STRING;
        azc azcVar = new azc(mhbVar);
        mhb mhbVar2 = mhb.INTEGER;
        b = u75.h(azcVar, new azc(mhbVar2), new azc(mhbVar2));
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
        long longValue2 = ((Long) obj2).longValue();
        if (longValue < 0 || longValue2 > str.length()) {
            ghh.J("substring", list, "Indexes are out of bounds.", null);
            throw null;
        }
        if (longValue <= longValue2) {
            return str.substring((int) longValue, (int) longValue2);
        }
        ghh.J("substring", list, "Indexes should be in ascending order.", null);
        throw null;
    }

    @Override // defpackage.oyc
    public final List b() {
        return b;
    }

    @Override // defpackage.oyc
    public final String c() {
        return "substring";
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
