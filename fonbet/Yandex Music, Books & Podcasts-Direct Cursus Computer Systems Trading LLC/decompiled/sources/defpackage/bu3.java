package defpackage;

import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes5.dex */
public final class bu3 extends AtomicReference implements ka8 {
    private static final long serialVersionUID = 5718521705281392066L;

    @Override // defpackage.ka8
    public final void a() {
        wt3 wt3Var;
        if (get() == null || (wt3Var = (wt3) getAndSet(null)) == null) {
            return;
        }
        try {
            wt3Var.cancel();
        } catch (Exception e) {
            leu.a0(e);
            y5g.g0(e);
        }
    }
}
