package io.appmetrica.analytics.impl;

import androidx.annotation.NonNull;
import io.appmetrica.analytics.coreutils.internal.WrapUtils;

/* loaded from: classes5.dex */
public final class Pm extends Jj {
    public Pm(@NonNull C0772x7 c0772x7) {
        super(c0772x7);
    }

    @Override // io.appmetrica.analytics.impl.Jj, io.appmetrica.analytics.impl.Kj
    public final boolean a(Boolean bool) {
        return !this.a.isRestrictedForSdk() && ((Boolean) WrapUtils.getOrDefault(bool, Boolean.TRUE)).booleanValue();
    }
}
