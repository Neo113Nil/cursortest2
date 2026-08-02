package I6;

import H6.j;
import c6.C0555a;
import c6.i;
import i1.C4586c;
import java.util.Objects;

/* loaded from: classes2.dex */
public final class a extends i {
    @Override // c6.i
    public final Object c(C4586c c4586c) {
        y8.e eVar;
        n4.c cVar;
        n4.c cVar2;
        y8.e eVar2;
        y8.h hVar = y8.h.f41925w;
        h hVar2 = h.SEVERITY_NUMBER_UNSPECIFIED;
        d6.d dVar = new d6.d();
        long n9 = c4586c.n();
        n4.c cVar3 = null;
        y8.h hVar3 = hVar;
        y8.h hVar4 = hVar3;
        H6.b bVar = null;
        long j6 = 0;
        long j9 = 0;
        String str = "";
        int i = 0;
        int i4 = 0;
        h hVar5 = hVar2;
        y8.e eVar3 = null;
        String str2 = str;
        y8.h hVar6 = hVar4;
        while (true) {
            n4.c cVar4 = cVar3;
            int f2 = ((C0555a) c4586c.f38154u).f();
            if (f2 == -1) {
                y8.e eVar4 = eVar3;
                String str3 = str;
                y8.h unknownFields = c4586c.p(n9);
                kotlin.jvm.internal.h.e(unknownFields, "unknownFields");
                if (unknownFields.a() > 0) {
                    if (eVar4 == null) {
                        eVar = new y8.e();
                        cVar = new n4.c(eVar);
                        cVar.C(hVar6);
                        hVar6 = y8.h.f41925w;
                    } else {
                        cVar = cVar4;
                        eVar = eVar4;
                    }
                    kotlin.jvm.internal.h.b(cVar);
                    cVar.C(unknownFields);
                } else {
                    eVar = eVar4;
                }
                if (eVar != null) {
                    hVar6 = eVar.B(eVar.f41924u);
                }
                return new b(j6, j9, hVar5, str2, bVar, dVar, i, i4, hVar3, hVar4, str3, hVar6);
            }
            c6.c cVar5 = i.f5773n;
            y8.e eVar5 = eVar3;
            c6.c cVar6 = i.f5771l;
            String str4 = str;
            c6.c cVar7 = i.f5774o;
            switch (f2) {
                case 1:
                    j6 = ((Long) cVar6.c(c4586c)).longValue();
                    cVar3 = cVar4;
                    eVar3 = eVar5;
                    str = str4;
                    break;
                case 2:
                    try {
                        hVar5 = (h) h.f1382T.c(c4586c);
                        cVar3 = cVar4;
                    } catch (c6.h e9) {
                        c6.d dVar2 = c6.d.f5754u;
                        Long valueOf = Long.valueOf(e9.f5765n);
                        if (eVar5 == null) {
                            eVar2 = new y8.e();
                            cVar2 = new n4.c(eVar2);
                            cVar2.C(hVar6);
                            hVar6 = y8.h.f41925w;
                        } else {
                            cVar2 = cVar4;
                            eVar2 = eVar5;
                        }
                        y8.h hVar7 = hVar6;
                        i a9 = dVar2.a();
                        eVar5 = eVar2;
                        kotlin.jvm.internal.h.c(a9, "null cannot be cast to non-null type com.squareup.wire.ProtoAdapter<kotlin.Any>");
                        kotlin.jvm.internal.h.b(cVar2);
                        a9.e(cVar2, f2, valueOf);
                        cVar3 = cVar2;
                        hVar6 = hVar7;
                    }
                    eVar3 = eVar5;
                    str = str4;
                    break;
                case 3:
                    str2 = (String) cVar7.c(c4586c);
                    cVar3 = cVar4;
                    eVar3 = eVar5;
                    str = str4;
                    break;
                case 4:
                default:
                    c4586c.t(f2);
                    cVar3 = cVar4;
                    eVar3 = eVar5;
                    str = str4;
                    break;
                case 5:
                    bVar = (H6.b) H6.b.f1251C.c(c4586c);
                    cVar3 = cVar4;
                    eVar3 = eVar5;
                    str = str4;
                    break;
                case 6:
                    dVar.add((j) j.f1271x.c(c4586c));
                    cVar3 = cVar4;
                    eVar3 = eVar5;
                    str = str4;
                    break;
                case 7:
                    i = ((Integer) i.f5768h.c(c4586c)).intValue();
                    cVar3 = cVar4;
                    eVar3 = eVar5;
                    str = str4;
                    break;
                case 8:
                    i4 = ((Integer) i.i.c(c4586c)).intValue();
                    cVar3 = cVar4;
                    eVar3 = eVar5;
                    str = str4;
                    break;
                case 9:
                    hVar3 = (y8.h) cVar5.c(c4586c);
                    cVar3 = cVar4;
                    eVar3 = eVar5;
                    str = str4;
                    break;
                case 10:
                    hVar4 = (y8.h) cVar5.c(c4586c);
                    cVar3 = cVar4;
                    eVar3 = eVar5;
                    str = str4;
                    break;
                case 11:
                    j9 = ((Long) cVar6.c(c4586c)).longValue();
                    cVar3 = cVar4;
                    eVar3 = eVar5;
                    str = str4;
                    break;
                case 12:
                    str = (String) cVar7.c(c4586c);
                    cVar3 = cVar4;
                    eVar3 = eVar5;
                    break;
            }
        }
    }

    @Override // c6.i
    public final void d(n4.c cVar, Object obj) {
        b bVar = (b) obj;
        boolean equals = Long.valueOf(bVar.f1351v).equals(0L);
        c6.c cVar2 = i.f5771l;
        if (!equals) {
            cVar2.e(cVar, 1, Long.valueOf(bVar.f1351v));
        }
        long j6 = bVar.f1352w;
        if (!Long.valueOf(j6).equals(0L)) {
            cVar2.e(cVar, 11, Long.valueOf(j6));
        }
        h hVar = h.SEVERITY_NUMBER_UNSPECIFIED;
        h hVar2 = bVar.f1353x;
        if (!Objects.equals(hVar2, hVar)) {
            h.f1382T.e(cVar, 2, hVar2);
        }
        String str = bVar.f1354y;
        boolean equals2 = Objects.equals(str, "");
        c6.c cVar3 = i.f5774o;
        if (!equals2) {
            cVar3.e(cVar, 3, str);
        }
        H6.b bVar2 = bVar.f1355z;
        if (!Objects.equals(bVar2, null)) {
            H6.b.f1251C.e(cVar, 5, bVar2);
        }
        j.f1271x.a().e(cVar, 6, bVar.f1345A);
        int i = bVar.f1346B;
        if (!Integer.valueOf(i).equals(0)) {
            i.f5768h.e(cVar, 7, Integer.valueOf(i));
        }
        int i4 = bVar.f1347C;
        if (!Integer.valueOf(i4).equals(0)) {
            i.i.e(cVar, 8, Integer.valueOf(i4));
        }
        y8.h hVar3 = y8.h.f41925w;
        y8.h hVar4 = bVar.f1348D;
        boolean equals3 = Objects.equals(hVar4, hVar3);
        c6.c cVar4 = i.f5773n;
        if (!equals3) {
            cVar4.e(cVar, 9, hVar4);
        }
        y8.h hVar5 = bVar.f1349E;
        if (!Objects.equals(hVar5, hVar3)) {
            cVar4.e(cVar, 10, hVar5);
        }
        String str2 = bVar.f1350F;
        if (!Objects.equals(str2, "")) {
            cVar3.e(cVar, 12, str2);
        }
        cVar.C(bVar.a());
    }

    @Override // c6.i
    public final int f(Object obj) {
        b bVar = (b) obj;
        boolean equals = Long.valueOf(bVar.f1351v).equals(0L);
        c6.c cVar = i.f5771l;
        int g9 = equals ? 0 : cVar.g(1, Long.valueOf(bVar.f1351v));
        long j6 = bVar.f1352w;
        if (!Long.valueOf(j6).equals(0L)) {
            g9 += cVar.g(11, Long.valueOf(j6));
        }
        h hVar = h.SEVERITY_NUMBER_UNSPECIFIED;
        h hVar2 = bVar.f1353x;
        if (!Objects.equals(hVar2, hVar)) {
            g9 += h.f1382T.g(2, hVar2);
        }
        String str = bVar.f1354y;
        boolean equals2 = Objects.equals(str, "");
        c6.c cVar2 = i.f5774o;
        if (!equals2) {
            g9 += cVar2.g(3, str);
        }
        H6.b bVar2 = bVar.f1355z;
        if (!Objects.equals(bVar2, null)) {
            g9 += H6.b.f1251C.g(5, bVar2);
        }
        int g10 = j.f1271x.a().g(6, bVar.f1345A) + g9;
        int i = bVar.f1346B;
        if (!Integer.valueOf(i).equals(0)) {
            g10 += i.f5768h.g(7, Integer.valueOf(i));
        }
        int i4 = bVar.f1347C;
        if (!Integer.valueOf(i4).equals(0)) {
            g10 += i.i.g(8, Integer.valueOf(i4));
        }
        y8.h hVar3 = y8.h.f41925w;
        y8.h hVar4 = bVar.f1348D;
        boolean equals3 = Objects.equals(hVar4, hVar3);
        c6.c cVar3 = i.f5773n;
        if (!equals3) {
            g10 += cVar3.g(9, hVar4);
        }
        y8.h hVar5 = bVar.f1349E;
        if (!Objects.equals(hVar5, hVar3)) {
            g10 += cVar3.g(10, hVar5);
        }
        String str2 = bVar.f1350F;
        if (!Objects.equals(str2, "")) {
            g10 += cVar2.g(12, str2);
        }
        return bVar.a().a() + g10;
    }
}
