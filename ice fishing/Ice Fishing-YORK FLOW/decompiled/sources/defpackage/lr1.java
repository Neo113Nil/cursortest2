package defpackage;

/* compiled from: r8-map-id-5e15bf382d9e1cc682b2b5d208f848646545054061ee84effb1e415a0540fc32 */
/* loaded from: classes.dex */
public abstract class lr1 implements java.util.Collection, defpackage.nb0 {
    public final /* synthetic */ int WDYagTQQm9ns = 1;

    public abstract int ZpBGe2uQfcn8();

    @Override // java.util.Collection
    public boolean add(java.lang.Object obj) {
        throw new java.lang.UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Collection
    public boolean addAll(java.util.Collection collection) {
        throw new java.lang.UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Collection
    public void clear() {
        throw new java.lang.UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Collection, java.util.List
    public boolean contains(java.lang.Object obj) {
        if (isEmpty()) {
            return false;
        }
        java.util.Iterator<E> it = iterator();
        while (it.hasNext()) {
            if (defpackage.ma0.QiMR8OkAhezm(it.next(), obj)) {
                return true;
            }
        }
        return false;
    }

    @Override // java.util.Collection, java.util.List
    public boolean containsAll(java.util.Collection collection) {
        collection.getClass();
        java.util.Collection collection2 = collection;
        if (collection2.isEmpty()) {
            return true;
        }
        java.util.Iterator it = collection2.iterator();
        while (it.hasNext()) {
            if (!contains(it.next())) {
                return false;
            }
        }
        return true;
    }

    @Override // java.util.Collection
    public boolean isEmpty() {
        return ZpBGe2uQfcn8() == 0;
    }

    @Override // java.util.Collection
    public boolean remove(java.lang.Object obj) {
        throw new java.lang.UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Collection
    public boolean removeAll(java.util.Collection collection) {
        throw new java.lang.UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Collection
    public boolean retainAll(java.util.Collection collection) {
        throw new java.lang.UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Collection
    public /* bridge */ int size() {
        return ZpBGe2uQfcn8();
    }

    @Override // java.util.Collection
    public java.lang.Object[] toArray(java.lang.Object[] objArr) {
        objArr.getClass();
        return defpackage.i61.Mearx7yMn90V(this, objArr);
    }

    public java.lang.String toString() {
        switch (this.WDYagTQQm9ns) {
            case 1:
                return defpackage.hf.m6iZQUu7XjoL(this, ", ", "[", "]", new defpackage.fNwYGHIYeJcR(0, this), 24);
            default:
                return super.toString();
        }
    }

    @Override // java.util.Collection
    public java.lang.Object[] toArray() {
        return defpackage.i61.jjTN4uUnoyEn(this);
    }
}
