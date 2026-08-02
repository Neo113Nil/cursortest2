package defpackage;

import java.util.Arrays;

/* loaded from: classes.dex */
public final class ld4 extends qae {
    public final String b;
    public final int c;
    public final int d;
    public final long e;
    public final long f;
    public final qae[] g;

    public ld4(String str, int i, int i2, long j, long j2, qae[] qaeVarArr) {
        super("CHAP");
        this.b = str;
        this.c = i;
        this.d = i2;
        this.e = j;
        this.f = j2;
        this.g = qaeVarArr;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || ld4.class != obj.getClass()) {
            return false;
        }
        ld4 ld4Var = (ld4) obj;
        return this.c == ld4Var.c && this.d == ld4Var.d && this.e == ld4Var.e && this.f == ld4Var.f && this.b.equals(ld4Var.b) && Arrays.equals(this.g, ld4Var.g);
    }

    public final int hashCode() {
        return this.b.hashCode() + ((((((((527 + this.c) * 31) + this.d) * 31) + ((int) this.e)) * 31) + ((int) this.f)) * 31);
    }
}
