package defpackage;

/* loaded from: classes4.dex */
public final class hh6 {
    public final boolean a;
    public final float b;

    public hh6(boolean z, float f) {
        this.a = z;
        this.b = f;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof hh6)) {
            return false;
        }
        hh6 hh6Var = (hh6) obj;
        return this.a == hh6Var.a && cma.a(this.b, hh6Var.b);
    }

    public final int hashCode() {
        return Float.hashCode(this.b) + (Boolean.hashCode(this.a) * 31);
    }

    public final String toString() {
        return "ContinueListenBlockUiSpec(adaptForScaledScreen=" + this.a + ", adaptForScaledScreenWidthThreshold=" + cma.b(this.b) + ")";
    }
}
