package L7;

import java.util.Iterator;

/* loaded from: classes2.dex */
public final class l implements Iterator, F7.a {

    /* renamed from: n, reason: collision with root package name */
    public final Iterator f1810n;

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ e f1811u;

    public l(e eVar) {
        this.f1811u = eVar;
        this.f1810n = eVar.f1801b.iterator();
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f1810n.hasNext();
    }

    @Override // java.util.Iterator
    public final Object next() {
        return this.f1811u.f1802c.invoke(this.f1810n.next());
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
