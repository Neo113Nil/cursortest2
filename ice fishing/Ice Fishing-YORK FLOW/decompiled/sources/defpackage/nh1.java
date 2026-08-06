package defpackage;

/* compiled from: r8-map-id-5e15bf382d9e1cc682b2b5d208f848646545054061ee84effb1e415a0540fc32 */
/* loaded from: classes.dex */
public final class nh1 implements java.util.List, defpackage.nb0 {
    public int P05cfTpS5W5L;
    public int QiMR8OkAhezm;
    public final defpackage.ff1 WDYagTQQm9ns;
    public final int oh71FJcDz6S2;

    public nh1(defpackage.ff1 ff1Var, int i, int i2) {
        this.WDYagTQQm9ns = ff1Var;
        this.oh71FJcDz6S2 = i;
        this.QiMR8OkAhezm = defpackage.ok0.hH0RRJrNssvh(ff1Var);
        this.P05cfTpS5W5L = i2 - i;
    }

    public final void ZpBGe2uQfcn8() {
        if (defpackage.ok0.hH0RRJrNssvh(this.WDYagTQQm9ns) != this.QiMR8OkAhezm) {
            throw new java.util.ConcurrentModificationException();
        }
    }

    @Override // java.util.List, java.util.Collection
    public final boolean add(java.lang.Object obj) {
        ZpBGe2uQfcn8();
        int i = this.oh71FJcDz6S2 + this.P05cfTpS5W5L;
        defpackage.ff1 ff1Var = this.WDYagTQQm9ns;
        ff1Var.add(i, obj);
        this.P05cfTpS5W5L++;
        this.QiMR8OkAhezm = defpackage.ok0.hH0RRJrNssvh(ff1Var);
        return true;
    }

    @Override // java.util.List
    public final boolean addAll(int i, java.util.Collection collection) {
        ZpBGe2uQfcn8();
        int i2 = i + this.oh71FJcDz6S2;
        defpackage.ff1 ff1Var = this.WDYagTQQm9ns;
        boolean addAll = ff1Var.addAll(i2, collection);
        if (addAll) {
            this.P05cfTpS5W5L = collection.size() + this.P05cfTpS5W5L;
            this.QiMR8OkAhezm = defpackage.ok0.hH0RRJrNssvh(ff1Var);
        }
        return addAll;
    }

    @Override // java.util.List, java.util.Collection
    public final void clear() {
        if (this.P05cfTpS5W5L > 0) {
            ZpBGe2uQfcn8();
            int i = this.P05cfTpS5W5L;
            int i2 = this.oh71FJcDz6S2;
            defpackage.ff1 ff1Var = this.WDYagTQQm9ns;
            ff1Var.fWTAfUmVKrZq(i2, i + i2);
            this.P05cfTpS5W5L = 0;
            this.QiMR8OkAhezm = defpackage.ok0.hH0RRJrNssvh(ff1Var);
        }
    }

    @Override // java.util.List, java.util.Collection
    public final boolean contains(java.lang.Object obj) {
        return indexOf(obj) >= 0;
    }

    @Override // java.util.List, java.util.Collection
    public final boolean containsAll(java.util.Collection collection) {
        java.util.Collection collection2 = collection;
        if ((collection2 instanceof java.util.Collection) && collection2.isEmpty()) {
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

    @Override // java.util.List
    public final java.lang.Object get(int i) {
        ZpBGe2uQfcn8();
        defpackage.ok0.h3m55N1URyyK(i, this.P05cfTpS5W5L);
        return this.WDYagTQQm9ns.get(this.oh71FJcDz6S2 + i);
    }

    @Override // java.util.List
    public final int indexOf(java.lang.Object obj) {
        ZpBGe2uQfcn8();
        int i = this.P05cfTpS5W5L;
        int i2 = this.oh71FJcDz6S2;
        java.util.Iterator it = defpackage.j80.OVwOqzUGHcCU(i2, i + i2).iterator();
        while (((defpackage.o90) it).QiMR8OkAhezm) {
            int nextInt = ((defpackage.h90) it).nextInt();
            if (defpackage.ma0.QiMR8OkAhezm(obj, this.WDYagTQQm9ns.get(nextInt))) {
                return nextInt - i2;
            }
        }
        return -1;
    }

    @Override // java.util.List, java.util.Collection
    public final boolean isEmpty() {
        return this.P05cfTpS5W5L == 0;
    }

    @Override // java.util.List, java.util.Collection, java.lang.Iterable
    public final java.util.Iterator iterator() {
        return listIterator(0);
    }

    @Override // java.util.List
    public final int lastIndexOf(java.lang.Object obj) {
        ZpBGe2uQfcn8();
        int i = this.P05cfTpS5W5L;
        int i2 = this.oh71FJcDz6S2;
        for (int i3 = (i + i2) - 1; i3 >= i2; i3--) {
            if (defpackage.ma0.QiMR8OkAhezm(obj, this.WDYagTQQm9ns.get(i3))) {
                return i3 - i2;
            }
        }
        return -1;
    }

    @Override // java.util.List
    public final java.util.ListIterator listIterator(int i) {
        ZpBGe2uQfcn8();
        defpackage.x31 x31Var = new defpackage.x31();
        x31Var.WDYagTQQm9ns = i - 1;
        return new defpackage.n51(x31Var, this);
    }

    @Override // java.util.List
    public final java.lang.Object remove(int i) {
        ZpBGe2uQfcn8();
        int i2 = this.oh71FJcDz6S2 + i;
        defpackage.ff1 ff1Var = this.WDYagTQQm9ns;
        java.lang.Object remove = ff1Var.remove(i2);
        this.P05cfTpS5W5L--;
        this.QiMR8OkAhezm = defpackage.ok0.hH0RRJrNssvh(ff1Var);
        return remove;
    }

    @Override // java.util.List, java.util.Collection
    public final boolean removeAll(java.util.Collection collection) {
        java.util.Iterator it = collection.iterator();
        while (true) {
            boolean z = false;
            while (it.hasNext()) {
                if (remove(it.next()) || z) {
                    z = true;
                }
            }
            return z;
        }
    }

    @Override // java.util.List, java.util.Collection
    public final boolean retainAll(java.util.Collection collection) {
        int i;
        defpackage.blKFvluuDQOf blkfvluudqof;
        defpackage.me1 GE9mJIPrb8gP;
        boolean gUjdnLbkVAaA;
        ZpBGe2uQfcn8();
        defpackage.ff1 ff1Var = this.WDYagTQQm9ns;
        int i2 = this.oh71FJcDz6S2;
        int i3 = this.P05cfTpS5W5L + i2;
        int size = ff1Var.size();
        do {
            synchronized (defpackage.ok0.Ns0WNyEWdPsk) {
                defpackage.ig1 ig1Var = ff1Var.WDYagTQQm9ns;
                ig1Var.getClass();
                defpackage.ig1 ig1Var2 = (defpackage.ig1) defpackage.te1.P05cfTpS5W5L(ig1Var);
                i = ig1Var2.JhCgjQRTAOCT;
                blkfvluudqof = ig1Var2.fWTAfUmVKrZq;
            }
            blkfvluudqof.getClass();
            defpackage.ly0 WDYagTQQm9ns = blkfvluudqof.WDYagTQQm9ns();
            WDYagTQQm9ns.subList(i2, i3).retainAll(collection);
            defpackage.blKFvluuDQOf fWTAfUmVKrZq = WDYagTQQm9ns.fWTAfUmVKrZq();
            if (defpackage.ma0.QiMR8OkAhezm(fWTAfUmVKrZq, blkfvluudqof)) {
                break;
            }
            defpackage.ig1 ig1Var3 = ff1Var.WDYagTQQm9ns;
            ig1Var3.getClass();
            synchronized (defpackage.te1.fWTAfUmVKrZq) {
                GE9mJIPrb8gP = defpackage.te1.GE9mJIPrb8gP();
                gUjdnLbkVAaA = defpackage.ok0.gUjdnLbkVAaA((defpackage.ig1) defpackage.te1.IJ0hOnjhPOri(ig1Var3, ff1Var, GE9mJIPrb8gP), i, fWTAfUmVKrZq, true);
            }
            defpackage.te1.gUjdnLbkVAaA(GE9mJIPrb8gP, ff1Var);
        } while (!gUjdnLbkVAaA);
        int size2 = size - ff1Var.size();
        if (size2 > 0) {
            this.QiMR8OkAhezm = defpackage.ok0.hH0RRJrNssvh(this.WDYagTQQm9ns);
            this.P05cfTpS5W5L -= size2;
        }
        return size2 > 0;
    }

    @Override // java.util.List
    public final java.lang.Object set(int i, java.lang.Object obj) {
        defpackage.ok0.h3m55N1URyyK(i, this.P05cfTpS5W5L);
        ZpBGe2uQfcn8();
        int i2 = i + this.oh71FJcDz6S2;
        defpackage.ff1 ff1Var = this.WDYagTQQm9ns;
        java.lang.Object obj2 = ff1Var.set(i2, obj);
        this.QiMR8OkAhezm = defpackage.ok0.hH0RRJrNssvh(ff1Var);
        return obj2;
    }

    @Override // java.util.List, java.util.Collection
    public final int size() {
        return this.P05cfTpS5W5L;
    }

    @Override // java.util.List
    public final java.util.List subList(int i, int i2) {
        if (i < 0 || i > i2 || i2 > this.P05cfTpS5W5L) {
            defpackage.g11.ZpBGe2uQfcn8("fromIndex or toIndex are out of bounds");
        }
        ZpBGe2uQfcn8();
        int i3 = this.oh71FJcDz6S2;
        return new defpackage.nh1(this.WDYagTQQm9ns, i + i3, i2 + i3);
    }

    @Override // java.util.List, java.util.Collection
    public final java.lang.Object[] toArray() {
        return defpackage.i61.jjTN4uUnoyEn(this);
    }

    @Override // java.util.List, java.util.Collection
    public final java.lang.Object[] toArray(java.lang.Object[] objArr) {
        return defpackage.i61.Mearx7yMn90V(this, objArr);
    }

    @Override // java.util.List
    public final java.util.ListIterator listIterator() {
        return listIterator(0);
    }

    @Override // java.util.List, java.util.Collection
    public final boolean remove(java.lang.Object obj) {
        int indexOf = indexOf(obj);
        if (indexOf < 0) {
            return false;
        }
        remove(indexOf);
        return true;
    }

    @Override // java.util.List
    public final void add(int i, java.lang.Object obj) {
        ZpBGe2uQfcn8();
        int i2 = this.oh71FJcDz6S2 + i;
        defpackage.ff1 ff1Var = this.WDYagTQQm9ns;
        ff1Var.add(i2, obj);
        this.P05cfTpS5W5L++;
        this.QiMR8OkAhezm = defpackage.ok0.hH0RRJrNssvh(ff1Var);
    }

    @Override // java.util.List, java.util.Collection
    public final boolean addAll(java.util.Collection collection) {
        return addAll(this.P05cfTpS5W5L, collection);
    }
}
