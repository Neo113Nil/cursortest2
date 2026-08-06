package defpackage;

import android.view.View;
import android.view.Window;
import android.view.WindowInsetsController;

/* compiled from: r8-map-id-f07502904ffb6c7cfc104556b013e0e48cd078697d1e7ebb5294e50317be4258 */
/* loaded from: classes.dex */
public class zg1 extends b70 {
    public final Window X1lG3V04pd;
    public final WindowInsetsController Yi7zF1RB1;

    public zg1(Window window) {
        WindowInsetsController insetsController;
        insetsController = window.getInsetsController();
        this.Yi7zF1RB1 = insetsController;
        this.X1lG3V04pd = window;
    }

    @Override // defpackage.b70
    public void DmJncFq5(boolean z) {
        dqB83aoLBB(8192, 8, z);
    }

    @Override // defpackage.b70
    public void MZhzXH72(boolean z) {
        dqB83aoLBB(16, 16, z);
    }

    public final void dqB83aoLBB(int i, int i2, boolean z) {
        Window window = this.X1lG3V04pd;
        if (window == null) {
            WindowInsetsController windowInsetsController = this.Yi7zF1RB1;
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
}
