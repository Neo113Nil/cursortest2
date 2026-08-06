package defpackage;

/* compiled from: r8-map-id-5e15bf382d9e1cc682b2b5d208f848646545054061ee84effb1e415a0540fc32 */
/* loaded from: classes.dex */
public final class f21 implements defpackage.wg0 {
    public static final defpackage.f21 h3m55N1URyyK = new defpackage.f21();
    public int WDYagTQQm9ns;
    public android.os.Handler e6mdH7fiFuta;
    public int oh71FJcDz6S2;
    public boolean QiMR8OkAhezm = true;
    public boolean P05cfTpS5W5L = true;
    public final defpackage.zg0 GE9mJIPrb8gP = new defpackage.zg0(this, true);
    public final defpackage.gUjdnLbkVAaA Ns0WNyEWdPsk = new defpackage.gUjdnLbkVAaA(8, this);
    public final defpackage.k0 fNwYGHIYeJcR = new defpackage.k0(20, this);

    @Override // defpackage.wg0
    public final defpackage.zg0 QiMR8OkAhezm() {
        return this.GE9mJIPrb8gP;
    }

    public final void ZpBGe2uQfcn8() {
        int i = this.oh71FJcDz6S2 + 1;
        this.oh71FJcDz6S2 = i;
        if (i == 1) {
            if (this.QiMR8OkAhezm) {
                this.GE9mJIPrb8gP.JhCgjQRTAOCT(defpackage.og0.ON_RESUME);
                this.QiMR8OkAhezm = false;
            } else {
                android.os.Handler handler = this.e6mdH7fiFuta;
                handler.getClass();
                handler.removeCallbacks(this.Ns0WNyEWdPsk);
            }
        }
    }
}
