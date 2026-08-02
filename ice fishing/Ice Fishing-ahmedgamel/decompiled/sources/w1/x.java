package w1;

import A1.B;
import java.io.File;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.atomic.AtomicReference;
import u1.InterfaceC5066e;

/* loaded from: classes.dex */
public final class x implements InterfaceC5138f, com.bumptech.glide.load.data.c {

    /* renamed from: A, reason: collision with root package name */
    public volatile A1.w f41567A;

    /* renamed from: B, reason: collision with root package name */
    public File f41568B;

    /* renamed from: C, reason: collision with root package name */
    public y f41569C;

    /* renamed from: n, reason: collision with root package name */
    public final h f41570n;

    /* renamed from: u, reason: collision with root package name */
    public final g f41571u;

    /* renamed from: v, reason: collision with root package name */
    public int f41572v;

    /* renamed from: w, reason: collision with root package name */
    public int f41573w = -1;

    /* renamed from: x, reason: collision with root package name */
    public InterfaceC5066e f41574x;

    /* renamed from: y, reason: collision with root package name */
    public List f41575y;

    /* renamed from: z, reason: collision with root package name */
    public int f41576z;

    public x(g gVar, h hVar) {
        this.f41571u = gVar;
        this.f41570n = hVar;
    }

    @Override // w1.InterfaceC5138f
    public final boolean a() {
        List list;
        ArrayList c9;
        ArrayList a9 = this.f41571u.a();
        boolean z6 = false;
        if (!a9.isEmpty()) {
            g gVar = this.f41571u;
            com.bumptech.glide.l a10 = gVar.f41444c.a();
            Class<?> cls = gVar.f41445d.getClass();
            Class cls2 = gVar.f41448g;
            Class cls3 = gVar.f41451k;
            S0.c cVar = a10.f24200h;
            P1.n nVar = (P1.n) ((AtomicReference) cVar.f2902u).getAndSet(null);
            if (nVar == null) {
                nVar = new P1.n(cls, cls2, cls3);
            } else {
                nVar.f2372a = cls;
                nVar.f2373b = cls2;
                nVar.f2374c = cls3;
            }
            synchronized (((s.b) cVar.f2903v)) {
                list = (List) ((s.b) cVar.f2903v).getOrDefault(nVar, null);
            }
            ((AtomicReference) cVar.f2902u).set(nVar);
            List list2 = list;
            if (list == null) {
                ArrayList arrayList = new ArrayList();
                B b9 = a10.f24193a;
                synchronized (b9) {
                    c9 = b9.f12a.c(cls);
                }
                Iterator it = c9.iterator();
                while (it.hasNext()) {
                    Iterator it2 = a10.f24195c.A((Class) it.next(), cls2).iterator();
                    while (it2.hasNext()) {
                        Class cls4 = (Class) it2.next();
                        if (!a10.f24198f.f(cls4, cls3).isEmpty() && !arrayList.contains(cls4)) {
                            arrayList.add(cls4);
                        }
                    }
                }
                S0.c cVar2 = a10.f24200h;
                List unmodifiableList = Collections.unmodifiableList(arrayList);
                synchronized (((s.b) cVar2.f2903v)) {
                    ((s.b) cVar2.f2903v).put(new P1.n(cls, cls2, cls3), unmodifiableList);
                }
                list2 = arrayList;
            }
            if (!list2.isEmpty()) {
                while (true) {
                    List list3 = this.f41575y;
                    if (list3 != null && this.f41576z < list3.size()) {
                        this.f41567A = null;
                        while (!z6 && this.f41576z < this.f41575y.size()) {
                            List list4 = this.f41575y;
                            int i = this.f41576z;
                            this.f41576z = i + 1;
                            A1.x xVar = (A1.x) list4.get(i);
                            File file = this.f41568B;
                            g gVar2 = this.f41571u;
                            this.f41567A = xVar.b(file, gVar2.f41446e, gVar2.f41447f, gVar2.i);
                            if (this.f41567A != null && this.f41571u.c(this.f41567A.f92c.a()) != null) {
                                this.f41567A.f92c.e(this.f41571u.f41455o, this);
                                z6 = true;
                            }
                        }
                        return z6;
                    }
                    int i4 = this.f41573w + 1;
                    this.f41573w = i4;
                    if (i4 >= list2.size()) {
                        int i6 = this.f41572v + 1;
                        this.f41572v = i6;
                        if (i6 >= a9.size()) {
                            break;
                        }
                        this.f41573w = 0;
                    }
                    InterfaceC5066e interfaceC5066e = (InterfaceC5066e) a9.get(this.f41572v);
                    Class cls5 = (Class) list2.get(this.f41573w);
                    u1.l e9 = this.f41571u.e(cls5);
                    g gVar3 = this.f41571u;
                    this.f41569C = new y(gVar3.f41444c.f24179a, interfaceC5066e, gVar3.f41454n, gVar3.f41446e, gVar3.f41447f, e9, cls5, gVar3.i);
                    File a11 = gVar3.f41449h.a().a(this.f41569C);
                    this.f41568B = a11;
                    if (a11 != null) {
                        this.f41574x = interfaceC5066e;
                        this.f41575y = this.f41571u.f41444c.a().f(a11);
                        this.f41576z = 0;
                    }
                }
            } else if (!File.class.equals(this.f41571u.f41451k)) {
                throw new IllegalStateException("Failed to find any load path from " + this.f41571u.f41445d.getClass() + " to " + this.f41571u.f41451k);
            }
        }
        return false;
    }

    @Override // com.bumptech.glide.load.data.c
    public final void c(Exception exc) {
        this.f41570n.b(this.f41569C, exc, this.f41567A.f92c, 4);
    }

    @Override // w1.InterfaceC5138f
    public final void cancel() {
        A1.w wVar = this.f41567A;
        if (wVar != null) {
            wVar.f92c.cancel();
        }
    }

    @Override // com.bumptech.glide.load.data.c
    public final void f(Object obj) {
        this.f41570n.c(this.f41574x, obj, this.f41567A.f92c, 4, this.f41569C);
    }
}
