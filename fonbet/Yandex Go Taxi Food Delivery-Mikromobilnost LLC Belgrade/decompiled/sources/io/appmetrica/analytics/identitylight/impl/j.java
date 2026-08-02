package io.appmetrica.analytics.identitylight.impl;

import io.appmetrica.analytics.identitylight.internal.config.IdentityLightConfig;

/* loaded from: classes9.dex */
public final class j implements Runnable {
    public final /* synthetic */ k a;
    public final /* synthetic */ IdentityLightConfig b;

    public j(k kVar, IdentityLightConfig identityLightConfig) {
        this.a = kVar;
        this.b = identityLightConfig;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.a.f.run();
        this.a.c.executeDelayed(this, this.b.getMinInterval());
    }
}
