package N3;

import B1.w;
import D.y;
import android.util.Log;
import com.google.firebase.components.ComponentRegistrar;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes2.dex */
public final class g implements c {

    /* renamed from: A, reason: collision with root package name */
    public static final f f2164A = new f(0);

    /* renamed from: n, reason: collision with root package name */
    public final HashMap f2165n;

    /* renamed from: u, reason: collision with root package name */
    public final HashMap f2166u;

    /* renamed from: v, reason: collision with root package name */
    public final HashMap f2167v;

    /* renamed from: w, reason: collision with root package name */
    public final HashSet f2168w;

    /* renamed from: x, reason: collision with root package name */
    public final l f2169x;

    /* renamed from: y, reason: collision with root package name */
    public final AtomicReference f2170y;

    /* renamed from: z, reason: collision with root package name */
    public final W3.e f2171z;

    public g(ArrayList arrayList, ArrayList arrayList2, W3.e eVar) {
        O3.k kVar = O3.k.f2522n;
        this.f2165n = new HashMap();
        this.f2166u = new HashMap();
        this.f2167v = new HashMap();
        this.f2168w = new HashSet();
        this.f2170y = new AtomicReference();
        l lVar = new l();
        this.f2169x = lVar;
        this.f2171z = eVar;
        ArrayList arrayList3 = new ArrayList();
        arrayList3.add(b.b(lVar, l.class, V3.b.class, V3.a.class));
        arrayList3.add(b.b(this, g.class, new Class[0]));
        Iterator it = arrayList2.iterator();
        while (it.hasNext()) {
            b bVar = (b) it.next();
            if (bVar != null) {
                arrayList3.add(bVar);
            }
        }
        ArrayList arrayList4 = new ArrayList();
        Iterator it2 = arrayList.iterator();
        while (it2.hasNext()) {
            arrayList4.add(it2.next());
        }
        ArrayList arrayList5 = new ArrayList();
        synchronized (this) {
            Iterator it3 = arrayList4.iterator();
            while (it3.hasNext()) {
                try {
                    ComponentRegistrar componentRegistrar = (ComponentRegistrar) ((Y3.a) it3.next()).get();
                    if (componentRegistrar != null) {
                        arrayList3.addAll(this.f2171z.w(componentRegistrar));
                        it3.remove();
                    }
                } catch (m e6) {
                    it3.remove();
                    Log.w("ComponentDiscovery", "Invalid component registrar.", e6);
                }
            }
            Iterator it4 = arrayList3.iterator();
            while (it4.hasNext()) {
                Object[] array = ((b) it4.next()).f2155b.toArray();
                int length = array.length;
                int i = 0;
                while (true) {
                    if (i < length) {
                        Object obj = array[i];
                        if (obj.toString().contains("kotlinx.coroutines.CoroutineDispatcher")) {
                            if (this.f2168w.contains(obj.toString())) {
                                it4.remove();
                                break;
                            }
                            this.f2168w.add(obj.toString());
                        }
                        i++;
                    }
                }
            }
            if (this.f2165n.isEmpty()) {
                W2.e.c(arrayList3);
            } else {
                ArrayList arrayList6 = new ArrayList(this.f2165n.keySet());
                arrayList6.addAll(arrayList3);
                W2.e.c(arrayList6);
            }
            Iterator it5 = arrayList3.iterator();
            while (it5.hasNext()) {
                b bVar2 = (b) it5.next();
                this.f2165n.put(bVar2, new n(new K3.c(1, this, bVar2)));
            }
            arrayList5.addAll(i(arrayList3));
            arrayList5.addAll(j());
            h();
        }
        Iterator it6 = arrayList5.iterator();
        while (it6.hasNext()) {
            ((Runnable) it6.next()).run();
        }
        Boolean bool = (Boolean) this.f2170y.get();
        if (bool != null) {
            g(this.f2165n, bool.booleanValue());
        }
    }

    @Override // N3.c
    public final synchronized Y3.a d(r rVar) {
        o oVar = (o) this.f2167v.get(rVar);
        if (oVar != null) {
            return oVar;
        }
        return f2164A;
    }

    @Override // N3.c
    public final synchronized Y3.a f(r rVar) {
        Z5.c.b(rVar, "Null interface requested.");
        return (Y3.a) this.f2166u.get(rVar);
    }

    public final void g(HashMap hashMap, boolean z8) {
        ArrayDeque arrayDeque;
        for (Map.Entry entry : hashMap.entrySet()) {
            b bVar = (b) entry.getKey();
            Y3.a aVar = (Y3.a) entry.getValue();
            int i = bVar.f2157d;
            if (i == 1 || (i == 2 && z8)) {
                aVar.get();
            }
        }
        l lVar = this.f2169x;
        synchronized (lVar) {
            arrayDeque = lVar.f2181b;
            if (arrayDeque != null) {
                lVar.f2181b = null;
            } else {
                arrayDeque = null;
            }
        }
        if (arrayDeque != null) {
            Iterator it = arrayDeque.iterator();
            if (it.hasNext()) {
                throw y.h(it);
            }
        }
    }

    public final void h() {
        for (b bVar : this.f2165n.keySet()) {
            for (j jVar : bVar.f2156c) {
                if (jVar.f2178b == 2 && !this.f2167v.containsKey(jVar.f2177a)) {
                    HashMap hashMap = this.f2167v;
                    r rVar = jVar.f2177a;
                    Set set = Collections.EMPTY_SET;
                    o oVar = new o();
                    oVar.f2187b = null;
                    oVar.f2186a = Collections.newSetFromMap(new ConcurrentHashMap());
                    oVar.f2186a.addAll(set);
                    hashMap.put(rVar, oVar);
                } else if (this.f2166u.containsKey(jVar.f2177a)) {
                    continue;
                } else {
                    int i = jVar.f2178b;
                    if (i == 1) {
                        throw new k("Unsatisfied dependency for component " + bVar + ": " + jVar.f2177a);
                    }
                    if (i != 2) {
                        HashMap hashMap2 = this.f2166u;
                        r rVar2 = jVar.f2177a;
                        w wVar = p.f2188c;
                        f fVar = p.f2189d;
                        p pVar = new p();
                        pVar.f2190a = wVar;
                        pVar.f2191b = fVar;
                        hashMap2.put(rVar2, pVar);
                    }
                }
            }
        }
    }

    public final ArrayList i(ArrayList arrayList) {
        ArrayList arrayList2 = new ArrayList();
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            b bVar = (b) it.next();
            if (bVar.f2158e == 0) {
                Y3.a aVar = (Y3.a) this.f2165n.get(bVar);
                for (r rVar : bVar.f2155b) {
                    HashMap hashMap = this.f2166u;
                    if (hashMap.containsKey(rVar)) {
                        arrayList2.add(new D5.b(5, (p) ((Y3.a) hashMap.get(rVar)), aVar));
                    } else {
                        hashMap.put(rVar, aVar);
                    }
                }
            }
        }
        return arrayList2;
    }

    public final ArrayList j() {
        ArrayList arrayList = new ArrayList();
        HashMap hashMap = new HashMap();
        for (Map.Entry entry : this.f2165n.entrySet()) {
            b bVar = (b) entry.getKey();
            if (bVar.f2158e != 0) {
                Y3.a aVar = (Y3.a) entry.getValue();
                for (r rVar : bVar.f2155b) {
                    if (!hashMap.containsKey(rVar)) {
                        hashMap.put(rVar, new HashSet());
                    }
                    ((Set) hashMap.get(rVar)).add(aVar);
                }
            }
        }
        for (Map.Entry entry2 : hashMap.entrySet()) {
            Object key = entry2.getKey();
            HashMap hashMap2 = this.f2167v;
            if (hashMap2.containsKey(key)) {
                o oVar = (o) hashMap2.get(entry2.getKey());
                Iterator it = ((Set) entry2.getValue()).iterator();
                while (it.hasNext()) {
                    arrayList.add(new D5.b(6, oVar, (Y3.a) it.next()));
                }
            } else {
                r rVar2 = (r) entry2.getKey();
                Set set = (Set) ((Collection) entry2.getValue());
                o oVar2 = new o();
                oVar2.f2187b = null;
                oVar2.f2186a = Collections.newSetFromMap(new ConcurrentHashMap());
                oVar2.f2186a.addAll(set);
                hashMap2.put(rVar2, oVar2);
            }
        }
        return arrayList;
    }
}
