package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.coreutils.internal.StringUtils;

/* renamed from: io.appmetrica.analytics.impl.xr, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C0866xr extends Aj {
    public C0866xr(S5 s5) {
        super(s5);
    }

    @Override // io.appmetrica.analytics.impl.Aj
    public final boolean a(K6 k6) {
        String j = this.a.c.j();
        String str = k6.h;
        this.a.a(str);
        if (StringUtils.equalsNullSafety(j, str)) {
            return false;
        }
        this.a.a(G4.o());
        return false;
    }
}
