package w;

import android.graphics.Insets;
import android.view.WindowInsets;
import p.C0224c;

/* loaded from: classes.dex */
public class N extends M {

    /* renamed from: n, reason: collision with root package name */
    public C0224c f3033n;

    /* renamed from: o, reason: collision with root package name */
    public C0224c f3034o;

    /* renamed from: p, reason: collision with root package name */
    public C0224c f3035p;

    public N(S s2, WindowInsets windowInsets) {
        super(s2, windowInsets);
        this.f3033n = null;
        this.f3034o = null;
        this.f3035p = null;
    }

    @Override // w.P
    public C0224c f() {
        Insets mandatorySystemGestureInsets;
        if (this.f3034o == null) {
            mandatorySystemGestureInsets = this.f3027c.getMandatorySystemGestureInsets();
            this.f3034o = C0224c.b(mandatorySystemGestureInsets);
        }
        return this.f3034o;
    }

    @Override // w.P
    public C0224c h() {
        Insets systemGestureInsets;
        if (this.f3033n == null) {
            systemGestureInsets = this.f3027c.getSystemGestureInsets();
            this.f3033n = C0224c.b(systemGestureInsets);
        }
        return this.f3033n;
    }

    @Override // w.P
    public C0224c j() {
        Insets tappableElementInsets;
        if (this.f3035p == null) {
            tappableElementInsets = this.f3027c.getTappableElementInsets();
            this.f3035p = C0224c.b(tappableElementInsets);
        }
        return this.f3035p;
    }

    @Override // w.K, w.P
    public void p(C0224c c0224c) {
    }
}
