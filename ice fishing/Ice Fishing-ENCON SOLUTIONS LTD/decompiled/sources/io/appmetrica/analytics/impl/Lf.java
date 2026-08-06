package io.appmetrica.analytics.impl;

import android.text.TextUtils;
import android.util.Base64;

/* loaded from: classes.dex */
public final class Lf implements InterfaceC0779to, InterfaceC0893y8 {
    @Override // io.appmetrica.analytics.impl.InterfaceC0893y8
    public final int a(I8 i8) {
        return 2;
    }

    @Override // io.appmetrica.analytics.impl.InterfaceC0779to
    public final byte[] a(N8 n8, C0539kh c0539kh) {
        return TextUtils.isEmpty(n8.f4803b) ? new byte[0] : Base64.decode(n8.f4803b, 0);
    }
}
