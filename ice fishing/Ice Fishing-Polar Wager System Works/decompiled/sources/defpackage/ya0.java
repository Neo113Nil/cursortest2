package defpackage;

/* loaded from: classes.dex */
public final class ya0 implements defpackage.dd1 {
    public final defpackage.yk0 IHQe1A4L2xu;
    public final /* synthetic */ defpackage.ab0 oh6vYeIP;
    public final /* synthetic */ java.lang.Object r1MBDhnF;

    public ya0(defpackage.ab0 ab0Var, java.lang.Object obj) {
        this.oh6vYeIP = ab0Var;
        this.r1MBDhnF = obj;
        int[] iArr = defpackage.h70.IHQe1A4L2xu;
        this.IHQe1A4L2xu = new defpackage.yk0();
    }

    @Override // defpackage.dd1
    public final void F7NU4MC0GW(int i, long j) {
        defpackage.ab0 ab0Var = this.oh6vYeIP;
        defpackage.ma0 ma0Var = (defpackage.ma0) ab0Var.SyNS6RMn.AARZUJiTa(this.r1MBDhnF);
        if (ma0Var == null || !ma0Var.p4kuH6PDtgom()) {
            return;
        }
        int i2 = ((defpackage.ul0) ma0Var.SyNS6RMn()).adDC3e2L.AARZUJiTa;
        if (i < 0 || i >= i2) {
            defpackage.x50.F7NU4MC0GW("Index (" + i + ") is out of bound of [0, " + i2 + ')');
        }
        if (ma0Var.yIx6ChFVk()) {
            defpackage.x50.IHQe1A4L2xu("Pre-measure called on node that is not placed");
        }
        defpackage.ma0 ma0Var2 = ab0Var.adDC3e2L;
        ma0Var2.fnWB2E7cs = true;
        ((defpackage.v0) defpackage.pa0.IHQe1A4L2xu(ma0Var)).V7bD7b8KA((defpackage.ma0) ((defpackage.ul0) ma0Var.SyNS6RMn()).get(i), j);
        ma0Var2.fnWB2E7cs = false;
        this.IHQe1A4L2xu.IHQe1A4L2xu(i);
    }

    @Override // defpackage.dd1
    public final void IHQe1A4L2xu() {
        defpackage.ab0.r1MBDhnF(this.oh6vYeIP, this.r1MBDhnF);
    }

    @Override // defpackage.dd1
    public final void oh6vYeIP(defpackage.on0 on0Var) {
        defpackage.ep0 ep0Var;
        defpackage.ma0 ma0Var = (defpackage.ma0) this.oh6vYeIP.SyNS6RMn.AARZUJiTa(this.r1MBDhnF);
        defpackage.lj0 lj0Var = (ma0Var == null || (ep0Var = ma0Var.yIx6ChFVk) == null) ? null : ep0Var.xiZrDbcSW0;
        if (lj0Var == null || !lj0Var.kd6TUFXn) {
            return;
        }
        defpackage.f70.frpfPPIgqM9O(lj0Var, "androidx.compose.foundation.lazy.layout.TraversablePrefetchStateNode", on0Var);
    }

    @Override // defpackage.dd1
    public final int r1MBDhnF() {
        defpackage.ma0 ma0Var = (defpackage.ma0) this.oh6vYeIP.SyNS6RMn.AARZUJiTa(this.r1MBDhnF);
        if (ma0Var != null) {
            return ((defpackage.ul0) ma0Var.SyNS6RMn()).adDC3e2L.AARZUJiTa;
        }
        return 0;
    }
}
