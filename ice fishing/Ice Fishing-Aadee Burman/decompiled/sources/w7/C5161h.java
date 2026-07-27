package w7;

import java.util.AbstractCollection;
import java.util.Collection;
import java.util.Iterator;

/* renamed from: w7.h, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C5161h extends AbstractCollection implements Collection, J7.b {

    /* renamed from: n, reason: collision with root package name */
    public final C5159f f41690n;

    public C5161h(C5159f c5159f) {
        this.f41690n = c5159f;
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final boolean add(Object obj) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final boolean addAll(Collection elements) {
        kotlin.jvm.internal.h.e(elements, "elements");
        throw new UnsupportedOperationException();
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final void clear() {
        this.f41690n.clear();
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final boolean contains(Object obj) {
        return this.f41690n.containsValue(obj);
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final boolean isEmpty() {
        return this.f41690n.isEmpty();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
    public final Iterator iterator() {
        C5159f c5159f = this.f41690n;
        c5159f.getClass();
        return new C5157d(c5159f, 2);
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final boolean remove(Object obj) {
        C5159f c5159f = this.f41690n;
        c5159f.d();
        int j6 = c5159f.j(obj);
        if (j6 < 0) {
            return false;
        }
        c5159f.m(j6);
        return true;
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final boolean removeAll(Collection elements) {
        kotlin.jvm.internal.h.e(elements, "elements");
        this.f41690n.d();
        return super.removeAll(elements);
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final boolean retainAll(Collection elements) {
        kotlin.jvm.internal.h.e(elements, "elements");
        this.f41690n.d();
        return super.retainAll(elements);
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final int size() {
        return this.f41690n.f41676B;
    }
}
