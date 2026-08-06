package defpackage;

/* loaded from: classes.dex */
public final class z01 implements defpackage.uj, defpackage.w01 {
    public static final defpackage.gb EXtogiMhuM = new defpackage.gb(0);
    public volatile defpackage.lj AARZUJiTa;
    public final defpackage.lj adDC3e2L;
    public final defpackage.z01 xiZrDbcSW0 = this;

    public z01(defpackage.lj ljVar) {
        this.adDC3e2L = ljVar;
    }

    @Override // defpackage.uj
    public final defpackage.lj AARZUJiTa() {
        defpackage.lj ljVar;
        defpackage.lj ljVar2 = this.AARZUJiTa;
        if (ljVar2 == null || ljVar2 == EXtogiMhuM) {
            defpackage.ih ihVar = (defpackage.ih) this.adDC3e2L.cnag84Bm(defpackage.ih.xiZrDbcSW0);
            defpackage.lj y01Var = ihVar != null ? new defpackage.y01(ihVar, this) : defpackage.lt.adDC3e2L;
            synchronized (this.xiZrDbcSW0) {
                try {
                    defpackage.lj ljVar3 = this.AARZUJiTa;
                    if (ljVar3 == null) {
                        defpackage.lj ljVar4 = this.adDC3e2L;
                        ljVar = ljVar4.JlrlGoKF(new defpackage.w80((defpackage.u80) ljVar4.cnag84Bm(defpackage.n.lpprD5VAS))).JlrlGoKF(defpackage.lt.adDC3e2L).JlrlGoKF(y01Var);
                    } else if (ljVar3 == EXtogiMhuM) {
                        defpackage.lj ljVar5 = this.adDC3e2L;
                        defpackage.w80 w80Var = new defpackage.w80((defpackage.u80) ljVar5.cnag84Bm(defpackage.n.lpprD5VAS));
                        w80Var.nBH8hAHy(new defpackage.kz(0));
                        ljVar = ljVar5.JlrlGoKF(w80Var).JlrlGoKF(defpackage.lt.adDC3e2L).JlrlGoKF(y01Var);
                    } else {
                        ljVar = ljVar3;
                    }
                    this.AARZUJiTa = ljVar;
                } catch (java.lang.Throwable th) {
                    throw th;
                }
            }
            ljVar2 = ljVar;
        }
        ljVar2.getClass();
        return ljVar2;
    }

    @Override // defpackage.w01
    public final void adDC3e2L() {
        oh6vYeIP();
    }

    public final void oh6vYeIP() {
        synchronized (this.xiZrDbcSW0) {
            try {
                defpackage.lj ljVar = this.AARZUJiTa;
                if (ljVar == null) {
                    this.AARZUJiTa = EXtogiMhuM;
                } else {
                    defpackage.x80.riuEU0zW4(ljVar, new defpackage.kz(0));
                }
            } catch (java.lang.Throwable th) {
                throw th;
            }
        }
    }

    @Override // defpackage.w01
    public final void r1MBDhnF() {
        oh6vYeIP();
    }

    @Override // defpackage.w01
    public final void IHQe1A4L2xu() {
    }
}
