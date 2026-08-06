package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.coreapi.internal.servicecomponents.ActivationBarrierCallback;
import java.util.concurrent.TimeUnit;

/* loaded from: classes.dex */
public final class Ke implements InterfaceC0793uc, ActivationBarrierCallback {

    /* renamed from: a, reason: collision with root package name */
    public final InterfaceC0712r9 f4634a;

    /* renamed from: b, reason: collision with root package name */
    public final C0767tc f4635b;

    /* renamed from: c, reason: collision with root package name */
    public final C0767tc f4636c;

    public Ke(InterfaceC0712r9 interfaceC0712r9, Qg qg, C0630o4 c0630o4, We we) {
        this.f4634a = interfaceC0712r9;
        C0767tc c0767tc = new C0767tc(qg, c0630o4, we);
        this.f4635b = c0767tc;
        this.f4636c = c0767tc;
        if (c0767tc.b()) {
            return;
        }
        C0610na.k().a().subscribe(TimeUnit.SECONDS.toMillis(I7.f4533a.longValue()), C0610na.k().w().d(), this);
    }

    @Override // io.appmetrica.analytics.impl.InterfaceC0793uc
    public final F8 a() {
        return this.f4636c;
    }

    @Override // io.appmetrica.analytics.coreapi.internal.servicecomponents.ActivationBarrierCallback
    public final void onWaitFinished() {
        this.f4635b.a();
        ((C0527k5) this.f4634a.a()).e();
    }
}
