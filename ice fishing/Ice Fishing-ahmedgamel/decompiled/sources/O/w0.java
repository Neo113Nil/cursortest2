package O;

import android.graphics.Insets;
import android.view.WindowInsets;

/* loaded from: classes.dex */
public class w0 extends v0 {

    /* renamed from: n, reason: collision with root package name */
    public G.e f2233n;

    /* renamed from: o, reason: collision with root package name */
    public G.e f2234o;

    /* renamed from: p, reason: collision with root package name */
    public G.e f2235p;

    public w0(A0 a02, WindowInsets windowInsets) {
        super(a02, windowInsets);
        this.f2233n = null;
        this.f2234o = null;
        this.f2235p = null;
    }

    @Override // O.y0
    public G.e g() {
        Insets mandatorySystemGestureInsets;
        if (this.f2234o == null) {
            mandatorySystemGestureInsets = this.f2227c.getMandatorySystemGestureInsets();
            this.f2234o = G.e.c(mandatorySystemGestureInsets);
        }
        return this.f2234o;
    }

    @Override // O.y0
    public G.e i() {
        Insets systemGestureInsets;
        if (this.f2233n == null) {
            systemGestureInsets = this.f2227c.getSystemGestureInsets();
            this.f2233n = G.e.c(systemGestureInsets);
        }
        return this.f2233n;
    }

    @Override // O.y0
    public G.e k() {
        Insets tappableElementInsets;
        if (this.f2235p == null) {
            tappableElementInsets = this.f2227c.getTappableElementInsets();
            this.f2235p = G.e.c(tappableElementInsets);
        }
        return this.f2235p;
    }

    @Override // O.t0, O.y0
    public A0 l(int i, int i4, int i6, int i9) {
        WindowInsets inset;
        inset = this.f2227c.inset(i, i4, i6, i9);
        return A0.h(null, inset);
    }

    @Override // O.u0, O.y0
    public void q(G.e eVar) {
    }
}
