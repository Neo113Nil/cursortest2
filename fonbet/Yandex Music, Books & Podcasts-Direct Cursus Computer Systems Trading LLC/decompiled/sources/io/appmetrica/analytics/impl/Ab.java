package io.appmetrica.analytics.impl;

import androidx.annotation.NonNull;
import io.appmetrica.analytics.coreutils.internal.StringUtils;

/* loaded from: classes5.dex */
public final class Ab extends C0832zb {
    public Ab(int i, int i2) {
        this(i, new Bb(i2));
    }

    public final int a(String str) {
        return StringUtils.getUTF8Bytes(str).length;
    }

    @Override // io.appmetrica.analytics.impl.C0832zb
    public final int b(Object obj) {
        return StringUtils.getUTF8Bytes((String) obj).length;
    }

    public Ab(int i, @NonNull Bb bb) {
        super(i, bb);
    }
}
