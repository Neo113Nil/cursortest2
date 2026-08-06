package defpackage;

/* loaded from: classes.dex */
public final class y91 extends defpackage.sg {
    public final defpackage.DFo87pBq1E5 AARZUJiTa;
    public final defpackage.qq0 EXtogiMhuM;
    public defpackage.ol0 F7NU4MC0GW;
    public defpackage.ol0 adDC3e2L;
    public java.lang.Object oh6vYeIP;
    public java.lang.Object r1MBDhnF;
    public defpackage.w71 xiZrDbcSW0;

    public y91() {
        super(1);
        this.AARZUJiTa = new defpackage.DFo87pBq1E5(26, this);
        defpackage.t2LXIqmbaC5 t2lxiqmbac5 = new defpackage.t2LXIqmbaC5(13, this);
        defpackage.wa1.adDC3e2L(defpackage.wa1.IHQe1A4L2xu);
        synchronized (defpackage.wa1.r1MBDhnF) {
            defpackage.wa1.EXtogiMhuM = defpackage.td.ZNF7fheNE(defpackage.wa1.EXtogiMhuM, t2lxiqmbac5);
        }
        this.EXtogiMhuM = new defpackage.qq0(t2lxiqmbac5);
    }

    @Override // defpackage.sg
    public final defpackage.g00 EXtogiMhuM(defpackage.w71 w71Var) {
        defpackage.w71 w71Var2 = this.xiZrDbcSW0;
        if (w71Var2 != null && !w71Var2.equals(w71Var)) {
            defpackage.nw0.oh6vYeIP("Requested a SingleSubscriptionSnapshotFlowManager to manage multiple subscriptions");
        }
        this.xiZrDbcSW0 = w71Var;
        return this.AARZUJiTa;
    }

    @Override // defpackage.sg
    public final void F7NU4MC0GW() {
        synchronized (this.IHQe1A4L2xu) {
            try {
                this.oh6vYeIP = this.r1MBDhnF;
                if (this.adDC3e2L == null) {
                    this.F7NU4MC0GW = null;
                } else {
                    if (this.F7NU4MC0GW == null) {
                        defpackage.ol0 ol0Var = defpackage.a51.IHQe1A4L2xu;
                        this.F7NU4MC0GW = new defpackage.ol0();
                    }
                    defpackage.ol0 ol0Var2 = this.F7NU4MC0GW;
                    this.F7NU4MC0GW = this.adDC3e2L;
                    this.adDC3e2L = ol0Var2;
                }
            } catch (java.lang.Throwable th) {
                throw th;
            }
        }
    }

    @Override // defpackage.sg
    public final void adDC3e2L() {
        this.EXtogiMhuM.IHQe1A4L2xu();
        this.r1MBDhnF = null;
        this.adDC3e2L = null;
        synchronized (this.IHQe1A4L2xu) {
            this.xiZrDbcSW0 = null;
            this.oh6vYeIP = null;
            this.F7NU4MC0GW = null;
        }
    }

    @Override // defpackage.sg
    public final void r1MBDhnF(defpackage.w71 w71Var) {
        this.r1MBDhnF = null;
        this.adDC3e2L = null;
    }
}
