package defpackage;

/* loaded from: classes.dex */
public final class vl0 implements java.util.List, defpackage.g90 {
    public int AARZUJiTa;
    public final java.util.List adDC3e2L;
    public final int xiZrDbcSW0;

    public vl0(java.util.List list, int i, int i2) {
        this.adDC3e2L = list;
        this.xiZrDbcSW0 = i;
        this.AARZUJiTa = i2;
    }

    @Override // java.util.List
    public final void add(int i, java.lang.Object obj) {
        this.adDC3e2L.add(i + this.xiZrDbcSW0, obj);
        this.AARZUJiTa++;
    }

    @Override // java.util.List
    public final boolean addAll(int i, java.util.Collection collection) {
        this.adDC3e2L.addAll(i + this.xiZrDbcSW0, collection);
        int size = collection.size();
        this.AARZUJiTa += size;
        return size > 0;
    }

    @Override // java.util.List, java.util.Collection
    public final void clear() {
        int i = this.AARZUJiTa - 1;
        int i2 = this.xiZrDbcSW0;
        if (i2 <= i) {
            while (true) {
                this.adDC3e2L.remove(i);
                if (i == i2) {
                    break;
                } else {
                    i--;
                }
            }
        }
        this.AARZUJiTa = i2;
    }

    @Override // java.util.List, java.util.Collection
    public final boolean contains(java.lang.Object obj) {
        int i = this.AARZUJiTa;
        for (int i2 = this.xiZrDbcSW0; i2 < i; i2++) {
            if (defpackage.x70.QoRHpC4k(this.adDC3e2L.get(i2), obj)) {
                return true;
            }
        }
        return false;
    }

    @Override // java.util.List, java.util.Collection
    public final boolean containsAll(java.util.Collection collection) {
        java.util.Iterator it = collection.iterator();
        while (it.hasNext()) {
            if (!contains(it.next())) {
                return false;
            }
        }
        return true;
    }

    @Override // java.util.List
    public final java.lang.Object get(int i) {
        defpackage.yl0.IHQe1A4L2xu(i, this);
        return this.adDC3e2L.get(i + this.xiZrDbcSW0);
    }

    @Override // java.util.List
    public final int indexOf(java.lang.Object obj) {
        int i = this.AARZUJiTa;
        int i2 = this.xiZrDbcSW0;
        for (int i3 = i2; i3 < i; i3++) {
            if (defpackage.x70.QoRHpC4k(this.adDC3e2L.get(i3), obj)) {
                return i3 - i2;
            }
        }
        return -1;
    }

    @Override // java.util.List, java.util.Collection
    public final boolean isEmpty() {
        return this.AARZUJiTa == this.xiZrDbcSW0;
    }

    @Override // java.util.List, java.util.Collection, java.lang.Iterable
    public final java.util.Iterator iterator() {
        return new defpackage.wl0(0, this);
    }

    @Override // java.util.List
    public final int lastIndexOf(java.lang.Object obj) {
        int i = this.AARZUJiTa - 1;
        int i2 = this.xiZrDbcSW0;
        if (i2 > i) {
            return -1;
        }
        while (!defpackage.x70.QoRHpC4k(this.adDC3e2L.get(i), obj)) {
            if (i == i2) {
                return -1;
            }
            i--;
        }
        return i - i2;
    }

    @Override // java.util.List
    public final java.util.ListIterator listIterator() {
        return new defpackage.wl0(0, this);
    }

    @Override // java.util.List, java.util.Collection
    public final boolean remove(java.lang.Object obj) {
        int i = this.AARZUJiTa;
        for (int i2 = this.xiZrDbcSW0; i2 < i; i2++) {
            java.util.List list = this.adDC3e2L;
            if (defpackage.x70.QoRHpC4k(list.get(i2), obj)) {
                list.remove(i2);
                this.AARZUJiTa--;
                return true;
            }
        }
        return false;
    }

    @Override // java.util.List, java.util.Collection
    public final boolean removeAll(java.util.Collection collection) {
        int i = this.AARZUJiTa;
        java.util.Iterator it = collection.iterator();
        while (it.hasNext()) {
            remove(it.next());
        }
        return i != this.AARZUJiTa;
    }

    @Override // java.util.List, java.util.Collection
    public final boolean retainAll(java.util.Collection collection) {
        int i = this.AARZUJiTa;
        int i2 = i - 1;
        int i3 = this.xiZrDbcSW0;
        if (i3 <= i2) {
            while (true) {
                java.util.List list = this.adDC3e2L;
                if (!collection.contains(list.get(i2))) {
                    list.remove(i2);
                    this.AARZUJiTa--;
                }
                if (i2 == i3) {
                    break;
                }
                i2--;
            }
        }
        return i != this.AARZUJiTa;
    }

    @Override // java.util.List
    public final java.lang.Object set(int i, java.lang.Object obj) {
        defpackage.yl0.IHQe1A4L2xu(i, this);
        return this.adDC3e2L.set(i + this.xiZrDbcSW0, obj);
    }

    @Override // java.util.List, java.util.Collection
    public final int size() {
        return this.AARZUJiTa - this.xiZrDbcSW0;
    }

    @Override // java.util.List
    public final java.util.List subList(int i, int i2) {
        defpackage.yl0.oh6vYeIP(this, i, i2);
        return new defpackage.vl0(this, i, i2);
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
    public final java.util.ListIterator listIterator(int i) {
        return new defpackage.wl0(i, this);
    }

    @Override // java.util.List, java.util.Collection
    public final boolean add(java.lang.Object obj) {
        int i = this.AARZUJiTa;
        this.AARZUJiTa = i + 1;
        this.adDC3e2L.add(i, obj);
        return true;
    }

    @Override // java.util.List, java.util.Collection
    public final boolean addAll(java.util.Collection collection) {
        this.adDC3e2L.addAll(this.AARZUJiTa, collection);
        int size = collection.size();
        this.AARZUJiTa += size;
        return size > 0;
    }

    @Override // java.util.List
    public final java.lang.Object remove(int i) {
        defpackage.yl0.IHQe1A4L2xu(i, this);
        this.AARZUJiTa--;
        return this.adDC3e2L.remove(i + this.xiZrDbcSW0);
    }
}
