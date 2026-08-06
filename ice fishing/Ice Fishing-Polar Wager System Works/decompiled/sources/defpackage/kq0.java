package defpackage;

/* loaded from: classes.dex */
public final class kq0 extends defpackage.jo0 {
    public final int F7NU4MC0GW;
    public final android.window.OnBackInvokedCallback adDC3e2L;
    public final android.window.OnBackInvokedDispatcher r1MBDhnF;
    public boolean xiZrDbcSW0;

    public kq0(android.window.OnBackInvokedDispatcher onBackInvokedDispatcher, int i) {
        this.r1MBDhnF = onBackInvokedDispatcher;
        this.F7NU4MC0GW = i;
        this.adDC3e2L = android.os.Build.VERSION.SDK_INT == 33 ? new android.window.OnBackInvokedCallback() { // from class: lq0
            public final void onBackInvoked() {
                defpackage.kq0.this.IHQe1A4L2xu();
            }
        } : new defpackage.mq0(this);
    }

    @Override // defpackage.jo0
    public final void oh6vYeIP(boolean z) {
        android.window.OnBackInvokedCallback onBackInvokedCallback = this.adDC3e2L;
        if (z && !this.xiZrDbcSW0) {
            this.r1MBDhnF.registerOnBackInvokedCallback(this.F7NU4MC0GW, onBackInvokedCallback);
            this.xiZrDbcSW0 = true;
        } else {
            if (z || !this.xiZrDbcSW0) {
                return;
            }
            this.r1MBDhnF.unregisterOnBackInvokedCallback(onBackInvokedCallback);
            this.xiZrDbcSW0 = false;
        }
    }
}
