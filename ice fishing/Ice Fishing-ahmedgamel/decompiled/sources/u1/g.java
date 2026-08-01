package u1;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import s1.InterfaceC4967b;
import s1.InterfaceC4970e;
import y1.C5222q;
import y1.InterfaceC5223r;

/* loaded from: classes.dex */
public final class g {

    /* renamed from: a, reason: collision with root package name */
    public final ArrayList f41059a = new ArrayList();

    /* renamed from: b, reason: collision with root package name */
    public final ArrayList f41060b = new ArrayList();

    /* renamed from: c, reason: collision with root package name */
    public com.bumptech.glide.i f41061c;

    /* renamed from: d, reason: collision with root package name */
    public Object f41062d;

    /* renamed from: e, reason: collision with root package name */
    public int f41063e;

    /* renamed from: f, reason: collision with root package name */
    public int f41064f;

    /* renamed from: g, reason: collision with root package name */
    public Class f41065g;

    /* renamed from: h, reason: collision with root package name */
    public N1.h f41066h;
    public s1.h i;

    /* renamed from: j, reason: collision with root package name */
    public N1.c f41067j;

    /* renamed from: k, reason: collision with root package name */
    public Class f41068k;

    /* renamed from: l, reason: collision with root package name */
    public boolean f41069l;

    /* renamed from: m, reason: collision with root package name */
    public boolean f41070m;

    /* renamed from: n, reason: collision with root package name */
    public InterfaceC4970e f41071n;

    /* renamed from: o, reason: collision with root package name */
    public com.bumptech.glide.j f41072o;

    /* renamed from: p, reason: collision with root package name */
    public k f41073p;

    /* renamed from: q, reason: collision with root package name */
    public boolean f41074q;

    /* renamed from: r, reason: collision with root package name */
    public boolean f41075r;

    public final ArrayList a() {
        boolean z3 = this.f41070m;
        ArrayList arrayList = this.f41060b;
        if (!z3) {
            this.f41070m = true;
            arrayList.clear();
            ArrayList b9 = b();
            int size = b9.size();
            for (int i = 0; i < size; i++) {
                C5222q c5222q = (C5222q) b9.get(i);
                if (!arrayList.contains(c5222q.f41820a)) {
                    arrayList.add(c5222q.f41820a);
                }
                int i6 = 0;
                while (true) {
                    List list = c5222q.f41821b;
                    if (i6 < list.size()) {
                        if (!arrayList.contains(list.get(i6))) {
                            arrayList.add((InterfaceC4970e) list.get(i6));
                        }
                        i6++;
                    }
                }
            }
        }
        return arrayList;
    }

    public final ArrayList b() {
        boolean z3 = this.f41069l;
        ArrayList arrayList = this.f41059a;
        if (!z3) {
            this.f41069l = true;
            arrayList.clear();
            List f3 = this.f41061c.a().f(this.f41062d);
            int size = f3.size();
            for (int i = 0; i < size; i++) {
                C5222q b9 = ((InterfaceC5223r) f3.get(i)).b(this.f41062d, this.f41063e, this.f41064f, this.i);
                if (b9 != null) {
                    arrayList.add(b9);
                }
            }
        }
        return arrayList;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final v c(Class cls) {
        v vVar;
        Class cls2;
        Class cls3;
        Class cls4;
        v vVar2;
        ArrayList arrayList;
        G1.c cVar;
        Class cls5 = cls;
        com.bumptech.glide.l a9 = this.f41061c.a();
        Class cls6 = this.f41065g;
        Class cls7 = this.f41068k;
        I1.c cVar2 = a9.i;
        N1.n nVar = (N1.n) cVar2.f1280b.getAndSet(null);
        if (nVar == null) {
            nVar = new N1.n();
        }
        nVar.f1928a = cls5;
        nVar.f1929b = cls6;
        nVar.f1930c = cls7;
        synchronized (cVar2.f1279a) {
            vVar = (v) cVar2.f1279a.getOrDefault(nVar, null);
        }
        cVar2.f1280b.set(nVar);
        a9.i.getClass();
        if (I1.c.f1278c.equals(vVar)) {
            return null;
        }
        if (vVar != null) {
            return vVar;
        }
        ArrayList arrayList2 = new ArrayList();
        Iterator it = a9.f23408c.E(cls5, cls6).iterator();
        while (it.hasNext()) {
            Class<?> cls8 = (Class) it.next();
            Iterator it2 = a9.f23411f.c(cls8, cls7).iterator();
            while (it2.hasNext()) {
                Class cls9 = (Class) it2.next();
                S0.l lVar = a9.f23408c;
                synchronized (lVar) {
                    arrayList = new ArrayList();
                    Iterator it3 = ((ArrayList) lVar.f2797u).iterator();
                    while (it3.hasNext()) {
                        List<I1.d> list = (List) ((HashMap) lVar.f2798v).get((String) it3.next());
                        if (list != null) {
                            for (I1.d dVar : list) {
                                if (dVar.f1281a.isAssignableFrom(cls5) && cls8.isAssignableFrom(dVar.f1282b)) {
                                    arrayList.add(dVar.f1283c);
                                }
                            }
                        }
                    }
                }
                G1.e eVar = a9.f23411f;
                synchronized (eVar) {
                    if (!cls9.isAssignableFrom(cls8)) {
                        Iterator it4 = eVar.f1056a.iterator();
                        while (it4.hasNext()) {
                            G1.d dVar2 = (G1.d) it4.next();
                            if (dVar2.f1053a.isAssignableFrom(cls8) && cls9.isAssignableFrom(dVar2.f1054b)) {
                                cVar = dVar2.f1055c;
                            } else {
                                cls5 = cls;
                            }
                        }
                        throw new IllegalArgumentException("No transcoder registered to transcode from " + cls8 + " to " + cls9);
                    }
                    cVar = G1.f.f1057u;
                }
                arrayList2.add(new j(cls5, cls8, cls9, arrayList, cVar, a9.f23414j));
                cls5 = cls;
            }
            cls5 = cls;
        }
        if (arrayList2.isEmpty()) {
            cls2 = cls;
            cls3 = cls6;
            cls4 = cls7;
            vVar2 = null;
        } else {
            cls2 = cls;
            cls3 = cls6;
            cls4 = cls7;
            vVar2 = new v(cls2, cls3, cls4, arrayList2, a9.f23414j);
        }
        I1.c cVar3 = a9.i;
        synchronized (cVar3.f1279a) {
            cVar3.f1279a.put(new N1.n(cls2, cls3, cls4), vVar2 != null ? vVar2 : I1.c.f1278c);
        }
        return vVar2;
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0027, code lost:
    
        r1 = r3.f1276b;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final InterfaceC4967b d(Object obj) {
        InterfaceC4967b interfaceC4967b;
        G1.e eVar = this.f41061c.a().f23407b;
        Class<?> cls = obj.getClass();
        synchronized (eVar) {
            Iterator it = eVar.f1056a.iterator();
            while (true) {
                if (!it.hasNext()) {
                    interfaceC4967b = null;
                    break;
                }
                I1.a aVar = (I1.a) it.next();
                if (aVar.f1275a.isAssignableFrom(cls)) {
                    break;
                }
            }
        }
        if (interfaceC4967b != null) {
            return interfaceC4967b;
        }
        throw new com.bumptech.glide.k("Failed to find source encoder for data class: " + obj.getClass());
    }

    public final s1.l e(Class cls) {
        s1.l lVar = (s1.l) this.f41067j.getOrDefault(cls, null);
        if (lVar == null) {
            Iterator it = ((s.g) this.f41067j.entrySet()).iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                Map.Entry entry = (Map.Entry) it.next();
                if (((Class) entry.getKey()).isAssignableFrom(cls)) {
                    lVar = (s1.l) entry.getValue();
                    break;
                }
            }
        }
        if (lVar != null) {
            return lVar;
        }
        if (!this.f41067j.isEmpty() || !this.f41074q) {
            return A1.e.f18b;
        }
        throw new IllegalArgumentException("Missing transformation for " + cls + ". If you wish to ignore unknown resource types, use the optional transformation methods.");
    }
}
