package defpackage;

/* loaded from: classes.dex */
public final class tg0 extends defpackage.C0U8sNJm {
    public final defpackage.rg0 adDC3e2L;

    public tg0(defpackage.rg0 rg0Var) {
        this.adDC3e2L = rg0Var;
    }

    @Override // defpackage.C0U8sNJm
    public final int IHQe1A4L2xu() {
        return this.adDC3e2L.DFo87pBq1E5;
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final boolean add(java.lang.Object obj) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final boolean addAll(java.util.Collection collection) {
        collection.getClass();
        throw new java.lang.UnsupportedOperationException();
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final void clear() {
        this.adDC3e2L.clear();
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final boolean contains(java.lang.Object obj) {
        return this.adDC3e2L.containsValue(obj);
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final boolean isEmpty() {
        return this.adDC3e2L.isEmpty();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
    public final java.util.Iterator iterator() {
        defpackage.rg0 rg0Var = this.adDC3e2L;
        rg0Var.getClass();
        return new defpackage.og0(rg0Var, 2);
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final boolean remove(java.lang.Object obj) {
        defpackage.rg0 rg0Var = this.adDC3e2L;
        rg0Var.r1MBDhnF();
        int EXtogiMhuM = rg0Var.EXtogiMhuM(obj);
        if (EXtogiMhuM < 0) {
            return false;
        }
        rg0Var.ez2rX8ReCYw(EXtogiMhuM);
        return true;
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final boolean removeAll(java.util.Collection collection) {
        collection.getClass();
        this.adDC3e2L.r1MBDhnF();
        return super.removeAll(collection);
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final boolean retainAll(java.util.Collection collection) {
        collection.getClass();
        this.adDC3e2L.r1MBDhnF();
        return super.retainAll(collection);
    }
}
