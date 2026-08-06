package defpackage;

import android.view.View;
import android.view.Window;

/* compiled from: r8-map-id-f07502904ffb6c7cfc104556b013e0e48cd078697d1e7ebb5294e50317be4258 */
/* loaded from: classes.dex */
public class xg1 extends b70 {
    public final Window Yi7zF1RB1;

    public xg1(Window window) {
        this.Yi7zF1RB1 = window;
    }

    @Override // defpackage.b70
    public final void DmJncFq5(boolean z) {
        Window window = this.Yi7zF1RB1;
        if (!z) {
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
