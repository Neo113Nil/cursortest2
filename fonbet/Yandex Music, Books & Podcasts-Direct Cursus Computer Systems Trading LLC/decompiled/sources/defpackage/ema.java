package defpackage;

/* loaded from: classes.dex */
public final class ema {
    public final long a;

    public final boolean equals(Object obj) {
        if (obj instanceof ema) {
            return this.a == ((ema) obj).a;
        }
        return false;
    }

    public final int hashCode() {
        return Long.hashCode(this.a);
    }

    public final String toString() {
        long j = this.a;
        if (j == 9205357640488583168L) {
            return "DpOffset.Unspecified";
        }
        return "(" + ((Object) cma.b(Float.intBitsToFloat((int) (j >> 32)))) + ", " + ((Object) cma.b(Float.intBitsToFloat((int) (j & 4294967295L)))) + ')';
    }
}
