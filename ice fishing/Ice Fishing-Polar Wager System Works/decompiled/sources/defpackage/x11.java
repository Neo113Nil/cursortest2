package defpackage;

/* loaded from: classes.dex */
public final class x11 implements java.util.ListIterator, defpackage.g90 {
    public final /* synthetic */ java.lang.Object AARZUJiTa;
    public final /* synthetic */ int adDC3e2L = 1;
    public final java.lang.Object xiZrDbcSW0;

    public x11(defpackage.y11 y11Var, int i) {
        this.AARZUJiTa = y11Var;
        java.util.List list = y11Var.adDC3e2L;
        if (i >= 0 && i <= y11Var.IHQe1A4L2xu()) {
            this.xiZrDbcSW0 = list.listIterator(y11Var.IHQe1A4L2xu() - i);
            return;
        }
        java.lang.StringBuilder JlrlGoKF = defpackage.fx0.JlrlGoKF(i, "Position index ", " must be in range [");
        JlrlGoKF.append(new defpackage.d70(0, y11Var.IHQe1A4L2xu(), 1));
        JlrlGoKF.append("].");
        throw new java.lang.IndexOutOfBoundsException(JlrlGoKF.toString());
    }

    @Override // java.util.ListIterator
    public final void add(java.lang.Object obj) {
        switch (this.adDC3e2L) {
            case 0:
                throw new java.lang.UnsupportedOperationException("Operation is not supported for read-only collection");
            default:
                throw new java.lang.IllegalStateException("Cannot modify a state list through an iterator");
        }
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public final boolean hasNext() {
        int i = this.adDC3e2L;
        java.lang.Object obj = this.xiZrDbcSW0;
        switch (i) {
            case 0:
                return ((java.util.ListIterator) obj).hasPrevious();
            default:
                return ((defpackage.pz0) obj).adDC3e2L < ((defpackage.bd1) this.AARZUJiTa).EXtogiMhuM - 1;
        }
    }

    @Override // java.util.ListIterator
    public final boolean hasPrevious() {
        int i = this.adDC3e2L;
        java.lang.Object obj = this.xiZrDbcSW0;
        switch (i) {
            case 0:
                return ((java.util.ListIterator) obj).hasNext();
            default:
                return ((defpackage.pz0) obj).adDC3e2L >= 0;
        }
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public final java.lang.Object next() {
        int i = this.adDC3e2L;
        java.lang.Object obj = this.xiZrDbcSW0;
        switch (i) {
            case 0:
                return ((java.util.ListIterator) obj).previous();
            default:
                defpackage.pz0 pz0Var = (defpackage.pz0) obj;
                int i2 = pz0Var.adDC3e2L + 1;
                defpackage.bd1 bd1Var = (defpackage.bd1) this.AARZUJiTa;
                defpackage.ci0.riuEU0zW4(i2, bd1Var.EXtogiMhuM);
                pz0Var.adDC3e2L = i2;
                return bd1Var.get(i2);
        }
    }

    @Override // java.util.ListIterator
    public final int nextIndex() {
        int i = this.adDC3e2L;
        java.lang.Object obj = this.xiZrDbcSW0;
        switch (i) {
            case 0:
                defpackage.y11 y11Var = (defpackage.y11) this.AARZUJiTa;
                return (y11Var.size() - 1) - ((java.util.ListIterator) obj).previousIndex();
            default:
                return ((defpackage.pz0) obj).adDC3e2L + 1;
        }
    }

    @Override // java.util.ListIterator
    public final java.lang.Object previous() {
        int i = this.adDC3e2L;
        java.lang.Object obj = this.xiZrDbcSW0;
        switch (i) {
            case 0:
                return ((java.util.ListIterator) obj).next();
            default:
                defpackage.pz0 pz0Var = (defpackage.pz0) obj;
                int i2 = pz0Var.adDC3e2L;
                defpackage.bd1 bd1Var = (defpackage.bd1) this.AARZUJiTa;
                defpackage.ci0.riuEU0zW4(i2, bd1Var.EXtogiMhuM);
                pz0Var.adDC3e2L = i2 - 1;
                return bd1Var.get(i2);
        }
    }

    @Override // java.util.ListIterator
    public final int previousIndex() {
        int i = this.adDC3e2L;
        java.lang.Object obj = this.xiZrDbcSW0;
        switch (i) {
            case 0:
                defpackage.y11 y11Var = (defpackage.y11) this.AARZUJiTa;
                return (y11Var.size() - 1) - ((java.util.ListIterator) obj).nextIndex();
            default:
                return ((defpackage.pz0) obj).adDC3e2L;
        }
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public final void remove() {
        switch (this.adDC3e2L) {
            case 0:
                throw new java.lang.UnsupportedOperationException("Operation is not supported for read-only collection");
            default:
                throw new java.lang.IllegalStateException("Cannot modify a state list through an iterator");
        }
    }

    @Override // java.util.ListIterator
    public final void set(java.lang.Object obj) {
        switch (this.adDC3e2L) {
            case 0:
                throw new java.lang.UnsupportedOperationException("Operation is not supported for read-only collection");
            default:
                throw new java.lang.IllegalStateException("Cannot modify a state list through an iterator");
        }
    }

    public x11(defpackage.pz0 pz0Var, defpackage.bd1 bd1Var) {
        this.xiZrDbcSW0 = pz0Var;
        this.AARZUJiTa = bd1Var;
    }
}
