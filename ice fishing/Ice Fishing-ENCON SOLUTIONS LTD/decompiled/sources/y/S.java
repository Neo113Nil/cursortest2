package y;

import android.view.View;
import android.view.Window;

/* loaded from: classes.dex */
public class S extends R1.l {

    /* renamed from: i, reason: collision with root package name */
    public final Window f8567i;

    public S(Window window) {
        this.f8567i = window;
    }

    @Override // R1.l
    public final void B(boolean z2) {
        Window window = this.f8567i;
        if (!z2) {
            View decorView = window.getDecorView();
            decorView.setSystemUiVisibility(decorView.getSystemUiVisibility() & (-8193));
        } else {
            window.clearFlags(67108864);
            window.addFlags(Integer.MIN_VALUE);
            View decorView2 = window.getDecorView();
            decorView2.setSystemUiVisibility(decorView2.getSystemUiVisibility() | 8192);
        }
    }
}
