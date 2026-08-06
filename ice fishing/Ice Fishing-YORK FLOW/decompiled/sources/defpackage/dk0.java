package defpackage;

/* compiled from: r8-map-id-5e15bf382d9e1cc682b2b5d208f848646545054061ee84effb1e415a0540fc32 */
/* loaded from: classes.dex */
public final class dk0 extends defpackage.dG7RjM6DqYVL {
    public final /* synthetic */ int WDYagTQQm9ns;
    public final defpackage.ck0 oh71FJcDz6S2;

    public /* synthetic */ dk0(defpackage.ck0 ck0Var, int i) {
        this.WDYagTQQm9ns = i;
        this.oh71FJcDz6S2 = ck0Var;
    }

    @Override // defpackage.dG7RjM6DqYVL
    public final int ZpBGe2uQfcn8() {
        switch (this.WDYagTQQm9ns) {
        }
        return this.oh71FJcDz6S2.h3m55N1URyyK;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean add(java.lang.Object obj) {
        switch (this.WDYagTQQm9ns) {
            case 0:
                ((java.util.Map.Entry) obj).getClass();
                throw new java.lang.UnsupportedOperationException();
            default:
                throw new java.lang.UnsupportedOperationException();
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean addAll(java.util.Collection collection) {
        int i = this.WDYagTQQm9ns;
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
        switch (this.WDYagTQQm9ns) {
            case 0:
                this.oh71FJcDz6S2.clear();
                break;
            default:
                this.oh71FJcDz6S2.clear();
                break;
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean contains(java.lang.Object obj) {
        int i = this.WDYagTQQm9ns;
        defpackage.ck0 ck0Var = this.oh71FJcDz6S2;
        switch (i) {
            case 0:
                if (!(obj instanceof java.util.Map.Entry)) {
                    return false;
                }
                java.util.Map.Entry entry = (java.util.Map.Entry) obj;
                ck0Var.getClass();
                int QiMR8OkAhezm = ck0Var.QiMR8OkAhezm(entry.getKey());
                if (QiMR8OkAhezm < 0) {
                    return false;
                }
                java.lang.Object[] objArr = ck0Var.oh71FJcDz6S2;
                objArr.getClass();
                return defpackage.ma0.QiMR8OkAhezm(objArr[QiMR8OkAhezm], entry.getValue());
            default:
                return ck0Var.containsKey(obj);
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public boolean containsAll(java.util.Collection collection) {
        switch (this.WDYagTQQm9ns) {
            case 0:
                collection.getClass();
                return this.oh71FJcDz6S2.WDYagTQQm9ns(collection);
            default:
                return super.containsAll(collection);
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean isEmpty() {
        switch (this.WDYagTQQm9ns) {
        }
        return this.oh71FJcDz6S2.isEmpty();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public final java.util.Iterator iterator() {
        int i = this.WDYagTQQm9ns;
        defpackage.ck0 ck0Var = this.oh71FJcDz6S2;
        switch (i) {
            case 0:
                ck0Var.getClass();
                return new defpackage.zj0(ck0Var, 0);
            default:
                ck0Var.getClass();
                return new defpackage.zj0(ck0Var, 1);
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean remove(java.lang.Object obj) {
        int i = this.WDYagTQQm9ns;
        defpackage.ck0 ck0Var = this.oh71FJcDz6S2;
        switch (i) {
            case 0:
                if (obj instanceof java.util.Map.Entry) {
                    java.util.Map.Entry entry = (java.util.Map.Entry) obj;
                    ck0Var.getClass();
                    ck0Var.fWTAfUmVKrZq();
                    int QiMR8OkAhezm = ck0Var.QiMR8OkAhezm(entry.getKey());
                    if (QiMR8OkAhezm >= 0) {
                        java.lang.Object[] objArr = ck0Var.oh71FJcDz6S2;
                        objArr.getClass();
                        if (defpackage.ma0.QiMR8OkAhezm(objArr[QiMR8OkAhezm], entry.getValue())) {
                            ck0Var.Ns0WNyEWdPsk(QiMR8OkAhezm);
                            break;
                        }
                    }
                }
                break;
            default:
                ck0Var.fWTAfUmVKrZq();
                int QiMR8OkAhezm2 = ck0Var.QiMR8OkAhezm(obj);
                if (QiMR8OkAhezm2 >= 0) {
                    ck0Var.Ns0WNyEWdPsk(QiMR8OkAhezm2);
                    break;
                } else {
                    break;
                }
        }
        return true;
    }

    @Override // java.util.AbstractSet, java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean removeAll(java.util.Collection collection) {
        int i = this.WDYagTQQm9ns;
        defpackage.ck0 ck0Var = this.oh71FJcDz6S2;
        collection.getClass();
        switch (i) {
            case 0:
                ck0Var.fWTAfUmVKrZq();
                break;
            default:
                ck0Var.fWTAfUmVKrZq();
                break;
        }
        return super.removeAll(collection);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean retainAll(java.util.Collection collection) {
        int i = this.WDYagTQQm9ns;
        defpackage.ck0 ck0Var = this.oh71FJcDz6S2;
        collection.getClass();
        switch (i) {
            case 0:
                ck0Var.fWTAfUmVKrZq();
                break;
            default:
                ck0Var.fWTAfUmVKrZq();
                break;
        }
        return super.retainAll(collection);
    }
}
