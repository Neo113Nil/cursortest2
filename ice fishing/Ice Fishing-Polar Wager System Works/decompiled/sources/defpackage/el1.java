package defpackage;

/* loaded from: classes.dex */
public final class el1 {
    public static final defpackage.e5 xiZrDbcSW0 = new defpackage.e5(0.0f);
    public boolean F7NU4MC0GW;
    public final defpackage.nl1 IHQe1A4L2xu;
    public float adDC3e2L;
    public long oh6vYeIP = Long.MIN_VALUE;
    public defpackage.e5 r1MBDhnF = xiZrDbcSW0;

    public el1(defpackage.c5 c5Var) {
        this.IHQe1A4L2xu = c5Var.IHQe1A4L2xu(defpackage.gq1.QoRHpC4k);
    }

    /* JADX WARN: Code restructure failed: missing block: B:24:0x00ae, code lost:
    
        if (r13 != 0.0f) goto L30;
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x00d3, code lost:
    
        if (defpackage.x80.NHJTzaLwkd(r0).IHQe1A4L2xu(r8, r3) == r12) goto L43;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0054  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x002d  */
    /* JADX WARN: Type inference failed for: r14v7, types: [g00] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:29:0x00a6 -> B:23:0x00a9). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object IHQe1A4L2xu(defpackage.vi viVar, defpackage.k7 k7Var, defpackage.fj fjVar) {
        defpackage.dl1 dl1Var;
        int i;
        defpackage.e5 e5Var;
        float f;
        defpackage.dl1 dl1Var2;
        defpackage.vi viVar2;
        defpackage.vz vzVar;
        try {
            if (fjVar instanceof defpackage.dl1) {
                dl1Var = (defpackage.dl1) fjVar;
                int i2 = dl1Var.DFo87pBq1E5;
                if ((i2 & Integer.MIN_VALUE) != 0) {
                    dl1Var.DFo87pBq1E5 = i2 - Integer.MIN_VALUE;
                    java.lang.Object obj = dl1Var.ez2rX8ReCYw;
                    i = dl1Var.DFo87pBq1E5;
                    e5Var = xiZrDbcSW0;
                    int i3 = 1;
                    defpackage.vj vjVar = defpackage.vj.adDC3e2L;
                    if (i != 0) {
                        defpackage.f70.nBH8hAHy(obj);
                        if (this.F7NU4MC0GW) {
                            defpackage.a60.r1MBDhnF("animateToZero called while previous animation is running");
                        }
                        defpackage.lj ljVar = dl1Var.xiZrDbcSW0;
                        ljVar.getClass();
                        defpackage.sj0 sj0Var = (defpackage.sj0) ljVar.cnag84Bm(defpackage.n.TFRaUu83X3E);
                        float PAEGRtP0bX = sj0Var != null ? sj0Var.PAEGRtP0bX() : 1.0f;
                        this.F7NU4MC0GW = true;
                        f = PAEGRtP0bX;
                        dl1Var2 = dl1Var;
                        viVar2 = viVar;
                        vzVar = k7Var;
                        if (java.lang.Math.abs(this.adDC3e2L) >= 0.01f) {
                            defpackage.vg1 vg1Var = new defpackage.vg1(this, f, viVar2);
                            dl1Var2.EXtogiMhuM = viVar2;
                            dl1Var2.riuEU0zW4 = vzVar;
                            dl1Var2.SH1y5HwkJhh = f;
                            dl1Var2.DFo87pBq1E5 = 1;
                            defpackage.lj ljVar2 = dl1Var2.xiZrDbcSW0;
                            ljVar2.getClass();
                            if (defpackage.x80.NHJTzaLwkd(ljVar2).IHQe1A4L2xu(vg1Var, dl1Var2) == vjVar) {
                                return vjVar;
                            }
                            vzVar.IHQe1A4L2xu();
                        } else {
                            if (java.lang.Math.abs(this.adDC3e2L) == 0.0f) {
                                this.oh6vYeIP = Long.MIN_VALUE;
                                this.r1MBDhnF = e5Var;
                                this.F7NU4MC0GW = false;
                                return defpackage.ok1.IHQe1A4L2xu;
                            }
                            defpackage.oi1 oi1Var = new defpackage.oi1(i3, this, viVar2);
                            dl1Var2.EXtogiMhuM = vzVar;
                            dl1Var2.riuEU0zW4 = null;
                            dl1Var2.DFo87pBq1E5 = 2;
                            defpackage.lj ljVar3 = dl1Var2.xiZrDbcSW0;
                            ljVar3.getClass();
                        }
                    } else {
                        if (i != 1) {
                            if (i != 2) {
                                defpackage.db.AARZUJiTa("call to 'resume' before 'invoke' with coroutine");
                                return null;
                            }
                            vzVar = (defpackage.vz) dl1Var.EXtogiMhuM;
                            defpackage.f70.nBH8hAHy(obj);
                            vzVar.IHQe1A4L2xu();
                            this.oh6vYeIP = Long.MIN_VALUE;
                            this.r1MBDhnF = e5Var;
                            this.F7NU4MC0GW = false;
                            return defpackage.ok1.IHQe1A4L2xu;
                        }
                        float f2 = dl1Var.SH1y5HwkJhh;
                        defpackage.vz vzVar2 = dl1Var.riuEU0zW4;
                        ?? r14 = (defpackage.g00) dl1Var.EXtogiMhuM;
                        defpackage.f70.nBH8hAHy(obj);
                        dl1Var2 = dl1Var;
                        vzVar = vzVar2;
                        f = f2;
                        viVar2 = r14;
                        vzVar.IHQe1A4L2xu();
                    }
                }
            }
            if (i != 0) {
            }
        } catch (java.lang.Throwable th) {
            this.oh6vYeIP = Long.MIN_VALUE;
            this.r1MBDhnF = e5Var;
            this.F7NU4MC0GW = false;
            throw th;
        }
        dl1Var = new defpackage.dl1(this, fjVar);
        java.lang.Object obj2 = dl1Var.ez2rX8ReCYw;
        i = dl1Var.DFo87pBq1E5;
        e5Var = xiZrDbcSW0;
        int i32 = 1;
        defpackage.vj vjVar2 = defpackage.vj.adDC3e2L;
    }
}
