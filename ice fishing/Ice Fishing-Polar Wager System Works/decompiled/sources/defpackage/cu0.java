package defpackage;

/* loaded from: classes.dex */
public final class cu0 implements defpackage.w01 {
    public final java.util.Set adDC3e2L;
    public final defpackage.xl0 xiZrDbcSW0 = new defpackage.xl0(new defpackage.x10[16]);

    public cu0(java.util.Set set) {
        this.adDC3e2L = set;
    }

    @Override // defpackage.w01
    public final void IHQe1A4L2xu() {
        defpackage.xl0 xl0Var = this.xiZrDbcSW0;
        java.lang.Object[] objArr = xl0Var.adDC3e2L;
        int i = xl0Var.AARZUJiTa;
        for (int i2 = 0; i2 < i; i2++) {
            defpackage.w01 w01Var = ((defpackage.x10) objArr[i2]).IHQe1A4L2xu;
            this.adDC3e2L.remove(w01Var);
            w01Var.IHQe1A4L2xu();
        }
    }

    @Override // defpackage.w01
    public final void adDC3e2L() {
    }

    @Override // defpackage.w01
    public final void r1MBDhnF() {
    }
}
