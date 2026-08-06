package defpackage;

/* loaded from: classes.dex */
public final class sa extends defpackage.lj0 implements defpackage.dq0, defpackage.ca, defpackage.wr {
    public final defpackage.ta EgCjBq0SZwJ;
    public boolean fnWB2E7cs;
    public final defpackage.DFo87pBq1E5 kNAkVymC;

    public sa(defpackage.ta taVar, defpackage.DFo87pBq1E5 dFo87pBq1E5) {
        this.EgCjBq0SZwJ = taVar;
        this.kNAkVymC = dFo87pBq1E5;
        taVar.adDC3e2L = this;
    }

    @Override // defpackage.wr
    public final void D2vUnMij(defpackage.oa0 oa0Var) {
        boolean z = this.fnWB2E7cs;
        defpackage.ta taVar = this.EgCjBq0SZwJ;
        if (!z) {
            taVar.xiZrDbcSW0 = null;
            defpackage.f70.V7bD7b8KA(this, new defpackage.o0(3, this, taVar));
            if (taVar.xiZrDbcSW0 == null) {
                throw defpackage.fx0.AARZUJiTa("DrawResult not defined, did you forget to call onDraw?");
            }
            this.fnWB2E7cs = true;
        }
        defpackage.c1NqjJifC7 c1nqjjifc7 = taVar.xiZrDbcSW0;
        c1nqjjifc7.getClass();
        ((defpackage.g00) c1nqjjifc7.xiZrDbcSW0).AARZUJiTa(oa0Var);
    }

    @Override // defpackage.kn, defpackage.vv0
    public final void IHQe1A4L2xu() {
        UVjEelCZ();
    }

    @Override // defpackage.wr
    public final void JcqDrWrgMf() {
        UVjEelCZ();
    }

    @Override // defpackage.kn
    public final void OtkytngK3Mr() {
        UVjEelCZ();
    }

    public final void UVjEelCZ() {
        this.fnWB2E7cs = false;
        this.EgCjBq0SZwJ.xiZrDbcSW0 = null;
        defpackage.fm.D2vUnMij(this);
    }

    @Override // defpackage.ca
    public final defpackage.w90 getLayoutDirection() {
        return defpackage.w70.D2vUnMij(this).nBH8hAHy;
    }

    @Override // defpackage.lj0
    public final void juTJww2r() {
        UVjEelCZ();
    }

    @Override // defpackage.dq0
    public final void nBH8hAHy() {
        UVjEelCZ();
    }

    @Override // defpackage.ca
    public final defpackage.qn oh6vYeIP() {
        return defpackage.w70.D2vUnMij(this).UsuH8pd5P;
    }

    @Override // defpackage.ca
    public final long r1MBDhnF() {
        return defpackage.j70.frpfPPIgqM9O(defpackage.w70.nBH8hAHy(this, 4).AARZUJiTa);
    }

    @Override // defpackage.lj0
    public final void yUiIS9dG7NYk() {
    }
}
