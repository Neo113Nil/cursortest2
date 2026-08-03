package u4;

import java.util.ArrayList;
import o4.o;
import pc.j;
import v4.e;
import v4.f;
import x4.p;

/* compiled from: r8-map-id-9ca073bbfde00f50be8682633edd5c48170ffeeeebc591f4c22ad3deaafa0d20 */
/* loaded from: classes.dex */
public abstract class b {

    /* renamed from: a, reason: collision with root package name */
    public final e f6689a;

    /* renamed from: b, reason: collision with root package name */
    public final ArrayList f6690b;

    /* renamed from: c, reason: collision with root package name */
    public final ArrayList f6691c;

    /* renamed from: d, reason: collision with root package name */
    public Object f6692d;

    /* renamed from: e, reason: collision with root package name */
    public a5.c f6693e;

    public b(e eVar) {
        j.e(eVar, "tracker");
        this.f6689a = eVar;
        this.f6690b = new ArrayList();
        this.f6691c = new ArrayList();
    }

    public abstract boolean a(p pVar);

    public abstract boolean b(Object obj);

    public final void c(Iterable iterable) {
        j.e(iterable, "workSpecs");
        this.f6690b.clear();
        this.f6691c.clear();
        ArrayList arrayList = this.f6690b;
        for (Object obj : iterable) {
            if (a((p) obj)) {
                arrayList.add(obj);
            }
        }
        ArrayList arrayList2 = this.f6690b;
        ArrayList arrayList3 = this.f6691c;
        int size = arrayList2.size();
        int i10 = 0;
        while (i10 < size) {
            Object obj2 = arrayList2.get(i10);
            i10++;
            arrayList3.add(((p) obj2).f8322a);
        }
        if (this.f6690b.isEmpty()) {
            this.f6689a.b(this);
        } else {
            e eVar = this.f6689a;
            eVar.getClass();
            synchronized (eVar.f7216c) {
                try {
                    if (eVar.f7217d.add(this)) {
                        if (eVar.f7217d.size() == 1) {
                            eVar.f7218e = eVar.a();
                            o.d().a(f.f7219a, eVar.getClass().getSimpleName() + ": initial state = " + eVar.f7218e);
                            eVar.d();
                        }
                        Object obj3 = eVar.f7218e;
                        this.f6692d = obj3;
                        d(this.f6693e, obj3);
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        d(this.f6693e, this.f6692d);
    }

    public final void d(a5.c cVar, Object obj) {
        if (this.f6690b.isEmpty() || cVar == null) {
            return;
        }
        if (obj == null || b(obj)) {
            ArrayList arrayList = this.f6690b;
            j.e(arrayList, "workSpecs");
            synchronized (cVar.f263i) {
                t4.b bVar = (t4.b) cVar.f262h;
                if (bVar != null) {
                    bVar.d(arrayList);
                }
            }
            return;
        }
        ArrayList arrayList2 = this.f6690b;
        j.e(arrayList2, "workSpecs");
        synchronized (cVar.f263i) {
            try {
                ArrayList arrayList3 = new ArrayList();
                int size = arrayList2.size();
                int i10 = 0;
                int i11 = 0;
                while (i11 < size) {
                    Object obj2 = arrayList2.get(i11);
                    i11++;
                    if (cVar.l(((p) obj2).f8322a)) {
                        arrayList3.add(obj2);
                    }
                }
                int size2 = arrayList3.size();
                while (i10 < size2) {
                    Object obj3 = arrayList3.get(i10);
                    i10++;
                    o.d().a(t4.c.f6522a, "Constraints met for " + ((p) obj3));
                }
                t4.b bVar2 = (t4.b) cVar.f262h;
                if (bVar2 != null) {
                    bVar2.e(arrayList3);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
