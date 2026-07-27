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
import c7.InterfaceC0545a;
import d7.InterfaceC4454a;
import java.io.UncheckedIOException;
import java.util.List;
import k6.C4636a;
import n6.InterfaceC4766h;

/* loaded from: classes2.dex */
public final class a implements p, q {

    /* renamed from: a, reason: collision with root package name */
    public static final a f2644a = new a();

    /* renamed from: b, reason: collision with root package name */
    public static final a f2645b = new a();

    @Override // N6.p
    public int a(Object obj, Object obj2, j jVar) {
        Y6.a aVar = (Y6.a) obj;
        k d2 = k.d(aVar);
        jVar.a(d2);
        return t.d(V6.c.f3293c, aVar.f3968c, jVar) + t.c(V6.c.f3292b, (List) obj2, f2645b, jVar) + N6.k.d(V6.c.f3291a, d2);
    }

    @Override // N6.p
    public void b(o oVar, Object obj, Object obj2, j jVar) {
        oVar.a(V6.c.f3291a, (k) jVar.c(k.class));
        oVar.l(V6.c.f3292b, (List) obj2, f2645b, jVar);
        oVar.p(V6.c.f3293c, ((Y6.a) obj).f3968c, jVar);
    }

    @Override // N6.q
    public void c(o oVar, Object obj, j jVar) {
        int e9;
        int size;
        InterfaceC0545a interfaceC0545a = (InterfaceC0545a) obj;
        N6.b bVar = V6.a.f3278a;
        long j6 = interfaceC0545a.j();
        if (j6 != 0) {
            oVar.F(bVar, j6);
        }
        N6.b bVar2 = V6.a.f3279b;
        long d2 = interfaceC0545a.d();
        if (d2 != 0) {
            oVar.F(bVar2, d2);
        }
        N6.b bVar3 = V6.a.f3280c;
        N6.a d9 = b.d(interfaceC0545a.b());
        if (d9.f1951a != 0) {
            oVar.D(bVar3, d9);
        }
        oVar.p(V6.a.f3281d, interfaceC0545a.i(), jVar);
        if (interfaceC0545a.c() != null) {
            oVar.b(V6.a.f3282e, interfaceC0545a.c(), jVar);
        }
        if (interfaceC0545a instanceof InterfaceC4454a) {
            i.e(oVar, V6.a.f3283f, i.d(interfaceC0545a), jVar);
            e9 = interfaceC0545a.e();
            size = i.d(interfaceC0545a).size();
        } else {
            N6.b bVar4 = V6.a.f3283f;
            f6.c a9 = interfaceC0545a.a();
            P6.a aVar = P6.a.f2563e;
            oVar.V(bVar4);
            if (!a9.isEmpty()) {
                n nVar = (n) jVar.d(o.f2000n, new H5.a(6));
                nVar.f1996a = bVar4;
                nVar.f1997b = oVar;
                nVar.f1998c = aVar;
                nVar.f1999d = jVar;
                try {
                    a9.forEach(nVar);
                } catch (UncheckedIOException e10) {
                    throw e10.getCause();
                }
            }
            oVar.B();
            e9 = interfaceC0545a.e();
            size = interfaceC0545a.a().size();
        }
        int i = e9 - size;
        N6.b bVar5 = V6.a.f3284g;
        if (i != 0) {
            oVar.b0(bVar5, i);
        }
        InterfaceC4766h h9 = interfaceC0545a.h();
        N6.b bVar6 = V6.a.f3285h;
        C4636a c4636a = (C4636a) h9;
        byte b9 = c4636a.f38677c.f39498b;
        if (b9 != 0) {
            oVar.E(bVar6, b9);
        }
        String str = c4636a.f38675a;
        if (!str.equals("00000000000000000000000000000000")) {
            oVar.a0(V6.a.i, str, jVar);
        }
        String str2 = c4636a.f38676b;
        if (!str2.equals("0000000000000000")) {
            oVar.J(V6.a.f3286j, str2, jVar);
        }
        oVar.p(V6.a.f3287k, interfaceC0545a.f(), jVar);
    }

    @Override // N6.q
    public int d(Object obj, j jVar) {
        int i;
        int i6;
        int i9;
        int b9;
        int i10;
        int b10;
        InterfaceC0545a interfaceC0545a = (InterfaceC0545a) obj;
        int c9 = N6.k.c(V6.a.f3279b, interfaceC0545a.d()) + N6.k.c(V6.a.f3278a, interfaceC0545a.j());
        N6.b bVar = V6.a.f3280c;
        int i11 = b.d(interfaceC0545a.b()).f1951a;
        int i12 = 0;
        if (i11 == 0) {
            i6 = 0;
        } else {
            int i13 = bVar.f1955c;
            if (i11 >= 0) {
                i = N6.d.b(i11);
            } else {
                int i14 = N6.d.f1961e;
                i = 10;
            }
            i6 = i13 + i;
        }
        int d2 = t.d(V6.a.f3281d, interfaceC0545a.i(), jVar) + i6 + c9;
        if (interfaceC0545a.c() != null) {
            d2 += t.a(V6.a.f3282e, interfaceC0545a.c(), jVar);
        }
        if (interfaceC0545a instanceof InterfaceC4454a) {
            int f3 = i.f(V6.a.f3283f, i.d(interfaceC0545a), jVar) + d2;
            int e9 = interfaceC0545a.e() - i.d(interfaceC0545a).size();
            N6.b bVar2 = V6.a.f3284g;
            if (e9 == 0) {
                b10 = 0;
            } else {
                b10 = N6.d.b(e9) + bVar2.f1955c;
            }
            i10 = b10 + f3;
        } else {
            N6.b bVar3 = V6.a.f3283f;
            f6.c a9 = interfaceC0545a.a();
            P6.a aVar = P6.a.f2563e;
            if (a9.isEmpty()) {
                i9 = 0;
            } else {
                s sVar = (s) jVar.d(t.f2010b, new H5.a(8));
                sVar.f2005a = 0;
                sVar.f2006b = bVar3.f1955c;
                sVar.f2007c = aVar;
                sVar.f2008d = jVar;
                a9.forEach(sVar);
                i9 = sVar.f2005a;
            }
            int i15 = d2 + i9;
            int e10 = interfaceC0545a.e() - interfaceC0545a.a().size();
            N6.b bVar4 = V6.a.f3284g;
            if (e10 == 0) {
                b9 = 0;
            } else {
                b9 = N6.d.b(e10) + bVar4.f1955c;
            }
            i10 = i15 + b9;
        }
        InterfaceC4766h h9 = interfaceC0545a.h();
        N6.b bVar5 = V6.a.f3285h;
        C4636a c4636a = (C4636a) h9;
        if (c4636a.f38677c.f39498b != 0) {
            int i16 = bVar5.f1955c;
            int i17 = N6.d.f1961e;
            i12 = i16 + 4;
        }
        int i18 = i12 + i10;
        if (!c4636a.f38675a.equals("00000000000000000000000000000000")) {
            i18 += V6.a.i.f1955c + N6.k.f1988a;
        }
        if (!c4636a.f38676b.equals("0000000000000000")) {
            i18 += V6.a.f3286j.f1955c + N6.k.f1989b;
        }
        return t.d(V6.a.f3287k, interfaceC0545a.f(), jVar) + i18;
    }
}
