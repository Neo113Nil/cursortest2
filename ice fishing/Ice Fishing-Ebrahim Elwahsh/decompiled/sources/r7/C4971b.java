package r7;

import java.util.ListIterator;
import java.util.NoSuchElementException;
import t0.AbstractC5051n;

/* renamed from: r7.b, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C4971b extends Y7.g implements ListIterator {

    /* renamed from: w, reason: collision with root package name */
    public final /* synthetic */ AbstractC4973d f40347w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C4971b(AbstractC4973d abstractC4973d, int i) {
        super(6, abstractC4973d);
        this.f40347w = abstractC4973d;
        int a9 = abstractC4973d.a();
        if (i < 0 || i > a9) {
            throw new IndexOutOfBoundsException(AbstractC5051n.c(i, a9, "index: ", ", size: "));
        }
        this.f4052u = i;
    }

    @Override // java.util.ListIterator
    public final void add(Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.ListIterator
    public final boolean hasPrevious() {
        return this.f4052u > 0;
    }

    @Override // java.util.ListIterator
    public final int nextIndex() {
        return this.f4052u;
    }

    @Override // java.util.ListIterator
    public final Object previous() {
        if (!hasPrevious()) {
            throw new NoSuchElementException();
        }
        int i = this.f4052u - 1;
        this.f4052u = i;
        return this.f40347w.get(i);
    }

    @Override // java.util.ListIterator
    public final int previousIndex() {
        return this.f4052u - 1;
    }

    @Override // java.util.ListIterator
    public final void set(Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
