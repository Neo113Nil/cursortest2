package Q6;

import N6.j;
import N6.n;
import N6.o;
import N6.p;
import N6.q;
import N6.s;
import N6.t;
import P6.i;
import P6.k;
import c7.InterfaceC0556a;
import d7.InterfaceC4465a;
import java.io.UncheckedIOException;
import java.util.List;
import k6.C4647a;
import n6.InterfaceC4782h;

/* loaded from: classes2.dex */
public final class a implements p, q {

    /* renamed from: a, reason: collision with root package name */
    public static final a f2681a = new a();

    /* renamed from: b, reason: collision with root package name */
    public static final a f2682b = new a();

    @Override // N6.p
    public int a(Object obj, Object obj2, j jVar) {
        Y6.a aVar = (Y6.a) obj;
        k d9 = k.d(aVar);
        jVar.a(d9);
        return t.d(V6.c.f3423c, aVar.f3912c, jVar) + t.c(V6.c.f3422b, (List) obj2, f2682b, jVar) + N6.k.d(V6.c.f3421a, d9);
    }

    @Override // N6.p
    public void b(o oVar, Object obj, Object obj2, j jVar) {
        oVar.a(V6.c.f3421a, (k) jVar.c(k.class));
        oVar.l(V6.c.f3422b, (List) obj2, f2682b, jVar);
        oVar.p(V6.c.f3423c, ((Y6.a) obj).f3912c, jVar);
    }

    @Override // N6.q
    public void c(o oVar, Object obj, j jVar) {
        int e9;
        int size;
        InterfaceC0556a interfaceC0556a = (InterfaceC0556a) obj;
        N6.b bVar = V6.a.f3408a;
        long j6 = interfaceC0556a.j();
        if (j6 != 0) {
            oVar.F(bVar, j6);
        }
        N6.b bVar2 = V6.a.f3409b;
        long d9 = interfaceC0556a.d();
        if (d9 != 0) {
            oVar.F(bVar2, d9);
        }
        N6.b bVar3 = V6.a.f3410c;
        N6.a d10 = b.d(interfaceC0556a.b());
        if (d10.f2039a != 0) {
            oVar.D(bVar3, d10);
        }
        oVar.p(V6.a.f3411d, interfaceC0556a.i(), jVar);
        if (interfaceC0556a.c() != null) {
            oVar.b(V6.a.f3412e, interfaceC0556a.c(), jVar);
        }
        if (interfaceC0556a instanceof InterfaceC4465a) {
            i.e(oVar, V6.a.f3413f, i.d(interfaceC0556a), jVar);
            e9 = interfaceC0556a.e();
            size = i.d(interfaceC0556a).size();
        } else {
            N6.b bVar4 = V6.a.f3413f;
            f6.c a9 = interfaceC0556a.a();
            P6.a aVar = P6.a.f2398e;
            oVar.V(bVar4);
            if (!a9.isEmpty()) {
                n nVar = (n) jVar.d(o.f2088n, new H5.a(6));
                nVar.f2084a = bVar4;
                nVar.f2085b = oVar;
                nVar.f2086c = aVar;
                nVar.f2087d = jVar;
                try {
                    a9.forEach(nVar);
                } catch (UncheckedIOException e10) {
                    throw e10.getCause();
                }
            }
            oVar.B();
            e9 = interfaceC0556a.e();
            size = interfaceC0556a.a().size();
        }
        int i = e9 - size;
        N6.b bVar5 = V6.a.f3414g;
        if (i != 0) {
            oVar.b0(bVar5, i);
        }
        InterfaceC4782h h3 = interfaceC0556a.h();
        N6.b bVar6 = V6.a.f3415h;
        C4647a c4647a = (C4647a) h3;
        byte b9 = c4647a.f38604c.f39665b;
        if (b9 != 0) {
            oVar.E(bVar6, b9);
        }
        String str = c4647a.f38602a;
        if (!str.equals("00000000000000000000000000000000")) {
            oVar.a0(V6.a.i, str, jVar);
        }
        String str2 = c4647a.f38603b;
        if (!str2.equals("0000000000000000")) {
            oVar.J(V6.a.f3416j, str2, jVar);
        }
        oVar.p(V6.a.f3417k, interfaceC0556a.f(), jVar);
    }

    @Override // N6.q
    public int d(Object obj, j jVar) {
        int i;
        int i4;
        int i6;
        int b9;
        int i9;
        int b10;
        InterfaceC0556a interfaceC0556a = (InterfaceC0556a) obj;
        int c9 = N6.k.c(V6.a.f3409b, interfaceC0556a.d()) + N6.k.c(V6.a.f3408a, interfaceC0556a.j());
        N6.b bVar = V6.a.f3410c;
        int i10 = b.d(interfaceC0556a.b()).f2039a;
        int i11 = 0;
        if (i10 == 0) {
            i4 = 0;
        } else {
            int i12 = bVar.f2043c;
            if (i10 >= 0) {
                i = N6.d.b(i10);
            } else {
                int i13 = N6.d.f2049e;
                i = 10;
            }
            i4 = i12 + i;
        }
        int d9 = t.d(V6.a.f3411d, interfaceC0556a.i(), jVar) + i4 + c9;
        if (interfaceC0556a.c() != null) {
            d9 += t.a(V6.a.f3412e, interfaceC0556a.c(), jVar);
        }
        if (interfaceC0556a instanceof InterfaceC4465a) {
            int f2 = i.f(V6.a.f3413f, i.d(interfaceC0556a), jVar) + d9;
            int e9 = interfaceC0556a.e() - i.d(interfaceC0556a).size();
            N6.b bVar2 = V6.a.f3414g;
            if (e9 == 0) {
                b10 = 0;
            } else {
                b10 = N6.d.b(e9) + bVar2.f2043c;
            }
            i9 = b10 + f2;
        } else {
            N6.b bVar3 = V6.a.f3413f;
            f6.c a9 = interfaceC0556a.a();
            P6.a aVar = P6.a.f2398e;
            if (a9.isEmpty()) {
                i6 = 0;
            } else {
                s sVar = (s) jVar.d(t.f2098b, new H5.a(8));
                sVar.f2093a = 0;
                sVar.f2094b = bVar3.f2043c;
                sVar.f2095c = aVar;
                sVar.f2096d = jVar;
                a9.forEach(sVar);
                i6 = sVar.f2093a;
            }
            int i14 = d9 + i6;
            int e10 = interfaceC0556a.e() - interfaceC0556a.a().size();
            N6.b bVar4 = V6.a.f3414g;
            if (e10 == 0) {
                b9 = 0;
            } else {
                b9 = N6.d.b(e10) + bVar4.f2043c;
            }
            i9 = i14 + b9;
        }
        InterfaceC4782h h3 = interfaceC0556a.h();
        N6.b bVar5 = V6.a.f3415h;
        C4647a c4647a = (C4647a) h3;
        if (c4647a.f38604c.f39665b != 0) {
            int i15 = bVar5.f2043c;
            int i16 = N6.d.f2049e;
            i11 = i15 + 4;
        }
        int i17 = i11 + i9;
        if (!c4647a.f38602a.equals("00000000000000000000000000000000")) {
            i17 += V6.a.i.f2043c + N6.k.f2076a;
        }
        if (!c4647a.f38603b.equals("0000000000000000")) {
            i17 += V6.a.f3416j.f2043c + N6.k.f2077b;
        }
        return t.d(V6.a.f3417k, interfaceC0556a.f(), jVar) + i17;
    }
}
