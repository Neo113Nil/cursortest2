package com.google.android.gms.internal.ads;

import java.nio.charset.StandardCharsets;
import java.util.Arrays;

/* loaded from: classes2.dex */
public final class Q1 implements InterfaceC4043v3 {

    /* renamed from: a, reason: collision with root package name */
    public final int f27099a;

    /* renamed from: b, reason: collision with root package name */
    public final String f27100b;

    /* renamed from: c, reason: collision with root package name */
    public final String f27101c;

    /* renamed from: d, reason: collision with root package name */
    public final int f27102d;

    /* renamed from: e, reason: collision with root package name */
    public final int f27103e;

    /* renamed from: f, reason: collision with root package name */
    public final int f27104f;

    /* renamed from: g, reason: collision with root package name */
    public final int f27105g;

    /* renamed from: h, reason: collision with root package name */
    public final byte[] f27106h;

    public Q1(int i, String str, String str2, int i4, int i9, int i10, int i11, byte[] bArr) {
        this.f27099a = i;
        this.f27100b = str;
        this.f27101c = str2;
        this.f27102d = i4;
        this.f27103e = i9;
        this.f27104f = i10;
        this.f27105g = i11;
        this.f27106h = bArr;
    }

    public static Q1 b(Lr lr) {
        int b9 = lr.b();
        String h9 = K4.h(lr.k(lr.b(), StandardCharsets.US_ASCII));
        String k6 = lr.k(lr.b(), StandardCharsets.UTF_8);
        int b10 = lr.b();
        int b11 = lr.b();
        int b12 = lr.b();
        int b13 = lr.b();
        int b14 = lr.b();
        byte[] bArr = new byte[b14];
        lr.H(bArr, 0, b14);
        return new Q1(b9, h9, k6, b10, b11, b12, b13, bArr);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC4043v3
    public final void a(P2 p22) {
        p22.a(this.f27099a, this.f27106h);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && Q1.class == obj.getClass()) {
            Q1 q12 = (Q1) obj;
            if (this.f27099a == q12.f27099a && this.f27100b.equals(q12.f27100b) && this.f27101c.equals(q12.f27101c) && this.f27102d == q12.f27102d && this.f27103e == q12.f27103e && this.f27104f == q12.f27104f && this.f27105g == q12.f27105g && Arrays.equals(this.f27106h, q12.f27106h)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(this.f27106h) + ((((((((((this.f27101c.hashCode() + ((this.f27100b.hashCode() + ((this.f27099a + 527) * 31)) * 31)) * 31) + this.f27102d) * 31) + this.f27103e) * 31) + this.f27104f) * 31) + this.f27105g) * 31);
    }

    public final String toString() {
        String str = this.f27100b;
        int length = String.valueOf(str).length() + 32;
        String str2 = this.f27101c;
        return com.anythink.basead.b.c.i.q(new StringBuilder(str2.length() + length), "Picture: mimeType=", str, ", description=", str2);
    }
}
