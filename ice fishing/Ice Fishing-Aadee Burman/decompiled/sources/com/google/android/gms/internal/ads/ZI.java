package com.google.android.gms.internal.ads;

import java.util.Objects;

/* loaded from: classes2.dex */
public final class ZI extends OG {

    /* renamed from: a, reason: collision with root package name */
    public final C3879sE f28866a;

    /* renamed from: b, reason: collision with root package name */
    public final YI f28867b;

    /* renamed from: c, reason: collision with root package name */
    public final C3556mE f28868c;

    /* renamed from: d, reason: collision with root package name */
    public final C3933tE f28869d;

    public ZI(C3879sE c3879sE, YI yi, C3556mE c3556mE, C3933tE c3933tE) {
        this.f28866a = c3879sE;
        this.f28867b = yi;
        this.f28868c = c3556mE;
        this.f28869d = c3933tE;
    }

    @Override // com.google.android.gms.internal.ads.AbstractC3825rE
    public final boolean a() {
        return this.f28869d != C3933tE.f34250y;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof ZI)) {
            return false;
        }
        ZI zi = (ZI) obj;
        return zi.f28866a == this.f28866a && zi.f28867b == this.f28867b && zi.f28868c == this.f28868c && zi.f28869d == this.f28869d;
    }

    public final int hashCode() {
        return Objects.hash(ZI.class, this.f28866a, this.f28867b, this.f28868c, this.f28869d);
    }

    public final String toString() {
        String str = this.f28869d.f34252b;
        int length = str.length();
        String str2 = this.f28868c.f31931u;
        int length2 = str2.length();
        String str3 = this.f28866a.f33928b;
        int length3 = str3.length();
        String str4 = this.f28867b.f28667a;
        StringBuilder sb = new StringBuilder(length + 39 + length2 + 12 + length3 + 9 + str4.length() + 1);
        u1.h.i(sb, "ECDSA Parameters (variant: ", str, ", hashType: ", str2);
        u1.h.i(sb, ", encoding: ", str3, ", curve: ", str4);
        sb.append(")");
        return sb.toString();
    }
}
