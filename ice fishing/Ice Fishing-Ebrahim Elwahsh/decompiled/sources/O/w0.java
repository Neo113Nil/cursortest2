package O;

import android.graphics.Insets;
import android.view.WindowInsets;

/* loaded from: classes.dex */
public class w0 extends v0 {

    /* renamed from: n, reason: collision with root package name */
    public G.e f2331n;

    /* renamed from: o, reason: collision with root package name */
    public G.e f2332o;

    /* renamed from: p, reason: collision with root package name */
    public G.e f2333p;

    public w0(A0 a02, WindowInsets windowInsets) {
        super(a02, windowInsets);
        this.f2331n = null;
        this.f2332o = null;
        this.f2333p = null;
    }

    @Override // O.y0
    public G.e g() {
        Insets mandatorySystemGestureInsets;
        if (this.f2332o == null) {
            mandatorySystemGestureInsets = this.f2325c.getMandatorySystemGestureInsets();
            this.f2332o = G.e.c(mandatorySystemGestureInsets);
        }
        return this.f2332o;
    }

    @Override // O.y0
    public G.e i() {
        Insets systemGestureInsets;
        if (this.f2331n == null) {
            systemGestureInsets = this.f2325c.getSystemGestureInsets();
            this.f2331n = G.e.c(systemGestureInsets);
        }
        return this.f2331n;
    }

    @Override // O.y0
    public G.e k() {
        Insets tappableElementInsets;
        if (this.f2333p == null) {
            tappableElementInsets = this.f2325c.getTappableElementInsets();
            this.f2333p = G.e.c(tappableElementInsets);
        }
        return this.f2333p;
    }

    @Override // O.t0, O.y0
    public A0 l(int i, int i4, int i9, int i10) {
        WindowInsets inset;
        inset = this.f2325c.inset(i, i4, i9, i10);
        return A0.h(null, inset);
    }

    @Override // O.u0, O.y0
    public void q(G.e eVar) {
    }
}
