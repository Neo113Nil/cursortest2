package H6;

import c6.C0544a;
import g1.C4523c;

/* loaded from: classes2.dex */
public final class c extends c6.i {
    @Override // c6.i
    public final Object c(C4523c c4523c) {
        y8.e eVar;
        y8.h value = y8.h.f41954w;
        d6.d dVar = new d6.d();
        long A9 = c4523c.A();
        while (true) {
            int f3 = ((C0544a) c4523c.f37627u).f();
            if (f3 == -1) {
                break;
            }
            if (f3 != 1) {
                c4523c.F(f3);
            } else {
                dVar.add((b) b.f1226C.c(c4523c));
            }
        }
        y8.h unknownFields = c4523c.C(A9);
        kotlin.jvm.internal.h.e(unknownFields, "unknownFields");
        if (unknownFields.a() > 0) {
            eVar = new y8.e();
            kotlin.jvm.internal.h.e(value, "value");
            eVar.K(value);
            value = y8.h.f41954w;
            eVar.K(unknownFields);
        } else {
            eVar = null;
        }
        if (eVar != null) {
            value = eVar.B(eVar.f41953u);
        }
        return new d(dVar, value);
    }

    @Override // c6.i
    public final void d(F1.a aVar, Object obj) {
        d dVar = (d) obj;
        b.f1226C.a().e(aVar, 1, dVar.f1235v);
        aVar.v(dVar.a());
    }

    @Override // c6.i
    public final int f(Object obj) {
        d dVar = (d) obj;
        return dVar.a().a() + b.f1226C.a().g(1, dVar.f1235v);
    }
}
