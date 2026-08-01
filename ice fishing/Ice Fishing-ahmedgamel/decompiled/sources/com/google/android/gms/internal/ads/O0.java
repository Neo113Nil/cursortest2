package com.google.android.gms.internal.ads;

import java.io.EOFException;

/* loaded from: classes2.dex */
public final class O0 implements InterfaceC3543m1 {

    /* renamed from: a, reason: collision with root package name */
    public final byte[] f26576a = new byte[4096];

    @Override // com.google.android.gms.internal.ads.InterfaceC3543m1
    public final int b(InterfaceC4050vN interfaceC4050vN, int i, boolean z3) {
        int m4 = interfaceC4050vN.m(this.f26576a, 0, Math.min(4096, i));
        if (m4 != -1) {
            return m4;
        }
        if (z3) {
            return -1;
        }
        throw new EOFException();
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3543m1
    public final void c(long j6, int i, int i6, int i9, C3489l1 c3489l1) {
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3543m1
    public final void e(DP dp) {
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3543m1
    public final void f(Cr cr, int i, int i6) {
        cr.G(i);
    }
}
