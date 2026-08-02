package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.coreapi.internal.servicecomponents.ActivationBarrierCallback;
import java.util.concurrent.TimeUnit;

/* renamed from: io.appmetrica.analytics.impl.xh, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C0856xh implements InterfaceC0506le, ActivationBarrierCallback {
    public final Ga a;
    public final C0477ke b;
    public final C0477ke c;

    public C0856xh(Ga ga, C0916zj c0916zj, C0439j5 c0439j5, Ih ih) {
        this.a = ga;
        C0477ke c0477ke = new C0477ke(c0916zj, c0439j5, ih);
        this.b = c0477ke;
        this.c = c0477ke;
        if (c0477ke.b()) {
            return;
        }
        Jb.k().a().subscribe(TimeUnit.SECONDS.toMillis(G8.a.longValue()), Jb.k().w().g(), this);
    }

    @Override // io.appmetrica.analytics.impl.InterfaceC0506le
    public final U9 a() {
        return this.c;
    }

    @Override // io.appmetrica.analytics.coreapi.internal.servicecomponents.ActivationBarrierCallback
    public final void onWaitFinished() {
        this.b.a();
        ((C0325f6) this.a.a()).e();
    }
}
