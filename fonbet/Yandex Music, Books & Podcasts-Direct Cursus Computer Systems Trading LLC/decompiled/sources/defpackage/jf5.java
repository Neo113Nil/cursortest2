package defpackage;

/* loaded from: classes3.dex */
public final class jf5 {
    public final boolean a;
    public final boolean b;

    public jf5(boolean z, boolean z2) {
        this.a = z;
        this.b = z2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof jf5)) {
            return false;
        }
        jf5 jf5Var = (jf5) obj;
        return this.a == jf5Var.a && this.b == jf5Var.b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.b) + (Boolean.hashCode(this.a) * 31);
    }

    public final String toString() {
        return hrg.t("AvailabilityState(trackAvailable=", this.a, ", trackAllowedByExplicitFilter=", this.b, ")");
    }
}
