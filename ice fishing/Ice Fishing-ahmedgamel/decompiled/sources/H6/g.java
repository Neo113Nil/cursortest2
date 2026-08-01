package H6;

import c6.C0544a;
import g1.C4523c;
import java.util.Objects;

/* loaded from: classes2.dex */
public final class g extends c6.i {
    @Override // c6.i
    public final Object c(C4523c c4523c) {
        y8.e eVar;
        y8.h value = y8.h.f41954w;
        d6.d dVar = new d6.d();
        long A9 = c4523c.A();
        String str = "";
        int i = 0;
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
                dVar.add((j) j.f1246x.c(c4523c));
            } else if (f3 != 4) {
                c4523c.F(f3);
            } else {
                i = ((Integer) c6.i.f5592h.c(c4523c)).intValue();
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
        return new h(str, str2, dVar, i, value);
    }

    @Override // c6.i
    public final void d(F1.a aVar, Object obj) {
        h hVar = (h) obj;
        boolean equals = Objects.equals(hVar.f1242v, "");
        c6.c cVar = c6.i.f5598o;
        if (!equals) {
            cVar.e(aVar, 1, hVar.f1242v);
        }
        String str = hVar.f1243w;
        if (!Objects.equals(str, "")) {
            cVar.e(aVar, 2, str);
        }
        j.f1246x.a().e(aVar, 3, hVar.f1244x);
        int i = hVar.f1245y;
        if (!Integer.valueOf(i).equals(0)) {
            c6.i.f5592h.e(aVar, 4, Integer.valueOf(i));
        }
        aVar.v(hVar.a());
    }

    @Override // c6.i
    public final int f(Object obj) {
        h hVar = (h) obj;
        boolean equals = Objects.equals(hVar.f1242v, "");
        c6.c cVar = c6.i.f5598o;
        int g4 = !equals ? cVar.g(1, hVar.f1242v) : 0;
        String str = hVar.f1243w;
        if (!Objects.equals(str, "")) {
            g4 += cVar.g(2, str);
        }
        int g9 = j.f1246x.a().g(3, hVar.f1244x) + g4;
        int i = hVar.f1245y;
        if (!Integer.valueOf(i).equals(0)) {
            g9 += c6.i.f5592h.g(4, Integer.valueOf(i));
        }
        return hVar.a().a() + g9;
    }
}
