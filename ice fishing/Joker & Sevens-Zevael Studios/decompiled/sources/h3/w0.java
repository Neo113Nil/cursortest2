package h3;

import android.graphics.Insets;
import android.view.WindowInsets;

/* compiled from: r8-map-id-9ca073bbfde00f50be8682633edd5c48170ffeeeebc591f4c22ad3deaafa0d20 */
/* loaded from: classes.dex */
public final class w0 extends v0 {

    /* renamed from: s, reason: collision with root package name */
    public static final a1 f2831s;

    static {
        WindowInsets windowInsets;
        windowInsets = WindowInsets.CONSUMED;
        f2831s = a1.c(null, windowInsets);
    }

    public w0(a1 a1Var, WindowInsets windowInsets) {
        super(a1Var, windowInsets);
    }

    @Override // h3.u0, h3.q0, h3.x0
    public a3.b f(int i10) {
        Insets insets;
        insets = this.f2814c.getInsets(z0.a(i10));
        return a3.b.c(insets);
    }

    @Override // h3.u0, h3.q0, h3.x0
    public a3.b g(int i10) {
        Insets insetsIgnoringVisibility;
        insetsIgnoringVisibility = this.f2814c.getInsetsIgnoringVisibility(z0.a(i10));
        return a3.b.c(insetsIgnoringVisibility);
    }

    @Override // h3.u0, h3.q0, h3.x0
    public boolean p(int i10) {
        boolean isVisible;
        isVisible = this.f2814c.isVisible(z0.a(i10));
        return isVisible;
    }
}
