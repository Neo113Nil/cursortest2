package O2;

import h3.AbstractBinderC4567d;
import h3.C4571h;
import java.lang.ref.WeakReference;

/* renamed from: O2.q, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class BinderC0367q extends AbstractBinderC4567d {

    /* renamed from: n, reason: collision with root package name */
    public final WeakReference f2268n;

    public BinderC0367q(C0369t c0369t) {
        this.f2268n = new WeakReference(c0369t);
    }

    @Override // h3.InterfaceC4568e
    public final void w3(C4571h c4571h) {
        C0369t c0369t = (C0369t) this.f2268n.get();
        if (c0369t == null) {
            return;
        }
        C0364n c0364n = new C0364n(c0369t, c0369t, c4571h);
        HandlerC0370u handlerC0370u = c0369t.f2285n.f2328x;
        handlerC0370u.sendMessage(handlerC0370u.obtainMessage(1, c0364n));
    }
}
