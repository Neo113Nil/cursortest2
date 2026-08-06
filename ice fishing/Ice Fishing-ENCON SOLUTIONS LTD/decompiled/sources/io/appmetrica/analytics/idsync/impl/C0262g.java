package io.appmetrica.analytics.idsync.impl;

import io.appmetrica.analytics.coreapi.internal.servicecomponents.ActivationBarrierCallback;

/* renamed from: io.appmetrica.analytics.idsync.impl.g, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0262g implements ActivationBarrierCallback {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ h f4013a;

    public C0262g(h hVar) {
        this.f4013a = hVar;
    }

    @Override // io.appmetrica.analytics.coreapi.internal.servicecomponents.ActivationBarrierCallback
    public final void onWaitFinished() {
        C0261f c0261f = this.f4013a.f4020g;
        if (c0261f != null) {
            c0261f.run();
        } else {
            kotlin.jvm.internal.i.i("syncRunnable");
            throw null;
        }
    }
}
