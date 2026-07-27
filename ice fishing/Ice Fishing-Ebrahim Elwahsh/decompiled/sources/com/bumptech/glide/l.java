package com.bumptech.glide;

import S0.s;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import s1.InterfaceC4989b;
import y1.C5246u;
import y1.C5247v;
import y1.InterfaceC5244s;
import y1.InterfaceC5245t;
import y1.x;
import y1.y;

/* loaded from: classes.dex */
public final class l {

    /* renamed from: a, reason: collision with root package name */
    public final C5247v f23562a;

    /* renamed from: b, reason: collision with root package name */
    public final I0.j f23563b;

    /* renamed from: c, reason: collision with root package name */
    public final S0.c f23564c;

    /* renamed from: d, reason: collision with root package name */
    public final I1.f f23565d;

    /* renamed from: e, reason: collision with root package name */
    public final com.bumptech.glide.load.data.g f23566e;

    /* renamed from: f, reason: collision with root package name */
    public final h4.c f23567f;

    /* renamed from: g, reason: collision with root package name */
    public final I1.b f23568g;

    /* renamed from: h, reason: collision with root package name */
    public final s f23569h = new s(2);
    public final I1.c i = new I1.c();

    /* renamed from: j, reason: collision with root package name */
    public final Y2.e f23570j;

    public l() {
        Y2.e eVar = new Y2.e(new N.d(20), new W3.e(6), new C3.e());
        this.f23570j = eVar;
        this.f23562a = new C5247v(eVar);
        this.f23563b = new I0.j(6);
        this.f23564c = new S0.c(3);
        this.f23565d = new I1.f(0);
        this.f23566e = new com.bumptech.glide.load.data.g();
        this.f23567f = new h4.c(4);
        this.f23568g = new I1.b(0);
        List asList = Arrays.asList("Animation", "Bitmap", "BitmapDrawable");
        ArrayList arrayList = new ArrayList(asList.size());
        arrayList.add("legacy_prepend_all");
        Iterator it = asList.iterator();
        while (it.hasNext()) {
            arrayList.add((String) it.next());
        }
        arrayList.add("legacy_append");
        S0.c cVar = this.f23564c;
        synchronized (cVar) {
            try {
                ArrayList arrayList2 = new ArrayList((ArrayList) cVar.f2886u);
                ((ArrayList) cVar.f2886u).clear();
                Iterator it2 = arrayList.iterator();
                while (it2.hasNext()) {
                    ((ArrayList) cVar.f2886u).add((String) it2.next());
                }
                Iterator it3 = arrayList2.iterator();
                while (it3.hasNext()) {
                    String str = (String) it3.next();
                    if (!arrayList.contains(str)) {
                        ((ArrayList) cVar.f2886u).add(str);
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void a(Class cls, Class cls2, InterfaceC5245t interfaceC5245t) {
        C5247v c5247v = this.f23562a;
        synchronized (c5247v) {
            y yVar = c5247v.f41861a;
            synchronized (yVar) {
                try {
                    x xVar = new x(cls, cls2, interfaceC5245t);
                    ArrayList arrayList = yVar.f41875a;
                    arrayList.add(arrayList.size(), xVar);
                } catch (Throwable th) {
                    throw th;
                }
            }
            c5247v.f41862b.f1313a.clear();
        }
    }

    public final void b(Class cls, InterfaceC4989b interfaceC4989b) {
        I0.j jVar = this.f23563b;
        synchronized (jVar) {
            ((ArrayList) jVar.f1233u).add(new I1.a(cls, interfaceC4989b));
        }
    }

    public final void c(Class cls, s1.k kVar) {
        I1.f fVar = this.f23565d;
        synchronized (fVar) {
            fVar.f1255a.add(new I1.e(cls, kVar));
        }
    }

    public final void d(String str, Class cls, Class cls2, s1.j jVar) {
        S0.c cVar = this.f23564c;
        synchronized (cVar) {
            cVar.w(str).add(new I1.d(cls, cls2, jVar));
        }
    }

    public final ArrayList e() {
        ArrayList arrayList;
        I1.b bVar = this.f23568g;
        synchronized (bVar) {
            arrayList = bVar.f1246n;
        }
        if (arrayList.isEmpty()) {
            throw new k("Failed to find image header parser.");
        }
        return arrayList;
    }

    public final List f(Object obj) {
        List list;
        C5247v c5247v = this.f23562a;
        c5247v.getClass();
        Class<?> cls = obj.getClass();
        synchronized (c5247v) {
            C5246u c5246u = (C5246u) c5247v.f41862b.f1313a.get(cls);
            list = c5246u == null ? null : c5246u.f41860a;
            if (list == null) {
                list = Collections.unmodifiableList(c5247v.f41861a.a(cls));
                if (((C5246u) c5247v.f41862b.f1313a.put(cls, new C5246u(list))) != null) {
                    throw new IllegalStateException("Already cached loaders for model: " + cls);
                }
            }
        }
        if (list.isEmpty()) {
            throw new k("Failed to find any ModelLoaders registered for model class: " + obj.getClass());
        }
        int size = list.size();
        List list2 = Collections.EMPTY_LIST;
        boolean z8 = true;
        for (int i = 0; i < size; i++) {
            InterfaceC5244s interfaceC5244s = (InterfaceC5244s) list.get(i);
            if (interfaceC5244s.a(obj)) {
                if (z8) {
                    list2 = new ArrayList(size - i);
                    z8 = false;
                }
                list2.add(interfaceC5244s);
            }
        }
        if (!list2.isEmpty()) {
            return list2;
        }
        throw new k("Found ModelLoaders for model class: " + list + ", but none that handle this specific model instance: " + obj);
    }

    public final com.bumptech.glide.load.data.f g(Object obj) {
        com.bumptech.glide.load.data.f b9;
        com.bumptech.glide.load.data.g gVar = this.f23566e;
        synchronized (gVar) {
            try {
                N1.g.b(obj);
                com.bumptech.glide.load.data.e eVar = (com.bumptech.glide.load.data.e) ((HashMap) gVar.f23580u).get(obj.getClass());
                if (eVar == null) {
                    Iterator it = ((HashMap) gVar.f23580u).values().iterator();
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
                    eVar = com.bumptech.glide.load.data.g.f23578v;
                }
                b9 = eVar.b(obj);
            } catch (Throwable th) {
                throw th;
            }
        }
        return b9;
    }

    public final void h(com.bumptech.glide.load.data.e eVar) {
        com.bumptech.glide.load.data.g gVar = this.f23566e;
        synchronized (gVar) {
            ((HashMap) gVar.f23580u).put(eVar.a(), eVar);
        }
    }

    public final void i(Class cls, Class cls2, G1.c cVar) {
        h4.c cVar2 = this.f23567f;
        synchronized (cVar2) {
            ((ArrayList) cVar2.f38233u).add(new G1.d(cls, cls2, cVar));
        }
    }
}
