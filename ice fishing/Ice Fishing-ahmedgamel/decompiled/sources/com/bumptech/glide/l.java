package com.bumptech.glide;

import A1.B;
import A1.D;
import A1.E;
import A1.x;
import A1.y;
import A1.z;
import i1.C4586c;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import u1.InterfaceC5063b;

/* loaded from: classes.dex */
public final class l {

    /* renamed from: a, reason: collision with root package name */
    public final B f24193a;

    /* renamed from: b, reason: collision with root package name */
    public final K1.b f24194b;

    /* renamed from: c, reason: collision with root package name */
    public final S0.e f24195c;

    /* renamed from: d, reason: collision with root package name */
    public final C4586c f24196d;

    /* renamed from: e, reason: collision with root package name */
    public final com.bumptech.glide.load.data.g f24197e;

    /* renamed from: f, reason: collision with root package name */
    public final I1.d f24198f;

    /* renamed from: g, reason: collision with root package name */
    public final K1.c f24199g;

    /* renamed from: h, reason: collision with root package name */
    public final S0.c f24200h = new S0.c(3);
    public final K1.d i = new K1.d();

    /* renamed from: j, reason: collision with root package name */
    public final b3.e f24201j;

    public l() {
        b3.e eVar = new b3.e(new N.d(20), new O2.i(8), new c4.e());
        this.f24201j = eVar;
        this.f24193a = new B(eVar);
        this.f24194b = new K1.b(0);
        this.f24195c = new S0.e(3);
        this.f24196d = new C4586c(6);
        this.f24197e = new com.bumptech.glide.load.data.g();
        this.f24198f = new I1.d(0);
        this.f24199g = new K1.c(0);
        List asList = Arrays.asList("Animation", "Bitmap", "BitmapDrawable");
        ArrayList arrayList = new ArrayList(asList.size());
        arrayList.add("legacy_prepend_all");
        Iterator it = asList.iterator();
        while (it.hasNext()) {
            arrayList.add((String) it.next());
        }
        arrayList.add("legacy_append");
        S0.e eVar2 = this.f24195c;
        synchronized (eVar2) {
            try {
                ArrayList arrayList2 = new ArrayList((ArrayList) eVar2.f2908u);
                ((ArrayList) eVar2.f2908u).clear();
                Iterator it2 = arrayList.iterator();
                while (it2.hasNext()) {
                    ((ArrayList) eVar2.f2908u).add((String) it2.next());
                }
                Iterator it3 = arrayList2.iterator();
                while (it3.hasNext()) {
                    String str = (String) it3.next();
                    if (!arrayList.contains(str)) {
                        ((ArrayList) eVar2.f2908u).add(str);
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void a(Class cls, Class cls2, y yVar) {
        B b9 = this.f24193a;
        synchronized (b9) {
            E e9 = b9.f12a;
            synchronized (e9) {
                try {
                    D d9 = new D(cls, cls2, yVar);
                    ArrayList arrayList = e9.f26a;
                    arrayList.add(arrayList.size(), d9);
                } catch (Throwable th) {
                    throw th;
                }
            }
            b9.f13b.f11a.clear();
        }
    }

    public final void b(Class cls, InterfaceC5063b interfaceC5063b) {
        K1.b bVar = this.f24194b;
        synchronized (bVar) {
            bVar.f1670a.add(new K1.a(cls, interfaceC5063b));
        }
    }

    public final void c(Class cls, u1.k kVar) {
        C4586c c4586c = this.f24196d;
        synchronized (c4586c) {
            ((ArrayList) c4586c.f38154u).add(new K1.f(cls, kVar));
        }
    }

    public final void d(String str, Class cls, Class cls2, u1.j jVar) {
        S0.e eVar = this.f24195c;
        synchronized (eVar) {
            eVar.z(str).add(new K1.e(cls, cls2, jVar));
        }
    }

    public final ArrayList e() {
        ArrayList arrayList;
        K1.c cVar = this.f24199g;
        synchronized (cVar) {
            arrayList = cVar.f1671a;
        }
        if (arrayList.isEmpty()) {
            throw new k("Failed to find image header parser.");
        }
        return arrayList;
    }

    public final List f(Object obj) {
        List list;
        B b9 = this.f24193a;
        b9.getClass();
        Class<?> cls = obj.getClass();
        synchronized (b9) {
            z zVar = (z) b9.f13b.f11a.get(cls);
            list = zVar == null ? null : zVar.f93a;
            if (list == null) {
                list = Collections.unmodifiableList(b9.f12a.b(cls));
                if (((z) b9.f13b.f11a.put(cls, new z(list))) != null) {
                    throw new IllegalStateException("Already cached loaders for model: " + cls);
                }
            }
        }
        if (list.isEmpty()) {
            throw new k("Failed to find any ModelLoaders registered for model class: " + obj.getClass());
        }
        int size = list.size();
        List list2 = Collections.EMPTY_LIST;
        boolean z6 = true;
        for (int i = 0; i < size; i++) {
            x xVar = (x) list.get(i);
            if (xVar.a(obj)) {
                if (z6) {
                    list2 = new ArrayList(size - i);
                    z6 = false;
                }
                list2.add(xVar);
            }
        }
        if (!list2.isEmpty()) {
            return list2;
        }
        throw new k("Found ModelLoaders for model class: " + list + ", but none that handle this specific model instance: " + obj);
    }

    public final com.bumptech.glide.load.data.f g(Object obj) {
        com.bumptech.glide.load.data.f b9;
        com.bumptech.glide.load.data.g gVar = this.f24197e;
        synchronized (gVar) {
            try {
                P1.g.b(obj);
                com.bumptech.glide.load.data.e eVar = (com.bumptech.glide.load.data.e) ((HashMap) gVar.f24211u).get(obj.getClass());
                if (eVar == null) {
                    Iterator it = ((HashMap) gVar.f24211u).values().iterator();
                    while (true) {
                        if (!it.hasNext()) {
                            break;
                        }
                        com.bumptech.glide.load.data.e eVar2 = (com.bumptech.glide.load.data.e) it.next();
                        if (eVar2.a().isAssignableFrom(obj.getClass())) {
                            eVar = eVar2;
                            break;
                        }
                    }
                }
                if (eVar == null) {
                    eVar = com.bumptech.glide.load.data.g.f24209v;
                }
                b9 = eVar.b(obj);
            } catch (Throwable th) {
                throw th;
            }
        }
        return b9;
    }

    public final void h(com.bumptech.glide.load.data.e eVar) {
        com.bumptech.glide.load.data.g gVar = this.f24197e;
        synchronized (gVar) {
            ((HashMap) gVar.f24211u).put(eVar.a(), eVar);
        }
    }

    public final void i(Class cls, Class cls2, I1.b bVar) {
        I1.d dVar = this.f24198f;
        synchronized (dVar) {
            dVar.f1308n.add(new I1.c(cls, cls2, bVar));
        }
    }
}
