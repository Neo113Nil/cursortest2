package defpackage;

import java.util.List;

/* loaded from: classes3.dex */
public final class uqe extends oyc {
    public static final uqe a = new uqe();
    public static final List b;
    public static final mhb c;
    public static final boolean d;

    static {
        mhb mhbVar = mhb.INTEGER;
        b = t75.c(new azc(mhbVar, true));
        c = mhbVar;
        d = true;
    }

    @Override // defpackage.oyc
    public final Object a(g06 g06Var, jhb jhbVar, List list) {
        list.getClass();
        Long l = 0L;
        int i = 0;
        for (Object obj : list) {
            int i2 = i + 1;
            if (i < 0) {
                u75.n();
                throw null;
            }
            long longValue = l.longValue();
            if (i != 0) {
                obj = vnj.w(nms.a, Long.valueOf(longValue), obj);
            }
            obj.getClass();
            l = (Long) obj;
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
