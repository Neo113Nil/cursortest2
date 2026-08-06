package io.appmetrica.analytics.impl;

import android.util.Base64;

/* renamed from: io.appmetrica.analytics.impl.c3, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0319c3 implements InterfaceC0779to {

    /* renamed from: a, reason: collision with root package name */
    public final H8 f5704a;

    public C0319c3() {
        this(new H8());
    }

    @Override // io.appmetrica.analytics.impl.InterfaceC0779to
    public final byte[] a(N8 n8, C0539kh c0539kh) {
        byte[] bArr = new byte[0];
        String str = n8.f4803b;
        if (str != null) {
            try {
                bArr = Base64.decode(str, 0);
            } catch (Throwable unused) {
            }
        }
        H8 h8 = this.f5704a;
        return ((G8) h8.f4464a.a(n8.f4816o)).a(bArr);
    }

    public C0319c3(H8 h8) {
        this.f5704a = h8;
    }
}
