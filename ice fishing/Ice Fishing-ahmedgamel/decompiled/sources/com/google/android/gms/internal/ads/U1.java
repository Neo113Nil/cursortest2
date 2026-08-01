package com.google.android.gms.internal.ads;

import java.util.Arrays;
import java.util.Objects;

/* loaded from: classes2.dex */
public final class U1 extends AbstractC2900a2 {

    /* renamed from: b, reason: collision with root package name */
    public final String f27845b;

    /* renamed from: c, reason: collision with root package name */
    public final String f27846c;

    /* renamed from: d, reason: collision with root package name */
    public final int f27847d;

    /* renamed from: e, reason: collision with root package name */
    public final byte[] f27848e;

    public U1(String str, String str2, int i, byte[] bArr) {
        super(com.anythink.basead.exoplayer.g.b.a.f7279a);
        this.f27845b = str;
        this.f27846c = str2;
        this.f27847d = i;
        this.f27848e = bArr;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3922t3
    public final void a(M2 m22) {
        m22.a(this.f27847d, this.f27848e);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && U1.class == obj.getClass()) {
            U1 u12 = (U1) obj;
            if (this.f27847d == u12.f27847d && Objects.equals(this.f27845b, u12.f27845b) && Objects.equals(this.f27846c, u12.f27846c) && Arrays.equals(this.f27848e, u12.f27848e)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        String str = this.f27845b;
        int hashCode = str != null ? str.hashCode() : 0;
        String str2 = this.f27846c;
        return Arrays.hashCode(this.f27848e) + ((((((this.f27847d + 527) * 31) + hashCode) * 31) + (str2 != null ? str2.hashCode() : 0)) * 31);
    }

    @Override // com.google.android.gms.internal.ads.AbstractC2900a2
    public final String toString() {
        String str = this.f29009a;
        int length = String.valueOf(str).length();
        String str2 = this.f27845b;
        int length2 = String.valueOf(str2).length();
        String str3 = this.f27846c;
        StringBuilder sb = new StringBuilder(length + 11 + length2 + 14 + String.valueOf(str3).length());
        u1.h.i(sb, str, ": mimeType=", str2, ", description=");
        sb.append(str3);
        return sb.toString();
    }
}
