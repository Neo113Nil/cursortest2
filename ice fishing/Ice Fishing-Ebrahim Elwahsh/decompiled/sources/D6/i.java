package D6;

import g1.C4523c;
import java.util.Objects;

/* loaded from: classes2.dex */
public final class i extends Y5.i {
    @Override // Y5.i
    public final Object b(I0.j jVar) {
        u8.h value = u8.h.f41278w;
        long a9 = jVar.a();
        u8.e eVar = null;
        String str = "";
        b bVar = null;
        while (true) {
            int f6 = ((Y5.a) jVar.f1233u).f();
            if (f6 == -1) {
                break;
            }
            if (f6 == 1) {
                str = (String) Y5.i.f4003o.b(jVar);
            } else if (f6 != 2) {
                jVar.w(f6);
            } else {
                bVar = (b) b.f705C.b(jVar);
            }
        }
        u8.h unknownFields = jVar.l(a9);
        kotlin.jvm.internal.h.e(unknownFields, "unknownFields");
        if (unknownFields.a() > 0) {
            eVar = new u8.e();
            kotlin.jvm.internal.h.e(value, "value");
            eVar.K(value);
            value = u8.h.f41278w;
            eVar.K(unknownFields);
        }
        if (eVar != null) {
            value = eVar.B(eVar.f41277u);
        }
        return new j(str, bVar, value);
    }

    @Override // Y5.i
    public final void d(C4523c c4523c, Object obj) {
        j jVar = (j) obj;
        if (!Objects.equals(jVar.f726v, "")) {
            Y5.i.f4003o.e(c4523c, 1, jVar.f726v);
        }
        b bVar = jVar.f727w;
        if (!Objects.equals(bVar, null)) {
            b.f705C.e(c4523c, 2, bVar);
        }
        c4523c.C(jVar.a());
    }

    @Override // Y5.i
    public final int f(Object obj) {
        int i;
        j jVar = (j) obj;
        if (Objects.equals(jVar.f726v, "")) {
            i = 0;
        } else {
            i = Y5.i.f4003o.g(1, jVar.f726v);
        }
        b bVar = jVar.f727w;
        if (!Objects.equals(bVar, null)) {
            i += b.f705C.g(2, bVar);
        }
        return jVar.a().a() + i;
    }
}
