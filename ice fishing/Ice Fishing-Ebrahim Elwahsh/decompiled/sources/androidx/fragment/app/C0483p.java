package androidx.fragment.app;

import android.os.Bundle;

/* renamed from: androidx.fragment.app.p, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0483p {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ AbstractComponentCallbacksC0485s f5127a;

    public C0483p(AbstractComponentCallbacksC0485s abstractComponentCallbacksC0485s) {
        this.f5127a = abstractComponentCallbacksC0485s;
    }

    public final void a() {
        AbstractComponentCallbacksC0485s abstractComponentCallbacksC0485s = this.f5127a;
        abstractComponentCallbacksC0485s.f5175v0.a();
        androidx.lifecycle.L.d(abstractComponentCallbacksC0485s);
        Bundle bundle = abstractComponentCallbacksC0485s.f5172u;
        abstractComponentCallbacksC0485s.f5175v0.b(bundle != null ? bundle.getBundle("registryState") : null);
    }
}
