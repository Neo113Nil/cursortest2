package io.appmetrica.analytics.idsync.impl;

import io.appmetrica.analytics.coreapi.internal.servicecomponents.ActivationBarrierCallback;

/* renamed from: io.appmetrica.analytics.idsync.impl.g, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C0173g implements ActivationBarrierCallback {
    public final /* synthetic */ h a;

    public C0173g(h hVar) {
        this.a = hVar;
    }

    @Override // io.appmetrica.analytics.coreapi.internal.servicecomponents.ActivationBarrierCallback
    public final void onWaitFinished() {
        C0172f c0172f = this.a.g;
        if (c0172f == null) {
            c0172f = null;
        }
        c0172f.run();
    }
}
