package O;

import android.graphics.Insets;
import android.view.WindowInsets;

/* loaded from: classes.dex */
public class w0 extends v0 {

    /* renamed from: n, reason: collision with root package name */
    public G.e f2145n;

    /* renamed from: o, reason: collision with root package name */
    public G.e f2146o;

    /* renamed from: p, reason: collision with root package name */
    public G.e f2147p;

    public w0(A0 a02, WindowInsets windowInsets) {
        super(a02, windowInsets);
        this.f2145n = null;
        this.f2146o = null;
        this.f2147p = null;
    }

    @Override // O.y0
    public G.e g() {
        Insets mandatorySystemGestureInsets;
        if (this.f2146o == null) {
            mandatorySystemGestureInsets = this.f2139c.getMandatorySystemGestureInsets();
            this.f2146o = G.e.c(mandatorySystemGestureInsets);
        }
        return this.f2146o;
    }

    @Override // O.y0
    public G.e i() {
        Insets systemGestureInsets;
        if (this.f2145n == null) {
            systemGestureInsets = this.f2139c.getSystemGestureInsets();
            this.f2145n = G.e.c(systemGestureInsets);
        }
        return this.f2145n;
    }

    @Override // O.y0
    public G.e k() {
        Insets tappableElementInsets;
        if (this.f2147p == null) {
            tappableElementInsets = this.f2139c.getTappableElementInsets();
            this.f2147p = G.e.c(tappableElementInsets);
        }
        return this.f2147p;
    }

    @Override // O.t0, O.y0
    public A0 l(int i, int i6, int i9, int i10) {
        WindowInsets inset;
        inset = this.f2139c.inset(i, i6, i9, i10);
        return A0.h(null, inset);
    }

    @Override // O.u0, O.y0
    public void q(G.e eVar) {
    }
}
