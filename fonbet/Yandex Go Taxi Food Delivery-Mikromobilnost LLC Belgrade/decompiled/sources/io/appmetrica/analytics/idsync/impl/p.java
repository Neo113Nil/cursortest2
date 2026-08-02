package io.appmetrica.analytics.idsync.impl;

import io.appmetrica.analytics.coreapi.internal.identifiers.SdkIdentifiers;
import io.appmetrica.analytics.modulesapi.internal.service.ServiceContext;

/* loaded from: classes4.dex */
public final class p implements s {
    public final ServiceContext a;
    public final String b = "id_sync";

    public p(ServiceContext serviceContext) {
        this.a = serviceContext;
    }

    @Override // io.appmetrica.analytics.idsync.impl.s
    public final void a(String str, SdkIdentifiers sdkIdentifiers) {
        this.a.getSelfReporter().reportEvent(this.b, str);
    }
}
