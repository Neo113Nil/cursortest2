package r;

import java.lang.reflect.Array;
import java.util.Collection;
import java.util.Iterator;

/* renamed from: r.e, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0337e implements Collection {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ C0338f f4308a;

    public C0337e(C0338f c0338f) {
        this.f4308a = c0338f;
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
        this.f4308a.clear();
    }

    @Override // java.util.Collection
    public final boolean contains(Object obj) {
        return this.f4308a.a(obj) >= 0;
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
        return this.f4308a.isEmpty();
    }

    @Override // java.util.Collection, java.lang.Iterable
    public final Iterator iterator() {
        return new C0334b(this.f4308a, 1);
    }

    @Override // java.util.Collection
    public final boolean remove(Object obj) {
        C0338f c0338f = this.f4308a;
        int a2 = c0338f.a(obj);
        if (a2 < 0) {
            return false;
        }
        c0338f.g(a2);
        return true;
    }

    @Override // java.util.Collection
    public final boolean removeAll(Collection collection) {
        C0338f c0338f = this.f4308a;
        int i = c0338f.f4322c;
        int i2 = 0;
        boolean z2 = false;
        while (i2 < i) {
            if (collection.contains(c0338f.i(i2))) {
                c0338f.g(i2);
                i2--;
                i--;
                z2 = true;
            }
            i2++;
        }
        return z2;
    }

    @Override // java.util.Collection
    public final boolean retainAll(Collection collection) {
        C0338f c0338f = this.f4308a;
        int i = c0338f.f4322c;
        int i2 = 0;
        boolean z2 = false;
        while (i2 < i) {
            if (!collection.contains(c0338f.i(i2))) {
                c0338f.g(i2);
                i2--;
                i--;
                z2 = true;
            }
            i2++;
        }
        return z2;
    }

    @Override // java.util.Collection
    public final int size() {
        return this.f4308a.f4322c;
    }

    @Override // java.util.Collection
    public final Object[] toArray() {
        C0338f c0338f = this.f4308a;
        int i = c0338f.f4322c;
        Object[] objArr = new Object[i];
        for (int i2 = 0; i2 < i; i2++) {
            objArr[i2] = c0338f.i(i2);
        }
        return objArr;
    }

    @Override // java.util.Collection
    public final Object[] toArray(Object[] objArr) {
        C0338f c0338f = this.f4308a;
        int i = c0338f.f4322c;
        if (objArr.length < i) {
            objArr = (Object[]) Array.newInstance(objArr.getClass().getComponentType(), i);
        }
        for (int i2 = 0; i2 < i; i2++) {
            objArr[i2] = c0338f.i(i2);
        }
        if (objArr.length > i) {
            objArr[i] = null;
        }
        return objArr;
    }
}
