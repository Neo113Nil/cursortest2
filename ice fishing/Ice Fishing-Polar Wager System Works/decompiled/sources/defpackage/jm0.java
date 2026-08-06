package defpackage;

/* loaded from: classes.dex */
public final class jm0 implements defpackage.ab, defpackage.fn1 {
    public final defpackage.bb adDC3e2L;
    public final /* synthetic */ defpackage.km0 xiZrDbcSW0;

    public jm0(defpackage.km0 km0Var, defpackage.bb bbVar) {
        this.xiZrDbcSW0 = km0Var;
        this.adDC3e2L = bbVar;
    }

    @Override // defpackage.ab
    public final void DFo87pBq1E5(java.lang.Object obj, defpackage.l00 l00Var) {
        java.util.concurrent.atomic.AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = defpackage.km0.SyNS6RMn;
        defpackage.km0 km0Var = this.xiZrDbcSW0;
        atomicReferenceFieldUpdater.set(km0Var, null);
        defpackage.DFo87pBq1E5 dFo87pBq1E5 = new defpackage.DFo87pBq1E5(15, km0Var, this);
        defpackage.bb bbVar = this.adDC3e2L;
        bbVar.SiPhmbmu(defpackage.ok1.IHQe1A4L2xu, bbVar.AARZUJiTa, new defpackage.dm1(1, dFo87pBq1E5));
    }

    @Override // defpackage.fn1
    public final void IHQe1A4L2xu(defpackage.t61 t61Var, int i) {
        this.adDC3e2L.IHQe1A4L2xu(t61Var, i);
    }

    @Override // defpackage.ab
    public final defpackage.et QoRHpC4k(java.lang.Object obj, defpackage.l00 l00Var) {
        defpackage.km0 km0Var = this.xiZrDbcSW0;
        defpackage.dm1 dm1Var = new defpackage.dm1(km0Var, this);
        defpackage.et wll2JLbTBC2 = this.adDC3e2L.wll2JLbTBC2((defpackage.ok1) obj, dm1Var);
        if (wll2JLbTBC2 != null) {
            defpackage.km0.SyNS6RMn.set(km0Var, null);
        }
        return wll2JLbTBC2;
    }

    @Override // defpackage.ej
    public final void SH1y5HwkJhh(java.lang.Object obj) {
        this.adDC3e2L.SH1y5HwkJhh(obj);
    }

    @Override // defpackage.ab
    public final void abhbClRa(java.lang.Object obj) {
        this.adDC3e2L.abhbClRa(obj);
    }

    @Override // defpackage.ab
    public final boolean fnWB2E7cs(java.lang.Throwable th) {
        return this.adDC3e2L.fnWB2E7cs(th);
    }

    @Override // defpackage.ej
    public final defpackage.lj xiZrDbcSW0() {
        return this.adDC3e2L.riuEU0zW4;
    }
}
