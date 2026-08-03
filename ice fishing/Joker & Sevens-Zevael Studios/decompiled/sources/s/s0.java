package s;

import java.util.Collection;
import java.util.Iterator;
import java.util.function.Predicate;

/* compiled from: r8-map-id-9ca073bbfde00f50be8682633edd5c48170ffeeeebc591f4c22ad3deaafa0d20 */
/* loaded from: classes.dex */
public final class s0 implements Collection, qc.a {

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f6339g = 1;

    /* renamed from: h, reason: collision with root package name */
    public final Object f6340h;

    public s0() {
        int i10 = n0.f6307a;
        this.f6340h = new c0(6);
    }

    @Override // java.util.Collection
    public final boolean add(Object obj) {
        switch (this.f6339g) {
            case 0:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
            default:
                return ((c0) this.f6340h).a(obj);
        }
    }

    @Override // java.util.Collection
    public final boolean addAll(Collection collection) {
        switch (this.f6339g) {
            case 0:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
            default:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    @Override // java.util.Collection
    public final void clear() {
        switch (this.f6339g) {
            case 0:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
            default:
                ((c0) this.f6340h).b();
                return;
        }
    }

    @Override // java.util.Collection
    public final boolean contains(Object obj) {
        switch (this.f6339g) {
            case 0:
                return ((g0) this.f6340h).d(obj);
            default:
                return ((c0) this.f6340h).c(obj);
        }
    }

    @Override // java.util.Collection
    public final boolean containsAll(Collection collection) {
        switch (this.f6339g) {
            case 0:
                pc.j.e(collection, "elements");
                Collection collection2 = collection;
                if (!collection2.isEmpty()) {
                    Iterator it = collection2.iterator();
                    while (it.hasNext()) {
                        if (!((g0) this.f6340h).d(it.next())) {
                            break;
                        }
                    }
                    break;
                }
                break;
            default:
                Iterator it2 = collection.iterator();
                while (it2.hasNext()) {
                    if (!((c0) this.f6340h).c(it2.next())) {
                        break;
                    }
                }
                break;
        }
        return true;
    }

    @Override // java.util.Collection
    public final boolean isEmpty() {
        switch (this.f6339g) {
            case 0:
                return ((g0) this.f6340h).i();
            default:
                return ((c0) this.f6340h).f6239g == 0;
        }
    }

    @Override // java.util.Collection, java.lang.Iterable
    public final Iterator iterator() {
        switch (this.f6339g) {
            case 0:
                return uc.e.m(new o0.g(this, null, 3));
            default:
                c0 c0Var = (c0) this.f6340h;
                c0Var.getClass();
                return new e0(new f0(c0Var));
        }
    }

    @Override // java.util.Collection
    public final boolean remove(Object obj) {
        switch (this.f6339g) {
            case 0:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
            default:
                return ((c0) this.f6340h).g(obj);
        }
    }

    @Override // java.util.Collection
    public final boolean removeAll(Collection collection) {
        switch (this.f6339g) {
            case 0:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
            default:
                return ((c0) this.f6340h).g(collection);
        }
    }

    @Override // java.util.Collection
    public final boolean removeIf(Predicate predicate) {
        switch (this.f6339g) {
            case 0:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
            default:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    @Override // java.util.Collection
    public final boolean retainAll(Collection collection) {
        switch (this.f6339g) {
            case 0:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
            default:
                return ((c0) this.f6340h).i(collection);
        }
    }

    @Override // java.util.Collection
    public final int size() {
        switch (this.f6339g) {
            case 0:
                return ((g0) this.f6340h).f6270e;
            default:
                return ((c0) this.f6340h).f6239g;
        }
    }

    @Override // java.util.Collection
    public final Object[] toArray() {
        switch (this.f6339g) {
        }
        return pc.i.a(this);
    }

    @Override // java.util.Collection
    public final Object[] toArray(Object[] objArr) {
        switch (this.f6339g) {
            case 0:
                pc.j.e(objArr, "array");
                break;
        }
        return pc.i.b(this, objArr);
    }

    public s0(g0 g0Var) {
        pc.j.e(g0Var, "parent");
        this.f6340h = g0Var;
    }
}
