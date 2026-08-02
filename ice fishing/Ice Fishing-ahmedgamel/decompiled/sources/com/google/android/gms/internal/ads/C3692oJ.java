package com.google.android.gms.internal.ads;

import java.math.BigInteger;
import java.util.Objects;
import w.AbstractC5128c;

/* renamed from: com.google.android.gms.internal.ads.oJ, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C3692oJ extends OG {

    /* renamed from: e, reason: collision with root package name */
    public static final BigInteger f33677e = BigInteger.valueOf(65537);

    /* renamed from: a, reason: collision with root package name */
    public final int f33678a;

    /* renamed from: b, reason: collision with root package name */
    public final BigInteger f33679b;

    /* renamed from: c, reason: collision with root package name */
    public final C3579mE f33680c;

    /* renamed from: d, reason: collision with root package name */
    public final C3638nJ f33681d;

    public C3692oJ(int i, BigInteger bigInteger, C3579mE c3579mE, C3638nJ c3638nJ) {
        this.f33678a = i;
        this.f33679b = bigInteger;
        this.f33680c = c3579mE;
        this.f33681d = c3638nJ;
    }

    @Override // com.google.android.gms.internal.ads.AbstractC3848rE
    public final boolean a() {
        return this.f33680c != C3579mE.f32704M;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C3692oJ)) {
            return false;
        }
        C3692oJ c3692oJ = (C3692oJ) obj;
        return c3692oJ.f33678a == this.f33678a && Objects.equals(c3692oJ.f33679b, this.f33679b) && c3692oJ.f33680c == this.f33680c && c3692oJ.f33681d == this.f33681d;
    }

    public final int hashCode() {
        return Objects.hash(C3692oJ.class, Integer.valueOf(this.f33678a), this.f33679b, this.f33680c, this.f33681d);
    }

    public final String toString() {
        String valueOf = String.valueOf(this.f33680c);
        String valueOf2 = String.valueOf(this.f33681d);
        String valueOf3 = String.valueOf(this.f33679b);
        int length = valueOf.length();
        int length2 = valueOf2.length();
        int length3 = valueOf3.length();
        int i = this.f33678a;
        StringBuilder sb = new StringBuilder(length + 47 + length2 + 18 + length3 + 6 + String.valueOf(i).length() + 13);
        AbstractC5128c.h(sb, "RSA SSA PKCS1 Parameters (variant: ", valueOf, ", hashType: ", valueOf2);
        sb.append(", publicExponent: ");
        sb.append(valueOf3);
        sb.append(", and ");
        sb.append(i);
        sb.append("-bit modulus)");
        return sb.toString();
    }
}
