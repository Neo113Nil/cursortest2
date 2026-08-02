package defpackage;

import java.util.Objects;

/* loaded from: classes.dex */
public final class yoh {
    public final uvh a;
    public final long b;
    public final long c;
    public final long d;
    public final long e;
    public final boolean f;
    public final boolean g;
    public final boolean h;
    public final boolean i;
    public final boolean j;

    public yoh(uvh uvhVar, long j, long j2, long j3, long j4, boolean z, boolean z2, boolean z3, boolean z4, boolean z5) {
        boolean z6 = true;
        vq1.v(!z5 || z3);
        vq1.v(!z4 || z3);
        if (z2 && (z3 || z4 || z5)) {
            z6 = false;
        }
        vq1.v(z6);
        this.a = uvhVar;
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

    public final yoh a(long j) {
        if (j == this.c) {
            return this;
        }
        return new yoh(this.a, this.b, j, this.d, this.e, this.f, this.g, this.h, this.i, this.j);
    }

    public final yoh b(long j) {
        if (j == this.b) {
            return this;
        }
        return new yoh(this.a, j, this.c, this.d, this.e, this.f, this.g, this.h, this.i, this.j);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && yoh.class == obj.getClass()) {
            yoh yohVar = (yoh) obj;
            if (this.b == yohVar.b && this.c == yohVar.c && this.d == yohVar.d && this.e == yohVar.e && this.f == yohVar.f && this.g == yohVar.g && this.h == yohVar.h && this.i == yohVar.i && this.j == yohVar.j && Objects.equals(this.a, yohVar.a)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((((((((((((((((((this.a.hashCode() + 527) * 31) + ((int) this.b)) * 31) + ((int) this.c)) * 31) + ((int) this.d)) * 31) + ((int) this.e)) * 31) + (this.f ? 1 : 0)) * 31) + (this.g ? 1 : 0)) * 31) + (this.h ? 1 : 0)) * 31) + (this.i ? 1 : 0)) * 31) + (this.j ? 1 : 0);
    }
}
