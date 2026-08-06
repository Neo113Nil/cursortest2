package defpackage;

/* loaded from: classes.dex */
public final class eu implements java.util.Set, defpackage.g90 {
    public final /* synthetic */ int adDC3e2L;
    public final defpackage.nl0 xiZrDbcSW0;

    public eu(defpackage.nl0 nl0Var, int i) {
        this.adDC3e2L = i;
        nl0Var.getClass();
        switch (i) {
            case 1:
                this.xiZrDbcSW0 = nl0Var;
                break;
            default:
                this.xiZrDbcSW0 = nl0Var;
                break;
        }
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean add(java.lang.Object obj) {
        switch (this.adDC3e2L) {
            case 0:
                throw new java.lang.UnsupportedOperationException("Operation is not supported for read-only collection");
            default:
                throw new java.lang.UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean addAll(java.util.Collection collection) {
        switch (this.adDC3e2L) {
            case 0:
                throw new java.lang.UnsupportedOperationException("Operation is not supported for read-only collection");
            default:
                throw new java.lang.UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    @Override // java.util.Set, java.util.Collection
    public final void clear() {
        switch (this.adDC3e2L) {
            case 0:
                throw new java.lang.UnsupportedOperationException("Operation is not supported for read-only collection");
            default:
                throw new java.lang.UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean contains(java.lang.Object obj) {
        int i = this.adDC3e2L;
        defpackage.nl0 nl0Var = this.xiZrDbcSW0;
        switch (i) {
            case 0:
                if (!(obj instanceof java.util.Map.Entry)) {
                    return false;
                }
                java.util.Map.Entry entry = (java.util.Map.Entry) obj;
                return defpackage.x70.QoRHpC4k(nl0Var.AARZUJiTa(entry.getKey()), entry.getValue());
            default:
                return nl0Var.r1MBDhnF(obj);
        }
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean containsAll(java.util.Collection collection) {
        int i = this.adDC3e2L;
        defpackage.nl0 nl0Var = this.xiZrDbcSW0;
        collection.getClass();
        switch (i) {
            case 0:
                java.util.Collection<java.util.Map.Entry> collection2 = collection;
                if (!collection2.isEmpty()) {
                    for (java.util.Map.Entry entry : collection2) {
                        if (!defpackage.x70.QoRHpC4k(nl0Var.AARZUJiTa(entry.getKey()), entry.getValue())) {
                            break;
                        }
                    }
                }
                break;
            default:
                java.util.Collection collection3 = collection;
                if (!collection3.isEmpty()) {
                    java.util.Iterator it = collection3.iterator();
                    while (it.hasNext()) {
                        if (!nl0Var.r1MBDhnF(it.next())) {
                            break;
                        }
                    }
                }
                break;
        }
        return true;
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean isEmpty() {
        switch (this.adDC3e2L) {
        }
        return this.xiZrDbcSW0.riuEU0zW4();
    }

    @Override // java.util.Set, java.util.Collection, java.lang.Iterable
    public final java.util.Iterator iterator() {
        defpackage.ej ejVar = null;
        switch (this.adDC3e2L) {
            case 0:
                return defpackage.j70.PAEGRtP0bX(new defpackage.du(this, ejVar, 0));
            default:
                return defpackage.j70.PAEGRtP0bX(new defpackage.du(this, ejVar, 1));
        }
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean remove(java.lang.Object obj) {
        switch (this.adDC3e2L) {
            case 0:
                throw new java.lang.UnsupportedOperationException("Operation is not supported for read-only collection");
            default:
                throw new java.lang.UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean removeAll(java.util.Collection collection) {
        switch (this.adDC3e2L) {
            case 0:
                throw new java.lang.UnsupportedOperationException("Operation is not supported for read-only collection");
            default:
                throw new java.lang.UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean retainAll(java.util.Collection collection) {
        switch (this.adDC3e2L) {
            case 0:
                throw new java.lang.UnsupportedOperationException("Operation is not supported for read-only collection");
            default:
                throw new java.lang.UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    @Override // java.util.Set, java.util.Collection
    public final int size() {
        switch (this.adDC3e2L) {
        }
        return this.xiZrDbcSW0.adDC3e2L;
    }

    @Override // java.util.Set, java.util.Collection
    public final java.lang.Object[] toArray(java.lang.Object[] objArr) {
        switch (this.adDC3e2L) {
            case 0:
                objArr.getClass();
                break;
            default:
                objArr.getClass();
                break;
        }
        return defpackage.ci0.wKlPRKlRnfqr(this, objArr);
    }

    @Override // java.util.Set, java.util.Collection
    public final java.lang.Object[] toArray() {
        switch (this.adDC3e2L) {
        }
        return defpackage.ci0.EoOhNTTfIN7K(this);
    }
}
