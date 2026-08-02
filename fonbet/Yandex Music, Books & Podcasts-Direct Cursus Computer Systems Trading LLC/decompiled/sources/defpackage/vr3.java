package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public abstract class vr3 {
    public static final cd5 a = new cd5(c5b.a);

    public static final fa7 a(r3q r3qVar) {
        r3qVar.getClass();
        if (r3qVar instanceof j3q) {
            j3q j3qVar = (j3q) r3qVar;
            return new fa7(j3qVar.a, j3qVar.c);
        }
        if (r3qVar instanceof l3q) {
            l3q l3qVar = (l3q) r3qVar;
            return new fa7(l3qVar.a, l3qVar.c);
        }
        if (r3qVar instanceof p3q) {
            p3q p3qVar = (p3q) r3qVar;
            return new fa7(p3qVar.a, p3qVar.b);
        }
        if (r3qVar instanceof m3q) {
            return new fa7(a, ((m3q) r3qVar).b);
        }
        b6e.s();
        return null;
    }

    public static final fa7 b(izs izsVar) {
        izsVar.getClass();
        if (!(izsVar instanceof e6v)) {
            if (Intrinsics.d(izsVar, hzs.a)) {
                return null;
            }
            b6e.s();
            return null;
        }
        e6v e6vVar = (e6v) izsVar;
        if (e6vVar instanceof b6v) {
            return a(((b6v) e6vVar).a);
        }
        if (e6vVar instanceof d6v) {
            return null;
        }
        b6e.s();
        return null;
    }
}
