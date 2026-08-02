package defpackage;

import androidx.lifecycle.Lifecycle;
import coil.c;
import java.util.concurrent.CancellationException;

/* loaded from: classes10.dex */
public final class rv31 implements u5j0 {
    public final c a;
    public final hev b;
    public final nv31 c;
    public final Lifecycle w;
    public final l8x x;

    public rv31(c cVar, hev hevVar, nv31 nv31Var, Lifecycle lifecycle, l8x l8xVar) {
        this.a = cVar;
        this.b = hevVar;
        this.c = nv31Var;
        this.w = lifecycle;
        this.x = l8xVar;
    }

    @Override // defpackage.u5j0
    public final void I() {
        nv31 nv31Var = this.c;
        if (nv31Var.getView().isAttachedToWindow()) {
            return;
        }
        m.c(nv31Var.getView()).setRequest(this);
        throw new CancellationException("'ViewTarget.view' must be attached to a window.");
    }

    @Override // androidx.lifecycle.DefaultLifecycleObserver
    public final void onDestroy(pey peyVar) {
        m.c(this.c.getView()).dispose();
    }

    @Override // defpackage.u5j0
    public final void start() {
        Lifecycle lifecycle = this.w;
        lifecycle.a(this);
        nv31 nv31Var = this.c;
        if (nv31Var instanceof oey) {
            oey oeyVar = (oey) nv31Var;
            lifecycle.d(oeyVar);
            lifecycle.a(oeyVar);
        }
        m.c(nv31Var.getView()).setRequest(this);
    }
}
