package y;

import android.view.View;
import android.view.Window;
import android.view.WindowInsetsController;

/* loaded from: classes.dex */
public final class V extends R1.l {

    /* renamed from: i, reason: collision with root package name */
    public final WindowInsetsController f8568i;

    /* renamed from: j, reason: collision with root package name */
    public final Window f8569j;

    public V(Window window) {
        WindowInsetsController insetsController;
        insetsController = window.getInsetsController();
        this.f8568i = insetsController;
        this.f8569j = window;
    }

    @Override // R1.l
    public final void A(boolean z2) {
        Window window = this.f8569j;
        if (z2) {
            if (window != null) {
                View decorView = window.getDecorView();
                decorView.setSystemUiVisibility(decorView.getSystemUiVisibility() | 16);
            }
            this.f8568i.setSystemBarsAppearance(16, 16);
            return;
        }
        if (window != null) {
            View decorView2 = window.getDecorView();
            decorView2.setSystemUiVisibility(decorView2.getSystemUiVisibility() & (-17));
        }
        this.f8568i.setSystemBarsAppearance(0, 16);
    }

    @Override // R1.l
    public final void B(boolean z2) {
        Window window = this.f8569j;
        if (z2) {
            if (window != null) {
                View decorView = window.getDecorView();
                decorView.setSystemUiVisibility(decorView.getSystemUiVisibility() | 8192);
            }
            this.f8568i.setSystemBarsAppearance(8, 8);
            return;
        }
        if (window != null) {
            View decorView2 = window.getDecorView();
            decorView2.setSystemUiVisibility(decorView2.getSystemUiVisibility() & (-8193));
        }
        this.f8568i.setSystemBarsAppearance(0, 8);
    }
}
