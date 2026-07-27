package com.google.android.gms.internal.ads;

import java.nio.ByteBuffer;
import t0.AbstractC5051n;

/* loaded from: classes2.dex */
public final class OK extends PK {

    /* renamed from: v, reason: collision with root package name */
    public final byte[] f26684v;

    /* renamed from: w, reason: collision with root package name */
    public final int f26685w;

    /* renamed from: x, reason: collision with root package name */
    public final int f26686x;

    public OK(byte[] bArr, int i, int i4) {
        SK.c(i, i + i4, bArr.length);
        this.f26684v = bArr;
        this.f26685w = i;
        this.f26686x = i4;
    }

    @Override // com.google.android.gms.internal.ads.SK
    public final byte e(int i) {
        return this.f26684v[this.f26685w + i];
    }

    @Override // com.google.android.gms.internal.ads.SK
    public final int f() {
        return this.f26686x;
    }

    @Override // com.google.android.gms.internal.ads.SK
    public final SK g(int i, int i4) {
        int c4 = SK.c(i, i4, this.f26686x);
        if (c4 == 0) {
            return SK.f27529u;
        }
        return new OK(this.f26684v, this.f26685w + i, c4);
    }

    @Override // com.google.android.gms.internal.ads.SK
    public final SK h(int i, int i4) {
        int c4 = SK.c(i, i4, this.f26686x);
        if (c4 == 0) {
            return SK.f27529u;
        }
        return new OK(this.f26684v, this.f26685w + i, c4);
    }

    @Override // com.google.android.gms.internal.ads.SK
    public final void i(int i, int i4, int i9, byte[] bArr) {
        System.arraycopy(this.f26684v, this.f26685w + i, bArr, i4, i9);
    }

    @Override // com.google.android.gms.internal.ads.SK
    public final ByteBuffer j() {
        return ByteBuffer.wrap(this.f26684v, this.f26685w, this.f26686x).asReadOnlyBuffer();
    }

    @Override // com.google.android.gms.internal.ads.SK
    public final void k(XK xk) {
        xk.a(this.f26684v, this.f26685w, this.f26686x);
    }

    @Override // com.google.android.gms.internal.ads.SK
    public final boolean l(SK sk) {
        return ((sk instanceof QK) || (sk instanceof OK)) ? v(sk, 0, this.f26686x) : sk.l(this);
    }

    @Override // com.google.android.gms.internal.ads.SK
    public final int n(int i, int i4, int i9) {
        return AbstractC3684oL.b(i, this.f26685w + i4, i9, this.f26684v);
    }

    @Override // com.google.android.gms.internal.ads.SK
    public final S7.b o() {
        return S7.b.f(this.f26684v, this.f26685w, this.f26686x);
    }

    @Override // com.google.android.gms.internal.ads.PK
    public final boolean v(SK sk, int i, int i4) {
        if (i4 > sk.f()) {
            int length = String.valueOf(i4).length();
            int i9 = this.f26686x;
            StringBuilder sb = new StringBuilder(length + 18 + String.valueOf(i9).length());
            sb.append("Length too large: ");
            sb.append(i4);
            sb.append(i9);
            throw new IllegalArgumentException(sb.toString());
        }
        int i10 = i + i4;
        if (i10 > sk.f()) {
            int f6 = sk.f();
            int length2 = String.valueOf(i).length();
            StringBuilder sb2 = new StringBuilder(length2 + 24 + String.valueOf(i4).length() + 2 + String.valueOf(f6).length());
            AbstractC5051n.i(sb2, "Ran off end of other: ", i, ", ", i4);
            throw new IllegalArgumentException(D.y.j(f6, ", ", sb2));
        }
        boolean z8 = sk instanceof QK;
        byte[] bArr = this.f26684v;
        int i11 = this.f26685w;
        if (z8) {
            return SK.d(bArr, i11, ((QK) sk).f27141v, i, i4);
        }
        if (!(sk instanceof OK)) {
            return sk.h(i, i10).equals(h(i11, i4 + i11));
        }
        OK ok = (OK) sk;
        return SK.d(bArr, i11, ok.f26684v, ok.f26685w + i, i4);
    }
}
