package I6;

import c6.C0544a;
import c6.i;
import g1.C4523c;
import java.util.Objects;

/* loaded from: classes2.dex */
public final class e extends i {
    @Override // c6.i
    public final Object c(C4523c c4523c) {
        y8.h value = y8.h.f41951w;
        d6.d dVar = new d6.d();
        long A9 = c4523c.A();
        y8.e eVar = null;
        String str = "";
        H6.h hVar = null;
        while (true) {
            int f3 = ((C0544a) c4523c.f37627u).f();
            if (f3 == -1) {
                break;
            }
            if (f3 == 1) {
                hVar = (H6.h) H6.h.f1241z.c(c4523c);
            } else if (f3 == 2) {
                dVar.add((b) b.f1314G.c(c4523c));
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
        return new f(hVar, dVar, str, value);
    }

    @Override // c6.i
    public final void d(F1.a aVar, Object obj) {
        f fVar = (f) obj;
        if (!Objects.equals(fVar.f1331v, null)) {
            H6.h.f1241z.e(aVar, 1, fVar.f1331v);
        }
        b.f1314G.a().e(aVar, 2, fVar.f1332w);
        String str = fVar.f1333x;
        if (!Objects.equals(str, "")) {
            i.f5598o.e(aVar, 3, str);
        }
        aVar.v(fVar.a());
    }

    @Override // c6.i
    public final int f(Object obj) {
        f fVar = (f) obj;
        int g4 = b.f1314G.a().g(2, fVar.f1332w) + (!Objects.equals(fVar.f1331v, null) ? H6.h.f1241z.g(1, fVar.f1331v) : 0);
        String str = fVar.f1333x;
        if (!Objects.equals(str, "")) {
            g4 += i.f5598o.g(3, str);
        }
        return fVar.a().a() + g4;
    }
}
