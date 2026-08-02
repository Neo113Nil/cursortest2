package io.appmetrica.analytics.impl;

import android.util.Base64;

/* renamed from: io.appmetrica.analytics.impl.bb, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C0215bb implements V9 {
    @Override // io.appmetrica.analytics.impl.V9
    public final byte[] a(byte[] bArr) {
        try {
            return Base64.decode(bArr, 0);
        } catch (Throwable unused) {
            return new byte[0];
        }
    }

    @Override // io.appmetrica.analytics.impl.V9
    public final N9 a(K6 k6) {
        throw new UnsupportedOperationException();
    }

    public final X9 a() {
        return X9.EXTERNALLY_ENCRYPTED_EVENT_CRYPTER;
    }
}
