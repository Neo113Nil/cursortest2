package j1;

import java.util.AbstractCollection;
import java.util.Collection;
import java.util.Iterator;
import kotlin.jvm.internal.i;

/* renamed from: j1.e, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0971e extends AbstractCollection implements Collection {

    /* renamed from: a, reason: collision with root package name */
    public final C0969c f8058a;

    public C0971e(C0969c backing) {
        i.e(backing, "backing");
        this.f8058a = backing;
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final boolean add(Object obj) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final boolean addAll(Collection elements) {
        i.e(elements, "elements");
        throw new UnsupportedOperationException();
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final void clear() {
        this.f8058a.clear();
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final boolean contains(Object obj) {
        return this.f8058a.containsValue(obj);
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final boolean isEmpty() {
        return this.f8058a.isEmpty();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
    public final Iterator iterator() {
        C0969c c0969c = this.f8058a;
        c0969c.getClass();
        return new C0967a(c0969c, 2);
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final boolean remove(Object obj) {
        C0969c c0969c = this.f8058a;
        c0969c.b();
        int h2 = c0969c.h(obj);
        if (h2 < 0) {
            return false;
        }
        c0969c.k(h2);
        return true;
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final boolean removeAll(Collection elements) {
        i.e(elements, "elements");
        this.f8058a.b();
        return super.removeAll(elements);
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final boolean retainAll(Collection elements) {
        i.e(elements, "elements");
        this.f8058a.b();
        return super.retainAll(elements);
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final int size() {
        return this.f8058a.f8051i;
    }
}
