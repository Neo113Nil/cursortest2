package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.coreutils.internal.StringUtils;

/* loaded from: classes5.dex */
public final class Uh extends C0832zb {
    public Uh(int i) {
        super(i);
    }

    @Override // io.appmetrica.analytics.impl.C0832zb
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final int b(C0188d0 c0188d0) {
        if (c0188d0 == null) {
            return 0;
        }
        return StringUtils.getUtf8BytesLength(c0188d0.b) + 12;
    }
}
