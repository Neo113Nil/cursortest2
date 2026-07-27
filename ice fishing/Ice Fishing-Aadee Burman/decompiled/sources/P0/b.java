package P0;

import J0.s;
import Q0.f;
import Q0.g;
import S0.p;
import Z2.e;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import kotlin.jvm.internal.h;

/* loaded from: classes.dex */
public abstract class b {

    /* renamed from: a, reason: collision with root package name */
    public final f f2413a;

    /* renamed from: b, reason: collision with root package name */
    public final ArrayList f2414b;

    /* renamed from: c, reason: collision with root package name */
    public final ArrayList f2415c;

    /* renamed from: d, reason: collision with root package name */
    public Object f2416d;

    /* renamed from: e, reason: collision with root package name */
    public e f2417e;

    public b(f tracker) {
        h.e(tracker, "tracker");
        this.f2413a = tracker;
        this.f2414b = new ArrayList();
        this.f2415c = new ArrayList();
    }

    public abstract boolean a(p pVar);

    public abstract boolean b(Object obj);

    public final void c(Collection workSpecs) {
        h.e(workSpecs, "workSpecs");
        this.f2414b.clear();
        this.f2415c.clear();
        ArrayList arrayList = this.f2414b;
        for (Object obj : workSpecs) {
            if (a((p) obj)) {
                arrayList.add(obj);
            }
        }
        ArrayList arrayList2 = this.f2414b;
        ArrayList arrayList3 = this.f2415c;
        Iterator it = arrayList2.iterator();
        while (it.hasNext()) {
            arrayList3.add(((p) it.next()).f2808a);
        }
        if (this.f2414b.isEmpty()) {
            this.f2413a.b(this);
        } else {
            f fVar = this.f2413a;
            fVar.getClass();
            synchronized (fVar.f2633c) {
                try {
                    if (fVar.f2634d.add(this)) {
                        if (fVar.f2634d.size() == 1) {
                            fVar.f2635e = fVar.a();
                            s.d().a(g.f2636a, fVar.getClass().getSimpleName() + ": initial state = " + fVar.f2635e);
                            fVar.d();
                        }
                        Object obj2 = fVar.f2635e;
                        this.f2416d = obj2;
                        d(this.f2417e, obj2);
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        d(this.f2417e, this.f2416d);
    }

    public final void d(e eVar, Object obj) {
        if (this.f2414b.isEmpty() || eVar == null) {
            return;
        }
        if (obj == null || b(obj)) {
            ArrayList workSpecs = this.f2414b;
            h.e(workSpecs, "workSpecs");
            synchronized (eVar.f4172w) {
                O0.b bVar = (O0.b) eVar.f4170u;
                if (bVar != null) {
                    bVar.e(workSpecs);
                }
            }
            return;
        }
        ArrayList workSpecs2 = this.f2414b;
        h.e(workSpecs2, "workSpecs");
        synchronized (eVar.f4172w) {
            try {
                ArrayList arrayList = new ArrayList();
                Iterator it = workSpecs2.iterator();
                while (it.hasNext()) {
                    Object next = it.next();
                    if (eVar.l(((p) next).f2808a)) {
                        arrayList.add(next);
                    }
                }
                Iterator it2 = arrayList.iterator();
                while (it2.hasNext()) {
                    p pVar = (p) it2.next();
                    s.d().a(O0.c.f2158a, "Constraints met for " + pVar);
                }
                O0.b bVar2 = (O0.b) eVar.f4170u;
                if (bVar2 != null) {
                    bVar2.f(arrayList);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
