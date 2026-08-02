package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.coreutils.internal.StringUtils;

/* loaded from: classes9.dex */
public final class Q9 implements Wr {
    public final W9 a;

    public Q9() {
        this(new W9());
    }

    @Override // io.appmetrica.analytics.impl.Wr
    public final byte[] a(C0243ca c0243ca, Xj xj) {
        String str = c0243ca.b;
        return ((V9) this.a.a.a(c0243ca.o)).a(str != null ? StringUtils.getUTF8Bytes(str) : new byte[0]);
    }

    public Q9(W9 w9) {
        this.a = w9;
    }
}
