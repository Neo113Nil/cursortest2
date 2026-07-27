package I6;

import c6.C0544a;
import c6.i;
import g1.C4523c;
import java.util.Objects;

/* loaded from: classes2.dex */
public final class c extends i {
    @Override // c6.i
    public final Object c(C4523c c4523c) {
        y8.h value = y8.h.f41951w;
        d6.d dVar = new d6.d();
        long A9 = c4523c.A();
        y8.e eVar = null;
        String str = "";
        J6.b bVar = null;
        while (true) {
            int f3 = ((C0544a) c4523c.f37627u).f();
            if (f3 == -1) {
                break;
            }
            if (f3 == 1) {
                bVar = (J6.b) J6.b.f1471y.c(c4523c);
            } else if (f3 == 2) {
                dVar.add((f) f.f1330y.c(c4523c));
            } else if (f3 != 3) {
                c4523c.F(f3);
            } else {
                str = (String) i.f5598o.c(c4523c);
            }
        }
        y8.h unknownFields = c4523c.C(A9);
        kotlin.jvm.internal.h.e(unknownFields, "unknownFields");
        if (unknownFields.a() > 0) {
            eVar = new y8.e();
            kotlin.jvm.internal.h.e(value, "value");
            eVar.K(value);
            value = y8.h.f41951w;
            eVar.K(unknownFields);
        }
        if (eVar != null) {
            value = eVar.B(eVar.f41950u);
        }
        return new d(bVar, dVar, str, value);
    }

    @Override // c6.i
    public final void d(F1.a aVar, Object obj) {
        d dVar = (d) obj;
        if (!Objects.equals(dVar.f1327v, null)) {
            J6.b.f1471y.e(aVar, 1, dVar.f1327v);
        }
        f.f1330y.a().e(aVar, 2, dVar.f1328w);
        String str = dVar.f1329x;
        if (!Objects.equals(str, "")) {
            i.f5598o.e(aVar, 3, str);
        }
        aVar.v(dVar.a());
    }

    @Override // c6.i
    public final int f(Object obj) {
        d dVar = (d) obj;
        int g4 = f.f1330y.a().g(2, dVar.f1328w) + (!Objects.equals(dVar.f1327v, null) ? J6.b.f1471y.g(1, dVar.f1327v) : 0);
        String str = dVar.f1329x;
        if (!Objects.equals(str, "")) {
            g4 += i.f5598o.g(3, str);
        }
        return dVar.a().a() + g4;
    }
}
