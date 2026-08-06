package defpackage;

/* compiled from: r8-map-id-5e15bf382d9e1cc682b2b5d208f848646545054061ee84effb1e415a0540fc32 */
/* loaded from: classes.dex */
public final class xi extends defpackage.XntWc4eZSQ8j {
    public boolean T1fB7bDYiVJQ;
    public final defpackage.pw0 gUjdnLbkVAaA;

    public xi(com.ice.fishing.wolberta.MainActivity mainActivity) {
        super(mainActivity);
        this.gUjdnLbkVAaA = defpackage.w60.hH0RRJrNssvh(null);
    }

    @Override // android.view.ViewGroup, android.view.View
    public java.lang.CharSequence getAccessibilityClassName() {
        return defpackage.xi.class.getName();
    }

    @Override // defpackage.XntWc4eZSQ8j
    public boolean getShouldCreateCompositionOnAttachedToWindow() {
        return this.T1fB7bDYiVJQ;
    }

    @Override // defpackage.XntWc4eZSQ8j
    public final void giKS3J6vZuNy(int i, defpackage.e30 e30Var) {
        e30Var.PS16moFv2oLu(420213850);
        int i2 = (e30Var.P05cfTpS5W5L(this) ? 4 : 2) | i;
        if (e30Var.zJPqDeoF0Os1(i2 & 1, (i2 & 3) != 2)) {
            defpackage.c20 c20Var = (defpackage.c20) this.gUjdnLbkVAaA.getValue();
            if (c20Var == null) {
                e30Var.NkfcFfdaVTox(-1238823553);
            } else {
                e30Var.NkfcFfdaVTox(98585282);
                c20Var.QiMR8OkAhezm(e30Var, 0);
            }
            e30Var.XntWc4eZSQ8j(false);
        } else {
            e30Var.Jkfc0NcwyPL8();
        }
        defpackage.f31 s0TASMVLSWD5 = e30Var.s0TASMVLSWD5();
        if (s0TASMVLSWD5 != null) {
            s0TASMVLSWD5.JhCgjQRTAOCT = new defpackage.T1fB7bDYiVJQ(this, i, 3);
        }
    }

    public final void setContent(defpackage.c20 c20Var) {
        this.T1fB7bDYiVJQ = true;
        this.gUjdnLbkVAaA.setValue(c20Var);
        if (isAttachedToWindow() || getComposeViewContext$ui() != null) {
            WDYagTQQm9ns();
        }
    }

    public static /* synthetic */ void getShouldCreateCompositionOnAttachedToWindow$annotations() {
    }
}
