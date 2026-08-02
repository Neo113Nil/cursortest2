package defpackage;

import java.util.List;
import kotlin.collections.CollectionsKt;

/* loaded from: classes3.dex */
public final class k9a extends oyc {
    public static final k9a a = new k9a();
    public static final List b;
    public static final mhb c;
    public static final boolean d;

    static {
        mhb mhbVar = mhb.NUMBER;
        b = u75.h(new azc(mhbVar), new azc(mhbVar));
        c = mhbVar;
        d = true;
    }

    @Override // defpackage.oyc
    public final Object a(g06 g06Var, jhb jhbVar, List list) {
        double doubleValue = ((Double) ouj.j(list, list)).doubleValue();
        Object Y = CollectionsKt.Y(list);
        Y.getClass();
        double doubleValue2 = ((Double) Y).doubleValue();
        if (doubleValue2 != 0.0d) {
            return Double.valueOf(doubleValue % doubleValue2);
        }
        ghh.J("mod", list, "Division by zero is not supported.", null);
        throw null;
    }

    @Override // defpackage.oyc
    public final List b() {
        return b;
    }

    @Override // defpackage.oyc
    public final String c() {
        return "mod";
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
