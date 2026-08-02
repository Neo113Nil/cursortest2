package defpackage;

import java.util.List;

/* loaded from: classes3.dex */
public final class j7d extends oyc {
    public static final j7d a = new j7d();
    public static final List b;
    public static final mhb c;

    static {
        azc azcVar = new azc(mhb.STRING);
        mhb mhbVar = mhb.COLOR;
        b = u75.h(azcVar, new azc(mhbVar));
        c = mhbVar;
    }

    @Override // defpackage.oyc
    public final Object a(g06 g06Var, jhb jhbVar, List list) {
        String str = (String) ouj.i(list, 0);
        Object obj = list.get(1);
        obj.getClass();
        int i = ((c85) obj).a;
        Object obj2 = ((xxt) g06Var.a).get(str);
        c85 c85Var = obj2 instanceof c85 ? (c85) obj2 : null;
        return c85Var == null ? new c85(i) : c85Var;
    }

    @Override // defpackage.oyc
    public final List b() {
        return b;
    }

    @Override // defpackage.oyc
    public final String c() {
        return "getColorValue";
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
