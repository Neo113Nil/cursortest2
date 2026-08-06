package defpackage;

/* loaded from: classes.dex */
public final class yq extends defpackage.lj0 implements defpackage.ui1, defpackage.t90 {
    public defpackage.yq EgCjBq0SZwJ;
    public defpackage.yq fnWB2E7cs;
    public long kNAkVymC;

    @Override // defpackage.t90
    public final void DFo87pBq1E5(long j) {
        this.kNAkVymC = j;
    }

    public final void H6IrRhrpWoH() {
        defpackage.yq yqVar = this.fnWB2E7cs;
        if (yqVar != null) {
            yqVar.H6IrRhrpWoH();
            return;
        }
        defpackage.yq yqVar2 = this.EgCjBq0SZwJ;
        if (yqVar2 != null) {
            yqVar2.H6IrRhrpWoH();
        }
    }

    @Override // defpackage.ui1
    public final java.lang.Object JlrlGoKF() {
        return defpackage.n.nBH8hAHy;
    }

    public final boolean UVjEelCZ() {
        defpackage.yq yqVar = this.EgCjBq0SZwJ;
        if (yqVar != null) {
            return yqVar.UVjEelCZ();
        }
        defpackage.yq yqVar2 = this.fnWB2E7cs;
        if (yqVar2 != null) {
            return yqVar2.UVjEelCZ();
        }
        return false;
    }

    public final void WnQbjbWuMR(defpackage.c1NqjJifC7 c1nqjjifc7) {
        defpackage.ui1 ui1Var;
        defpackage.yq yqVar;
        defpackage.yq yqVar2 = this.EgCjBq0SZwJ;
        int i = 1;
        if (yqVar2 == null || !defpackage.s21.cnag84Bm(yqVar2, defpackage.mj1.p4kuH6PDtgom(c1nqjjifc7))) {
            if (this.adDC3e2L.kd6TUFXn) {
                defpackage.rz0 rz0Var = new defpackage.rz0();
                defpackage.f70.SiPhmbmu(this, new defpackage.c4(rz0Var, this, c1nqjjifc7, i));
                ui1Var = (defpackage.ui1) rz0Var.adDC3e2L;
            } else {
                ui1Var = null;
            }
            yqVar = (defpackage.yq) ui1Var;
        } else {
            yqVar = yqVar2;
        }
        if (yqVar != null && yqVar2 == null) {
            yqVar.H6IrRhrpWoH();
            yqVar.WnQbjbWuMR(c1nqjjifc7);
            defpackage.yq yqVar3 = this.fnWB2E7cs;
            if (yqVar3 != null) {
                yqVar3.pm90rNzI5F();
            }
        } else if (yqVar == null && yqVar2 != null) {
            defpackage.yq yqVar4 = this.fnWB2E7cs;
            if (yqVar4 != null) {
                yqVar4.H6IrRhrpWoH();
                yqVar4.WnQbjbWuMR(c1nqjjifc7);
            }
            yqVar2.pm90rNzI5F();
        } else if (!defpackage.x70.QoRHpC4k(yqVar, yqVar2)) {
            if (yqVar != null) {
                yqVar.H6IrRhrpWoH();
                yqVar.WnQbjbWuMR(c1nqjjifc7);
            }
            if (yqVar2 != null) {
                yqVar2.pm90rNzI5F();
            }
        } else if (yqVar != null) {
            yqVar.WnQbjbWuMR(c1nqjjifc7);
        } else {
            defpackage.yq yqVar5 = this.fnWB2E7cs;
            if (yqVar5 != null) {
                yqVar5.WnQbjbWuMR(c1nqjjifc7);
            }
        }
        this.EgCjBq0SZwJ = yqVar;
    }

    public final void pm90rNzI5F() {
        defpackage.yq yqVar = this.fnWB2E7cs;
        if (yqVar != null) {
            yqVar.pm90rNzI5F();
        }
        defpackage.yq yqVar2 = this.EgCjBq0SZwJ;
        if (yqVar2 != null) {
            yqVar2.pm90rNzI5F();
        }
        this.EgCjBq0SZwJ = null;
    }

    public final void uLnPvzwk() {
        defpackage.yq yqVar = this.fnWB2E7cs;
        if (yqVar != null) {
            yqVar.uLnPvzwk();
            return;
        }
        defpackage.yq yqVar2 = this.EgCjBq0SZwJ;
        if (yqVar2 != null) {
            yqVar2.uLnPvzwk();
        }
    }

    @Override // defpackage.lj0
    public final void yUiIS9dG7NYk() {
        this.fnWB2E7cs = null;
        this.EgCjBq0SZwJ = null;
    }
}
