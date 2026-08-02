package defpackage;

import java.util.List;

/* loaded from: classes3.dex */
public final class v9d extends oyc {
    public static final v9d a = new v9d();
    public static final List b;
    public static final mhb c;

    static {
        azc azcVar = new azc(mhb.STRING);
        mhb mhbVar = mhb.NUMBER;
        b = u75.h(azcVar, new azc(mhbVar));
        c = mhbVar;
    }

    @Override // defpackage.oyc
    public final Object a(g06 g06Var, jhb jhbVar, List list) {
        String str = (String) ouj.i(list, 0);
        Object obj = list.get(1);
        obj.getClass();
        Number number = (Number) obj;
        xxt xxtVar = (xxt) g06Var.a;
        Number number2 = null;
        if (!(xxtVar.get(str) instanceof Long)) {
            Object obj2 = xxtVar.get(str);
            if (obj2 instanceof Number) {
                number2 = (Number) obj2;
            }
        }
        return number2 == null ? number : number2;
    }

    @Override // defpackage.oyc
    public final List b() {
        return b;
    }

    @Override // defpackage.oyc
    public final String c() {
        return "getNumberValue";
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
