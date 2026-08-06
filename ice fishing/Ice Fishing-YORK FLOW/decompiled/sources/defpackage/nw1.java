package defpackage;

/* compiled from: r8-map-id-5e15bf382d9e1cc682b2b5d208f848646545054061ee84effb1e415a0540fc32 */
/* loaded from: classes.dex */
public class nw1 extends defpackage.v70 {
    public final android.view.Window fWTAfUmVKrZq;

    public nw1(android.view.Window window) {
        this.fWTAfUmVKrZq = window;
    }

    @Override // defpackage.v70
    public final void KrtOTfE6jiS2(boolean z) {
        android.view.Window window = this.fWTAfUmVKrZq;
        if (!z) {
            android.view.View decorView = window.getDecorView();
            decorView.setSystemUiVisibility(decorView.getSystemUiVisibility() & (-8193));
        } else {
            window.clearFlags(67108864);
            window.addFlags(Integer.MIN_VALUE);
            android.view.View decorView2 = window.getDecorView();
            decorView2.setSystemUiVisibility(decorView2.getSystemUiVisibility() | 8192);
        }
    }
}
