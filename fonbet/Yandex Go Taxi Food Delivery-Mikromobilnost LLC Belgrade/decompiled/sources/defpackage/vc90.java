package defpackage;

/* loaded from: classes10.dex */
public final class vc90 {
    public final String a;
    public final Object b;
    public final boolean c;
    public final boolean d;
    public final boolean e;
    public final String f;
    public final boolean g;

    public vc90(String str, Object obj, boolean z, boolean z2, boolean z3, String str2, boolean z4) {
        this.a = str;
        this.b = obj;
        this.c = z;
        this.d = z2;
        this.e = z3;
        this.f = str2;
        this.g = z4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof vc90)) {
            return false;
        }
        vc90 vc90Var = (vc90) obj;
        return this.a.equals(vc90Var.a) && jl40.l(this.b, vc90Var.b) && this.c == vc90Var.c && this.d == vc90Var.d && this.e == vc90Var.e && jl40.l(this.f, vc90Var.f) && this.g == vc90Var.g;
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        Object obj = this.b;
        int e = unr0.e(unr0.e(unr0.e((hashCode + (obj == null ? 0 : obj.hashCode())) * 31, 31, this.c), 31, this.d), 31, this.e);
        String str = this.f;
        return Boolean.hashCode(this.g) + ((e + (str != null ? str.hashCode() : 0)) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ParameterInformation(name=");
        sb.append(this.a);
        sb.append(", value=");
        sb.append(this.b);
        sb.append(", fromDefault=");
        sb.append(this.c);
        sb.append(", static=");
        sb.append(this.d);
        sb.append(", compared=");
        sb.append(this.e);
        sb.append(", inlineClass=");
        sb.append(this.f);
        sb.append(", stable=");
        return unr0.u(sb, this.g, ')');
    }
}
