package com.google.android.gms.internal.ads;

import java.util.Arrays;
import java.util.Objects;
import w.AbstractC5128c;

/* loaded from: classes2.dex */
public final class U1 extends AbstractC2923a2 {

    /* renamed from: b, reason: collision with root package name */
    public final String f28642b;

    /* renamed from: c, reason: collision with root package name */
    public final String f28643c;

    /* renamed from: d, reason: collision with root package name */
    public final int f28644d;

    /* renamed from: e, reason: collision with root package name */
    public final byte[] f28645e;

    public U1(String str, String str2, int i, byte[] bArr) {
        super(com.anythink.basead.exoplayer.g.b.a.f8065a);
        this.f28642b = str;
        this.f28643c = str2;
        this.f28644d = i;
        this.f28645e = bArr;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3945t3
    public final void a(M2 m22) {
        m22.a(this.f28644d, this.f28645e);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && U1.class == obj.getClass()) {
            U1 u12 = (U1) obj;
            if (this.f28644d == u12.f28644d && Objects.equals(this.f28642b, u12.f28642b) && Objects.equals(this.f28643c, u12.f28643c) && Arrays.equals(this.f28645e, u12.f28645e)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        String str = this.f28642b;
        int hashCode = str != null ? str.hashCode() : 0;
        String str2 = this.f28643c;
        return Arrays.hashCode(this.f28645e) + ((((((this.f28644d + 527) * 31) + hashCode) * 31) + (str2 != null ? str2.hashCode() : 0)) * 31);
    }

    @Override // com.google.android.gms.internal.ads.AbstractC2923a2
    public final String toString() {
        String str = this.f29779a;
        int length = String.valueOf(str).length();
        String str2 = this.f28642b;
        int length2 = String.valueOf(str2).length();
        String str3 = this.f28643c;
        StringBuilder sb = new StringBuilder(length + 11 + length2 + 14 + String.valueOf(str3).length());
        AbstractC5128c.h(sb, str, ": mimeType=", str2, ", description=");
        sb.append(str3);
        return sb.toString();
    }
}
