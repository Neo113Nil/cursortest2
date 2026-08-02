package defpackage;

/* loaded from: classes6.dex */
public final class xbz0 {
    public final String a;
    public final String b;
    public final String c;

    public xbz0(String str, String str2, String str3) {
        this.a = str;
        this.b = str2;
        this.c = str3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof xbz0)) {
            return false;
        }
        xbz0 xbz0Var = (xbz0) obj;
        return jl40.l(this.a, xbz0Var.a) && jl40.l(this.b, xbz0Var.b) && jl40.l(this.c, xbz0Var.c);
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        String str = this.b;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.c;
        return hashCode2 + (str2 != null ? str2.hashCode() : 0);
    }
}
