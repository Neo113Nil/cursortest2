package P0;

import J0.r;
import Q0.f;
import Q0.g;
import S0.p;
import b3.e;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import kotlin.jvm.internal.h;

/* loaded from: classes.dex */
public abstract class b {

    /* renamed from: a, reason: collision with root package name */
    public final f f2344a;

    /* renamed from: b, reason: collision with root package name */
    public final ArrayList f2345b;

    /* renamed from: c, reason: collision with root package name */
    public final ArrayList f2346c;

    /* renamed from: d, reason: collision with root package name */
    public Object f2347d;

    /* renamed from: e, reason: collision with root package name */
    public e f2348e;

    public b(f tracker) {
        h.e(tracker, "tracker");
        this.f2344a = tracker;
        this.f2345b = new ArrayList();
        this.f2346c = new ArrayList();
    }

    public abstract boolean a(p pVar);

    public abstract boolean b(Object obj);

    public final void c(Collection workSpecs) {
        h.e(workSpecs, "workSpecs");
        this.f2345b.clear();
        this.f2346c.clear();
        ArrayList arrayList = this.f2345b;
        for (Object obj : workSpecs) {
            if (a((p) obj)) {
                arrayList.add(obj);
            }
        }
        ArrayList arrayList2 = this.f2345b;
        ArrayList arrayList3 = this.f2346c;
        Iterator it = arrayList2.iterator();
        while (it.hasNext()) {
            arrayList3.add(((p) it.next()).f2937a);
        }
        if (this.f2345b.isEmpty()) {
            this.f2344a.b(this);
        } else {
            f fVar = this.f2344a;
            fVar.getClass();
            synchronized (fVar.f2468c) {
                try {
                    if (fVar.f2469d.add(this)) {
                        if (fVar.f2469d.size() == 1) {
                            fVar.f2470e = fVar.a();
                            r.d().a(g.f2471a, fVar.getClass().getSimpleName() + ": initial state = " + fVar.f2470e);
                            fVar.d();
                        }
                        Object obj2 = fVar.f2470e;
                        this.f2347d = obj2;
                        d(this.f2348e, obj2);
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        d(this.f2348e, this.f2347d);
    }

    public final void d(e eVar, Object obj) {
        if (this.f2345b.isEmpty() || eVar == null) {
            return;
        }
        if (obj == null || b(obj)) {
            ArrayList workSpecs = this.f2345b;
            h.e(workSpecs, "workSpecs");
            synchronized (eVar.f5559w) {
                O0.b bVar = (O0.b) eVar.f5557u;
                if (bVar != null) {
                    bVar.e(workSpecs);
                }
            }
            return;
        }
        ArrayList workSpecs2 = this.f2345b;
        h.e(workSpecs2, "workSpecs");
        synchronized (eVar.f5559w) {
            try {
                ArrayList arrayList = new ArrayList();
                Iterator it = workSpecs2.iterator();
                while (it.hasNext()) {
                    Object next = it.next();
                    if (eVar.l(((p) next).f2937a)) {
                        arrayList.add(next);
                    }
                }
                Iterator it2 = arrayList.iterator();
                while (it2.hasNext()) {
                    p pVar = (p) it2.next();
                    r.d().a(O0.c.f2246a, "Constraints met for " + pVar);
                }
                O0.b bVar2 = (O0.b) eVar.f5557u;
                if (bVar2 != null) {
                    bVar2.f(arrayList);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
