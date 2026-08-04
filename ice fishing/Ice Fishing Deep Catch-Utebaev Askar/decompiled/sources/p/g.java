package p;

import java.util.Iterator;

/* JADX INFO: loaded from: classes.dex */
public final class g implements Iterator {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Iterator f233a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ h f234b;

    public g(h hVar) {
        this.f234b = hVar;
        this.f233a = hVar.f235a.iterator();
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f233a.hasNext();
    }

    @Override // java.util.Iterator
    public final Object next() {
        return this.f234b.f236b.invoke(this.f233a.next());
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
