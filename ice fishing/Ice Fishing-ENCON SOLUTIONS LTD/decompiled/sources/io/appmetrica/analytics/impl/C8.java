package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.coreutils.internal.StringUtils;

/* loaded from: classes.dex */
public final class C8 implements InterfaceC0779to {

    /* renamed from: a, reason: collision with root package name */
    public final H8 f4256a;

    public C8() {
        this(new H8());
    }

    @Override // io.appmetrica.analytics.impl.InterfaceC0779to
    public final byte[] a(N8 n8, C0539kh c0539kh) {
        String str = n8.f4803b;
        return ((G8) this.f4256a.f4464a.a(n8.f4816o)).a(str != null ? StringUtils.getUTF8Bytes(str) : new byte[0]);
    }

    public C8(H8 h8) {
        this.f4256a = h8;
    }
}
