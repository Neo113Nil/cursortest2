package defpackage;

/* loaded from: classes.dex */
public final class bd1 implements java.util.List, defpackage.g90 {
    public int AARZUJiTa;
    public int EXtogiMhuM;
    public final defpackage.gb1 adDC3e2L;
    public final int xiZrDbcSW0;

    public bd1(defpackage.gb1 gb1Var, int i, int i2) {
        this.adDC3e2L = gb1Var;
        this.xiZrDbcSW0 = i;
        this.AARZUJiTa = defpackage.ci0.D2vUnMij(gb1Var);
        this.EXtogiMhuM = i2 - i;
    }

    public final void IHQe1A4L2xu() {
        if (defpackage.ci0.D2vUnMij(this.adDC3e2L) != this.AARZUJiTa) {
            throw new java.util.ConcurrentModificationException();
        }
    }

    @Override // java.util.List, java.util.Collection
    public final boolean add(java.lang.Object obj) {
        IHQe1A4L2xu();
        int i = this.xiZrDbcSW0 + this.EXtogiMhuM;
        defpackage.gb1 gb1Var = this.adDC3e2L;
        gb1Var.add(i, obj);
        this.EXtogiMhuM++;
        this.AARZUJiTa = defpackage.ci0.D2vUnMij(gb1Var);
        return true;
    }

    @Override // java.util.List
    public final boolean addAll(int i, java.util.Collection collection) {
        IHQe1A4L2xu();
        int i2 = i + this.xiZrDbcSW0;
        defpackage.gb1 gb1Var = this.adDC3e2L;
        boolean addAll = gb1Var.addAll(i2, collection);
        if (addAll) {
            this.EXtogiMhuM = collection.size() + this.EXtogiMhuM;
            this.AARZUJiTa = defpackage.ci0.D2vUnMij(gb1Var);
        }
        return addAll;
    }

    @Override // java.util.List, java.util.Collection
    public final void clear() {
        if (this.EXtogiMhuM > 0) {
            IHQe1A4L2xu();
            int i = this.EXtogiMhuM;
            int i2 = this.xiZrDbcSW0;
            defpackage.gb1 gb1Var = this.adDC3e2L;
            gb1Var.adDC3e2L(i2, i + i2);
            this.EXtogiMhuM = 0;
            this.AARZUJiTa = defpackage.ci0.D2vUnMij(gb1Var);
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
        IHQe1A4L2xu();
        defpackage.ci0.riuEU0zW4(i, this.EXtogiMhuM);
        return this.adDC3e2L.get(this.xiZrDbcSW0 + i);
    }

    @Override // java.util.List
    public final int indexOf(java.lang.Object obj) {
        IHQe1A4L2xu();
        int i = this.EXtogiMhuM;
        int i2 = this.xiZrDbcSW0;
        java.util.Iterator it = defpackage.x80.QPwENk36pDC(i2, i + i2).iterator();
        while (((defpackage.c70) it).AARZUJiTa) {
            int nextInt = ((defpackage.v60) it).nextInt();
            if (defpackage.x70.QoRHpC4k(obj, this.adDC3e2L.get(nextInt))) {
                return nextInt - i2;
            }
        }
        return -1;
    }

    @Override // java.util.List, java.util.Collection
    public final boolean isEmpty() {
        return this.EXtogiMhuM == 0;
    }

    @Override // java.util.List, java.util.Collection, java.lang.Iterable
    public final java.util.Iterator iterator() {
        return listIterator(0);
    }

    @Override // java.util.List
    public final int lastIndexOf(java.lang.Object obj) {
        IHQe1A4L2xu();
        int i = this.EXtogiMhuM;
        int i2 = this.xiZrDbcSW0;
        for (int i3 = (i + i2) - 1; i3 >= i2; i3--) {
            if (defpackage.x70.QoRHpC4k(obj, this.adDC3e2L.get(i3))) {
                return i3 - i2;
            }
        }
        return -1;
    }

    @Override // java.util.List
    public final java.util.ListIterator listIterator(int i) {
        IHQe1A4L2xu();
        defpackage.pz0 pz0Var = new defpackage.pz0();
        pz0Var.adDC3e2L = i - 1;
        return new defpackage.x11(pz0Var, this);
    }

    @Override // java.util.List
    public final java.lang.Object remove(int i) {
        IHQe1A4L2xu();
        int i2 = this.xiZrDbcSW0 + i;
        defpackage.gb1 gb1Var = this.adDC3e2L;
        java.lang.Object remove = gb1Var.remove(i2);
        this.EXtogiMhuM--;
        this.AARZUJiTa = defpackage.ci0.D2vUnMij(gb1Var);
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
        defpackage.D2vUnMij d2vUnMij;
        defpackage.oa1 SH1y5HwkJhh;
        boolean DFo87pBq1E5;
        IHQe1A4L2xu();
        defpackage.gb1 gb1Var = this.adDC3e2L;
        int i2 = this.xiZrDbcSW0;
        int i3 = this.EXtogiMhuM + i2;
        int size = gb1Var.size();
        do {
            synchronized (defpackage.ci0.cnag84Bm) {
                defpackage.jc1 jc1Var = gb1Var.adDC3e2L;
                jc1Var.getClass();
                defpackage.jc1 jc1Var2 = (defpackage.jc1) defpackage.wa1.EXtogiMhuM(jc1Var);
                i = jc1Var2.F7NU4MC0GW;
                d2vUnMij = jc1Var2.r1MBDhnF;
            }
            d2vUnMij.getClass();
            defpackage.su0 xiZrDbcSW0 = d2vUnMij.xiZrDbcSW0();
            xiZrDbcSW0.subList(i2, i3).retainAll(collection);
            defpackage.D2vUnMij r1MBDhnF = xiZrDbcSW0.r1MBDhnF();
            if (defpackage.x70.QoRHpC4k(r1MBDhnF, d2vUnMij)) {
                break;
            }
            defpackage.jc1 jc1Var3 = gb1Var.adDC3e2L;
            jc1Var3.getClass();
            synchronized (defpackage.wa1.r1MBDhnF) {
                SH1y5HwkJhh = defpackage.wa1.SH1y5HwkJhh();
                DFo87pBq1E5 = defpackage.ci0.DFo87pBq1E5((defpackage.jc1) defpackage.wa1.PAEGRtP0bX(jc1Var3, gb1Var, SH1y5HwkJhh), i, r1MBDhnF, true);
            }
            defpackage.wa1.SyNS6RMn(SH1y5HwkJhh, gb1Var);
        } while (!DFo87pBq1E5);
        int size2 = size - gb1Var.size();
        if (size2 > 0) {
            this.AARZUJiTa = defpackage.ci0.D2vUnMij(this.adDC3e2L);
            this.EXtogiMhuM -= size2;
        }
        return size2 > 0;
    }

    @Override // java.util.List
    public final java.lang.Object set(int i, java.lang.Object obj) {
        defpackage.ci0.riuEU0zW4(i, this.EXtogiMhuM);
        IHQe1A4L2xu();
        int i2 = i + this.xiZrDbcSW0;
        defpackage.gb1 gb1Var = this.adDC3e2L;
        java.lang.Object obj2 = gb1Var.set(i2, obj);
        this.AARZUJiTa = defpackage.ci0.D2vUnMij(gb1Var);
        return obj2;
    }

    @Override // java.util.List, java.util.Collection
    public final int size() {
        return this.EXtogiMhuM;
    }

    @Override // java.util.List
    public final java.util.List subList(int i, int i2) {
        if (i < 0 || i > i2 || i2 > this.EXtogiMhuM) {
            defpackage.nw0.IHQe1A4L2xu("fromIndex or toIndex are out of bounds");
        }
        IHQe1A4L2xu();
        int i3 = this.xiZrDbcSW0;
        return new defpackage.bd1(this.adDC3e2L, i + i3, i2 + i3);
    }

    @Override // java.util.List, java.util.Collection
    public final java.lang.Object[] toArray() {
        return defpackage.ci0.EoOhNTTfIN7K(this);
    }

    @Override // java.util.List, java.util.Collection
    public final java.lang.Object[] toArray(java.lang.Object[] objArr) {
        return defpackage.ci0.wKlPRKlRnfqr(this, objArr);
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
        IHQe1A4L2xu();
        int i2 = this.xiZrDbcSW0 + i;
        defpackage.gb1 gb1Var = this.adDC3e2L;
        gb1Var.add(i2, obj);
        this.EXtogiMhuM++;
        this.AARZUJiTa = defpackage.ci0.D2vUnMij(gb1Var);
    }

    @Override // java.util.List, java.util.Collection
    public final boolean addAll(java.util.Collection collection) {
        return addAll(this.EXtogiMhuM, collection);
    }
}
