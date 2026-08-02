package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.coreutils.internal.WrapUtils;

/* renamed from: io.appmetrica.analytics.impl.lk, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C0512lk extends Tj {
    public C0512lk(C7 c7) {
        super(c7);
    }

    @Override // io.appmetrica.analytics.impl.Tj, io.appmetrica.analytics.impl.Uj
    public final boolean a(Boolean bool) {
        return !this.a.isRestrictedForSdk() && ((Boolean) WrapUtils.getOrDefault(bool, Boolean.TRUE)).booleanValue();
    }
}
