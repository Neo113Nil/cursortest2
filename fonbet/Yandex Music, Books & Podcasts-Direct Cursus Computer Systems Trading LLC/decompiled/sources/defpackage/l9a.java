package defpackage;

import java.util.List;

/* loaded from: classes3.dex */
public final class l9a extends oyc {
    public static final l9a a = new l9a();
    public static final List b;
    public static final mhb c;
    public static final boolean d;

    static {
        mhb mhbVar = mhb.NUMBER;
        b = t75.c(new azc(mhbVar, true));
        c = mhbVar;
        d = true;
    }

    @Override // defpackage.oyc
    public final Object a(g06 g06Var, jhb jhbVar, List list) {
        list.getClass();
        Double valueOf = Double.valueOf(0.0d);
        int i = 0;
        for (Object obj : list) {
            int i2 = i + 1;
            if (i < 0) {
                u75.n();
                throw null;
            }
            double doubleValue = valueOf.doubleValue();
            if (i != 0) {
                obj = vnj.w(nms.a, Double.valueOf(doubleValue), obj);
            }
            obj.getClass();
            valueOf = (Double) obj;
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
        return "mul";
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
