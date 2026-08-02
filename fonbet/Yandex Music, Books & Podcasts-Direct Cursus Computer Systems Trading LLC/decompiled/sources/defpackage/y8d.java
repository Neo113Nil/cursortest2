package defpackage;

import java.util.List;

/* loaded from: classes3.dex */
public final class y8d extends oyc {
    public static final y8d a = new y8d();
    public static final List b;
    public static final mhb c;

    static {
        azc azcVar = new azc(mhb.STRING);
        mhb mhbVar = mhb.INTEGER;
        b = u75.h(azcVar, new azc(mhbVar));
        c = mhbVar;
    }

    @Override // defpackage.oyc
    public final Object a(g06 g06Var, jhb jhbVar, List list) {
        String str = (String) ouj.i(list, 0);
        Object obj = list.get(1);
        obj.getClass();
        Long l = (Long) obj;
        Object obj2 = ((xxt) g06Var.a).get(str);
        Long l2 = obj2 instanceof Long ? (Long) obj2 : null;
        return l2 == null ? l : l2;
    }

    @Override // defpackage.oyc
    public final List b() {
        return b;
    }

    @Override // defpackage.oyc
    public final String c() {
        return "getIntegerValue";
    }

    @Override // defpackage.oyc
    public final mhb d() {
        return c;
    }

    @Override // defpackage.oyc
    public final boolean f() {
        return false;
    }
}
