package defpackage;

/* loaded from: classes3.dex */
public final class sf3 {
    public final boolean a;
    public final boolean b;
    public final boolean c;

    public sf3(boolean z, boolean z2, boolean z3) {
        this.a = z;
        this.b = z2;
        this.c = z3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof sf3)) {
            return false;
        }
        sf3 sf3Var = (sf3) obj;
        return this.a == sf3Var.a && this.b == sf3Var.b && this.c == sf3Var.c;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.c) + k5r.e(Boolean.hashCode(this.a) * 31, 31, this.b);
    }

    public final String toString() {
        return ouj.r(eta.j("BottomTabContext(isNewBottomTabEnabled=", this.a, ", isNewWaveTabEnabled=", this.b, ", isHighlightedAsSubScreen="), this.c, ")");
    }
}
