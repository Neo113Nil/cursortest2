package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.coreutils.internal.io.Base64Utils;

/* renamed from: io.appmetrica.analytics.impl.nr, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C0577nr implements Wr {
    public final W9 a;

    public C0577nr() {
        this(new W9());
    }

    @Override // io.appmetrica.analytics.impl.Wr
    public final byte[] a(C0243ca c0243ca, Xj xj) {
        byte[] bArr = new byte[0];
        try {
            bArr = Base64Utils.decompressBase64GzipAsBytes(c0243ca.b);
        } catch (Throwable unused) {
        }
        byte[] a = ((V9) this.a.a.a(c0243ca.o)).a(bArr);
        return a == null ? new byte[0] : a;
    }

    public C0577nr(W9 w9) {
        this.a = w9;
    }

    public final W9 a() {
        return this.a;
    }
}
