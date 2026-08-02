package w1;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import u1.InterfaceC5063b;
import u1.InterfaceC5066e;

/* loaded from: classes.dex */
public final class g {

    /* renamed from: a, reason: collision with root package name */
    public final ArrayList f41442a = new ArrayList();

    /* renamed from: b, reason: collision with root package name */
    public final ArrayList f41443b = new ArrayList();

    /* renamed from: c, reason: collision with root package name */
    public com.bumptech.glide.i f41444c;

    /* renamed from: d, reason: collision with root package name */
    public Object f41445d;

    /* renamed from: e, reason: collision with root package name */
    public int f41446e;

    /* renamed from: f, reason: collision with root package name */
    public int f41447f;

    /* renamed from: g, reason: collision with root package name */
    public Class f41448g;

    /* renamed from: h, reason: collision with root package name */
    public P1.h f41449h;
    public u1.h i;

    /* renamed from: j, reason: collision with root package name */
    public P1.c f41450j;

    /* renamed from: k, reason: collision with root package name */
    public Class f41451k;

    /* renamed from: l, reason: collision with root package name */
    public boolean f41452l;

    /* renamed from: m, reason: collision with root package name */
    public boolean f41453m;

    /* renamed from: n, reason: collision with root package name */
    public InterfaceC5066e f41454n;

    /* renamed from: o, reason: collision with root package name */
    public com.bumptech.glide.j f41455o;

    /* renamed from: p, reason: collision with root package name */
    public j f41456p;

    /* renamed from: q, reason: collision with root package name */
    public boolean f41457q;

    /* renamed from: r, reason: collision with root package name */
    public boolean f41458r;

    public final ArrayList a() {
        boolean z6 = this.f41453m;
        ArrayList arrayList = this.f41443b;
        if (!z6) {
            this.f41453m = true;
            arrayList.clear();
            ArrayList b9 = b();
            int size = b9.size();
            for (int i = 0; i < size; i++) {
                A1.w wVar = (A1.w) b9.get(i);
                if (!arrayList.contains(wVar.f90a)) {
                    arrayList.add(wVar.f90a);
                }
                int i4 = 0;
                while (true) {
                    List list = wVar.f91b;
                    if (i4 < list.size()) {
                        if (!arrayList.contains(list.get(i4))) {
                            arrayList.add((InterfaceC5066e) list.get(i4));
                        }
                        i4++;
                    }
                }
            }
        }
        return arrayList;
    }

    public final ArrayList b() {
        boolean z6 = this.f41452l;
        ArrayList arrayList = this.f41442a;
        if (!z6) {
            this.f41452l = true;
            arrayList.clear();
            List f2 = this.f41444c.a().f(this.f41445d);
            int size = f2.size();
            for (int i = 0; i < size; i++) {
                A1.w b9 = ((A1.x) f2.get(i)).b(this.f41445d, this.f41446e, this.f41447f, this.i);
                if (b9 != null) {
                    arrayList.add(b9);
                }
            }
        }
        return arrayList;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final u c(Class cls) {
        u uVar;
        Class cls2;
        Class cls3;
        Class cls4;
        u uVar2;
        ArrayList arrayList;
        I1.b bVar;
        Class cls5 = cls;
        com.bumptech.glide.l a9 = this.f41444c.a();
        Class cls6 = this.f41448g;
        Class cls7 = this.f41451k;
        K1.d dVar = a9.i;
        P1.n nVar = (P1.n) dVar.f1674b.getAndSet(null);
        if (nVar == null) {
            nVar = new P1.n();
        }
        nVar.f2372a = cls5;
        nVar.f2373b = cls6;
        nVar.f2374c = cls7;
        synchronized (dVar.f1673a) {
            uVar = (u) dVar.f1673a.getOrDefault(nVar, null);
        }
        dVar.f1674b.set(nVar);
        a9.i.getClass();
        if (K1.d.f1672c.equals(uVar)) {
            return null;
        }
        if (uVar != null) {
            return uVar;
        }
        ArrayList arrayList2 = new ArrayList();
        Iterator it = a9.f24195c.A(cls5, cls6).iterator();
        while (it.hasNext()) {
            Class<?> cls8 = (Class) it.next();
            Iterator it2 = a9.f24198f.f(cls8, cls7).iterator();
            while (it2.hasNext()) {
                Class cls9 = (Class) it2.next();
                S0.e eVar = a9.f24195c;
                synchronized (eVar) {
                    arrayList = new ArrayList();
                    Iterator it3 = ((ArrayList) eVar.f2908u).iterator();
                    while (it3.hasNext()) {
                        List<K1.e> list = (List) ((HashMap) eVar.f2909v).get((String) it3.next());
                        if (list != null) {
                            for (K1.e eVar2 : list) {
                                if (eVar2.f1675a.isAssignableFrom(cls5) && cls8.isAssignableFrom(eVar2.f1676b)) {
                                    arrayList.add(eVar2.f1677c);
                                }
                            }
                        }
                    }
                }
                I1.d dVar2 = a9.f24198f;
                synchronized (dVar2) {
                    if (!cls9.isAssignableFrom(cls8)) {
                        Iterator it4 = dVar2.f1308n.iterator();
                        while (it4.hasNext()) {
                            I1.c cVar = (I1.c) it4.next();
                            if (cVar.f1305a.isAssignableFrom(cls8) && cls9.isAssignableFrom(cVar.f1306b)) {
                                bVar = cVar.f1307c;
                            } else {
                                cls5 = cls;
                            }
                        }
                        throw new IllegalArgumentException("No transcoder registered to transcode from " + cls8 + " to " + cls9);
                    }
                    bVar = I1.e.f1309u;
                }
                arrayList2.add(new i(cls5, cls8, cls9, arrayList, bVar, a9.f24201j));
                cls5 = cls;
            }
            cls5 = cls;
        }
        if (arrayList2.isEmpty()) {
            cls2 = cls;
            cls3 = cls6;
            cls4 = cls7;
            uVar2 = null;
        } else {
            cls2 = cls;
            cls3 = cls6;
            cls4 = cls7;
            uVar2 = new u(cls2, cls3, cls4, arrayList2, a9.f24201j);
        }
        K1.d dVar3 = a9.i;
        synchronized (dVar3.f1673a) {
            dVar3.f1673a.put(new P1.n(cls2, cls3, cls4), uVar2 != null ? uVar2 : K1.d.f1672c);
        }
        return uVar2;
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0027, code lost:
    
        r1 = r3.f1669b;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final InterfaceC5063b d(Object obj) {
        InterfaceC5063b interfaceC5063b;
        K1.b bVar = this.f41444c.a().f24194b;
        Class<?> cls = obj.getClass();
        synchronized (bVar) {
            Iterator it = bVar.f1670a.iterator();
            while (true) {
                if (!it.hasNext()) {
                    interfaceC5063b = null;
                    break;
                }
                K1.a aVar = (K1.a) it.next();
                if (aVar.f1668a.isAssignableFrom(cls)) {
                    break;
                }
            }
        }
        if (interfaceC5063b != null) {
            return interfaceC5063b;
        }
        throw new com.bumptech.glide.k("Failed to find source encoder for data class: " + obj.getClass());
    }

    public final u1.l e(Class cls) {
        u1.l lVar = (u1.l) this.f41450j.getOrDefault(cls, null);
        if (lVar == null) {
            Iterator it = ((s.g) this.f41450j.entrySet()).iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                Map.Entry entry = (Map.Entry) it.next();
                if (((Class) entry.getKey()).isAssignableFrom(cls)) {
                    lVar = (u1.l) entry.getValue();
                    break;
                }
            }
        }
        if (lVar != null) {
            return lVar;
        }
        if (!this.f41450j.isEmpty() || !this.f41457q) {
            return C1.e.f317b;
        }
        throw new IllegalArgumentException("Missing transformation for " + cls + ". If you wish to ignore unknown resource types, use the optional transformation methods.");
    }
}
