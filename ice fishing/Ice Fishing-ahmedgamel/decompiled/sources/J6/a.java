package J6;

import H6.f;
import H6.j;
import c6.C0555a;
import c6.i;
import d6.d;
import i1.C4586c;
import n4.c;
import y8.e;
import y8.h;

/* loaded from: classes2.dex */
public final class a extends i {
    @Override // c6.i
    public final Object c(C4586c c4586c) {
        e eVar;
        h value = h.f41925w;
        d dVar = new d();
        d dVar2 = new d();
        long n9 = c4586c.n();
        int i = 0;
        while (true) {
            int f2 = ((C0555a) c4586c.f38154u).f();
            if (f2 == -1) {
                break;
            }
            if (f2 == 1) {
                dVar.add((j) j.f1271x.c(c4586c));
            } else if (f2 == 2) {
                i = ((Integer) i.f5768h.c(c4586c)).intValue();
            } else if (f2 != 3) {
                c4586c.t(f2);
            } else {
                dVar2.add((f) f.f1261z.c(c4586c));
            }
        }
        h unknownFields = c4586c.p(n9);
        kotlin.jvm.internal.h.e(unknownFields, "unknownFields");
        if (unknownFields.a() > 0) {
            eVar = new e();
            kotlin.jvm.internal.h.e(value, "value");
            eVar.K(value);
            value = h.f41925w;
            eVar.K(unknownFields);
        } else {
            eVar = null;
        }
        if (eVar != null) {
            value = eVar.B(eVar.f41924u);
        }
        return new b(dVar, i, dVar2, value);
    }

    @Override // c6.i
    public final void d(c cVar, Object obj) {
        b bVar = (b) obj;
        j.f1271x.a().e(cVar, 1, bVar.f1581v);
        int i = bVar.f1582w;
        if (!Integer.valueOf(i).equals(0)) {
            i.f5768h.e(cVar, 2, Integer.valueOf(i));
        }
        f.f1261z.a().e(cVar, 3, bVar.f1583x);
        cVar.C(bVar.a());
    }

    @Override // c6.i
    public final int f(Object obj) {
        b bVar = (b) obj;
        int g9 = j.f1271x.a().g(1, bVar.f1581v);
        int i = bVar.f1582w;
        if (!Integer.valueOf(i).equals(0)) {
            g9 += i.f5768h.g(2, Integer.valueOf(i));
        }
        return bVar.a().a() + f.f1261z.a().g(3, bVar.f1583x) + g9;
    }
}
