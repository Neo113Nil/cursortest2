package defpackage;

/* loaded from: classes.dex */
public final class q1j {
    public final boolean a;
    public final boolean b;
    public final boolean c;
    public final boolean d;

    public q1j(boolean z, boolean z2, boolean z3, boolean z4) {
        this.a = z;
        this.b = z2;
        this.c = z3;
        this.d = z4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof q1j)) {
            return false;
        }
        q1j q1jVar = (q1j) obj;
        return this.a == q1jVar.a && this.b == q1jVar.b && this.c == q1jVar.c && this.d == q1jVar.d;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.d) + k5r.e(k5r.e(Boolean.hashCode(this.a) * 31, 31, this.b), 31, this.c);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("NetworkState(isConnected=");
        sb.append(this.a);
        sb.append(", isValidated=");
        sb.append(this.b);
        sb.append(", isMetered=");
        sb.append(this.c);
        sb.append(", isNotRoaming=");
        return dfi.j(sb, this.d, ')');
    }
}
