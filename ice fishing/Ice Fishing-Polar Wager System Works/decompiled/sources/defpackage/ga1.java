package defpackage;

/* loaded from: classes.dex */
public final class ga1 implements defpackage.hh, java.lang.Iterable, defpackage.g90 {
    public final int AARZUJiTa;
    public final defpackage.fa1 adDC3e2L;
    public final int xiZrDbcSW0;

    public ga1(defpackage.fa1 fa1Var, int i, int i2) {
        this.adDC3e2L = fa1Var;
        this.xiZrDbcSW0 = i;
        this.AARZUJiTa = i2;
    }

    public final boolean equals(java.lang.Object obj) {
        if (!(obj instanceof defpackage.ga1)) {
            return false;
        }
        defpackage.ga1 ga1Var = (defpackage.ga1) obj;
        return ga1Var.xiZrDbcSW0 == this.xiZrDbcSW0 && ga1Var.AARZUJiTa == this.AARZUJiTa && ga1Var.adDC3e2L == this.adDC3e2L;
    }

    public final int hashCode() {
        return (this.adDC3e2L.hashCode() * 31) + this.xiZrDbcSW0;
    }

    @Override // java.lang.Iterable
    public final java.util.Iterator iterator() {
        defpackage.fa1 fa1Var = this.adDC3e2L;
        if (fa1Var.JlrlGoKF != this.AARZUJiTa) {
            defpackage.ha1.xiZrDbcSW0();
        }
        int i = this.xiZrDbcSW0;
        fa1Var.AARZUJiTa(i);
        return new defpackage.b30(fa1Var, i + 1, fa1Var.adDC3e2L[(i * 5) + 3] + i);
    }
}
