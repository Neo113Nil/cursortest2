package I6;

import H6.j;
import c6.C0544a;
import c6.i;
import g1.C4523c;
import java.util.Objects;

/* loaded from: classes2.dex */
public final class a extends i {
    @Override // c6.i
    public final Object c(C4523c c4523c) {
        y8.e eVar;
        F1.a aVar;
        F1.a aVar2;
        y8.e eVar2;
        y8.h hVar = y8.h.f41954w;
        h hVar2 = h.SEVERITY_NUMBER_UNSPECIFIED;
        d6.d dVar = new d6.d();
        long A9 = c4523c.A();
        F1.a aVar3 = null;
        y8.h hVar3 = hVar;
        y8.h hVar4 = hVar3;
        H6.b bVar = null;
        long j6 = 0;
        long j9 = 0;
        String str = "";
        int i = 0;
        int i6 = 0;
        h hVar5 = hVar2;
        y8.e eVar3 = null;
        String str2 = str;
        y8.h hVar6 = hVar4;
        while (true) {
            F1.a aVar4 = aVar3;
            int f3 = ((C0544a) c4523c.f37627u).f();
            if (f3 == -1) {
                y8.e eVar4 = eVar3;
                String str3 = str;
                y8.h unknownFields = c4523c.C(A9);
                kotlin.jvm.internal.h.e(unknownFields, "unknownFields");
                if (unknownFields.a() > 0) {
                    if (eVar4 == null) {
                        eVar = new y8.e();
                        aVar = new F1.a(eVar);
                        aVar.v(hVar6);
                        hVar6 = y8.h.f41954w;
                    } else {
                        aVar = aVar4;
                        eVar = eVar4;
                    }
                    kotlin.jvm.internal.h.b(aVar);
                    aVar.v(unknownFields);
                } else {
                    eVar = eVar4;
                }
                if (eVar != null) {
                    hVar6 = eVar.B(eVar.f41953u);
                }
                return new b(j6, j9, hVar5, str2, bVar, dVar, i, i6, hVar3, hVar4, str3, hVar6);
            }
            c6.c cVar = i.f5597n;
            y8.e eVar5 = eVar3;
            c6.c cVar2 = i.f5595l;
            String str4 = str;
            c6.c cVar3 = i.f5598o;
            switch (f3) {
                case 1:
                    j6 = ((Long) cVar2.c(c4523c)).longValue();
                    aVar3 = aVar4;
                    eVar3 = eVar5;
                    str = str4;
                    break;
                case 2:
                    try {
                        hVar5 = (h) h.f1352T.c(c4523c);
                        aVar3 = aVar4;
                    } catch (c6.h e9) {
                        c6.d dVar2 = c6.d.f5578u;
                        Long valueOf = Long.valueOf(e9.f5589n);
                        if (eVar5 == null) {
                            eVar2 = new y8.e();
                            aVar2 = new F1.a(eVar2);
                            aVar2.v(hVar6);
                            hVar6 = y8.h.f41954w;
                        } else {
                            aVar2 = aVar4;
                            eVar2 = eVar5;
                        }
                        y8.h hVar7 = hVar6;
                        i a9 = dVar2.a();
                        eVar5 = eVar2;
                        kotlin.jvm.internal.h.c(a9, "null cannot be cast to non-null type com.squareup.wire.ProtoAdapter<kotlin.Any>");
                        kotlin.jvm.internal.h.b(aVar2);
                        a9.e(aVar2, f3, valueOf);
                        aVar3 = aVar2;
                        hVar6 = hVar7;
                    }
                    eVar3 = eVar5;
                    str = str4;
                    break;
                case 3:
                    str2 = (String) cVar3.c(c4523c);
                    aVar3 = aVar4;
                    eVar3 = eVar5;
                    str = str4;
                    break;
                case 4:
                default:
                    c4523c.F(f3);
                    aVar3 = aVar4;
                    eVar3 = eVar5;
                    str = str4;
                    break;
                case 5:
                    bVar = (H6.b) H6.b.f1226C.c(c4523c);
                    aVar3 = aVar4;
                    eVar3 = eVar5;
                    str = str4;
                    break;
                case 6:
                    dVar.add((j) j.f1246x.c(c4523c));
                    aVar3 = aVar4;
                    eVar3 = eVar5;
                    str = str4;
                    break;
                case 7:
                    i = ((Integer) i.f5592h.c(c4523c)).intValue();
                    aVar3 = aVar4;
                    eVar3 = eVar5;
                    str = str4;
                    break;
                case 8:
                    i6 = ((Integer) i.i.c(c4523c)).intValue();
                    aVar3 = aVar4;
                    eVar3 = eVar5;
                    str = str4;
                    break;
                case 9:
                    hVar3 = (y8.h) cVar.c(c4523c);
                    aVar3 = aVar4;
                    eVar3 = eVar5;
                    str = str4;
                    break;
                case 10:
                    hVar4 = (y8.h) cVar.c(c4523c);
                    aVar3 = aVar4;
                    eVar3 = eVar5;
                    str = str4;
                    break;
                case 11:
                    j9 = ((Long) cVar2.c(c4523c)).longValue();
                    aVar3 = aVar4;
                    eVar3 = eVar5;
                    str = str4;
                    break;
                case 12:
                    str = (String) cVar3.c(c4523c);
                    aVar3 = aVar4;
                    eVar3 = eVar5;
                    break;
            }
        }
    }

    @Override // c6.i
    public final void d(F1.a aVar, Object obj) {
        b bVar = (b) obj;
        boolean equals = Long.valueOf(bVar.f1321v).equals(0L);
        c6.c cVar = i.f5595l;
        if (!equals) {
            cVar.e(aVar, 1, Long.valueOf(bVar.f1321v));
        }
        long j6 = bVar.f1322w;
        if (!Long.valueOf(j6).equals(0L)) {
            cVar.e(aVar, 11, Long.valueOf(j6));
        }
        h hVar = h.SEVERITY_NUMBER_UNSPECIFIED;
        h hVar2 = bVar.f1323x;
        if (!Objects.equals(hVar2, hVar)) {
            h.f1352T.e(aVar, 2, hVar2);
        }
        String str = bVar.f1324y;
        boolean equals2 = Objects.equals(str, "");
        c6.c cVar2 = i.f5598o;
        if (!equals2) {
            cVar2.e(aVar, 3, str);
        }
        H6.b bVar2 = bVar.f1325z;
        if (!Objects.equals(bVar2, null)) {
            H6.b.f1226C.e(aVar, 5, bVar2);
        }
        j.f1246x.a().e(aVar, 6, bVar.f1315A);
        int i = bVar.f1316B;
        if (!Integer.valueOf(i).equals(0)) {
            i.f5592h.e(aVar, 7, Integer.valueOf(i));
        }
        int i6 = bVar.f1317C;
        if (!Integer.valueOf(i6).equals(0)) {
            i.i.e(aVar, 8, Integer.valueOf(i6));
        }
        y8.h hVar3 = y8.h.f41954w;
        y8.h hVar4 = bVar.f1318D;
        boolean equals3 = Objects.equals(hVar4, hVar3);
        c6.c cVar3 = i.f5597n;
        if (!equals3) {
            cVar3.e(aVar, 9, hVar4);
        }
        y8.h hVar5 = bVar.f1319E;
        if (!Objects.equals(hVar5, hVar3)) {
            cVar3.e(aVar, 10, hVar5);
        }
        String str2 = bVar.f1320F;
        if (!Objects.equals(str2, "")) {
            cVar2.e(aVar, 12, str2);
        }
        aVar.v(bVar.a());
    }

    @Override // c6.i
    public final int f(Object obj) {
        b bVar = (b) obj;
        boolean equals = Long.valueOf(bVar.f1321v).equals(0L);
        c6.c cVar = i.f5595l;
        int g4 = equals ? 0 : cVar.g(1, Long.valueOf(bVar.f1321v));
        long j6 = bVar.f1322w;
        if (!Long.valueOf(j6).equals(0L)) {
            g4 += cVar.g(11, Long.valueOf(j6));
        }
        h hVar = h.SEVERITY_NUMBER_UNSPECIFIED;
        h hVar2 = bVar.f1323x;
        if (!Objects.equals(hVar2, hVar)) {
            g4 += h.f1352T.g(2, hVar2);
        }
        String str = bVar.f1324y;
        boolean equals2 = Objects.equals(str, "");
        c6.c cVar2 = i.f5598o;
        if (!equals2) {
            g4 += cVar2.g(3, str);
        }
        H6.b bVar2 = bVar.f1325z;
        if (!Objects.equals(bVar2, null)) {
            g4 += H6.b.f1226C.g(5, bVar2);
        }
        int g9 = j.f1246x.a().g(6, bVar.f1315A) + g4;
        int i = bVar.f1316B;
        if (!Integer.valueOf(i).equals(0)) {
            g9 += i.f5592h.g(7, Integer.valueOf(i));
        }
        int i6 = bVar.f1317C;
        if (!Integer.valueOf(i6).equals(0)) {
            g9 += i.i.g(8, Integer.valueOf(i6));
        }
        y8.h hVar3 = y8.h.f41954w;
        y8.h hVar4 = bVar.f1318D;
        boolean equals3 = Objects.equals(hVar4, hVar3);
        c6.c cVar3 = i.f5597n;
        if (!equals3) {
            g9 += cVar3.g(9, hVar4);
        }
        y8.h hVar5 = bVar.f1319E;
        if (!Objects.equals(hVar5, hVar3)) {
            g9 += cVar3.g(10, hVar5);
        }
        String str2 = bVar.f1320F;
        if (!Objects.equals(str2, "")) {
            g9 += cVar2.g(12, str2);
        }
        return bVar.a().a() + g9;
    }
}
