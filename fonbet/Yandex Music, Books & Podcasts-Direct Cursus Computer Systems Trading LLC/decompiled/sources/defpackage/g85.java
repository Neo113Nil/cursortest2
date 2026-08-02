package defpackage;

import java.util.List;

/* loaded from: classes3.dex */
public final class g85 extends oyc {
    public static final g85 a = new g85();
    public static final List b;
    public static final mhb c;
    public static final boolean d;

    static {
        mhb mhbVar = mhb.NUMBER;
        b = u75.h(new azc(mhbVar), new azc(mhbVar), new azc(mhbVar), new azc(mhbVar));
        c = mhb.COLOR;
        d = true;
    }

    @Override // defpackage.oyc
    public final Object a(g06 g06Var, jhb jhbVar, List list) {
        list.getClass();
        try {
            Object obj = list.get(0);
            obj.getClass();
            int P = u2x.P(((Double) obj).doubleValue());
            Object obj2 = list.get(1);
            obj2.getClass();
            int P2 = u2x.P(((Double) obj2).doubleValue());
            Object obj3 = list.get(2);
            obj3.getClass();
            int P3 = u2x.P(((Double) obj3).doubleValue());
            Object obj4 = list.get(3);
            obj4.getClass();
            return new c85((P << 24) | (P2 << 16) | (P3 << 8) | u2x.P(((Double) obj4).doubleValue()));
        } catch (IllegalArgumentException unused) {
            ghh.J("argb", list, "Value out of range 0..1.", null);
            throw null;
        }
    }

    @Override // defpackage.oyc
    public final List b() {
        return b;
    }

    @Override // defpackage.oyc
    public final String c() {
        return "argb";
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
