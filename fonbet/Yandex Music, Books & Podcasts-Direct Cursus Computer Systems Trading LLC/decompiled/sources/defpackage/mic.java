package defpackage;

/* loaded from: classes.dex */
public final class mic {
    public final float a;
    public final float b;
    public final long c;

    public mic(float f, float f2, long j) {
        this.a = f;
        this.b = f2;
        this.c = j;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof mic)) {
            return false;
        }
        mic micVar = (mic) obj;
        return Float.compare(this.a, micVar.a) == 0 && Float.compare(this.b, micVar.b) == 0 && this.c == micVar.c;
    }

    public final int hashCode() {
        return Long.hashCode(this.c) + eta.a(Float.hashCode(this.a) * 31, this.b, 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("FlingInfo(initialVelocity=");
        sb.append(this.a);
        sb.append(", distance=");
        sb.append(this.b);
        sb.append(", duration=");
        return eta.g(sb, this.c, ')');
    }
}
