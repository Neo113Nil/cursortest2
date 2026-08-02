package defpackage;

import java.util.List;

/* loaded from: classes3.dex */
public final class ybd extends oyc {
    public static final ybd a = new ybd();
    public static final List b;
    public static final mhb c;

    static {
        mhb mhbVar = mhb.STRING;
        b = u75.h(new azc(mhbVar), new azc(mhbVar));
        c = mhbVar;
    }

    @Override // defpackage.oyc
    public final Object a(g06 g06Var, jhb jhbVar, List list) {
        String str = (String) ouj.i(list, 0);
        Object obj = list.get(1);
        obj.getClass();
        String str2 = (String) obj;
        Object obj2 = ((xxt) g06Var.a).get(str);
        String str3 = obj2 instanceof String ? (String) obj2 : null;
        return str3 == null ? str2 : str3;
    }

    @Override // defpackage.oyc
    public final List b() {
        return b;
    }

    @Override // defpackage.oyc
    public final String c() {
        return "getStringValue";
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
