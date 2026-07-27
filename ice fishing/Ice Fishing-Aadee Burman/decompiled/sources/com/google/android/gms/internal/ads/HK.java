package com.google.android.gms.internal.ads;

import java.nio.ByteBuffer;
import java.util.Arrays;

/* loaded from: classes2.dex */
public final class HK extends GK {

    /* renamed from: v, reason: collision with root package name */
    public final byte[] f25258v;

    public HK(byte[] bArr) {
        bArr.getClass();
        this.f25258v = bArr;
    }

    @Override // com.google.android.gms.internal.ads.JK
    public final byte e(int i) {
        return this.f25258v[i];
    }

    @Override // com.google.android.gms.internal.ads.JK
    public final int f() {
        return this.f25258v.length;
    }

    @Override // com.google.android.gms.internal.ads.JK
    public final JK g(int i, int i6) {
        byte[] bArr = this.f25258v;
        int c9 = JK.c(i, i6, bArr.length);
        return c9 == 0 ? JK.f25675u : new FK(bArr, i, c9);
    }

    @Override // com.google.android.gms.internal.ads.JK
    public final JK h(int i, int i6) {
        byte[] bArr = this.f25258v;
        int c9 = JK.c(i, i6, bArr.length);
        return c9 == 0 ? JK.f25675u : new FK(bArr, i, c9);
    }

    @Override // com.google.android.gms.internal.ads.JK
    public final void i(int i, int i6, int i9, byte[] bArr) {
        System.arraycopy(this.f25258v, i, bArr, i6, i9);
    }

    @Override // com.google.android.gms.internal.ads.JK
    public final ByteBuffer j() {
        return ByteBuffer.wrap(this.f25258v).asReadOnlyBuffer();
    }

    @Override // com.google.android.gms.internal.ads.JK
    public final void k(OK ok) {
        byte[] bArr = this.f25258v;
        ok.U(bArr, 0, bArr.length);
    }

    @Override // com.google.android.gms.internal.ads.JK
    public final boolean l(JK jk) {
        boolean z3 = jk instanceof HK;
        byte[] bArr = this.f25258v;
        return z3 ? Arrays.equals(bArr, ((HK) jk).f25258v) : jk instanceof FK ? v(jk, 0, bArr.length) : jk.l(this);
    }

    @Override // com.google.android.gms.internal.ads.JK
    public final int n(int i, int i6, int i9) {
        return AbstractC3080dL.b(i, i6, i9, this.f25258v);
    }

    @Override // com.google.android.gms.internal.ads.JK
    public final W7.b o() {
        byte[] bArr = this.f25258v;
        return W7.b.f(bArr, 0, bArr.length);
    }

    @Override // com.google.android.gms.internal.ads.GK
    public final boolean v(JK jk, int i, int i6) {
        int f3 = jk.f();
        byte[] bArr = this.f25258v;
        if (i6 > f3) {
            int length = String.valueOf(i6).length();
            int length2 = bArr.length;
            StringBuilder sb = new StringBuilder(length + 18 + String.valueOf(length2).length());
            sb.append("Length too large: ");
            sb.append(i6);
            sb.append(length2);
            throw new IllegalArgumentException(sb.toString());
        }
        int i9 = i + i6;
        if (i9 > jk.f()) {
            int f9 = jk.f();
            int length3 = String.valueOf(i).length();
            StringBuilder sb2 = new StringBuilder(length3 + 24 + String.valueOf(i6).length() + 2 + String.valueOf(f9).length());
            u1.h.h(sb2, "Ran off end of other: ", i, ", ", i6);
            throw new IllegalArgumentException(D.y.m(f9, ", ", sb2));
        }
        if (jk instanceof HK) {
            return JK.d(bArr, 0, ((HK) jk).f25258v, i, i6);
        }
        if (!(jk instanceof FK)) {
            return jk.h(i, i9).equals(h(0, i6));
        }
        FK fk = (FK) jk;
        return JK.d(bArr, 0, fk.f24787v, fk.f24788w + i, i6);
    }
}
