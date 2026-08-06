package defpackage;

/* compiled from: r8-map-id-5e15bf382d9e1cc682b2b5d208f848646545054061ee84effb1e415a0540fc32 */
/* loaded from: classes.dex */
public final class fy0 implements java.util.Iterator, defpackage.nb0 {
    public final /* synthetic */ int WDYagTQQm9ns = 1;
    public final java.util.Iterator oh71FJcDz6S2;

    public fy0(defpackage.zx0 zx0Var) {
        defpackage.wp1[] wp1VarArr = new defpackage.wp1[8];
        for (int i = 0; i < 8; i++) {
            wp1VarArr[i] = new defpackage.yp1(this);
        }
        this.oh71FJcDz6S2 = new defpackage.dy0(zx0Var, wp1VarArr);
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        switch (this.WDYagTQQm9ns) {
            case 0:
                return ((defpackage.dy0) this.oh71FJcDz6S2).QiMR8OkAhezm;
            default:
                return this.oh71FJcDz6S2.hasNext();
        }
    }

    @Override // java.util.Iterator
    public final java.lang.Object next() {
        switch (this.WDYagTQQm9ns) {
            case 0:
                return (java.util.Map.Entry) ((defpackage.dy0) this.oh71FJcDz6S2).next();
            default:
                return (defpackage.ct1) this.oh71FJcDz6S2.next();
        }
    }

    @Override // java.util.Iterator
    public final void remove() {
        switch (this.WDYagTQQm9ns) {
            case 0:
                ((defpackage.dy0) this.oh71FJcDz6S2).remove();
                return;
            default:
                throw new java.lang.UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    public fy0(defpackage.at1 at1Var) {
        this.oh71FJcDz6S2 = at1Var.gUjdnLbkVAaA.iterator();
    }
}
