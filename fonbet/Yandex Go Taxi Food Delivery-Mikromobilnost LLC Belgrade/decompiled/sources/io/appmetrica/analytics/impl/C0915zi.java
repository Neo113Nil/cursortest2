package io.appmetrica.analytics.impl;

import android.util.Base64;
import io.appmetrica.analytics.coreutils.internal.StringUtils;

/* renamed from: io.appmetrica.analytics.impl.zi, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C0915zi implements Wr, M9 {
    @Override // io.appmetrica.analytics.impl.Wr
    public final byte[] a(C0243ca c0243ca, Xj xj) {
        return StringUtils.isNullOrEmpty(c0243ca.b) ? new byte[0] : Base64.decode(c0243ca.b, 0);
    }

    @Override // io.appmetrica.analytics.impl.M9
    public final int a(X9 x9) {
        return 2;
    }
}
