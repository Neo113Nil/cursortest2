package defpackage;

/* compiled from: r8-map-id-5e15bf382d9e1cc682b2b5d208f848646545054061ee84effb1e415a0540fc32 */
/* loaded from: classes.dex */
public final class zd1 extends defpackage.ti {
    public defpackage.zn0 JhCgjQRTAOCT;
    public final defpackage.it0 P05cfTpS5W5L;
    public final defpackage.wd1 QiMR8OkAhezm;
    public defpackage.zn0 WDYagTQQm9ns;
    public java.lang.Object fWTAfUmVKrZq;
    public java.lang.Object giKS3J6vZuNy;
    public defpackage.bc1 oh71FJcDz6S2;

    public zd1() {
        super(1);
        this.QiMR8OkAhezm = new defpackage.wd1(1, this);
        defpackage.l2 l2Var = new defpackage.l2(18, this);
        defpackage.te1.WDYagTQQm9ns(defpackage.te1.ZpBGe2uQfcn8);
        synchronized (defpackage.te1.fWTAfUmVKrZq) {
            defpackage.te1.P05cfTpS5W5L = defpackage.hf.lXYSMswtzmix(defpackage.te1.P05cfTpS5W5L, l2Var);
        }
        this.P05cfTpS5W5L = new defpackage.it0(l2Var);
    }

    @Override // defpackage.ti
    public final void GE9mJIPrb8gP(defpackage.pd pdVar) {
        this.oh71FJcDz6S2 = null;
        this.fWTAfUmVKrZq = null;
        this.WDYagTQQm9ns = null;
        JhCgjQRTAOCT();
    }

    @Override // defpackage.ti
    public final void JhCgjQRTAOCT() {
        synchronized (this.ZpBGe2uQfcn8) {
            try {
                this.giKS3J6vZuNy = this.fWTAfUmVKrZq;
                if (this.WDYagTQQm9ns == null) {
                    this.JhCgjQRTAOCT = null;
                } else {
                    if (this.JhCgjQRTAOCT == null) {
                        defpackage.zn0 zn0Var = defpackage.n81.ZpBGe2uQfcn8;
                        this.JhCgjQRTAOCT = new defpackage.zn0();
                    }
                    defpackage.zn0 zn0Var2 = this.JhCgjQRTAOCT;
                    this.JhCgjQRTAOCT = this.WDYagTQQm9ns;
                    this.WDYagTQQm9ns = zn0Var2;
                }
            } catch (java.lang.Throwable th) {
                throw th;
            }
        }
    }

    @Override // defpackage.ti
    public final void WDYagTQQm9ns() {
        this.P05cfTpS5W5L.ZpBGe2uQfcn8();
        this.fWTAfUmVKrZq = null;
        this.WDYagTQQm9ns = null;
        synchronized (this.ZpBGe2uQfcn8) {
            this.oh71FJcDz6S2 = null;
            this.giKS3J6vZuNy = null;
            this.JhCgjQRTAOCT = null;
        }
    }

    @Override // defpackage.ti
    public final defpackage.y10 e6mdH7fiFuta(defpackage.bc1 bc1Var) {
        defpackage.bc1 bc1Var2 = this.oh71FJcDz6S2;
        if (bc1Var2 != null && !bc1Var2.equals(bc1Var)) {
            defpackage.g11.giKS3J6vZuNy("Requested a SingleSubscriptionSnapshotFlowManager to manage multiple subscriptions");
        }
        this.oh71FJcDz6S2 = bc1Var;
        return this.QiMR8OkAhezm;
    }

    @Override // defpackage.ti
    public final void fWTAfUmVKrZq(defpackage.bc1 bc1Var) {
        this.fWTAfUmVKrZq = null;
        this.WDYagTQQm9ns = null;
    }
}
