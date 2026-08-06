package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.coreutils.internal.WrapUtils;

/* renamed from: io.appmetrica.analytics.impl.yh, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0902yh extends AbstractC0436gh {
    public C0902yh(E6 e6) {
        super(e6);
    }

    @Override // io.appmetrica.analytics.impl.AbstractC0436gh, io.appmetrica.analytics.impl.InterfaceC0462hh
    public final boolean a(Boolean bool) {
        return !this.f6081a.isRestrictedForSdk() && ((Boolean) WrapUtils.getOrDefault(bool, Boolean.TRUE)).booleanValue();
    }
}
