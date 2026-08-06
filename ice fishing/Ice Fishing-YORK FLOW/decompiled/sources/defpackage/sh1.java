package defpackage;

/* compiled from: r8-map-id-5e15bf382d9e1cc682b2b5d208f848646545054061ee84effb1e415a0540fc32 */
/* loaded from: classes.dex */
public final class sh1 implements java.util.Collection, defpackage.nb0 {
    public final /* synthetic */ int WDYagTQQm9ns = 0;
    public final java.lang.Object oh71FJcDz6S2;

    public sh1() {
        int i = defpackage.ev0.ZpBGe2uQfcn8;
        this.oh71FJcDz6S2 = new defpackage.tn0(6);
    }

    @Override // java.util.Collection
    public final boolean add(java.lang.Object obj) {
        switch (this.WDYagTQQm9ns) {
            case 0:
                return ((defpackage.tn0) this.oh71FJcDz6S2).ZpBGe2uQfcn8(obj);
            default:
                throw new java.lang.UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    @Override // java.util.Collection
    public final boolean addAll(java.util.Collection collection) {
        switch (this.WDYagTQQm9ns) {
            case 0:
                throw new java.lang.UnsupportedOperationException("Operation is not supported for read-only collection");
            default:
                throw new java.lang.UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    @Override // java.util.Collection
    public final void clear() {
        switch (this.WDYagTQQm9ns) {
            case 0:
                ((defpackage.tn0) this.oh71FJcDz6S2).giKS3J6vZuNy();
                return;
            default:
                throw new java.lang.UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    @Override // java.util.Collection
    public final boolean contains(java.lang.Object obj) {
        switch (this.WDYagTQQm9ns) {
            case 0:
                return ((defpackage.tn0) this.oh71FJcDz6S2).fWTAfUmVKrZq(obj);
            default:
                return ((defpackage.yn0) this.oh71FJcDz6S2).JhCgjQRTAOCT(obj);
        }
    }

    @Override // java.util.Collection
    public final boolean containsAll(java.util.Collection collection) {
        int i = this.WDYagTQQm9ns;
        java.lang.Object obj = this.oh71FJcDz6S2;
        switch (i) {
            case 0:
                java.util.Iterator it = collection.iterator();
                while (it.hasNext()) {
                    if (!((defpackage.tn0) obj).fWTAfUmVKrZq(it.next())) {
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
                        if (!((defpackage.yn0) obj).JhCgjQRTAOCT(it2.next())) {
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
        switch (this.WDYagTQQm9ns) {
            case 0:
                return ((defpackage.tn0) this.oh71FJcDz6S2).QiMR8OkAhezm == 0;
            default:
                return ((defpackage.yn0) this.oh71FJcDz6S2).e6mdH7fiFuta();
        }
    }

    @Override // java.util.Collection, java.lang.Iterable
    public final java.util.Iterator iterator() {
        switch (this.WDYagTQQm9ns) {
            case 0:
                defpackage.tn0 tn0Var = (defpackage.tn0) this.oh71FJcDz6S2;
                tn0Var.getClass();
                return new defpackage.l30(new defpackage.vn0(tn0Var));
            default:
                return defpackage.v70.blKFvluuDQOf(new defpackage.pv(this, null, 3));
        }
    }

    @Override // java.util.Collection
    public final boolean remove(java.lang.Object obj) {
        switch (this.WDYagTQQm9ns) {
            case 0:
                return ((defpackage.tn0) this.oh71FJcDz6S2).QiMR8OkAhezm(obj);
            default:
                throw new java.lang.UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    @Override // java.util.Collection
    public final boolean removeAll(java.util.Collection collection) {
        switch (this.WDYagTQQm9ns) {
            case 0:
                return ((defpackage.tn0) this.oh71FJcDz6S2).QiMR8OkAhezm(collection);
            default:
                throw new java.lang.UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    @Override // java.util.Collection
    public final boolean removeIf(java.util.function.Predicate predicate) {
        switch (this.WDYagTQQm9ns) {
            case 0:
                throw new java.lang.UnsupportedOperationException("Operation is not supported for read-only collection");
            default:
                throw new java.lang.UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    @Override // java.util.Collection
    public final boolean retainAll(java.util.Collection collection) {
        switch (this.WDYagTQQm9ns) {
            case 0:
                return ((defpackage.tn0) this.oh71FJcDz6S2).e6mdH7fiFuta(collection);
            default:
                throw new java.lang.UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    @Override // java.util.Collection
    public final int size() {
        switch (this.WDYagTQQm9ns) {
            case 0:
                return ((defpackage.tn0) this.oh71FJcDz6S2).QiMR8OkAhezm;
            default:
                return ((defpackage.yn0) this.oh71FJcDz6S2).WDYagTQQm9ns;
        }
    }

    @Override // java.util.Collection
    public final java.lang.Object[] toArray(java.lang.Object[] objArr) {
        switch (this.WDYagTQQm9ns) {
            case 0:
                break;
            default:
                objArr.getClass();
                break;
        }
        return defpackage.i61.Mearx7yMn90V(this, objArr);
    }

    public sh1(defpackage.yn0 yn0Var) {
        yn0Var.getClass();
        this.oh71FJcDz6S2 = yn0Var;
    }

    @Override // java.util.Collection
    public final java.lang.Object[] toArray() {
        switch (this.WDYagTQQm9ns) {
        }
        return defpackage.i61.jjTN4uUnoyEn(this);
    }
}
