package h3;

import android.view.View;
import android.view.Window;
import android.view.WindowInsetsController;

/* compiled from: r8-map-id-9ca073bbfde00f50be8682633edd5c48170ffeeeebc591f4c22ad3deaafa0d20 */
/* loaded from: classes.dex */
public class c1 extends v6.a {

    /* renamed from: d, reason: collision with root package name */
    public final WindowInsetsController f2765d;

    /* renamed from: e, reason: collision with root package name */
    public final Window f2766e;

    public c1(Window window) {
        WindowInsetsController insetsController;
        insetsController = window.getInsetsController();
        this.f2765d = insetsController;
        this.f2766e = window;
    }

    @Override // v6.a
    public final void R() {
        Window window = this.f2766e;
        if (window != null) {
            View decorView = window.getDecorView();
            decorView.setSystemUiVisibility(decorView.getSystemUiVisibility() & (-8193));
        }
        this.f2765d.setSystemBarsAppearance(0, 8);
    }
}
