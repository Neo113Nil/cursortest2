package k;

import D.C0013n;
import java.util.Collection;
import java.util.Iterator;

/* loaded from: classes.dex */
public final class h implements Collection {

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ C0013n f2662e;

    public h(C0013n c0013n) {
        this.f2662e = c0013n;
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
        ((C0189a) this.f2662e.f246d).clear();
    }

    @Override // java.util.Collection
    public final boolean contains(Object obj) {
        return ((C0189a) this.f2662e.f246d).f(obj) >= 0;
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
        return ((C0189a) this.f2662e.f246d).f2669g == 0;
    }

    @Override // java.util.Collection, java.lang.Iterable
    public final Iterator iterator() {
        return new e(this.f2662e, 1);
    }

    @Override // java.util.Collection
    public final boolean remove(Object obj) {
        C0013n c0013n = this.f2662e;
        int f2 = ((C0189a) c0013n.f246d).f(obj);
        if (f2 < 0) {
            return false;
        }
        c0013n.c(f2);
        return true;
    }

    @Override // java.util.Collection
    public final boolean removeAll(Collection collection) {
        C0013n c0013n = this.f2662e;
        int i2 = ((C0189a) c0013n.f246d).f2669g;
        int i3 = 0;
        boolean z2 = false;
        while (i3 < i2) {
            if (collection.contains(c0013n.b(i3, 1))) {
                c0013n.c(i3);
                i3--;
                i2--;
                z2 = true;
            }
            i3++;
        }
        return z2;
    }

    @Override // java.util.Collection
    public final boolean retainAll(Collection collection) {
        C0013n c0013n = this.f2662e;
        int i2 = ((C0189a) c0013n.f246d).f2669g;
        int i3 = 0;
        boolean z2 = false;
        while (i3 < i2) {
            if (!collection.contains(c0013n.b(i3, 1))) {
                c0013n.c(i3);
                i3--;
                i2--;
                z2 = true;
            }
            i3++;
        }
        return z2;
    }

    @Override // java.util.Collection
    public final int size() {
        return ((C0189a) this.f2662e.f246d).f2669g;
    }

    @Override // java.util.Collection
    public final Object[] toArray() {
        C0013n c0013n = this.f2662e;
        int i2 = ((C0189a) c0013n.f246d).f2669g;
        Object[] objArr = new Object[i2];
        for (int i3 = 0; i3 < i2; i3++) {
            objArr[i3] = c0013n.b(i3, 1);
        }
        return objArr;
    }

    @Override // java.util.Collection
    public final Object[] toArray(Object[] objArr) {
        return this.f2662e.k(1, objArr);
    }
}
