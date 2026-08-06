package defpackage;

/* loaded from: classes.dex */
public final class sg0 extends defpackage.nBH8hAHy {
    public final /* synthetic */ int adDC3e2L;
    public final defpackage.rg0 xiZrDbcSW0;

    public /* synthetic */ sg0(defpackage.rg0 rg0Var, int i) {
        this.adDC3e2L = i;
        this.xiZrDbcSW0 = rg0Var;
    }

    @Override // defpackage.nBH8hAHy
    public final int IHQe1A4L2xu() {
        switch (this.adDC3e2L) {
        }
        return this.xiZrDbcSW0.DFo87pBq1E5;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean add(java.lang.Object obj) {
        switch (this.adDC3e2L) {
            case 0:
                ((java.util.Map.Entry) obj).getClass();
                throw new java.lang.UnsupportedOperationException();
            default:
                throw new java.lang.UnsupportedOperationException();
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean addAll(java.util.Collection collection) {
        int i = this.adDC3e2L;
        collection.getClass();
        switch (i) {
            case 0:
                throw new java.lang.UnsupportedOperationException();
            default:
                throw new java.lang.UnsupportedOperationException();
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final void clear() {
        switch (this.adDC3e2L) {
            case 0:
                this.xiZrDbcSW0.clear();
                break;
            default:
                this.xiZrDbcSW0.clear();
                break;
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean contains(java.lang.Object obj) {
        int i = this.adDC3e2L;
        defpackage.rg0 rg0Var = this.xiZrDbcSW0;
        switch (i) {
            case 0:
                if (!(obj instanceof java.util.Map.Entry)) {
                    return false;
                }
                java.util.Map.Entry entry = (java.util.Map.Entry) obj;
                rg0Var.getClass();
                int AARZUJiTa = rg0Var.AARZUJiTa(entry.getKey());
                if (AARZUJiTa < 0) {
                    return false;
                }
                java.lang.Object[] objArr = rg0Var.xiZrDbcSW0;
                objArr.getClass();
                return defpackage.x70.QoRHpC4k(objArr[AARZUJiTa], entry.getValue());
            default:
                return rg0Var.containsKey(obj);
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public boolean containsAll(java.util.Collection collection) {
        switch (this.adDC3e2L) {
            case 0:
                collection.getClass();
                return this.xiZrDbcSW0.adDC3e2L(collection);
            default:
                return super.containsAll(collection);
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean isEmpty() {
        switch (this.adDC3e2L) {
        }
        return this.xiZrDbcSW0.isEmpty();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public final java.util.Iterator iterator() {
        int i = this.adDC3e2L;
        defpackage.rg0 rg0Var = this.xiZrDbcSW0;
        switch (i) {
            case 0:
                rg0Var.getClass();
                return new defpackage.og0(rg0Var, 0);
            default:
                rg0Var.getClass();
                return new defpackage.og0(rg0Var, 1);
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean remove(java.lang.Object obj) {
        int i = this.adDC3e2L;
        defpackage.rg0 rg0Var = this.xiZrDbcSW0;
        switch (i) {
            case 0:
                if (obj instanceof java.util.Map.Entry) {
                    java.util.Map.Entry entry = (java.util.Map.Entry) obj;
                    rg0Var.getClass();
                    rg0Var.r1MBDhnF();
                    int AARZUJiTa = rg0Var.AARZUJiTa(entry.getKey());
                    if (AARZUJiTa >= 0) {
                        java.lang.Object[] objArr = rg0Var.xiZrDbcSW0;
                        objArr.getClass();
                        if (defpackage.x70.QoRHpC4k(objArr[AARZUJiTa], entry.getValue())) {
                            rg0Var.ez2rX8ReCYw(AARZUJiTa);
                            break;
                        }
                    }
                }
                break;
            default:
                rg0Var.r1MBDhnF();
                int AARZUJiTa2 = rg0Var.AARZUJiTa(obj);
                if (AARZUJiTa2 >= 0) {
                    rg0Var.ez2rX8ReCYw(AARZUJiTa2);
                    break;
                } else {
                    break;
                }
        }
        return true;
    }

    @Override // java.util.AbstractSet, java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean removeAll(java.util.Collection collection) {
        int i = this.adDC3e2L;
        defpackage.rg0 rg0Var = this.xiZrDbcSW0;
        collection.getClass();
        switch (i) {
            case 0:
                rg0Var.r1MBDhnF();
                break;
            default:
                rg0Var.r1MBDhnF();
                break;
        }
        return super.removeAll(collection);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean retainAll(java.util.Collection collection) {
        int i = this.adDC3e2L;
        defpackage.rg0 rg0Var = this.xiZrDbcSW0;
        collection.getClass();
        switch (i) {
            case 0:
                rg0Var.r1MBDhnF();
                break;
            default:
                rg0Var.r1MBDhnF();
                break;
        }
        return super.retainAll(collection);
    }
}
