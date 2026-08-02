package defpackage;

import java.util.Objects;

/* loaded from: classes.dex */
public final class c80 {
    public final long a;
    public final sis b;
    public final int c;
    public final uvh d;
    public final long e;
    public final sis f;
    public final int g;
    public final uvh h;
    public final long i;
    public final long j;

    public c80(long j, sis sisVar, int i, uvh uvhVar, long j2, sis sisVar2, int i2, uvh uvhVar2, long j3, long j4) {
        this.a = j;
        this.b = sisVar;
        this.c = i;
        this.d = uvhVar;
        this.e = j2;
        this.f = sisVar2;
        this.g = i2;
        this.h = uvhVar2;
        this.i = j3;
        this.j = j4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || c80.class != obj.getClass()) {
            return false;
        }
        c80 c80Var = (c80) obj;
        return this.a == c80Var.a && this.c == c80Var.c && this.e == c80Var.e && this.g == c80Var.g && this.i == c80Var.i && this.j == c80Var.j && this.b.equals(c80Var.b) && Objects.equals(this.d, c80Var.d) && Objects.equals(this.f, c80Var.f) && Objects.equals(this.h, c80Var.h);
    }

    public final int hashCode() {
        return Objects.hash(Long.valueOf(this.a), this.b, Integer.valueOf(this.c), this.d, Long.valueOf(this.e), this.f, Integer.valueOf(this.g), this.h, Long.valueOf(this.i), Long.valueOf(this.j));
    }
}
