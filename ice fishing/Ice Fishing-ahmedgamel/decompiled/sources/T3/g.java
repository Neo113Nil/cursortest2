package T3;

import D.x;
import android.util.Log;
import b4.InterfaceC0524a;
import b4.InterfaceC0525b;
import com.google.firebase.components.ComponentRegistrar;
import e4.InterfaceC4481a;
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
    public static final f f3179A = new f(0);

    /* renamed from: n, reason: collision with root package name */
    public final HashMap f3180n;

    /* renamed from: u, reason: collision with root package name */
    public final HashMap f3181u;

    /* renamed from: v, reason: collision with root package name */
    public final HashMap f3182v;

    /* renamed from: w, reason: collision with root package name */
    public final HashSet f3183w;

    /* renamed from: x, reason: collision with root package name */
    public final l f3184x;

    /* renamed from: y, reason: collision with root package name */
    public final AtomicReference f3185y;

    /* renamed from: z, reason: collision with root package name */
    public final O2.i f3186z;

    public g(ArrayList arrayList, ArrayList arrayList2, O2.i iVar) {
        U3.j jVar = U3.j.f3325n;
        this.f3180n = new HashMap();
        this.f3181u = new HashMap();
        this.f3182v = new HashMap();
        this.f3183w = new HashSet();
        this.f3185y = new AtomicReference();
        l lVar = new l();
        this.f3184x = lVar;
        this.f3186z = iVar;
        ArrayList arrayList3 = new ArrayList();
        arrayList3.add(b.b(lVar, l.class, InterfaceC0525b.class, InterfaceC0524a.class));
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
                    ComponentRegistrar componentRegistrar = (ComponentRegistrar) ((InterfaceC4481a) it3.next()).get();
                    if (componentRegistrar != null) {
                        arrayList3.addAll(this.f3186z.o(componentRegistrar));
                        it3.remove();
                    }
                } catch (m e9) {
                    it3.remove();
                    Log.w("ComponentDiscovery", "Invalid component registrar.", e9);
                }
            }
            Iterator it4 = arrayList3.iterator();
            while (it4.hasNext()) {
                Object[] array = ((b) it4.next()).f3170b.toArray();
                int length = array.length;
                int i = 0;
                while (true) {
                    if (i < length) {
                        Object obj = array[i];
                        if (obj.toString().contains("kotlinx.coroutines.CoroutineDispatcher")) {
                            if (this.f3183w.contains(obj.toString())) {
                                it4.remove();
                                break;
                            }
                            this.f3183w.add(obj.toString());
                        }
                        i++;
                    }
                }
            }
            if (this.f3180n.isEmpty()) {
                com.bumptech.glide.f.i(arrayList3);
            } else {
                ArrayList arrayList6 = new ArrayList(this.f3180n.keySet());
                arrayList6.addAll(arrayList3);
                com.bumptech.glide.f.i(arrayList6);
            }
            Iterator it5 = arrayList3.iterator();
            while (it5.hasNext()) {
                b bVar2 = (b) it5.next();
                this.f3180n.put(bVar2, new n(new Q3.c(1, this, bVar2)));
            }
            arrayList5.addAll(i(arrayList3));
            arrayList5.addAll(j());
            h();
        }
        Iterator it6 = arrayList5.iterator();
        while (it6.hasNext()) {
            ((Runnable) it6.next()).run();
        }
        Boolean bool = (Boolean) this.f3185y.get();
        if (bool != null) {
            g(this.f3180n, bool.booleanValue());
        }
    }

    @Override // T3.c
    public final synchronized InterfaceC4481a c(r rVar) {
        com.bumptech.glide.g.g(rVar, "Null interface requested.");
        return (InterfaceC4481a) this.f3181u.get(rVar);
    }

    @Override // T3.c
    public final synchronized InterfaceC4481a d(r rVar) {
        o oVar = (o) this.f3182v.get(rVar);
        if (oVar != null) {
            return oVar;
        }
        return f3179A;
    }

    public final void g(HashMap hashMap, boolean z6) {
        ArrayDeque arrayDeque;
        for (Map.Entry entry : hashMap.entrySet()) {
            b bVar = (b) entry.getKey();
            InterfaceC4481a interfaceC4481a = (InterfaceC4481a) entry.getValue();
            int i = bVar.f3172d;
            if (i == 1 || (i == 2 && z6)) {
                interfaceC4481a.get();
            }
        }
        l lVar = this.f3184x;
        synchronized (lVar) {
            arrayDeque = lVar.f3196b;
            if (arrayDeque != null) {
                lVar.f3196b = null;
            } else {
                arrayDeque = null;
            }
        }
        if (arrayDeque != null) {
            Iterator it = arrayDeque.iterator();
            if (it.hasNext()) {
                throw x.i(it);
            }
        }
    }

    public final void h() {
        for (b bVar : this.f3180n.keySet()) {
            for (j jVar : bVar.f3171c) {
                if (jVar.f3193b == 2 && !this.f3182v.containsKey(jVar.f3192a)) {
                    HashMap hashMap = this.f3182v;
                    r rVar = jVar.f3192a;
                    Set set = Collections.EMPTY_SET;
                    o oVar = new o();
                    oVar.f3202b = null;
                    oVar.f3201a = Collections.newSetFromMap(new ConcurrentHashMap());
                    oVar.f3201a.addAll(set);
                    hashMap.put(rVar, oVar);
                } else if (this.f3181u.containsKey(jVar.f3192a)) {
                    continue;
                } else {
                    int i = jVar.f3193b;
                    if (i == 1) {
                        throw new k("Unsatisfied dependency for component " + bVar + ": " + jVar.f3192a);
                    }
                    if (i != 2) {
                        HashMap hashMap2 = this.f3181u;
                        r rVar2 = jVar.f3192a;
                        D0.n nVar = p.f3203c;
                        f fVar = p.f3204d;
                        p pVar = new p();
                        pVar.f3205a = nVar;
                        pVar.f3206b = fVar;
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
            if (bVar.f3173e == 0) {
                InterfaceC4481a interfaceC4481a = (InterfaceC4481a) this.f3180n.get(bVar);
                for (r rVar : bVar.f3170b) {
                    HashMap hashMap = this.f3181u;
                    if (hashMap.containsKey(rVar)) {
                        arrayList2.add(new F.n(7, (p) ((InterfaceC4481a) hashMap.get(rVar)), interfaceC4481a));
                    } else {
                        hashMap.put(rVar, interfaceC4481a);
                    }
                }
            }
        }
        return arrayList2;
    }

    public final ArrayList j() {
        ArrayList arrayList = new ArrayList();
        HashMap hashMap = new HashMap();
        for (Map.Entry entry : this.f3180n.entrySet()) {
            b bVar = (b) entry.getKey();
            if (bVar.f3173e != 0) {
                InterfaceC4481a interfaceC4481a = (InterfaceC4481a) entry.getValue();
                for (r rVar : bVar.f3170b) {
                    if (!hashMap.containsKey(rVar)) {
                        hashMap.put(rVar, new HashSet());
                    }
                    ((Set) hashMap.get(rVar)).add(interfaceC4481a);
                }
            }
        }
        for (Map.Entry entry2 : hashMap.entrySet()) {
            Object key = entry2.getKey();
            HashMap hashMap2 = this.f3182v;
            if (hashMap2.containsKey(key)) {
                o oVar = (o) hashMap2.get(entry2.getKey());
                Iterator it = ((Set) entry2.getValue()).iterator();
                while (it.hasNext()) {
                    arrayList.add(new F.n(8, oVar, (InterfaceC4481a) it.next()));
                }
            } else {
                r rVar2 = (r) entry2.getKey();
                Set set = (Set) ((Collection) entry2.getValue());
                o oVar2 = new o();
                oVar2.f3202b = null;
                oVar2.f3201a = Collections.newSetFromMap(new ConcurrentHashMap());
                oVar2.f3201a.addAll(set);
                hashMap2.put(rVar2, oVar2);
            }
        }
        return arrayList;
    }
}
