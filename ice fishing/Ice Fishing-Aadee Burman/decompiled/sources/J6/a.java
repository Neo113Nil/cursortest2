package J6;

import H6.f;
import H6.j;
import c6.C0544a;
import c6.i;
import d6.d;
import g1.C4523c;
import y8.e;
import y8.h;

/* loaded from: classes2.dex */
public final class a extends i {
    @Override // c6.i
    public final Object c(C4523c c4523c) {
        e eVar;
        h value = h.f41951w;
        d dVar = new d();
        d dVar2 = new d();
        long A9 = c4523c.A();
        int i = 0;
        while (true) {
            int f3 = ((C0544a) c4523c.f37627u).f();
            if (f3 == -1) {
                break;
            }
            if (f3 == 1) {
                dVar.add((j) j.f1246x.c(c4523c));
            } else if (f3 == 2) {
                i = ((Integer) i.f5592h.c(c4523c)).intValue();
            } else if (f3 != 3) {
                c4523c.F(f3);
            } else {
                dVar2.add((f) f.f1236z.c(c4523c));
            }
        }
        h unknownFields = c4523c.C(A9);
        kotlin.jvm.internal.h.e(unknownFields, "unknownFields");
        if (unknownFields.a() > 0) {
            eVar = new e();
            kotlin.jvm.internal.h.e(value, "value");
            eVar.K(value);
            value = h.f41951w;
            eVar.K(unknownFields);
        } else {
            eVar = null;
        }
        if (eVar != null) {
            value = eVar.B(eVar.f41950u);
        }
        return new b(dVar, i, dVar2, value);
    }

    @Override // c6.i
    public final void d(F1.a aVar, Object obj) {
        b bVar = (b) obj;
        j.f1246x.a().e(aVar, 1, bVar.f1472v);
        int i = bVar.f1473w;
        if (!Integer.valueOf(i).equals(0)) {
            i.f5592h.e(aVar, 2, Integer.valueOf(i));
        }
        f.f1236z.a().e(aVar, 3, bVar.f1474x);
        aVar.v(bVar.a());
    }

    @Override // c6.i
    public final int f(Object obj) {
        b bVar = (b) obj;
        int g4 = j.f1246x.a().g(1, bVar.f1472v);
        int i = bVar.f1473w;
        if (!Integer.valueOf(i).equals(0)) {
            g4 += i.f5592h.g(2, Integer.valueOf(i));
        }
        return bVar.a().a() + f.f1236z.a().g(3, bVar.f1474x) + g4;
    }
}
