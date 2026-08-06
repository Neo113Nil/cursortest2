package defpackage;

/* loaded from: classes.dex */
public final class c81 extends defpackage.nBH8hAHy implements java.io.Serializable {
    public static final defpackage.c81 xiZrDbcSW0 = new defpackage.c81(defpackage.rg0.kd6TUFXn);
    public final defpackage.rg0 adDC3e2L;

    public c81() {
        this.adDC3e2L = new defpackage.rg0();
    }

    @Override // defpackage.nBH8hAHy
    public final int IHQe1A4L2xu() {
        return this.adDC3e2L.DFo87pBq1E5;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean add(java.lang.Object obj) {
        return this.adDC3e2L.IHQe1A4L2xu(obj) >= 0;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean addAll(java.util.Collection collection) {
        collection.getClass();
        this.adDC3e2L.r1MBDhnF();
        return super.addAll(collection);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final void clear() {
        this.adDC3e2L.clear();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean contains(java.lang.Object obj) {
        return this.adDC3e2L.containsKey(obj);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean isEmpty() {
        return this.adDC3e2L.isEmpty();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public final java.util.Iterator iterator() {
        defpackage.rg0 rg0Var = this.adDC3e2L;
        rg0Var.getClass();
        return new defpackage.og0(rg0Var, 1);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean remove(java.lang.Object obj) {
        defpackage.rg0 rg0Var = this.adDC3e2L;
        rg0Var.r1MBDhnF();
        int AARZUJiTa = rg0Var.AARZUJiTa(obj);
        if (AARZUJiTa < 0) {
            return false;
        }
        rg0Var.ez2rX8ReCYw(AARZUJiTa);
        return true;
    }

    @Override // java.util.AbstractSet, java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean removeAll(java.util.Collection collection) {
        collection.getClass();
        this.adDC3e2L.r1MBDhnF();
        return super.removeAll(collection);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean retainAll(java.util.Collection collection) {
        collection.getClass();
        this.adDC3e2L.r1MBDhnF();
        return super.retainAll(collection);
    }

    public c81(defpackage.rg0 rg0Var) {
        rg0Var.getClass();
        this.adDC3e2L = rg0Var;
    }
}
