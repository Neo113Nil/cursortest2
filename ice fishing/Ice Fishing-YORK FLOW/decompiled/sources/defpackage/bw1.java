package defpackage;

/* compiled from: r8-map-id-5e15bf382d9e1cc682b2b5d208f848646545054061ee84effb1e415a0540fc32 */
/* loaded from: classes.dex */
public class bw1 extends defpackage.aw1 {
    public defpackage.v80 s0TASMVLSWD5;

    public bw1(defpackage.mw1 mw1Var, android.view.WindowInsets windowInsets) {
        super(mw1Var, windowInsets);
        this.s0TASMVLSWD5 = null;
    }

    @Override // defpackage.jw1
    public final defpackage.v80 Ns0WNyEWdPsk() {
        if (this.s0TASMVLSWD5 == null) {
            android.view.WindowInsets windowInsets = this.fWTAfUmVKrZq;
            this.s0TASMVLSWD5 = defpackage.v80.giKS3J6vZuNy(windowInsets.getStableInsetLeft(), windowInsets.getStableInsetTop(), windowInsets.getStableInsetRight(), windowInsets.getStableInsetBottom());
        }
        return this.s0TASMVLSWD5;
    }

    @Override // defpackage.jw1
    public void VFeft99leXEK(defpackage.v80 v80Var) {
        this.s0TASMVLSWD5 = v80Var;
    }

    @Override // defpackage.jw1
    public defpackage.mw1 fWTAfUmVKrZq() {
        return defpackage.mw1.fWTAfUmVKrZq(this.fWTAfUmVKrZq.consumeSystemWindowInsets(), null);
    }

    @Override // defpackage.jw1
    public defpackage.mw1 giKS3J6vZuNy() {
        return defpackage.mw1.fWTAfUmVKrZq(this.fWTAfUmVKrZq.consumeStableInsets(), null);
    }

    @Override // defpackage.jw1
    public boolean s0TASMVLSWD5() {
        return this.fWTAfUmVKrZq.isConsumed();
    }
}
