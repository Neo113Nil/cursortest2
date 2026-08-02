package androidx.fragment.app;

import android.os.Bundle;

/* renamed from: androidx.fragment.app.p, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0477p {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ AbstractComponentCallbacksC0479s f4983a;

    public C0477p(AbstractComponentCallbacksC0479s abstractComponentCallbacksC0479s) {
        this.f4983a = abstractComponentCallbacksC0479s;
    }

    public final void a() {
        AbstractComponentCallbacksC0479s abstractComponentCallbacksC0479s = this.f4983a;
        abstractComponentCallbacksC0479s.f5028q0.a();
        androidx.lifecycle.L.d(abstractComponentCallbacksC0479s);
        Bundle bundle = abstractComponentCallbacksC0479s.f5031u;
        abstractComponentCallbacksC0479s.f5028q0.b(bundle != null ? bundle.getBundle("registryState") : null);
    }
}
