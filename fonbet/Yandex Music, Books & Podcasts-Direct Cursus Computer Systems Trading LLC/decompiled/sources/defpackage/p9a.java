package defpackage;

import java.util.List;

/* loaded from: classes3.dex */
public final class p9a extends oyc {
    public static final p9a a = new p9a();
    public static final List b;
    public static final mhb c;
    public static final boolean d;

    static {
        mhb mhbVar = mhb.NUMBER;
        b = t75.c(new azc(mhbVar, true));
        c = mhbVar;
        d = true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v3, types: [java.lang.Object] */
    @Override // defpackage.oyc
    public final Object a(g06 g06Var, jhb jhbVar, List list) {
        list.getClass();
        Double valueOf = Double.valueOf(0.0d);
        int i = 0;
        for (Double d2 : list) {
            int i2 = i + 1;
            if (i < 0) {
                u75.n();
                throw null;
            }
            double doubleValue = valueOf.doubleValue();
            if (i != 0) {
                d2 = vnj.x(tms.a, Double.valueOf(doubleValue), d2);
            }
            d2.getClass();
            valueOf = d2;
            i = i2;
        }
        return valueOf;
    }

    @Override // defpackage.oyc
    public final List b() {
        return b;
    }

    @Override // defpackage.oyc
    public final String c() {
        return "sub";
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
