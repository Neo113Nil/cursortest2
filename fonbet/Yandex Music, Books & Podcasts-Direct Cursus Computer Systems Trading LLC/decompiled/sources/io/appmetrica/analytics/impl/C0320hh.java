package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.coreapi.internal.servicecomponents.ActivationBarrierCallback;
import java.util.concurrent.TimeUnit;
import org.jetbrains.annotations.NotNull;

/* renamed from: io.appmetrica.analytics.impl.hh, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C0320hh implements Wd, ActivationBarrierCallback {
    public final InterfaceC0831za a;
    public final Vd b;
    public final Vd c;

    public C0320hh(@NotNull InterfaceC0831za interfaceC0831za, @NotNull C0668tj c0668tj, @NotNull C0250f5 c0250f5, @NotNull C0637sh c0637sh) {
        this.a = interfaceC0831za;
        Vd vd = new Vd(c0668tj, c0250f5, c0637sh);
        this.b = vd;
        this.c = vd;
        if (vd.b()) {
            return;
        }
        C0747wb.k().a().subscribe(TimeUnit.SECONDS.toMillis(B8.a.longValue()), C0747wb.k().w().f(), this);
    }

    @Override // io.appmetrica.analytics.impl.Wd
    @NotNull
    public final N9 a() {
        return this.c;
    }

    @Override // io.appmetrica.analytics.coreapi.internal.servicecomponents.ActivationBarrierCallback
    public final void onWaitFinished() {
        this.b.a();
        ((C0165c6) this.a.a()).e();
    }
}
