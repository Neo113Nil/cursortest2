package defpackage;

/* loaded from: classes.dex */
public final class jc1 extends defpackage.mc1 {
    public int F7NU4MC0GW;
    public int adDC3e2L;
    public defpackage.D2vUnMij r1MBDhnF;

    public jc1(long j, defpackage.D2vUnMij d2vUnMij) {
        super(j);
        this.r1MBDhnF = d2vUnMij;
    }

    @Override // defpackage.mc1
    public final void IHQe1A4L2xu(defpackage.mc1 mc1Var) {
        synchronized (defpackage.ci0.cnag84Bm) {
            mc1Var.getClass();
            this.r1MBDhnF = ((defpackage.jc1) mc1Var).r1MBDhnF;
            this.F7NU4MC0GW = ((defpackage.jc1) mc1Var).F7NU4MC0GW;
            this.adDC3e2L = ((defpackage.jc1) mc1Var).adDC3e2L;
        }
    }

    @Override // defpackage.mc1
    public final defpackage.mc1 oh6vYeIP(long j) {
        return new defpackage.jc1(j, this.r1MBDhnF);
    }
}
