package io.appmetrica.analytics.impl;

import android.text.TextUtils;
import io.appmetrica.analytics.coreutils.internal.StringUtils;

/* loaded from: classes.dex */
public final class Zm implements InterfaceC0779to {
    @Override // io.appmetrica.analytics.impl.InterfaceC0779to
    public final byte[] a(N8 n8, C0539kh c0539kh) {
        return !TextUtils.isEmpty(n8.f4803b) ? StringUtils.getUTF8Bytes(n8.f4803b) : new byte[0];
    }
}
