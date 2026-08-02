package u7;

import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;

/* renamed from: u7.p, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C5090p implements Collection, J7.a {

    /* renamed from: n, reason: collision with root package name */
    public final int[] f41067n;

    @Override // java.util.Collection
    public final /* bridge */ /* synthetic */ boolean add(Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Collection
    public final boolean addAll(Collection collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Collection
    public final void clear() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Collection
    public final boolean contains(Object obj) {
        if (!(obj instanceof C5089o)) {
            return false;
        }
        int i = ((C5089o) obj).f41066n;
        int[] iArr = this.f41067n;
        int length = iArr.length;
        int i4 = 0;
        while (true) {
            if (i4 >= length) {
                i4 = -1;
                break;
            }
            if (i == iArr[i4]) {
                break;
            }
            i4++;
        }
        return i4 >= 0;
    }

    @Override // java.util.Collection
    public final boolean containsAll(Collection elements) {
        kotlin.jvm.internal.h.e(elements, "elements");
        if (!elements.isEmpty()) {
            for (Object obj : elements) {
                if (obj instanceof C5089o) {
                    int i = ((C5089o) obj).f41066n;
                    int[] iArr = this.f41067n;
                    int length = iArr.length;
                    int i4 = 0;
                    while (true) {
                        if (i4 >= length) {
                            i4 = -1;
                            break;
                        }
                        if (i == iArr[i4]) {
                            break;
                        }
                        i4++;
                    }
                    if (i4 >= 0) {
                    }
                }
                return false;
            }
        }
        return true;
    }

    @Override // java.util.Collection
    public final boolean equals(Object obj) {
        if (obj instanceof C5090p) {
            return kotlin.jvm.internal.h.a(this.f41067n, ((C5090p) obj).f41067n);
        }
        return false;
    }

    @Override // java.util.Collection
    public final int hashCode() {
        return Arrays.hashCode(this.f41067n);
    }

    @Override // java.util.Collection
    public final boolean isEmpty() {
        return this.f41067n.length == 0;
    }

    @Override // java.util.Collection, java.lang.Iterable
    public final Iterator iterator() {
        return new c8.g(3, this.f41067n);
    }

    @Override // java.util.Collection
    public final boolean remove(Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Collection
    public final boolean removeAll(Collection collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Collection
    public final boolean retainAll(Collection collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Collection
    public final int size() {
        return this.f41067n.length;
    }

    @Override // java.util.Collection
    public final Object[] toArray() {
        return kotlin.jvm.internal.h.l(this);
    }

    public final String toString() {
        return "UIntArray(storage=" + Arrays.toString(this.f41067n) + ')';
    }

    @Override // java.util.Collection
    public final Object[] toArray(Object[] array) {
        kotlin.jvm.internal.h.e(array, "array");
        return kotlin.jvm.internal.h.m(this, array);
    }
}
