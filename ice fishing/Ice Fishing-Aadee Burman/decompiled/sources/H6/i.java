package H6;

import c6.C0544a;
import g1.C4523c;
import java.util.Objects;

/* loaded from: classes2.dex */
public final class i extends c6.i {
    @Override // c6.i
    public final Object c(C4523c c4523c) {
        y8.h value = y8.h.f41951w;
        long A9 = c4523c.A();
        y8.e eVar = null;
        String str = "";
        b bVar = null;
        while (true) {
            int f3 = ((C0544a) c4523c.f37627u).f();
            if (f3 == -1) {
                break;
            }
            if (f3 == 1) {
                str = (String) c6.i.f5598o.c(c4523c);
            } else if (f3 != 2) {
                c4523c.F(f3);
            } else {
                bVar = (b) b.f1226C.c(c4523c);
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
        return new j(str, bVar, value);
    }

    @Override // c6.i
    public final void d(F1.a aVar, Object obj) {
        j jVar = (j) obj;
        if (!Objects.equals(jVar.f1247v, "")) {
            c6.i.f5598o.e(aVar, 1, jVar.f1247v);
        }
        b bVar = jVar.f1248w;
        if (!Objects.equals(bVar, null)) {
            b.f1226C.e(aVar, 2, bVar);
        }
        aVar.v(jVar.a());
    }

    @Override // c6.i
    public final int f(Object obj) {
        int i;
        j jVar = (j) obj;
        if (Objects.equals(jVar.f1247v, "")) {
            i = 0;
        } else {
            i = c6.i.f5598o.g(1, jVar.f1247v);
        }
        b bVar = jVar.f1248w;
        if (!Objects.equals(bVar, null)) {
            i += b.f1226C.g(2, bVar);
        }
        return jVar.a().a() + i;
    }
}
