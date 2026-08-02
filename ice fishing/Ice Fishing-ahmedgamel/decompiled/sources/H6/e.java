package H6;

import c6.C0555a;
import i1.C4586c;
import java.util.Objects;

/* loaded from: classes2.dex */
public final class e extends c6.i {
    @Override // c6.i
    public final Object c(C4586c c4586c) {
        y8.e eVar;
        y8.h value = y8.h.f41925w;
        d6.d dVar = new d6.d();
        d6.d dVar2 = new d6.d();
        long n9 = c4586c.n();
        String str = "";
        String str2 = "";
        while (true) {
            int f2 = ((C0555a) c4586c.f38154u).f();
            if (f2 == -1) {
                break;
            }
            c6.c cVar = c6.i.f5774o;
            if (f2 == 1) {
                str = (String) cVar.c(c4586c);
            } else if (f2 == 2) {
                str2 = (String) cVar.c(c4586c);
            } else if (f2 == 3) {
                dVar.add((String) cVar.c(c4586c));
            } else if (f2 != 4) {
                c4586c.t(f2);
            } else {
                dVar2.add((String) cVar.c(c4586c));
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
        return new f(str, str2, dVar, dVar2, value);
    }

    @Override // c6.i
    public final void d(n4.c cVar, Object obj) {
        f fVar = (f) obj;
        boolean equals = Objects.equals(fVar.f1262v, "");
        c6.c cVar2 = c6.i.f5774o;
        if (!equals) {
            cVar2.e(cVar, 1, fVar.f1262v);
        }
        String str = fVar.f1263w;
        if (!Objects.equals(str, "")) {
            cVar2.e(cVar, 2, str);
        }
        cVar2.a().e(cVar, 3, fVar.f1264x);
        cVar2.a().e(cVar, 4, fVar.f1265y);
        cVar.C(fVar.a());
    }

    @Override // c6.i
    public final int f(Object obj) {
        f fVar = (f) obj;
        boolean equals = Objects.equals(fVar.f1262v, "");
        c6.c cVar = c6.i.f5774o;
        int g9 = !equals ? cVar.g(1, fVar.f1262v) : 0;
        String str = fVar.f1263w;
        if (!Objects.equals(str, "")) {
            g9 += cVar.g(2, str);
        }
        return fVar.a().a() + cVar.a().g(4, fVar.f1265y) + cVar.a().g(3, fVar.f1264x) + g9;
    }
}
