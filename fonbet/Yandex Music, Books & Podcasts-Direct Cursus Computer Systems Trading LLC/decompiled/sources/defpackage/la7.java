package defpackage;

/* loaded from: classes.dex */
public final class la7 {
    public long a;
    public float b;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof la7)) {
            return false;
        }
        la7 la7Var = (la7) obj;
        return this.a == la7Var.a && Float.compare(this.b, la7Var.b) == 0;
    }

    public final int hashCode() {
        return Float.hashCode(this.b) + (Long.hashCode(this.a) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("DataPointAtTime(time=");
        sb.append(this.a);
        sb.append(", dataPoint=");
        return ouj.p(sb, this.b, ')');
    }
}
