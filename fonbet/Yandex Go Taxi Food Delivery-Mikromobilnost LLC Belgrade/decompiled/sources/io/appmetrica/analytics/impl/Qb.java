package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.coreutils.internal.StringUtils;

/* loaded from: classes4.dex */
public final class Qb extends Pb {
    public Qb(int i, int i2) {
        this(i, new Rb(i2));
    }

    public final int a(String str) {
        return StringUtils.getUTF8Bytes(str).length;
    }

    @Override // io.appmetrica.analytics.impl.Pb
    public final int b(Object obj) {
        return StringUtils.getUTF8Bytes((String) obj).length;
    }

    public Qb(int i, Rb rb) {
        super(i, rb);
    }
}
