package defpackage;

/* loaded from: classes.dex */
public final class k91 implements defpackage.kq {
    public final java.lang.Object AARZUJiTa;
    public final defpackage.bb EXtogiMhuM;
    public final defpackage.m91 adDC3e2L;
    public final long xiZrDbcSW0;

    public k91(defpackage.m91 m91Var, long j, java.lang.Object obj, defpackage.bb bbVar) {
        this.adDC3e2L = m91Var;
        this.xiZrDbcSW0 = j;
        this.AARZUJiTa = obj;
        this.EXtogiMhuM = bbVar;
    }

    @Override // defpackage.kq
    public final void IHQe1A4L2xu() {
        defpackage.m91 m91Var = this.adDC3e2L;
        synchronized (m91Var) {
            if (this.xiZrDbcSW0 < m91Var.cnag84Bm()) {
                return;
            }
            java.lang.Object[] objArr = m91Var.JlrlGoKF;
            objArr.getClass();
            long j = this.xiZrDbcSW0;
            if (objArr[((int) j) & (objArr.length - 1)] != this) {
                return;
            }
            defpackage.w70.SH1y5HwkJhh(objArr, j, defpackage.w70.Uv8CGu3G);
            m91Var.SH1y5HwkJhh();
        }
    }
}
