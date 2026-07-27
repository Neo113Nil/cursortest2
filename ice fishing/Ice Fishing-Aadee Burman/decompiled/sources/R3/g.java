package R3;

import B1.x;
import D.y;
import android.util.Log;
import c4.InterfaceC0542a;
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
    public static final f f2724A = new f(0);

    /* renamed from: n, reason: collision with root package name */
    public final HashMap f2725n;

    /* renamed from: u, reason: collision with root package name */
    public final HashMap f2726u;

    /* renamed from: v, reason: collision with root package name */
    public final HashMap f2727v;

    /* renamed from: w, reason: collision with root package name */
    public final HashSet f2728w;

    /* renamed from: x, reason: collision with root package name */
    public final l f2729x;

    /* renamed from: y, reason: collision with root package name */
    public final AtomicReference f2730y;

    /* renamed from: z, reason: collision with root package name */
    public final E3.e f2731z;

    public g(ArrayList arrayList, ArrayList arrayList2, E3.e eVar) {
        S3.k kVar = S3.k.f2886n;
        this.f2725n = new HashMap();
        this.f2726u = new HashMap();
        this.f2727v = new HashMap();
        this.f2728w = new HashSet();
        this.f2730y = new AtomicReference();
        l lVar = new l();
        this.f2729x = lVar;
        this.f2731z = eVar;
        ArrayList arrayList3 = new ArrayList();
        arrayList3.add(b.b(lVar, l.class, Z3.b.class, Z3.a.class));
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
                    ComponentRegistrar componentRegistrar = (ComponentRegistrar) ((InterfaceC0542a) it3.next()).get();
                    if (componentRegistrar != null) {
                        arrayList3.addAll(this.f2731z.A(componentRegistrar));
                        it3.remove();
                    }
                } catch (m e9) {
                    it3.remove();
                    Log.w("ComponentDiscovery", "Invalid component registrar.", e9);
                }
            }
            Iterator it4 = arrayList3.iterator();
            while (it4.hasNext()) {
                Object[] array = ((b) it4.next()).f2715b.toArray();
                int length = array.length;
                int i = 0;
                while (true) {
                    if (i < length) {
                        Object obj = array[i];
                        if (obj.toString().contains("kotlinx.coroutines.CoroutineDispatcher")) {
                            if (this.f2728w.contains(obj.toString())) {
                                it4.remove();
                                break;
                            }
                            this.f2728w.add(obj.toString());
                        }
                        i++;
                    }
                }
            }
            if (this.f2725n.isEmpty()) {
                V2.a.h(arrayList3);
            } else {
                ArrayList arrayList6 = new ArrayList(this.f2725n.keySet());
                arrayList6.addAll(arrayList3);
                V2.a.h(arrayList6);
            }
            Iterator it5 = arrayList3.iterator();
            while (it5.hasNext()) {
                b bVar2 = (b) it5.next();
                this.f2725n.put(bVar2, new n(new O3.c(1, this, bVar2)));
            }
            arrayList5.addAll(i(arrayList3));
            arrayList5.addAll(j());
            h();
        }
        Iterator it6 = arrayList5.iterator();
        while (it6.hasNext()) {
            ((Runnable) it6.next()).run();
        }
        Boolean bool = (Boolean) this.f2730y.get();
        if (bool != null) {
            g(this.f2725n, bool.booleanValue());
        }
    }

    @Override // R3.c
    public final synchronized InterfaceC0542a e(r rVar) {
        X2.e.z(rVar, "Null interface requested.");
        return (InterfaceC0542a) this.f2726u.get(rVar);
    }

    @Override // R3.c
    public final synchronized InterfaceC0542a f(r rVar) {
        o oVar = (o) this.f2727v.get(rVar);
        if (oVar != null) {
            return oVar;
        }
        return f2724A;
    }

    public final void g(HashMap hashMap, boolean z3) {
        ArrayDeque arrayDeque;
        for (Map.Entry entry : hashMap.entrySet()) {
            b bVar = (b) entry.getKey();
            InterfaceC0542a interfaceC0542a = (InterfaceC0542a) entry.getValue();
            int i = bVar.f2717d;
            if (i == 1 || (i == 2 && z3)) {
                interfaceC0542a.get();
            }
        }
        l lVar = this.f2729x;
        synchronized (lVar) {
            arrayDeque = lVar.f2741b;
            if (arrayDeque != null) {
                lVar.f2741b = null;
            } else {
                arrayDeque = null;
            }
        }
        if (arrayDeque != null) {
            Iterator it = arrayDeque.iterator();
            if (it.hasNext()) {
                throw y.j(it);
            }
        }
    }

    public final void h() {
        for (b bVar : this.f2725n.keySet()) {
            for (j jVar : bVar.f2716c) {
                if (jVar.f2738b == 2 && !this.f2727v.containsKey(jVar.f2737a)) {
                    HashMap hashMap = this.f2727v;
                    r rVar = jVar.f2737a;
                    Set set = Collections.EMPTY_SET;
                    o oVar = new o();
                    oVar.f2747b = null;
                    oVar.f2746a = Collections.newSetFromMap(new ConcurrentHashMap());
                    oVar.f2746a.addAll(set);
                    hashMap.put(rVar, oVar);
                } else if (this.f2726u.containsKey(jVar.f2737a)) {
                    continue;
                } else {
                    int i = jVar.f2738b;
                    if (i == 1) {
                        throw new k("Unsatisfied dependency for component " + bVar + ": " + jVar.f2737a);
                    }
                    if (i != 2) {
                        HashMap hashMap2 = this.f2726u;
                        r rVar2 = jVar.f2737a;
                        x xVar = p.f2748c;
                        f fVar = p.f2749d;
                        p pVar = new p();
                        pVar.f2750a = xVar;
                        pVar.f2751b = fVar;
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
            if (bVar.f2718e == 0) {
                InterfaceC0542a interfaceC0542a = (InterfaceC0542a) this.f2725n.get(bVar);
                for (r rVar : bVar.f2715b) {
                    HashMap hashMap = this.f2726u;
                    if (hashMap.containsKey(rVar)) {
                        arrayList2.add(new F.n(6, (p) ((InterfaceC0542a) hashMap.get(rVar)), interfaceC0542a));
                    } else {
                        hashMap.put(rVar, interfaceC0542a);
                    }
                }
            }
        }
        return arrayList2;
    }

    public final ArrayList j() {
        ArrayList arrayList = new ArrayList();
        HashMap hashMap = new HashMap();
        for (Map.Entry entry : this.f2725n.entrySet()) {
            b bVar = (b) entry.getKey();
            if (bVar.f2718e != 0) {
                InterfaceC0542a interfaceC0542a = (InterfaceC0542a) entry.getValue();
                for (r rVar : bVar.f2715b) {
                    if (!hashMap.containsKey(rVar)) {
                        hashMap.put(rVar, new HashSet());
                    }
                    ((Set) hashMap.get(rVar)).add(interfaceC0542a);
                }
            }
        }
        for (Map.Entry entry2 : hashMap.entrySet()) {
            Object key = entry2.getKey();
            HashMap hashMap2 = this.f2727v;
            if (hashMap2.containsKey(key)) {
                o oVar = (o) hashMap2.get(entry2.getKey());
                Iterator it = ((Set) entry2.getValue()).iterator();
                while (it.hasNext()) {
                    arrayList.add(new F.n(7, oVar, (InterfaceC0542a) it.next()));
                }
            } else {
                r rVar2 = (r) entry2.getKey();
                Set set = (Set) ((Collection) entry2.getValue());
                o oVar2 = new o();
                oVar2.f2747b = null;
                oVar2.f2746a = Collections.newSetFromMap(new ConcurrentHashMap());
                oVar2.f2746a.addAll(set);
                hashMap2.put(rVar2, oVar2);
            }
        }
        return arrayList;
    }
}
