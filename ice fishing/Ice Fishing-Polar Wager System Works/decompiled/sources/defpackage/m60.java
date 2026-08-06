package defpackage;

/* loaded from: classes.dex */
public final class m60 extends defpackage.od implements java.lang.Runnable, defpackage.jq0, android.view.View.OnAttachStateChangeListener {
    public final defpackage.wo1 AARZUJiTa;
    public boolean EXtogiMhuM;
    public defpackage.ro1 SH1y5HwkJhh;
    public boolean riuEU0zW4;

    public m60(defpackage.wo1 wo1Var) {
        super(!wo1Var.fnWB2E7cs ? 1 : 0);
        this.AARZUJiTa = wo1Var;
    }

    @Override // defpackage.od
    public final defpackage.ro1 AARZUJiTa(defpackage.ro1 ro1Var, java.util.List list) {
        defpackage.wo1 wo1Var = this.AARZUJiTa;
        defpackage.wo1.IHQe1A4L2xu(wo1Var, ro1Var);
        return wo1Var.fnWB2E7cs ? defpackage.ro1.oh6vYeIP : ro1Var;
    }

    @Override // defpackage.od
    public final defpackage.F7NU4MC0GW EXtogiMhuM(defpackage.wn1 wn1Var, defpackage.F7NU4MC0GW f7nu4mc0gw) {
        this.EXtogiMhuM = false;
        return f7nu4mc0gw;
    }

    @Override // defpackage.jq0
    public final defpackage.ro1 IHQe1A4L2xu(android.view.View view, defpackage.ro1 ro1Var) {
        this.SH1y5HwkJhh = ro1Var;
        defpackage.wo1 wo1Var = this.AARZUJiTa;
        defpackage.ll1 ll1Var = wo1Var.kd6TUFXn;
        defpackage.no1 no1Var = ro1Var.IHQe1A4L2xu;
        ll1Var.xiZrDbcSW0(defpackage.x80.WLpAkxCo(no1Var.EXtogiMhuM(8)));
        if (this.EXtogiMhuM) {
            if (android.os.Build.VERSION.SDK_INT == 30) {
                view.post(this);
            }
        } else if (!this.riuEU0zW4) {
            wo1Var.EgCjBq0SZwJ.xiZrDbcSW0(defpackage.x80.WLpAkxCo(no1Var.EXtogiMhuM(8)));
            defpackage.wo1.IHQe1A4L2xu(wo1Var, ro1Var);
        }
        return wo1Var.fnWB2E7cs ? defpackage.ro1.oh6vYeIP : ro1Var;
    }

    @Override // defpackage.od
    public final void adDC3e2L(defpackage.wn1 wn1Var) {
        this.EXtogiMhuM = false;
        this.riuEU0zW4 = false;
        defpackage.ro1 ro1Var = this.SH1y5HwkJhh;
        if (wn1Var.IHQe1A4L2xu.oh6vYeIP() > 0 && ro1Var != null) {
            defpackage.no1 no1Var = ro1Var.IHQe1A4L2xu;
            defpackage.wo1 wo1Var = this.AARZUJiTa;
            wo1Var.EgCjBq0SZwJ.xiZrDbcSW0(defpackage.x80.WLpAkxCo(no1Var.EXtogiMhuM(8)));
            wo1Var.kd6TUFXn.xiZrDbcSW0(defpackage.x80.WLpAkxCo(no1Var.EXtogiMhuM(8)));
            defpackage.wo1.IHQe1A4L2xu(wo1Var, ro1Var);
        }
        this.SH1y5HwkJhh = null;
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewAttachedToWindow(android.view.View view) {
        view.requestApplyInsets();
    }

    @Override // java.lang.Runnable
    public final void run() {
        if (this.EXtogiMhuM) {
            this.EXtogiMhuM = false;
            this.riuEU0zW4 = false;
            defpackage.ro1 ro1Var = this.SH1y5HwkJhh;
            if (ro1Var != null) {
                defpackage.wo1 wo1Var = this.AARZUJiTa;
                wo1Var.EgCjBq0SZwJ.xiZrDbcSW0(defpackage.x80.WLpAkxCo(ro1Var.IHQe1A4L2xu.EXtogiMhuM(8)));
                defpackage.wo1.IHQe1A4L2xu(wo1Var, ro1Var);
                this.SH1y5HwkJhh = null;
            }
        }
    }

    @Override // defpackage.od
    public final void xiZrDbcSW0(defpackage.wn1 wn1Var) {
        this.EXtogiMhuM = true;
        this.riuEU0zW4 = true;
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(android.view.View view) {
    }
}
