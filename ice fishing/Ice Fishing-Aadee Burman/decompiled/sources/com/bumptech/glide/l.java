package com.bumptech.glide;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import s1.InterfaceC4967b;
import y1.C5225t;
import y1.C5226u;
import y1.C5228w;
import y1.InterfaceC5223r;
import y1.InterfaceC5224s;
import y1.x;

/* loaded from: classes.dex */
public final class l {

    /* renamed from: a, reason: collision with root package name */
    public final C5226u f23406a;

    /* renamed from: b, reason: collision with root package name */
    public final G1.e f23407b;

    /* renamed from: c, reason: collision with root package name */
    public final S0.l f23408c;

    /* renamed from: d, reason: collision with root package name */
    public final I1.f f23409d;

    /* renamed from: e, reason: collision with root package name */
    public final com.bumptech.glide.load.data.g f23410e;

    /* renamed from: f, reason: collision with root package name */
    public final G1.e f23411f;

    /* renamed from: g, reason: collision with root package name */
    public final I1.b f23412g;

    /* renamed from: h, reason: collision with root package name */
    public final S0.e f23413h = new S0.e(2);
    public final I1.c i = new I1.c();

    /* renamed from: j, reason: collision with root package name */
    public final Z2.e f23414j;

    public l() {
        Z2.e eVar = new Z2.e(new N.d(20), new E3.e(), new M2.i(7));
        this.f23414j = eVar;
        this.f23406a = new C5226u(eVar);
        this.f23407b = new G1.e(1);
        this.f23408c = new S0.l(2);
        this.f23409d = new I1.f(0);
        this.f23410e = new com.bumptech.glide.load.data.g();
        this.f23411f = new G1.e(0);
        this.f23412g = new I1.b(0);
        List asList = Arrays.asList("Animation", "Bitmap", "BitmapDrawable");
        ArrayList arrayList = new ArrayList(asList.size());
        arrayList.add("legacy_prepend_all");
        Iterator it = asList.iterator();
        while (it.hasNext()) {
            arrayList.add((String) it.next());
        }
        arrayList.add("legacy_append");
        S0.l lVar = this.f23408c;
        synchronized (lVar) {
            try {
                ArrayList arrayList2 = new ArrayList((ArrayList) lVar.f2797u);
                ((ArrayList) lVar.f2797u).clear();
                Iterator it2 = arrayList.iterator();
                while (it2.hasNext()) {
                    ((ArrayList) lVar.f2797u).add((String) it2.next());
                }
                Iterator it3 = arrayList2.iterator();
                while (it3.hasNext()) {
                    String str = (String) it3.next();
                    if (!arrayList.contains(str)) {
                        ((ArrayList) lVar.f2797u).add(str);
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void a(Class cls, Class cls2, InterfaceC5224s interfaceC5224s) {
        C5226u c5226u = this.f23406a;
        synchronized (c5226u) {
            x xVar = c5226u.f41821a;
            synchronized (xVar) {
                try {
                    C5228w c5228w = new C5228w(cls, cls2, interfaceC5224s);
                    ArrayList arrayList = xVar.f41835a;
                    arrayList.add(arrayList.size(), c5228w);
                } catch (Throwable th) {
                    throw th;
                }
            }
            ((HashMap) c5226u.f41822b.f40530n).clear();
        }
    }

    public final void b(Class cls, InterfaceC4967b interfaceC4967b) {
        G1.e eVar = this.f23407b;
        synchronized (eVar) {
            eVar.f1056a.add(new I1.a(cls, interfaceC4967b));
        }
    }

    public final void c(Class cls, s1.k kVar) {
        I1.f fVar = this.f23409d;
        synchronized (fVar) {
            fVar.f1286a.add(new I1.e(cls, kVar));
        }
    }

    public final void d(String str, Class cls, Class cls2, s1.j jVar) {
        S0.l lVar = this.f23408c;
        synchronized (lVar) {
            lVar.C(str).add(new I1.d(cls, cls2, jVar));
        }
    }

    public final ArrayList e() {
        ArrayList arrayList;
        I1.b bVar = this.f23412g;
        synchronized (bVar) {
            arrayList = bVar.f1277a;
        }
        if (arrayList.isEmpty()) {
            throw new k("Failed to find image header parser.");
        }
        return arrayList;
    }

    public final List f(Object obj) {
        List list;
        C5226u c5226u = this.f23406a;
        c5226u.getClass();
        Class<?> cls = obj.getClass();
        synchronized (c5226u) {
            C5225t c5225t = (C5225t) ((HashMap) c5226u.f41822b.f40530n).get(cls);
            list = c5225t == null ? null : c5225t.f41820a;
            if (list == null) {
                list = Collections.unmodifiableList(c5226u.f41821a.a(cls));
                if (((C5225t) ((HashMap) c5226u.f41822b.f40530n).put(cls, new C5225t(list))) != null) {
                    throw new IllegalStateException("Already cached loaders for model: " + cls);
                }
            }
        }
        if (list.isEmpty()) {
            throw new k("Failed to find any ModelLoaders registered for model class: " + obj.getClass());
        }
        int size = list.size();
        List list2 = Collections.EMPTY_LIST;
        boolean z3 = true;
        for (int i = 0; i < size; i++) {
            InterfaceC5223r interfaceC5223r = (InterfaceC5223r) list.get(i);
            if (interfaceC5223r.a(obj)) {
                if (z3) {
                    list2 = new ArrayList(size - i);
                    z3 = false;
                }
                list2.add(interfaceC5223r);
            }
        }
        if (!list2.isEmpty()) {
            return list2;
        }
        throw new k("Found ModelLoaders for model class: " + list + ", but none that handle this specific model instance: " + obj);
    }

    public final com.bumptech.glide.load.data.f g(Object obj) {
        com.bumptech.glide.load.data.f b9;
        com.bumptech.glide.load.data.g gVar = this.f23410e;
        synchronized (gVar) {
            try {
                N1.g.b(obj);
                com.bumptech.glide.load.data.e eVar = (com.bumptech.glide.load.data.e) ((HashMap) gVar.f23424u).get(obj.getClass());
                if (eVar == null) {
                    Iterator it = ((HashMap) gVar.f23424u).values().iterator();
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
                    eVar = com.bumptech.glide.load.data.g.f23422v;
                }
                b9 = eVar.b(obj);
            } catch (Throwable th) {
                throw th;
            }
        }
        return b9;
    }

    public final void h(com.bumptech.glide.load.data.e eVar) {
        com.bumptech.glide.load.data.g gVar = this.f23410e;
        synchronized (gVar) {
            ((HashMap) gVar.f23424u).put(eVar.a(), eVar);
        }
    }

    public final void i(Class cls, Class cls2, G1.c cVar) {
        G1.e eVar = this.f23411f;
        synchronized (eVar) {
            eVar.f1056a.add(new G1.d(cls, cls2, cVar));
        }
    }
}
