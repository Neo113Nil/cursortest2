package P7;

import java.util.Iterator;

/* loaded from: classes2.dex */
public final class l implements Iterator, J7.a {

    /* renamed from: n, reason: collision with root package name */
    public final Iterator f2622n;

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ e f2623u;

    public l(e eVar) {
        this.f2623u = eVar;
        this.f2622n = eVar.f2613b.iterator();
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f2622n.hasNext();
    }

    @Override // java.util.Iterator
    public final Object next() {
        return this.f2623u.f2614c.invoke(this.f2622n.next());
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
