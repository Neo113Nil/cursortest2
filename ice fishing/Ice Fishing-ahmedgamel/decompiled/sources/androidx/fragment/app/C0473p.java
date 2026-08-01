package androidx.fragment.app;

import android.os.Bundle;

/* renamed from: androidx.fragment.app.p, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0473p {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ AbstractComponentCallbacksC0475s f5015a;

    public C0473p(AbstractComponentCallbacksC0475s abstractComponentCallbacksC0475s) {
        this.f5015a = abstractComponentCallbacksC0475s;
    }

    public final void a() {
        AbstractComponentCallbacksC0475s abstractComponentCallbacksC0475s = this.f5015a;
        abstractComponentCallbacksC0475s.f5063v0.a();
        androidx.lifecycle.L.d(abstractComponentCallbacksC0475s);
        Bundle bundle = abstractComponentCallbacksC0475s.f5060u;
        abstractComponentCallbacksC0475s.f5063v0.b(bundle != null ? bundle.getBundle("registryState") : null);
    }
}
