package defpackage;

import java.util.Objects;

/* loaded from: classes10.dex */
public final class ze10 {
    public final sf10 a;
    public final long b;
    public final long c;
    public final long d;
    public final long e;
    public final boolean f;
    public final boolean g;
    public final boolean h;
    public final boolean i;
    public final boolean j;

    public ze10(sf10 sf10Var, long j, long j2, long j3, long j4, boolean z, boolean z2, boolean z3, boolean z4, boolean z5) {
        boolean z6 = true;
        d6z.l(!z5 || z3);
        d6z.l(!z4 || z3);
        if (z2 && (z3 || z4 || z5)) {
            z6 = false;
        }
        d6z.l(z6);
        this.a = sf10Var;
        this.b = j;
        this.c = j2;
        this.d = j3;
        this.e = j4;
        this.f = z;
        this.g = z2;
        this.h = z3;
        this.i = z4;
        this.j = z5;
    }

    public final ze10 a(long j) {
        if (j == this.c) {
            return this;
        }
        return new ze10(this.a, this.b, j, this.d, this.e, this.f, this.g, this.h, this.i, this.j);
    }

    public final ze10 b(long j) {
        if (j == this.b) {
            return this;
        }
        return new ze10(this.a, j, this.c, this.d, this.e, this.f, this.g, this.h, this.i, this.j);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && ze10.class == obj.getClass()) {
            ze10 ze10Var = (ze10) obj;
            if (this.b == ze10Var.b && this.c == ze10Var.c && this.d == ze10Var.d && this.e == ze10Var.e && this.f == ze10Var.f && this.g == ze10Var.g && this.h == ze10Var.h && this.i == ze10Var.i && this.j == ze10Var.j && Objects.equals(this.a, ze10Var.a)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((((((((((((((((((this.a.hashCode() + 527) * 31) + ((int) this.b)) * 31) + ((int) this.c)) * 31) + ((int) this.d)) * 31) + ((int) this.e)) * 31) + (this.f ? 1 : 0)) * 31) + (this.g ? 1 : 0)) * 31) + (this.h ? 1 : 0)) * 31) + (this.i ? 1 : 0)) * 31) + (this.j ? 1 : 0);
    }
}
