package wc;

import java.util.Iterator;

/* compiled from: r8-map-id-9ca073bbfde00f50be8682633edd5c48170ffeeeebc591f4c22ad3deaafa0d20 */
/* loaded from: classes.dex */
public final class j implements Iterator, qc.a {

    /* renamed from: g, reason: collision with root package name */
    public final Iterator f7724g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ d f7725h;

    public j(d dVar) {
        this.f7725h = dVar;
        this.f7724g = new xc.b((d) dVar.f7717b);
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f7724g.hasNext();
    }

    @Override // java.util.Iterator
    public final Object next() {
        return ((i) this.f7725h.f7718c).invoke(this.f7724g.next());
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
