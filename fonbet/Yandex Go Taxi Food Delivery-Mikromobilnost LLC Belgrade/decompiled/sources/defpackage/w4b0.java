package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes15.dex */
public final class w4b0 {
    public final long a;
    public final String b;
    public final String c;
    public final boolean d;
    public final boolean e;
    public final boolean f;
    public final long g;

    public w4b0(long j, long j2, String str, String str2, boolean z, boolean z2, boolean z3) {
        this.a = j;
        this.b = str;
        this.c = str2;
        this.d = z;
        this.e = z2;
        this.f = z3;
        this.g = j2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof w4b0)) {
            return false;
        }
        w4b0 w4b0Var = (w4b0) obj;
        return this.a == w4b0Var.a && jl40.l(this.b, w4b0Var.b) && jl40.l(this.c, w4b0Var.c) && this.d == w4b0Var.d && this.e == w4b0Var.e && this.f == w4b0Var.f && this.g == w4b0Var.g;
    }

    public final int hashCode() {
        return Long.hashCode(this.g) + unr0.e(unr0.e(unr0.e(unr0.b(unr0.b(Long.hashCode(this.a) * 31, 31, this.b), 31, this.c), 31, this.d), 31, this.e), 31, this.f);
    }

    public final String toString() {
        StringBuilder k = x4e.k("Organization(organizationId=", this.a, ", organizationName=", this.b);
        uw51.x(", registrationStatus=", this.c, ", isPublic=", k, this.d);
        n.z(", disabled=", ", isGuest=", k, this.e, this.f);
        return g8e.l(this.g, ", rights=", Extension.C_BRAKE, k);
    }
}
