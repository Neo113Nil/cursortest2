package c3;

import java.util.Iterator;
import java.util.ListIterator;
import java.util.NoSuchElementException;

/* loaded from: classes2.dex */
public final class b implements ListIterator, Iterator {

    /* renamed from: n, reason: collision with root package name */
    public final int f5554n;

    /* renamed from: u, reason: collision with root package name */
    public int f5555u;

    /* renamed from: v, reason: collision with root package name */
    public final e f5556v;

    public b(e eVar, int i) {
        int size = eVar.size();
        if (i < 0 || i > size) {
            throw new IndexOutOfBoundsException(com.bumptech.glide.e.n(i, size, "index"));
        }
        this.f5554n = size;
        this.f5555u = i;
        this.f5556v = eVar;
    }

    public final Object a(int i) {
        return this.f5556v.get(i);
    }

    @Override // java.util.ListIterator
    public final void add(Object obj) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public final boolean hasNext() {
        return this.f5555u < this.f5554n;
    }

    @Override // java.util.ListIterator
    public final boolean hasPrevious() {
        return this.f5555u > 0;
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public final Object next() {
        if (!hasNext()) {
            throw new NoSuchElementException();
        }
        int i = this.f5555u;
        this.f5555u = i + 1;
        return a(i);
    }

    @Override // java.util.ListIterator
    public final int nextIndex() {
        return this.f5555u;
    }

    @Override // java.util.ListIterator
    public final Object previous() {
        if (!hasPrevious()) {
            throw new NoSuchElementException();
        }
        int i = this.f5555u - 1;
        this.f5555u = i;
        return a(i);
    }

    @Override // java.util.ListIterator
    public final int previousIndex() {
        return this.f5555u - 1;
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.ListIterator
    public final void set(Object obj) {
        throw new UnsupportedOperationException();
    }
}
