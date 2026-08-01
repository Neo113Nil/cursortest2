package H6;

import c6.C0544a;
import g1.C4523c;
import java.util.Objects;

/* loaded from: classes2.dex */
public final class e extends c6.i {
    @Override // c6.i
    public final Object c(C4523c c4523c) {
        y8.e eVar;
        y8.h value = y8.h.f41954w;
        d6.d dVar = new d6.d();
        d6.d dVar2 = new d6.d();
        long A9 = c4523c.A();
        String str = "";
        String str2 = "";
        while (true) {
            int f3 = ((C0544a) c4523c.f37627u).f();
            if (f3 == -1) {
                break;
            }
            c6.c cVar = c6.i.f5598o;
            if (f3 == 1) {
                str = (String) cVar.c(c4523c);
            } else if (f3 == 2) {
                str2 = (String) cVar.c(c4523c);
            } else if (f3 == 3) {
                dVar.add((String) cVar.c(c4523c));
            } else if (f3 != 4) {
                c4523c.F(f3);
            } else {
                dVar2.add((String) cVar.c(c4523c));
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
        return new f(str, str2, dVar, dVar2, value);
    }

    @Override // c6.i
    public final void d(F1.a aVar, Object obj) {
        f fVar = (f) obj;
        boolean equals = Objects.equals(fVar.f1237v, "");
        c6.c cVar = c6.i.f5598o;
        if (!equals) {
            cVar.e(aVar, 1, fVar.f1237v);
        }
        String str = fVar.f1238w;
        if (!Objects.equals(str, "")) {
            cVar.e(aVar, 2, str);
        }
        cVar.a().e(aVar, 3, fVar.f1239x);
        cVar.a().e(aVar, 4, fVar.f1240y);
        aVar.v(fVar.a());
    }

    @Override // c6.i
    public final int f(Object obj) {
        f fVar = (f) obj;
        boolean equals = Objects.equals(fVar.f1237v, "");
        c6.c cVar = c6.i.f5598o;
        int g4 = !equals ? cVar.g(1, fVar.f1237v) : 0;
        String str = fVar.f1238w;
        if (!Objects.equals(str, "")) {
            g4 += cVar.g(2, str);
        }
        return fVar.a().a() + cVar.a().g(4, fVar.f1240y) + cVar.a().g(3, fVar.f1239x) + g4;
    }
}
