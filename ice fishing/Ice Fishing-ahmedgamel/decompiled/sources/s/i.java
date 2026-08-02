package s;

import java.util.Collection;
import java.util.Iterator;

/* loaded from: classes.dex */
public final class i implements Collection {

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ j f40266n;

    public i(j jVar) {
        this.f40266n = jVar;
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
        this.f40266n.b();
    }

    @Override // java.util.Collection
    public final boolean contains(Object obj) {
        return this.f40266n.g(obj) >= 0;
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
        return this.f40266n.e() == 0;
    }

    @Override // java.util.Collection, java.lang.Iterable
    public final Iterator iterator() {
        return new f(this.f40266n, 1);
    }

    @Override // java.util.Collection
    public final boolean remove(Object obj) {
        j jVar = this.f40266n;
        int g9 = jVar.g(obj);
        if (g9 < 0) {
            return false;
        }
        jVar.i(g9);
        return true;
    }

    @Override // java.util.Collection
    public final boolean removeAll(Collection collection) {
        j jVar = this.f40266n;
        int e9 = jVar.e();
        int i = 0;
        boolean z6 = false;
        while (i < e9) {
            if (collection.contains(jVar.c(i, 1))) {
                jVar.i(i);
                i--;
                e9--;
                z6 = true;
            }
            i++;
        }
        return z6;
    }

    @Override // java.util.Collection
    public final boolean retainAll(Collection collection) {
        j jVar = this.f40266n;
        int e9 = jVar.e();
        int i = 0;
        boolean z6 = false;
        while (i < e9) {
            if (!collection.contains(jVar.c(i, 1))) {
                jVar.i(i);
                i--;
                e9--;
                z6 = true;
            }
            i++;
        }
        return z6;
    }

    @Override // java.util.Collection
    public final int size() {
        return this.f40266n.e();
    }

    @Override // java.util.Collection
    public final Object[] toArray() {
        j jVar = this.f40266n;
        int e9 = jVar.e();
        Object[] objArr = new Object[e9];
        for (int i = 0; i < e9; i++) {
            objArr[i] = jVar.c(i, 1);
        }
        return objArr;
    }

    @Override // java.util.Collection
    public final Object[] toArray(Object[] objArr) {
        return this.f40266n.o(objArr, 1);
    }
}
