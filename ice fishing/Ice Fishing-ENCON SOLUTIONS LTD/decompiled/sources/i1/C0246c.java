package i1;

import java.util.ListIterator;
import java.util.NoSuchElementException;

/* renamed from: i1.c, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0246c extends C0245b implements ListIterator {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ AbstractC0248e f3403d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0246c(AbstractC0248e abstractC0248e, int i2) {
        super(abstractC0248e);
        this.f3403d = abstractC0248e;
        int a2 = abstractC0248e.a();
        if (i2 < 0 || i2 > a2) {
            throw new IndexOutOfBoundsException(C1.a.h("index: ", i2, a2, ", size: "));
        }
        this.f3401b = i2;
    }

    @Override // java.util.ListIterator
    public final void add(Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.ListIterator
    public final boolean hasPrevious() {
        return this.f3401b > 0;
    }

    @Override // java.util.ListIterator
    public final int nextIndex() {
        return this.f3401b;
    }

    @Override // java.util.ListIterator
    public final Object previous() {
        if (!hasPrevious()) {
            throw new NoSuchElementException();
        }
        int i2 = this.f3401b - 1;
        this.f3401b = i2;
        return this.f3403d.get(i2);
    }

    @Override // java.util.ListIterator
    public final int previousIndex() {
        return this.f3401b - 1;
    }

    @Override // java.util.ListIterator
    public final void set(Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
