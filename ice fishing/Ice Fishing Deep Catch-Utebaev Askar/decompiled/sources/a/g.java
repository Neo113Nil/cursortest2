package a;

import java.util.Collection;
import java.util.Iterator;

/* JADX INFO: loaded from: classes.dex */
public final class g implements Collection {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ a f27a;

    public g(a aVar) {
        this.f27a = aVar;
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
        this.f27a.f3d.clear();
    }

    @Override // java.util.Collection
    public final boolean contains(Object obj) {
        return this.f27a.f3d.m(obj) >= 0;
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
        return this.f27a.f3d.f10c == 0;
    }

    @Override // java.util.Collection, java.lang.Iterable
    public final Iterator iterator() {
        return new d(this.f27a, 1);
    }

    @Override // java.util.Collection
    public final boolean remove(Object obj) {
        a aVar = this.f27a;
        int iM = aVar.f3d.m(obj);
        if (iM < 0) {
            return false;
        }
        aVar.b(iM);
        return true;
    }

    @Override // java.util.Collection
    public final boolean removeAll(Collection collection) {
        a aVar = this.f27a;
        int i2 = aVar.f3d.f10c;
        int i3 = 0;
        boolean z = false;
        while (i3 < i2) {
            if (collection.contains(aVar.a(i3, 1))) {
                aVar.b(i3);
                i3--;
                i2--;
                z = true;
            }
            i3++;
        }
        return z;
    }

    @Override // java.util.Collection
    public final boolean retainAll(Collection collection) {
        a aVar = this.f27a;
        int i2 = aVar.f3d.f10c;
        int i3 = 0;
        boolean z = false;
        while (i3 < i2) {
            if (!collection.contains(aVar.a(i3, 1))) {
                aVar.b(i3);
                i3--;
                i2--;
                z = true;
            }
            i3++;
        }
        return z;
    }

    @Override // java.util.Collection
    public final int size() {
        return this.f27a.f3d.f10c;
    }

    @Override // java.util.Collection
    public final Object[] toArray() {
        a aVar = this.f27a;
        int i2 = aVar.f3d.f10c;
        Object[] objArr = new Object[i2];
        for (int i3 = 0; i3 < i2; i3++) {
            objArr[i3] = aVar.a(i3, 1);
        }
        return objArr;
    }

    @Override // java.util.Collection
    public final Object[] toArray(Object[] objArr) {
        return this.f27a.d(objArr, 1);
    }
}
