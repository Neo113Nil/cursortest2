package defpackage;

/* loaded from: classes.dex */
public final class xg1 extends defpackage.lj0 implements defpackage.da0 {
    public defpackage.zk0 EgCjBq0SZwJ;
    public float NHJTzaLwkd;
    public defpackage.w3 PAEGRtP0bX;
    public float QQUzIjv3iOC5;
    public boolean V7bD7b8KA;
    public defpackage.w3 abhbClRa;
    public boolean fnWB2E7cs;
    public defpackage.ub1 kNAkVymC;

    @Override // defpackage.lj0
    public final void JX5fKip1C6() {
        defpackage.fm.SiPhmbmu(dOmtpLcqqI1y(), null, new defpackage.ExFEDwBK(this, (defpackage.ej) null, 15), 3);
    }

    @Override // defpackage.lj0
    public final boolean ZNF7fheNE() {
        return false;
    }

    @Override // defpackage.da0
    public final defpackage.ji0 nVhUznk1t(defpackage.ki0 ki0Var, defpackage.di0 di0Var, long j) {
        float f = defpackage.fm.hyxIchWRW;
        int i = 0;
        int i2 = 1;
        float EgCjBq0SZwJ = ki0Var.EgCjBq0SZwJ(this.V7bD7b8KA ? defpackage.fm.frpfPPIgqM9O : ((di0Var.AARZUJiTa(defpackage.ki.EXtogiMhuM(j)) != 0 && di0Var.AsxAYCCkb3Hi(defpackage.ki.AARZUJiTa(j)) != 0) || this.fnWB2E7cs) ? defpackage.ke1.IHQe1A4L2xu : defpackage.ke1.oh6vYeIP);
        defpackage.w3 w3Var = this.abhbClRa;
        int floatValue = (int) (w3Var != null ? ((java.lang.Number) w3Var.F7NU4MC0GW()).floatValue() : EgCjBq0SZwJ);
        if (!((floatValue >= 0) & (floatValue >= 0))) {
            defpackage.z50.IHQe1A4L2xu("width and height must be >= 0");
        }
        defpackage.bv0 xiZrDbcSW0 = di0Var.xiZrDbcSW0(defpackage.li.AARZUJiTa(floatValue, floatValue, floatValue, floatValue));
        float EgCjBq0SZwJ2 = ki0Var.EgCjBq0SZwJ((defpackage.ke1.F7NU4MC0GW - ki0Var.qvFH3dnF(EgCjBq0SZwJ)) / 2.0f);
        float EgCjBq0SZwJ3 = ki0Var.EgCjBq0SZwJ((defpackage.ke1.r1MBDhnF - defpackage.ke1.IHQe1A4L2xu) - defpackage.ke1.adDC3e2L);
        boolean z = this.V7bD7b8KA;
        if (z && this.fnWB2E7cs) {
            EgCjBq0SZwJ2 = EgCjBq0SZwJ3 - ki0Var.EgCjBq0SZwJ(f);
        } else if (z && !this.fnWB2E7cs) {
            EgCjBq0SZwJ2 = ki0Var.EgCjBq0SZwJ(f);
        } else if (this.fnWB2E7cs) {
            EgCjBq0SZwJ2 = EgCjBq0SZwJ3;
        }
        defpackage.w3 w3Var2 = this.abhbClRa;
        defpackage.ej ejVar = null;
        java.lang.Float f2 = w3Var2 != null ? (java.lang.Float) w3Var2.adDC3e2L.getValue() : null;
        if (f2 == null || f2.floatValue() != EgCjBq0SZwJ) {
            defpackage.fm.SiPhmbmu(dOmtpLcqqI1y(), null, new defpackage.wg1(this, EgCjBq0SZwJ, ejVar, i), 3);
        }
        defpackage.w3 w3Var3 = this.PAEGRtP0bX;
        java.lang.Float f3 = w3Var3 != null ? (java.lang.Float) w3Var3.adDC3e2L.getValue() : null;
        if (f3 == null || f3.floatValue() != EgCjBq0SZwJ2) {
            defpackage.fm.SiPhmbmu(dOmtpLcqqI1y(), null, new defpackage.wg1(this, EgCjBq0SZwJ2, ejVar, i2), 3);
        }
        if (java.lang.Float.isNaN(this.QQUzIjv3iOC5) && java.lang.Float.isNaN(this.NHJTzaLwkd)) {
            this.QQUzIjv3iOC5 = EgCjBq0SZwJ;
            this.NHJTzaLwkd = EgCjBq0SZwJ2;
        }
        return ki0Var.EoOhNTTfIN7K(floatValue, floatValue, defpackage.ot.adDC3e2L, new defpackage.vg1(xiZrDbcSW0, this, EgCjBq0SZwJ2));
    }
}
