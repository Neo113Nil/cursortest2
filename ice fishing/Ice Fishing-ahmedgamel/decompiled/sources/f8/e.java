package f8;

import java.util.Collection;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.function.UnaryOperator;
import v7.AbstractC5129j;

/* loaded from: classes2.dex */
public final class e extends l implements List<l>, J7.a {
    public static final C4517d Companion = new C4517d();

    /* renamed from: n, reason: collision with root package name */
    public final List f37542n;

    public e(List content) {
        kotlin.jvm.internal.h.e(content, "content");
        this.f37542n = content;
    }

    @Override // java.util.List
    public final /* bridge */ /* synthetic */ void add(int i, l lVar) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List
    public final boolean addAll(int i, Collection<? extends l> collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List, java.util.Collection
    public final void clear() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List, java.util.Collection
    public final boolean contains(Object obj) {
        if (!(obj instanceof l)) {
            return false;
        }
        l element = (l) obj;
        kotlin.jvm.internal.h.e(element, "element");
        return this.f37542n.contains(element);
    }

    @Override // java.util.List, java.util.Collection
    public final boolean containsAll(Collection elements) {
        kotlin.jvm.internal.h.e(elements, "elements");
        return this.f37542n.containsAll(elements);
    }

    @Override // java.util.List, java.util.Collection
    public final boolean equals(Object obj) {
        return kotlin.jvm.internal.h.a(this.f37542n, obj);
    }

    @Override // java.util.List
    public final l get(int i) {
        return (l) this.f37542n.get(i);
    }

    @Override // java.util.List, java.util.Collection
    public final int hashCode() {
        return this.f37542n.hashCode();
    }

    @Override // java.util.List
    public final int indexOf(Object obj) {
        if (!(obj instanceof l)) {
            return -1;
        }
        l element = (l) obj;
        kotlin.jvm.internal.h.e(element, "element");
        return this.f37542n.indexOf(element);
    }

    @Override // java.util.List, java.util.Collection
    public final boolean isEmpty() {
        return this.f37542n.isEmpty();
    }

    @Override // java.util.List, java.util.Collection, java.lang.Iterable
    public final Iterator iterator() {
        return this.f37542n.iterator();
    }

    @Override // java.util.List
    public final int lastIndexOf(Object obj) {
        if (!(obj instanceof l)) {
            return -1;
        }
        l element = (l) obj;
        kotlin.jvm.internal.h.e(element, "element");
        return this.f37542n.lastIndexOf(element);
    }

    @Override // java.util.List
    public final ListIterator<l> listIterator() {
        return this.f37542n.listIterator();
    }

    @Override // java.util.List
    public final /* bridge */ /* synthetic */ l remove(int i) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List, java.util.Collection
    public final boolean removeAll(Collection collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List
    public final void replaceAll(UnaryOperator<l> unaryOperator) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List, java.util.Collection
    public final boolean retainAll(Collection collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List
    public final /* bridge */ /* synthetic */ l set(int i, l lVar) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List, java.util.Collection
    public final int size() {
        return this.f37542n.size();
    }

    @Override // java.util.List
    public final void sort(Comparator<? super l> comparator) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List
    public final List<l> subList(int i, int i6) {
        return this.f37542n.subList(i, i6);
    }

    @Override // java.util.List, java.util.Collection
    public final Object[] toArray() {
        return kotlin.jvm.internal.h.l(this);
    }

    public final String toString() {
        return AbstractC5129j.E(this.f37542n, ",", "[", "]", null, 56);
    }

    @Override // java.util.List, java.util.Collection
    public final /* bridge */ /* synthetic */ boolean add(Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List, java.util.Collection
    public final boolean addAll(Collection collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List
    public final ListIterator<l> listIterator(int i) {
        return this.f37542n.listIterator(i);
    }

    @Override // java.util.List, java.util.Collection
    public final boolean remove(Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List, java.util.Collection
    public final Object[] toArray(Object[] array) {
        kotlin.jvm.internal.h.e(array, "array");
        return kotlin.jvm.internal.h.m(this, array);
    }
}
