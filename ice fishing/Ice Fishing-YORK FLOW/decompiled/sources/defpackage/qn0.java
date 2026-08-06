package defpackage;

/* compiled from: r8-map-id-5e15bf382d9e1cc682b2b5d208f848646545054061ee84effb1e415a0540fc32 */
/* loaded from: classes.dex */
public final class qn0 implements java.util.List, defpackage.nb0 {
    public final /* synthetic */ int WDYagTQQm9ns;
    public final java.lang.Object oh71FJcDz6S2;

    public /* synthetic */ qn0(int i, java.lang.Object obj) {
        this.WDYagTQQm9ns = i;
        this.oh71FJcDz6S2 = obj;
    }

    @Override // java.util.List
    public final void add(int i, java.lang.Object obj) {
        int i2;
        int i3 = this.WDYagTQQm9ns;
        java.lang.Object obj2 = this.oh71FJcDz6S2;
        switch (i3) {
            case 0:
                defpackage.sn0 sn0Var = (defpackage.sn0) obj2;
                if (i < 0 || i > (i2 = sn0Var.giKS3J6vZuNy)) {
                    sn0Var.XntWc4eZSQ8j(i);
                    throw null;
                }
                int i4 = i2 + 1;
                java.lang.Object[] objArr = sn0Var.ZpBGe2uQfcn8;
                if (objArr.length < i4) {
                    sn0Var.h3m55N1URyyK(i4, objArr);
                }
                java.lang.Object[] objArr2 = sn0Var.ZpBGe2uQfcn8;
                int i5 = sn0Var.giKS3J6vZuNy;
                if (i != i5) {
                    defpackage.y7.hwoZxnIesQBZ(objArr2, objArr2, i + 1, i, i5);
                }
                objArr2[i] = obj;
                sn0Var.giKS3J6vZuNy++;
                return;
            default:
                ((defpackage.ho0) obj2).ZpBGe2uQfcn8(i, obj);
                return;
        }
    }

    @Override // java.util.List
    public final boolean addAll(int i, java.util.Collection collection) {
        int i2 = this.WDYagTQQm9ns;
        java.lang.Object obj = this.oh71FJcDz6S2;
        switch (i2) {
            case 0:
                collection.getClass();
                defpackage.sn0 sn0Var = (defpackage.sn0) obj;
                if (i < 0 || i > sn0Var.giKS3J6vZuNy) {
                    sn0Var.XntWc4eZSQ8j(i);
                    throw null;
                }
                int i3 = 0;
                if (collection.isEmpty()) {
                    return false;
                }
                int size = collection.size() + sn0Var.giKS3J6vZuNy;
                java.lang.Object[] objArr = sn0Var.ZpBGe2uQfcn8;
                if (objArr.length < size) {
                    sn0Var.h3m55N1URyyK(size, objArr);
                }
                java.lang.Object[] objArr2 = sn0Var.ZpBGe2uQfcn8;
                if (i != sn0Var.giKS3J6vZuNy) {
                    defpackage.y7.hwoZxnIesQBZ(objArr2, objArr2, collection.size() + i, i, sn0Var.giKS3J6vZuNy);
                }
                for (java.lang.Object obj2 : collection) {
                    int i4 = i3 + 1;
                    if (i3 < 0) {
                        defpackage.ma0.BXaznwstz2U0();
                        throw null;
                    }
                    objArr2[i3 + i] = obj2;
                    i3 = i4;
                }
                sn0Var.giKS3J6vZuNy = collection.size() + sn0Var.giKS3J6vZuNy;
                return true;
            default:
                return ((defpackage.ho0) obj).WDYagTQQm9ns(i, collection);
        }
    }

    @Override // java.util.List, java.util.Collection
    public final void clear() {
        int i = this.WDYagTQQm9ns;
        java.lang.Object obj = this.oh71FJcDz6S2;
        switch (i) {
            case 0:
                ((defpackage.sn0) obj).JhCgjQRTAOCT();
                break;
            default:
                ((defpackage.ho0) obj).QiMR8OkAhezm();
                break;
        }
    }

    @Override // java.util.List, java.util.Collection
    public final boolean contains(java.lang.Object obj) {
        int i = this.WDYagTQQm9ns;
        java.lang.Object obj2 = this.oh71FJcDz6S2;
        switch (i) {
            case 0:
                return ((defpackage.sn0) obj2).QiMR8OkAhezm(obj) >= 0;
            default:
                return ((defpackage.ho0) obj2).P05cfTpS5W5L(obj);
        }
    }

    @Override // java.util.List, java.util.Collection
    public final boolean containsAll(java.util.Collection collection) {
        int i = this.WDYagTQQm9ns;
        java.lang.Object obj = this.oh71FJcDz6S2;
        switch (i) {
            case 0:
                collection.getClass();
                defpackage.sn0 sn0Var = (defpackage.sn0) obj;
                java.util.Iterator it = collection.iterator();
                while (it.hasNext()) {
                    if (sn0Var.QiMR8OkAhezm(it.next()) < 0) {
                        break;
                    }
                }
                break;
            default:
                defpackage.ho0 ho0Var = (defpackage.ho0) obj;
                java.util.Iterator it2 = collection.iterator();
                while (it2.hasNext()) {
                    if (!ho0Var.P05cfTpS5W5L(it2.next())) {
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
        java.lang.Object obj = this.oh71FJcDz6S2;
        switch (i2) {
            case 0:
                defpackage.ns0.ZpBGe2uQfcn8(i, this);
                return ((defpackage.sn0) obj).oh71FJcDz6S2(i);
            default:
                defpackage.io0.ZpBGe2uQfcn8(i, this);
                return ((defpackage.ho0) obj).WDYagTQQm9ns[i];
        }
    }

    @Override // java.util.List
    public final int indexOf(java.lang.Object obj) {
        int i = this.WDYagTQQm9ns;
        java.lang.Object obj2 = this.oh71FJcDz6S2;
        switch (i) {
            case 0:
                return ((defpackage.sn0) obj2).QiMR8OkAhezm(obj);
            default:
                return ((defpackage.ho0) obj2).e6mdH7fiFuta(obj);
        }
    }

    @Override // java.util.List, java.util.Collection
    public final boolean isEmpty() {
        int i = this.WDYagTQQm9ns;
        java.lang.Object obj = this.oh71FJcDz6S2;
        switch (i) {
            case 0:
                return ((defpackage.sn0) obj).P05cfTpS5W5L();
            default:
                return ((defpackage.ho0) obj).QiMR8OkAhezm == 0;
        }
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
        int i;
        int i2 = this.WDYagTQQm9ns;
        java.lang.Object obj2 = this.oh71FJcDz6S2;
        switch (i2) {
            case 0:
                defpackage.sn0 sn0Var = (defpackage.sn0) obj2;
                java.lang.Object[] objArr = sn0Var.ZpBGe2uQfcn8;
                int i3 = sn0Var.giKS3J6vZuNy;
                if (obj == null) {
                    i = i3 - 1;
                    while (-1 < i) {
                        if (objArr[i] != null) {
                            i--;
                        }
                    }
                    return -1;
                }
                i = i3 - 1;
                while (-1 < i) {
                    if (!obj.equals(objArr[i])) {
                        i--;
                    }
                }
                return -1;
                return i;
            default:
                defpackage.ho0 ho0Var = (defpackage.ho0) obj2;
                java.lang.Object[] objArr2 = ho0Var.WDYagTQQm9ns;
                for (int i4 = ho0Var.QiMR8OkAhezm - 1; i4 >= 0; i4--) {
                    if (defpackage.ma0.QiMR8OkAhezm(obj, objArr2[i4])) {
                        return i4;
                    }
                }
                return -1;
        }
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

    @Override // java.util.List
    public final java.lang.Object remove(int i) {
        int i2 = this.WDYagTQQm9ns;
        java.lang.Object obj = this.oh71FJcDz6S2;
        switch (i2) {
            case 0:
                defpackage.ns0.ZpBGe2uQfcn8(i, this);
                return ((defpackage.sn0) obj).Ns0WNyEWdPsk(i);
            default:
                defpackage.io0.ZpBGe2uQfcn8(i, this);
                return ((defpackage.ho0) obj).Ns0WNyEWdPsk(i);
        }
    }

    @Override // java.util.List, java.util.Collection
    public final boolean removeAll(java.util.Collection collection) {
        int i = this.WDYagTQQm9ns;
        java.lang.Object obj = this.oh71FJcDz6S2;
        switch (i) {
            case 0:
                collection.getClass();
                defpackage.sn0 sn0Var = (defpackage.sn0) obj;
                int i2 = sn0Var.giKS3J6vZuNy;
                java.util.Iterator it = collection.iterator();
                while (it.hasNext()) {
                    sn0Var.GE9mJIPrb8gP(it.next());
                }
                if (i2 == sn0Var.giKS3J6vZuNy) {
                    break;
                }
                break;
            default:
                defpackage.ho0 ho0Var = (defpackage.ho0) obj;
                if (!collection.isEmpty()) {
                    int i3 = ho0Var.QiMR8OkAhezm;
                    java.util.Iterator it2 = collection.iterator();
                    while (it2.hasNext()) {
                        ho0Var.GE9mJIPrb8gP(it2.next());
                    }
                    if (i3 != ho0Var.QiMR8OkAhezm) {
                    }
                }
                break;
        }
        return false;
    }

    @Override // java.util.List, java.util.Collection
    public final boolean retainAll(java.util.Collection collection) {
        int i = this.WDYagTQQm9ns;
        java.lang.Object obj = this.oh71FJcDz6S2;
        switch (i) {
            case 0:
                collection.getClass();
                defpackage.sn0 sn0Var = (defpackage.sn0) obj;
                int i2 = sn0Var.giKS3J6vZuNy;
                java.lang.Object[] objArr = sn0Var.ZpBGe2uQfcn8;
                for (int i3 = i2 - 1; -1 < i3; i3--) {
                    if (!collection.contains(objArr[i3])) {
                        sn0Var.Ns0WNyEWdPsk(i3);
                    }
                }
                if (i2 != sn0Var.giKS3J6vZuNy) {
                    break;
                }
                break;
            default:
                defpackage.ho0 ho0Var = (defpackage.ho0) obj;
                int i4 = ho0Var.QiMR8OkAhezm;
                for (int i5 = i4 - 1; -1 < i5; i5--) {
                    if (!collection.contains(ho0Var.WDYagTQQm9ns[i5])) {
                        ho0Var.Ns0WNyEWdPsk(i5);
                    }
                }
                if (i4 != ho0Var.QiMR8OkAhezm) {
                    break;
                }
                break;
        }
        return true;
    }

    @Override // java.util.List
    public final java.lang.Object set(int i, java.lang.Object obj) {
        int i2 = this.WDYagTQQm9ns;
        java.lang.Object obj2 = this.oh71FJcDz6S2;
        switch (i2) {
            case 0:
                defpackage.ns0.ZpBGe2uQfcn8(i, this);
                return ((defpackage.sn0) obj2).gUjdnLbkVAaA(i, obj);
            default:
                defpackage.io0.ZpBGe2uQfcn8(i, this);
                java.lang.Object[] objArr = ((defpackage.ho0) obj2).WDYagTQQm9ns;
                java.lang.Object obj3 = objArr[i];
                objArr[i] = obj;
                return obj3;
        }
    }

    @Override // java.util.List, java.util.Collection
    public final int size() {
        int i = this.WDYagTQQm9ns;
        java.lang.Object obj = this.oh71FJcDz6S2;
        switch (i) {
            case 0:
                return ((defpackage.sn0) obj).giKS3J6vZuNy;
            default:
                return ((defpackage.ho0) obj).QiMR8OkAhezm;
        }
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
    public final boolean remove(java.lang.Object obj) {
        int i = this.WDYagTQQm9ns;
        java.lang.Object obj2 = this.oh71FJcDz6S2;
        switch (i) {
            case 0:
                return ((defpackage.sn0) obj2).GE9mJIPrb8gP(obj);
            default:
                return ((defpackage.ho0) obj2).GE9mJIPrb8gP(obj);
        }
    }

    @Override // java.util.List, java.util.Collection
    public final boolean add(java.lang.Object obj) {
        int i = this.WDYagTQQm9ns;
        java.lang.Object obj2 = this.oh71FJcDz6S2;
        switch (i) {
            case 0:
                ((defpackage.sn0) obj2).ZpBGe2uQfcn8(obj);
                break;
            default:
                ((defpackage.ho0) obj2).giKS3J6vZuNy(obj);
                break;
        }
        return true;
    }

    @Override // java.util.List, java.util.Collection
    public final boolean addAll(java.util.Collection collection) {
        int i = this.WDYagTQQm9ns;
        java.lang.Object obj = this.oh71FJcDz6S2;
        switch (i) {
            case 0:
                collection.getClass();
                defpackage.sn0 sn0Var = (defpackage.sn0) obj;
                int i2 = sn0Var.giKS3J6vZuNy;
                java.util.Iterator it = collection.iterator();
                while (it.hasNext()) {
                    sn0Var.ZpBGe2uQfcn8(it.next());
                }
                return i2 != sn0Var.giKS3J6vZuNy;
            default:
                defpackage.ho0 ho0Var = (defpackage.ho0) obj;
                return ho0Var.WDYagTQQm9ns(ho0Var.QiMR8OkAhezm, collection);
        }
    }
}
