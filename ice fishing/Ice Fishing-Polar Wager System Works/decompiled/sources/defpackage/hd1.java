package defpackage;

/* loaded from: classes.dex */
public final class hd1 implements java.util.Collection, defpackage.g90 {
    public final /* synthetic */ int adDC3e2L = 0;
    public final java.lang.Object xiZrDbcSW0;

    public hd1() {
        int i = defpackage.js0.IHQe1A4L2xu;
        this.xiZrDbcSW0 = new defpackage.hl0(6);
    }

    @Override // java.util.Collection
    public final boolean add(java.lang.Object obj) {
        switch (this.adDC3e2L) {
            case 0:
                return ((defpackage.hl0) this.xiZrDbcSW0).IHQe1A4L2xu(obj);
            default:
                throw new java.lang.UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    @Override // java.util.Collection
    public final boolean addAll(java.util.Collection collection) {
        switch (this.adDC3e2L) {
            case 0:
                throw new java.lang.UnsupportedOperationException("Operation is not supported for read-only collection");
            default:
                throw new java.lang.UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    @Override // java.util.Collection
    public final void clear() {
        switch (this.adDC3e2L) {
            case 0:
                ((defpackage.hl0) this.xiZrDbcSW0).oh6vYeIP();
                return;
            default:
                throw new java.lang.UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    @Override // java.util.Collection
    public final boolean contains(java.lang.Object obj) {
        switch (this.adDC3e2L) {
            case 0:
                return ((defpackage.hl0) this.xiZrDbcSW0).r1MBDhnF(obj);
            default:
                return ((defpackage.nl0) this.xiZrDbcSW0).F7NU4MC0GW(obj);
        }
    }

    @Override // java.util.Collection
    public final boolean containsAll(java.util.Collection collection) {
        int i = this.adDC3e2L;
        java.lang.Object obj = this.xiZrDbcSW0;
        switch (i) {
            case 0:
                java.util.Iterator it = collection.iterator();
                while (it.hasNext()) {
                    if (!((defpackage.hl0) obj).r1MBDhnF(it.next())) {
                        break;
                    }
                }
                break;
            default:
                collection.getClass();
                java.util.Collection collection2 = collection;
                if (!collection2.isEmpty()) {
                    java.util.Iterator it2 = collection2.iterator();
                    while (it2.hasNext()) {
                        if (!((defpackage.nl0) obj).F7NU4MC0GW(it2.next())) {
                            break;
                        }
                    }
                }
                break;
        }
        return true;
    }

    @Override // java.util.Collection
    public final boolean isEmpty() {
        switch (this.adDC3e2L) {
            case 0:
                return ((defpackage.hl0) this.xiZrDbcSW0).AARZUJiTa == 0;
            default:
                return ((defpackage.nl0) this.xiZrDbcSW0).riuEU0zW4();
        }
    }

    @Override // java.util.Collection, java.lang.Iterable
    public final java.util.Iterator iterator() {
        switch (this.adDC3e2L) {
            case 0:
                defpackage.hl0 hl0Var = (defpackage.hl0) this.xiZrDbcSW0;
                hl0Var.getClass();
                return new defpackage.f20(new defpackage.jl0(hl0Var));
            default:
                return defpackage.j70.PAEGRtP0bX(new defpackage.du(this, null, 3));
        }
    }

    @Override // java.util.Collection
    public final boolean remove(java.lang.Object obj) {
        switch (this.adDC3e2L) {
            case 0:
                return ((defpackage.hl0) this.xiZrDbcSW0).AARZUJiTa(obj);
            default:
                throw new java.lang.UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    @Override // java.util.Collection
    public final boolean removeAll(java.util.Collection collection) {
        switch (this.adDC3e2L) {
            case 0:
                return ((defpackage.hl0) this.xiZrDbcSW0).AARZUJiTa(collection);
            default:
                throw new java.lang.UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    @Override // java.util.Collection
    public final boolean removeIf(java.util.function.Predicate predicate) {
        switch (this.adDC3e2L) {
            case 0:
                throw new java.lang.UnsupportedOperationException("Operation is not supported for read-only collection");
            default:
                throw new java.lang.UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    @Override // java.util.Collection
    public final boolean retainAll(java.util.Collection collection) {
        switch (this.adDC3e2L) {
            case 0:
                return ((defpackage.hl0) this.xiZrDbcSW0).riuEU0zW4(collection);
            default:
                throw new java.lang.UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    @Override // java.util.Collection
    public final int size() {
        switch (this.adDC3e2L) {
            case 0:
                return ((defpackage.hl0) this.xiZrDbcSW0).AARZUJiTa;
            default:
                return ((defpackage.nl0) this.xiZrDbcSW0).adDC3e2L;
        }
    }

    @Override // java.util.Collection
    public final java.lang.Object[] toArray(java.lang.Object[] objArr) {
        switch (this.adDC3e2L) {
            case 0:
                break;
            default:
                objArr.getClass();
                break;
        }
        return defpackage.ci0.wKlPRKlRnfqr(this, objArr);
    }

    public hd1(defpackage.nl0 nl0Var) {
        nl0Var.getClass();
        this.xiZrDbcSW0 = nl0Var;
    }

    @Override // java.util.Collection
    public final java.lang.Object[] toArray() {
        switch (this.adDC3e2L) {
        }
        return defpackage.ci0.EoOhNTTfIN7K(this);
    }
}
