package O;

import android.graphics.Insets;
import android.view.WindowInsets;

/* loaded from: classes.dex */
public class f0 extends e0 {

    /* renamed from: n, reason: collision with root package name */
    public G.c f803n;

    /* renamed from: o, reason: collision with root package name */
    public G.c f804o;

    /* renamed from: p, reason: collision with root package name */
    public G.c f805p;

    public f0(j0 j0Var, WindowInsets windowInsets) {
        super(j0Var, windowInsets);
        this.f803n = null;
        this.f804o = null;
        this.f805p = null;
    }

    @Override // O.h0
    public G.c g() {
        Insets mandatorySystemGestureInsets;
        if (this.f804o == null) {
            mandatorySystemGestureInsets = this.f792c.getMandatorySystemGestureInsets();
            this.f804o = G.c.c(mandatorySystemGestureInsets);
        }
        return this.f804o;
    }

    @Override // O.h0
    public G.c i() {
        Insets systemGestureInsets;
        if (this.f803n == null) {
            systemGestureInsets = this.f792c.getSystemGestureInsets();
            this.f803n = G.c.c(systemGestureInsets);
        }
        return this.f803n;
    }

    @Override // O.h0
    public G.c k() {
        Insets tappableElementInsets;
        if (this.f805p == null) {
            tappableElementInsets = this.f792c.getTappableElementInsets();
            this.f805p = G.c.c(tappableElementInsets);
        }
        return this.f805p;
    }

    @Override // O.c0, O.h0
    public j0 l(int i, int i2, int i3, int i4) {
        WindowInsets inset;
        inset = this.f792c.inset(i, i2, i3, i4);
        return j0.g(null, inset);
    }

    @Override // O.d0, O.h0
    public void q(G.c cVar) {
    }
}
