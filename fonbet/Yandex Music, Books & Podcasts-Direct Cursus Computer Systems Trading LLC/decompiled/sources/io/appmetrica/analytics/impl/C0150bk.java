package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.coreutils.internal.WrapUtils;

/* renamed from: io.appmetrica.analytics.impl.bk, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C0150bk extends Jj {
    public C0150bk(C0772x7 c0772x7) {
        super(c0772x7);
    }

    @Override // io.appmetrica.analytics.impl.Jj, io.appmetrica.analytics.impl.Kj
    public final boolean a(Boolean bool) {
        return !this.a.isRestrictedForSdk() && ((Boolean) WrapUtils.getOrDefault(bool, Boolean.TRUE)).booleanValue();
    }
}
