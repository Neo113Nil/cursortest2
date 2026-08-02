package com.google.android.gms.internal.ads;

import java.math.BigInteger;
import java.util.Objects;
import w.AbstractC5128c;

/* renamed from: com.google.android.gms.internal.ads.uJ, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C4015uJ extends OG {

    /* renamed from: g, reason: collision with root package name */
    public static final BigInteger f35284g = BigInteger.valueOf(65537);

    /* renamed from: a, reason: collision with root package name */
    public final int f35285a;

    /* renamed from: b, reason: collision with root package name */
    public final BigInteger f35286b;

    /* renamed from: c, reason: collision with root package name */
    public final C3902sE f35287c;

    /* renamed from: d, reason: collision with root package name */
    public final C3961tJ f35288d;

    /* renamed from: e, reason: collision with root package name */
    public final C3961tJ f35289e;

    /* renamed from: f, reason: collision with root package name */
    public final int f35290f;

    public C4015uJ(int i, BigInteger bigInteger, C3902sE c3902sE, C3961tJ c3961tJ, C3961tJ c3961tJ2, int i4) {
        this.f35285a = i;
        this.f35286b = bigInteger;
        this.f35287c = c3902sE;
        this.f35288d = c3961tJ;
        this.f35289e = c3961tJ2;
        this.f35290f = i4;
    }

    @Override // com.google.android.gms.internal.ads.AbstractC3848rE
    public final boolean a() {
        return this.f35287c != C3902sE.f34694u;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C4015uJ)) {
            return false;
        }
        C4015uJ c4015uJ = (C4015uJ) obj;
        return c4015uJ.f35285a == this.f35285a && Objects.equals(c4015uJ.f35286b, this.f35286b) && Objects.equals(c4015uJ.f35287c, this.f35287c) && Objects.equals(c4015uJ.f35288d, this.f35288d) && Objects.equals(c4015uJ.f35289e, this.f35289e) && c4015uJ.f35290f == this.f35290f;
    }

    public final int hashCode() {
        return Objects.hash(C4015uJ.class, Integer.valueOf(this.f35285a), this.f35286b, this.f35287c, this.f35288d, this.f35289e, Integer.valueOf(this.f35290f));
    }

    public final String toString() {
        String valueOf = String.valueOf(this.f35287c);
        String valueOf2 = String.valueOf(this.f35288d);
        String valueOf3 = String.valueOf(this.f35289e);
        String valueOf4 = String.valueOf(this.f35286b);
        int length = valueOf.length();
        int length2 = valueOf2.length();
        int length3 = valueOf3.length();
        int i = this.f35290f;
        int length4 = String.valueOf(i).length();
        int length5 = valueOf4.length();
        int i4 = this.f35285a;
        StringBuilder sb = new StringBuilder(length + 55 + length2 + 17 + length3 + 19 + length4 + 18 + length5 + 6 + String.valueOf(i4).length() + 13);
        AbstractC5128c.h(sb, "RSA SSA PSS Parameters (variant: ", valueOf, ", signature hashType: ", valueOf2);
        sb.append(", mgf1 hashType: ");
        sb.append(valueOf3);
        sb.append(", saltLengthBytes: ");
        sb.append(i);
        sb.append(", publicExponent: ");
        sb.append(valueOf4);
        sb.append(", and ");
        sb.append(i4);
        sb.append("-bit modulus)");
        return sb.toString();
    }
}
