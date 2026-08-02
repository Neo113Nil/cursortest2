package io.appmetrica.analytics.impl;

import androidx.annotation.NonNull;
import io.appmetrica.analytics.coreutils.internal.io.Base64Utils;

/* loaded from: classes5.dex */
public final class Uq implements Dr {
    public final P9 a;

    public Uq() {
        this(new P9());
    }

    @Override // io.appmetrica.analytics.impl.Dr
    @NonNull
    public final byte[] a(@NonNull V9 v9, @NonNull Nj nj) {
        byte[] bArr = new byte[0];
        try {
            bArr = Base64Utils.decompressBase64GzipAsBytes(v9.b);
        } catch (Throwable unused) {
        }
        byte[] a = ((O9) this.a.a.a(v9.o)).a(bArr);
        return a == null ? new byte[0] : a;
    }

    public Uq(P9 p9) {
        this.a = p9;
    }

    @NonNull
    public final P9 a() {
        return this.a;
    }
}
