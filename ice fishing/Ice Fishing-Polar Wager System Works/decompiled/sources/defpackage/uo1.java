package defpackage;

/* loaded from: classes.dex */
public class uo1 extends defpackage.l80 {
    public final android.view.Window AARZUJiTa;
    public final android.view.WindowInsetsController xiZrDbcSW0;

    public uo1(android.view.Window window) {
        android.view.WindowInsetsController insetsController;
        insetsController = window.getInsetsController();
        this.xiZrDbcSW0 = insetsController;
        this.AARZUJiTa = window;
    }

    public final void D2vUnMij(int i, int i2, boolean z) {
        android.view.Window window = this.AARZUJiTa;
        if (window == null) {
            android.view.WindowInsetsController windowInsetsController = this.xiZrDbcSW0;
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

    @Override // defpackage.l80
    public void NHJTzaLwkd(boolean z) {
        D2vUnMij(16, 16, z);
    }

    @Override // defpackage.l80
    public void QQUzIjv3iOC5(boolean z) {
        D2vUnMij(8192, 8, z);
    }
}
