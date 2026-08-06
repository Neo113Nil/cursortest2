package defpackage;

/* compiled from: r8-map-id-5e15bf382d9e1cc682b2b5d208f848646545054061ee84effb1e415a0540fc32 */
/* loaded from: classes.dex */
public final class pn0 implements java.util.ListIterator, defpackage.nb0 {
    public int QiMR8OkAhezm;
    public final /* synthetic */ int WDYagTQQm9ns;
    public final java.util.List oh71FJcDz6S2;

    public pn0(java.util.List list, int i, int i2) {
        this.WDYagTQQm9ns = i2;
        switch (i2) {
            case 1:
                this.oh71FJcDz6S2 = list;
                this.QiMR8OkAhezm = i;
                break;
            default:
                this.oh71FJcDz6S2 = list;
                this.QiMR8OkAhezm = i - 1;
                break;
        }
    }

    @Override // java.util.ListIterator
    public final void add(java.lang.Object obj) {
        int i = this.WDYagTQQm9ns;
        java.util.List list = this.oh71FJcDz6S2;
        switch (i) {
            case 0:
                int i2 = this.QiMR8OkAhezm + 1;
                this.QiMR8OkAhezm = i2;
                list.add(i2, obj);
                break;
            default:
                list.add(this.QiMR8OkAhezm, obj);
                this.QiMR8OkAhezm++;
                break;
        }
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public final boolean hasNext() {
        int i = this.WDYagTQQm9ns;
        java.util.List list = this.oh71FJcDz6S2;
        switch (i) {
            case 0:
                if (this.QiMR8OkAhezm < list.size() - 1) {
                    break;
                }
                break;
            default:
                if (this.QiMR8OkAhezm < list.size()) {
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
                if (this.QiMR8OkAhezm >= 0) {
                }
                break;
            default:
                if (this.QiMR8OkAhezm > 0) {
                }
                break;
        }
        return false;
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public final java.lang.Object next() {
        int i = this.WDYagTQQm9ns;
        java.util.List list = this.oh71FJcDz6S2;
        switch (i) {
            case 0:
                int i2 = this.QiMR8OkAhezm + 1;
                this.QiMR8OkAhezm = i2;
                return list.get(i2);
            default:
                int i3 = this.QiMR8OkAhezm;
                this.QiMR8OkAhezm = i3 + 1;
                return list.get(i3);
        }
    }

    @Override // java.util.ListIterator
    public final int nextIndex() {
        switch (this.WDYagTQQm9ns) {
            case 0:
                return this.QiMR8OkAhezm + 1;
            default:
                return this.QiMR8OkAhezm;
        }
    }

    @Override // java.util.ListIterator
    public final java.lang.Object previous() {
        int i = this.WDYagTQQm9ns;
        java.util.List list = this.oh71FJcDz6S2;
        switch (i) {
            case 0:
                int i2 = this.QiMR8OkAhezm;
                this.QiMR8OkAhezm = i2 - 1;
                return list.get(i2);
            default:
                int i3 = this.QiMR8OkAhezm - 1;
                this.QiMR8OkAhezm = i3;
                return list.get(i3);
        }
    }

    @Override // java.util.ListIterator
    public final int previousIndex() {
        switch (this.WDYagTQQm9ns) {
            case 0:
                return this.QiMR8OkAhezm;
            default:
                return this.QiMR8OkAhezm - 1;
        }
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public final void remove() {
        int i = this.WDYagTQQm9ns;
        java.util.List list = this.oh71FJcDz6S2;
        switch (i) {
            case 0:
                list.remove(this.QiMR8OkAhezm);
                this.QiMR8OkAhezm--;
                break;
            default:
                int i2 = this.QiMR8OkAhezm - 1;
                this.QiMR8OkAhezm = i2;
                list.remove(i2);
                break;
        }
    }

    @Override // java.util.ListIterator
    public final void set(java.lang.Object obj) {
        int i = this.WDYagTQQm9ns;
        java.util.List list = this.oh71FJcDz6S2;
        switch (i) {
            case 0:
                list.set(this.QiMR8OkAhezm, obj);
                break;
            default:
                list.set(this.QiMR8OkAhezm, obj);
                break;
        }
    }
}
