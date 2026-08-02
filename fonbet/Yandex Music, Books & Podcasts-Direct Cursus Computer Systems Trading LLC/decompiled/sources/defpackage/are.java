package defpackage;

import java.util.List;

/* loaded from: classes3.dex */
public final class are extends oyc {
    public static final are a = new are();
    public static final List b = t75.c(new azc(mhb.INTEGER));
    public static final mhb c = mhb.BOOLEAN;
    public static final boolean d = true;

    @Override // defpackage.oyc
    public final Object a(g06 g06Var, jhb jhbVar, List list) {
        boolean z;
        long longValue = ((Long) ouj.j(list, list)).longValue();
        if (longValue == 0) {
            z = false;
        } else {
            if (longValue != 1) {
                ghh.J("toBoolean", list, "Unable to convert value to Boolean.", null);
                throw null;
            }
            z = true;
        }
        return Boolean.valueOf(z);
    }

    @Override // defpackage.oyc
    public final List b() {
        return b;
    }

    @Override // defpackage.oyc
    public final String c() {
        return "toBoolean";
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
