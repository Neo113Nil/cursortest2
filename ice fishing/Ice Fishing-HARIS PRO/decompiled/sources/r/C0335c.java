package r;

import java.lang.reflect.Array;
import java.util.Collection;
import java.util.Iterator;
import java.util.Set;

/* renamed from: r.c, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0335c implements Set {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ C0338f f4303a;

    public C0335c(C0338f c0338f) {
        this.f4303a = c0338f;
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean add(Object obj) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean addAll(Collection collection) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.Set, java.util.Collection
    public final void clear() {
        this.f4303a.clear();
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean contains(Object obj) {
        return this.f4303a.containsKey(obj);
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean containsAll(Collection collection) {
        return this.f4303a.j(collection);
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean equals(Object obj) {
        C0338f c0338f = this.f4303a;
        if (this == obj) {
            return true;
        }
        if (obj instanceof Set) {
            Set set = (Set) obj;
            try {
                if (c0338f.f4322c == set.size()) {
                    if (c0338f.j(set)) {
                        return true;
                    }
                }
            } catch (ClassCastException | NullPointerException unused) {
            }
        }
        return false;
    }

    @Override // java.util.Set, java.util.Collection
    public final int hashCode() {
        C0338f c0338f = this.f4303a;
        int i = 0;
        for (int i2 = c0338f.f4322c - 1; i2 >= 0; i2--) {
            Object f2 = c0338f.f(i2);
            i += f2 == null ? 0 : f2.hashCode();
        }
        return i;
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean isEmpty() {
        return this.f4303a.isEmpty();
    }

    @Override // java.util.Set, java.util.Collection, java.lang.Iterable
    public final Iterator iterator() {
        return new C0334b(this.f4303a, 0);
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean remove(Object obj) {
        C0338f c0338f = this.f4303a;
        int d2 = c0338f.d(obj);
        if (d2 < 0) {
            return false;
        }
        c0338f.g(d2);
        return true;
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean removeAll(Collection collection) {
        return this.f4303a.k(collection);
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean retainAll(Collection collection) {
        C0338f c0338f = this.f4303a;
        int i = c0338f.f4322c;
        for (int i2 = i - 1; i2 >= 0; i2--) {
            if (!collection.contains(c0338f.f(i2))) {
                c0338f.g(i2);
            }
        }
        return i != c0338f.f4322c;
    }

    @Override // java.util.Set, java.util.Collection
    public final int size() {
        return this.f4303a.f4322c;
    }

    @Override // java.util.Set, java.util.Collection
    public final Object[] toArray() {
        C0338f c0338f = this.f4303a;
        int i = c0338f.f4322c;
        Object[] objArr = new Object[i];
        for (int i2 = 0; i2 < i; i2++) {
            objArr[i2] = c0338f.f(i2);
        }
        return objArr;
    }

    @Override // java.util.Set, java.util.Collection
    public final Object[] toArray(Object[] objArr) {
        C0338f c0338f = this.f4303a;
        int i = c0338f.f4322c;
        if (objArr.length < i) {
            objArr = (Object[]) Array.newInstance(objArr.getClass().getComponentType(), i);
        }
        for (int i2 = 0; i2 < i; i2++) {
            objArr[i2] = c0338f.f(i2);
        }
        if (objArr.length > i) {
            objArr[i] = null;
        }
        return objArr;
    }
}
