package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.coreutils.internal.StringUtils;

/* renamed from: io.appmetrica.analytics.impl.li, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C0510li extends Pb {
    public C0510li(int i) {
        super(i);
    }

    @Override // io.appmetrica.analytics.impl.Pb
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final int b(C0319f0 c0319f0) {
        if (c0319f0 == null) {
            return 0;
        }
        return StringUtils.getUtf8BytesLength(c0319f0.b) + 12;
    }
}
