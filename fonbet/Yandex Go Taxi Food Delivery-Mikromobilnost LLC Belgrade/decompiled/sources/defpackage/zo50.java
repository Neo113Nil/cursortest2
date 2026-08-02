package defpackage;

@gsq0
/* loaded from: classes2.dex */
public final class zo50 implements ry50 {
    public static final yo50 Companion = new yo50();
    public final String a;
    public final boolean b;

    public /* synthetic */ zo50(int i, String str, boolean z) {
        if (3 != (i & 3)) {
            qje.Z(i, 3, xo50.a.getDescriptor());
            throw null;
        }
        this.a = str;
        this.b = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zo50)) {
            return false;
        }
        zo50 zo50Var = (zo50) obj;
        return jl40.l(this.a, zo50Var.a) && this.b == zo50Var.b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.b) + (this.a.hashCode() * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("NetworkBooleanPredicateModel(type=");
        sb.append(this.a);
        sb.append(", argValue=");
        return unr0.u(sb, this.b, ')');
    }
}
