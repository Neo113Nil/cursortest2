package y;

import android.graphics.Insets;
import android.view.WindowInsets;

/* loaded from: classes.dex */
public class M extends L {

    /* renamed from: n, reason: collision with root package name */
    public r.c f8560n;

    /* renamed from: o, reason: collision with root package name */
    public r.c f8561o;

    /* renamed from: p, reason: collision with root package name */
    public r.c f8562p;

    public M(Q q2, WindowInsets windowInsets) {
        super(q2, windowInsets);
        this.f8560n = null;
        this.f8561o = null;
        this.f8562p = null;
    }

    @Override // y.O
    public r.c f() {
        Insets mandatorySystemGestureInsets;
        if (this.f8561o == null) {
            mandatorySystemGestureInsets = this.f8554c.getMandatorySystemGestureInsets();
            this.f8561o = r.c.b(mandatorySystemGestureInsets);
        }
        return this.f8561o;
    }

    @Override // y.O
    public r.c h() {
        Insets systemGestureInsets;
        if (this.f8560n == null) {
            systemGestureInsets = this.f8554c.getSystemGestureInsets();
            this.f8560n = r.c.b(systemGestureInsets);
        }
        return this.f8560n;
    }

    @Override // y.O
    public r.c j() {
        Insets tappableElementInsets;
        if (this.f8562p == null) {
            tappableElementInsets = this.f8554c.getTappableElementInsets();
            this.f8562p = r.c.b(tappableElementInsets);
        }
        return this.f8562p;
    }

    @Override // y.K, y.O
    public void p(r.c cVar) {
    }
}
