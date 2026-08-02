package defpackage;

import androidx.lifecycle.Lifecycle;
import com.yandex.go.location.user.overlay.UserLocationOverlayPresenter$onResume$$inlined$safeCollectIn$1;
import com.yandex.go.location.user.overlay.UserLocationOverlayPresenter$onResume$$inlined$safeCollectIn$2;
import com.yandex.go.location.user.overlay.d;

/* loaded from: classes12.dex */
public final class xo21 extends qc5 {
    public final po21 A;
    public final qwc B;
    public boolean C;

    public xo21(Lifecycle lifecycle, po21 po21Var, qwc qwcVar) {
        super(to21.class, new ney(lifecycle));
        this.A = po21Var;
        this.B = qwcVar;
    }

    @Override // defpackage.qc5, defpackage.zc5
    public final void Fg() {
        super.Fg();
        ((to21) Dg()).pause();
    }

    @Override // defpackage.qc5, defpackage.zc5
    public final void Gg() {
        super.Gg();
        if (this.C) {
            ((to21) Dg()).t0();
        } else {
            ((to21) Dg()).n0();
        }
        tje.N(Kg(), null, null, new UserLocationOverlayPresenter$onResume$$inlined$safeCollectIn$1(d.a(this.A), null, this), 3);
        tje.N(Kg(), null, null, new UserLocationOverlayPresenter$onResume$$inlined$safeCollectIn$2(this.B.a(), null, this), 3);
        ((to21) Dg()).resume();
    }
}
