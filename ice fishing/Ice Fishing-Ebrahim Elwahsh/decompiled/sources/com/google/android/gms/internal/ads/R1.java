package com.google.android.gms.internal.ads;

import java.util.Objects;
import t0.AbstractC5051n;

/* loaded from: classes2.dex */
public final class R1 implements InterfaceC4043v3 {

    /* renamed from: a, reason: collision with root package name */
    public final int f27294a;

    /* renamed from: b, reason: collision with root package name */
    public final String f27295b;

    /* renamed from: c, reason: collision with root package name */
    public final String f27296c;

    /* renamed from: d, reason: collision with root package name */
    public final String f27297d;

    /* renamed from: e, reason: collision with root package name */
    public final boolean f27298e;

    /* renamed from: f, reason: collision with root package name */
    public final int f27299f;

    public R1(int i, int i4, String str, String str2, String str3, boolean z8) {
        boolean z9 = true;
        if (i4 != -1 && i4 <= 0) {
            z9 = false;
        }
        PA.n(z9);
        this.f27294a = i;
        this.f27295b = str;
        this.f27296c = str2;
        this.f27297d = str3;
        this.f27298e = z8;
        this.f27299f = i4;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC4043v3
    public final void a(P2 p22) {
        String str = this.f27296c;
        if (str != null) {
            p22.f26821x = str;
        }
        String str2 = this.f27295b;
        if (str2 != null) {
            p22.f26820w = str2;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && R1.class == obj.getClass()) {
            R1 r12 = (R1) obj;
            if (this.f27294a == r12.f27294a && Objects.equals(this.f27295b, r12.f27295b) && Objects.equals(this.f27296c, r12.f27296c) && Objects.equals(this.f27297d, r12.f27297d) && this.f27298e == r12.f27298e && this.f27299f == r12.f27299f) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        String str = this.f27295b;
        int hashCode = str != null ? str.hashCode() : 0;
        String str2 = this.f27296c;
        int hashCode2 = str2 != null ? str2.hashCode() : 0;
        int i = ((this.f27294a + 527) * 31) + hashCode;
        String str3 = this.f27297d;
        return (((((((i * 31) + hashCode2) * 31) + (str3 != null ? str3.hashCode() : 0)) * 31) + (this.f27298e ? 1 : 0)) * 31) + this.f27299f;
    }

    public final String toString() {
        String str = this.f27296c;
        int length = String.valueOf(str).length();
        String str2 = this.f27295b;
        int length2 = String.valueOf(str2).length();
        int i = this.f27294a;
        int length3 = String.valueOf(i).length();
        int i4 = this.f27299f;
        StringBuilder sb = new StringBuilder(length + 28 + length2 + 11 + length3 + 19 + String.valueOf(i4).length());
        AbstractC5051n.j(sb, "IcyHeaders: name=\"", str, "\", genre=\"", str2);
        return D.y.n(sb, "\", bitrate=", i, ", metadataInterval=", i4);
    }
}
