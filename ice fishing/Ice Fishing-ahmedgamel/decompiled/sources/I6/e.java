package I6;

import c6.C0555a;
import c6.i;
import i1.C4586c;
import java.util.Objects;

/* loaded from: classes2.dex */
public final class e extends i {
    @Override // c6.i
    public final Object c(C4586c c4586c) {
        y8.h value = y8.h.f41925w;
        d6.d dVar = new d6.d();
        long n9 = c4586c.n();
        y8.e eVar = null;
        String str = "";
        H6.h hVar = null;
        while (true) {
            int f2 = ((C0555a) c4586c.f38154u).f();
            if (f2 == -1) {
                break;
            }
            if (f2 == 1) {
                hVar = (H6.h) H6.h.f1266z.c(c4586c);
            } else if (f2 == 2) {
                dVar.add((b) b.f1344G.c(c4586c));
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
        return new f(hVar, dVar, str, value);
    }

    @Override // c6.i
    public final void d(n4.c cVar, Object obj) {
        f fVar = (f) obj;
        if (!Objects.equals(fVar.f1361v, null)) {
            H6.h.f1266z.e(cVar, 1, fVar.f1361v);
        }
        b.f1344G.a().e(cVar, 2, fVar.f1362w);
        String str = fVar.f1363x;
        if (!Objects.equals(str, "")) {
            i.f5774o.e(cVar, 3, str);
        }
        cVar.C(fVar.a());
    }

    @Override // c6.i
    public final int f(Object obj) {
        f fVar = (f) obj;
        int g9 = b.f1344G.a().g(2, fVar.f1362w) + (!Objects.equals(fVar.f1361v, null) ? H6.h.f1266z.g(1, fVar.f1361v) : 0);
        String str = fVar.f1363x;
        if (!Objects.equals(str, "")) {
            g9 += i.f5774o.g(3, str);
        }
        return fVar.a().a() + g9;
    }
}
