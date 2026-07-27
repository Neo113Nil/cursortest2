package w;

import android.graphics.Insets;
import android.view.WindowInsets;
import p.C0225c;

/* loaded from: classes.dex */
public class N extends M {

    /* renamed from: n, reason: collision with root package name */
    public C0225c f3038n;

    /* renamed from: o, reason: collision with root package name */
    public C0225c f3039o;

    /* renamed from: p, reason: collision with root package name */
    public C0225c f3040p;

    public N(S s2, WindowInsets windowInsets) {
        super(s2, windowInsets);
        this.f3038n = null;
        this.f3039o = null;
        this.f3040p = null;
    }

    @Override // w.P
    public C0225c f() {
        Insets mandatorySystemGestureInsets;
        if (this.f3039o == null) {
            mandatorySystemGestureInsets = this.f3032c.getMandatorySystemGestureInsets();
            this.f3039o = C0225c.b(mandatorySystemGestureInsets);
        }
        return this.f3039o;
    }

    @Override // w.P
    public C0225c h() {
        Insets systemGestureInsets;
        if (this.f3038n == null) {
            systemGestureInsets = this.f3032c.getSystemGestureInsets();
            this.f3038n = C0225c.b(systemGestureInsets);
        }
        return this.f3038n;
    }

    @Override // w.P
    public C0225c j() {
        Insets tappableElementInsets;
        if (this.f3040p == null) {
            tappableElementInsets = this.f3032c.getTappableElementInsets();
            this.f3040p = C0225c.b(tappableElementInsets);
        }
        return this.f3040p;
    }

    @Override // w.K, w.P
    public void p(C0225c c0225c) {
    }
}
