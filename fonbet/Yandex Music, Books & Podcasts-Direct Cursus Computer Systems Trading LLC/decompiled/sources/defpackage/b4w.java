package defpackage;

/* loaded from: classes.dex */
public final class b4w {
    public final long a;
    public final long b;

    public b4w(long j, long j2) {
        this.a = j;
        this.b = j2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && b4w.class.equals(obj.getClass())) {
            b4w b4wVar = (b4w) obj;
            if (b4wVar.a == this.a && b4wVar.b == this.b) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Long.hashCode(this.b) + (Long.hashCode(this.a) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("PeriodicityInfo{repeatIntervalMillis=");
        sb.append(this.a);
        sb.append(", flexIntervalMillis=");
        return eta.g(sb, this.b, '}');
    }
}
