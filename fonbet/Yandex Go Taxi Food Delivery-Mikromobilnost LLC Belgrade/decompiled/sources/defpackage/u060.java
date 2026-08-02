package defpackage;

/* loaded from: classes.dex */
public final class u060 {
    public final boolean a;
    public final boolean b;
    public final boolean c;
    public final boolean d;

    public u060(boolean z, boolean z2, boolean z3, boolean z4) {
        this.a = z;
        this.b = z2;
        this.c = z3;
        this.d = z4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof u060)) {
            return false;
        }
        u060 u060Var = (u060) obj;
        return this.a == u060Var.a && this.b == u060Var.b && this.c == u060Var.c && this.d == u060Var.d;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.d) + unr0.e(unr0.e(Boolean.hashCode(this.a) * 31, 31, this.b), 31, this.c);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("NetworkState(isConnected=");
        sb.append(this.a);
        sb.append(", isValidated=");
        sb.append(this.b);
        sb.append(", isMetered=");
        sb.append(this.c);
        sb.append(", isNotRoaming=");
        return unr0.u(sb, this.d, ')');
    }
}
