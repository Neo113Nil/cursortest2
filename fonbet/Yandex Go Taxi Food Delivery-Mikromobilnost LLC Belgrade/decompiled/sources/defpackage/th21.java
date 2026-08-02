package defpackage;

/* loaded from: classes15.dex */
public final class th21 {
    public final String a;
    public final boolean b;
    public final String c;

    public th21(String str, boolean z, String str2) {
        this.a = str;
        this.b = z;
        this.c = str2;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof th21)) {
            return false;
        }
        String str = this.c;
        th21 th21Var = (th21) obj;
        if (str != null) {
            return jl40.l(str, th21Var.c);
        }
        return jl40.l(this.a, th21Var.a);
    }

    public final int hashCode() {
        String str = this.c;
        return str != null ? str.hashCode() : this.a.hashCode();
    }
}
