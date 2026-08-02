package io.appmetrica.analytics.locationinternal.impl;

import io.appmetrica.analytics.coreutils.internal.services.SafePackageManager;
import io.appmetrica.analytics.locationinternal.internal.config.LocationConfig;
import io.appmetrica.analytics.modulesapi.internal.service.ServiceContext;
import java.util.List;

/* loaded from: classes9.dex */
public final class n2 implements InterfaceC0926a0 {
    public final InterfaceC0926a0 a;

    public n2(ServiceContext serviceContext) {
        this.a = new SafePackageManager().hasSystemFeature(serviceContext.getContext(), "android.hardware.telephony") ? new J(serviceContext) : new C0938d0();
    }

    @Override // io.appmetrica.analytics.locationinternal.impl.InterfaceC0926a0
    public final Object a() {
        return (List) this.a.a();
    }

    public final List<C0966m> b() {
        return (List) this.a.a();
    }

    @Override // io.appmetrica.analytics.locationinternal.impl.InterfaceC0926a0, io.appmetrica.analytics.locationinternal.impl.J0
    public final void a(C0933c c0933c) {
        this.a.a(c0933c);
    }

    @Override // io.appmetrica.analytics.locationinternal.impl.InterfaceC0926a0
    public final void a(LocationConfig locationConfig) {
        this.a.a(locationConfig);
    }
}
