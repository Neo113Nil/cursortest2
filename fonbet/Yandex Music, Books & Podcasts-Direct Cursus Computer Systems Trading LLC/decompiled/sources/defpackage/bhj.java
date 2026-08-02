package defpackage;

import java.util.List;

/* loaded from: classes3.dex */
public final class bhj extends oyc {
    public static final bhj a = new bhj();
    public static final List b = t75.c(new azc(mhb.NUMBER));
    public static final mhb c = mhb.INTEGER;
    public static final boolean d = true;

    @Override // defpackage.oyc
    public final Object a(g06 g06Var, jhb jhbVar, List list) {
        double doubleValue = ((Double) ouj.j(list, list)).doubleValue();
        if (doubleValue >= -9.223372036854776E18d && doubleValue <= 9.223372036854776E18d) {
            return Long.valueOf((long) doubleValue);
        }
        ghh.J("toInteger", list, "Unable to convert value to Integer.", null);
        throw null;
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
