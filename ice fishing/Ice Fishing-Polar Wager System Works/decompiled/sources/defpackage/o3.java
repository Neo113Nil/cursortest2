package defpackage;

/* loaded from: classes.dex */
public final class o3 implements defpackage.jj {
    public final java.lang.Object AARZUJiTa;
    public final /* synthetic */ int adDC3e2L;
    public final java.lang.Object xiZrDbcSW0;

    public o3(defpackage.o3 o3Var) {
        this.adDC3e2L = 2;
        this.xiZrDbcSW0 = o3Var;
        this.AARZUJiTa = new defpackage.q90();
    }

    @Override // defpackage.lj
    public final java.lang.Object EgCjBq0SZwJ(defpackage.k00 k00Var, java.lang.Object obj) {
        switch (this.adDC3e2L) {
        }
        return k00Var.adDC3e2L(obj, this);
    }

    /* JADX WARN: Code restructure failed: missing block: B:30:0x007c, code lost:
    
        if (r9 == r1) goto L35;
     */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0029  */
    /* JADX WARN: Removed duplicated region for block: B:22:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:23:0x003e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object IHQe1A4L2xu(defpackage.g00 g00Var, defpackage.fj fjVar) {
        defpackage.au0 au0Var;
        defpackage.vj vjVar;
        int i;
        boolean z;
        java.lang.Object kNAkVymC;
        java.lang.Object IHQe1A4L2xu;
        int i2 = 0;
        int i3 = 1;
        switch (this.adDC3e2L) {
            case 0:
                defpackage.l3 l3Var = (defpackage.l3) this.AARZUJiTa;
                defpackage.bb bbVar = new defpackage.bb(1, defpackage.c80.V7bD7b8KA(fjVar));
                bbVar.PAEGRtP0bX();
                defpackage.n3 n3Var = new defpackage.n3(bbVar, this, g00Var);
                if (defpackage.x70.QoRHpC4k(l3Var.AARZUJiTa, (android.view.Choreographer) this.xiZrDbcSW0)) {
                    synchronized (l3Var.riuEU0zW4) {
                        l3Var.ez2rX8ReCYw.add(n3Var);
                        if (!l3Var.SyNS6RMn) {
                            l3Var.SyNS6RMn = true;
                            l3Var.AARZUJiTa.postFrameCallback(l3Var.cnag84Bm);
                        }
                    }
                    bbVar.QQUzIjv3iOC5(new defpackage.m3(i2, l3Var, n3Var));
                } else {
                    ((android.view.Choreographer) this.xiZrDbcSW0).postFrameCallback(n3Var);
                    bbVar.QQUzIjv3iOC5(new defpackage.m3(i3, this, n3Var));
                }
                return bbVar.kNAkVymC();
            case 1:
                defpackage.bb bbVar2 = new defpackage.bb(1, defpackage.c80.V7bD7b8KA(fjVar));
                bbVar2.PAEGRtP0bX();
                defpackage.m7 m7Var = (defpackage.m7) this.AARZUJiTa;
                defpackage.p9 p9Var = new defpackage.p9();
                p9Var.IHQe1A4L2xu = bbVar2;
                p9Var.oh6vYeIP = g00Var;
                bbVar2.QQUzIjv3iOC5(new defpackage.q9(i2, m7Var.F7NU4MC0GW(p9Var, (defpackage.bz0) this.xiZrDbcSW0)));
                return bbVar2.kNAkVymC();
            default:
                if (fjVar instanceof defpackage.au0) {
                    au0Var = (defpackage.au0) fjVar;
                    int i4 = au0Var.ez2rX8ReCYw;
                    if ((i4 & Integer.MIN_VALUE) != 0) {
                        au0Var.ez2rX8ReCYw = i4 - Integer.MIN_VALUE;
                        java.lang.Object obj = au0Var.riuEU0zW4;
                        vjVar = defpackage.vj.adDC3e2L;
                        i = au0Var.ez2rX8ReCYw;
                        int i5 = 2;
                        if (i != 0) {
                            defpackage.f70.nBH8hAHy(obj);
                            defpackage.q90 q90Var = (defpackage.q90) this.AARZUJiTa;
                            au0Var.EXtogiMhuM = g00Var;
                            au0Var.ez2rX8ReCYw = 1;
                            synchronized (q90Var.oh6vYeIP) {
                                z = q90Var.IHQe1A4L2xu;
                            }
                            if (!z) {
                                defpackage.bb bbVar3 = new defpackage.bb(1, defpackage.c80.V7bD7b8KA(au0Var));
                                bbVar3.PAEGRtP0bX();
                                synchronized (q90Var.oh6vYeIP) {
                                    ((java.util.ArrayList) q90Var.r1MBDhnF).add(bbVar3);
                                }
                                bbVar3.QQUzIjv3iOC5(new defpackage.k20(i5, q90Var, bbVar3));
                                kNAkVymC = bbVar3.kNAkVymC();
                                if (kNAkVymC != vjVar) {
                                    kNAkVymC = defpackage.ok1.IHQe1A4L2xu;
                                    break;
                                }
                            } else {
                                kNAkVymC = defpackage.ok1.IHQe1A4L2xu;
                                break;
                            }
                        } else {
                            if (i != 1) {
                                if (i == 2) {
                                    defpackage.f70.nBH8hAHy(obj);
                                    return obj;
                                }
                                defpackage.db.AARZUJiTa("call to 'resume' before 'invoke' with coroutine");
                                return null;
                            }
                            g00Var = au0Var.EXtogiMhuM;
                            defpackage.f70.nBH8hAHy(obj);
                        }
                        defpackage.o3 o3Var = (defpackage.o3) this.xiZrDbcSW0;
                        au0Var.EXtogiMhuM = null;
                        au0Var.ez2rX8ReCYw = 2;
                        IHQe1A4L2xu = o3Var.IHQe1A4L2xu(g00Var, au0Var);
                        if (IHQe1A4L2xu != vjVar) {
                            return IHQe1A4L2xu;
                        }
                        return vjVar;
                    }
                }
                au0Var = new defpackage.au0(this, fjVar);
                java.lang.Object obj2 = au0Var.riuEU0zW4;
                vjVar = defpackage.vj.adDC3e2L;
                i = au0Var.ez2rX8ReCYw;
                int i52 = 2;
                if (i != 0) {
                }
                defpackage.o3 o3Var2 = (defpackage.o3) this.xiZrDbcSW0;
                au0Var.EXtogiMhuM = null;
                au0Var.ez2rX8ReCYw = 2;
                IHQe1A4L2xu = o3Var2.IHQe1A4L2xu(g00Var, au0Var);
                if (IHQe1A4L2xu != vjVar) {
                }
                return vjVar;
        }
    }

    @Override // defpackage.lj
    public final defpackage.lj JlrlGoKF(defpackage.lj ljVar) {
        switch (this.adDC3e2L) {
        }
        return defpackage.ci0.hkbnNdmy(this, ljVar);
    }

    @Override // defpackage.lj
    public final defpackage.lj V7bD7b8KA(defpackage.kj kjVar) {
        switch (this.adDC3e2L) {
        }
        return defpackage.ci0.XZx205DYe(this, kjVar);
    }

    @Override // defpackage.lj
    public final defpackage.jj cnag84Bm(defpackage.kj kjVar) {
        switch (this.adDC3e2L) {
        }
        return defpackage.ci0.NHJTzaLwkd(this, kjVar);
    }

    @Override // defpackage.jj
    public defpackage.kj getKey() {
        return defpackage.n.hkbnNdmy;
    }

    public o3(android.view.Choreographer choreographer, defpackage.l3 l3Var) {
        this.adDC3e2L = 0;
        this.xiZrDbcSW0 = choreographer;
        this.AARZUJiTa = l3Var;
    }

    public o3(defpackage.bz0 bz0Var) {
        this.adDC3e2L = 1;
        this.xiZrDbcSW0 = bz0Var;
        this.AARZUJiTa = new defpackage.m7();
    }
}
