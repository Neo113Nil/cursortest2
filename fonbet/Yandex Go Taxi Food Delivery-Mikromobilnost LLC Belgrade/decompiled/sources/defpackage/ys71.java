package defpackage;

/* loaded from: classes7.dex */
public abstract class ys71 implements kq71 {
    public static final dp71 y = new dp71(27);
    public final long a;
    public final long b;
    public final boolean c;
    public final boolean w;
    public final boolean x;

    public ys71(wp71 wp71Var) {
        this.a = wp71Var.a;
        this.b = wp71Var.b;
        this.c = wp71Var.c;
        this.w = wp71Var.d;
        this.x = wp71Var.e;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ys71)) {
            return false;
        }
        ys71 ys71Var = (ys71) obj;
        return this.a == ys71Var.a && this.b == ys71Var.b && this.c == ys71Var.c && this.w == ys71Var.w && this.x == ys71Var.x;
    }

    public final int hashCode() {
        long j = this.a;
        int i = ((int) (j ^ (j >>> 32))) * 31;
        long j2 = this.b;
        return ((((((i + ((int) ((j2 >>> 32) ^ j2))) * 31) + (this.c ? 1 : 0)) * 31) + (this.w ? 1 : 0)) * 31) + (this.x ? 1 : 0);
    }
}
