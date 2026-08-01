package u1;

import java.util.ListIterator;
import java.util.NoSuchElementException;

/* loaded from: classes.dex */
public final class a extends D1.a implements ListIterator {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ c f4462d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(c cVar, int i) {
        super(3, cVar);
        this.f4462d = cVar;
        int a2 = cVar.a();
        if (i >= 0 && i <= a2) {
            this.f150b = i;
            return;
        }
        throw new IndexOutOfBoundsException("index: " + i + ", size: " + a2);
    }

    @Override // java.util.ListIterator
    public final void add(Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.ListIterator
    public final boolean hasPrevious() {
        return this.f150b > 0;
    }

    @Override // java.util.ListIterator
    public final int nextIndex() {
        return this.f150b;
    }

    @Override // java.util.ListIterator
    public final Object previous() {
        if (!hasPrevious()) {
            throw new NoSuchElementException();
        }
        int i = this.f150b - 1;
        this.f150b = i;
        return this.f4462d.get(i);
    }

    @Override // java.util.ListIterator
    public final int previousIndex() {
        return this.f150b - 1;
    }

    @Override // java.util.ListIterator
    public final void set(Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
