package defpackage;

/* compiled from: r8-map-id-5e15bf382d9e1cc682b2b5d208f848646545054061ee84effb1e415a0540fc32 */
/* loaded from: classes.dex */
public final class rn0 implements java.util.List, defpackage.nb0 {
    public int P05cfTpS5W5L;
    public final int QiMR8OkAhezm;
    public final /* synthetic */ int WDYagTQQm9ns;
    public final java.util.List oh71FJcDz6S2;

    public /* synthetic */ rn0(java.util.List list, int i, int i2, int i3) {
        this.WDYagTQQm9ns = i3;
        this.oh71FJcDz6S2 = list;
        this.QiMR8OkAhezm = i;
        this.P05cfTpS5W5L = i2;
    }

    @Override // java.util.List
    public final void add(int i, java.lang.Object obj) {
        int i2 = this.WDYagTQQm9ns;
        int i3 = this.QiMR8OkAhezm;
        java.util.List list = this.oh71FJcDz6S2;
        switch (i2) {
            case 0:
                list.add(i + i3, obj);
                this.P05cfTpS5W5L++;
                break;
            default:
                list.add(i + i3, obj);
                this.P05cfTpS5W5L++;
                break;
        }
    }

    @Override // java.util.List
    public final boolean addAll(int i, java.util.Collection collection) {
        int i2 = this.WDYagTQQm9ns;
        int i3 = this.QiMR8OkAhezm;
        java.util.List list = this.oh71FJcDz6S2;
        switch (i2) {
            case 0:
                collection.getClass();
                list.addAll(i + i3, collection);
                this.P05cfTpS5W5L = collection.size() + this.P05cfTpS5W5L;
                if (collection.size() > 0) {
                    break;
                }
                break;
            default:
                list.addAll(i + i3, collection);
                int size = collection.size();
                this.P05cfTpS5W5L += size;
                if (size > 0) {
                    break;
                }
                break;
        }
        return true;
    }

    @Override // java.util.List, java.util.Collection
    public final void clear() {
        int i = this.WDYagTQQm9ns;
        java.util.List list = this.oh71FJcDz6S2;
        int i2 = this.QiMR8OkAhezm;
        switch (i) {
            case 0:
                int i3 = this.P05cfTpS5W5L - 1;
                if (i2 <= i3) {
                    while (true) {
                        list.remove(i3);
                        if (i3 != i2) {
                            i3--;
                        }
                    }
                }
                this.P05cfTpS5W5L = i2;
                break;
            default:
                int i4 = this.P05cfTpS5W5L - 1;
                if (i2 <= i4) {
                    while (true) {
                        list.remove(i4);
                        if (i4 != i2) {
                            i4--;
                        }
                    }
                }
                this.P05cfTpS5W5L = i2;
                break;
        }
    }

    @Override // java.util.List, java.util.Collection
    public final boolean contains(java.lang.Object obj) {
        int i = this.WDYagTQQm9ns;
        java.util.List list = this.oh71FJcDz6S2;
        int i2 = this.QiMR8OkAhezm;
        switch (i) {
            case 0:
                int i3 = this.P05cfTpS5W5L;
                while (i2 < i3) {
                    if (defpackage.ma0.QiMR8OkAhezm(list.get(i2), obj)) {
                        break;
                    } else {
                        i2++;
                    }
                }
                break;
            default:
                int i4 = this.P05cfTpS5W5L;
                while (i2 < i4) {
                    if (defpackage.ma0.QiMR8OkAhezm(list.get(i2), obj)) {
                        break;
                    } else {
                        i2++;
                    }
                }
                break;
        }
        return true;
    }

    @Override // java.util.List, java.util.Collection
    public final boolean containsAll(java.util.Collection collection) {
        switch (this.WDYagTQQm9ns) {
            case 0:
                collection.getClass();
                java.util.Iterator it = collection.iterator();
                while (it.hasNext()) {
                    if (!contains(it.next())) {
                        break;
                    }
                }
                break;
            default:
                java.util.Iterator it2 = collection.iterator();
                while (it2.hasNext()) {
                    if (!contains(it2.next())) {
                        break;
                    }
                }
                break;
        }
        return false;
    }

    @Override // java.util.List
    public final java.lang.Object get(int i) {
        int i2 = this.WDYagTQQm9ns;
        int i3 = this.QiMR8OkAhezm;
        java.util.List list = this.oh71FJcDz6S2;
        switch (i2) {
            case 0:
                defpackage.ns0.ZpBGe2uQfcn8(i, this);
                break;
            default:
                defpackage.io0.ZpBGe2uQfcn8(i, this);
                break;
        }
        return list.get(i + i3);
    }

    @Override // java.util.List
    public final int indexOf(java.lang.Object obj) {
        int i = this.WDYagTQQm9ns;
        java.util.List list = this.oh71FJcDz6S2;
        int i2 = this.QiMR8OkAhezm;
        switch (i) {
            case 0:
                int i3 = this.P05cfTpS5W5L;
                for (int i4 = i2; i4 < i3; i4++) {
                    if (defpackage.ma0.QiMR8OkAhezm(list.get(i4), obj)) {
                        return i4 - i2;
                    }
                }
                return -1;
            default:
                int i5 = this.P05cfTpS5W5L;
                for (int i6 = i2; i6 < i5; i6++) {
                    if (defpackage.ma0.QiMR8OkAhezm(list.get(i6), obj)) {
                        return i6 - i2;
                    }
                }
                return -1;
        }
    }

    @Override // java.util.List, java.util.Collection
    public final boolean isEmpty() {
        switch (this.WDYagTQQm9ns) {
            case 0:
                if (this.P05cfTpS5W5L == this.QiMR8OkAhezm) {
                }
                break;
            default:
                if (this.P05cfTpS5W5L == this.QiMR8OkAhezm) {
                }
                break;
        }
        return false;
    }

    @Override // java.util.List, java.util.Collection, java.lang.Iterable
    public final java.util.Iterator iterator() {
        switch (this.WDYagTQQm9ns) {
            case 0:
                return new defpackage.pn0(this, 0, 0);
            default:
                return new defpackage.pn0(this, 0, 1);
        }
    }

    @Override // java.util.List
    public final int lastIndexOf(java.lang.Object obj) {
        int i = this.WDYagTQQm9ns;
        java.util.List list = this.oh71FJcDz6S2;
        int i2 = this.QiMR8OkAhezm;
        switch (i) {
            case 0:
                int i3 = this.P05cfTpS5W5L - 1;
                if (i2 <= i3) {
                    while (!defpackage.ma0.QiMR8OkAhezm(list.get(i3), obj)) {
                        if (i3 == i2) {
                            break;
                        } else {
                            i3--;
                        }
                    }
                    break;
                }
                break;
            default:
                int i4 = this.P05cfTpS5W5L - 1;
                if (i2 <= i4) {
                    while (!defpackage.ma0.QiMR8OkAhezm(list.get(i4), obj)) {
                        if (i4 == i2) {
                            break;
                        } else {
                            i4--;
                        }
                    }
                    break;
                }
                break;
        }
        return -1;
    }

    @Override // java.util.List
    public final java.util.ListIterator listIterator() {
        switch (this.WDYagTQQm9ns) {
            case 0:
                return new defpackage.pn0(this, 0, 0);
            default:
                return new defpackage.pn0(this, 0, 1);
        }
    }

    @Override // java.util.List, java.util.Collection
    public final boolean remove(java.lang.Object obj) {
        int i = this.WDYagTQQm9ns;
        int i2 = this.QiMR8OkAhezm;
        java.util.List list = this.oh71FJcDz6S2;
        switch (i) {
            case 0:
                int i3 = this.P05cfTpS5W5L;
                while (i2 < i3) {
                    if (defpackage.ma0.QiMR8OkAhezm(list.get(i2), obj)) {
                        list.remove(i2);
                        this.P05cfTpS5W5L--;
                        break;
                    } else {
                        i2++;
                    }
                }
                break;
            default:
                int i4 = this.P05cfTpS5W5L;
                while (i2 < i4) {
                    if (defpackage.ma0.QiMR8OkAhezm(list.get(i2), obj)) {
                        list.remove(i2);
                        this.P05cfTpS5W5L--;
                        break;
                    } else {
                        i2++;
                    }
                }
                break;
        }
        return true;
    }

    @Override // java.util.List, java.util.Collection
    public final boolean removeAll(java.util.Collection collection) {
        switch (this.WDYagTQQm9ns) {
            case 0:
                collection.getClass();
                int i = this.P05cfTpS5W5L;
                java.util.Iterator it = collection.iterator();
                while (it.hasNext()) {
                    remove(it.next());
                }
                if (i != this.P05cfTpS5W5L) {
                    break;
                }
                break;
            default:
                int i2 = this.P05cfTpS5W5L;
                java.util.Iterator it2 = collection.iterator();
                while (it2.hasNext()) {
                    remove(it2.next());
                }
                if (i2 != this.P05cfTpS5W5L) {
                    break;
                }
                break;
        }
        return true;
    }

    @Override // java.util.List, java.util.Collection
    public final boolean retainAll(java.util.Collection collection) {
        int i = this.WDYagTQQm9ns;
        int i2 = this.QiMR8OkAhezm;
        java.util.List list = this.oh71FJcDz6S2;
        switch (i) {
            case 0:
                collection.getClass();
                int i3 = this.P05cfTpS5W5L;
                int i4 = i3 - 1;
                if (i2 <= i4) {
                    while (true) {
                        if (!collection.contains(list.get(i4))) {
                            list.remove(i4);
                            this.P05cfTpS5W5L--;
                        }
                        if (i4 != i2) {
                            i4--;
                        }
                    }
                }
                if (i3 != this.P05cfTpS5W5L) {
                    break;
                }
                break;
            default:
                int i5 = this.P05cfTpS5W5L;
                int i6 = i5 - 1;
                if (i2 <= i6) {
                    while (true) {
                        if (!collection.contains(list.get(i6))) {
                            list.remove(i6);
                            this.P05cfTpS5W5L--;
                        }
                        if (i6 != i2) {
                            i6--;
                        }
                    }
                }
                if (i5 != this.P05cfTpS5W5L) {
                    break;
                }
                break;
        }
        return true;
    }

    @Override // java.util.List
    public final java.lang.Object set(int i, java.lang.Object obj) {
        int i2 = this.WDYagTQQm9ns;
        int i3 = this.QiMR8OkAhezm;
        java.util.List list = this.oh71FJcDz6S2;
        switch (i2) {
            case 0:
                defpackage.ns0.ZpBGe2uQfcn8(i, this);
                break;
            default:
                defpackage.io0.ZpBGe2uQfcn8(i, this);
                break;
        }
        return list.set(i + i3, obj);
    }

    @Override // java.util.List, java.util.Collection
    public final int size() {
        int i;
        int i2;
        switch (this.WDYagTQQm9ns) {
            case 0:
                i = this.P05cfTpS5W5L;
                i2 = this.QiMR8OkAhezm;
                break;
            default:
                i = this.P05cfTpS5W5L;
                i2 = this.QiMR8OkAhezm;
                break;
        }
        return i - i2;
    }

    @Override // java.util.List
    public final java.util.List subList(int i, int i2) {
        switch (this.WDYagTQQm9ns) {
            case 0:
                defpackage.ns0.giKS3J6vZuNy(this, i, i2);
                return new defpackage.rn0(this, i, i2, 0);
            default:
                defpackage.io0.giKS3J6vZuNy(this, i, i2);
                return new defpackage.rn0(this, i, i2, 1);
        }
    }

    @Override // java.util.List, java.util.Collection
    public final java.lang.Object[] toArray(java.lang.Object[] objArr) {
        switch (this.WDYagTQQm9ns) {
            case 0:
                objArr.getClass();
                break;
        }
        return defpackage.i61.Mearx7yMn90V(this, objArr);
    }

    @Override // java.util.List, java.util.Collection
    public final java.lang.Object[] toArray() {
        switch (this.WDYagTQQm9ns) {
        }
        return defpackage.i61.jjTN4uUnoyEn(this);
    }

    @Override // java.util.List
    public final java.util.ListIterator listIterator(int i) {
        switch (this.WDYagTQQm9ns) {
            case 0:
                return new defpackage.pn0(this, i, 0);
            default:
                return new defpackage.pn0(this, i, 1);
        }
    }

    @Override // java.util.List, java.util.Collection
    public final boolean add(java.lang.Object obj) {
        int i = this.WDYagTQQm9ns;
        java.util.List list = this.oh71FJcDz6S2;
        switch (i) {
            case 0:
                int i2 = this.P05cfTpS5W5L;
                this.P05cfTpS5W5L = i2 + 1;
                list.add(i2, obj);
                break;
            default:
                int i3 = this.P05cfTpS5W5L;
                this.P05cfTpS5W5L = i3 + 1;
                list.add(i3, obj);
                break;
        }
        return true;
    }

    @Override // java.util.List, java.util.Collection
    public final boolean addAll(java.util.Collection collection) {
        int i = this.WDYagTQQm9ns;
        java.util.List list = this.oh71FJcDz6S2;
        switch (i) {
            case 0:
                collection.getClass();
                list.addAll(this.P05cfTpS5W5L, collection);
                this.P05cfTpS5W5L = collection.size() + this.P05cfTpS5W5L;
                if (collection.size() > 0) {
                    break;
                }
                break;
            default:
                list.addAll(this.P05cfTpS5W5L, collection);
                int size = collection.size();
                this.P05cfTpS5W5L += size;
                if (size > 0) {
                    break;
                }
                break;
        }
        return true;
    }

    @Override // java.util.List
    public final java.lang.Object remove(int i) {
        int i2 = this.WDYagTQQm9ns;
        int i3 = this.QiMR8OkAhezm;
        java.util.List list = this.oh71FJcDz6S2;
        switch (i2) {
            case 0:
                defpackage.ns0.ZpBGe2uQfcn8(i, this);
                this.P05cfTpS5W5L--;
                return list.remove(i + i3);
            default:
                defpackage.io0.ZpBGe2uQfcn8(i, this);
                this.P05cfTpS5W5L--;
                return list.remove(i + i3);
        }
    }
}
