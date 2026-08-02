package com.google.android.gms.internal.ads;

import java.nio.ByteBuffer;
import java.util.Arrays;
import w.AbstractC5128c;

/* loaded from: classes2.dex */
public final class HK extends GK {

    /* renamed from: v, reason: collision with root package name */
    public final byte[] f26030v;

    public HK(byte[] bArr) {
        bArr.getClass();
        this.f26030v = bArr;
    }

    @Override // com.google.android.gms.internal.ads.JK
    public final byte e(int i) {
        return this.f26030v[i];
    }

    @Override // com.google.android.gms.internal.ads.JK
    public final int f() {
        return this.f26030v.length;
    }

    @Override // com.google.android.gms.internal.ads.JK
    public final JK g(int i, int i4) {
        byte[] bArr = this.f26030v;
        int c9 = JK.c(i, i4, bArr.length);
        return c9 == 0 ? JK.f26428u : new FK(bArr, i, c9);
    }

    @Override // com.google.android.gms.internal.ads.JK
    public final JK h(int i, int i4) {
        byte[] bArr = this.f26030v;
        int c9 = JK.c(i, i4, bArr.length);
        return c9 == 0 ? JK.f26428u : new FK(bArr, i, c9);
    }

    @Override // com.google.android.gms.internal.ads.JK
    public final void i(int i, int i4, int i6, byte[] bArr) {
        System.arraycopy(this.f26030v, i, bArr, i4, i6);
    }

    @Override // com.google.android.gms.internal.ads.JK
    public final ByteBuffer j() {
        return ByteBuffer.wrap(this.f26030v).asReadOnlyBuffer();
    }

    @Override // com.google.android.gms.internal.ads.JK
    public final void k(OK ok) {
        byte[] bArr = this.f26030v;
        ok.U(bArr, 0, bArr.length);
    }

    @Override // com.google.android.gms.internal.ads.JK
    public final boolean l(JK jk) {
        boolean z6 = jk instanceof HK;
        byte[] bArr = this.f26030v;
        return z6 ? Arrays.equals(bArr, ((HK) jk).f26030v) : jk instanceof FK ? v(jk, 0, bArr.length) : jk.l(this);
    }

    @Override // com.google.android.gms.internal.ads.JK
    public final int n(int i, int i4, int i6) {
        return AbstractC3103dL.b(i, i4, i6, this.f26030v);
    }

    @Override // com.google.android.gms.internal.ads.JK
    public final W7.b o() {
        byte[] bArr = this.f26030v;
        return W7.b.f(bArr, 0, bArr.length);
    }

    @Override // com.google.android.gms.internal.ads.GK
    public final boolean v(JK jk, int i, int i4) {
        int f2 = jk.f();
        byte[] bArr = this.f26030v;
        if (i4 > f2) {
            int length = String.valueOf(i4).length();
            int length2 = bArr.length;
            StringBuilder sb = new StringBuilder(length + 18 + String.valueOf(length2).length());
            sb.append("Length too large: ");
            sb.append(i4);
            sb.append(length2);
            throw new IllegalArgumentException(sb.toString());
        }
        int i6 = i + i4;
        if (i6 > jk.f()) {
            int f9 = jk.f();
            int length3 = String.valueOf(i).length();
            StringBuilder sb2 = new StringBuilder(length3 + 24 + String.valueOf(i4).length() + 2 + String.valueOf(f9).length());
            AbstractC5128c.g(sb2, "Ran off end of other: ", i, ", ", i4);
            throw new IllegalArgumentException(D.x.k(f9, ", ", sb2));
        }
        if (jk instanceof HK) {
            return JK.d(bArr, 0, ((HK) jk).f26030v, i, i4);
        }
        if (!(jk instanceof FK)) {
            return jk.h(i, i6).equals(h(0, i4));
        }
        FK fk = (FK) jk;
        return JK.d(bArr, 0, fk.f25543v, fk.f25544w + i, i4);
    }
}
