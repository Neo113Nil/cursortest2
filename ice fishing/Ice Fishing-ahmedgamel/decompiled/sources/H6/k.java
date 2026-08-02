package H6;

import c6.C0555a;
import i1.C4586c;

/* loaded from: classes2.dex */
public final class k extends c6.i {
    @Override // c6.i
    public final Object c(C4586c c4586c) {
        y8.e eVar;
        y8.h value = y8.h.f41925w;
        d6.d dVar = new d6.d();
        long n9 = c4586c.n();
        while (true) {
            int f2 = ((C0555a) c4586c.f38154u).f();
            if (f2 == -1) {
                break;
            }
            if (f2 != 1) {
                c4586c.t(f2);
            } else {
                dVar.add((j) j.f1271x.c(c4586c));
            }
        }
        y8.h unknownFields = c4586c.p(n9);
        kotlin.jvm.internal.h.e(unknownFields, "unknownFields");
        if (unknownFields.a() > 0) {
            eVar = new y8.e();
            kotlin.jvm.internal.h.e(value, "value");
            eVar.K(value);
            value = y8.h.f41925w;
            eVar.K(unknownFields);
        } else {
            eVar = null;
        }
        if (eVar != null) {
            value = eVar.B(eVar.f41924u);
        }
        return new l(dVar, value);
    }

    @Override // c6.i
    public final void d(n4.c cVar, Object obj) {
        l lVar = (l) obj;
        j.f1271x.a().e(cVar, 1, lVar.f1275v);
        cVar.C(lVar.a());
    }

    @Override // c6.i
    public final int f(Object obj) {
        l lVar = (l) obj;
        return lVar.a().a() + j.f1271x.a().g(1, lVar.f1275v);
    }
}
