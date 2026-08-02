package defpackage;

/* loaded from: classes10.dex */
public final class yog {
    public long a;
    public float b;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof yog)) {
            return false;
        }
        yog yogVar = (yog) obj;
        return this.a == yogVar.a && Float.compare(this.b, yogVar.b) == 0;
    }

    public final int hashCode() {
        return Float.hashCode(this.b) + (Long.hashCode(this.a) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("DataPointAtTime(time=");
        sb.append(this.a);
        sb.append(", dataPoint=");
        return n.n(sb, this.b, ')');
    }
}
