package defpackage;

/* compiled from: r8-map-id-5e15bf382d9e1cc682b2b5d208f848646545054061ee84effb1e415a0540fc32 */
/* loaded from: classes.dex */
public final class qv implements java.util.Set, defpackage.nb0 {
    public final /* synthetic */ int WDYagTQQm9ns;
    public final defpackage.yn0 oh71FJcDz6S2;

    public qv(defpackage.yn0 yn0Var, int i) {
        this.WDYagTQQm9ns = i;
        yn0Var.getClass();
        switch (i) {
            case 1:
                this.oh71FJcDz6S2 = yn0Var;
                break;
            default:
                this.oh71FJcDz6S2 = yn0Var;
                break;
        }
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean add(java.lang.Object obj) {
        switch (this.WDYagTQQm9ns) {
            case 0:
                throw new java.lang.UnsupportedOperationException("Operation is not supported for read-only collection");
            default:
                throw new java.lang.UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean addAll(java.util.Collection collection) {
        switch (this.WDYagTQQm9ns) {
            case 0:
                throw new java.lang.UnsupportedOperationException("Operation is not supported for read-only collection");
            default:
                throw new java.lang.UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    @Override // java.util.Set, java.util.Collection
    public final void clear() {
        switch (this.WDYagTQQm9ns) {
            case 0:
                throw new java.lang.UnsupportedOperationException("Operation is not supported for read-only collection");
            default:
                throw new java.lang.UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean contains(java.lang.Object obj) {
        int i = this.WDYagTQQm9ns;
        defpackage.yn0 yn0Var = this.oh71FJcDz6S2;
        switch (i) {
            case 0:
                if (!(obj instanceof java.util.Map.Entry)) {
                    return false;
                }
                java.util.Map.Entry entry = (java.util.Map.Entry) obj;
                return defpackage.ma0.QiMR8OkAhezm(yn0Var.QiMR8OkAhezm(entry.getKey()), entry.getValue());
            default:
                return yn0Var.fWTAfUmVKrZq(obj);
        }
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean containsAll(java.util.Collection collection) {
        int i = this.WDYagTQQm9ns;
        defpackage.yn0 yn0Var = this.oh71FJcDz6S2;
        collection.getClass();
        switch (i) {
            case 0:
                java.util.Collection<java.util.Map.Entry> collection2 = collection;
                if (!collection2.isEmpty()) {
                    for (java.util.Map.Entry entry : collection2) {
                        if (!defpackage.ma0.QiMR8OkAhezm(yn0Var.QiMR8OkAhezm(entry.getKey()), entry.getValue())) {
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
                        if (!yn0Var.fWTAfUmVKrZq(it.next())) {
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
        switch (this.WDYagTQQm9ns) {
        }
        return this.oh71FJcDz6S2.e6mdH7fiFuta();
    }

    @Override // java.util.Set, java.util.Collection, java.lang.Iterable
    public final java.util.Iterator iterator() {
        defpackage.kl klVar = null;
        switch (this.WDYagTQQm9ns) {
            case 0:
                return defpackage.v70.blKFvluuDQOf(new defpackage.pv(this, klVar, 0));
            default:
                return defpackage.v70.blKFvluuDQOf(new defpackage.pv(this, klVar, 1));
        }
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean remove(java.lang.Object obj) {
        switch (this.WDYagTQQm9ns) {
            case 0:
                throw new java.lang.UnsupportedOperationException("Operation is not supported for read-only collection");
            default:
                throw new java.lang.UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean removeAll(java.util.Collection collection) {
        switch (this.WDYagTQQm9ns) {
            case 0:
                throw new java.lang.UnsupportedOperationException("Operation is not supported for read-only collection");
            default:
                throw new java.lang.UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean retainAll(java.util.Collection collection) {
        switch (this.WDYagTQQm9ns) {
            case 0:
                throw new java.lang.UnsupportedOperationException("Operation is not supported for read-only collection");
            default:
                throw new java.lang.UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    @Override // java.util.Set, java.util.Collection
    public final int size() {
        switch (this.WDYagTQQm9ns) {
        }
        return this.oh71FJcDz6S2.WDYagTQQm9ns;
    }

    @Override // java.util.Set, java.util.Collection
    public final java.lang.Object[] toArray(java.lang.Object[] objArr) {
        switch (this.WDYagTQQm9ns) {
            case 0:
                objArr.getClass();
                break;
            default:
                objArr.getClass();
                break;
        }
        return defpackage.i61.Mearx7yMn90V(this, objArr);
    }

    @Override // java.util.Set, java.util.Collection
    public final java.lang.Object[] toArray() {
        switch (this.WDYagTQQm9ns) {
        }
        return defpackage.i61.jjTN4uUnoyEn(this);
    }
}
