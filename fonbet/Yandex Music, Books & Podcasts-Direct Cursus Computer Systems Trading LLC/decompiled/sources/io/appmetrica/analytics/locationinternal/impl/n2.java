package io.appmetrica.analytics.locationinternal.impl;

import io.appmetrica.analytics.coreutils.internal.services.SafePackageManager;
import io.appmetrica.analytics.modulesapi.internal.service.ServiceContext;
import java.util.List;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes5.dex */
public final class n2 implements InterfaceC0849a0 {
    public final InterfaceC0849a0 a;

    public n2(@NotNull ServiceContext serviceContext) {
        this.a = new SafePackageManager().hasSystemFeature(serviceContext.getContext(), "android.hardware.telephony") ? new J(serviceContext) : new C0861d0();
    }

    @Override // io.appmetrica.analytics.locationinternal.impl.InterfaceC0849a0
    public final Object a() {
        return (List) this.a.a();
    }

    @NotNull
    public final List<C0891m> b() {
        return (List) this.a.a();
    }

    @Override // io.appmetrica.analytics.locationinternal.impl.InterfaceC0849a0, io.appmetrica.analytics.locationinternal.impl.J0
    public final void a(@NotNull C0856c c0856c) {
        this.a.a(c0856c);
    }

    @Override // io.appmetrica.analytics.locationinternal.impl.InterfaceC0849a0
    public final void a(@NotNull M0 m0) {
        this.a.a(m0);
    }
}
