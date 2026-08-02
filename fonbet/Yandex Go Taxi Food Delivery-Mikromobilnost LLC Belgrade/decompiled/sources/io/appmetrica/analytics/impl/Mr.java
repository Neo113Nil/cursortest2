package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.coreutils.internal.services.UtilityServiceConfiguration;
import io.appmetrica.analytics.coreutils.internal.services.UtilityServiceProvider;

/* loaded from: classes9.dex */
public final class Mr implements Gp {
    public final UtilityServiceProvider a;

    public Mr(UtilityServiceProvider utilityServiceProvider) {
        this.a = utilityServiceProvider;
    }

    @Override // io.appmetrica.analytics.impl.Gp
    public final void a(Bp bp) {
        this.a.updateConfiguration(new UtilityServiceConfiguration(bp.w, bp.v));
    }
}
