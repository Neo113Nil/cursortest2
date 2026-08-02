package io.appmetrica.analytics.impl;

import android.util.Base64;
import androidx.annotation.NonNull;

/* loaded from: classes5.dex */
public final class R3 implements Dr {
    public final P9 a;

    public R3() {
        this(new P9());
    }

    @Override // io.appmetrica.analytics.impl.Dr
    @NonNull
    public final byte[] a(@NonNull V9 v9, @NonNull Nj nj) {
        byte[] bArr = new byte[0];
        String str = v9.b;
        if (str != null) {
            try {
                bArr = Base64.decode(str, 0);
            } catch (Throwable unused) {
            }
        }
        P9 p9 = this.a;
        return ((O9) p9.a.a(v9.o)).a(bArr);
    }

    public R3(P9 p9) {
        this.a = p9;
    }
}
