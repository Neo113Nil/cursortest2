package defpackage;

/* compiled from: r8-map-id-5e15bf382d9e1cc682b2b5d208f848646545054061ee84effb1e415a0540fc32 */
/* loaded from: classes.dex */
public final class dt0 extends defpackage.tq0 {
    public final int JhCgjQRTAOCT;
    public final android.window.OnBackInvokedCallback WDYagTQQm9ns;
    public final android.window.OnBackInvokedDispatcher fWTAfUmVKrZq;
    public boolean oh71FJcDz6S2;

    public dt0(android.window.OnBackInvokedDispatcher onBackInvokedDispatcher, int i) {
        this.fWTAfUmVKrZq = onBackInvokedDispatcher;
        this.JhCgjQRTAOCT = i;
        this.WDYagTQQm9ns = android.os.Build.VERSION.SDK_INT == 33 ? new defpackage.t6(1, this) : new defpackage.et0(this);
    }

    @Override // defpackage.tq0
    public final void giKS3J6vZuNy(boolean z) {
        android.window.OnBackInvokedCallback onBackInvokedCallback = this.WDYagTQQm9ns;
        if (z && !this.oh71FJcDz6S2) {
            this.fWTAfUmVKrZq.registerOnBackInvokedCallback(this.JhCgjQRTAOCT, onBackInvokedCallback);
            this.oh71FJcDz6S2 = true;
        } else {
            if (z || !this.oh71FJcDz6S2) {
                return;
            }
            this.fWTAfUmVKrZq.unregisterOnBackInvokedCallback(onBackInvokedCallback);
            this.oh71FJcDz6S2 = false;
        }
    }
}
