package com.google.android.gms.internal.ads;

import java.util.Objects;

/* renamed from: com.google.android.gms.internal.ads.h2, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C3276h2 extends AbstractC2900a2 {

    /* renamed from: b, reason: collision with root package name */
    public final String f30714b;

    /* renamed from: c, reason: collision with root package name */
    public final String f30715c;

    public C3276h2(String str, String str2, String str3) {
        super(str);
        this.f30714b = str2;
        this.f30715c = str3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && C3276h2.class == obj.getClass()) {
            C3276h2 c3276h2 = (C3276h2) obj;
            if (this.f29009a.equals(c3276h2.f29009a) && Objects.equals(this.f30714b, c3276h2.f30714b) && Objects.equals(this.f30715c, c3276h2.f30715c)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int hashCode = this.f29009a.hashCode() + 527;
        String str = this.f30714b;
        return this.f30715c.hashCode() + (((hashCode * 31) + (str != null ? str.hashCode() : 0)) * 31);
    }

    @Override // com.google.android.gms.internal.ads.AbstractC2900a2
    public final String toString() {
        String str = this.f29009a;
        int length = String.valueOf(str).length() + 6;
        String str2 = this.f30715c;
        return D.y.s(new StringBuilder(str2.length() + length), str, ": url=", str2);
    }
}
