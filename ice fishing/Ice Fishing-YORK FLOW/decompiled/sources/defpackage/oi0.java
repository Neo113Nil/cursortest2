package defpackage;

/* compiled from: r8-map-id-5e15bf382d9e1cc682b2b5d208f848646545054061ee84effb1e415a0540fc32 */
/* loaded from: classes.dex */
public final class oi0 implements java.util.Collection, defpackage.nb0 {
    public static final defpackage.oi0 QiMR8OkAhezm = new defpackage.oi0(defpackage.av.WDYagTQQm9ns);
    public final java.util.List WDYagTQQm9ns;
    public final int oh71FJcDz6S2;

    public oi0(java.util.List list) {
        this.WDYagTQQm9ns = list;
        this.oh71FJcDz6S2 = list.size();
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
        if (!(obj instanceof defpackage.ni0)) {
            return false;
        }
        return this.WDYagTQQm9ns.contains((defpackage.ni0) obj);
    }

    @Override // java.util.Collection
    public final boolean containsAll(java.util.Collection collection) {
        return this.WDYagTQQm9ns.containsAll(collection);
    }

    @Override // java.util.Collection
    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof defpackage.oi0) {
            return this.WDYagTQQm9ns.equals(((defpackage.oi0) obj).WDYagTQQm9ns);
        }
        return false;
    }

    @Override // java.util.Collection
    public final int hashCode() {
        return this.WDYagTQQm9ns.hashCode();
    }

    @Override // java.util.Collection
    public final boolean isEmpty() {
        return this.WDYagTQQm9ns.isEmpty();
    }

    @Override // java.util.Collection, java.lang.Iterable
    public final java.util.Iterator iterator() {
        return this.WDYagTQQm9ns.iterator();
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
        return this.oh71FJcDz6S2;
    }

    @Override // java.util.Collection
    public final java.lang.Object[] toArray() {
        return defpackage.i61.jjTN4uUnoyEn(this);
    }

    public final java.lang.String toString() {
        return "LocaleList(localeList=" + this.WDYagTQQm9ns + ')';
    }

    @Override // java.util.Collection
    public final java.lang.Object[] toArray(java.lang.Object[] objArr) {
        return defpackage.i61.Mearx7yMn90V(this, objArr);
    }
}
