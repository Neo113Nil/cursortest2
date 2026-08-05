package defpackage;

import android.view.View;
import android.view.Window;

/* compiled from: r8-map-id-3663cbcef52f1a493ceac7deeb6c50e305d4d0c9f83e91180cb6ce540f71d6b5 */
/* loaded from: classes.dex */
public class xi0 extends f50 {
    public final Window VgvYg0wo;

    public xi0(Window window) {
        this.VgvYg0wo = window;
    }

    @Override // defpackage.f50
    public final void lDXGDhIF(boolean z) {
        Window window = this.VgvYg0wo;
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
