package P0;

import J0.s;
import Q0.f;
import Q0.g;
import S0.p;
import Y2.e;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import kotlin.jvm.internal.h;

/* loaded from: classes.dex */
public abstract class b {

    /* renamed from: a, reason: collision with root package name */
    public final f f2679a;

    /* renamed from: b, reason: collision with root package name */
    public final ArrayList f2680b;

    /* renamed from: c, reason: collision with root package name */
    public final ArrayList f2681c;

    /* renamed from: d, reason: collision with root package name */
    public Object f2682d;

    /* renamed from: e, reason: collision with root package name */
    public e f2683e;

    public b(f tracker) {
        h.e(tracker, "tracker");
        this.f2679a = tracker;
        this.f2680b = new ArrayList();
        this.f2681c = new ArrayList();
    }

    public abstract boolean a(p pVar);

    public abstract boolean b(Object obj);

    public final void c(Collection workSpecs) {
        h.e(workSpecs, "workSpecs");
        this.f2680b.clear();
        this.f2681c.clear();
        ArrayList arrayList = this.f2680b;
        for (Object obj : workSpecs) {
            if (a((p) obj)) {
                arrayList.add(obj);
            }
        }
        ArrayList arrayList2 = this.f2680b;
        ArrayList arrayList3 = this.f2681c;
        Iterator it = arrayList2.iterator();
        while (it.hasNext()) {
            arrayList3.add(((p) it.next()).f2920a);
        }
        if (this.f2680b.isEmpty()) {
            this.f2679a.b(this);
        } else {
            f fVar = this.f2679a;
            fVar.getClass();
            synchronized (fVar.f2703c) {
                try {
                    if (fVar.f2704d.add(this)) {
                        if (fVar.f2704d.size() == 1) {
                            fVar.f2705e = fVar.a();
                            s.d().a(g.f2706a, fVar.getClass().getSimpleName() + ": initial state = " + fVar.f2705e);
                            fVar.d();
                        }
                        Object obj2 = fVar.f2705e;
                        this.f2682d = obj2;
                        d(this.f2683e, obj2);
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        d(this.f2683e, this.f2682d);
    }

    public final void d(e eVar, Object obj) {
        if (this.f2680b.isEmpty() || eVar == null) {
            return;
        }
        if (obj == null || b(obj)) {
            ArrayList workSpecs = this.f2680b;
            h.e(workSpecs, "workSpecs");
            synchronized (eVar.f3965w) {
                O0.b bVar = (O0.b) eVar.f3963u;
                if (bVar != null) {
                    bVar.e(workSpecs);
                }
            }
            return;
        }
        ArrayList workSpecs2 = this.f2680b;
        h.e(workSpecs2, "workSpecs");
        synchronized (eVar.f3965w) {
            try {
                ArrayList arrayList = new ArrayList();
                Iterator it = workSpecs2.iterator();
                while (it.hasNext()) {
                    Object next = it.next();
                    if (eVar.m(((p) next).f2920a)) {
                        arrayList.add(next);
                    }
                }
                Iterator it2 = arrayList.iterator();
                while (it2.hasNext()) {
                    p pVar = (p) it2.next();
                    s.d().a(O0.c.f2344a, "Constraints met for " + pVar);
                }
                O0.b bVar2 = (O0.b) eVar.f3963u;
                if (bVar2 != null) {
                    bVar2.f(arrayList);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
