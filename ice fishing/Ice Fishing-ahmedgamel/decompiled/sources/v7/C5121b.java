package v7;

import java.util.ListIterator;
import java.util.NoSuchElementException;

/* renamed from: v7.b, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C5121b extends c8.g implements ListIterator {

    /* renamed from: w, reason: collision with root package name */
    public final /* synthetic */ AbstractC5123d f41431w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C5121b(AbstractC5123d abstractC5123d, int i) {
        super(6, abstractC5123d);
        this.f41431w = abstractC5123d;
        int a9 = abstractC5123d.a();
        if (i < 0 || i > a9) {
            throw new IndexOutOfBoundsException(u1.h.c(i, a9, "index: ", ", size: "));
        }
        this.f5647u = i;
    }

    @Override // java.util.ListIterator
    public final void add(Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.ListIterator
    public final boolean hasPrevious() {
        return this.f5647u > 0;
    }

    @Override // java.util.ListIterator
    public final int nextIndex() {
        return this.f5647u;
    }

    @Override // java.util.ListIterator
    public final Object previous() {
        if (!hasPrevious()) {
            throw new NoSuchElementException();
        }
        int i = this.f5647u - 1;
        this.f5647u = i;
        return this.f41431w.get(i);
    }

    @Override // java.util.ListIterator
    public final int previousIndex() {
        return this.f5647u - 1;
    }

    @Override // java.util.ListIterator
    public final void set(Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
