package Q6;

import N6.f;
import N6.i;
import N6.j;
import N6.o;
import N6.r;
import N6.s;
import N6.t;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Map;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.function.Consumer;

/* loaded from: classes2.dex */
public final class c extends f {

    /* renamed from: d, reason: collision with root package name */
    public static final i f2693d;

    /* renamed from: e, reason: collision with root package name */
    public static final i f2694e;

    /* renamed from: a, reason: collision with root package name */
    public final j f2695a = new j();

    /* renamed from: b, reason: collision with root package name */
    public Map f2696b;

    /* renamed from: c, reason: collision with root package name */
    public int f2697c;

    static {
        AtomicInteger atomicInteger = j.f2063n;
        f2693d = new i();
        f2694e = new i();
    }

    @Override // N6.f
    public final int a() {
        return this.f2697c;
    }

    @Override // N6.f
    public final void c(o oVar) {
        j jVar = this.f2695a;
        jVar.f2067d = 0;
        jVar.f2070g = 0;
        oVar.m(T6.a.f3209a, this.f2696b, d.f2698a, jVar, f2694e);
    }

    public final void d(Collection collection) {
        Map map;
        boolean isEmpty = collection.isEmpty();
        j jVar = this.f2695a;
        if (isEmpty) {
            map = Collections.EMPTY_MAP;
        } else {
            K6.b bVar = new K6.b(11);
            K6.b bVar2 = new K6.b(12);
            i iVar = t.f2097a;
            Map map2 = (Map) jVar.f2073k.a();
            r rVar = (r) jVar.d(t.f2097a, new H5.a(9));
            rVar.f2089a = map2;
            rVar.f2090b = bVar;
            rVar.f2091c = bVar2;
            rVar.f2092d = jVar;
            collection.forEach(rVar);
            map = map2;
        }
        this.f2696b = map;
        N6.b bVar3 = T6.a.f3209a;
        d dVar = d.f2698a;
        i iVar2 = t.f2097a;
        int i = 0;
        if (!map.isEmpty()) {
            s sVar = (s) jVar.d(f2693d, new H5.a(7));
            sVar.f2093a = 0;
            sVar.f2094b = bVar3.f2043c;
            sVar.f2095c = dVar;
            sVar.f2096d = jVar;
            map.forEach(sVar);
            i = sVar.f2093a;
        }
        this.f2697c = i;
    }

    public final void e() {
        N2.o oVar;
        j jVar = this.f2695a;
        jVar.f2067d = 0;
        jVar.f2068e = 0;
        for (int i = 0; i < jVar.f2071h; i++) {
            jVar.f2069f[i] = null;
        }
        jVar.f2070g = 0;
        jVar.f2071h = 0;
        jVar.i.f2058a = 0;
        jVar.f2072j.f2058a = 0;
        int i4 = 0;
        while (true) {
            oVar = jVar.f2073k;
            if (i4 >= oVar.f1949a) {
                break;
            }
            ((Consumer) oVar.f1952d).accept(((ArrayList) oVar.f1950b).get(i4));
            i4++;
        }
        oVar.f1949a = 0;
        int i6 = 0;
        while (true) {
            N2.o oVar2 = jVar.f2074l;
            if (i6 >= oVar2.f1949a) {
                oVar2.f1949a = 0;
                return;
            } else {
                ((Consumer) oVar2.f1952d).accept(((ArrayList) oVar2.f1950b).get(i6));
                i6++;
            }
        }
    }
}
