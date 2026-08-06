package defpackage;

/* compiled from: r8-map-id-5e15bf382d9e1cc682b2b5d208f848646545054061ee84effb1e415a0540fc32 */
/* loaded from: classes.dex */
public final class n51 implements java.util.ListIterator, defpackage.nb0 {
    public final /* synthetic */ java.lang.Object QiMR8OkAhezm;
    public final /* synthetic */ int WDYagTQQm9ns = 0;
    public final java.lang.Object oh71FJcDz6S2;

    public n51(defpackage.p51 p51Var, int i) {
        this.QiMR8OkAhezm = p51Var;
        this.oh71FJcDz6S2 = p51Var.oh71FJcDz6S2.listIterator(defpackage.hf.NkfcFfdaVTox(i, p51Var));
    }

    @Override // java.util.ListIterator
    public final void add(java.lang.Object obj) {
        switch (this.WDYagTQQm9ns) {
            case 0:
                java.util.ListIterator listIterator = (java.util.ListIterator) this.oh71FJcDz6S2;
                listIterator.add(obj);
                listIterator.previous();
                return;
            case 1:
                throw new java.lang.UnsupportedOperationException("Operation is not supported for read-only collection");
            default:
                throw new java.lang.IllegalStateException("Cannot modify a state list through an iterator");
        }
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public final boolean hasNext() {
        int i = this.WDYagTQQm9ns;
        java.lang.Object obj = this.oh71FJcDz6S2;
        switch (i) {
            case 0:
                break;
            case 1:
                break;
            default:
                if (((defpackage.x31) obj).WDYagTQQm9ns < ((defpackage.nh1) this.QiMR8OkAhezm).P05cfTpS5W5L - 1) {
                }
                break;
        }
        return ((java.util.ListIterator) obj).hasPrevious();
    }

    @Override // java.util.ListIterator
    public final boolean hasPrevious() {
        int i = this.WDYagTQQm9ns;
        java.lang.Object obj = this.oh71FJcDz6S2;
        switch (i) {
            case 0:
                break;
            case 1:
                break;
            default:
                if (((defpackage.x31) obj).WDYagTQQm9ns >= 0) {
                }
                break;
        }
        return ((java.util.ListIterator) obj).hasNext();
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public final java.lang.Object next() {
        int i = this.WDYagTQQm9ns;
        java.lang.Object obj = this.oh71FJcDz6S2;
        switch (i) {
            case 0:
                return ((java.util.ListIterator) obj).previous();
            case 1:
                return ((java.util.ListIterator) obj).previous();
            default:
                defpackage.x31 x31Var = (defpackage.x31) obj;
                int i2 = x31Var.WDYagTQQm9ns + 1;
                defpackage.nh1 nh1Var = (defpackage.nh1) this.QiMR8OkAhezm;
                defpackage.ok0.h3m55N1URyyK(i2, nh1Var.P05cfTpS5W5L);
                x31Var.WDYagTQQm9ns = i2;
                return nh1Var.get(i2);
        }
    }

    @Override // java.util.ListIterator
    public final int nextIndex() {
        int previousIndex;
        int size;
        int i = this.WDYagTQQm9ns;
        java.lang.Object obj = this.QiMR8OkAhezm;
        java.lang.Object obj2 = this.oh71FJcDz6S2;
        switch (i) {
            case 0:
                previousIndex = ((java.util.ListIterator) obj2).previousIndex();
                size = ((defpackage.o51) obj).size();
                break;
            case 1:
                previousIndex = ((java.util.ListIterator) obj2).previousIndex();
                size = ((defpackage.p51) obj).size();
                break;
            default:
                return ((defpackage.x31) obj2).WDYagTQQm9ns + 1;
        }
        return (size - 1) - previousIndex;
    }

    @Override // java.util.ListIterator
    public final java.lang.Object previous() {
        int i = this.WDYagTQQm9ns;
        java.lang.Object obj = this.oh71FJcDz6S2;
        switch (i) {
            case 0:
                return ((java.util.ListIterator) obj).next();
            case 1:
                return ((java.util.ListIterator) obj).next();
            default:
                defpackage.x31 x31Var = (defpackage.x31) obj;
                int i2 = x31Var.WDYagTQQm9ns;
                defpackage.nh1 nh1Var = (defpackage.nh1) this.QiMR8OkAhezm;
                defpackage.ok0.h3m55N1URyyK(i2, nh1Var.P05cfTpS5W5L);
                x31Var.WDYagTQQm9ns = i2 - 1;
                return nh1Var.get(i2);
        }
    }

    @Override // java.util.ListIterator
    public final int previousIndex() {
        int nextIndex;
        int size;
        int i = this.WDYagTQQm9ns;
        java.lang.Object obj = this.QiMR8OkAhezm;
        java.lang.Object obj2 = this.oh71FJcDz6S2;
        switch (i) {
            case 0:
                nextIndex = ((java.util.ListIterator) obj2).nextIndex();
                size = ((defpackage.o51) obj).size();
                break;
            case 1:
                nextIndex = ((java.util.ListIterator) obj2).nextIndex();
                size = ((defpackage.p51) obj).size();
                break;
            default:
                return ((defpackage.x31) obj2).WDYagTQQm9ns;
        }
        return (size - 1) - nextIndex;
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public final void remove() {
        switch (this.WDYagTQQm9ns) {
            case 0:
                ((java.util.ListIterator) this.oh71FJcDz6S2).remove();
                return;
            case 1:
                throw new java.lang.UnsupportedOperationException("Operation is not supported for read-only collection");
            default:
                throw new java.lang.IllegalStateException("Cannot modify a state list through an iterator");
        }
    }

    @Override // java.util.ListIterator
    public final void set(java.lang.Object obj) {
        switch (this.WDYagTQQm9ns) {
            case 0:
                ((java.util.ListIterator) this.oh71FJcDz6S2).set(obj);
                return;
            case 1:
                throw new java.lang.UnsupportedOperationException("Operation is not supported for read-only collection");
            default:
                throw new java.lang.IllegalStateException("Cannot modify a state list through an iterator");
        }
    }

    public n51(defpackage.o51 o51Var, int i) {
        this.QiMR8OkAhezm = o51Var;
        this.oh71FJcDz6S2 = o51Var.WDYagTQQm9ns.listIterator(defpackage.hf.NkfcFfdaVTox(i, o51Var));
    }

    public n51(defpackage.x31 x31Var, defpackage.nh1 nh1Var) {
        this.oh71FJcDz6S2 = x31Var;
        this.QiMR8OkAhezm = nh1Var;
    }
}
