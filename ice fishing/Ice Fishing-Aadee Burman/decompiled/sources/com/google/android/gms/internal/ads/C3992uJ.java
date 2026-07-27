package com.google.android.gms.internal.ads;

import java.math.BigInteger;
import java.util.Objects;

/* renamed from: com.google.android.gms.internal.ads.uJ, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C3992uJ extends OG {

    /* renamed from: g, reason: collision with root package name */
    public static final BigInteger f34510g = BigInteger.valueOf(65537);

    /* renamed from: a, reason: collision with root package name */
    public final int f34511a;

    /* renamed from: b, reason: collision with root package name */
    public final BigInteger f34512b;

    /* renamed from: c, reason: collision with root package name */
    public final C3879sE f34513c;

    /* renamed from: d, reason: collision with root package name */
    public final C3938tJ f34514d;

    /* renamed from: e, reason: collision with root package name */
    public final C3938tJ f34515e;

    /* renamed from: f, reason: collision with root package name */
    public final int f34516f;

    public C3992uJ(int i, BigInteger bigInteger, C3879sE c3879sE, C3938tJ c3938tJ, C3938tJ c3938tJ2, int i6) {
        this.f34511a = i;
        this.f34512b = bigInteger;
        this.f34513c = c3879sE;
        this.f34514d = c3938tJ;
        this.f34515e = c3938tJ2;
        this.f34516f = i6;
    }

    @Override // com.google.android.gms.internal.ads.AbstractC3825rE
    public final boolean a() {
        return this.f34513c != C3879sE.f33926u;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C3992uJ)) {
            return false;
        }
        C3992uJ c3992uJ = (C3992uJ) obj;
        return c3992uJ.f34511a == this.f34511a && Objects.equals(c3992uJ.f34512b, this.f34512b) && Objects.equals(c3992uJ.f34513c, this.f34513c) && Objects.equals(c3992uJ.f34514d, this.f34514d) && Objects.equals(c3992uJ.f34515e, this.f34515e) && c3992uJ.f34516f == this.f34516f;
    }

    public final int hashCode() {
        return Objects.hash(C3992uJ.class, Integer.valueOf(this.f34511a), this.f34512b, this.f34513c, this.f34514d, this.f34515e, Integer.valueOf(this.f34516f));
    }

    public final String toString() {
        String valueOf = String.valueOf(this.f34513c);
        String valueOf2 = String.valueOf(this.f34514d);
        String valueOf3 = String.valueOf(this.f34515e);
        String valueOf4 = String.valueOf(this.f34512b);
        int length = valueOf.length();
        int length2 = valueOf2.length();
        int length3 = valueOf3.length();
        int i = this.f34516f;
        int length4 = String.valueOf(i).length();
        int length5 = valueOf4.length();
        int i6 = this.f34511a;
        StringBuilder sb = new StringBuilder(length + 55 + length2 + 17 + length3 + 19 + length4 + 18 + length5 + 6 + String.valueOf(i6).length() + 13);
        u1.h.i(sb, "RSA SSA PSS Parameters (variant: ", valueOf, ", signature hashType: ", valueOf2);
        sb.append(", mgf1 hashType: ");
        sb.append(valueOf3);
        sb.append(", saltLengthBytes: ");
        sb.append(i);
        sb.append(", publicExponent: ");
        sb.append(valueOf4);
        sb.append(", and ");
        sb.append(i6);
        sb.append("-bit modulus)");
        return sb.toString();
    }
}
