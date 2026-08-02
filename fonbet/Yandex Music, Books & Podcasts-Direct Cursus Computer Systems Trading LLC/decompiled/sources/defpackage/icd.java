package defpackage;

import java.util.List;

/* loaded from: classes3.dex */
public final class icd extends oyc {
    public static final icd a = new icd();
    public static final List b;
    public static final mhb c;

    static {
        mhb mhbVar = mhb.STRING;
        b = u75.h(new azc(mhbVar), new azc(mhbVar));
        c = mhb.URL;
    }

    @Override // defpackage.oyc
    public final Object a(g06 g06Var, jhb jhbVar, List list) {
        String str = (String) ouj.i(list, 0);
        Object obj = list.get(1);
        obj.getClass();
        String str2 = (String) obj;
        Object obj2 = ((xxt) g06Var.a).get(str);
        String str3 = obj2 instanceof lpt ? ((lpt) obj2).a : null;
        if (str3 != null) {
            return new lpt(str3);
        }
        String b0 = xp3.b0(str2);
        if (b0 != null) {
            return new lpt(b0);
        }
        ghh.J("getUrlValue", list, "Unable to convert value to Url.", null);
        throw null;
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
