package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.coreutils.internal.WrapUtils;

/* loaded from: classes.dex */
public final class Rj extends AbstractC0436gh {
    public Rj(E6 e6) {
        super(e6);
    }

    @Override // io.appmetrica.analytics.impl.AbstractC0436gh, io.appmetrica.analytics.impl.InterfaceC0462hh
    public final boolean a(Boolean bool) {
        return !this.f6081a.isRestrictedForSdk() && ((Boolean) WrapUtils.getOrDefault(bool, Boolean.TRUE)).booleanValue();
    }
}
