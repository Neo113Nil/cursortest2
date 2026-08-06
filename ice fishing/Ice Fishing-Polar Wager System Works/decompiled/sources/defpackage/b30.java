package defpackage;

/* loaded from: classes.dex */
public final class b30 implements java.util.Iterator, defpackage.g90 {
    public int AARZUJiTa;
    public final int EXtogiMhuM;
    public final defpackage.fa1 adDC3e2L;
    public final int xiZrDbcSW0;

    public b30(defpackage.fa1 fa1Var, int i, int i2) {
        this.adDC3e2L = fa1Var;
        this.xiZrDbcSW0 = i2;
        this.AARZUJiTa = i;
        this.EXtogiMhuM = fa1Var.JlrlGoKF;
        if (fa1Var.ez2rX8ReCYw) {
            defpackage.ha1.xiZrDbcSW0();
        }
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.AARZUJiTa < this.xiZrDbcSW0;
    }

    @Override // java.util.Iterator
    public final java.lang.Object next() {
        defpackage.fa1 fa1Var = this.adDC3e2L;
        int i = fa1Var.JlrlGoKF;
        int i2 = this.EXtogiMhuM;
        if (i != i2) {
            defpackage.ha1.xiZrDbcSW0();
        }
        int i3 = this.AARZUJiTa;
        this.AARZUJiTa = fa1Var.adDC3e2L[(i3 * 5) + 3] + i3;
        return new defpackage.ga1(fa1Var, i3, i2);
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new java.lang.UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
