package H6;

import c6.C0555a;
import i1.C4586c;
import java.util.Objects;

/* loaded from: classes2.dex */
public final class i extends c6.i {
    @Override // c6.i
    public final Object c(C4586c c4586c) {
        y8.h value = y8.h.f41925w;
        long n9 = c4586c.n();
        y8.e eVar = null;
        String str = "";
        b bVar = null;
        while (true) {
            int f2 = ((C0555a) c4586c.f38154u).f();
            if (f2 == -1) {
                break;
            }
            if (f2 == 1) {
                str = (String) c6.i.f5774o.c(c4586c);
            } else if (f2 != 2) {
                c4586c.t(f2);
            } else {
                bVar = (b) b.f1251C.c(c4586c);
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
        }
        if (eVar != null) {
            value = eVar.B(eVar.f41924u);
        }
        return new j(str, bVar, value);
    }

    @Override // c6.i
    public final void d(n4.c cVar, Object obj) {
        j jVar = (j) obj;
        if (!Objects.equals(jVar.f1272v, "")) {
            c6.i.f5774o.e(cVar, 1, jVar.f1272v);
        }
        b bVar = jVar.f1273w;
        if (!Objects.equals(bVar, null)) {
            b.f1251C.e(cVar, 2, bVar);
        }
        cVar.C(jVar.a());
    }

    @Override // c6.i
    public final int f(Object obj) {
        int i;
        j jVar = (j) obj;
        if (Objects.equals(jVar.f1272v, "")) {
            i = 0;
        } else {
            i = c6.i.f5774o.g(1, jVar.f1272v);
        }
        b bVar = jVar.f1273w;
        if (!Objects.equals(bVar, null)) {
            i += b.f1251C.g(2, bVar);
        }
        return jVar.a().a() + i;
    }
}
