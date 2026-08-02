package defpackage;

import java.util.List;

/* loaded from: classes3.dex */
public final class zm6 extends oyc {
    public static final zm6 a = new zm6();
    public static final List b;
    public static final mhb c;
    public static final boolean d;

    static {
        mhb mhbVar = mhb.NUMBER;
        b = t75.c(new azc(mhbVar));
        c = mhbVar;
        d = true;
    }

    @Override // defpackage.oyc
    public final Object a(g06 g06Var, jhb jhbVar, List list) {
        double doubleValue = ((Double) ouj.j(list, list)).doubleValue();
        return v7g.m(Math.cos(doubleValue) / Math.sin(doubleValue), "cot", doubleValue);
    }

    @Override // defpackage.oyc
    public final List b() {
        return b;
    }

    @Override // defpackage.oyc
    public final String c() {
        return "cot";
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
