package H6;

import c6.C0555a;
import i1.C4586c;
import java.util.Objects;

/* loaded from: classes2.dex */
public final class g extends c6.i {
    @Override // c6.i
    public final Object c(C4586c c4586c) {
        y8.e eVar;
        y8.h value = y8.h.f41925w;
        d6.d dVar = new d6.d();
        long n9 = c4586c.n();
        String str = "";
        int i = 0;
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
                dVar.add((j) j.f1271x.c(c4586c));
            } else if (f2 != 4) {
                c4586c.t(f2);
            } else {
                i = ((Integer) c6.i.f5768h.c(c4586c)).intValue();
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
        return new h(str, str2, dVar, i, value);
    }

    @Override // c6.i
    public final void d(n4.c cVar, Object obj) {
        h hVar = (h) obj;
        boolean equals = Objects.equals(hVar.f1267v, "");
        c6.c cVar2 = c6.i.f5774o;
        if (!equals) {
            cVar2.e(cVar, 1, hVar.f1267v);
        }
        String str = hVar.f1268w;
        if (!Objects.equals(str, "")) {
            cVar2.e(cVar, 2, str);
        }
        j.f1271x.a().e(cVar, 3, hVar.f1269x);
        int i = hVar.f1270y;
        if (!Integer.valueOf(i).equals(0)) {
            c6.i.f5768h.e(cVar, 4, Integer.valueOf(i));
        }
        cVar.C(hVar.a());
    }

    @Override // c6.i
    public final int f(Object obj) {
        h hVar = (h) obj;
        boolean equals = Objects.equals(hVar.f1267v, "");
        c6.c cVar = c6.i.f5774o;
        int g9 = !equals ? cVar.g(1, hVar.f1267v) : 0;
        String str = hVar.f1268w;
        if (!Objects.equals(str, "")) {
            g9 += cVar.g(2, str);
        }
        int g10 = j.f1271x.a().g(3, hVar.f1269x) + g9;
        int i = hVar.f1270y;
        if (!Integer.valueOf(i).equals(0)) {
            g10 += c6.i.f5768h.g(4, Integer.valueOf(i));
        }
        return hVar.a().a() + g10;
    }
}
