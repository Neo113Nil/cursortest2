package defpackage;

import java.util.List;

/* loaded from: classes3.dex */
public final class ykr extends oyc {
    public static final ykr a = new ykr();
    public static final List b = t75.c(new azc(mhb.STRING));
    public static final mhb c = mhb.NUMBER;
    public static final boolean d = true;

    @Override // defpackage.oyc
    public final Object a(g06 g06Var, jhb jhbVar, List list) {
        try {
            double parseDouble = Double.parseDouble((String) ouj.j(list, list));
            if (parseDouble != Double.POSITIVE_INFINITY && parseDouble != Double.NEGATIVE_INFINITY) {
                return Double.valueOf(parseDouble);
            }
            ghh.J("toNumber", list, "Unable to convert value to Number.", null);
            throw null;
        } catch (NumberFormatException e) {
            ghh.J("toNumber", list, "Unable to convert value to Number.", e);
            throw null;
        }
    }

    @Override // defpackage.oyc
    public final List b() {
        return b;
    }

    @Override // defpackage.oyc
    public final String c() {
        return "toNumber";
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
