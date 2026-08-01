package com.google.android.gms.internal.ads;

import java.math.BigInteger;
import java.util.Objects;

/* renamed from: com.google.android.gms.internal.ads.oJ, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C3669oJ extends OG {

    /* renamed from: e, reason: collision with root package name */
    public static final BigInteger f32890e = BigInteger.valueOf(65537);

    /* renamed from: a, reason: collision with root package name */
    public final int f32891a;

    /* renamed from: b, reason: collision with root package name */
    public final BigInteger f32892b;

    /* renamed from: c, reason: collision with root package name */
    public final C3556mE f32893c;

    /* renamed from: d, reason: collision with root package name */
    public final C3615nJ f32894d;

    public C3669oJ(int i, BigInteger bigInteger, C3556mE c3556mE, C3615nJ c3615nJ) {
        this.f32891a = i;
        this.f32892b = bigInteger;
        this.f32893c = c3556mE;
        this.f32894d = c3615nJ;
    }

    @Override // com.google.android.gms.internal.ads.AbstractC3825rE
    public final boolean a() {
        return this.f32893c != C3556mE.f31924M;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C3669oJ)) {
            return false;
        }
        C3669oJ c3669oJ = (C3669oJ) obj;
        return c3669oJ.f32891a == this.f32891a && Objects.equals(c3669oJ.f32892b, this.f32892b) && c3669oJ.f32893c == this.f32893c && c3669oJ.f32894d == this.f32894d;
    }

    public final int hashCode() {
        return Objects.hash(C3669oJ.class, Integer.valueOf(this.f32891a), this.f32892b, this.f32893c, this.f32894d);
    }

    public final String toString() {
        String valueOf = String.valueOf(this.f32893c);
        String valueOf2 = String.valueOf(this.f32894d);
        String valueOf3 = String.valueOf(this.f32892b);
        int length = valueOf.length();
        int length2 = valueOf2.length();
        int length3 = valueOf3.length();
        int i = this.f32891a;
        StringBuilder sb = new StringBuilder(length + 47 + length2 + 18 + length3 + 6 + String.valueOf(i).length() + 13);
        u1.h.i(sb, "RSA SSA PKCS1 Parameters (variant: ", valueOf, ", hashType: ", valueOf2);
        sb.append(", publicExponent: ");
        sb.append(valueOf3);
        sb.append(", and ");
        sb.append(i);
        sb.append("-bit modulus)");
        return sb.toString();
    }
}
