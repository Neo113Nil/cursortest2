package y1;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* renamed from: y1.v, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C5227v implements com.bumptech.glide.load.data.d, com.bumptech.glide.load.data.c {

    /* renamed from: n, reason: collision with root package name */
    public final ArrayList f41826n;

    /* renamed from: u, reason: collision with root package name */
    public final Z2.e f41827u;

    /* renamed from: v, reason: collision with root package name */
    public int f41828v;

    /* renamed from: w, reason: collision with root package name */
    public com.bumptech.glide.j f41829w;

    /* renamed from: x, reason: collision with root package name */
    public com.bumptech.glide.load.data.c f41830x;

    /* renamed from: y, reason: collision with root package name */
    public List f41831y;

    /* renamed from: z, reason: collision with root package name */
    public boolean f41832z;

    public C5227v(ArrayList arrayList, Z2.e eVar) {
        this.f41827u = eVar;
        if (arrayList.isEmpty()) {
            throw new IllegalArgumentException("Must not be empty.");
        }
        this.f41826n = arrayList;
        this.f41828v = 0;
    }

    @Override // com.bumptech.glide.load.data.d
    public final Class a() {
        return ((com.bumptech.glide.load.data.d) this.f41826n.get(0)).a();
    }

    @Override // com.bumptech.glide.load.data.d
    public final void b() {
        List list = this.f41831y;
        if (list != null) {
            this.f41827u.D(list);
        }
        this.f41831y = null;
        Iterator it = this.f41826n.iterator();
        while (it.hasNext()) {
            ((com.bumptech.glide.load.data.d) it.next()).b();
        }
    }

    @Override // com.bumptech.glide.load.data.c
    public final void c(Exception exc) {
        List list = this.f41831y;
        N1.g.c(list, "Argument must not be null");
        list.add(exc);
        g();
    }

    @Override // com.bumptech.glide.load.data.d
    public final void cancel() {
        this.f41832z = true;
        Iterator it = this.f41826n.iterator();
        while (it.hasNext()) {
            ((com.bumptech.glide.load.data.d) it.next()).cancel();
        }
    }

    @Override // com.bumptech.glide.load.data.d
    public final int d() {
        return ((com.bumptech.glide.load.data.d) this.f41826n.get(0)).d();
    }

    @Override // com.bumptech.glide.load.data.d
    public final void e(com.bumptech.glide.j jVar, com.bumptech.glide.load.data.c cVar) {
        this.f41829w = jVar;
        this.f41830x = cVar;
        this.f41831y = (List) this.f41827u.k();
        ((com.bumptech.glide.load.data.d) this.f41826n.get(this.f41828v)).e(jVar, this);
        if (this.f41832z) {
            cancel();
        }
    }

    @Override // com.bumptech.glide.load.data.c
    public final void f(Object obj) {
        if (obj != null) {
            this.f41830x.f(obj);
        } else {
            g();
        }
    }

    public final void g() {
        if (this.f41832z) {
            return;
        }
        if (this.f41828v < this.f41826n.size() - 1) {
            this.f41828v++;
            e(this.f41829w, this.f41830x);
        } else {
            N1.g.b(this.f41831y);
            this.f41830x.c(new u1.t("Fetch failed", new ArrayList(this.f41831y)));
        }
    }
}
