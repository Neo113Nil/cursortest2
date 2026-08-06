package defpackage;

/* loaded from: classes.dex */
public final class ff0 implements java.util.Collection, defpackage.g90 {
    public static final defpackage.ff0 AARZUJiTa = new defpackage.ff0(defpackage.nt.adDC3e2L);
    public final java.util.List adDC3e2L;
    public final int xiZrDbcSW0;

    public ff0(java.util.List list) {
        this.adDC3e2L = list;
        this.xiZrDbcSW0 = list.size();
    }

    @Override // java.util.Collection
    public final /* bridge */ /* synthetic */ boolean add(java.lang.Object obj) {
        throw new java.lang.UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Collection
    public final boolean addAll(java.util.Collection collection) {
        throw new java.lang.UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Collection
    public final void clear() {
        throw new java.lang.UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Collection
    public final boolean contains(java.lang.Object obj) {
        if (!(obj instanceof defpackage.ef0)) {
            return false;
        }
        return this.adDC3e2L.contains((defpackage.ef0) obj);
    }

    @Override // java.util.Collection
    public final boolean containsAll(java.util.Collection collection) {
        return this.adDC3e2L.containsAll(collection);
    }

    @Override // java.util.Collection
    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof defpackage.ff0) {
            return this.adDC3e2L.equals(((defpackage.ff0) obj).adDC3e2L);
        }
        return false;
    }

    @Override // java.util.Collection
    public final int hashCode() {
        return this.adDC3e2L.hashCode();
    }

    @Override // java.util.Collection
    public final boolean isEmpty() {
        return this.adDC3e2L.isEmpty();
    }

    @Override // java.util.Collection, java.lang.Iterable
    public final java.util.Iterator iterator() {
        return this.adDC3e2L.iterator();
    }

    @Override // java.util.Collection
    public final boolean remove(java.lang.Object obj) {
        throw new java.lang.UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Collection
    public final boolean removeAll(java.util.Collection collection) {
        throw new java.lang.UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Collection
    public final boolean removeIf(java.util.function.Predicate predicate) {
        throw new java.lang.UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Collection
    public final boolean retainAll(java.util.Collection collection) {
        throw new java.lang.UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Collection
    public final int size() {
        return this.xiZrDbcSW0;
    }

    @Override // java.util.Collection
    public final java.lang.Object[] toArray() {
        return defpackage.ci0.EoOhNTTfIN7K(this);
    }

    public final java.lang.String toString() {
        return "LocaleList(localeList=" + this.adDC3e2L + ')';
    }

    @Override // java.util.Collection
    public final java.lang.Object[] toArray(java.lang.Object[] objArr) {
        return defpackage.ci0.wKlPRKlRnfqr(this, objArr);
    }
}
