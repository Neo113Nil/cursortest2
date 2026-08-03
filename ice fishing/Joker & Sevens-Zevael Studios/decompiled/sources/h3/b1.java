package h3;

import android.view.View;
import android.view.Window;

/* compiled from: r8-map-id-9ca073bbfde00f50be8682633edd5c48170ffeeeebc591f4c22ad3deaafa0d20 */
/* loaded from: classes.dex */
public final class b1 extends v6.a {

    /* renamed from: d, reason: collision with root package name */
    public final Window f2751d;

    public b1(Window window) {
        this.f2751d = window;
    }

    @Override // v6.a
    public final void R() {
        View decorView = this.f2751d.getDecorView();
        decorView.setSystemUiVisibility(decorView.getSystemUiVisibility() & (-8193));
    }
}
