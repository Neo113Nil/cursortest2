package com.gamericefishpro.space.bb;

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

/* JADX INFO: compiled from: r8-map-id-020a1517951ead57be77a6b773195444ecc812bf491d4c7c9fe6933b01540740 */
/* JADX INFO: loaded from: classes.dex */
public final class i implements c {
    public static final f A = new f(0);
    public final HashMap d;
    public final HashMap e;
    public final HashMap i;
    public final HashSet v;
    public final o w;
    public final AtomicReference y;
    public final com.gamericefishpro.space.u3.k z;

    public i(ArrayList arrayList, ArrayList arrayList2, com.gamericefishpro.space.u3.k kVar) {
        com.gamericefishpro.space.cb.k kVar2 = com.gamericefishpro.space.cb.k.d;
        this.d = new HashMap();
        this.e = new HashMap();
        this.i = new HashMap();
        this.v = new HashSet();
        this.y = new AtomicReference();
        o oVar = new o();
        this.w = oVar;
        this.z = kVar;
        ArrayList arrayList3 = new ArrayList();
        arrayList3.add(b.c(oVar, o.class, com.gamericefishpro.space.kb.c.class, com.gamericefishpro.space.kb.b.class));
        int i = 0;
        arrayList3.add(b.c(this, i.class, new Class[0]));
        int size = arrayList2.size();
        int i2 = 0;
        while (i2 < size) {
            Object obj = arrayList2.get(i2);
            i2++;
            b bVar = (b) obj;
            if (bVar != null) {
                arrayList3.add(bVar);
            }
        }
        ArrayList arrayList4 = new ArrayList();
        int size2 = arrayList.size();
        int i3 = 0;
        while (i3 < size2) {
            Object obj2 = arrayList.get(i3);
            i3++;
            arrayList4.add(obj2);
        }
        ArrayList arrayList5 = new ArrayList();
        synchronized (this) {
            Iterator it = arrayList4.iterator();
            while (it.hasNext()) {
                try {
                    ComponentRegistrar componentRegistrar = (ComponentRegistrar) ((com.gamericefishpro.space.nb.a) it.next()).get();
                    if (componentRegistrar != null) {
                        arrayList3.addAll(this.z.c(componentRegistrar));
                        it.remove();
                    }
                } catch (p e) {
                    it.remove();
                    Log.w("ComponentDiscovery", "Invalid component registrar.", e);
                }
            }
            Iterator it2 = arrayList3.iterator();
            while (it2.hasNext()) {
                for (Object obj3 : ((b) it2.next()).b.toArray()) {
                    if (obj3.toString().contains("kotlinx.coroutines.CoroutineDispatcher")) {
                        if (this.v.contains(obj3.toString())) {
                            it2.remove();
                            break;
                        }
                        this.v.add(obj3.toString());
                    }
                }
            }
            if (this.d.isEmpty()) {
                com.gamericefishpro.space.d9.h.r(arrayList3);
            } else {
                ArrayList arrayList6 = new ArrayList(this.d.keySet());
                arrayList6.addAll(arrayList3);
                com.gamericefishpro.space.d9.h.r(arrayList6);
            }
            int size3 = arrayList3.size();
            int i4 = 0;
            while (i4 < size3) {
                Object obj4 = arrayList3.get(i4);
                i4++;
                b bVar2 = (b) obj4;
                this.d.put(bVar2, new q(new g(i, this, bVar2)));
            }
            arrayList5.addAll(i(arrayList3));
            arrayList5.addAll(j());
            c();
        }
        int size4 = arrayList5.size();
        while (i < size4) {
            Object obj5 = arrayList5.get(i);
            i++;
            ((Runnable) obj5).run();
        }
        Boolean bool = (Boolean) this.y.get();
        if (bool != null) {
            a(this.d, bool.booleanValue());
        }
    }

    public final void a(HashMap map, boolean z) {
        ArrayDeque arrayDeque;
        for (Map.Entry entry : map.entrySet()) {
            b bVar = (b) entry.getKey();
            com.gamericefishpro.space.nb.a aVar = (com.gamericefishpro.space.nb.a) entry.getValue();
            int i = bVar.d;
            if (i == 1 || (i == 2 && z)) {
                aVar.get();
            }
        }
        o oVar = this.w;
        synchronized (oVar) {
            try {
                arrayDeque = oVar.b;
                if (arrayDeque != null) {
                    oVar.b = null;
                } else {
                    arrayDeque = null;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        if (arrayDeque != null) {
            Iterator it = arrayDeque.iterator();
            if (it.hasNext()) {
                throw com.gamericefishpro.space.m5.a.f(it);
            }
        }
    }

    public final void c() {
        for (b bVar : this.d.keySet()) {
            for (l lVar : bVar.c) {
                if (lVar.b == 2 && !this.i.containsKey(lVar.a)) {
                    HashMap map = this.i;
                    v vVar = lVar.a;
                    Set set = Collections.EMPTY_SET;
                    r rVar = new r();
                    rVar.b = null;
                    rVar.a = Collections.newSetFromMap(new ConcurrentHashMap());
                    rVar.a.addAll(set);
                    map.put(vVar, rVar);
                } else if (this.e.containsKey(lVar.a)) {
                    continue;
                } else {
                    int i = lVar.b;
                    if (i == 1) {
                        throw new m("Unsatisfied dependency for component " + bVar + ": " + lVar.a);
                    }
                    if (i != 2) {
                        HashMap map2 = this.e;
                        v vVar2 = lVar.a;
                        s sVar = t.c;
                        f fVar = t.d;
                        t tVar = new t();
                        tVar.a = sVar;
                        tVar.b = fVar;
                        map2.put(vVar2, tVar);
                    }
                }
            }
        }
    }

    @Override // com.gamericefishpro.space.bb.c
    public final synchronized com.gamericefishpro.space.nb.a d(v vVar) {
        com.gamericefishpro.space.hj.c.m(vVar, "Null interface requested.");
        return (com.gamericefishpro.space.nb.a) this.e.get(vVar);
    }

    @Override // com.gamericefishpro.space.bb.c
    public final synchronized com.gamericefishpro.space.nb.a g(v vVar) {
        r rVar = (r) this.i.get(vVar);
        if (rVar != null) {
            return rVar;
        }
        return A;
    }

    public final ArrayList i(ArrayList arrayList) {
        ArrayList arrayList2 = new ArrayList();
        int size = arrayList.size();
        int i = 0;
        while (i < size) {
            Object obj = arrayList.get(i);
            i++;
            b bVar = (b) obj;
            if (bVar.e == 0) {
                com.gamericefishpro.space.nb.a aVar = (com.gamericefishpro.space.nb.a) this.d.get(bVar);
                for (v vVar : bVar.b) {
                    HashMap map = this.e;
                    if (map.containsKey(vVar)) {
                        arrayList2.add(new h(0, (t) ((com.gamericefishpro.space.nb.a) map.get(vVar)), aVar));
                    } else {
                        map.put(vVar, aVar);
                    }
                }
            }
        }
        return arrayList2;
    }

    public final ArrayList j() {
        HashMap map = this.i;
        ArrayList arrayList = new ArrayList();
        HashMap map2 = new HashMap();
        for (Map.Entry entry : this.d.entrySet()) {
            b bVar = (b) entry.getKey();
            if (bVar.e != 0) {
                com.gamericefishpro.space.nb.a aVar = (com.gamericefishpro.space.nb.a) entry.getValue();
                for (v vVar : bVar.b) {
                    if (!map2.containsKey(vVar)) {
                        map2.put(vVar, new HashSet());
                    }
                    ((Set) map2.get(vVar)).add(aVar);
                }
            }
        }
        for (Map.Entry entry2 : map2.entrySet()) {
            if (map.containsKey(entry2.getKey())) {
                r rVar = (r) map.get(entry2.getKey());
                Iterator it = ((Set) entry2.getValue()).iterator();
                while (it.hasNext()) {
                    arrayList.add(new h(1, rVar, (com.gamericefishpro.space.nb.a) it.next()));
                }
            } else {
                v vVar2 = (v) entry2.getKey();
                Set set = (Set) ((Collection) entry2.getValue());
                r rVar2 = new r();
                rVar2.b = null;
                rVar2.a = Collections.newSetFromMap(new ConcurrentHashMap());
                rVar2.a.addAll(set);
                map.put(vVar2, rVar2);
            }
        }
        return arrayList;
    }
}
