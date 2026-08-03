package h3;

import android.view.WindowInsets;

/* compiled from: r8-map-id-9ca073bbfde00f50be8682633edd5c48170ffeeeebc591f4c22ad3deaafa0d20 */
/* loaded from: classes.dex */
public class r0 extends q0 {

    /* renamed from: n, reason: collision with root package name */
    public a3.b f2820n;

    public r0(a1 a1Var, WindowInsets windowInsets) {
        super(a1Var, windowInsets);
        this.f2820n = null;
    }

    @Override // h3.x0
    public a1 b() {
        return a1.c(null, this.f2814c.consumeStableInsets());
    }

    @Override // h3.x0
    public a1 c() {
        return a1.c(null, this.f2814c.consumeSystemWindowInsets());
    }

    @Override // h3.x0
    public final a3.b i() {
        if (this.f2820n == null) {
            WindowInsets windowInsets = this.f2814c;
            this.f2820n = a3.b.b(windowInsets.getStableInsetLeft(), windowInsets.getStableInsetTop(), windowInsets.getStableInsetRight(), windowInsets.getStableInsetBottom());
        }
        return this.f2820n;
    }

    @Override // h3.x0
    public boolean n() {
        return this.f2814c.isConsumed();
    }

    @Override // h3.x0
    public void s(a3.b bVar) {
        this.f2820n = bVar;
    }
}
