package defpackage;

import androidx.collection.e;
import java.util.Collection;
import java.util.Iterator;
import java.util.function.Predicate;

/* loaded from: classes10.dex */
public final class uyu0 implements Collection, xfx {
    public final zy40 a;

    public uyu0(int i) {
        int i2 = yb80.a;
        this.a = new zy40((Object) null);
    }

    @Override // java.util.Collection
    public final boolean add(Object obj) {
        return this.a.a(obj);
    }

    @Override // java.util.Collection
    public final boolean addAll(Collection collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Collection
    public final void clear() {
        this.a.b();
    }

    @Override // java.util.Collection
    public final boolean contains(Object obj) {
        return this.a.c(obj);
    }

    @Override // java.util.Collection
    public final boolean containsAll(Collection collection) {
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            if (!this.a.c(it.next())) {
                return false;
            }
        }
        return true;
    }

    @Override // java.util.Collection
    public final boolean isEmpty() {
        return this.a.g == 0;
    }

    @Override // java.util.Collection, java.lang.Iterable
    public final Iterator iterator() {
        zy40 zy40Var = this.a;
        zy40Var.getClass();
        return new e(new az40(zy40Var));
    }

    @Override // java.util.Collection
    public final boolean remove(Object obj) {
        return this.a.g(obj);
    }

    @Override // java.util.Collection
    public final boolean removeAll(Collection collection) {
        return this.a.g(collection);
    }

    @Override // java.util.Collection
    public final boolean removeIf(Predicate predicate) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Collection
    public final boolean retainAll(Collection collection) {
        return this.a.i(collection);
    }

    @Override // java.util.Collection
    public final int size() {
        return this.a.g;
    }

    @Override // java.util.Collection
    public final Object[] toArray() {
        return vng.J(this);
    }

    @Override // java.util.Collection
    public final Object[] toArray(Object[] objArr) {
        return vng.K(this, objArr);
    }

    public uyu0() {
        this(0);
    }
}
