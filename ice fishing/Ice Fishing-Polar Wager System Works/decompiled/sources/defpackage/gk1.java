package defpackage;

/* loaded from: classes.dex */
public final class gk1 implements defpackage.b6 {
    public java.lang.Object AARZUJiTa;
    public final java.lang.Object adDC3e2L;
    public final java.util.ArrayList xiZrDbcSW0 = new java.util.ArrayList();

    public gk1(defpackage.ma0 ma0Var) {
        this.adDC3e2L = ma0Var;
        this.AARZUJiTa = ma0Var;
    }

    @Override // defpackage.b6
    public final void AARZUJiTa() {
        defpackage.ts0 ts0Var = ((defpackage.ma0) this.adDC3e2L).kd6TUFXn;
        if (ts0Var != null) {
            ((defpackage.v0) ts0Var).PAEGRtP0bX();
        }
    }

    @Override // defpackage.b6
    public final void EXtogiMhuM(int i, int i2, int i3) {
        ((defpackage.ma0) this.AARZUJiTa).mAr5m2L7gYDP(i, i2, i3);
    }

    @Override // defpackage.b6
    public final void F7NU4MC0GW(java.lang.Object obj) {
        this.xiZrDbcSW0.add(this.AARZUJiTa);
        this.AARZUJiTa = obj;
    }

    @Override // defpackage.b6
    public final void G3OKOH3wZRC() {
        this.AARZUJiTa = this.xiZrDbcSW0.remove(r0.size() - 1);
    }

    public final void IHQe1A4L2xu() {
        this.xiZrDbcSW0.clear();
        this.AARZUJiTa = this.adDC3e2L;
        ((defpackage.ma0) this.adDC3e2L).hkbnNdmy();
    }

    @Override // defpackage.b6
    public final void SH1y5HwkJhh(int i, int i2) {
        ((defpackage.ma0) this.AARZUJiTa).TFRaUu83X3E(i, i2);
    }

    @Override // defpackage.b6
    public final void adDC3e2L() {
        defpackage.mz0 rectManager;
        defpackage.a0 a0Var;
        defpackage.mz0 rectManager2;
        defpackage.ma0 ma0Var = (defpackage.ma0) this.AARZUJiTa;
        defpackage.ep0 ep0Var = ma0Var.yIx6ChFVk;
        if (!ma0Var.p4kuH6PDtgom()) {
            defpackage.x50.IHQe1A4L2xu("onReuse is only expected on attached node");
        }
        defpackage.ab0 ab0Var = ma0Var.XZx205DYe;
        if (ab0Var != null) {
            ab0Var.riuEU0zW4(false);
        }
        ma0Var.PAEGRtP0bX = false;
        if (ma0Var.WLpAkxCo) {
            ma0Var.WLpAkxCo = false;
        } else {
            defpackage.lj0 lj0Var = ma0Var.yIx6ChFVk.adDC3e2L;
            for (defpackage.lj0 lj0Var2 = lj0Var; lj0Var2 != null; lj0Var2 = lj0Var2.riuEU0zW4) {
                if (lj0Var2.kd6TUFXn) {
                    lj0Var2.boH8X4DXyc4();
                }
            }
            for (defpackage.lj0 lj0Var3 = lj0Var; lj0Var3 != null; lj0Var3 = lj0Var3.riuEU0zW4) {
                if (lj0Var3.kd6TUFXn) {
                    lj0Var3.Ay906ovssqgN();
                }
            }
            while (lj0Var != null) {
                if (lj0Var.kd6TUFXn) {
                    lj0Var.k3hcgHS3MP();
                }
                lj0Var = lj0Var.riuEU0zW4;
            }
        }
        int i = ma0Var.xiZrDbcSW0;
        defpackage.ts0 ts0Var = ma0Var.kd6TUFXn;
        if (ts0Var != null && (rectManager2 = ((defpackage.v0) ts0Var).getRectManager()) != null) {
            rectManager2.AARZUJiTa(ma0Var);
        }
        ma0Var.xiZrDbcSW0 = defpackage.c71.IHQe1A4L2xu.addAndGet(1);
        defpackage.ts0 ts0Var2 = ma0Var.kd6TUFXn;
        if (ts0Var2 != null) {
            defpackage.v0 v0Var = (defpackage.v0) ts0Var2;
            v0Var.getLayoutNodes().AARZUJiTa(i);
            v0Var.getLayoutNodes().EXtogiMhuM(ma0Var.xiZrDbcSW0, ma0Var);
        }
        for (defpackage.lj0 lj0Var4 = ep0Var.xiZrDbcSW0; lj0Var4 != null; lj0Var4 = lj0Var4.SH1y5HwkJhh) {
            lj0Var4.flIYPhR0();
        }
        ep0Var.adDC3e2L();
        if (ep0Var.F7NU4MC0GW(8)) {
            ma0Var.frpfPPIgqM9O();
        }
        defpackage.ma0.AsxAYCCkb3Hi(ma0Var);
        defpackage.ts0 ts0Var3 = ma0Var.kd6TUFXn;
        if (ts0Var3 != null) {
            defpackage.v0 v0Var2 = (defpackage.v0) ts0Var3;
            if (defpackage.v0.xiZrDbcSW0() && (a0Var = v0Var2.TFRaUu83X3E) != null) {
                defpackage.v0 v0Var3 = a0Var.AARZUJiTa;
                defpackage.c1NqjJifC7 c1nqjjifc7 = a0Var.adDC3e2L;
                defpackage.yk0 yk0Var = a0Var.ez2rX8ReCYw;
                if (yk0Var.adDC3e2L(i)) {
                    c1nqjjifc7.AARZUJiTa(v0Var3, i, false);
                }
                defpackage.b71 abhbClRa = ma0Var.abhbClRa();
                if (abhbClRa != null && abhbClRa.adDC3e2L.oh6vYeIP(defpackage.j71.kd6TUFXn)) {
                    yk0Var.IHQe1A4L2xu(ma0Var.xiZrDbcSW0);
                    c1nqjjifc7.AARZUJiTa(v0Var3, ma0Var.xiZrDbcSW0, true);
                }
            }
        }
        defpackage.ts0 ts0Var4 = ma0Var.kd6TUFXn;
        if (ts0Var4 == null || (rectManager = ((defpackage.v0) ts0Var4).getRectManager()) == null) {
            return;
        }
        rectManager.xiZrDbcSW0(ma0Var);
    }

    @Override // defpackage.b6
    public final void r1MBDhnF(int i, java.lang.Object obj) {
        ((defpackage.ma0) this.AARZUJiTa).UsuH8pd5P(i, (defpackage.ma0) obj);
    }

    @Override // defpackage.b6
    public final java.lang.Object riuEU0zW4() {
        return this.AARZUJiTa;
    }

    @Override // defpackage.b6
    public final /* bridge */ /* synthetic */ void xiZrDbcSW0(int i, java.lang.Object obj) {
    }
}
