package androidx.fragment.app;

import a.AbstractC0415a;
import android.view.View;

/* renamed from: androidx.fragment.app.q, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0484q extends AbstractC0415a {

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ AbstractComponentCallbacksC0485s f5128n;

    public C0484q(AbstractComponentCallbacksC0485s abstractComponentCallbacksC0485s) {
        this.f5128n = abstractComponentCallbacksC0485s;
    }

    @Override // a.AbstractC0415a
    public final View t(int i) {
        AbstractComponentCallbacksC0485s abstractComponentCallbacksC0485s = this.f5128n;
        View view = abstractComponentCallbacksC0485s.f5162X;
        if (view != null) {
            return view.findViewById(i);
        }
        throw new IllegalStateException("Fragment " + abstractComponentCallbacksC0485s + " does not have a view");
    }

    @Override // a.AbstractC0415a
    public final boolean u() {
        return this.f5128n.f5162X != null;
    }
}
