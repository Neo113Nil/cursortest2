package defpackage;

/* compiled from: r8-map-id-5e15bf382d9e1cc682b2b5d208f848646545054061ee84effb1e415a0540fc32 */
/* loaded from: classes.dex */
public abstract class s50 extends defpackage.ul0 implements defpackage.rp1, defpackage.f01, defpackage.mj {
    public defpackage.sr BHfvd2J71qpO;
    public defpackage.z2 ZVVdXbWmyCSK;
    public boolean w7APNrr0aGRc;

    public s50(defpackage.z2 z2Var, defpackage.sr srVar) {
        this.BHfvd2J71qpO = srVar;
        this.ZVVdXbWmyCSK = z2Var;
    }

    @Override // defpackage.f01
    public final long BHfvd2J71qpO() {
        if (this.BHfvd2J71qpO == null) {
            return defpackage.mo1.ZpBGe2uQfcn8;
        }
        defpackage.hp hpVar = defpackage.la0.UmgHb6n58gfG(this).blKFvluuDQOf;
        int i = defpackage.mo1.giKS3J6vZuNy;
        return defpackage.l21.s0TASMVLSWD5(hpVar.OVwOqzUGHcCU(10.0f), hpVar.OVwOqzUGHcCU(40.0f), hpVar.OVwOqzUGHcCU(10.0f), hpVar.OVwOqzUGHcCU(40.0f));
    }

    public final void I9id0xDxCgYV() {
        defpackage.v31 v31Var = new defpackage.v31();
        v31Var.WDYagTQQm9ns = true;
        defpackage.t80.CZa7MwI9IzLd(this, new defpackage.ur(v31Var));
        if (v31Var.WDYagTQQm9ns) {
            YZh1E3mnTFwf();
        }
    }

    @Override // defpackage.f01
    public final void IBvW5fLsPuHy(defpackage.vz0 vz0Var, defpackage.wz0 wz0Var, long j) {
        if (wz0Var == defpackage.wz0.oh71FJcDz6S2) {
            java.util.List list = vz0Var.ZpBGe2uQfcn8;
            int size = list.size();
            for (int i = 0; i < size; i++) {
                if (jVUAPb5NnIYW(((defpackage.c01) list.get(i)).e6mdH7fiFuta)) {
                    int i2 = vz0Var.oh71FJcDz6S2;
                    if (i2 == 4) {
                        this.w7APNrr0aGRc = true;
                        I9id0xDxCgYV();
                        return;
                    } else {
                        if (i2 == 5) {
                            KN4muQto0Nd5();
                            return;
                        }
                        return;
                    }
                }
            }
        }
    }

    public final void KN4muQto0Nd5() {
        if (this.w7APNrr0aGRc) {
            this.w7APNrr0aGRc = false;
            if (this.s0TASMVLSWD5) {
                defpackage.z31 z31Var = new defpackage.z31();
                defpackage.t80.Fu5WBEia9jBo(this, new defpackage.m(1, z31Var));
                defpackage.s50 s50Var = (defpackage.s50) z31Var.WDYagTQQm9ns;
                if (s50Var != null) {
                    s50Var.YZh1E3mnTFwf();
                } else {
                    xbkEJUK1coRZ(null);
                }
            }
        }
    }

    @Override // defpackage.f01
    public final void LCK4GGEwbWAr() {
        KN4muQto0Nd5();
    }

    public final void YZh1E3mnTFwf() {
        defpackage.z2 z2Var;
        defpackage.z31 z31Var = new defpackage.z31();
        defpackage.t80.Fu5WBEia9jBo(this, new defpackage.qv0(z31Var));
        defpackage.s50 s50Var = (defpackage.s50) z31Var.WDYagTQQm9ns;
        if (s50Var == null || (z2Var = s50Var.ZVVdXbWmyCSK) == null) {
            z2Var = this.ZVVdXbWmyCSK;
        }
        xbkEJUK1coRZ(z2Var);
    }

    @Override // defpackage.ul0
    public final void awuGf4qH8HFd() {
        KN4muQto0Nd5();
    }

    public abstract boolean jVUAPb5NnIYW(int i);

    public abstract void xbkEJUK1coRZ(defpackage.a01 a01Var);
}
