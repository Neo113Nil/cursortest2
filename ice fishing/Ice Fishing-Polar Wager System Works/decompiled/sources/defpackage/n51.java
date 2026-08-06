package defpackage;

/* loaded from: classes.dex */
public final class n51 implements defpackage.b61 {
    public static final defpackage.F7NU4MC0GW SH1y5HwkJhh = new defpackage.F7NU4MC0GW(24, new defpackage.n41(25), new defpackage.r41(2));
    public final defpackage.yn EXtogiMhuM;
    public final defpackage.nt0 IHQe1A4L2xu;
    public final defpackage.yn riuEU0zW4;
    public float xiZrDbcSW0;
    public final defpackage.nt0 oh6vYeIP = new defpackage.nt0(0);
    public final defpackage.nt0 r1MBDhnF = new defpackage.nt0(0);
    public final defpackage.zk0 F7NU4MC0GW = new defpackage.zk0();
    public final defpackage.nt0 adDC3e2L = new defpackage.nt0(Integer.MAX_VALUE);
    public final defpackage.dn AARZUJiTa = new defpackage.dn(new defpackage.DFo87pBq1E5(24, this));

    public n51(int i) {
        this.IHQe1A4L2xu = new defpackage.nt0(i);
        final int i2 = 0;
        this.EXtogiMhuM = defpackage.c80.QoRHpC4k(new defpackage.vz(this) { // from class: m51
            public final /* synthetic */ defpackage.n51 xiZrDbcSW0;

            {
                this.xiZrDbcSW0 = this;
            }

            @Override // defpackage.vz
            public final java.lang.Object IHQe1A4L2xu() {
                int i3 = i2;
                defpackage.n51 n51Var = this.xiZrDbcSW0;
                switch (i3) {
                    case 0:
                        return java.lang.Boolean.valueOf(n51Var.IHQe1A4L2xu.AARZUJiTa() < n51Var.adDC3e2L.AARZUJiTa());
                    default:
                        return java.lang.Boolean.valueOf(n51Var.IHQe1A4L2xu.AARZUJiTa() > 0);
                }
            }
        });
        final int i3 = 1;
        this.riuEU0zW4 = defpackage.c80.QoRHpC4k(new defpackage.vz(this) { // from class: m51
            public final /* synthetic */ defpackage.n51 xiZrDbcSW0;

            {
                this.xiZrDbcSW0 = this;
            }

            @Override // defpackage.vz
            public final java.lang.Object IHQe1A4L2xu() {
                int i32 = i3;
                defpackage.n51 n51Var = this.xiZrDbcSW0;
                switch (i32) {
                    case 0:
                        return java.lang.Boolean.valueOf(n51Var.IHQe1A4L2xu.AARZUJiTa() < n51Var.adDC3e2L.AARZUJiTa());
                    default:
                        return java.lang.Boolean.valueOf(n51Var.IHQe1A4L2xu.AARZUJiTa() > 0);
                }
            }
        });
    }

    @Override // defpackage.b61
    public final java.lang.Object F7NU4MC0GW(defpackage.am0 am0Var, defpackage.k00 k00Var, defpackage.fj fjVar) {
        java.lang.Object F7NU4MC0GW = this.AARZUJiTa.F7NU4MC0GW(am0Var, k00Var, fjVar);
        return F7NU4MC0GW == defpackage.vj.adDC3e2L ? F7NU4MC0GW : defpackage.ok1.IHQe1A4L2xu;
    }

    @Override // defpackage.b61
    public final boolean IHQe1A4L2xu() {
        return ((java.lang.Boolean) this.riuEU0zW4.getValue()).booleanValue();
    }

    @Override // defpackage.b61
    public final float adDC3e2L(float f) {
        return this.AARZUJiTa.adDC3e2L(f);
    }

    @Override // defpackage.b61
    public final boolean oh6vYeIP() {
        return this.AARZUJiTa.oh6vYeIP();
    }

    @Override // defpackage.b61
    public final boolean r1MBDhnF() {
        return ((java.lang.Boolean) this.EXtogiMhuM.getValue()).booleanValue();
    }
}
