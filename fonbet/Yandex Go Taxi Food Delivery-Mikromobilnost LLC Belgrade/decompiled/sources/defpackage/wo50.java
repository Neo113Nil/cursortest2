package defpackage;

@gsq0
/* loaded from: classes2.dex */
public final class wo50 implements xy50 {
    public static final vo50 Companion = new vo50();
    public final String a;
    public final boolean b;

    public /* synthetic */ wo50(int i, String str, boolean z) {
        if (3 != (i & 3)) {
            qje.Z(i, 3, uo50.a.getDescriptor());
            throw null;
        }
        this.a = str;
        this.b = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof wo50)) {
            return false;
        }
        wo50 wo50Var = (wo50) obj;
        return jl40.l(this.a, wo50Var.a) && this.b == wo50Var.b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.b) + (this.a.hashCode() * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("NetworkBoolArgumentModel(type=");
        sb.append(this.a);
        sb.append(", argValue=");
        return unr0.u(sb, this.b, ')');
    }
}
