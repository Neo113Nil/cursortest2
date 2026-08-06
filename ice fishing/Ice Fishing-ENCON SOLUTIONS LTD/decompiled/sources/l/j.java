package l;

import java.util.Collection;
import java.util.Iterator;

/* loaded from: classes.dex */
public final class j implements Collection {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ C0977a f8117a;

    public j(C0977a c0977a) {
        this.f8117a = c0977a;
    }

    @Override // java.util.Collection
    public final boolean add(Object obj) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.Collection
    public final boolean addAll(Collection collection) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.Collection
    public final void clear() {
        this.f8117a.a();
    }

    @Override // java.util.Collection
    public final boolean contains(Object obj) {
        return this.f8117a.f(obj) >= 0;
    }

    @Override // java.util.Collection
    public final boolean containsAll(Collection collection) {
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            if (!contains(it.next())) {
                return false;
            }
        }
        return true;
    }

    @Override // java.util.Collection
    public final boolean isEmpty() {
        return this.f8117a.d() == 0;
    }

    @Override // java.util.Collection, java.lang.Iterable
    public final Iterator iterator() {
        return new g(this.f8117a, 1);
    }

    @Override // java.util.Collection
    public final boolean remove(Object obj) {
        C0977a c0977a = this.f8117a;
        int f2 = c0977a.f(obj);
        if (f2 < 0) {
            return false;
        }
        c0977a.g(f2);
        return true;
    }

    @Override // java.util.Collection
    public final boolean removeAll(Collection collection) {
        C0977a c0977a = this.f8117a;
        int d2 = c0977a.d();
        int i2 = 0;
        boolean z2 = false;
        while (i2 < d2) {
            if (collection.contains(c0977a.b(i2, 1))) {
                c0977a.g(i2);
                i2--;
                d2--;
                z2 = true;
            }
            i2++;
        }
        return z2;
    }

    @Override // java.util.Collection
    public final boolean retainAll(Collection collection) {
        C0977a c0977a = this.f8117a;
        int d2 = c0977a.d();
        int i2 = 0;
        boolean z2 = false;
        while (i2 < d2) {
            if (!collection.contains(c0977a.b(i2, 1))) {
                c0977a.g(i2);
                i2--;
                d2--;
                z2 = true;
            }
            i2++;
        }
        return z2;
    }

    @Override // java.util.Collection
    public final int size() {
        return this.f8117a.d();
    }

    @Override // java.util.Collection
    public final Object[] toArray() {
        C0977a c0977a = this.f8117a;
        int d2 = c0977a.d();
        Object[] objArr = new Object[d2];
        for (int i2 = 0; i2 < d2; i2++) {
            objArr[i2] = c0977a.b(i2, 1);
        }
        return objArr;
    }

    @Override // java.util.Collection
    public final Object[] toArray(Object[] objArr) {
        return this.f8117a.i(1, objArr);
    }
}
