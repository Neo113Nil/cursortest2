package defpackage;

import android.view.View;
import android.view.Window;
import android.view.WindowInsetsController;

/* compiled from: r8-map-id-3663cbcef52f1a493ceac7deeb6c50e305d4d0c9f83e91180cb6ce540f71d6b5 */
/* loaded from: classes.dex */
public class zi0 extends f50 {
    public final Window P7K7Inc8;
    public final WindowInsetsController VgvYg0wo;

    public zi0(Window window) {
        WindowInsetsController insetsController;
        insetsController = window.getInsetsController();
        this.VgvYg0wo = insetsController;
        this.P7K7Inc8 = window;
    }

    public final void I5GHvsYW(int i, int i2, boolean z) {
        Window window = this.P7K7Inc8;
        if (window == null) {
            WindowInsetsController windowInsetsController = this.VgvYg0wo;
            if (z) {
                windowInsetsController.setSystemBarsAppearance(i2, i2);
                return;
            } else {
                windowInsetsController.setSystemBarsAppearance(0, i2);
                return;
            }
        }
        if (z) {
            View decorView = window.getDecorView();
            decorView.setSystemUiVisibility(i | decorView.getSystemUiVisibility());
        } else {
            View decorView2 = window.getDecorView();
            decorView2.setSystemUiVisibility((~i) & decorView2.getSystemUiVisibility());
        }
    }

    @Override // defpackage.f50
    public void lDXGDhIF(boolean z) {
        I5GHvsYW(8192, 8, z);
    }

    @Override // defpackage.f50
    public void ygLcUYwZ(boolean z) {
        I5GHvsYW(16, 16, z);
    }
}
