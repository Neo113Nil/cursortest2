package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.coreutils.internal.StringUtils;

/* renamed from: io.appmetrica.analytics.impl.km, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C0485km extends Aj {
    public C0485km(S5 s5) {
        super(s5);
    }

    @Override // io.appmetrica.analytics.impl.Aj
    public final boolean a(K6 k6) {
        String str = k6.h;
        if (StringUtils.isNullOrEmpty(str)) {
            return false;
        }
        this.a.a(str);
        return false;
    }
}
