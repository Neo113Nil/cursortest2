package defpackage;

/* loaded from: classes.dex */
public final class sk0 extends defpackage.sg {
    public final defpackage.ol0 F7NU4MC0GW;
    public final defpackage.nl0 adDC3e2L;
    public final defpackage.nl0 oh6vYeIP;
    public final java.util.ArrayList r1MBDhnF;
    public final defpackage.qq0 xiZrDbcSW0;

    public sk0() {
        super(1);
        this.oh6vYeIP = defpackage.f70.EXtogiMhuM();
        this.r1MBDhnF = new java.util.ArrayList();
        defpackage.ol0 ol0Var = defpackage.a51.IHQe1A4L2xu;
        this.F7NU4MC0GW = new defpackage.ol0();
        this.adDC3e2L = new defpackage.nl0();
        defpackage.t2LXIqmbaC5 t2lxiqmbac5 = new defpackage.t2LXIqmbaC5(8, this);
        defpackage.wa1.adDC3e2L(defpackage.wa1.IHQe1A4L2xu);
        synchronized (defpackage.wa1.r1MBDhnF) {
            defpackage.wa1.EXtogiMhuM = defpackage.td.ZNF7fheNE(defpackage.wa1.EXtogiMhuM, t2lxiqmbac5);
        }
        this.xiZrDbcSW0 = new defpackage.qq0(t2lxiqmbac5);
    }

    @Override // defpackage.sg
    public final defpackage.g00 EXtogiMhuM(defpackage.w71 w71Var) {
        defpackage.nl0 nl0Var = this.adDC3e2L;
        defpackage.g00 g00Var = (defpackage.g00) nl0Var.AARZUJiTa(w71Var);
        if (g00Var == null) {
            g00Var = new defpackage.r1MBDhnF(14, this, w71Var);
            int xiZrDbcSW0 = nl0Var.xiZrDbcSW0(w71Var);
            if (xiZrDbcSW0 < 0) {
                xiZrDbcSW0 = ~xiZrDbcSW0;
            }
            java.lang.Object[] objArr = nl0Var.r1MBDhnF;
            java.lang.Object obj = objArr[xiZrDbcSW0];
            nl0Var.oh6vYeIP[xiZrDbcSW0] = w71Var;
            objArr[xiZrDbcSW0] = g00Var;
        }
        return g00Var;
    }

    @Override // defpackage.sg
    public final void F7NU4MC0GW() {
        synchronized (this.IHQe1A4L2xu) {
            try {
                java.util.ArrayList arrayList = this.r1MBDhnF;
                int size = arrayList.size();
                for (int i = 0; i < size; i++) {
                    defpackage.rk0 rk0Var = (defpackage.rk0) arrayList.get(i);
                    if (rk0Var instanceof defpackage.pk0) {
                        defpackage.f70.adDC3e2L(this.oh6vYeIP, ((defpackage.pk0) rk0Var).IHQe1A4L2xu, ((defpackage.pk0) rk0Var).oh6vYeIP);
                    } else {
                        if (!(rk0Var instanceof defpackage.qk0)) {
                            throw new defpackage.cf();
                        }
                        defpackage.f70.NHJTzaLwkd(this.oh6vYeIP, ((defpackage.qk0) rk0Var).IHQe1A4L2xu);
                    }
                }
            } catch (java.lang.Throwable th) {
                throw th;
            }
        }
        this.r1MBDhnF.clear();
    }

    @Override // defpackage.sg
    public final void adDC3e2L() {
        this.xiZrDbcSW0.IHQe1A4L2xu();
        this.r1MBDhnF.clear();
        this.adDC3e2L.IHQe1A4L2xu();
        synchronized (this.IHQe1A4L2xu) {
            this.oh6vYeIP.IHQe1A4L2xu();
        }
    }

    @Override // defpackage.sg
    public final void r1MBDhnF(defpackage.w71 w71Var) {
        this.r1MBDhnF.add(new defpackage.qk0(w71Var));
    }
}
