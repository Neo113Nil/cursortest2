package defpackage;

/* compiled from: r8-map-id-5e15bf382d9e1cc682b2b5d208f848646545054061ee84effb1e415a0540fc32 */
/* loaded from: classes.dex */
public final class i50 implements java.util.ListIterator, defpackage.nb0 {
    public int P05cfTpS5W5L;
    public int QiMR8OkAhezm;
    public final /* synthetic */ int WDYagTQQm9ns;
    public final java.lang.Object e6mdH7fiFuta;
    public int oh71FJcDz6S2;

    public i50(defpackage.ff1 ff1Var, int i) {
        this.WDYagTQQm9ns = 3;
        this.e6mdH7fiFuta = ff1Var;
        this.oh71FJcDz6S2 = i - 1;
        this.QiMR8OkAhezm = -1;
        this.P05cfTpS5W5L = defpackage.ok0.hH0RRJrNssvh(ff1Var);
    }

    public void ZpBGe2uQfcn8() {
        int i;
        i = ((java.util.AbstractList) ((defpackage.vh0) this.e6mdH7fiFuta).e6mdH7fiFuta).modCount;
        if (i != this.P05cfTpS5W5L) {
            throw new java.util.ConcurrentModificationException();
        }
    }

    @Override // java.util.ListIterator
    public final void add(java.lang.Object obj) {
        int i;
        int i2;
        int i3 = this.WDYagTQQm9ns;
        java.lang.Object obj2 = this.e6mdH7fiFuta;
        switch (i3) {
            case 0:
                throw new java.lang.UnsupportedOperationException("Operation is not supported for read-only collection");
            case 1:
                ZpBGe2uQfcn8();
                defpackage.vh0 vh0Var = (defpackage.vh0) obj2;
                int i4 = this.oh71FJcDz6S2;
                this.oh71FJcDz6S2 = i4 + 1;
                vh0Var.add(i4, obj);
                this.QiMR8OkAhezm = -1;
                i = ((java.util.AbstractList) vh0Var).modCount;
                this.P05cfTpS5W5L = i;
                return;
            case 2:
                giKS3J6vZuNy();
                defpackage.wh0 wh0Var = (defpackage.wh0) obj2;
                int i5 = this.oh71FJcDz6S2;
                this.oh71FJcDz6S2 = i5 + 1;
                wh0Var.add(i5, obj);
                this.QiMR8OkAhezm = -1;
                i2 = ((java.util.AbstractList) wh0Var).modCount;
                this.P05cfTpS5W5L = i2;
                return;
            default:
                fWTAfUmVKrZq();
                defpackage.ff1 ff1Var = (defpackage.ff1) obj2;
                ff1Var.add(this.oh71FJcDz6S2 + 1, obj);
                this.QiMR8OkAhezm = -1;
                this.oh71FJcDz6S2++;
                this.P05cfTpS5W5L = defpackage.ok0.hH0RRJrNssvh(ff1Var);
                return;
        }
    }

    public void fWTAfUmVKrZq() {
        if (defpackage.ok0.hH0RRJrNssvh((defpackage.ff1) this.e6mdH7fiFuta) != this.P05cfTpS5W5L) {
            throw new java.util.ConcurrentModificationException();
        }
    }

    public void giKS3J6vZuNy() {
        int i;
        i = ((java.util.AbstractList) ((defpackage.wh0) this.e6mdH7fiFuta)).modCount;
        if (i != this.P05cfTpS5W5L) {
            throw new java.util.ConcurrentModificationException();
        }
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public final boolean hasNext() {
        int i = this.WDYagTQQm9ns;
        java.lang.Object obj = this.e6mdH7fiFuta;
        switch (i) {
            case 0:
                if (this.oh71FJcDz6S2 < this.P05cfTpS5W5L) {
                    break;
                }
                break;
            case 1:
                if (this.oh71FJcDz6S2 < ((defpackage.vh0) obj).QiMR8OkAhezm) {
                    break;
                }
                break;
            case 2:
                if (this.oh71FJcDz6S2 < ((defpackage.wh0) obj).oh71FJcDz6S2) {
                    break;
                }
                break;
            default:
                if (this.oh71FJcDz6S2 < ((defpackage.ff1) obj).size() - 1) {
                    break;
                }
                break;
        }
        return true;
    }

    @Override // java.util.ListIterator
    public final boolean hasPrevious() {
        switch (this.WDYagTQQm9ns) {
            case 0:
                if (this.oh71FJcDz6S2 > this.QiMR8OkAhezm) {
                }
                break;
            case 1:
                if (this.oh71FJcDz6S2 > 0) {
                }
                break;
            case 2:
                if (this.oh71FJcDz6S2 > 0) {
                }
                break;
            default:
                if (this.oh71FJcDz6S2 >= 0) {
                }
                break;
        }
        return false;
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public final java.lang.Object next() {
        int i = this.WDYagTQQm9ns;
        java.lang.Object obj = this.e6mdH7fiFuta;
        switch (i) {
            case 0:
                defpackage.sn0 sn0Var = ((defpackage.k50) obj).WDYagTQQm9ns;
                int i2 = this.oh71FJcDz6S2;
                this.oh71FJcDz6S2 = i2 + 1;
                java.lang.Object oh71FJcDz6S2 = sn0Var.oh71FJcDz6S2(i2);
                oh71FJcDz6S2.getClass();
                return (defpackage.ul0) oh71FJcDz6S2;
            case 1:
                ZpBGe2uQfcn8();
                int i3 = this.oh71FJcDz6S2;
                defpackage.vh0 vh0Var = (defpackage.vh0) obj;
                if (i3 >= vh0Var.QiMR8OkAhezm) {
                    defpackage.h7.BHfvd2J71qpO();
                    return null;
                }
                this.oh71FJcDz6S2 = i3 + 1;
                this.QiMR8OkAhezm = i3;
                return vh0Var.WDYagTQQm9ns[vh0Var.oh71FJcDz6S2 + i3];
            case 2:
                giKS3J6vZuNy();
                int i4 = this.oh71FJcDz6S2;
                defpackage.wh0 wh0Var = (defpackage.wh0) obj;
                if (i4 >= wh0Var.oh71FJcDz6S2) {
                    defpackage.h7.BHfvd2J71qpO();
                    return null;
                }
                this.oh71FJcDz6S2 = i4 + 1;
                this.QiMR8OkAhezm = i4;
                return wh0Var.WDYagTQQm9ns[i4];
            default:
                fWTAfUmVKrZq();
                int i5 = this.oh71FJcDz6S2 + 1;
                this.QiMR8OkAhezm = i5;
                defpackage.ff1 ff1Var = (defpackage.ff1) obj;
                defpackage.ok0.h3m55N1URyyK(i5, ff1Var.size());
                java.lang.Object obj2 = ff1Var.get(i5);
                this.oh71FJcDz6S2 = i5;
                return obj2;
        }
    }

    @Override // java.util.ListIterator
    public final int nextIndex() {
        switch (this.WDYagTQQm9ns) {
            case 0:
                return this.oh71FJcDz6S2 - this.QiMR8OkAhezm;
            case 1:
                return this.oh71FJcDz6S2;
            case 2:
                return this.oh71FJcDz6S2;
            default:
                return this.oh71FJcDz6S2 + 1;
        }
    }

    @Override // java.util.ListIterator
    public final java.lang.Object previous() {
        int i = this.WDYagTQQm9ns;
        java.lang.Object obj = this.e6mdH7fiFuta;
        switch (i) {
            case 0:
                defpackage.sn0 sn0Var = ((defpackage.k50) obj).WDYagTQQm9ns;
                int i2 = this.oh71FJcDz6S2 - 1;
                this.oh71FJcDz6S2 = i2;
                java.lang.Object oh71FJcDz6S2 = sn0Var.oh71FJcDz6S2(i2);
                oh71FJcDz6S2.getClass();
                return (defpackage.ul0) oh71FJcDz6S2;
            case 1:
                ZpBGe2uQfcn8();
                int i3 = this.oh71FJcDz6S2;
                if (i3 <= 0) {
                    defpackage.h7.BHfvd2J71qpO();
                    return null;
                }
                int i4 = i3 - 1;
                this.oh71FJcDz6S2 = i4;
                this.QiMR8OkAhezm = i4;
                defpackage.vh0 vh0Var = (defpackage.vh0) obj;
                return vh0Var.WDYagTQQm9ns[vh0Var.oh71FJcDz6S2 + i4];
            case 2:
                giKS3J6vZuNy();
                int i5 = this.oh71FJcDz6S2;
                if (i5 <= 0) {
                    defpackage.h7.BHfvd2J71qpO();
                    return null;
                }
                int i6 = i5 - 1;
                this.oh71FJcDz6S2 = i6;
                this.QiMR8OkAhezm = i6;
                return ((defpackage.wh0) obj).WDYagTQQm9ns[i6];
            default:
                fWTAfUmVKrZq();
                defpackage.ff1 ff1Var = (defpackage.ff1) obj;
                defpackage.ok0.h3m55N1URyyK(this.oh71FJcDz6S2, ff1Var.size());
                int i7 = this.oh71FJcDz6S2;
                this.QiMR8OkAhezm = i7;
                this.oh71FJcDz6S2--;
                return ff1Var.get(i7);
        }
    }

    @Override // java.util.ListIterator
    public final int previousIndex() {
        int i;
        switch (this.WDYagTQQm9ns) {
            case 0:
                return (this.oh71FJcDz6S2 - this.QiMR8OkAhezm) - 1;
            case 1:
                i = this.oh71FJcDz6S2;
                break;
            case 2:
                i = this.oh71FJcDz6S2;
                break;
            default:
                return this.oh71FJcDz6S2;
        }
        return i - 1;
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public final void remove() {
        int i;
        int i2;
        int i3 = this.WDYagTQQm9ns;
        java.lang.Object obj = this.e6mdH7fiFuta;
        switch (i3) {
            case 0:
                throw new java.lang.UnsupportedOperationException("Operation is not supported for read-only collection");
            case 1:
                defpackage.vh0 vh0Var = (defpackage.vh0) obj;
                ZpBGe2uQfcn8();
                int i4 = this.QiMR8OkAhezm;
                if (i4 == -1) {
                    defpackage.h7.P05cfTpS5W5L("Call next() or previous() before removing element from the iterator.");
                    return;
                }
                vh0Var.giKS3J6vZuNy(i4);
                this.oh71FJcDz6S2 = this.QiMR8OkAhezm;
                this.QiMR8OkAhezm = -1;
                i = ((java.util.AbstractList) vh0Var).modCount;
                this.P05cfTpS5W5L = i;
                return;
            case 2:
                defpackage.wh0 wh0Var = (defpackage.wh0) obj;
                giKS3J6vZuNy();
                int i5 = this.QiMR8OkAhezm;
                if (i5 == -1) {
                    defpackage.h7.P05cfTpS5W5L("Call next() or previous() before removing element from the iterator.");
                    return;
                }
                wh0Var.giKS3J6vZuNy(i5);
                this.oh71FJcDz6S2 = this.QiMR8OkAhezm;
                this.QiMR8OkAhezm = -1;
                i2 = ((java.util.AbstractList) wh0Var).modCount;
                this.P05cfTpS5W5L = i2;
                return;
            default:
                fWTAfUmVKrZq();
                defpackage.ff1 ff1Var = (defpackage.ff1) obj;
                ff1Var.remove(this.QiMR8OkAhezm);
                this.oh71FJcDz6S2--;
                this.QiMR8OkAhezm = -1;
                this.P05cfTpS5W5L = defpackage.ok0.hH0RRJrNssvh(ff1Var);
                return;
        }
    }

    @Override // java.util.ListIterator
    public final void set(java.lang.Object obj) {
        int i = this.WDYagTQQm9ns;
        java.lang.Object obj2 = this.e6mdH7fiFuta;
        switch (i) {
            case 0:
                throw new java.lang.UnsupportedOperationException("Operation is not supported for read-only collection");
            case 1:
                ZpBGe2uQfcn8();
                int i2 = this.QiMR8OkAhezm;
                if (i2 != -1) {
                    ((defpackage.vh0) obj2).set(i2, obj);
                    return;
                } else {
                    defpackage.h7.P05cfTpS5W5L("Call next() or previous() before replacing element from the iterator.");
                    return;
                }
            case 2:
                giKS3J6vZuNy();
                int i3 = this.QiMR8OkAhezm;
                if (i3 != -1) {
                    ((defpackage.wh0) obj2).set(i3, obj);
                    return;
                } else {
                    defpackage.h7.P05cfTpS5W5L("Call next() or previous() before replacing element from the iterator.");
                    return;
                }
            default:
                defpackage.ff1 ff1Var = (defpackage.ff1) obj2;
                fWTAfUmVKrZq();
                int i4 = this.QiMR8OkAhezm;
                if (i4 < 0) {
                    defpackage.h7.P05cfTpS5W5L("Cannot call set before the first call to next() or previous() or immediately after a call to add() or remove()");
                    return;
                } else {
                    ff1Var.set(i4, obj);
                    this.P05cfTpS5W5L = defpackage.ok0.hH0RRJrNssvh(ff1Var);
                    return;
                }
        }
    }

    public i50(defpackage.wh0 wh0Var, int i) {
        int i2;
        this.WDYagTQQm9ns = 2;
        this.e6mdH7fiFuta = wh0Var;
        this.oh71FJcDz6S2 = i;
        this.QiMR8OkAhezm = -1;
        i2 = ((java.util.AbstractList) wh0Var).modCount;
        this.P05cfTpS5W5L = i2;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public i50(defpackage.k50 k50Var, int i, int i2) {
        this(k50Var, (i2 & 1) != 0 ? 0 : i, 0, k50Var.WDYagTQQm9ns.giKS3J6vZuNy);
        this.WDYagTQQm9ns = 0;
    }

    public i50(defpackage.k50 k50Var, int i, int i2, int i3) {
        this.WDYagTQQm9ns = 0;
        this.e6mdH7fiFuta = k50Var;
        this.oh71FJcDz6S2 = i;
        this.QiMR8OkAhezm = i2;
        this.P05cfTpS5W5L = i3;
    }

    public i50(defpackage.vh0 vh0Var, int i) {
        int i2;
        this.WDYagTQQm9ns = 1;
        this.e6mdH7fiFuta = vh0Var;
        this.oh71FJcDz6S2 = i;
        this.QiMR8OkAhezm = -1;
        i2 = ((java.util.AbstractList) vh0Var).modCount;
        this.P05cfTpS5W5L = i2;
    }
}
