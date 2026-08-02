package com.google.android.gms.internal.ads;

import java.util.Arrays;
import java.util.Objects;
import w.AbstractC5128c;

/* loaded from: classes2.dex */
public final class Z1 extends AbstractC2923a2 {

    /* renamed from: b, reason: collision with root package name */
    public final String f29598b;

    /* renamed from: c, reason: collision with root package name */
    public final String f29599c;

    /* renamed from: d, reason: collision with root package name */
    public final String f29600d;

    /* renamed from: e, reason: collision with root package name */
    public final byte[] f29601e;

    public Z1(String str, String str2, String str3, byte[] bArr) {
        super(com.anythink.basead.exoplayer.g.b.f.f8088a);
        this.f29598b = str;
        this.f29599c = str2;
        this.f29600d = str3;
        this.f29601e = bArr;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && Z1.class == obj.getClass()) {
            Z1 z12 = (Z1) obj;
            if (Objects.equals(this.f29598b, z12.f29598b) && Objects.equals(this.f29599c, z12.f29599c) && Objects.equals(this.f29600d, z12.f29600d) && Arrays.equals(this.f29601e, z12.f29601e)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        String str = this.f29598b;
        return Arrays.hashCode(this.f29601e) + ((this.f29600d.hashCode() + ((this.f29599c.hashCode() + (((str != null ? str.hashCode() : 0) + 527) * 31)) * 31)) * 31);
    }

    @Override // com.google.android.gms.internal.ads.AbstractC2923a2
    public final String toString() {
        String str = this.f29779a;
        int length = String.valueOf(str).length();
        String str2 = this.f29598b;
        int length2 = length + 11 + String.valueOf(str2).length() + 11;
        String str3 = this.f29599c;
        int j6 = AbstractC5128c.j(length2, 14, str3);
        String str4 = this.f29600d;
        StringBuilder sb = new StringBuilder(str4.length() + j6);
        AbstractC5128c.h(sb, str, ": mimeType=", str2, ", filename=");
        return D.x.p(sb, str3, ", description=", str4);
    }
}
