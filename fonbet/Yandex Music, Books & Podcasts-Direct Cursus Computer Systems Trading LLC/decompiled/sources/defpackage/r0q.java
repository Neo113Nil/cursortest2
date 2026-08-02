package defpackage;

/* loaded from: classes3.dex */
public final class r0q implements t0q {
    public final double a = 0.25d;

    public r0q(int i) {
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof r0q) && Double.compare(this.a, ((r0q) obj).a) == 0;
    }

    public final int hashCode() {
        return Double.hashCode(this.a);
    }

    public final String toString() {
        return "FadeIn(barFraction=" + this.a + ")";
    }
}
