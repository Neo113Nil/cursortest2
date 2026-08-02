package defpackage;

/* loaded from: classes12.dex */
public final class ynf0 {
    public final String a;
    public final String b;
    public final String c;
    public final tnf0 d;

    public ynf0(String str, String str2, String str3, tnf0 tnf0Var) {
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = tnf0Var;
    }

    public static ynf0 a(ynf0 ynf0Var, tnf0 tnf0Var) {
        return new ynf0(ynf0Var.a, ynf0Var.b, ynf0Var.c, tnf0Var);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ynf0)) {
            return false;
        }
        ynf0 ynf0Var = (ynf0) obj;
        return jl40.l(this.a, ynf0Var.a) && jl40.l(this.b, ynf0Var.b) && jl40.l(this.c, ynf0Var.c) && jl40.l(this.d, ynf0Var.d);
    }

    public final int hashCode() {
        int b = unr0.b(this.a.hashCode() * 31, 31, this.b);
        String str = this.c;
        int hashCode = (b + (str == null ? 0 : str.hashCode())) * 31;
        tnf0 tnf0Var = this.d;
        return hashCode + (tnf0Var != null ? tnf0Var.hashCode() : 0);
    }
}
