package M6;

import J6.j;
import J6.n;
import J6.o;
import J6.p;
import J6.q;
import J6.s;
import J6.t;
import L6.i;
import L6.k;
import g6.C4531a;
import j6.InterfaceC4606h;
import java.io.UncheckedIOException;
import java.util.List;

/* loaded from: classes2.dex */
public final class a implements p, q {

    /* renamed from: a, reason: collision with root package name */
    public static final a f1896a = new a();

    /* renamed from: b, reason: collision with root package name */
    public static final a f1897b = new a();

    @Override // J6.p
    public int a(Object obj, Object obj2, j jVar) {
        U6.a aVar = (U6.a) obj;
        k d2 = k.d(aVar);
        jVar.a(d2);
        return t.d(R6.c.f2814c, aVar.f3303c, jVar) + t.c(R6.c.f2813b, (List) obj2, f1897b, jVar) + J6.k.d(R6.c.f2812a, d2);
    }

    @Override // J6.q
    public void b(o oVar, Object obj, j jVar) {
        int e6;
        int size;
        Y6.a aVar = (Y6.a) obj;
        J6.b bVar = R6.a.f2799a;
        long j9 = aVar.j();
        if (j9 != 0) {
            oVar.F(bVar, j9);
        }
        J6.b bVar2 = R6.a.f2800b;
        long d2 = aVar.d();
        if (d2 != 0) {
            oVar.F(bVar2, d2);
        }
        J6.b bVar3 = R6.a.f2801c;
        J6.a d3 = b.d(aVar.b());
        if (d3.f1398a != 0) {
            oVar.D(bVar3, d3);
        }
        oVar.p(R6.a.f2802d, aVar.i(), jVar);
        if (aVar.c() != null) {
            oVar.b(R6.a.f2803e, aVar.c(), jVar);
        }
        if (aVar instanceof Z6.a) {
            i.e(oVar, R6.a.f2804f, i.c(aVar), jVar);
            e6 = aVar.e();
            size = i.c(aVar).size();
        } else {
            J6.b bVar4 = R6.a.f2804f;
            b6.c a9 = aVar.a();
            L6.a aVar2 = L6.a.f1751e;
            oVar.V(bVar4);
            if (!a9.isEmpty()) {
                n nVar = (n) jVar.d(o.f1447n, new D5.a(6));
                nVar.f1443a = bVar4;
                nVar.f1444b = oVar;
                nVar.f1445c = aVar2;
                nVar.f1446d = jVar;
                try {
                    a9.forEach(nVar);
                } catch (UncheckedIOException e9) {
                    throw e9.getCause();
                }
            }
            oVar.B();
            e6 = aVar.e();
            size = aVar.a().size();
        }
        int i = e6 - size;
        J6.b bVar5 = R6.a.f2805g;
        if (i != 0) {
            oVar.b0(bVar5, i);
        }
        InterfaceC4606h h9 = aVar.h();
        J6.b bVar6 = R6.a.f2806h;
        C4531a c4531a = (C4531a) h9;
        byte b9 = c4531a.f37923c.f38575b;
        if (b9 != 0) {
            oVar.E(bVar6, b9);
        }
        String str = c4531a.f37921a;
        if (!str.equals("00000000000000000000000000000000")) {
            oVar.a0(R6.a.i, str, jVar);
        }
        String str2 = c4531a.f37922b;
        if (!str2.equals("0000000000000000")) {
            oVar.J(R6.a.f2807j, str2, jVar);
        }
        oVar.p(R6.a.f2808k, aVar.f(), jVar);
    }

    @Override // J6.q
    public int c(Object obj, j jVar) {
        int i;
        int i4;
        int i9;
        int b9;
        int i10;
        int b10;
        Y6.a aVar = (Y6.a) obj;
        int c4 = J6.k.c(R6.a.f2800b, aVar.d()) + J6.k.c(R6.a.f2799a, aVar.j());
        J6.b bVar = R6.a.f2801c;
        int i11 = b.d(aVar.b()).f1398a;
        int i12 = 0;
        if (i11 == 0) {
            i4 = 0;
        } else {
            int i13 = bVar.f1402c;
            if (i11 >= 0) {
                i = J6.d.b(i11);
            } else {
                int i14 = J6.d.f1408e;
                i = 10;
            }
            i4 = i13 + i;
        }
        int d2 = t.d(R6.a.f2802d, aVar.i(), jVar) + i4 + c4;
        if (aVar.c() != null) {
            d2 += t.a(R6.a.f2803e, aVar.c(), jVar);
        }
        if (aVar instanceof Z6.a) {
            int f6 = i.f(R6.a.f2804f, i.c(aVar), jVar) + d2;
            int e6 = aVar.e() - i.c(aVar).size();
            J6.b bVar2 = R6.a.f2805g;
            if (e6 == 0) {
                b10 = 0;
            } else {
                b10 = J6.d.b(e6) + bVar2.f1402c;
            }
            i10 = b10 + f6;
        } else {
            J6.b bVar3 = R6.a.f2804f;
            b6.c a9 = aVar.a();
            L6.a aVar2 = L6.a.f1751e;
            if (a9.isEmpty()) {
                i9 = 0;
            } else {
                s sVar = (s) jVar.d(t.f1457b, new D5.a(8));
                sVar.f1452a = 0;
                sVar.f1453b = bVar3.f1402c;
                sVar.f1454c = aVar2;
                sVar.f1455d = jVar;
                a9.forEach(sVar);
                i9 = sVar.f1452a;
            }
            int i15 = d2 + i9;
            int e9 = aVar.e() - aVar.a().size();
            J6.b bVar4 = R6.a.f2805g;
            if (e9 == 0) {
                b9 = 0;
            } else {
                b9 = J6.d.b(e9) + bVar4.f1402c;
            }
            i10 = i15 + b9;
        }
        InterfaceC4606h h9 = aVar.h();
        J6.b bVar5 = R6.a.f2806h;
        C4531a c4531a = (C4531a) h9;
        if (c4531a.f37923c.f38575b != 0) {
            int i16 = bVar5.f1402c;
            int i17 = J6.d.f1408e;
            i12 = i16 + 4;
        }
        int i18 = i12 + i10;
        if (!c4531a.f37921a.equals("00000000000000000000000000000000")) {
            i18 += R6.a.i.f1402c + J6.k.f1435a;
        }
        if (!c4531a.f37922b.equals("0000000000000000")) {
            i18 += R6.a.f2807j.f1402c + J6.k.f1436b;
        }
        return t.d(R6.a.f2808k, aVar.f(), jVar) + i18;
    }

    @Override // J6.p
    public void d(o oVar, Object obj, Object obj2, j jVar) {
        oVar.a(R6.c.f2812a, (k) jVar.c(k.class));
        oVar.k(R6.c.f2813b, (List) obj2, f1897b, jVar);
        oVar.p(R6.c.f2814c, ((U6.a) obj).f3303c, jVar);
    }
}
