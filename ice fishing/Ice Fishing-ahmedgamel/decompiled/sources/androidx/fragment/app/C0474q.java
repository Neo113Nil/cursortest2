package androidx.fragment.app;

import android.view.View;

/* renamed from: androidx.fragment.app.q, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0474q extends S0.f {

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ AbstractComponentCallbacksC0475s f5016n;

    public C0474q(AbstractComponentCallbacksC0475s abstractComponentCallbacksC0475s) {
        this.f5016n = abstractComponentCallbacksC0475s;
    }

    @Override // S0.f
    public final View o(int i) {
        AbstractComponentCallbacksC0475s abstractComponentCallbacksC0475s = this.f5016n;
        View view = abstractComponentCallbacksC0475s.f5050X;
        if (view != null) {
            return view.findViewById(i);
        }
        throw new IllegalStateException("Fragment " + abstractComponentCallbacksC0475s + " does not have a view");
    }

    @Override // S0.f
    public final boolean r() {
        return this.f5016n.f5050X != null;
    }
}
