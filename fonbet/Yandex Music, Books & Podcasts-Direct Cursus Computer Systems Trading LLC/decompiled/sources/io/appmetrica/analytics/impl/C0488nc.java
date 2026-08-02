package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.coreapi.internal.clientcomponents.ClientComponentsInitializer;

/* renamed from: io.appmetrica.analytics.impl.nc, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C0488nc implements ClientComponentsInitializer {
    public final C0686u8 a = new C0686u8();

    @Override // io.appmetrica.analytics.coreapi.internal.clientcomponents.ClientComponentsInitializer
    public final void onCreate() {
        this.a.onCreate();
        R4.l().i = new C0777xc();
        C0617rq c0617rq = R4.l().j;
        c0617rq.a.add(C0575qc.a);
        R4.l().t.a = new H();
        R4.l().w = new C0420l2();
    }
}
