package defpackage;

/* loaded from: classes.dex */
public final class ua0 implements defpackage.gd1 {
    public float AARZUJiTa;
    public final /* synthetic */ defpackage.ab0 EXtogiMhuM;
    public defpackage.w90 adDC3e2L = defpackage.w90.xiZrDbcSW0;
    public float xiZrDbcSW0;

    public ua0(defpackage.ab0 ab0Var) {
        this.EXtogiMhuM = ab0Var;
    }

    @Override // defpackage.qn
    public final float EXtogiMhuM() {
        return this.AARZUJiTa;
    }

    @Override // defpackage.gd1
    public final java.util.List NHJTzaLwkd(defpackage.k00 k00Var, java.lang.Object obj) {
        defpackage.ab0 ab0Var = this.EXtogiMhuM;
        ab0Var.EXtogiMhuM();
        defpackage.ma0 ma0Var = ab0Var.adDC3e2L;
        defpackage.ia0 ia0Var = ma0Var.wll2JLbTBC2.F7NU4MC0GW;
        defpackage.ia0 ia0Var2 = defpackage.ia0.AARZUJiTa;
        defpackage.ia0 ia0Var3 = defpackage.ia0.adDC3e2L;
        if (ia0Var != ia0Var3 && ia0Var != ia0Var2 && ia0Var != defpackage.ia0.xiZrDbcSW0 && ia0Var != defpackage.ia0.EXtogiMhuM) {
            defpackage.x50.oh6vYeIP("subcompose can only be used inside the measure or layout blocks");
        }
        defpackage.nl0 nl0Var = ab0Var.ez2rX8ReCYw;
        java.lang.Object AARZUJiTa = nl0Var.AARZUJiTa(obj);
        if (AARZUJiTa == null) {
            AARZUJiTa = (defpackage.ma0) ab0Var.SyNS6RMn.ez2rX8ReCYw(obj);
            if (AARZUJiTa != null) {
                if (ab0Var.EgCjBq0SZwJ <= 0) {
                    defpackage.x50.oh6vYeIP("Check failed.");
                }
                ab0Var.EgCjBq0SZwJ--;
            } else {
                AARZUJiTa = ab0Var.SyNS6RMn(obj);
                if (AARZUJiTa == null) {
                    int i = ab0Var.EXtogiMhuM;
                    defpackage.ma0 ma0Var2 = new defpackage.ma0(2);
                    ma0Var.fnWB2E7cs = true;
                    ma0Var.UsuH8pd5P(i, ma0Var2);
                    ma0Var.fnWB2E7cs = false;
                    AARZUJiTa = ma0Var2;
                }
            }
            nl0Var.DFo87pBq1E5(obj, AARZUJiTa);
        }
        defpackage.ma0 ma0Var3 = (defpackage.ma0) AARZUJiTa;
        if (defpackage.td.sJNB7mCer5(ab0Var.EXtogiMhuM, ma0Var.cnag84Bm()) != ma0Var3) {
            int riuEU0zW4 = ((defpackage.ul0) ma0Var.cnag84Bm()).adDC3e2L.riuEU0zW4(ma0Var3);
            if (riuEU0zW4 < ab0Var.EXtogiMhuM) {
                defpackage.x50.IHQe1A4L2xu("Key \"" + obj + "\" was already used. If you are using LazyColumn/Row please make sure you provide a unique key for each item.");
            }
            int i2 = ab0Var.EXtogiMhuM;
            if (i2 != riuEU0zW4) {
                ab0Var.SH1y5HwkJhh(riuEU0zW4, i2);
            }
        }
        ab0Var.EXtogiMhuM++;
        ab0Var.DFo87pBq1E5(ma0Var3, obj, false, k00Var);
        return (ia0Var == ia0Var3 || ia0Var == ia0Var2) ? ma0Var3.DFo87pBq1E5() : ma0Var3.JlrlGoKF();
    }

    @Override // defpackage.t70
    public final boolean cnag84Bm() {
        defpackage.ia0 ia0Var = this.EXtogiMhuM.adDC3e2L.wll2JLbTBC2.F7NU4MC0GW;
        return ia0Var == defpackage.ia0.EXtogiMhuM || ia0Var == defpackage.ia0.xiZrDbcSW0;
    }

    @Override // defpackage.t70
    public final defpackage.w90 getLayoutDirection() {
        return this.adDC3e2L;
    }

    @Override // defpackage.qn
    public final float oh6vYeIP() {
        return this.xiZrDbcSW0;
    }

    @Override // defpackage.ki0
    public final defpackage.ji0 p4kuH6PDtgom(int i, int i2, java.util.Map map, defpackage.g00 g00Var, defpackage.g00 g00Var2) {
        if ((i & (-16777216)) != 0 || ((-16777216) & i2) != 0) {
            defpackage.x50.oh6vYeIP("Size(" + i + " x " + i2 + ") is out of range. Each dimension must be between 0 and 16777215.");
        }
        return new defpackage.ta0(i, i2, map, g00Var, this, this.EXtogiMhuM, g00Var2);
    }
}
