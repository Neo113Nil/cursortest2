package com.google.android.gms.internal.ads;

import java.util.Arrays;
import java.util.Objects;
import t0.AbstractC5051n;

/* loaded from: classes2.dex */
public final class S1 extends Y1 {

    /* renamed from: b, reason: collision with root package name */
    public final String f27468b;

    /* renamed from: c, reason: collision with root package name */
    public final String f27469c;

    /* renamed from: d, reason: collision with root package name */
    public final int f27470d;

    /* renamed from: e, reason: collision with root package name */
    public final byte[] f27471e;

    public S1(String str, String str2, int i, byte[] bArr) {
        super(com.anythink.basead.exoplayer.g.b.a.f7436a);
        this.f27468b = str;
        this.f27469c = str2;
        this.f27470d = i;
        this.f27471e = bArr;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC4043v3
    public final void a(P2 p22) {
        p22.a(this.f27470d, this.f27471e);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && S1.class == obj.getClass()) {
            S1 s12 = (S1) obj;
            if (this.f27470d == s12.f27470d && Objects.equals(this.f27468b, s12.f27468b) && Objects.equals(this.f27469c, s12.f27469c) && Arrays.equals(this.f27471e, s12.f27471e)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        String str = this.f27468b;
        int hashCode = str != null ? str.hashCode() : 0;
        String str2 = this.f27469c;
        return Arrays.hashCode(this.f27471e) + ((((((this.f27470d + 527) * 31) + hashCode) * 31) + (str2 != null ? str2.hashCode() : 0)) * 31);
    }

    @Override // com.google.android.gms.internal.ads.Y1
    public final String toString() {
        String str = this.f28771a;
        int length = String.valueOf(str).length();
        String str2 = this.f27468b;
        int length2 = String.valueOf(str2).length();
        String str3 = this.f27469c;
        StringBuilder sb = new StringBuilder(length + 11 + length2 + 14 + String.valueOf(str3).length());
        AbstractC5051n.j(sb, str, ": mimeType=", str2, ", description=");
        sb.append(str3);
        return sb.toString();
    }
}
