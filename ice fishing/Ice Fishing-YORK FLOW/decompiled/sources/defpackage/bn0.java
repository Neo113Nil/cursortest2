package defpackage;

/* compiled from: r8-map-id-5e15bf382d9e1cc682b2b5d208f848646545054061ee84effb1e415a0540fc32 */
/* loaded from: classes.dex */
public final class bn0 extends defpackage.ti {
    public final defpackage.zn0 JhCgjQRTAOCT;
    public final defpackage.yn0 WDYagTQQm9ns;
    public final java.util.ArrayList fWTAfUmVKrZq;
    public final defpackage.yn0 giKS3J6vZuNy;
    public final defpackage.it0 oh71FJcDz6S2;

    public bn0() {
        super(1);
        this.giKS3J6vZuNy = defpackage.j80.ZVVdXbWmyCSK();
        this.fWTAfUmVKrZq = new java.util.ArrayList();
        defpackage.zn0 zn0Var = defpackage.n81.ZpBGe2uQfcn8;
        this.JhCgjQRTAOCT = new defpackage.zn0();
        this.WDYagTQQm9ns = new defpackage.yn0();
        defpackage.l2 l2Var = new defpackage.l2(12, this);
        defpackage.te1.WDYagTQQm9ns(defpackage.te1.ZpBGe2uQfcn8);
        synchronized (defpackage.te1.fWTAfUmVKrZq) {
            defpackage.te1.P05cfTpS5W5L = defpackage.hf.lXYSMswtzmix(defpackage.te1.P05cfTpS5W5L, l2Var);
        }
        this.oh71FJcDz6S2 = new defpackage.it0(l2Var);
    }

    @Override // defpackage.ti
    public final void GE9mJIPrb8gP(defpackage.pd pdVar) {
        this.WDYagTQQm9ns.Ns0WNyEWdPsk(pdVar);
        fWTAfUmVKrZq(pdVar);
        JhCgjQRTAOCT();
    }

    @Override // defpackage.ti
    public final void JhCgjQRTAOCT() {
        synchronized (this.ZpBGe2uQfcn8) {
            try {
                java.util.ArrayList arrayList = this.fWTAfUmVKrZq;
                int size = arrayList.size();
                for (int i = 0; i < size; i++) {
                    defpackage.an0 an0Var = (defpackage.an0) arrayList.get(i);
                    if (an0Var instanceof defpackage.ym0) {
                        defpackage.j80.oh71FJcDz6S2(this.giKS3J6vZuNy, ((defpackage.ym0) an0Var).ZpBGe2uQfcn8, ((defpackage.ym0) an0Var).giKS3J6vZuNy);
                    } else {
                        if (!(an0Var instanceof defpackage.zm0)) {
                            throw new defpackage.vg();
                        }
                        defpackage.j80.KrtOTfE6jiS2(this.giKS3J6vZuNy, ((defpackage.zm0) an0Var).ZpBGe2uQfcn8);
                    }
                }
            } catch (java.lang.Throwable th) {
                throw th;
            }
        }
        this.fWTAfUmVKrZq.clear();
    }

    @Override // defpackage.ti
    public final void WDYagTQQm9ns() {
        this.oh71FJcDz6S2.ZpBGe2uQfcn8();
        this.fWTAfUmVKrZq.clear();
        this.WDYagTQQm9ns.ZpBGe2uQfcn8();
        synchronized (this.ZpBGe2uQfcn8) {
            this.giKS3J6vZuNy.ZpBGe2uQfcn8();
        }
    }

    @Override // defpackage.ti
    public final defpackage.y10 e6mdH7fiFuta(defpackage.bc1 bc1Var) {
        defpackage.yn0 yn0Var = this.WDYagTQQm9ns;
        defpackage.y10 y10Var = (defpackage.y10) yn0Var.QiMR8OkAhezm(bc1Var);
        if (y10Var == null) {
            y10Var = new defpackage.fWTAfUmVKrZq(21, this, bc1Var);
            int oh71FJcDz6S2 = yn0Var.oh71FJcDz6S2(bc1Var);
            if (oh71FJcDz6S2 < 0) {
                oh71FJcDz6S2 = ~oh71FJcDz6S2;
            }
            java.lang.Object[] objArr = yn0Var.fWTAfUmVKrZq;
            java.lang.Object obj = objArr[oh71FJcDz6S2];
            yn0Var.giKS3J6vZuNy[oh71FJcDz6S2] = bc1Var;
            objArr[oh71FJcDz6S2] = y10Var;
        }
        return y10Var;
    }

    @Override // defpackage.ti
    public final void fWTAfUmVKrZq(defpackage.bc1 bc1Var) {
        this.fWTAfUmVKrZq.add(new defpackage.zm0(bc1Var));
    }
}
