package com.google.android.gms.internal.ads;

import java.nio.ByteBuffer;

/* loaded from: classes2.dex */
public final class FK extends GK {

    /* renamed from: v, reason: collision with root package name */
    public final byte[] f24787v;

    /* renamed from: w, reason: collision with root package name */
    public final int f24788w;

    /* renamed from: x, reason: collision with root package name */
    public final int f24789x;

    public FK(byte[] bArr, int i, int i6) {
        JK.c(i, i + i6, bArr.length);
        this.f24787v = bArr;
        this.f24788w = i;
        this.f24789x = i6;
    }

    @Override // com.google.android.gms.internal.ads.JK
    public final byte e(int i) {
        return this.f24787v[this.f24788w + i];
    }

    @Override // com.google.android.gms.internal.ads.JK
    public final int f() {
        return this.f24789x;
    }

    @Override // com.google.android.gms.internal.ads.JK
    public final JK g(int i, int i6) {
        int c9 = JK.c(i, i6, this.f24789x);
        if (c9 == 0) {
            return JK.f25675u;
        }
        return new FK(this.f24787v, this.f24788w + i, c9);
    }

    @Override // com.google.android.gms.internal.ads.JK
    public final JK h(int i, int i6) {
        int c9 = JK.c(i, i6, this.f24789x);
        if (c9 == 0) {
            return JK.f25675u;
        }
        return new FK(this.f24787v, this.f24788w + i, c9);
    }

    @Override // com.google.android.gms.internal.ads.JK
    public final void i(int i, int i6, int i9, byte[] bArr) {
        System.arraycopy(this.f24787v, this.f24788w + i, bArr, i6, i9);
    }

    @Override // com.google.android.gms.internal.ads.JK
    public final ByteBuffer j() {
        return ByteBuffer.wrap(this.f24787v, this.f24788w, this.f24789x).asReadOnlyBuffer();
    }

    @Override // com.google.android.gms.internal.ads.JK
    public final void k(OK ok) {
        ok.U(this.f24787v, this.f24788w, this.f24789x);
    }

    @Override // com.google.android.gms.internal.ads.JK
    public final boolean l(JK jk) {
        return ((jk instanceof HK) || (jk instanceof FK)) ? v(jk, 0, this.f24789x) : jk.l(this);
    }

    @Override // com.google.android.gms.internal.ads.JK
    public final int n(int i, int i6, int i9) {
        return AbstractC3080dL.b(i, this.f24788w + i6, i9, this.f24787v);
    }

    @Override // com.google.android.gms.internal.ads.JK
    public final W7.b o() {
        return W7.b.f(this.f24787v, this.f24788w, this.f24789x);
    }

    @Override // com.google.android.gms.internal.ads.GK
    public final boolean v(JK jk, int i, int i6) {
        if (i6 > jk.f()) {
            int length = String.valueOf(i6).length();
            int i9 = this.f24789x;
            StringBuilder sb = new StringBuilder(length + 18 + String.valueOf(i9).length());
            sb.append("Length too large: ");
            sb.append(i6);
            sb.append(i9);
            throw new IllegalArgumentException(sb.toString());
        }
        int i10 = i + i6;
        if (i10 > jk.f()) {
            int f3 = jk.f();
            int length2 = String.valueOf(i).length();
            StringBuilder sb2 = new StringBuilder(length2 + 24 + String.valueOf(i6).length() + 2 + String.valueOf(f3).length());
            u1.h.h(sb2, "Ran off end of other: ", i, ", ", i6);
            throw new IllegalArgumentException(D.y.m(f3, ", ", sb2));
        }
        boolean z3 = jk instanceof HK;
        byte[] bArr = this.f24787v;
        int i11 = this.f24788w;
        if (z3) {
            return JK.d(bArr, i11, ((HK) jk).f25258v, i, i6);
        }
        if (!(jk instanceof FK)) {
            return jk.h(i, i10).equals(h(i11, i6 + i11));
        }
        FK fk = (FK) jk;
        return JK.d(bArr, i11, fk.f24787v, fk.f24788w + i, i6);
    }
}
