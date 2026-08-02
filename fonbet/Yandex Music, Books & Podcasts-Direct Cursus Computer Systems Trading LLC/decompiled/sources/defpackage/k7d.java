package defpackage;

import java.util.List;

/* loaded from: classes3.dex */
public final class k7d extends oyc {
    public static final k7d a = new k7d();
    public static final List b;
    public static final mhb c;

    static {
        mhb mhbVar = mhb.STRING;
        b = u75.h(new azc(mhbVar), new azc(mhbVar));
        c = mhb.COLOR;
    }

    @Override // defpackage.oyc
    public final Object a(g06 g06Var, jhb jhbVar, List list) {
        String str = (String) ouj.i(list, 0);
        Object obj = list.get(1);
        obj.getClass();
        int v = bow.v((String) obj);
        Object obj2 = ((xxt) g06Var.a).get(str);
        c85 c85Var = obj2 instanceof c85 ? (c85) obj2 : null;
        return c85Var == null ? new c85(v) : c85Var;
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
