package defpackage;

/* compiled from: r8-map-id-5e15bf382d9e1cc682b2b5d208f848646545054061ee84effb1e415a0540fc32 */
/* loaded from: classes.dex */
public class pw1 extends defpackage.v70 {
    public final android.view.Window JhCgjQRTAOCT;
    public final android.view.WindowInsetsController fWTAfUmVKrZq;

    public pw1(android.view.Window window) {
        android.view.WindowInsetsController insetsController;
        insetsController = window.getInsetsController();
        this.fWTAfUmVKrZq = insetsController;
        this.JhCgjQRTAOCT = window;
    }

    @Override // defpackage.v70
    public void KrtOTfE6jiS2(boolean z) {
        hH0RRJrNssvh(8192, 8, z);
    }

    @Override // defpackage.v70
    public void frSwwKIlbUhK(boolean z) {
        hH0RRJrNssvh(16, 16, z);
    }

    public final void hH0RRJrNssvh(int i, int i2, boolean z) {
        android.view.Window window = this.JhCgjQRTAOCT;
        if (window == null) {
            android.view.WindowInsetsController windowInsetsController = this.fWTAfUmVKrZq;
            if (z) {
                windowInsetsController.setSystemBarsAppearance(i2, i2);
                return;
            } else {
                windowInsetsController.setSystemBarsAppearance(0, i2);
                return;
            }
        }
        if (z) {
            android.view.View decorView = window.getDecorView();
            decorView.setSystemUiVisibility(i | decorView.getSystemUiVisibility());
        } else {
            android.view.View decorView2 = window.getDecorView();
            decorView2.setSystemUiVisibility((~i) & decorView2.getSystemUiVisibility());
        }
    }
}
