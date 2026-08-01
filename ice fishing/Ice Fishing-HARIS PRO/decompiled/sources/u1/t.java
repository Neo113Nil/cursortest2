package u1;

import java.util.List;
import java.util.ListIterator;

/* loaded from: classes.dex */
public final class t implements ListIterator, E1.a {

    /* renamed from: a, reason: collision with root package name */
    public final ListIterator f4476a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ u f4477b;

    public t(u uVar, int i) {
        this.f4477b = uVar;
        List list = uVar.f4478a;
        if (i >= 0 && i <= uVar.size()) {
            this.f4476a = list.listIterator(uVar.size() - i);
            return;
        }
        throw new IndexOutOfBoundsException("Position index " + i + " must be in range [" + new H1.c(0, uVar.size(), 1) + "].");
    }

    @Override // java.util.ListIterator
    public final void add(Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public final boolean hasNext() {
        return this.f4476a.hasPrevious();
    }

    @Override // java.util.ListIterator
    public final boolean hasPrevious() {
        return this.f4476a.hasNext();
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public final Object next() {
        return this.f4476a.previous();
    }

    @Override // java.util.ListIterator
    public final int nextIndex() {
        return h.E(this.f4477b) - this.f4476a.previousIndex();
    }

    @Override // java.util.ListIterator
    public final Object previous() {
        return this.f4476a.next();
    }

    @Override // java.util.ListIterator
    public final int previousIndex() {
        return h.E(this.f4477b) - this.f4476a.nextIndex();
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.ListIterator
    public final void set(Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
