package defpackage;

/* loaded from: classes12.dex */
public final class znf0 {
    public final String a;
    public final String b;
    public final String c;
    public final l76 d;

    public znf0(String str, String str2, String str3, l76 l76Var) {
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = l76Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof znf0)) {
            return false;
        }
        znf0 znf0Var = (znf0) obj;
        return jl40.l(this.a, znf0Var.a) && jl40.l(this.b, znf0Var.b) && jl40.l(this.c, znf0Var.c) && jl40.l(this.d, znf0Var.d);
    }

    public final int hashCode() {
        int b = unr0.b(this.a.hashCode() * 31, 31, this.b);
        String str = this.c;
        int hashCode = (b + (str == null ? 0 : str.hashCode())) * 31;
        l76 l76Var = this.d;
        return hashCode + (l76Var != null ? l76Var.hashCode() : 0);
    }
}
