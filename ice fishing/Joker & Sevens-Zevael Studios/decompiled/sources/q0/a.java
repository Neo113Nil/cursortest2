package q0;

import java.util.ListIterator;

/* compiled from: r8-map-id-9ca073bbfde00f50be8682633edd5c48170ffeeeebc591f4c22ad3deaafa0d20 */
/* loaded from: classes.dex */
public abstract class a implements ListIterator, qc.a {

    /* renamed from: g, reason: collision with root package name */
    public int f5696g;

    /* renamed from: h, reason: collision with root package name */
    public int f5697h;

    public a(int i10, int i11) {
        this.f5696g = i10;
        this.f5697h = i11;
    }

    @Override // java.util.ListIterator
    public void add(Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public final boolean hasNext() {
        return this.f5696g < this.f5697h;
    }

    @Override // java.util.ListIterator
    public final boolean hasPrevious() {
        return this.f5696g > 0;
    }

    @Override // java.util.ListIterator
    public final int nextIndex() {
        return this.f5696g;
    }

    @Override // java.util.ListIterator
    public final int previousIndex() {
        return this.f5696g - 1;
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.ListIterator
    public void set(Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
