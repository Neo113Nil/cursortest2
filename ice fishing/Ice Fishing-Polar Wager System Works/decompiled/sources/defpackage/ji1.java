package defpackage;

/* loaded from: classes.dex */
public final class ji1 implements defpackage.ec1 {
    public final defpackage.qt0 AARZUJiTa;
    public boolean DFo87pBq1E5;
    public final defpackage.qt0 EXtogiMhuM;
    public final /* synthetic */ defpackage.li1 EgCjBq0SZwJ;
    public boolean G3OKOH3wZRC;
    public final defpackage.mt0 JlrlGoKF;
    public final defpackage.ot0 QoRHpC4k;
    public defpackage.ye1 SH1y5HwkJhh;
    public final defpackage.qt0 SyNS6RMn;
    public final defpackage.F7NU4MC0GW adDC3e2L;
    public defpackage.i5 cnag84Bm;
    public final defpackage.qt0 ez2rX8ReCYw;
    public final defpackage.ub1 kd6TUFXn;
    public defpackage.l61 riuEU0zW4;
    public final defpackage.qt0 xiZrDbcSW0;

    public ji1(defpackage.li1 li1Var, java.lang.Object obj, defpackage.i5 i5Var, defpackage.F7NU4MC0GW f7nu4mc0gw) {
        this.EgCjBq0SZwJ = li1Var;
        this.adDC3e2L = f7nu4mc0gw;
        defpackage.qt0 nBH8hAHy = defpackage.c80.nBH8hAHy(obj);
        this.xiZrDbcSW0 = nBH8hAHy;
        java.lang.Object obj2 = null;
        this.AARZUJiTa = defpackage.c80.nBH8hAHy(defpackage.w70.SiPhmbmu(0.0f, 0.0f, null, 7));
        this.EXtogiMhuM = defpackage.c80.nBH8hAHy(new defpackage.ye1(oh6vYeIP(), f7nu4mc0gw, obj, nBH8hAHy.getValue(), i5Var));
        this.ez2rX8ReCYw = defpackage.c80.nBH8hAHy(java.lang.Boolean.TRUE);
        this.JlrlGoKF = new defpackage.mt0(-1.0f);
        this.SyNS6RMn = defpackage.c80.nBH8hAHy(obj);
        this.cnag84Bm = i5Var;
        this.QoRHpC4k = new defpackage.ot0(IHQe1A4L2xu().r1MBDhnF());
        java.lang.Float f = (java.lang.Float) defpackage.en1.IHQe1A4L2xu.get(f7nu4mc0gw);
        if (f != null) {
            float floatValue = f.floatValue();
            defpackage.i5 i5Var2 = (defpackage.i5) ((defpackage.g00) f7nu4mc0gw.xiZrDbcSW0).AARZUJiTa(obj);
            int oh6vYeIP = i5Var2.oh6vYeIP();
            for (int i = 0; i < oh6vYeIP; i++) {
                i5Var2.adDC3e2L(floatValue, i);
            }
            obj2 = ((defpackage.g00) this.adDC3e2L.AARZUJiTa).AARZUJiTa(i5Var2);
        }
        this.kd6TUFXn = defpackage.w70.SiPhmbmu(0.0f, 0.0f, obj2, 3);
    }

    public final void AARZUJiTa(java.lang.Object obj, java.lang.Object obj2, defpackage.tv tvVar) {
        this.xiZrDbcSW0.setValue(obj2);
        this.AARZUJiTa.setValue(tvVar);
        if (defpackage.x70.QoRHpC4k(IHQe1A4L2xu().F7NU4MC0GW, obj) && defpackage.x70.QoRHpC4k(IHQe1A4L2xu().r1MBDhnF, obj2)) {
            return;
        }
        xiZrDbcSW0(obj, false);
    }

    public final void EXtogiMhuM(java.lang.Object obj, defpackage.tv tvVar) {
        if (this.DFo87pBq1E5) {
            defpackage.ye1 ye1Var = this.SH1y5HwkJhh;
            if (defpackage.x70.QoRHpC4k(obj, ye1Var != null ? ye1Var.r1MBDhnF : null)) {
                return;
            }
        }
        defpackage.qt0 qt0Var = this.xiZrDbcSW0;
        boolean QoRHpC4k = defpackage.x70.QoRHpC4k(qt0Var.getValue(), obj);
        defpackage.mt0 mt0Var = this.JlrlGoKF;
        if (QoRHpC4k && mt0Var.AARZUJiTa() == -1.0f) {
            return;
        }
        qt0Var.setValue(obj);
        this.AARZUJiTa.setValue(tvVar);
        java.lang.Object value = mt0Var.AARZUJiTa() == -3.0f ? obj : this.SyNS6RMn.getValue();
        defpackage.qt0 qt0Var2 = this.ez2rX8ReCYw;
        xiZrDbcSW0(value, !((java.lang.Boolean) qt0Var2.getValue()).booleanValue());
        qt0Var2.setValue(java.lang.Boolean.valueOf(mt0Var.AARZUJiTa() == -3.0f));
        if (mt0Var.AARZUJiTa() >= 0.0f) {
            adDC3e2L(IHQe1A4L2xu().oh6vYeIP((long) (mt0Var.AARZUJiTa() * IHQe1A4L2xu().r1MBDhnF())));
        } else if (mt0Var.AARZUJiTa() == -3.0f) {
            adDC3e2L(obj);
        }
        this.DFo87pBq1E5 = false;
        mt0Var.EXtogiMhuM(-1.0f);
    }

    public final defpackage.ye1 IHQe1A4L2xu() {
        return (defpackage.ye1) this.EXtogiMhuM.getValue();
    }

    public final void adDC3e2L(java.lang.Object obj) {
        this.SyNS6RMn.setValue(obj);
    }

    @Override // defpackage.ec1
    public final java.lang.Object getValue() {
        return this.SyNS6RMn.getValue();
    }

    public final defpackage.tv oh6vYeIP() {
        return (defpackage.tv) this.AARZUJiTa.getValue();
    }

    public final void r1MBDhnF(long j) {
        if (this.JlrlGoKF.AARZUJiTa() == -1.0f) {
            this.G3OKOH3wZRC = true;
            if (defpackage.x70.QoRHpC4k(IHQe1A4L2xu().r1MBDhnF, IHQe1A4L2xu().F7NU4MC0GW)) {
                adDC3e2L(IHQe1A4L2xu().r1MBDhnF);
            } else {
                adDC3e2L(IHQe1A4L2xu().oh6vYeIP(j));
                this.cnag84Bm = IHQe1A4L2xu().xiZrDbcSW0(j);
            }
        }
    }

    public final java.lang.String toString() {
        return "current value: " + this.SyNS6RMn.getValue() + ", target: " + this.xiZrDbcSW0.getValue() + ", spec: " + oh6vYeIP();
    }

    public final void xiZrDbcSW0(java.lang.Object obj, boolean z) {
        defpackage.ye1 ye1Var = this.SH1y5HwkJhh;
        java.lang.Object obj2 = ye1Var != null ? ye1Var.r1MBDhnF : null;
        defpackage.qt0 qt0Var = this.xiZrDbcSW0;
        boolean QoRHpC4k = defpackage.x70.QoRHpC4k(obj2, qt0Var.getValue());
        defpackage.ot0 ot0Var = this.QoRHpC4k;
        defpackage.qt0 qt0Var2 = this.EXtogiMhuM;
        defpackage.F7NU4MC0GW f7nu4mc0gw = this.adDC3e2L;
        if (QoRHpC4k) {
            qt0Var2.setValue(new defpackage.ye1(this.kd6TUFXn, f7nu4mc0gw, obj, obj, this.cnag84Bm.r1MBDhnF()));
            this.DFo87pBq1E5 = true;
            ot0Var.EXtogiMhuM(IHQe1A4L2xu().r1MBDhnF());
            return;
        }
        defpackage.tv oh6vYeIP = (!z || this.G3OKOH3wZRC) ? oh6vYeIP() : oh6vYeIP() instanceof defpackage.ub1 ? oh6vYeIP() : this.kd6TUFXn;
        defpackage.li1 li1Var = this.EgCjBq0SZwJ;
        long adDC3e2L = li1Var.adDC3e2L();
        defpackage.qt0 qt0Var3 = li1Var.EXtogiMhuM;
        qt0Var2.setValue(new defpackage.ye1(adDC3e2L <= 0 ? oh6vYeIP : new defpackage.yb1(oh6vYeIP, li1Var.adDC3e2L()), f7nu4mc0gw, obj, qt0Var.getValue(), this.cnag84Bm));
        ot0Var.EXtogiMhuM(IHQe1A4L2xu().r1MBDhnF());
        this.DFo87pBq1E5 = false;
        qt0Var3.setValue(java.lang.Boolean.TRUE);
        if (li1Var.AARZUJiTa()) {
            defpackage.gb1 gb1Var = li1Var.riuEU0zW4;
            int size = gb1Var.size();
            long j = 0;
            for (int i = 0; i < size; i++) {
                defpackage.ji1 ji1Var = (defpackage.ji1) gb1Var.get(i);
                j = java.lang.Math.max(j, ji1Var.QoRHpC4k.AARZUJiTa());
                ji1Var.r1MBDhnF(0L);
            }
            qt0Var3.setValue(java.lang.Boolean.FALSE);
        }
    }
}
