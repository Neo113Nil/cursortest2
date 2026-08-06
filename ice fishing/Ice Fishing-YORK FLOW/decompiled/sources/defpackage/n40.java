package defpackage;

/* compiled from: r8-map-id-5e15bf382d9e1cc682b2b5d208f848646545054061ee84effb1e415a0540fc32 */
/* loaded from: classes.dex */
public final class n40 implements java.util.Iterator, defpackage.nb0 {
    public final int P05cfTpS5W5L;
    public int QiMR8OkAhezm;
    public final defpackage.ge1 WDYagTQQm9ns;
    public final int oh71FJcDz6S2;

    public n40(defpackage.ge1 ge1Var, int i, int i2) {
        this.WDYagTQQm9ns = ge1Var;
        this.oh71FJcDz6S2 = i2;
        this.QiMR8OkAhezm = i;
        this.P05cfTpS5W5L = ge1Var.fNwYGHIYeJcR;
        if (ge1Var.Ns0WNyEWdPsk) {
            defpackage.ie1.oh71FJcDz6S2();
        }
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.QiMR8OkAhezm < this.oh71FJcDz6S2;
    }

    @Override // java.util.Iterator
    public final java.lang.Object next() {
        defpackage.ge1 ge1Var = this.WDYagTQQm9ns;
        int i = ge1Var.fNwYGHIYeJcR;
        int i2 = this.P05cfTpS5W5L;
        if (i != i2) {
            defpackage.ie1.oh71FJcDz6S2();
        }
        int i3 = this.QiMR8OkAhezm;
        this.QiMR8OkAhezm = ge1Var.WDYagTQQm9ns[(i3 * 5) + 3] + i3;
        return new defpackage.he1(ge1Var, i3, i2);
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new java.lang.UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
