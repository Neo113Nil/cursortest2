package G6;

import c6.C0544a;
import c6.i;
import d6.d;
import g1.C4523c;
import y8.e;
import y8.h;

/* loaded from: classes2.dex */
public final class a extends i {
    @Override // c6.i
    public final Object c(C4523c c4523c) {
        e eVar;
        h value = h.f41954w;
        d dVar = new d();
        long A9 = c4523c.A();
        while (true) {
            int f3 = ((C0544a) c4523c.f37627u).f();
            if (f3 == -1) {
                break;
            }
            if (f3 != 1) {
                c4523c.F(f3);
            } else {
                dVar.add((I6.d) I6.d.f1326y.c(c4523c));
            }
        }
        h unknownFields = c4523c.C(A9);
        kotlin.jvm.internal.h.e(unknownFields, "unknownFields");
        if (unknownFields.a() > 0) {
            eVar = new e();
            kotlin.jvm.internal.h.e(value, "value");
            eVar.K(value);
            value = h.f41954w;
            eVar.K(unknownFields);
        } else {
            eVar = null;
        }
        if (eVar != null) {
            value = eVar.B(eVar.f41953u);
        }
        return new b(dVar, value);
    }

    @Override // c6.i
    public final void d(F1.a aVar, Object obj) {
        b bVar = (b) obj;
        I6.d.f1326y.a().e(aVar, 1, bVar.f1081v);
        aVar.v(bVar.a());
    }

    @Override // c6.i
    public final int f(Object obj) {
        b bVar = (b) obj;
        return bVar.a().a() + I6.d.f1326y.a().g(1, bVar.f1081v);
    }
}
