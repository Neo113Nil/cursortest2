package h3;

import android.graphics.Insets;
import android.view.WindowInsets;

/* compiled from: r8-map-id-9ca073bbfde00f50be8682633edd5c48170ffeeeebc591f4c22ad3deaafa0d20 */
/* loaded from: classes.dex */
public class t0 extends s0 {

    /* renamed from: o, reason: collision with root package name */
    public a3.b f2821o;

    /* renamed from: p, reason: collision with root package name */
    public a3.b f2822p;

    /* renamed from: q, reason: collision with root package name */
    public a3.b f2823q;

    public t0(a1 a1Var, WindowInsets windowInsets) {
        super(a1Var, windowInsets);
        this.f2821o = null;
        this.f2822p = null;
        this.f2823q = null;
    }

    @Override // h3.x0
    public a3.b h() {
        Insets mandatorySystemGestureInsets;
        if (this.f2822p == null) {
            mandatorySystemGestureInsets = this.f2814c.getMandatorySystemGestureInsets();
            this.f2822p = a3.b.c(mandatorySystemGestureInsets);
        }
        return this.f2822p;
    }

    @Override // h3.x0
    public a3.b j() {
        Insets systemGestureInsets;
        if (this.f2821o == null) {
            systemGestureInsets = this.f2814c.getSystemGestureInsets();
            this.f2821o = a3.b.c(systemGestureInsets);
        }
        return this.f2821o;
    }

    @Override // h3.x0
    public a3.b l() {
        Insets tappableElementInsets;
        if (this.f2823q == null) {
            tappableElementInsets = this.f2814c.getTappableElementInsets();
            this.f2823q = a3.b.c(tappableElementInsets);
        }
        return this.f2823q;
    }

    @Override // h3.q0, h3.x0
    public a1 m(int i10, int i11, int i12, int i13) {
        WindowInsets inset;
        inset = this.f2814c.inset(i10, i11, i12, i13);
        return a1.c(null, inset);
    }

    @Override // h3.r0, h3.x0
    public void s(a3.b bVar) {
    }
}
