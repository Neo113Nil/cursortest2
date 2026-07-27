package Q6;

import L2.n;
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
    public static final i f2656d;

    /* renamed from: e, reason: collision with root package name */
    public static final i f2657e;

    /* renamed from: a, reason: collision with root package name */
    public final j f2658a = new j();

    /* renamed from: b, reason: collision with root package name */
    public Map f2659b;

    /* renamed from: c, reason: collision with root package name */
    public int f2660c;

    static {
        AtomicInteger atomicInteger = j.f1975n;
        f2656d = new i();
        f2657e = new i();
    }

    @Override // N6.f
    public final int a() {
        return this.f2660c;
    }

    @Override // N6.f
    public final void c(o oVar) {
        j jVar = this.f2658a;
        jVar.f1979d = 0;
        jVar.f1982g = 0;
        oVar.m(T6.a.f3092a, this.f2659b, d.f2661a, jVar, f2657e);
    }

    public final void d(Collection collection) {
        Map map;
        boolean isEmpty = collection.isEmpty();
        j jVar = this.f2658a;
        if (isEmpty) {
            map = Collections.EMPTY_MAP;
        } else {
            K6.b bVar = new K6.b(11);
            K6.b bVar2 = new K6.b(12);
            i iVar = t.f2009a;
            Map map2 = (Map) jVar.f1985k.a();
            r rVar = (r) jVar.d(t.f2009a, new H5.a(9));
            rVar.f2001a = map2;
            rVar.f2002b = bVar;
            rVar.f2003c = bVar2;
            rVar.f2004d = jVar;
            collection.forEach(rVar);
            map = map2;
        }
        this.f2659b = map;
        N6.b bVar3 = T6.a.f3092a;
        d dVar = d.f2661a;
        i iVar2 = t.f2009a;
        int i = 0;
        if (!map.isEmpty()) {
            s sVar = (s) jVar.d(f2656d, new H5.a(7));
            sVar.f2005a = 0;
            sVar.f2006b = bVar3.f1955c;
            sVar.f2007c = dVar;
            sVar.f2008d = jVar;
            map.forEach(sVar);
            i = sVar.f2005a;
        }
        this.f2660c = i;
    }

    public final void e() {
        n nVar;
        j jVar = this.f2658a;
        jVar.f1979d = 0;
        jVar.f1980e = 0;
        for (int i = 0; i < jVar.f1983h; i++) {
            jVar.f1981f[i] = null;
        }
        jVar.f1982g = 0;
        jVar.f1983h = 0;
        jVar.i.f1970a = 0;
        jVar.f1984j.f1970a = 0;
        int i6 = 0;
        while (true) {
            nVar = jVar.f1985k;
            if (i6 >= nVar.f1659a) {
                break;
            }
            ((Consumer) nVar.f1662d).accept(((ArrayList) nVar.f1660b).get(i6));
            i6++;
        }
        nVar.f1659a = 0;
        int i9 = 0;
        while (true) {
            n nVar2 = jVar.f1986l;
            if (i9 >= nVar2.f1659a) {
                nVar2.f1659a = 0;
                return;
            } else {
                ((Consumer) nVar2.f1662d).accept(((ArrayList) nVar2.f1660b).get(i9));
                i9++;
            }
        }
    }
}
