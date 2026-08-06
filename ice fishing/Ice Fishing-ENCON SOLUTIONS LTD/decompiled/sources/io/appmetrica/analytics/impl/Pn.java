package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.coreutils.internal.io.Base64Utils;

/* loaded from: classes.dex */
public final class Pn implements InterfaceC0779to {

    /* renamed from: a, reason: collision with root package name */
    public final H8 f4943a;

    public Pn() {
        this(new H8());
    }

    @Override // io.appmetrica.analytics.impl.InterfaceC0779to
    public final byte[] a(N8 n8, C0539kh c0539kh) {
        byte[] bArr = new byte[0];
        try {
            bArr = Base64Utils.decompressBase64GzipAsBytes(n8.f4803b);
        } catch (Throwable unused) {
        }
        byte[] a2 = ((G8) this.f4943a.f4464a.a(n8.f4816o)).a(bArr);
        return a2 == null ? new byte[0] : a2;
    }

    public Pn(H8 h8) {
        this.f4943a = h8;
    }

    public final H8 a() {
        return this.f4943a;
    }
}
