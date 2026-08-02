package defpackage;

/* loaded from: classes3.dex */
public final class p53 implements r53 {
    public final boolean a;
    public final boolean b;
    public final boolean c;
    public final boolean d;

    public p53(boolean z, boolean z2, boolean z3, boolean z4) {
        this.a = z;
        this.b = z2;
        this.c = z3;
        this.d = z4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof p53)) {
            return false;
        }
        p53 p53Var = (p53) obj;
        return this.a == p53Var.a && this.b == p53Var.b && this.c == p53Var.c && this.d == p53Var.d;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.d) + k5r.e(k5r.e(Boolean.hashCode(this.a) * 31, 31, this.b), 31, this.c);
    }

    public final String toString() {
        return v3w.g(eta.j("Loading(isEqualizerAvailable=", this.a, ", isVideoShotAvailable=", this.b, ", isAutoplayAvailable="), this.c, ", isShakeAvailable=", this.d, ")");
    }
}
