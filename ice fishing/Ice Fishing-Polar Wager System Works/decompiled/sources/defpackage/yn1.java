package defpackage;

/* loaded from: classes.dex */
public class yn1 extends defpackage.eo1 {
    public final android.view.WindowInsets.Builder adDC3e2L;

    public yn1(defpackage.ro1 ro1Var) {
        super(ro1Var);
        android.view.WindowInsets oh6vYeIP = ro1Var.oh6vYeIP();
        this.adDC3e2L = oh6vYeIP != null ? defpackage.uj0.EXtogiMhuM(oh6vYeIP) : defpackage.uj0.AARZUJiTa();
    }

    @Override // defpackage.eo1
    public void AARZUJiTa(defpackage.i60 i60Var) {
        this.adDC3e2L.setSystemGestureInsets(i60Var.F7NU4MC0GW());
    }

    @Override // defpackage.eo1
    public void EXtogiMhuM(defpackage.i60 i60Var) {
        this.adDC3e2L.setSystemWindowInsets(i60Var.F7NU4MC0GW());
    }

    @Override // defpackage.eo1
    public void adDC3e2L(defpackage.i60 i60Var) {
        this.adDC3e2L.setMandatorySystemGestureInsets(i60Var.F7NU4MC0GW());
    }

    @Override // defpackage.eo1
    public defpackage.ro1 oh6vYeIP() {
        android.view.WindowInsets build;
        IHQe1A4L2xu();
        build = this.adDC3e2L.build();
        defpackage.ro1 r1MBDhnF = defpackage.ro1.r1MBDhnF(build, null);
        defpackage.i60[] i60VarArr = this.oh6vYeIP;
        defpackage.no1 no1Var = r1MBDhnF.IHQe1A4L2xu;
        no1Var.V7bD7b8KA(i60VarArr);
        no1Var.kNAkVymC(null);
        no1Var.QQUzIjv3iOC5(this.r1MBDhnF);
        no1Var.C0U8sNJm(this.F7NU4MC0GW);
        return r1MBDhnF;
    }

    @Override // defpackage.eo1
    public void riuEU0zW4(defpackage.i60 i60Var) {
        this.adDC3e2L.setTappableElementInsets(i60Var.F7NU4MC0GW());
    }

    @Override // defpackage.eo1
    public void xiZrDbcSW0(defpackage.i60 i60Var) {
        this.adDC3e2L.setStableInsets(i60Var.F7NU4MC0GW());
    }

    public yn1() {
        this.adDC3e2L = defpackage.uj0.AARZUJiTa();
    }
}
