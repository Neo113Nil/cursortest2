package defpackage;

/* loaded from: classes10.dex */
public final class tnr {
    public final float a;
    public final float b;
    public final long c;

    public tnr(float f, float f2, long j) {
        this.a = f;
        this.b = f2;
        this.c = j;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof tnr)) {
            return false;
        }
        tnr tnrVar = (tnr) obj;
        return Float.compare(this.a, tnrVar.a) == 0 && Float.compare(this.b, tnrVar.b) == 0 && this.c == tnrVar.c;
    }

    public final int hashCode() {
        return Long.hashCode(this.c) + g8e.c(this.b, Float.hashCode(this.a) * 31, 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("FlingInfo(initialVelocity=");
        sb.append(this.a);
        sb.append(", distance=");
        sb.append(this.b);
        sb.append(", duration=");
        return b64.o(sb, this.c, ')');
    }
}
