package s;

import java.util.Collection;
import java.util.Iterator;

/* loaded from: classes.dex */
public final class i implements Collection {

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ j f40399n;

    public i(j jVar) {
        this.f40399n = jVar;
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
        this.f40399n.b();
    }

    @Override // java.util.Collection
    public final boolean contains(Object obj) {
        return this.f40399n.g(obj) >= 0;
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
        return this.f40399n.e() == 0;
    }

    @Override // java.util.Collection, java.lang.Iterable
    public final Iterator iterator() {
        return new f(this.f40399n, 1);
    }

    @Override // java.util.Collection
    public final boolean remove(Object obj) {
        j jVar = this.f40399n;
        int g9 = jVar.g(obj);
        if (g9 < 0) {
            return false;
        }
        jVar.i(g9);
        return true;
    }

    @Override // java.util.Collection
    public final boolean removeAll(Collection collection) {
        j jVar = this.f40399n;
        int e6 = jVar.e();
        int i = 0;
        boolean z8 = false;
        while (i < e6) {
            if (collection.contains(jVar.c(i, 1))) {
                jVar.i(i);
                i--;
                e6--;
                z8 = true;
            }
            i++;
        }
        return z8;
    }

    @Override // java.util.Collection
    public final boolean retainAll(Collection collection) {
        j jVar = this.f40399n;
        int e6 = jVar.e();
        int i = 0;
        boolean z8 = false;
        while (i < e6) {
            if (!collection.contains(jVar.c(i, 1))) {
                jVar.i(i);
                i--;
                e6--;
                z8 = true;
            }
            i++;
        }
        return z8;
    }

    @Override // java.util.Collection
    public final int size() {
        return this.f40399n.e();
    }

    @Override // java.util.Collection
    public final Object[] toArray() {
        j jVar = this.f40399n;
        int e6 = jVar.e();
        Object[] objArr = new Object[e6];
        for (int i = 0; i < e6; i++) {
            objArr[i] = jVar.c(i, 1);
        }
        return objArr;
    }

    @Override // java.util.Collection
    public final Object[] toArray(Object[] objArr) {
        return this.f40399n.o(objArr, 1);
    }
}
