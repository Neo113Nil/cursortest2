package defpackage;

import java.util.List;

/* loaded from: classes3.dex */
public final class f7d extends oyc {
    public static final f7d a = new f7d();
    public static final List b;
    public static final mhb c;

    static {
        azc azcVar = new azc(mhb.STRING);
        mhb mhbVar = mhb.BOOLEAN;
        b = u75.h(azcVar, new azc(mhbVar));
        c = mhbVar;
    }

    @Override // defpackage.oyc
    public final Object a(g06 g06Var, jhb jhbVar, List list) {
        String str = (String) ouj.i(list, 0);
        Object obj = list.get(1);
        obj.getClass();
        Boolean bool = (Boolean) obj;
        Object obj2 = ((xxt) g06Var.a).get(str);
        Boolean bool2 = obj2 instanceof Boolean ? (Boolean) obj2 : null;
        return bool2 == null ? bool : bool2;
    }

    @Override // defpackage.oyc
    public final List b() {
        return b;
    }

    @Override // defpackage.oyc
    public final String c() {
        return "getBooleanValue";
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
