package com.google.android.gms.internal.ads;

import java.util.Arrays;
import java.util.Objects;

/* loaded from: classes2.dex */
public final class Z1 extends AbstractC2900a2 {

    /* renamed from: b, reason: collision with root package name */
    public final String f28818b;

    /* renamed from: c, reason: collision with root package name */
    public final String f28819c;

    /* renamed from: d, reason: collision with root package name */
    public final String f28820d;

    /* renamed from: e, reason: collision with root package name */
    public final byte[] f28821e;

    public Z1(String str, String str2, String str3, byte[] bArr) {
        super(com.anythink.basead.exoplayer.g.b.f.f7302a);
        this.f28818b = str;
        this.f28819c = str2;
        this.f28820d = str3;
        this.f28821e = bArr;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && Z1.class == obj.getClass()) {
            Z1 z12 = (Z1) obj;
            if (Objects.equals(this.f28818b, z12.f28818b) && Objects.equals(this.f28819c, z12.f28819c) && Objects.equals(this.f28820d, z12.f28820d) && Arrays.equals(this.f28821e, z12.f28821e)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        String str = this.f28818b;
        return Arrays.hashCode(this.f28821e) + ((this.f28820d.hashCode() + ((this.f28819c.hashCode() + (((str != null ? str.hashCode() : 0) + 527) * 31)) * 31)) * 31);
    }

    @Override // com.google.android.gms.internal.ads.AbstractC2900a2
    public final String toString() {
        String str = this.f29009a;
        int length = String.valueOf(str).length();
        String str2 = this.f28818b;
        int length2 = length + 11 + String.valueOf(str2).length() + 11;
        String str3 = this.f28819c;
        int a9 = u1.h.a(length2, 14, str3);
        String str4 = this.f28820d;
        StringBuilder sb = new StringBuilder(str4.length() + a9);
        u1.h.i(sb, str, ": mimeType=", str2, ", filename=");
        return D.y.s(sb, str3, ", description=", str4);
    }
}
