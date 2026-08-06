package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.appsetid.internal.AppSetIdListener;
import io.appmetrica.analytics.coreapi.internal.identifiers.AppSetId;
import io.appmetrica.analytics.coreapi.internal.identifiers.AppSetIdScope;

/* loaded from: classes.dex */
public final class Z1 implements AppSetIdListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ C0266a2 f5462a;

    public Z1(C0266a2 c0266a2) {
        this.f5462a = c0266a2;
    }

    @Override // io.appmetrica.analytics.appsetid.internal.AppSetIdListener
    public final void onAppSetIdRetrieved(String str, AppSetIdScope appSetIdScope) {
        this.f5462a.f5540c = new AppSetId(str, appSetIdScope);
        this.f5462a.f5541d.countDown();
    }

    @Override // io.appmetrica.analytics.appsetid.internal.AppSetIdListener
    public final void onFailure(Throwable th) {
        this.f5462a.f5541d.countDown();
    }
}
