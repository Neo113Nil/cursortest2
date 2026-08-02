package io.appmetrica.analytics.idsync.impl;

import io.appmetrica.analytics.coreapi.internal.servicecomponents.ActivationBarrierCallback;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: io.appmetrica.analytics.idsync.impl.g, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C0099g implements ActivationBarrierCallback {
    public final /* synthetic */ h a;

    public C0099g(h hVar) {
        this.a = hVar;
    }

    @Override // io.appmetrica.analytics.coreapi.internal.servicecomponents.ActivationBarrierCallback
    public final void onWaitFinished() {
        C0098f c0098f = this.a.g;
        if (c0098f != null) {
            c0098f.run();
        } else {
            Intrinsics.j("syncRunnable");
            throw null;
        }
    }
}
