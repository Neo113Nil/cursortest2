package defpackage;

import java.util.List;

/* loaded from: classes3.dex */
public final class yqe extends oyc {
    public static final yqe a = new yqe();
    public static final List b;
    public static final mhb c;
    public static final boolean d;

    static {
        mhb mhbVar = mhb.INTEGER;
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
        Long l = 0L;
        int i = 0;
        for (Long l2 : list) {
            int i2 = i + 1;
            if (i < 0) {
                u75.n();
                throw null;
            }
            long longValue = l.longValue();
            if (i != 0) {
                l2 = vnj.x(tms.a, Long.valueOf(longValue), l2);
            }
            l2.getClass();
            l = l2;
            i = i2;
        }
        return l;
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
