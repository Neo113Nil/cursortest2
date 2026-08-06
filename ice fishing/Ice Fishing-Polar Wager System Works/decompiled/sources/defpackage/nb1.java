package defpackage;

/* loaded from: classes.dex */
public final class nb1 implements defpackage.hh, java.lang.Iterable, defpackage.g90 {
    public final defpackage.wz0 AARZUJiTa;
    public final defpackage.fa1 adDC3e2L;
    public final int xiZrDbcSW0;

    public nb1(defpackage.fa1 fa1Var, int i, defpackage.v10 v10Var, defpackage.wz0 wz0Var) {
        this.adDC3e2L = fa1Var;
        this.xiZrDbcSW0 = i;
        this.AARZUJiTa = wz0Var;
    }

    public final boolean equals(java.lang.Object obj) {
        if (!(obj instanceof defpackage.nb1)) {
            return false;
        }
        defpackage.nb1 nb1Var = (defpackage.nb1) obj;
        return nb1Var.xiZrDbcSW0 == this.xiZrDbcSW0 && nb1Var.adDC3e2L == this.adDC3e2L && nb1Var.AARZUJiTa.equals(this.AARZUJiTa);
    }

    public final int hashCode() {
        return this.AARZUJiTa.hashCode() + ((this.adDC3e2L.hashCode() + (this.xiZrDbcSW0 * 31)) * 31);
    }

    @Override // java.lang.Iterable
    public final java.util.Iterator iterator() {
        return new defpackage.mb1(this.adDC3e2L, this.xiZrDbcSW0, null, this.AARZUJiTa);
    }
}
