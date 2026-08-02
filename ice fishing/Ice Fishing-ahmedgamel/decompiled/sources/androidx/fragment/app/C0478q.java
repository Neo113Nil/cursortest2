package androidx.fragment.app;

import android.view.View;

/* renamed from: androidx.fragment.app.q, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0478q extends X2.a {

    /* renamed from: z, reason: collision with root package name */
    public final /* synthetic */ AbstractComponentCallbacksC0479s f4984z;

    public C0478q(AbstractComponentCallbacksC0479s abstractComponentCallbacksC0479s) {
        this.f4984z = abstractComponentCallbacksC0479s;
    }

    @Override // X2.a
    public final View n(int i) {
        AbstractComponentCallbacksC0479s abstractComponentCallbacksC0479s = this.f4984z;
        View view = abstractComponentCallbacksC0479s.f5018X;
        if (view != null) {
            return view.findViewById(i);
        }
        throw new IllegalStateException("Fragment " + abstractComponentCallbacksC0479s + " does not have a view");
    }

    @Override // X2.a
    public final boolean o() {
        return this.f4984z.f5018X != null;
    }
}
