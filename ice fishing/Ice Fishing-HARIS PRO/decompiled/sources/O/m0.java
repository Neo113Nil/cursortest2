package O;

import a.AbstractC0078a;
import android.view.View;
import android.view.Window;
import android.view.WindowInsetsController;

/* loaded from: classes.dex */
public class m0 extends AbstractC0078a {
    public final WindowInsetsController e;

    /* renamed from: f, reason: collision with root package name */
    public final Window f824f;

    public m0(Window window, S0.e eVar) {
        WindowInsetsController insetsController;
        insetsController = window.getInsetsController();
        this.e = insetsController;
        this.f824f = window;
    }

    @Override // a.AbstractC0078a
    public boolean K() {
        int systemBarsAppearance;
        this.e.setSystemBarsAppearance(0, 0);
        systemBarsAppearance = this.e.getSystemBarsAppearance();
        return (systemBarsAppearance & 8) != 0;
    }

    @Override // a.AbstractC0078a
    public final void Z(boolean z2) {
        Window window = this.f824f;
        if (z2) {
            if (window != null) {
                View decorView = window.getDecorView();
                decorView.setSystemUiVisibility(decorView.getSystemUiVisibility() | 16);
            }
            this.e.setSystemBarsAppearance(16, 16);
            return;
        }
        if (window != null) {
            View decorView2 = window.getDecorView();
            decorView2.setSystemUiVisibility(decorView2.getSystemUiVisibility() & (-17));
        }
        this.e.setSystemBarsAppearance(0, 16);
    }

    @Override // a.AbstractC0078a
    public final void a0(boolean z2) {
        Window window = this.f824f;
        if (z2) {
            if (window != null) {
                View decorView = window.getDecorView();
                decorView.setSystemUiVisibility(decorView.getSystemUiVisibility() | 8192);
            }
            this.e.setSystemBarsAppearance(8, 8);
            return;
        }
        if (window != null) {
            View decorView2 = window.getDecorView();
            decorView2.setSystemUiVisibility(decorView2.getSystemUiVisibility() & (-8193));
        }
        this.e.setSystemBarsAppearance(0, 8);
    }
}
