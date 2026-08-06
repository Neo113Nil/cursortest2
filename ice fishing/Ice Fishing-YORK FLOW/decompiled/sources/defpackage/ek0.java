package defpackage;

/* compiled from: r8-map-id-5e15bf382d9e1cc682b2b5d208f848646545054061ee84effb1e415a0540fc32 */
/* loaded from: classes.dex */
public final class ek0 extends java.util.AbstractCollection implements java.util.Collection, defpackage.nb0 {
    public final /* synthetic */ int WDYagTQQm9ns;
    public final java.lang.Object oh71FJcDz6S2;

    public /* synthetic */ ek0(int i, java.lang.Object obj) {
        this.WDYagTQQm9ns = i;
        this.oh71FJcDz6S2 = obj;
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final boolean add(java.lang.Object obj) {
        switch (this.WDYagTQQm9ns) {
            case 0:
                throw new java.lang.UnsupportedOperationException();
            default:
                throw new java.lang.UnsupportedOperationException();
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public boolean addAll(java.util.Collection collection) {
        switch (this.WDYagTQQm9ns) {
            case 0:
                collection.getClass();
                throw new java.lang.UnsupportedOperationException();
            default:
                return super.addAll(collection);
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final void clear() {
        switch (this.WDYagTQQm9ns) {
            case 0:
                ((defpackage.ck0) this.oh71FJcDz6S2).clear();
                break;
            default:
                ((defpackage.zx0) this.oh71FJcDz6S2).clear();
                break;
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final boolean contains(java.lang.Object obj) {
        switch (this.WDYagTQQm9ns) {
            case 0:
                return ((defpackage.ck0) this.oh71FJcDz6S2).containsValue(obj);
            default:
                return ((defpackage.zx0) this.oh71FJcDz6S2).containsValue(obj);
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public boolean isEmpty() {
        switch (this.WDYagTQQm9ns) {
            case 0:
                return ((defpackage.ck0) this.oh71FJcDz6S2).isEmpty();
            default:
                return super.isEmpty();
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
    public final java.util.Iterator iterator() {
        int i = this.WDYagTQQm9ns;
        java.lang.Object obj = this.oh71FJcDz6S2;
        switch (i) {
            case 0:
                defpackage.ck0 ck0Var = (defpackage.ck0) obj;
                ck0Var.getClass();
                return new defpackage.zj0(ck0Var, 2);
            default:
                defpackage.zx0 zx0Var = (defpackage.zx0) obj;
                defpackage.wp1[] wp1VarArr = new defpackage.wp1[8];
                for (int i2 = 0; i2 < 8; i2++) {
                    wp1VarArr[i2] = new defpackage.xp1(2);
                }
                return new defpackage.gy0(zx0Var, wp1VarArr);
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public boolean remove(java.lang.Object obj) {
        switch (this.WDYagTQQm9ns) {
            case 0:
                defpackage.ck0 ck0Var = (defpackage.ck0) this.oh71FJcDz6S2;
                ck0Var.fWTAfUmVKrZq();
                int P05cfTpS5W5L = ck0Var.P05cfTpS5W5L(obj);
                if (P05cfTpS5W5L < 0) {
                    return false;
                }
                ck0Var.Ns0WNyEWdPsk(P05cfTpS5W5L);
                return true;
            default:
                return super.remove(obj);
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public boolean removeAll(java.util.Collection collection) {
        switch (this.WDYagTQQm9ns) {
            case 0:
                collection.getClass();
                ((defpackage.ck0) this.oh71FJcDz6S2).fWTAfUmVKrZq();
                break;
        }
        return super.removeAll(collection);
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public boolean retainAll(java.util.Collection collection) {
        switch (this.WDYagTQQm9ns) {
            case 0:
                collection.getClass();
                ((defpackage.ck0) this.oh71FJcDz6S2).fWTAfUmVKrZq();
                break;
        }
        return super.retainAll(collection);
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final int size() {
        switch (this.WDYagTQQm9ns) {
            case 0:
                return ((defpackage.ck0) this.oh71FJcDz6S2).h3m55N1URyyK;
            default:
                return ((defpackage.zx0) this.oh71FJcDz6S2).e6mdH7fiFuta;
        }
    }
}
