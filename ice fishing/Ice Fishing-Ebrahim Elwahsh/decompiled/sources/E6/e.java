package E6;

import I0.j;
import Y5.i;
import g1.C4523c;
import java.util.Objects;

/* loaded from: classes2.dex */
public final class e extends i {
    @Override // Y5.i
    public final Object b(j jVar) {
        u8.h value = u8.h.f41278w;
        Z5.d dVar = new Z5.d();
        long a9 = jVar.a();
        u8.e eVar = null;
        String str = "";
        D6.h hVar = null;
        while (true) {
            int f6 = ((Y5.a) jVar.f1233u).f();
            if (f6 == -1) {
                break;
            }
            if (f6 == 1) {
                hVar = (D6.h) D6.h.f720z.b(jVar);
            } else if (f6 == 2) {
                dVar.add((b) b.f846G.b(jVar));
            } else if (f6 != 3) {
                jVar.w(f6);
            } else {
                str = (String) i.f4003o.b(jVar);
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
        return new f(hVar, dVar, str, value);
    }

    @Override // Y5.i
    public final void d(C4523c c4523c, Object obj) {
        f fVar = (f) obj;
        if (!Objects.equals(fVar.f863v, null)) {
            D6.h.f720z.e(c4523c, 1, fVar.f863v);
        }
        b.f846G.a().e(c4523c, 2, fVar.f864w);
        String str = fVar.f865x;
        if (!Objects.equals(str, "")) {
            i.f4003o.e(c4523c, 3, str);
        }
        c4523c.C(fVar.a());
    }

    @Override // Y5.i
    public final int f(Object obj) {
        f fVar = (f) obj;
        int g9 = b.f846G.a().g(2, fVar.f864w) + (!Objects.equals(fVar.f863v, null) ? D6.h.f720z.g(1, fVar.f863v) : 0);
        String str = fVar.f865x;
        if (!Objects.equals(str, "")) {
            g9 += i.f4003o.g(3, str);
        }
        return fVar.a().a() + g9;
    }
}
