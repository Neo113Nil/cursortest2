package G6;

import c6.C0555a;
import c6.i;
import d6.d;
import i1.C4586c;
import n4.c;
import y8.e;
import y8.h;

/* loaded from: classes2.dex */
public final class a extends i {
    @Override // c6.i
    public final Object c(C4586c c4586c) {
        e eVar;
        h value = h.f41925w;
        d dVar = new d();
        long n9 = c4586c.n();
        while (true) {
            int f2 = ((C0555a) c4586c.f38154u).f();
            if (f2 == -1) {
                break;
            }
            if (f2 != 1) {
                c4586c.t(f2);
            } else {
                dVar.add((I6.d) I6.d.f1356y.c(c4586c));
            }
        }
        h unknownFields = c4586c.p(n9);
        kotlin.jvm.internal.h.e(unknownFields, "unknownFields");
        if (unknownFields.a() > 0) {
            eVar = new e();
            kotlin.jvm.internal.h.e(value, "value");
            eVar.K(value);
            value = h.f41925w;
            eVar.K(unknownFields);
        } else {
            eVar = null;
        }
        if (eVar != null) {
            value = eVar.B(eVar.f41924u);
        }
        return new b(dVar, value);
    }

    @Override // c6.i
    public final void d(c cVar, Object obj) {
        b bVar = (b) obj;
        I6.d.f1356y.a().e(cVar, 1, bVar.f1184v);
        cVar.C(bVar.a());
    }

    @Override // c6.i
    public final int f(Object obj) {
        b bVar = (b) obj;
        return bVar.a().a() + I6.d.f1356y.a().g(1, bVar.f1184v);
    }
}
