package defpackage;

/* loaded from: classes.dex */
public final class wg extends defpackage.G3OKOH3wZRC {
    public final defpackage.qt0 SyNS6RMn;
    public boolean cnag84Bm;

    public wg(com.corsair.ledger.MainActivity mainActivity) {
        super(mainActivity);
        this.SyNS6RMn = defpackage.c80.nBH8hAHy(null);
    }

    @Override // android.view.ViewGroup, android.view.View
    public java.lang.CharSequence getAccessibilityClassName() {
        return defpackage.wg.class.getName();
    }

    @Override // defpackage.G3OKOH3wZRC
    public boolean getShouldCreateCompositionOnAttachedToWindow() {
        return this.cnag84Bm;
    }

    @Override // defpackage.G3OKOH3wZRC
    public final void oh6vYeIP(defpackage.t10 t10Var, int i) {
        t10Var.QUKZkWRtw6(420213850);
        int i2 = (t10Var.EXtogiMhuM(this) ? 4 : 2) | i;
        if (t10Var.lpprD5VAS(i2 & 1, (i2 & 3) != 2)) {
            defpackage.k00 k00Var = (defpackage.k00) this.SyNS6RMn.getValue();
            if (k00Var == null) {
                t10Var.AsxAYCCkb3Hi(-1238823553);
            } else {
                t10Var.AsxAYCCkb3Hi(98585282);
                k00Var.adDC3e2L(t10Var, 0);
            }
            t10Var.QoRHpC4k(false);
        } else {
            t10Var.WLpAkxCo();
        }
        defpackage.az0 kd6TUFXn = t10Var.kd6TUFXn();
        if (kd6TUFXn != null) {
            kd6TUFXn.F7NU4MC0GW = new defpackage.QoRHpC4k(this, i, 3);
        }
    }

    public final void setContent(defpackage.k00 k00Var) {
        this.cnag84Bm = true;
        this.SyNS6RMn.setValue(k00Var);
        if (isAttachedToWindow() || getComposeViewContext$ui() != null) {
            adDC3e2L();
        }
    }

    public static /* synthetic */ void getShouldCreateCompositionOnAttachedToWindow$annotations() {
    }
}
