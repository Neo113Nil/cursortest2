package com.google.android.gms.internal.ads;

import java.math.BigInteger;
import java.util.Objects;
import t0.AbstractC5051n;

/* loaded from: classes2.dex */
public final class EJ extends UG {

    /* renamed from: g, reason: collision with root package name */
    public static final BigInteger f24693g = BigInteger.valueOf(65537);

    /* renamed from: a, reason: collision with root package name */
    public final int f24694a;

    /* renamed from: b, reason: collision with root package name */
    public final BigInteger f24695b;

    /* renamed from: c, reason: collision with root package name */
    public final DJ f24696c;

    /* renamed from: d, reason: collision with root package name */
    public final CJ f24697d;

    /* renamed from: e, reason: collision with root package name */
    public final CJ f24698e;

    /* renamed from: f, reason: collision with root package name */
    public final int f24699f;

    public EJ(int i, BigInteger bigInteger, DJ dj, CJ cj, CJ cj2, int i4) {
        this.f24694a = i;
        this.f24695b = bigInteger;
        this.f24696c = dj;
        this.f24697d = cj;
        this.f24698e = cj2;
        this.f24699f = i4;
    }

    @Override // com.google.android.gms.internal.ads.AbstractC4000uE
    public final boolean a() {
        return this.f24696c != DJ.f24415e;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof EJ)) {
            return false;
        }
        EJ ej = (EJ) obj;
        return ej.f24694a == this.f24694a && Objects.equals(ej.f24695b, this.f24695b) && Objects.equals(ej.f24696c, this.f24696c) && Objects.equals(ej.f24697d, this.f24697d) && Objects.equals(ej.f24698e, this.f24698e) && ej.f24699f == this.f24699f;
    }

    public final int hashCode() {
        return Objects.hash(EJ.class, Integer.valueOf(this.f24694a), this.f24695b, this.f24696c, this.f24697d, this.f24698e, Integer.valueOf(this.f24699f));
    }

    public final String toString() {
        String valueOf = String.valueOf(this.f24696c);
        String valueOf2 = String.valueOf(this.f24697d);
        String valueOf3 = String.valueOf(this.f24698e);
        String valueOf4 = String.valueOf(this.f24695b);
        int length = valueOf.length();
        int length2 = valueOf2.length();
        int length3 = valueOf3.length();
        int i = this.f24699f;
        int length4 = String.valueOf(i).length();
        int length5 = valueOf4.length();
        int i4 = this.f24694a;
        StringBuilder sb = new StringBuilder(length + 55 + length2 + 17 + length3 + 19 + length4 + 18 + length5 + 6 + String.valueOf(i4).length() + 13);
        AbstractC5051n.j(sb, "RSA SSA PSS Parameters (variant: ", valueOf, ", signature hashType: ", valueOf2);
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
