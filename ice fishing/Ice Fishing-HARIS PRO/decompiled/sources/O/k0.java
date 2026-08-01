package O;

import a.AbstractC0078a;
import android.view.View;
import android.view.Window;

/* loaded from: classes.dex */
public final class k0 extends AbstractC0078a {
    public final Window e;

    public k0(Window window, S0.e eVar) {
        this.e = window;
    }

    @Override // a.AbstractC0078a
    public final boolean K() {
        return (this.e.getDecorView().getSystemUiVisibility() & 8192) != 0;
    }

    @Override // a.AbstractC0078a
    public final void Z(boolean z2) {
        if (!z2) {
            f0(16);
            return;
        }
        Window window = this.e;
        window.clearFlags(134217728);
        window.addFlags(Integer.MIN_VALUE);
        e0(16);
    }

    @Override // a.AbstractC0078a
    public final void a0(boolean z2) {
        if (!z2) {
            f0(8192);
            return;
        }
        Window window = this.e;
        window.clearFlags(67108864);
        window.addFlags(Integer.MIN_VALUE);
        e0(8192);
    }

    public final void e0(int i) {
        View decorView = this.e.getDecorView();
        decorView.setSystemUiVisibility(i | decorView.getSystemUiVisibility());
    }

    public final void f0(int i) {
        View decorView = this.e.getDecorView();
        decorView.setSystemUiVisibility((~i) & decorView.getSystemUiVisibility());
    }
}
