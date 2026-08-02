package com.google.android.gms.internal.ads;

import java.nio.charset.StandardCharsets;
import java.util.Arrays;

/* loaded from: classes2.dex */
public final class S1 implements InterfaceC3945t3 {

    /* renamed from: a, reason: collision with root package name */
    public final int f28106a;

    /* renamed from: b, reason: collision with root package name */
    public final String f28107b;

    /* renamed from: c, reason: collision with root package name */
    public final String f28108c;

    /* renamed from: d, reason: collision with root package name */
    public final int f28109d;

    /* renamed from: e, reason: collision with root package name */
    public final int f28110e;

    /* renamed from: f, reason: collision with root package name */
    public final int f28111f;

    /* renamed from: g, reason: collision with root package name */
    public final int f28112g;

    /* renamed from: h, reason: collision with root package name */
    public final byte[] f28113h;

    public S1(int i, String str, String str2, int i4, int i6, int i9, int i10, byte[] bArr) {
        this.f28106a = i;
        this.f28107b = str;
        this.f28108c = str2;
        this.f28109d = i4;
        this.f28110e = i6;
        this.f28111f = i9;
        this.f28112g = i10;
        this.f28113h = bArr;
    }

    public static S1 b(Cr cr) {
        int b9 = cr.b();
        String h3 = H4.h(cr.k(cr.b(), StandardCharsets.US_ASCII));
        String k9 = cr.k(cr.b(), StandardCharsets.UTF_8);
        int b10 = cr.b();
        int b11 = cr.b();
        int b12 = cr.b();
        int b13 = cr.b();
        int b14 = cr.b();
        byte[] bArr = new byte[b14];
        cr.H(bArr, 0, b14);
        return new S1(b9, h3, k9, b10, b11, b12, b13, bArr);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3945t3
    public final void a(M2 m22) {
        m22.a(this.f28106a, this.f28113h);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && S1.class == obj.getClass()) {
            S1 s12 = (S1) obj;
            if (this.f28106a == s12.f28106a && this.f28107b.equals(s12.f28107b) && this.f28108c.equals(s12.f28108c) && this.f28109d == s12.f28109d && this.f28110e == s12.f28110e && this.f28111f == s12.f28111f && this.f28112g == s12.f28112g && Arrays.equals(this.f28113h, s12.f28113h)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(this.f28113h) + ((((((((((this.f28108c.hashCode() + ((this.f28107b.hashCode() + ((this.f28106a + 527) * 31)) * 31)) * 31) + this.f28109d) * 31) + this.f28110e) * 31) + this.f28111f) * 31) + this.f28112g) * 31);
    }

    public final String toString() {
        String str = this.f28107b;
        int length = String.valueOf(str).length() + 32;
        String str2 = this.f28108c;
        return com.IceFishing.LiveIceFishing.k.r(new StringBuilder(str2.length() + length), "Picture: mimeType=", str, ", description=", str2);
    }
}
