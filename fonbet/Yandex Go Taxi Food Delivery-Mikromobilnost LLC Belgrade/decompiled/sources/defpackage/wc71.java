package defpackage;

import java.util.Arrays;

/* loaded from: classes7.dex */
public final class wc71 {
    public final long a;
    public final yn81 b;
    public final int c;
    public final v281 d;
    public final long e;
    public final yn81 f;
    public final int g;
    public final v281 h;
    public final long i;
    public final long j;

    public wc71(long j, yn81 yn81Var, int i, v281 v281Var, long j2, yn81 yn81Var2, int i2, v281 v281Var2, long j3, long j4) {
        this.a = j;
        this.b = yn81Var;
        this.c = i;
        this.d = v281Var;
        this.e = j2;
        this.f = yn81Var2;
        this.g = i2;
        this.h = v281Var2;
        this.i = j3;
        this.j = j4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && wc71.class == obj.getClass()) {
            wc71 wc71Var = (wc71) obj;
            if (this.a == wc71Var.a && this.c == wc71Var.c && this.e == wc71Var.e && this.g == wc71Var.g && this.i == wc71Var.i && this.j == wc71Var.j && tja1.a(this.b, wc71Var.b) && tja1.a(this.d, wc71Var.d) && tja1.a(this.f, wc71Var.f) && tja1.a(this.h, wc71Var.h)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Long.valueOf(this.a), this.b, Integer.valueOf(this.c), this.d, Long.valueOf(this.e), this.f, Integer.valueOf(this.g), this.h, Long.valueOf(this.i), Long.valueOf(this.j)});
    }
}
