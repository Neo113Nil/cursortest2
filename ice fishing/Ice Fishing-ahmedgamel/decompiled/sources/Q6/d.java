package Q6;

import N6.i;
import N6.j;
import N6.k;
import N6.o;
import N6.p;
import N6.s;
import N6.t;
import P6.n;
import java.util.Map;
import java.util.concurrent.atomic.AtomicInteger;
import p7.C4853a;

/* loaded from: classes2.dex */
public final class d implements p {

    /* renamed from: a, reason: collision with root package name */
    public static final d f2698a = new d();

    /* renamed from: b, reason: collision with root package name */
    public static final i f2699b;

    /* renamed from: c, reason: collision with root package name */
    public static final i f2700c;

    static {
        AtomicInteger atomicInteger = j.f2063n;
        f2699b = new i();
        f2700c = new i();
    }

    @Override // N6.p
    public final int a(Object obj, Object obj2, j jVar) {
        C4853a c4853a = (C4853a) obj;
        Map map = (Map) obj2;
        n d9 = n.d(c4853a);
        jVar.a(d9);
        int d10 = k.d(V6.b.f3418a, d9);
        N6.b bVar = V6.b.f3419b;
        a aVar = a.f2681a;
        i iVar = t.f2097a;
        int i = 0;
        if (!map.isEmpty()) {
            s sVar = (s) jVar.d(f2700c, new H5.a(7));
            sVar.f2093a = 0;
            sVar.f2094b = bVar.f2043c;
            sVar.f2095c = aVar;
            sVar.f2096d = jVar;
            map.forEach(sVar);
            i = sVar.f2093a;
        }
        return t.d(V6.b.f3420c, c4853a.f39848a, jVar) + i + d10;
    }

    @Override // N6.p
    public final void b(o oVar, Object obj, Object obj2, j jVar) {
        Map map = (Map) obj2;
        oVar.a(V6.b.f3418a, (n) jVar.c(n.class));
        oVar.m(V6.b.f3419b, map, a.f2681a, jVar, f2699b);
        oVar.p(V6.b.f3420c, ((C4853a) obj).f39848a, jVar);
    }
}
