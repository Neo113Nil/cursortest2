package u7;

import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;

/* renamed from: u7.p, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C5098p implements Collection, J7.a {

    /* renamed from: n, reason: collision with root package name */
    public final int[] f41344n;

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
        if (!(obj instanceof C5097o)) {
            return false;
        }
        int i = ((C5097o) obj).f41343n;
        int[] iArr = this.f41344n;
        int length = iArr.length;
        int i6 = 0;
        while (true) {
            if (i6 >= length) {
                i6 = -1;
                break;
            }
            if (i == iArr[i6]) {
                break;
            }
            i6++;
        }
        return i6 >= 0;
    }

    @Override // java.util.Collection
    public final boolean containsAll(Collection elements) {
        kotlin.jvm.internal.h.e(elements, "elements");
        if (!elements.isEmpty()) {
            for (Object obj : elements) {
                if (obj instanceof C5097o) {
                    int i = ((C5097o) obj).f41343n;
                    int[] iArr = this.f41344n;
                    int length = iArr.length;
                    int i6 = 0;
                    while (true) {
                        if (i6 >= length) {
                            i6 = -1;
                            break;
                        }
                        if (i == iArr[i6]) {
                            break;
                        }
                        i6++;
                    }
                    if (i6 >= 0) {
                    }
                }
                return false;
            }
        }
        return true;
    }

    @Override // java.util.Collection
    public final boolean equals(Object obj) {
        if (obj instanceof C5098p) {
            return kotlin.jvm.internal.h.a(this.f41344n, ((C5098p) obj).f41344n);
        }
        return false;
    }

    @Override // java.util.Collection
    public final int hashCode() {
        return Arrays.hashCode(this.f41344n);
    }

    @Override // java.util.Collection
    public final boolean isEmpty() {
        return this.f41344n.length == 0;
    }

    @Override // java.util.Collection, java.lang.Iterable
    public final Iterator iterator() {
        return new c8.g(3, this.f41344n);
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
        return this.f41344n.length;
    }

    @Override // java.util.Collection
    public final Object[] toArray() {
        return kotlin.jvm.internal.h.l(this);
    }

    public final String toString() {
        return "UIntArray(storage=" + Arrays.toString(this.f41344n) + ')';
    }

    @Override // java.util.Collection
    public final Object[] toArray(Object[] array) {
        kotlin.jvm.internal.h.e(array, "array");
        return kotlin.jvm.internal.h.m(this, array);
    }
}
