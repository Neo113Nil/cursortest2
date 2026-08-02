package com.google.android.gms.internal.ads;

import java.util.Objects;

/* renamed from: com.google.android.gms.internal.ads.h2, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C3299h2 extends AbstractC2923a2 {

    /* renamed from: b, reason: collision with root package name */
    public final String f31480b;

    /* renamed from: c, reason: collision with root package name */
    public final String f31481c;

    public C3299h2(String str, String str2, String str3) {
        super(str);
        this.f31480b = str2;
        this.f31481c = str3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && C3299h2.class == obj.getClass()) {
            C3299h2 c3299h2 = (C3299h2) obj;
            if (this.f29779a.equals(c3299h2.f29779a) && Objects.equals(this.f31480b, c3299h2.f31480b) && Objects.equals(this.f31481c, c3299h2.f31481c)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int hashCode = this.f29779a.hashCode() + 527;
        String str = this.f31480b;
        return this.f31481c.hashCode() + (((hashCode * 31) + (str != null ? str.hashCode() : 0)) * 31);
    }

    @Override // com.google.android.gms.internal.ads.AbstractC2923a2
    public final String toString() {
        String str = this.f29779a;
        int length = String.valueOf(str).length() + 6;
        String str2 = this.f31481c;
        return D.x.p(new StringBuilder(str2.length() + length), str, ": url=", str2);
    }
}
