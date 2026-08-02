package P7;

import java.util.Iterator;

/* loaded from: classes2.dex */
public final class l implements Iterator, J7.a {

    /* renamed from: n, reason: collision with root package name */
    public final Iterator f2457n;

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ e f2458u;

    public l(e eVar) {
        this.f2458u = eVar;
        this.f2457n = eVar.f2448b.iterator();
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f2457n.hasNext();
    }

    @Override // java.util.Iterator
    public final Object next() {
        return this.f2458u.f2449c.invoke(this.f2457n.next());
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
