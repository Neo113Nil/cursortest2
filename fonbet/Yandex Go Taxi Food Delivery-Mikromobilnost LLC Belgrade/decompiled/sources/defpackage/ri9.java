package defpackage;

import java.util.Arrays;

/* loaded from: classes10.dex */
public final class ri9 extends x5v {
    public final String b;
    public final int c;
    public final int w;
    public final long x;
    public final long y;
    public final x5v[] z;

    public ri9(String str, int i, int i2, long j, long j2, x5v[] x5vVarArr) {
        super("CHAP");
        this.b = str;
        this.c = i;
        this.w = i2;
        this.x = j;
        this.y = j2;
        this.z = x5vVarArr;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || ri9.class != obj.getClass()) {
            return false;
        }
        ri9 ri9Var = (ri9) obj;
        return this.c == ri9Var.c && this.w == ri9Var.w && this.x == ri9Var.x && this.y == ri9Var.y && this.b.equals(ri9Var.b) && Arrays.equals(this.z, ri9Var.z);
    }

    public final int hashCode() {
        return this.b.hashCode() + ((((((((527 + this.c) * 31) + this.w) * 31) + ((int) this.x)) * 31) + ((int) this.y)) * 31);
    }
}
