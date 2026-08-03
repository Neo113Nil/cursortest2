package l7;

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

/* compiled from: r8-map-id-9ca073bbfde00f50be8682633edd5c48170ffeeeebc591f4c22ad3deaafa0d20 */
/* loaded from: classes.dex */
public final class g implements c {

    /* renamed from: h, reason: collision with root package name */
    public static final f f4223h = new f(0);

    /* renamed from: a, reason: collision with root package name */
    public final HashMap f4224a;

    /* renamed from: b, reason: collision with root package name */
    public final HashMap f4225b;

    /* renamed from: c, reason: collision with root package name */
    public final HashMap f4226c;

    /* renamed from: d, reason: collision with root package name */
    public final HashSet f4227d;

    /* renamed from: e, reason: collision with root package name */
    public final l f4228e;

    /* renamed from: f, reason: collision with root package name */
    public final AtomicReference f4229f;

    /* renamed from: g, reason: collision with root package name */
    public final m6.i f4230g;

    public g(ArrayList arrayList, ArrayList arrayList2, m6.i iVar) {
        m7.l lVar = m7.l.f4967g;
        this.f4224a = new HashMap();
        this.f4225b = new HashMap();
        this.f4226c = new HashMap();
        this.f4227d = new HashSet();
        this.f4229f = new AtomicReference();
        l lVar2 = new l();
        this.f4228e = lVar2;
        this.f4230g = iVar;
        ArrayList arrayList3 = new ArrayList();
        arrayList3.add(b.b(lVar2, l.class, t7.b.class, t7.a.class));
        int i10 = 0;
        arrayList3.add(b.b(this, g.class, new Class[0]));
        int size = arrayList2.size();
        int i11 = 0;
        while (i11 < size) {
            Object obj = arrayList2.get(i11);
            i11++;
            b bVar = (b) obj;
            if (bVar != null) {
                arrayList3.add(bVar);
            }
        }
        ArrayList arrayList4 = new ArrayList();
        int size2 = arrayList.size();
        int i12 = 0;
        while (i12 < size2) {
            Object obj2 = arrayList.get(i12);
            i12++;
            arrayList4.add(obj2);
        }
        ArrayList arrayList5 = new ArrayList();
        synchronized (this) {
            Iterator it = arrayList4.iterator();
            while (it.hasNext()) {
                try {
                    ComponentRegistrar componentRegistrar = (ComponentRegistrar) ((w7.a) it.next()).get();
                    if (componentRegistrar != null) {
                        arrayList3.addAll(this.f4230g.f(componentRegistrar));
                        it.remove();
                    }
                } catch (m e10) {
                    it.remove();
                    Log.w("ComponentDiscovery", "Invalid component registrar.", e10);
                }
            }
            Iterator it2 = arrayList3.iterator();
            while (it2.hasNext()) {
                Object[] array = ((b) it2.next()).f4214b.toArray();
                int length = array.length;
                int i13 = 0;
                while (true) {
                    if (i13 < length) {
                        Object obj3 = array[i13];
                        if (obj3.toString().contains("kotlinx.coroutines.CoroutineDispatcher")) {
                            if (this.f4227d.contains(obj3.toString())) {
                                it2.remove();
                                break;
                            }
                            this.f4227d.add(obj3.toString());
                        }
                        i13++;
                    }
                }
            }
            if (this.f4224a.isEmpty()) {
                a.a.s(arrayList3);
            } else {
                ArrayList arrayList6 = new ArrayList(this.f4224a.keySet());
                arrayList6.addAll(arrayList3);
                a.a.s(arrayList6);
            }
            int size3 = arrayList3.size();
            int i14 = 0;
            while (i14 < size3) {
                Object obj4 = arrayList3.get(i14);
                i14++;
                b bVar2 = (b) obj4;
                this.f4224a.put(bVar2, new n(new i7.c(1, this, bVar2)));
            }
            arrayList5.addAll(i(arrayList3));
            arrayList5.addAll(j());
            g();
        }
        int size4 = arrayList5.size();
        while (i10 < size4) {
            Object obj5 = arrayList5.get(i10);
            i10++;
            ((Runnable) obj5).run();
        }
        Boolean bool = (Boolean) this.f4229f.get();
        if (bool != null) {
            c(this.f4224a, bool.booleanValue());
        }
    }

    public final void c(HashMap hashMap, boolean z10) {
        ArrayDeque arrayDeque;
        for (Map.Entry entry : hashMap.entrySet()) {
            b bVar = (b) entry.getKey();
            w7.a aVar = (w7.a) entry.getValue();
            int i10 = bVar.f4216d;
            if (i10 == 1 || (i10 == 2 && z10)) {
                aVar.get();
            }
        }
        l lVar = this.f4228e;
        synchronized (lVar) {
            try {
                arrayDeque = lVar.f4240b;
                if (arrayDeque != null) {
                    lVar.f4240b = null;
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
                it.next().getClass();
                throw new ClassCastException();
            }
        }
    }

    @Override // l7.c
    public final synchronized w7.a e(r rVar) {
        return (w7.a) this.f4225b.get(rVar);
    }

    @Override // l7.c
    public final synchronized w7.a f(r rVar) {
        o oVar = (o) this.f4226c.get(rVar);
        if (oVar != null) {
            return oVar;
        }
        return f4223h;
    }

    public final void g() {
        for (b bVar : this.f4224a.keySet()) {
            for (j jVar : bVar.f4215c) {
                if (jVar.f4237b == 2 && !this.f4226c.containsKey(jVar.f4236a)) {
                    HashMap hashMap = this.f4226c;
                    r rVar = jVar.f4236a;
                    Set set = Collections.EMPTY_SET;
                    o oVar = new o();
                    oVar.f4246b = null;
                    oVar.f4245a = Collections.newSetFromMap(new ConcurrentHashMap());
                    oVar.f4245a.addAll(set);
                    hashMap.put(rVar, oVar);
                } else if (this.f4225b.containsKey(jVar.f4236a)) {
                    continue;
                } else {
                    int i10 = jVar.f4237b;
                    if (i10 == 1) {
                        throw new k("Unsatisfied dependency for component " + bVar + ": " + jVar.f4236a);
                    }
                    if (i10 != 2) {
                        HashMap hashMap2 = this.f4225b;
                        r rVar2 = jVar.f4236a;
                        d6.f fVar = p.f4247c;
                        f fVar2 = p.f4248d;
                        p pVar = new p();
                        pVar.f4249a = fVar;
                        pVar.f4250b = fVar2;
                        hashMap2.put(rVar2, pVar);
                    }
                }
            }
        }
    }

    public final ArrayList i(ArrayList arrayList) {
        ArrayList arrayList2 = new ArrayList();
        int size = arrayList.size();
        int i10 = 0;
        while (i10 < size) {
            Object obj = arrayList.get(i10);
            i10++;
            b bVar = (b) obj;
            if (bVar.f4217e == 0) {
                w7.a aVar = (w7.a) this.f4224a.get(bVar);
                for (r rVar : bVar.f4214b) {
                    HashMap hashMap = this.f4225b;
                    if (hashMap.containsKey(rVar)) {
                        arrayList2.add(new a1.d(6, (p) ((w7.a) hashMap.get(rVar)), aVar));
                    } else {
                        hashMap.put(rVar, aVar);
                    }
                }
            }
        }
        return arrayList2;
    }

    public final ArrayList j() {
        HashMap hashMap = this.f4226c;
        ArrayList arrayList = new ArrayList();
        HashMap hashMap2 = new HashMap();
        for (Map.Entry entry : this.f4224a.entrySet()) {
            b bVar = (b) entry.getKey();
            if (bVar.f4217e != 0) {
                w7.a aVar = (w7.a) entry.getValue();
                for (r rVar : bVar.f4214b) {
                    if (!hashMap2.containsKey(rVar)) {
                        hashMap2.put(rVar, new HashSet());
                    }
                    ((Set) hashMap2.get(rVar)).add(aVar);
                }
            }
        }
        for (Map.Entry entry2 : hashMap2.entrySet()) {
            if (hashMap.containsKey(entry2.getKey())) {
                o oVar = (o) hashMap.get(entry2.getKey());
                Iterator it = ((Set) entry2.getValue()).iterator();
                while (it.hasNext()) {
                    arrayList.add(new a1.d(7, oVar, (w7.a) it.next()));
                }
            } else {
                r rVar2 = (r) entry2.getKey();
                Set set = (Set) ((Collection) entry2.getValue());
                o oVar2 = new o();
                oVar2.f4246b = null;
                oVar2.f4245a = Collections.newSetFromMap(new ConcurrentHashMap());
                oVar2.f4245a.addAll(set);
                hashMap.put(rVar2, oVar2);
            }
        }
        return arrayList;
    }
}
