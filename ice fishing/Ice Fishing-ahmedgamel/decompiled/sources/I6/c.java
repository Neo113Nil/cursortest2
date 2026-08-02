package I6;

import c6.C0555a;
import c6.i;
import i1.C4586c;
import java.util.Objects;

/* loaded from: classes2.dex */
public final class c extends i {
    @Override // c6.i
    public final Object c(C4586c c4586c) {
        y8.h value = y8.h.f41925w;
        d6.d dVar = new d6.d();
        long n9 = c4586c.n();
        y8.e eVar = null;
        String str = "";
        J6.b bVar = null;
        while (true) {
            int f2 = ((C0555a) c4586c.f38154u).f();
            if (f2 == -1) {
                break;
            }
            if (f2 == 1) {
                bVar = (J6.b) J6.b.f1580y.c(c4586c);
            } else if (f2 == 2) {
                dVar.add((f) f.f1360y.c(c4586c));
            } else if (f2 != 3) {
                c4586c.t(f2);
            } else {
                str = (String) i.f5774o.c(c4586c);
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
        return new d(bVar, dVar, str, value);
    }

    @Override // c6.i
    public final void d(n4.c cVar, Object obj) {
        d dVar = (d) obj;
        if (!Objects.equals(dVar.f1357v, null)) {
            J6.b.f1580y.e(cVar, 1, dVar.f1357v);
        }
        f.f1360y.a().e(cVar, 2, dVar.f1358w);
        String str = dVar.f1359x;
        if (!Objects.equals(str, "")) {
            i.f5774o.e(cVar, 3, str);
        }
        cVar.C(dVar.a());
    }

    @Override // c6.i
    public final int f(Object obj) {
        d dVar = (d) obj;
        int g9 = f.f1360y.a().g(2, dVar.f1358w) + (!Objects.equals(dVar.f1357v, null) ? J6.b.f1580y.g(1, dVar.f1357v) : 0);
        String str = dVar.f1359x;
        if (!Objects.equals(str, "")) {
            g9 += i.f5774o.g(3, str);
        }
        return dVar.a().a() + g9;
    }
}
