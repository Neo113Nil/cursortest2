package com.google.android.gms.internal.ads;

import java.io.EOFException;

/* loaded from: classes2.dex */
public final class O0 implements InterfaceC3566m1 {

    /* renamed from: a, reason: collision with root package name */
    public final byte[] f27358a = new byte[4096];

    @Override // com.google.android.gms.internal.ads.InterfaceC3566m1
    public final int b(InterfaceC4073vN interfaceC4073vN, int i, boolean z6) {
        int r9 = interfaceC4073vN.r(this.f27358a, 0, Math.min(4096, i));
        if (r9 != -1) {
            return r9;
        }
        if (z6) {
            return -1;
        }
        throw new EOFException();
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3566m1
    public final void c(long j6, int i, int i4, int i6, C3512l1 c3512l1) {
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3566m1
    public final void e(DP dp) {
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3566m1
    public final void f(Cr cr, int i, int i4) {
        cr.G(i);
    }
}
