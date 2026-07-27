package com.google.android.gms.internal.ads;

import java.nio.charset.StandardCharsets;
import java.util.Arrays;

/* loaded from: classes2.dex */
public final class S1 implements InterfaceC3922t3 {

    /* renamed from: a, reason: collision with root package name */
    public final int f27392a;

    /* renamed from: b, reason: collision with root package name */
    public final String f27393b;

    /* renamed from: c, reason: collision with root package name */
    public final String f27394c;

    /* renamed from: d, reason: collision with root package name */
    public final int f27395d;

    /* renamed from: e, reason: collision with root package name */
    public final int f27396e;

    /* renamed from: f, reason: collision with root package name */
    public final int f27397f;

    /* renamed from: g, reason: collision with root package name */
    public final int f27398g;

    /* renamed from: h, reason: collision with root package name */
    public final byte[] f27399h;

    public S1(int i, String str, String str2, int i6, int i9, int i10, int i11, byte[] bArr) {
        this.f27392a = i;
        this.f27393b = str;
        this.f27394c = str2;
        this.f27395d = i6;
        this.f27396e = i9;
        this.f27397f = i10;
        this.f27398g = i11;
        this.f27399h = bArr;
    }

    public static S1 b(Cr cr) {
        int b9 = cr.b();
        String h9 = H4.h(cr.k(cr.b(), StandardCharsets.US_ASCII));
        String k9 = cr.k(cr.b(), StandardCharsets.UTF_8);
        int b10 = cr.b();
        int b11 = cr.b();
        int b12 = cr.b();
        int b13 = cr.b();
        int b14 = cr.b();
        byte[] bArr = new byte[b14];
        cr.H(bArr, 0, b14);
        return new S1(b9, h9, k9, b10, b11, b12, b13, bArr);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3922t3
    public final void a(M2 m22) {
        m22.a(this.f27392a, this.f27399h);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && S1.class == obj.getClass()) {
            S1 s12 = (S1) obj;
            if (this.f27392a == s12.f27392a && this.f27393b.equals(s12.f27393b) && this.f27394c.equals(s12.f27394c) && this.f27395d == s12.f27395d && this.f27396e == s12.f27396e && this.f27397f == s12.f27397f && this.f27398g == s12.f27398g && Arrays.equals(this.f27399h, s12.f27399h)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(this.f27399h) + ((((((((((this.f27394c.hashCode() + ((this.f27393b.hashCode() + ((this.f27392a + 527) * 31)) * 31)) * 31) + this.f27395d) * 31) + this.f27396e) * 31) + this.f27397f) * 31) + this.f27398g) * 31);
    }

    public final String toString() {
        String str = this.f27393b;
        int length = String.valueOf(str).length() + 32;
        String str2 = this.f27394c;
        return com.anythink.basead.exoplayer.f.f.o(new StringBuilder(str2.length() + length), "Picture: mimeType=", str, ", description=", str2);
    }
}
