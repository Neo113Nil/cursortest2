package defpackage;

import java.util.List;

/* loaded from: classes3.dex */
public final class jcd extends oyc {
    public static final jcd a = new jcd();
    public static final List b;
    public static final mhb c;

    static {
        azc azcVar = new azc(mhb.STRING);
        mhb mhbVar = mhb.URL;
        b = u75.h(azcVar, new azc(mhbVar));
        c = mhbVar;
    }

    @Override // defpackage.oyc
    public final Object a(g06 g06Var, jhb jhbVar, List list) {
        Object obj = ((xxt) g06Var.a).get((String) ouj.i(list, 0));
        String str = obj instanceof lpt ? ((lpt) obj).a : null;
        if (str != null) {
            return new lpt(str);
        }
        Object obj2 = list.get(1);
        obj2.getClass();
        return (lpt) obj2;
    }

    @Override // defpackage.oyc
    public final List b() {
        return b;
    }

    @Override // defpackage.oyc
    public final String c() {
        return "getUrlValue";
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
