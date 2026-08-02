package io.appmetrica.analytics.impl;

import java.util.Map;

/* renamed from: io.appmetrica.analytics.impl.fm, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C0341fm implements Ia {
    @Override // io.appmetrica.analytics.impl.Ia
    public final Integer a(C0243ca c0243ca) {
        Hc hc = c0243ca.h;
        if (hc != null) {
            return (Integer) Di.c.get(hc);
        }
        Map map = Di.a;
        return null;
    }
}
