package v7;

import java.util.ListIterator;
import java.util.NoSuchElementException;
import w.AbstractC5128c;

/* renamed from: v7.b, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C5111b extends c8.g implements ListIterator {

    /* renamed from: w, reason: collision with root package name */
    public final /* synthetic */ AbstractC5113d f41210w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C5111b(AbstractC5113d abstractC5113d, int i) {
        super(6, abstractC5113d);
        this.f41210w = abstractC5113d;
        int a9 = abstractC5113d.a();
        if (i < 0 || i > a9) {
            throw new IndexOutOfBoundsException(AbstractC5128c.c(i, a9, "index: ", ", size: "));
        }
        this.f5823u = i;
    }

    @Override // java.util.ListIterator
    public final void add(Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.ListIterator
    public final boolean hasPrevious() {
        return this.f5823u > 0;
    }

    @Override // java.util.ListIterator
    public final int nextIndex() {
        return this.f5823u;
    }

    @Override // java.util.ListIterator
    public final Object previous() {
        if (!hasPrevious()) {
            throw new NoSuchElementException();
        }
        int i = this.f5823u - 1;
        this.f5823u = i;
        return this.f41210w.get(i);
    }

    @Override // java.util.ListIterator
    public final int previousIndex() {
        return this.f5823u - 1;
    }

    @Override // java.util.ListIterator
    public final void set(Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
