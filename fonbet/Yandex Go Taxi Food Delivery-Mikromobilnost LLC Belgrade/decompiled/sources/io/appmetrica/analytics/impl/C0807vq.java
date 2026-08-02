package io.appmetrica.analytics.impl;

import android.text.TextUtils;
import io.appmetrica.analytics.coreutils.internal.StringUtils;

/* renamed from: io.appmetrica.analytics.impl.vq, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C0807vq implements Wr {
    @Override // io.appmetrica.analytics.impl.Wr
    public final byte[] a(C0243ca c0243ca, Xj xj) {
        return !TextUtils.isEmpty(c0243ca.b) ? StringUtils.getUTF8Bytes(c0243ca.b) : new byte[0];
    }
}
