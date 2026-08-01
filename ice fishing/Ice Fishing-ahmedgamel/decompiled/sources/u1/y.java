package u1;

import java.io.File;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.atomic.AtomicReference;
import s1.InterfaceC4970e;
import y1.C5222q;
import y1.C5226u;
import y1.InterfaceC5223r;

/* loaded from: classes.dex */
public final class y implements InterfaceC5067f, com.bumptech.glide.load.data.c {

    /* renamed from: A, reason: collision with root package name */
    public volatile C5222q f41184A;

    /* renamed from: B, reason: collision with root package name */
    public File f41185B;

    /* renamed from: C, reason: collision with root package name */
    public z f41186C;

    /* renamed from: n, reason: collision with root package name */
    public final i f41187n;

    /* renamed from: u, reason: collision with root package name */
    public final g f41188u;

    /* renamed from: v, reason: collision with root package name */
    public int f41189v;

    /* renamed from: w, reason: collision with root package name */
    public int f41190w = -1;

    /* renamed from: x, reason: collision with root package name */
    public InterfaceC4970e f41191x;

    /* renamed from: y, reason: collision with root package name */
    public List f41192y;

    /* renamed from: z, reason: collision with root package name */
    public int f41193z;

    public y(g gVar, i iVar) {
        this.f41188u = gVar;
        this.f41187n = iVar;
    }

    @Override // u1.InterfaceC5067f
    public final boolean b() {
        List list;
        ArrayList c9;
        ArrayList a9 = this.f41188u.a();
        boolean z3 = false;
        if (!a9.isEmpty()) {
            g gVar = this.f41188u;
            com.bumptech.glide.l a10 = gVar.f41061c.a();
            Class<?> cls = gVar.f41062d.getClass();
            Class cls2 = gVar.f41065g;
            Class cls3 = gVar.f41068k;
            S0.e eVar = a10.f23413h;
            N1.n nVar = (N1.n) ((AtomicReference) eVar.f2781u).getAndSet(null);
            if (nVar == null) {
                nVar = new N1.n(cls, cls2, cls3);
            } else {
                nVar.f1928a = cls;
                nVar.f1929b = cls2;
                nVar.f1930c = cls3;
            }
            synchronized (((s.b) eVar.f2782v)) {
                list = (List) ((s.b) eVar.f2782v).getOrDefault(nVar, null);
            }
            ((AtomicReference) eVar.f2781u).set(nVar);
            List list2 = list;
            if (list == null) {
                ArrayList arrayList = new ArrayList();
                C5226u c5226u = a10.f23406a;
                synchronized (c5226u) {
                    c9 = c5226u.f41824a.c(cls);
                }
                Iterator it = c9.iterator();
                while (it.hasNext()) {
                    Iterator it2 = a10.f23408c.E((Class) it.next(), cls2).iterator();
                    while (it2.hasNext()) {
                        Class cls4 = (Class) it2.next();
                        if (!a10.f23411f.c(cls4, cls3).isEmpty() && !arrayList.contains(cls4)) {
                            arrayList.add(cls4);
                        }
                    }
                }
                S0.e eVar2 = a10.f23413h;
                List unmodifiableList = Collections.unmodifiableList(arrayList);
                synchronized (((s.b) eVar2.f2782v)) {
                    ((s.b) eVar2.f2782v).put(new N1.n(cls, cls2, cls3), unmodifiableList);
                }
                list2 = arrayList;
            }
            if (!list2.isEmpty()) {
                while (true) {
                    List list3 = this.f41192y;
                    if (list3 != null && this.f41193z < list3.size()) {
                        this.f41184A = null;
                        while (!z3 && this.f41193z < this.f41192y.size()) {
                            List list4 = this.f41192y;
                            int i = this.f41193z;
                            this.f41193z = i + 1;
                            InterfaceC5223r interfaceC5223r = (InterfaceC5223r) list4.get(i);
                            File file = this.f41185B;
                            g gVar2 = this.f41188u;
                            this.f41184A = interfaceC5223r.b(file, gVar2.f41063e, gVar2.f41064f, gVar2.i);
                            if (this.f41184A != null && this.f41188u.c(this.f41184A.f41822c.a()) != null) {
                                this.f41184A.f41822c.e(this.f41188u.f41072o, this);
                                z3 = true;
                            }
                        }
                        return z3;
                    }
                    int i6 = this.f41190w + 1;
                    this.f41190w = i6;
                    if (i6 >= list2.size()) {
                        int i9 = this.f41189v + 1;
                        this.f41189v = i9;
                        if (i9 >= a9.size()) {
                            break;
                        }
                        this.f41190w = 0;
                    }
                    InterfaceC4970e interfaceC4970e = (InterfaceC4970e) a9.get(this.f41189v);
                    Class cls5 = (Class) list2.get(this.f41190w);
                    s1.l e9 = this.f41188u.e(cls5);
                    g gVar3 = this.f41188u;
                    this.f41186C = new z(gVar3.f41061c.f23392a, interfaceC4970e, gVar3.f41071n, gVar3.f41063e, gVar3.f41064f, e9, cls5, gVar3.i);
                    File m4 = gVar3.f41066h.a().m(this.f41186C);
                    this.f41185B = m4;
                    if (m4 != null) {
                        this.f41191x = interfaceC4970e;
                        this.f41192y = this.f41188u.f41061c.a().f(m4);
                        this.f41193z = 0;
                    }
                }
            } else if (!File.class.equals(this.f41188u.f41068k)) {
                throw new IllegalStateException("Failed to find any load path from " + this.f41188u.f41062d.getClass() + " to " + this.f41188u.f41068k);
            }
        }
        return false;
    }

    @Override // com.bumptech.glide.load.data.c
    public final void c(Exception exc) {
        this.f41187n.c(this.f41186C, exc, this.f41184A.f41822c, 4);
    }

    @Override // u1.InterfaceC5067f
    public final void cancel() {
        C5222q c5222q = this.f41184A;
        if (c5222q != null) {
            c5222q.f41822c.cancel();
        }
    }

    @Override // com.bumptech.glide.load.data.c
    public final void f(Object obj) {
        this.f41187n.a(this.f41191x, obj, this.f41184A.f41822c, 4, this.f41186C);
    }
}
