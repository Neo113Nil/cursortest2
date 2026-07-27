package y1;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* renamed from: y1.w, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C5248w implements com.bumptech.glide.load.data.d, com.bumptech.glide.load.data.c {

    /* renamed from: n, reason: collision with root package name */
    public final ArrayList f41863n;

    /* renamed from: u, reason: collision with root package name */
    public final Y2.e f41864u;

    /* renamed from: v, reason: collision with root package name */
    public int f41865v;

    /* renamed from: w, reason: collision with root package name */
    public com.bumptech.glide.j f41866w;

    /* renamed from: x, reason: collision with root package name */
    public com.bumptech.glide.load.data.c f41867x;

    /* renamed from: y, reason: collision with root package name */
    public List f41868y;

    /* renamed from: z, reason: collision with root package name */
    public boolean f41869z;

    public C5248w(ArrayList arrayList, Y2.e eVar) {
        this.f41864u = eVar;
        if (arrayList.isEmpty()) {
            throw new IllegalArgumentException("Must not be empty.");
        }
        this.f41863n = arrayList;
        this.f41865v = 0;
    }

    @Override // com.bumptech.glide.load.data.d
    public final Class a() {
        return ((com.bumptech.glide.load.data.d) this.f41863n.get(0)).a();
    }

    @Override // com.bumptech.glide.load.data.d
    public final void b() {
        List list = this.f41868y;
        if (list != null) {
            this.f41864u.G(list);
        }
        this.f41868y = null;
        Iterator it = this.f41863n.iterator();
        while (it.hasNext()) {
            ((com.bumptech.glide.load.data.d) it.next()).b();
        }
    }

    @Override // com.bumptech.glide.load.data.d
    public final int c() {
        return ((com.bumptech.glide.load.data.d) this.f41863n.get(0)).c();
    }

    @Override // com.bumptech.glide.load.data.d
    public final void cancel() {
        this.f41869z = true;
        Iterator it = this.f41863n.iterator();
        while (it.hasNext()) {
            ((com.bumptech.glide.load.data.d) it.next()).cancel();
        }
    }

    @Override // com.bumptech.glide.load.data.c
    public final void d(Exception exc) {
        List list = this.f41868y;
        N1.g.c(list, "Argument must not be null");
        list.add(exc);
        f();
    }

    @Override // com.bumptech.glide.load.data.d
    public final void e(com.bumptech.glide.j jVar, com.bumptech.glide.load.data.c cVar) {
        this.f41866w = jVar;
        this.f41867x = cVar;
        this.f41868y = (List) this.f41864u.l();
        ((com.bumptech.glide.load.data.d) this.f41863n.get(this.f41865v)).e(jVar, this);
        if (this.f41869z) {
            cancel();
        }
    }

    public final void f() {
        if (this.f41869z) {
            return;
        }
        if (this.f41865v < this.f41863n.size() - 1) {
            this.f41865v++;
            e(this.f41866w, this.f41867x);
        } else {
            N1.g.b(this.f41868y);
            this.f41867x.d(new u1.s("Fetch failed", new ArrayList(this.f41868y)));
        }
    }

    @Override // com.bumptech.glide.load.data.c
    public final void g(Object obj) {
        if (obj != null) {
            this.f41867x.g(obj);
        } else {
            f();
        }
    }
}
