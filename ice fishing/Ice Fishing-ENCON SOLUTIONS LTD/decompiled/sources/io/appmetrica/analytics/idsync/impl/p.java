package io.appmetrica.analytics.idsync.impl;

import io.appmetrica.analytics.coreapi.internal.identifiers.SdkIdentifiers;
import io.appmetrica.analytics.modulesapi.internal.service.ServiceContext;

/* loaded from: classes.dex */
public final class p implements s {

    /* renamed from: a, reason: collision with root package name */
    public final ServiceContext f4053a;

    /* renamed from: b, reason: collision with root package name */
    public final String f4054b = "id_sync";

    public p(ServiceContext serviceContext) {
        this.f4053a = serviceContext;
    }

    @Override // io.appmetrica.analytics.idsync.impl.s
    public final void a(String str, SdkIdentifiers sdkIdentifiers) {
        this.f4053a.getSelfReporter().reportEvent(this.f4054b, str);
    }
}
