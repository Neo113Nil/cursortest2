package io.appmetrica.analytics.impl;

import android.util.Base64;

/* loaded from: classes9.dex */
public final class U3 implements Wr {
    public final W9 a;

    public U3() {
        this(new W9());
    }

    @Override // io.appmetrica.analytics.impl.Wr
    public final byte[] a(C0243ca c0243ca, Xj xj) {
        byte[] bArr = new byte[0];
        String str = c0243ca.b;
        if (str != null) {
            try {
                bArr = Base64.decode(str, 0);
            } catch (Throwable unused) {
            }
        }
        W9 w9 = this.a;
        return ((V9) w9.a.a(c0243ca.o)).a(bArr);
    }

    public U3(W9 w9) {
        this.a = w9;
    }
}
