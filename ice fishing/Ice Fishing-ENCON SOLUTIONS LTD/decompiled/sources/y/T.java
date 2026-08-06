package y;

import android.view.View;
import android.view.Window;

/* loaded from: classes.dex */
public final class T extends S {
    @Override // R1.l
    public final void A(boolean z2) {
        Window window = this.f8567i;
        if (!z2) {
            View decorView = window.getDecorView();
            decorView.setSystemUiVisibility(decorView.getSystemUiVisibility() & (-17));
        } else {
            window.clearFlags(134217728);
            window.addFlags(Integer.MIN_VALUE);
            View decorView2 = window.getDecorView();
            decorView2.setSystemUiVisibility(decorView2.getSystemUiVisibility() | 16);
        }
    }
}
