package defpackage;

/* loaded from: classes4.dex */
public final class fds {
    public final long a;
    public final long b;
    public final float c;
    public final float d;

    public /* synthetic */ fds(float f, int i, long j, long j2) {
        this(j, j2, (i & 4) != 0 ? 1.0f : f, 0.0f);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof fds)) {
            return false;
        }
        fds fdsVar = (fds) obj;
        return kes.a(this.a, fdsVar.a) && kes.a(this.b, fdsVar.b) && Float.compare(this.c, fdsVar.c) == 0 && Float.compare(this.d, fdsVar.d) == 0;
    }

    public final int hashCode() {
        les[] lesVarArr = kes.b;
        return Float.hashCode(this.d) + eta.a(tlm.c(this.b, Long.hashCode(this.a) * 31, 31), this.c, 31);
    }

    public final String toString() {
        StringBuilder m = f1d.m("TextLineConfig(maxFontSize=", kes.d(this.a), ", minFontSize=", kes.d(this.b), ", lineHeightFactor=");
        m.append(this.c);
        m.append(", letterSpacingFactor=");
        m.append(this.d);
        m.append(")");
        return m.toString();
    }

    public fds(long j, long j2, float f, float f2) {
        this.a = j;
        this.b = j2;
        this.c = f;
        this.d = f2;
    }
}
