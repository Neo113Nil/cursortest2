package A1;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes.dex */
public final class C implements com.bumptech.glide.load.data.d, com.bumptech.glide.load.data.c {

    /* renamed from: n, reason: collision with root package name */
    public final ArrayList f14n;

    /* renamed from: u, reason: collision with root package name */
    public final b3.e f15u;

    /* renamed from: v, reason: collision with root package name */
    public int f16v;

    /* renamed from: w, reason: collision with root package name */
    public com.bumptech.glide.j f17w;

    /* renamed from: x, reason: collision with root package name */
    public com.bumptech.glide.load.data.c f18x;

    /* renamed from: y, reason: collision with root package name */
    public List f19y;

    /* renamed from: z, reason: collision with root package name */
    public boolean f20z;

    public C(ArrayList arrayList, b3.e eVar) {
        this.f15u = eVar;
        if (arrayList.isEmpty()) {
            throw new IllegalArgumentException("Must not be empty.");
        }
        this.f14n = arrayList;
        this.f16v = 0;
    }

    @Override // com.bumptech.glide.load.data.d
    public final Class a() {
        return ((com.bumptech.glide.load.data.d) this.f14n.get(0)).a();
    }

    @Override // com.bumptech.glide.load.data.d
    public final void b() {
        List list = this.f19y;
        if (list != null) {
            this.f15u.D(list);
        }
        this.f19y = null;
        Iterator it = this.f14n.iterator();
        while (it.hasNext()) {
            ((com.bumptech.glide.load.data.d) it.next()).b();
        }
    }

    @Override // com.bumptech.glide.load.data.c
    public final void c(Exception exc) {
        List list = this.f19y;
        P1.g.c(list, "Argument must not be null");
        list.add(exc);
        g();
    }

    @Override // com.bumptech.glide.load.data.d
    public final void cancel() {
        this.f20z = true;
        Iterator it = this.f14n.iterator();
        while (it.hasNext()) {
            ((com.bumptech.glide.load.data.d) it.next()).cancel();
        }
    }

    @Override // com.bumptech.glide.load.data.d
    public final int d() {
        return ((com.bumptech.glide.load.data.d) this.f14n.get(0)).d();
    }

    @Override // com.bumptech.glide.load.data.d
    public final void e(com.bumptech.glide.j jVar, com.bumptech.glide.load.data.c cVar) {
        this.f17w = jVar;
        this.f18x = cVar;
        this.f19y = (List) this.f15u.k();
        ((com.bumptech.glide.load.data.d) this.f14n.get(this.f16v)).e(jVar, this);
        if (this.f20z) {
            cancel();
        }
    }

    @Override // com.bumptech.glide.load.data.c
    public final void f(Object obj) {
        if (obj != null) {
            this.f18x.f(obj);
        } else {
            g();
        }
    }

    public final void g() {
        if (this.f20z) {
            return;
        }
        if (this.f16v < this.f14n.size() - 1) {
            this.f16v++;
            e(this.f17w, this.f18x);
        } else {
            P1.g.b(this.f19y);
            this.f18x.c(new w1.s("Fetch failed", new ArrayList(this.f19y)));
        }
    }
}
