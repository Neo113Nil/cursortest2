package defpackage;

/* loaded from: classes7.dex */
public final class q381 {
    public final long a;
    public final long b;

    public q381(long j, long j2) {
        this.a = j;
        this.b = j2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && q381.class == obj.getClass()) {
            q381 q381Var = (q381) obj;
            if (this.a == q381Var.a && this.b == q381Var.b) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return (((int) this.a) * 31) + ((int) this.b);
    }
}
