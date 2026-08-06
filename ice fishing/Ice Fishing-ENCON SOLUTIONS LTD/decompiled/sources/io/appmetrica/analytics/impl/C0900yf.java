package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.coreutils.internal.StringUtils;

/* renamed from: io.appmetrica.analytics.impl.yf, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0900yf extends C0688qa {
    public C0900yf(int i2) {
        super(i2);
    }

    @Override // io.appmetrica.analytics.impl.C0688qa
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final int b(Z z2) {
        if (z2 == null) {
            return 0;
        }
        return StringUtils.getUtf8BytesLength(z2.f5459b) + 12;
    }
}
