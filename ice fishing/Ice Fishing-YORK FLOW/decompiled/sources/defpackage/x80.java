package defpackage;

/* compiled from: r8-map-id-5e15bf382d9e1cc682b2b5d208f848646545054061ee84effb1e415a0540fc32 */
/* loaded from: classes.dex */
public final class x80 extends defpackage.hv1 implements java.lang.Runnable, defpackage.ct0, android.view.View.OnAttachStateChangeListener {
    public defpackage.mw1 GE9mJIPrb8gP;
    public boolean P05cfTpS5W5L;
    public final defpackage.rw1 QiMR8OkAhezm;
    public boolean e6mdH7fiFuta;

    public x80(defpackage.rw1 rw1Var) {
        super(!rw1Var.BHfvd2J71qpO ? 1 : 0);
        this.QiMR8OkAhezm = rw1Var;
    }

    @Override // defpackage.hv1
    public final defpackage.mw1 JhCgjQRTAOCT(defpackage.mw1 mw1Var, java.util.List list) {
        defpackage.rw1 rw1Var = this.QiMR8OkAhezm;
        defpackage.rw1.ZpBGe2uQfcn8(rw1Var, mw1Var);
        return rw1Var.BHfvd2J71qpO ? defpackage.mw1.giKS3J6vZuNy : mw1Var;
    }

    @Override // defpackage.hv1
    public final defpackage.pd1 WDYagTQQm9ns(defpackage.qv1 qv1Var, defpackage.pd1 pd1Var) {
        this.P05cfTpS5W5L = false;
        return pd1Var;
    }

    @Override // defpackage.ct0
    public final defpackage.mw1 ZpBGe2uQfcn8(android.view.View view, defpackage.mw1 mw1Var) {
        this.GE9mJIPrb8gP = mw1Var;
        defpackage.rw1 rw1Var = this.QiMR8OkAhezm;
        defpackage.ws1 ws1Var = rw1Var.WmetiUbpKU9I;
        defpackage.jw1 jw1Var = mw1Var.ZpBGe2uQfcn8;
        ws1Var.JhCgjQRTAOCT(defpackage.b80.hH0RRJrNssvh(jw1Var.P05cfTpS5W5L(8)));
        if (this.P05cfTpS5W5L) {
            if (android.os.Build.VERSION.SDK_INT == 30) {
                view.post(this);
            }
        } else if (!this.e6mdH7fiFuta) {
            rw1Var.s0TASMVLSWD5.JhCgjQRTAOCT(defpackage.b80.hH0RRJrNssvh(jw1Var.P05cfTpS5W5L(8)));
            defpackage.rw1.ZpBGe2uQfcn8(rw1Var, mw1Var);
        }
        return rw1Var.BHfvd2J71qpO ? defpackage.mw1.giKS3J6vZuNy : mw1Var;
    }

    @Override // defpackage.hv1
    public final void fWTAfUmVKrZq(defpackage.qv1 qv1Var) {
        this.P05cfTpS5W5L = true;
        this.e6mdH7fiFuta = true;
    }

    @Override // defpackage.hv1
    public final void giKS3J6vZuNy(defpackage.qv1 qv1Var) {
        this.P05cfTpS5W5L = false;
        this.e6mdH7fiFuta = false;
        defpackage.mw1 mw1Var = this.GE9mJIPrb8gP;
        if (qv1Var.ZpBGe2uQfcn8.giKS3J6vZuNy() > 0 && mw1Var != null) {
            defpackage.jw1 jw1Var = mw1Var.ZpBGe2uQfcn8;
            defpackage.rw1 rw1Var = this.QiMR8OkAhezm;
            rw1Var.s0TASMVLSWD5.JhCgjQRTAOCT(defpackage.b80.hH0RRJrNssvh(jw1Var.P05cfTpS5W5L(8)));
            rw1Var.WmetiUbpKU9I.JhCgjQRTAOCT(defpackage.b80.hH0RRJrNssvh(jw1Var.P05cfTpS5W5L(8)));
            defpackage.rw1.ZpBGe2uQfcn8(rw1Var, mw1Var);
        }
        this.GE9mJIPrb8gP = null;
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewAttachedToWindow(android.view.View view) {
        view.requestApplyInsets();
    }

    @Override // java.lang.Runnable
    public final void run() {
        if (this.P05cfTpS5W5L) {
            this.P05cfTpS5W5L = false;
            this.e6mdH7fiFuta = false;
            defpackage.mw1 mw1Var = this.GE9mJIPrb8gP;
            if (mw1Var != null) {
                defpackage.rw1 rw1Var = this.QiMR8OkAhezm;
                rw1Var.s0TASMVLSWD5.JhCgjQRTAOCT(defpackage.b80.hH0RRJrNssvh(mw1Var.ZpBGe2uQfcn8.P05cfTpS5W5L(8)));
                defpackage.rw1.ZpBGe2uQfcn8(rw1Var, mw1Var);
                this.GE9mJIPrb8gP = null;
            }
        }
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(android.view.View view) {
    }
}
