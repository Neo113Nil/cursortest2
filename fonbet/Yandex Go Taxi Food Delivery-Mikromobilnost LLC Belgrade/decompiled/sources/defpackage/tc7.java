package defpackage;

/* loaded from: classes11.dex */
public final class tc7 {
    public final long a;
    public final Object b;

    public tc7(long j, Object obj) {
        this.a = j;
        this.b = obj;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof tc7)) {
            return false;
        }
        tc7 tc7Var = (tc7) obj;
        return this.a == tc7Var.a && jl40.l(this.b, tc7Var.b);
    }

    public final int hashCode() {
        int hashCode = Long.hashCode(this.a) * 31;
        Object obj = this.b;
        return hashCode + (obj == null ? 0 : obj.hashCode());
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("CacheTimedValue(timestamp=");
        sb.append(this.a);
        sb.append(", value=");
        return qv10.r(sb, this.b, ')');
    }
}
