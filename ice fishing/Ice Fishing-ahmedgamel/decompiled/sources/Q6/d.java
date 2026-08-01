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
    public static final d f2661a = new d();

    /* renamed from: b, reason: collision with root package name */
    public static final i f2662b;

    /* renamed from: c, reason: collision with root package name */
    public static final i f2663c;

    static {
        AtomicInteger atomicInteger = j.f1975n;
        f2662b = new i();
        f2663c = new i();
    }

    @Override // N6.p
    public final int a(Object obj, Object obj2, j jVar) {
        C4853a c4853a = (C4853a) obj;
        Map map = (Map) obj2;
        n d2 = n.d(c4853a);
        jVar.a(d2);
        int d9 = k.d(V6.b.f3288a, d2);
        N6.b bVar = V6.b.f3289b;
        a aVar = a.f2644a;
        i iVar = t.f2009a;
        int i = 0;
        if (!map.isEmpty()) {
            s sVar = (s) jVar.d(f2663c, new H5.a(7));
            sVar.f2005a = 0;
            sVar.f2006b = bVar.f1955c;
            sVar.f2007c = aVar;
            sVar.f2008d = jVar;
            map.forEach(sVar);
            i = sVar.f2005a;
        }
        return t.d(V6.b.f3290c, c4853a.f39801a, jVar) + i + d9;
    }

    @Override // N6.p
    public final void b(o oVar, Object obj, Object obj2, j jVar) {
        Map map = (Map) obj2;
        oVar.a(V6.b.f3288a, (n) jVar.c(n.class));
        oVar.m(V6.b.f3289b, map, a.f2644a, jVar, f2662b);
        oVar.p(V6.b.f3290c, ((C4853a) obj).f39801a, jVar);
    }
}
