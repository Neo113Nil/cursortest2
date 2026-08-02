package defpackage;

import java.util.List;

/* loaded from: classes3.dex */
public final class xkr extends oyc {
    public static final xkr a = new xkr();
    public static final List b = t75.c(new azc(mhb.STRING));
    public static final mhb c = mhb.INTEGER;
    public static final boolean d = true;

    @Override // defpackage.oyc
    public final Object a(g06 g06Var, jhb jhbVar, List list) {
        try {
            return Long.valueOf(Long.parseLong((String) ouj.j(list, list)));
        } catch (NumberFormatException e) {
            ghh.J("toInteger", list, "Unable to convert value to Integer.", e);
            throw null;
        }
    }

    @Override // defpackage.oyc
    public final List b() {
        return b;
    }

    @Override // defpackage.oyc
    public final String c() {
        return "toInteger";
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
