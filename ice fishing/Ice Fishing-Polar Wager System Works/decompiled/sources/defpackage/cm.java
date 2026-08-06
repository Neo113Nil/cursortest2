package defpackage;

/* loaded from: classes.dex */
public final class cm {
    public final defpackage.hc1 IHQe1A4L2xu;

    public cm() {
        this.IHQe1A4L2xu = defpackage.gq1.F7NU4MC0GW(defpackage.ik1.oh6vYeIP);
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0030  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void IHQe1A4L2xu(defpackage.zb zbVar, defpackage.fj fjVar) {
        defpackage.cq0 cq0Var;
        int i;
        if (fjVar instanceof defpackage.cq0) {
            cq0Var = (defpackage.cq0) fjVar;
            int i2 = cq0Var.SH1y5HwkJhh;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                cq0Var.SH1y5HwkJhh = i2 - Integer.MIN_VALUE;
                java.lang.Object obj = cq0Var.EXtogiMhuM;
                i = cq0Var.SH1y5HwkJhh;
                if (i != 0) {
                    defpackage.f70.nBH8hAHy(obj);
                    cq0Var.SH1y5HwkJhh = 1;
                    this.IHQe1A4L2xu.IHQe1A4L2xu(zbVar, cq0Var);
                    return;
                } else if (i != 1) {
                    defpackage.db.AARZUJiTa("call to 'resume' before 'invoke' with coroutine");
                    return;
                } else {
                    defpackage.f70.nBH8hAHy(obj);
                    throw new defpackage.cf();
                }
            }
        }
        cq0Var = new defpackage.cq0(this, fjVar);
        java.lang.Object obj2 = cq0Var.EXtogiMhuM;
        i = cq0Var.SH1y5HwkJhh;
        if (i != 0) {
        }
    }

    public defpackage.dc1 oh6vYeIP() {
        return (defpackage.dc1) this.IHQe1A4L2xu.getValue();
    }

    /* JADX WARN: Code restructure failed: missing block: B:9:0x0023, code lost:
    
        if (r6.IHQe1A4L2xu > r2.IHQe1A4L2xu) goto L13;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void r1MBDhnF(defpackage.dc1 dc1Var) {
        defpackage.hc1 hc1Var;
        java.lang.Object value;
        defpackage.dc1 dc1Var2;
        dc1Var.getClass();
        do {
            hc1Var = this.IHQe1A4L2xu;
            value = hc1Var.getValue();
            dc1Var2 = (defpackage.dc1) value;
            if (!(dc1Var2 instanceof defpackage.uy0 ? true : defpackage.x70.QoRHpC4k(dc1Var2, defpackage.ik1.oh6vYeIP))) {
                if (!(dc1Var2 instanceof defpackage.zk)) {
                    if (!(dc1Var2 instanceof defpackage.sv)) {
                        defpackage.db.F7NU4MC0GW();
                        return;
                    }
                }
            }
            dc1Var2 = dc1Var;
        } while (!hc1Var.riuEU0zW4(value, dc1Var2));
    }

    public cm(int i) {
        this.IHQe1A4L2xu = defpackage.gq1.F7NU4MC0GW(new int[i]);
    }
}
