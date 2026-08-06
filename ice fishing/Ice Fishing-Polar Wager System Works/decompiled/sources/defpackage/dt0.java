package defpackage;

/* loaded from: classes.dex */
public final class dt0 extends defpackage.lj0 implements defpackage.da0 {
    public defpackage.at0 EgCjBq0SZwJ;

    @Override // defpackage.da0
    public final defpackage.ji0 nVhUznk1t(defpackage.ki0 ki0Var, defpackage.di0 di0Var, long j) {
        float IHQe1A4L2xu = this.EgCjBq0SZwJ.IHQe1A4L2xu(ki0Var.getLayoutDirection());
        float F7NU4MC0GW = this.EgCjBq0SZwJ.F7NU4MC0GW();
        float oh6vYeIP = this.EgCjBq0SZwJ.oh6vYeIP(ki0Var.getLayoutDirection());
        float r1MBDhnF = this.EgCjBq0SZwJ.r1MBDhnF();
        if (!((defpackage.uq.IHQe1A4L2xu(IHQe1A4L2xu, 0.0f) >= 0) & (defpackage.uq.IHQe1A4L2xu(F7NU4MC0GW, 0.0f) >= 0) & (defpackage.uq.IHQe1A4L2xu(oh6vYeIP, 0.0f) >= 0) & (defpackage.uq.IHQe1A4L2xu(r1MBDhnF, 0.0f) >= 0))) {
            defpackage.v50.IHQe1A4L2xu("Padding must be non-negative");
        }
        int yIx6ChFVk = ki0Var.yIx6ChFVk(IHQe1A4L2xu);
        int yIx6ChFVk2 = ki0Var.yIx6ChFVk(oh6vYeIP) + yIx6ChFVk;
        int yIx6ChFVk3 = ki0Var.yIx6ChFVk(F7NU4MC0GW);
        int yIx6ChFVk4 = ki0Var.yIx6ChFVk(r1MBDhnF) + yIx6ChFVk3;
        defpackage.bv0 xiZrDbcSW0 = di0Var.xiZrDbcSW0(defpackage.li.EXtogiMhuM(-yIx6ChFVk2, -yIx6ChFVk4, j));
        return ki0Var.EoOhNTTfIN7K(defpackage.li.xiZrDbcSW0(xiZrDbcSW0.adDC3e2L + yIx6ChFVk2, j), defpackage.li.adDC3e2L(xiZrDbcSW0.xiZrDbcSW0 + yIx6ChFVk4, j), defpackage.ot.adDC3e2L, new defpackage.o60(xiZrDbcSW0, yIx6ChFVk, yIx6ChFVk3, 2));
    }
}
