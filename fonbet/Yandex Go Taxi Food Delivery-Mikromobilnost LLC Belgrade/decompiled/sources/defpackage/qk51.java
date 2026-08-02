package defpackage;

/* loaded from: classes10.dex */
public final class qk51 {
    public final long a;
    public final long b;

    public qk51(long j, long j2) {
        this.a = j;
        this.b = j2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof qk51)) {
            return false;
        }
        qk51 qk51Var = (qk51) obj;
        return this.a == qk51Var.a && this.b == qk51Var.b;
    }

    public final int hashCode() {
        return (((int) this.a) * 31) + ((int) this.b);
    }
}
