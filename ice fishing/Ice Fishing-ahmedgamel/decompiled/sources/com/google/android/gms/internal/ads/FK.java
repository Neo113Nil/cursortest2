package com.google.android.gms.internal.ads;

import java.nio.ByteBuffer;
import w.AbstractC5128c;

/* loaded from: classes2.dex */
public final class FK extends GK {

    /* renamed from: v, reason: collision with root package name */
    public final byte[] f25543v;

    /* renamed from: w, reason: collision with root package name */
    public final int f25544w;

    /* renamed from: x, reason: collision with root package name */
    public final int f25545x;

    public FK(byte[] bArr, int i, int i4) {
        JK.c(i, i + i4, bArr.length);
        this.f25543v = bArr;
        this.f25544w = i;
        this.f25545x = i4;
    }

    @Override // com.google.android.gms.internal.ads.JK
    public final byte e(int i) {
        return this.f25543v[this.f25544w + i];
    }

    @Override // com.google.android.gms.internal.ads.JK
    public final int f() {
        return this.f25545x;
    }

    @Override // com.google.android.gms.internal.ads.JK
    public final JK g(int i, int i4) {
        int c9 = JK.c(i, i4, this.f25545x);
        if (c9 == 0) {
            return JK.f26428u;
        }
        return new FK(this.f25543v, this.f25544w + i, c9);
    }

    @Override // com.google.android.gms.internal.ads.JK
    public final JK h(int i, int i4) {
        int c9 = JK.c(i, i4, this.f25545x);
        if (c9 == 0) {
            return JK.f26428u;
        }
        return new FK(this.f25543v, this.f25544w + i, c9);
    }

    @Override // com.google.android.gms.internal.ads.JK
    public final void i(int i, int i4, int i6, byte[] bArr) {
        System.arraycopy(this.f25543v, this.f25544w + i, bArr, i4, i6);
    }

    @Override // com.google.android.gms.internal.ads.JK
    public final ByteBuffer j() {
        return ByteBuffer.wrap(this.f25543v, this.f25544w, this.f25545x).asReadOnlyBuffer();
    }

    @Override // com.google.android.gms.internal.ads.JK
    public final void k(OK ok) {
        ok.U(this.f25543v, this.f25544w, this.f25545x);
    }

    @Override // com.google.android.gms.internal.ads.JK
    public final boolean l(JK jk) {
        return ((jk instanceof HK) || (jk instanceof FK)) ? v(jk, 0, this.f25545x) : jk.l(this);
    }

    @Override // com.google.android.gms.internal.ads.JK
    public final int n(int i, int i4, int i6) {
        return AbstractC3103dL.b(i, this.f25544w + i4, i6, this.f25543v);
    }

    @Override // com.google.android.gms.internal.ads.JK
    public final W7.b o() {
        return W7.b.f(this.f25543v, this.f25544w, this.f25545x);
    }

    @Override // com.google.android.gms.internal.ads.GK
    public final boolean v(JK jk, int i, int i4) {
        if (i4 > jk.f()) {
            int length = String.valueOf(i4).length();
            int i6 = this.f25545x;
            StringBuilder sb = new StringBuilder(length + 18 + String.valueOf(i6).length());
            sb.append("Length too large: ");
            sb.append(i4);
            sb.append(i6);
            throw new IllegalArgumentException(sb.toString());
        }
        int i9 = i + i4;
        if (i9 > jk.f()) {
            int f2 = jk.f();
            int length2 = String.valueOf(i).length();
            StringBuilder sb2 = new StringBuilder(length2 + 24 + String.valueOf(i4).length() + 2 + String.valueOf(f2).length());
            AbstractC5128c.g(sb2, "Ran off end of other: ", i, ", ", i4);
            throw new IllegalArgumentException(D.x.k(f2, ", ", sb2));
        }
        boolean z6 = jk instanceof HK;
        byte[] bArr = this.f25543v;
        int i10 = this.f25544w;
        if (z6) {
            return JK.d(bArr, i10, ((HK) jk).f26030v, i, i4);
        }
        if (!(jk instanceof FK)) {
            return jk.h(i, i9).equals(h(i10, i4 + i10));
        }
        FK fk = (FK) jk;
        return JK.d(bArr, i10, fk.f25543v, fk.f25544w + i, i4);
    }
}
