package defpackage;

/* loaded from: classes.dex */
public final class gm implements defpackage.y4 {
    public final java.lang.Object AARZUJiTa;
    public final long EXtogiMhuM;
    public final defpackage.i5 F7NU4MC0GW;
    public final defpackage.y IHQe1A4L2xu;
    public final defpackage.i5 adDC3e2L;
    public final defpackage.F7NU4MC0GW oh6vYeIP;
    public final java.lang.Object r1MBDhnF;
    public final defpackage.i5 xiZrDbcSW0;

    public gm(defpackage.hm hmVar, defpackage.F7NU4MC0GW f7nu4mc0gw, java.lang.Object obj, defpackage.i5 i5Var) {
        defpackage.y yVar = new defpackage.y(hmVar.IHQe1A4L2xu);
        this.IHQe1A4L2xu = yVar;
        this.oh6vYeIP = f7nu4mc0gw;
        this.r1MBDhnF = obj;
        defpackage.i5 i5Var2 = (defpackage.i5) ((defpackage.g00) f7nu4mc0gw.xiZrDbcSW0).AARZUJiTa(obj);
        this.F7NU4MC0GW = i5Var2;
        this.adDC3e2L = defpackage.ci0.kd6TUFXn(i5Var);
        defpackage.g00 g00Var = (defpackage.g00) f7nu4mc0gw.AARZUJiTa;
        if (((defpackage.i5) yVar.EXtogiMhuM) == null) {
            yVar.EXtogiMhuM = i5Var2.r1MBDhnF();
        }
        defpackage.i5 i5Var3 = (defpackage.i5) yVar.EXtogiMhuM;
        if (i5Var3 == null) {
            defpackage.x70.Ye0N2xE9Hc("targetVector");
            throw null;
        }
        int oh6vYeIP = i5Var3.oh6vYeIP();
        int i = 0;
        while (true) {
            defpackage.i5 i5Var4 = (defpackage.i5) yVar.EXtogiMhuM;
            if (i >= oh6vYeIP) {
                if (i5Var4 == null) {
                    defpackage.x70.Ye0N2xE9Hc("targetVector");
                    throw null;
                }
                this.AARZUJiTa = g00Var.AARZUJiTa(i5Var4);
                defpackage.y yVar2 = this.IHQe1A4L2xu;
                defpackage.i5 i5Var5 = this.F7NU4MC0GW;
                if (((defpackage.i5) yVar2.AARZUJiTa) == null) {
                    yVar2.AARZUJiTa = i5Var5.r1MBDhnF();
                }
                defpackage.i5 i5Var6 = (defpackage.i5) yVar2.AARZUJiTa;
                if (i5Var6 == null) {
                    defpackage.x70.Ye0N2xE9Hc("velocityVector");
                    throw null;
                }
                int oh6vYeIP2 = i5Var6.oh6vYeIP();
                long j = 0;
                for (int i2 = 0; i2 < oh6vYeIP2; i2++) {
                    defpackage.sa1 sa1Var = (defpackage.sa1) yVar2.adDC3e2L;
                    i5Var5.getClass();
                    j = java.lang.Math.max(j, ((long) (java.lang.Math.exp(((defpackage.yv) sa1Var.xiZrDbcSW0).oh6vYeIP(i5Var.IHQe1A4L2xu(i2)) / (defpackage.zv.IHQe1A4L2xu - 1.0d)) * 1000.0d)) * 1000000);
                }
                this.EXtogiMhuM = j;
                defpackage.i5 kd6TUFXn = defpackage.ci0.kd6TUFXn(this.IHQe1A4L2xu.SH1y5HwkJhh(j, this.F7NU4MC0GW, i5Var));
                this.xiZrDbcSW0 = kd6TUFXn;
                int oh6vYeIP3 = kd6TUFXn.oh6vYeIP();
                for (int i3 = 0; i3 < oh6vYeIP3; i3++) {
                    defpackage.i5 i5Var7 = this.xiZrDbcSW0;
                    float IHQe1A4L2xu = i5Var7.IHQe1A4L2xu(i3);
                    this.IHQe1A4L2xu.getClass();
                    this.IHQe1A4L2xu.getClass();
                    i5Var7.adDC3e2L(defpackage.x80.ez2rX8ReCYw(IHQe1A4L2xu, -0.0f, 0.0f), i3);
                }
                return;
            }
            if (i5Var4 == null) {
                defpackage.x70.Ye0N2xE9Hc("targetVector");
                throw null;
            }
            defpackage.sa1 sa1Var2 = (defpackage.sa1) yVar.adDC3e2L;
            float IHQe1A4L2xu2 = i5Var2.IHQe1A4L2xu(i);
            float IHQe1A4L2xu3 = i5Var.IHQe1A4L2xu(i);
            double oh6vYeIP4 = ((defpackage.yv) sa1Var2.xiZrDbcSW0).oh6vYeIP(IHQe1A4L2xu3);
            double d = defpackage.zv.IHQe1A4L2xu;
            int i4 = i;
            i5Var4.adDC3e2L((java.lang.Math.signum(IHQe1A4L2xu3) * ((float) (java.lang.Math.exp((d / (d - 1.0d)) * oh6vYeIP4) * r13.IHQe1A4L2xu * r13.oh6vYeIP))) + IHQe1A4L2xu2, i4);
            i = i4 + 1;
        }
    }

    @Override // defpackage.y4
    public final defpackage.F7NU4MC0GW F7NU4MC0GW() {
        return this.oh6vYeIP;
    }

    @Override // defpackage.y4
    public final boolean IHQe1A4L2xu() {
        return false;
    }

    @Override // defpackage.y4
    public final java.lang.Object adDC3e2L() {
        return this.AARZUJiTa;
    }

    @Override // defpackage.y4
    public final java.lang.Object oh6vYeIP(long j) {
        if (AARZUJiTa(j)) {
            return this.AARZUJiTa;
        }
        defpackage.g00 g00Var = (defpackage.g00) this.oh6vYeIP.AARZUJiTa;
        defpackage.y yVar = this.IHQe1A4L2xu;
        defpackage.i5 i5Var = (defpackage.i5) yVar.xiZrDbcSW0;
        defpackage.i5 i5Var2 = this.F7NU4MC0GW;
        if (i5Var == null) {
            yVar.xiZrDbcSW0 = i5Var2.r1MBDhnF();
        }
        defpackage.i5 i5Var3 = (defpackage.i5) yVar.xiZrDbcSW0;
        if (i5Var3 == null) {
            defpackage.x70.Ye0N2xE9Hc("valueVector");
            throw null;
        }
        int oh6vYeIP = i5Var3.oh6vYeIP();
        int i = 0;
        while (true) {
            defpackage.i5 i5Var4 = (defpackage.i5) yVar.xiZrDbcSW0;
            if (i >= oh6vYeIP) {
                if (i5Var4 != null) {
                    return g00Var.AARZUJiTa(i5Var4);
                }
                defpackage.x70.Ye0N2xE9Hc("valueVector");
                throw null;
            }
            if (i5Var4 == null) {
                defpackage.x70.Ye0N2xE9Hc("valueVector");
                throw null;
            }
            defpackage.sa1 sa1Var = (defpackage.sa1) yVar.adDC3e2L;
            float IHQe1A4L2xu = i5Var2.IHQe1A4L2xu(i);
            long j2 = j / 1000000;
            defpackage.xv IHQe1A4L2xu2 = ((defpackage.yv) sa1Var.xiZrDbcSW0).IHQe1A4L2xu(this.adDC3e2L.IHQe1A4L2xu(i));
            long j3 = IHQe1A4L2xu2.r1MBDhnF;
            i5Var4.adDC3e2L((java.lang.Math.signum(IHQe1A4L2xu2.IHQe1A4L2xu) * IHQe1A4L2xu2.oh6vYeIP * defpackage.j2.IHQe1A4L2xu(j3 > 0 ? j2 / j3 : 1.0f).IHQe1A4L2xu) + IHQe1A4L2xu, i);
            i++;
        }
    }

    @Override // defpackage.y4
    public final long r1MBDhnF() {
        return this.EXtogiMhuM;
    }

    @Override // defpackage.y4
    public final defpackage.i5 xiZrDbcSW0(long j) {
        if (AARZUJiTa(j)) {
            return this.xiZrDbcSW0;
        }
        return this.IHQe1A4L2xu.SH1y5HwkJhh(j, this.F7NU4MC0GW, this.adDC3e2L);
    }
}
